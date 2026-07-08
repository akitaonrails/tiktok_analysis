package com.bytedance.ies.nle.editor_jni;

import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;

/* JADX INFO: loaded from: classes6.dex */
public interface INLEPurePlayer {

    public interface INLEPurePlayerInfoListener {

        /* JADX INFO: loaded from: classes23.dex */
        public static final class DefaultImpls {
            public static void onFirstFrameRender(INLEPurePlayerInfoListener iNLEPurePlayerInfoListener) {
            }

            public static void onPlayEnd(INLEPurePlayerInfoListener iNLEPurePlayerInfoListener) {
            }

            public static void onPlayTime(INLEPurePlayerInfoListener iNLEPurePlayerInfoListener, int i, long j) {
            }

            public static void onPlayerPause(INLEPurePlayerInfoListener iNLEPurePlayerInfoListener) {
            }

            public static void onPrepared(INLEPurePlayerInfoListener iNLEPurePlayerInfoListener) {
            }
        }

        void onFirstFrameRender();

        void onPlayEnd();

        void onPlayTime(int i, long j);

        void onPlayerPause();

        void onPrepared();
    }

    void addPlayerInfoListener(INLEPurePlayerInfoListener iNLEPurePlayerInfoListener);

    void bindSurfaceView(SurfaceView surfaceView, boolean z);

    void bindTextureView(TextureView textureView, boolean z);

    void clearPlayerInfoListener();

    int destroy();

    long getCurrentPosition();

    long getDuration();

    boolean isDestroyed();

    int pause();

    int pause(boolean z);

    int play();

    int preload();

    int prepare();

    int recycleEngine();

    int refreshCurrentFrame();

    void releaseMagnifierSurface();

    void removePlayerInfoListener(INLEPurePlayerInfoListener iNLEPurePlayerInfoListener);

    int seekTime(long j);

    void setAndroidMagnifierSurface(Surface surface, boolean z);

    void setAndroidMagnifierSurfaceSize(int i, int i2);

    void setAndroidSurface(Surface surface, boolean z);

    void skipNextSeek(boolean z);

    void startAsyncResourceDownload(NLEModel nLEModel);

    int stop();

    void surfaceChanged(int i, int i2);

    void surfaceCreated(Surface surface, boolean z);

    void surfaceDestroyed();

    void unbindSurfaceView();

    public static final class DefaultImpls {
        public static /* synthetic */ void bindSurfaceView$default(INLEPurePlayer iNLEPurePlayer, SurfaceView surfaceView, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    surfaceView = null;
                }
                if ((i & 2) != 0) {
                    z = true;
                }
                iNLEPurePlayer.bindSurfaceView(surfaceView, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindSurfaceView");
        }

        public static /* synthetic */ void setAndroidMagnifierSurface$default(INLEPurePlayer iNLEPurePlayer, Surface surface, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                iNLEPurePlayer.setAndroidMagnifierSurface(surface, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAndroidMagnifierSurface");
        }

        public static /* synthetic */ void setAndroidSurface$default(INLEPurePlayer iNLEPurePlayer, Surface surface, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                iNLEPurePlayer.setAndroidSurface(surface, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAndroidSurface");
        }

        public static /* synthetic */ void surfaceCreated$default(INLEPurePlayer iNLEPurePlayer, Surface surface, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                iNLEPurePlayer.surfaceCreated(surface, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: surfaceCreated");
        }
    }
}
