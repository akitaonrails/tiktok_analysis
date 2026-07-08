package com.bytedance.push.settings;

import X.InterfaceC810050Vq7;
import X.InterfaceC810260VqS;
import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes14.dex */
public class LocalSettings$$SettingImpl implements LocalSettings {
    public final InterfaceC810050Vq7 LIZ;

    @Override // com.bytedance.push.settings.LocalSettings
    public final boolean LJI() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("push_notify_enable")) {
            return true;
        }
        return this.LIZ.getBoolean("push_notify_enable");
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final String LJIL() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        return (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("push_channels_json_array")) ? "" : this.LIZ.getString("push_channels_json_array");
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final void LJJ() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putString("push_daemon_monitor_result", "");
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final String LJJIJIIJI() {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        return (interfaceC810050Vq7 == null || !interfaceC810050Vq7.contains("push_daemon_monitor_result")) ? "" : this.LIZ.getString("push_daemon_monitor_result");
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final void LJ(boolean z) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putBoolean("allow_network", z);
            editorEdit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final void LJIILL(String str) {
        InterfaceC810050Vq7 interfaceC810050Vq7 = this.LIZ;
        if (interfaceC810050Vq7 != null) {
            SharedPreferences.Editor editorEdit = interfaceC810050Vq7.edit();
            editorEdit.putString("push_channels_json_array", str);
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

    public LocalSettings$$SettingImpl(Context context, InterfaceC810050Vq7 interfaceC810050Vq7) {
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
