package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class EdmAndSmsRequestIntervalExp {
    public static final EdmAndSmsRequestIntervalExp INSTANCE = new EdmAndSmsRequestIntervalExp();
    public static final long DEFAULT = 3600;

    public final long fetchInterval() {
        return C0C64.LJIILLIIL().LJIJJLI(31744, 3600L, "channel_auth_edm_sms_status_request_interval", false);
    }
}
