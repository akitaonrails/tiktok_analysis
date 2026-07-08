package com.orbu.core.init;

import X.C1C7U;
import X.C786410Ut5;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.TTKOrbu;
import com.orbu.core.config.BootConfig;
import com.orbu.core.init.TTKNativeNetworkManager;
import com.orbu.core.mob.ITTKNativeCallback;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public class TTKNativeNetworkManager {
    public static boolean inited;
    public static boolean loaded;
    public static boolean pumbaaSoloaded;
    public static AtomicInteger active = new AtomicInteger(-1);
    public static AtomicInteger pumbaaAspectEnable = new AtomicInteger(0);
    public static ExecutorService pool = C786410Ut5.h4();
    public static boolean isNativeDebug = false;
    public static boolean pendingDebug = false;
    public static final Set<ITTKNativeCallback> callbackList = new CopyOnWriteArraySet();
    public static final AtomicReference<Callable<String>> mUserRegionCall = new AtomicReference<>();
    public static final AtomicReference<Callable<String>> mGetSandboxStateCall = new AtomicReference<>();

    public static native int activesdk(int i, boolean z, int i2);

    public static native int doNativeNetworkValidate(String str, String str2, Map<String, String> map, String str3, int i, String str4, int i2);

    public static native int initcall(int i, boolean z);

    public static native void initnetconfig(BootConfig bootConfig);

    public static native boolean isNativeNetworkResultNeedBlock(int i, String str);

    public static native void setNativeDebug(boolean z);

    public static native void setNativeHardBlockConfigInner(boolean z, boolean z2, boolean z3, List<Integer> list, List<String> list2);

    public static native void unhook();

    public static int getPumbaaAspectEnable() {
        return pumbaaAspectEnable.get();
    }

    public static String getSandboxState() {
        Callable<String> callable = mGetSandboxStateCall.get();
        if (callable == null) {
            return null;
        }
        try {
            return callable.call();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static String getStoreRegion() {
        Callable<String> callable = mUserRegionCall.get();
        if (callable == null) {
            return null;
        }
        try {
            return callable.call();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static boolean inTargetBlockRuleHashList() {
        return HardBlockConfigManager.INSTANCE.inTargetBlockRuleHashList(TTKOrbu.INSTANCE.getRuleHash());
    }

    public static boolean isActive() {
        return active.get() > 0;
    }

    public static /* synthetic */ void lambda$tryUnHook$2() {
        C1C7U.LIZ("TTKNativeNetworkManager@e8d4.tryUnHook$1L");
        if (inited) {
            try {
                unhook();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1C7U.LIZIZ("TTKNativeNetworkManager@e8d4.tryUnHook$1L");
    }

    public static boolean loadNativeLibrary() {
        try {
            INVOKESTATIC_com_orbu_core_init_TTKNativeNetworkManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("orbuculumadapter");
            loaded = true;
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static void preloadPumbaaNativeNetwork() {
        if (pumbaaSoloaded) {
            return;
        }
        try {
            INVOKESTATIC_com_orbu_core_init_TTKNativeNetworkManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("pumbaa-network");
            pumbaaSoloaded = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void tryUnHook() {
        pool.execute(new Runnable() { // from class: X.0XKn
            @Override // java.lang.Runnable
            public final void run() {
                TTKNativeNetworkManager.lambda$tryUnHook$2();
            }
        });
    }

    public static void load() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (!loaded) {
            loadNativeLibrary();
        }
        if (inited) {
            return;
        }
        initializeSDK(jUptimeMillis);
    }

    public static boolean isSoLoaded() {
        return loaded;
    }

    public static void INVOKESTATIC_com_orbu_core_init_TTKNativeNetworkManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static void active(final int i) {
        pool.execute(new Runnable() { // from class: X.0XKo
            @Override // java.lang.Runnable
            public final void run() {
                TTKNativeNetworkManager.lambda$active$3(i);
            }
        });
    }

    public static void activeSDK(int i) {
        boolean z;
        if (i != active.get()) {
            System.currentTimeMillis();
            try {
                active.set(i);
                if (!callbackList.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                activesdk(i, z, pumbaaAspectEnable.get());
                HardBlockConfigManager.INSTANCE.injectNativeConfig();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                active.set(0);
            }
        }
    }

    public static void initNetConfig(BootConfig bootConfig) {
        if (bootConfig != null) {
            try {
                initnetconfig(bootConfig);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void initializeSDK(long j) {
        SystemClock.uptimeMillis();
        try {
            TTKOrbu tTKOrbu = TTKOrbu.INSTANCE;
            initcall(tTKOrbu.nativeReportStrategy(), tTKOrbu.hitSampleDrop());
            initNetConfig(tTKOrbu.getBootConfig());
            if (pendingDebug) {
                setNativeDebug(isNativeDebug);
            }
            inited = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static /* synthetic */ void lambda$active$3(int i) {
        C1C7U.LIZ("TTKNativeNetworkManager@e8d4.active$1L");
        load();
        activeSDK(i);
        C1C7U.LIZIZ("TTKNativeNetworkManager@e8d4.active$1L");
    }

    public static /* synthetic */ void lambda$loadPumbaa$4(int i) {
        C1C7U.LIZ("TTKNativeNetworkManager@e8d4.loadPumbaa$1L");
        preloadPumbaaNativeNetwork();
        pumbaaAspectEnable.set(i);
        C1C7U.LIZIZ("TTKNativeNetworkManager@e8d4.loadPumbaa$1L");
    }

    public static /* synthetic */ void lambda$setDebug$1(boolean z) {
        C1C7U.LIZ("TTKNativeNetworkManager@e8d4.setDebug$1L");
        try {
            if (loaded) {
                setNativeDebug(z);
            } else {
                pendingDebug = true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("TTKNativeNetworkManager@e8d4.setDebug$1L");
    }

    public static void loadPumbaa(final int i) {
        pool.execute(new Runnable() { // from class: X.0XKl
            @Override // java.lang.Runnable
            public final void run() {
                TTKNativeNetworkManager.lambda$loadPumbaa$4(i);
            }
        });
    }

    public static void setDebug(final boolean z) {
        isNativeDebug = z;
        pool.submit(new Runnable() { // from class: X.0XKm
            @Override // java.lang.Runnable
            public final void run() {
                TTKNativeNetworkManager.lambda$setDebug$1(z);
            }
        });
    }

    public static void setGetSandboxState(Callable<String> callable) {
        mGetSandboxStateCall.set(callable);
    }

    public static void setGetUserRegionCall(Callable<String> callable) {
        mUserRegionCall.set(callable);
    }

    public static void setTTKNativeCallback(ITTKNativeCallback iTTKNativeCallback) {
        callbackList.add(iTTKNativeCallback);
    }

    public static /* synthetic */ void lambda$setNativeHardBlockConfig$0(boolean z, boolean z2, boolean z3, List list, List list2) {
        C1C7U.LIZ("TTKNativeNetworkManager@e8d4.setNativeHardBlockConfig$1L");
        try {
            if (loaded) {
                setNativeHardBlockConfigInner(z, z2, z3, list, list2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("TTKNativeNetworkManager@e8d4.setNativeHardBlockConfig$1L");
    }

    public static void setNativeHardBlockConfig(final boolean z, final boolean z2, final boolean z3, final List<Integer> list, final List<String> list2) {
        pool.submit(new Runnable() { // from class: X.0XKp
            @Override // java.lang.Runnable
            public final void run() {
                TTKNativeNetworkManager.lambda$setNativeHardBlockConfig$0(z, z2, z3, list, list2);
            }
        });
    }

    public static void send(String str, String str2, String str3, int i, int i2, boolean z, boolean z2) {
        Iterator<ITTKNativeCallback> it2 = callbackList.iterator();
        while (it2.hasNext()) {
            it2.next().onNativeNetworkEvent(str, str2, "", "", str3, i, i2, z, z2);
        }
    }

    public static void send(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2) {
        Iterator<ITTKNativeCallback> it2 = callbackList.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onNativeNetworkEvent(str, str2, str3, str4, str5, i, i2, z, z2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
