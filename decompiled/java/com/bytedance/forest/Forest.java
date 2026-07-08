package com.bytedance.forest;

import X.AbstractC1533800q14;
import X.AbstractC1534220q1k;
import X.C086F;
import X.C0VSZ;
import X.C1492150ovt;
import X.C1531180pwq;
import X.C1532250pyZ;
import X.C1532910pzd;
import X.C1533370q0N;
import X.C1533480q0Y;
import X.C1533490q0Z;
import X.C1533510q0b;
import X.C1533560q0g;
import X.C1533650q0p;
import X.C1533690q0t;
import X.C1533700q0u;
import X.C1533790q13;
import X.C1533870q1B;
import X.C1533900q1E;
import X.C1533910q1F;
import X.C1533940q1I;
import X.C1533950q1J;
import X.C1534000q1O;
import X.C1534010q1P;
import X.C1534080q1W;
import X.C1534250q1n;
import X.C1534490q2B;
import X.C1534570q2J;
import X.C1534660q2S;
import X.C1534840q2k;
import X.C1535250q3P;
import X.C19994513Lb;
import X.C2188811AlT;
import X.EnumC1533980q1M;
import X.EnumC1534440q26;
import X.EnumC1534520q2E;
import X.InterfaceC1532860pzY;
import X.InterfaceC1535390q3d;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.app.Application;
import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.CDNFetcher;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.forest.model.ForestEnvData;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS424S0200000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class Forest {
    public static final Companion Companion = new Companion();
    public static Application app;
    public static C1533650q0p globalConfig;
    public static InterfaceC1535390q3d globalForestListener;
    public static final boolean isDebug;
    public static boolean supportLog;
    public static boolean supportMonitorMemory;
    public final Application application;
    public final C1533560q0g config;
    public final Map<String, Class<? extends ResourceFetcher>> fetcherMap;
    public final GeckoXAdapter geckoXAdapter;
    public final C1533370q0N sessionManager;

    public static final class Companion {
        public final Application getApp() {
            Application application = Forest.app;
            if (application != null) {
                return application;
            }
            return null;
        }

        public final InterfaceC1535390q3d getGlobalForestListener() {
            Companion companion = Forest.Companion;
            return null;
        }

        public final C1533650q0p getGlobalConfig() {
            return Forest.globalConfig;
        }

        public final boolean getSupportLog$forest_release() {
            return Forest.supportLog;
        }

        public final boolean getSupportMonitorMemory$forest_release() {
            return Forest.supportMonitorMemory;
        }

        public final boolean isDebug() {
            return Forest.isDebug;
        }

        public final void initGlobal(C1533650q0p c1533650q0p) {
            boolean z;
            Forest.globalConfig = c1533650q0p;
            float fNextFloat = C19994513Lb.LIZIZ(System.currentTimeMillis()).nextFloat();
            boolean z2 = false;
            if (!getSupportLog$forest_release() && fNextFloat >= ForestExperiment.INSTANCE.getLogThreshold()) {
                z = false;
            } else {
                z = true;
            }
            setSupportLog$forest_release(z);
            if (fNextFloat < ForestExperiment.INSTANCE.getMonitorMemoryThreshold()) {
                z2 = true;
            }
            setSupportMonitorMemory$forest_release(z2);
        }

        public final void onResponseCorrupt(C1533790q13 c1533790q13) {
            C086F c086f = C086F.LIZ;
            ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(c1533790q13, 14);
            c086f.getClass();
            C086F.LIZLLL(aRunnableS123S0100000_23);
        }

        public final void setApp(Application application) {
            Forest.app = application;
        }

        public final void setGlobalForestListener(InterfaceC1535390q3d interfaceC1535390q3d) {
            Companion companion = Forest.Companion;
        }

        public final void setSupportLog$forest_release(boolean z) {
            Forest.supportLog = z;
        }

        public final void setSupportMonitorMemory$forest_release(boolean z) {
            Forest.supportMonitorMemory = z;
        }

        public final String assembleGeckoCDNUrl(String str, String str2, String str3, EnumC1534520q2E enumC1534520q2E) {
            C1533690q0t c1533690q0tLIZ;
            String strLJJJLL = a0.LJJJLL("/", a0.LJJJJZ("/", str));
            String strLJJJLL2 = a0.LJJJLL("/", a0.LJJJJZ("/", str2));
            String strLJJJLL3 = a0.LJJJLL("/", a0.LJJJJZ("/", str3));
            C1533650q0p globalConfig = getGlobalConfig();
            if (globalConfig != null && (c1533690q0tLIZ = globalConfig.LIZ()) != null && enumC1534520q2E != EnumC1534520q2E.I18N) {
                C1533700q0u c1533700q0u = c1533690q0tLIZ.LIZ;
                if ((enumC1534520q2E == EnumC1534520q2E.TARGET && c1533700q0u.LIZ != null && c1533700q0u.LIZIZ != null) || ((c1533700q0u = c1533690q0tLIZ.LIZIZ) != null && enumC1534520q2E == EnumC1534520q2E.FALLBACK && c1533700q0u.LIZ != null && c1533700q0u.LIZIZ != null && c1533700q0u != null)) {
                    return "https://" + c1533700q0u.LIZ + "/obj/" + a0.LJJJLL("/", a0.LJJJJZ("/", c1533700q0u.LIZIZ)) + '/' + strLJJJLL + '/' + strLJJJLL2 + '/' + strLJJJLL3;
                }
            }
            if (enumC1534520q2E != EnumC1534520q2E.I18N) {
                return null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/");
            sbLIZ.append(strLJJJLL);
            sbLIZ.append('/');
            sbLIZ.append(strLJJJLL2);
            sbLIZ.append('/');
            sbLIZ.append(strLJJJLL3);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final Iterable<String> assembleGeckoCDNUrlList(String str, String str2, String str3, EnumC1534520q2E enumC1534520q2E) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            EnumC1534520q2E[] enumC1534520q2EArrValues = EnumC1534520q2E.values();
            int length = enumC1534520q2EArrValues.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                EnumC1534520q2E enumC1534520q2E2 = enumC1534520q2EArrValues[i];
                int i3 = i2 + 1;
                if (i2 > enumC1534520q2E.ordinal()) {
                    break;
                }
                String strAssembleGeckoCDNUrl = Forest.Companion.assembleGeckoCDNUrl(str, str2, str3, enumC1534520q2E2);
                if (strAssembleGeckoCDNUrl != null) {
                    linkedHashSet.add(strAssembleGeckoCDNUrl);
                }
                i++;
                i2 = i3;
            }
            return linkedHashSet;
        }
    }

    public final void preload(String str, RequestParams requestParams, boolean z) {
        preload$default(this, str, requestParams, false, null, null, z, null, 92, null);
    }

    public final void preload(String str, RequestParams requestParams, boolean z, String str2, String str3, boolean z2) {
        preload$default(this, str, requestParams, z, str2, str3, z2, null, 64, null);
    }

    public final void preload(String str, RequestParams requestParams, boolean z, String str2, boolean z2) {
        preload$default(this, str, requestParams, z, str2, null, z2, null, 80, null);
    }

    public final void preload(String str, RequestParams requestParams, boolean z, boolean z2) {
        preload$default(this, str, requestParams, z, null, null, z2, null, 88, null);
    }

    static {
        ForestEnvData forestEnvData;
        C1533650q0p c1533650q0p = globalConfig;
        boolean z = false;
        if (c1533650q0p != null && (forestEnvData = c1533650q0p.LJ) != null && forestEnvData.isDebug()) {
            z = true;
        }
        isDebug = z;
        supportLog = z;
    }

    public final String getName() {
        return this.config.LJFF;
    }

    public final Application getApplication() {
        return this.application;
    }

    public final C1533560q0g getConfig() {
        return this.config;
    }

    public final Map<String, Class<? extends ResourceFetcher>> getFetcherMap$forest_release() {
        return this.fetcherMap;
    }

    public final GeckoXAdapter getGeckoXAdapter() {
        return this.geckoXAdapter;
    }

    public final C1533370q0N getSessionManager$forest_release() {
        return this.sessionManager;
    }

    public final void closeSession(String str) {
        Iterator it2 = ((LinkedHashMap) this.sessionManager.LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (Intrinsics.LJFF(((Pair) entry.getKey()).getFirst(), str)) {
                ((C0VSZ) entry.getValue()).LIZJ();
                it2.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, X.0q13] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1533790q13 fetchSync$forest_release(X.C1533910q1F r14) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.forest.Forest.fetchSync$forest_release(X.0q1F):X.0q13");
    }

    public final void onUrlCorrupt(List<String> list) {
        C086F c086f = C086F.LIZ;
        AwS424S0200000_23 awS424S0200000_23 = new AwS424S0200000_23((List) list, (List<String>) this, (Forest) 7);
        c086f.getClass();
        C086F.LJI(awS424S0200000_23);
    }

    public final String openSession(String str) {
        this.sessionManager.getClass();
        if (str == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append('-');
            sbLIZ.append(UUID.randomUUID());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public final void preload(C1534660q2S c1534660q2S) {
        preload(c1534660q2S, (String) null, (String) null, "");
    }

    public final void unregisterCustomFetcher(String str) {
        if (C1531180pwq.LIZ.contains(str)) {
            C1534250q1n.LIZIZ("ForestFacade", "can't remove builtin fetcher", null);
        } else {
            this.fetcherMap.remove(str);
        }
    }

    public Forest(Application application, C1533560q0g c1533560q0g) {
        this.application = application;
        this.config = c1533560q0g;
        this.geckoXAdapter = new GeckoXAdapter(application, this);
        Companion.setApp(application);
        InterfaceC1532860pzY.LIZ.getClass();
        C1532910pzd.LIZIZ = application;
        CDNFetcher.Companion.getClass();
        if (!CDNFetcher.isInitialized) {
            CDNFetcher.isInitialized = true;
        }
        this.fetcherMap = new LinkedHashMap();
        this.sessionManager = new C1533370q0N(application);
    }

    public final boolean checkParams$forest_release(String str, RequestParams requestParams) {
        if ((C1533950q1J.LJ(requestParams.channel) && C1533950q1J.LJ(requestParams.bundle)) || C1532250pyZ.LIZ(str)) {
            return true;
        }
        return false;
    }

    public final C1533910q1F createSyncRequest(String str, RequestParams requestParams) {
        if (ForestExperiment.INSTANCE.getEnableGlobalPreload()) {
            return new C1533900q1E(this, null, true, 2).LIZLLL(str, requestParams, false, false, "createSyncRequest", false);
        }
        if (!checkParams$forest_release(str, requestParams)) {
            return null;
        }
        return new C1533910q1F(requestParams, str, this, null, null, false, false, null, false, 504);
    }

    public final void preload(C1534660q2S c1534660q2S, String str) {
        preload(c1534660q2S, str, (String) null, "");
    }

    public final void registerCustomFetcher(String str, Class<? extends ResourceFetcher> cls) {
        if (C1531180pwq.LIZ.contains(str)) {
            C1534250q1n.LIZIZ("ForestFacade", "fetcherName clash with builtin fetchers", null);
        } else {
            this.fetcherMap.put(str, cls);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Type> C1533910q1F createSyncRequest(String str, Class<Type> cls, RequestParams requestParams) {
        requestParams.consumeType = cls;
        return createSyncRequest(str, requestParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.0q2J] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1533910q1F fetchResourceAsync(java.lang.String r25, com.bytedance.forest.model.RequestParams r26, kotlin.jvm.functions.Function1<? super X.C1533790q13, kotlin.Unit> r27) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.forest.Forest.fetchResourceAsync(java.lang.String, com.bytedance.forest.model.RequestParams, kotlin.jvm.functions.Function1):X.0q1F");
    }

    public final void preload(C1534660q2S c1534660q2S, String str, String str2) {
        preload(c1534660q2S, str, str2, "");
    }

    public final void triggerCallback$forest_release(boolean z, Function1<? super C1533790q13, Unit> function1, C1533790q13 c1533790q13) {
        C1534490q2B.LIZLLL(c1533790q13);
        if (z) {
            C086F c086f = C086F.LIZ;
            ARunnableS92S0200000_23 aRunnableS92S0200000_23 = new ARunnableS92S0200000_23(c1533790q13, function1, 9);
            c086f.getClass();
            C086F.LJII(aRunnableS92S0200000_23);
            return;
        }
        c1533790q13.LIZJ.LIZIZ();
        function1.invoke(c1533790q13);
    }

    public final void finishWithCallback$forest_release(C1533790q13 c1533790q13, boolean z, C1533910q1F c1533910q1F, Function1<? super C1533790q13, Unit> function1) {
        String fetcherName;
        c1533790q13.LIZJ.LIZJ("fetch");
        if (c1533790q13.LIZIZ && c1533790q13.LJ() == null) {
            Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
            EnumC1533980q1M enumC1533980q1M = c1533790q13.LIZ.LJJJ;
            ResourceFetcher resourceFetcher = c1533790q13.LJIJJ;
            if (resourceFetcher == null || (fetcherName = resourceFetcher.getFetcherName()) == null) {
                fetcherName = c1533790q13.LJ;
            }
            C1533480q0Y.LIZJ("ForestFacade", enumC1533980q1M, fetcherName, Boolean.valueOf(Intrinsics.LJFF(c1533790q13.LIZ.LJJJJZ, C1534080q1W.LIZ)), "load succeeds with no dataProvider", c1533790q13.LIZ.LJJJJIZL, null, null, null, null, null, 8128);
            c1533790q13.LIZIZ = false;
        }
        if (c1533790q13.LIZIZ && !C1533950q1J.LIZLLL(c1533790q13, false)) {
            c1533790q13.LIZIZ = false;
        }
        c1533910q1F.LJIIIIZZ = EnumC1534440q26.FINISHED;
        triggerCallback$forest_release(z, function1, c1533790q13);
        C1534250q1n c1534250q1n = C1534250q1n.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("response:");
        sbLIZ.append(c1533790q13);
        C1534250q1n.LIZ(c1534250q1n, "fetchResourceAsync", C2188811AlT.LIZIZ(sbLIZ));
        C1534490q2B.LIZ(c1533790q13);
        if (!c1533790q13.LIZIZ) {
            Function2<? super String, ? super C1535250q3P, Unit> function22 = C1533480q0Y.LIZ;
            C1533480q0Y.LJ(c1533790q13, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void preload(X.C1534660q2S r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.forest.Forest.preload(X.0q2S, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final C1533790q13 reuseResponse$forest_release(C1533790q13 c1533790q13, C1534570q2J c1534570q2J, RequestParams requestParams, long j) {
        LinkedHashMap linkedHashMap;
        Object obj;
        C1534000q1O c1534000q1OLJ;
        C1534010q1P c1534010q1PLIZLLL;
        AbstractC1534220q1k<?> abstractC1534220q1k;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
        boolean z = c1533790q13.LIZIZ;
        C1492150ovt c1492150ovt = c1533790q13.LIZJ;
        C1533790q13 c1533790q132 = new C1533790q13(c1533490q0Z, z, c1492150ovt, c1533790q13.LIZLLL, c1533790q13.LJ, c1533790q13.LJFF, c1533790q13.LJI, c1533790q13.LJII, c1533790q13.LJIIIIZZ, c1533790q13.LJIIIZ, c1533790q13.LJIIJ);
        C1533490q0Z c1533490q0Z2 = c1533790q13.LIZ;
        c1533490q0Z2.getClass();
        AbstractC1533800q14 abstractC1533800q14 = null;
        C1533490q0Z c1533490q0Z3 = new C1533490q0Z(c1533490q0Z2.LJJJJJ, new RequestParams(false ? 1 : 0, 1, false ? 1 : 0), c1533490q0Z2.LJJJJIZL, c1533490q0Z2.LJJJJJL);
        c1533490q0Z3.LIZ = c1533490q0Z2.LIZ;
        c1533490q0Z3.LIZIZ = c1533490q0Z2.LIZIZ;
        c1533490q0Z3.LIZJ = c1533490q0Z2.LIZJ;
        c1533490q0Z3.LIZLLL = c1533490q0Z2.LIZLLL;
        c1533490q0Z3.LJ = c1533490q0Z2.LJ;
        c1533490q0Z3.LJII = c1533490q0Z2.LJII;
        c1533490q0Z3.LJIIIIZZ = c1533490q0Z2.LJIIIIZZ;
        c1533490q0Z3.LJIIIZ = c1533490q0Z2.LJIIIZ;
        c1533490q0Z3.LJIIJ = c1533490q0Z2.LJIIJ;
        c1533490q0Z3.LJIIL = c1533490q0Z2.LJIIL;
        c1533490q0Z3.LJIILIIL = c1533490q0Z2.LJIILIIL;
        c1533490q0Z3.LJIILL = c1533490q0Z2.LJIILL;
        c1533490q0Z3.LJIILLIIL = c1533490q0Z2.LJIILLIIL;
        c1533490q0Z3.LJIIZILJ = c1533490q0Z2.LJIIZILJ;
        c1533490q0Z3.LJIJ = c1533490q0Z2.LJIJ;
        c1533490q0Z3.LJIJI = c1533490q0Z2.LJIJI;
        c1533490q0Z3.LJIJJ = c1533490q0Z2.LJIJJ;
        c1533490q0Z3.LJIJJLI = c1533490q0Z2.LJIJJLI;
        c1533490q0Z3.LJIL = c1533490q0Z2.LJIL;
        c1533490q0Z3.LJJ = c1533490q0Z2.LJJ;
        c1533490q0Z3.LJJI = c1533490q0Z2.LJJI;
        c1533490q0Z3.LJJIFFI = c1533490q0Z2.LJJIFFI;
        c1533490q0Z3.LJJII = c1533490q0Z2.LJJII;
        c1533490q0Z3.LJJIII = c1533490q0Z2.LJJIII;
        c1533490q0Z3.LJJIIJ = c1533490q0Z2.LJJIIJ;
        c1533490q0Z3.LJJIIJZLJL = c1533490q0Z2.LJJIIJZLJL;
        c1533490q0Z3.LJJIJ = c1533490q0Z2.LJJIJ;
        c1533490q0Z3.LJJIJIIJI = c1533490q0Z2.LJJIJIIJI;
        c1533490q0Z3.LJJIJIIJIL = c1533490q0Z2.LJJIJIIJIL;
        c1533490q0Z3.LJJIJIL = c1533490q0Z2.LJJIJIL;
        c1533490q0Z3.LJJIJL = c1533490q0Z2.LJJIJL;
        c1533490q0Z3.LJJIJLIJ = c1533490q0Z2.LJJIJLIJ;
        c1533490q0Z3.LJJIL = c1533490q0Z2.LJJIL;
        c1533490q0Z3.LJJIZ = c1533490q0Z2.LJJIZ;
        c1533490q0Z3.LJJJ = c1533490q0Z2.LJJJ;
        c1533490q0Z3.LJJJI = c1533490q0Z2.LJJJI;
        c1533490q0Z3.LJJJIL = c1533490q0Z2.LJJJIL;
        c1533490q0Z3.LJJJJ = c1533490q0Z2.LJJJJ;
        c1533490q0Z3.LJJJJI = c1533490q0Z2.LJJJJI;
        c1533490q0Z3.LJJJJLL = c1533490q0Z2.LJJJJLL;
        c1533490q0Z3.LJJJJZ = c1533490q0Z2.LJJJJZ;
        c1533490q0Z3.LJJJJZI = c1533490q0Z2.LJJJJZI;
        c1533490q0Z3.LJJJLIIL = c1533490q0Z2.LJJJLIIL;
        C1533510q0b c1533510q0b = c1533490q0Z2.LJJJJLI;
        C1533510q0b c1533510q0b2 = c1533490q0Z3.LJJJJLI;
        c1533510q0b2.LIZ = c1533510q0b.LIZ;
        c1533510q0b2.LIZIZ = c1533510q0b.LIZIZ;
        c1533510q0b2.LIZJ = c1533510q0b.LIZJ;
        c1533510q0b2.LIZLLL = c1533510q0b.LIZLLL;
        c1533510q0b2.LJ = c1533510q0b.LJ;
        c1533510q0b2.LJFF = c1533510q0b.LJFF;
        c1533510q0b2.LJI = c1533510q0b.LJI;
        c1533510q0b2.LJII = c1533510q0b.LJII;
        c1533510q0b2.LJIIIIZZ = c1533510q0b.LJIIIIZZ;
        c1533490q0Z3.LJJJLL = new ArrayList(c1533490q0Z2.LJJJLL);
        Map<String, Object> map = c1533490q0Z2.LJFF;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = null;
        }
        c1533490q0Z3.LJFF = linkedHashMap;
        c1533790q132.LIZ = c1533490q0Z3;
        c1533790q132.LJJIJL = true;
        c1533790q132.LJJI = c1533790q13.LIZIZ();
        c1533790q132.LJJIIZI = c1533790q13.LJJIIZI;
        c1533790q132.LJJIJ = c1533790q13.LJJIJ;
        c1533790q132.LJIILJJIL = c1533790q13.LJIILJJIL;
        c1533790q132.LJJ = c1533790q13.LJJ;
        C1533490q0Z c1533490q0Z4 = c1533790q132.LIZ;
        c1533490q0Z4.LJJIIZ = false;
        c1533490q0Z4.LJIJJ = true;
        c1533490q0Z4.LJJIFFI = requestParams.groupId;
        c1533490q0Z4.LJFF = requestParams.customParams;
        if (c1533490q0Z4.LJJJ == EnumC1533980q1M.LYNX_IMAGE && c1533790q132.LJFF() != null) {
            c1533790q132.LJJIJIIJI = true;
        }
        C1534840q2k c1534840q2kLIZIZ = C1533940q1I.LIZIZ(c1533790q132);
        if (c1534840q2kLIZIZ != null && (abstractC1534220q1k = c1534840q2kLIZIZ.LIZIZ) != null) {
            obj = abstractC1534220q1k.LIZLLL;
        } else {
            obj = null;
        }
        if (((obj instanceof C1534010q1P) && (c1534010q1PLIZLLL = (C1534010q1P) obj) != null) || ((c1534000q1OLJ = c1533790q13.LJ()) != null && (c1534010q1PLIZLLL = c1534000q1OLJ.LIZLLL()) != null)) {
            if (!c1534010q1PLIZLLL.LJJJJJ() && c1533790q132.LIZ.LJJIJIIJI) {
                c1534010q1PLIZLLL.LJJJLL(c1533790q132);
            } else if (c1534570q2J == null || !c1534570q2J.LLILZLL) {
                c1533790q132.LJJIJIIJI = true;
            }
            c1533790q132.LJIILJJIL(c1534010q1PLIZLLL);
        } else {
            C1534000q1O c1534000q1OLJ2 = c1533790q13.LJ();
            if (c1534000q1OLJ2 != null && c1534000q1OLJ2.LIZIZ()) {
                C1534000q1O c1534000q1OLJ3 = c1533790q13.LJ();
                if (c1534000q1OLJ3 != null) {
                    abstractC1533800q14 = c1534000q1OLJ3.LIZ;
                }
                c1533790q132.LJIILJJIL(abstractC1533800q14);
            }
        }
        if ((c1534570q2J == null || !c1534570q2J.LLILZLL) && c1533790q132.LJJIJIIJI && !Intrinsics.LJFF(c1533790q132.LJ, "memory")) {
            c1533790q132.LJFF = c1533790q13.LJ;
            c1533790q132.LJ = "memory";
        }
        c1492150ovt.LJII(j);
        c1492150ovt.LJI(jCurrentTimeMillis, "preload");
        c1492150ovt.LIZJ("preload");
        return c1533790q132;
    }

    public final void preload(String str, RequestParams requestParams, boolean z, String str2, String str3) {
        preload$default(this, str, requestParams, z, str2, str3, false, null, 64, null);
    }

    public final void preload(final String str, final RequestParams requestParams, boolean z, final String str2, final String str3, boolean z2, Function1<? super C1533790q13, Unit> function1) {
        String str4;
        final String strSubstring;
        final boolean z3;
        boolean z4 = false;
        if (ForestExperiment.INSTANCE.getEnableGlobalPreload()) {
            C1533900q1E c1533900q1E = new C1533900q1E(this, null, false, 6);
            requestParams.enableMemoryCache = Boolean.FALSE;
            c1533900q1E.LJFF(str, requestParams, false, null);
            C086F c086f = C086F.LIZ;
            ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(c1533900q1E, 16);
            c086f.getClass();
            C086F.LIZJ(180000L, aRunnableS116S0100000_16);
            return;
        }
        C1533870q1B.LIZ.getClass();
        C1533870q1B.LJI(str);
        C1533870q1B c1533870q1B = C1533870q1B.LIZ;
        if (str2 == null) {
            str4 = "";
        } else {
            str4 = str2;
        }
        requestParams.groupId = str4;
        requestParams.sessionId = str3;
        c1533870q1B.LJFF(this, str, requestParams, z2, function1);
        if (a0.LJJIIZI(str, "?", false)) {
            strSubstring = str.substring(0, a0.LJJJ(str, "?", 0, false, 6));
        } else {
            strSubstring = str;
        }
        if (!u.LJIIZILJ(strSubstring, ".html", false) && !u.LJIIZILJ(strSubstring, ".htm", false) && requestParams.resourceScene != EnumC1533980q1M.WEB_MAIN_DOCUMENT) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (u.LJIIZILJ(strSubstring, "/template.js", false) || requestParams.resourceScene == EnumC1533980q1M.LYNX_TEMPLATE) {
            z4 = true;
        }
        if ((z3 || z4) && z) {
            C086F c086f2 = C086F.LIZ;
            Runnable runnable = new Runnable() { // from class: X.0q16
                public final void LIZ() {
                    LinkedHashMap linkedHashMap;
                    Map map;
                    Double d;
                    Uri uri = UriProtector.parse(strSubstring);
                    GeckoXAdapter.Companion companion = GeckoXAdapter.Companion;
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    C1533510q0b c1533510q0bLIZIZ = C1956907lX.LIZIZ(strSubstring, companion.getPrefixAsGeckoCDN(path));
                    if (c1533510q0bLIZIZ == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Can not parse ak/channel/bundle from ");
                        sbLIZ.append(strSubstring);
                        C1534250q1n.LIZIZ("PreloadAPI", C2188811AlT.LIZIZ(sbLIZ), null);
                        return;
                    }
                    String strLJJIFFI = u.LJJIFFI(strSubstring, c1533510q0bLIZIZ.LIZJ, "preload.json", false);
                    Forest forest = this;
                    RequestParams requestParams2 = new RequestParams(EnumC1533980q1M.PRELOAD_CONFIG);
                    String str5 = str2;
                    String str6 = str3;
                    String str7 = str5 != null ? str5 : "";
                    requestParams2.groupId = str7;
                    requestParams2.sessionId = str6;
                    requestParams2.customParams.put("rl_container_uuid", str7);
                    requestParams2.loadToMemory = true;
                    requestParams2.needLocalFile = Boolean.FALSE;
                    requestParams2.channel = c1533510q0bLIZIZ.LIZIZ;
                    requestParams2.bundle = "preload.json";
                    C1533910q1F c1533910q1FCreateSyncRequest = forest.createSyncRequest(strLJJIFFI, requestParams2);
                    if (c1533910q1FCreateSyncRequest == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Can not build RequestOperation for ");
                        sbLIZ2.append(c1533510q0bLIZIZ.LIZ);
                        sbLIZ2.append('/');
                        sbLIZ2.append(c1533510q0bLIZIZ.LIZIZ);
                        sbLIZ2.append("/preload.json");
                        C1534250q1n.LIZIZ("PreloadAPI", C2188811AlT.LIZIZ(sbLIZ2), null);
                        return;
                    }
                    C1533790q13 c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ();
                    if (c1533790q13LIZIZ == null || !c1533790q13LIZIZ.LIZIZ) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Getting ");
                        sbLIZ3.append(c1533510q0bLIZIZ.LIZ);
                        sbLIZ3.append('/');
                        sbLIZ3.append(c1533510q0bLIZIZ.LIZIZ);
                        sbLIZ3.append("/preload.json failed, msg: ");
                        sbLIZ3.append(c1533790q13LIZIZ != null ? c1533790q13LIZIZ.LIZLLL : null);
                        C1534250q1n.LIZIZ("PreloadAPI", C2188811AlT.LIZIZ(sbLIZ3), null);
                        return;
                    }
                    try {
                        Map map2 = (Map) C1551400qTS.LIZIZ.LIZ.LJII(new String(c1533790q13LIZIZ.LJIIIZ(), Charsets.UTF_8), Map.class);
                        Map<String, String> mapLIZ = C1942307jB.LIZ(UriProtector.parse(str));
                        Object obj = map2.get(strSubstring);
                        if (obj == null) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("Building PreloadConfig for ");
                            sbLIZ4.append(str);
                            sbLIZ4.append(" failed, no matched item in preload.json");
                            C1534250q1n.LIZIZ("PreloadAPI", C2188811AlT.LIZIZ(sbLIZ4), null);
                            return;
                        }
                        boolean z5 = z3;
                        RequestParams requestParams3 = requestParams;
                        EnumC1534650q2R enumC1534650q2R = z5 ? EnumC1534650q2R.WEB : EnumC1534650q2R.LYNX;
                        if (!(obj instanceof Map) || (map = (Map) obj) == null) {
                            linkedHashMap = null;
                        } else {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                            linkedHashMap2.remove("type");
                            Set<Map.Entry> setEntrySet = linkedHashMap2.entrySet();
                            int i = 10;
                            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
                            if (iLIZIZ < 16) {
                                iLIZIZ = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iLIZIZ);
                            for (Map.Entry entry : setEntrySet) {
                                String str8 = (String) entry.getKey();
                                List<Map> list = (List) entry.getValue();
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, i));
                                for (Map map3 : list) {
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append((String) map3.get("url"));
                                    sbLIZ5.append('?');
                                    sbLIZ5.append(C13LP.LJJLIIIJ(((LinkedHashMap) mapLIZ).entrySet(), "&", null, null, 0, null, null, 62));
                                    String strLJJJLL = a0.LJJJLL("?", C2188811AlT.LIZIZ(sbLIZ5));
                                    boolean zBooleanValue = ((Boolean) map3.get("enableMemory")).booleanValue();
                                    Object obj2 = map3.get("size");
                                    if ((obj2 instanceof Double) && (d = (Double) obj2) != null) {
                                        d.doubleValue();
                                    }
                                    arrayList.add(new C1533140q00(strLJJJLL, zBooleanValue, requestParams3.disableCdn));
                                }
                                Pair pair = new Pair(str8, arrayList);
                                linkedHashMap.put(pair.getFirst(), pair.getSecond());
                                i = 10;
                            }
                        }
                        C1534660q2S c1534660q2S = new C1534660q2S(null, enumC1534650q2R, linkedHashMap);
                        c1534660q2S.LIZLLL = requestParams3.customParams;
                        this.preload(c1534660q2S, str2, str3, requestParams.source);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("Building PreloadConfig for ");
                        sbLIZ6.append(str);
                        sbLIZ6.append(" failed, ");
                        sbLIZ6.append(th);
                        C1534250q1n.LIZIZ("PreloadAPI", C2188811AlT.LIZIZ(sbLIZ6), null);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("Forest@c4a6.preload$6");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("Forest@c4a6.preload$6");
                }
            };
            c086f2.getClass();
            if (C086F.LIZ()) {
                C086F.LJFF(runnable);
                return;
            } else {
                runnable.run();
                return;
            }
        }
        C1534250q1n c1534250q1n = C1534250q1n.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Url:");
        sbLIZ.append(str);
        sbLIZ.append(" not need sub-resources preload, withSubResources=");
        sbLIZ.append(z);
        sbLIZ.append(", scene=");
        sbLIZ.append(requestParams.resourceScene);
        C1534250q1n.LIZ(c1534250q1n, "PreloadAPI", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static /* synthetic */ void preload$default(Forest forest, String str, RequestParams requestParams, boolean z, String str2, String str3, int i, Object obj) {
        String str4 = str2;
        boolean z2 = z;
        if ((i & 4) != 0) {
            z2 = false;
        }
        String str5 = null;
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) == 0) {
            str5 = str3;
        }
        forest.preload(str, requestParams, z2, str4, str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void preload$default(Forest forest, String str, RequestParams requestParams, boolean z, String str2, String str3, boolean z2, Function1 function1, int i, Object obj) {
        String str4 = str3;
        String str5 = str2;
        boolean z3 = z;
        if ((i & 4) != 0) {
            z3 = false;
        }
        Function1 function12 = null;
        if ((i & 8) != 0) {
            str5 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 64) == 0) {
            function12 = function1;
        }
        forest.preload(str, requestParams, z3, str5, str4, z2, function12);
    }
}
