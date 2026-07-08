package com.ss.android.ugc.aweme.services.external.ability;

import X.InterfaceC448730Hih;
import android.content.Context;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.services.external.ability.camera.AVCameraParams;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigmaResult;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVScanSettings;

/* JADX INFO: loaded from: classes29.dex */
public interface IQRCodeScanner {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    public interface OnEnigmaScanListener {
        void onFail(int i);

        void onSuccess(AVEnigmaResult aVEnigmaResult);
    }

    /* JADX INFO: loaded from: classes36.dex */
    public interface ScanProcessListenr {
        void onCameraOpenSuccess();

        void onCameraScanStarted();

        void onFirstRenderSuccess();
    }

    void closeLight();

    void enableCameraScan(boolean z, long j);

    void openLight();

    void pauseEffectAudio(boolean z);

    void processTouchEvent(float f, float f2);

    void release();

    void setScanListener(OnEnigmaScanListener onEnigmaScanListener);

    void setScanProcessListener(ScanProcessListenr scanProcessListenr);

    void setVEScanListener(InterfaceC448730Hih interfaceC448730Hih);

    void startPicScan(String str, AVScanSettings aVScanSettings, long j);

    void startScan(Context context, AVCameraParams aVCameraParams, SurfaceHolder surfaceHolder, AVScanSettings aVScanSettings);

    void startScanVE();

    void stop();

    void stopPicScan();

    void stopVE();

    void switchEffectWithTag(String str, int i, int i2, String str2);

    void zoomByRatio(float f);
}
