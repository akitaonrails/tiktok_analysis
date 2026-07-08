package z1p;

import X.C0C64;
import X.C13BV;
import X.C13E8;
import X.C13LP;
import X.C13QQ;
import X.C13QT;
import X.C13SB;
import X.C13SS;
import X.C20006313Pp;
import X.C20006413Pq;
import X.C20006813Pu;
import X.C20007213Py;
import X.C20008613Qm;
import X.C20012513Rz;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public class e {
    public static final C13QT Companion = new Object() { // from class: X.13QT
    };
    public static final AtomicBoolean builtinModelPathsPreloadAttempted = new AtomicBoolean(false);
    public static final AtomicBoolean builtinModelPathsPreloadSucceeded = new AtomicBoolean(false);
    public static final ConcurrentHashSet<String> builtinResourcePaths = new ConcurrentHashSet<>();
    public final C20006313Pp algorithmModelCache;
    public final C20008613Qm buildInAssetsManager;
    public final C13QQ eventListener;

    public long getEffectHandle() {
        return 0L;
    }

    public void onModelFound(String str) {
    }

    private final boolean loadBuiltInResourcePathsWithModelPaths() {
        try {
            C13E8 c13e8 = new C13E8();
            c13e8.addLast("model");
            while (!c13e8.isEmpty()) {
                String str = (String) c13e8.removeLast();
                List<String> listLIZIZ = this.buildInAssetsManager.LIZIZ(str);
                if (listLIZIZ == null) {
                    listLIZIZ = C13BV.INSTANCE;
                }
                for (String str2 : listLIZIZ) {
                    if (u.LJIIZILJ(str2, ".model", true)) {
                        ConcurrentHashSet<String> concurrentHashSet = builtinResourcePaths;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append('/');
                        sbLIZ.append(str2);
                        concurrentHashSet.add(C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str);
                        sbLIZ2.append('/');
                        sbLIZ2.append(str2);
                        c13e8.addLast(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Loaded builtin model paths size = ");
            ConcurrentHashSet<String> concurrentHashSet2 = builtinResourcePaths;
            sbLIZ3.append(concurrentHashSet2.size());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            c13ss.getClass();
            C13SS.LIZ("AlgorithmResourceFinder", strLIZIZ);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Loaded builtin model paths = [");
            sbLIZ4.append(C13LP.LJJLIIIJ(concurrentHashSet2, ",", null, null, 0, null, null, 62));
            sbLIZ4.append(']');
            C13SS.LIZ("AlgorithmResourceFinder", C2188811AlT.LIZIZ(sbLIZ4));
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS.LIZ.getClass();
            C13SS.LIZIZ("AlgorithmResourceFinder", "loadBuiltInResourcePathsWithModelPaths failed with exception: ", e);
            return false;
        }
    }

    private final String findDownloadedResourceUri(String str) {
        boolean z;
        C20006813Pu c20006813PuLJIJ = this.algorithmModelCache.LJIJ(C20006413Pq.LIZLLL(str));
        if (c20006813PuLJIJ != null) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (!z) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("file://");
        if (c20006813PuLJIJ != null) {
            str2 = c20006813PuLJIJ.LIZ;
        }
        sbLIZ.append(str2);
        return UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).toString();
    }

    private final String findTransResUri(String str) {
        List<C20012513Rz> listLJIILL;
        String str2;
        String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(str, "resource/trans?effectPath=", "", false), "\"", "", false);
        if (u.LJIIZILJ(strLJJIFFI, "/", false)) {
            strLJJIFFI = strLJJIFFI.substring(0, strLJJIFFI.length() - 1);
        }
        String strSubstring = strLJJIFFI.substring(0, a0.LJJJJI(strLJJIFFI, "/", 0, 6));
        String strSubstring2 = strLJJIFFI.substring(a0.LJJJJI(strLJJIFFI, "/", 0, 6) + 1, strLJJIFFI.length());
        CopyOnWriteArrayList<String> copyOnWriteArrayList = C20007213Py.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strSubstring);
        sbLIZ.append(C13SB.LIZ);
        sbLIZ.append(strSubstring2);
        sbLIZ.append("_trans_");
        if (!C20007213Py.LIZ.contains(C2188811AlT.LIZIZ(sbLIZ)) && (listLJIILL = C13SB.LJIILL(strSubstring)) != null) {
            for (C20012513Rz c20012513Rz : listLJIILL) {
                String str3 = c20012513Rz.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strSubstring2);
                sbLIZ2.append("_trans_");
                if (u.LJJIIJZLJL(str3, C2188811AlT.LIZIZ(sbLIZ2), false) && (str2 = c20012513Rz.LIZIZ.LIZ) != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("file://");
                    sbLIZ3.append(str2);
                    return UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ3)).toString();
                }
            }
        }
        return "asset://not_found";
    }

    private final boolean isTransRes(String str) {
        return u.LJJIIJZLJL(str, "resource/trans?effectPath=", false);
    }

    public String findResourceUri(String str) {
        String strFindDownloadedResourceUri = findDownloadedResourceUri(str);
        if (strFindDownloadedResourceUri == null && isExactBuiltInResource(str)) {
            return getBuiltInResourceUrl(str);
        }
        return strFindDownloadedResourceUri;
    }

    public String getBuiltInResourceUrl(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("asset://model/");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean isExactBuiltInResource(String str) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ep_enabled_builtin_resource_io_optimization", true, false)) {
            C20008613Qm c20008613Qm = this.buildInAssetsManager;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("model/");
            sbLIZ.append(str);
            return c20008613Qm.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (builtinModelPathsPreloadAttempted.compareAndSet(false, true)) {
            AtomicBoolean atomicBoolean = builtinModelPathsPreloadSucceeded;
            atomicBoolean.set(loadBuiltInResourcePathsWithModelPaths());
            if (!atomicBoolean.get()) {
                C13SS.LIZ.getClass();
                C13SS.LIZIZ("AlgorithmResourceFinder", "isExactBuiltInResource falling back to using IO existence check for builtin resource uris (Can result in slower performance)", null);
            }
        }
        if (builtinModelPathsPreloadSucceeded.get()) {
            ConcurrentHashSet<String> concurrentHashSet = builtinResourcePaths;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("model/");
            sbLIZ2.append(str);
            if (concurrentHashSet.contains(C2188811AlT.LIZIZ(sbLIZ2))) {
                return true;
            }
        } else {
            C20008613Qm c20008613Qm2 = this.buildInAssetsManager;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("model/");
            sbLIZ3.append(str);
            if (c20008613Qm2.LIZ(C2188811AlT.LIZIZ(sbLIZ3))) {
                return true;
            }
        }
        return false;
    }

    public final boolean isResourceAvailable(String str) {
        String strFindResourceUri = findResourceUri(str);
        if (strFindResourceUri != null && !Intrinsics.LJFF(strFindResourceUri, "asset://md5_error") && !Intrinsics.LJFF(strFindResourceUri, "asset://not_found")) {
            return true;
        }
        return false;
    }

    public final boolean isResourceAvailableAndLatest(String str) {
        String strRealFindResourceUri = realFindResourceUri(0, null, str);
        if (Intrinsics.LJFF(strRealFindResourceUri, "asset://md5_error") || Intrinsics.LJFF(strRealFindResourceUri, "asset://not_found")) {
            return false;
        }
        return true;
    }

    public final void markModelUsed(String str) {
        this.algorithmModelCache.LIZLLL(C20006413Pq.LIZLLL(str), "");
    }

    public final String readAssetFileAsString(String str) {
        return this.buildInAssetsManager.LIZLLL(str);
    }

    public void onModelNotFound(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("model not found neither in asset nor disk ");
        sbLIZ.append(str2);
        RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        C13QQ c13qq = this.eventListener;
        if (c13qq != null) {
            c13qq.onModelNotFound(null, runtimeException);
        }
    }

    public e(C20006313Pp c20006313Pp, C20008613Qm c20008613Qm, C13QQ c13qq) {
        this.algorithmModelCache = c20006313Pp;
        this.buildInAssetsManager = c20008613Qm;
        this.eventListener = c13qq;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isModelMd5Invalid(java.lang.String r9, int r10, java.lang.String r11) {
        /*
            r8 = this;
            java.lang.String r6 = X.C20006413Pq.LIZLLL(r9)
            java.lang.String r7 = X.C20006413Pq.LIZIZ(r11)
            X.13Pl r0 = X.C13QA.LIZ()
            r5 = 1
            X.13Pt r0 = r0.LIZIZ(r10, r5)
            java.lang.String r4 = "AlgorithmResourceFinder"
            if (r0 == 0) goto L37
            com.ss.android.ugc.effectmanager.common.model.ExtendedUrlModel r0 = r0.LIZ(r6)     // Catch: java.lang.IllegalArgumentException -> L1a
            goto L38
        L1a:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.13SS r0 = X.C13SS.LIZ
            r0.getClass()
            java.lang.String r0 = "model info not found in model list"
            X.C13SS.LIZIZ(r4, r0, r1)
            X.13Pl r0 = X.C13QA.LIZ()
            com.ss.android.ugc.effectmanager.common.model.ModelInfo r0 = r0.LIZLLL(r10, r6, r5)
            if (r0 == 0) goto L37
            com.ss.android.ugc.effectmanager.common.model.ExtendedUrlModel r0 = r0.getFile_url()
            goto L38
        L37:
            r0 = 0
        L38:
            r3 = 0
            if (r0 != 0) goto L47
            X.13SS r0 = X.C13SS.LIZ
            java.lang.String r1 = "expected model info not found in model list"
            r0.getClass()
            r0 = 0
            X.C13SS.LIZIZ(r4, r1, r0)
            return r3
        L47:
            java.lang.String r2 = r0.getUri()
            boolean r0 = X.C504670Jqj.LIZ(r7, r2)
            if (r0 != 0) goto L91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r0 = " md5 = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " expectedMd5 = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r3 = r1.toString()
            X.13SS r2 = X.C13SS.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "findResourceUri called with nameStr = ["
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "], asset://md5_error\n"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C13SS.LIZ(r4, r0)
            r8.onModelNotFound(r6, r3)
            return r5
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z1p.e.isModelMd5Invalid(java.lang.String, int, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String realFindResourceMd5(int r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            X.13SS r2 = X.C13SS.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "realFindResourceMd5() called with nameStr = ["
            r1.append(r0)
            r1.append(r9)
            r5 = 93
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            java.lang.String r4 = "AlgorithmResourceFinder"
            X.C13SS.LIZ(r4, r0)
            boolean r0 = r6.isTransRes(r9)
            if (r0 == 0) goto L2a
            java.lang.String r0 = r6.findTransResUri(r9)
            return r0
        L2a:
            java.lang.String r3 = X.C20006413Pq.LIZLLL(r9)
            X.13Pl r0 = X.C13QA.LIZ()
            r2 = 1
            X.13Pt r0 = r0.LIZIZ(r7, r2)
            if (r0 == 0) goto L5b
            com.ss.android.ugc.effectmanager.common.model.ExtendedUrlModel r0 = r0.LIZ(r3)     // Catch: java.lang.IllegalArgumentException -> L3e
            goto L5c
        L3e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.13SS r0 = X.C13SS.LIZ
            r0.getClass()
            java.lang.String r0 = "model info not found in model list"
            X.C13SS.LIZIZ(r4, r0, r1)
            X.13Pl r0 = X.C13QA.LIZ()
            com.ss.android.ugc.effectmanager.common.model.ModelInfo r0 = r0.LIZLLL(r7, r3, r2)
            if (r0 == 0) goto L5b
            com.ss.android.ugc.effectmanager.common.model.ExtendedUrlModel r0 = r0.getFile_url()
            goto L5c
        L5b:
            r0 = 0
        L5c:
            java.lang.String r3 = ""
            if (r0 != 0) goto L6c
            X.13SS r0 = X.C13SS.LIZ
            java.lang.String r1 = "expected model info not found in model list"
            r0.getClass()
            r0 = 0
            X.C13SS.LIZIZ(r4, r1, r0)
            return r3
        L6c:
            java.lang.String r0 = r0.getUri()
            if (r0 == 0) goto L73
            r3 = r0
        L73:
            X.13SS r2 = X.C13SS.LIZ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "realFindResourceMd5() expectedMd5 = = ["
            r1.<init>(r0)
            r1.append(r3)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            r2.getClass()
            X.C13SS.LIZ(r4, r0)
            r6.onModelFound(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z1p.e.realFindResourceMd5(int, java.lang.String, java.lang.String):java.lang.String");
    }

    public final String realFindResourceUri(int i, String str, String str2) {
        String strFindDownloadedResourceUri;
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("findResourceUri() called with nameStr = [");
        sbLIZ.append(str2);
        sbLIZ.append(']');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("AlgorithmResourceFinder", strLIZIZ);
        if (isTransRes(str2)) {
            return findTransResUri(str2);
        }
        if (isExactBuiltInResource(str2)) {
            strFindDownloadedResourceUri = getBuiltInResourceUrl(str2);
        } else {
            strFindDownloadedResourceUri = findDownloadedResourceUri(str2);
            if (strFindDownloadedResourceUri != null) {
                try {
                    if (isModelMd5Invalid(str2, i, strFindDownloadedResourceUri)) {
                        return "asset://md5_error";
                    }
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("findResourceUri called with nameStr = [");
                    sbLIZ2.append(str2);
                    sbLIZ2.append("], exception hanppens");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZIZ("AlgorithmResourceFinder", strLIZIZ2, e);
                }
            }
        }
        if (strFindDownloadedResourceUri == null) {
            C13SS.LIZ.getClass();
            C13SS.LIZIZ("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str2 + "], returned result: [asset://not_found]", null);
            return "asset://not_found";
        }
        C13SS.LIZ.getClass();
        C13SS.LIZ("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str2 + "], returned result: [" + strFindDownloadedResourceUri + ']');
        onModelFound(str2);
        return strFindDownloadedResourceUri;
    }
}
