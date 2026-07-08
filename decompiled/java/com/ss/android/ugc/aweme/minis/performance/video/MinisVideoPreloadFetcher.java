package com.ss.android.ugc.aweme.minis.performance.video;

import X.AbstractC1528710psr;
import X.AbstractC1534540q2G;
import X.C1529420pu0;
import X.C1533490q0Z;
import X.C1533790q13;
import X.C1534420q24;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C259800zU;
import android.webkit.WebResourceRequest;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS389S0200000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisVideoPreloadFetcher extends ResourceFetcher {
    public static SchemaParserData schemaData;
    public static final C1529420pu0 Companion = new C1529420pu0();
    public static final int $stable = 8;

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
        int i = C2187451AjH.LIZ;
    }

    public MinisVideoPreloadFetcher(Forest forest) {
        super(forest);
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0172 A[ADDED_TO_REGION, REMOVE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.AbstractC1534540q2G getDataProviderIfHasLocalResource(final android.webkit.WebResourceRequest r23) {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.performance.video.MinisVideoPreloadFetcher.getDataProviderIfHasLocalResource(android.webkit.WebResourceRequest):X.0q2G");
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public AbstractC1534540q2G fetch(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        WebResourceRequest webResourceRequest;
        Object obj = c1533490q0Z.LJJJJI;
        if ((obj instanceof WebResourceRequest) && (webResourceRequest = (WebResourceRequest) obj) != null) {
            AbstractC1534540q2G dataProviderIfHasLocalResource = getDataProviderIfHasLocalResource(webResourceRequest);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetch, result:");
            sbLIZ.append(dataProviderIfHasLocalResource);
            sbLIZ.append(", url: ");
            sbLIZ.append(c1533490q0Z.LJJJJIZL);
            C2188811AlT.LIZIZ(sbLIZ);
            return dataProviderIfHasLocalResource;
        }
        int i2 = C2187451AjH.LIZ;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        int i = C2187451AjH.LIZ;
        C259800zU c259800zU = new C259800zU();
        AbstractC1534540q2G abstractC1534540q2GFetch = fetch(c1533490q0Z, c1533790q13);
        if (abstractC1534540q2GFetch != null) {
            abstractC1534540q2GFetch.LJII(c1533790q13, new AwS389S0200000_23(c259800zU, (C259800zU<C1534420q24>) c1533790q13, (C1533790q13) 10));
        }
        final C1534420q24 c1534420q24 = (C1534420q24) c259800zU.element;
        if (c1534420q24 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchSync, no cache data -> NOT taking over, pass to native. url:");
            sbLIZ.append(c1533490q0Z.LJJJJIZL);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetchSync, take over with cache stream:");
        sbLIZ2.append(c1534420q24.LIZLLL);
        sbLIZ2.append(", url:");
        sbLIZ2.append(c1533490q0Z.LJJJJIZL);
        C2188811AlT.LIZIZ(sbLIZ2);
        c1533790q13.LJIILJJIL(new AbstractC1528710psr() { // from class: X.0psP
            public boolean LL;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1533800q14
            public final InputStream LJIILLIIL() {
                this.LL = true;
                return (InputStream) c1534420q24.LIZLLL;
            }

            @Override // X.AbstractC1533800q14
            public final boolean LJI() {
                return !this.LL;
            }
        });
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchAsync, [request: ");
        sbLIZ.append(c1533490q0Z);
        sbLIZ.append("], [response: ");
        sbLIZ.append(c1533790q13);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
