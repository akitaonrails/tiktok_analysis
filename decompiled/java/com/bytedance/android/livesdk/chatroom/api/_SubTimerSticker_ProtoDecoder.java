package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _SubTimerSticker_ProtoDecoder implements C0IMD<SubTimerSticker> {
    public static SubTimerSticker LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubTimerSticker subTimerSticker = new SubTimerSticker();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        subTimerSticker.type = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        subTimerSticker.timerId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        subTimerSticker.opType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        subTimerSticker.timerStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        subTimerSticker.anchorSideTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        subTimerSticker.userSideTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        subTimerSticker.subIncreaseCount = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        subTimerSticker.timeIncreasePerSub = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        subTimerSticker.timeIncrease = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        subTimerSticker.totalTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        subTimerSticker.remainingTime = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        subTimerSticker.timestamp = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        subTimerSticker.stickerX = c1516680pZS.LJIIJJI();
                        break;
                    case 14:
                        subTimerSticker.stickerY = c1516680pZS.LJIIJJI();
                        break;
                    case 15:
                        subTimerSticker.screenW = c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        subTimerSticker.screenH = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subTimerSticker;
            }
        }
    }

    @Override // X.C0IMD
    public final SubTimerSticker LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SubTimerSticker subTimerSticker) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubTimerSticker subTimerSticker, List list) {
    }
}
