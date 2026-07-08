package com.ss.android.ugc.aweme.hybrid.container;

import X.C1014160cUw;
import X.C1014200cV0;
import X.C1014210cV1;
import X.C1023500ck0;
import X.C1023960ckk;
import X.C18051075d;
import X.InterfaceC1018920ccc;
import X.InterfaceC1023650ckF;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AwS31S0010000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleAdHybridGecko implements InterfaceC1018920ccc<C1014160cUw> {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[PHI: r4
      0x001b: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v2 java.lang.String) binds: [B:11:0x0019, B:9:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1018920ccc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C1014150cUv obtainGeckoConfig(X.C1014160cUw r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L6
            java.lang.String r6 = r10.LIZJ
            if (r6 != 0) goto Lc
        L6:
            java.lang.String r0 = "scene_anole_format"
            java.lang.String r6 = X.C1014230cV3.LIZ(r0)
        Lc:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            if (r10 == 0) goto L17
            java.lang.String r4 = r10.LIZIZ
            if (r4 != 0) goto L1b
        L17:
            java.lang.String r4 = "preload"
            if (r10 == 0) goto L85
        L1b:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r10.LIZ
            if (r0 == 0) goto L85
            com.ss.android.ugc.aweme.commercialize.model.AnoleModel r0 = r0.getAnoleModel()
            if (r0 == 0) goto L85
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel> r0 = r0.components
            if (r0 == 0) goto L85
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L85
            java.util.Iterator r8 = r0.iterator()
        L33:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r7 = r8.next()
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r7 = (com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel) r7
            boolean r1 = X.C1010370cOp.LIZ(r7, r4)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r10.LIZ
            r9.onAnolePreload(r0, r7, r1)
            if (r1 == 0) goto L33
            java.util.List r0 = r7.getGeckoChannels()
            if (r0 == 0) goto L33
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L59:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L59
            r3.add(r1)
            goto L59
        L72:
            java.util.List r3 = X.C13LP.LLIIII(r3)
            if (r3 == 0) goto L33
            java.lang.String r2 = r7.type
            java.lang.Boolean r1 = r10.LIZLLL
            X.0cUz r0 = new X.0cUz
            r0.<init>(r6, r2, r1)
            r5.put(r0, r3)
            goto L33
        L85:
            X.0cUy r0 = new X.0cUy
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybrid.container.AnoleAdHybridGecko.obtainGeckoConfig(X.0cUw):X.0cUv");
    }

    private final void onAnolePreload(AwemeRawAd awemeRawAd, AnoleComponentModel anoleComponentModel, boolean z) {
        if (((Boolean) C18051075d.LIZ.getValue()).booleanValue()) {
            String tag = anoleComponentModel.getTag();
            String refer = anoleComponentModel.getRefer();
            if (tag != null && tag.length() != 0 && refer != null && refer.length() != 0) {
                C1014210cV1 c1014210cV1 = C1014210cV1.LIZ;
                C1014200cV0.LIZ.getClass();
                C1023960ckk c1023960ckkLIZJ = C1023500ck0.LIZJ(tag, "anole_component_preload", refer, new InterfaceC1023650ckF[]{c1014210cV1.LJI(C1014200cV0.LIZIZ, C1014200cV0.LIZLLL, C1014200cV0.LJ, C1014200cV0.LJFF)});
                if (c1023960ckkLIZJ != null) {
                    ((IAnoleService) ServiceManager.get().getService(IAnoleService.class)).LIZIZ(awemeRawAd, anoleComponentModel).logAd(c1023960ckkLIZJ, new AwS31S0010000_16(z, 2));
                }
            }
        }
    }
}
