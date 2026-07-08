package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes22.dex */
public final class AudioAsrConfig {

    @C09CT("delay")
    public final int delay;

    @C09CT("retry_count")
    public final int retryCount;

    @C09CT("retry_delay")
    public final int retryDelay;

    public AudioAsrConfig() {
        this(LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT, 3);
    }

    public AudioAsrConfig(int i, int i2, int i3) {
        this.delay = i;
        this.retryDelay = i2;
        this.retryCount = i3;
    }
}
