package com.bytedance.push.settings;

import X.C0VS2;
import X.C2664011i;
import X.C810040Vq6;
import X.C810080VqA;
import X.C810230VqP;
import X.InterfaceC810050Vq7;
import X.InterfaceC810100VqC;
import X.InterfaceC810260VqS;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class PushOnlineSettings$$SettingImpl implements PushOnlineSettings {
    public final InterfaceC810050Vq7 LIZ;
    public final C810080VqA LIZIZ;

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean LJFF() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("need_control_miui_flares_v2")) {
            return true;
        }
        return this.LIZ.getBoolean("need_control_miui_flares_v2");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean LJI() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("allow_settings_notify_enable")) {
            return true;
        }
        return this.LIZ.getBoolean("allow_settings_notify_enable");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final long LJIIIIZZ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("ttpush_update_sender_interval")) {
            return 10800000L;
        }
        return this.LIZ.getLong("ttpush_update_sender_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean LJIIIZ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("is_receiver_message_wakeup_screen")) {
            return false;
        }
        return this.LIZ.getBoolean("is_receiver_message_wakeup_screen");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final long LJIIJ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("ttpush_upload_switch_interval")) {
            return 86400000L;
        }
        return this.LIZ.getLong("ttpush_upload_switch_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final int LJIIJJI() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("receiver_message_wakeup_screen_time")) {
            return 5000;
        }
        return this.LIZ.getInt("receiver_message_wakeup_screen_time");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean LJIIL() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("ttpush_shut_push_on_stop_service")) {
            return false;
        }
        return this.LIZ.getBoolean("ttpush_shut_push_on_stop_service");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean LJIILIIL() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("remove_auto_boot_v2")) {
            return false;
        }
        return this.LIZ.getBoolean("remove_auto_boot_v2");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final C0VS2 LJIILJJIL() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("un_duplicate_message_settings")) {
            C810040Vq6.LIZ(C810230VqP.class, this.LIZIZ).getClass();
            return new C0VS2();
        }
        String string = this.LIZ.getString("un_duplicate_message_settings");
        C810040Vq6.LIZ(C810230VqP.class, this.LIZIZ).getClass();
        C0VS2 c0vs2 = new C0VS2();
        try {
            JSONObject jSONObject = new JSONObject(string);
            c0vs2.LIZ = jSONObject.optBoolean("enable_un_duplicate_message");
            c0vs2.LIZIZ = jSONObject.optInt("max_cache_message", 200);
            c0vs2.LIZJ = jSONObject.optLong("max_cache_time_in_hour", 24L);
            return c0vs2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return c0vs2;
        }
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final int LJIILL() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("frontier_strategy")) {
            return 0;
        }
        return this.LIZ.getInt("frontier_strategy");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean LJIILLIIL() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("ttpush_enable_restrict_update_token")) {
            return false;
        }
        return this.LIZ.getBoolean("ttpush_enable_restrict_update_token");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final int LJIJ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("remove_appcloud_update_action")) {
            return 1;
        }
        return this.LIZ.getInt("remove_appcloud_update_action");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final long LJIJJ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("frontier_update_setting_interval")) {
            return 10080L;
        }
        return this.LIZ.getLong("frontier_update_setting_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final int LJIJJLI() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("ttpush_forbid_alias")) {
            return 0;
        }
        return this.LIZ.getInt("ttpush_forbid_alias");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final long LJIL() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("ttpush_update_token_interval")) {
            return 86400000L;
        }
        return this.LIZ.getLong("ttpush_update_token_interval");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0VqA] */
    public PushOnlineSettings$$SettingImpl(InterfaceC810050Vq7 interfaceC810050Vq7) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.LIZIZ = new InterfaceC810100VqC() { // from class: X.0VqA
            @Override // X.InterfaceC810100VqC
            public final <T> T create(Class<T> cls) {
                if (cls == C810230VqP.class) {
                    return (T) new Object() { // from class: X.0VqP
                    };
                }
                return null;
            }
        };
        this.LIZ = interfaceC810050Vq7;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final void LJII(boolean z) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putBoolean("ttpush_shut_push_on_stop_service", z);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final void LJJ(boolean z) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putBoolean("allow_settings_notify_enable", z);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public final void unregisterValChanged(InterfaceC810260VqS interfaceC810260VqS) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            interfaceC810050Vq7.LIZIZ();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public final void updateSettings(Context context, JSONObject jSONObject) {
        InterfaceC810050Vq7 interfaceC810050Vq7;
        if (jSONObject != null && (interfaceC810050Vq7 = this.LIZ) != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            if (jSONObject.has("ttpush_allow_settings_notify_enable")) {
                editorEdit.putBoolean("allow_settings_notify_enable", C2664011i.LIZ("ttpush_allow_settings_notify_enable", jSONObject));
            }
            if (jSONObject.has("ttpush_update_sender_interval")) {
                editorEdit.putLong("ttpush_update_sender_interval", jSONObject.optLong("ttpush_update_sender_interval"));
            }
            if (jSONObject.has("ttpush_update_token_interval")) {
                editorEdit.putLong("ttpush_update_token_interval", jSONObject.optLong("ttpush_update_token_interval"));
            }
            if (jSONObject.has("ttpush_enable_restrict_update_token")) {
                editorEdit.putBoolean("ttpush_enable_restrict_update_token", C2664011i.LIZ("ttpush_enable_restrict_update_token", jSONObject));
            }
            if (jSONObject.has("ttpush_shut_push_on_stop_service")) {
                editorEdit.putBoolean("ttpush_shut_push_on_stop_service", C2664011i.LIZ("ttpush_shut_push_on_stop_service", jSONObject));
            }
            if (jSONObject.has("ttpush_is_receiver_message_wakeup_screen")) {
                editorEdit.putBoolean("is_receiver_message_wakeup_screen", C2664011i.LIZ("ttpush_is_receiver_message_wakeup_screen", jSONObject));
            }
            if (jSONObject.has("ttpush_receiver_message_wakeup_screen_time")) {
                editorEdit.putInt("receiver_message_wakeup_screen_time", jSONObject.optInt("ttpush_receiver_message_wakeup_screen_time"));
            }
            if (jSONObject.has("ttpush_upload_switch_interval")) {
                editorEdit.putLong("ttpush_upload_switch_interval", jSONObject.optLong("ttpush_upload_switch_interval"));
            }
            if (jSONObject.has("ttpush_forbid_alias")) {
                editorEdit.putInt("ttpush_forbid_alias", jSONObject.optInt("ttpush_forbid_alias"));
            }
            if (jSONObject.has("need_control_miui_flares_v2")) {
                editorEdit.putBoolean("need_control_miui_flares_v2", C2664011i.LIZ("need_control_miui_flares_v2", jSONObject));
            }
            if (jSONObject.has("remove_auto_boot_v2")) {
                editorEdit.putBoolean("remove_auto_boot_v2", C2664011i.LIZ("remove_auto_boot_v2", jSONObject));
            }
            if (jSONObject.has("remove_umeng_autoboot")) {
                editorEdit.putBoolean("remove_umeng_autoboot", C2664011i.LIZ("remove_umeng_autoboot", jSONObject));
            }
            if (jSONObject.has("frontier_update_setting_interval")) {
                editorEdit.putLong("frontier_update_setting_interval", jSONObject.optLong("frontier_update_setting_interval"));
            }
            if (jSONObject.has("frontier_strategy")) {
                editorEdit.putInt("frontier_strategy", jSONObject.optInt("frontier_strategy"));
            }
            if (jSONObject.has("remove_appcloud_update_action")) {
                editorEdit.putInt("remove_appcloud_update_action", jSONObject.optInt("remove_appcloud_update_action"));
            }
            if (jSONObject.has("un_duplicate_message_settings")) {
                editorEdit.putString("un_duplicate_message_settings", jSONObject.optString("un_duplicate_message_settings"));
            }
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public final void registerValChanged(Context context, String str, String str2, InterfaceC810260VqS interfaceC810260VqS) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            interfaceC810050Vq7.LIZ(context, str, str2);
        }
    }
}
