package htmap.pjmanage.service;

import java.util.List;
import java.util.Map;

public interface baseService {

    Integer delete(Integer id) throws Exception;
    Integer delete(String key) throws Exception;
    List<Map<String,Object>> query(Integer id) throws Exception;
    List<Map<String,Object>> pagingQuery (Integer id) throws Exception;

}
