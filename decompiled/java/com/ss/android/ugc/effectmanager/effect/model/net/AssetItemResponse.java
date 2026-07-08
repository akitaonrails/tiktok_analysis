package com.ss.android.ugc.effectmanager.effect.model.net;

import X.C13OE;
import com.ss.android.ugc.effectmanager.effect.model.AssetItemModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class AssetItemResponse extends C13OE<AssetItemModel> implements Serializable {
    public final AssetItemModel data;
    public String logId;
    public final String message;
    public final int status_code;

    @Override // X.C13OE
    public boolean checkValue() {
        return this.data != null;
    }

    public final AssetItemModel getData() {
        return this.data;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public String getResponseMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public AssetItemModel getResponseData() {
        return this.data;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public AssetItemResponse(int i, String str, AssetItemModel assetItemModel, String str2) {
        this.status_code = i;
        this.message = str;
        this.data = assetItemModel;
        this.logId = str2;
    }
}
