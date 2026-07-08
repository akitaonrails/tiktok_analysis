package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftEffect_ProtoEncoder implements InterfaceC1132110fZB<GiftEffect> {
    public static void LIZIZ(C1142350fph c1142350fph, GiftEffect giftEffect) {
        List<AssetsModel> list = giftEffect.assets;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < giftEffect.assets.size(); i++) {
                _AssetsModel_ProtoEncoder.LIZJ(c1142350fph, 1, (AssetsModel) ListProtector.get(giftEffect.assets, i));
            }
        }
        GiftEffectSpecs giftEffectSpecs = giftEffect.specs;
        if (giftEffectSpecs != null) {
            c1142350fph.LIZLLL(2, 2);
            c1142350fph.LJ(_GiftEffectSpecs_ProtoEncoder.LIZJ(giftEffectSpecs));
            _GiftEffectSpecs_ProtoEncoder.LIZIZ(c1142350fph, giftEffectSpecs);
        }
        Map<String, String> map = giftEffect.eventTrackingParams;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : giftEffect.eventTrackingParams.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c1142350fph.LIZLLL(5, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILL(1, entry.getKey()) + C1142340fpg.LJIILL(2, entry.getValue()));
                    C1142340fpg.LJFF(c1142350fph, 1, entry.getKey());
                    C1142340fpg.LJFF(c1142350fph, 2, entry.getValue());
                }
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, GiftEffect giftEffect) {
        LIZIZ(c1142350fph, giftEffect);
    }
}
