package com.ss.android.ugc.aweme.im.streak.impl.utils;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetFeedbackUserUploadInfo {

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("exp_for_level")
    public final List<Integer> expForLevel;

    @C09CT("experience_points")
    public final int experiencePoints;

    @C09CT("hatching_timestamp")
    public final long hatchingTimestamp;

    @C09CT("inviter_uid")
    public final long inviterUid;

    @C09CT("is_egg_hidden")
    public final boolean isEggHidden;

    @C09CT("is_peer_hit_experiment")
    public final boolean isExpEnable;

    @C09CT("is_hidden")
    public final boolean isHidden;

    @C09CT("name")
    public final String name;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("streak_pet_anim_state")
    public final String streakPetAnimState;

    @C09CT("sub_status")
    public final int subStatus;

    public StreakPetFeedbackUserUploadInfo() {
        this(null, 0, 0L, 0, null, null, false, null, false, 0L, 0L, 0, false, 8191, null);
    }

    public StreakPetFeedbackUserUploadInfo(String str, int i, long j, int i2, List<Integer> list, String str2, boolean z, String str3, boolean z2, long j2, long j3, int i3, boolean z3) {
        this.conversationId = str;
        this.status = i;
        this.inviterUid = j;
        this.experiencePoints = i2;
        this.expForLevel = list;
        this.name = str2;
        this.isHidden = z;
        this.streakPetAnimState = str3;
        this.isExpEnable = z2;
        this.createTime = j2;
        this.hatchingTimestamp = j3;
        this.subStatus = i3;
        this.isEggHidden = z3;
    }

    public StreakPetFeedbackUserUploadInfo(String str, int i, long j, int i2, List list, String str2, boolean z, String str3, boolean z2, long j2, long j3, int i3, boolean z3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? -1L : j, (i4 & 8) != 0 ? -1 : i2, (i4 & 16) != 0 ? C13BV.INSTANCE : list, (i4 & 32) != 0 ? "" : str2, (i4 & 64) != 0 ? false : z, (i4 & 128) == 0 ? str3 : "", (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? 0L : j2, (i4 & 1024) == 0 ? j3 : 0L, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i3, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? z3 : false);
    }
}
