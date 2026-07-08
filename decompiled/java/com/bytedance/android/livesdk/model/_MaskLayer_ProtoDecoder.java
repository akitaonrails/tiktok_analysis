package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MaskLayer_ProtoDecoder implements C0IMD<MaskLayer> {
    public static MaskLayer LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MaskLayer maskLayer = new MaskLayer();
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
                                maskLayer.punishInfo = _PunishEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            maskLayer.maskLayerType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        maskLayer.subTitle = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    maskLayer.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return maskLayer;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MaskLayer maskLayer) {
        MaskLayer maskLayer2 = maskLayer;
        Text text = maskLayer2.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = maskLayer2.subTitle;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final MaskLayer LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MaskLayer maskLayer, List list) {
    }
}
