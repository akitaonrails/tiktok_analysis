package com.ss.ugc.effectplatform.algorithm;

import X.C098200Yq;
import X.C0C64;
import X.C13Q5;
import X.C13QQ;
import X.C13RD;
import X.C13SS;
import X.C1700140uLM;
import X.C189200o6;
import X.C19997513Mf;
import X.C20006313Pp;
import X.C20006413Pq;
import X.C20007013Pw;
import X.C20008613Qm;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1633730scF;
import android.content.Context;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import z1p.e;

/* JADX INFO: loaded from: classes31.dex */
public final class AlgorithmModelResourceFinder extends e implements ResourceFinder {
    public static final C20007013Pw Companion = new C20007013Pw();
    public static final ConcurrentHashMap<String, Boolean> modelsNotFoundRecord = new ConcurrentHashMap<>();
    public final C20006313Pp algorithmModelCache;
    public final AssetResourceFinder assetResourceFinder;
    public final C20008613Qm buildInAssetsManager;
    public final C13RD effectConfig;
    public long effectHandle;
    public final C13QQ eventListener;

    public static final String findResourceUri(String str, String str2) {
        Companion.getClass();
        return C20007013Pw.LIZ(str, str2);
    }

    private final native long nativeCreateMD5ResourceFinder(long j);

    private final native long nativeCreateResourceFinder(long j);

    @Override // z1p.e
    public long getEffectHandle() {
        return this.effectHandle;
    }

    private final void mobModelFound(String str) {
        C13RD c13rd = this.effectConfig;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            C19997513Mf.LJII(interfaceC1633730scF, true, c13rd, str, "");
        }
    }

    public static final void modelNotFound(String str) {
        Companion.getClass();
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("modelNotFound:nameStr=");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZIZ("ResourceFinder", strLIZIZ, null);
        C13Q5.LIZ().LIZLLL().onModelNotFound(str, "asset://not_found");
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeMD5ResourceFinder(long j) {
        return nativeCreateMD5ResourceFinder(j);
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeResourceFinder(long j) {
        C1700140uLM.LIZ.LIZ();
        this.effectHandle = j;
        this.assetResourceFinder.createNativeResourceFinder(j);
        return nativeCreateResourceFinder(j);
    }

    @Override // z1p.e
    public String getBuiltInResourceUrl(String str) {
        Object c098200Yq;
        boolean z = false;
        try {
            c098200Yq = str.substring(0, a0.LJJJJI(str, "/", 0, 6));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String strLIZIZ = "";
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "";
        }
        String str2 = (String) c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("model");
        if (str2.length() > 0) {
            z = true;
        }
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('/');
            sbLIZ2.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        List<String> listLIZIZ = this.buildInAssetsManager.LIZIZ(strLIZIZ2);
        String strLIZLLL = C20006413Pq.LIZLLL(str);
        if (listLIZIZ != null) {
            for (String str3 : listLIZIZ) {
                if (Intrinsics.LJFF(C20006413Pq.LIZLLL(str3), strLIZLLL)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("asset://");
                    sbLIZ3.append(strLIZIZ2);
                    sbLIZ3.append('/');
                    sbLIZ3.append(str3);
                    return C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
        }
        return super.getBuiltInResourceUrl(str);
    }

    @Override // z1p.e
    public boolean isExactBuiltInResource(String str) {
        Object c098200Yq;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ep_enabled_builtin_resource_io_optimization", true, false)) {
            try {
                c098200Yq = str.substring(0, a0.LJJJJI(str, "/", 0, 6));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            String strLIZIZ = "";
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = "";
            }
            String str2 = (String) c098200Yq;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("model");
            if (str2.length() > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('/');
                sbLIZ2.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            sbLIZ.append(strLIZIZ);
            List<String> listLIZIZ = this.buildInAssetsManager.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            String strLIZLLL = C20006413Pq.LIZLLL(str);
            if (listLIZIZ != null) {
                Iterator<String> it2 = listLIZIZ.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(C20006413Pq.LIZLLL(it2.next()), strLIZLLL)) {
                        return true;
                    }
                }
            }
        }
        return super.isExactBuiltInResource(str);
    }

    @Override // z1p.e
    public void onModelFound(String str) {
        mobModelFound(str);
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public void release(long j) {
        this.effectHandle = 0L;
        this.assetResourceFinder.release(j);
    }

    public static final String findResourceMd5(String str, String str2) {
        Companion.getClass();
        if (!C13Q5.LIZJ()) {
            return "asset://not_initialized";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strRealFindResourceMd5 = C13Q5.LIZ().LIZLLL().realFindResourceMd5(0, str, str2);
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("findResourceMd5 name: ");
        sbLIZ.append(str2);
        sbLIZ.append(", result: ");
        sbLIZ.append(strRealFindResourceMd5);
        sbLIZ.append(", time cost: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ.append(" ms");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("checkEffect", strLIZIZ);
        return strRealFindResourceMd5;
    }

    private final void mobModelNotFound(String str, String str2) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = modelsNotFoundRecord;
        if (concurrentHashMap.contains(str)) {
            return;
        }
        concurrentHashMap.put(str, Boolean.TRUE);
        C13RD c13rd = this.effectConfig;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            C19997513Mf.LJII(interfaceC1633730scF, false, c13rd, str, str2);
        }
    }

    @Override // z1p.e
    public void onModelNotFound(String str, String str2) {
        super.onModelNotFound(str, str2);
        mobModelNotFound(str, str2);
    }

    public AlgorithmModelResourceFinder(C20006313Pp c20006313Pp, C20008613Qm c20008613Qm, C13QQ c13qq, C13RD c13rd) {
        super(c20006313Pp, c20008613Qm, c13qq);
        this.algorithmModelCache = c20006313Pp;
        this.buildInAssetsManager = c20008613Qm;
        this.eventListener = c13qq;
        this.effectConfig = c13rd;
        this.assetResourceFinder = new AssetResourceFinder(C786410Ut5.N3((Context) c20008613Qm.LIZ).getAssets(), c20006313Pp.LIZ);
    }
}
