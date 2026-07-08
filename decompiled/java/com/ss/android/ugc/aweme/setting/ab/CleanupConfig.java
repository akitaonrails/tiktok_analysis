package com.ss.android.ugc.aweme.setting.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class CleanupConfig {

    @C09CT("enable_memory_leak_fix")
    public final boolean enableMemLeakFix;

    @C09CT("enable_view_release")
    public final boolean enableViewRelease;

    public CleanupConfig() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CleanupConfig)) {
            return false;
        }
        CleanupConfig cleanupConfig = (CleanupConfig) obj;
        return this.enableViewRelease == cleanupConfig.enableViewRelease && this.enableMemLeakFix == cleanupConfig.enableMemLeakFix;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enableViewRelease) * 31) + C786410Ut5.Z2(this.enableMemLeakFix);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CleanupConfig(enableViewRelease=");
        sbLIZ.append(this.enableViewRelease);
        sbLIZ.append(", enableMemLeakFix=");
        sbLIZ.append(this.enableMemLeakFix);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CleanupConfig(boolean z, boolean z2) {
        this.enableViewRelease = z;
        this.enableMemLeakFix = z2;
    }
}
