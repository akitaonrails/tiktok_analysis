package com.bytedance.apm.agent.helper;

import X.C788700Uwm;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.agent.v2.InstructOperationSwitch;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class PageShowCallback {
    public static void onPageShowHideAction(Object obj, boolean z) {
        String name;
        String str;
        if (!InstructOperationSwitch.sUiSwitch) {
            return;
        }
        if (obj instanceof String) {
            name = (String) obj;
        } else {
            name = obj.getClass().getName();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (obj instanceof IPageMonitor) {
                jSONObject.put("label", ((IPageMonitor) obj).getMonitorLabel());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (z) {
            str = "page_show";
            C788700Uwm.LIZ.LIZIZ().getClass();
        } else {
            str = "page_hide";
        }
        MonitorTool.monitorUIAction(str, name, jSONObject);
    }
}
