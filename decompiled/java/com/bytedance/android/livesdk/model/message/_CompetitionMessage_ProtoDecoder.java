package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionContributorInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionFinish;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiate;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReply;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettleEnd;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettleStart;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSwitchTurn;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionUserBase;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageOrderInfo;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionCommon_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionContributorInfo_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionFinish_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionInitiate_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionReply_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionSettleEnd_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionSettleStart_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionSwitchTurn_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionUserBase_ProtoDecoder;
import com.bytedance.android.live.liveinteract.competition.model._TakeTheStageOrderInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common._LayoutData_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionMessage_ProtoDecoder implements C0IMD<CompetitionMessage> {
    @Override // X.C0IMD
    public final void LIZ(CompetitionMessage competitionMessage) {
        CompetitionContributorInfo competitionContributorInfo;
        CompetitionSwitchTurn.TakeTheStageBiz takeTheStageBiz;
        TakeTheStageOrderInfo takeTheStageOrderInfo;
        CompetitionUserBase competitionUserBase;
        CompetitionUserBase competitionUserBase2;
        CompetitionMessage competitionMessage2 = competitionMessage;
        CommonMessageData commonMessageData = competitionMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        CompetitionInitiate competitionInitiate = competitionMessage2.initiate;
        if (competitionInitiate != null) {
            _CompetitionInitiate_ProtoDecoder.LJ(competitionInitiate);
        }
        CompetitionReply competitionReply = competitionMessage2.reply;
        if (competitionReply != null) {
            _CompetitionReply_ProtoDecoder.LJ(competitionReply);
        }
        CompetitionStart competitionStart = competitionMessage2.start;
        if (competitionStart != null) {
            _CompetitionStart_ProtoDecoder.LJ(competitionStart);
        }
        CompetitionSettleStart competitionSettleStart = competitionMessage2.settleStart;
        if (competitionSettleStart != null && (competitionUserBase2 = competitionSettleStart.initiator) != null) {
            _CompetitionUserBase_ProtoDecoder.LJ(competitionUserBase2);
        }
        CompetitionSettleEnd competitionSettleEnd = competitionMessage2.settleEnd;
        if (competitionSettleEnd != null) {
            _CompetitionSettleEnd_ProtoDecoder.LJ(competitionSettleEnd);
        }
        CompetitionScoreChange competitionScoreChange = competitionMessage2.scoreChange;
        if (competitionScoreChange != null) {
            _CompetitionScoreChange_ProtoDecoder.LJ(competitionScoreChange);
        }
        CompetitionFinish competitionFinish = competitionMessage2.finish;
        if (competitionFinish != null && (competitionUserBase = competitionFinish.leaveUser) != null) {
            _CompetitionUserBase_ProtoDecoder.LJ(competitionUserBase);
        }
        CompetitionSwitchTurn competitionSwitchTurn = competitionMessage2.switchTurn;
        if (competitionSwitchTurn != null && (takeTheStageBiz = competitionSwitchTurn.takeTheStageBiz) != null && (takeTheStageOrderInfo = takeTheStageBiz.orderInfo) != null) {
            _TakeTheStageOrderInfo_ProtoDecoder.LJ(takeTheStageOrderInfo);
        }
        BeansBomb beansBomb = competitionMessage2.beansBomb;
        if (beansBomb != null && beansBomb.targetAnchorIds == null) {
            beansBomb.targetAnchorIds = new ArrayList();
        }
        BeansArtifacts beansArtifacts = competitionMessage2.beansArtifacts;
        if (beansArtifacts != null) {
            _BeansArtifacts_ProtoDecoder.LJ(beansArtifacts);
        }
        BeansAvatar beansAvatar = competitionMessage2.beansAvatar;
        if (beansAvatar != null && (competitionContributorInfo = beansAvatar.contributor) != null) {
            _CompetitionContributorInfo_ProtoDecoder.LJ(competitionContributorInfo);
        }
        LayoutData layoutData = competitionMessage2.crossRoomLayout;
        if (layoutData != null) {
            _LayoutData_ProtoDecoder.LJ(layoutData);
        }
    }

    @Override // X.C0IMD
    public final CompetitionMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CompetitionMessage competitionMessage = new CompetitionMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 200) {
                                switch (iLJI) {
                                    case 100:
                                        competitionMessage.initiate = _CompetitionInitiate_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 101:
                                        competitionMessage.reply = _CompetitionReply_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 102:
                                        competitionMessage.start = _CompetitionStart_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 103:
                                        competitionMessage.settleStart = _CompetitionSettleStart_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 104:
                                        competitionMessage.settleEnd = _CompetitionSettleEnd_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 105:
                                        competitionMessage.scoreChange = _CompetitionScoreChange_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 106:
                                        competitionMessage.finish = _CompetitionFinish_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 107:
                                        competitionMessage.switchTurn = _CompetitionSwitchTurn_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 108:
                                        competitionMessage.beansBomb = _BeansBomb_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 109:
                                        competitionMessage.beansArtifacts = _BeansArtifacts_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 110:
                                        competitionMessage.beansAvatar = _BeansAvatar_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    default:
                                        C1516700pZU.LJ(c1516680pZS);
                                        break;
                                }
                            } else {
                                competitionMessage.crossRoomLayout = _LayoutData_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            competitionMessage.type = c1516680pZS.LJIIJ();
                        }
                    } else {
                        competitionMessage.bizCommon = _CompetitionCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    competitionMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionMessage competitionMessage, List list) {
    }
}
