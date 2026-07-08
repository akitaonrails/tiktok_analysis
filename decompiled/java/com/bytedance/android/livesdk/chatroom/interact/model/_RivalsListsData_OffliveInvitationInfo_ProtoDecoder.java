package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalsListsData_OffliveInvitationInfo_ProtoDecoder implements C0IMD<RivalsListsData.OffliveInvitationInfo> {
    public static RivalsListsData.OffliveInvitationInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RivalsListsData.OffliveInvitationInfo offliveInvitationInfo = new RivalsListsData.OffliveInvitationInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        offliveInvitationInfo.enableOffliveInvite = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    offliveInvitationInfo.offliveInvitationBanner = _RivalsListsData_OffliveInvitationBanner_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return offliveInvitationInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RivalsListsData.OffliveInvitationInfo offliveInvitationInfo) {
        RivalsListsData.OffliveInvitationBanner offliveInvitationBanner = offliveInvitationInfo.offliveInvitationBanner;
        if (offliveInvitationBanner != null) {
            _RivalsListsData_OffliveInvitationBanner_ProtoDecoder.LJ(offliveInvitationBanner);
        }
    }

    @Override // X.C0IMD
    public final RivalsListsData.OffliveInvitationInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalsListsData.OffliveInvitationInfo offliveInvitationInfo, List list) {
    }
}
