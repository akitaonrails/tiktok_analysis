package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.TextEffect;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TextEffect_ProtoDecoder implements C0IMD<TextEffect> {
    public static TextEffect LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TextEffect textEffect = new TextEffect();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        textEffect.landscapeDetail = _TextEffect_Detail_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    textEffect.portraitDetail = _TextEffect_Detail_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return textEffect;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TextEffect textEffect) {
        TextEffect textEffect2 = textEffect;
        TextEffect.Detail detail = textEffect2.portraitDetail;
        if (detail != null) {
            Text text = detail.text;
            if (text != null) {
                _Text_ProtoDecoder.LJ(text);
            }
            ImageModel imageModel = detail.background;
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
        TextEffect.Detail detail2 = textEffect2.landscapeDetail;
        if (detail2 != null) {
            Text text2 = detail2.text;
            if (text2 != null) {
                _Text_ProtoDecoder.LJ(text2);
            }
            ImageModel imageModel2 = detail2.background;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
    }

    @Override // X.C0IMD
    public final TextEffect LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextEffect textEffect, List list) {
    }
}
