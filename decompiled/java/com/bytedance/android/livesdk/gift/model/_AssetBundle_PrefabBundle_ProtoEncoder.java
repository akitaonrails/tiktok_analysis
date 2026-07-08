package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _AssetBundle_PrefabBundle_ProtoEncoder implements InterfaceC1132110fZB<AssetBundle.PrefabBundle> {
    public static int LIZJ(AssetBundle.PrefabBundle prefabBundle) {
        List<Long> list = prefabBundle.prefabEffectIds;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int iLJIILIIL = 0;
        for (int i = 0; i < prefabBundle.prefabEffectIds.size(); i++) {
            iLJIILIIL += C1142340fpg.LJIILIIL(2, (Long) ListProtector.get(prefabBundle.prefabEffectIds, i));
        }
        return iLJIILIIL;
    }

    public static void LIZIZ(C1142350fph c1142350fph, AssetBundle.PrefabBundle prefabBundle) {
        List<Long> list = prefabBundle.prefabEffectIds;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < prefabBundle.prefabEffectIds.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 2, (Long) ListProtector.get(prefabBundle.prefabEffectIds, i));
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, AssetBundle.PrefabBundle prefabBundle) {
        LIZIZ(c1142350fph, prefabBundle);
    }
}
