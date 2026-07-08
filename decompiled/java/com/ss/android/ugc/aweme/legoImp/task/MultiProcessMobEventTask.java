package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C15O7;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiProcessMobEventTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MultiProcessMobEventTask";
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
        C15O7.LIZJ(new Callable() { // from class: X.08HE
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("MultiProcessMobEventTask@d065.run$1");
                C08HF.LIZ.getClass();
                try {
                    C01GW c01gw = C08HF.LIZIZ;
                    String string = ((Keva) c01gw.getValue()).getString("event_list", "[]");
                    ((Keva) c01gw.getValue()).storeString("event_list", "[]");
                    JSONArray jSONArray = new JSONArray(string);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                        String strOptString = jSONObject.optString("event_name");
                        if (strOptString != null && strOptString.length() != 0) {
                            jSONObject.remove("event_name");
                            C20684815ws.LJIJ(strOptString, jSONObject);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MultiProcessMobEventTask@d065.run$1");
                return unit;
            }
        });
    }
}
