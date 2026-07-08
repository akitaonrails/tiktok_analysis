package com.ss.android.ugc.aweme.inbox.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes29.dex */
public final class Configuration {

    @C09CT("maxDisplayCount")
    public final int exposedCount;

    @C09CT("maxFansDivide")
    public final int maxFansDivide;

    @C09CT("maxRecordCount")
    public final int saveMaxCount;

    public Configuration() {
        this(3, 100, LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public Configuration(int i, int i2, int i3) {
        this.exposedCount = i;
        this.saveMaxCount = i2;
        this.maxFansDivide = i3;
    }
}
