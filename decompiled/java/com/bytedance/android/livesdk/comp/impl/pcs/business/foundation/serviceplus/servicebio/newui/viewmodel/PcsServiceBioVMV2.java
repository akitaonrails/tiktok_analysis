package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel;

import X.C1156510gCX;
import X.C1554960qZC;
import X.C1559260qg8;
import X.C1785260wYe;
import X.C1822330xWR;
import X.C1823290xXz;
import X.C23250099c;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1785270wYf;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceBioVMV2 extends AssemViewModel<C1156510gCX> {
    public InterfaceC665370Q7z LL;
    public C1822330xWR LLILLJJLI;
    public final C1559260qg8 LLILLL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1823290xXz.class, (Class<Object>) null, (String) 13), true);
    public final Set<Long> LLILZ = new LinkedHashSet();
    public boolean LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1156510gCX(0);
    }

    public final C1822330xWR vQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            C1822330xWR c1822330xWR = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C1822330xWR.class, null)) != null) {
                c1822330xWR = (C1822330xWR) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLJJLI = c1822330xWR;
        }
        return this.LLILLJJLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(final boolean r7) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2.wQ2(boolean):void");
    }

    public final void xQ2(InterfaceC1785270wYf interfaceC1785270wYf) {
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1785260wYe(interfaceC1785270wYf, this, null), 3);
    }
}
