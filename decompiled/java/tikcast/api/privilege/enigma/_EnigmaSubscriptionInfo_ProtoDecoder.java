package tikcast.api.privilege.enigma;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnigmaSubscriptionInfo_ProtoDecoder implements C0IMD<EnigmaSubscriptionInfo> {
    public static EnigmaSubscriptionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnigmaSubscriptionInfo enigmaSubscriptionInfo = new EnigmaSubscriptionInfo();
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
                                    enigmaSubscriptionInfo.discountTagAmount = c1516680pZS.LJIIJ();
                                }
                            } else {
                                enigmaSubscriptionInfo.mpContractId = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            enigmaSubscriptionInfo.canSetCustomCode = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        enigmaSubscriptionInfo.subStatus = c1516680pZS.LJIIJ();
                    }
                } else {
                    enigmaSubscriptionInfo.subType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enigmaSubscriptionInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final EnigmaSubscriptionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EnigmaSubscriptionInfo enigmaSubscriptionInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnigmaSubscriptionInfo enigmaSubscriptionInfo, List list) {
    }
}
