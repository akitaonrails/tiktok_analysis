package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SkinDrawerEntrance_ProtoDecoder implements C0IMD<SkinDrawerEntrance> {
    public static SkinDrawerEntrance LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SkinDrawerEntrance skinDrawerEntrance = new SkinDrawerEntrance();
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
                                skinDrawerEntrance.titleKey = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            skinDrawerEntrance.title = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        skinDrawerEntrance.cover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    skinDrawerEntrance.style = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return skinDrawerEntrance;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SkinDrawerEntrance skinDrawerEntrance) {
        ImageModel imageModel = skinDrawerEntrance.cover;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final SkinDrawerEntrance LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SkinDrawerEntrance skinDrawerEntrance, List list) {
    }
}
