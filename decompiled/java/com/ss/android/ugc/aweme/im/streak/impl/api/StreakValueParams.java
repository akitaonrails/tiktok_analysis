package com.ss.android.ugc.aweme.im.streak.impl.api;

import X.C09CT;
import com.ss.android.ugc.aweme.im.streak.api.UserStreakInfo;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakValueParams {

    @C09CT("active_before")
    public final Long activeBefore;

    @C09CT("active_start")
    public final Long activeStart;

    @C09CT("cmd_type")
    public final Integer cmdType;

    @C09CT("conversation_id")
    public final String convId;

    @C09CT("conversation_type")
    public final Integer convType;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("day_begin_list")
    public final List<Long> dayBeginArray;

    @C09CT("end_at")
    public final Long endAt;

    @C09CT("streak_level")
    public final Integer level;

    @C09CT("log_id")
    public final String logId;

    @C09CT("msg_scene")
    public final String msgScene;

    @C09CT("remain_restore_cnt")
    public final Integer remainRestoreCnt;

    @C09CT("remind_at")
    public final Long remindAt;

    @C09CT("restorable_before")
    public final Long restoreAvailableTime;

    @C09CT("unique")
    public final String serverMsgId;

    @C09CT("source")
    public final String source;

    @C09CT("streak_counter")
    public final Integer streak;

    @C09CT("streak_start")
    public final Long streakStart;

    @C09CT("streak_timezone")
    public final String timeZoneId;

    @C09CT("total_restore_cnt_this_window")
    public final Integer totalRestoreCntThisWindow;

    @C09CT("users")
    public final List<UserStreakInfo> userStreak;

    @C09CT("uuid")
    public final String uuid;

    @C09CT("version_source")
    public final String version;

    public StreakValueParams(Integer num, String str, String str2, String str3, Long l, Long l2, Long l3, Long l4, Integer num2, List<UserStreakInfo> list, Long l5, Integer num3, Integer num4, Integer num5, Integer num6, List<Long> list2, Long l6, String str4, String str5, String str6, String str7, String str8, Long l7) {
        this.convType = num;
        this.convId = str;
        this.serverMsgId = str2;
        this.timeZoneId = str3;
        this.activeStart = l;
        this.activeBefore = l2;
        this.endAt = l3;
        this.remindAt = l4;
        this.streak = num2;
        this.userStreak = list;
        this.restoreAvailableTime = l5;
        this.remainRestoreCnt = num3;
        this.totalRestoreCntThisWindow = num4;
        this.cmdType = num5;
        this.level = num6;
        this.dayBeginArray = list2;
        this.createTime = l6;
        this.logId = str4;
        this.uuid = str5;
        this.version = str6;
        this.source = str7;
        this.msgScene = str8;
        this.streakStart = l7;
    }
}
