package com.ss.android.ugc.aweme.socialavatar.saas.mixstudio;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes7.dex */
public final class DuoRemixConfig {
    public static final DuoRemixConfig INSTANCE = new DuoRemixConfig();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final boolean f79default = true;

    public final boolean getEnable() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("enable_duo_remix", true);
    }
}
