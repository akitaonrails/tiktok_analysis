package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardReviewMessage_ProtoDecoder implements C0IMD<NoticeboardReviewMessage> {
    @Override // X.C0IMD
    public final void LIZ(NoticeboardReviewMessage noticeboardReviewMessage) {
        CommonMessageData commonMessageData = noticeboardReviewMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final NoticeboardReviewMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardReviewMessage noticeboardReviewMessage = new NoticeboardReviewMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        noticeboardReviewMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        noticeboardReviewMessage.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        noticeboardReviewMessage.mediaNodeId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        noticeboardReviewMessage.postReviewStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        noticeboardReviewMessage.preReviewStatus = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        noticeboardReviewMessage.templateId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        noticeboardReviewMessage.officialMaterialType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeboardReviewMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardReviewMessage noticeboardReviewMessage, List list) {
    }
}
