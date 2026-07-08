package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class AddCustomizedEffectResponse extends C13OE<AddCustomizedEffectResponse> implements Serializable {
    public String effectZipPath;
    public String iconPath;
    public String message;
    public int status_code;

    public AddCustomizedEffectResponse() {
        this(0, null, null, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public AddCustomizedEffectResponse getResponseData() {
        return this;
    }

    @Override // X.C13OE
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // X.C13OE
    public int getStatusCode() {
        return getStatus_code();
    }

    public String getEffectZipPath() {
        return this.effectZipPath;
    }

    public String getIconPath() {
        return this.iconPath;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public /* bridge */ /* synthetic */ AddCustomizedEffectResponse getResponseData() {
        getResponseData();
        return this;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public void setEffectZipPath(String str) {
        this.effectZipPath = str;
    }

    public void setIconPath(String str) {
        this.iconPath = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public AddCustomizedEffectResponse(int i, String str, String str2, String str3) {
        this.status_code = i;
        this.message = str;
        this.effectZipPath = str2;
        this.iconPath = str3;
    }
}
