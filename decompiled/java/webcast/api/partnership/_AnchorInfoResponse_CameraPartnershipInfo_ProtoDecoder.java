package webcast.api.partnership;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.partnership.AnchorInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorInfoResponse_CameraPartnershipInfo_ProtoDecoder implements C0IMD<AnchorInfoResponse.CameraPartnershipInfo> {
    public static AnchorInfoResponse.CameraPartnershipInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorInfoResponse.CameraPartnershipInfo cameraPartnershipInfo = new AnchorInfoResponse.CameraPartnershipInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            cameraPartnershipInfo.publishPermission = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        cameraPartnershipInfo.taskPermission = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    cameraPartnershipInfo.permission = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cameraPartnershipInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorInfoResponse.CameraPartnershipInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorInfoResponse.CameraPartnershipInfo cameraPartnershipInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorInfoResponse.CameraPartnershipInfo cameraPartnershipInfo, List list) {
    }
}
