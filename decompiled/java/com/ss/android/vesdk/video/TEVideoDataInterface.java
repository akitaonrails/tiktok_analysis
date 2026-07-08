package com.ss.android.vesdk.video;

import X.C1284180jWS;
import X.C1284190jWT;
import X.C1664350tPd;
import X.C2185991Agv;
import X.C2186001Agw;
import X.C2188811AlT;
import X.C2484209oO;
import X.InterfaceC1283630jVZ;
import android.graphics.SurfaceTexture;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TECameraFrameSetting;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.vesdk.video.TEVideoDataInterface;

/* JADX INFO: loaded from: classes21.dex */
public class TEVideoDataInterface {
    public TECameraFrameSetting mCameraFrameSetting;
    public C2185991Agv mCapturePipeline;
    public C1664350tPd<C2185991Agv> mCapturePipelines;
    public long mHandler;
    public SurfaceTexture mSurfaceTexture;
    public C1284180jWS mTextureHolder;

    private native void nativeCameraParam(long j, TECameraFrameSetting tECameraFrameSetting);

    private native long nativeCreateVideoDataInterface();

    private native void nativeInit(long j);

    private native void nativeReleaseVideoDataInterface(long j);

    public native void nativeNotifyFrameAvailable(long j);

    public void destroy() {
        try {
            this.mTextureHolder.LIZLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("detachFromGLContext error: ");
            sbLIZ.append(e.getMessage());
            C2484209oO.LIZJ("TEVideoDataInterface", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.mTextureHolder.LJFF(true);
        long j = this.mHandler;
        if (j != 0) {
            nativeReleaseVideoDataInterface(j);
            this.mHandler = 0L;
        }
    }

    public void getNextFrame() {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        C1284180jWS c1284180jWS = this.mTextureHolder;
        SurfaceTexture surfaceTexture2 = c1284180jWS.LIZIZ;
        if (surfaceTexture != surfaceTexture2) {
            if (surfaceTexture2 != null) {
                try {
                    c1284180jWS.LIZLLL();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("detachFromGLContext error: ");
                    sbLIZ.append(e.getMessage());
                    C2484209oO.LIZJ("TEVideoDataInterface", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            this.mTextureHolder.LIZIZ = this.mSurfaceTexture;
        }
        try {
            C2186001Agw c2186001Agw = (C2186001Agw) this.mCapturePipeline;
            C1284180jWS c1284180jWS2 = this.mTextureHolder;
            c2186001Agw.LJIIJ = c1284180jWS2.LIZ;
            c1284180jWS2.LIZ();
            this.mTextureHolder.LJII();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("timestamp = ");
            sbLIZ2.append(this.mTextureHolder.LJ());
            C2484209oO.LIZ("TEVideoDataInterface", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateTexImage error: ");
            sbLIZ3.append(e2.getMessage());
            C2484209oO.LIZJ("TEVideoDataInterface", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public void onGLEnvInited() {
        C1284180jWS c1284180jWS = this.mTextureHolder;
        c1284180jWS.getClass();
        c1284180jWS.LIZ = C1284190jWT.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createOESTexture mSurfaceTextureID = ");
        sbLIZ.append(c1284180jWS.LIZ);
        C2484209oO.LJI("TextureHolder", C2188811AlT.LIZIZ(sbLIZ));
    }

    public TEVideoDataInterface() {
        this.mTextureHolder = new C1284180jWS();
        this.mCapturePipelines = new C1664350tPd<>();
        this.mHandler = nativeCreateVideoDataInterface();
    }

    public long getTexImageTimeDelay() {
        return (long) (((System.nanoTime() / 1000000.0d) - this.mTextureHolder.LJ()) * 1000.0d);
    }

    static {
        TENativeLibsLoader.loadLibrary();
    }

    public TEVideoDataInterface(long j) {
        this.mTextureHolder = new C1284180jWS();
        this.mCapturePipelines = new C1664350tPd<>();
        this.mHandler = j;
        nativeInit(j);
    }

    public void setCameraParams(TECameraFrame tECameraFrame) {
        int rotation = tECameraFrame.getRotation();
        if (tECameraFrame.getPixelFormat() == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES) {
            this.mCameraFrameSetting = new TECameraFrameSetting(this.mTextureHolder.LIZ, 0, tECameraFrame.getSize().width, tECameraFrame.getSize().height, rotation, tECameraFrame.getMVPMatrix(), 0, tECameraFrame.getPixelFormat().ordinal(), 0);
        }
        long j = this.mHandler;
        if (j != 0) {
            nativeCameraParam(j, this.mCameraFrameSetting);
        }
    }

    public void setCapturePipeline(C2185991Agv c2185991Agv) {
        this.mCapturePipeline = c2185991Agv;
        c2185991Agv.LIZJ = new InterfaceC1283630jVZ() { // from class: X.0jWV
            @Override // X.InterfaceC1283630jVZ
            public final void LJLJJL(TEFrameSizei tEFrameSizei) {
            }

            @Override // X.InterfaceC1283630jVZ, X.C1DJX
            public final void LIZIZ(TECameraFrame tECameraFrame) {
                tECameraFrame.initTextureFrame(this.LL.mTextureHolder.LIZ, 0, null, TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES, 0);
                this.LL.setCameraParams(tECameraFrame);
                TEVideoDataInterface tEVideoDataInterface = this.LL;
                tEVideoDataInterface.nativeNotifyFrameAvailable(tEVideoDataInterface.mHandler);
            }

            @Override // X.C1DJX
            public final void LJLLILLLL(SurfaceTexture surfaceTexture) {
                this.LL.mSurfaceTexture = surfaceTexture;
            }
        };
    }
}
