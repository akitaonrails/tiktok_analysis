package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ProviderEffectListResponse extends C13OE<ProviderEffectModel> implements Serializable {
    public ProviderEffectModel data;
    public String message;
    public int status_code;

    public ProviderEffectListResponse() {
        this(null, null, 0);
    }

    public final ProviderEffectListResponse copy(ProviderEffectModel providerEffectModel, String str, int i) {
        return new ProviderEffectListResponse(providerEffectModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderEffectListResponse)) {
            return false;
        }
        ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) obj;
        return Intrinsics.LJFF(this.data, providerEffectListResponse.data) && Intrinsics.LJFF(this.message, providerEffectListResponse.message) && this.status_code == providerEffectListResponse.status_code;
    }

    public int hashCode() {
        ProviderEffectModel providerEffectModel = this.data;
        int iHashCode = (providerEffectModel == null ? 0 : providerEffectModel.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProviderEffectListResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ProviderEffectModel getData() {
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
    public ProviderEffectModel getResponseData() {
        return this.data;
    }

    public final void setData(ProviderEffectModel providerEffectModel) {
        this.data = providerEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ProviderEffectListResponse(ProviderEffectModel providerEffectModel, String str, int i) {
        this.data = providerEffectModel;
        this.message = str;
        this.status_code = i;
    }
}
