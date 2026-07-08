package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakMilestoneUnlockAnimationElement {

    @C09CT("channel")
    public final String channel;

    @C09CT("level_array")
    public final List<Integer> levelArray;

    @C09CT("num_data")
    public final Map<String, String> numData;

    @C09CT("path")
    public final String path;

    public StreakMilestoneUnlockAnimationElement() {
        this(null, null, null, null, 15, null);
    }

    public StreakMilestoneUnlockAnimationElement(List<Integer> list, String str, String str2, Map<String, String> map) {
        this.levelArray = list;
        this.channel = str;
        this.path = str2;
        this.numData = map;
    }

    public StreakMilestoneUnlockAnimationElement(List list, String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? C2097608Jq.LJ() : map);
    }
}
