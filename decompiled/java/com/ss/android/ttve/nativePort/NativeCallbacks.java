package com.ss.android.ttve.nativePort;

import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class NativeCallbacks {

    public interface IAmbientLoudnessCallback {
        void onResults(double[] dArr);
    }

    public interface IAudioCaptureCallback {
        void onReceive(ByteBuffer byteBuffer);
    }

    public interface ICameraFrameCallback {
        void onResult(int i, float[] fArr, int i2, int i3, int i4, long j);

        void onResult(ByteBuffer byteBuffer, int i, int i2, long j);
    }

    public interface IFrameEffectCallback {
        void onResult(long j);
    }

    public interface IGetFrameCallback {
        void onResult(int i, int i2);

        void onResult(VEFrame vEFrame, boolean z, int i, int i2);

        void onResult(int[] iArr, int i, int i2, long j, boolean z, int i3);
    }

    public interface ILensCallback {
        void onError(int i, int i2, String str);

        void onInfo(int i, int i2, int i3, String str);

        void onSuccess(int i, float f, int i2);
    }

    public interface OnARTextBitmapCallback {
        BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout);
    }

    public interface OnARTextContentCallback {
        void onResult(String[] strArr);
    }
}
