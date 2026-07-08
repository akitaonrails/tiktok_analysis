package com.ss.android.ugc.aweme.legoImp.task;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class DlpSettingsModel {

    @C09CT("analyser")
    public final int analyser;

    @C09CT("breached_threshold")
    public final double breachedThreshold;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("pack_size")
    public final int packSize;

    @C09CT("sample_rate")
    public final double sampleRate;

    public DlpSettingsModel() {
        this(false, 5.0E-5d, 1, 0.9d, 1);
    }

    public DlpSettingsModel(boolean z, double d, int i, double d2, int i2) {
        this.enabled = z;
        this.sampleRate = d;
        this.analyser = i;
        this.breachedThreshold = d2;
        this.packSize = i2;
    }
}
