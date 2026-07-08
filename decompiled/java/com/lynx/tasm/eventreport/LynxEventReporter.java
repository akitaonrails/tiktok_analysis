package com.lynx.tasm.eventreport;

import X.C1285920jZG;
import X.C1311040kDm;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1182204js;
import X.InterfaceC1289180jeW;
import X.InterfaceC1310480kCs;
import Y.ARunnableS0S0002000_20;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS4S1101000_20;
import Y.ARunnableS6S0001000_20;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class LynxEventReporter {
    public HashMap<Integer, HashMap<String, Object>> mAllExtraParams;
    public HashMap<Integer, HashMap<String, Object>> mAllGenericInfos;
    public InterfaceC1182204js mEventReporterService;
    public volatile boolean mIsNativeLibraryLoaded;
    public final CopyOnWriteArrayList<InterfaceC1182204js> mObserverList;

    private native void nativeRunOnReportThread(Object obj, long j);

    private void setupEventReporterServiceIfNeeded() {
        if (this.mEventReporterService != null) {
            return;
        }
        InterfaceC1182204js interfaceC1182204js = (InterfaceC1182204js) C1285920jZG.LIZJ().LIZ(InterfaceC1310480kCs.class);
        this.mEventReporterService = interfaceC1182204js;
        if (interfaceC1182204js == null) {
            LynxLog.e("LynxEventReporter", "eventReporter service not found or event name is null.");
        } else {
            addObserverInternal(interfaceC1182204js);
        }
    }

    public LynxEventReporter() {
        this.mObserverList = new CopyOnWriteArrayList<>();
        this.mIsNativeLibraryLoaded = false;
        this.mAllGenericInfos = new HashMap<>();
        this.mAllExtraParams = new HashMap<>();
    }

    public static LynxEventReporter getInstance() {
        return C1311040kDm.LIZ;
    }

    public static void addObserver(InterfaceC1182204js interfaceC1182204js) {
        getInstance().addObserverInternal(interfaceC1182204js);
    }

    private void addObserverInternal(InterfaceC1182204js interfaceC1182204js) {
        if (interfaceC1182204js != null && !this.mObserverList.contains(interfaceC1182204js)) {
            this.mObserverList.add(interfaceC1182204js);
        }
    }

    public static void callRunnable(Object obj) {
        Object obj2;
        if (obj instanceof Runnable) {
            ((Runnable) obj).run();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runnable[");
        if (obj == null) {
            obj2 = "null";
        } else {
            obj2 = obj.getClass();
        }
        sbLIZ.append(obj2);
        sbLIZ.append("] must be an instance of Runnable.");
        LynxLog.e("LynxEventReporter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void clearCache(int i) {
        if (i < 0) {
            return;
        }
        delayRunOnReportThread(new ARunnableS6S0001000_20(i, 2), Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public static HashMap<String, Object> getGenericInfoInternal(Integer num) {
        HashMap<String, Object> map = getInstance().mAllGenericInfos.get(num);
        if (map == null) {
            HashMap<String, Object> map2 = new HashMap<>();
            map2.put("lynx_sdk_version", LynxEnv.inst().getLynxVersion());
            getInstance().mAllGenericInfos.put(num, map2);
            return map2;
        }
        return map;
    }

    public static HashMap<String, Object> getGenericInfoWithExtraParams(Integer num) {
        HashMap<String, Object> map = new HashMap<>();
        if (num.intValue() < 0) {
            return map;
        }
        HashMap<String, Object> map2 = getInstance().mAllExtraParams.get(num);
        if (map2 != null) {
            map.putAll(map2);
        }
        HashMap<String, Object> genericInfoInternal = getGenericInfoInternal(num);
        if (genericInfoInternal != null) {
            map.putAll(genericInfoInternal);
        }
        return map;
    }

    public static /* synthetic */ void lambda$clearCache$7(int i) {
        C1C7U.LIZ("LynxEventReporter@23cd.clearCache$1L");
        LynxEventReporter lynxEventReporter = getInstance();
        lynxEventReporter.mAllGenericInfos.remove(Integer.valueOf(i));
        lynxEventReporter.mAllExtraParams.remove(Integer.valueOf(i));
        C1C7U.LIZIZ("LynxEventReporter@23cd.clearCache$1L");
    }

    public static /* synthetic */ void lambda$removeGenericInfo$4(int i) {
        C1C7U.LIZ("LynxEventReporter@23cd.removeGenericInfo$1L");
        TraceEvent.LIZIZ("LynxEventReporter::removeGenericInfo");
        getInstance().mAllGenericInfos.remove(Integer.valueOf(i));
        TraceEvent.LJII("LynxEventReporter::removeGenericInfo");
        C1C7U.LIZIZ("LynxEventReporter@23cd.removeGenericInfo$1L");
    }

    public static void removeGenericInfo(int i) {
        if (i < 0) {
            return;
        }
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("instance_id", String.valueOf(i));
            TraceEvent.LIZJ("LynxEventReporter::removeGenericInfo", map);
        }
        runOnReportThread(new ARunnableS6S0001000_20(i, 1));
        TraceEvent.LJII("LynxEventReporter::removeGenericInfo");
    }

    public static void removeObserver(InterfaceC1182204js interfaceC1182204js) {
        getInstance().removeObserverInternal(interfaceC1182204js);
    }

    private void removeObserverInternal(InterfaceC1182204js interfaceC1182204js) {
        if (interfaceC1182204js != null) {
            this.mObserverList.remove(interfaceC1182204js);
        }
    }

    public static void runOnReportThread(Runnable runnable) {
        if (!getInstance().mIsNativeLibraryLoaded) {
            getInstance().mIsNativeLibraryLoaded = LynxEnv.inst().isNativeLibraryLoaded();
        }
        if (getInstance().mIsNativeLibraryLoaded) {
            getInstance().nativeRunOnReportThread(runnable, 0L);
        }
    }

    public static void delayRunOnReportThread(Runnable runnable, long j) {
        if (!getInstance().mIsNativeLibraryLoaded) {
            getInstance().mIsNativeLibraryLoaded = LynxEnv.inst().isNativeLibraryLoaded();
        }
        if (getInstance().mIsNativeLibraryLoaded) {
            getInstance().nativeRunOnReportThread(runnable, j);
        }
    }

    public static /* synthetic */ void lambda$moveExtraParams$6(int i, int i2) {
        C1C7U.LIZ("LynxEventReporter@23cd.moveExtraParams$1L");
        LynxEventReporter lynxEventReporter = getInstance();
        HashMap<String, Object> map = lynxEventReporter.mAllExtraParams.get(Integer.valueOf(i));
        if (map != null) {
            HashMap<String, Object> map2 = lynxEventReporter.mAllExtraParams.get(Integer.valueOf(i2));
            if (map2 != null) {
                map2.putAll(map);
            } else {
                lynxEventReporter.mAllExtraParams.put(Integer.valueOf(i2), map);
            }
            lynxEventReporter.mAllExtraParams.remove(Integer.valueOf(i));
        }
        C1C7U.LIZIZ("LynxEventReporter@23cd.moveExtraParams$1L");
    }

    public static /* synthetic */ void lambda$putExtraParams$5(int i, Map map) {
        C1C7U.LIZ("LynxEventReporter@23cd.putExtraParams$1L");
        LynxEventReporter lynxEventReporter = getInstance();
        HashMap<String, Object> map2 = lynxEventReporter.mAllExtraParams.get(Integer.valueOf(i));
        if (map2 == null) {
            lynxEventReporter.mAllExtraParams.put(Integer.valueOf(i), new HashMap<>(map));
        } else {
            map2.putAll(map);
        }
        C1C7U.LIZIZ("LynxEventReporter@23cd.putExtraParams$1L");
    }

    public static /* synthetic */ void lambda$updateGenericInfo$3(int i, Map map) {
        C1C7U.LIZ("LynxEventReporter@23cd.updateGenericInfo$2L");
        TraceEvent.LIZIZ("LynxEventReporter::updateGenericInfo");
        getGenericInfoInternal(Integer.valueOf(i)).putAll(map);
        TraceEvent.LJII("LynxEventReporter::updateGenericInfo");
        C1C7U.LIZIZ("LynxEventReporter@23cd.updateGenericInfo$2L");
    }

    public static void moveExtraParams(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            runOnReportThread(new ARunnableS0S0002000_20(i, i2, 0));
        }
    }

    public static void putExtraParams(Map<String, Object> map, int i) {
        if (map != null && i >= 0) {
            runOnReportThread(new ARunnableS31S0101000_20(i, map, 14));
        }
    }

    public static void updateGenericInfo(Map<String, Object> map, int i) {
        if (map != null && !map.isEmpty() && i >= 0) {
            if (TraceController.isTracingStarted()) {
                HashMap map2 = new HashMap();
                map2.put("instance_id", String.valueOf(i));
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    map2.put(entry.getKey(), entry.getValue().toString());
                }
                TraceEvent.LIZJ("LynxEventReporter::updateGenericInfo", map2);
            }
            runOnReportThread(new ARunnableS31S0101000_20(i, map, 13));
            TraceEvent.LJII("LynxEventReporter::updateGenericInfo");
        }
    }

    public static void updateGenericInfo(int i, ReadableMap readableMap) {
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("instance_id", String.valueOf(i));
            TraceEvent.LIZJ("LynxEventReporter::updateGenericInfo", map);
        }
        getGenericInfoInternal(Integer.valueOf(i)).putAll(readableMap.asHashMap());
        TraceEvent.LJII("LynxEventReporter::updateGenericInfo");
    }

    private void handleEvent(int i, String str, Map<String, Object> map) {
        Map<String, ? extends Object> mapUnmodifiableMap;
        if (TraceController.isTracingStarted()) {
            HashMap map2 = new HashMap();
            map2.put("instance_id", String.valueOf(i));
            map2.put("event_name", str);
            TraceEvent.LIZJ("LynxEventReporter::handleEvent", map2);
        }
        if (str == null) {
            LynxLog.e("LynxEventReporter", "event name is null.");
            TraceEvent.LJII("LynxEventReporter::handleEvent");
            return;
        }
        HashMap map3 = new HashMap();
        HashMap<String, Object> map4 = this.mAllGenericInfos.get(Integer.valueOf(i));
        if (map4 != null) {
            map3.putAll(map4);
        }
        if (map != null) {
            map3.putAll(map);
        }
        Map<String, ? extends Object> mapUnmodifiableMap2 = Collections.unmodifiableMap(map3);
        HashMap<String, Object> map5 = this.mAllExtraParams.get(Integer.valueOf(i));
        if (map5 != null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(map5);
        } else {
            mapUnmodifiableMap = null;
        }
        setupEventReporterServiceIfNeeded();
        Iterator<InterfaceC1182204js> it2 = this.mObserverList.iterator();
        while (it2.hasNext()) {
            it2.next().onReportEvent(str, i, mapUnmodifiableMap2, mapUnmodifiableMap);
        }
        TraceEvent.LJII("LynxEventReporter::handleEvent");
    }

    public static /* synthetic */ void lambda$onEvent$0(int i, String str, Map map) {
        C1C7U.LIZ("LynxEventReporter@23cd.onEvent$1L");
        getInstance().handleEvent(i, str, map);
        C1C7U.LIZIZ("LynxEventReporter@23cd.onEvent$1L");
    }

    public static /* synthetic */ void lambda$onEvent$1(InterfaceC1289180jeW interfaceC1289180jeW, int i, String str) {
        Map<String, Object> mapBuild;
        C1C7U.LIZ("LynxEventReporter@23cd.onEvent$2L");
        if (interfaceC1289180jeW != null) {
            mapBuild = interfaceC1289180jeW.build();
        } else {
            mapBuild = null;
        }
        if (i < 0 && mapBuild == null) {
            C1C7U.LIZIZ("LynxEventReporter@23cd.onEvent$2L");
        } else {
            getInstance().handleEvent(i, str, mapBuild);
            C1C7U.LIZIZ("LynxEventReporter@23cd.onEvent$2L");
        }
    }

    public static /* synthetic */ void lambda$updateGenericInfo$2(int i, String str, Object obj) {
        C1C7U.LIZ("LynxEventReporter@23cd.updateGenericInfo$1L");
        TraceEvent.LIZIZ("LynxEventReporter::updateGenericInfo");
        getGenericInfoInternal(Integer.valueOf(i)).put(str, obj);
        TraceEvent.LJII("LynxEventReporter::updateGenericInfo");
        C1C7U.LIZIZ("LynxEventReporter@23cd.updateGenericInfo$1L");
    }

    public static void onEvent(String str, int i, InterfaceC1289180jeW interfaceC1289180jeW) {
        if (str != null) {
            if (i < 0 && interfaceC1289180jeW == null) {
                return;
            }
            if (TraceController.isTracingStarted()) {
                HashMap map = new HashMap();
                map.put("event_name", str);
                map.put("instance_id", String.valueOf(i));
                TraceEvent.LIZJ("LynxEventReporter::OnEvent", map);
            }
            runOnReportThread(new ARunnableS4S1101000_20(i, str, interfaceC1289180jeW, 5));
            TraceEvent.LJII("LynxEventReporter::OnEvent");
        }
    }

    public static void updateGenericInfo(String str, Object obj, int i) {
        if (str != null && obj != null && i >= 0) {
            if (TraceController.isTracingStarted()) {
                HashMap map = new HashMap();
                map.put("key", str);
                map.put("instance_id", String.valueOf(i));
                map.put("value", obj.toString());
                TraceEvent.LIZJ("LynxEventReporter::updateGenericInfo", map);
            }
            runOnReportThread(new ARunnableS4S1101000_20(i, str, obj, 4));
            TraceEvent.LJII("LynxEventReporter::updateGenericInfo");
        }
    }

    public static void onEvent(String str, Map<String, Object> map, int i) {
        if (str != null) {
            if (i < 0 && map == null) {
                return;
            }
            if (TraceController.isTracingStarted()) {
                HashMap map2 = new HashMap();
                map2.put("event_name", str);
                map2.put("instance_id", String.valueOf(i));
                TraceEvent.LIZJ("LynxEventReporter::OnEvent", map2);
            }
            runOnReportThread(new ARunnableS4S1101000_20(i, str, map, 6));
            TraceEvent.LJII("LynxEventReporter::OnEvent");
        }
    }

    public static void onEvent(int i, String str, ReadableMap readableMap) {
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("instance_id", String.valueOf(i));
            map.put("event_name", str);
            TraceEvent.LIZJ("LynxEventReporter::OnEvent", map);
        }
        getInstance().handleEvent(i, str, readableMap.asHashMap());
        TraceEvent.LJII("LynxEventReporter::OnEvent");
    }
}
