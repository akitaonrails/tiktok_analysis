package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.envelope.model._EnvelopeEnigmaInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnvelopePortalMessage_PortalInfo_ProtoDecoder implements C0IMD<EnvelopePortalMessage.PortalInfo> {
    public static EnvelopePortalMessage.PortalInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnvelopePortalMessage.PortalInfo portalInfo = new EnvelopePortalMessage.PortalInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        portalInfo.id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        portalInfo.idc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        portalInfo.sendAtSecond = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        portalInfo.ddlSecond = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        portalInfo.envelopeDiamonds = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        portalInfo.portalDiamonds = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        portalInfo.senderDisplayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        portalInfo.senderId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        portalInfo.senderAvatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        portalInfo.transCount = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        portalInfo.touchCount = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
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
    public final void LIZ(EnvelopePortalMessage.PortalInfo portalInfo) {
        ImageModel imageModel = portalInfo.senderAvatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final EnvelopePortalMessage.PortalInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnvelopePortalMessage.PortalInfo portalInfo, List list) {
    }
}
