package com.ss.android.ugc.mediabox.arch.viewmodel;

import androidx.lifecycle.ViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SimViewModel extends ViewModel {
    public final Map<String, Object> LL = new HashMap();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        synchronized (this.LL) {
            try {
                for (Object obj : ((HashMap) this.LL).values()) {
                    if (obj instanceof Closeable) {
                        try {
                            ((Closeable) obj).close();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
