package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem;

import X.C13BV;
import X.C1761940vx2;
import X.C1762010vx9;
import X.InterfaceC0148002o;
import X.InterfaceC1755020vls;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListBaseCardViewModel;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCarouselViewModel extends PdpBodyListBaseCardViewModel<C1761940vx2, C1762010vx9> {
    public final InterfaceC1755020vls LL;

    public PdpCarouselViewModel() {
        this(null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1761940vx2(C13BV.INSTANCE, null, 0, true, null, 0, null);
    }

    public PdpCarouselViewModel(InterfaceC1755020vls interfaceC1755020vls) {
        this.LL = interfaceC1755020vls;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[EDGE_INSN: B:21:0x004b->B:11:0x004b BREAK  A[LOOP:0: B:7:0x0027->B:22:?]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListBaseCardViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o vQ2(X.InterfaceC0148002o r10, X.C1762010vx9 r11) {
        /*
            r9 = this;
            X.0vx2 r10 = (X.C1761940vx2) r10
            X.0vx9 r11 = (X.C1762010vx9) r11
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement> r0 = r11.LL
            int r1 = r0.size()
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement> r0 = r10.LL
            int r0 = r0.size()
            r7 = 0
            if (r1 != r0) goto L4b
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement> r1 = r11.LL
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement> r0 = r10.LL
            java.util.List r1 = X.C13LP.LLIILII(r1, r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L64
            java.util.Iterator r2 = r1.iterator()
        L27:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r2.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.getFirst()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement) r1
            java.lang.Object r0 = r0.getSecond()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement) r0
            java.lang.String r1 = r1.elementId
            java.lang.String r0 = r0.elementId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L27
        L4b:
            java.lang.Integer r0 = r11.LLILLL
        L4d:
            X.0vx2 r1 = new X.0vx2
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement> r2 = r11.LL
            java.lang.String r3 = r11.LLILZ
            java.lang.Integer r4 = r11.LLILLL
            boolean r5 = r11.LLJILLL
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist r6 = r11.LLIZ
            if (r0 == 0) goto L5f
            int r7 = r0.intValue()
        L5f:
            r8 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L64:
            java.lang.Integer r1 = r11.LLILLL
            java.lang.Integer r0 = r10.LLILLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4b
            int r0 = r10.LLILZLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselViewModel.vQ2(X.002o, java.lang.Object):X.002o");
    }
}
