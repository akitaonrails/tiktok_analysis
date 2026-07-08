package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestInvitedInfoItem_ProtoDecoder implements C0IMD<GuestInvitedInfoItem> {
    public static GuestInvitedInfoItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestInvitedInfoItem guestInvitedInfoItem = new GuestInvitedInfoItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guestInvitedInfoItem.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        guestInvitedInfoItem.anchorId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        guestInvitedInfoItem.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        guestInvitedInfoItem.inviteTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        guestInvitedInfoItem.iconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        guestInvitedInfoItem.followRelation = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestInvitedInfoItem;
            }
        }
    }

    @Override // X.C0IMD
    public final GuestInvitedInfoItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuestInvitedInfoItem guestInvitedInfoItem) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestInvitedInfoItem guestInvitedInfoItem, List list) {
    }
}
