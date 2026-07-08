package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore._MicPositionData_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkUserState_ProtoDecoder implements C0IMD<LinkUserState> {
    public static LinkUserState LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkUserState linkUserState = new LinkUserState();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkUserState.user = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkUserState.linkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        linkUserState.pos = _MicPositionData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        linkUserState.linkedTimeNano = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        linkUserState.onlineUserState = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        linkUserState.audioMuted = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        linkUserState.videoMuted = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        linkUserState.rtcConnection = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkUserState.networkState = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkUserState.avatar = _AvatarState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        linkUserState.linkerSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkUserState;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkUserState linkUserState) {
    }

    @Override // X.C0IMD
    public final LinkUserState LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkUserState linkUserState, List list) {
    }
}
