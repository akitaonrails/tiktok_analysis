package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.TPText;
import webcast.data._TPText_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _BubbleDecoration_ProtoDecoder implements C0IMD<BubbleDecoration> {
    public static BubbleDecoration LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BubbleDecoration bubbleDecoration = new BubbleDecoration();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                bubbleDecoration.tpText = _TPText_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            bubbleDecoration.text = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        bubbleDecoration.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    bubbleDecoration.decorationType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bubbleDecoration;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BubbleDecoration bubbleDecoration) {
        BubbleDecoration bubbleDecoration2 = bubbleDecoration;
        ImageModel imageModel = bubbleDecoration2.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text = bubbleDecoration2.text;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        TPText tPText = bubbleDecoration2.tpText;
        if (tPText != null) {
            _TPText_ProtoDecoder.LJ(tPText);
        }
    }

    @Override // X.C0IMD
    public final BubbleDecoration LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BubbleDecoration bubbleDecoration, List list) {
    }
}
