package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomAuthStatus_StarCommentPermissionSwitch_ProtoDecoder implements C0IMD<RoomAuthStatus.StarCommentPermissionSwitch> {
    public static RoomAuthStatus.StarCommentPermissionSwitch LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomAuthStatus.StarCommentPermissionSwitch starCommentPermissionSwitch = new RoomAuthStatus.StarCommentPermissionSwitch();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        starCommentPermissionSwitch.offreason = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    starCommentPermissionSwitch.status = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return starCommentPermissionSwitch;
            }
        }
    }

    @Override // X.C0IMD
    public final RoomAuthStatus.StarCommentPermissionSwitch LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RoomAuthStatus.StarCommentPermissionSwitch starCommentPermissionSwitch) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomAuthStatus.StarCommentPermissionSwitch starCommentPermissionSwitch, List list) {
    }
}
