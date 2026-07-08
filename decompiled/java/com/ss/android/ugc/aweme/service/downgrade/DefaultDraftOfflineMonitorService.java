package com.ss.android.ugc.aweme.service.downgrade;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.service.IDraftOfflineMonitorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class DefaultDraftOfflineMonitorService implements IDraftOfflineMonitorService {
    @Override // com.ss.android.ugc.aweme.service.IDraftOfflineMonitorService
    public final Object LIZ(AwS552S0100000_8 awS552S0100000_8) {
        try {
            return awS552S0100000_8.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IDraftOfflineMonitorService
    public final <T> T LIZIZ(Function0<? extends T> function0) {
        try {
            return function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }
}
