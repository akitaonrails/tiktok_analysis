package com.bytedance.forest.chain.fetchers;

import X.AbstractC1528710psr;
import X.AbstractC1534540q2G;
import X.C0VSJ;
import X.C1531040pwc;
import X.C1531110pwj;
import X.C1533490q0Z;
import X.C1533510q0b;
import X.C1533790q13;
import com.bytedance.forest.Forest;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS263S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class BuiltinFetcher extends ResourceFetcher {
    public static final C1531040pwc Companion = new C1531040pwc();
    public static String[] dirList;

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
    }

    public BuiltinFetcher(Forest forest) {
        super(forest);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.0pwj] */
    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public C1531110pwj fetch(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        if (c1533490q0Z.LJJJJLI.LIZ()) {
            setFetcherError(2, "Could not get Channel Or Bundle");
            return null;
        }
        C1531040pwc c1531040pwc = Companion;
        C1533510q0b c1533510q0b = c1533490q0Z.LJJJJLI;
        c1531040pwc.getClass();
        final String strLIZJ = C1531040pwc.LIZJ(c1533510q0b);
        if (C1531040pwc.LIZ(getForest().getApplication(), c1533490q0Z.LJJJJLI.LIZIZ) && C1531040pwc.LIZIZ(getForest().getApplication(), strLIZJ)) {
            return new AbstractC1534540q2G(strLIZJ) { // from class: X.0pwj
                public final String LIZLLL;

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
                    return "AssetsDataProvider";
                }

                @Override // X.InterfaceC1535220q3M
                public final EnumC1528510psX LIZJ() {
                    return EnumC1528510psX.NO_REUSE;
                }

                {
                    this.LIZLLL = strLIZJ;
                }

                @Override // X.AbstractC1534540q2G
                public final void LJII(C1533790q13 c1533790q132, Function1<? super AbstractC1534220q1k<?>, Unit> function1) {
                    AbstractC1534220q1k<C1531120pwk> abstractC1534220q1k;
                    c1533790q132.LJI = true;
                    try {
                        InputStream inputStreamOpen = Forest.Companion.getApp().getAssets().open(this.LIZLLL);
                        C1534590q2L c1534590q2L = LIZLLL().LIZ;
                        String str = this.LIZLLL;
                        c1534590q2L.LJFF = str;
                        c1533790q132.LJIIJJI = str;
                        c1533790q132.LJI = true;
                        abstractC1534220q1k = new AbstractC1534220q1k<C1531120pwk>(new C1531120pwk(inputStreamOpen, this.LIZLLL)) { // from class: X.0pwi
                            @Override // X.AbstractC1534220q1k
                            public final AbstractC1534220q1k<C1531120pwk> LIZ(C1533790q13 c1533790q133) {
                                return this;
                            }

                            @Override // X.AbstractC1534220q1k
                            public final void LIZJ() {
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Assets, path: ");
                                sbLIZ.append(((C1531120pwk) this.LIZLLL).LIZ);
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }
                        };
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1534250q1n.LIZJ("AssetsDataProvider", "error occurs when getting input stream from builtin", e, true);
                        abstractC1534220q1k = null;
                    }
                    function1.invoke(abstractC1534220q1k);
                }
            };
        }
        setFetcherError(3, "builtin resource not exists");
        return null;
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) {
        fetchAsync(c1533490q0Z, c1533790q13, AFwS263S0000000_23.get$arr$(20));
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
        if (c1533490q0Z.LJJJJLI.LIZ()) {
            setFetcherError(2, "Could not get Channel Or Bundle");
            function1.invoke(c1533790q13);
            return;
        }
        C1531040pwc c1531040pwc = Companion;
        C1533510q0b c1533510q0b = c1533490q0Z.LJJJJLI;
        c1531040pwc.getClass();
        final String strLIZJ = C1531040pwc.LIZJ(c1533510q0b);
        if (C1531040pwc.LIZ(getForest().getApplication(), c1533490q0Z.LJJJJLI.LIZIZ) && C1531040pwc.LIZIZ(getForest().getApplication(), strLIZJ)) {
            c1533790q13.LIZIZ = true;
            c1533790q13.LJ = "builtin";
            c1533790q13.LJI = true;
            final C0VSJ c0vsj = new C0VSJ(strLIZJ);
            c1533790q13.LJIILJJIL(new AbstractC1528710psr() { // from class: X.0pwe
                @Override // X.AbstractC1533800q14
                public final boolean LJI() {
                    return true;
                }

                @Override // X.AbstractC1528710psr, X.AbstractC1533800q14
                public final String toString() {
                    return "BuiltinDataProvider";
                }

                @Override // X.AbstractC1533800q14
                public final InputStream LJIILLIIL() {
                    try {
                        return Forest.Companion.getApp().getAssets().open(strLIZJ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1534250q1n.LIZJ("ForestBuffer", "error occurs when getting input stream from builtin", e, true);
                        return null;
                    }
                }

                @Override // X.AbstractC1528710psr, X.AbstractC1533800q14
                public final File LJIILL() {
                    return c0vsj;
                }
            });
        } else {
            setFetcherError(3, "builtin resource not exists");
        }
        function1.invoke(c1533790q13);
    }
}
