package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model.GuessText;
import com.bytedance.android.livesdk.game.model._GuessText_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameRecommendCreateGuessMessage_ProtoDecoder implements C0IMD<GameRecommendCreateGuessMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameRecommendCreateGuessMessage gameRecommendCreateGuessMessage) {
        GameRecommendCreateGuessMessage gameRecommendCreateGuessMessage2 = gameRecommendCreateGuessMessage;
        CommonMessageData commonMessageData = gameRecommendCreateGuessMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        GuessText guessText = gameRecommendCreateGuessMessage2.guessTitle;
        if (guessText != null) {
            _GuessText_ProtoDecoder.LJ(guessText);
        }
        GuessText guessText2 = gameRecommendCreateGuessMessage2.guessOpt1;
        if (guessText2 != null) {
            _GuessText_ProtoDecoder.LJ(guessText2);
        }
        GuessText guessText3 = gameRecommendCreateGuessMessage2.guessOpt2;
        if (guessText3 != null) {
            _GuessText_ProtoDecoder.LJ(guessText3);
        }
    }

    @Override // X.C0IMD
    public final GameRecommendCreateGuessMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameRecommendCreateGuessMessage gameRecommendCreateGuessMessage = new GameRecommendCreateGuessMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        gameRecommendCreateGuessMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        gameRecommendCreateGuessMessage.templateIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        gameRecommendCreateGuessMessage.betDurationInSecond = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        gameRecommendCreateGuessMessage.guessTitle = _GuessText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        gameRecommendCreateGuessMessage.guessOpt1 = _GuessText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        gameRecommendCreateGuessMessage.guessOpt2 = _GuessText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        gameRecommendCreateGuessMessage.dissMissDuration = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        gameRecommendCreateGuessMessage.tipsType = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        gameRecommendCreateGuessMessage.tipsLimit = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        gameRecommendCreateGuessMessage.serverTimestampStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        gameRecommendCreateGuessMessage.expireTime = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameRecommendCreateGuessMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameRecommendCreateGuessMessage gameRecommendCreateGuessMessage, List list) {
    }
}
