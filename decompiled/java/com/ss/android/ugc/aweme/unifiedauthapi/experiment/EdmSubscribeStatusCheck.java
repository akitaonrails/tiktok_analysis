package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class EdmSubscribeStatusCheck {
    public static final boolean DEFAULT = false;
    public static final EdmSubscribeStatusCheck INSTANCE = new EdmSubscribeStatusCheck();
    public static final boolean DISABLE = true;

    public final boolean disable() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "channel_auth_disable_edm_subscribe_check", false, false);
    }
}
