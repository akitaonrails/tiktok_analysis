package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CustomActivityUserInfo_ProtoDecoder implements C0IMD<CustomActivityUserInfo> {
    public static CustomActivityUserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CustomActivityUserInfo customActivityUserInfo = new CustomActivityUserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        customActivityUserInfo.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        customActivityUserInfo.idSec = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        customActivityUserInfo.nickName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        customActivityUserInfo.avatar = _UserAvatar_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        customActivityUserInfo.handleName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        customActivityUserInfo.friendship = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        customActivityUserInfo.roomInfo = _CustomActivityLiveRoomInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return customActivityUserInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CustomActivityUserInfo customActivityUserInfo) {
        UserAvatar userAvatar = customActivityUserInfo.avatar;
        if (userAvatar != null && userAvatar.urlList == null) {
            userAvatar.urlList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final CustomActivityUserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CustomActivityUserInfo customActivityUserInfo, List list) {
    }
}
