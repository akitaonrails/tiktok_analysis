package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class ChannelsAuthSkipNewUserFilter {
    public static final boolean DEFAULT = false;
    public static final ChannelsAuthSkipNewUserFilter INSTANCE = new ChannelsAuthSkipNewUserFilter();
    public static final boolean SKIP = true;

    public final boolean skip() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "channel_auth_skip_new_user_filter", false, false);
    }
}
