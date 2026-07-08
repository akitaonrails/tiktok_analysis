package com.bytedance.apm.agent.v2.instrumentation;

import X.C2188811AlT;
import X.C792400V6o;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ClickAgent {
    public static void onClick(View view) {
        CharSequence text;
        if (view == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Resources resources = view.getContext().getResources();
            if (view.getId() != -1) {
                jSONObject.put("view_id", view.getId());
                jSONObject.put("view_name", resources.getResourceEntryName(view.getId()));
            }
            if ((view instanceof TextView) && (text = ((TextView) view).getText()) != null) {
                String string = text.toString();
                if (string.length() > 100) {
                    string = string.substring(0, 100);
                }
                jSONObject.put("view_text", string);
            }
            if (view.getParent() != null) {
                String simpleName = view.getParent().getClass().getSimpleName();
                if (view.getParent().getParent() != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(view.getParent().getParent().getClass().getSimpleName());
                    sbLIZ.append("#");
                    sbLIZ.append(simpleName);
                    sbLIZ.append("#");
                    sbLIZ.append(view.getClass().getSimpleName());
                    simpleName = C2188811AlT.LIZIZ(sbLIZ);
                }
                jSONObject.put("view_path", simpleName);
            }
            jSONObject.put("click_type", "View#OnClick");
            MonitorTool.monitorUIAction("view_click", "", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C792400V6o.LJIIIIZZ();
        }
    }

    public static void onTabChanged(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("view_name", str);
            jSONObject.put("click_type", "TabHost#OnTabChanged");
            MonitorTool.monitorUIAction("view_click", "", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
