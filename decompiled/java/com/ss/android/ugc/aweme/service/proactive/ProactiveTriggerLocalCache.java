package com.ss.android.ugc.aweme.service.proactive;

import X.C09CT;
import X.C13E8;
import X.EnumC20027813Xw;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class ProactiveTriggerLocalCache {

    @C09CT("all_login_trigger")
    public final Map<EnumC20027813Xw, C13E8<Long>> allLoginTriggerRecords;

    @C09CT("day_limit_login_panel")
    public final Integer dayLimitLoginPanel;

    @C09CT("download_records")
    public final C13E8<String> downloadRecords;

    @C09CT("is_first_time")
    public final Boolean isFirstTime;

    @C09CT("min_hours_interval_login_panel")
    public final Integer minHoursIntervalLoginPanel;

    @C09CT("user_vv")
    public final C13E8<Long> userVVRecords;

    public ProactiveTriggerLocalCache(Map<EnumC20027813Xw, C13E8<Long>> map, C13E8<Long> c13e8, Boolean bool, Integer num, Integer num2, C13E8<String> c13e82) {
        this.allLoginTriggerRecords = map;
        this.userVVRecords = c13e8;
        this.isFirstTime = bool;
        this.minHoursIntervalLoginPanel = num;
        this.dayLimitLoginPanel = num2;
        this.downloadRecords = c13e82;
    }
}
