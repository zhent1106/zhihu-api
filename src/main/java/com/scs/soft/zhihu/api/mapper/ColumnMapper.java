package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.entity.Favorite;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName ColumnMapper
 * @Description TODO
 * @Author 田震
 * @Date 2020/1/19
 **/
public interface ColumnMapper {
    /**
     * 查询热门收藏
     * @return List<Favorite>
     */
    @Select("SELECT * FROM t_columns")
    List<Columns> selectallcolumn();
    /**
     *查询前四个
     */
    @Select("SELECT * FROM t_columns ORDER BY id  LIMIT 2,4")
    List<Columns> selectRecent();
    /**
     * 根据页数查找
     * @param dealCount
     * @param count
     * @return
     */
    @Select("select * from t_columns order by id limit #{dealCount},#{count}")
    List<Columns> selectByPage(int dealCount,int count);
}
