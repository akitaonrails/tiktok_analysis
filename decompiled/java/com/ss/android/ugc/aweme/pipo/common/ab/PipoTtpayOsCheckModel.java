package com.ss.android.ugc.aweme.pipo.common.ab;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PipoTtpayOsCheckModel {

    @C09CT("android_sdk_version")
    public final Integer androidSdkVersion;

    public PipoTtpayOsCheckModel() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PipoTtpayOsCheckModel) && Intrinsics.LJFF(this.androidSdkVersion, ((PipoTtpayOsCheckModel) obj).androidSdkVersion);
    }

    public final int hashCode() {
        Integer num = this.androidSdkVersion;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoTtpayOsCheckModel(androidSdkVersion=");
        sbLIZ.append(this.androidSdkVersion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PipoTtpayOsCheckModel(Integer num) {
        this.androidSdkVersion = num;
    }
}
