package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TabConfig {

    @C09CT("backup_config")
    public final BackConfig backupConfig;

    @C09CT("bottom_tab")
    public final Map<String, ArrayList<BottomTab>> bottomTab;

    @C09CT("expected_bottom_size")
    public final Integer expectedBottomSize;

    @C09CT("is_json_illegal")
    public Boolean isJsonIllegal;

    @C09CT("left_entrance")
    public final Entrance leftEntrance;

    @C09CT("right_entrance")
    public final Entrance rightEntrance;

    @C09CT("top_tab")
    public final TopTab topTab;

    @C09CT("trace_info")
    public final TraceInfo traceInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabConfig)) {
            return false;
        }
        TabConfig tabConfig = (TabConfig) obj;
        return Intrinsics.LJFF(this.isJsonIllegal, tabConfig.isJsonIllegal) && Intrinsics.LJFF(this.expectedBottomSize, tabConfig.expectedBottomSize) && Intrinsics.LJFF(this.leftEntrance, tabConfig.leftEntrance) && Intrinsics.LJFF(this.rightEntrance, tabConfig.rightEntrance) && Intrinsics.LJFF(this.bottomTab, tabConfig.bottomTab) && Intrinsics.LJFF(this.topTab, tabConfig.topTab) && Intrinsics.LJFF(this.backupConfig, tabConfig.backupConfig) && Intrinsics.LJFF(this.traceInfo, tabConfig.traceInfo);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabConfig(isJsonIllegal=");
        sbLIZ.append(this.isJsonIllegal);
        sbLIZ.append(", expectedBottomSize=");
        sbLIZ.append(this.expectedBottomSize);
        sbLIZ.append(", leftEntrance=");
        sbLIZ.append(this.leftEntrance);
        sbLIZ.append(", rightEntrance=");
        sbLIZ.append(this.rightEntrance);
        sbLIZ.append(", bottomTab=");
        sbLIZ.append(this.bottomTab);
        sbLIZ.append(", topTab=");
        sbLIZ.append(this.topTab);
        sbLIZ.append(", backupConfig=");
        sbLIZ.append(this.backupConfig);
        sbLIZ.append(", traceInfo=");
        sbLIZ.append(this.traceInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabConfig(Boolean bool, Integer num, Entrance entrance, Entrance entrance2, Map<String, ? extends ArrayList<BottomTab>> map, TopTab topTab, BackConfig backConfig, TraceInfo traceInfo) {
        this.isJsonIllegal = bool;
        this.expectedBottomSize = num;
        this.leftEntrance = entrance;
        this.rightEntrance = entrance2;
        this.bottomTab = map;
        this.topTab = topTab;
        this.backupConfig = backConfig;
        this.traceInfo = traceInfo;
    }
}
