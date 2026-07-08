package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeUrlStruct_ProtoDecoder implements C0IMD<NoticeUrlStruct> {
    public static NoticeUrlStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NoticeUrlStruct noticeUrlStruct = new NoticeUrlStruct();
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
                                noticeUrlStruct.width = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            noticeUrlStruct.height = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        noticeUrlStruct.noticeUrl = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    noticeUrlStruct.noticeUri = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeUrlStruct;
            }
        }
    }

    @Override // X.C0IMD
    public final NoticeUrlStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(NoticeUrlStruct noticeUrlStruct) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeUrlStruct noticeUrlStruct, List list) {
    }
}
