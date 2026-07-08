package com.ss.ugc.effectplatform.model.net;

import X.C13OE;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class UpdateUseEffectResponse extends C13OE implements Serializable {
    public String message;
    public int status_code;

    public UpdateUseEffectResponse() {
        this(null, 0);
    }

    @Override // X.C13OE
    public boolean checkValue() {
        return true;
    }

    public final UpdateUseEffectResponse copy(String str, int i) {
        return new UpdateUseEffectResponse(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateUseEffectResponse)) {
            return false;
        }
        UpdateUseEffectResponse updateUseEffectResponse = (UpdateUseEffectResponse) obj;
        return Intrinsics.LJFF(this.message, updateUseEffectResponse.message) && this.status_code == updateUseEffectResponse.status_code;
    }

    @Override // X.C13OE
    public Void getResponseData() {
        return null;
    }

    public int hashCode() {
        String str = this.message;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.status_code;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateUseEffectResponse(message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
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

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public UpdateUseEffectResponse(String str, int i) {
        this.message = str;
        this.status_code = i;
    }
}
