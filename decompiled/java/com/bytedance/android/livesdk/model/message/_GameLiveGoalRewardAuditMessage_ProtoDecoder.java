package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model.LiveGoalReward;
import com.bytedance.android.livesdk.game.model._LiveGoalReward_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameLiveGoalRewardAuditMessage_ProtoDecoder implements C0IMD<GameLiveGoalRewardAuditMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameLiveGoalRewardAuditMessage gameLiveGoalRewardAuditMessage) {
        GameLiveGoalRewardAuditMessage gameLiveGoalRewardAuditMessage2 = gameLiveGoalRewardAuditMessage;
        CommonMessageData commonMessageData = gameLiveGoalRewardAuditMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        LiveGoalReward liveGoalReward = gameLiveGoalRewardAuditMessage2.liveGoalReward;
        if (liveGoalReward != null) {
            _LiveGoalReward_ProtoDecoder.LJ(liveGoalReward);
        }
    }

    @Override // X.C0IMD
    public final GameLiveGoalRewardAuditMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameLiveGoalRewardAuditMessage gameLiveGoalRewardAuditMessage = new GameLiveGoalRewardAuditMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        gameLiveGoalRewardAuditMessage.liveGoalReward = _LiveGoalReward_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    gameLiveGoalRewardAuditMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameLiveGoalRewardAuditMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameLiveGoalRewardAuditMessage gameLiveGoalRewardAuditMessage, List list) {
    }
}
