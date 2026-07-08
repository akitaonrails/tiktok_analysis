package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AssetBundle_PrefabBundle_ProtoDecoder implements C0IMD<AssetBundle.PrefabBundle> {
    public static AssetBundle.PrefabBundle LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AssetBundle.PrefabBundle prefabBundle = new AssetBundle.PrefabBundle();
        prefabBundle.prefabEffectIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 2) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    prefabBundle.prefabEffectIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return prefabBundle;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AssetBundle.PrefabBundle prefabBundle) {
        AssetBundle.PrefabBundle prefabBundle2 = prefabBundle;
        if (prefabBundle2.prefabEffectIds == null) {
            prefabBundle2.prefabEffectIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final AssetBundle.PrefabBundle LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AssetBundle.PrefabBundle prefabBundle, List list) {
    }
}
