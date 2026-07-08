package com.ss.bduploader;

import X.C786410Ut5;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class BDExternResponseInfo {
    public byte[] responseBody;
    public JSONObject responseHeader;
    public String responseHeaderStr;
    public int statusCode;
    public String url;

    public byte[] getResponseBody() {
        return this.responseBody;
    }

    public JSONObject getResponseHeader() {
        return this.responseHeader;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getUrl() {
        return this.url;
    }

    public void setResponseBody(byte[] bArr) {
        this.responseBody = bArr;
    }

    public void setResponseHeader(JSONObject jSONObject) {
        this.responseHeader = jSONObject;
        if (jSONObject != null) {
            this.responseHeaderStr = C786410Ut5.J3(jSONObject);
        }
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
