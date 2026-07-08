package com.ss.android.ugc.aweme.account;

import X.C04TD;
import X.C0X99;
import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.IPreLoginHandleService;

/* JADX INFO: loaded from: classes3.dex */
public final class PreLoginHandleService implements IPreLoginHandleService {
    public static IPreLoginHandleService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IPreLoginHandleService.class, false);
        if (objLIZ != null) {
            return (IPreLoginHandleService) objLIZ;
        }
        if (C04TD.LJLIIIL == null) {
            synchronized (IPreLoginHandleService.class) {
                if (C04TD.LJLIIIL == null) {
                    C04TD.LJLIIIL = new PreLoginHandleService();
                }
            }
        }
        return C04TD.LJLIIIL;
    }

    @Override // com.ss.android.ugc.aweme.IPreLoginHandleService
    public final Intent LIZ(Activity activity, Intent intent, String str) {
        return C0X99.LIZ(activity, intent, str);
    }
}
