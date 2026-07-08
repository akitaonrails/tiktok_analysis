package com.ss.android.ugc.gamora.recorder.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class PostToFriendsConfig {

    @C09CT("refactor_option")
    public final boolean refactorOption;

    @C09CT("show_privacy_dialog")
    public final boolean showPrivacyDialog;

    public PostToFriendsConfig() {
        this(false, false);
    }

    public PostToFriendsConfig(boolean z, boolean z2) {
        this.refactorOption = z;
        this.showPrivacyDialog = z2;
    }
}
