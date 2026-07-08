package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Voucher_ProtoDecoder implements C0IMD<Voucher> {
    public static Voucher LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Voucher voucher = new Voucher();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        voucher.voucherTypeId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        voucher.taskId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        voucher.taskType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        voucher.liveVoucherType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        voucher.creatorOperationUniqueId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        voucher.voucherMaxFaceValue = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return voucher;
            }
        }
    }

    @Override // X.C0IMD
    public final Voucher LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Voucher voucher) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Voucher voucher, List list) {
    }
}
