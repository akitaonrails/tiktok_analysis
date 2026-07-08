package com.ss.android.ugc.effectmanager.effect.model.net;

import X.C13OE;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class AssetPanelResponse extends C13OE<AssetPanelModel> implements Serializable {
    public final AssetPanelModel data;
    public String logId;
    public final String message;
    public final int status_code;
    public final String status_msg;
    public Boolean updated;

    @Override // X.C13OE
    public boolean checkValue() {
        return this.data != null;
    }

    @Override // X.C13OE
    public String getResponseMessage() {
        String str = this.message;
        String str2 = null;
        if (!(str.length() > 0)) {
            str = null;
        }
        String str3 = this.status_msg;
        if (str3 != null && str3.length() > 0) {
            str2 = str3;
        }
        if (str != null) {
            if (str2 != null) {
                return "msg:" + str + ", status_msg:" + str2;
            }
        } else if (str2 != null) {
            return str2;
        }
        return this.message;
    }

    public final AssetPanelModel getData() {
        return this.data;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public final Boolean getUpdated() {
        return this.updated;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public AssetPanelModel getResponseData() {
        return this.data;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public final void setUpdated(Boolean bool) {
        this.updated = bool;
    }

    public AssetPanelResponse(int i, String str, String str2, AssetPanelModel assetPanelModel, Boolean bool, String str3) {
        this.status_code = i;
        this.message = str;
        this.status_msg = str2;
        this.data = assetPanelModel;
        this.updated = bool;
        this.logId = str3;
    }
}
