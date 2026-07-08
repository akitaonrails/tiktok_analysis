package com.ss.android.ugc.aweme.dsp.experiment;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MusicDeeplinkSetting {

    @C09CT("enabled")
    public final boolean enabled = true;

    @C09CT("domains")
    public final List<String> domains = C1697810uHb.LJIIJJI("tiktokcdn.com", "tiktokcdn-us.com");

    public final List<String> getDomains() {
        return this.domains;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
