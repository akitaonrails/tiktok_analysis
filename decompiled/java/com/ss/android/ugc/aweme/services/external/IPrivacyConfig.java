package com.ss.android.ugc.aweme.services.external;

import com.ss.android.ugc.aweme.shortvideo.duet.CheckDuetReactPermissionResponse;

/* JADX INFO: loaded from: classes32.dex */
public interface IPrivacyConfig {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    CheckDuetReactPermissionResponse checkDuetReactPermission(String str, int i);
}
