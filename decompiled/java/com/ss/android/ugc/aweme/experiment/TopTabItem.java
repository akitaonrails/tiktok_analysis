package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TopTabItem {

    @C09CT("activity")
    public final TopActivityTabConfig activityConfig;

    @C09CT("ui")
    public final TopTabAppearance appearance;

    @C09CT("filter_rules")
    public final Map<String, Boolean> filterRules;

    @C09CT("left_entrance")
    public final Entrance leftEntrance;

    @C09CT("right_entrance")
    public final Entrance rightEntrance;

    @C09CT("top_tab_key")
    public final String topTabKey;

    @C09CT("tracker")
    public final TabTrackerInfo trackerInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopTabItem)) {
            return false;
        }
        TopTabItem topTabItem = (TopTabItem) obj;
        return Intrinsics.LJFF(this.topTabKey, topTabItem.topTabKey) && Intrinsics.LJFF(this.leftEntrance, topTabItem.leftEntrance) && Intrinsics.LJFF(this.rightEntrance, topTabItem.rightEntrance) && Intrinsics.LJFF(this.filterRules, topTabItem.filterRules) && Intrinsics.LJFF(this.appearance, topTabItem.appearance) && Intrinsics.LJFF(this.trackerInfo, topTabItem.trackerInfo) && Intrinsics.LJFF(this.activityConfig, topTabItem.activityConfig);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopTabItem(topTabKey=");
        sbLIZ.append(this.topTabKey);
        sbLIZ.append(", leftEntrance=");
        sbLIZ.append(this.leftEntrance);
        sbLIZ.append(", rightEntrance=");
        sbLIZ.append(this.rightEntrance);
        sbLIZ.append(", filterRules=");
        sbLIZ.append(this.filterRules);
        sbLIZ.append(", appearance=");
        sbLIZ.append(this.appearance);
        sbLIZ.append(", trackerInfo=");
        sbLIZ.append(this.trackerInfo);
        sbLIZ.append(", activityConfig=");
        sbLIZ.append(this.activityConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TopTabItem(String str, Entrance entrance, Entrance entrance2, Map<String, Boolean> map, TopTabAppearance topTabAppearance, TabTrackerInfo tabTrackerInfo, TopActivityTabConfig topActivityTabConfig) {
        this.topTabKey = str;
        this.leftEntrance = entrance;
        this.rightEntrance = entrance2;
        this.filterRules = map;
        this.appearance = topTabAppearance;
        this.trackerInfo = tabTrackerInfo;
        this.activityConfig = topActivityTabConfig;
    }
}
