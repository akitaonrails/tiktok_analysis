package webcast.api.partnership;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.partnership.AnchorInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorInfoResponse_LabelFilterInfo_ProtoDecoder implements C0IMD<AnchorInfoResponse.LabelFilterInfo> {
    public static AnchorInfoResponse.LabelFilterInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorInfoResponse.LabelFilterInfo labelFilterInfo = new AnchorInfoResponse.LabelFilterInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            labelFilterInfo.gpppaBanToast = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        labelFilterInfo.gpppaBanText = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    labelFilterInfo.gpppaAccount = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return labelFilterInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorInfoResponse.LabelFilterInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorInfoResponse.LabelFilterInfo labelFilterInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorInfoResponse.LabelFilterInfo labelFilterInfo, List list) {
    }
}
