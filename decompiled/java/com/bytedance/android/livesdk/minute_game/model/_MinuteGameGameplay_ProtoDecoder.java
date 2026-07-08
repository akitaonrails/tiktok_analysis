package com.bytedance.android.livesdk.minute_game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MinuteGameGameplay_ProtoDecoder implements C0IMD<MinuteGameGameplay> {
    public static MinuteGameGameplay LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MinuteGameGameplay minuteGameGameplay = new MinuteGameGameplay();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        minuteGameGameplay.gameplayId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        minuteGameGameplay.gameType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        minuteGameGameplay.status = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        minuteGameGameplay.progressTime = _MinuteGameProgressTime_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        minuteGameGameplay.triggerGift = _TriggerGift_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        minuteGameGameplay.rejectReason = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        minuteGameGameplay.finishReason = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        minuteGameGameplay.senderId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return minuteGameGameplay;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MinuteGameGameplay minuteGameGameplay) {
        ImageModel imageModel;
        TriggerGift triggerGift = minuteGameGameplay.triggerGift;
        if (triggerGift != null && (imageModel = triggerGift.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final MinuteGameGameplay LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MinuteGameGameplay minuteGameGameplay, List list) {
    }
}
