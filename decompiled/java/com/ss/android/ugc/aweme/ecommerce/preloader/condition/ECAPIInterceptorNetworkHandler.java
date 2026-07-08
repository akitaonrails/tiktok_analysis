package com.ss.android.ugc.aweme.ecommerce.preloader.condition;

import X.C054G;
import X.C098200Yq;
import X.C09A1;
import X.C0PEM;
import X.C0XM9;
import X.C1499330p7T;
import X.C1507440pKY;
import X.C1507470pKb;
import X.C1507530pKh;
import X.C1507580pKm;
import X.C189200o6;
import X.C2126308Ur;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C718040SEo;
import X.InterfaceC2027307wt;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.network.config.EcPbNaPrefetchOptConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes24.dex */
public final class ECAPIInterceptorNetworkHandler implements NetworkPartner.RequestHandler, NetworkPartner.ResponseHandler {
    public static final C1507470pKb<String, C1507530pKh> LIZLLL = new C1507470pKb<>(8, Float.valueOf(0.5f));
    public static final C054G LJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C2126308Ur.LIZJ));
    public static final C054G LJFF = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final boolean LJI;
    public static final boolean LJII;
    public static final boolean LJIIIIZZ;
    public static final boolean LJIIIZ;
    public static final boolean LJIIJ;
    public static final long LJIIJJI;
    public final boolean LIZ;
    public final C1507470pKb<String, C1507530pKh> LIZIZ = LIZLLL;
    public final C054G LIZJ = C2296808zG.LIZ(C2126308Ur.LIZLLL);

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    static {
        EcPbNaPrefetchOptConfig.EcPbNativePrefetchOptConfigModel ecPbNativePrefetchOptConfigModel = EcPbNaPrefetchOptConfig.LIZ;
        LJI = ecPbNativePrefetchOptConfigModel.optHandler == 1;
        LJII = ecPbNativePrefetchOptConfigModel.optDeferDispatch == 1;
        LJIIIIZZ = ecPbNativePrefetchOptConfigModel.optPbTemplate == 1;
        LJIIIZ = ecPbNativePrefetchOptConfigModel.optNormalTemplate == 1;
        LJIIJ = ecPbNativePrefetchOptConfigModel.optCpuBoost == 1;
        Long lValueOf = Long.valueOf(ecPbNativePrefetchOptConfigModel.cpuBoostDurationMs);
        LJIIJJI = lValueOf.longValue() > 0 ? lValueOf.longValue() : 100L;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    public ECAPIInterceptorNetworkHandler(boolean z) {
        this.LIZ = z;
    }

    public final void LIZIZ(long j) {
        C23250099c.LIZLLL(this.LIZJ, null, null, new C1507440pKY(this, j, null), 3);
    }

    public final void LJ(String str) {
        try {
            C1507530pKh c1507530pKhLIZIZ = this.LIZIZ.LIZIZ(str);
            if (c1507530pKhLIZIZ != null && c1507530pKhLIZIZ.LIZJ) {
                this.LIZIZ.LIZLLL(str);
            }
            LIZIZ(System.currentTimeMillis());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ(System.currentTimeMillis());
            throw th;
        }
    }

    public static void LJIIL(boolean z, boolean z2) {
        Unit unit;
        if (z && z2) {
            try {
                IOptimizerHelperService iOptimizerHelperService = (IOptimizerHelperService) PluggableExtentionKt.pluggableSpi$default(IOptimizerHelperService.class, false, false, false, 14, null);
                if (iOptimizerHelperService != null) {
                    iOptimizerHelperService.LJII(LJIIJJI, 2);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[PHI: r6 r7
      0x00b1: PHI (r6v9 java.lang.String) = (r6v0 java.lang.String), (r6v10 java.lang.String) binds: [B:12:0x0028, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r7v19 X.0pKm) = (r7v2 X.0pKm), (r7v20 X.0pKm) binds: [B:12:0x0028, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a5  */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0pCF] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, com.bytedance.retrofit2.mime.TypedInput] */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ResponseHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C0XS7<?> r32, X.C1499330p7T r33) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.preloader.condition.ECAPIInterceptorNetworkHandler.LIZ(X.0XS7, X.0p7T):void");
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
    public final void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        List list;
        String strLIZ = c0xm9.LIZJ.LJFF.LIZ();
        Request request = c0xm9.LIZ;
        boolean z = c0xm9.LJI;
        if (this.LIZ) {
            ECAPIInterceptorNetworkBystander.LIZ.getClass();
            list = (List) ECAPIInterceptorNetworkBystander.LIZJ.getValue();
        } else {
            ECAPIInterceptorNetworkBystander.LIZ.getClass();
            list = (List) ECAPIInterceptorNetworkBystander.LIZIZ.getValue();
        }
        for (Object obj : list) {
            if (((InterfaceC2027307wt) obj).LIZIZ(strLIZ, request, z)) {
                if (obj != null) {
                    c1499330p7T.LIZIZ(this, new C1507580pKm(c0xm9.LIZJ.LJFF.LIZ(), c0xm9, c0xm9.LJI));
                    return;
                }
                return;
            }
        }
    }
}
