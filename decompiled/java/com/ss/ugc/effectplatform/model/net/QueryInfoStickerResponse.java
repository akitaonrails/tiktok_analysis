package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class QueryInfoStickerResponse extends C13OE<QueryInfoStickerResponse> implements Serializable {
    public QueryInfoStickerListModel data;
    public String message;
    public int status_code;

    public QueryInfoStickerResponse() {
        this(null, null, 0);
    }

    public final QueryInfoStickerResponse copy(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i) {
        return new QueryInfoStickerResponse(queryInfoStickerListModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryInfoStickerResponse)) {
            return false;
        }
        QueryInfoStickerResponse queryInfoStickerResponse = (QueryInfoStickerResponse) obj;
        return Intrinsics.LJFF(this.data, queryInfoStickerResponse.data) && Intrinsics.LJFF(this.message, queryInfoStickerResponse.message) && this.status_code == queryInfoStickerResponse.status_code;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public QueryInfoStickerResponse getResponseData() {
        return this;
    }

    public int hashCode() {
        QueryInfoStickerListModel queryInfoStickerListModel = this.data;
        int iHashCode = (queryInfoStickerListModel == null ? 0 : queryInfoStickerListModel.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueryInfoStickerResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final QueryInfoStickerListModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // X.C13OE
    public /* bridge */ /* synthetic */ QueryInfoStickerResponse getResponseData() {
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

    public final void setData(QueryInfoStickerListModel queryInfoStickerListModel) {
        this.data = queryInfoStickerListModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public QueryInfoStickerResponse(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i) {
        this.data = queryInfoStickerListModel;
        this.message = str;
        this.status_code = i;
    }
}
