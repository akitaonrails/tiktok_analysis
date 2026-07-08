package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class InfoStickerListResponse extends C13OE<InfoStickerListResponse> implements Serializable {
    public InfoStickerListModel data;
    public String message;
    public int status_code;

    public InfoStickerListResponse() {
        this(null, null, 0);
    }

    public final InfoStickerListResponse copy(InfoStickerListModel infoStickerListModel, String str, int i) {
        return new InfoStickerListResponse(infoStickerListModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoStickerListResponse)) {
            return false;
        }
        InfoStickerListResponse infoStickerListResponse = (InfoStickerListResponse) obj;
        return Intrinsics.LJFF(this.data, infoStickerListResponse.data) && Intrinsics.LJFF(this.message, infoStickerListResponse.message) && this.status_code == infoStickerListResponse.status_code;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public InfoStickerListResponse getResponseData() {
        return this;
    }

    public int hashCode() {
        InfoStickerListModel infoStickerListModel = this.data;
        int iHashCode = (infoStickerListModel == null ? 0 : infoStickerListModel.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InfoStickerListResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final InfoStickerListModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public /* bridge */ /* synthetic */ InfoStickerListResponse getResponseData() {
        getResponseData();
        return this;
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

    public final void setData(InfoStickerListModel infoStickerListModel) {
        this.data = infoStickerListModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public InfoStickerListResponse(InfoStickerListModel infoStickerListModel, String str, int i) {
        this.data = infoStickerListModel;
        this.message = str;
        this.status_code = i;
    }
}
