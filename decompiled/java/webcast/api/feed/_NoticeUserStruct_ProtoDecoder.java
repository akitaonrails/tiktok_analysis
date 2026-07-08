package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeUserStruct_ProtoDecoder implements C0IMD<NoticeUserStruct> {
    public static NoticeUserStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NoticeUserStruct noticeUserStruct = new NoticeUserStruct();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        noticeUserStruct.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        noticeUserStruct.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        noticeUserStruct.avatarUrl = _NoticeUrlStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        noticeUserStruct.followStatus = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        noticeUserStruct.jumpType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        noticeUserStruct.isLiving = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        noticeUserStruct.userRoomId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeUserStruct;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(NoticeUserStruct noticeUserStruct) {
    }

    @Override // X.C0IMD
    public final NoticeUserStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeUserStruct noticeUserStruct, List list) {
    }
}
