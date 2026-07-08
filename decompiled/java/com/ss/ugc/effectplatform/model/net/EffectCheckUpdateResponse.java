package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EffectCheckUpdateResponse extends C13OE<Boolean> implements Serializable {
    public String message;
    public int status_code;
    public boolean updated;

    public EffectCheckUpdateResponse() {
        this(false, null, 0);
    }

    public final EffectCheckUpdateResponse copy(boolean z, String str, int i) {
        return new EffectCheckUpdateResponse(z, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectCheckUpdateResponse)) {
            return false;
        }
        EffectCheckUpdateResponse effectCheckUpdateResponse = (EffectCheckUpdateResponse) obj;
        return this.updated == effectCheckUpdateResponse.updated && Intrinsics.LJFF(this.message, effectCheckUpdateResponse.message) && this.status_code == effectCheckUpdateResponse.status_code;
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.updated) * 31;
        String str = this.message;
        return ((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectCheckUpdateResponse(updated=");
        sbLIZ.append(this.updated);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.C13OE
    public Boolean getResponseData() {
        return Boolean.valueOf(this.updated);
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

    public final boolean getUpdated() {
        return this.updated;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUpdated(boolean z) {
        this.updated = z;
    }

    public EffectCheckUpdateResponse(boolean z, String str, int i) {
        this.updated = z;
        this.message = str;
        this.status_code = i;
    }
}
