package com.ss.lyrax.augur;

import X.C2188811AlT;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurCommandResponse {
    public String adaptiveResult = "";
    public JSONObject adaptiveResultJSONObject;
    public int errorCode;
    public int executeCode;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AugurCommandResponse{executeCode=");
        sbLIZ.append(this.executeCode);
        sbLIZ.append(", adaptiveResult='");
        sbLIZ.append(this.adaptiveResult);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getAdaptiveResult() {
        return this.adaptiveResult;
    }

    public JSONObject getAdaptiveResultJSONObject() {
        return this.adaptiveResultJSONObject;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getExecuteCode() {
        return this.executeCode;
    }

    public void setAdaptiveResult(String str) {
        this.adaptiveResult = str;
    }

    public void setAdaptiveResultJSONObject(JSONObject jSONObject) {
        this.adaptiveResultJSONObject = jSONObject;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setExecuteCode(int i) {
        this.executeCode = i;
    }
}
