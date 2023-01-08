package pl.infoshare.validation.exceptions;

import lombok.Value;

public class InfoshareError {
    private final String errorCode;
    private final Integer statusCode;
    private final String explanation;

    public InfoshareError(String errorCode, Integer statusCode, String explanation) {
        this.errorCode = errorCode;
        this.statusCode = statusCode;
        this.explanation = explanation;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getExplanation() {
        return explanation;
    }
}
