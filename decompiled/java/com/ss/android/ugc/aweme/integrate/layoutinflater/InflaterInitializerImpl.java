package com.ss.android.ugc.aweme.integrate.layoutinflater;

import X.C19500811Re;
import X.C2214201BlK;
import X.C2344809Gs;
import android.app.Activity;
import com.ss.android.ugc.aweme.InflaterInitializer;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;

/* JADX INFO: loaded from: classes4.dex */
public final class InflaterInitializerImpl implements InflaterInitializer {
    @Override // com.ss.android.ugc.aweme.InflaterInitializer
    public final C19500811Re LIZ() {
        return C2214201BlK.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.InflaterInitializer
    public final Class<? extends Activity> LIZIZ() {
        Class<? extends Activity> mainActivityClass = ((IMainService) ServiceManager.get().getService(IMainService.class)).getMainActivityClass();
        if (mainActivityClass != null) {
            return mainActivityClass;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.InflaterInitializer
    public final void LIZJ(String str) {
        C2344809Gs.LJ(str);
    }
}
