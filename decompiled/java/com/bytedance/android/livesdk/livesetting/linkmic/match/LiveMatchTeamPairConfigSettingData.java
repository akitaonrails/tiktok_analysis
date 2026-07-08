package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchTeamPairConfigSettingData {
    public static final TypeAdapter ADAPTER = new LiveMatchTeamPairConfigSettingData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("team_pair_invite_type_allow_list")
    public List<Integer> inviteTypeWhiteList;

    @C09CT("team_pair_match_fallback_waiting_time")
    public long inviteeFallbackTime;

    @C09CT("team_pair_invitee_side_waiting_time")
    public long inviteeWaitingTime;

    @C09CT("team_pair_inviter_side_waiting_time")
    public long inviterWaitingTime;

    public LiveMatchTeamPairConfigSettingData() {
        this(300L, 60L, 30L, C1697810uHb.LJIIJJI(0, 2, 3, 4));
    }

    public LiveMatchTeamPairConfigSettingData(long j, long j2, long j3, List<Integer> list) {
        this.inviterWaitingTime = j;
        this.inviteeWaitingTime = j2;
        this.inviteeFallbackTime = j3;
        this.inviteTypeWhiteList = list;
    }
}
