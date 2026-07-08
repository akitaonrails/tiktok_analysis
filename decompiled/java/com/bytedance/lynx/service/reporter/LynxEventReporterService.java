package com.bytedance.lynx.service.reporter;

import X.C1289470jez;
import X.C1310800kDO;
import X.C1310860kDU;
import X.C1310900kDY;
import X.C1522030pi5;
import X.C2188811AlT;
import X.InterfaceC1310480kCs;
import X.InterfaceC1310880kDW;
import android.content.Context;
import com.lynx.tasm.base.TraceEvent;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxEventReporterService implements InterfaceC1310480kCs {
    public static final LynxEventReporterService INSTANCE = new LynxEventReporterService();
    public static C1310860kDU defaultProcessor;
    public static C1522030pi5 lynxServiceConfig;
    public static List<InterfaceC1310880kDW> processorList;

    static {
        ArrayList arrayList = new ArrayList();
        processorList = arrayList;
        defaultProcessor = new C1310860kDU();
        arrayList.add(new InterfaceC1310880kDW() { // from class: X.0kDK
            public HashMap<String, Object> LIZ;

            @Override // X.InterfaceC1310880kDW
            public final void onInitialize(Context context) {
            }

            @Override // X.InterfaceC1310880kDW
            public final boolean LIZ(C1310800kDO c1310800kDO) {
                if (c1310800kDO.LIZJ) {
                    if (Intrinsics.LJFF(c1310800kDO.LIZIZ, "pipeline") || Intrinsics.LJFF(c1310800kDO.LIZIZ, "metric")) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC1310880kDW
            public final Map<String, Object> LIZIZ(C1310800kDO c1310800kDO) {
                Number number;
                Number number2;
                Number number3;
                Number number4;
                Object obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = c1310800kDO.LIZIZ;
                if (Intrinsics.LJFF(str, "pipeline")) {
                    String str2 = c1310800kDO.LIZ;
                    int iHashCode = str2.hashCode();
                    if (iHashCode == -701686520 ? str2.equals("loadBundle") : iHashCode == 521646652 ? str2.equals("reloadBundleFromNative") : !(iHashCode != 1904924252 || !str2.equals("reloadBundleFromBts"))) {
                        this.LIZ = c1310800kDO.LIZLLL;
                    }
                    linkedHashMap = new LinkedHashMap();
                    Number number5 = null;
                    linkedHashMap.putAll(C294801Cg.LIZJ(null, c1310800kDO.LIZLLL));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    HashMap<String, Object> map = c1310800kDO.LIZLLL;
                    Object obj2 = map.get("mtsRenderStart");
                    if (obj2 instanceof Number) {
                        number = (Number) obj2;
                    } else {
                        number = null;
                    }
                    Object obj3 = map.get("pipelineStart");
                    if (obj3 instanceof Number) {
                        number2 = (Number) obj3;
                    } else {
                        number2 = null;
                    }
                    Object obj4 = map.get("layoutUiOperationExecuteEnd");
                    if (obj4 instanceof Number) {
                        number3 = (Number) obj4;
                    } else {
                        number3 = null;
                    }
                    Object obj5 = map.get("paintEnd");
                    if (obj5 instanceof Number) {
                        number4 = (Number) obj5;
                    } else {
                        number4 = null;
                    }
                    HashMap<String, Object> map2 = this.LIZ;
                    if (map2 != null) {
                        obj = map2.get("paintEnd");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof Number) {
                        number5 = (Number) obj;
                    }
                    linkedHashMap2.put("updateWaiting", C294801Cg.LIZ(number5, number2));
                    linkedHashMap2.put("paintWaiting", C294801Cg.LIZ(number3, number4));
                    linkedHashMap2.put("triggerWaiting", C294801Cg.LIZ(number2, number));
                    Object obj6 = map.get("paintEnd");
                    if (obj6 != null) {
                        linkedHashMap2.put("paintEnd", obj6);
                        linkedHashMap.putAll(linkedHashMap2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                    }
                } else if (Intrinsics.LJFF(str, "metric")) {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : c1310800kDO.LIZLLL.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (key != null && (value instanceof HashMap)) {
                            Map map3 = (Map) value;
                            Object obj7 = map3.get("duration");
                            if (obj7 != null) {
                                linkedHashMap.put(key, obj7);
                            }
                            Object obj8 = map3.get("startTimestampName");
                            if (obj8 != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(key);
                                sbLIZ.append("StartTimestampName");
                                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ), obj8);
                            }
                            Object obj9 = map3.get("endTimestampName");
                            if (obj9 != null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(key);
                                sbLIZ2.append("EndTimestampName");
                                linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ2), obj9);
                            }
                        } else {
                            linkedHashMap.put(key, value);
                        }
                    }
                }
                return linkedHashMap;
            }
        });
        processorList.add(new C1310900kDY());
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public Class getServiceClass() {
        return InterfaceC1310480kCs.class;
    }

    public final JSONObject convertBooleanToInt(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof Boolean) {
                jSONObject2.put(next, ((Boolean) obj).booleanValue() ? 1 : 0);
            } else {
                jSONObject2.put(next, obj);
            }
        }
        return jSONObject2;
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public void onInitialize(Context context) {
        C1289470jez.LIZ(this, context);
        Iterator<InterfaceC1310880kDW> it2 = processorList.iterator();
        while (it2.hasNext()) {
            it2.next().onInitialize(context);
        }
    }

    @Override // X.InterfaceC1310470kCr
    public void onPerformanceEvent(C1310800kDO c1310800kDO) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynxsdk_performance_entry_");
        sbLIZ.append(c1310800kDO.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z = false;
        for (InterfaceC1310880kDW interfaceC1310880kDW : processorList) {
            if (interfaceC1310880kDW.LIZ(c1310800kDO)) {
                Map<String, Object> mapLIZIZ = interfaceC1310880kDW.LIZIZ(c1310800kDO);
                if (mapLIZIZ != null) {
                    AppLogNewUtils.onEventV3(strLIZIZ, INSTANCE.convertBooleanToInt(new JSONObject(mapLIZIZ)));
                }
                z = true;
            }
        }
        if (z || !defaultProcessor.LIZ(c1310800kDO)) {
            return;
        }
        AppLogNewUtils.onEventV3(strLIZIZ, INSTANCE.convertBooleanToInt(new JSONObject(defaultProcessor.LIZIZ(c1310800kDO))));
    }

    @Override // X.InterfaceC1182204js
    public void onReportEvent(String str, int i, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        TraceEvent.LIZIZ("LynxEventReporterServiceProxy.onReportEvent");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        linkedHashMap.putAll(map);
        AppLogNewUtils.onEventV3(str, convertBooleanToInt(new JSONObject(linkedHashMap)));
        TraceEvent.LJII("LynxEventReporterServiceProxy.onReportEvent");
    }
}
