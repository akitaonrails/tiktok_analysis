package com.ss.android.ugc.aweme.pipo.hybrid.settings;

import X.C09CT;
import com.ss.android.ugc.aweme.pipo.hybrid.retention.PipoRetentionPopupConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoContainerRetentionPopupConfig {

    @C09CT("configs")
    public final Map<String, PipoRetentionPopupConfig> configs;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("freq_control")
    public final PipoRetentionFreqControl freqControl;

    public PipoContainerRetentionPopupConfig() {
        this(false, null, null);
    }

    public PipoContainerRetentionPopupConfig(boolean z, Map<String, PipoRetentionPopupConfig> map, PipoRetentionFreqControl pipoRetentionFreqControl) {
        this.enable = z;
        this.configs = map;
        this.freqControl = pipoRetentionFreqControl;
    }
}
