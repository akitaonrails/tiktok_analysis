package com.ss.ttlivestreamer.livestreamv2.capture;

import X.AbstractC1268600j7K;
import X.C1266350j3h;
import X.C1266730j4J;
import X.C1266900j4a;
import X.C1267500j5Y;
import X.C1267520j5a;
import X.C1267620j5k;
import X.C1269300j8S;
import X.C1269370j8Z;
import X.C1269390j8b;
import X.C1269460j8i;
import X.C1269470j8j;
import X.C1269500j8m;
import X.C1269510j8n;
import X.C1269520j8o;
import X.C1269570j8t;
import X.C1269600j8w;
import X.C1269610j8x;
import X.C1269620j8y;
import X.C1269830j9J;
import X.C1269850j9L;
import X.C1270350jA9;
import X.C1270610jAZ;
import X.C1270690jAh;
import X.C1270830jAv;
import X.C1270960jB8;
import X.C1271210jBX;
import X.C1271250jBb;
import X.C1271260jBc;
import X.C1271270jBd;
import X.C1271390jBp;
import X.C1271790jCT;
import X.C1272810jE7;
import X.C1273730jFb;
import X.C1274040jG6;
import X.C1274080jGA;
import X.C1275590jIb;
import X.C1283100jUi;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1269590j8v;
import X.EnumC1273550jFJ;
import X.InterfaceC1268500j7A;
import X.InterfaceC1268640j7O;
import X.InterfaceC1268690j7T;
import X.InterfaceC1269420j8e;
import X.InterfaceC1269480j8k;
import X.InterfaceC1270200j9u;
import X.InterfaceC1271560jC6;
import X.RunnableC1268520j7C;
import X.RunnableC741150T5l;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.content.Intent;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.video.OnekeyProcessParams;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetector;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.CaptureBase;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import java.lang.ref.WeakReference;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public final class LiveStreamVideoCapture extends AbstractC1268600j7K implements InterfaceC1270200j9u, InterfaceC1268690j7T {
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final WeakReference<InterfaceC1269420j8e> LLIZLLLIL;
    public final BGMHandler LLJ;
    public final GLThread LLJI;
    public int LLJIJIL;
    public Handler LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final Object LLJJIJI;
    public Intent LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public GlRenderDrawer LLJJJIL;
    public C1271390jBp LLJJJJ;
    public boolean LLJJJJJIL;
    public final ARunnableS120S0100000_20 LLJJJJLIIL;
    public AbstractC1268600j7K LLJJL;
    public C1269460j8i LLJJLIIIJLLLLLLLZ;
    public C1269390j8b LLJL;
    public final Context LLJLIL;
    public final Bundle LLJLILLLLZIIL;
    public long LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public int LLJZ;
    public final RunnableC1268520j7C LLJZIJLIL;
    public final boolean LLL;
    public int LLLF;
    public InterfaceC1268640j7O LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public long LLLI;
    public int LLLII;
    public final Deque<Integer> LLLIIII;
    public final boolean LLLIIIIL;
    public final boolean LLLIIIL;
    public int LLLIIL;
    public int LLLIILIL;
    public int LLLIL;
    public final C1270960jB8 LLLILZ;
    public final int LLLILZJ;
    public final AtomicReference<TTLHAbnormalDetectorJava> LLLILZLLLI;
    public WeakReference<TTLHSceneDetector> LLLIZZ;
    public C1269370j8Z LLLJ;
    public final List<C1269610j8x> LLLJIL;
    public final Object LLLJL;
    public final boolean LLLL;
    public final C1267500j5Y LLLLII;
    public final C1269300j8S LLLLIIIILLL;
    public final C1269850j9L LLLLIIL;
    public final C1269470j8j LLLLIILL;

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        stop();
        Handler handler = this.LLJILJIL;
        if (handler != null) {
            C1283100jUi.LIZIZ(handler, new ARunnableS120S0100000_20(this, 125));
        }
        ((LinkedList) this.LLLIIII).clear();
        C1273730jFb.LIZLLL(this.LLJI);
        super.release();
    }

    @Override // X.InterfaceC1270200j9u
    public final void LJ() {
        InterfaceC1269420j8e interfaceC1269420j8e;
        WeakReference<InterfaceC1269420j8e> weakReference = this.LLIZLLLIL;
        if (weakReference != null && (interfaceC1269420j8e = weakReference.get()) != null) {
            interfaceC1269420j8e.LJ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoCaptureStopped,device:");
        sbLIZ.append(this.LLJIJIL);
        C1270690jAh.LIZJ(1, "LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1270200j9u
    public final void LJIIJ() {
        InterfaceC1269420j8e interfaceC1269420j8e;
        WeakReference<InterfaceC1269420j8e> weakReference = this.LLIZLLLIL;
        if (weakReference != null && (interfaceC1269420j8e = weakReference.get()) != null) {
            interfaceC1269420j8e.LJIIJ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoCaptureStarted,device:");
        sbLIZ.append(this.LLJIJIL);
        C1270690jAh.LIZJ(1, "LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1268690j7T
    public final double LJIJ() {
        AbstractC1268600j7K abstractC1268600j7K = this.LLJJL;
        if (abstractC1268600j7K == null || !(abstractC1268600j7K instanceof C1270610jAZ)) {
            return -1.0d;
        }
        return ((C1270610jAZ) abstractC1268600j7K).c;
    }

    @Override // X.InterfaceC1268690j7T
    public final int LJIL() {
        AbstractC1268600j7K abstractC1268600j7K = this.LLJJL;
        if (abstractC1268600j7K == null || !(abstractC1268600j7K instanceof C1270610jAZ)) {
            return -1;
        }
        int i = this.LLLII;
        int i2 = i > 0 ? i : -1;
        int i3 = ((C1270350jA9) abstractC1268600j7K).LLIZLLLIL;
        return i3 > 0 ? Math.min(i2, i3) : i2;
    }

    @Override // X.InterfaceC1268690j7T
    public final String LJJIJ() {
        AbstractC1268600j7K abstractC1268600j7K = this.LLJJL;
        return abstractC1268600j7K instanceof C1270610jAZ ? ((C1270610jAZ) abstractC1268600j7K).l : "";
    }

    @Override // X.InterfaceC1268690j7T
    public final int LJJJJ() {
        AbstractC1268600j7K abstractC1268600j7K;
        if (this.LLJLILLLLZIIL.getBoolean("camera_size_opt", false) && (abstractC1268600j7K = this.LLJJL) != null && (abstractC1268600j7K instanceof C1270610jAZ)) {
            return ((C1270610jAZ) abstractC1268600j7K).s;
        }
        return -1;
    }

    @Override // X.InterfaceC1268690j7T
    public final int LJJL() {
        AbstractC1268600j7K abstractC1268600j7K;
        if (this.LLJLILLLLZIIL.getBoolean("camera_size_opt", false) && (abstractC1268600j7K = this.LLJJL) != null && (abstractC1268600j7K instanceof C1270610jAZ)) {
            return ((C1270610jAZ) abstractC1268600j7K).r;
        }
        return -1;
    }

    @Override // X.InterfaceC1268690j7T
    public final long LLFF() {
        AbstractC1268600j7K abstractC1268600j7K = this.LLJJL;
        if (abstractC1268600j7K == null || !(abstractC1268600j7K instanceof C1270610jAZ)) {
            return -1L;
        }
        return ((C1270610jAZ) abstractC1268600j7K).b;
    }

    @Override // X.InterfaceC1268690j7T
    public final boolean LLIFFJFJJ() {
        AbstractC1268600j7K abstractC1268600j7K = this.LLJJL;
        if (abstractC1268600j7K instanceof C1270610jAZ) {
            return ((C1270610jAZ) abstractC1268600j7K).LLIFFJFJJ();
        }
        return false;
    }

    @Override // X.InterfaceC1268690j7T
    public final long LLIL() {
        AbstractC1268600j7K abstractC1268600j7K = this.LLJJL;
        if (abstractC1268600j7K == null || !(abstractC1268600j7K instanceof C1270610jAZ)) {
            return -1L;
        }
        return ((C1270610jAZ) abstractC1268600j7K).a;
    }

    @Override // X.InterfaceC1268690j7T
    public final float LLILL() {
        AbstractC1268600j7K abstractC1268600j7K = this.LLJJL;
        if (abstractC1268600j7K != null) {
            return abstractC1268600j7K.LLIZLLLIL();
        }
        return 0.0f;
    }

    @Override // X.InterfaceC1268690j7T
    public final long LLILZ() {
        AbstractC1268600j7K abstractC1268600j7K = this.LLJJL;
        if (abstractC1268600j7K == null || !(abstractC1268600j7K instanceof C1270610jAZ)) {
            return -1L;
        }
        return ((C1270610jAZ) abstractC1268600j7K).e;
    }

    public final C1270610jAZ LLJILJIL() {
        AbstractC1268600j7K abstractC1268600j7K = this.LLJJL;
        if (abstractC1268600j7K == null || !(abstractC1268600j7K instanceof C1270610jAZ)) {
            return null;
        }
        return (C1270610jAZ) abstractC1268600j7K;
    }

    public final int LLJILJILJ() {
        int i = this.LLJIJIL;
        Deque<Integer> deque = this.LLLIIII;
        return (deque == null || ((LinkedList) deque).size() == 0) ? i : ((Integer) ((LinkedList) this.LLLIIII).removeFirst()).intValue();
    }

    public final boolean LLJJ() {
        return this.LLLLII.LIZ.mPushBase.LJIJJLI() && this.LLLLII.LIZ.mPushBase.LJIILIIL();
    }

    public final void LLJJIII() {
        InterfaceC1268640j7O interfaceC1268640j7O = this.LLLFF;
        if (interfaceC1268640j7O != null && this.LLLFFI && interfaceC1268640j7O.isEnable()) {
            this.LLLFZ = true;
            if (!LLJJ()) {
                this.LLLFF.enable(false);
                return;
            }
            C1269620j8y c1269620j8y = (C1269620j8y) C1269570j8t.LIZIZ(EnumC1269590j8v.EffectEnableSwitch, C1269570j8t.LIZLLL);
            c1269620j8y.LJIIIIZZ = false;
            if (this.LLLLIIIILLL != null) {
                this.LLLLIIIILLL.LIZIZ(c1269620j8y.LIZJ(C1269570j8t.LIZIZ));
            }
            c1269620j8y.LJI = new InterfaceC1269480j8k() { // from class: X.0j8f
                @Override // X.InterfaceC1269480j8k
                public final boolean LIZ() {
                    AbstractC1268600j7K abstractC1268600j7K = this.LIZ.LLJJL;
                    if (abstractC1268600j7K == null || !(abstractC1268600j7K instanceof C1269670j93)) {
                        return false;
                    }
                    return ((C1269670j93) abstractC1268600j7K).LLJJJIL;
                }
            };
            appendSerializedEventWithReplace(c1269620j8y);
        }
    }

    public final void LLJJIJI() {
        this.LLJ.removeMessages(10001);
        this.LLJILJIL.removeCallbacks(this.LLJZIJLIL);
        this.LLJILJIL.removeCallbacks(this.LLJJJJLIIL);
        C786410Ut5.LJJZZIII(this.LLJILJIL, new RunnableC741150T5l(new ARunnableS120S0100000_20(this, 124), new int[]{0}));
    }

    public final void LLJJIJIIJIL() {
        if (this.LLLFF == null || !this.LLLFFI) {
            return;
        }
        if (!this.LLLFZ) {
            C1267520j5a.LIZ();
            return;
        }
        this.LLLFZ = false;
        if (!LLJJ()) {
            this.LLLFF.enable(true);
            return;
        }
        C1269620j8y c1269620j8y = (C1269620j8y) C1269570j8t.LIZIZ(EnumC1269590j8v.EffectEnableSwitch, C1269570j8t.LIZLLL);
        c1269620j8y.LJIIIIZZ = true;
        if (this.LLLLIIIILLL != null) {
            this.LLLLIIIILLL.LIZIZ(c1269620j8y.LIZJ(C1269570j8t.LIZIZ));
        }
        c1269620j8y.LJI = new InterfaceC1269480j8k() { // from class: X.0j8h
            @Override // X.InterfaceC1269480j8k
            public final boolean LIZ() {
                return this.LIZ.LLJJL != null;
            }
        };
        appendSerializedEventWithReplace(c1269620j8y);
    }

    public final void LLJJIJIL() {
        AbstractC1268600j7K abstractC1268600j7K = this.LLJJL;
        if (abstractC1268600j7K == null || !(abstractC1268600j7K instanceof C1270350jA9)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupMirror: mHorizontalMirror ");
        sbLIZ.append(this.LLJLLIL);
        sbLIZ.append(", mVerticalMirror ");
        sbLIZ.append(this.LLJLLL);
        sbLIZ.append(". ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (abstractC1268600j7K instanceof C1270610jAZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append("With ");
            sbLIZ2.append(((C1270610jAZ) abstractC1268600j7K).LLJLILLLLZIIL != 1 ? "back camera. " : "front camera. ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        AVLog.logToIODeviceInternal(4, "LiveStreamVideoCapture", strLIZIZ, new Throwable());
        C1270350jA9 c1270350jA9 = (C1270350jA9) abstractC1268600j7K;
        c1270350jA9.LLJJI = this.LLJLLIL;
        c1270350jA9.LLJJIII = this.LLJLLL;
    }

    @Override // X.InterfaceC1268690j7T
    public final int M3() {
        AbstractC1268600j7K abstractC1268600j7K = this.LLJJL;
        if (abstractC1268600j7K == null || !(abstractC1268600j7K instanceof C1270610jAZ)) {
            return -1;
        }
        return ((C1270610jAZ) abstractC1268600j7K).M3();
    }

    public final void pause() {
        synchronized (this.LLJJIJI) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Pause capture, status ");
                sbLIZ.append(this.LLJJIII);
                AVLog.iod("LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ));
                this.LLJJJJJIL = false;
                if (this.LLJJIJIL == 2) {
                    C786410Ut5.LJJZZIII(this.LLJILJIL, new ARunnableS120S0100000_20(this, 123));
                }
                this.LLJ.removeMessages(10001);
                C1266730j4J c1266730j4J = new C1266730j4J(this);
                c1266730j4J.LIZ = this.LLJJIJIIJIL;
                c1266730j4J.LIZIZ = C1269500j8m.LIZJ().LIZLLL(0);
                this.LLJ.sendMessage(this.LLJ.obtainMessage(10001, 0, 0, c1266730j4J));
                LLJJIII();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC1268600j7K
    public final void stop() {
        if (this.LLJJIII == 2) {
            return;
        }
        this.LLJJIII = 2;
        if (this.LLLLII.LIZIZ.LJJI) {
            LLJJIJI();
            return;
        }
        synchronized (this.LLJJIJI) {
            try {
                LLJJIJI();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1268690j7T
    public final C1270830jAv LJIIJJI() {
        C1270610jAZ c1270610jAZLLJILJIL = LLJILJIL();
        if (c1270610jAZLLJILJIL != null) {
            return c1270610jAZLLJILJIL.LJIIJJI();
        }
        return null;
    }

    @Override // X.InterfaceC1268690j7T
    public final int LJJIJIIJIL() {
        C1270610jAZ c1270610jAZLLJILJIL = LLJILJIL();
        if (c1270610jAZLLJILJIL != null) {
            return c1270610jAZLLJILJIL.LJJIJIIJIL();
        }
        return 0;
    }

    @Override // X.InterfaceC1268690j7T
    public final JSONObject LJJLIIIJ() {
        C1270610jAZ c1270610jAZLLJILJIL = LLJILJIL();
        if (c1270610jAZLLJILJIL != null) {
            return c1270610jAZLLJILJIL.LJJLIIIJ();
        }
        return null;
    }

    @Override // X.InterfaceC1268690j7T
    public final C1269830j9J LLFFF() {
        C1270610jAZ c1270610jAZLLJILJIL = LLJILJIL();
        if (c1270610jAZLLJILJIL != null) {
            return c1270610jAZLLJILJIL.LLFFF();
        }
        return null;
    }

    public final void LLJIJIL() {
        if (!GLThreadManager.isGlAllocFailNoException()) {
            if (this.LLJJJ == 0) {
                this.LLJJJ = GlUtil.generateTexture(3553);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.LLJJJ);
                GLES20.glTexImage2D(3553, 0, 6408, this.LLJILJILJ, this.LLJILLL, 0, 6408, 5121, null);
                GLES20.glBindTexture(3553, 0);
                GLES20.glGetError();
                return;
            }
            return;
        }
        try {
            if (this.LLJJJ == 0) {
                this.LLJJJ = GlUtil.generateTexture(3553);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.LLJJJ);
                GLES20.glTexImage2D(3553, 0, 6408, this.LLJILJILJ, this.LLJILLL, 0, 6408, 5121, null);
                GLES20.glBindTexture(3553, 0);
                GLES20.glGetError();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            WeakReference<InterfaceC1268500j7A> glAllocFailListenerRef = GLThreadManager.getGlAllocFailListenerRef();
            if (glAllocFailListenerRef.get() != null) {
                glAllocFailListenerRef.get().LJ("tex alloc fail");
            }
        }
    }

    @Override // X.InterfaceC1268690j7T
    public final int LL() {
        return this.LLJIJIL;
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public final int status() {
        return this.LLJJIII;
    }

    public class BGMHandler extends BPEAHandler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            boolean z;
            C1C7U.LIZ("LiveStreamVideoCapture$BGMHandler@295b.handleMessage");
            if (HandlerHook.getMessageObj(message.obj) instanceof C1266730j4J) {
                C1266730j4J c1266730j4J = (C1266730j4J) HandlerHook.getMessageObj(message.obj);
                LiveStreamVideoCapture.this.LLJJIJIIJIL = c1266730j4J.LIZ;
                C1269500j8m.LIZJ().LJFF(0, c1266730j4J.LIZIZ);
            }
            if (message.what == 10001) {
                if (message.arg1 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                LiveStreamVideoCapture liveStreamVideoCapture = LiveStreamVideoCapture.this;
                liveStreamVideoCapture.LLLI = 0L;
                if (!z) {
                    liveStreamVideoCapture.LLJJI(4);
                    LiveStreamVideoCapture liveStreamVideoCapture2 = LiveStreamVideoCapture.this;
                    if (liveStreamVideoCapture2.LLJJIJIL != 4) {
                        long jNanoTime = System.nanoTime() / 1000;
                        LiveStreamVideoCapture liveStreamVideoCapture3 = LiveStreamVideoCapture.this;
                        liveStreamVideoCapture2.LLLI = jNanoTime - liveStreamVideoCapture3.LLJLL;
                        C786410Ut5.LJJZZIII(liveStreamVideoCapture3.LLJILJIL, liveStreamVideoCapture3.LLJJJJLIIL);
                    } else {
                        liveStreamVideoCapture2.LLJILJIL.removeCallbacks(liveStreamVideoCapture2.LLJJJJLIIL);
                    }
                } else {
                    liveStreamVideoCapture.LLJILJIL.removeCallbacks(liveStreamVideoCapture.LLJJJJLIIL);
                    LiveStreamVideoCapture liveStreamVideoCapture4 = LiveStreamVideoCapture.this;
                    int i = liveStreamVideoCapture4.LLJZ;
                    if (i != 0) {
                        liveStreamVideoCapture4.LLJJI(i);
                    }
                }
            }
            C1269500j8m.LIZJ().LIZLLL(0);
            C1C7U.LIZIZ("LiveStreamVideoCapture$BGMHandler@295b.handleMessage");
        }

        public BGMHandler(Looper looper) {
            super(looper);
        }
    }

    public static long LLJILLL(long j) {
        long jCurrentTimeMillis = (System.currentTimeMillis() * 1000) - j;
        if (Math.abs(jCurrentTimeMillis) >= 5000000) {
            long jNanoTime = (System.nanoTime() / 1000) - j;
            if (Math.abs(jNanoTime) >= 5000000) {
                return 0L;
            }
            return jNanoTime;
        }
        return jCurrentTimeMillis;
    }

    @Override // X.InterfaceC1268690j7T
    public final int LJIIIZ(float f) {
        C1270610jAZ c1270610jAZLLJILJIL = LLJILJIL();
        if (c1270610jAZLLJILJIL != null) {
            return c1270610jAZLLJILJIL.LJIIIZ(f);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ab  */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.0j8i, com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJI(int r13) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.LLJJI(int):void");
    }

    public final void LLJJJ(boolean z) {
        C1269510j8n c1269510j8nLIZLLL;
        if (this.LLJJL != null) {
            if (z) {
                c1269510j8nLIZLLL = C1269500j8m.LIZJ().LIZLLL(0);
                C1269500j8m.LIZJ().LJFF(0, new C1269510j8n(0, "LiveStreamVideoCapture.switchVideoCapture", CertProviderManagerKt.findCert("ttls_video_stop_when_swith_video", 1476788483)));
            } else {
                c1269510j8nLIZLLL = null;
            }
            this.LLJJL.stop();
            this.LLJJL.release();
            this.LLJJL = null;
            if (z) {
                C1269500j8m.LIZJ().LIZLLL(0);
                C1269500j8m.LIZJ().LJFF(0, c1269510j8nLIZLLL);
            }
        }
    }

    public final void appendSerializedEvent(C1269610j8x c1269610j8x) {
        if (c1269610j8x != null) {
            synchronized (this.LLLJL) {
                try {
                    this.LLLJIL.add(c1269610j8x);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void appendSerializedEventWithReplace(C1269610j8x c1269610j8x) {
        synchronized (this.LLLJL) {
            try {
                List<C1269610j8x> list = this.LLLJIL;
                if (list != null) {
                    Iterator<C1269610j8x> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().LIZLLL == c1269610j8x.LIZLLL) {
                            it2.remove();
                        }
                    }
                    ((LinkedList) this.LLLJIL).add(c1269610j8x);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1270200j9u
    public final void LJI(int i, Exception exc) {
        InterfaceC1269420j8e interfaceC1269420j8e;
        WeakReference<InterfaceC1269420j8e> weakReference = this.LLIZLLLIL;
        if (weakReference != null && (interfaceC1269420j8e = weakReference.get()) != null) {
            interfaceC1269420j8e.LJI(i, exc);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoCaptureError,code:");
        sbLIZ.append(i);
        sbLIZ.append(",device:");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(" mObserver:");
        sbLIZ.append(this.LLIZLLLIL);
        AVLog.logKibana(5, "LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ), exc);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onVideoCaptureError,code:");
        sbLIZ2.append(i);
        sbLIZ2.append(",device:");
        sbLIZ2.append(this.LLJIJIL);
        sbLIZ2.append(", status:");
        sbLIZ2.append(this.LLJJIII);
        AVLog.iow("LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC1268690j7T
    public final int LJJZZIII(float f, C1271210jBX c1271210jBX) {
        AbstractC1268600j7K abstractC1268600j7K = this.LLJJL;
        if (abstractC1268600j7K != null && (abstractC1268600j7K instanceof C1270610jAZ)) {
            return ((C1270610jAZ) abstractC1268600j7K).LJJZZIII(f, c1271210jBX);
        }
        return -1;
    }

    public final void LLJJJIL(int i, Intent intent) {
        this.LLJILJIL.removeCallbacks(this.LLJZIJLIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchVideoCaptureDevice. videoCaptureDevice : ");
        sbLIZ.append(i);
        AVLog.ioi("LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ));
        RunnableC1268520j7C runnableC1268520j7C = this.LLJZIJLIL;
        runnableC1268520j7C.LL = i;
        runnableC1268520j7C.LLILLJJLI = intent;
        runnableC1268520j7C.LLILLL = C1269500j8m.LIZJ().LIZLLL(0);
        C786410Ut5.LJJZZIII(this.LLJILJIL, this.LLJZIJLIL);
    }

    public final void tryDeliverEvents(VideoFrame videoFrame, List<C1269610j8x> list) {
        videoFrame.clearSerializedEvents();
        LinkedList linkedList = new LinkedList();
        if (list != null && ((LinkedList) list).size() != 0) {
            Iterator<C1269610j8x> it2 = list.iterator();
            while (it2.hasNext()) {
                C1269610j8x next = it2.next();
                InterfaceC1269480j8k interfaceC1269480j8k = next.LJI;
                if (interfaceC1269480j8k == null || interfaceC1269480j8k.LIZ()) {
                    linkedList.add(next);
                    it2.remove();
                    if (this.LLLLIIIILLL != null) {
                        this.LLLLIIIILLL.LIZIZ(next.LIZIZ(C1269570j8t.LIZIZ));
                    }
                }
            }
        }
        if (linkedList.size() != 0) {
            videoFrame.appendSerializedEvents(linkedList);
        }
    }

    @Override // X.AbstractC1268600j7K
    public final void LLJI(int i, int i2, int i3) {
        C1271250jBb c1271250jBb = C1271270jBd.LIZ;
        if (c1271250jBb.LJI()) {
            int[] iArrLJ = c1271250jBb.LJ(i, i2, 0);
            if (c1271250jBb.LJII(iArrLJ[0], iArrLJ[1], this.LLJIJIL)) {
                i = iArrLJ[0];
                i2 = iArrLJ[1];
            }
        }
        this.LLJILJILJ = i;
        this.LLJILLL = i2;
        this.LLJJ = i3;
        synchronized (this.LLJJIJI) {
            try {
                if (this.LLJJIII == 1) {
                    return;
                }
                this.LLJJIII = 1;
                LLJJJIL(this.LLJIJIL, this.LLJJIJIIJIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public LiveStreamVideoCapture(int i, Handler handler, C1266350j3h c1266350j3h, C1267500j5Y c1267500j5Y) {
        boolean z;
        boolean z2;
        Context context = c1267500j5Y.LIZIZ.LJIIZILJ;
        this.LLJJI = -1;
        this.LLJJIJI = new Object();
        this.LLJJJ = 0;
        Bundle bundle = new Bundle();
        this.LLJLILLLLZIIL = bundle;
        this.LLJLL = 0L;
        this.LLJLLIL = false;
        this.LLJLLL = false;
        this.LLJZ = 0;
        this.LLL = true;
        this.LLLF = -1;
        this.LLLFFI = false;
        this.LLLFZ = false;
        this.LLLII = 0;
        this.LLLIIII = new LinkedList();
        this.LLLIIIIL = true;
        this.LLLIIIL = false;
        this.LLLILZ = new C1270960jB8();
        this.LLLILZJ = 0;
        this.LLLILZLLLI = new AtomicReference<>(null);
        this.LLLIZZ = new WeakReference<>(null);
        this.LLLJIL = new LinkedList();
        this.LLLJL = new Object();
        this.LLLL = false;
        this.LLLLIILL = new C1269470j8j(this);
        this.LLLLII = c1267500j5Y;
        C1272810jE7 c1272810jE7 = c1267500j5Y.LIZJ;
        this.LLLLIIIILLL = (C1269300j8S) c1272810jE7.getService(C1269300j8S.class);
        this.LLLLIIL = (C1269850j9L) c1272810jE7.getService(C1269850j9L.class);
        this.LLJIJIL = i;
        this.LLJILJIL = handler;
        this.LLIZLLLIL = new WeakReference<>(c1266350j3h);
        this.LLJJIII = 0;
        this.LLJJJJJIL = true;
        this.LLJLIL = context;
        this.LLJZ = this.LLJIJIL;
        LiveSdkSetting liveSdkSetting = c1267500j5Y.LIZ;
        PushBase pushBase = liveSdkSetting.mPushBase;
        CaptureBase.VideoCaptureParams videoCaptureParams = liveSdkSetting.captureBase.videoCapture;
        pushBase.getClass();
        this.LLILZLL = true;
        Boolean boolValueOf = Boolean.valueOf(videoCaptureParams.LIZLLL);
        if (boolValueOf != null && boolValueOf.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZ = z;
        this.LLJJI = videoCaptureParams.LIZIZ;
        this.LLLILZJ = pushBase.LJIILL;
        Handler handler2 = this.LLJILJIL;
        if (handler2 != null && !c1267500j5Y.LIZIZ.LJJJLIIL) {
            C1283100jUi.LIZIZ(handler2, new ARunnableS120S0100000_20(this, 127));
        }
        if (this.LLJILJIL == null) {
            GLThread gLThreadLIZ = C1273730jFb.LIZ(0, "liveStreamVideoSource");
            this.LLJI = gLThreadLIZ;
            gLThreadLIZ.start();
            this.LLJILJIL = gLThreadLIZ.getHandler();
        }
        this.LLJJJJLIIL = new ARunnableS120S0100000_20(this, 128);
        if (this.LLJILJIL == null) {
            this.LLJILJIL = this.LLJI.getHandler();
        }
        C1283100jUi.LIZIZ(this.LLJILJIL, new ARunnableS89S0200000_20(pushBase, this, 240));
        this.LLJ = new BGMHandler(this.LLJILJIL.getLooper());
        this.LLJZIJLIL = new RunnableC1268520j7C(this);
        C1271260jBc c1271260jBc = C1271270jBd.LIZ.LIZ;
        c1271260jBc.LIZIZ(0);
        c1271260jBc.LIZIZ(1);
        LiveSdkSetting liveSdkSetting2 = c1267500j5Y.LIZ;
        PushBase pushBase2 = liveSdkSetting2.mPushBase;
        CaptureBase.VideoCaptureParams videoCaptureParams2 = liveSdkSetting2.captureBase.videoCapture;
        pushBase2.getClass();
        this.LLLIIIIL = true;
        this.LLL = true;
        boolean z3 = pushBase2.LJIILJJIL.algSwitch;
        String str = c1267500j5Y.LIZIZ.LJIL;
        if (z3 && !TextUtils.isEmpty(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLLIIIL = pushBase2.LJIJ();
        bundle.putBoolean("useCamera2API", videoCaptureParams2.LJIIJ());
        bundle.putBoolean("enableMinCapFpsChange", videoCaptureParams2.LIZJ());
        bundle.putInt("cameraType", 0);
        bundle.putInt("camera_open_retry_cnt", 30);
        bundle.putInt("camera_retry_start_preview_cnt", 10);
        bundle.putInt("destFps", 0);
        bundle.putBoolean("fixFpsRangeCompareBug", false);
        bundle.putBoolean("enableWideFov", true);
        bundle.putBoolean("enableFallback", videoCaptureParams2.LIZIZ());
        bundle.putInt("cameraFaceAEStrategy", 3);
        bundle.putBoolean("enableWideAngle", false);
        bundle.putInt("cameraFrameFormat", 0);
        bundle.putBoolean("isForceCloseCamera", false);
        bundle.putInt("camera_log_level", videoCaptureParams2.cameraLogLevel);
        bundle.putBoolean("is_camera_open_close_sync", videoCaptureParams2.LJII());
        C786410Ut5.LJJJI("textureMinFilter", "", bundle);
        bundle.putInt("videoCaptureMinFps", videoCaptureParams2.LIZJ);
        bundle.putInt("cameraFrameRateStrategy", 0);
        bundle.putBoolean("enableOpenCamera1Opt", true);
        bundle.putInt("requiredCameraLevel", -1);
        bundle.putInt("cameraMode", -1);
        bundle.putBoolean("enableFrontFacingVideoContinueFocus", true);
        bundle.putBoolean("enablePreviewTemplate", false);
        bundle.putBoolean("enableCallBackStop", true);
        bundle.putBoolean("auto_cap_size", true);
        bundle.putBoolean("enableChooseBestCaptureResolution", true);
        bundle.putBoolean("need_oes_to_2d", false);
        OnekeyProcessParams onekeyProcessParams = pushBase2.LJIILJJIL;
        bundle.putBoolean("enableHDR", onekeyProcessParams.enableHDR);
        bundle.putBoolean("enableDenoise", onekeyProcessParams.enableDenoise);
        bundle.putBoolean("enableAfs", onekeyProcessParams.enableAfs);
        bundle.putBoolean("enableHdrV2", onekeyProcessParams.enableHdrV2);
        bundle.putBoolean("enableAsyncProcess", onekeyProcessParams.enableAsyncProcess);
        bundle.putBoolean("enableDayScene", onekeyProcessParams.enableDayScene);
        bundle.putBoolean("enableNightScene", onekeyProcessParams.enableNightScene);
        C786410Ut5.LJJJI("algParams", onekeyProcessParams.algParams, bundle);
        bundle.putBoolean("isFirstFrame", onekeyProcessParams.isFirstFrame);
        bundle.putBoolean("enableAlgoConfig", onekeyProcessParams.enableAlgoConfig);
        bundle.putBoolean("enableDetectAlgo", onekeyProcessParams.enableDetectAlgo);
        C786410Ut5.LJJJI("lutTablePath", str, bundle);
        bundle.putInt("cvdetectFrames", onekeyProcessParams.cvdetectFrames);
        bundle.putBoolean("enableOneKeyProcess", z2);
        bundle.putInt("est_rate_statistics_type", 2);
        bundle.putBoolean("camera_size_opt", true);
        bundle.putBoolean("enable_pts_adjust", liveSdkSetting2.LJFF);
        boolean z4 = liveSdkSetting2.LJIIJ;
        this.LLLL = z4;
        bundle.putBoolean("enable_e2e_delay_phase2", z4);
    }

    @Override // X.InterfaceC1270200j9u
    public final void LJIILIIL(int i, int i2, int i3, String str) {
        InterfaceC1269420j8e interfaceC1269420j8e;
        if (i == 2) {
            this.LLJILJILJ = i2;
            this.LLJILLL = i3;
        }
        WeakReference<InterfaceC1269420j8e> weakReference = this.LLIZLLLIL;
        if (weakReference != null && (interfaceC1269420j8e = weakReference.get()) != null) {
            interfaceC1269420j8e.LJIILIIL(i, i2, i3, str);
        }
    }

    @Override // X.InterfaceC1268690j7T
    public final int j3(int i, int i2, int i3, int i4) {
        C1270610jAZ c1270610jAZLLJILJIL = LLJILJIL();
        if (c1270610jAZLLJILJIL != null) {
            return c1270610jAZLLJILJIL.j3(i, i2, i3, i4);
        }
        return -1;
    }

    @Override // X.AbstractC1268600j7K
    public final int LLJ(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        VideoFrame videoFrame;
        TTLHSceneDetector tTLHSceneDetector;
        String str;
        try {
            this.LLJL.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AVLog.w("LiveStreamVideoCapture", e.toString());
        }
        if (this.LLLLII.LIZIZ.LJJIFFI && this.LLJLL == 0) {
            C1269520j8o.LIZ("startVideoCapture");
        }
        long j2 = j - this.LLJLL;
        boolean z = true;
        if (j2 < 0) {
            if (AVLog.enableLogToIODevice2()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LiveStreamVideoCapture.onFrame drop frame: diffUs ");
                sbLIZ.append(j2);
                AVLog.logToIODevice2(5, "LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ), null, 30, 10000);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BUG! time stamp revert");
            sbLIZ2.append(j);
            sbLIZ2.append(" vs. ");
            sbLIZ2.append(this.LLJLL);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
            C1274080jGA.LIZ.LIZ("LiveStreamVideoCapture.onFrame", androidRuntimeException);
            if (!C1274040jG6.LIZ() || this.LLJJL.LLIZ() == 1) {
                return -1;
            }
            throw androidRuntimeException;
        }
        this.LLJLL = j;
        if (this.LLJJIII != 1) {
            if (AVLog.enableLogToIODevice2()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("status ");
                sbLIZ3.append(this.LLJJIII);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("LiveStreamVideoCapture.onFrame drop frame: ");
                sbLIZ4.append(strLIZIZ);
                AVLog.logToIODevice2(5, "LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ4), null, 32, 10000);
            }
            return -1;
        }
        synchronized (this.LLJJIJI) {
            try {
                TTLHAbnormalDetectorJava tTLHAbnormalDetectorJava = this.LLLILZLLLI.get();
                if (tTLHAbnormalDetectorJava != null && (buffer instanceof InterfaceC1271560jC6)) {
                    InterfaceC1271560jC6 interfaceC1271560jC6 = (InterfaceC1271560jC6) buffer;
                    if (interfaceC1271560jC6.getType() != EnumC1273550jFJ.OES) {
                        z = false;
                    }
                    if (z) {
                        str = "TEXTURE_OES";
                    } else {
                        str = "TEXTURE_2D";
                    }
                    tTLHAbnormalDetectorJava.processTexture(buffer.getTextureId(), buffer.getWidth(), buffer.getHeight(), true, new C1275590jIb(str, 0, null, interfaceC1271560jC6.getTransformMatrix()));
                }
                WeakReference<TTLHSceneDetector> weakReference = this.LLLIZZ;
                if (weakReference != null && (tTLHSceneDetector = weakReference.get()) != null && (buffer instanceof InterfaceC1271560jC6)) {
                    tTLHSceneDetector.sceneDetect((InterfaceC1271560jC6) buffer, buffer.getWidth(), buffer.getHeight());
                }
                buffer.setVideoFrameCreator(this.LLLLIILL);
                if (this.LLLLII.LIZ.mPushBase.LJIJJLI()) {
                    C1266900j4a c1266900j4a = this.LL;
                    if (c1266900j4a != null) {
                        C1267620j5k c1267620j5k = c1266900j4a.LIZ.LLLZL;
                        if (c1267620j5k.LIZJ.LIZ != i || c1267620j5k.LIZJ.LIZIZ != i2) {
                            c1267620j5k.LIZJ.LIZ = i;
                            c1267620j5k.LIZJ.LIZIZ = i2;
                        }
                        C1266350j3h c1266350j3h = c1266900j4a.LIZ;
                        c1266350j3h.LLLZL.LIZ(c1266350j3h.LLJLILLLLZIIL, c1266350j3h.LLLZLL, false);
                    }
                    long j3 = 1000 * j;
                    C1271790jCT c1271790jCT = this.LLILLL;
                    if (c1271790jCT != null) {
                        videoFrame = c1271790jCT.LIZLLL(buffer, 0, j3);
                        if (videoFrame != null) {
                        }
                        return 0;
                    }
                    videoFrame = new VideoFrame(buffer, 0, j3);
                    if (LLJJ()) {
                        synchronized (this.LLLJL) {
                            try {
                                tryDeliverEvents(videoFrame, this.LLLJIL);
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                    this.LLLJ.LIZLLL(videoFrame);
                    return 0;
                }
                return super.LLJ(buffer, i, i2, 0, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSource
    public final void adaptOutputFormat(int i, int i2, int i3, int i4, int i5, TEBundle tEBundle) {
        this.LLLII = i5;
        this.LLLIILIL = i3;
        this.LLLIL = i4;
        C1270610jAZ c1270610jAZLLJILJIL = LLJILJIL();
        if (c1270610jAZLLJILJIL != null) {
            c1270610jAZLLJILJIL.LLLLLIL = i3;
            c1270610jAZLLJILJIL.LLLLLILLIL = i4;
            c1270610jAZLLJILJIL.LLLLLJIL = i5;
            c1270610jAZLLJILJIL.LLJJIJI();
        }
        if (LLJJ()) {
            C1269600j8w c1269600j8w = (C1269600j8w) C1269570j8t.LIZIZ(EnumC1269590j8v.UpdateVideoParameters, C1269570j8t.LIZJ);
            c1269600j8w.LJII = i;
            c1269600j8w.LJIIIIZZ = i2;
            c1269600j8w.LJIIIZ = i3;
            c1269600j8w.LJIIJ = i4;
            TEBundle tEBundleCopy = tEBundle.copy();
            c1269600j8w.LJIIJJI = tEBundleCopy;
            c1269600j8w.LJIIL = tEBundleCopy.toString();
            if (this.LLLLIIIILLL != null) {
                this.LLLLIIIILLL.LIZIZ(c1269600j8w.LIZJ(C1269570j8t.LIZIZ));
            }
            appendSerializedEvent(c1269600j8w);
            return;
        }
        super.nativeAdaptedOutputFormat(i, i2, this.LLLII, tEBundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Adapted output format ");
        sbLIZ.append(this.LLLIILIL);
        sbLIZ.append("x");
        sbLIZ.append(this.LLLIL);
        sbLIZ.append(e3.g);
        sbLIZ.append(i5);
        sbLIZ.append("fps adaptParams:");
        sbLIZ.append(tEBundle.toString());
        AVLog.logKibana(5, "LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ), null);
    }
}
