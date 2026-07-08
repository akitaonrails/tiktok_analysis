package com.ss.android.ugc.feed.platform.cardinsert.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class CardShowInfo {

    @C09CT("content_type")
    public int contentType;

    @C09CT("is_avoid_backup_frequency")
    public boolean isAvoidBackupFrequency;

    @C09CT("is_uid_frequency")
    public boolean isUidFrequency;

    @C09CT("negative_dislike_max_times")
    public int negativeDislikeMaxTimes;

    @C09CT("negative_skip_max_times")
    public int negativeSkipMaxTime;

    @C09CT("negative_cooldown_time_interval")
    public int negativeTimeInterval;

    @C09CT("frequency_rule_type")
    public int ruleType;

    @C09CT("time_interval")
    public int timeInterval;

    @C09CT("timing_list")
    public List<String> timingList;

    @C09CT("card_id")
    public int cardId = -1;

    @C09CT("card_type")
    public int cardType = -1;

    @C09CT("flow_index")
    public int flowIndex = -1;

    @C09CT("time_interval_max_show_times")
    public int intervalMaxShowCount = -1;

    @C09CT("flow_interval")
    public int flowInterval = -1;

    @C09CT("business_type")
    public String businessType = "unknown";
    public final boolean LIZ = true;
}
