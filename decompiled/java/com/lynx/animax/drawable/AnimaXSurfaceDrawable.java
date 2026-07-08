package com.lynx.animax.drawable;

import X.C2188811AlT;
import X.EnumC1288610jdb;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.lynx.animax.util.AnimaXLog;

/* JADX INFO: loaded from: classes21.dex */
public class AnimaXSurfaceDrawable {
    public final Surface LIZ;
    public final SurfaceTexture LIZIZ;
    public final BitmapBufferGroup LIZJ;
    public final EnumC1288610jdb LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    public boolean isAutoDestroyEGLContextEnabled() {
        return false;
    }

    private long getTypeIndex() {
        return this.LIZLLL.ordinal();
    }

    public boolean isTextureFirstFrameAware() {
        SurfaceTexture surfaceTexture = this.LIZIZ;
        if (surfaceTexture == null) {
            return false;
        }
        return surfaceTexture instanceof FirstFrameAwareSurfaceTexture;
    }

    public BitmapBufferGroup getBitmapBufferGroup() {
        return this.LIZJ;
    }

    public int getHeight() {
        return this.LJFF;
    }

    public Surface getSurface() {
        return this.LIZ;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.LIZIZ;
    }

    public int getWidth() {
        return this.LJ;
    }

    public boolean isAntiAliasingEnabled() {
        return this.LJI;
    }

    public boolean isPlatformSurfaceInitiallyInvalid() {
        return this.LJIIIIZZ;
    }

    public boolean isSoftwareRenderEnabled() {
        return this.LJII;
    }

    public final boolean LIZ(int i, int i2) {
        boolean z;
        if (Math.abs(this.LJ - i) <= 1 && Math.abs(this.LJFF - i2) <= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Skip same size: ");
            sbLIZ.append(i);
            sbLIZ.append(" / ");
            sbLIZ.append(i2);
            AnimaXLog.LIZIZ("AnimaXSurfaceDrawable", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        this.LJ = i;
        this.LJFF = i2;
        BitmapBufferGroup bitmapBufferGroup = this.LIZJ;
        if (bitmapBufferGroup != null) {
            bitmapBufferGroup.LIZIZ(i, i2);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Update size success: ");
        sbLIZ2.append(i);
        sbLIZ2.append(" / ");
        sbLIZ2.append(i2);
        AnimaXLog.LIZIZ("AnimaXSurfaceDrawable", C2188811AlT.LIZIZ(sbLIZ2));
        return true;
    }

    public AnimaXSurfaceDrawable(Surface surface, FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture, BitmapBufferGroup bitmapBufferGroup, int i, int i2) {
        this.LIZ = surface;
        this.LIZIZ = firstFrameAwareSurfaceTexture;
        this.LIZJ = bitmapBufferGroup;
        if (firstFrameAwareSurfaceTexture != null) {
            this.LIZLLL = EnumC1288610jdb.TextureView;
        } else if (bitmapBufferGroup != null) {
            this.LIZLLL = EnumC1288610jdb.BitmapBufferGroup;
            bitmapBufferGroup.LIZIZ(i, i2);
        } else if (surface != null) {
            this.LIZLLL = EnumC1288610jdb.SurfaceView;
        } else {
            this.LIZLLL = EnumC1288610jdb.Invalid;
        }
        this.LJ = i;
        this.LJFF = i2;
    }
}
