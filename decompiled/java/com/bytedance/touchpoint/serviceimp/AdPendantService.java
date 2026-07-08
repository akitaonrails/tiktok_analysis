package com.bytedance.touchpoint.serviceimp;

import X.C19719512Dh;
import com.bytedance.touchpoint.api.service.IAdPendantService;
import com.bytedance.touchpoint.core.pendant.ad.AdFeedTimerPendantManager;

/* JADX INFO: loaded from: classes3.dex */
public final class AdPendantService implements IAdPendantService {
    @Override // com.bytedance.touchpoint.api.service.IAdPendantService
    public final void LIZ(String str) {
        C19719512Dh.LIZJ(AdFeedTimerPendantManager.LLJJL).remove(str);
    }
}
