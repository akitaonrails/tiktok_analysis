package com.ss.android.ttvecamera.cameraalgorithm;

import X.AbstractC2254721DMw;
import X.C2183341Ace;
import X.C2187451AjH;
import X.InterfaceC2186121Ah8;
import X.InterfaceC2186131Ah9;
import X.InterfaceC2186141AhA;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TECameraFrameSetting;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes34.dex */
public class TECameraAlgorithmInterface {
    public static String TAG = "TECameraAlgorithmInterface";
    public boolean isInited;
    public AbstractC2254721DMw mCamera;
    public TECameraFrameSetting mCameraFrameSetting;
    public InterfaceC2186121Ah8 mErrorListener;
    public long mHandle;
    public InterfaceC2186141AhA mLensCallback;
    public InterfaceC2186131Ah9 mListener;
    public float[] mMVPMatrix = new float[16];

    public native int nativeAddCameraAlgorithm(long j, Object obj);

    public native int nativeAlgorithmDestroy(long j);

    public native Object nativeAlgorithmGetResult(long j);

    public void nativeCallback_onError(int i, String str) {
    }

    public void nativeCallback_onLensError(int i, int i2, String str) {
    }

    public void nativeCallback_onLensInfo(int i, int i2, int i3, String str) {
    }

    public void nativeCallback_onLensSuccess(int i, float f, int i2) {
    }

    public void nativeCallback_onProcess(float f, boolean z) {
    }

    public native long nativeInit();

    public native TECameraAlgoResult nativeProcessAlgorithm(long j, Object obj);

    public native int nativeRemoveCameraAlgorithm(long j, int i);

    public native int nativeUpdateCameraAlgorithmParam(long j, Object obj);

    public void setErrorListener(InterfaceC2186121Ah8 interfaceC2186121Ah8) {
    }

    public void setProcessListener(InterfaceC2186131Ah9 interfaceC2186131Ah9) {
    }

    static {
        INVOKESTATIC_com_ss_android_ttvecamera_cameraalgorithm_TECameraAlgorithmInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("ttvesdk");
    }

    public int destroy() {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        int iNativeAlgorithmDestroy = nativeAlgorithmDestroy(j);
        this.mHandle = 0L;
        return iNativeAlgorithmDestroy;
    }

    public TECameraAlgorithmResult getResult() {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        return (TECameraAlgorithmResult) nativeAlgorithmGetResult(j);
    }

    public int init() {
        if (this.isInited) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJ(TAG, "algorithmInterface is inited!");
            return 0;
        }
        long jNativeInit = nativeInit();
        this.mHandle = jNativeInit;
        if (jNativeInit != 0) {
            return 0;
        }
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ(TAG, "nativeAlgorithmCreate failed!");
        return -1;
    }

    public TECameraAlgorithmInterface(AbstractC2254721DMw abstractC2254721DMw) {
        this.mCamera = abstractC2254721DMw;
    }

    public static void INVOKESTATIC_com_ss_android_ttvecamera_cameraalgorithm_TECameraAlgorithmInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public int addCameraAlgorithm(TECameraAlgorithmParam tECameraAlgorithmParam) {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        return nativeAddCameraAlgorithm(j, tECameraAlgorithmParam);
    }

    public TECameraFrame processAlgorithm(TECameraFrame tECameraFrame) {
        if (tECameraFrame.getPixelFormat() == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES) {
            this.mCameraFrameSetting = new TECameraFrameSetting(tECameraFrame.getTextureID(), 0, tECameraFrame.getSize().width, tECameraFrame.getSize().height, tECameraFrame.getRotation(), tECameraFrame.getMVPMatrix(), tECameraFrame.getFacing(), tECameraFrame.getPixelFormat().ordinal(), 0);
        }
        TECameraAlgoResult tECameraAlgoResultNativeProcessAlgorithm = nativeProcessAlgorithm(this.mHandle, this.mCameraFrameSetting);
        if (tECameraAlgoResultNativeProcessAlgorithm != null) {
            TECameraFrame tECameraFrame2 = new TECameraFrame(tECameraAlgoResultNativeProcessAlgorithm.width, tECameraAlgoResultNativeProcessAlgorithm.height, 0L);
            tECameraFrame2.initTextureFrame(tECameraAlgoResultNativeProcessAlgorithm.texID, 0, this.mMVPMatrix, TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGBA8, this.mCamera.LJII);
            return tECameraFrame2;
        }
        return null;
    }

    public int removeCameraAlgorithm(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveCameraAlgorithm(j, i);
    }

    public void setLensCallback(InterfaceC2186141AhA interfaceC2186141AhA) {
        this.mLensCallback = interfaceC2186141AhA;
    }

    public int updateCameraAlgorithmParam(TECameraAlgorithmParam tECameraAlgorithmParam) {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateCameraAlgorithmParam(j, tECameraAlgorithmParam);
    }

    public static class TECameraAlgoResult {
        public int format;
        public int height;
        public int texID;
        public int width;

        public TECameraAlgoResult(int i, int i2, int i3, int i4) {
            this.texID = i;
            this.format = i2;
            this.width = i3;
            this.height = i4;
        }
    }
}
