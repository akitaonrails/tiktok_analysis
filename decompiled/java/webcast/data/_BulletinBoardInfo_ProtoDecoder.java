package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BulletinBoardInfo_ProtoDecoder implements C0IMD<BulletinBoardInfo> {
    public static BulletinBoardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BulletinBoardInfo bulletinBoardInfo = new BulletinBoardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                bulletinBoardInfo.subscribeCount = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            bulletinBoardInfo.avatarShowUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        bulletinBoardInfo.name = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    bulletinBoardInfo.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bulletinBoardInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final BulletinBoardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BulletinBoardInfo bulletinBoardInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BulletinBoardInfo bulletinBoardInfo, List list) {
    }
}
