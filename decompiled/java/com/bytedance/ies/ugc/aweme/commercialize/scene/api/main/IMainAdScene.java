package com.bytedance.ies.ugc.aweme.commercialize.scene.api.main;

import X.AbstractC1017400caA;
import X.InterfaceC1022320ci6;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes25.dex */
public interface IMainAdScene extends InterfaceC1022320ci6 {
    void checkSplashAdsForColdStart(Intent intent);

    @Override // X.InterfaceC1022320ci6
    /* synthetic */ void init(AbstractC1017400caA abstractC1017400caA);

    void onCreate();

    void onDestroy();

    void onPause();

    void onResume();

    void onVideoPageChangeEvent(Aweme aweme, boolean z);
}
