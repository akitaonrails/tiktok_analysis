package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.GamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.RandomMatchContent;
import com.bytedance.android.livesdk.chatroom.model.interact._BattleGamePlayContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._GamePlayContent_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._RandomMatchContent_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinGroupDirectBizContent_ProtoDecoder implements C0IMD<JoinGroupDirectBizContent> {
    public static JoinGroupDirectBizContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        JoinGroupDirectBizContent joinGroupDirectBizContent = new JoinGroupDirectBizContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            joinGroupDirectBizContent.skipCancelMatch = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        joinGroupDirectBizContent.randomMatchContent = _RandomMatchContent_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    joinGroupDirectBizContent.gameplayContent = _GamePlayContent_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return joinGroupDirectBizContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(JoinGroupDirectBizContent joinGroupDirectBizContent) {
        BattleGamePlayContent battleGamePlayContent;
        JoinGroupDirectBizContent joinGroupDirectBizContent2 = joinGroupDirectBizContent;
        GamePlayContent gamePlayContent = joinGroupDirectBizContent2.gameplayContent;
        if (gamePlayContent != null && (battleGamePlayContent = gamePlayContent.battleGameplayContent) != null) {
            _BattleGamePlayContent_ProtoDecoder.LJ(battleGamePlayContent);
        }
        RandomMatchContent randomMatchContent = joinGroupDirectBizContent2.randomMatchContent;
        if (randomMatchContent != null) {
            _RandomMatchContent_ProtoDecoder.LJ(randomMatchContent);
        }
    }

    @Override // X.C0IMD
    public final JoinGroupDirectBizContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinGroupDirectBizContent joinGroupDirectBizContent, List list) {
    }
}
