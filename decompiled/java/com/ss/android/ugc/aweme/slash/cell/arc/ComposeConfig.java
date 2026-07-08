package com.ss.android.ugc.aweme.slash.cell.arc;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ComposeConfig {

    @C09CT("cells")
    public final List<SlashCellModel> cells;

    @C09CT("track_config")
    public final List<SlashTrackConfig> trackConfig;

    public ComposeConfig() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeConfig)) {
            return false;
        }
        ComposeConfig composeConfig = (ComposeConfig) obj;
        return Intrinsics.LJFF(this.cells, composeConfig.cells) && Intrinsics.LJFF(this.trackConfig, composeConfig.trackConfig);
    }

    public final int hashCode() {
        List<SlashCellModel> list = this.cells;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SlashTrackConfig> list2 = this.trackConfig;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComposeConfig(cells=");
        sbLIZ.append(this.cells);
        sbLIZ.append(", trackConfig=");
        sbLIZ.append(this.trackConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ComposeConfig(List<SlashCellModel> list, List<SlashTrackConfig> list2) {
        this.cells = list;
        this.trackConfig = list2;
    }
}
