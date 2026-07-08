package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PrivilegeDynamicEffectMessage;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PrivilegeDynamicEffectMessage_FontStyle_ShadowConfig_ProtoDecoder implements C0IMD<PrivilegeDynamicEffectMessage.FontStyle.ShadowConfig> {
    public static PrivilegeDynamicEffectMessage.FontStyle.ShadowConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PrivilegeDynamicEffectMessage.FontStyle.ShadowConfig shadowConfig = new PrivilegeDynamicEffectMessage.FontStyle.ShadowConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 6:
                        shadowConfig.shadowColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        shadowConfig.shadowDx = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        shadowConfig.shadowDy = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        shadowConfig.shadowRadius = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return shadowConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final PrivilegeDynamicEffectMessage.FontStyle.ShadowConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PrivilegeDynamicEffectMessage.FontStyle.ShadowConfig shadowConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PrivilegeDynamicEffectMessage.FontStyle.ShadowConfig shadowConfig, List list) {
    }
}
