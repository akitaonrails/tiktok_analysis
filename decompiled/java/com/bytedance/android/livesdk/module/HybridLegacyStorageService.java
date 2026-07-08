package com.bytedance.android.livesdk.module;

import X.C1505830pHx;
import android.content.Context;
import com.bytedance.android.live.browser.IHybridLegacyStorageService;

/* JADX INFO: loaded from: classes24.dex */
public class HybridLegacyStorageService implements IHybridLegacyStorageService {
    @Override // com.bytedance.android.live.browser.IHybridLegacyStorageService
    public final String M41(Context context, String str) {
        return C1505830pHx.LIZ(context, str);
    }

    @Override // com.bytedance.android.live.browser.IHybridLegacyStorageService
    public final void au0(Context context, String str) {
        C1505830pHx.LIZIZ(context, str, "1");
    }
}
