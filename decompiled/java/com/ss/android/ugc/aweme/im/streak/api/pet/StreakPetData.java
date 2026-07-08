package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetData {

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("conversation_type")
    public final int conversationType;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("exp_for_level")
    public final List<Integer> expForLevel;

    @C09CT("experience_points")
    public final int experiencePoints;

    @C09CT("experiment_flags")
    public final Map<String, String> experimentMap;

    @C09CT("fe_common_data")
    public final String feCommonData;

    @C09CT("fe_extra_data")
    public final String feExtraData;

    @C09CT("hatching_timestamp")
    public final long hatchingTimestampInSeconds;

    @C09CT("inviter_uid")
    public final long inviterUid;

    @C09CT("is_egg_hidden")
    public final boolean isEggHidden;

    @C09CT("is_hidden")
    public final boolean isHidden;

    @C09CT("name")
    public final String name;

    @C09CT("pet_fe_user_data")
    public final String petFeUserData;

    @C09CT("server_data_version")
    public final String serverDataVersion;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("streak_pet_anim_state")
    public final String streakPetAnimState;

    @C09CT("sub_status")
    public final int subStatus;

    @C09CT("tasks")
    public final Map<String, StreakPetTaskData> tasks;

    public StreakPetData() {
        this(null, 0, 0, 0L, 0, null, null, null, false, null, 0L, 0L, 0, false, null, null, null, null, null, 524287, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakPetData)) {
            return false;
        }
        StreakPetData streakPetData = (StreakPetData) obj;
        return Intrinsics.LJFF(this.conversationId, streakPetData.conversationId) && this.conversationType == streakPetData.conversationType && this.status == streakPetData.status && this.inviterUid == streakPetData.inviterUid && this.experiencePoints == streakPetData.experiencePoints && Intrinsics.LJFF(this.expForLevel, streakPetData.expForLevel) && Intrinsics.LJFF(this.name, streakPetData.name) && Intrinsics.LJFF(this.tasks, streakPetData.tasks) && this.isHidden == streakPetData.isHidden && Intrinsics.LJFF(this.streakPetAnimState, streakPetData.streakPetAnimState) && this.createTime == streakPetData.createTime && this.hatchingTimestampInSeconds == streakPetData.hatchingTimestampInSeconds && this.subStatus == streakPetData.subStatus && this.isEggHidden == streakPetData.isEggHidden && Intrinsics.LJFF(this.feCommonData, streakPetData.feCommonData) && Intrinsics.LJFF(this.feExtraData, streakPetData.feExtraData) && Intrinsics.LJFF(this.serverDataVersion, streakPetData.serverDataVersion) && Intrinsics.LJFF(this.petFeUserData, streakPetData.petFeUserData) && Intrinsics.LJFF(this.experimentMap, streakPetData.experimentMap);
    }

    public final String toString() {
        return "StreakPetData(conversationId=" + this.conversationId + ", conversationType=" + this.conversationType + ", status=" + this.status + ", inviterUid=" + this.inviterUid + ", experiencePoints=" + this.experiencePoints + ", expForLevel=" + this.expForLevel + ", name=" + this.name + ", tasks=" + this.tasks + ", isHidden=" + this.isHidden + ", streakPetAnimState=" + this.streakPetAnimState + ", createTime=" + this.createTime + ", hatchingTimestampInSeconds=" + this.hatchingTimestampInSeconds + ", subStatus=" + this.subStatus + ", isEggHidden=" + this.isEggHidden + ", feCommonData=" + this.feCommonData + ", feExtraData=" + this.feExtraData + ", serverDataVersion=" + this.serverDataVersion + ", petFeUserData=" + this.petFeUserData + ", experimentMap=" + this.experimentMap + ')';
    }

    public static StreakPetData LIZ(StreakPetData streakPetData, boolean z, String str, boolean z2, String str2, Map map, int i) {
        String str3;
        int i2;
        int i3;
        long j;
        int i4;
        List<Integer> list;
        String str4;
        Map<String, StreakPetTaskData> map2;
        long j2;
        long j3;
        int i5;
        String str5;
        String str6;
        String str7;
        boolean z3 = z;
        Map map3 = map;
        String str8 = str2;
        boolean z4 = z2;
        String str9 = str;
        if ((i & 1) != 0) {
            str3 = streakPetData.conversationId;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            i2 = streakPetData.conversationType;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            i3 = streakPetData.status;
        } else {
            i3 = 0;
        }
        if ((i & 8) != 0) {
            j = streakPetData.inviterUid;
        } else {
            j = 0;
        }
        if ((i & 16) != 0) {
            i4 = streakPetData.experiencePoints;
        } else {
            i4 = 0;
        }
        if ((i & 32) != 0) {
            list = streakPetData.expForLevel;
        } else {
            list = null;
        }
        if ((i & 64) != 0) {
            str4 = streakPetData.name;
        } else {
            str4 = null;
        }
        if ((i & 128) != 0) {
            map2 = streakPetData.tasks;
        } else {
            map2 = null;
        }
        if ((i & 256) != 0) {
            z3 = streakPetData.isHidden;
        }
        if ((i & 512) != 0) {
            str9 = streakPetData.streakPetAnimState;
        }
        if ((i & 1024) != 0) {
            j2 = streakPetData.createTime;
        } else {
            j2 = 0;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j3 = streakPetData.hatchingTimestampInSeconds;
        } else {
            j3 = 0;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i5 = streakPetData.subStatus;
        } else {
            i5 = 0;
        }
        if ((i & 8192) != 0) {
            z4 = streakPetData.isEggHidden;
        }
        if ((i & 16384) != 0) {
            str5 = streakPetData.feCommonData;
        } else {
            str5 = null;
        }
        if ((32768 & i) != 0) {
            str6 = streakPetData.feExtraData;
        } else {
            str6 = null;
        }
        if ((65536 & i) != 0) {
            str7 = streakPetData.serverDataVersion;
        } else {
            str7 = null;
        }
        if ((131072 & i) != 0) {
            str8 = streakPetData.petFeUserData;
        }
        if ((i & 262144) != 0) {
            map3 = streakPetData.experimentMap;
        }
        streakPetData.getClass();
        String str10 = str8;
        Map map4 = map3;
        boolean z5 = z3;
        return new StreakPetData(str3, i2, i3, j, i4, list, str4, map2, z5, str9, j2, j3, i5, z4, str5, str6, str7, str10, map4);
    }

    public StreakPetData(String str, int i, int i2, long j, int i3, List<Integer> list, String str2, Map<String, StreakPetTaskData> map, boolean z, String str3, long j2, long j3, int i4, boolean z2, String str4, String str5, String str6, String str7, Map<String, String> map2) {
        this.conversationId = str;
        this.conversationType = i;
        this.status = i2;
        this.inviterUid = j;
        this.experiencePoints = i3;
        this.expForLevel = list;
        this.name = str2;
        this.tasks = map;
        this.isHidden = z;
        this.streakPetAnimState = str3;
        this.createTime = j2;
        this.hatchingTimestampInSeconds = j3;
        this.subStatus = i4;
        this.isEggHidden = z2;
        this.feCommonData = str4;
        this.feExtraData = str5;
        this.serverDataVersion = str6;
        this.petFeUserData = str7;
        this.experimentMap = map2;
    }

    public StreakPetData(String str, int i, int i2, long j, int i3, List list, String str2, Map map, boolean z, String str3, long j2, long j3, int i4, boolean z2, String str4, String str5, String str6, String str7, Map map2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? -1L : j, (i5 & 16) != 0 ? -1 : i3, (i5 & 32) != 0 ? C13BV.INSTANCE : list, (i5 & 64) != 0 ? "" : str2, (i5 & 128) != 0 ? C2097608Jq.LJ() : map, (i5 & 256) != 0 ? false : z, (i5 & 512) != 0 ? "" : str3, (i5 & 1024) != 0 ? 0L : j2, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? j3 : 0L, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i4, (i5 & 8192) != 0 ? false : z2, (i5 & 16384) != 0 ? "" : str4, (32768 & i5) != 0 ? "" : str5, (65536 & i5) != 0 ? "" : str6, (131072 & i5) == 0 ? str7 : "", (i5 & 262144) != 0 ? C2097608Jq.LJ() : map2);
    }
}
