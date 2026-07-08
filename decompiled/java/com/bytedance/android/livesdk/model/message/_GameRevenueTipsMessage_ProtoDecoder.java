package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameRevenueTipsMessage_ProtoDecoder implements C0IMD<GameRevenueTipsMessage> {
    public static GameRevenueTipsMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameRevenueTipsMessage gameRevenueTipsMessage = new GameRevenueTipsMessage();
        gameRevenueTipsMessage.fillinText = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    switch (iLJI) {
                        case 1:
                            gameRevenueTipsMessage.ruleId = c1516680pZS.LJIIJJI();
                            break;
                        case 2:
                            gameRevenueTipsMessage.tipsText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            gameRevenueTipsMessage.fillinText.add(C1516700pZU.LIZLLL(c1516680pZS));
                            break;
                        case 4:
                            gameRevenueTipsMessage.action = _GameAction_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            gameRevenueTipsMessage.priority = c1516680pZS.LJIIJJI();
                            break;
                        case 6:
                            gameRevenueTipsMessage.showDurationInapp = c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            gameRevenueTipsMessage.showDurationOutapp = c1516680pZS.LJIIJJI();
                            break;
                        case 8:
                            gameRevenueTipsMessage.buttonText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            gameRevenueTipsMessage.titleText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    gameRevenueTipsMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameRevenueTipsMessage;
            }
        }
    }

    public static void LJ(GameRevenueTipsMessage gameRevenueTipsMessage) {
        User user;
        Text text = gameRevenueTipsMessage.tipsText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        if (gameRevenueTipsMessage.fillinText == null) {
            gameRevenueTipsMessage.fillinText = new ArrayList();
        }
        GameAction gameAction = gameRevenueTipsMessage.action;
        if (gameAction != null && (user = gameAction.followUserInfo) != null) {
            _User_ProtoDecoder.LJ(user);
        }
        Text text2 = gameRevenueTipsMessage.buttonText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        Text text3 = gameRevenueTipsMessage.titleText;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
        CommonMessageData commonMessageData = gameRevenueTipsMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GameRevenueTipsMessage gameRevenueTipsMessage) {
        LJ(gameRevenueTipsMessage);
    }

    @Override // X.C0IMD
    public final GameRevenueTipsMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameRevenueTipsMessage gameRevenueTipsMessage, List list) {
    }
}
