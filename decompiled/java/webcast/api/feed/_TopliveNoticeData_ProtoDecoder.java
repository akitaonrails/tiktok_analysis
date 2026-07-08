package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopliveNoticeData_ProtoDecoder implements C0IMD<TopliveNoticeData> {
    @Override // X.C0IMD
    public final void LIZ(TopliveNoticeData topliveNoticeData) {
        NoticeUIInfo noticeUIInfo;
        TopliveNoticeData topliveNoticeData2 = topliveNoticeData;
        List<NoticeItem> list = topliveNoticeData2.noticeList;
        if (list == null) {
            topliveNoticeData2.noticeList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (NoticeItem noticeItem : topliveNoticeData2.noticeList) {
            if (noticeItem != null && (noticeUIInfo = noticeItem.showUiInfo) != null) {
                _NoticeUIInfo_ProtoDecoder.LJ(noticeUIInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final TopliveNoticeData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TopliveNoticeData topliveNoticeData = new TopliveNoticeData();
        topliveNoticeData.noticeList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    topliveNoticeData.noticeList.add(_NoticeItem_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topliveNoticeData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopliveNoticeData topliveNoticeData, List list) {
    }
}
