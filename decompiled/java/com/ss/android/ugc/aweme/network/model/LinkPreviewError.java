package com.ss.android.ugc.aweme.network.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LinkPreviewError {

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("error_message")
    public final String errorMessage;

    public LinkPreviewError() {
        this(0, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkPreviewError)) {
            return false;
        }
        LinkPreviewError linkPreviewError = (LinkPreviewError) obj;
        return this.errorCode == linkPreviewError.errorCode && Intrinsics.LJFF(this.errorMessage, linkPreviewError.errorMessage);
    }

    public final int hashCode() {
        return (this.errorCode * 31) + this.errorMessage.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkPreviewError(errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.errorMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LinkPreviewError(int i, String str) {
        this.errorCode = i;
        this.errorMessage = str;
    }
}
