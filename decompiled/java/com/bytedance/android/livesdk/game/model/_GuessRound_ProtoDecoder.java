package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuessRound_ProtoDecoder implements C0IMD<GuessRound> {
    public static GuessRound LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuessRound guessRound = new GuessRound();
        guessRound.guessOptions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    switch (iLJI) {
                        case 1:
                            guessRound.title = _GuessText_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            guessRound.roundIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            guessRound.guessOptions.add(_GuessOptions_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 4:
                            guessRound.winOption = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            guessRound.startTime = c1516680pZS.LJIIJJI();
                            break;
                        case 6:
                            guessRound.endTime = c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            guessRound.guessStatus = c1516680pZS.LJIIJ();
                            break;
                        case 8:
                            guessRound.roomIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            guessRound.liveId = c1516680pZS.LJIIJJI();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            guessRound.guessRoundStats = _GuessRoundStats_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            guessRound.correctedOption = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            guessRound.anchorId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            guessRound.creatorId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 14:
                            guessRound.operatorId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 15:
                            guessRound.operatorName = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 16:
                            guessRound.settleFinishTime = c1516680pZS.LJIIJJI();
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            guessRound.isAutoPin = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    guessRound.serverTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guessRound;
            }
        }
    }

    public static void LJ(GuessRound guessRound) {
        GuessText guessText;
        GuessText guessText2 = guessRound.title;
        if (guessText2 != null) {
            _GuessText_ProtoDecoder.LJ(guessText2);
        }
        List<GuessOptions> list = guessRound.guessOptions;
        if (list == null) {
            guessRound.guessOptions = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GuessOptions guessOptions : guessRound.guessOptions) {
            if (guessOptions != null && (guessText = guessOptions.text) != null) {
                _GuessText_ProtoDecoder.LJ(guessText);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuessRound guessRound) {
        LJ(guessRound);
    }

    @Override // X.C0IMD
    public final GuessRound LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuessRound guessRound, List list) {
    }
}
