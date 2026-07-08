package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AssetBundle_ProtoDecoder implements C0IMD<AssetBundle> {
    public static AssetBundle LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AssetBundle assetBundle = new AssetBundle();
        assetBundle.assets = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            assetBundle.streamEffectSpec = _GiftEffectStreamSpec_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        assetBundle.prefabBundle = _AssetBundle_PrefabBundle_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    assetBundle.assets.add(_AssetsModel_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return assetBundle;
            }
        }
    }

    public static void LJ(AssetBundle assetBundle) {
        List<AssetsModel> list = assetBundle.assets;
        if (list == null) {
            assetBundle.assets = new ArrayList();
        } else if (!list.isEmpty()) {
            for (AssetsModel assetsModel : assetBundle.assets) {
                if (assetsModel != null) {
                    _AssetsModel_ProtoDecoder.LJ(assetsModel);
                }
            }
        }
        AssetBundle.PrefabBundle prefabBundle = assetBundle.prefabBundle;
        if (prefabBundle != null && prefabBundle.prefabEffectIds == null) {
            prefabBundle.prefabEffectIds = new ArrayList();
        }
        GiftEffectStreamSpec giftEffectStreamSpec = assetBundle.streamEffectSpec;
        if (giftEffectStreamSpec != null && giftEffectStreamSpec.extraAssetIds == null) {
            giftEffectStreamSpec.extraAssetIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AssetBundle assetBundle) {
        LJ(assetBundle);
    }

    @Override // X.C0IMD
    public final AssetBundle LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AssetBundle assetBundle, List list) {
    }
}
