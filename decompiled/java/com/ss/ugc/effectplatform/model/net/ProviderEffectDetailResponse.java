package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ProviderEffectDetailResponse extends C13OE<ProviderEffect> implements Serializable {
    public ProviderEffect data;
    public String message;
    public int status_code;

    public ProviderEffectDetailResponse() {
        this(null, null, 0);
    }

    public final ProviderEffectDetailResponse copy(ProviderEffect providerEffect, String str, int i) {
        return new ProviderEffectDetailResponse(providerEffect, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderEffectDetailResponse)) {
            return false;
        }
        ProviderEffectDetailResponse providerEffectDetailResponse = (ProviderEffectDetailResponse) obj;
        return Intrinsics.LJFF(this.data, providerEffectDetailResponse.data) && Intrinsics.LJFF(this.message, providerEffectDetailResponse.message) && this.status_code == providerEffectDetailResponse.status_code;
    }

    public int hashCode() {
        ProviderEffect providerEffect = this.data;
        int iHashCode = (providerEffect == null ? 0 : providerEffect.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProviderEffectDetailResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ProviderEffect getData() {
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
    public ProviderEffect getResponseData() {
        return this.data;
    }

    public final void setData(ProviderEffect providerEffect) {
        this.data = providerEffect;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ProviderEffectDetailResponse(ProviderEffect providerEffect, String str, int i) {
        this.data = providerEffect;
        this.message = str;
        this.status_code = i;
    }
}
