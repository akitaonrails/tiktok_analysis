package com.bytedance.push.settings;

import X.C808830Vo9;
import X.C810040Vq6;
import X.C810070Vq9;
import X.C810220VqO;
import X.InterfaceC810050Vq7;
import X.InterfaceC810100VqC;
import X.InterfaceC810260VqS;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class LocalFrequencySettings$$SettingImpl implements LocalFrequencySettings {
    public final InterfaceC810050Vq7 LIZ;
    public final C810070Vq9 LIZIZ = new InterfaceC810100VqC() { // from class: X.0Vq9
        @Override // X.InterfaceC810100VqC
        public final <T> T create(Class<T> cls) {
            if (cls == C810220VqO.class) {
                return (T) new Object() { // from class: X.0VqO
                };
            }
            return null;
        }
    };

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String LIZJ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        return (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("last_update_sender_vc")) ? "" : this.LIZ.getString("last_update_sender_vc");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final long LJIIIIZZ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("last_upload_switch_ts")) {
            return 0L;
        }
        return this.LIZ.getLong("last_upload_switch_ts");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String LJIIJ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        return (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("last_update_sender_supported")) ? "" : this.LIZ.getString("last_update_sender_supported");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String LJIILIIL() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        return (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("last_update_sender_did")) ? "" : this.LIZ.getString("last_update_sender_did");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final int LJIILLIIL() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("sys_switcher_stat")) {
            return -2;
        }
        return this.LIZ.getInt("sys_switcher_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final boolean LJIJ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("last_send_switcher_stat")) {
            return false;
        }
        return this.LIZ.getBoolean("last_send_switcher_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final long LJJIFFI() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("last_update_sender_time_mil")) {
            return 0L;
        }
        return this.LIZ.getLong("last_update_sender_time_mil");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String LJJII() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        return (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("notify_channel_stat")) ? "" : this.LIZ.getString("notify_channel_stat");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C808830Vo9> LJJIII() {
        /*
            r11 = this;
            X.0Vq7 r0 = r11.LIZ
            if (r0 == 0) goto L6d
            java.lang.String r1 = "token_cache"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L6d
            X.0Vq7 r0 = r11.LIZ
            java.lang.String r4 = r0.getString(r1)
            java.lang.Class<X.0VqO> r1 = X.C810220VqO.class
            X.0Vq9 r0 = r11.LIZIZ
            java.lang.Object r0 = X.C810040Vq6.LIZ(r1, r0)
            r0.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: org.json.JSONException -> L68
            r3.<init>(r4)     // Catch: org.json.JSONException -> L68
            r1 = 0
        L29:
            int r0 = r3.length()     // Catch: org.json.JSONException -> L68
            if (r1 >= r0) goto L7d
            org.json.JSONObject r4 = r3.optJSONObject(r1)     // Catch: org.json.JSONException -> L68
            if (r4 == 0) goto L5f
            java.lang.String r0 = "type"
            int r5 = r4.optInt(r0)     // Catch: org.json.JSONException -> L68
            java.lang.String r0 = "token"
            java.lang.String r6 = r4.optString(r0)     // Catch: org.json.JSONException -> L68
            java.lang.String r0 = "did"
            java.lang.String r7 = r4.optString(r0)     // Catch: org.json.JSONException -> L68
            java.lang.String r0 = "vc"
            java.lang.String r10 = r4.optString(r0)     // Catch: org.json.JSONException -> L68
            java.lang.String r0 = "t"
            long r8 = r4.optLong(r0)     // Catch: org.json.JSONException -> L68
            if (r5 <= 0) goto L5f
            X.0Vo9 r4 = new X.0Vo9     // Catch: org.json.JSONException -> L68
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: org.json.JSONException -> L68
            goto L60
        L5f:
            r4 = 0
        L60:
            if (r4 == 0) goto L65
            r2.add(r4)     // Catch: org.json.JSONException -> L68
        L65:
            int r1 = r1 + 1
            goto L29
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r2
        L6d:
            java.lang.Class<X.0VqO> r1 = X.C810220VqO.class
            X.0Vq9 r0 = r11.LIZIZ
            java.lang.Object r0 = X.C810040Vq6.LIZ(r1, r0)
            r0.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.settings.LocalFrequencySettings$$SettingImpl.LJJIII():java.util.List");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final int LJJIIJ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("google_service_stat")) {
            return -2;
        }
        return this.LIZ.getInt("google_service_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String LJJIIZ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        return (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("last_update_sender_gray_vc")) ? "" : this.LIZ.getString("last_update_sender_gray_vc");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String LJJIIZI() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        return (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("last_update_sender_channel")) ? "" : this.LIZ.getString("last_update_sender_channel");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LIZ(String str) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putString("last_update_sender_vc", str);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LIZLLL(long j) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putLong("last_upload_switch_ts", j);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJFF(long j) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putLong("last_update_sender_time_mil", j);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJII(String str) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putString("notify_channel_stat", str);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJIILJJIL(String str) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putString("last_update_sender_supported", str);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJIIZILJ(String str) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putString("last_update_sender_did", str);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJIJI(List<C808830Vo9> list) {
        JSONObject jSONObject;
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            C810040Vq6.LIZ(C810220VqO.class, this.LIZIZ).getClass();
            JSONArray jSONArray = new JSONArray();
            for (C808830Vo9 c808830Vo9 : (ArrayList) list) {
                if (c808830Vo9 != null) {
                    if (c808830Vo9.LJ <= 0) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put("type", c808830Vo9.LJ);
                            jSONObject.put("token", c808830Vo9.LIZLLL);
                            jSONObject.put("did", c808830Vo9.LIZIZ);
                            jSONObject.put("vc", c808830Vo9.LIZJ);
                            jSONObject.put("t", c808830Vo9.LIZ);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    jSONArray.put(jSONObject);
                }
            }
            editorEdit.putString("token_cache", jSONArray.toString());
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJIJJLI(boolean z) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putBoolean("last_send_switcher_stat", z);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJJI(String str) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putString("last_update_sender_channel", str);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJJIIJZLJL(int i) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putInt("google_service_stat", i);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJJIJIIJIL(int i) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putInt("sys_switcher_stat", i);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJJIJIL(String str) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putString("last_update_sender_gray_vc", str);
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

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Vq9] */
    public LocalFrequencySettings$$SettingImpl(Context context, InterfaceC810050Vq7 interfaceC810050Vq7) {
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
