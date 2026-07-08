package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class UserSettingsUpdateBody {

    @C09CT("settings_patch")
    public IMUserSettings settings;

    public UserSettingsUpdateBody() {
        this(new IMUserSettings(null));
    }

    public UserSettingsUpdateBody(IMUserSettings iMUserSettings) {
        this.settings = iMUserSettings;
    }
}
