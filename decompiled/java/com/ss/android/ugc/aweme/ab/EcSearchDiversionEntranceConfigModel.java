package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchDiversionEntranceConfigModel {

    @C09CT("continous_non_click_cooldown_minutes")
    public final int continousNonClickCooldownMinutes;

    @C09CT("continous_non_click_count")
    public final int continousNonClickCount;

    @C09CT("enable")
    public final int enable;

    @C09CT("enable_all")
    public final int enableAll;

    @C09CT("enter_from_filter")
    public final List<String> enterFromFilter;

    @C09CT("ignore_user_action_enable")
    public final int ignoreUserActionEnable;

    @C09CT("ignore_user_action_enter_from_filter")
    public final List<String> ignoreUserActionEnterFromFilter;

    @C09CT("rs_banner_exclusion_enable")
    public final int rsBannerExclusionEnable;

    @C09CT("show_window")
    public final List<ShowWindow> showWindow;

    public EcSearchDiversionEntranceConfigModel() {
        this(0, 0, null, 0, null, 0, null, 0, 0, 511, null);
    }

    public EcSearchDiversionEntranceConfigModel(int i, int i2, List<String> list, int i3, List<String> list2, int i4, List<ShowWindow> list3, int i5, int i6) {
        this.enableAll = i;
        this.enable = i2;
        this.enterFromFilter = list;
        this.ignoreUserActionEnable = i3;
        this.ignoreUserActionEnterFromFilter = list2;
        this.rsBannerExclusionEnable = i4;
        this.showWindow = list3;
        this.continousNonClickCount = i5;
        this.continousNonClickCooldownMinutes = i6;
    }

    public EcSearchDiversionEntranceConfigModel(int i, int i2, List list, int i3, List list2, int i4, List list3, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 1 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? C13BV.INSTANCE : list, (i7 & 8) != 0 ? 0 : i3, (i7 & 16) != 0 ? C13BV.INSTANCE : list2, (i7 & 32) != 0 ? 0 : i4, (i7 & 64) != 0 ? C13BV.INSTANCE : list3, (i7 & 128) != 0 ? 0 : i5, (i7 & 256) == 0 ? i6 : 0);
    }
}
