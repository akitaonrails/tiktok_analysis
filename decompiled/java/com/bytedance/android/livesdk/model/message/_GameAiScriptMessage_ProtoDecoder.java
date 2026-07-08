package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameAiScriptMessage_ProtoDecoder implements C0IMD<GameAiScriptMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameAiScriptMessage gameAiScriptMessage) {
        GameAiScriptMessage gameAiScriptMessage2 = gameAiScriptMessage;
        Text text = gameAiScriptMessage2.buttonText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = gameAiScriptMessage2.titleText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        CuesMessage cuesMessage = gameAiScriptMessage2.cueMessage;
        if (cuesMessage != null) {
            _CuesMessage_ProtoDecoder.LJ(cuesMessage);
        }
        CommonMessageData commonMessageData = gameAiScriptMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final GameAiScriptMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameAiScriptMessage gameAiScriptMessage = new GameAiScriptMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    switch (iLJI) {
                        case 1:
                            gameAiScriptMessage.ruleId = c1516680pZS.LJIIJJI();
                            break;
                        case 2:
                            gameAiScriptMessage.aiContent = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            gameAiScriptMessage.action = _GameAiScriptAction_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            gameAiScriptMessage.priority = c1516680pZS.LJIIJJI();
                            break;
                        case 5:
                            gameAiScriptMessage.showDurationInapp = c1516680pZS.LJIIJJI();
                            break;
                        case 6:
                            gameAiScriptMessage.showDurationOutapp = c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            gameAiScriptMessage.buttonText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            gameAiScriptMessage.titleText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            gameAiScriptMessage.bizId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            gameAiScriptMessage.isShowCues = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            gameAiScriptMessage.cueMessage = _CuesMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    gameAiScriptMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameAiScriptMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameAiScriptMessage gameAiScriptMessage, List list) {
    }
}
