package com.ss.android.ugc.aweme.slash.component.navigation;

import X.C09CT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ElevatorNaviGroup {
    public List<String> LIZ;

    @C09CT("group_level")
    public final Integer groupLevel;

    @C09CT("instance_id_list")
    public final List<String> instanceIdList;

    @C09CT("tab_name")
    public final String tabName;

    @C09CT("tab_track_params")
    public final Map<String, String> tabTrackParams;

    public ElevatorNaviGroup() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElevatorNaviGroup)) {
            return false;
        }
        ElevatorNaviGroup elevatorNaviGroup = (ElevatorNaviGroup) obj;
        return Intrinsics.LJFF(this.groupLevel, elevatorNaviGroup.groupLevel) && Intrinsics.LJFF(this.tabName, elevatorNaviGroup.tabName) && Intrinsics.LJFF(this.instanceIdList, elevatorNaviGroup.instanceIdList) && Intrinsics.LJFF(this.tabTrackParams, elevatorNaviGroup.tabTrackParams) && Intrinsics.LJFF(this.LIZ, elevatorNaviGroup.LIZ);
    }

    public ElevatorNaviGroup(Integer num, String str, List<String> list, Map<String, String> map, List<String> list2) {
        this.groupLevel = num;
        this.tabName = str;
        this.instanceIdList = list;
        this.tabTrackParams = map;
        this.LIZ = list2;
    }
}
