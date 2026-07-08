package com.ss.bytertc.base.media;

import X.C1C7U;
import X.C786410Ut5;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes9.dex */
public class RTCSurfaceTextureListener implements TextureView.SurfaceTextureListener {
    public final String key;
    public long nativeSurfaceHelperHandle;
    public TextureView textureView;

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void resetCallback() {
        this.nativeSurfaceHelperHandle = 0L;
        TextureView textureView = this.textureView;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        long j = this.nativeSurfaceHelperHandle;
        if (j != 0) {
            RTCSurfaceHelper.nativeSetRenderTarget(j, null, this.key);
            return true;
        }
        return true;
    }

    public RTCSurfaceTextureListener(TextureView textureView, final long j, final String str) {
        final SurfaceTexture surfaceTexture;
        this.textureView = textureView;
        this.key = str;
        if (textureView != null) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        this.nativeSurfaceHelperHandle = j;
        if (surfaceTexture != null && j != 0) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0LGT
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$new$0(surfaceTexture, j, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(SurfaceTexture surfaceTexture, long j, String str) {
        C1C7U.LIZ("RTCSurfaceTextureListener@4fc4.<init>$1L");
        SurfaceTexture surfaceTexture2 = this.textureView.getSurfaceTexture();
        if (surfaceTexture2 != null && surfaceTexture2 == surfaceTexture) {
            RTCSurfaceHelper.nativeSetRenderTarget(j, new Surface(surfaceTexture2), str);
        }
        C1C7U.LIZIZ("RTCSurfaceTextureListener@4fc4.<init>$1L");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        long j = this.nativeSurfaceHelperHandle;
        if (j != 0) {
            RTCSurfaceHelper.nativeSetRenderTarget(j, new Surface(surfaceTexture), this.key);
        }
    }
}
