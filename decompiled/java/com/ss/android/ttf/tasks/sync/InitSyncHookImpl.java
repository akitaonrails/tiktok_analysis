package com.ss.android.ttf.tasks.sync;

import X.C1519690peJ;
import X.C1519750peP;
import X.C1554440qYM;
import X.C1785606z0;
import X.C1827607Du;
import X.InterfaceC1526670ppZ;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sync.IInitSyncHook;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class InitSyncHookImpl implements IInitSyncHook {
    @Override // com.ss.android.ugc.aweme.sync.IInitSyncHook
    public final boolean LIZJ() {
        return ((Boolean) C1827607Du.LIZJ(C1785606z0.LIZ(), Boolean.TRUE, AFwS212S0000000_23.get$arr$(55))).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.sync.IInitSyncHook
    public final String LIZLLL() {
        return "https://bsync-va.tiktokv.com";
    }

    @Override // com.ss.android.ugc.aweme.sync.IInitSyncHook
    public final String LJ() {
        return "frontier-va.tiktokv.com";
    }

    @Override // com.ss.android.ugc.aweme.sync.IInitSyncHook
    public final InterfaceC1526670ppZ LIZ(C1519750peP c1519750peP) {
        return new C1519690peJ(c1519750peP);
    }

    @Override // com.ss.android.ugc.aweme.sync.IInitSyncHook
    public final void LIZIZ(AwS567S0100000_23 awS567S0100000_23) {
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJIILL(new C1554440qYM(awS567S0100000_23, 1));
        }
    }
}
