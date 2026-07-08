package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EffectNetListCheckedResponse extends C13OE<EffectChannelModel> implements Serializable {
    public EffectChannelModel data;
    public String message;
    public int status_code;
    public Boolean updated;

    public EffectNetListCheckedResponse() {
        this(null, null, Boolean.TRUE, 0);
    }

    public final EffectNetListCheckedResponse copy(EffectChannelModel effectChannelModel, String str, Boolean bool, int i) {
        return new EffectNetListCheckedResponse(effectChannelModel, str, bool, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectNetListCheckedResponse)) {
            return false;
        }
        EffectNetListCheckedResponse effectNetListCheckedResponse = (EffectNetListCheckedResponse) obj;
        return Intrinsics.LJFF(this.data, effectNetListCheckedResponse.data) && Intrinsics.LJFF(this.message, effectNetListCheckedResponse.message) && Intrinsics.LJFF(this.updated, effectNetListCheckedResponse.updated) && this.status_code == effectNetListCheckedResponse.status_code;
    }

    public int hashCode() {
        EffectChannelModel effectChannelModel = this.data;
        int iHashCode = (effectChannelModel == null ? 0 : effectChannelModel.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.updated;
        return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectNetListCheckedResponse(data=");
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

    public final EffectChannelModel getData() {
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
    public EffectChannelModel getResponseData() {
        return this.data;
    }

    public final void setData(EffectChannelModel effectChannelModel) {
        this.data = effectChannelModel;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUpdated(Boolean bool) {
        this.updated = bool;
    }

    public EffectNetListCheckedResponse(EffectChannelModel effectChannelModel, String str, Boolean bool, int i) {
        this.data = effectChannelModel;
        this.message = str;
        this.updated = bool;
        this.status_code = i;
    }
}
