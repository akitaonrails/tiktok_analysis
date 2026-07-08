package com.ss.android.ugc.aweme.ecommerce.base.pdp.utils;

import X.AbstractC1406870miL;
import X.C0PEM;
import X.C1406910miP;
import X.C23250099c;
import X.InterfaceC497601wk;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes21.dex */
public final class PdpImagePreloadServiceImpl implements IPdpImagePreloadService {
    public final Set<String> LIZ = new CopyOnWriteArraySet();

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.IPdpImagePreloadService
    public final void release() {
        ((CopyOnWriteArraySet) this.LIZ).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        return ((X.InterfaceC1338570kwB) com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r1)).getElementId();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r7, java.util.List r8) {
        /*
            java.util.Iterator r1 = r8.iterator()
            r4 = 0
        L5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r1.next()
            X.0kwB r0 = (X.InterfaceC1338570kwB) r0
            java.lang.String r0 = r0.getElementId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 != 0) goto L1f
            int r4 = r4 + 1
            goto L5
        L1e:
            r4 = -1
        L1f:
            r6 = 0
            if (r4 >= 0) goto L23
            return r6
        L23:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r4)
            X.0kwB r0 = (X.InterfaceC1338570kwB) r0
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.getImage()
            if (r0 != 0) goto L9e
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r4)
            X.0kwB r0 = (X.InterfaceC1338570kwB) r0
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.getVideoCover()
            if (r0 != 0) goto L9e
            int r0 = r8.size()
            int r5 = r0 + (-1)
            int r0 = r5 - r4
            int r3 = java.lang.Math.max(r4, r0)
            r2 = 1
            if (r2 > r3) goto L9d
        L4a:
            int r1 = r4 - r2
            if (r1 < 0) goto L71
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r1)
            X.0kwB r0 = (X.InterfaceC1338570kwB) r0
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.getImage()
            if (r0 != 0) goto L66
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r1)
            X.0kwB r0 = (X.InterfaceC1338570kwB) r0
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.getVideoCover()
            if (r0 == 0) goto L71
        L66:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r1)
            X.0kwB r0 = (X.InterfaceC1338570kwB) r0
            java.lang.String r0 = r0.getElementId()
            return r0
        L71:
            int r1 = r4 + r2
            if (r1 > r5) goto L98
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r1)
            X.0kwB r0 = (X.InterfaceC1338570kwB) r0
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.getImage()
            if (r0 != 0) goto L8d
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r1)
            X.0kwB r0 = (X.InterfaceC1338570kwB) r0
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.getVideoCover()
            if (r0 == 0) goto L98
        L8d:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r1)
            X.0kwB r0 = (X.InterfaceC1338570kwB) r0
            java.lang.String r0 = r0.getElementId()
            return r0
        L98:
            if (r2 == r3) goto L9d
            int r2 = r2 + 1
            goto L4a
        L9d:
            return r6
        L9e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.PdpImagePreloadServiceImpl.LIZIZ(java.lang.String, java.util.List):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.IPdpImagePreloadService
    public final void LIZ(InterfaceC497601wk interfaceC497601wk, AbstractC1406870miL abstractC1406870miL) {
        C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C1406910miP(abstractC1406870miL, this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0032 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r15, java.util.List<com.ss.android.ugc.aweme.ecommerce.service.vo.Image> r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.utils.PdpImagePreloadServiceImpl.LIZJ(java.lang.String, java.util.List, boolean, boolean):void");
    }
}
