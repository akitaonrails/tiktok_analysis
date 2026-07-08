package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionResultsTeamInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionContributorMessage extends AbstractC1136060ffY {

    @C09CT("battle_type")
    public int battleType;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("competition_id")
    public long competitionId;

    @C09CT("team_infos")
    public List<CompetitionResultsTeamInfo> teamInfos;

    public CompetitionContributorMessage() {
        this.type = C001A.COMPETITION_CONTRIBUTOR_MESSAGE;
        this.teamInfos = new ArrayList();
    }
}
