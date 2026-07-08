package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PreviewPeriod_ProtoDecoder implements C0IMD<PreviewPeriod> {
    public static PreviewPeriod LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PreviewPeriod previewPeriod = new PreviewPeriod();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 25) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            previewPeriod.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        previewPeriod.promot = _BattlePrompt_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    previewPeriod.duration = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return previewPeriod;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PreviewPeriod previewPeriod) {
        PreviewPeriod previewPeriod2 = previewPeriod;
        BattlePrompt battlePrompt = previewPeriod2.promot;
        if (battlePrompt != null) {
            _BattlePrompt_ProtoDecoder.LJ(battlePrompt);
        }
        ImageModel imageModel = previewPeriod2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final PreviewPeriod LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PreviewPeriod previewPeriod, List list) {
    }
}
