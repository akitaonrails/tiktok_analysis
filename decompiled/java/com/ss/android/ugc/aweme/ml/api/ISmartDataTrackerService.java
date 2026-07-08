package com.ss.android.ugc.aweme.ml.api;

import X.C1509310pNZ;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;

/* JADX INFO: loaded from: classes24.dex */
public interface ISmartDataTrackerService {
    void checkAndInit();

    void configOneNewTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig);

    boolean enable(String str);

    void onScenePredictCheckOrRun(String str, C1509310pNZ c1509310pNZ);

    void onSceneRealCheckAndReport(String str, C1509310pNZ c1509310pNZ);
}
