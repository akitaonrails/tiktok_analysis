package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PortalMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PortalMessage_PortalInvite_ProtoDecoder implements C0IMD<PortalMessage.PortalInvite> {
    public static PortalMessage.PortalInvite LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PortalMessage.PortalInvite portalInvite = new PortalMessage.PortalInvite();
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
                                    portalInvite.cover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                portalInvite.anchor = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            portalInvite.sugarDaddy = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        portalInvite.rewardCountDown = c1516680pZS.LJIIJJI();
                    }
                } else {
                    portalInvite.inviteCountDown = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return portalInvite;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PortalMessage.PortalInvite portalInvite) {
        PortalMessage.PortalInvite portalInvite2 = portalInvite;
        User user = portalInvite2.sugarDaddy;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        User user2 = portalInvite2.anchor;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        ImageModel imageModel = portalInvite2.cover;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final PortalMessage.PortalInvite LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PortalMessage.PortalInvite portalInvite, List list) {
    }
}
