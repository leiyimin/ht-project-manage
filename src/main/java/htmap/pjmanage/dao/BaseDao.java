package htmap.pjmanage.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BaseDao {

    Integer deleteById(@Param("table") String table, @Param("id") Integer id);

    Integer deleteByKey(@Param("table") String table, @Param("key") Integer key);

    Integer getOneById(@Param("table") String table, @Param("id") Integer id);

    Integer getOneByKey(@Param("table") String table, @Param("key") Integer key);

    List<Map<String,Object>> query(@Param("table") String table,
                                   @Param("equalWhere") Map equalWhere,
                                   @Param("likeWhere") Map likeWhere,
                                   @Param("scopeWhere") Map scopeWhere,
                                   @Param("timeScopeWhere") Map timeScopeWhere,
                                   @Param("orderBy") String orderBy,
                                   @Param("orderByType") String orderByType);
}
