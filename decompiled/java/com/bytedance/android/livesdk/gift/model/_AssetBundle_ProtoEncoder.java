package com.bytedance.android.livesdk.gift.model;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _AssetBundle_ProtoEncoder implements InterfaceC1132110fZB<AssetBundle> {
    public static void LIZIZ(C1142350fph c1142350fph, AssetBundle assetBundle) {
        List<AssetsModel> list = assetBundle.assets;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < assetBundle.assets.size(); i++) {
                _AssetsModel_ProtoEncoder.LIZJ(c1142350fph, 1, (AssetsModel) ListProtector.get(assetBundle.assets, i));
            }
        }
        AssetBundle.PrefabBundle prefabBundle = assetBundle.prefabBundle;
        if (prefabBundle != null) {
            c1142350fph.LIZLLL(2, 2);
            c1142350fph.LJ(_AssetBundle_PrefabBundle_ProtoEncoder.LIZJ(prefabBundle));
            _AssetBundle_PrefabBundle_ProtoEncoder.LIZIZ(c1142350fph, prefabBundle);
        }
        GiftEffectStreamSpec giftEffectStreamSpec = assetBundle.streamEffectSpec;
        if (giftEffectStreamSpec != null) {
            c1142350fph.LIZLLL(3, 2);
            c1142350fph.LJ(_GiftEffectStreamSpec_ProtoEncoder.LIZJ(giftEffectStreamSpec));
            _GiftEffectStreamSpec_ProtoEncoder.LIZIZ(c1142350fph, giftEffectStreamSpec);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, AssetBundle assetBundle) {
        LIZIZ(c1142350fph, assetBundle);
    }
}
