package com.sun.jna;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
public final class JnaAabFixSettings {
    public static final JnaAabFixSettings INSTANCE = new JnaAabFixSettings();
    public static final boolean DEFAULT_GROUP = true;

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static final boolean isOpen() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("jna_aab_fix", true);
    }

    public final boolean getDEFAULT_GROUP() {
        return DEFAULT_GROUP;
    }
}
