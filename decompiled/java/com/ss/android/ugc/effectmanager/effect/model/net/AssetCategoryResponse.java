package com.ss.android.ugc.effectmanager.effect.model.net;

import X.C13OE;
import com.ss.android.ugc.effectmanager.effect.model.AssetCategoryModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class AssetCategoryResponse extends C13OE<AssetCategoryModel> implements Serializable {
    public final AssetCategoryModel data;
    public String logId;
    public final String message;
    public final int status_code;
    public final Boolean updated;

    @Override // X.C13OE
    public boolean checkValue() {
        return this.data != null;
    }

    public final AssetCategoryModel getData() {
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

    public final Boolean getUpdated() {
        return this.updated;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public AssetCategoryModel getResponseData() {
        return this.data;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public AssetCategoryResponse(int i, String str, AssetCategoryModel assetCategoryModel, Boolean bool, String str2) {
        this.status_code = i;
        this.message = str;
        this.data = assetCategoryModel;
        this.updated = bool;
        this.logId = str2;
    }
}
