package com.ss.android.ugc.aweme.ml.api;

import X.C1509310pNZ;
import X.C1512160pSA;
import X.C1512180pSC;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;

/* JADX INFO: loaded from: classes24.dex */
public abstract class SmartDataTrackerService implements ISmartDataTrackerService {
    public static final C1512180pSC Companion = new Object() { // from class: X.0pSC
    };
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public abstract /* synthetic */ void checkAndInit();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public abstract /* synthetic */ void configOneNewTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public abstract /* synthetic */ boolean enable(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public abstract /* synthetic */ void onScenePredictCheckOrRun(String str, C1509310pNZ c1509310pNZ);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public abstract /* synthetic */ void onSceneRealCheckAndReport(String str, C1509310pNZ c1509310pNZ);

    public abstract /* synthetic */ void putExtData(String str, String str2, String str3, Object obj);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartDataTrackerService instance() {
        Companion.getClass();
        return C1512160pSA.LIZ;
    }
}
