package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.RankUpdateMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdk.rank.model._RankTabInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RankUpdateMessage_ProtoDecoder implements C0IMD<RankUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(RankUpdateMessage rankUpdateMessage) {
        Text text;
        RankUpdateMessage rankUpdateMessage2 = rankUpdateMessage;
        CommonMessageData commonMessageData = rankUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<RankUpdate> list = rankUpdateMessage2.updates;
        if (list == null) {
            rankUpdateMessage2.updates = new ArrayList();
        } else if (!list.isEmpty()) {
            for (RankUpdate rankUpdate : rankUpdateMessage2.updates) {
                if (rankUpdate != null) {
                    _RankUpdate_ProtoDecoder.LJ(rankUpdate);
                }
            }
        }
        List<RankTabInfo> list2 = rankUpdateMessage2.tabs;
        if (list2 == null) {
            rankUpdateMessage2.tabs = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (RankTabInfo rankTabInfo : rankUpdateMessage2.tabs) {
                if (rankTabInfo != null && (text = rankTabInfo.title) != null) {
                    _Text_ProtoDecoder.LJ(text);
                }
            }
        }
        List<UnionAnimationInfo> list3 = rankUpdateMessage2.unionAnimation;
        if (list3 == null) {
            rankUpdateMessage2.unionAnimation = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (UnionAnimationInfo unionAnimationInfo : rankUpdateMessage2.unionAnimation) {
                if (unionAnimationInfo != null && unionAnimationInfo.rankTypeArray == null) {
                    unionAnimationInfo.rankTypeArray = new ArrayList();
                }
            }
        }
        List<RankListTabInfo> list4 = rankUpdateMessage2.tabInfo;
        if (list4 == null) {
            rankUpdateMessage2.tabInfo = new ArrayList();
        } else if (!list4.isEmpty()) {
            for (RankListTabInfo rankListTabInfo : rankUpdateMessage2.tabInfo) {
                if (rankListTabInfo != null) {
                    _RankListTabInfo_ProtoDecoder.LJ(rankListTabInfo);
                }
            }
        }
        RankUpdateMessage.ValidRanks validRanks = rankUpdateMessage2.validRanks;
        if (validRanks != null && validRanks.rankTypes == null) {
            validRanks.rankTypes = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final RankUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RankUpdateMessage rankUpdateMessage = new RankUpdateMessage();
        rankUpdateMessage.tabInfo = new ArrayList();
        rankUpdateMessage.tabs = new ArrayList();
        rankUpdateMessage.updates = new ArrayList();
        rankUpdateMessage.unionAnimation = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        rankUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        rankUpdateMessage.updates.add(_RankUpdate_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        rankUpdateMessage.groupType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        rankUpdateMessage.opType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        rankUpdateMessage.rankPriority = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        rankUpdateMessage.tabs.add(_RankTabInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        rankUpdateMessage.loop = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        rankUpdateMessage.animationLoopForOff = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        rankUpdateMessage.unionAnimation.add(_UnionAnimationInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        rankUpdateMessage.tabInfo.add(_RankListTabInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        rankUpdateMessage.validRanks = _RankUpdateMessage_ValidRanks_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rankUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RankUpdateMessage rankUpdateMessage, List list) {
    }
}
