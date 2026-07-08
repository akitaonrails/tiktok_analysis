package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.viewmodel;

import X.C1158550gFp;
import X.C1555840qac;
import X.C1782120wTa;
import X.C1822010xVv;
import X.C1822490xWh;
import X.C1823250xXv;
import X.EnumC1785280wYg;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceSkuVM extends AssemViewModel<C1158550gFp> {
    public C1555840qac LL;
    public final C1823250xXv LLILLJJLI = new C1823250xXv(new C1822490xWh());

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158550gFp(0);
    }

    public final boolean wQ2() {
        C1822010xVv c1822010xVv;
        EnumC1785280wYg enumC1785280wYg;
        C1822010xVv c1822010xVv2;
        String str;
        C1555840qac c1555840qac;
        C1822010xVv c1822010xVv3;
        String str2;
        C1555840qac c1555840qac2 = this.LL;
        if (c1555840qac2 != null && (c1822010xVv = c1555840qac2.LL) != null && (enumC1785280wYg = c1822010xVv.LIZ) != null) {
            int i = C1782120wTa.LIZ[enumC1785280wYg.ordinal()];
            if (i == 1) {
                C1555840qac c1555840qac3 = this.LL;
                if (c1555840qac3 == null || (c1822010xVv2 = c1555840qac3.LL) == null || (str = c1822010xVv2.LJIIJJI) == null || !(!a0.LJJJIL(str))) {
                    return false;
                }
            } else if (i == 2 && ((c1555840qac = this.LL) == null || (c1822010xVv3 = c1555840qac.LL) == null || (str2 = c1822010xVv3.LJIILIIL) == null || !(!a0.LJJJIL(str2)))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[PHI: r4
      0x0046: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:20:0x003d, B:24:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0130 A[PHI: r2
      0x0130: PHI (r2v1 boolean) = (r2v0 boolean), (r2v10 boolean) binds: [B:39:0x012c, B:34:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0133 A[PHI: r4
      0x0133: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String), (r4v4 java.lang.String) binds: [B:18:0x0039, B:26:0x0048, B:24:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b A[PHI: r10
      0x013b: PHI (r10v1 boolean) = (r10v0 boolean), (r10v4 boolean) binds: [B:44:0x0137, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> vQ2() {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.viewmodel.PcsServiceSkuVM.vQ2():java.util.Map");
    }
}
