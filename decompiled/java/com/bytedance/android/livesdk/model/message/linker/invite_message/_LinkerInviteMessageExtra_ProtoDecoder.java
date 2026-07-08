package com.bytedance.android.livesdk.model.message.linker.invite_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostTopic_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerInviteMessageExtra_ProtoDecoder implements C0IMD<LinkerInviteMessageExtra> {
    public static LinkerInviteMessageExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerInviteMessageExtra linkerInviteMessageExtra = new LinkerInviteMessageExtra();
        linkerInviteMessageExtra.otherRivalExtra = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkerInviteMessageExtra.matchType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        linkerInviteMessageExtra.inviteType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkerInviteMessageExtra.subType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        linkerInviteMessageExtra.theme = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        linkerInviteMessageExtra.duration = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        linkerInviteMessageExtra.layout = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        linkerInviteMessageExtra.tips = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        linkerInviteMessageExtra.inviterRivalExtra = _InviterRivalExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkerInviteMessageExtra.otherRivalExtra.add(_InviterRivalExtra_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkerInviteMessageExtra.topicInfo = _CohostTopic_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        linkerInviteMessageExtra.algoRequestId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerInviteMessageExtra;
            }
        }
    }

    public static void LJ(LinkerInviteMessageExtra linkerInviteMessageExtra) {
        InviterRivalExtra inviterRivalExtra = linkerInviteMessageExtra.inviterRivalExtra;
        if (inviterRivalExtra != null) {
            _InviterRivalExtra_ProtoDecoder.LJ(inviterRivalExtra);
        }
        List<InviterRivalExtra> list = linkerInviteMessageExtra.otherRivalExtra;
        if (list == null) {
            linkerInviteMessageExtra.otherRivalExtra = new ArrayList();
        } else if (!list.isEmpty()) {
            for (InviterRivalExtra inviterRivalExtra2 : linkerInviteMessageExtra.otherRivalExtra) {
                if (inviterRivalExtra2 != null) {
                    _InviterRivalExtra_ProtoDecoder.LJ(inviterRivalExtra2);
                }
            }
        }
        CohostTopic cohostTopic = linkerInviteMessageExtra.topicInfo;
        if (cohostTopic != null) {
            _CohostTopic_ProtoDecoder.LJ(cohostTopic);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkerInviteMessageExtra linkerInviteMessageExtra) {
        LJ(linkerInviteMessageExtra);
    }

    @Override // X.C0IMD
    public final LinkerInviteMessageExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerInviteMessageExtra linkerInviteMessageExtra, List list) {
    }
}
