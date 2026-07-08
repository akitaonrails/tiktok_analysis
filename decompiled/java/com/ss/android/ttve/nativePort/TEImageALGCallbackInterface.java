package com.ss.android.ttve.nativePort;

import com.ss.android.vesdk.algorithm.SceneDetectInfo;
import com.ss.android.vesdk.algorithm.model.FAttributeInfo;
import com.ss.android.vesdk.algorithm.model.FDetectInfo;
import com.ss.android.vesdk.algorithm.model.SkeletonInfo;

/* JADX INFO: loaded from: classes36.dex */
public class TEImageALGCallbackInterface {
    public long mHandler;

    public interface FInfoCallback {
        void onResult(FAttributeInfo fAttributeInfo, FDetectInfo fDetectInfo);
    }

    public interface SceneInfoCallback {
        void onResult(SceneDetectInfo sceneDetectInfo);
    }

    public interface SkeletonInfoCallback {
        void onResult(SkeletonInfo skeletonInfo);
    }

    private native void nativeCheckHas();

    private native void nativeRegisterFaceInfoUpload(long j, boolean z, FInfoCallback fInfoCallback);

    private native void nativeRegisterSceneDetectCallback(long j, SceneInfoCallback sceneInfoCallback);

    private native void nativeRegisterSkeletonDetectCallback(long j, SkeletonInfoCallback skeletonInfoCallback);

    private native void nativeUnRegisterFaceInfoUpload(long j);

    public synchronized void unRegisterFaceInfoUpload() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeUnRegisterFaceInfoUpload(j);
    }

    public synchronized void unRegisterSceneDetectCallback() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeRegisterSceneDetectCallback(j, null);
    }

    public synchronized void unRegisterSkeletonDetectCallback() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeRegisterSkeletonDetectCallback(j, null);
    }

    public TEImageALGCallbackInterface(long j) {
        this.mHandler = j;
        nativeCheckHas();
    }

    public synchronized void registerFaceInfoUpload(FInfoCallback fInfoCallback) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeRegisterFaceInfoUpload(j, true, fInfoCallback);
    }

    public synchronized void registerSceneDetectCallback(SceneInfoCallback sceneInfoCallback) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeRegisterSceneDetectCallback(j, sceneInfoCallback);
    }

    public synchronized void registerSkeletonDetectCallback(SkeletonInfoCallback skeletonInfoCallback) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeRegisterSkeletonDetectCallback(j, skeletonInfoCallback);
    }
}
