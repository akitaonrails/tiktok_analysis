package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MsgNotifyComponentAvoidRuleV2_ProtoDecoder implements C0IMD<MsgNotifyComponentAvoidRuleV2> {
    public static MsgNotifyComponentAvoidRuleV2 LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2 = new MsgNotifyComponentAvoidRuleV2();
        msgNotifyComponentAvoidRuleV2.avoidScene = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        msgNotifyComponentAvoidRuleV2.componentType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        msgNotifyComponentAvoidRuleV2.subComponentType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        msgNotifyComponentAvoidRuleV2.canBeInterrupt = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        msgNotifyComponentAvoidRuleV2.firstRecoverInfo = _MsgNotifyComponentRecoverInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        msgNotifyComponentAvoidRuleV2.interruptRecoverInfo = _MsgNotifyComponentRecoverInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        msgNotifyComponentAvoidRuleV2.maxActiveCount = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        msgNotifyComponentAvoidRuleV2.priority = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        msgNotifyComponentAvoidRuleV2.avoidScene.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        msgNotifyComponentAvoidRuleV2.recoverThresholdMs = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        msgNotifyComponentAvoidRuleV2.maxRecoverRemainMs = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        msgNotifyComponentAvoidRuleV2.avoidWatchEarlyMs = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return msgNotifyComponentAvoidRuleV2;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2) {
        MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV22 = msgNotifyComponentAvoidRuleV2;
        if (msgNotifyComponentAvoidRuleV22.avoidScene == null) {
            msgNotifyComponentAvoidRuleV22.avoidScene = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final MsgNotifyComponentAvoidRuleV2 LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2, List list) {
    }
}
