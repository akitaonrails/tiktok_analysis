package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetValue {

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("conversation_type")
    public final int conversationType;

    @C09CT("exp_for_level")
    public final List<Integer> expForLevel;

    @C09CT("experience_points")
    public final Integer experiencePoints;

    @C09CT("fe_common_data")
    public final String feCommonData;

    @C09CT("fe_extra_data")
    public final String feExtraData;

    @C09CT("hatching_timestamp")
    public final long hatchingTimestamp;

    @C09CT("inviter_uid")
    public final Long inviterUid;

    @C09CT("name")
    public final String name;

    @C09CT("server_data_version")
    public final String serverDataVersion;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("substatus")
    public final int subStatus;

    @C09CT("tasks")
    public final Map<String, StreakPetTaskValue> tasks;

    public StreakPetValue() {
        this("", 0, 0, 0, null, null, null, null, null, 0L, "", "", "");
    }

    public StreakPetValue(String str, int i, int i2, int i3, Long l, Integer num, List<Integer> list, String str2, Map<String, StreakPetTaskValue> map, long j, String str3, String str4, String str5) {
        this.conversationId = str;
        this.conversationType = i;
        this.status = i2;
        this.subStatus = i3;
        this.inviterUid = l;
        this.experiencePoints = num;
        this.expForLevel = list;
        this.name = str2;
        this.tasks = map;
        this.hatchingTimestamp = j;
        this.feCommonData = str3;
        this.feExtraData = str4;
        this.serverDataVersion = str5;
    }
}
