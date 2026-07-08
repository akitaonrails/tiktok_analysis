package com.lynx.tasm.performance;

import X.C1285920jZG;
import X.C1289620jfE;
import X.C1309900kBw;
import X.C1310000kC6;
import X.C1310120kCI;
import X.C1310170kCN;
import X.C1310750kDJ;
import X.C1310800kDO;
import X.C1C7U;
import X.C2188811AlT;
import X.EnumC1299430jv3;
import X.InterfaceC1310470kCr;
import X.InterfaceC1310480kCs;
import X.InterfaceC1310680kDC;
import Y.ARunnableS1S2100100_20;
import Y.ARunnableS7S0300100_20;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.eventreport.LynxEventReporter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class PerformanceController implements InterfaceC1310680kDC {
    public static volatile boolean LJIIIZ;
    public static volatile EnumC1299430jv3 LJIIJ = EnumC1299430jv3.UNSET;
    public static volatile long LJIIJJI = -1;
    public C1310000kC6 LIZ;
    public volatile long LIZIZ;
    public WeakReference<InterfaceC1310470kCr> LIZJ;
    public WeakReference<InterfaceC1310480kCs> LIZLLL;
    public boolean LJ;
    public JavaOnlyMap LJFF;
    public JavaOnlyArray LJI = new JavaOnlyArray();
    public int LJII = -1;
    public C1309900kBw LJIIIIZZ = null;

    private native void nativeAllocateMemory(long j, String str, long j2, String str2, String str3);

    public static native long nativeCurrentSystemTimeMicroseconds();

    private native void nativeDeallocateMemory(long j, String str, long j2, String str2, String str3);

    public static native boolean nativeIsMemoryMonitorEnabled();

    private native void nativeSetFSPTimingInfo(long j, long j2, Map<String, String> map);

    private native void nativeSetPaintEndTimingAndHostPlatformTiming(long j, long j2, JavaOnlyMap javaOnlyMap, JavaOnlyArray javaOnlyArray);

    private native void nativeSetTiming(long j, String str, long j2, String str2);

    private native void nativeUpdateMemoryUsage(long j, String str, long j2, int i, Map<String, String> map);

    @Override // X.InterfaceC1310680kDC
    public final void LIZIZ() {
        if (!this.LJ) {
            if (!C1289620jfE.LIZIZ() || this.LJI.isEmpty()) {
                return;
            }
            long jLJIIIZ = LJIIIZ();
            LJIIL(jLJIIIZ, "Timing::Mark", "paintEnd");
            JavaOnlyMap javaOnlyMap = this.LJFF;
            this.LJFF = null;
            JavaOnlyArray javaOnlyArray = this.LJI;
            this.LJI = new JavaOnlyArray();
            LJIILJJIL(new ARunnableS7S0300100_20(this, jLJIIIZ, javaOnlyMap, javaOnlyArray, 0));
            return;
        }
        if (this.LIZ == null) {
            C1310000kC6 c1310000kC6 = new C1310000kC6();
            this.LIZ = c1310000kC6;
            c1310000kC6.LJ = this.LIZJ;
        }
        if (!this.LIZ.LIZLLL || (!r2.LIZIZ.isEmpty())) {
            long jLJIIIZ2 = LJIIIZ();
            LJIIJJI(jLJIIIZ2, "Timing::Mark", "paintEnd", "");
            this.LIZ.LIZ(jLJIIIZ2, "paintEnd");
        }
    }

    public static long LJIIIZ() {
        if (!LJIIIZ) {
            LJIIIZ = LynxEnv.inst().isNativeLibraryLoaded();
        }
        if (LJIIIZ) {
            return nativeCurrentSystemTimeMicroseconds();
        }
        LynxLog.e("PerformanceController", "Failed to call currentSystemTimeMicroseconds to obtain the timestamp.");
        return 0L;
    }

    public static boolean LJIIJ() {
        EnumC1299430jv3 enumC1299430jv3;
        EnumC1299430jv3 enumC1299430jv32;
        if (!LJIIIZ) {
            LJIIIZ = LynxEnv.inst().isNativeLibraryLoaded();
        }
        if (!LJIIIZ || (enumC1299430jv3 = LJIIJ) == (enumC1299430jv32 = EnumC1299430jv3.FALSE)) {
            return false;
        }
        if (enumC1299430jv3 != EnumC1299430jv3.UNSET) {
            return true;
        }
        boolean zNativeIsMemoryMonitorEnabled = nativeIsMemoryMonitorEnabled();
        if (zNativeIsMemoryMonitorEnabled) {
            enumC1299430jv32 = EnumC1299430jv3.TRUE;
        }
        LJIIJ = enumC1299430jv32;
        return zNativeIsMemoryMonitorEnabled;
    }

    @Override // X.InterfaceC1310680kDC
    public final JavaOnlyArray LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1310680kDC
    public final void LIZ(String str) {
        if (!this.LJ && C1289620jfE.LIZIZ() && !this.LJI.isEmpty()) {
            if (this.LJFF != null) {
                if (str.endsWith("Start") && this.LJFF.containsKey(str)) {
                    return;
                }
            } else {
                this.LJFF = new JavaOnlyMap();
            }
            long jLJIIIZ = LJIIIZ();
            LJIIL(jLJIIIZ, "Timing::MarkHostPlatformTiming", str);
            this.LJFF.put(str, Long.valueOf(jLJIIIZ));
        }
    }

    public final void LJIILJJIL(Runnable runnable) {
        if (this.LJ) {
            return;
        }
        LynxEventReporter.runOnReportThread(runnable);
    }

    public void onPerformanceEvent(ReadableMap readableMap) {
        InterfaceC1310480kCs interfaceC1310480kCs;
        if (this.LJ) {
            return;
        }
        InterfaceC1310470kCr interfaceC1310470kCr = this.LIZJ.get();
        C1310800kDO c1310800kDOLJ = C1310750kDJ.LJ(readableMap);
        if (interfaceC1310470kCr != null) {
            interfaceC1310470kCr.onPerformanceEvent(c1310800kDOLJ);
        }
        WeakReference<InterfaceC1310480kCs> weakReference = this.LIZLLL;
        if (weakReference != null) {
            interfaceC1310480kCs = weakReference.get();
            if (interfaceC1310480kCs == null) {
                return;
            }
        } else {
            interfaceC1310480kCs = (InterfaceC1310470kCr) C1285920jZG.LIZJ().LIZ(InterfaceC1310480kCs.class);
            if (interfaceC1310480kCs == null) {
                return;
            } else {
                this.LIZLLL = new WeakReference<>(interfaceC1310480kCs);
            }
        }
        int i = readableMap.getInt("instanceId", -1);
        if (i != -1) {
            HashMap<String, Object> genericInfoWithExtraParams = LynxEventReporter.getGenericInfoWithExtraParams(Integer.valueOf(i));
            genericInfoWithExtraParams.putAll(readableMap.asHashMap());
            interfaceC1310480kCs.onPerformanceEvent(C1310750kDJ.LJ(JavaOnlyMap.from(genericInfoWithExtraParams)));
        }
    }

    public void setNativePtr(long j) {
        if (this.LJ) {
            return;
        }
        this.LIZIZ = j;
    }

    public static /* synthetic */ void LIZLLL(PerformanceController performanceController, Map map) {
        performanceController.getClass();
        C1C7U.LIZ("PerformanceController@f44b.updateMemoryUsage$2L");
        if (performanceController.LIZIZ == 0) {
            C1C7U.LIZIZ("PerformanceController@f44b.updateMemoryUsage$2L");
            return;
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            C1310120kCI c1310120kCI = (C1310120kCI) ((Map.Entry) it2.next()).getValue();
            if (c1310120kCI != null) {
                performanceController.nativeUpdateMemoryUsage(performanceController.LIZIZ, c1310120kCI.LIZ, c1310120kCI.LIZIZ, c1310120kCI.LIZJ, c1310120kCI.LIZLLL);
            }
        }
        C1C7U.LIZIZ("PerformanceController@f44b.updateMemoryUsage$2L");
    }

    public static /* synthetic */ void LJFF(PerformanceController performanceController, C1310170kCN c1310170kCN) {
        performanceController.getClass();
        C1C7U.LIZ("PerformanceController@f44b.setExtraTiming$1L");
        if (performanceController.LIZIZ == 0) {
            C1C7U.LIZIZ("PerformanceController@f44b.setExtraTiming$1L");
            return;
        }
        if (c1310170kCN.LIZ > 0) {
            performanceController.nativeSetTiming(performanceController.LIZIZ, "openTime", c1310170kCN.LIZ * 1000, null);
        }
        if (c1310170kCN.LIZIZ > 0) {
            performanceController.nativeSetTiming(performanceController.LIZIZ, "containerInitStart", c1310170kCN.LIZIZ * 1000, null);
        }
        if (c1310170kCN.LIZJ > 0) {
            performanceController.nativeSetTiming(performanceController.LIZIZ, "containerInitEnd", c1310170kCN.LIZJ * 1000, null);
        }
        if (c1310170kCN.LIZLLL > 0) {
            performanceController.nativeSetTiming(performanceController.LIZIZ, "prepareTemplateStart", c1310170kCN.LIZLLL * 1000, null);
        }
        if (c1310170kCN.LJ > 0) {
            performanceController.nativeSetTiming(performanceController.LIZIZ, "prepareTemplateEnd", c1310170kCN.LJ * 1000, null);
        }
        C1C7U.LIZIZ("PerformanceController@f44b.setExtraTiming$1L");
    }

    public final void LJIILIIL(String str, String str2) {
        long jLJIIIZ = LJIIIZ();
        LJIIJJI(jLJIIIZ, "Timing::Mark", str, str2);
        if (this.LJ) {
            if (this.LIZ == null) {
                C1310000kC6 c1310000kC6 = new C1310000kC6();
                this.LIZ = c1310000kC6;
                c1310000kC6.LJ = this.LIZJ;
            }
            this.LIZ.LIZ(jLJIIIZ, str);
            return;
        }
        LJIILJJIL(new ARunnableS1S2100100_20(this, str, jLJIIIZ, str2, 2));
    }

    public static /* synthetic */ void LJIIIIZZ(PerformanceController performanceController, long j, Map map) {
        performanceController.getClass();
        C1C7U.LIZ("PerformanceController@f44b.setFSPTimingInfo$1L");
        if (performanceController.LIZIZ == 0) {
            C1C7U.LIZIZ("PerformanceController@f44b.setFSPTimingInfo$1L");
        } else {
            performanceController.nativeSetFSPTimingInfo(performanceController.LIZIZ, j, map);
            C1C7U.LIZIZ("PerformanceController@f44b.setFSPTimingInfo$1L");
        }
    }

    public final void LJIIL(long j, String str, String str2) {
        if (TraceController.isTracingStarted()) {
            Iterator<Object> it2 = this.LJI.iterator();
            while (it2.hasNext()) {
                LJIIJJI(j, str, str2, (String) it2.next());
            }
        }
    }

    public static /* synthetic */ void LJ(PerformanceController performanceController, String str, long j, String str2) {
        performanceController.getClass();
        C1C7U.LIZ("PerformanceController@f44b.setMsTiming$1L");
        if (performanceController.LIZIZ == 0) {
            C1C7U.LIZIZ("PerformanceController@f44b.setMsTiming$1L");
        } else {
            performanceController.nativeSetTiming(performanceController.LIZIZ, str, j * 1000, str2);
            C1C7U.LIZIZ("PerformanceController@f44b.setMsTiming$1L");
        }
    }

    public static /* synthetic */ void LJI(PerformanceController performanceController, String str, long j, String str2) {
        performanceController.getClass();
        C1C7U.LIZ("PerformanceController@f44b.markTiming$1L");
        if (performanceController.LIZIZ == 0) {
            C1C7U.LIZIZ("PerformanceController@f44b.markTiming$1L");
        } else {
            performanceController.nativeSetTiming(performanceController.LIZIZ, str, j, str2);
            C1C7U.LIZIZ("PerformanceController@f44b.markTiming$1L");
        }
    }

    public static /* synthetic */ void LJII(PerformanceController performanceController, long j, JavaOnlyMap javaOnlyMap, JavaOnlyArray javaOnlyArray) {
        performanceController.getClass();
        C1C7U.LIZ("PerformanceController@f44b.markPaintEndTimingIfNeeded$1L");
        if (performanceController.LIZIZ == 0) {
            C1C7U.LIZIZ("PerformanceController@f44b.markPaintEndTimingIfNeeded$1L");
        } else {
            performanceController.nativeSetPaintEndTimingAndHostPlatformTiming(performanceController.LIZIZ, j, javaOnlyMap, javaOnlyArray);
            C1C7U.LIZIZ("PerformanceController@f44b.markPaintEndTimingIfNeeded$1L");
        }
    }

    public final void LJIIJJI(long j, String str, String str2, String str3) {
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("timing_key", str2);
            map.put("timestamp", String.valueOf(j));
            map.put("pipeline_id", str3);
            map.put("instance_id", String.valueOf(this.LJII));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(e3.d);
            sbLIZ.append(str2);
            TraceEvent.LJIIL(0L, C2188811AlT.LIZIZ(sbLIZ), map);
        }
    }
}
