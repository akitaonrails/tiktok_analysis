package com.ss.android.ugc.aweme.player.sdk.impl;

import X.AbstractC586270Mz3;
import X.C00UI;
import X.C1471500oOa;
import X.C1472440oQ6;
import X.C1474810oTv;
import X.C1479490obT;
import X.C1479510obV;
import X.C1479900oc8;
import X.C1479920ocA;
import X.C1479980ocG;
import X.C1480430ocz;
import X.C1481110oe5;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1473260oRQ;
import X.EnumC1479760obu;
import X.InterfaceC1284280jWc;
import X.InterfaceC1471920oPG;
import X.InterfaceC1472010oPP;
import X.InterfaceC1472490oQB;
import X.InterfaceC1472880oQo;
import X.InterfaceC1479560oba;
import X.InterfaceC1480060ocO;
import X.InterfaceC1480120ocU;
import X.InterfaceC1480320oco;
import X.InterfaceC1480330ocp;
import X.InterfaceC1499700p84;
import Y.ARunnableS0S0300200_23;
import Y.ARunnableS123S0100000_23;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.util.PlayerMainHandler;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.tts.oecverify.BdTuring;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SimplifyAsyncPlayer implements InterfaceC1479560oba {
    public final InterfaceC1479560oba LIZ;
    public OnUIPlayListener LIZIZ;
    public HandlerThread LIZJ;
    public PlayHandler LIZLLL;
    public final PlayerMainHandler LJ = new PlayerMainHandler(Looper.getMainLooper());
    public String LJFF;
    public boolean LJI;

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ int LJJIJIL() {
        return -1;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJILLIZJL(String str, String str2) {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJJLIIIJJIZ(String str, boolean z) {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJJLIIIJLJLI() {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ boolean LJJLIIIJLLLLLLLZ(String str) {
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ boolean LJJLIL(String str) {
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ boolean LJJLJ(String str) {
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJJLL(InterfaceC1480060ocO interfaceC1480060ocO) {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJJZZI(InterfaceC1472880oQo interfaceC1472880oQo) {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJLL() {
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLLI() {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJLLILLLL() {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJLLL(C1479510obV c1479510obV) {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJLLLL(EnumC1473260oRQ enumC1473260oRQ) {
    }

    @Override // X.InterfaceC1479560oba
    public final /* synthetic */ void LJLLLLLL(int i) {
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJ() {
        return this.LIZ.LJ();
    }

    public final void LJII() {
        try {
            HandlerThread handlerThread = new HandlerThread("play_thread", 0);
            this.LIZJ = handlerThread;
            handlerThread.start();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZJ = null;
        }
        C1479920ocA c1479920ocA = new C1479920ocA(this);
        HandlerThread handlerThread2 = this.LIZJ;
        this.LIZLLL = new PlayHandler(c1479920ocA, handlerThread2 == null ? Looper.getMainLooper() : C786410Ut5.W2(handlerThread2), this.LIZ);
    }

    @Override // X.InterfaceC1479560oba
    public final C1472440oQ6 LJIIIIZZ() {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            return interfaceC1479560oba.LJIIIIZZ();
        }
        return null;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIIZ() {
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.LLILLJJLI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            this.LIZLLL.sendEmptyMessage(12);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIIZI() {
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.removeMessages(12);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJJIJIIJIL() {
        return this.LIZ.LJJIJIIJIL();
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJJLZIJ() {
        this.LIZ.LJJJLZIJ();
    }

    @Override // X.InterfaceC1479560oba
    public final int LJJLI() {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            return interfaceC1479560oba.LJJLI();
        }
        return 0;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJL() {
        this.LIZ.LJJLIIIJL();
    }

    @Override // X.InterfaceC1479560oba
    public final int LJJLIIJ() {
        return this.LIZ.LJJLIIJ();
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLJLI() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("render()");
            sbLIZ.append(this.LJFF);
            C1481110oe5.LIZIZ("SimplifyAsyncPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.sendEmptyMessage(8);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final String LJLJLJ() {
        return this.LIZ.LJLJLJ();
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJLJLLL() {
        return this.LIZ.LJLJLLL();
    }

    @Override // X.InterfaceC1479560oba
    public final long getCurrentPosition() {
        return this.LIZ.getCurrentPosition();
    }

    @Override // X.InterfaceC1479560oba
    public final long getDuration() {
        return this.LIZ.getDuration();
    }

    @Override // X.InterfaceC1479560oba
    public final EnumC1479760obu getPlayerType() {
        return this.LIZ.getPlayerType();
    }

    @Override // X.InterfaceC1479560oba
    public final int getState() {
        return this.LIZ.getState();
    }

    @Override // X.InterfaceC1479560oba
    public final C1471500oOa getVideoInfo() {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            return interfaceC1479560oba.getVideoInfo();
        }
        return null;
    }

    @Override // X.InterfaceC1479560oba
    public final void init() {
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.sendEmptyMessage(16);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final boolean isLoading() {
        return this.LIZ.isLoading();
    }

    @Override // X.InterfaceC1479560oba
    public final boolean isMute() {
        return this.LIZ.isMute();
    }

    @Override // X.InterfaceC1479560oba
    public final boolean isPaused() {
        return this.LIZ.isPaused();
    }

    @Override // X.InterfaceC1479560oba
    public final boolean isPlaying() {
        return this.LIZ.isPlaying();
    }

    @Override // X.InterfaceC1479560oba
    public final void pause() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pause()");
            sbLIZ.append(this.LJFF);
            C1481110oe5.LIZIZ("SimplifyAsyncPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.sendEmptyMessage(5);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void release() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release()");
            sbLIZ.append(this.LJFF);
            C1481110oe5.LIZIZ("SimplifyAsyncPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.removeCallbacksAndMessages(null);
            this.LIZLLL.sendEmptyMessage(7);
            this.LIZLLL.sendEmptyMessage(10);
            this.LJI = true;
            this.LIZLLL = null;
        }
        if (this.LIZJ != null) {
            this.LIZJ = null;
        }
        this.LJFF = null;
    }

    @Override // X.InterfaceC1479560oba
    public final void resume() {
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("SimplifyAsyncPlayer", "resume()");
        }
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.obtainMessage(4).sendToTarget();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void start() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start()");
            sbLIZ.append(this.LJFF);
            C1481110oe5.LIZIZ("SimplifyAsyncPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.sendEmptyMessage(3);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void stop() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stop()");
            sbLIZ.append(this.LJFF);
            C1481110oe5.LIZIZ("SimplifyAsyncPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.sendEmptyMessage(6);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJJ() {
        stop();
    }

    public static class PlayHandler extends BPEAHandler {
        public final InterfaceC1479560oba LL;
        public volatile int LLILLJJLI;
        public final InterfaceC1480120ocU LLILLL;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("SimplifyAsyncPlayer$PlayHandler@8f18.handleMessage");
            InterfaceC1479560oba interfaceC1479560oba = this.LL;
            if (interfaceC1479560oba == null) {
                C1C7U.LIZIZ("SimplifyAsyncPlayer$PlayHandler@8f18.handleMessage");
                return;
            }
            switch (message.what) {
                case 1:
                    interfaceC1479560oba.LJLIL((C1479510obV) HandlerHook.getMessageObj(message.obj));
                    break;
                case 3:
                    interfaceC1479560oba.start();
                    break;
                case 4:
                    if (HandlerHook.getMessageObj(message.obj) == null) {
                        this.LL.resume();
                    } else {
                        this.LL.LJJLIIIIJ((String) HandlerHook.getMessageObj(message.obj));
                    }
                    break;
                case 5:
                    interfaceC1479560oba.pause();
                    break;
                case 6:
                    interfaceC1479560oba.stop();
                    break;
                case 7:
                    interfaceC1479560oba.release();
                    break;
                case 8:
                    interfaceC1479560oba.LJJLJLI();
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    Pair pair = (Pair) HandlerHook.getMessageObj(message.obj);
                    if (pair != null) {
                        this.LL.LJIILLIIL(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                    }
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    removeMessages(12);
                    Looper looper = getLooper();
                    if (looper != null && looper != Looper.getMainLooper()) {
                        looper.quit();
                    }
                    InterfaceC1480120ocU interfaceC1480120ocU = this.LLILLL;
                    if (interfaceC1480120ocU != null) {
                        C1479920ocA c1479920ocA = (C1479920ocA) interfaceC1480120ocU;
                        C786410Ut5.LJJZZIII(c1479920ocA.LIZ.LJ, new ARunnableS123S0100000_23(c1479920ocA, 33));
                    }
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    interfaceC1479560oba.LJIILL(((Float) HandlerHook.getMessageObj(message.obj)).floatValue());
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    interfaceC1479560oba.LJLLI();
                    if (((Boolean) C1474810oTv.LLLLLLJ.getValue()).booleanValue()) {
                        removeMessages(12);
                    }
                    sendEmptyMessageDelayed(12, this.LLILLJJLI);
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    Pair pair2 = (Pair) HandlerHook.getMessageObj(message.obj);
                    if (pair2 != null) {
                        this.LL.LJLJJLL(((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
                    }
                    break;
                case 14:
                    interfaceC1479560oba.LJJL((SurfaceHolder) HandlerHook.getMessageObj(message.obj));
                    break;
                case 16:
                    interfaceC1479560oba.init();
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    C00UI c00ui = (C00UI) HandlerHook.getMessageObj(message.obj);
                    if (c00ui != null) {
                        this.LL.LJLJJI(c00ui);
                    }
                    break;
            }
            C1C7U.LIZIZ("SimplifyAsyncPlayer$PlayHandler@8f18.handleMessage");
        }

        public PlayHandler(C1479920ocA c1479920ocA, Looper looper, InterfaceC1479560oba interfaceC1479560oba) {
            super(looper);
            this.LLILLJJLI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            this.LL = interfaceC1479560oba;
            this.LLILLL = c1479920ocA;
        }
    }

    public SimplifyAsyncPlayer(C1479490obT c1479490obT) {
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("SimplifyAsyncPlayer", "SimplifyAsyncPlayer init");
        }
        this.LIZ = c1479490obT;
        LJII();
    }

    @Override // X.InterfaceC1479560oba
    public final void LIZ(boolean z) {
        this.LIZ.LIZ(z);
    }

    @Override // X.InterfaceC1479560oba
    public final <T> T LIZIZ(AbstractC586270Mz3<T> abstractC586270Mz3) {
        return (T) this.LIZ.LIZIZ(abstractC586270Mz3);
    }

    @Override // X.InterfaceC1479560oba
    public final void LIZJ(String str) {
        this.LIZ.LIZJ(str);
    }

    @Override // X.InterfaceC1479560oba
    public final float LJFF(int i) {
        return this.LIZ.LJFF(i);
    }

    @Override // X.InterfaceC1479560oba
    public final void LJI(float f) {
        this.LIZ.LJI(f);
    }

    @Override // X.InterfaceC1479560oba
    public final void LJIILL(float f) {
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.obtainMessage(11, Float.valueOf(f)).sendToTarget();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIJ(OnUIPlayListener onUIPlayListener) {
        this.LIZIZ = onUIPlayListener;
        this.LIZ.LJJIJ(onUIPlayListener);
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIJIIJI(int i) {
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            if (i > 0) {
                playHandler.LLILLJJLI = i;
            } else {
                playHandler.getClass();
            }
            this.LIZLLL.sendEmptyMessage(12);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIJL(InterfaceC1472010oPP interfaceC1472010oPP) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJIJL(interfaceC1472010oPP);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIJLIJ(boolean z) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJIJLIJ(z);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIL(Surface surface) {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSurfaceDirectly(), surface = ");
            sbLIZ.append(surface);
            sbLIZ.append(", mSimplifyPlayer = ");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(", ");
            sbLIZ.append(this.LJFF);
            C1481110oe5.LIZIZ("SimplifyAsyncPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ.LJJIL(surface);
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJIZ(String str) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJIZ(str);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJL(SurfaceHolder surfaceHolder) {
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.obtainMessage(14, surfaceHolder).sendToTarget();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIIJ(String str) {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resume()");
            sbLIZ.append(this.LJFF);
            C1481110oe5.LIZIZ("SimplifyAsyncPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.obtainMessage(4, str).sendToTarget();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJ(InterfaceC1471920oPG interfaceC1471920oPG) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJLIIIJ(interfaceC1471920oPG);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJLIIIJJI(int i) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJLIIIJJI(i);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJZZIII(InterfaceC1284280jWc interfaceC1284280jWc) {
        this.LIZ.LJJZZIII(interfaceC1284280jWc);
    }

    @Override // X.InterfaceC1479560oba
    public final void LJL(Bundle bundle) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJL(bundle);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLI(InterfaceC1480320oco interfaceC1480320oco) {
        this.LIZ.LJLI(interfaceC1480320oco);
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLIIIL(InterfaceC1472880oQo interfaceC1472880oQo) {
        this.LIZ.LJLIIIL(interfaceC1472880oQo);
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLIIL(InterfaceC1480330ocp interfaceC1480330ocp) {
        this.LIZ.LJLIIL(interfaceC1480330ocp);
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLIL(C1479510obV c1479510obV) {
        String str;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prepare()");
            if (c1479510obV != null) {
                str = c1479510obV.LJIIIZ;
            } else {
                str = "null";
            }
            sbLIZ.append(str);
            C1481110oe5.LIZIZ("SimplifyAsyncPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (c1479510obV == null) {
            return;
        }
        if (C1474810oTv.LJZI() == 2) {
            StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
            if (stackTrace.length > 0) {
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                }
                c1479510obV.LLIIZ = sb.toString();
            }
        }
        if (this.LJI) {
            C1481110oe5.LIZLLL("SimplifyAsyncPlayer", "mIsLastPlayThreadQuiting when prepare");
            return;
        }
        c1479510obV.LJZI = 1;
        this.LJFF = c1479510obV.LJIIIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c1479510obV.LJJIJIIJI && this.LIZIZ != null) {
            C1480430ocz c1480430ocz = new C1480430ocz(c1479510obV.LJIIIZ);
            c1480430ocz.LJII = isMute();
            C786410Ut5.LJJZZIII(this.LJ, new ARunnableS0S0300200_23(this, c1479510obV, c1480430ocz, jCurrentTimeMillis, jElapsedRealtime, 0));
        }
        if (c1479510obV.LJJIJ) {
            if (this.LIZLLL == null) {
                LJII();
            }
            this.LIZLLL.obtainMessage(1, c1479510obV).sendToTarget();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLILLLLZI(InterfaceC1499700p84 interfaceC1499700p84) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJLILLLLZI(interfaceC1499700p84);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJLJI(OnUIPlayListener onUIPlayListener) {
        OnUIPlayListener onUIPlayListener2 = this.LIZIZ;
        if (onUIPlayListener2 != null && onUIPlayListener2.getWrapperedListener() != null && this.LIZIZ.getWrapperedListener().equals(onUIPlayListener)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLJJI(C00UI c00ui) {
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.obtainMessage(17, c00ui).sendToTarget();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLJJL(InterfaceC1472490oQB interfaceC1472490oQB) {
        this.LIZ.LJLJJL(interfaceC1472490oQB);
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLLJ(C1479900oc8 c1479900oc8) {
        C1479980ocG.LIZ.LIZ = c1479900oc8;
    }

    @Override // X.InterfaceC1479560oba
    public final void setLoop(boolean z) {
        this.LIZ.setLoop(z);
    }

    @Override // X.InterfaceC1479560oba
    public final void setSurface(Surface surface) {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSurface(), surface = ");
            sbLIZ.append(surface);
            sbLIZ.append(", mSimplifyPlayer = ");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(", ");
            sbLIZ.append(this.LJFF);
            C1481110oe5.LIZIZ("SimplifyAsyncPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ.setSurface(surface);
    }

    @Override // X.InterfaceC1479560oba
    public final void LIZLLL(String str, String str2) {
        this.LIZ.LIZLLL(str, str2);
    }

    @Override // X.InterfaceC1479560oba
    public final void LJIILLIIL(float f, float f2) {
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.obtainMessage(9, new Pair(Float.valueOf(f), Float.valueOf(f2))).sendToTarget();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJJZ(int i, JSONObject jSONObject) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJJZ(i, jSONObject);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJJZ(int i, Bundle bundle) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJZ(i, bundle);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLJJLL(int i, int i2) {
        PlayHandler playHandler = this.LIZLLL;
        if (playHandler != null) {
            playHandler.obtainMessage(13, new Pair(Integer.valueOf(i), Integer.valueOf(i2))).sendToTarget();
        }
    }

    @Override // X.InterfaceC1479560oba
    public final void LJLJL(Bundle bundle, boolean z) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJLJL(bundle, z);
        }
    }

    @Override // X.InterfaceC1479560oba
    public final boolean LJLZ(String str, String str2) {
        return TextUtils.equals(str, this.LJFF);
    }
}
