package htmap.pjmanage.common;

public class ResponseData {
    private Integer code;
    private String message;
    private Object data;

    public ResponseData(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResponseData success(Object data) {
        return new ResponseData(Constants.RESPONSE_CODE_SUCCESSFUL, null, data);
    }

    public static ResponseData success() {
        return new ResponseData(Constants.RESPONSE_CODE_SUCCESSFUL, null, null);
    }

    public static ResponseData fail(String errMsg) {
        return new ResponseData(Constants.RESPONSE_CODE_FAILED, errMsg, null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
