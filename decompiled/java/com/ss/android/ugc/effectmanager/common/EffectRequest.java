package com.ss.android.ugc.effectmanager.common;

import X.C2188811AlT;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class EffectRequest {
    public long contentLength;
    public String errorMsg;
    public boolean isCancel;
    public String logId;
    public boolean mAddQueryForPost;
    public String mHttpMethod;
    public String mUrl;
    public boolean mUseCommonParams;
    public Map<String, String> mHeaders = new HashMap();
    public Map<String, Object> mBodyParams = new HashMap();
    public Map<String, Object> mFormDataParts = new HashMap();
    public String mContentType = "application/x-www-form-urlencoded";

    public void cancel() {
        this.isCancel = true;
    }

    public String getParamsEncoding() {
        return "UTF-8";
    }

    public String getBodyContentType() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("application/x-www-form-urlencoded; charset=");
        sbLIZ.append(getParamsEncoding());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public long getContentLength() {
        return this.contentLength;
    }

    public String getContentType() {
        return this.mContentType;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public Map<String, Object> getFormDataParts() {
        return this.mFormDataParts;
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public String getHttpMethod() {
        return this.mHttpMethod;
    }

    public String getLogId() {
        return this.logId;
    }

    public Map<String, Object> getParams() {
        return this.mBodyParams;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean isCanceled() {
        return this.isCancel;
    }

    public boolean isUseCommonParams() {
        return this.mUseCommonParams;
    }

    public boolean shouldAddQueryForPost() {
        return this.mAddQueryForPost;
    }

    public void setBodyParams(Map<String, Object> map) {
        this.mBodyParams = map;
    }

    public void setContentLength(long j) {
        this.contentLength = j;
    }

    public void setContentType(String str) {
        this.mContentType = str;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public void setFormDataParts(Map<String, Object> map) {
        this.mFormDataParts = map;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setLogId(String str) {
        this.logId = str;
    }

    public void setUseCommonParams(boolean z) {
        this.mUseCommonParams = z;
    }

    public EffectRequest(String str, String str2, boolean z) {
        this.mUrl = "";
        this.mUseCommonParams = true;
        this.mHttpMethod = "GET";
        this.mHttpMethod = str;
        this.mUrl = str2;
        this.mUseCommonParams = z;
    }

    public EffectRequest(String str, String str2, boolean z, boolean z2) {
        this.mUrl = "";
        this.mUseCommonParams = true;
        this.mHttpMethod = "GET";
        this.mHttpMethod = str;
        this.mUrl = str2;
        this.mUseCommonParams = true;
        this.mAddQueryForPost = z2;
    }
}
