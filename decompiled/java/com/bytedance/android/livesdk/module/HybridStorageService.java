package com.bytedance.android.livesdk.module;

import X.C1323720kYE;
import android.content.Context;
import com.bytedance.android.live.browser.IHybridStorageService;

/* JADX INFO: loaded from: classes29.dex */
public class HybridStorageService implements IHybridStorageService {
    @Override // com.bytedance.android.live.browser.IHybridStorageService
    public final boolean HW1(Context context, String str, String str2) {
        return C1323720kYE.LIZ(context).LJ(str2, str);
    }

    @Override // com.bytedance.android.live.browser.IHybridStorageService
    public final <T> T Pp2(Context context, String str, String str2) {
        T t = (T) C1323720kYE.LIZ(context).LJIIIZ(str2, str);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // com.bytedance.android.live.browser.IHybridStorageService
    public final boolean CM(Context context, Object obj, String str, String str2) {
        return C1323720kYE.LIZ(context).LIZIZ(obj, str2, str);
    }
}
