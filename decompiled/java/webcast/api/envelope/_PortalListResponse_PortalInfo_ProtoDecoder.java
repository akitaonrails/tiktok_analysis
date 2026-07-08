package webcast.api.envelope;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.envelope.model._EnvelopeEnigmaInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;
import webcast.api.envelope.PortalListResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _PortalListResponse_PortalInfo_ProtoDecoder implements C0IMD<PortalListResponse.PortalInfo> {
    public static PortalListResponse.PortalInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PortalListResponse.PortalInfo portalInfo = new PortalListResponse.PortalInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        portalInfo.id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        portalInfo.sendAtSecond = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        portalInfo.ddlSecond = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        portalInfo.envelopeDiamonds = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        portalInfo.portalDiamonds = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        portalInfo.senderDisplayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        portalInfo.senderId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        portalInfo.senderAvatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        portalInfo.transCount = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        portalInfo.touchCount = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        portalInfo.senderEnigmaInfo = _EnvelopeEnigmaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return portalInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PortalListResponse.PortalInfo portalInfo) {
        ImageModel imageModel = portalInfo.senderAvatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final PortalListResponse.PortalInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PortalListResponse.PortalInfo portalInfo, List list) {
    }
}
