package com.ss.android.ugc.aweme.services;

import android.os.Handler;
import android.view.Choreographer;
import android.view.View;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes34.dex */
public interface BusinessModuleService {
    void addRunAfterTrtPlayMsg(Runnable runnable);

    boolean doAtTheEndOfMeasure(Choreographer choreographer, Runnable runnable);

    boolean getDelayGetAidReturnCacheOpt();

    boolean getDelayGetAidTaskOpt();

    IInitialChooseLanguageManager getInitialChooseLanguageManager();

    void getMainLooperOptServiceAndUpdateWatchMainFrame();

    void getMainLooperOptServiceAndUpdateWatchOriginalFocusMsg();

    void getMainLooperOptServiceAndUpdateWatchSpecificMsg(Handler handler, int i);

    void getMainLooperOptServiceAndUpdateWatchUIFrame();

    boolean isColdBootTabDelayEnabled();

    boolean isOriginalWindowFocusExecuted();

    void notifyFeedCacheCallback(Lock lock);

    void notifyLiveFullColdBootEnd();

    void notifyMallFullColdBootEnd();

    void notifyPDPFullColdBootEnd();

    void notifyTabDelayRunsIfNeeded();

    void resetWatchState();

    void setMainLooperOptServiceEnable(boolean z);

    void updateRootViewAndState(View view);
}
