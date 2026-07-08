package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _TimerDetail_ProtoDecoder implements C0IMD<TimerDetail> {
    public static TimerDetail LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TimerDetail timerDetail = new TimerDetail();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        timerDetail.timerId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        timerDetail.anchorId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        timerDetail.startTimestampS = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        timerDetail.startCountdownTimeS = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        timerDetail.anchorSideTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        timerDetail.userSideTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        timerDetail.timeIncreasePerSubS = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        timerDetail.timeIncreaseCapS = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        timerDetail.subCount = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        timerDetail.timeIncreaseReachCap = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        timerDetail.totalPauseTimeS = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        timerDetail.lastPauseTimestampS = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        timerDetail.totalTimeS = c1516680pZS.LJIIJJI();
                        break;
                    case 14:
                        timerDetail.remainingTimeS = c1516680pZS.LJIIJJI();
                        break;
                    case 15:
                        timerDetail.timestampS = c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        timerDetail.stickerX = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        timerDetail.stickerY = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        timerDetail.screenW = c1516680pZS.LJIIJJI();
                        break;
                    case 19:
                        timerDetail.screenH = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        timerDetail.timerStatus = c1516680pZS.LJIIJ();
                        break;
                    case 21:
                        timerDetail.antidirtStatus = c1516680pZS.LJIIJ();
                        break;
                    case 22:
                        timerDetail.auditStatus = c1516680pZS.LJIIJ();
                        break;
                    case 23:
                        timerDetail.auditInfo = _TimerDetail_AuditInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return timerDetail;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TimerDetail timerDetail) {
    }

    @Override // X.C0IMD
    public final TimerDetail LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TimerDetail timerDetail, List list) {
    }
}
