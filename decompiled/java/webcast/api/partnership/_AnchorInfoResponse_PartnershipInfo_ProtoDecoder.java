package webcast.api.partnership;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.partnership.AnchorInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorInfoResponse_PartnershipInfo_ProtoDecoder implements C0IMD<AnchorInfoResponse.PartnershipInfo> {
    public static AnchorInfoResponse.PartnershipInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorInfoResponse.PartnershipInfo partnershipInfo = new AnchorInfoResponse.PartnershipInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    partnershipInfo.partnershipInfoUpdateTimestamp = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                partnershipInfo.publishPermission = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            partnershipInfo.taskPermission = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        partnershipInfo.hasSign = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    partnershipInfo.permission = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return partnershipInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorInfoResponse.PartnershipInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorInfoResponse.PartnershipInfo partnershipInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorInfoResponse.PartnershipInfo partnershipInfo, List list) {
    }
}
