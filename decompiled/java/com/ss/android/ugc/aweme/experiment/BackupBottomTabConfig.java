package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class BackupBottomTabConfig {

    @C09CT("expected_to_cover")
    public final String expectedToCover;

    @C09CT("top_tab")
    public final String topTab;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackupBottomTabConfig)) {
            return false;
        }
        BackupBottomTabConfig backupBottomTabConfig = (BackupBottomTabConfig) obj;
        return Intrinsics.LJFF(this.topTab, backupBottomTabConfig.topTab) && Intrinsics.LJFF(this.expectedToCover, backupBottomTabConfig.expectedToCover);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackupBottomTabConfig(topTab=");
        sbLIZ.append(this.topTab);
        sbLIZ.append(", expectedToCover=");
        sbLIZ.append(this.expectedToCover);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BackupBottomTabConfig(String str, String str2) {
        this.topTab = str;
        this.expectedToCover = str2;
    }
}
