package com.ss.android.ugc.aweme.services.external.ui;

import X.C19EG;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public interface IRecordPageLifecycle {
    void captureFrame(int i, int i2, Function2<? super Boolean, ? super Bitmap, Unit> function2);

    void initLazyComponents();

    void logShootExit(String str);

    void observeFirstFrameRender(Function0<Unit> function0);

    void onActivityCreated(C19EG c19eg, Bundle bundle);

    void onActivityResult(int i, int i2, Intent intent);

    boolean onBackPressed();

    void onCreate(Activity activity, View view, Bundle bundle);

    void onDestroy();

    void onEnterAnimationComplete();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    void startRightSwipe(String str, String str2);
}
