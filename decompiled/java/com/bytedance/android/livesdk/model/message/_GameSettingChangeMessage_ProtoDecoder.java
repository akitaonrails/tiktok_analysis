package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.data.UserSetting;
import webcast.data._UserSetting_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GameSettingChangeMessage_ProtoDecoder implements C0IMD<GameSettingChangeMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameSettingChangeMessage gameSettingChangeMessage) {
        GameSettingChangeMessage gameSettingChangeMessage2 = gameSettingChangeMessage;
        CommonMessageData commonMessageData = gameSettingChangeMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Map<Long, UserSetting> map = gameSettingChangeMessage2.currentUserSetting;
        if (map == null) {
            gameSettingChangeMessage2.currentUserSetting = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<Long, UserSetting>> it2 = gameSettingChangeMessage2.currentUserSetting.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final GameSettingChangeMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameSettingChangeMessage gameSettingChangeMessage = new GameSettingChangeMessage();
        gameSettingChangeMessage.currentUserSetting = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        UserSetting userSettingLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    userSettingLIZLLL = _UserSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (lValueOf != null) {
                            if (userSettingLIZLLL != null) {
                                gameSettingChangeMessage.currentUserSetting.put(lValueOf, userSettingLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    gameSettingChangeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameSettingChangeMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameSettingChangeMessage gameSettingChangeMessage, List list) {
    }
}
