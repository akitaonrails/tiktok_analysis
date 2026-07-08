package com.ss.android.ugc.aweme.explore.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class ExploreFeedCellUiOptConfig {

    @C09CT("enable_report_opt")
    public final boolean enableReportOpt;

    @C09CT("enable_view_cache")
    public final boolean enableViewCache;

    public ExploreFeedCellUiOptConfig() {
        this(false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreFeedCellUiOptConfig)) {
            return false;
        }
        ExploreFeedCellUiOptConfig exploreFeedCellUiOptConfig = (ExploreFeedCellUiOptConfig) obj;
        return this.enableViewCache == exploreFeedCellUiOptConfig.enableViewCache && this.enableReportOpt == exploreFeedCellUiOptConfig.enableReportOpt;
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.enableViewCache) * 31) + C786410Ut5.Z2(this.enableReportOpt);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreFeedCellUiOptConfig(enableViewCache=");
        sbLIZ.append(this.enableViewCache);
        sbLIZ.append(", enableReportOpt=");
        sbLIZ.append(this.enableReportOpt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreFeedCellUiOptConfig(boolean z, boolean z2) {
        this.enableViewCache = z;
        this.enableReportOpt = z2;
    }
}
