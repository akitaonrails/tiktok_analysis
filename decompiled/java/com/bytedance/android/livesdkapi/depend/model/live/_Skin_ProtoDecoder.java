package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Skin_ProtoDecoder implements C0IMD<Skin> {
    public static Skin LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Skin skin = new Skin();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            skin.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        skin.drawerEntrance = _SkinDrawerEntrance_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    skin.account = _SkinHostAccount_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return skin;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Skin skin) {
        ImageModel imageModel;
        ImageModel imageModel2;
        Skin skin2 = skin;
        SkinHostAccount skinHostAccount = skin2.account;
        if (skinHostAccount != null && (imageModel2 = skinHostAccount.bgImage) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        SkinDrawerEntrance skinDrawerEntrance = skin2.drawerEntrance;
        if (skinDrawerEntrance != null && (imageModel = skinDrawerEntrance.cover) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final Skin LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Skin skin, List list) {
    }
}
