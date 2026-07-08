package com.bytedance.forest.chain.fetchers;

import X.C098200Yq;
import X.C0VSJ;
import X.C0VSP;
import X.C1528700psq;
import X.C1532250pyZ;
import X.C1533490q0Z;
import X.C1533500q0a;
import X.C1533510q0b;
import X.C1533570q0h;
import X.C1533790q13;
import X.C1534250q1n;
import X.C1534270q1p;
import X.C1550730qSN;
import X.C1551020qSq;
import X.C1551330qTL;
import X.C1551620qTo;
import X.C189200o6;
import X.C2188811AlT;
import X.InterfaceC1533390q0P;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.GeckoFetcher;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class GeckoFetcher extends ResourceFetcher {
    public static final C1534270q1p Companion = new C1534270q1p();

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
    }

    public GeckoFetcher(Forest forest) {
        super(forest);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void onResponseCorrupted(C1533790q13 c1533790q13) {
        File fileLJIIJ;
        String absolutePath;
        String strLJJZ;
        String str = c1533790q13.LIZ.LJJJJLI.LIZIZ;
        if ((!a0.LJJJIL(str)) && str != null && (fileLJIIJ = C1533790q13.LJIIJ(c1533790q13)) != null && (absolutePath = fileLJIIJ.getAbsolutePath()) != null && (strLJJZ = a0.LJJZ(absolutePath, str, absolutePath)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJJZ);
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                C1551020qSq.LIZIZ(Long.valueOf(c1533790q13.LJIIIZ + 1), strLIZIZ, false, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.AbstractC1534540q2G fetch(X.C1533490q0Z r19, X.C1533790q13 r20) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.forest.chain.fetchers.GeckoFetcher.fetch(X.0q0Z, X.0q13):X.0q2G");
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13) throws InterruptedException {
        C1534250q1n.LIZ(C1534250q1n.LIZ, "GeckoFetcher", "start to fetchSync from gecko");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        fetchAsync(c1533490q0Z, c1533790q13, new AwS602S0100000_23(countDownLatch, 24));
        countDownLatch.await(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
        boolean zLJI = MethodIDManager.LJI(137362);
        C1534250q1n c1534250q1n = C1534250q1n.LIZ;
        c1534250q1n.LJIIL("GeckoFetcher", "fetchAsync");
        getTimer().LIZLLL("total");
        C1533510q0b c1533510q0b = c1533490q0Z.LJJJJLI;
        String str = c1533510q0b.LIZIZ;
        String str2 = c1533510q0b.LIZJ;
        boolean z = false;
        if (str.length() != 0 && str2.length() != 0) {
            String str3 = c1533490q0Z.LJJJJLI.LIZ;
            if (str3.length() == 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("config accessKey ");
                sbLIZ.append(str3);
                sbLIZ.append(" not found, using default");
                C1534250q1n.LJFF("GeckoFetcher", "fetchAsync", C2188811AlT.LIZIZ(sbLIZ), null, false);
            }
            C1533570q0h c1533570q0hLIZIZ = getForest().getConfig().LIZIZ(str3);
            if (c1533570q0hLIZIZ == null) {
                getTimer().LIZJ("total");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("can not find offline root path for access key ");
                sbLIZ2.append(str3);
                sbLIZ2.append(". Neither transmit related parameters of GeckoConfig in ForestConfig nor register access key to gecko sdk.");
                setFetcherError(7, C2188811AlT.LIZIZ(sbLIZ2));
                function1.invoke(c1533790q13);
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            String str4 = c1533570q0hLIZIZ.LIZ;
            C1551330qTL.LIZ.getClass();
            if (!C1551330qTL.LIZIZ.isEmpty()) {
                c1533790q13.LIZLLL.LIZLLL = Boolean.valueOf(C1551330qTL.LJIIIIZZ(str4, str));
            }
            C1550730qSN.LIZ.getClass();
            c1533790q13.LJII = C1550730qSN.LIZLLL(str4, str);
            C1534270q1p c1534270q1p = Companion;
            getForest();
            c1534270q1p.getClass();
            long jLIZJ = C1534270q1p.LIZJ(c1533490q0Z, str, c1533570q0hLIZIZ);
            if (jLIZJ != 0) {
                z = true;
            }
            C1533510q0b c1533510q0b2 = c1533490q0Z.LJJJJLI;
            boolean z2 = c1533510q0b2.LIZLLL;
            boolean z3 = c1533510q0b2.LJI;
            boolean z4 = c1533510q0b2.LJ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("offline resource exist:");
            sbLIZ3.append(z);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            HashMap<String, Object> mapLIZIZ = C1533500q0a.LIZIZ(c1533490q0Z.LJJJJLI);
            mapLIZIZ.put("gecko_access_key", str4);
            c1534250q1n.getClass();
            C1534250q1n.LJIIIZ("GeckoFetcher", "fetchAsync", strLIZIZ, mapLIZIZ, false);
            if (z) {
                if (z3) {
                    loadGeckoFile(c1533490q0Z, c1533790q13, str, str2, true, Long.valueOf(jLIZJ), function1, c1533570q0hLIZIZ);
                } else if (z4) {
                    C1551620qTo.LIZ.getClass();
                    if (C1551620qTo.LIZ(str4, str)) {
                        pullGeckoPackage(c1533490q0Z, c1533790q13, str, str2, function1, c1533570q0hLIZIZ, true, false);
                    } else {
                        loadGeckoFile(c1533490q0Z, c1533790q13, str, str2, true, Long.valueOf(jLIZJ), function1, c1533570q0hLIZIZ);
                        C1534270q1p.LIZ(true, str, c1533490q0Z, z2, str2, false);
                    }
                } else {
                    loadGeckoFile(c1533490q0Z, c1533790q13, str, str2, true, Long.valueOf(jLIZJ), function1, c1533570q0hLIZIZ);
                    C1534270q1p.LIZ(true, str, c1533490q0Z, z2, str2, true);
                }
            } else if (z3) {
                C1534250q1n.LJFF("GeckoFetcher", "fetchAsync", "disable gecko update and no file exists", null, true);
                setFetcherError(3, "disable gecko update and no file exists");
                function1.invoke(c1533790q13);
            } else if (z2) {
                if (C1532250pyZ.LIZ(c1533490q0Z.LJJJJIZL)) {
                    pullGeckoPackage(c1533490q0Z, c1533790q13, str, str2, function1, c1533570q0hLIZIZ, false, false);
                } else {
                    C1551620qTo.LIZ.getClass();
                    if (C1551620qTo.LIZ(str4, str)) {
                        pullGeckoPackage(c1533490q0Z, c1533790q13, str, str2, function1, c1533570q0hLIZIZ, true, false);
                    } else {
                        pullGeckoPackage(c1533490q0Z, c1533790q13, str, str2, function1, c1533570q0hLIZIZ, false, true);
                    }
                }
            } else {
                loadGeckoFile(c1533490q0Z, c1533790q13, str, str2, true, Long.valueOf(jLIZJ), function1, c1533570q0hLIZIZ);
                C1534270q1p.LIZ(false, str, c1533490q0Z, false, str2, false);
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        getTimer().LIZJ("total");
        setFetcherError(2, "channel or bundle is empty for gecko");
        function1.invoke(c1533790q13);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    private final void pullGeckoPackage(final C1533490q0Z c1533490q0Z, final C1533790q13 c1533790q13, String str, final String str2, final Function1<? super C1533790q13, Unit> function1, final C1533570q0h c1533570q0h, boolean z, boolean z2) {
        getTimer().LIZLLL("update");
        final boolean z3 = c1533490q0Z.LJJIJL;
        if (z3) {
            recordMessage("gecko only local");
            loadGeckoFile(c1533490q0Z, c1533790q13, str, str2, true, null, function1, c1533570q0h);
        }
        c1533490q0Z.LJJJJLL = true;
        GeckoXAdapter.Companion.checkUpdate(getForest(), false, str, c1533490q0Z, new InterfaceC1533390q0P() { // from class: X.0q1j
            public boolean LIZ;

            @Override // X.InterfaceC1533390q0P
            public final void LIZ(String str3, Throwable th) {
                if (this.LIZ) {
                    return;
                }
                this.LIZ = true;
                C1534250q1n c1534250q1n = C1534250q1n.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download failed with waitGeckoUpdate=");
                sbLIZ.append(c1533490q0Z.LJJJJLI.LIZLLL);
                sbLIZ.append(" ,channel = ");
                sbLIZ.append(str3);
                sbLIZ.append(",bundle = ");
                sbLIZ.append(str2);
                sbLIZ.append(',');
                sbLIZ.append(th.getMessage());
                C1534250q1n.LIZIZ("GeckoFetcher", C2188811AlT.LIZIZ(sbLIZ), null);
                this.LIZIZ.getTimer().LIZJ("update");
                GeckoFetcher geckoFetcher = this.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("CheckUpdate Failed:");
                sbLIZ2.append(th.getMessage());
                geckoFetcher.recordMessage(C2188811AlT.LIZIZ(sbLIZ2));
                if (z3) {
                    C1534250q1n.LIZ(c1534250q1n, "GeckoFetcher", "failed, skip callbacks when onlyLocal is true");
                } else {
                    this.LIZIZ.loadGeckoFile(c1533490q0Z, c1533790q13, str3, str2, false, null, function1, c1533570q0h);
                }
            }

            @Override // X.InterfaceC1533390q0P
            public final void LIZIZ(Long l, String str3) {
                if (this.LIZ) {
                    return;
                }
                this.LIZ = true;
                this.LIZIZ.getTimer().LIZJ("update");
                C1534250q1n c1534250q1n = C1534250q1n.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download success with waitGeckoUpdate=");
                sbLIZ.append(c1533490q0Z.LJJJJLI.LIZLLL);
                sbLIZ.append(" , channel=");
                sbLIZ.append(str3);
                sbLIZ.append(",bundle=");
                sbLIZ.append(str2);
                C1534250q1n.LIZ(c1534250q1n, "GeckoFetcher", C2188811AlT.LIZIZ(sbLIZ));
                GeckoFetcher geckoFetcher = this.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("is expire cleaned:");
                sbLIZ2.append(c1533790q13.LIZLLL.LIZLLL);
                geckoFetcher.recordMessage(C2188811AlT.LIZIZ(sbLIZ2));
                if (z3) {
                    C1534250q1n.LIZ(c1534250q1n, "GeckoFetcher", "success, skip callbacks when onlyLocal is true");
                } else {
                    this.LIZIZ.loadGeckoFile(c1533490q0Z, c1533790q13, str3, str2, false, l, function1, c1533570q0h);
                }
            }
        }, z, z2);
    }

    public final void loadGeckoFile(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, String str, String str2, boolean z, Long l, Function1<? super C1533790q13, Unit> function1, C1533570q0h c1533570q0h) {
        boolean z2;
        long jLIZJ;
        boolean zLJI = MethodIDManager.LJI(137718);
        if (a0.LJJIIZI(str2, "..", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid bundle: ");
            sbLIZ.append(str2);
            sbLIZ.append(",channel: ");
            sbLIZ.append(str);
            setFetcherError(8, C2188811AlT.LIZIZ(sbLIZ));
            function1.invoke(c1533790q13);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        getTimer().LIZLLL("load");
        C1534270q1p c1534270q1p = Companion;
        Forest forest = getForest();
        c1534270q1p.getClass();
        C0VSJ c0vsjLIZIZ = C1534270q1p.LIZIZ(forest, str, str2, c1533790q13, c1533570q0h);
        if (c0vsjLIZIZ != null && c0vsjLIZIZ.exists()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (c1533490q0Z.LJJJJLI.LJFF) {
                try {
                    C0VSP c0vsp = new C0VSP(c0vsjLIZIZ);
                    if (c0vsp.available() == 0) {
                        setFetcherError(6, "file available size is 0");
                        function1.invoke(c1533790q13);
                        c0vsp.close();
                        getTimer().LIZJ("load");
                        getTimer().LIZJ("total");
                        if (zLJI) {
                            MethodIDManager.LJ();
                            return;
                        }
                        return;
                    }
                    c0vsp.close();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            getTimer().LIZJ("load");
            getTimer().LIZJ("total");
            c1533790q13.LIZIZ = true;
            c1533790q13.LJIILJJIL(new C1528700psq(c0vsjLIZIZ));
            c1533790q13.LJ = "gecko";
            if (c1533790q13.LJIIIZ == 0) {
                if (l != null) {
                    jLIZJ = l.longValue();
                } else {
                    C1534270q1p c1534270q1p2 = Companion;
                    getForest();
                    c1534270q1p2.getClass();
                    jLIZJ = C1534270q1p.LIZJ(c1533490q0Z, str, c1533570q0h);
                }
                c1533790q13.LJIIIZ = jLIZJ;
            }
            c1533790q13.LJI = z;
            function1.invoke(c1533790q13);
        } else {
            getTimer().LIZJ("load");
            if (c1533490q0Z.LJJJJLI.LIZ.length() == 0) {
                recordMessage("Gecko accessKey invalid. Neither GeckoConfig in ForestConfig nor accessKey in RequestParams not transmitted and access key not registered to gecko sdk yet.");
            }
            setFetcherError(3, "gecko File Not Found");
            getTimer().LIZJ("total");
            function1.invoke(c1533790q13);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
