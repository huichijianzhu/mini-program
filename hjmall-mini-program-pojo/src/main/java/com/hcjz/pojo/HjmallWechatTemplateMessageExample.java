package com.hcjz.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HjmallWechatTemplateMessageExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HjmallWechatTemplateMessageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andPayTplIsNull() {
            addCriterion("pay_tpl is null");
            return (Criteria) this;
        }

        public Criteria andPayTplIsNotNull() {
            addCriterion("pay_tpl is not null");
            return (Criteria) this;
        }

        public Criteria andPayTplEqualTo(String value) {
            addCriterion("pay_tpl =", value, "payTpl");
            return (Criteria) this;
        }

        public Criteria andPayTplNotEqualTo(String value) {
            addCriterion("pay_tpl <>", value, "payTpl");
            return (Criteria) this;
        }

        public Criteria andPayTplGreaterThan(String value) {
            addCriterion("pay_tpl >", value, "payTpl");
            return (Criteria) this;
        }

        public Criteria andPayTplGreaterThanOrEqualTo(String value) {
            addCriterion("pay_tpl >=", value, "payTpl");
            return (Criteria) this;
        }

        public Criteria andPayTplLessThan(String value) {
            addCriterion("pay_tpl <", value, "payTpl");
            return (Criteria) this;
        }

        public Criteria andPayTplLessThanOrEqualTo(String value) {
            addCriterion("pay_tpl <=", value, "payTpl");
            return (Criteria) this;
        }

        public Criteria andPayTplLike(String value) {
            addCriterion("pay_tpl like", value, "payTpl");
            return (Criteria) this;
        }

        public Criteria andPayTplNotLike(String value) {
            addCriterion("pay_tpl not like", value, "payTpl");
            return (Criteria) this;
        }

        public Criteria andPayTplIn(List<String> values) {
            addCriterion("pay_tpl in", values, "payTpl");
            return (Criteria) this;
        }

        public Criteria andPayTplNotIn(List<String> values) {
            addCriterion("pay_tpl not in", values, "payTpl");
            return (Criteria) this;
        }

        public Criteria andPayTplBetween(String value1, String value2) {
            addCriterion("pay_tpl between", value1, value2, "payTpl");
            return (Criteria) this;
        }

        public Criteria andPayTplNotBetween(String value1, String value2) {
            addCriterion("pay_tpl not between", value1, value2, "payTpl");
            return (Criteria) this;
        }

        public Criteria andSendTplIsNull() {
            addCriterion("send_tpl is null");
            return (Criteria) this;
        }

        public Criteria andSendTplIsNotNull() {
            addCriterion("send_tpl is not null");
            return (Criteria) this;
        }

        public Criteria andSendTplEqualTo(String value) {
            addCriterion("send_tpl =", value, "sendTpl");
            return (Criteria) this;
        }

        public Criteria andSendTplNotEqualTo(String value) {
            addCriterion("send_tpl <>", value, "sendTpl");
            return (Criteria) this;
        }

        public Criteria andSendTplGreaterThan(String value) {
            addCriterion("send_tpl >", value, "sendTpl");
            return (Criteria) this;
        }

        public Criteria andSendTplGreaterThanOrEqualTo(String value) {
            addCriterion("send_tpl >=", value, "sendTpl");
            return (Criteria) this;
        }

        public Criteria andSendTplLessThan(String value) {
            addCriterion("send_tpl <", value, "sendTpl");
            return (Criteria) this;
        }

        public Criteria andSendTplLessThanOrEqualTo(String value) {
            addCriterion("send_tpl <=", value, "sendTpl");
            return (Criteria) this;
        }

        public Criteria andSendTplLike(String value) {
            addCriterion("send_tpl like", value, "sendTpl");
            return (Criteria) this;
        }

        public Criteria andSendTplNotLike(String value) {
            addCriterion("send_tpl not like", value, "sendTpl");
            return (Criteria) this;
        }

        public Criteria andSendTplIn(List<String> values) {
            addCriterion("send_tpl in", values, "sendTpl");
            return (Criteria) this;
        }

        public Criteria andSendTplNotIn(List<String> values) {
            addCriterion("send_tpl not in", values, "sendTpl");
            return (Criteria) this;
        }

        public Criteria andSendTplBetween(String value1, String value2) {
            addCriterion("send_tpl between", value1, value2, "sendTpl");
            return (Criteria) this;
        }

        public Criteria andSendTplNotBetween(String value1, String value2) {
            addCriterion("send_tpl not between", value1, value2, "sendTpl");
            return (Criteria) this;
        }

        public Criteria andRefundTplIsNull() {
            addCriterion("refund_tpl is null");
            return (Criteria) this;
        }

        public Criteria andRefundTplIsNotNull() {
            addCriterion("refund_tpl is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTplEqualTo(String value) {
            addCriterion("refund_tpl =", value, "refundTpl");
            return (Criteria) this;
        }

        public Criteria andRefundTplNotEqualTo(String value) {
            addCriterion("refund_tpl <>", value, "refundTpl");
            return (Criteria) this;
        }

        public Criteria andRefundTplGreaterThan(String value) {
            addCriterion("refund_tpl >", value, "refundTpl");
            return (Criteria) this;
        }

        public Criteria andRefundTplGreaterThanOrEqualTo(String value) {
            addCriterion("refund_tpl >=", value, "refundTpl");
            return (Criteria) this;
        }

        public Criteria andRefundTplLessThan(String value) {
            addCriterion("refund_tpl <", value, "refundTpl");
            return (Criteria) this;
        }

        public Criteria andRefundTplLessThanOrEqualTo(String value) {
            addCriterion("refund_tpl <=", value, "refundTpl");
            return (Criteria) this;
        }

        public Criteria andRefundTplLike(String value) {
            addCriterion("refund_tpl like", value, "refundTpl");
            return (Criteria) this;
        }

        public Criteria andRefundTplNotLike(String value) {
            addCriterion("refund_tpl not like", value, "refundTpl");
            return (Criteria) this;
        }

        public Criteria andRefundTplIn(List<String> values) {
            addCriterion("refund_tpl in", values, "refundTpl");
            return (Criteria) this;
        }

        public Criteria andRefundTplNotIn(List<String> values) {
            addCriterion("refund_tpl not in", values, "refundTpl");
            return (Criteria) this;
        }

        public Criteria andRefundTplBetween(String value1, String value2) {
            addCriterion("refund_tpl between", value1, value2, "refundTpl");
            return (Criteria) this;
        }

        public Criteria andRefundTplNotBetween(String value1, String value2) {
            addCriterion("refund_tpl not between", value1, value2, "refundTpl");
            return (Criteria) this;
        }

        public Criteria andNotPayTplIsNull() {
            addCriterion("not_pay_tpl is null");
            return (Criteria) this;
        }

        public Criteria andNotPayTplIsNotNull() {
            addCriterion("not_pay_tpl is not null");
            return (Criteria) this;
        }

        public Criteria andNotPayTplEqualTo(String value) {
            addCriterion("not_pay_tpl =", value, "notPayTpl");
            return (Criteria) this;
        }

        public Criteria andNotPayTplNotEqualTo(String value) {
            addCriterion("not_pay_tpl <>", value, "notPayTpl");
            return (Criteria) this;
        }

        public Criteria andNotPayTplGreaterThan(String value) {
            addCriterion("not_pay_tpl >", value, "notPayTpl");
            return (Criteria) this;
        }

        public Criteria andNotPayTplGreaterThanOrEqualTo(String value) {
            addCriterion("not_pay_tpl >=", value, "notPayTpl");
            return (Criteria) this;
        }

        public Criteria andNotPayTplLessThan(String value) {
            addCriterion("not_pay_tpl <", value, "notPayTpl");
            return (Criteria) this;
        }

        public Criteria andNotPayTplLessThanOrEqualTo(String value) {
            addCriterion("not_pay_tpl <=", value, "notPayTpl");
            return (Criteria) this;
        }

        public Criteria andNotPayTplLike(String value) {
            addCriterion("not_pay_tpl like", value, "notPayTpl");
            return (Criteria) this;
        }

        public Criteria andNotPayTplNotLike(String value) {
            addCriterion("not_pay_tpl not like", value, "notPayTpl");
            return (Criteria) this;
        }

        public Criteria andNotPayTplIn(List<String> values) {
            addCriterion("not_pay_tpl in", values, "notPayTpl");
            return (Criteria) this;
        }

        public Criteria andNotPayTplNotIn(List<String> values) {
            addCriterion("not_pay_tpl not in", values, "notPayTpl");
            return (Criteria) this;
        }

        public Criteria andNotPayTplBetween(String value1, String value2) {
            addCriterion("not_pay_tpl between", value1, value2, "notPayTpl");
            return (Criteria) this;
        }

        public Criteria andNotPayTplNotBetween(String value1, String value2) {
            addCriterion("not_pay_tpl not between", value1, value2, "notPayTpl");
            return (Criteria) this;
        }

        public Criteria andRevokeTplIsNull() {
            addCriterion("revoke_tpl is null");
            return (Criteria) this;
        }

        public Criteria andRevokeTplIsNotNull() {
            addCriterion("revoke_tpl is not null");
            return (Criteria) this;
        }

        public Criteria andRevokeTplEqualTo(String value) {
            addCriterion("revoke_tpl =", value, "revokeTpl");
            return (Criteria) this;
        }

        public Criteria andRevokeTplNotEqualTo(String value) {
            addCriterion("revoke_tpl <>", value, "revokeTpl");
            return (Criteria) this;
        }

        public Criteria andRevokeTplGreaterThan(String value) {
            addCriterion("revoke_tpl >", value, "revokeTpl");
            return (Criteria) this;
        }

        public Criteria andRevokeTplGreaterThanOrEqualTo(String value) {
            addCriterion("revoke_tpl >=", value, "revokeTpl");
            return (Criteria) this;
        }

        public Criteria andRevokeTplLessThan(String value) {
            addCriterion("revoke_tpl <", value, "revokeTpl");
            return (Criteria) this;
        }

        public Criteria andRevokeTplLessThanOrEqualTo(String value) {
            addCriterion("revoke_tpl <=", value, "revokeTpl");
            return (Criteria) this;
        }

        public Criteria andRevokeTplLike(String value) {
            addCriterion("revoke_tpl like", value, "revokeTpl");
            return (Criteria) this;
        }

        public Criteria andRevokeTplNotLike(String value) {
            addCriterion("revoke_tpl not like", value, "revokeTpl");
            return (Criteria) this;
        }

        public Criteria andRevokeTplIn(List<String> values) {
            addCriterion("revoke_tpl in", values, "revokeTpl");
            return (Criteria) this;
        }

        public Criteria andRevokeTplNotIn(List<String> values) {
            addCriterion("revoke_tpl not in", values, "revokeTpl");
            return (Criteria) this;
        }

        public Criteria andRevokeTplBetween(String value1, String value2) {
            addCriterion("revoke_tpl between", value1, value2, "revokeTpl");
            return (Criteria) this;
        }

        public Criteria andRevokeTplNotBetween(String value1, String value2) {
            addCriterion("revoke_tpl not between", value1, value2, "revokeTpl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}