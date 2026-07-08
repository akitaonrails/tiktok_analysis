package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnvelopePortalMessage_PortalTransTarget_ProtoDecoder implements C0IMD<EnvelopePortalMessage.PortalTransTarget> {
    public static EnvelopePortalMessage.PortalTransTarget LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnvelopePortalMessage.PortalTransTarget portalTransTarget = new EnvelopePortalMessage.PortalTransTarget();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        portalTransTarget.roomId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        portalTransTarget.sendRoomCover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        portalTransTarget.anchorDisplayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        portalTransTarget.anchorId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        portalTransTarget.anchorAvatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        portalTransTarget.envelopeDiamonds = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return portalTransTarget;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EnvelopePortalMessage.PortalTransTarget portalTransTarget) {
        EnvelopePortalMessage.PortalTransTarget portalTransTarget2 = portalTransTarget;
        ImageModel imageModel = portalTransTarget2.sendRoomCover;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = portalTransTarget2.anchorAvatar;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final EnvelopePortalMessage.PortalTransTarget LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnvelopePortalMessage.PortalTransTarget portalTransTarget, List list) {
    }
}
