package com.ss.android.ugc.aweme.services.editeffect;

import X.C04TD;
import android.util.LruCache;

/* JADX INFO: loaded from: classes3.dex */
public final class EffectAnchorServiceImpl implements IEffectAnchorService {
    public final LruCache<String, EditEffectAnchorManager> dataCache = new LruCache<>(3);

    public static IEffectAnchorService createIEffectAnchorServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IEffectAnchorService.class, z);
        if (objLIZ != null) {
            return (IEffectAnchorService) objLIZ;
        }
        if (C04TD.I4 == null) {
            synchronized (IEffectAnchorService.class) {
                if (C04TD.I4 == null) {
                    C04TD.I4 = new EffectAnchorServiceImpl();
                }
            }
        }
        return C04TD.I4;
    }

    @Override // com.ss.android.ugc.aweme.services.editeffect.IEffectAnchorService
    public EditEffectAnchorManager getData(String str) {
        return this.dataCache.get(str);
    }

    @Override // com.ss.android.ugc.aweme.services.editeffect.IEffectAnchorService
    public void setData(String str, EditEffectAnchorManager editEffectAnchorManager) {
        this.dataCache.put(str, editEffectAnchorManager);
    }
}
