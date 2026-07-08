package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SkinHostAccount_ProtoDecoder implements C0IMD<SkinHostAccount> {
    public static SkinHostAccount LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SkinHostAccount skinHostAccount = new SkinHostAccount();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 2) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    skinHostAccount.bgImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return skinHostAccount;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SkinHostAccount skinHostAccount) {
        ImageModel imageModel = skinHostAccount.bgImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final SkinHostAccount LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SkinHostAccount skinHostAccount, List list) {
    }
}
