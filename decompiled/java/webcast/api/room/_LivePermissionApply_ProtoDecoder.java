package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LivePermissionApply_ProtoDecoder implements C0IMD<LivePermissionApply> {
    public static LivePermissionApply LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LivePermissionApply livePermissionApply = new LivePermissionApply();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            livePermissionApply.enableLiveVideo = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        livePermissionApply.enableScreenshot = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    livePermissionApply.enableThirdParty = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return livePermissionApply;
            }
        }
    }

    @Override // X.C0IMD
    public final LivePermissionApply LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LivePermissionApply livePermissionApply) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LivePermissionApply livePermissionApply, List list) {
    }
}
