package com.bytedance.push.settings;

import X.C2664011i;
import X.InterfaceC810050Vq7;
import X.InterfaceC810260VqS;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AliveOnlineSettings$$SettingImpl implements AliveOnlineSettings {
    public final InterfaceC810050Vq7 LIZ;

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void LJ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putBoolean("allow_push_job_service", false);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void LJIJI() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putBoolean("allow_push_daemon_monitor", false);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void LJJI() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putBoolean("is_close_alarm_wakeup", true);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void LJJIFFI() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putBoolean("is_notify_service_stick", false);
            editorEdit.apply();
        }
    }

    public AliveOnlineSettings$$SettingImpl(InterfaceC810050Vq7 interfaceC810050Vq7) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.LIZ = interfaceC810050Vq7;
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void LIZ(boolean z) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putBoolean("allow_off_alive", z);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void LJIIZILJ(String str) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putString("uninstall_question_url", str);
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
            if (jSONObject.has("ttpush_i18n_allow_off_alive")) {
                editorEdit.putBoolean("allow_off_alive", C2664011i.LIZ("ttpush_i18n_allow_off_alive", jSONObject));
            }
            if (jSONObject.has("ttpush_uninstall_question_url")) {
                editorEdit.putString("uninstall_question_url", jSONObject.optString("ttpush_uninstall_question_url"));
            }
            if (jSONObject.has("ttpush_allow_push_job_service")) {
                editorEdit.putBoolean("allow_push_job_service", C2664011i.LIZ("ttpush_allow_push_job_service", jSONObject));
            }
            if (jSONObject.has("ttpush_i18n_allow_push_daemon_monitor")) {
                editorEdit.putBoolean("allow_push_daemon_monitor", C2664011i.LIZ("ttpush_i18n_allow_push_daemon_monitor", jSONObject));
            }
            if (jSONObject.has("ttpush_allow_close_boot_receiver")) {
                editorEdit.putBoolean("allow_close_boot_receiver", C2664011i.LIZ("ttpush_allow_close_boot_receiver", jSONObject));
            }
            if (jSONObject.has("ttpush_is_close_alarm_wakeup")) {
                editorEdit.putBoolean("is_close_alarm_wakeup", C2664011i.LIZ("ttpush_is_close_alarm_wakeup", jSONObject));
            }
            if (jSONObject.has("ttpush_use_start_foreground_notification")) {
                editorEdit.putBoolean("is_use_start_foreground_notification", C2664011i.LIZ("ttpush_use_start_foreground_notification", jSONObject));
            }
            if (jSONObject.has("ttpush_job_schedule_wake_up_interval_second")) {
                editorEdit.putInt("job_schedule_wake_up_interval_second", jSONObject.optInt("ttpush_job_schedule_wake_up_interval_second"));
            }
            if (jSONObject.has("ttpush_is_use_c_native_process_keep_alive")) {
                editorEdit.putBoolean("is_use_c_native_process_keep_alive", C2664011i.LIZ("ttpush_is_use_c_native_process_keep_alive", jSONObject));
            }
            if (jSONObject.has("ttpush_is_notify_service_stick")) {
                editorEdit.putBoolean("is_notify_service_stick", C2664011i.LIZ("ttpush_is_notify_service_stick", jSONObject));
            }
            if (jSONObject.has("ttpush_key_is_miui_close_daemon")) {
                editorEdit.putBoolean("key_is_miui_close_daemon", C2664011i.LIZ("ttpush_key_is_miui_close_daemon", jSONObject));
            }
            if (jSONObject.has("ttpush_alv_white_list")) {
                editorEdit.putString("ttpush_alv_white_list", jSONObject.optString("ttpush_alv_white_list"));
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
