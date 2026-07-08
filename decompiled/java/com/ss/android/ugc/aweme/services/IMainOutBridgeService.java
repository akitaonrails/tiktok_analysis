package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public interface IMainOutBridgeService {
    Class<? extends Activity> getSplashActivityClass();

    void setLanguageDialogShowState(Context context, boolean z);
}
