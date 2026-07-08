package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeButton_ProtoDecoder implements C0IMD<NoticeButton> {
    public static NoticeButton LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NoticeButton noticeButton = new NoticeButton();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            noticeButton.jumpType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        noticeButton.buttonType = c1516680pZS.LJIIJ();
                    }
                } else {
                    noticeButton.text = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeButton;
            }
        }
    }

    @Override // X.C0IMD
    public final NoticeButton LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(NoticeButton noticeButton) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeButton noticeButton, List list) {
    }
}
