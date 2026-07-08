package com.ss.android.ugc.aweme.services.recording;

import X.C1322110kVd;
import X.InterfaceC2177841ALe;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes34.dex */
public interface IRecordingOperationPanel {
    C1322110kVd backgroundView();

    void cameraFocus(int i, int i2, float[] fArr);

    void closeCamera(Cert cert);

    void closeRecording();

    void detectDirtyLens(Function2<Float, Integer, Unit> function2);

    FragmentManager fragmentManager();

    long getAvgExpTime();

    int getCameraInfo();

    int getCameraPos();

    String getEnterFrom();

    Lifecycle getLifecycle();

    LifecycleOwner getLifecycleOwner();

    String getLiveSourceParams();

    View getPreviewView();

    int getSurfaceSizeLayoutId();

    int[] getVideoSize();

    LiveData<Float> getZoomEvent();

    void hideBottomTab();

    Boolean isCameraOpen();

    boolean isSupportedExposureCompensation();

    void onGameStickerChosen(IStickerService.FaceSticker faceSticker, String str);

    void onHidePanel(String str);

    void onShowPanel(String str);

    void onStickerCancel(IStickerService.FaceSticker faceSticker, String str);

    void onStickerChosen(IStickerService.FaceSticker faceSticker, String str);

    void openCamera(Cert cert);

    void openCamera(Cert cert, boolean z);

    Boolean scaleCamera(ScaleGestureDetector scaleGestureDetector);

    void setCameraPos(int i, Cert cert);

    void setExposureCompensation(int i);

    void setFilter(String str, float f);

    void showBottomTab();

    InterfaceC2177841ALe videoRecorder();
}
