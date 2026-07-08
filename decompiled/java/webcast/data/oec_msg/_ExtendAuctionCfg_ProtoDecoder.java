package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ExtendAuctionCfg_ProtoDecoder implements C0IMD<ExtendAuctionCfg> {
    public static ExtendAuctionCfg LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ExtendAuctionCfg extendAuctionCfg = new ExtendAuctionCfg();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            extendAuctionCfg.extendAuctionTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        extendAuctionCfg.shouldExtend = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    extendAuctionCfg.isExtendAuctionSupported = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return extendAuctionCfg;
            }
        }
    }

    @Override // X.C0IMD
    public final ExtendAuctionCfg LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ExtendAuctionCfg extendAuctionCfg) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ExtendAuctionCfg extendAuctionCfg, List list) {
    }
}
