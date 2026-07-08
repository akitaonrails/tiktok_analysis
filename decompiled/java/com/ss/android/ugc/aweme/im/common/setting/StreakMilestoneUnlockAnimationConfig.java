package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakMilestoneUnlockAnimationConfig {

    @C09CT("cdn_prefix")
    public final String cdnPrefix;

    @C09CT("unlock_animation_config")
    public final List<StreakMilestoneUnlockAnimationElement> elementList;

    @C09CT("fake_milestone_level_array")
    public final List<Integer> fakeMilestoneLevelArray;

    public StreakMilestoneUnlockAnimationConfig() {
        this(null, null, null, 7, null);
    }

    public StreakMilestoneUnlockAnimationConfig(List<Integer> list, String str, List<StreakMilestoneUnlockAnimationElement> list2) {
        this.fakeMilestoneLevelArray = list;
        this.cdnPrefix = str;
        this.elementList = list2;
    }

    public StreakMilestoneUnlockAnimationConfig(List list, String str, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
