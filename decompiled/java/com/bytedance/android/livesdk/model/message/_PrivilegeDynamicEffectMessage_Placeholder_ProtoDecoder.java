package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PrivilegeDynamicEffectMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PrivilegeDynamicEffectMessage_Placeholder_ProtoDecoder implements C0IMD<PrivilegeDynamicEffectMessage.Placeholder> {
    public static PrivilegeDynamicEffectMessage.Placeholder LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PrivilegeDynamicEffectMessage.Placeholder placeholder = new PrivilegeDynamicEffectMessage.Placeholder();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        placeholder.placeType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        placeholder.targetImage = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        placeholder.targetWidth = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        placeholder.targetHeight = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        placeholder.text = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        placeholder.fontStyle = _PrivilegeDynamicEffectMessage_FontStyle_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        placeholder.imagePadding = _PrivilegeDynamicEffectMessage_Placeholder_ImagePadding_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return placeholder;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PrivilegeDynamicEffectMessage.Placeholder placeholder) {
        PrivilegeDynamicEffectMessage.Placeholder placeholder2 = placeholder;
        Text text = placeholder2.text;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        PrivilegeDynamicEffectMessage.FontStyle fontStyle = placeholder2.fontStyle;
        if (fontStyle != null) {
            _PrivilegeDynamicEffectMessage_FontStyle_ProtoDecoder.LJ(fontStyle);
        }
    }

    @Override // X.C0IMD
    public final PrivilegeDynamicEffectMessage.Placeholder LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PrivilegeDynamicEffectMessage.Placeholder placeholder, List list) {
    }
}
