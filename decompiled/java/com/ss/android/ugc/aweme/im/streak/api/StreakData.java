package com.ss.android.ugc.aweme.im.streak.api;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakData {

    @C09CT("active_before")
    public final long activeBefore;

    @C09CT("active_start")
    public final long activeStart;

    @C09CT("cmd_type")
    public final Integer cmdType;

    @C09CT("conv_id")
    public final String convId;

    @C09CT("conv_type")
    public final int convType;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("day_begin_array")
    public final List<Long> dayBeginArray;

    @C09CT("end_at")
    public final long endAt;

    @C09CT("streak_level")
    public final Integer level;

    @C09CT("log_id")
    public final String logId;

    @C09CT("msg_scene")
    public final String msgScene;

    @C09CT("remain_restore_cnt")
    public final int remainRestoreCnt;

    @C09CT("remind_at")
    public final long remindAt;

    @C09CT("restorable_before")
    public final long restoreAvailableTime;

    @C09CT("unique")
    public final String serverMsgId;

    @C09CT("source")
    public final String source;

    @C09CT("streak")
    public final int streak;

    @C09CT("time_zone")
    public final String timeZoneId;

    @C09CT("total_restore_cnt_this_window")
    public final int totalRestoreCntThisWindow;

    @C09CT("users")
    public final List<UserStreakInfo> userStreak;

    @C09CT("uuid")
    public final String uuid;

    @C09CT("version")
    public final String version;

    public final StreakData copy(int i, String str, String str2, String str3, long j, long j2, long j3, long j4, int i2, List<UserStreakInfo> list, long j5, int i3, int i4, Integer num, Integer num2, List<Long> list2, long j6, String str4, String str5, String str6, String str7, String str8) {
        return new StreakData(i, str, str2, str3, j, j2, j3, j4, i2, list, j5, i3, i4, num, num2, list2, j6, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakData)) {
            return false;
        }
        StreakData streakData = (StreakData) obj;
        return this.convType == streakData.convType && Intrinsics.LJFF(this.convId, streakData.convId) && Intrinsics.LJFF(this.serverMsgId, streakData.serverMsgId) && Intrinsics.LJFF(this.timeZoneId, streakData.timeZoneId) && this.activeStart == streakData.activeStart && this.activeBefore == streakData.activeBefore && this.endAt == streakData.endAt && this.remindAt == streakData.remindAt && this.streak == streakData.streak && Intrinsics.LJFF(this.userStreak, streakData.userStreak) && this.restoreAvailableTime == streakData.restoreAvailableTime && this.remainRestoreCnt == streakData.remainRestoreCnt && this.totalRestoreCntThisWindow == streakData.totalRestoreCntThisWindow && Intrinsics.LJFF(this.cmdType, streakData.cmdType) && Intrinsics.LJFF(this.level, streakData.level) && Intrinsics.LJFF(this.dayBeginArray, streakData.dayBeginArray) && this.createTime == streakData.createTime && Intrinsics.LJFF(this.logId, streakData.logId) && Intrinsics.LJFF(this.uuid, streakData.uuid) && Intrinsics.LJFF(this.version, streakData.version) && Intrinsics.LJFF(this.source, streakData.source) && Intrinsics.LJFF(this.msgScene, streakData.msgScene);
    }

    public String toString() {
        return "StreakData(convType=" + this.convType + ", convId=" + this.convId + ", serverMsgId=" + this.serverMsgId + ", timeZoneId=" + this.timeZoneId + ", activeStart=" + this.activeStart + ", activeBefore=" + this.activeBefore + ", endAt=" + this.endAt + ", remindAt=" + this.remindAt + ", streak=" + this.streak + ", userStreak=" + this.userStreak + ", restoreAvailableTime=" + this.restoreAvailableTime + ", remainRestoreCnt=" + this.remainRestoreCnt + ", totalRestoreCntThisWindow=" + this.totalRestoreCntThisWindow + ", cmdType=" + this.cmdType + ", level=" + this.level + ", dayBeginArray=" + this.dayBeginArray + ", createTime=" + this.createTime + ", logId=" + this.logId + ", uuid=" + this.uuid + ", version=" + this.version + ", source=" + this.source + ", msgScene=" + this.msgScene + ')';
    }

    public StreakData(int i, String str, String str2, String str3, long j, long j2, long j3, long j4, int i2, List<UserStreakInfo> list, long j5, int i3, int i4, Integer num, Integer num2, List<Long> list2, long j6, String str4, String str5, String str6, String str7, String str8) {
        this.convType = i;
        this.convId = str;
        this.serverMsgId = str2;
        this.timeZoneId = str3;
        this.activeStart = j;
        this.activeBefore = j2;
        this.endAt = j3;
        this.remindAt = j4;
        this.streak = i2;
        this.userStreak = list;
        this.restoreAvailableTime = j5;
        this.remainRestoreCnt = i3;
        this.totalRestoreCntThisWindow = i4;
        this.cmdType = num;
        this.level = num2;
        this.dayBeginArray = list2;
        this.createTime = j6;
        this.logId = str4;
        this.uuid = str5;
        this.version = str6;
        this.source = str7;
        this.msgScene = str8;
    }
}
