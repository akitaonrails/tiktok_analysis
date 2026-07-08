package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EsportsMatchUpdateMessage extends AbstractC1136060ffY {

    @C09CT("match_list")
    public List<MatchInfo> matchList;

    public static final class MatchInfo {

        @C09CT("match_id")
        public String matchId = "";

        @C09CT("participant_info_list")
        public List<ParticipantInfo> participantInfoList = new ArrayList();

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }

    public static final class ParticipantInfo {

        @C09CT("participant_id")
        public String participantId = "";

        @C09CT("score")
        public String score = "";
    }

    public EsportsMatchUpdateMessage() {
        this.type = C001A.ESPORTS_MATCH_UPDATE_MESSAGE;
        this.matchList = new ArrayList();
    }
}
