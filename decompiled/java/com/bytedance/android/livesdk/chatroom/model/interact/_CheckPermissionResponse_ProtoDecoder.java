package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CheckPermissionResponse_ProtoDecoder implements C0IMD<CheckPermissionResponse> {
    @Override // X.C0IMD
    public final CheckPermissionResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CheckPermissionResponse checkPermissionResponse = new CheckPermissionResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 4) {
                    if (iLJI != 5) {
                        if (iLJI != 6) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            checkPermissionResponse.anchorPunished = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        checkPermissionResponse.anchorOnboardPermit = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    checkPermissionResponse.multiHostPermission = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return checkPermissionResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CheckPermissionResponse checkPermissionResponse) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CheckPermissionResponse checkPermissionResponse, List list) {
    }
}
