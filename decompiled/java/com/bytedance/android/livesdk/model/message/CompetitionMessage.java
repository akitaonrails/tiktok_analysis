package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionFinish;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiate;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReply;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettleEnd;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettleStart;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSwitchTurn;
import tikcast.linkmic.common.LayoutData;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionMessage extends AbstractC1136060ffY {

    @C09CT("beans_artifacts")
    public BeansArtifacts beansArtifacts;

    @C09CT("beans_avatar")
    public BeansAvatar beansAvatar;

    @C09CT("beans_bomb")
    public BeansBomb beansBomb;

    @C09CT("biz_common")
    public CompetitionCommon bizCommon;

    @C09CT("cross_room_layout")
    public LayoutData crossRoomLayout;

    @C09CT("finish")
    public CompetitionFinish finish;

    @C09CT("initiate")
    public CompetitionInitiate initiate;

    @C09CT("reply")
    public CompetitionReply reply;

    @C09CT("score_change")
    public CompetitionScoreChange scoreChange;

    @C09CT("settle_end")
    public CompetitionSettleEnd settleEnd;

    @C09CT("settle_start")
    public CompetitionSettleStart settleStart;

    @C09CT("start")
    public CompetitionStart start;

    @C09CT("switch_turn")
    public CompetitionSwitchTurn switchTurn;

    @C09CT("type")
    public int type;

    public CompetitionMessage() {
        super.type = C001A.COMPETITION_MESSAGE;
    }
}
