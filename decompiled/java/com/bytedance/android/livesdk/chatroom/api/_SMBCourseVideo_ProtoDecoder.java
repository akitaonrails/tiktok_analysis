package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class _SMBCourseVideo_ProtoDecoder implements C0IMD<SMBCourseVideo> {
    public static SMBCourseVideo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBCourseVideo sMBCourseVideo = new SMBCourseVideo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        sMBCourseVideo.videoId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        sMBCourseVideo.itemId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        sMBCourseVideo.courseId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        sMBCourseVideo.position = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        sMBCourseVideo.publishStatus = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        sMBCourseVideo.title = _ContentAuditStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        sMBCourseVideo.cover = _ContentAuditStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        sMBCourseVideo.awemeStructStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        sMBCourseVideo.isVisibleToViewers = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        sMBCourseVideo.overallReviewStatus = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        sMBCourseVideo.videoReviewStatus = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        sMBCourseVideo.audioReviewStatus = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        sMBCourseVideo.audioReviewResult = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        sMBCourseVideo.needConfirmAudio = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 15:
                    case 16:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        sMBCourseVideo.videoDuration = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        sMBCourseVideo.viewCount = c1516680pZS.LJIIJJI();
                        break;
                    case 19:
                        sMBCourseVideo.isEdited = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        sMBCourseVideo.overallReviewLabel = c1516680pZS.LJIIJ();
                        break;
                    case 21:
                        sMBCourseVideo.courseIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBCourseVideo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SMBCourseVideo sMBCourseVideo) {
    }

    @Override // X.C0IMD
    public final SMBCourseVideo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBCourseVideo sMBCourseVideo, List list) {
    }
}
