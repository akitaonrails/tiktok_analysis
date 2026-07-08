package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PanelInfoCheckedResponse extends C13OE<PanelInfoModel> implements Serializable {
    public PanelInfoModel data;
    public String message;
    public int status_code;
    public Boolean updated;

    public PanelInfoCheckedResponse() {
        this(null, null, Boolean.TRUE, 0);
    }

    public final PanelInfoCheckedResponse copy(PanelInfoModel panelInfoModel, String str, Boolean bool, int i) {
        return new PanelInfoCheckedResponse(panelInfoModel, str, bool, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelInfoCheckedResponse)) {
            return false;
        }
        PanelInfoCheckedResponse panelInfoCheckedResponse = (PanelInfoCheckedResponse) obj;
        return Intrinsics.LJFF(this.data, panelInfoCheckedResponse.data) && Intrinsics.LJFF(this.message, panelInfoCheckedResponse.message) && Intrinsics.LJFF(this.updated, panelInfoCheckedResponse.updated) && this.status_code == panelInfoCheckedResponse.status_code;
    }

    public int hashCode() {
        PanelInfoModel panelInfoModel = this.data;
        int iHashCode = (panelInfoModel == null ? 0 : panelInfoModel.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.updated;
        return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelInfoCheckedResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", updated=");
        sbLIZ.append(this.updated);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C13OE
    public boolean checkValue() {
        return (Intrinsics.LJFF(this.updated, Boolean.TRUE) && this.data == null) ? false : true;
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

    public final Boolean getUpdated() {
        return this.updated;
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

    public final void setUpdated(Boolean bool) {
        this.updated = bool;
    }

    public PanelInfoCheckedResponse(PanelInfoModel panelInfoModel, String str, Boolean bool, int i) {
        this.data = panelInfoModel;
        this.message = str;
        this.updated = bool;
        this.status_code = i;
    }
}
