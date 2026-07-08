package com.ss.android.ugc.aweme.impl;

import X.C104100aN;
import X.C1832007Fm;
import X.C1832307Fp;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class PerformanceOptAddDiffServiceImpl implements IPerformanceOptAppDiffService {
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService
    public final boolean LIZJ() {
        return C104100aN.LIZ().LJJIJ(AFwS189S0000000_3.get$arr$(487));
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService
    public final boolean LJ() {
        if (C104100aN.LIZ().LJJIIJ()) {
            return C104100aN.LIZ().LJJIJLIJ(AFwS189S0000000_3.get$arr$(1780));
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService
    public final boolean LJFF() {
        if (C104100aN.LIZ().LJII()) {
            return C104100aN.LIZ().LJII();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService
    public final boolean LJI() {
        if (C104100aN.LIZ().isNewUser()) {
            return C104100aN.LIZ().LJJIJLIJ(AFwS189S0000000_3.get$arr$(1782));
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService
    public final boolean LJII() {
        return C104100aN.LIZ().LJJIJ(AFwS189S0000000_3.get$arr$(478));
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService
    public final long LIZLLL() {
        return C1832007Fm.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService
    public final boolean LIZIZ(boolean z) {
        IPerformanceOptAppDiffService iPerformanceOptAppDiffService;
        if (z) {
            if (C104100aN.LIZ().LJJIL() && C104100aN.LIZ().isNewUser()) {
                C1832307Fp.LIZ.getClass();
                if (C1832307Fp.LIZIZ() || C1832307Fp.LIZ() || ((iPerformanceOptAppDiffService = (IPerformanceOptAppDiffService) PluggableExtentionKt.pluggableSpi$default(IPerformanceOptAppDiffService.class, false, false, false, 14, null)) != null && iPerformanceOptAppDiffService.LJFF())) {
                    this.LIZ = false;
                    return false;
                }
            }
            this.LIZ = true;
            return true;
        }
        return this.LIZ;
    }
}
