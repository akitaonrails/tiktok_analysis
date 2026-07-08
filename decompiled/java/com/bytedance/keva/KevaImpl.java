package com.bytedance.keva;

import X.AbstractC309290CAl;
import X.C08RN;
import X.C098200Yq;
import X.C0CKZ;
import X.C0VSJ;
import X.C189200o6;
import X.C1BXB;
import X.C1C7U;
import X.C202094145s;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C309220CAe;
import X.C309250CAh;
import X.C786450Ut9;
import X.C822650WOx;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.Looper;
import android.os.SystemClock;
import android.util.ArrayMap;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.keva.KevaInfo;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public abstract class KevaImpl extends Keva {
    public static int sExecuteKevaType;
    public static final Executor sExecutor;
    public static final boolean sIsAsyncWriteEnable;
    public static final boolean sIsEnableArrayMap;
    public static final boolean sIsEnableExecutorOpt;
    public static int sIsEnableLoadFromNative;
    public static final boolean sIsEnableLockOpt;
    public static final boolean sIsEnableMultiProcessHashIndex;
    public static int sIsEnableMultiProcessLoadFromNative;
    public static final boolean sIsEnableSingleProcessHashIndex;
    public static final boolean sIsLoadOptEnable;
    public static final boolean sMainThreadPriorityOpt;
    public static final KevaMonitor sMonitor;
    public static final ConcurrentHashMap<String, Map<String, Keva>> sPathRepoMap;
    public static final String sPortedSpRepoName;
    public static final int sPriorityValue;
    public static final Map<String, Keva> sRepoMap;
    public static final File sSharedPrefsDir;
    public static final File sWorkDir;
    public volatile long mHandle;
    public final boolean mIsMultiProcess;
    public final int mMode;
    public final String mName;
    public String mSpecifiedPath;
    public volatile Map<String, KevaValueWrapper> mValueMap = obtainMap();
    public final ConcurrentLinkedQueue<Keva.OnChangeListener> mChangeListeners = new ConcurrentLinkedQueue<>();
    public List<KevaValueWrapper> mDuplicatedOldWrappers = new ArrayList();
    public boolean mIsUseHashMappingFile = false;

    public static class KevaValueWrapper {
        public volatile boolean loaded;
        public volatile long offset;
        public volatile int type;
        public volatile Object value;
    }

    public static class PortedSpRepoHolder {
        public static final KevaImpl sInstance;
        public static final Map<String, ?> sPortedSpMap;

        static {
            KevaMultiProcessImpl kevaMultiProcessImpl = new KevaMultiProcessImpl(KevaImpl.sPortedSpRepoName, null, 1);
            sInstance = kevaMultiProcessImpl;
            kevaMultiProcessImpl.init(true);
            Map<String, ?> mapObtainMap = KevaImpl.obtainMap();
            kevaMultiProcessImpl.buildNewMap(mapObtainMap);
            sPortedSpMap = mapObtainMap;
        }
    }

    public interface PrivateConstants {
    }

    public static native void checkReportException(long j);

    public static native void clear(long j);

    public static native boolean delete(String str);

    private native void dump(long j);

    private native void erase(long j, String str, long j2);

    private native void eraseUnusedChunk(long j, long j2);

    public static void forceInitImpl() {
    }

    public static Keva getRepoImpl(String str, String str2, int i, boolean z) {
        return com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_KevaImplLancet_getRepoImpl(str, str2, i, z);
    }

    public static native void initialize(String str, boolean z, boolean z2);

    private native long loadRepo(String str, int i, boolean z);

    private native long loadRepoWithPath(String str, String str2, int i);

    private native int protectPortingInterProcess(String str, boolean z, int i);

    private native long storeBoolean(long j, String str, long j2, boolean z);

    private native long storeBytes(long j, String str, long j2, byte[] bArr, int i);

    private native long storeDouble(long j, String str, long j2, double d);

    private native long storeFloat(long j, String str, long j2, float f);

    private native long storeInt(long j, String str, long j2, int i);

    private native long storeLong(long j, String str, long j2, long j3);

    private native long storeString(long j, String str, long j2, String str2);

    private native long storeStringArray(long j, String str, long j2, String[] strArr, int i);

    @Override // com.bytedance.keva.Keva
    public void clear() {
        synchronized (this) {
            try {
                try {
                    this.mValueMap.clear();
                    clear(this.mHandle);
                } finally {
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public native boolean contains(long j, String str, long j2);

    @Override // com.bytedance.keva.Keva
    public void dump() {
        synchronized (this) {
            try {
                KevaMonitor kevaMonitor = sMonitor;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start dumping keva ");
                sbLIZ.append(this.mName);
                sbLIZ.append(", size=");
                sbLIZ.append(this.mValueMap.size());
                kevaMonitor.logDebug(C2188811AlT.LIZIZ(sbLIZ));
                for (Map.Entry<String, KevaValueWrapper> entry : this.mValueMap.entrySet()) {
                    KevaValueWrapper value = entry.getValue();
                    String key = entry.getKey();
                    KevaMonitor kevaMonitor2 = sMonitor;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("key: ");
                    sbLIZ2.append(key);
                    sbLIZ2.append(", value: ");
                    sbLIZ2.append(value.value);
                    sbLIZ2.append(", offset: ");
                    sbLIZ2.append(value.offset);
                    sbLIZ2.append(", loaded: ");
                    sbLIZ2.append(value.loaded);
                    kevaMonitor2.logDebug(C2188811AlT.LIZIZ(sbLIZ2));
                }
                KevaMonitor kevaMonitor3 = sMonitor;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("finish dumping keva ");
                sbLIZ3.append(this.mName);
                sbLIZ3.append(", size=");
                sbLIZ3.append(this.mValueMap.size());
                kevaMonitor3.logDebug(C2188811AlT.LIZIZ(sbLIZ3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void dumpNative() {
        synchronized (this) {
            try {
                dump(this.mHandle);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public native void fetchAllKey(long j, Set<String> set);

    public native boolean fetchBoolean(long j, String str, long j2, boolean z);

    public abstract boolean fetchBoolean(String str, boolean z);

    public native byte[] fetchBytes(long j, String str, long j2, byte[] bArr, int i);

    public abstract byte[] fetchBytes(String str, byte[] bArr, int i, boolean z);

    public native double fetchDouble(long j, String str, long j2, double d);

    public abstract double fetchDouble(String str, double d);

    public native float fetchFloat(long j, String str, long j2, float f);

    public abstract float fetchFloat(String str, float f);

    public native int fetchInt(long j, String str, long j2, int i);

    public abstract int fetchInt(String str, int i);

    public native long fetchLong(long j, String str, long j2, long j3);

    public abstract long fetchLong(String str, long j);

    public native String fetchString(long j, String str, long j2, String str2);

    public abstract String fetchString(String str, String str2, boolean z);

    public native String[] fetchStringArray(long j, String str, long j2, String[] strArr, int i);

    public abstract String[] fetchStringArray(String str, String[] strArr, boolean z);

    public native void rebuildValueMap(long j);

    private void cleanUpAfterLoadRepo() {
        if (this.mHandle == 0) {
            KevaMonitor kevaMonitor = sMonitor;
            String str = this.mName;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("free space is ");
            sbLIZ.append(Environment.getDataDirectory().getFreeSpace());
            kevaMonitor.reportWarning(1, str, null, null, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        try {
            Iterator<KevaValueWrapper> it2 = this.mDuplicatedOldWrappers.iterator();
            while (it2.hasNext()) {
                eraseUnusedChunk(this.mHandle, it2.next().offset);
            }
            this.mDuplicatedOldWrappers = null;
            checkReportException(this.mHandle);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sMonitor.reportThrowable(1, this.mName, null, null, th);
        }
    }

    public static Map obtainMap() {
        return !sIsEnableArrayMap ? new HashMap() : new ArrayMap();
    }

    static {
        KevaBuilder kevaBuilder = KevaBuilder.getInstance();
        KevaBuilder.IKevaBuildConfig iKevaBuildConfig = KevaBuilder.buildCallBackImpl;
        if (iKevaBuildConfig != null) {
            iKevaBuildConfig.setKevaConfig(kevaBuilder);
            kevaBuilder = KevaBuilder.getInstance();
        }
        KevaBuilder.clearInstance();
        sRepoMap = obtainMap();
        sPathRepoMap = new ConcurrentHashMap<>();
        Executor executor = kevaBuilder.mExecutor;
        if (executor != null) {
            sExecutor = executor;
        } else {
            int iMax = Math.max(Runtime.getRuntime().availableProcessors() * 2, 6);
            C822650WOx c822650WOx = new C822650WOx(iMax, iMax, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            c822650WOx.allowCoreThreadTimeOut(true);
            sExecutor = c822650WOx;
        }
        String str = kevaBuilder.mPortedRepoName;
        if (str == null) {
            str = "keva_porting_sp";
        }
        sPortedSpRepoName = str;
        Context context = kevaBuilder.mContext;
        File fileINVOKEVIRTUAL_com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = INVOKEVIRTUAL_com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context);
        if (fileINVOKEVIRTUAL_com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir == null) {
            fileINVOKEVIRTUAL_com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = new C0VSJ(context.getApplicationInfo().dataDir, "files");
        }
        if (!fileINVOKEVIRTUAL_com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.exists()) {
            fileINVOKEVIRTUAL_com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.mkdirs();
        }
        File c0vsj = kevaBuilder.mWorkDir;
        if (c0vsj == null) {
            c0vsj = new C0VSJ(fileINVOKEVIRTUAL_com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir, "keva");
        }
        sSharedPrefsDir = new C0VSJ(fileINVOKEVIRTUAL_com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir.getParent(), "shared_prefs");
        KevaMonitor kevaMonitor = kevaBuilder.mMonitor;
        if (kevaMonitor == null) {
            kevaMonitor = new KevaMonitor();
        }
        sMonitor = kevaMonitor;
        kevaMonitor.logDebug("Keva version: 1.6.6.SHARED.CXXAPI-alpha.104-tiktok-optimized-keva-load");
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fail to create work dir ");
            sbLIZ.append(c0vsj.getPath());
            kevaMonitor.reportThrowable(1, null, null, null, new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
        }
        boolean z = kevaBuilder.mEnableAsyncWrite;
        sIsAsyncWriteEnable = z;
        sIsLoadOptEnable = !z && kevaBuilder.mEnableLoadOpt;
        sIsEnableLockOpt = kevaBuilder.mEnableLockOpt;
        sIsEnableExecutorOpt = kevaBuilder.mEnableExecutorOpt;
        sExecuteKevaType = kevaBuilder.mExecuteKevaType;
        sWorkDir = c0vsj;
        sIsEnableArrayMap = kevaBuilder.mEnableArrayMap;
        sIsEnableLoadFromNative = kevaBuilder.mIsLoadFromNative;
        sIsEnableMultiProcessLoadFromNative = kevaBuilder.sIsEnableMultiProcessLoadFromNative;
        sMainThreadPriorityOpt = kevaBuilder.mMainThreadPriorityOpt;
        sPriorityValue = kevaBuilder.mPriorityValue;
        boolean z2 = kevaBuilder.mEnableSingleProcessHashIndex;
        sIsEnableSingleProcessHashIndex = z2;
        boolean z3 = kevaBuilder.mEnableMultiProcessHashIndex;
        sIsEnableMultiProcessHashIndex = z3;
        try {
            kevaMonitor.loadLibrary("keva");
            initialize(c0vsj.getAbsolutePath(), z2, z3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaMonitor kevaMonitor2 = sMonitor;
            kevaMonitor2.logDebug("fail to load so and init");
            kevaMonitor2.reportThrowable(1, null, null, null, th);
        }
    }

    public static Keva getPortedSpRepo() {
        return PortedSpRepoHolder.sInstance;
    }

    @Override // com.bytedance.keva.Keva
    public boolean isUserEnableHashIndex() {
        return this.mIsUseHashMappingFile;
    }

    public int mode() {
        return this.mMode;
    }

    @Override // com.bytedance.keva.Keva
    public String name() {
        return this.mName;
    }

    public static File INVOKEVIRTUAL_com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static boolean existSharedPrefs(String str) {
        File file = sSharedPrefsDir;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".xml");
        return new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ)).exists();
    }

    public static boolean isRepoPorted(String str) {
        if (PortedSpRepoHolder.sPortedSpMap.get(str) != null) {
            return true;
        }
        return getPortedSpRepo().getBoolean(str, false);
    }

    private KevaValueWrapper obtainWrapperLocked(String str) {
        KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        if (kevaValueWrapper == null) {
            KevaValueWrapper kevaValueWrapper2 = new KevaValueWrapper();
            this.mValueMap.put(str, kevaValueWrapper2);
            return kevaValueWrapper2;
        }
        return kevaValueWrapper;
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, Object> buildNewMap(Map<String, Object> map) {
        synchronized (this) {
            try {
                for (Map.Entry<String, KevaValueWrapper> entry : this.mValueMap.entrySet()) {
                    KevaValueWrapper value = entry.getValue();
                    if (value.offset != 0) {
                        String key = entry.getKey();
                        try {
                            if (!value.loaded) {
                                int i = value.type;
                                if (i != 6) {
                                    if (i != 7) {
                                        if (i != 23 && i != 39) {
                                            if (i == 55) {
                                                value.value = fetchStringArray(this.mHandle, key, value.offset, null, 3);
                                            } else if (!this.mIsMultiProcess || value.type > 5) {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("keva has not implemented type ");
                                                sbLIZ.append(value.type);
                                                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                                            }
                                        } else {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("keva has not implemented type ");
                                            sbLIZ2.append(value.type);
                                            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
                                        }
                                    } else {
                                        value.value = fetchBytes(this.mHandle, key, value.offset, null, 0);
                                    }
                                } else {
                                    value.value = fetchString(this.mHandle, key, value.offset, null);
                                }
                                if (!this.mIsMultiProcess) {
                                    value.loaded = true;
                                }
                            }
                            map.put(key, value.value);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            sMonitor.reportThrowable(2, this.mName, key, Long.valueOf(value.offset), th);
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return map;
    }

    public void checkMode(int i) {
        if (this.mHandle != 0 && this.mMode != i) {
            KevaMonitor kevaMonitor = sMonitor;
            String str = this.mName;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mode is different: ");
            sbLIZ.append(this.mMode);
            sbLIZ.append(" != ");
            sbLIZ.append(i);
            kevaMonitor.reportThrowable(1, str, null, null, new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    public void doLoadRepo(boolean z) {
        try {
            String str = this.mSpecifiedPath;
            if (str == null) {
                this.mHandle = loadRepo(this.mName, this.mMode, z);
            } else {
                this.mHandle = loadRepoWithPath(this.mName, str, this.mMode);
            }
            cleanUpAfterLoadRepo();
            if (!z) {
                sMonitor.onLoadRepo(this.mName, this.mMode);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sMonitor.reportThrowable(1, this.mName, null, null, th);
        }
    }

    public void doPortingFromSp(Context context) {
        boolean z;
        KevaImpl kevaImpl = this;
        synchronized (kevaImpl) {
            try {
                if (kevaImpl.mHandle != 0) {
                    return;
                }
                boolean z2 = kevaImpl instanceof KevaMultiProcessImpl;
                int iProtectPortingInterProcess = -1;
                if (z2) {
                    iProtectPortingInterProcess = kevaImpl.protectPortingInterProcess(kevaImpl.mName, true, -1);
                    if (isRepoPorted(kevaImpl.mName)) {
                        kevaImpl.doLoadRepo(false);
                        kevaImpl.protectPortingInterProcess(kevaImpl.mName, false, iProtectPortingInterProcess);
                        return;
                    }
                }
                if (!z2 && delete(kevaImpl.mName)) {
                    z = true;
                } else {
                    z = false;
                }
                KevaMonitor kevaMonitor = sMonitor;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("poring load empty repo >> ");
                sbLIZ.append(kevaImpl.mName);
                kevaMonitor.logDebug(C2188811AlT.LIZIZ(sbLIZ));
                kevaImpl.doLoadRepo(false);
                if (kevaImpl.mHandle == 0) {
                    return;
                }
                if (!z) {
                    kevaImpl.clear();
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences(kevaImpl.mName, 0);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("poring get sp >> ");
                sbLIZ2.append(kevaImpl.mName);
                kevaMonitor.logDebug(C2188811AlT.LIZIZ(sbLIZ2));
                Map<String, ?> all = sharedPreferences.getAll();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("poring get all value >> ");
                sbLIZ3.append(kevaImpl.mName);
                kevaMonitor.logDebug(C2188811AlT.LIZIZ(sbLIZ3));
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if ("".equals(key)) {
                            key = null;
                        }
                        KevaMonitor kevaMonitor2 = sMonitor;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("poring process key: ");
                        sbLIZ4.append(key);
                        sbLIZ4.append(", value: ");
                        sbLIZ4.append(value);
                        sbLIZ4.append(" >> ");
                        sbLIZ4.append(kevaImpl.mName);
                        kevaMonitor2.logDebug(C2188811AlT.LIZIZ(sbLIZ4));
                        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
                        kevaImpl.mValueMap.put(key, kevaValueWrapper);
                        try {
                            if (value instanceof Boolean) {
                                try {
                                    kevaValueWrapper.offset = kevaImpl.storeBoolean(kevaImpl.mHandle, key, kevaValueWrapper.offset, ((Boolean) value).booleanValue());
                                    kevaValueWrapper.value = value;
                                } catch (Throwable th) {
                                    th = th;
                                    TryCatchGuardChecker.doCheck(th);
                                    sMonitor.reportThrowable(3, kevaImpl.mName, key, value, th);
                                }
                            } else if (value instanceof Integer) {
                                kevaValueWrapper.offset = kevaImpl.storeInt(kevaImpl.mHandle, key, kevaValueWrapper.offset, ((Integer) value).intValue());
                                kevaValueWrapper.value = value;
                            } else if (value instanceof Long) {
                                long j = kevaImpl.mHandle;
                                key = key;
                                kevaImpl = kevaImpl;
                                kevaValueWrapper.offset = kevaImpl.storeLong(j, key, kevaValueWrapper.offset, ((Long) value).longValue());
                                kevaValueWrapper.value = value;
                            } else if (value instanceof Float) {
                                kevaValueWrapper.offset = kevaImpl.storeFloat(kevaImpl.mHandle, key, kevaValueWrapper.offset, ((Float) value).floatValue());
                                kevaValueWrapper.value = value;
                            } else if (value instanceof String) {
                                kevaValueWrapper.offset = kevaImpl.storeString(kevaImpl.mHandle, key, kevaValueWrapper.offset, (String) value);
                                kevaValueWrapper.value = value;
                            } else if (value instanceof Set) {
                                Set set = (Set) value;
                                String[] strArr = new String[set.size()];
                                set.toArray(strArr);
                                kevaValueWrapper.offset = kevaImpl.storeStringArray(kevaImpl.mHandle, key, kevaValueWrapper.offset, strArr, 3);
                                kevaValueWrapper.value = strArr;
                            } else {
                                String str = kevaImpl.mName;
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("do not support type: ");
                                sbLIZ5.append(value.getClass());
                                kevaMonitor2.reportThrowable(1, str, key, value, new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ5)));
                            }
                            if (!kevaImpl.mIsMultiProcess) {
                                try {
                                    kevaValueWrapper.loaded = true;
                                } catch (Throwable th2) {
                                    th = th2;
                                    TryCatchGuardChecker.doCheck(th);
                                    sMonitor.reportThrowable(3, kevaImpl.mName, key, value, th);
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
                getPortedSpRepo().storeBoolean(kevaImpl.mName, true);
                if (z2) {
                    kevaImpl.protectPortingInterProcess(kevaImpl.mName, false, iProtectPortingInterProcess);
                }
                KevaMonitor kevaMonitor3 = sMonitor;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("poring set ported repo >> ");
                sbLIZ6.append(kevaImpl.mName);
                kevaMonitor3.logDebug(C2188811AlT.LIZIZ(sbLIZ6));
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                throw th4;
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void erase(String str) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                try {
                    KevaValueWrapper kevaValueWrapperObtainWrapperLocked = obtainWrapperLocked(str2);
                    erase(this.mHandle, str2, kevaValueWrapperObtainWrapperLocked.offset);
                    kevaValueWrapperObtainWrapperLocked.value = null;
                    kevaValueWrapperObtainWrapperLocked.offset = 0L;
                    if (!this.mIsMultiProcess) {
                        kevaValueWrapperObtainWrapperLocked.loaded = true;
                    }
                } finally {
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void init(boolean z) {
        synchronized (this) {
            try {
                if (this.mHandle != 0) {
                    return;
                }
                doLoadRepo(z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        if (!this.mChangeListeners.contains(onChangeListener)) {
            this.mChangeListeners.add(onChangeListener);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        synchronized (this) {
            try {
                this.mChangeListeners.remove(onChangeListener);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void fetchAllKey(String str, Set<String> set) {
        set.add(str);
    }

    public static Keva getRepo(String str, int i) {
        return com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_KevaImplLancet_getRepoImpl(str, null, i, false);
    }

    public static Keva getRepoSync(String str, int i) {
        return com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_KevaImplLancet_getRepoImpl(str, null, i, true);
    }

    @Override // com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        boolean zFetchBoolean;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                try {
                    zFetchBoolean = fetchBoolean(str2, z);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(2, this.mName, str2, null, th);
                    return z;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return zFetchBoolean;
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        byte[] bArrFetchBytes;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                try {
                    bArrFetchBytes = fetchBytes(str2, bArr, 0, false);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(2, this.mName, str2, bArr, th);
                    return bArr;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return bArrFetchBytes;
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        byte[] bArrFetchBytes;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                try {
                    bArrFetchBytes = fetchBytes(str2, bArr, 0, true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(2, this.mName, str2, bArr, th);
                    return bArr;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return bArrFetchBytes;
    }

    @Override // com.bytedance.keva.Keva
    public double getDouble(String str, double d) {
        double dFetchDouble;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                try {
                    dFetchDouble = fetchDouble(str2, d);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(2, this.mName, str2, Double.valueOf(d), th);
                    return d;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return dFetchDouble;
    }

    @Override // com.bytedance.keva.Keva
    public float getFloat(String str, float f) {
        float fFetchFloat;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                try {
                    fFetchFloat = fetchFloat(str2, f);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(2, this.mName, str2, Float.valueOf(f), th);
                    return f;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return fFetchFloat;
    }

    @Override // com.bytedance.keva.Keva
    public int getInt(String str, int i) {
        int iFetchInt;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                try {
                    iFetchInt = fetchInt(str2, i);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(2, this.mName, str2, Integer.valueOf(i), th);
                    return i;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return iFetchInt;
    }

    @Override // com.bytedance.keva.Keva
    public long getLong(String str, long j) {
        long jFetchLong;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                try {
                    jFetchLong = fetchLong(str2, j);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(2, this.mName, str2, Long.valueOf(j), th);
                    return j;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return jFetchLong;
    }

    @Override // com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        String strFetchString;
        String str3 = str;
        if ("".equals(str3)) {
            str3 = null;
        }
        synchronized (this) {
            try {
                try {
                    strFetchString = fetchString(str3, str2, false);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(2, this.mName, str3, str2, th);
                    return str2;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return strFetchString;
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        String[] strArrFetchStringArray;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                try {
                    strArrFetchStringArray = fetchStringArray(str2, strArr, false);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(2, this.mName, str2, strArr, th);
                    return strArr;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return strArrFetchStringArray;
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        String[] strArrFetchStringArray;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                try {
                    strArrFetchStringArray = fetchStringArray(str2, strArr, true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(2, this.mName, str2, strArr, th);
                    return strArr;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return strArrFetchStringArray;
    }

    @Override // com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        String strFetchString;
        String str3 = str;
        if ("".equals(str3)) {
            str3 = null;
        }
        synchronized (this) {
            try {
                try {
                    strFetchString = fetchString(str3, str2, true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(2, this.mName, str3, str2, th);
                    return str2;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return strFetchString;
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> setFetchStringSet;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                try {
                    setFetchStringSet = fetchStringSet(str2, set, false);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(2, this.mName, str2, set, th);
                    return set;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return setFetchStringSet;
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        Set<String> setFetchStringSet;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                try {
                    setFetchStringSet = fetchStringSet(str2, set, true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(2, this.mName, str2, set, th);
                    return set;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return setFetchStringSet;
    }

    public void notifyChangeListeners(Keva keva, String str) {
        if (this.mChangeListeners.isEmpty()) {
            return;
        }
        Iterator<Keva.OnChangeListener> it2 = this.mChangeListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onChanged(keva, str);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                KevaValueWrapper kevaValueWrapperObtainWrapperLocked = obtainWrapperLocked(str2);
                if (!this.mIsMultiProcess && kevaValueWrapperObtainWrapperLocked.loaded && kevaValueWrapperObtainWrapperLocked.value != null && kevaValueWrapperObtainWrapperLocked.value.equals(Boolean.valueOf(z))) {
                    return;
                }
                try {
                    kevaValueWrapperObtainWrapperLocked.offset = storeBoolean(this.mHandle, str2, kevaValueWrapperObtainWrapperLocked.offset, z);
                    kevaValueWrapperObtainWrapperLocked.value = Boolean.valueOf(z);
                    if (!this.mIsMultiProcess) {
                        kevaValueWrapperObtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(3, this.mName, str2, Boolean.valueOf(z), th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        storeBytes(str, bArr, 0, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        storeBytes(str, bArr, 0, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeDouble(String str, double d) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                KevaValueWrapper kevaValueWrapperObtainWrapperLocked = obtainWrapperLocked(str2);
                if (!this.mIsMultiProcess && kevaValueWrapperObtainWrapperLocked.loaded && kevaValueWrapperObtainWrapperLocked.value != null && kevaValueWrapperObtainWrapperLocked.value.equals(Double.valueOf(d))) {
                    return;
                }
                try {
                    kevaValueWrapperObtainWrapperLocked.offset = storeDouble(this.mHandle, str2, kevaValueWrapperObtainWrapperLocked.offset, d);
                    kevaValueWrapperObtainWrapperLocked.value = Double.valueOf(d);
                    if (!this.mIsMultiProcess) {
                        kevaValueWrapperObtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(3, this.mName, str2, Double.valueOf(d), th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeFloat(String str, float f) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                KevaValueWrapper kevaValueWrapperObtainWrapperLocked = obtainWrapperLocked(str2);
                if (!this.mIsMultiProcess && kevaValueWrapperObtainWrapperLocked.loaded && kevaValueWrapperObtainWrapperLocked.value != null && kevaValueWrapperObtainWrapperLocked.value.equals(Float.valueOf(f))) {
                    return;
                }
                try {
                    kevaValueWrapperObtainWrapperLocked.offset = storeFloat(this.mHandle, str2, kevaValueWrapperObtainWrapperLocked.offset, f);
                    kevaValueWrapperObtainWrapperLocked.value = Float.valueOf(f);
                    if (!this.mIsMultiProcess) {
                        kevaValueWrapperObtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(3, this.mName, str2, Float.valueOf(f), th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeInt(String str, int i) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                KevaValueWrapper kevaValueWrapperObtainWrapperLocked = obtainWrapperLocked(str2);
                if (!this.mIsMultiProcess && kevaValueWrapperObtainWrapperLocked.loaded && kevaValueWrapperObtainWrapperLocked.value != null && kevaValueWrapperObtainWrapperLocked.value.equals(Integer.valueOf(i))) {
                    return;
                }
                try {
                    kevaValueWrapperObtainWrapperLocked.offset = storeInt(this.mHandle, str2, kevaValueWrapperObtainWrapperLocked.offset, i);
                    kevaValueWrapperObtainWrapperLocked.value = Integer.valueOf(i);
                    if (!this.mIsMultiProcess) {
                        kevaValueWrapperObtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(3, this.mName, str2, Integer.valueOf(i), th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeLong(String str, long j) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                KevaValueWrapper kevaValueWrapperObtainWrapperLocked = obtainWrapperLocked(str2);
                if (!this.mIsMultiProcess && kevaValueWrapperObtainWrapperLocked.loaded && kevaValueWrapperObtainWrapperLocked.value != null && kevaValueWrapperObtainWrapperLocked.value.equals(Long.valueOf(j))) {
                    return;
                }
                try {
                    kevaValueWrapperObtainWrapperLocked.offset = storeLong(this.mHandle, str2, kevaValueWrapperObtainWrapperLocked.offset, j);
                    kevaValueWrapperObtainWrapperLocked.value = Long.valueOf(j);
                    if (!this.mIsMultiProcess) {
                        kevaValueWrapperObtainWrapperLocked.loaded = true;
                    }
                    notifyChangeListeners(this, str2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(3, this.mName, str2, Long.valueOf(j), th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        storeString(str, str2, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        storeStringArray(str, strArr, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        storeStringArray(str, strArr, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        storeString(str, str2, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        storeStringSet(str, set, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        storeStringSet(str, set, true);
    }

    public KevaImpl(String str, String str2, int i) {
        this.mName = str;
        this.mMode = i;
        this.mSpecifiedPath = str2;
        this.mIsMultiProcess = (i & 1) != 0;
    }

    private Set<String> fetchStringSet(String str, Set<String> set, boolean z) {
        String[] strArr;
        if (set != null) {
            strArr = (String[]) set.toArray(new String[0]);
        } else {
            strArr = null;
        }
        String[] strArrFetchStringArray = fetchStringArray(str, strArr, z);
        if (strArrFetchStringArray == null) {
            return null;
        }
        return new HashSet(Arrays.asList(strArrFetchStringArray));
    }

    public static Keva getRepoFromSp(Context context, String str, int i) {
        return getRepoFromSpImpl(context, str, i, false);
    }

    public static Keva getRepoFromSpSync(Context context, String str, int i) {
        return getRepoFromSpImpl(context, str, i, true);
    }

    private void reportBigValue(final String str, final Object obj, final int i) {
        if (i > 10000) {
            sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("KevaImpl@6b56.reportBigValue$1");
                    com_bytedance_keva_KevaImpl$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("KevaImpl@6b56.reportBigValue$1");
                }

                public void com_bytedance_keva_KevaImpl$2__run$___twin___() {
                    KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                    String str2 = KevaImpl.this.mName;
                    String str3 = str;
                    Object obj2 = obj;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("value too big, size=");
                    sbLIZ.append(i);
                    kevaMonitor.reportWarning(3, str2, str3, obj2, C2188811AlT.LIZIZ(sbLIZ));
                }

                public static void com_bytedance_keva_KevaImpl$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    try {
                        anonymousClass2.com_bytedance_keva_KevaImpl$2__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    private void storeString(String str, final String str2, boolean z) {
        final int length;
        final String str3 = str;
        if ("".equals(str3)) {
            str3 = null;
        }
        synchronized (this) {
            try {
                KevaValueWrapper kevaValueWrapperObtainWrapperLocked = obtainWrapperLocked(str3);
                if (!this.mIsMultiProcess && kevaValueWrapperObtainWrapperLocked.loaded && kevaValueWrapperObtainWrapperLocked.value != null && kevaValueWrapperObtainWrapperLocked.value.equals(str2)) {
                    return;
                }
                try {
                    kevaValueWrapperObtainWrapperLocked.offset = storeString(this.mHandle, str3, kevaValueWrapperObtainWrapperLocked.offset, str2);
                    kevaValueWrapperObtainWrapperLocked.type = 6;
                    if (!z) {
                        kevaValueWrapperObtainWrapperLocked.value = str2;
                        if (!this.mIsMultiProcess) {
                            kevaValueWrapperObtainWrapperLocked.loaded = true;
                        }
                    } else {
                        kevaValueWrapperObtainWrapperLocked.value = null;
                        kevaValueWrapperObtainWrapperLocked.loaded = false;
                    }
                    notifyChangeListeners(this, str3);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(3, this.mName, str3, str2, th);
                }
                if (str2 != null && (length = str2.length()) > 10000) {
                    sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaImpl.3
                        @Override // java.lang.Runnable
                        public void run() {
                            C1C7U.LIZ("KevaImpl@6b56.storeString$1");
                            com_bytedance_keva_KevaImpl$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            C1C7U.LIZIZ("KevaImpl@6b56.storeString$1");
                        }

                        public void com_bytedance_keva_KevaImpl$3__run$___twin___() {
                            KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                            String str4 = KevaImpl.this.mName;
                            String str5 = str3;
                            String str6 = str2;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("value too big, size=");
                            sbLIZ.append(length);
                            kevaMonitor.reportWarning(3, str4, str5, str6, C2188811AlT.LIZIZ(sbLIZ));
                        }

                        public static void com_bytedance_keva_KevaImpl$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                            try {
                                anonymousClass3.com_bytedance_keva_KevaImpl$3__run$___twin___();
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                if (!C2179971ATj.LIZ(th2)) {
                                    throw th2;
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    private void storeStringArray(String str, String[] strArr, boolean z) {
        final String string;
        final int length;
        final String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                KevaValueWrapper kevaValueWrapperObtainWrapperLocked = obtainWrapperLocked(str2);
                try {
                    kevaValueWrapperObtainWrapperLocked.offset = storeStringArray(this.mHandle, str2, kevaValueWrapperObtainWrapperLocked.offset, strArr, 3);
                    kevaValueWrapperObtainWrapperLocked.type = 55;
                    if (!z) {
                        kevaValueWrapperObtainWrapperLocked.value = strArr;
                        if (!this.mIsMultiProcess) {
                            kevaValueWrapperObtainWrapperLocked.loaded = true;
                        }
                    } else {
                        kevaValueWrapperObtainWrapperLocked.value = null;
                        kevaValueWrapperObtainWrapperLocked.loaded = false;
                    }
                    notifyChangeListeners(this, str2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(3, this.mName, str2, null, th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (strArr != null && (length = (string = Arrays.toString(strArr)).length()) > 10000) {
            sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("KevaImpl@6b56.storeStringArray$1");
                    com_bytedance_keva_KevaImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("KevaImpl@6b56.storeStringArray$1");
                }

                public void com_bytedance_keva_KevaImpl$5__run$___twin___() {
                    KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                    String str3 = KevaImpl.this.mName;
                    String str4 = str2;
                    String str5 = string;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("value too big, size=");
                    sbLIZ.append(length);
                    kevaMonitor.reportWarning(3, str3, str4, str5, C2188811AlT.LIZIZ(sbLIZ));
                }

                public static void com_bytedance_keva_KevaImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                    try {
                        anonymousClass5.com_bytedance_keva_KevaImpl$5__run$___twin___();
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        if (!C2179971ATj.LIZ(th3)) {
                            throw th3;
                        }
                    }
                }
            });
        }
    }

    private void storeStringSet(String str, Set<String> set, boolean z) {
        String[] strArr;
        if (set != null) {
            strArr = new String[set.size()];
            set.toArray(strArr);
        } else {
            strArr = null;
        }
        storeStringArray(str, strArr, z);
    }

    public void addMapBoolWhenLoading(String str, boolean z, long j) {
        addMapObjectWhenLoading(str, Boolean.valueOf(z), j, 2);
    }

    public void addMapDoubleWhenLoading(String str, double d, long j) {
        addMapObjectWhenLoading(str, Double.valueOf(d), j, 5);
    }

    public void addMapFloatWhenLoading(String str, float f, long j) {
        addMapObjectWhenLoading(str, Float.valueOf(f), j, 4);
    }

    public void addMapIntWhenLoading(String str, int i, long j) {
        addMapObjectWhenLoading(str, Integer.valueOf(i), j, 1);
    }

    public void addMapLongWhenLoading(String str, long j, long j2) {
        addMapObjectWhenLoading(str, Long.valueOf(j), j2, 3);
    }

    public void addMapOffsetWhenLoading(String str, long j, int i) {
        List<KevaValueWrapper> list;
        if ("".equals(str)) {
            str = null;
        }
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        kevaValueWrapper.offset = j;
        kevaValueWrapper.type = i;
        KevaValueWrapper kevaValueWrapperPut = this.mValueMap.put(str, kevaValueWrapper);
        if (kevaValueWrapperPut != null && (list = this.mDuplicatedOldWrappers) != null) {
            list.add(kevaValueWrapperPut);
        }
    }

    private void addMapObjectWhenLoading(String str, Object obj, long j, int i) {
        List<KevaValueWrapper> list;
        if ("".equals(str)) {
            str = null;
        }
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        kevaValueWrapper.value = obj;
        kevaValueWrapper.offset = j;
        kevaValueWrapper.type = i;
        if (!this.mIsMultiProcess) {
            kevaValueWrapper.loaded = true;
        }
        KevaValueWrapper kevaValueWrapperPut = this.mValueMap.put(str, kevaValueWrapper);
        if (kevaValueWrapperPut != null && (list = this.mDuplicatedOldWrappers) != null) {
            list.add(kevaValueWrapperPut);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.keva.Keva com_bytedance_keva_KevaImpl__getRepoImpl$___twin___(java.lang.String r6, java.lang.String r7, int r8, boolean r9) {
        /*
            boolean r0 = com.bytedance.keva.KevaImpl.sIsEnableLockOpt
            r5 = 0
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L3e
            if (r7 != 0) goto Ld
            java.util.Map<java.lang.String, com.bytedance.keva.Keva> r1 = com.bytedance.keva.KevaImpl.sRepoMap
        Lb:
            monitor-enter(r1)
            goto L1d
        Ld:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, com.bytedance.keva.Keva>> r1 = com.bytedance.keva.KevaImpl.sPathRepoMap
            java.util.Map r0 = obtainMap()
            r1.putIfAbsent(r7, r0)
            java.lang.Object r1 = r1.get(r7)
            java.util.Map r1 = (java.util.Map) r1
            goto Lb
        L1d:
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L38
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2     // Catch: java.lang.Throwable -> L38
            if (r2 != 0) goto L2d
            if (r9 == 0) goto L28
            goto L2f
        L28:
            com.bytedance.keva.Keva r2 = getAsyncKeva(r5, r6, r7, r8, r3)     // Catch: java.lang.Throwable -> L38
            goto L33
        L2d:
            r4 = 0
            goto L36
        L2f:
            com.bytedance.keva.KevaImpl r2 = getEmptyRepoImplWithPath(r6, r7, r8, r3)     // Catch: java.lang.Throwable -> L38
        L33:
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> L38
        L36:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
            goto L76
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L38
            throw r0
        L3e:
            if (r7 != 0) goto L4c
            java.util.Map<java.lang.String, com.bytedance.keva.Keva> r1 = com.bytedance.keva.KevaImpl.sRepoMap
        L42:
            java.lang.Object r2 = r1.get(r6)
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2
            if (r2 != 0) goto L89
            monitor-enter(r1)
            goto L5c
        L4c:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, com.bytedance.keva.Keva>> r1 = com.bytedance.keva.KevaImpl.sPathRepoMap
            java.util.Map r0 = obtainMap()
            r1.putIfAbsent(r7, r0)
            java.lang.Object r1 = r1.get(r7)
            java.util.Map r1 = (java.util.Map) r1
            goto L42
        L5c:
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L83
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2     // Catch: java.lang.Throwable -> L83
            if (r2 != 0) goto L6c
            if (r9 == 0) goto L67
            goto L6e
        L67:
            com.bytedance.keva.Keva r2 = getAsyncKeva(r5, r6, r7, r8, r3)     // Catch: java.lang.Throwable -> L83
            goto L72
        L6c:
            r4 = 0
            goto L75
        L6e:
            com.bytedance.keva.KevaImpl r2 = getEmptyRepoImplWithPath(r6, r7, r8, r3)     // Catch: java.lang.Throwable -> L83
        L72:
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> L83
        L75:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
        L76:
            if (r4 == 0) goto L89
            boolean r0 = r2 instanceof com.bytedance.keva.KevaFuture
            if (r0 != 0) goto L82
            r0 = r2
            com.bytedance.keva.KevaImpl r0 = (com.bytedance.keva.KevaImpl) r0
            r0.init(r3)
        L82:
            return r2
        L83:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
            throw r0
        L89:
            boolean r0 = r2 instanceof com.bytedance.keva.KevaFuture
            if (r0 != 0) goto L94
            r0 = r2
            com.bytedance.keva.KevaImpl r0 = (com.bytedance.keva.KevaImpl) r0
            r0.checkMode(r8)
            return r2
        L94:
            r0 = r2
            com.bytedance.keva.KevaFuture r0 = (com.bytedance.keva.KevaFuture) r0
            r0.checkMode(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.com_bytedance_keva_KevaImpl__getRepoImpl$___twin___(java.lang.String, java.lang.String, int, boolean):com.bytedance.keva.Keva");
    }

    public static Keva com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_KevaImplLancet_getRepoImpl(String str, String str2, int i, boolean z) {
        Object c098200Yq;
        boolean z2;
        int i2;
        if (C202094145s.LJIILL > 0) {
            if (!z) {
                int i3 = C1BXB.LIZ;
                if (i3 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((z2 && !C0CKZ.LJFF && SystemClock.uptimeMillis() - C202094145s.LJII <= 7000 && (((i3 & 1) == 1 && Looper.getMainLooper() != Looper.myLooper()) || ((i3 & 2) == 2 && ((HashSet) C1BXB.LIZJ).contains(str)))) || ((i2 = C1BXB.LIZIZ) > 0 && (((i2 & 1) == 1 && Looper.getMainLooper() != Looper.myLooper()) || ((i2 & 2) == 2 && ((HashSet) C1BXB.LIZLLL).contains(str))))) {
                    z = true;
                }
            }
            if (C309220CAe.LIZLLL()) {
                Thread threadCurrentThread = Thread.currentThread();
                Thread thread = C309220CAe.LIZJ;
                if (thread == null) {
                    thread = null;
                }
                if (Intrinsics.LJFF(threadCurrentThread, thread)) {
                    try {
                        C309250CAh c309250CAh = C309220CAe.LIZIZ;
                        if (c309250CAh == null) {
                            c309250CAh = null;
                        }
                        Map<String, AbstractC309290CAl> map = c309250CAh.LIZIZ;
                        if (true ^ map.isEmpty()) {
                            try {
                                Iterator<Map.Entry<String, AbstractC309290CAl>> it2 = map.entrySet().iterator();
                                while (it2.hasNext()) {
                                    AbstractC309290CAl value = it2.next().getValue();
                                    if (value.LIZ && !value.LIZJ.get() && (!value.LJFF || Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper()))) {
                                        value.LIZLLL.add(new KevaInfo(str, i, z));
                                    }
                                }
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            C189200o6.m1boximpl(c098200Yq);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        return com_bytedance_keva_KevaImpl__getRepoImpl$___twin___(str, str2, i, z);
    }

    public static KevaImpl getEmptyRepoImpl(String str, String str2, int i, boolean z) {
        return getEmptyRepoImplWithPath(str, str2, i, z);
    }

    public static KevaImpl getEmptyRepoImplWithPath(String str, String str2, int i, boolean z) {
        if (i < 0 || i >= 2) {
            KevaMonitor kevaMonitor = sMonitor;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mode is not valid! ");
            sbLIZ.append(i);
            kevaMonitor.reportThrowable(1, str, null, null, new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ)));
        }
        if ((i & 1) == 0) {
            if (!z) {
                int i2 = sIsEnableLoadFromNative;
                if (i2 == 1) {
                    return new KevaPrivateNativeImpl(str, str2, i);
                }
                if (i2 == 2) {
                    return new KevaPrivateOnlyNativeImpl(str, str2, i);
                }
                return new KevaPrivateImpl(str, str2, i);
            }
            return new KevaPrivateImpl(str, str2, i);
        }
        if (!z && sIsEnableMultiProcessLoadFromNative == 1) {
            return new KevaPrivateOnlyNativeImpl(str, str2, i);
        }
        return new KevaMultiProcessImpl(str, str2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.keva.Keva getRepoFromSpImpl(android.content.Context r7, java.lang.String r8, int r9, boolean r10) {
        /*
            r5 = r8
            boolean r0 = isRepoPorted(r5)
            if (r0 == 0) goto Lc
            com.bytedance.keva.Keva r0 = getRepo(r5, r9)
            return r0
        Lc:
            boolean r0 = existSharedPrefs(r5)
            r4 = 1
            if (r0 != 0) goto L1f
            com.bytedance.keva.Keva r0 = getPortedSpRepo()
            r0.storeBoolean(r5, r4)
            com.bytedance.keva.Keva r0 = getRepo(r5, r9)
            return r0
        L1f:
            com.bytedance.keva.KevaMonitor r2 = com.bytedance.keva.KevaImpl.sMonitor
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "do poring from sp: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.logDebug(r0)
            boolean r1 = com.bytedance.keva.KevaImpl.sIsEnableLockOpt
            r0 = 0
            r6 = 0
            if (r1 != 0) goto L5d
            java.util.Map<java.lang.String, com.bytedance.keva.Keva> r1 = com.bytedance.keva.KevaImpl.sRepoMap
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L57
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2     // Catch: java.lang.Throwable -> L57
            if (r2 != 0) goto L55
            r0 = 1
            if (r10 == 0) goto L4e
        L49:
            com.bytedance.keva.KevaImpl r2 = getEmptyRepoImplWithPath(r5, r6, r9, r4)     // Catch: java.lang.Throwable -> L57
            goto L52
        L4e:
            com.bytedance.keva.Keva r2 = getAsyncKeva(r7, r5, r6, r9, r4)     // Catch: java.lang.Throwable -> L57
        L52:
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L57
        L55:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            goto L81
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r0
        L5d:
            java.util.Map<java.lang.String, com.bytedance.keva.Keva> r1 = com.bytedance.keva.KevaImpl.sRepoMap
            java.lang.Object r2 = r1.get(r5)
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2
            if (r2 != 0) goto L9f
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L99
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2     // Catch: java.lang.Throwable -> L99
            if (r2 != 0) goto L80
            r0 = 1
            if (r10 == 0) goto L79
        L74:
            com.bytedance.keva.KevaImpl r2 = getEmptyRepoImplWithPath(r5, r6, r9, r4)     // Catch: java.lang.Throwable -> L99
            goto L7d
        L79:
            com.bytedance.keva.Keva r2 = getAsyncKeva(r7, r5, r6, r9, r4)     // Catch: java.lang.Throwable -> L99
        L7d:
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L99
        L80:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L99
        L81:
            if (r0 == 0) goto L9f
            boolean r0 = r2 instanceof com.bytedance.keva.KevaImpl
            if (r0 == 0) goto La9
            r0 = r2
            com.bytedance.keva.KevaImpl r0 = (com.bytedance.keva.KevaImpl) r0     // Catch: java.lang.UnsatisfiedLinkError -> L8e
            r0.doPortingFromSp(r7)     // Catch: java.lang.UnsatisfiedLinkError -> L8e
            return r2
        L8e:
            r8 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r8)
            com.bytedance.keva.KevaMonitor r3 = com.bytedance.keva.KevaImpl.sMonitor
            r7 = r6
            r3.reportThrowable(r4, r5, r6, r7, r8)
            return r2
        L99:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L99
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L99
            throw r0
        L9f:
            boolean r0 = r2 instanceof com.bytedance.keva.KevaImpl
            if (r0 == 0) goto Laa
            r0 = r2
            com.bytedance.keva.KevaImpl r0 = (com.bytedance.keva.KevaImpl) r0
            r0.checkMode(r9)
        La9:
            return r2
        Laa:
            r0 = r2
            com.bytedance.keva.KevaFuture r0 = (com.bytedance.keva.KevaFuture) r0
            r0.checkMode(r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.getRepoFromSpImpl(android.content.Context, java.lang.String, int, boolean):com.bytedance.keva.Keva");
    }

    public static Keva getRepoWithPath(String str, String str2, int i, boolean z) {
        if (str2 != null && !"".equals(str2) && !str2.startsWith("/") && str2.endsWith("/")) {
            return com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_KevaImplLancet_getRepoImpl(str, str2, i, z);
        }
        throw new IllegalArgumentException("The path passed in is wrong!");
    }

    private void storeBytes(String str, byte[] bArr, int i, boolean z) {
        final int length;
        final String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                KevaValueWrapper kevaValueWrapperObtainWrapperLocked = obtainWrapperLocked(str2);
                try {
                    kevaValueWrapperObtainWrapperLocked.offset = storeBytes(this.mHandle, str2, kevaValueWrapperObtainWrapperLocked.offset, bArr, i);
                    kevaValueWrapperObtainWrapperLocked.type = (i << 4) | 7;
                    if (!z) {
                        kevaValueWrapperObtainWrapperLocked.value = bArr;
                        if (!this.mIsMultiProcess) {
                            kevaValueWrapperObtainWrapperLocked.loaded = true;
                        }
                    } else {
                        kevaValueWrapperObtainWrapperLocked.value = null;
                        kevaValueWrapperObtainWrapperLocked.loaded = false;
                    }
                    notifyChangeListeners(this, str2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sMonitor.reportThrowable(3, this.mName, str2, bArr, th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (bArr != null && (length = bArr.length) > 10000) {
            sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("KevaImpl@6b56.storeBytes$1");
                    com_bytedance_keva_KevaImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("KevaImpl@6b56.storeBytes$1");
                }

                public void com_bytedance_keva_KevaImpl$4__run$___twin___() {
                    KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                    String str3 = KevaImpl.this.mName;
                    String str4 = str2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("value too big, size=");
                    sbLIZ.append(length);
                    kevaMonitor.reportWarning(3, str3, str4, null, C2188811AlT.LIZIZ(sbLIZ));
                }

                public static void com_bytedance_keva_KevaImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                    try {
                        anonymousClass4.com_bytedance_keva_KevaImpl$4__run$___twin___();
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        if (!C2179971ATj.LIZ(th3)) {
                            throw th3;
                        }
                    }
                }
            });
        }
    }

    public static Keva getAsyncKeva(final Context context, final String str, final String str2, final int i, final boolean z) {
        Callable<KevaImpl> callable = new Callable<KevaImpl>() { // from class: com.bytedance.keva.KevaImpl.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public KevaImpl call() {
                if (z) {
                    KevaImpl emptyRepoImplWithPath = KevaImpl.getEmptyRepoImplWithPath(str, str2, i, true);
                    emptyRepoImplWithPath.doPortingFromSp(context);
                    return emptyRepoImplWithPath;
                }
                KevaImpl emptyRepoImplWithPath2 = KevaImpl.getEmptyRepoImplWithPath(str, str2, i, false);
                emptyRepoImplWithPath2.init(false);
                return emptyRepoImplWithPath2;
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ KevaImpl call() {
                C1C7U.LIZ("KevaImpl@6b56.getAsyncKeva$1");
                KevaImpl kevaImplCall = call();
                C1C7U.LIZIZ("KevaImpl@6b56.getAsyncKeva$1");
                return kevaImplCall;
            }
        };
        if (sIsAsyncWriteEnable && i == 0) {
            return new KevaAsyncWriter(str, str2, 0, callable, z);
        }
        return new KevaFuture(str, str2, i, callable, z);
    }

    public static void passWarning(int i, String str, String str2, Object obj, String str3) {
        sMonitor.reportWarning(i, str, str2, obj, str3);
    }
}
