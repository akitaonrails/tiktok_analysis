package com.ss.android.ugc.aweme.services;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class NewPublishServiceLock {
    public static final NewPublishServiceLock INSTANCE = new NewPublishServiceLock();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "replace_get_publish_service_instance_lock", true, true);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
