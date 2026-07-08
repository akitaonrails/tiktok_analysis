package com.ss.android.ugc.aweme.pipo.probe.core.infoupload;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ProbeUploadResponseData {

    @C09CT("factor")
    public final Number factor;

    public ProbeUploadResponseData() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProbeUploadResponseData) && Intrinsics.LJFF(this.factor, ((ProbeUploadResponseData) obj).factor);
    }

    public final int hashCode() {
        Number number = this.factor;
        if (number == null) {
            return 0;
        }
        return number.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProbeUploadResponseData(factor=");
        sbLIZ.append(this.factor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProbeUploadResponseData(Number number) {
        this.factor = number;
    }
}
