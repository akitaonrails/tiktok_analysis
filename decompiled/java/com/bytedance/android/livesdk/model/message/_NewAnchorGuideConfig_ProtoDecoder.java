package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NewAnchorGuideConfig_ProtoDecoder implements C0IMD<NewAnchorGuideConfig> {
    public static NewAnchorGuideConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NewAnchorGuideConfig newAnchorGuideConfig = new NewAnchorGuideConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        newAnchorGuideConfig.anchorId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        newAnchorGuideConfig.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        newAnchorGuideConfig.iconStyle = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        newAnchorGuideConfig.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        newAnchorGuideConfig.button = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        newAnchorGuideConfig.text = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        newAnchorGuideConfig.displayDuration = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        newAnchorGuideConfig.effectParams = _NewAnchorEffectParams_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        newAnchorGuideConfig.displayType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return newAnchorGuideConfig;
            }
        }
    }

    public static void LJ(NewAnchorGuideConfig newAnchorGuideConfig) {
        ImageModel imageModel = newAnchorGuideConfig.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text = newAnchorGuideConfig.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = newAnchorGuideConfig.button;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        Text text3 = newAnchorGuideConfig.text;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(NewAnchorGuideConfig newAnchorGuideConfig) {
        LJ(newAnchorGuideConfig);
    }

    @Override // X.C0IMD
    public final NewAnchorGuideConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NewAnchorGuideConfig newAnchorGuideConfig, List list) {
    }
}
