package com.ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes29.dex */
public interface IAVCameraService {

    public interface IAVCameraReadyCallback<T> {
        void finish(T t);
    }

    void getCustomScanner(boolean z, Context context, SurfaceHolder surfaceHolder, IAVCameraReadyCallback<IQRCodeScanner> iAVCameraReadyCallback, int i, int i2);

    void getScanner(boolean z, Context context, SurfaceHolder surfaceHolder, IAVCameraReadyCallback<IQRCodeScanner> iAVCameraReadyCallback);
}
