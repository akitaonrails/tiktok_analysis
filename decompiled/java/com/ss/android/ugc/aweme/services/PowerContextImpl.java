package com.ss.android.ugc.aweme.services;

import X.C04TD;
import X.C1BWL;
import android.app.Application;
import com.bytedance.ies.powerlist.IPowerContext;

/* JADX INFO: loaded from: classes3.dex */
public final class PowerContextImpl implements IPowerContext {
    public static final int $stable = 0;

    @Override // com.bytedance.ies.powerlist.IPowerContext
    public Application getApplication() {
        return C1BWL.LIZ();
    }

    public static IPowerContext createIPowerContextbyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IPowerContext.class, z);
        if (objLIZ != null) {
            return (IPowerContext) objLIZ;
        }
        if (C04TD.F4 == null) {
            synchronized (IPowerContext.class) {
                if (C04TD.F4 == null) {
                    C04TD.F4 = new PowerContextImpl();
                }
            }
        }
        return C04TD.F4;
    }
}
