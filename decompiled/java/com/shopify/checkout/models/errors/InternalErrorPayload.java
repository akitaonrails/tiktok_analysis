package com.shopify.checkout.models.errors;

import X.C09AZ;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1054410dXr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class InternalErrorPayload implements InterfaceC1054410dXr {

    @C09CT("code")
    public final InternalErrorCode code;

    @C09CT("group")
    public final ErrorGroup group = ErrorGroup.INTERNAL;

    @C09CT("reason")
    public final String reason;

    @C09CT("underlyingError")
    public final Exception underlyingError;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalErrorPayload)) {
            return false;
        }
        InternalErrorPayload internalErrorPayload = (InternalErrorPayload) obj;
        return this.code == internalErrorPayload.code && Intrinsics.LJFF(this.underlyingError, internalErrorPayload.underlyingError) && Intrinsics.LJFF(this.reason, internalErrorPayload.reason);
    }

    public final int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        Exception exc = this.underlyingError;
        int iHashCode2 = (iHashCode + (exc == null ? 0 : exc.hashCode())) * 31;
        String str = this.reason;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n            Group: ");
        sbLIZ.append(this.group);
        sbLIZ.append("\n            Reason: ");
        sbLIZ.append(this.reason);
        sbLIZ.append("\n            Code: ");
        sbLIZ.append(this.code);
        sbLIZ.append("\n            Underlying Error: ");
        Exception exc = this.underlyingError;
        sbLIZ.append(exc != null ? exc.getMessage() : null);
        sbLIZ.append("\n        ");
        return C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public InternalErrorPayload(InternalErrorCode internalErrorCode, Exception exc, String str) {
        this.code = internalErrorCode;
        this.underlyingError = exc;
        this.reason = str;
    }
}
