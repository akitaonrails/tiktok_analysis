package com.ss.android.ugc.aweme.lemon.profile;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class L8ContentSyncLocalSkipConfig {

    @C09CT("battery_percent")
    public final Float batteryPercent;

    @C09CT("biz_click_count_min")
    public final Integer bizClickCountMin;

    @C09CT("biz_show_count_min")
    public final Integer bizShowCountMin;

    @C09CT("condition_type")
    public final String conditionType;

    @C09CT("enable_local_skip")
    public final Boolean enable;

    @C09CT("enable_skip_by_biz_portrait")
    public final Boolean enableSkipByBizPortrait;

    @C09CT("skip_count")
    public final Integer skipCountLimit;

    @C09CT("skip_har_status")
    public final List<Integer> skipHarStatus;

    public L8ContentSyncLocalSkipConfig(Boolean bool, String str, Integer num, Float f, List<Integer> list, Boolean bool2, Integer num2, Integer num3) {
        this.enable = bool;
        this.conditionType = str;
        this.skipCountLimit = num;
        this.batteryPercent = f;
        this.skipHarStatus = list;
        this.enableSkipByBizPortrait = bool2;
        this.bizShowCountMin = num2;
        this.bizClickCountMin = num3;
    }
}
