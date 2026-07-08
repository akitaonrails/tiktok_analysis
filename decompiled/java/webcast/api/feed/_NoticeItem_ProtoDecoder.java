package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeItem_ProtoDecoder implements C0IMD<NoticeItem> {
    public static NoticeItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NoticeItem noticeItem = new NoticeItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 255) {
                    switch (iLJI) {
                        case 1:
                            noticeItem.noticeId = c1516680pZS.LJIIJJI();
                            break;
                        case 2:
                            noticeItem.noticeType = c1516680pZS.LJIIJ();
                            break;
                        case 3:
                            noticeItem.createTime = c1516680pZS.LJIIJJI();
                            break;
                        case 4:
                            noticeItem.hasRead = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 5:
                            noticeItem.showUiInfo = _NoticeUIInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            noticeItem.anchorId = c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            noticeItem.roomId = c1516680pZS.LJIIJJI();
                            break;
                        case 8:
                            noticeItem.eventId = c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            noticeItem.highlightId = c1516680pZS.LJIIJJI();
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    noticeItem.extra = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeItem;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(NoticeItem noticeItem) {
        NoticeUIInfo noticeUIInfo = noticeItem.showUiInfo;
        if (noticeUIInfo != null) {
            _NoticeUIInfo_ProtoDecoder.LJ(noticeUIInfo);
        }
    }

    @Override // X.C0IMD
    public final NoticeItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeItem noticeItem, List list) {
    }
}
