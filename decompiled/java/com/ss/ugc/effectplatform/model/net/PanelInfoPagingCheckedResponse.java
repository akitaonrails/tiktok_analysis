package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PanelInfoPagingCheckedResponse extends C13OE<PanelInfoModel> implements Serializable {
    public CategoryEffectListResponse CategoryEffectsResponse;
    public PanelInfoCheckedResponse PanelInfoResponse;
    public String message;
    public int status_code;

    public PanelInfoPagingCheckedResponse() {
        this(null, null, null, 0);
    }

    public final PanelInfoPagingCheckedResponse copy(PanelInfoCheckedResponse panelInfoCheckedResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i) {
        return new PanelInfoPagingCheckedResponse(panelInfoCheckedResponse, categoryEffectListResponse, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelInfoPagingCheckedResponse)) {
            return false;
        }
        PanelInfoPagingCheckedResponse panelInfoPagingCheckedResponse = (PanelInfoPagingCheckedResponse) obj;
        return Intrinsics.LJFF(this.PanelInfoResponse, panelInfoPagingCheckedResponse.PanelInfoResponse) && Intrinsics.LJFF(this.CategoryEffectsResponse, panelInfoPagingCheckedResponse.CategoryEffectsResponse) && Intrinsics.LJFF(this.message, panelInfoPagingCheckedResponse.message) && this.status_code == panelInfoPagingCheckedResponse.status_code;
    }

    public int hashCode() {
        PanelInfoCheckedResponse panelInfoCheckedResponse = this.PanelInfoResponse;
        int iHashCode = (panelInfoCheckedResponse == null ? 0 : panelInfoCheckedResponse.hashCode()) * 31;
        CategoryEffectListResponse categoryEffectListResponse = this.CategoryEffectsResponse;
        int iHashCode2 = (iHashCode + (categoryEffectListResponse == null ? 0 : categoryEffectListResponse.hashCode())) * 31;
        String str = this.message;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelInfoPagingCheckedResponse(PanelInfoResponse=");
        sbLIZ.append(this.PanelInfoResponse);
        sbLIZ.append(", CategoryEffectsResponse=");
        sbLIZ.append(this.CategoryEffectsResponse);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C13OE
    public boolean checkValue() {
        PanelInfoCheckedResponse panelInfoCheckedResponse;
        PanelInfoCheckedResponse panelInfoCheckedResponse2 = this.PanelInfoResponse;
        if (panelInfoCheckedResponse2 != null) {
            return (Intrinsics.LJFF(panelInfoCheckedResponse2.getUpdated(), Boolean.TRUE) && ((panelInfoCheckedResponse = this.PanelInfoResponse) == null || panelInfoCheckedResponse.getData() == null)) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public PanelInfoModel getResponseData() {
        return new PanelInfoPagingCheckedModel(this.PanelInfoResponse, this.CategoryEffectsResponse).getPanelInfo();
    }

    public final CategoryEffectListResponse getCategoryEffectsResponse() {
        return this.CategoryEffectsResponse;
    }

    public final PanelInfoCheckedResponse getPanelInfoResponse() {
        return this.PanelInfoResponse;
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

    public final void setCategoryEffectsResponse(CategoryEffectListResponse categoryEffectListResponse) {
        this.CategoryEffectsResponse = categoryEffectListResponse;
    }

    public final void setPanelInfoResponse(PanelInfoCheckedResponse panelInfoCheckedResponse) {
        this.PanelInfoResponse = panelInfoCheckedResponse;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public PanelInfoPagingCheckedResponse(PanelInfoCheckedResponse panelInfoCheckedResponse, CategoryEffectListResponse categoryEffectListResponse, String str, int i) {
        this.PanelInfoResponse = panelInfoCheckedResponse;
        this.CategoryEffectsResponse = categoryEffectListResponse;
        this.message = str;
        this.status_code = i;
    }
}
