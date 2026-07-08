package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.CohostPlatformMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostPlatformMessage_InviteeInfo_ProtoDecoder implements C0IMD<CohostPlatformMessage.InviteeInfo> {
    public static CohostPlatformMessage.InviteeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostPlatformMessage.InviteeInfo inviteeInfo = new CohostPlatformMessage.InviteeInfo();
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
                                    inviteeInfo.viewerCount = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                inviteeInfo.displayTag = c1516680pZS.LJIIJ();
                            }
                        } else {
                            inviteeInfo.displayAvatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        inviteeInfo.displayName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    inviteeInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return inviteeInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostPlatformMessage.InviteeInfo inviteeInfo) {
        ImageModel imageModel = inviteeInfo.displayAvatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final CohostPlatformMessage.InviteeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostPlatformMessage.InviteeInfo inviteeInfo, List list) {
    }
}
