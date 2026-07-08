package com.ss.android.ugc.gamora.recorder.layout.views.sysplayer;

import X.C0MSL;
import X.C0MSO;
import X.C1C7U;
import X.C20548315ar;
import X.C2188811AlT;
import X.C576730Mjf;
import X.C786410Ut5;
import X.InterfaceC20548515at;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes32.dex */
public abstract class AbsSafelyRenderEngine implements C0MSL<TextureView>, Handler.Callback, TextureView.SurfaceTextureListener {
    public boolean LL = true;
    public boolean LLILLJJLI = true;
    public final AtomicBoolean LLILLL = new AtomicBoolean(false);
    public final StickyHandler LLILZ = new StickyHandler(C786410Ut5.W2(C0MSO.LJFF.LIZ), this);
    public final AbsSafelyRenderEngine$callbackHandler$1 LLILZIL;
    public String LLILZLL;
    public Surface LLIZ;
    public final AtomicBoolean LLIZLLLIL;
    public SurfaceTexture LLJ;
    public InterfaceC20548515at LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;

    public abstract long LIZLLL();

    public abstract boolean LJFF(long j);

    public abstract boolean LJI(String str, Surface surface);

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // X.C0MSL
    public final void LIZ() {
        if (this.LLILLL.get()) {
            LJIIIZ("ignore seek() by stop");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call seek() seekTimeMs = ");
        sbLIZ.append(0L);
        sbLIZ.append(", media.duration = ");
        sbLIZ.append(((C20548315ar) this).LLJJIJI);
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        Message.obtain(this.LLILZ, 4, 0L).sendToTarget();
    }

    @Override // X.C0MSL
    public final void pause() {
        this.LLILZ.sendEmptyMessage(8);
    }

    @Override // X.C0MSL
    public final void resume() {
        this.LLILZ.sendEmptyMessage(7);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.gamora.recorder.layout.views.sysplayer.AbsSafelyRenderEngine$callbackHandler$1] */
    public AbsSafelyRenderEngine() {
        final Looper mainLooper = Looper.getMainLooper();
        this.LLILZIL = new StickyHandler(mainLooper) { // from class: com.ss.android.ugc.gamora.recorder.layout.views.sysplayer.AbsSafelyRenderEngine$callbackHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("AbsSafelyRenderEngine@84dd.callbackHandler$1");
                InterfaceC20548515at interfaceC20548515at = this.LL.LLJI;
                if (interfaceC20548515at != null) {
                    interfaceC20548515at.LIZIZ(message.what);
                }
                C1C7U.LIZIZ("AbsSafelyRenderEngine@84dd.callbackHandler$1");
            }
        };
        this.LLIZLLLIL = new AtomicBoolean(false);
        this.LLJIJIL = -1L;
    }

    @Override // X.C0MSL
    public final boolean LIZIZ() {
        return this.LLJILJIL;
    }

    public class StickyHandler extends BPEAHandler {
        public StickyHandler(Looper looper) {
            super(looper, null);
        }

        public StickyHandler(Looper looper, Handler.Callback callback) {
            super(looper, callback);
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j) {
            removeMessages(message.what);
            return super.sendMessageAtTime(message, j);
        }
    }

    public static void LJIIIZ(String str) {
        C576730Mjf.LJIIIZ("MediaPlayer", str);
    }

    @Override // X.C0MSL
    public final void LIZJ(boolean z) {
        int i;
        StickyHandler stickyHandler = this.LLILZ;
        if (z) {
            i = 9;
        } else {
            i = 10;
        }
        stickyHandler.sendEmptyMessage(i);
    }

    public final void LJ(int i) {
        switch (i) {
            case 1:
                LJIIIZ("notifyCallBack MSG_CALLBACK_BUFFERING_START");
                break;
            case 2:
                this.LLJILJIL = true;
                LJIIIZ("notifyCallBack MSG_CALLBACK_BUFFERING_END");
                break;
            case 3:
                LJIIIZ("notifyCallBack MSG_CALLBACK_FIRST_FRAME_READY");
                break;
            case 4:
                LJIIIZ("notifyCallBack MSG_CALLBACK_STOP");
                break;
            case 5:
                LJIIIZ("notifyCallBack MSG_CALLBACK_PREPARED");
                break;
            case 6:
                LJIIIZ("notifyCallBack MSG_CALLBACK_SEEK_COMPLETE");
                break;
            case 7:
                LJIIIZ("notifyCallBack MSG_CALLBACK_COMPLETE");
                break;
        }
        if (this.LLJI != null) {
            sendEmptyMessage(i);
        }
    }

