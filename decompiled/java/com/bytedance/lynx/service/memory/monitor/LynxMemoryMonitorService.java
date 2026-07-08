package com.bytedance.lynx.service.memory.monitor;

import X.C1289470jez;
import X.C1316430kMT;
import X.C1697810uHb;
import X.C786410Ut5;
import X.InterfaceC1316460kMW;
import X.InterfaceC1316470kMX;
import android.content.Context;
import com.bytedance.lynx.service.memory.monitor.LynxMemoryMonitorService;
import com.lynx.tasm.LynxEnv;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxMemoryMonitorService implements InterfaceC1316470kMX {
    public static final LynxMemoryMonitorService INSTANCE = new LynxMemoryMonitorService();
    public static final List<InterfaceC1316460kMW> reportTargetHandlers = C1697810uHb.LJIIJJI(new InterfaceC1316460kMW() { // from class: X.0kMA
        @Override // X.InterfaceC1316460kMW
        public final boolean LIZIZ() {
            return !C1316310kMH.LIZ.LIZ.isEmpty();
        }

        @Override // X.InterfaceC1316460kMW
        public final void LIZ(JSONObject jSONObject) {
            Iterator<InterfaceC1316340kMK> it2 = C1316310kMH.LIZ.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }

        @Override // X.InterfaceC1316460kMW
        public final JSONObject LIZJ(C1316430kMT c1316430kMT) {
            return LynxMemoryMonitorService.INSTANCE.formatDataForDevtool(c1316430kMT);
        }
    }, new InterfaceC1316460kMW() { // from class: X.0kMB
        @Override // X.InterfaceC1316460kMW
        public final boolean LIZIZ() {
            return LynxEnv.inst().enableImageMemoryReport();
        }

        @Override // X.InterfaceC1316460kMW
        public final void LIZ(JSONObject jSONObject) {
            AppLogNewUtils.onEventV3("lynx_allocate_memory", jSONObject);
        }

        @Override // X.InterfaceC1316460kMW
        public final JSONObject LIZJ(C1316430kMT c1316430kMT) {
            return LynxMemoryMonitorService.INSTANCE.formatDataForAppLog(c1316430kMT);
        }
    });

    public void dumpMemoryAllocationReport(boolean z, JSONObject jSONObject) {
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ void onInitialize(Context context) {
        C1289470jez.LIZ(this, context);
    }

    public void startTrackMemoryAllocation(Context context) {
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public Class getServiceClass() {
        return InterfaceC1316470kMX.class;
    }

    public final JSONObject formatDataForAppLog(C1316430kMT c1316430kMT) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        innerFormatData(c1316430kMT, jSONObject, jSONObject2, new JSONObject(), new JSONObject());
        jSONObject.put("image_info", C786410Ut5.J3(jSONObject2));
        jSONObject.put("res_url", c1316430kMT.LJIILJJIL);
        jSONObject.put("memory_cost", Float.valueOf(c1316430kMT.LJIIIIZZ));
        return jSONObject;
    }

    public final JSONObject formatDataForDevtool(C1316430kMT c1316430kMT) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        innerFormatData(c1316430kMT, jSONObject, jSONObject2, jSONObject3, jSONObject4);
        jSONObject.put("image_info", jSONObject2);
        jSONObject.put("metric", jSONObject3);
        jSONObject.put("timeMetrics", jSONObject4);
        jSONObject.put("res_url", c1316430kMT.LJIILJJIL);
        jSONObject.put("image_url", c1316430kMT.LJIILJJIL);
        jSONObject.put("memoryCost", Float.valueOf(c1316430kMT.LJIIIIZZ));
        jSONObject.put("is_memory", false);
        return jSONObject;
    }

    @Override // X.InterfaceC1316470kMX
    public void reportMemoryUsage(C1316430kMT c1316430kMT) {
        for (InterfaceC1316460kMW interfaceC1316460kMW : reportTargetHandlers) {
            if (interfaceC1316460kMW.LIZIZ()) {
                interfaceC1316460kMW.LIZ(interfaceC1316460kMW.LIZJ(c1316430kMT));
            }
        }
    }

    private final void innerFormatData(C1316430kMT c1316430kMT, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) throws JSONException {
        jSONObject.put("type", c1316430kMT.LJII);
        String str = c1316430kMT.LJ;
        if (str != null) {
            jSONObject.put("session_id", str);
        }
        jSONObject.put("timestamp", String.valueOf(c1316430kMT.LIZIZ));
        String str2 = c1316430kMT.LJFF;
        if (str2 != null) {
            jSONObject.put("phase", str2);
        }
        String str3 = c1316430kMT.LJI;
        if (str3 != null) {
            jSONObject.put("template_url", str3);
            jSONObject3.put("url", c1316430kMT.LJI);
        }
        jSONObject2.put("image_url", c1316430kMT.LJIILJJIL);
        jSONObject2.put("memoryCost", c1316430kMT.LJIIIIZZ);
        long j = c1316430kMT.LJIIIZ;
        long j2 = -1;
        if (j <= 0) {
            j = -1;
        }
        jSONObject3.put("viewWidth", j);
        long j3 = c1316430kMT.LJIIJ;
        if (j3 <= 0) {
            j3 = -1;
        }
        jSONObject3.put("viewHeight", j3);
        long j4 = c1316430kMT.LJIIJJI;
        if (j4 <= 0) {
            j4 = -1;
        }
        jSONObject3.put("width", j4);
        long j5 = c1316430kMT.LJIIL;
        if (j5 > 0) {
            j2 = j5;
        }
        jSONObject3.put("height", j2);
        String str4 = c1316430kMT.LJIILIIL;
        if (str4 != null) {
            jSONObject3.put("config", str4);
        }
        jSONObject3.put("flattenAnim", c1316430kMT.LJIILLIIL);
        jSONObject2.put("metric", jSONObject3);
        jSONObject2.put("successRate", c1316430kMT.LJIILL);
        jSONObject4.put("fetchTime", c1316430kMT.LIZ / 1000.0d);
        jSONObject4.put("completeTime", c1316430kMT.LIZJ / 1000.0d);
        jSONObject4.put("fetchTimeStamp", c1316430kMT.LIZLLL / 1000.0d);
        jSONObject4.put("finishTimeStamp", c1316430kMT.LIZIZ / 1000.0d);
        jSONObject2.put("timeMetrics", jSONObject4);
    }
}
