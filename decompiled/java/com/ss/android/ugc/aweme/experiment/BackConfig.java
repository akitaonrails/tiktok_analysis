package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class BackConfig {

    @C09CT("bottom_2tab")
    public final BackupBottomTabConfig bottom2Tab;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BackConfig) && Intrinsics.LJFF(this.bottom2Tab, ((BackConfig) obj).bottom2Tab);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackConfig(bottom2Tab=");
        sbLIZ.append(this.bottom2Tab);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BackConfig(BackupBottomTabConfig backupBottomTabConfig) {
        this.bottom2Tab = backupBottomTabConfig;
    }
}