    public final void LJII(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call performComplete(String) cause by ");
        sbLIZ.append(str);
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ.sendEmptyMessage(5);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.LLILZLL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "performPrepare cause by "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LJIIIZ(r0)
            android.view.Surface r0 = r5.LLIZ
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L62
            java.lang.String r2 = ""
            r1 = 0
            boolean r0 = r0.isValid()
            if (r0 != r3) goto L62
            if (r1 != 0) goto L64
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.LLIZLLLIL     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L96
            java.lang.String r0 = "call onStartPlayer() begin..."
            LJIIIZ(r0)     // Catch: java.lang.Throwable -> L56
            android.view.Surface r1 = r5.LLIZ     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = r5.LLILZLL     // Catch: java.lang.Throwable -> L56
            boolean r0 = r5.LJI(r0, r1)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L4f
            java.lang.String r0 = "call onStartPlayer() success"
            LJIIIZ(r0)     // Catch: java.lang.Throwable -> L56
        L49:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.LLIZLLLIL     // Catch: java.lang.Throwable -> L56
            r0.set(r3)     // Catch: java.lang.Throwable -> L56
            goto L55
        L4f:
            java.lang.String r0 = "call onStartPlayer() ignored"
            LJIIIZ(r0)     // Catch: java.lang.Throwable -> L56
            goto L49
        L55:
            return
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            LJIIIZ(r0)
            return
        L62:
            java.lang.String r2 = "release by surface not isValid"
        L64:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.LLIZLLLIL
            boolean r0 = r0.getAndSet(r4)
            if (r0 == 0) goto L96
            LJIIIZ(r2)
            java.lang.String r0 = "call onReleasePlayer() begin..."
            LJIIIZ(r0)     // Catch: java.lang.Throwable -> L8b
            r1 = r5
            X.15ar r1 = (X.C20548315ar) r1     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "call release player()"
            boolean r0 = r1.LJIIJ(r0)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L85
            java.lang.String r0 = "call onReleasePlayer() success"
            LJIIIZ(r0)     // Catch: java.lang.Throwable -> L8b
            return
        L85:
            java.lang.String r0 = "call onReleasePlayer() ignored"
            LJIIIZ(r0)     // Catch: java.lang.Throwable -> L8b
            return
        L8b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            LJIIIZ(r0)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.layout.views.sysplayer.AbsSafelyRenderEngine.LJIIIIZZ(java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.LLILLL.get()) {
            return false;
        }
        switch (message.what) {
            case 1:
                if (!this.LLILLL.getAndSet(true)) {
                    try {
                        ((C20548315ar) this).LJIIJ("call release player()");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        LJIIIZ(Log.getStackTraceString(th));
                    }
                    try {
                        C20548315ar c20548315ar = (C20548315ar) this;
                        if (!c20548315ar.LLJILLL.getAndSet(true)) {
                            c20548315ar.LJIIJ("cal stop()");
                            return false;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        LJIIIZ(Log.getStackTraceString(th2));
                        return false;
                    }
                }
                return false;
            case 2:
                if (TextUtils.equals(this.LLILZLL, (String) HandlerHook.getMessageObj(message.obj))) {
                    return false;
                }
                this.LLILZLL = (String) HandlerHook.getMessageObj(message.obj);
                try {
                    LJIIIIZZ("MSG_RESOURCE");
                    return false;
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    LJIIIZ(Log.getStackTraceString(th3));
                    return false;
                }
            case 3:
                this.LLIZ = (Surface) HandlerHook.getMessageObj(message.obj);
                try {
                    LJIIIIZZ("MSG_SURFACE");
                    return false;
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    LJIIIZ(Log.getStackTraceString(th4));
                    return false;
                }
            case 4:
                try {
                    if (LJFF(((Long) HandlerHook.getMessageObj(message.obj)).longValue())) {
                        LJIIIZ("call onSeek success");
                        return false;
                    }
                    return false;
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSeek fail! ");
                    sbLIZ.append(Log.getStackTraceString(th5));
                    LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
            case 5:
                try {
                    this.LLJILJIL = false;
                    pause();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("call pause() when MSG_COMPLETE, media.duration = ");
                    sbLIZ2.append(((C20548315ar) this).LLJJIJI);
                    LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    C20548315ar c20548315ar2 = (C20548315ar) this;
                    if (!c20548315ar2.LLJILLL.get()) {
                        c20548315ar2.pause();
                        c20548315ar2.LIZ();
                        return false;
                    }
                    return false;
                } catch (Throwable th6) {
                    TryCatchGuardChecker.doCheck(th6);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onComplete fail! ");
                    sbLIZ3.append(Log.getStackTraceString(th6));
                    LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                    return false;
                }
            case 6:
            default:
                return false;
            case 7:
                if (!this.LL) {
                    this.LL = true;
                    if (this.LLILLJJLI) {
                        C20548315ar.LJIIL(((C20548315ar) this).LLJILJILJ);
                        return false;
                    }
                    LJIIIZ("ignore resume by not screen on");
                    C20548315ar.LJIIJJI(((C20548315ar) this).LLJILJILJ);
                    return false;
                }
                return false;
            case 8:
                if (this.LL) {
                    this.LL = false;
                    C20548315ar.LJIIJJI(((C20548315ar) this).LLJILJILJ);
                    return false;
                }
                return false;
            case BdTuring.TYPE_ECAF /* 9 */:
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("MSG_SCREEN_ON isResume = ");
                sbLIZ4.append(this.LL);
                sbLIZ4.append(",isScreenOn = ");
                sbLIZ4.append(this.LLILLJJLI);
                LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4));
                if (!this.LLILLJJLI) {
                    if (this.LL) {
                        C20548315ar.LJIIL(((C20548315ar) this).LLJILJILJ);
                    }
                    this.LLILLJJLI = true;
                    return false;
                }
                return false;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("MSG_SCREEN_LOST isResume = ");
                sbLIZ5.append(this.LL);
                sbLIZ5.append(",isScreenOn = ");
                sbLIZ5.append(this.LLILLJJLI);
                LJIIIZ(C2188811AlT.LIZIZ(sbLIZ5));
                if (this.LLILLJJLI) {
                    C20548315ar.LJIIJJI(((C20548315ar) this).LLJILJILJ);
                    this.LLILLJJLI = false;
                }
                if (!this.LL) {
                    this.LL = true;
                    if (this.LLILLJJLI) {
                        C20548315ar.LJIIL(((C20548315ar) this).LLJILJILJ);
                        return false;
                    }
                    LJIIIZ("ignore resume by not screen on");
                    C20548315ar.LJIIJJI(((C20548315ar) this).LLJILJILJ);
                    return false;
                }
                return false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        LJIIIZ("onSurfaceTextureDestroyed ");
        this.LLJ = null;
        Message.obtain(this.LLILZ, 3, null).sendToTarget();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j = ((C20548315ar) this).LLJJIJI;
        if (j > 0) {
            long j2 = this.LLJIJIL;
            if (j2 != j && j2 > 0 && LIZLLL() >= this.LLJIJIL) {
                long jLIZLLL = LIZLLL();
                if (jLIZLLL >= this.LLJIJIL) {
                    pause();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("limit duration limitDuration = ");
                    sbLIZ.append(this.LLJIJIL);
                    sbLIZ.append(" and media.duration = ");
                    sbLIZ.append(j);
                    sbLIZ.append(",currentPosition = ");
                    sbLIZ.append(jLIZLLL);
                    LJII(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
            }
        }
        if (this.LLJ != surfaceTexture) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onSurfaceTextureUpdated ");
            sbLIZ2.append(LIZLLL());
            LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            this.LLJ = surfaceTexture;
            Message.obtain(this.LLILZ, 3, new Surface(surfaceTexture)).sendToTarget();
        }
    }

    @Override // X.C0MSL
    public final void setDataSource(String str) {
        if (TextUtils.isEmpty(str)) {
            LJIIIZ("ignore setDataSource() path is empty");
            return;
        }
        if (this.LLILLL.get()) {
            LJIIIZ("ignore setDataSource() by stop");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call setDataSource() path = ");
        sbLIZ.append(str);
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        Message.obtain(this.LLILZ, 2, str).sendToTarget();
    }

    @Override // X.C0MSL
    public final void setDuration(long j) {
        if (this.LLILLL.get()) {
            LJIIIZ("ignore setDuration() by stop");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call setDuration() duration = ");
        sbLIZ.append(j);
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJIJIL = j;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.LLJ = surfaceTexture;
        Message.obtain(this.LLILZ, 3, new Surface(surfaceTexture)).sendToTarget();
    }
}
