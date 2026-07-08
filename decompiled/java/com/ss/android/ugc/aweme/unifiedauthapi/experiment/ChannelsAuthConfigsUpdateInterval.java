package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class ChannelsAuthConfigsUpdateInterval {
    public static final ChannelsAuthConfigsUpdateInterval INSTANCE = new ChannelsAuthConfigsUpdateInterval();
    public static final long DEFAULT = 86400;

    public final long updateInterval() {
        return C0C64.LJIILLIIL().LJIJJLI(31744, 86400L, "channel_auth_config_request_interval", false);
    }
}
