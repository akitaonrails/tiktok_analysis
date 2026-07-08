package webcast.api.sub;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBPreviewResponse_SubInfo_ProtoDecoder implements C0IMD<SMBPreviewResponse.SubInfo> {
    public static SMBPreviewResponse.SubInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBPreviewResponse.SubInfo subInfo = new SMBPreviewResponse.SubInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            subInfo.skuId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        subInfo.serviceInfo = _ServiceInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    subInfo.packageId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SMBPreviewResponse.SubInfo subInfo) {
    }

    @Override // X.C0IMD
    public final SMBPreviewResponse.SubInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBPreviewResponse.SubInfo subInfo, List list) {
    }
}
