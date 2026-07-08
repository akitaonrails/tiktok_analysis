package com.bytedance.push.frontier.setting;

import X.C786410Ut5;
import X.C810040Vq6;
import X.C810130VqF;
import X.C810170VqJ;
import X.C810250VqR;
import X.InterfaceC810050Vq7;
import X.InterfaceC810100VqC;
import X.InterfaceC810260VqS;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class FrontierLocalSetting$$SettingImpl implements FrontierLocalSetting {
    public final InterfaceC810050Vq7 LIZ;
    public final C810170VqJ LIZIZ = new InterfaceC810100VqC() { // from class: X.0VqJ
        @Override // X.InterfaceC810100VqC
        public final <T> T create(Class<T> cls) {
            if (cls == C810250VqR.class) {
                return (T) new Object() { // from class: X.0VqR
                };
            }
            return null;
        }
    };

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    public final long LIZIZ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("last_request_setting_time_mil")) {
            return 0L;
        }
        return this.LIZ.getLong("last_request_setting_time_mil");
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    public final C810130VqF LJIIIZ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("frontier_setting")) {
            C810040Vq6.LIZ(C810250VqR.class, this.LIZIZ).getClass();
            return new C810130VqF();
        }
        String string = this.LIZ.getString("frontier_setting");
        C810040Vq6.LIZ(C810250VqR.class, this.LIZIZ).getClass();
        C810130VqF c810130VqF = new C810130VqF();
        try {
            c810130VqF = C810130VqF.LIZIZ(new JSONObject(string));
            return c810130VqF;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return c810130VqF;
        }
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    public final void LJIJJ(C810130VqF c810130VqF) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            C810040Vq6.LIZ(C810250VqR.class, this.LIZIZ).getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aid", c810130VqF.LIZ);
                jSONObject.put("pid", c810130VqF.LIZIZ);
                jSONObject.put("app_key", c810130VqF.LIZJ);
                JSONArray jSONArray = new JSONArray();
                List<String> list = c810130VqF.LIZLLL;
                if (list != null) {
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next());
                    }
                }
                jSONObject.put("urls", jSONArray);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            editorEdit.putString("frontier_setting", C786410Ut5.J3(jSONObject));
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    public final void LJJIJ(long j) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putLong("last_request_setting_time_mil", j);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public final void unregisterValChanged(InterfaceC810260VqS interfaceC810260VqS) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            interfaceC810050Vq7.LIZIZ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VqJ] */
    public FrontierLocalSetting$$SettingImpl(Context context, InterfaceC810050Vq7 interfaceC810050Vq7) {
        this.LIZ = interfaceC810050Vq7;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public final void registerValChanged(Context context, String str, String str2, InterfaceC810260VqS interfaceC810260VqS) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            interfaceC810050Vq7.LIZ(context, str, str2);
        }
    }
}
