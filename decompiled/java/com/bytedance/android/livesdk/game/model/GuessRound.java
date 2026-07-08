package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuessRound {

    @C09CT("end_time")
    public long endTime;

    @C09CT("guess_round_stats")
    public GuessRoundStats guessRoundStats;

    @C09CT("guess_status")
    public int guessStatus;

    @C09CT("is_auto_pin")
    public boolean isAutoPin;

    @C09CT("live_id")
    public long liveId;

    @C09CT("server_time")
    public long serverTime;

    @C09CT("settle_finish_time")
    public long settleFinishTime;

    @C09CT("start_time")
    public long startTime;

    @C09CT("title")
    public GuessText title;

    @C09CT("round_id_str")
    public String roundIdStr = "";

    @C09CT("guess_options")
    public List<GuessOptions> guessOptions = new ArrayList();

    @C09CT("win_option")
    public String winOption = "";

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("corrected_option")
    public String correctedOption = "";

    @C09CT("anchor_id")
    public String anchorId = "";

    @C09CT("creator_id")
    public String creatorId = "";

    @C09CT("operator_id")
    public String operatorId = "";

    @C09CT("operator_name")
    public String operatorName = "";
}
