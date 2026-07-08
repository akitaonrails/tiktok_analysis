package com.lynx.canvas.camera;

import X.AbstractC1289020jeG;
import X.C1288370jdD;
import X.C1304390k33;
import X.C1304400k34;
import X.C2188811AlT;
import X.InterfaceC1304380k32;
import com.lynx.canvas.KryptonApp;
import com.lynx.canvas.SurfaceTextureWrapper;

/* JADX INFO: loaded from: classes21.dex */
public class CameraContext {
    public InterfaceC1304380k32 LIZ;

    public static native void nativeOnCameraCallback(long j, CameraContext cameraContext, int i, int i2);

    public static native void nativeOnCameraErrorCallback(long j, String str);

    public void pause() {
        this.LIZ.pause();
    }

    public void play() {
        this.LIZ.play();
    }

    public void release() {
        C1288370jdD.LIZJ("CameraContext", "CameraContext release");
        this.LIZ.release();
        this.LIZ = null;
    }

    public CameraContext(InterfaceC1304380k32 interfaceC1304380k32) {
        this.LIZ = interfaceC1304380k32;
    }

    public void setupPreviewTexture(SurfaceTextureWrapper surfaceTextureWrapper) {
        this.LIZ.LIZIZ(surfaceTextureWrapper.LIZ);
    }

    public static void requestCamera(KryptonApp kryptonApp, long j, String str, String str2, String str3, boolean z) {
        requestCameraWithCustomSize(kryptonApp, j, str, str2, str3, z, 0, 0);
    }

    public static void requestCameraWithCustomSize(KryptonApp kryptonApp, long j, String str, String str2, String str3, boolean z, int i, int i2) {
        C1304390k33 c1304390k33 = new C1304390k33();
        c1304390k33.LIZIZ = str;
        c1304390k33.LIZ = str2;
        c1304390k33.LIZJ = str3;
        c1304390k33.LIZLLL = new C1304400k34(i, i2);
        c1304390k33.LJ = z;
        AbstractC1289020jeG abstractC1289020jeG = (AbstractC1289020jeG) kryptonApp.LJ(AbstractC1289020jeG.class);
        if (abstractC1289020jeG == null) {
            C1288370jdD.LIZIZ("CameraContext", "camera service not found");
            nativeOnCameraErrorCallback(j, "camera service not found");
            return;
        }
        InterfaceC1304380k32 interfaceC1304380k32LIZ = abstractC1289020jeG.LIZ();
        if (interfaceC1304380k32LIZ == null) {
            C1288370jdD.LIZIZ("CameraContext", "service create camera return null");
            nativeOnCameraErrorCallback(j, "service create camera return null");
            return;
        }
        if (!interfaceC1304380k32LIZ.LIZ(c1304390k33)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("camera request error with config: ");
            sbLIZ.append(str);
            sbLIZ.append(" ");
            sbLIZ.append(str2);
            sbLIZ.append(" ");
            sbLIZ.append(str3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1288370jdD.LIZIZ("CameraContext", strLIZIZ);
            nativeOnCameraErrorCallback(j, strLIZIZ);
            return;
        }
        CameraContext cameraContext = new CameraContext(interfaceC1304380k32LIZ);
        int width = interfaceC1304380k32LIZ.getWidth();
        int height = interfaceC1304380k32LIZ.getHeight();
        if (width == 0 || height == 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("downgrade size origin w: ");
            sbLIZ2.append(width);
            sbLIZ2.append(" h: ");
            sbLIZ2.append(height);
            sbLIZ2.append(" resolution: ");
            sbLIZ2.append(str2);
            C1288370jdD.LIZJ("CameraContext", C2188811AlT.LIZIZ(sbLIZ2));
            if (str2.equals("low")) {
                width = 288;
                height = 352;
            } else if (!str2.equals("medium") && str2.equals("high")) {
                width = 720;
                height = 1280;
            } else {
                height = 640;
                width = 480;
            }
        }
        nativeOnCameraCallback(j, cameraContext, width, height);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("request camera success with config: ");
        sbLIZ3.append(str);
        sbLIZ3.append(" ");
        sbLIZ3.append(str2);
        sbLIZ3.append(" ");
        sbLIZ3.append(str3);
        C1288370jdD.LIZJ("CameraContext", C2188811AlT.LIZIZ(sbLIZ3));
    }
}
