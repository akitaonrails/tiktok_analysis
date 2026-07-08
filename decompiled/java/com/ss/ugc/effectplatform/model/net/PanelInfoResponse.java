package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PanelInfoResponse extends C13OE<PanelInfoModel> implements Serializable {
    public PanelInfoModel data;
    public String message;
    public int status_code;

    public PanelInfoResponse() {
        this(null, null, 0);
    }

    public final PanelInfoResponse copy(PanelInfoModel panelInfoModel, String str, int i) {
        return new PanelInfoResponse(panelInfoModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelInfoResponse)) {
            return false;
        }
        PanelInfoResponse panelInfoResponse = (PanelInfoResponse) obj;
        return Intrinsics.LJFF(this.data, panelInfoResponse.data) && Intrinsics.LJFF(this.message, panelInfoResponse.message) && this.status_code == panelInfoResponse.status_code;
    }

    public int hashCode() {
        PanelInfoModel panelInfoModel = this.data;
        int iHashCode = (panelInfoModel == null ? 0 : panelInfoModel.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelInfoResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C13OE
    public boolean checkValue() {
        return this.data != null;
    }

    public final PanelInfoModel getData() {
        return this.data;
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
    public PanelInfoModel getResponseData() {
        return this.data;
    }

    public final void setData(PanelInfoModel panelInfoModel) {
        this.data = panelInfoModel;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public PanelInfoResponse(PanelInfoModel panelInfoModel, String str, int i) {
        this.data = panelInfoModel;
        this.message = str;
        this.status_code = i;
    }
}
