package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PrivilegeDynamicEffectMessage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PrivilegeDynamicEffectMessage_FontStyle_ProtoDecoder implements C0IMD<PrivilegeDynamicEffectMessage.FontStyle> {
    public static PrivilegeDynamicEffectMessage.FontStyle LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PrivilegeDynamicEffectMessage.FontStyle fontStyle = new PrivilegeDynamicEffectMessage.FontStyle();
        fontStyle.strokeConfigList = new ArrayList();
        fontStyle.shadowConfigList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        fontStyle.maxLines = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        fontStyle.fontSize = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        fontStyle.fontColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        fontStyle.weight = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        fontStyle.enableShadow = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        fontStyle.shadowConfigList.add(_PrivilegeDynamicEffectMessage_FontStyle_ShadowConfig_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        fontStyle.enableStroke = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        fontStyle.strokeConfigList.add(_PrivilegeDynamicEffectMessage_FontStyle_StrokeConfig_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        fontStyle.horizontalAlign = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        fontStyle.verticalAlign = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fontStyle;
            }
        }
    }

    public static void LJ(PrivilegeDynamicEffectMessage.FontStyle fontStyle) {
        List<PrivilegeDynamicEffectMessage.FontStyle.ShadowConfig> list = fontStyle.shadowConfigList;
        if (list == null) {
            fontStyle.shadowConfigList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PrivilegeDynamicEffectMessage.FontStyle.ShadowConfig> it2 = fontStyle.shadowConfigList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<PrivilegeDynamicEffectMessage.FontStyle.StrokeConfig> list2 = fontStyle.strokeConfigList;
        if (list2 == null) {
            fontStyle.strokeConfigList = new ArrayList();
        } else {
            if (list2.isEmpty()) {
                return;
            }
            Iterator<PrivilegeDynamicEffectMessage.FontStyle.StrokeConfig> it3 = fontStyle.strokeConfigList.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PrivilegeDynamicEffectMessage.FontStyle fontStyle) {
        LJ(fontStyle);
    }

    @Override // X.C0IMD
    public final PrivilegeDynamicEffectMessage.FontStyle LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PrivilegeDynamicEffectMessage.FontStyle fontStyle, List list) {
    }
}
