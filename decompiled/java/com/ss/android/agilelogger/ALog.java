package com.ss.android.agilelogger;

import X.C08OV;
import X.C09Z2;
import X.C0VSJ;
import X.C0VTN;
import X.C0W9W;
import X.C1790806zq;
import X.C1C7U;
import X.C2097008Jk;
import X.C2188811AlT;
import X.C260910AKj;
import X.C786410Ut5;
import X.C797950VRx;
import X.C806990VlB;
import X.C807260Vlc;
import X.C807400Vlq;
import X.C827190Wcf;
import X.C827220Wci;
import X.C827280Wco;
import X.C827310Wcr;
import X.C827360Wcw;
import X.C827370Wcx;
import X.C827520WdC;
import X.C827570WdH;
import X.C827590WdJ;
import X.EnumC827210Wch;
import X.EnumC827420Wd2;
import X.EnumC827430Wd3;
import X.EnumC827440Wd4;
import X.EnumC827450Wd5;
import X.EnumC827460Wd6;
import X.EnumC827470Wd7;
import X.InterfaceC827270Wcn;
import X.InterfaceC827550WdF;
import X.InterfaceC827580WdI;
import X.ThreadFactoryC854690Xfv;
import Y.ARunnableS4S2000000_13;
import Y.ARunnableS92S0000000_13;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.android.alog.Alog;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class ALog {
    public static volatile Set<String> mBlockTagSet = null;
    public static int prio = 3;
    public static volatile Handler sAsyncHandler;
    public static HandlerThread sAsyncLogThread;
    public static volatile C827360Wcw sConfig;
    public static volatile boolean sDebug;
    public static volatile InterfaceC827580WdI sILogCacheCallback;
    public static volatile boolean sInitSuccess;
    public static volatile List<InterfaceC827270Wcn> sINativeFuncAddrCallbackList = new ArrayList();
    public static ScheduledExecutorService sOuterExecutorService = null;
    public static volatile Alog mainThreadRef = null;
    public static ArrayList<WeakReference<Alog>> sStandaloneInstances = new ArrayList<>();
    public static volatile ExecutorService sSingleThreadExecutor = null;
    public static volatile boolean sInitialized = false;
    public static Object sInitLock = new Object();
    public static final ThreadLocal<Long> sThreadId = new ThreadLocal<Long>() { // from class: X.08JO
        @Override // java.lang.ThreadLocal
        public final Long initialValue() {
            return Long.valueOf(Process.myTid());
        }
    };

    public static void d(String str, String str2) {
        com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(str, str2);
    }

    public static void e(String str, String str2) {
        com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(str, str2);
    }

    public static void forceLogSharding() {
    }

    public static void i(String str, String str2) {
        com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str, str2);
    }

    public static int level2AlogCoreLevel(int i) {
        return i - 2;
    }

    public static void setILogCacheCallback(InterfaceC827580WdI interfaceC827580WdI) {
    }

    public static void setPrintStackTrace(boolean z) {
    }

    public static void setsPackageClassName(String str) {
    }

    public static void v(String str, String str2) {
        com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV(str, str2);
    }

    public static void w(String str, String str2) {
        com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(str, str2);
    }

    public static void asyncFlush() {
        Alog alog;
        if (sSingleThreadExecutor != null) {
            sSingleThreadExecutor.execute(new ARunnableS92S0000000_13(18));
        } else if (sAsyncHandler != null) {
            C786410Ut5.LJLILLLLZI(sAsyncHandler, 2);
        }
        C827520WdC.LIZ();
        if (mainThreadRef != null) {
            mainThreadRef.LIZ();
        }
        for (WeakReference<Alog> weakReference : sStandaloneInstances) {
            if (weakReference != null && (alog = weakReference.get()) != null) {
                alog.LIZ();
            }
        }
    }

    public static void destroy() {
        Alog.nativeSetDefaultInstance(0L);
        C827520WdC.LIZ.LIZIZ();
        C827520WdC.LIZ = null;
        if (mainThreadRef != null) {
            mainThreadRef.LIZIZ();
        }
        if (sAsyncHandler != null) {
            sAsyncLogThread.quit();
            sAsyncLogThread = null;
            sAsyncHandler = null;
        }
        if (sSingleThreadExecutor != null) {
            sSingleThreadExecutor.shutdown();
            sSingleThreadExecutor = null;
        }
    }

    public static void flush() {
        if (sSingleThreadExecutor != null) {
            sSingleThreadExecutor.execute(new ARunnableS92S0000000_13(17));
        }
        if (sAsyncHandler != null) {
            C786410Ut5.LJLILLLLZI(sAsyncHandler, 2);
        }
        C827520WdC.LIZ();
        if (mainThreadRef != null) {
            mainThreadRef.LIZ();
        }
    }

    public static long getALogSimpleInitFuncAddr() {
        if (C827520WdC.LIZ != null) {
            return C827520WdC.LIZ.LJI();
        }
        return 0L;
    }

    public static long getALogSimpleWriteAsyncFuncAddr() {
        if (C827520WdC.LIZ != null) {
            return C827520WdC.LIZ.LJII();
        }
        return 0L;
    }

    public static long getALogSimpleWriteFuncAddr() {
        if (C827520WdC.LIZ != null) {
            return C827520WdC.LIZ.LJIIIIZZ();
        }
        return 0L;
    }

    public static long getALogWriteFuncAddr() {
        if (C827520WdC.LIZ != null) {
            return C827520WdC.LIZ.LJ();
        }
        return 0L;
    }

    public static long getAlogNativeFlushV2FuncAddr() {
        if (C827520WdC.LIZ != null) {
            return C827520WdC.LIZ.LIZJ();
        }
        return 0L;
    }

    public static long getAlogNativeLogStoreDirFuncAddr() {
        if (C827520WdC.LIZ != null) {
            return C827520WdC.LIZ.LIZLLL();
        }
        return 0L;
    }

    public static HashMap<String, String> getLastFetchErrorInfo() {
        if (C827520WdC.LIZ == null) {
            HashMap<String, String> map = new HashMap<>();
            map.put("reason", "Log.instance does not exist");
            return map;
        }
        C827520WdC.LIZ.getClass();
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("start", Long.toString(C797950VRx.LIZ));
        map2.put("end", Long.toString(C797950VRx.LIZIZ));
        map2.put("reason", C797950VRx.LIZLLL);
        if (C797950VRx.LIZJ != null) {
            StringBuilder sb = new StringBuilder();
            for (String strSubstring : C797950VRx.LIZJ) {
                if (strSubstring.endsWith(".alog.hot")) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 9);
                }
                sb.append(strSubstring);
                sb.append(";");
            }
            map2.put("file", sb.toString());
        }
        C797950VRx.LIZLLL = null;
        C797950VRx.LIZJ = null;
        return map2;
    }

    public static String getStatus() {
        try {
            return C827520WdC.LIZ != null ? C827520WdC.LIZ.LJIIIZ() : "default log instance is null";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "getStatus exception";
        }
    }

    public static long getThreadId() {
        return sThreadId.get().longValue();
    }

    public static void release() {
        Alog.nativeSetDefaultInstance(0L);
        C827520WdC.LIZ.LIZIZ();
        C827520WdC.LIZ = null;
        if (mainThreadRef != null) {
            mainThreadRef.LIZIZ();
        }
        if (sAsyncHandler != null) {
            sAsyncLogThread.quit();
            sAsyncLogThread = null;
            sAsyncHandler = null;
        }
        if (sSingleThreadExecutor != null) {
            sSingleThreadExecutor.shutdown();
            sSingleThreadExecutor = null;
        }
    }

    public static void syncFlush() {
        if (sSingleThreadExecutor != null) {
            sSingleThreadExecutor.execute(new ARunnableS92S0000000_13(15));
        }
        if (sAsyncHandler != null) {
            C786410Ut5.LJLILLLLZI(sAsyncHandler, 2);
        }
        if (C827520WdC.LIZ != null) {
            C827520WdC.LIZ.LJIILIIL();
        }
        if (mainThreadRef != null) {
            mainThreadRef.LJIILIIL();
        }
        Iterator<WeakReference<Alog>> it2 = sStandaloneInstances.iterator();
        while (it2.hasNext()) {
            Alog alog = it2.next().get();
            if (alog != null) {
                alog.LJIILIIL();
            }
        }
    }

    public static Set<String> getBlockTagSet() {
        return mBlockTagSet;
    }

    public static List<InterfaceC827270Wcn> getNativeFuncAddrCallbackList() {
        return sINativeFuncAddrCallbackList;
    }

    public static boolean isInitSuccess() {
        return sInitSuccess;
    }

    public static void addMessageInterceptor(InterfaceC827550WdF interfaceC827550WdF) {
        if (interfaceC827550WdF != null) {
            if (Alog.LJIILJJIL == null) {
                Alog.LJIILJJIL = new CopyOnWriteArrayList();
            }
            if (!((CopyOnWriteArrayList) Alog.LJIILJJIL).contains(interfaceC827550WdF)) {
                ((CopyOnWriteArrayList) Alog.LJIILJJIL).add(interfaceC827550WdF);
            }
        }
    }

    public static void addNativeFuncAddrCallback(InterfaceC827270Wcn interfaceC827270Wcn) {
        sINativeFuncAddrCallbackList.add(interfaceC827270Wcn);
    }

    public static void changeLevel(int i) {
        prio = i;
        int iLevel2AlogCoreLevel = level2AlogCoreLevel(i);
        if (C827520WdC.LIZ != null) {
            C827520WdC.LIZ.LJIIJJI(iLevel2AlogCoreLevel);
        }
        if (mainThreadRef != null) {
            mainThreadRef.LJIIJJI(level2AlogCoreLevel(i));
        }
    }

    public static void handleAsyncLog(C827370Wcx c827370Wcx) {
        String strLIZIZ;
        int iLevel2AlogCoreLevel = level2AlogCoreLevel(c827370Wcx.LIZ);
        String strLJFF = "";
        EnumC827210Wch enumC827210Wch = c827370Wcx.LJ;
        if (enumC827210Wch == null) {
            if (c827370Wcx.LIZLLL == null) {
                strLJFF = c827370Wcx.LIZJ;
            } else {
                if (c827370Wcx.LIZJ == null) {
                    strLIZIZ = "";
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c827370Wcx.LIZJ);
                    sbLIZ.append("\n");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(C807260Vlc.LIZ(c827370Wcx.LIZLLL));
                strLJFF = C2188811AlT.LIZIZ(sbLIZ2);
            }
        } else {
            EnumC827210Wch enumC827210Wch2 = EnumC827210Wch.BORDER;
            if (enumC827210Wch == enumC827210Wch2) {
                strLJFF = C827190Wcf.LIZJ(enumC827210Wch2, c827370Wcx.LIZJ);
            } else {
                EnumC827210Wch enumC827210Wch3 = EnumC827210Wch.JSON;
                if (enumC827210Wch == enumC827210Wch3) {
                    strLJFF = C827190Wcf.LIZJ(enumC827210Wch3, c827370Wcx.LIZJ);
                } else {
                    EnumC827210Wch enumC827210Wch4 = EnumC827210Wch.BUNDLE;
                    if (enumC827210Wch == enumC827210Wch4) {
                        strLJFF = C827190Wcf.LIZIZ(enumC827210Wch4, (Bundle) c827370Wcx.LJFF);
                    } else {
                        EnumC827210Wch enumC827210Wch5 = EnumC827210Wch.INTENT;
                        if (enumC827210Wch == enumC827210Wch5) {
                            strLJFF = C827190Wcf.LIZ(enumC827210Wch5, (Intent) c827370Wcx.LJFF);
                        } else {
                            EnumC827210Wch enumC827210Wch6 = EnumC827210Wch.THROWABLE;
                            if (enumC827210Wch == enumC827210Wch6) {
                                strLJFF = C827190Wcf.LJ(enumC827210Wch6, (Throwable) c827370Wcx.LJFF);
                            } else {
                                EnumC827210Wch enumC827210Wch7 = EnumC827210Wch.THREAD;
                                if (enumC827210Wch == enumC827210Wch7) {
                                    strLJFF = C827190Wcf.LIZLLL(enumC827210Wch7, (Thread) c827370Wcx.LJFF);
                                } else {
                                    EnumC827210Wch enumC827210Wch8 = EnumC827210Wch.STACKTRACE;
                                    if (enumC827210Wch == enumC827210Wch8) {
                                        strLJFF = C827190Wcf.LJFF(enumC827210Wch8, (StackTraceElement[]) c827370Wcx.LJFF);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        String str = c827370Wcx.LIZIZ;
        long j = c827370Wcx.LJI;
        long j2 = c827370Wcx.LJII;
        if (C827520WdC.LIZ != null) {
            C827520WdC.LIZ.LJIILLIIL(iLevel2AlogCoreLevel, j, j2, str, strLJFF);
        }
        c827370Wcx.LIZIZ = null;
        c827370Wcx.LIZJ = null;
        c827370Wcx.LIZLLL = null;
        c827370Wcx.LJ = null;
        c827370Wcx.LJFF = null;
        c827370Wcx.LJI = -1L;
        c827370Wcx.LJII = 0L;
        c827370Wcx.LJIIIIZZ = null;
        synchronized (C827370Wcx.LJIIIZ) {
            try {
                int i = C827370Wcx.LJIIJJI;
                if (i < 50) {
                    c827370Wcx.LJIIIIZZ = C827370Wcx.LJIIJ;
                    C827370Wcx.LJIIJ = c827370Wcx;
                    C827370Wcx.LJIIJJI = i + 1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void handleItemMsg(C827590WdJ c827590WdJ) {
        int[] iArr = C827220Wci.LIZ;
        c827590WdJ.getClass();
        throw null;
    }

    public static boolean init(C827360Wcw c827360Wcw) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        EnumC827430Wd3 enumC827430Wd3;
        EnumC827450Wd5 enumC827450Wd5;
        EnumC827420Wd2 enumC827420Wd2;
        long j;
        EnumC827430Wd3 enumC827430Wd32;
        EnumC827450Wd5 enumC827450Wd52;
        EnumC827420Wd2 enumC827420Wd22;
        if (c827360Wcw == null) {
            return false;
        }
        sConfig = c827360Wcw;
        try {
            Alog.LJIIJ(new C827570WdH());
            synchronized (sInitLock) {
                try {
                    if (sInitialized) {
                        return false;
                    }
                    sInitialized = true;
                    prio = c827360Wcw.LJIIIIZZ;
                    Context context = c827360Wcw.LIZ;
                    String strLIZ = C2097008Jk.LIZ();
                    if (strLIZ != null && !strLIZ.contains(":") && (strLIZ.equals(context.getPackageName()) || strLIZ.equals(context.getApplicationInfo().processName))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z3 = c827360Wcw.LJIIJJI;
                    if (!z3 && c827360Wcw.LJIIJ && z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z4 = c827360Wcw.LJIIL;
                    if (!z) {
                        c827360Wcw.LIZJ = (int) (c827360Wcw.LIZJ * c827360Wcw.LJIILL);
                    }
                    C827280Wco c827280Wco = new C827280Wco(c827360Wcw.LIZ);
                    c827280Wco.LIZJ("default");
                    c827280Wco.LIZIZ = level2AlogCoreLevel(c827360Wcw.LJIIIIZZ);
                    c827280Wco.LIZJ = sDebug;
                    c827280Wco.LJ = c827360Wcw.LJFF;
                    c827280Wco.LJFF = c827360Wcw.LIZLLL;
                    if (z2) {
                        i = (c827360Wcw.LIZJ / 3) * 2;
                    } else {
                        i = c827360Wcw.LIZJ;
                    }
                    c827280Wco.LJI = i;
                    c827280Wco.LJII = c827360Wcw.LIZIZ;
                    c827280Wco.LJIIIIZZ = c827360Wcw.LJ;
                    if (z) {
                        i2 = c827360Wcw.LJIILJJIL * 1024;
                    } else {
                        i2 = 32768;
                    }
                    c827280Wco.LJIIIZ = i2;
                    if (z) {
                        i3 = c827360Wcw.LJIILJJIL * 3 * 1024;
                    } else {
                        i3 = 65536;
                    }
                    c827280Wco.LJIIJ = i3;
                    EnumC827470Wd7 enumC827470Wd7 = EnumC827470Wd7.SAFE;
                    c827280Wco.LJIIL = enumC827470Wd7.value;
                    EnumC827460Wd6 enumC827460Wd6 = EnumC827460Wd6.RAW;
                    c827280Wco.LJIILIIL = enumC827460Wd6.value;
                    EnumC827440Wd4 enumC827440Wd4 = EnumC827440Wd4.LEGACY;
                    c827280Wco.LJIILJJIL = enumC827440Wd4.value;
                    if (c827360Wcw.LJI) {
                        enumC827430Wd3 = EnumC827430Wd3.ZSTD;
                    } else {
                        enumC827430Wd3 = EnumC827430Wd3.NONE;
                    }
                    c827280Wco.LJIILL = enumC827430Wd3.value;
                    boolean z5 = c827360Wcw.LJII;
                    if (z5) {
                        enumC827450Wd5 = EnumC827450Wd5.TEA_16;
                    } else {
                        enumC827450Wd5 = EnumC827450Wd5.NONE;
                    }
                    c827280Wco.LJIILLIIL = enumC827450Wd5.value;
                    if (z5) {
                        enumC827420Wd2 = EnumC827420Wd2.EC_SECP256K1;
                    } else {
                        enumC827420Wd2 = EnumC827420Wd2.NONE;
                    }
                    c827280Wco.LJIIZILJ = enumC827420Wd2.value;
                    c827280Wco.LJIJ = c827360Wcw.LJIIIZ;
                    c827280Wco.LJIJI = c827360Wcw.LJIILLIIL;
                    Alog alogLIZIZ = c827280Wco.LIZIZ();
                    C827520WdC.LIZ = alogLIZIZ;
                    if (alogLIZIZ == null) {
                        j = 0;
                    } else {
                        j = alogLIZIZ.LJII;
                    }
                    Alog.nativeSetDefaultInstance(j);
                    if (z3 && z) {
                        if (z4) {
                            sSingleThreadExecutor = C807400Vlq.LIZLLL(new ThreadFactoryC854690Xfv(2));
                        } else {
                            HandlerThread handlerThread = new HandlerThread("Alog_main_delegate");
                            sAsyncLogThread = handlerThread;
                            handlerThread.start();
                            sAsyncHandler = new BPEAHandler(C786410Ut5.W2(sAsyncLogThread)) { // from class: com.ss.android.agilelogger.ALog.3
                                @Override // android.os.Handler
                                public final void handleMessage(Message message) {
                                    C1C7U.LIZ("ALog@eae2.init$2");
                                    int i4 = message.what;
                                    if (i4 != 1) {
                                        if (i4 == 2) {
                                            C827520WdC.LIZ();
                                        }
                                    } else if (HandlerHook.getMessageObj(message.obj) != null && (HandlerHook.getMessageObj(message.obj) instanceof C827370Wcx)) {
                                        ALog.handleAsyncLog((C827370Wcx) HandlerHook.getMessageObj(message.obj));
                                    }
                                    C1C7U.LIZIZ("ALog@eae2.init$2");
                                }
                            };
                        }
                    }
                    if (z2) {
                        C827280Wco c827280Wco2 = new C827280Wco(c827360Wcw.LIZ);
                        c827280Wco2.LIZJ("main");
                        c827280Wco2.LIZIZ = level2AlogCoreLevel(c827360Wcw.LJIIIIZZ);
                        c827280Wco2.LIZJ = sDebug;
                        c827280Wco2.LJ = c827360Wcw.LJFF;
                        c827280Wco2.LJFF = c827360Wcw.LIZLLL / 2;
                        c827280Wco2.LJI = c827360Wcw.LIZJ / 3;
                        c827280Wco2.LJII = c827360Wcw.LIZIZ;
                        c827280Wco2.LJIIIIZZ = c827360Wcw.LJ;
                        c827280Wco2.LJIIIZ = 32768;
                        c827280Wco2.LJIIJ = 98304;
                        c827280Wco2.LJIIL = enumC827470Wd7.value;
                        c827280Wco2.LJIILIIL = enumC827460Wd6.value;
                        c827280Wco2.LJIILJJIL = enumC827440Wd4.value;
                        if (c827360Wcw.LJI) {
                            enumC827430Wd32 = EnumC827430Wd3.ZSTD;
                        } else {
                            enumC827430Wd32 = EnumC827430Wd3.NONE;
                        }
                        c827280Wco2.LJIILL = enumC827430Wd32.value;
                        boolean z6 = c827360Wcw.LJII;
                        if (z6) {
                            enumC827450Wd52 = EnumC827450Wd5.TEA_16;
                        } else {
                            enumC827450Wd52 = EnumC827450Wd5.NONE;
                        }
                        c827280Wco2.LJIILLIIL = enumC827450Wd52.value;
                        if (z6) {
                            enumC827420Wd22 = EnumC827420Wd2.EC_SECP256K1;
                        } else {
                            enumC827420Wd22 = EnumC827420Wd2.NONE;
                        }
                        c827280Wco2.LJIIZILJ = enumC827420Wd22.value;
                        c827280Wco2.LJIJ = c827360Wcw.LJIIIZ;
                        c827280Wco2.LJIJI = c827360Wcw.LJIILLIIL;
                        mainThreadRef = c827280Wco2.LIZIZ();
                    }
                    final String str = c827360Wcw.LJ;
                    final String str2 = c827360Wcw.LJFF;
                    if (getNativeFuncAddrCallbackList().size() > 0) {
                        ARunnableS4S2000000_13 aRunnableS4S2000000_13 = new ARunnableS4S2000000_13(str, str2, 1);
                        ScheduledExecutorService scheduledExecutorService = sOuterExecutorService;
                        if (scheduledExecutorService == null) {
                            new BPEAThread(aRunnableS4S2000000_13, "_ALOG_OPT_").start();
                        } else {
                            scheduledExecutorService.execute(aRunnableS4S2000000_13);
                        }
                    } else {
                        ScheduledExecutorService scheduledExecutorService2 = sOuterExecutorService;
                        if (scheduledExecutorService2 == null) {
                            new PthreadTimer("_ALOG_OPT_").schedule(new C0W9W() { // from class: X.0Vba
                                @Override // java.util.TimerTask, java.lang.Runnable
                                public final void run() {
                                    C1C7U.LIZ("ALog@eae2.init$4");
                                    boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                                    try {
                                        ALog.removeLegacyFiles(str, str2);
                                    } finally {
                                    }
                                    if (zLJ) {
                                        C0W9U.LJFF();
                                    }
                                    C1C7U.LIZIZ("ALog@eae2.init$4");
                                }
                            }, 15000L);
                        } else {
                            scheduledExecutorService2.schedule(new ARunnableS4S2000000_13(str, str2, 2), 15L, TimeUnit.SECONDS);
                        }
                    }
                    sInitSuccess = true;
                    return true;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th) {
            return false;
        }
    }

    public static void removeMessageInterceptor(InterfaceC827550WdF interfaceC827550WdF) {
        if (interfaceC827550WdF != null && Alog.LJIILJJIL != null) {
            ((CopyOnWriteArrayList) Alog.LJIILJJIL).remove(interfaceC827550WdF);
        }
    }

    public static void setBlockTagSet(Set<String> set) {
        mBlockTagSet = Collections.unmodifiableSet(set);
    }

    public static void setDebug(boolean z) {
        sDebug = z;
        boolean z2 = sDebug;
        if (C827520WdC.LIZ != null) {
            C827520WdC.LIZ.LJIIL(z2);
        }
        if (mainThreadRef != null) {
            mainThreadRef.LJIIL(sDebug);
        }
    }

    public static void setOuterExecutorService(ScheduledExecutorService scheduledExecutorService) {
        sOuterExecutorService = scheduledExecutorService;
    }

    public static void setZstdOptType(int i) {
        Alog.LJIIZILJ = i;
    }

    public static void timedSyncFlush(int i) {
        if (sSingleThreadExecutor != null) {
            sSingleThreadExecutor.execute(new ARunnableS92S0000000_13(16));
        }
        if (sAsyncHandler != null) {
            C786410Ut5.LJLILLLLZI(sAsyncHandler, 2);
        }
        if (C827520WdC.LIZ != null) {
            C827520WdC.LIZ.LJIILJJIL(i);
        }
        if (mainThreadRef != null) {
            mainThreadRef.LJIILJJIL(i);
        }
        Iterator<WeakReference<Alog>> it2 = sStandaloneInstances.iterator();
        while (it2.hasNext()) {
            Alog alog = it2.next().get();
            if (alog != null) {
                alog.LJIILJJIL(i);
            }
        }
    }

    public static void writeCachedItems(Queue<C827590WdJ> queue) {
        for (C827590WdJ c827590WdJ : queue) {
            c827590WdJ.getClass();
            if (checkPrioAndTag(0, null)) {
                handleItemMsg(c827590WdJ);
                C827520WdC.LIZIZ(level2AlogCoreLevel(0), null, null);
            }
        }
    }

    public static boolean checkPrioAndTag(int i, String str) {
        if (i < prio) {
            return false;
        }
        Set<String> set = mBlockTagSet;
        if (set != null && !TextUtils.isEmpty(str) && set.contains(str)) {
            return false;
        }
        return true;
    }

    public static void com_ss_android_agilelogger_ALog__d$___twin___(String str, String str2) {
        if (checkPrioAndTag(3, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(3, str, str2);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(3, str, str2);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(3, str, str2);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(3, str, str2);
                    return;
                }
            }
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(1, str, str2);
            } else {
                C827520WdC.LIZJ(1, str, str2);
            }
        }
    }

    public static void com_ss_android_agilelogger_ALog__e$___twin___(String str, String str2) {
        if (checkPrioAndTag(6, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(6, str, str2);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(6, str, str2);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(6, str, str2);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(6, str, str2);
                    return;
                }
            }
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(4, str, str2);
            } else {
                C827520WdC.LIZJ(4, str, str2);
            }
        }
    }

    public static void com_ss_android_agilelogger_ALog__i$___twin___(String str, String str2) {
        if (checkPrioAndTag(4, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(4, str, str2);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(4, str, str2);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(4, str, str2);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(4, str, str2);
                    return;
                }
            }
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(2, str, str2);
            } else {
                C827520WdC.LIZJ(2, str, str2);
            }
        }
    }

    public static void com_ss_android_agilelogger_ALog__v$___twin___(String str, String str2) {
        if (checkPrioAndTag(2, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(2, str, str2);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(2, str, str2);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(2, str, str2);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(2, str, str2);
                    return;
                }
            }
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(0, str, str2);
            } else {
                C827520WdC.LIZJ(0, str, str2);
            }
        }
    }

    public static void com_ss_android_agilelogger_ALog__w$___twin___(String str, String str2) {
        if (checkPrioAndTag(5, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(5, str, str2);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(5, str, str2);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(5, str, str2);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(5, str, str2);
                    return;
                }
            }
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(3, str, str2);
            } else {
                C827520WdC.LIZJ(3, str, str2);
            }
        }
    }

    public static void com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(String str, String str2) {
        if (C260910AKj.LIZ() <= 2 && !C0VTN.LIZJ().LIZIZ() && !C1790806zq.LIZ() && C09Z2.LIZIZ <= 3) {
            com_ss_android_agilelogger_ALog__d$___twin___(str, str2);
        }
    }

    public static void com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(String str, String str2) {
        if (C260910AKj.LIZ() <= 5 && C09Z2.LIZIZ <= 6) {
            com_ss_android_agilelogger_ALog__e$___twin___(str, str2);
        }
    }

    public static void com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(String str, String str2) {
        if (C260910AKj.LIZ() <= 3 && !C0VTN.LIZJ().LIZIZ() && !C1790806zq.LIZ() && C09Z2.LIZIZ <= 4) {
            com_ss_android_agilelogger_ALog__i$___twin___(str, str2);
        }
    }

    public static void com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV(String str, String str2) {
        if (C260910AKj.LIZ() <= 1 && !C0VTN.LIZJ().LIZIZ() && !C1790806zq.LIZ() && C09Z2.LIZIZ <= 2) {
            com_ss_android_agilelogger_ALog__v$___twin___(str, str2);
        }
    }

    public static void com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(String str, String str2) {
        if (C260910AKj.LIZ() <= 4 && !C0VTN.LIZJ().LIZIZ() && !C1790806zq.LIZ() && C09Z2.LIZIZ <= 5) {
            com_ss_android_agilelogger_ALog__w$___twin___(str, str2);
        }
    }

    public static C806990VlB createInstance(String str, C827360Wcw c827360Wcw) {
        String str2;
        String str3;
        EnumC827430Wd3 enumC827430Wd3;
        EnumC827450Wd5 enumC827450Wd5;
        EnumC827420Wd2 enumC827420Wd2;
        boolean z;
        if (c827360Wcw == null) {
            return null;
        }
        if (!sInitSuccess) {
            try {
                Alog.LJIIJ(new C827570WdH());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        C827280Wco c827280Wco = new C827280Wco(c827360Wcw.LIZ);
        c827280Wco.LIZJ(str);
        c827280Wco.LIZIZ = level2AlogCoreLevel(c827360Wcw.LJIIIIZZ);
        c827280Wco.LIZJ = sDebug;
        if (sConfig != null) {
            str2 = sConfig.LJFF;
        } else {
            str2 = c827360Wcw.LJFF;
        }
        c827280Wco.LJ = str2;
        c827280Wco.LJFF = c827360Wcw.LIZLLL;
        c827280Wco.LJI = c827360Wcw.LIZJ;
        c827280Wco.LJII = c827360Wcw.LIZIZ;
        if (sConfig != null) {
            str3 = sConfig.LJ;
        } else {
            str3 = c827360Wcw.LJ;
        }
        c827280Wco.LJIIIIZZ = str3;
        c827280Wco.LJIIIZ = 65536;
        c827280Wco.LJIIJ = 196608;
        c827280Wco.LJIIL = EnumC827470Wd7.SAFE.value;
        c827280Wco.LJIILIIL = EnumC827460Wd6.RAW.value;
        c827280Wco.LJIILJJIL = EnumC827440Wd4.LEGACY.value;
        if (c827360Wcw.LJI) {
            enumC827430Wd3 = EnumC827430Wd3.ZSTD;
        } else {
            enumC827430Wd3 = EnumC827430Wd3.NONE;
        }
        c827280Wco.LJIILL = enumC827430Wd3.value;
        boolean z2 = c827360Wcw.LJII;
        if (z2) {
            enumC827450Wd5 = EnumC827450Wd5.TEA_16;
        } else {
            enumC827450Wd5 = EnumC827450Wd5.NONE;
        }
        c827280Wco.LJIILLIIL = enumC827450Wd5.value;
        if (z2) {
            enumC827420Wd2 = EnumC827420Wd2.EC_SECP256K1;
        } else {
            enumC827420Wd2 = EnumC827420Wd2.NONE;
        }
        c827280Wco.LJIIZILJ = enumC827420Wd2.value;
        c827280Wco.LJIJ = c827360Wcw.LJIIIZ;
        if (sConfig != null) {
            z = sConfig.LJIILLIIL;
        } else {
            z = false;
        }
        c827280Wco.LJIJI = z;
        Alog alogLIZIZ = c827280Wco.LIZIZ();
        if (alogLIZIZ == null) {
            return null;
        }
        sStandaloneInstances.add(new WeakReference<>(alogLIZIZ));
        return new C806990VlB(alogLIZIZ, str);
    }

    public static void e(String str, Throwable th) {
        if (checkPrioAndTag(6, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(6, str, null, th, null, null);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(6, str, null, th, null, null);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(6, str, null, th, null, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(6, str, null, th, null, null);
                    return;
                }
            }
            String strLIZ = C807260Vlc.LIZ(th);
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(4, str, strLIZ);
            } else {
                C827520WdC.LIZJ(4, str, strLIZ);
            }
        }
    }

    public static List<String> getALogFiles(long j, long j2) {
        File[] fileArrLIZ;
        ArrayList arrayList = new ArrayList();
        long j3 = j * 1000;
        long j4 = j2 * 1000;
        try {
            if (C827520WdC.LIZ != null) {
                fileArrLIZ = C797950VRx.LIZ(j3, j4, C827520WdC.LIZ.LIZIZ, null, null);
            } else {
                fileArrLIZ = new File[0];
            }
            for (File file : fileArrLIZ) {
                arrayList.add(file.getAbsolutePath());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return arrayList;
    }

    public static void removeLegacyFiles(String str, String str2) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && (fileArrListFiles2 = c0vsj.listFiles(new FilenameFilter() { // from class: X.0Vbc
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str3) {
                return str3.startsWith(".logCache_");
            }
        })) != null) {
            for (File file : fileArrListFiles2) {
                file.delete();
            }
        }
        C0VSJ c0vsj2 = new C0VSJ(str2);
        if (c0vsj2.exists() && (fileArrListFiles = c0vsj2.listFiles(new FilenameFilter() { // from class: X.0Vbb
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str3) {
                if (str3.endsWith(".hoting")) {
                    return true;
                }
                if (str3.endsWith(".hot") && !str3.endsWith(".alog.hot")) {
                    return true;
                }
                return false;
            }
        })) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }

    public static void w(String str, Throwable th) {
        if (checkPrioAndTag(5, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(5, str, null, th, null, null);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(5, str, null, th, null, null);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(5, str, null, th, null, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(5, str, null, th, null, null);
                    return;
                }
            }
            String strLIZ = C807260Vlc.LIZ(th);
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(3, str, strLIZ);
            } else {
                C827520WdC.LIZJ(3, str, strLIZ);
            }
        }
    }

    public static C806990VlB createInstance(String str, Context context) {
        if (context == null) {
            return null;
        }
        return createInstance(str, new C827310Wcr(context).LIZ());
    }

    public static void bundle(int i, String str, Bundle bundle) {
        if (checkPrioAndTag(i, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(i, str, null, null, EnumC827210Wch.BUNDLE, bundle);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(i, str, null, null, EnumC827210Wch.BUNDLE, bundle);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, null, EnumC827210Wch.BUNDLE, bundle);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC827210Wch.BUNDLE, bundle);
                    return;
                }
            }
            int iLevel2AlogCoreLevel = level2AlogCoreLevel(i);
            String strLIZIZ = C827190Wcf.LIZIZ(EnumC827210Wch.BUNDLE, bundle);
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(iLevel2AlogCoreLevel, str, strLIZIZ);
            } else {
                C827520WdC.LIZIZ(iLevel2AlogCoreLevel, str, strLIZIZ);
            }
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (checkPrioAndTag(6, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(6, str, str2, th, null, null);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(6, str, str2, th, null, null);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(6, str, str2, th, null, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(6, str, str2, th, null, null);
                    return;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("\n");
            sbLIZ.append(C807260Vlc.LIZ(th));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(4, str, strLIZIZ);
            } else {
                C827520WdC.LIZJ(4, str, strLIZIZ);
            }
        }
    }

    public static void header(int i, String str, String str2) {
        if (checkPrioAndTag(i, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(i, str, str2, null, EnumC827210Wch.BORDER, null);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(i, str, str2, null, EnumC827210Wch.BORDER, null);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, str2, null, EnumC827210Wch.BORDER, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, str2, null, EnumC827210Wch.BORDER, null);
                    return;
                }
            }
            int iLevel2AlogCoreLevel = level2AlogCoreLevel(i);
            String strLIZJ = C827190Wcf.LIZJ(EnumC827210Wch.BORDER, str2);
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(iLevel2AlogCoreLevel, str, strLIZJ);
            } else {
                C827520WdC.LIZIZ(iLevel2AlogCoreLevel, str, strLIZJ);
            }
        }
    }

    public static void intent(int i, String str, Intent intent) {
        if (checkPrioAndTag(i, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(i, str, null, null, EnumC827210Wch.INTENT, intent);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(i, str, null, null, EnumC827210Wch.INTENT, intent);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, null, EnumC827210Wch.INTENT, intent);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC827210Wch.INTENT, intent);
                    return;
                }
            }
            int iLevel2AlogCoreLevel = level2AlogCoreLevel(i);
            String strLIZ = C827190Wcf.LIZ(EnumC827210Wch.INTENT, intent);
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(iLevel2AlogCoreLevel, str, strLIZ);
            } else {
                C827520WdC.LIZIZ(iLevel2AlogCoreLevel, str, strLIZ);
            }
        }
    }

    public static void json(int i, String str, String str2) {
        if (checkPrioAndTag(i, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(i, str, str2, null, EnumC827210Wch.JSON, null);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(i, str, str2, null, EnumC827210Wch.JSON, null);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, str2, null, EnumC827210Wch.JSON, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, str2, null, EnumC827210Wch.JSON, null);
                    return;
                }
            }
            int iLevel2AlogCoreLevel = level2AlogCoreLevel(i);
            String strLIZJ = C827190Wcf.LIZJ(EnumC827210Wch.JSON, str2);
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(iLevel2AlogCoreLevel, str, strLIZJ);
            } else {
                C827520WdC.LIZIZ(iLevel2AlogCoreLevel, str, strLIZJ);
            }
        }
    }

    public static void postAsyncLog(int i, String str, String str2) {
        postAsyncLog(i, str, str2, null, null, null);
    }

    public static void postAsyncLogByThreadPool(int i, String str, String str2) {
        postAsyncLogByThreadPool(i, str, str2, null, null, null);
    }

    public static void removeObsoleteInstance(String str, Context context, boolean z) {
        String absolutePath;
        String strLIZIZ;
        String strLIZ = C2097008Jk.LIZ();
        if (strLIZ == null || strLIZ.contains(":")) {
            return;
        }
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append('-');
            strLIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (sConfig != null) {
            absolutePath = sConfig.LJFF;
            strLIZIZ = sConfig.LJ;
        } else {
            absolutePath = C08OV.LIZJ(context).getAbsolutePath();
            strLIZIZ = C08OV.LIZIZ(context);
        }
        C0VSJ c0vsj = new C0VSJ(absolutePath);
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("__");
            sbLIZ2.append(str);
            sbLIZ2.append(".alog.hot");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            for (File file : c0vsj.listFiles()) {
                String name = file.getName();
                if (name != null && name.endsWith(strLIZIZ2) && name.contains(strLIZ)) {
                    file.delete();
                }
            }
            C0VSJ c0vsj2 = new C0VSJ(strLIZIZ);
            if (c0vsj2.exists() && c0vsj2.isDirectory()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("__");
                sbLIZ3.append(str);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                for (File file2 : c0vsj2.listFiles()) {
                    String name2 = file2.getName();
                    if (name2 != null && name2.contains(strLIZIZ3) && name2.contains(strLIZ)) {
                        file2.delete();
                    }
                }
            }
        }
    }

    public static void stacktrace(int i, String str, StackTraceElement[] stackTraceElementArr) {
        if (checkPrioAndTag(i, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(i, str, null, null, EnumC827210Wch.STACKTRACE, stackTraceElementArr);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(i, str, null, null, EnumC827210Wch.STACKTRACE, stackTraceElementArr);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, null, EnumC827210Wch.STACKTRACE, stackTraceElementArr);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC827210Wch.STACKTRACE, stackTraceElementArr);
                    return;
                }
            }
            int iLevel2AlogCoreLevel = level2AlogCoreLevel(i);
            String strLJFF = C827190Wcf.LJFF(EnumC827210Wch.STACKTRACE, stackTraceElementArr);
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(iLevel2AlogCoreLevel, str, strLJFF);
            } else {
                C827520WdC.LIZIZ(iLevel2AlogCoreLevel, str, strLJFF);
            }
        }
    }

    public static void statcktrace(int i, String str, StackTraceElement[] stackTraceElementArr) {
        stacktrace(i, str, stackTraceElementArr);
    }

    public static void thread(int i, String str, Thread thread) {
        if (checkPrioAndTag(i, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(i, str, null, null, EnumC827210Wch.THREAD, thread);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(i, str, null, null, EnumC827210Wch.THREAD, thread);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, null, EnumC827210Wch.THREAD, thread);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC827210Wch.THREAD, thread);
                    return;
                }
            }
            int iLevel2AlogCoreLevel = level2AlogCoreLevel(i);
            String strLIZLLL = C827190Wcf.LIZLLL(EnumC827210Wch.THREAD, thread);
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(iLevel2AlogCoreLevel, str, strLIZLLL);
            } else {
                C827520WdC.LIZIZ(iLevel2AlogCoreLevel, str, strLIZLLL);
            }
        }
    }

    public static void throwable(int i, String str, Throwable th) {
        if (checkPrioAndTag(i, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(i, str, null, th, EnumC827210Wch.THROWABLE, null);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(i, str, null, th, EnumC827210Wch.THROWABLE, null);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, null, th, EnumC827210Wch.THROWABLE, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, null, null, EnumC827210Wch.THROWABLE, th);
                    return;
                }
            }
            int iLevel2AlogCoreLevel = level2AlogCoreLevel(i);
            String strLJ = C827190Wcf.LJ(EnumC827210Wch.THROWABLE, th);
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(iLevel2AlogCoreLevel, str, strLJ);
            } else {
                C827520WdC.LIZIZ(iLevel2AlogCoreLevel, str, strLJ);
            }
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (checkPrioAndTag(5, str)) {
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(5, str, str2, th, null, null);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(5, str, str2, th, null, null);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(5, str, str2, th, null, null);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(5, str, str2, th, null, null);
                    return;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("\n");
            sbLIZ.append(C807260Vlc.LIZ(th));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(3, str, strLIZIZ);
            } else {
                C827520WdC.LIZJ(3, str, strLIZIZ);
            }
        }
    }

    public static List<String> getALogFiles(String str, String str2, long j, long j2) {
        File[] fileArrLIZ;
        ArrayList arrayList = new ArrayList();
        long j3 = j * 1000;
        long j4 = j2 * 1000;
        try {
            if (C827520WdC.LIZ != null) {
                fileArrLIZ = C797950VRx.LIZ(j3, j4, C827520WdC.LIZ.LIZIZ, str, str2);
            } else {
                fileArrLIZ = new File[0];
            }
            for (File file : fileArrLIZ) {
                arrayList.add(file.getAbsolutePath());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return arrayList;
    }

    public static void println(int i, String str, Object obj, EnumC827210Wch enumC827210Wch) {
        String strLIZ;
        if (checkPrioAndTag(i, str)) {
            int iLevel2AlogCoreLevel = level2AlogCoreLevel(i);
            switch (C827220Wci.LIZ[enumC827210Wch.ordinal()]) {
                case 1:
                    strLIZ = (String) obj;
                    break;
                case 2:
                    strLIZ = C807260Vlc.LIZ((Throwable) obj);
                    break;
                case 3:
                    strLIZ = C827190Wcf.LIZJ(EnumC827210Wch.BORDER, (String) obj);
                    break;
                case 4:
                    strLIZ = C827190Wcf.LIZJ(EnumC827210Wch.JSON, (String) obj);
                    break;
                case 5:
                    strLIZ = C827190Wcf.LIZIZ(EnumC827210Wch.BUNDLE, (Bundle) obj);
                    break;
                case 6:
                    strLIZ = C827190Wcf.LIZ(EnumC827210Wch.INTENT, (Intent) obj);
                    break;
                case 7:
                    strLIZ = C827190Wcf.LJ(EnumC827210Wch.THROWABLE, (Throwable) obj);
                    break;
                case 8:
                    strLIZ = C827190Wcf.LIZLLL(EnumC827210Wch.THREAD, (Thread) obj);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    strLIZ = C827190Wcf.LJFF(EnumC827210Wch.STACKTRACE, (StackTraceElement[]) obj);
                    break;
                default:
                    strLIZ = "";
                    break;
            }
            if (sConfig != null && sConfig.LJIILIIL && sSingleThreadExecutor != null) {
                postAsyncLogByThreadPool(i, str, strLIZ);
                return;
            }
            if (sConfig != null && sConfig.LJIILIIL && sAsyncHandler != null) {
                postAsyncLog(i, str, strLIZ);
                return;
            }
            boolean zLIZIZ = C2097008Jk.LIZIZ();
            if (zLIZIZ) {
                if (sSingleThreadExecutor != null) {
                    postAsyncLogByThreadPool(i, str, strLIZ);
                    return;
                } else if (sAsyncHandler != null) {
                    postAsyncLog(i, str, strLIZ);
                    return;
                }
            }
            if (mainThreadRef != null && zLIZIZ) {
                mainThreadRef.LJIILL(iLevel2AlogCoreLevel, str, strLIZ);
            } else {
                C827520WdC.LIZIZ(iLevel2AlogCoreLevel, str, strLIZ);
            }
        }
    }

    public static void writeAsyncLog(int i, String str, String str2, long j, long j2) {
        int iLevel2AlogCoreLevel = level2AlogCoreLevel(i);
        if (C827520WdC.LIZ != null) {
            C827520WdC.LIZ.LJIILLIIL(iLevel2AlogCoreLevel, j, j2, str, str2);
        }
    }

    public static void postAsyncLog(int i, String str, String str2, Throwable th, EnumC827210Wch enumC827210Wch, Object obj) {
        C827370Wcx c827370Wcx;
        synchronized (C827370Wcx.LJIIIZ) {
            try {
                c827370Wcx = C827370Wcx.LJIIJ;
                if (c827370Wcx != null) {
                    C827370Wcx.LJIIJ = c827370Wcx.LJIIIIZZ;
                    c827370Wcx.LJIIIIZZ = null;
                    C827370Wcx.LJIIJJI--;
                } else {
                    c827370Wcx = new C827370Wcx();
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        c827370Wcx.LIZ = i;
        c827370Wcx.LIZIZ = str;
        c827370Wcx.LIZJ = str2;
        c827370Wcx.LIZLLL = th;
        c827370Wcx.LJ = enumC827210Wch;
        c827370Wcx.LJFF = obj;
        c827370Wcx.LJI = getThreadId();
        c827370Wcx.LJII = System.currentTimeMillis();
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = c827370Wcx;
        C786410Ut5.LJLJJL(sAsyncHandler, messageObtain);
    }

    public static void postAsyncLogByThreadPool(final int i, final String str, final String str2, final Throwable th, final EnumC827210Wch enumC827210Wch, final Object obj) {
        final long threadId = getThreadId();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        sSingleThreadExecutor.execute(new Runnable() { // from class: X.0Wcg
            public final void LIZ() {
                int iLevel2AlogCoreLevel = ALog.level2AlogCoreLevel(i);
                EnumC827210Wch enumC827210Wch2 = enumC827210Wch;
                String strLJFF = "";
                if (enumC827210Wch2 != null) {
                    EnumC827210Wch enumC827210Wch3 = EnumC827210Wch.BORDER;
                    if (enumC827210Wch2 == enumC827210Wch3) {
                        strLJFF = C827190Wcf.LIZJ(enumC827210Wch3, str2);
                    } else {
                        EnumC827210Wch enumC827210Wch4 = EnumC827210Wch.JSON;
                        if (enumC827210Wch2 == enumC827210Wch4) {
                            strLJFF = C827190Wcf.LIZJ(enumC827210Wch4, str2);
                        } else {
                            EnumC827210Wch enumC827210Wch5 = EnumC827210Wch.BUNDLE;
                            if (enumC827210Wch2 == enumC827210Wch5) {
                                strLJFF = C827190Wcf.LIZIZ(enumC827210Wch5, (Bundle) obj);
                            } else {
                                EnumC827210Wch enumC827210Wch6 = EnumC827210Wch.INTENT;
                                if (enumC827210Wch2 == enumC827210Wch6) {
                                    strLJFF = C827190Wcf.LIZ(enumC827210Wch6, (Intent) obj);
                                } else {
                                    EnumC827210Wch enumC827210Wch7 = EnumC827210Wch.THROWABLE;
                                    if (enumC827210Wch2 == enumC827210Wch7) {
                                        strLJFF = C827190Wcf.LJ(enumC827210Wch7, (Throwable) obj);
                                    } else {
                                        EnumC827210Wch enumC827210Wch8 = EnumC827210Wch.THREAD;
                                        if (enumC827210Wch2 == enumC827210Wch8) {
                                            strLJFF = C827190Wcf.LIZLLL(enumC827210Wch8, (Thread) obj);
                                        } else {
                                            EnumC827210Wch enumC827210Wch9 = EnumC827210Wch.STACKTRACE;
                                            if (enumC827210Wch2 == enumC827210Wch9) {
                                                strLJFF = C827190Wcf.LJFF(enumC827210Wch9, (StackTraceElement[]) obj);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (th == null) {
                    strLJFF = str2;
                } else {
                    if (str2 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str2);
                        sbLIZ.append("\n");
                        strLJFF = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLJFF);
                    sbLIZ2.append(C807260Vlc.LIZ(th));
                    strLJFF = C2188811AlT.LIZIZ(sbLIZ2);
                }
                String str3 = str;
                long j = threadId;
                long j2 = jCurrentTimeMillis;
                if (C827520WdC.LIZ != null) {
                    C827520WdC.LIZ.LJIILLIIL(iLevel2AlogCoreLevel, j, j2, str3, strLJFF);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ALog@eae2.postAsyncLogByThreadPool$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ALog@eae2.postAsyncLogByThreadPool$1");
            }
        });
    }
}
