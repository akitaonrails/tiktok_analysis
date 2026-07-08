package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;
import tikcast.linkmic.common._SpotInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _ReplyInviteContent_ProtoDecoder implements C0IMD<ReplyInviteContent> {
    public static ReplyInviteContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ReplyInviteContent replyInviteContent = new ReplyInviteContent();
        replyInviteContent.linkedUserUiPositions = new ArrayList();
        replyInviteContent.uiPos = new ArrayList();
        replyInviteContent.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        replyInviteContent.invitee = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        replyInviteContent.replyStatus = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        replyInviteContent.inviteeLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        replyInviteContent.positionData = _MicPositionData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        replyInviteContent.inviteOperatorUser = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        replyInviteContent.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        replyInviteContent.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        replyInviteContent.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        replyInviteContent.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        replyInviteContent.inviteeLinkerSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return replyInviteContent;
            }
        }
    }

    public static void LJ(ReplyInviteContent replyInviteContent) {
        MicPositionData micPositionData = replyInviteContent.positionData;
        if (replyInviteContent.linkedUserUiPositions == null) {
            replyInviteContent.linkedUserUiPositions = new ArrayList();
        }
        List<PosIdentity> list = replyInviteContent.uiPos;
        if (list == null) {
            replyInviteContent.uiPos = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PosIdentity> it2 = replyInviteContent.uiPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        LayoutState layoutState = replyInviteContent.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list2 = replyInviteContent.spotList;
        if (list2 == null) {
            replyInviteContent.spotList = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (SpotInfo spotInfo : replyInviteContent.spotList) {
            if (spotInfo != null) {
                _SpotInfo_ProtoDecoder.LJ(spotInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ReplyInviteContent replyInviteContent) {
        LJ(replyInviteContent);
    }

    @Override // X.C0IMD
    public final ReplyInviteContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReplyInviteContent replyInviteContent, List list) {
    }
}
