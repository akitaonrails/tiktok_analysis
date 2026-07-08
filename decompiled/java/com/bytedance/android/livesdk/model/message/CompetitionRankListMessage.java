package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.liveinteract.competition.model.MemberRankInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionRankListMessage extends AbstractC1136060ffY {

    @C09CT("annonuncement_events")
    public List<AnnouncementEvent> annonuncementEvents;

    @C09CT("competition_id")
    public long competitionId;

    @C09CT("data_version")
    public long dataVersion;

    @C09CT("host_user_id")
    public long hostUserId;

    @C09CT("member_rank_info")
    public List<MemberRankInfo> memberRankInfo;

    public CompetitionRankListMessage() {
        this.type = C001A.COMPETITION_RANK_LIST_MESSAGE;
        this.memberRankInfo = new ArrayList();
        this.annonuncementEvents = new ArrayList();
    }
}
