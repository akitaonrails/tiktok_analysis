package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerInfo_ProtoDecoder implements C0IMD<LinkerInfo> {
    public static LinkerInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerInfo linkerInfo = new LinkerInfo();
        linkerInfo.linkedUsers = new ArrayList();
        linkerInfo.linkedGuestUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkerInfo.linkedGuestUsers.add(_UserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        linkerInfo.inQuickPairing = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    linkerInfo.linkedUsers.add(_UserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerInfo;
            }
        }
    }

    public static void LJ(LinkerInfo linkerInfo) {
        ImageModel imageModel;
        ImageModel imageModel2;
        List<UserInfo> list = linkerInfo.linkedUsers;
        if (list == null) {
            linkerInfo.linkedUsers = new ArrayList();
        } else if (!list.isEmpty()) {
            for (UserInfo userInfo : linkerInfo.linkedUsers) {
                if (userInfo != null && (imageModel = userInfo.anchorAvatar) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<UserInfo> list2 = linkerInfo.linkedGuestUsers;
        if (list2 == null) {
            linkerInfo.linkedGuestUsers = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (UserInfo userInfo2 : linkerInfo.linkedGuestUsers) {
            if (userInfo2 != null && (imageModel2 = userInfo2.anchorAvatar) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkerInfo linkerInfo) {
        LJ(linkerInfo);
    }

    @Override // X.C0IMD
    public final LinkerInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerInfo linkerInfo, List list) {
    }
}
