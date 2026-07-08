package com.ss.android.ugc.aweme.ml.api;

import X.C1510870pQ5;
import X.C1510980pQG;

/* JADX INFO: loaded from: classes24.dex */
public abstract class PitayaFeatureCenterService implements IPitayaFeatureCenterService {
    public static final C1510870pQ5 Companion = new Object() { // from class: X.0pQ5
    };

    @Override // com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService
    public abstract /* synthetic */ void checkAndInit();

    @Override // com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService
    public abstract /* synthetic */ void onSlideSpeedUpdate(Float f, Float f2, Float f3);

    public static final IPitayaFeatureCenterService instance() {
        Companion.getClass();
        return C1510980pQG.LIZ;
    }
}
