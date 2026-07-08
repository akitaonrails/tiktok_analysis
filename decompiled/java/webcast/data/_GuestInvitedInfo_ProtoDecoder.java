package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestInvitedInfo_ProtoDecoder implements C0IMD<GuestInvitedInfo> {
    public static GuestInvitedInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestInvitedInfo guestInvitedInfo = new GuestInvitedInfo();
        guestInvitedInfo.invitedList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    guestInvitedInfo.invitedList.add(_GuestInvitedInfoItem_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestInvitedInfo;
            }
        }
    }

    public static void LJ(GuestInvitedInfo guestInvitedInfo) {
        List<GuestInvitedInfoItem> list = guestInvitedInfo.invitedList;
        if (list == null) {
            guestInvitedInfo.invitedList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<GuestInvitedInfoItem> it2 = guestInvitedInfo.invitedList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuestInvitedInfo guestInvitedInfo) {
        LJ(guestInvitedInfo);
    }

    @Override // X.C0IMD
    public final GuestInvitedInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestInvitedInfo guestInvitedInfo, List list) {
    }
}
