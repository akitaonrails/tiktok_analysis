package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public class GetCustomizedEffectIDResponse extends C13OE<GetCustomizedEffectIDData> implements Serializable {
    public GetCustomizedEffectIDData data;
    public String message;
    public int status_code;

    public GetCustomizedEffectIDResponse() {
        this(null, 0, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public GetCustomizedEffectIDData getResponseData() {
        return getData();
    }

    @Override // X.C13OE
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // X.C13OE
    public int getStatusCode() {
        return getStatus_code();
    }

    public GetCustomizedEffectIDData getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public void setData(GetCustomizedEffectIDData getCustomizedEffectIDData) {
        this.data = getCustomizedEffectIDData;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public GetCustomizedEffectIDResponse(GetCustomizedEffectIDData getCustomizedEffectIDData, int i, String str) {
        this.data = getCustomizedEffectIDData;
        this.status_code = i;
        this.message = str;
    }
}
