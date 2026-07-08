package com.ss.android.ugc.aweme.ml.ab;

import X.C01GW;
import X.C1511550pRB;
import X.C452501pT;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartLivePreviewStreamExperiment {
    public static final SmartLivePreviewStreamConfig DEFAULT_MODEL = null;
    public static final String SCENE = "smart_live_preview_pre_stream";
    public static final SmartLivePreviewStreamExperiment INSTANCE = new SmartLivePreviewStreamExperiment();
    public static final C01GW configHolder$delegate = C452501pT.LIZIZ(new C1511550pRB());

    private final SmartLivePreviewStreamConfig getConfigHolder() {
        return (SmartLivePreviewStreamConfig) configHolder$delegate.getValue();
    }

    public final SmartLivePreviewStreamConfig getConfig() {
        return getConfigHolder();
    }

    public final SmartLivePreviewStreamConfig getDEFAULT_MODEL() {
        return DEFAULT_MODEL;
    }
}
