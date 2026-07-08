package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class _SMBCourse_ProtoDecoder implements C0IMD<SMBCourse> {
    public static SMBCourse LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBCourse sMBCourse = new SMBCourse();
        sMBCourse.videoList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 23) {
                    switch (iLJI) {
                        case 1:
                            sMBCourse.courseId = c1516680pZS.LJIIJJI();
                            break;
                        case 2:
                            sMBCourse.anchorId = c1516680pZS.LJIIJJI();
                            break;
                        case 3:
                            sMBCourse.packageId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            sMBCourse.priceInfo = _SubPackagePriceInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            sMBCourse.name = _ContentAuditStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            sMBCourse.description = _ContentAuditStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            sMBCourse.pinText = _ContentAuditStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            sMBCourse.videoList.add(_SMBCourseVideo_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            sMBCourse.hasUnsavedChanges = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            sMBCourse.isPurchased = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            sMBCourse.hasCustomers = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            sMBCourse.validVideoCount = c1516680pZS.LJIIJ();
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            sMBCourse.isHidden = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 14:
                            sMBCourse.coverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 15:
                            sMBCourse.isFullyConfigured = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 16:
                            sMBCourse.courseReviewStatus = c1516680pZS.LJIIJ();
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            sMBCourse.showM2Guide = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    sMBCourse.courseIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBCourse;
            }
        }
    }

    public static void LJ(SMBCourse sMBCourse) {
        List<SMBCourseVideo> list = sMBCourse.videoList;
        if (list == null) {
            sMBCourse.videoList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<SMBCourseVideo> it2 = sMBCourse.videoList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SMBCourse sMBCourse) {
        LJ(sMBCourse);
    }

    @Override // X.C0IMD
    public final SMBCourse LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBCourse sMBCourse, List list) {
    }
}
