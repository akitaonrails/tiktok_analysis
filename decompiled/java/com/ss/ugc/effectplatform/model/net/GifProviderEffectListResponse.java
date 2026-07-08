package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import com.ss.ugc.effectplatform.model.GifProviderEffectModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class GifProviderEffectListResponse extends C13OE<GifProviderEffectModel> implements Serializable {
    public GifProviderEffectModel data;
    public String message;
    public int status_code;

    public GifProviderEffectListResponse() {
        this(null, null, 0);
    }

    public final GifProviderEffectListResponse copy(GifProviderEffectModel gifProviderEffectModel, String str, int i) {
        return new GifProviderEffectListResponse(gifProviderEffectModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GifProviderEffectListResponse)) {
            return false;
        }
        GifProviderEffectListResponse gifProviderEffectListResponse = (GifProviderEffectListResponse) obj;
        return Intrinsics.LJFF(this.data, gifProviderEffectListResponse.data) && Intrinsics.LJFF(this.message, gifProviderEffectListResponse.message) && this.status_code == gifProviderEffectListResponse.status_code;
    }

    public int hashCode() {
        GifProviderEffectModel gifProviderEffectModel = this.data;
        int iHashCode = (gifProviderEffectModel == null ? 0 : gifProviderEffectModel.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GifProviderEffectListResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final GifProviderEffectModel getData() {
        return this.data;
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
    public GifProviderEffectModel getResponseData() {
        return this.data;
    }

    public final void setData(GifProviderEffectModel gifProviderEffectModel) {
        this.data = gifProviderEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public GifProviderEffectListResponse(GifProviderEffectModel gifProviderEffectModel, String str, int i) {
        this.data = gifProviderEffectModel;
        this.message = str;
        this.status_code = i;
    }
}
