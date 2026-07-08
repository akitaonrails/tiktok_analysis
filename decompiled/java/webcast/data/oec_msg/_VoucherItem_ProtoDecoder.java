package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _VoucherItem_ProtoDecoder implements C0IMD<VoucherItem> {
    public static VoucherItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        VoucherItem voucherItem = new VoucherItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        voucherItem.voucherTypeId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        voucherItem.taskId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        voucherItem.taskType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        voucherItem.liveVoucherType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        voucherItem.creatorOperationUniqueId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        voucherItem.voucherMaxFaceValue = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return voucherItem;
            }
        }
    }

    @Override // X.C0IMD
    public final VoucherItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(VoucherItem voucherItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, VoucherItem voucherItem, List list) {
    }
}
