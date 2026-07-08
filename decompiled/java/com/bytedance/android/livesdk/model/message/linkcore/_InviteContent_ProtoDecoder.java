package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _InviteContent_ProtoDecoder implements C0IMD<InviteContent> {
    public static InviteContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        InviteContent inviteContent = new InviteContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        inviteContent.inviter = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        inviteContent.inviteeRTCInfo = _RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        inviteContent.inviterLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        inviteContent.inviteeLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        inviteContent.isOwner = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        inviteContent.positionData = _MicPositionData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        inviteContent.dsl = _DSLConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        inviteContent.invitee = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        inviteContent.operator = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        inviteContent.inviteeLinkerSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return inviteContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(InviteContent inviteContent) {
        RTCExtraInfo rTCExtraInfo = inviteContent.inviteeRTCInfo;
        if (rTCExtraInfo != null) {
            _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
        }
    }

    @Override // X.C0IMD
    public final InviteContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InviteContent inviteContent, List list) {
    }
}
