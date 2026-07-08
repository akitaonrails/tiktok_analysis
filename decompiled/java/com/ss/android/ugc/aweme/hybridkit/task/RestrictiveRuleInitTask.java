package com.ss.android.ugc.aweme.hybridkit.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C822610WOt;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC822620WOu;
import android.content.Context;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class RestrictiveRuleInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "RestrictiveRuleInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        List<InterfaceC822620WOu> list = C822610WOt.LIZ;
        C822610WOt.LIZ.add(new InterfaceC822620WOu() { // from class: X.0WVi
            @Override // X.InterfaceC822620WOu
            public final void LIZ(C824330WVj c824330WVj) throws JSONException {
                C1520360pfO c1520360pfO = new C1520360pfO("hybrid_monitor_restrictive_rule");
                c1520360pfO.LIZIZ = "restrictive_rule";
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ruleId", c824330WVj.LIZ);
                jSONObject.put("url", c824330WVj.LIZIZ);
                c1520360pfO.LIZLLL = jSONObject;
                c1520360pfO.LIZ = c824330WVj.LIZIZ;
                c1520360pfO.LIZIZ(0);
                WebViewMonitorHelper.getInstance().customReport(null, c1520360pfO.LIZ());
            }
        });
    }
}
