package htmap.pjmanage.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QueryBuilder {

    private String table;
    private AndWhere andWhere;
    private OrWhere orWhere;
    private String orderBy;
    private String orderByType = "ase";

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public AndWhere getAndWhere() {
        return andWhere;
    }

    public void setAndWhere(AndWhere andWhere) {
        this.andWhere = andWhere;
    }

    public OrWhere getOrWhere() {
        return orWhere;
    }

    public void setOrWhere(OrWhere orWhere) {
        this.orWhere = orWhere;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderByType() {
        return orderByType;
    }

    public void setOrderByType(String orderByType) {
        this.orderByType = orderByType;
    }

    public static class AndWhere {
        private Map<String, Object> equalWhere;
        private Map<String, Object> likeWhere;
        private Map<String, Object> scopeWhere;

        public Map<String, Object> getEqualWhere() {
            return equalWhere;
        }

        public void setEqualWhere(Map<String, Object> equalWhere) {
            this.equalWhere = equalWhere;
        }

        public Map<String, Object> getLikeWhere() {
            return likeWhere;
        }

        public void setLikeWhere(Map<String, Object> likeWhere) {
            this.likeWhere = likeWhere;
        }

        public Map<String, Object> getScopeWhere() {
            return scopeWhere;
        }

        public void setScopeWhere(Map<String, Object> scopeWhere) {
            this.scopeWhere = scopeWhere;
        }
    }

    public static class OrWhere {
        private List<AndWhere> andWheres = new ArrayList<>();

        public List<AndWhere> getAndWheres() {
            return andWheres;
        }

        public void setAndWheres(List<AndWhere> andWheres) {
            this.andWheres = andWheres;
        }
    }
}
