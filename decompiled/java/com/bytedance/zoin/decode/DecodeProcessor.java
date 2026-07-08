package com.bytedance.zoin.decode;

import X.C08P9;
import X.C08PA;
import X.C0VSJ;
import X.C1C7U;
import X.C2188811AlT;
import X.C2418009di;
import X.C2418109dj;
import X.C2418409dm;
import X.C2418509dn;
import X.C2421809eK;
import X.C786410Ut5;
import X.C822650WOx;
import Y.AComparatorS22S0000000_3;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.zoin.ZoinNative;
import com.bytedance.zoin.decode.DecodeProcessor;
import com.bytedance.zoin.model.ZoinBlockInfo;
import com.bytedance.zoin.model.ZoinBuildFileInfo;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class DecodeProcessor {
    public static volatile boolean hasProcessed;

    public static void monitorDecompressEnd(String str) {
        C2418109dj.LIZLLL().LIZ(str);
    }

    public static void monitorDecompressStart(String str) {
        C2418109dj.LIZLLL().LIZIZ(str);
    }

    public static C2418509dn resolveApkDecodeInfo(String str) throws IOException {
        File fileLIZIZ;
        Application application = C2421809eK.LIZ;
        try {
            fileLIZIZ = C08PA.LIZIZ(str, C08PA.LIZ(application, false));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getSplitFileFromApk failed, refresh apk files: ");
            sbLIZ.append(e);
            c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            fileLIZIZ = C08PA.LIZIZ(str, C08PA.LIZ(application, true));
        }
        if (fileLIZIZ != null) {
            return new C2418509dn(fileLIZIZ.getPath(), str);
        }
        return new C2418509dn("", "");
    }

    public static /* synthetic */ int lambda$decodeAndVerify$0(ZoinBlockInfo zoinBlockInfo, ZoinBlockInfo zoinBlockInfo2) {
        return (int) ((zoinBlockInfo2.blockEndOffset - zoinBlockInfo2.blockBeginOffset) - (zoinBlockInfo.blockEndOffset - zoinBlockInfo.blockBeginOffset));
    }

    public static int renameTempFiles(File file, List<ZoinBuildFileInfo> list) {
        for (ZoinBuildFileInfo zoinBuildFileInfo : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(zoinBuildFileInfo.name);
            sbLIZ.append(".temp");
            C0VSJ c0vsj = new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.exists()) {
                C0VSJ c0vsj2 = new C0VSJ(file, zoinBuildFileInfo.name);
                if (!c0vsj.renameTo(c0vsj2)) {
                    C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("RenameTempFileError ");
                    sbLIZ2.append(c0vsj.getPath());
                    sbLIZ2.append(" ");
                    sbLIZ2.append(c0vsj2.getPath());
                    c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                    return 3;
                }
            }
        }
        return 0;
    }

    public static int decodeAndVerify(File file, final String str, List<ZoinBuildFileInfo> list, List<ZoinBlockInfo> list2, boolean z) {
        final String strFindLibrary;
        String str2;
        String str3;
        final boolean z2;
        hasProcessed = true;
        HashMap map = new HashMap();
        Collections.sort(list2, new AComparatorS22S0000000_3(17));
        if (!ZoinNative.isIsLoaded()) {
            ZoinNative.init();
        }
        for (final ZoinBlockInfo zoinBlockInfo : list2) {
            ArrayList<ZoinBuildFileInfo> arrayList = new ArrayList();
            final int i = zoinBlockInfo.totalDecompressedLength;
            for (ZoinBuildFileInfo zoinBuildFileInfo : list) {
                if (zoinBuildFileInfo.compressedName.equals(zoinBlockInfo.blockCompressedName)) {
                    arrayList.add(zoinBuildFileInfo);
                }
            }
            if (arrayList.size() != 0) {
                C0VSJ c0vsj = new C0VSJ(C2421809eK.LIZ.getApplicationInfo().nativeLibraryDir);
                C0VSJ c0vsj2 = new C0VSJ(c0vsj, zoinBlockInfo.blockName);
                C0VSJ c0vsj3 = C08P9.LJ;
                if (c0vsj3 == null) {
                    C2418109dj.LIZLLL().LJFF("AbiHelper not exist");
                } else {
                    C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Old LibDIR:");
                    sbLIZ.append(c0vsj3.getPath());
                    c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                }
                C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("New LibDIR:");
                sbLIZ2.append(c0vsj.getPath());
                sbLIZ2.append(" ");
                sbLIZ2.append(c0vsj2.exists());
                c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("lib/");
                sbLIZ3.append(C08P9.LIZLLL(C2421809eK.LIZ));
                sbLIZ3.append("/");
                sbLIZ3.append(zoinBlockInfo.blockName);
                final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                if (c0vsj3 == null || !c0vsj3.getPath().equals(c0vsj.getPath()) || !c0vsj2.exists() || (strFindLibrary = c0vsj2.getPath()) == null) {
                    BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) C2421809eK.LIZ.getClassLoader();
                    String str4 = zoinBlockInfo.blockName;
                    strFindLibrary = baseDexClassLoader.findLibrary(str4.substring(3, str4.length() - 3));
                }
                if (TextUtils.isEmpty(strFindLibrary)) {
                    C2418509dn c2418509dnResolveApkDecodeInfo = resolveApkDecodeInfo(strLIZIZ);
                    str2 = c2418509dnResolveApkDecodeInfo.LIZ;
                    str3 = c2418509dnResolveApkDecodeInfo.LIZIZ;
                    if (TextUtils.isEmpty(str2)) {
                        return 4;
                    }
                    z2 = true;
                } else {
                    str2 = "";
                    str3 = "";
                    z2 = false;
                }
                for (ZoinBuildFileInfo zoinBuildFileInfo2 : arrayList) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(zoinBuildFileInfo2.name);
                    sbLIZ4.append(".temp");
                    C0VSJ c0vsj4 = new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ4));
                    if (c0vsj4.exists()) {
                        boolean zDelete = c0vsj4.delete();
                        C2418109dj c2418109djLIZLLL3 = C2418109dj.LIZLLL();
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("DeleteOldTemp ");
                        sbLIZ5.append(c0vsj4);
                        sbLIZ5.append(" ");
                        sbLIZ5.append(zDelete);
                        c2418109djLIZLLL3.LJFF(C2188811AlT.LIZIZ(sbLIZ5));
                    }
                }
                final ZoinBuildFileInfo[] zoinBuildFileInfoArr = (ZoinBuildFileInfo[]) arrayList.toArray(new ZoinBuildFileInfo[0]);
                if (list2.size() == 1) {
                    C2418109dj c2418109djLIZLLL4 = C2418109dj.LIZLLL();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("Start decode directly ");
                    sbLIZ6.append(zoinBlockInfo.blockCompressedName);
                    c2418109djLIZLLL4.LJFF(C2188811AlT.LIZIZ(sbLIZ6));
                    int iDecodeLibsWithRetry = decodeLibsWithRetry(strFindLibrary, str2, str3, z2, strLIZIZ, str, zoinBlockInfo, i, zoinBuildFileInfoArr);
                    C2418109dj.LIZLLL().LJFF(ZoinNative.nDumpDebugLogs());
                    if (iDecodeLibsWithRetry == 0) {
                        return 0;
                    }
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("DecodeProcessor Error ");
                    sbLIZ7.append(iDecodeLibsWithRetry);
                    throw new C2418409dm(C2188811AlT.LIZIZ(sbLIZ7));
                }
                C2418109dj c2418109djLIZLLL5 = C2418109dj.LIZLLL();
                if (c2418109djLIZLLL5.LIZIZ == null) {
                    c2418109djLIZLLL5.LIZIZ = new C822650WOx(0, Integer.MAX_VALUE, 100L, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: X.0867
                        public volatile int LL;

                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            int i2;
                            synchronized (this) {
                                try {
                                    i2 = this.LL;
                                    this.LL = i2 + 1;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("zoin-decode-");
                            sbLIZ8.append(i2);
                            return new BPEAThread(runnable, C2188811AlT.LIZIZ(sbLIZ8));
                        }
                    });
                }
                final String str5 = str2;
                final String str6 = str3;
                map.put(zoinBlockInfo, c2418109djLIZLLL5.LIZIZ.submit(new Callable() { // from class: X.09dl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return DecodeProcessor.lambda$decodeAndVerify$1(zoinBlockInfo, strFindLibrary, str5, str6, z2, strLIZIZ, str, i, zoinBuildFileInfoArr);
                    }
                }));
            }
        }
        boolean z3 = false;
        int iIntValue = 0;
        for (Map.Entry entry : map.entrySet()) {
            iIntValue = ((Integer) ((Future) entry.getValue()).get()).intValue();
            if (iIntValue != 0) {
                C2418109dj c2418109djLIZLLL6 = C2418109dj.LIZLLL();
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("Child thread decode ");
                sbLIZ8.append(entry.getKey());
                sbLIZ8.append(" Failed ");
                sbLIZ8.append(iIntValue);
                c2418109djLIZLLL6.LJFF(C2188811AlT.LIZIZ(sbLIZ8));
                z3 = true;
            }
        }
        if (!z3) {
            return 0;
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("DecodeProcessor Error ");
        sbLIZ9.append(iIntValue);
        throw new C2418409dm(C2188811AlT.LIZIZ(sbLIZ9));
    }

    public static int decodeLibsWithRetry(String str, String str2, String str3, boolean z, String str4, String str5, ZoinBlockInfo zoinBlockInfo, int i, ZoinBuildFileInfo[] zoinBuildFileInfoArr) throws IOException {
        long j = zoinBlockInfo.blockBeginOffset;
        long j2 = zoinBlockInfo.blockEndOffset;
        C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
        c2418109djLIZLLL.getClass();
        int iNDecodeLibs = ZoinNative.nDecodeLibs(str, str2, str3, str5, j, j2, i, zoinBuildFileInfoArr, true, c2418109djLIZLLL instanceof C2418009di);
        if (iNDecodeLibs != 0 && !z) {
            C2418509dn c2418509dnResolveApkDecodeInfo = resolveApkDecodeInfo(str4);
            if (TextUtils.isEmpty(c2418509dnResolveApkDecodeInfo.LIZ)) {
                return iNDecodeLibs;
            }
            C2418109dj.LIZLLL().LJFF("Retry decode with apk");
            String str6 = c2418509dnResolveApkDecodeInfo.LIZ;
            String str7 = c2418509dnResolveApkDecodeInfo.LIZIZ;
            long j3 = zoinBlockInfo.blockBeginOffset;
            long j4 = zoinBlockInfo.blockEndOffset;
            C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
            c2418109djLIZLLL2.getClass();
            return ZoinNative.nDecodeLibs(str, str6, str7, str5, j3, j4, i, zoinBuildFileInfoArr, true, c2418109djLIZLLL2 instanceof C2418009di);
        }
        return iNDecodeLibs;
    }

    public static /* synthetic */ Integer lambda$decodeAndVerify$1(ZoinBlockInfo zoinBlockInfo, String str, String str2, String str3, boolean z, String str4, String str5, int i, ZoinBuildFileInfo[] zoinBuildFileInfoArr) throws IOException {
        C1C7U.LIZ("DecodeProcessor@6209.decodeAndVerify$1L");
        C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Start decode ");
        sbLIZ.append(zoinBlockInfo.blockCompressedName);
        c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        int iDecodeLibsWithRetry = decodeLibsWithRetry(str, str2, str3, z, str4, str5, zoinBlockInfo, i, zoinBuildFileInfoArr);
        C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C786410Ut5.u3().getName());
        sbLIZ2.append(" nDecode:");
        sbLIZ2.append(iDecodeLibsWithRetry);
        c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
        C2418109dj.LIZLLL().LJFF(ZoinNative.nDumpDebugLogs());
        Integer numValueOf = Integer.valueOf(iDecodeLibsWithRetry);
        C1C7U.LIZIZ("DecodeProcessor@6209.decodeAndVerify$1L");
        return numValueOf;
    }
}
