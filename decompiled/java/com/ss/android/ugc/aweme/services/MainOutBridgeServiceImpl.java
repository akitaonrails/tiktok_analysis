package com.ss.android.ugc.aweme.services;

import X.C04UI;
import X.C1489140or2;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.splash.SplashActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class MainOutBridgeServiceImpl implements IMainOutBridgeService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.services.IMainOutBridgeService
    public Class<? extends Activity> getSplashActivityClass() {
        return SplashActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainOutBridgeService
    public void setLanguageDialogShowState(Context context, boolean z) {
        ((C04UI) C1489140or2.LIZ(context, C04UI.class)).LIZ();
    }
}
