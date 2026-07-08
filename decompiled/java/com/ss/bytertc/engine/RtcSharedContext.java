package com.ss.bytertc.engine;

import X.C1280730jQt;
import android.content.Context;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.video.EglBase;
import com.ss.bytertc.base.utils.RtcContextUtils;
import com.ss.bytertc.engine.utils.TextureHelper;
import com.ss.bytertc.engine.utils.VideoFrameConverter;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes21.dex */
public class RtcSharedContext {
    public static String mPackageName;
    public static EglBase mRootEglBase;
    public static VideoFrameConverter mVideoFrameConverter;

    public static synchronized EglBase getEGLContext() {
        return mRootEglBase;
    }

    public static synchronized long getNativeEGLContext() {
        long nativeEglContext;
        TextureHelper textureHelper = getTextureHelper();
        if (textureHelper != null) {
            nativeEglContext = textureHelper.getNativeEglContext();
        } else {
            EglBase eglBase = mRootEglBase;
            nativeEglContext = eglBase != null ? eglBase.getEglBaseContext().getNativeEglContext() : 0L;
        }
        return nativeEglContext;
    }

    public static String getRtcPackageName() {
        String str = mPackageName;
        return str != null ? str : "";
    }

    public static TextureHelper getTextureHelper() {
        return mVideoFrameConverter.getTextureHelper();
    }

    public static synchronized void releaseEglContext() {
        EglBase eglBase = mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            mRootEglBase = null;
        }
    }

    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }

    public static VideoFrameConverter getVideoFrameConverter() {
        return mVideoFrameConverter;
    }

    public static synchronized boolean initEglContext(Object obj) {
        if (obj == null) {
            mRootEglBase = C1280730jQt.LIZ();
            return false;
        }
        if (obj instanceof EGLContext) {
            mRootEglBase = C1280730jQt.LIZLLL((EGLContext) obj, C1280730jQt.LJIIJ(2, EglBase.Config.CONFIG_PLAIN));
        } else if (obj instanceof android.opengl.EGLContext) {
            mRootEglBase = C1280730jQt.LJFF((android.opengl.EGLContext) obj, C1280730jQt.LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PLAIN));
        } else if (obj instanceof EglBase) {
            mRootEglBase = C1280730jQt.LIZJ(((EglBase) obj).getEglBaseContext(), C1280730jQt.LJIIJ(((EglBase) obj).getGLESVersion(), EglBase.Config.CONFIG_PLAIN));
        } else {
            mRootEglBase = C1280730jQt.LIZ();
        }
        return true;
    }

    public static void initialize(Context context) {
        RtcContextUtils.initialize(context);
        mPackageName = context.getPackageName();
    }

    public static synchronized void setRootEglBase(EglBase eglBase) {
        mRootEglBase = eglBase;
    }

    public static synchronized void setVideoFrameConverter(VideoFrameConverter videoFrameConverter) {
        mVideoFrameConverter = videoFrameConverter;
    }
}
