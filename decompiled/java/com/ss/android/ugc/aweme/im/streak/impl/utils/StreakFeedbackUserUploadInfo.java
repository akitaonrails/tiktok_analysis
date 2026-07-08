package com.ss.android.ugc.aweme.im.streak.impl.utils;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakFeedbackUserUploadInfo {

    @C09CT("cmd_type")
    public final int cmdType;

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("cur_uid")
    public final String curUid;

    @C09CT("extra_info")
    public final String extraInfo;

    @C09CT("has_streak_story_posted")
    public final Boolean hasStreakStoryPosted;

    @C09CT("is_fake_data")
    public final boolean isFakeData;

    @C09CT("is_muf")
    public final int isMuf;

    @C09CT("message_id")
    public final long messageId;

    @C09CT("not_accept_reasons")
    public final String notAcceptReasons;

    @C09CT("recent_streak_cmd_messages")
    public final List<StreakCmdMessageUploadInfo> recentStreakCmdMessage;

    @C09CT("remain_restore_cnt")
    public final int remainRestoreCnt;

    @C09CT("restore_available_time")
    public final long restoreAvailableTime;

    @C09CT("streak_days")
    public final int streakDays;

    @C09CT("streak_level")
    public final int streakLevel;

    @C09CT("streak_status")
    public final int streakStatus;

    @C09CT("streak_unlock_anim_info")
    public final StreakUnlockAnimInfo streakUnlockAnimInfo;

    @C09CT("timezone")
    public final String timezone;

    @C09CT("users")
    public final String usersStr;

    @C09CT("data_version")
    public final String version;

    public StreakFeedbackUserUploadInfo() {
        this(null, null, 0, 0, null, null, 0, null, 0, null, null, 0L, 0L, false, 0L, 0, 0, null, null, null, 1048575, null);
    }

    public StreakFeedbackUserUploadInfo(String str, String str2, int i, int i2, String str3, String str4, int i3, String str5, int i4, StreakUnlockAnimInfo streakUnlockAnimInfo, Boolean bool, long j, long j2, boolean z, long j3, int i5, int i6, List<StreakCmdMessageUploadInfo> list, String str6, String str7) {
        this.conversationId = str;
        this.timezone = str2;
        this.cmdType = i;
        this.streakStatus = i2;
        this.curUid = str3;
        this.usersStr = str4;
        this.streakDays = i3;
        this.notAcceptReasons = str5;
        this.streakLevel = i4;
        this.streakUnlockAnimInfo = streakUnlockAnimInfo;
        this.hasStreakStoryPosted = bool;
        this.createTime = j;
        this.messageId = j2;
        this.isFakeData = z;
        this.restoreAvailableTime = j3;
        this.remainRestoreCnt = i5;
        this.isMuf = i6;
        this.recentStreakCmdMessage = list;
        this.version = str6;
        this.extraInfo = str7;
    }

    public StreakFeedbackUserUploadInfo(String str, String str2, int i, int i2, String str3, String str4, int i3, String str5, int i4, StreakUnlockAnimInfo streakUnlockAnimInfo, Boolean bool, long j, long j2, boolean z, long j3, int i5, int i6, List list, String str6, String str7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? 0 : i, (i7 & 8) != 0 ? -1 : i2, (i7 & 16) != 0 ? "" : str3, (i7 & 32) != 0 ? "" : str4, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? "" : str5, (i7 & 256) != 0 ? 0 : i4, (i7 & 512) != 0 ? null : streakUnlockAnimInfo, (i7 & 1024) == 0 ? bool : null, (i7 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0L : j, (i7 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0L : j2, (i7 & 8192) != 0 ? false : z, (i7 & 16384) == 0 ? j3 : 0L, (32768 & i7) != 0 ? 0 : i5, (65536 & i7) != 0 ? 0 : i6, (131072 & i7) != 0 ? C13BV.INSTANCE : list, (262144 & i7) != 0 ? "" : str6, (i7 & 524288) == 0 ? str7 : "");
    }
}
