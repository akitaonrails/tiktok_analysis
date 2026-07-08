package com.ss.lyrax.engine;

import X.C1280730jQt;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.ss.bytertc.engine.GLESVersion;
import com.ss.lyrax.engine.LyraxEglEnvironment;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxEglEnvironment {
    public static Handler mEglHandler = null;
    public static HandlerThread mEglThread = null;
    public static volatile boolean mIsEglInitilized = false;
    public static EglBase mRootEglBase = null;
    public static int mRootEglVersion = 2;

    public static class EglInitEventListener {
        public void onInitializedEngineEGL(GLESVersion gLESVersion) {
        }
    }

    public static native void nativeClearHardWareEncodeContext();

    public static native void nativeSetHardWareEncodeContext();

    public static synchronized EglBase getEGLContext() {
        EglBase eglBase = mRootEglBase;
        if (eglBase != null) {
            return eglBase;
        }
        return null;
    }

    public static synchronized GLESVersion getGLESVersion() {
        if (mRootEglBase != null) {
            return GLESVersion.fromId(mRootEglVersion);
        }
        return GLESVersion.GLES_VERSION_UNKNOWN;
    }

    public static /* synthetic */ void lambda$uninit$1() {
        C1C7U.LIZ("LyraxEglEnvironment@a685.uninit$1L");
        EglBase eglBase = mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            mRootEglBase = null;
        }
        C1C7U.LIZIZ("LyraxEglEnvironment@a685.uninit$1L");
    }

    public static synchronized void uninit() {
        Logging.e("[AndroidEglDebug]", "LyraxEglEnvironment::uninit Called by user");
        if (mIsEglInitilized) {
            Logging.e("[AndroidEglDebug]", "LyraxEglEnvironment::uninit Called");
            mIsEglInitilized = false;
            nativeClearHardWareEncodeContext();
            ThreadUtils.invokeAtFrontUninterruptibly(mEglHandler, new Runnable() { // from class: X.0jLe
                @Override // java.lang.Runnable
                public final void run() {
                    LyraxEglEnvironment.lambda$uninit$1();
                }
            });
            HandlerThread handlerThread = mEglThread;
            if (handlerThread != null) {
                handlerThread.quit();
            }
        }
    }

    public static void initEglContext(Object obj, GLESVersion gLESVersion) {
        if (gLESVersion != null && gLESVersion != GLESVersion.GLES_VERSION_UNKNOWN) {
            EglBase.EglVersion.setPreferredEglVersion(gLESVersion.value());
        } else {
            EglBase.EglVersion.setPreferredEglVersion(2);
        }
        if (obj == null) {
            mRootEglBase = C1280730jQt.LIZ();
            return;
        }
        if (obj instanceof EGLContext) {
            mRootEglBase = C1280730jQt.LIZLLL((EGLContext) obj, C1280730jQt.LJIIJ(2, EglBase.Config.CONFIG_PLAIN));
        } else if (obj instanceof android.opengl.EGLContext) {
            mRootEglBase = C1280730jQt.LJFF((android.opengl.EGLContext) obj, C1280730jQt.LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PLAIN));
        } else {
            if (obj instanceof EglBase) {
                EglBase eglBase = (EglBase) obj;
                mRootEglBase = C1280730jQt.LIZJ(eglBase.getEglBaseContext(), C1280730jQt.LJIIJ(eglBase.getGLESVersion(), EglBase.Config.CONFIG_PLAIN));
                return;
            }
            mRootEglBase = C1280730jQt.LIZ();
        }
    }

    public static /* synthetic */ void lambda$init$0(Object obj, GLESVersion gLESVersion) {
        C1C7U.LIZ("LyraxEglEnvironment@a685.init$1L");
        initEglContext(obj, gLESVersion);
        mRootEglBase.createDummyPbufferSurface();
        mRootEglBase.makeCurrent();
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetCurrentDisplay(), mRootEglBase.getEglBaseContext().getEgl14Context(), 12440, iArr, 0);
        int i = iArr[0];
        if (i != 2 && i != 3) {
            iArr[0] = mRootEglBase.getGLESVersion();
        }
        mRootEglVersion = iArr[0];
        nativeSetHardWareEncodeContext();
        mRootEglBase.detachCurrent();
        C1C7U.LIZIZ("LyraxEglEnvironment@a685.init$1L");
    }

    public static synchronized void init(final Object obj, final GLESVersion gLESVersion, EglInitEventListener eglInitEventListener) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxEglEnvironment::init Called by user，eglContext：");
        sbLIZ.append(obj);
        Logging.e("[AndroidEglDebug]", C2188811AlT.LIZIZ(sbLIZ));
        if (!mIsEglInitilized) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LyraxEglEnvironment::init Called，eglContext：");
            sbLIZ2.append(obj);
            Logging.e("[AndroidEglDebug]", C2188811AlT.LIZIZ(sbLIZ2));
            mIsEglInitilized = true;
            HandlerThread handlerThread = new HandlerThread("rtc_egl_thread");
            mEglThread = handlerThread;
            handlerThread.start();
            BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(mEglThread));
            mEglHandler = bPEAHandler;
            ThreadUtils.invokeAtFrontUninterruptibly(bPEAHandler, new Runnable() { // from class: X.0jLa
                @Override // java.lang.Runnable
                public final void run() {
                    LyraxEglEnvironment.lambda$init$0(obj, gLESVersion);
                }
            });
        }
        if (eglInitEventListener != null) {
            eglInitEventListener.onInitializedEngineEGL(GLESVersion.fromId(mRootEglVersion));
        }
    }
}
