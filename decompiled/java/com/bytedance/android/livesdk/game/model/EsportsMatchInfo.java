package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class EsportsMatchInfo {

    @C09CT("end_time")
    public long endTime;

    @C09CT("has_guessing")
    public boolean hasGuessing;

    @C09CT("hide_score")
    public boolean hideScore;

    @C09CT("match_status")
    public int matchStatus;

    @C09CT("real_start_time")
    public long realStartTime;

    @C09CT("reserve_status")
    public int reserveStatus;

    @C09CT("score_is_available")
    public boolean scoreIsAvailable;

    @C09CT("start_time")
    public long startTime;

    @C09CT("total_participants")
    public long totalParticipants;

    @C09CT("match_id")
    public String matchId = "";

    @C09CT("match_name")
    public String matchName = "";

    @C09CT("participants")
    public List<EsportsParticipant> participants = new ArrayList();

    @C09CT("official_living_room_id")
    public String officialLivingRoomId = "";

    @C09CT("official_anchor_uid")
    public String officialAnchorUid = "";

    @C09CT("live_event_id")
    public String liveEventId = "";
}
