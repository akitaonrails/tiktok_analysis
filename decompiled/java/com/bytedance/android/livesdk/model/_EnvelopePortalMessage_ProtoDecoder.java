package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnvelopePortalMessage_ProtoDecoder implements C0IMD<EnvelopePortalMessage> {
    @Override // X.C0IMD
    public final void LIZ(EnvelopePortalMessage envelopePortalMessage) {
        ImageModel imageModel;
        EnvelopePortalMessage envelopePortalMessage2 = envelopePortalMessage;
        CommonMessageData commonMessageData = envelopePortalMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        EnvelopePortalMessage.PortalInfo portalInfo = envelopePortalMessage2.portalInfo;
        if (portalInfo != null && (imageModel = portalInfo.senderAvatar) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        EnvelopePortalMessage.PortalTransTarget portalTransTarget = envelopePortalMessage2.portalTransTarget;
        if (portalTransTarget != null) {
            ImageModel imageModel2 = portalTransTarget.sendRoomCover;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
            ImageModel imageModel3 = portalTransTarget.anchorAvatar;
            if (imageModel3 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel3);
            }
        }
    }

    @Override // X.C0IMD
    public final EnvelopePortalMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EnvelopePortalMessage envelopePortalMessage = new EnvelopePortalMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    envelopePortalMessage.portalDisplay = c1516680pZS.LJIIJ();
                                }
                            } else {
                                envelopePortalMessage.portalView = c1516680pZS.LJIIJ();
                            }
                        } else {
                            envelopePortalMessage.portalTransTarget = _EnvelopePortalMessage_PortalTransTarget_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        envelopePortalMessage.portalInfo = _EnvelopePortalMessage_PortalInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    envelopePortalMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return envelopePortalMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnvelopePortalMessage envelopePortalMessage, List list) {
    }
}
