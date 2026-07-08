package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkInviteResult_ProtoDecoder implements C0IMD<LinkInviteResult> {
    @Override // X.C0IMD
    public final void LIZ(LinkInviteResult linkInviteResult) {
        PerceptionMessage perceptionMessage = linkInviteResult.perceptionMessage;
        if (perceptionMessage != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
    }

    @Override // X.C0IMD
    public final LinkInviteResult LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkInviteResult linkInviteResult = new LinkInviteResult();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkInviteResult.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        linkInviteResult.vendor = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        linkInviteResult.channelIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        linkInviteResult.scene = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 5:
                        linkInviteResult.rtcJoinChannel = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        linkInviteResult.rtcExtInfo = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        linkInviteResult.linkMicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        linkInviteResult.rtcPushStream = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkInviteResult.actionId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkInviteResult.rivalsLinkMicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        linkInviteResult.perceptionStatus = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        linkInviteResult.perceptionMessage = _PerceptionMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        linkInviteResult.extra = _InviteExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkInviteResult;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkInviteResult linkInviteResult, List list) {
    }
}
