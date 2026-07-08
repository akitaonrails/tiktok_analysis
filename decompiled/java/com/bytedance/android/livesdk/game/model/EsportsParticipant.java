package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EsportsParticipant {

    @C09CT("match_score")
    public EsportsParticipantMatchScore matchScore;

    @C09CT("name")
    public String name = "";

    @C09CT("icon")
    public String icon = "";

    @C09CT("participant_id")
    public String participantId = "";

    @C09CT("dynamic_score_list")
    public List<EsportsParticipantDynamicScore> dynamicScoreList = new ArrayList();

    @C09CT("rank")
    public String rank = "";

    @C09CT("dark_mode_icon")
    public String darkModeIcon = "";
}
