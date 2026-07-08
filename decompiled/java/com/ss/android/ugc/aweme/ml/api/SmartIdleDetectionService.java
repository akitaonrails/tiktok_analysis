package com.ss.android.ugc.aweme.ml.api;

import X.C1510730pPr;
import X.C1510880pQ6;

/* JADX INFO: loaded from: classes24.dex */
public abstract class SmartIdleDetectionService implements ISmartIdleDetectionService {
    public static final C1510880pQ6 Companion = new Object() { // from class: X.0pQ6
    };

    public abstract /* synthetic */ boolean isRunning();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartIdleDetectionService
    public abstract /* synthetic */ void onUserInteraction();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartIdleDetectionService
    public abstract /* synthetic */ void start();

    public abstract /* synthetic */ void stop();

    public static final ISmartIdleDetectionService instance() {
        Companion.getClass();
        C1510730pPr.LIZ.getClass();
        return C1510730pPr.LIZIZ;
    }
}
