package com.bytedance.android.livesdk.model.linksetting;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model._MultiGuestPermissionInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomAudienceMultiGuestPermissionInfo_ProtoDecoder implements C0IMD<RoomAudienceMultiGuestPermissionInfo> {
    public static RoomAudienceMultiGuestPermissionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo = new RoomAudienceMultiGuestPermissionInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        roomAudienceMultiGuestPermissionInfo.permissionInfo = _MultiGuestPermissionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    roomAudienceMultiGuestPermissionInfo.roomPackSuccessFlag = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomAudienceMultiGuestPermissionInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo) {
    }

    @Override // X.C0IMD
    public final RoomAudienceMultiGuestPermissionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo, List list) {
    }
}
