package com.bytedance.forest.chain.fetchers;

import X.AbstractC1534220q1k;
import X.AbstractC1534540q2G;
import X.C1533490q0Z;
import X.C1533790q13;
import X.C1533940q1I;
import X.C1533950q1J;
import X.C1534000q1O;
import X.C1534010q1P;
import X.C1534840q2k;
import X.C2188811AlT;
import X.InterfaceC1535280q3S;
import X.InterfaceC1535380q3c;
import android.webkit.WebResourceRequest;
import com.bytedance.forest.Forest;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class MemoryFetcher extends ResourceFetcher {
    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
    }

    public MemoryFetcher(Forest forest) {
        super(forest);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void onResponseCorrupted(C1533790q13 c1533790q13) {
        C1533790q13 c1533790q132;
        ResourceFetcher resourceFetcher;
        C1534840q2k c1534840q2kLIZIZ = C1533940q1I.LIZIZ(c1533790q13);
        if (c1534840q2kLIZIZ != null && (c1533790q132 = c1534840q2kLIZIZ.LIZ) != null && (resourceFetcher = c1533790q132.LJIJJ) != null && (!(resourceFetcher instanceof MemoryFetcher))) {
            resourceFetcher.onResponseCorrupted(c1533790q132);
        }
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public AbstractC1534540q2G fetch(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        if (C1533940q1I.LIZ(c1533490q0Z) == null) {
            setFetcherError(2, "cannot get cache identifier");
            return null;
        }
        C1534840q2k c1534840q2kLIZIZ = C1533940q1I.LIZIZ(c1533790q13);
        if (c1534840q2kLIZIZ == null) {
            setFetcherError(2, "cannot get cached meta");
            return null;
        }
        final C1533790q13 c1533790q132 = c1534840q2kLIZIZ.LIZ;
        InterfaceC1535380q3c interfaceC1535380q3c = c1534840q2kLIZIZ.LIZIZ.LIZIZ;
        if (interfaceC1535380q3c != null && !interfaceC1535380q3c.isValid()) {
            C1533940q1I.LJ(c1533790q132);
            setFetcherError(6, "cache expired");
            return null;
        }
        C1533950q1J.LIZ(c1533790q132, c1533790q13);
        c1533790q13.LIZIZ = false;
        InterfaceC1535280q3S interfaceC1535280q3S = c1534840q2kLIZIZ.LIZIZ.LIZJ;
        if (interfaceC1535280q3S != null && !interfaceC1535280q3S.LIZ(c1533790q13)) {
            final AbstractC1534220q1k<?> abstractC1534220q1k = c1534840q2kLIZIZ.LIZIZ;
            return new AbstractC1534540q2G(c1533790q132, abstractC1534220q1k) { // from class: X.0q1l
                public final C1533790q13 LIZLLL;
                public final AbstractC1534220q1k<?> LJ;

                @Override // X.InterfaceC1535220q3M
                public final boolean LIZ() {
                    return true;
                }

                @Override // X.InterfaceC1535220q3M
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.InterfaceC1535220q3M
                public final String getName() {
                    return "MemoryAsyncDataProvider";
                }

                @Override // X.InterfaceC1535220q3M
                public final EnumC1528510psX LIZJ() {
                    return EnumC1528510psX.REGISTER_CALLBACK;
                }

                {
                    this.LIZLLL = c1533790q132;
                    this.LJ = abstractC1534220q1k;
                }

                @Override // X.AbstractC1534540q2G
                public final void LJII(C1533790q13 c1533790q133, Function1<? super AbstractC1534220q1k<?>, Unit> function1) {
                    C1533790q13 c1533790q134 = this.LIZLLL;
                    String str = c1533790q134.LJFF;
                    if (str == null) {
                        str = c1533790q134.LJ;
                    }
                    c1533790q133.LJFF = str;
                    c1533790q133.LJIIIZ = c1533790q134.LJIIIZ;
                    c1533790q133.LJJIJIIJIL = c1533790q134.LIZ.LJJJIL;
                    c1533790q133.LJIIJJI = c1533790q134.LIZLLL();
                    c1533790q133.LJJI = this.LIZLLL.LIZIZ();
                    C1533790q13 c1533790q135 = this.LIZLLL;
                    c1533790q133.LJJIIZI = c1533790q135.LJJIIZI;
                    c1533790q133.LJIILIIL = c1533790q135.LJIILIIL;
                    c1533790q133.LJIILL(c1533790q135.LJ());
                    c1533790q133.LJIILLIIL = this.LIZLLL.LJIILLIIL;
                    c1533790q133.LJI = true;
                    C1534590q2L c1534590q2L = LIZLLL().LIZ;
                    c1534590q2L.LIZ = c1533790q133.LJFF;
                    Long lValueOf = c1534590q2L.LIZIZ;
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(this.LIZLLL.LJIIIZ);
                    }
                    c1534590q2L.LIZIZ = lValueOf;
                    C1533790q13 c1533790q136 = this.LIZLLL;
                    String str2 = c1533790q136.LIZ.LJJJIL;
                    if (str2 == null) {
                        str2 = c1534590q2L.LIZJ;
                    }
                    c1534590q2L.LIZJ = str2;
                    String strLIZIZ = c1534590q2L.LIZLLL;
                    if (strLIZIZ == null) {
                        strLIZIZ = c1533790q136.LIZIZ();
                    }
                    c1534590q2L.LIZLLL = strLIZIZ;
                    String str3 = c1534590q2L.LJ;
                    if (str3 == null) {
                        str3 = this.LIZLLL.LJJIIZI;
                    }
                    c1534590q2L.LJ = str3;
                    String strLIZLLL = c1534590q2L.LJFF;
                    if (strLIZLLL == null) {
                        strLIZLLL = this.LIZLLL.LIZLLL();
                    }
                    c1534590q2L.LJFF = strLIZLLL;
                    C1534000q1O c1534000q1OLJ = c1534590q2L.LJIIIZ;
                    if (c1534000q1OLJ == null) {
                        c1534000q1OLJ = this.LIZLLL.LJ();
                    }
                    c1534590q2L.LJIIIZ = c1534000q1OLJ;
                    Long l = c1534590q2L.LJI;
                    if (l == null) {
                        l = this.LIZLLL.LJIILIIL;
                    }
                    c1534590q2L.LJI = l;
                    Map<String, String> map = c1534590q2L.LJII;
                    if (map == null) {
                        map = this.LIZLLL.LJIILLIIL;
                    }
                    c1534590q2L.LJII = map;
                    function1.invoke(this.LJ.LIZLLL(c1533790q133, false));
                }
            };
        }
        final AbstractC1534220q1k<?> abstractC1534220q1kLIZLLL = c1534840q2kLIZIZ.LIZIZ.LIZLLL(c1533790q13, false);
        if (abstractC1534220q1kLIZLLL == null) {
            C1533940q1I.LJ(c1533790q132);
            setFetcherError(7, "cannot clone cached meta");
            return null;
        }
        return new AbstractC1534540q2G(c1533790q132, abstractC1534220q1kLIZLLL) { // from class: X.0q1d
            public final C1533790q13 LIZLLL;
            public final AbstractC1534220q1k<?> LJ;

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
                return "MemoryDataProvider";
            }

            @Override // X.InterfaceC1535220q3M
            public final EnumC1528510psX LIZJ() {
                return EnumC1528510psX.WAIT_FOR_RESULT;
            }

            {
                this.LIZLLL = c1533790q132;
                this.LJ = abstractC1534220q1kLIZLLL;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1534540q2G
            public final void LJII(C1533790q13 c1533790q133, Function1<? super AbstractC1534220q1k<?>, Unit> function1) {
                C1534010q1P c1534010q1P;
                C1533790q13 c1533790q134 = this.LIZLLL;
                String str = c1533790q134.LJFF;
                if (str == null) {
                    str = c1533790q134.LJ;
                }
                c1533790q133.LJFF = str;
                c1533790q133.LJIIIZ = c1533790q134.LJIIIZ;
                c1533790q133.LJJIJIIJIL = c1533790q134.LIZ.LJJJIL;
                c1533790q133.LJIIJJI = c1533790q134.LIZLLL();
                c1533790q133.LJJI = this.LIZLLL.LIZIZ();
                C1533790q13 c1533790q135 = this.LIZLLL;
                c1533790q133.LJJIIZI = c1533790q135.LJJIIZI;
                c1533790q133.LJIILIIL = c1533790q135.LJIILIIL;
                c1533790q133.LJIILL(c1533790q135.LJ());
                c1533790q133.LJIILLIIL = this.LIZLLL.LJIILLIIL;
                c1533790q133.LJI = true;
                C1534590q2L c1534590q2L = LIZLLL().LIZ;
                c1534590q2L.LIZ = c1533790q133.LJFF;
                Long lValueOf = c1534590q2L.LIZIZ;
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(this.LIZLLL.LJIIIZ);
                }
                c1534590q2L.LIZIZ = lValueOf;
                C1533790q13 c1533790q136 = this.LIZLLL;
                String str2 = c1533790q136.LIZ.LJJJIL;
                if (str2 == null) {
                    str2 = c1534590q2L.LIZJ;
                }
                c1534590q2L.LIZJ = str2;
                String strLIZIZ = c1534590q2L.LIZLLL;
                if (strLIZIZ == null) {
                    strLIZIZ = c1533790q136.LIZIZ();
                }
                c1534590q2L.LIZLLL = strLIZIZ;
                String str3 = c1534590q2L.LJ;
                if (str3 == null) {
                    str3 = this.LIZLLL.LJJIIZI;
                }
                c1534590q2L.LJ = str3;
                String strLIZLLL = c1534590q2L.LJFF;
                if (strLIZLLL == null) {
                    strLIZLLL = this.LIZLLL.LIZLLL();
                }
                c1534590q2L.LJFF = strLIZLLL;
                C1534000q1O c1534000q1OLJ = c1534590q2L.LJIIIZ;
                if (c1534000q1OLJ == null) {
                    c1534000q1OLJ = this.LIZLLL.LJ();
                }
                c1534590q2L.LJIIIZ = c1534000q1OLJ;
                Long l = c1534590q2L.LJI;
                if (l == null) {
                    l = this.LIZLLL.LJIILIIL;
                }
                c1534590q2L.LJI = l;
                Map<String, String> map = c1534590q2L.LJII;
                if (map == null) {
                    map = this.LIZLLL.LJIILLIIL;
                }
                c1534590q2L.LJII = map;
                AbstractC1534220q1k<?> c1534420q24 = this.LJ;
                if (Intrinsics.LJFF(c1534420q24.LIZ, C1534010q1P.class)) {
                    Type type = this.LJ.LIZLLL;
                    c1534420q24 = null;
                    if ((type instanceof C1534010q1P) && (c1534010q1P = (C1534010q1P) type) != null) {
                        InputStream inputStreamLJIILLIIL = c1534010q1P.LJIILLIIL();
                        if (inputStreamLJIILLIIL != null) {
                            c1534420q24 = new C1534420q24(inputStreamLJIILLIIL);
                            if (!c1534010q1P.LJJJJJ() && !this.LIZLLL.LJI) {
                                LIZLLL().LJIIJJI(new C1534060q1U(false));
                            }
                        }
                        final File fileLJIILL = c1534010q1P.LJIILL();
                        if (fileLJIILL != null) {
                            LIZLLL().LJIIJJI(new AbstractC1535150q3F<InputStream, File>(InputStream.class, File.class) { // from class: X.0psW
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
                                    return "ForestBuffer2File";
                                }

                                @Override // X.InterfaceC1535220q3M
                                public final EnumC1528510psX LIZJ() {
                                    return EnumC1528510psX.WAIT_FOR_RESULT;
                                }

                                @Override // X.AbstractC1535150q3F
                                public final void LJFF(AbstractC1534220q1k<InputStream> abstractC1534220q1k2, C1533790q13 c1533790q137, List<? extends Class<?>> list, Function1<? super AbstractC1534220q1k<File>, Unit> function12) {
                                    function12.invoke(new C1528490psV(fileLJIILL));
                                }
                            });
                        }
                    }
                }
                function1.invoke(c1534420q24);
            }
        };
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        fetchAsync(c1533490q0Z, c1533790q13, AFwS263S0000000_23.get$arr$(22));
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
        C1533790q13 c1533790q132;
        boolean z;
        Object obj;
        C1534010q1P c1534010q1P;
        Object absoluteFile;
        WebResourceRequest webResourceRequest;
        AbstractC1534220q1k<?> abstractC1534220q1k;
        if (C1533940q1I.LIZ(c1533490q0Z) == null) {
            setFetcherError(2, "cannot get cache identifier");
            function1.invoke(c1533790q13);
            return;
        }
        C1534840q2k c1534840q2kLIZIZ = C1533940q1I.LIZIZ(c1533790q13);
        File fileLIZJ = null;
        if (c1534840q2kLIZIZ != null) {
            c1533790q132 = c1534840q2kLIZIZ.LIZ;
        } else {
            c1533790q132 = null;
        }
        if (c1533790q132 != null && c1533790q132.LJJ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C1533950q1J.LIZ(c1533790q132, c1533790q13)) {
                c1533790q13.LIZIZ = true;
            } else {
                setFetcherError(8, "copy response failed");
            }
            function1.invoke(c1533790q13);
            return;
        }
        if (c1534840q2kLIZIZ != null && (abstractC1534220q1k = c1534840q2kLIZIZ.LIZIZ) != null) {
            obj = abstractC1534220q1k.LIZLLL;
        } else {
            obj = null;
        }
        if ((obj instanceof C1534010q1P) && (c1534010q1P = (C1534010q1P) obj) != null) {
            if (!c1534010q1P.LJI()) {
                setFetcherError(7, "cached buffer is not valid");
                C1533940q1I.LJ(c1534010q1P.LLILLJJLI);
                function1.invoke(c1533790q13);
                return;
            }
            C1533790q13 c1533790q133 = c1534010q1P.LLILLJJLI;
            C1534000q1O c1534000q1OLJ = c1533790q133.LJ();
            if (c1534000q1OLJ != null) {
                fileLIZJ = c1534000q1OLJ.LIZJ();
            }
            if (Intrinsics.LJFF(c1533790q133.LJ, "cdn")) {
                String str = c1533790q133.LIZ.LJJJJIZL;
                Object obj2 = c1533790q13.LIZ.LJJJJI;
                if ((obj2 instanceof WebResourceRequest) && (webResourceRequest = (WebResourceRequest) obj2) != null) {
                    webResourceRequest.getRequestHeaders();
                }
                if (!c1533490q0Z.LJJIIJ && fileLIZJ != null) {
                    C1533490q0Z c1533490q0Z2 = c1533790q133.LIZ;
                    if (!Intrinsics.LJFF(c1533490q0Z2.LJJJJZ.LIZ(c1533490q0Z2.LJJJJL, str, c1533490q0Z.LJJIII, c1533490q0Z.LJJIIJZLJL, fileLIZJ), Boolean.FALSE)) {
                        C1533940q1I.LJ(c1533790q133);
                        setFetcherError(6, "cdn cache expired");
                        function1.invoke(c1533790q13);
                        return;
                    }
                }
            } else if (fileLIZJ == null || !fileLIZJ.exists() || fileLIZJ.isDirectory()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                if (fileLIZJ == null || (absoluteFile = fileLIZJ.getAbsoluteFile()) == null) {
                    absoluteFile = "non-file";
                }
                sbLIZ.append(absoluteFile);
                sbLIZ.append(" not exists or a directory");
                setFetcherError(8, C2188811AlT.LIZIZ(sbLIZ));
                C1533940q1I.LJ(c1533790q133);
                function1.invoke(c1533790q13);
                return;
            }
            if (C1533950q1J.LIZ(c1533790q133, c1533790q13)) {
                c1533790q13.LIZIZ = true;
            } else {
                setFetcherError(8, "copy response failed");
            }
            function1.invoke(c1533790q13);
            return;
        }
        setFetcherError(3, "cannot find cached buffer");
        function1.invoke(c1533790q13);
    }
}
