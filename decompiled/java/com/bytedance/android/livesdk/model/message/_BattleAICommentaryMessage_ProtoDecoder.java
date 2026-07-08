package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleAICommentaryMessage_ProtoDecoder implements C0IMD<BattleAICommentaryMessage> {
    @Override // X.C0IMD
    public final void LIZ(BattleAICommentaryMessage battleAICommentaryMessage) {
        CommonMessageData commonMessageData = battleAICommentaryMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final BattleAICommentaryMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BattleAICommentaryMessage battleAICommentaryMessage = new BattleAICommentaryMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 101) {
                    if (iLJI != 102) {
                        switch (iLJI) {
                            case 1:
                                battleAICommentaryMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 2:
                                battleAICommentaryMessage.battleMeta = _BattleMeta_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 3:
                                battleAICommentaryMessage.commentaryMeta = _AudioMeta_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 4:
                                battleAICommentaryMessage.audioStream = c1516680pZS.LJII();
                                break;
                            case 5:
                                battleAICommentaryMessage.subtitle = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 6:
                                battleAICommentaryMessage.timestampOrigin = c1516680pZS.LJIIJJI();
                                break;
                            case 7:
                                battleAICommentaryMessage.timestampExpire = c1516680pZS.LJIIJJI();
                                break;
                            case 8:
                                battleAICommentaryMessage.commentaryId = c1516680pZS.LJIIJJI();
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                    } else {
                        battleAICommentaryMessage.isSharePerfOn = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    battleAICommentaryMessage.extra = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleAICommentaryMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleAICommentaryMessage battleAICommentaryMessage, List list) {
    }
}
