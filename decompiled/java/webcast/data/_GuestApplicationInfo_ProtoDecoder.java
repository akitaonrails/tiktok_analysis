package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestApplicationInfo_ProtoDecoder implements C0IMD<GuestApplicationInfo> {
    public static GuestApplicationInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestApplicationInfo guestApplicationInfo = new GuestApplicationInfo();
        guestApplicationInfo.applicationList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 255) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        guestApplicationInfo.originRequestParam = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    guestApplicationInfo.applicationList.add(_GuestApplicationInfoItem_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestApplicationInfo;
            }
        }
    }

    public static void LJ(GuestApplicationInfo guestApplicationInfo) {
        List<GuestApplicationInfoItem> list = guestApplicationInfo.applicationList;
        if (list == null) {
            guestApplicationInfo.applicationList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<GuestApplicationInfoItem> it2 = guestApplicationInfo.applicationList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuestApplicationInfo guestApplicationInfo) {
        LJ(guestApplicationInfo);
    }

    @Override // X.C0IMD
    public final GuestApplicationInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestApplicationInfo guestApplicationInfo, List list) {
    }
}
