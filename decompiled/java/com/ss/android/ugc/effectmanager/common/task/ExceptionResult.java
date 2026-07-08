package com.ss.android.ugc.effectmanager.common.task;

import X.C2188811AlT;
import android.accounts.NetworkErrorException;
import com.ss.android.ugc.effectmanager.common.ErrorConstants;
import com.ss.android.ugc.effectmanager.common.exception.MD5Exception;
import com.ss.android.ugc.effectmanager.common.exception.NetException;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.exception.UnzipException;
import com.ss.android.ugc.effectmanager.common.exception.UrlNotExistException;
import java.io.IOException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes26.dex */
public class ExceptionResult {
    public int errorCode;
    public Exception exception;
    public String logId;
    public String msg;
    public String remoteIp;
    public String requestUrl;
    public String selectedHost;

    public String toString() {
        if (this.exception == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ExceptionResult{errorCode=");
            sbLIZ.append(this.errorCode);
            sbLIZ.append(", msg='");
            sbLIZ.append(this.msg);
            sbLIZ.append(", requestUrl='");
            sbLIZ.append(this.requestUrl);
            sbLIZ.append('\'');
            sbLIZ.append(", selectedHost='");
            sbLIZ.append(this.selectedHost);
            sbLIZ.append('\'');
            sbLIZ.append(", remoteIp='");
            sbLIZ.append(this.remoteIp);
            sbLIZ.append('\'');
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ExceptionResult{errorCode=");
        sbLIZ2.append(this.errorCode);
        sbLIZ2.append(", msg='");
        sbLIZ2.append(this.msg);
        sbLIZ2.append('\'');
        sbLIZ2.append(", requestUrl='");
        sbLIZ2.append(this.requestUrl);
        sbLIZ2.append('\'');
        sbLIZ2.append(", selectedHost='");
        sbLIZ2.append(this.selectedHost);
        sbLIZ2.append('\'');
        sbLIZ2.append(", remoteIp='");
        sbLIZ2.append(this.remoteIp);
        sbLIZ2.append('\'');
        sbLIZ2.append(", exception=");
        sbLIZ2.append(this.exception.getMessage());
        sbLIZ2.append('}');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public Exception getException() {
        return this.exception;
    }

    public String getLogId() {
        return this.logId;
    }

    public String getMsg() {
        return this.msg;
    }

    public ExceptionResult(int i) {
        this.errorCode = i;
        this.msg = ErrorConstants.APIErrorHandle(i);
        this.exception = null;
        this.logId = null;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setException(Exception exc) {
        this.exception = exc;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public ExceptionResult(Exception exc) {
        this(exc, null, null, null);
    }

    public ExceptionResult(int i, Exception exc) {
        this.errorCode = i;
        this.msg = ErrorConstants.APIErrorHandle(i);
        this.exception = exc;
        this.logId = null;
    }

    public ExceptionResult(int i, Exception exc, String str) {
        this.errorCode = i;
        this.msg = ErrorConstants.APIErrorHandle(i);
        this.exception = exc;
        this.logId = str;
    }

    public void setTrackParams(String str, String str2, String str3) {
        this.requestUrl = str;
        this.selectedHost = str2;
        this.remoteIp = str3;
    }

    public ExceptionResult(Exception exc, String str, String str2, String str3) {
        this.errorCode = -1;
        this.requestUrl = str;
        this.selectedHost = str2;
        this.remoteIp = str3;
        this.exception = exc;
        if (exc instanceof NetException) {
            this.errorCode = ((NetException) exc).getStatus_code();
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof StatusCodeException) {
            this.errorCode = ((StatusCodeException) exc).getStatusCode();
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof JSONException) {
            this.errorCode = 10008;
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof NetworkErrorException) {
            this.errorCode = 10002;
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof UrlNotExistException) {
            this.errorCode = 10015;
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof UnzipException) {
            this.errorCode = 10013;
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof MD5Exception) {
            this.errorCode = 10010;
            this.msg = exc.getMessage();
            return;
        }
        if (exc instanceof IOException) {
            this.errorCode = 10012;
            this.msg = exc.getMessage();
        } else {
            if (exc != null) {
                if ("network unavailable".equals(exc.getMessage())) {
                    this.errorCode = 10011;
                } else {
                    this.errorCode = 10005;
                }
                this.msg = exc.getMessage();
                return;
            }
            this.errorCode = 1;
            this.msg = ErrorConstants.APIErrorHandle(1);
        }
    }
}
