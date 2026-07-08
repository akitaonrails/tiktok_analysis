package tikcast.api.creator_succ;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveGoalParam_ProtoDecoder implements C0IMD<LiveGoalParam> {
    public static LiveGoalParam LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveGoalParam liveGoalParam = new LiveGoalParam();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        liveGoalParam.giftNum = c1516680pZS.LJIIJJI();
                    }
                } else {
                    liveGoalParam.giftInfo = _Gift_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveGoalParam;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveGoalParam liveGoalParam) {
        Gift gift = liveGoalParam.giftInfo;
        if (gift != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
    }

    @Override // X.C0IMD
    public final LiveGoalParam LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveGoalParam liveGoalParam, List list) {
    }
}
