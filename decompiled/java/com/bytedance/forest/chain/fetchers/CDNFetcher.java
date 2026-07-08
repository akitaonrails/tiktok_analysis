package com.bytedance.forest.chain.fetchers;

import X.AbstractC1522680pj8;
import X.AbstractC1522730pjD;
import X.AbstractC1534170q1f;
import X.AbstractC1534540q2G;
import X.C086F;
import X.C098200Yq;
import X.C1533480q0Y;
import X.C1533490q0Z;
import X.C1533790q13;
import X.C1533880q1C;
import X.C1533910q1F;
import X.C1533950q1J;
import X.C1533970q1L;
import X.C1534000q1O;
import X.C1534010q1P;
import X.C1534020q1Q;
import X.C1534070q1V;
import X.C1534080q1W;
import X.C1534090q1X;
import X.C1534110q1Z;
import X.C1534130q1b;
import X.C1534250q1n;
import X.C1534320q1u;
import X.C1534360q1y;
import X.C1534430q25;
import X.C1534610q2N;
import X.C1535040q34;
import X.C1535250q3P;
import X.C189200o6;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C259800zU;
import X.EnumC1534440q26;
import X.EnumC1534560q2I;
import X.EnumC1534700q2W;
import X.InterfaceC1534850q2l;
import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.AwS3S0700000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class CDNFetcher extends ResourceFetcher {
    public static Long clearCostTime;
    public static File directory;
    public static boolean isInitialized;
    public C1534070q1V fetchTask;
    public static final C1534430q25 Companion = new C1534430q25();
    public static final ConcurrentHashMap<String, C1533970q1L> loadingRequests = new ConcurrentHashMap<>();

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
        C1534070q1V c1534070q1V = this.fetchTask;
        if (c1534070q1V == null || c1534070q1V.LJFF) {
            return;
        }
        c1534070q1V.LIZIZ.LIZ.LJJJJZ.LIZIZ(c1534070q1V);
        AbstractC1522680pj8 abstractC1522680pj8 = c1534070q1V.LJIIIIZZ;
        if (abstractC1522680pj8 != null) {
            C1534080q1W.LIZJ.remove(abstractC1522680pj8.toString());
        }
        c1534070q1V.LJ = EnumC1534560q2I.LLILZ;
        c1534070q1V.LJIILIIL = null;
    }

    public CDNFetcher(Forest forest) {
        super(forest);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void onResponseCorrupted(C1533790q13 c1533790q13) {
        File fileLJIIJ = C1533790q13.LJIIJ(c1533790q13);
        if (fileLJIIJ == null) {
            return;
        }
        C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
        C1534130q1b.LIZIZ(c1533490q0Z.LJJJJL, c1533490q0Z.LJJJJIZL, c1533490q0Z.LJJIIJZLJL, new AwS602S0100000_23(fileLJIIJ, 23), c1533490q0Z.LJJIII);
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(fileLJIIJ.delete()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public boolean postDeal(C1533790q13 c1533790q13) {
        AbstractC1522680pj8 abstractC1522680pj8;
        if (!(c1533790q13.LIZ.LJJJJZ instanceof C1534080q1W)) {
            return true;
        }
        C1534000q1O c1534000q1OLJ = c1533790q13.LJ();
        if (c1534000q1OLJ != null && c1534000q1OLJ.LIZLLL() != null) {
            return true;
        }
        Integer numLJI = c1533790q13.LJI();
        if (numLJI != null && numLJI.intValue() == 0) {
            return false;
        }
        C1534070q1V c1534070q1V = c1533790q13.LJIIZILJ;
        if (c1534070q1V != null && !c1534070q1V.LJIIJ && !c1534070q1V.LJIIIZ && (abstractC1522680pj8 = c1534070q1V.LJIIIIZZ) != null) {
            C1534080q1W.LIZJ.remove(abstractC1522680pj8.toString());
        }
        return true;
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void writeFile(C1533790q13 c1533790q13) {
        Object c098200Yq;
        if (!(c1533790q13.LIZ.LJJJJZ instanceof C1534080q1W)) {
            return;
        }
        C1534000q1O c1534000q1OLJ = c1533790q13.LJ();
        if (c1534000q1OLJ == null) {
            Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
            C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
            C1533480q0Y.LIZJ("TTNetDepender", c1533490q0Z.LJJJ, null, Boolean.TRUE, "write file without forest data provider", c1533490q0Z.LJJJJIZL, null, null, null, null, null, 8128);
            return;
        }
        C1534010q1P c1534010q1PLIZLLL = c1534000q1OLJ.LIZLLL();
        if (c1534010q1PLIZLLL == null) {
            Function2<? super String, ? super C1535250q3P, Unit> function22 = C1533480q0Y.LIZ;
            C1533490q0Z c1533490q0Z2 = c1533790q13.LIZ;
            C1533480q0Y.LIZJ("TTNetDepender", c1533490q0Z2.LJJJ, null, Boolean.TRUE, "write file without forest buffer", c1533490q0Z2.LJJJJIZL, null, null, null, null, null, 8128);
            return;
        }
        AbstractC1522730pjD abstractC1522730pjD = c1533790q13.LJIILJJIL;
        if (abstractC1522730pjD == null) {
            Function2<? super String, ? super C1535250q3P, Unit> function23 = C1533480q0Y.LIZ;
            C1533490q0Z c1533490q0Z3 = c1533790q13.LIZ;
            C1533480q0Y.LIZJ("TTNetDepender", c1533490q0Z3.LJJJ, null, Boolean.TRUE, "write file without http response", c1533490q0Z3.LJJJJIZL, null, null, null, null, null, 8128);
            return;
        }
        if (!c1534010q1PLIZLLL.LJJJJ()) {
            C1534250q1n.LIZJ("TTNetDepender", "forest buffer does not provide cache", null, true);
            return;
        }
        c1534010q1PLIZLLL.LJIJJLI(c1533790q13);
        try {
            C1534110q1Z c1534110q1ZLIZIZ = C1534020q1Q.LIZIZ(abstractC1522730pjD, c1534000q1OLJ);
            c1534110q1ZLIZIZ.LIZIZ((C1534320q1u) abstractC1522730pjD.LIZJ.LJI.getValue());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cache stored, ");
            sbLIZ.append(c1534110q1ZLIZIZ.LIZIZ);
            c098200Yq = Integer.valueOf(C1534250q1n.LJII("TTNetDepender", C2188811AlT.LIZIZ(sbLIZ), false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("store cache failed, ");
            sbLIZ2.append(abstractC1522730pjD.LIZJ);
            C1534250q1n.LIZIZ("TTNetDepender", C2188811AlT.LIZIZ(sbLIZ2), null);
        }
        C189200o6.m1boximpl(c098200Yq);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public AbstractC1534540q2G fetch(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        getTimer().LIZLLL("total");
        if (a0.LJJJIL(c1533490q0Z.LJJJJIZL)) {
            setFetcherError(6, "CDN Url Blank");
            return null;
        }
        if (c1533490q0Z.LJJJJL.isOpaque()) {
            setFetcherError(6, "cdn Url is not Hierarchical");
            return null;
        }
        c1533790q13.LJIIZILJ = new C1534070q1V(c1533490q0Z.LJJJJJL, c1533790q13, C1534080q1W.LIZ, AFwS263S0000000_23.get$arr$(21));
        return fetchOnline$forest_release(c1533490q0Z, c1533790q13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0pj8] */
    /* JADX WARN: Type inference failed for: r0v29, types: [T] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.0pj8] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.bytedance.forest.chain.fetchers.CDNFetcher, com.bytedance.forest.chain.fetchers.ResourceFetcher] */
    public final AbstractC1534540q2G fetchOnline$forest_release(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        File file;
        boolean z;
        ?? r0;
        C1534070q1V c1534070q1V = c1533790q13.LJIIZILJ;
        if (c1534070q1V == null) {
            return null;
        }
        C259800zU c259800zU = new C259800zU();
        ?? LJ = C1534080q1W.LJ(c1534070q1V, c1533490q0Z.LJJJJI);
        if (LJ == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create request failed, ");
            sbLIZ.append(c1534070q1V.LJII.LIZLLL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1533880q1C.LIZJ("CDN_FETCHER", "fetch", strLIZIZ, null, null);
            setFetcherError(6, strLIZIZ);
            return null;
        }
        c259800zU.element = LJ;
        getTimer().LIZLLL("cache");
        C1534250q1n c1534250q1n = C1534250q1n.LIZ;
        c1534250q1n.LJIIJ(AFwS212S0000000_23.get$arr$(39));
        C259800zU c259800zU2 = new C259800zU();
        C259800zU c259800zU3 = new C259800zU();
        C259800zU c259800zU4 = new C259800zU();
        Uri uri = c1534070q1V.LJII.LJ;
        String str = ((AbstractC1522680pj8) c259800zU.element).LIZ;
        C1533490q0Z c1533490q0Z2 = c1534070q1V.LIZIZ.LIZ;
        C1534130q1b.LIZIZ(uri, str, c1533490q0Z2.LJJIIJZLJL, new AwS3S0700000_23(c259800zU, (C259800zU<AbstractC1522680pj8>) c1533790q13, (C1533790q13) c259800zU4, (C259800zU<Map<String, String>>) c1533490q0Z, (C1533490q0Z) c1534070q1V, (C1534070q1V) c259800zU3, (C259800zU<C1534110q1Z>) c259800zU2, (C259800zU<C1534110q1Z>) 0), c1533490q0Z2.LJJIII);
        getTimer().LIZJ("cache");
        final C1534110q1Z c1534110q1Z = (C1534110q1Z) c259800zU2.element;
        if (c1534110q1Z != null) {
            c1533790q13.LJI = true;
            c1533790q13.LJIJ = EnumC1534700q2W.NORMAL;
            return new AbstractC1534540q2G(c1534110q1Z) { // from class: X.0q1m
                public final C1534110q1Z LIZLLL;

                @Override // X.InterfaceC1535220q3M
                public final boolean LIZ() {
                    return false;
                }

                @Override // X.InterfaceC1535220q3M
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.InterfaceC1535220q3M
                public final String getName() {
                    return "HTTPCacheProvider";
                }

                @Override // X.InterfaceC1535220q3M
                public final EnumC1528510psX LIZJ() {
                    return EnumC1528510psX.WAIT_FOR_RESULT;
                }

                {
                    this.LIZLLL = c1534110q1Z;
                }

                @Override // X.AbstractC1534540q2G
                public final void LJII(C1533790q13 c1533790q132, Function1<? super AbstractC1534220q1k<?>, Unit> function1) {
                    LIZLLL().LJIIJJI(new C1534410q23());
                    LIZLLL().LJIIJJI(new C1534400q22());
                    c1533790q132.LJIILL(this.LIZLLL.LJFF());
                    C1534080q1W.LJIIIZ(this.LIZLLL.LJ(), c1533790q132, true, Long.valueOf(this.LIZLLL.LJ));
                    C1534590q2L c1534590q2L = LIZLLL().LIZ;
                    c1534590q2L.LIZIZ = Long.valueOf(c1533790q132.LJIIIZ);
                    c1534590q2L.LIZLLL = c1533790q132.LIZIZ();
                    c1534590q2L.LJ = c1533790q132.LJJIIZI;
                    c1534590q2L.LJI = c1533790q132.LJIILIIL;
                    c1534590q2L.LJII = c1533790q132.LJIILLIIL;
                    c1534590q2L.LJIIIZ = c1533790q132.LJ();
                    function1.invoke(new C1534350q1x(this.LIZLLL));
                }
            };
        }
        if (!c1534070q1V.LJIIIZ && !c1533490q0Z.LJIIIIZZ) {
            C1534110q1Z c1534110q1Z2 = (C1534110q1Z) c259800zU3.element;
            if (c1534110q1Z2 != null) {
                c1534250q1n.LJIIJ(new AwS567S0100000_23(c259800zU, (C259800zU<AbstractC1534540q2G>) 56));
                if (!c1533790q13.LIZ.LJIJ.booleanValue()) {
                    c1534250q1n.LJIIJ(new AwS567S0100000_23(c259800zU, (C259800zU<AbstractC1534540q2G>) 57));
                } else {
                    Map<String, String> mapLJ = (Map) c259800zU4.element;
                    if (mapLJ == null && (mapLJ = c1534110q1Z2.LJ()) == null) {
                        C1534250q1n.LJFF("CDN_FETCHER", "fetch", "cannot get any cached headers", null, false);
                        c1534110q1Z2.LIZJ(true);
                    } else {
                        if (c1534110q1Z2.LIZ() && (file = c1534110q1Z2.LIZJ) != null) {
                            c1534250q1n.LJIIJ(new AwS567S0100000_23(c259800zU, (C259800zU<AbstractC1534540q2G>) 58));
                            AbstractC1522680pj8 abstractC1522680pj8LJFF = C1534080q1W.LJFF(mapLJ, (AbstractC1522680pj8) c259800zU.element, c1534110q1Z2, c1534070q1V);
                            if (abstractC1522680pj8LJFF == null) {
                                C1533880q1C.LIZJ("CDN_FETCHER", "fetch", "cannot get http cache revalidate request", null, null);
                                z = false;
                                r0 = (AbstractC1522680pj8) c259800zU.element;
                            } else {
                                z = true;
                                r0 = abstractC1522680pj8LJFF;
                            }
                            c259800zU.element = r0;
                            return dealWithHttpRequest$forest_release(c1533790q13, c1534070q1V, r0, z, file, mapLJ, c1534110q1Z2);
                        }
                        C1534250q1n.LJFF("CDN_FETCHER", "fetch", "cannot get cached file", null, false);
                        c1534110q1Z2.LIZJ(true);
                    }
                }
            }
            return dealWithHttpRequest$forest_release(c1533790q13, c1534070q1V, (AbstractC1522680pj8) c259800zU.element, false, null, null, null);
        }
        setFetcherError(1, "disable fetch online resource");
        return null;
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        boolean zLJI = MethodIDManager.LJI(137793);
        getTimer().LIZLLL("total");
        doFetch(false, c1533490q0Z, c1533790q13, new AwS602S0100000_23(this, 22));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public Pair<InputStream, Boolean> handleException(C1533790q13 c1533790q13, Throwable th) {
        AbstractC1522680pj8 abstractC1522680pj8LJ;
        Object c098200Yq;
        C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
        C1534070q1V c1534070q1V = c1533790q13.LJIIZILJ;
        C086F.LIZ.getClass();
        if (C086F.LIZ() || !(c1533790q13.LJIJJ instanceof CDNFetcher) || !(c1533490q0Z.LJJJJZ instanceof C1534080q1W) || c1534070q1V == null || c1534070q1V.LJIIIZ || c1534070q1V.LJ == EnumC1534560q2I.LLILZ || c1534070q1V.LJII.LJFF <= 0 || (abstractC1522680pj8LJ = C1534080q1W.LJ(c1534070q1V, c1533490q0Z.LJJJJI)) == null) {
            return null;
        }
        try {
            c098200Yq = C1534080q1W.LJII(c1534070q1V, abstractC1522680pj8LJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        AbstractC1522730pjD abstractC1522730pjD = (AbstractC1522730pjD) c098200Yq;
        if (abstractC1522730pjD == null) {
            return null;
        }
        return new Pair<>(abstractC1522730pjD.LIZIZ(), Boolean.FALSE);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void onBufferClose(C1533790q13 c1533790q13, C1534010q1P c1534010q1P) {
        Long lLJIILIIL;
        AbstractC1522680pj8 abstractC1522680pj8;
        AbstractC1534170q1f abstractC1534170q1f;
        String str;
        if (!(c1533790q13.LIZ.LJJJJZ instanceof C1534080q1W)) {
            return;
        }
        Map<String, String> map = c1533790q13.LJIILLIIL;
        if (map != null && (str = map.get("content-length")) != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str);
        } else {
            lLJIILIIL = null;
        }
        if (c1534010q1P.LJJJJ() && lLJIILIIL != null && lLJIILIIL.longValue() != 0 && ((abstractC1534170q1f = c1534010q1P.LLILZIL) == null || abstractC1534170q1f.LJ == 0)) {
            C1533950q1J.LIZJ(c1533790q13);
            c1534010q1P.LJJIZ(new IOException("resource corrupted"), true, true, null);
            if (c1534010q1P.LJJJJ()) {
                c1534010q1P.LJIJJLI(c1533790q13);
                return;
            }
        }
        C1534070q1V c1534070q1V = c1533790q13.LJIIZILJ;
        if (c1534070q1V != null && !c1534070q1V.LJIIJ && !c1534070q1V.LJIIIZ && (abstractC1522680pj8 = c1534070q1V.LJIIIIZZ) != null) {
            C1534080q1W.LIZJ.remove(abstractC1522680pj8.toString());
        }
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
        boolean zLJI = MethodIDManager.LJI(137358);
        C086F c086f = C086F.LIZ;
        C1534610q2N c1534610q2N = new C1534610q2N(this, c1533490q0Z, c1533790q13, function1);
        c086f.getClass();
        C086F.LJI(c1534610q2N);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void doFetch(boolean z, C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
        boolean zLJI = MethodIDManager.LJI(137730);
        if (a0.LJJJIL(c1533490q0Z.LJJJJIZL)) {
            setFetcherError(6, "CDN Url Blank");
            function1.invoke(c1533790q13);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (c1533490q0Z.LJJJJL.isOpaque()) {
            setFetcherError(6, "cdn Url is not Hierarchical");
            function1.invoke(c1533790q13);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1534070q1V c1534070q1V = this.fetchTask;
        if (c1534070q1V == null) {
            InterfaceC1534850q2l interfaceC1534850q2l = c1533490q0Z.LJJJJZ;
            c1534070q1V = new C1534070q1V(z, c1533790q13, interfaceC1534850q2l, new AwS389S0200000_23(c1533790q13, function1, 5));
            c1533790q13.LJIIZILJ = c1534070q1V;
            c1533790q13.LIZ.LJJJJJ.getApplication();
            interfaceC1534850q2l.LIZJ(c1534070q1V);
        }
        this.fetchTask = c1534070q1V;
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final C1534090q1X dealWithHttpRequest$forest_release(C1533790q13 c1533790q13, C1534070q1V c1534070q1V, AbstractC1522680pj8 abstractC1522680pj8, boolean z, File file, Map<String, String> map, C1534110q1Z c1534110q1Z) {
        EnumC1534440q26 enumC1534440q26;
        Function1<C1534360q1y<?>, Unit> function1;
        C1533490q0Z c1533490q0Z;
        C1533910q1F c1533910q1F;
        ConcurrentHashMap<String, C1533970q1L> concurrentHashMap = loadingRequests;
        C1533970q1L c1533970q1LPutIfAbsent = concurrentHashMap.putIfAbsent(abstractC1522680pj8.toString(), getCredit());
        if (c1533970q1LPutIfAbsent != null) {
            C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(abstractC1522680pj8, 55));
            if (c1533970q1LPutIfAbsent.LIZ.LJI()) {
                c1533790q13.LJIJ = EnumC1534700q2W.REUSE;
                C1533970q1L credit = getCredit();
                if (credit != null) {
                    C1533790q13 c1533790q132 = c1533970q1LPutIfAbsent.LJ;
                    if (c1533790q132 != null && (c1533490q0Z = c1533790q132.LIZ) != null && (c1533910q1F = c1533490q0Z.LJJJLZIJ) != null) {
                        enumC1534440q26 = c1533910q1F.LJIIIIZZ;
                    } else {
                        enumC1534440q26 = null;
                    }
                    c1533790q13.LJJIJIL = enumC1534440q26;
                    c1533970q1LPutIfAbsent.LJI.incrementAndGet();
                    C1535040q34 c1535040q34 = c1533970q1LPutIfAbsent.LIZ;
                    C1535040q34 c1535040q342 = credit.LIZ;
                    c1535040q34.getClass();
                    WeakReference<Function1<C1534360q1y<?>, Unit>> weakReference = c1535040q342.LIZIZ;
                    if (weakReference != null && (function1 = weakReference.get()) != null) {
                        LinkedList<String> linkedList = c1535040q342.LIZJ;
                        C1533490q0Z c1533490q0Z2 = c1533790q13.LIZ;
                        if (c1535040q34.LJIILJJIL(c1535040q342, c1533790q13, c1533490q0Z2.LJ, linkedList, function1, c1533490q0Z2.LJJJJJL)) {
                            return null;
                        }
                        c1535040q342.LJIIIZ.LIZLLL(0, false);
                        c1535040q342.LIZLLL = null;
                    } else {
                        C1533880q1C.LIZJ("ResourceProcessChain", "tryReuseChainToGetTargetType", "the callback of chain is released", null, null);
                    }
                }
                if (!ForestExperiment.INSTANCE.getEnableRetryOnFail()) {
                    concurrentHashMap.remove(abstractC1522680pj8.toString(), c1533970q1LPutIfAbsent);
                    recordMessage("failed to reuse the request");
                    return null;
                }
                c1533790q13.LJIJ = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed to reuse the request, ");
            sbLIZ.append(abstractC1522680pj8.LIZ);
            C1534250q1n.LJFF("CDN_FETCHER", "dealWithHttpRequest", C2188811AlT.LIZIZ(sbLIZ), null, false);
            concurrentHashMap.remove(abstractC1522680pj8.toString(), c1533970q1LPutIfAbsent);
            return dealWithHttpRequest$forest_release(c1533790q13, c1534070q1V, abstractC1522680pj8, z, null, null, null);
        }
        c1533790q13.LJI = false;
        c1533790q13.LJIJ = null;
        return new C1534090q1X(c1534070q1V, abstractC1522680pj8, z, file, map, c1534110q1Z);
    }
}
