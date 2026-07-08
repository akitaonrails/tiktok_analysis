package webcast.api.bag;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.bag.BagItemConsumeResponse;
import webcast.data._BagItemPreUpdateInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _BagItemConsumeResponse_Data_ProtoDecoder implements C0IMD<BagItemConsumeResponse.Data> {
    @Override // X.C0IMD
    public final void LIZ(BagItemConsumeResponse.Data data) {
    }

    @Override // X.C0IMD
    public final BagItemConsumeResponse.Data LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BagItemConsumeResponse.Data data = new BagItemConsumeResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        data.itemType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        data.itemId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        data.count = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        data.minExpireAt = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        data.available = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        data.preUpdateInfo = _BagItemPreUpdateInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        data.battleId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BagItemConsumeResponse.Data data, List list) {
    }
}
