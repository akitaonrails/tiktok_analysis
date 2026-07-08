package com.ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
public final class PermissionJsbSupportSaExp {
    public static final PermissionJsbSupportSaExp INSTANCE = new PermissionJsbSupportSaExp();
    public static final boolean DEFAULT_GROUP = true;

    public final boolean getValue() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("permission_jsb_support_sa", true);
    }

    public final boolean getDEFAULT_GROUP() {
        return DEFAULT_GROUP;
    }
}
