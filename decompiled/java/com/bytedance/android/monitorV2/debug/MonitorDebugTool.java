package com.bytedance.android.monitorV2.debug;

import X.C086I;
import X.C0VCZ;
import X.C0VSJ;
import X.C1520320pfK;
import X.C1520380pfQ;
import X.C1520960pgM;
import X.C1521730phb;
import X.C2160408dG;
import X.C786410Ut5;
import X.C824310WVh;
import X.InterfaceC1520330pfL;
import Y.ARunnableS123S0100000_23;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class MonitorDebugTool {
    public static boolean _debuggable;
    public static boolean _immediateReport;
    public static boolean _isSampleOff;
    public static boolean _onlineValidation;
    public static boolean _skipInjectAclCheck;
    public static final MonitorDebugTool INSTANCE = new MonitorDebugTool();
    public static final LinkedList<JSONObject> latestEventQueue = new LinkedList<>();

    public static final void clearLatestEvents() {
        latestEventQueue.clear();
    }

    public static final JSONArray getLatestEvents() {
        JSONArray jSONArray = new JSONArray();
        Iterator<JSONObject> it2 = latestEventQueue.iterator();
        while (it2.hasNext()) {
            try {
                jSONArray.put(it2.next());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1520960pgM.LIZ("startup_handle", e);
            }
        }
        return jSONArray;
    }

    private final void startFileWriter() {
        C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
        C1520320pfK c1520320pfK = new InterfaceC1520330pfL() { // from class: X.0pfK
            /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[Catch: all -> 0x00d8, TryCatch #0 {all -> 0x00d8, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x001d, B:12:0x0035, B:14:0x003b, B:16:0x0041, B:18:0x0047, B:33:0x00d2, B:19:0x0079, B:21:0x007f, B:23:0x0087, B:27:0x0090, B:29:0x0096, B:31:0x009e, B:32:0x00a4), top: B:38:0x0000 }] */
            @Override // X.InterfaceC1520330pfL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.lang.String r10, org.json.JSONObject r11) {
                /*
                    Method dump skipped, instruction units count: 229
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1520320pfK.LIZ(java.lang.String, org.json.JSONObject):void");
            }
        };
        c1520380pfQ.getClass();
        if (C1520380pfQ.LJFF == null) {
            C1520380pfQ.LJFF = new CopyOnWriteArrayList();
        }
        List<InterfaceC1520330pfL> list = C1520380pfQ.LJFF;
        if (list != null) {
            ((CopyOnWriteArrayList) list).add(c1520320pfK);
        }
    }

    public static final List<JSONObject> getQueue() {
        return latestEventQueue;
    }

    public static final boolean isApmInstantEventOn() {
        return _immediateReport;
    }

    public static final boolean isDebuggable() {
        return _debuggable;
    }

    public static final boolean isSampleOff() {
        return _isSampleOff;
    }

    public static final boolean skipWhiteListInjectCheck() {
        return _skipInjectAclCheck;
    }

    public static final void initMonitorDebugTool(Context context) {
        C824310WVh.LIZ(new ARunnableS123S0100000_23(context, 8));
    }

    public static final void setDebuggable(boolean z) {
        _debuggable = z;
        C1521730phb.LIZIZ = z;
    }

    public final File getDebugFileFlag(Context context) {
        return new C0VSJ(C2160408dG.LIZ(context, "monitor_data_switch"), "is_debug");
    }

    public final File getLogWriterFileFlag(Context context) {
        return new C0VSJ(C2160408dG.LIZ(context, "monitor_data_switch"), "is_output_file");
    }

    public final void startFileWriterWhenFlagExisted(Context context) {
        if (getDebugFileFlag(context).exists()) {
            startFileWriter();
        }
    }

    public static final void initSDKMonitor(Context context, HybridSettingInitConfig hybridSettingInitConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", hybridSettingInitConfig.LJ);
            jSONObject.put("host_aid", hybridSettingInitConfig.LIZ);
            jSONObject.put("sdk_version", "1.0-tiktok-monorepo");
            jSONObject.put("channel", hybridSettingInitConfig.LJFF);
            jSONObject.put("app_version", hybridSettingInitConfig.LJI);
            jSONObject.put("update_version_code", hybridSettingInitConfig.LJII);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1520960pgM.LIZ("startup_handle", e);
        }
        if (C086I.LIZIZ(hybridSettingInitConfig.LJIIJJI)) {
            hybridSettingInitConfig.LJIIJJI = Collections.singletonList("https://mon.isnssdk.com/monitor/appmonitor/v2/settings");
        }
        List<String> list = hybridSettingInitConfig.LJIIJJI;
        if (list != null) {
            if (C086I.LIZIZ(list)) {
                hybridSettingInitConfig.LJIIJJI = Collections.singletonList("https://mon.isnssdk.com/monitor/appmonitor/v2/settings");
            }
            SDKMonitorUtils.setConfigUrl("8560", hybridSettingInitConfig.LJIIJJI);
        }
        if (hybridSettingInitConfig.LIZ() != null) {
            SDKMonitorUtils.setDefaultReportUrl("8560", hybridSettingInitConfig.LIZ());
        }
        SDKMonitorUtils.initMonitor(C786410Ut5.N3(context), "8560", jSONObject, new C0VCZ() { // from class: X.0pfW
            @Override // X.C0VCZ
            public final /* bridge */ /* synthetic */ Map getCommonParams() {
                return null;
            }

            @Override // X.C0VCZ
            public final /* bridge */ /* synthetic */ String getSessionId() {
                return null;
            }
        });
    }

    public static final void pushLatestEvent(String str, JSONObject jSONObject) throws JSONException {
        if (!_debuggable) {
            return;
        }
        LinkedList<JSONObject> linkedList = latestEventQueue;
        if (linkedList.size() >= 99) {
            linkedList.removeFirst();
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("eventName", str);
        jSONObject2.putOpt("time", Long.valueOf(System.currentTimeMillis()));
        jSONObject2.putOpt("params", jSONObject);
        linkedList.addLast(jSONObject2);
    }

    public static final void updateSwitchState(Context context, SharedPreferences sharedPreferences) {
        _immediateReport = sharedPreferences.getBoolean("monitor_immediate_switch", false);
        _onlineValidation = sharedPreferences.getBoolean("monitor_validation_switch", false);
        _isSampleOff = sharedPreferences.getBoolean("monitor_hdt_ignore_sample", false);
        _skipInjectAclCheck = sharedPreferences.getBoolean("monitor_skip_inject_check", false);
        _debuggable = INSTANCE.getLogWriterFileFlag(context).exists();
    }
}
