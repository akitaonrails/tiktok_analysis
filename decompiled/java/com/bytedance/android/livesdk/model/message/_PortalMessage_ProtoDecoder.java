package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.Portal;
import com.bytedance.android.livesdk.model._Portal_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PortalMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PortalMessage_ProtoDecoder implements C0IMD<PortalMessage> {
    @Override // X.C0IMD
    public final void LIZ(PortalMessage portalMessage) {
        User user;
        User user2;
        PortalMessage portalMessage2 = portalMessage;
        CommonMessageData commonMessageData = portalMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        PortalMessage.PortalBuy portalBuy = portalMessage2.portalBuy;
        if (portalBuy != null && (user2 = portalBuy.sugarDaddy) != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        PortalMessage.PortalInvite portalInvite = portalMessage2.portalInvite;
        if (portalInvite != null) {
            User user3 = portalInvite.sugarDaddy;
            if (user3 != null) {
                _User_ProtoDecoder.LJ(user3);
            }
            User user4 = portalInvite.anchor;
            if (user4 != null) {
                _User_ProtoDecoder.LJ(user4);
            }
            ImageModel imageModel = portalInvite.cover;
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
        PortalMessage.PortalFinish portalFinish = portalMessage2.portalFinish;
        if (portalFinish != null && (user = portalFinish.luckyPerson) != null) {
            _User_ProtoDecoder.LJ(user);
        }
        Portal portal = portalMessage2.portal;
        if (portal != null) {
            User user5 = portal.sugarDaddy;
            if (user5 != null) {
                _User_ProtoDecoder.LJ(user5);
            }
            User user6 = portal.anchor;
            if (user6 != null) {
                _User_ProtoDecoder.LJ(user6);
            }
            ImageModel imageModel2 = portal.cover;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
    }

    @Override // X.C0IMD
    public final PortalMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PortalMessage portalMessage = new PortalMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        portalMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        portalMessage.payloadType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        portalMessage.portalId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        portalMessage.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        portalMessage.portalBuy = _PortalMessage_PortalBuy_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        portalMessage.portalInvite = _PortalMessage_PortalInvite_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        portalMessage.portalFinish = _PortalMessage_PortalFinish_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        portalMessage.portal = _Portal_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        portalMessage.nextPingTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                int i = portalMessage.payloadType;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            portalMessage.payload = portalMessage.portalFinish;
                        }
                        return portalMessage;
                    }
                    portalMessage.payload = portalMessage.portalInvite;
                    return portalMessage;
                }
                portalMessage.payload = portalMessage.portalBuy;
                return portalMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PortalMessage portalMessage, List list) {
    }
}
