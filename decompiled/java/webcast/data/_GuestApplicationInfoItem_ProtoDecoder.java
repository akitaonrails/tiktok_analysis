package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestApplicationInfoItem_ProtoDecoder implements C0IMD<GuestApplicationInfoItem> {
    public static GuestApplicationInfoItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestApplicationInfoItem guestApplicationInfoItem = new GuestApplicationInfoItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guestApplicationInfoItem.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        guestApplicationInfoItem.anchorId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        guestApplicationInfoItem.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        guestApplicationInfoItem.isPermitted = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        guestApplicationInfoItem.applyTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        guestApplicationInfoItem.permitTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        guestApplicationInfoItem.iconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        guestApplicationInfoItem.permitText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestApplicationInfoItem;
            }
        }
    }

    @Override // X.C0IMD
    public final GuestApplicationInfoItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuestApplicationInfoItem guestApplicationInfoItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestApplicationInfoItem guestApplicationInfoItem, List list) {
    }
}
