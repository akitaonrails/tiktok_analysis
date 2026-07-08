package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model.GameServerFeature;
import com.bytedance.android.livesdk.game.model._GameServerFeature_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameServerFeatureMessage_ProtoDecoder implements C0IMD<GameServerFeatureMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameServerFeatureMessage gameServerFeatureMessage) {
        GameServerFeatureMessage gameServerFeatureMessage2 = gameServerFeatureMessage;
        CommonMessageData commonMessageData = gameServerFeatureMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<GameServerFeature> list = gameServerFeatureMessage2.allFeatures;
        if (list == null) {
            gameServerFeatureMessage2.allFeatures = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GameServerFeature gameServerFeature : gameServerFeatureMessage2.allFeatures) {
            if (gameServerFeature != null && gameServerFeature.valueMap == null) {
                gameServerFeature.valueMap = new HashMap();
            }
        }
    }

    @Override // X.C0IMD
    public final GameServerFeatureMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameServerFeatureMessage gameServerFeatureMessage = new GameServerFeatureMessage();
        gameServerFeatureMessage.allFeatures = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        gameServerFeatureMessage.allFeatures.add(_GameServerFeature_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    gameServerFeatureMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameServerFeatureMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameServerFeatureMessage gameServerFeatureMessage, List list) {
    }
}
