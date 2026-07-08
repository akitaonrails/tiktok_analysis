package com.lynx.canvas;

import X.C1288370jdD;
import X.C2188811AlT;
import X.InterfaceC1283810jVr;
import X.InterfaceC790510Uzh;
import X.TextureViewSurfaceTextureListenerC1288270jd3;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* JADX INFO: loaded from: classes21.dex */
public class SurfaceHolder implements InterfaceC1283810jVr {
    public final Surface LIZ;
    public InterfaceC790510Uzh LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public long LJ;
    public final FirstFrameAwareSurfaceTexture mSurfaceTexture;

    public static native long nativeCreateSurface(Surface surface, SurfaceTexture surfaceTexture);

    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispose surface texture with ");
        sbLIZ.append(this.mSurfaceTexture);
        C1288370jdD.LIZJ("KryptonSurfaceHolder", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.release();
        this.LIZIZ = null;
    }

    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstFrameAvailable mFirstFrameListener ");
        sbLIZ.append(this.LIZIZ);
        C1288370jdD.LIZJ("KryptonSurfaceHolder", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC790510Uzh interfaceC790510Uzh = this.LIZIZ;
        if (interfaceC790510Uzh != null) {
            ((TextureViewSurfaceTextureListenerC1288270jd3) interfaceC790510Uzh).LIZ();
        }
    }

    public SurfaceHolder(InterfaceC790510Uzh interfaceC790510Uzh) {
        FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture = new FirstFrameAwareSurfaceTexture();
        this.mSurfaceTexture = firstFrameAwareSurfaceTexture;
        firstFrameAwareSurfaceTexture.detachFromGLContext();
        firstFrameAwareSurfaceTexture.LIZIZ(this);
        Surface surface = new Surface(firstFrameAwareSurfaceTexture);
        this.LIZ = surface;
        this.LIZIZ = interfaceC790510Uzh;
        this.LIZJ = 1;
        this.LIZLLL = 1;
        this.LJ = nativeCreateSurface(surface, firstFrameAwareSurfaceTexture);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Created with surface texture ");
        sbLIZ.append(firstFrameAwareSurfaceTexture);
        C1288370jdD.LIZJ("KryptonSurfaceHolder", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(TextureView textureView) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initTextureView with ");
        sbLIZ.append(textureView);
        C1288370jdD.LIZJ("KryptonSurfaceHolder", C2188811AlT.LIZIZ(sbLIZ));
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        if (this.mSurfaceTexture.equals(surfaceTexture)) {
            return;
        }
        if (surfaceTexture != null) {
            C1288370jdD.LIZJ("KryptonSurfaceHolder", "Init TextureView but it has already another st.");
        }
        textureView.setSurfaceTexture(this.mSurfaceTexture);
    }

    public final void LIZLLL(int i, int i2) {
        if (this.LIZJ == i && this.LIZLLL == i2) {
            return;
        }
        if (i != 0 && i2 != 0) {
            this.LIZJ = i;
            this.LIZLLL = i2;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceTextureSizeChanged with invalid size ");
        sbLIZ.append(i);
        sbLIZ.append(" / ");
        sbLIZ.append(i2);
        C1288370jdD.LIZLLL("KryptonSurfaceHolder", C2188811AlT.LIZIZ(sbLIZ));
    }
}
