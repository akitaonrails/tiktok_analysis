package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.game.model.EsportsParticipantDynamicScore;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EsportsScoreBoardUpdateMessage extends AbstractC1136060ffY {

    @C09CT("participant_scores")
    public List<ParticipantScoreInfo> participantScores;

    public static final class ParticipantScoreInfo {

        @C09CT("rank")
        public int rank;

        @C09CT("team_id")
        public String teamId = "";

        @C09CT("dynamic_score_list")
        public List<EsportsParticipantDynamicScore> dynamicScoreList = new ArrayList();
    }

    public EsportsScoreBoardUpdateMessage() {
        this.type = C001A.ESPORTS_SCORE_BOARD_UPDATE_MESSAGE;
        this.participantScores = new ArrayList();
    }
}
