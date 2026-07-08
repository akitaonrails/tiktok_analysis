package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EffectNetListResponse extends C13OE<EffectChannelModel> implements Serializable {
    public EffectChannelModel data;
    public String message;
    public int status_code;

    public EffectNetListResponse() {
        this(null, null, 0);
    }

    public final EffectNetListResponse copy(EffectChannelModel effectChannelModel, String str, int i) {
        return new EffectNetListResponse(effectChannelModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectNetListResponse)) {
            return false;
        }
        EffectNetListResponse effectNetListResponse = (EffectNetListResponse) obj;
        return Intrinsics.LJFF(this.data, effectNetListResponse.data) && Intrinsics.LJFF(this.message, effectNetListResponse.message) && this.status_code == effectNetListResponse.status_code;
    }

    public int hashCode() {
        EffectChannelModel effectChannelModel = this.data;
        int iHashCode = (effectChannelModel == null ? 0 : effectChannelModel.hashCode()) * 31;
        String str = this.message;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectNetListResponse(data=");
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
        EffectChannelModel effectChannelModel = this.data;
        if (effectChannelModel == null) {
            return false;
        }
        return effectChannelModel.checkValued();
    }

    public final EffectChannelModel getData() {
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
    public EffectChannelModel getResponseData() {
        return this.data;
    }

    public final void setData(EffectChannelModel effectChannelModel) {
        this.data = effectChannelModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public EffectNetListResponse(EffectChannelModel effectChannelModel, String str, int i) {
        this.data = effectChannelModel;
        this.message = str;
        this.status_code = i;
    }
}
