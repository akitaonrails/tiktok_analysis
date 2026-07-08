package com.ss.android.ugc.aweme.services;

import android.app.Application;

/* JADX INFO: loaded from: classes5.dex */
public interface IAVInitializer {
    void initAVEnv(Application application);

    void initMonitor(Application application);

    void initialize(Application application);

    void initializeLite(Application application);

    void runAfterFeed(Application application);

    void updateAB();
}
