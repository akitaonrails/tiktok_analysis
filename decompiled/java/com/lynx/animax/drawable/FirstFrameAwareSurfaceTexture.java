package com.lynx.animax.drawable;

import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C787470Uun;
import X.InterfaceC1283820jVs;
import Y.ARunnableS103S0100000_3;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.util.AnimaXLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes21.dex */
public class FirstFrameAwareSurfaceTexture extends SurfaceTexture implements SurfaceTexture.OnFrameAvailableListener {
    public static final /* synthetic */ int LLIZ = 0;
    public WeakReference<InterfaceC1283820jVs> LL;
    public Handler LLILLJJLI;
    public WeakReference<TextureView> LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public WeakReference<Surface> LLILZLL;
    public boolean mFirstFrameHasPassed;

    public FirstFrameAwareSurfaceTexture() {
        super(0);
        new BPEAHandler(Looper.getMainLooper());
        this.LLILZ = false;
        this.LLILZIL = false;
        super.setOnFrameAvailableListener(this, C787470Uun.LIZ());
    }

    public final synchronized Surface LIZLLL() {
        WeakReference<Surface> weakReference;
        weakReference = this.LLILZLL;
        return weakReference != null ? weakReference.get() : null;
    }

    public final boolean LJFF() {
        try {
            Field declaredField = SurfaceTexture.class.getDeclaredField("mOnSetFrameRateHandler");
            declaredField.setAccessible(true);
            return declaredField.get(this) == null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isOnSetFrameRateHandlerNull fail: ");
            sbLIZ.append(th.getMessage());
            AnimaXLog.LIZ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void finalize() {
        this.LLILZ = true;
        Surface surfaceLIZLLL = LIZLLL();
        if (surfaceLIZLLL != null && surfaceLIZLLL.isValid()) {
            surfaceLIZLLL.release();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release Surface in finalize: ");
            sbLIZ.append(surfaceLIZLLL);
            AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ));
            LJIIIZ(null);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("FirstFrameAwareSurfaceTexture finalize: ");
        sbLIZ2.append(this);
        AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ2));
        super.finalize();
    }

    @Override // android.graphics.SurfaceTexture
    public synchronized void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release with ");
        sbLIZ.append(this);
        AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("release() called after finalize(). Skip releasing SurfaceTexture. ");
            sbLIZ2.append(this);
            AnimaXLog.LIZJ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (this.LLILZIL) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("release() called multiple times. ");
            sbLIZ3.append(this);
            AnimaXLog.LIZJ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        this.LLILZIL = true;
        Surface surfaceLIZLLL = LIZLLL();
        if (surfaceLIZLLL != null && surfaceLIZLLL.isValid()) {
            surfaceLIZLLL.release();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("release Surface: ");
            sbLIZ4.append(surfaceLIZLLL);
            AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ4));
            LJIIIZ(null);
        }
        if (Build.VERSION.SDK_INT >= 26 && isReleased()) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("already released: ");
            sbLIZ5.append(this);
            AnimaXLog.LIZJ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ5));
            return;
        }
        try {
            Field declaredField = SurfaceTexture.class.getDeclaredField("mSurfaceTexture");
            declaredField.setAccessible(true);
            if (declaredField.getLong(this) == 0) {
                AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", "surfaceTextureField is 0, skip release");
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("fail to getSurfaceTextureField: ");
            sbLIZ6.append(th.getMessage());
            AnimaXLog.LIZ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ6));
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("release SurfaceTexture: ");
        sbLIZ7.append(this);
        AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ7));
        super.release();
    }

    public static class OnFrameAvailableHandler extends BPEAHandler {
        public final WeakReference<FirstFrameAwareSurfaceTexture> LL;
        public final WeakReference<SurfaceTexture.OnFrameAvailableListener> LLILLJJLI;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("FirstFrameAwareSurfaceTexture$OnFrameAvailableHandler@da01.handleMessage");
            FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture = this.LL.get();
            if (firstFrameAwareSurfaceTexture == null) {
                C1C7U.LIZIZ("FirstFrameAwareSurfaceTexture$OnFrameAvailableHandler@da01.handleMessage");
                return;
            }
            SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = this.LLILLJJLI.get();
            if (onFrameAvailableListener != null) {
                onFrameAvailableListener.onFrameAvailable(firstFrameAwareSurfaceTexture);
            }
            C1C7U.LIZIZ("FirstFrameAwareSurfaceTexture$OnFrameAvailableHandler@da01.handleMessage");
        }

        public OnFrameAvailableHandler(Looper looper, FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
            super(looper);
            this.LL = new WeakReference<>(firstFrameAwareSurfaceTexture);
            this.LLILLJJLI = new WeakReference<>(onFrameAvailableListener);
        }
    }

    public static void LIZIZ(Object obj) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        if (obj == null) {
            AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", "clearMiuiStubCallbackIfNeeded: Skipped, stub is null.");
            return;
        }
        Field declaredField = obj.getClass().getDeclaredField("mOnFrameAvailableHandler");
        declaredField.setAccessible(true);
        Object obj2 = declaredField.get(obj);
        Field declaredField2 = obj.getClass().getDeclaredField("mUpdateListener");
        declaredField2.setAccessible(true);
        Object obj3 = declaredField2.get(obj);
        Method method = obj.getClass().getMethod("setOnFrameAvailableHandler", Handler.class);
        method.setAccessible(true);
        method.invoke(obj, null);
        declaredField2.set(obj, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearMiuiStubCallbackIfNeeded: Finished cleanup, origin handler: ");
        sbLIZ.append(obj2);
        sbLIZ.append(", origin update listener: ");
        sbLIZ.append(obj3);
        sbLIZ.append(", current handler: ");
        sbLIZ.append(declaredField.get(obj));
        sbLIZ.append(", current update listener: ");
        sbLIZ.append(declaredField2.get(obj));
        AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJI(InterfaceC1283820jVs interfaceC1283820jVs) {
        this.LL = new WeakReference<>(interfaceC1283820jVs);
        if (this.mFirstFrameHasPassed) {
            interfaceC1283820jVs.LJIIJJI();
        }
    }

    public final synchronized void LJIIIZ(Surface surface) {
        this.LLILZLL = new WeakReference<>(surface);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        InterfaceC1283820jVs interfaceC1283820jVs;
        Handler handler = this.LLILLJJLI;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(0);
            messageObtainMessage.setAsynchronous(true);
            C786410Ut5.LJLJJL(this.LLILLJJLI, messageObtainMessage);
        }
        if (!this.mFirstFrameHasPassed) {
            this.mFirstFrameHasPassed = true;
            WeakReference<InterfaceC1283820jVs> weakReference = this.LL;
            if (weakReference != null) {
                interfaceC1283820jVs = weakReference.get();
            } else {
                interfaceC1283820jVs = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger first frame callback with ");
            sbLIZ.append(interfaceC1283820jVs);
            AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ));
            if (interfaceC1283820jVs != null) {
                interfaceC1283820jVs.LJIIJJI();
            }
        }
    }

    @Override // android.graphics.SurfaceTexture
    public final void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        LJIIIIZZ(onFrameAvailableListener, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r4 != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(android.graphics.SurfaceTexture.OnFrameAvailableListener r4, android.os.Handler r5) {
        /*
            r3 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            r0 = 0
            if (r2 >= r1) goto L1c
            if (r4 == 0) goto L4f
        L9:
            if (r5 == 0) goto L17
            android.os.Looper r1 = r5.getLooper()
        Lf:
            com.lynx.animax.drawable.FirstFrameAwareSurfaceTexture$OnFrameAvailableHandler r0 = new com.lynx.animax.drawable.FirstFrameAwareSurfaceTexture$OnFrameAvailableHandler
            r0.<init>(r1, r3, r4)
            r3.LLILLJJLI = r0
            return
        L17:
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto Lf
        L1c:
            if (r4 == 0) goto L4f
            android.os.Handler r0 = r3.LLILLJJLI
            if (r0 == 0) goto L9
            java.lang.ref.WeakReference<android.view.TextureView> r0 = r3.LLILLL
            if (r0 == 0) goto L9
            java.lang.Object r1 = r0.get()
            android.view.TextureView r1 = (android.view.TextureView) r1
            if (r1 == 0) goto L9
            Y.ARunnableS120S0100000_20 r2 = new Y.ARunnableS120S0100000_20
            r0 = 301(0x12d, float:4.22E-43)
            r2.<init>(r1, r0)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r0.getThread()
            java.lang.Thread r0 = X.C786410Ut5.u3()
            if (r1 != r0) goto L47
            r2.run()
            goto L9
        L47:
            android.os.Handler r0 = X.C787470Uun.LIZ()
            X.C786410Ut5.LJJZZIII(r0, r2)
            goto L9
        L4f:
            r3.LLILLJJLI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.animax.drawable.FirstFrameAwareSurfaceTexture.LJIIIIZZ(android.graphics.SurfaceTexture$OnFrameAvailableListener, android.os.Handler):void");
    }

    @Override // android.graphics.SurfaceTexture
    public final void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        LJIIIIZZ(onFrameAvailableListener, handler);
        if (Build.VERSION.SDK_INT >= 35) {
            WeakReference weakReference = new WeakReference(this);
            AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", "clearInternalFrameRateListenerAsync: Posting cleanup action");
            C786410Ut5.LJJZZIII(C787470Uun.LIZ(), new ARunnableS103S0100000_3(weakReference, 116));
        }
    }
}
