package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore._MicPositionData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardContent_ProtoDecoder implements C0IMD<NoticeboardContent> {
    public static NoticeboardContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardContent noticeboardContent = new NoticeboardContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        noticeboardContent.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        noticeboardContent.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        noticeboardContent.noticeboardId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        noticeboardContent.status = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        noticeboardContent.linkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        noticeboardContent.position = _MicPositionData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        noticeboardContent.streamId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        noticeboardContent.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        noticeboardContent.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        noticeboardContent.passedMediaNodeId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        noticeboardContent.lastReviewInfo = _NoticeboardReviewInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        noticeboardContent.version = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeboardContent;
            }
        }
    }

    public static void LJ(NoticeboardContent noticeboardContent) {
        MicPositionData micPositionData = noticeboardContent.position;
    }

    @Override // X.C0IMD
    public final void LIZ(NoticeboardContent noticeboardContent) {
    }

    @Override // X.C0IMD
    public final NoticeboardContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardContent noticeboardContent, List list) {
    }
}
