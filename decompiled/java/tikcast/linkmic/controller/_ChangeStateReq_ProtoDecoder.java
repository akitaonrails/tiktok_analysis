package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._StateReqCommon_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _ChangeStateReq_ProtoDecoder implements C0IMD<ChangeStateReq> {
    @Override // X.C0IMD
    public final void LIZ(ChangeStateReq changeStateReq) {
        ChangeStateReq changeStateReq2 = changeStateReq;
        LayoutState layoutState = changeStateReq2.layoutState;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        if (changeStateReq2.audioMutedRemoteChannels == null) {
            changeStateReq2.audioMutedRemoteChannels = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final ChangeStateReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ChangeStateReq changeStateReq = new ChangeStateReq();
        changeStateReq.audioMutedRemoteChannels = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        changeStateReq.common = _StateReqCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        changeStateReq.stateType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        changeStateReq.clientTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        changeStateReq.layoutState = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        changeStateReq.onlineUserState = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        changeStateReq.audioMuted = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        changeStateReq.videoMuted = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        changeStateReq.networkState = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        changeStateReq.backgroundStickerId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        changeStateReq.avatarId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        changeStateReq.audioMutedRemoteChannels.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return changeStateReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ChangeStateReq changeStateReq, List list) {
    }
}
