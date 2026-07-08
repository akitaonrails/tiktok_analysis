package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CeremonyEffect_ProtoDecoder implements C0IMD<CeremonyEffect> {
    public static CeremonyEffect LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CeremonyEffect ceremonyEffect = new CeremonyEffect();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        ceremonyEffect.avatarBorder = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    ceremonyEffect.gradeBackground = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ceremonyEffect;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CeremonyEffect ceremonyEffect) {
        CeremonyEffect ceremonyEffect2 = ceremonyEffect;
        ImageModel imageModel = ceremonyEffect2.gradeBackground;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = ceremonyEffect2.avatarBorder;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final CeremonyEffect LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CeremonyEffect ceremonyEffect, List list) {
    }
}
