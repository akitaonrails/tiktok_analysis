package com.bytedance.apm.agent.instrumentation;

import X.C2188811AlT;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ClickInstrumentation {
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
            if (view.getTag(-16777215) != null && !TextUtils.isEmpty(view.getTag(-16777215).toString())) {
                jSONObject.put("view_tag_1", view.getTag(-16777215).toString());
            }
            if (view.getTag(-16777214) != null && !TextUtils.isEmpty(view.getTag(-16777214).toString())) {
                jSONObject.put("view_tag_2", view.getTag(-16777214).toString());
            }
            if (view.getTag(-16777213) != null && (view.getTag(-16777213) instanceof Map)) {
                for (Map.Entry entry : ((Map) view.getTag(-16777213)).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("view_tag_map_");
                    sbLIZ2.append(key.toString());
                    jSONObject.put(C2188811AlT.LIZIZ(sbLIZ2), value.toString());
                }
            }
            jSONObject.put("click_type", "View#OnClick");
            MonitorTool.monitorUIAction("view_click", "", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
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
