package com.bytedance.crash.dumper;

import X.C0VJB;
import X.C0VSF;
import X.C0VSJ;
import X.C0VX9;
import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C798010VSd;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.Serializable;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class MemoryInfo {

    public static class DevMemoryInfo implements Serializable {
        public static final long serialVersionUID = 1;
        public final long mDalvikPrivateDirty;
        public final long mDalvikPss;
        public final long mDalvikSharedDirty;
        public final long mNativePrivateDirty;
        public final long mNativePss;
        public final long mNativeSharedDirty;
        public final long mOtherPrivateDirty;
        public final long mOtherPss;
        public final long mOtherSharedDirty;
        public final long mSummaryGraphics;
        public final long mTotalPrivateClean;
        public final long mTotalPrivateDirty;
        public final long mTotalPss;
        public final long mTotalSharedClean;
        public final long mTotalSharedDirty;
        public final long mTotalSwappablePss;

        public DevMemoryInfo() {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            this.mDalvikPss = ((long) memoryInfo.dalvikPss) * 1024;
            this.mDalvikSharedDirty = ((long) memoryInfo.dalvikSharedDirty) * 1024;
            this.mDalvikPrivateDirty = ((long) memoryInfo.dalvikPrivateDirty) * 1024;
            this.mNativePss = ((long) memoryInfo.nativePss) * 1024;
            this.mNativeSharedDirty = ((long) memoryInfo.nativeSharedDirty) * 1024;
            this.mNativePrivateDirty = ((long) memoryInfo.nativePrivateDirty) * 1024;
            this.mOtherPss = ((long) memoryInfo.otherPss) * 1024;
            this.mOtherSharedDirty = ((long) memoryInfo.otherSharedDirty) * 1024;
            this.mOtherPrivateDirty = ((long) memoryInfo.otherPrivateDirty) * 1024;
            this.mTotalPss = ((long) memoryInfo.getTotalPss()) * 1024;
            this.mTotalSharedClean = ((long) memoryInfo.getTotalSharedClean()) * 1024;
            this.mTotalPrivateClean = ((long) memoryInfo.getTotalPrivateClean()) * 1024;
            this.mTotalSwappablePss = ((long) memoryInfo.getTotalSwappablePss()) * 1024;
            this.mTotalSharedDirty = ((long) memoryInfo.getTotalSharedDirty()) * 1024;
            this.mTotalPrivateDirty = ((long) memoryInfo.getTotalPrivateDirty()) * 1024;
            this.mSummaryGraphics = getSummaryGraphics(memoryInfo);
        }

        public static void dump(File file) {
            C0VJB.LIZIZ(new C0VSJ(file, "dev_memory.inf"), new DevMemoryInfo());
        }

        public static long getSummaryGraphics(Debug.MemoryInfo memoryInfo) {
            try {
                return ((long) CastIntegerProtector.parseInt(memoryInfo.getMemoryStat("summary.graphics"))) * 1024;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return 0L;
            }
        }

        public static DevMemoryInfo load(File file) {
            return (DevMemoryInfo) C0VJB.LIZ(new C0VSJ(file, "dev_memory.inf"));
        }

        public void pushTo(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("dalvikPss", this.mDalvikPss);
                jSONObject2.put("dalvikSharedDirty", this.mDalvikSharedDirty);
                jSONObject2.put("dalvikPrivateDirty", this.mDalvikPrivateDirty);
                jSONObject2.put("nativePss", this.mNativePss);
                jSONObject2.put("nativeSharedDirty", this.mNativeSharedDirty);
                jSONObject2.put("nativePrivateDirty", this.mNativePrivateDirty);
                jSONObject2.put("otherPss", this.mOtherPss);
                jSONObject2.put("otherSharedDirty", this.mOtherSharedDirty);
                jSONObject2.put("otherPrivateDirty", this.mOtherPrivateDirty);
                jSONObject2.put("totalPss", this.mTotalPss);
                jSONObject2.put("totalPrivateClean", this.mTotalPrivateClean);
                jSONObject2.put("totalSharedClean", this.mTotalSharedClean);
                jSONObject2.put("totalSwappablePss", this.mTotalSwappablePss);
                jSONObject2.put("totalSharedDirty", this.mTotalSharedDirty);
                jSONObject2.put("totalPrivateDirty", this.mTotalPrivateDirty);
                jSONObject2.put("summary.graphics", this.mSummaryGraphics);
                jSONObject.put("memory_info", jSONObject2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static class AppMemoryInfo implements Serializable {
        public static final long serialVersionUID = 1;
        public int mLargeMemoryClass;
        public int mMemoryClass;
        public final long mRuntimeFree;
        public final long mRuntimeMax;
        public final long mRuntimeTotal;
        public final long mNativeHeapSize = Debug.getNativeHeapSize();
        public final long mNativeHeapAllocSize = Debug.getNativeHeapAllocatedSize();
        public final long mNativeHeapFreeSize = Debug.getNativeHeapFreeSize();

        public AppMemoryInfo(ActivityManager activityManager) {
            Runtime runtime = Runtime.getRuntime();
            this.mRuntimeMax = runtime.maxMemory();
            this.mRuntimeFree = runtime.freeMemory();
            this.mRuntimeTotal = runtime.totalMemory();
            if (activityManager != null) {
                this.mMemoryClass = activityManager.getMemoryClass();
                this.mLargeMemoryClass = activityManager.getLargeMemoryClass();
            }
        }

        public static AppMemoryInfo load(File file) {
            return (AppMemoryInfo) C0VJB.LIZ(new C0VSJ(file, "app_memory.inf"));
        }

        public void pushTo(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("native_heap_size", this.mNativeHeapSize);
                jSONObject2.put("native_heap_alloc_size", this.mNativeHeapAllocSize);
                jSONObject2.put("native_heap_free_size", this.mNativeHeapFreeSize);
                jSONObject2.put("max_memory", this.mRuntimeMax);
                jSONObject2.put("free_memory", this.mRuntimeFree);
                jSONObject2.put("total_memory", this.mRuntimeTotal);
                jSONObject2.put("memory_class", this.mMemoryClass);
                jSONObject2.put("large_memory_class", this.mLargeMemoryClass);
                jSONObject.put("app_memory_info", jSONObject2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }

        public static void dump(File file, ActivityManager activityManager) {
            C0VJB.LIZIZ(new C0VSJ(file, "app_memory.inf"), new AppMemoryInfo(activityManager));
        }
    }

    public static class SysMemoryInfo implements Serializable {
        public static final long serialVersionUID = 1;
        public final long mAvailMem;
        public final boolean mLowMemory;
        public final long mThreshold;
        public final long mTotalMem;

        public SysMemoryInfo(ActivityManager activityManager) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud82d22r9XLbWBWt3P03/B/F5A==", null));
            this.mLowMemory = memoryInfo.lowMemory;
            this.mThreshold = memoryInfo.threshold;
            this.mAvailMem = memoryInfo.availMem;
            this.mTotalMem = memoryInfo.totalMem;
        }

        public static SysMemoryInfo load(File file) {
            return (SysMemoryInfo) C0VJB.LIZ(new C0VSJ(file, "sys_memory.inf"));
        }

        public void pushTo(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("lowMemory", this.mLowMemory);
                jSONObject2.put("threshold", this.mThreshold);
                jSONObject2.put("availMem", this.mAvailMem);
                jSONObject2.put("totalMem", this.mTotalMem);
                jSONObject.put("sys_memory_info", jSONObject2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }

        public static void dump(File file, ActivityManager activityManager) {
            if (activityManager != null) {
                C0VJB.LIZIZ(new C0VSJ(file, "sys_memory.inf"), new SysMemoryInfo(activityManager));
            }
        }
    }

    public static void LIZ(File file) {
        Context contextLJ = C0VX9.LJ();
        if (contextLJ != null) {
            ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(contextLJ, "activity");
            DevMemoryInfo.dump(file);
            SysMemoryInfo.dump(file, activityManager);
            AppMemoryInfo.dump(file, activityManager);
        }
    }

    public static void LIZIZ(JSONObject jSONObject, File file) {
        AppMemoryInfo appMemoryInfo;
        SysMemoryInfo sysMemoryInfo;
        DevMemoryInfo devMemoryInfo;
        ActivityManager activityManager;
        BufferedReader bufferedReader;
        JSONObject jSONObject2 = null;
        if (file != null) {
            appMemoryInfo = AppMemoryInfo.load(file);
            sysMemoryInfo = SysMemoryInfo.load(file);
            devMemoryInfo = DevMemoryInfo.load(file);
            JSONObject jSONObject3 = new JSONObject();
            C0VSJ c0vsj = new C0VSJ(file, "sys_memtrack.txt");
            if (c0vsj.exists()) {
                try {
                    bufferedReader = new BufferedReader(new C0VSF(c0vsj));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            if (!"".equals(line)) {
                                String[] strArrSplit = line.split(" ");
                                if (strArrSplit.length == 3) {
                                    String str = strArrSplit[0];
                                    jSONObject3.putOpt(str.substring(0, str.length() - 1), Long.valueOf(Long.parseLong(strArrSplit[1]) * 1024));
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C798010VSd.LIZ(bufferedReader);
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
                C798010VSd.LIZ(bufferedReader);
            }
            jSONObject2 = jSONObject3;
        } else {
            Context contextLJ = C0VX9.LJ();
            if (contextLJ != null && (activityManager = (ActivityManager) C786410Ut5.H2(contextLJ, "activity")) != null) {
                appMemoryInfo = new AppMemoryInfo(activityManager);
                sysMemoryInfo = new SysMemoryInfo(activityManager);
            } else {
                appMemoryInfo = null;
                sysMemoryInfo = null;
            }
            devMemoryInfo = new DevMemoryInfo();
        }
        if (appMemoryInfo != null) {
            appMemoryInfo.pushTo(jSONObject);
        }
        if (sysMemoryInfo != null) {
            sysMemoryInfo.pushTo(jSONObject);
        }
        if (devMemoryInfo != null) {
            devMemoryInfo.pushTo(jSONObject);
        }
        if (jSONObject2 != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("memory_info");
            if (jSONObjectOptJSONObject == null) {
                try {
                    jSONObject.putOpt("memory_info", jSONObject2);
                    return;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            if (!jSONObjectOptJSONObject.has("graphicPss")) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    try {
                        String next = itKeys.next();
                        if (!jSONObjectOptJSONObject.has(next)) {
                            jSONObjectOptJSONObject.put(next, jSONObject2.opt(next));
                        }
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        return;
                    }
                }
            }
        }
    }
}
