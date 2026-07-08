package com.bytedance.live.render.engine.alphaplayer.controller;

import X.C1141050fnb;
import X.C1141100fng;
import X.C1141240fnu;
import X.C1141290fnz;
import X.C1149270g0r;
import X.C1287450jbj;
import X.C1292130jjH;
import X.C1292170jjL;
import X.C176600m4;
import X.C1954807lC;
import X.C1BY7;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2246691Cwd;
import X.C2246761Cwk;
import X.C2246791Cwn;
import X.C2246801Cwo;
import X.C2246821Cwq;
import X.C2246851Cwt;
import X.C2246861Cwu;
import X.C2246931Cx1;
import X.C2246971Cx5;
import X.C2246981Cx6;
import X.C2247041CxC;
import X.C2247221CxU;
import X.C2247291Cxb;
import X.C786410Ut5;
import X.EnumC1778680wO2;
import X.EnumC2246911Cwz;
import X.InterfaceC1292160jjK;
import X.InterfaceC2246811Cwp;
import X.InterfaceC2247071CxF;
import X.InterfaceC2247101CxI;
import X.InterfaceC2247111CxJ;
import X.InterfaceC2247121CxK;
import X.InterfaceC2247141CxM;
import Y.ARunnableS103S0200000_34;
import Y.ARunnableS134S0100000_34;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFixVideoGiftQueuePerfSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS383S0200000_17;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class LocalPlayerControllerKotlin implements IPlayerController, Handler.Callback, GenericLifecycleObserver {
    public static final /* synthetic */ int LLLI = 0;
    public final boolean LL;
    public long LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public Context LLIZ;
    public IMonitor LLIZLLLIL;
    public AlphaPlayerAction LLJ;
    public IMediaPlayer<AbsPlayer<AbsPlayer<?>>> LLJI;
    public BPEAHandler LLJIJIL;
    public HandlerThread LLJILJILJ;
    public InterfaceC2246811Cwp LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public volatile boolean LLJJIJIIJIL;
    public final C2246821Cwq LLJJJ;
    public LifecycleOwner LLJJJIL;
    public boolean LLJJJJ;
    public C2247291Cxb LLJJJJJIL;
    public JSONObject LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final AtomicBoolean LLJL;
    public InterfaceC2247071CxF LLJLIL;
    public C1141100fng LLJLILLLLZIIL;
    public long LLJLL;
    public Surface LLJLLIL;
    public final C2246791Cwn LLJLLL;
    public final C2246691Cwd LLJZ;
    public final C2246761Cwk LLJZIJLIL;
    public final C2246861Cwu LLL;
    public final ARunnableS134S0100000_34 LLLF;
    public final ARunnableS134S0100000_34 LLLFF;
    public final C2246931Cx1 LLLFFI;
    public final C2246801Cwo LLLFZ;
    public final List<MaskSrc> LLILZIL = new ArrayList();
    public EnumC2246911Cwz LLILZLL = EnumC2246911Cwz.NOT_PREPARED;
    public final BPEAHandler LLJILJIL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLJJIJIL = true;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LJII(this, C2246971Cx5.LIZ(6, null));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void pause() {
        LJII(this, C2246971Cx5.LIZ(3, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void release() {
        LJII(this, C2246971Cx5.LIZ(6, null));
        LifecycleOwner lifecycleOwner = this.LLJJJIL;
        if (lifecycleOwner != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
            this.LLJJJIL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void resume() {
        LJII(this, C2246971Cx5.LIZ(4, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setPrepareListener(InterfaceC2247141CxM interfaceC2247141CxM) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void stop() {
        LJII(this, C2246971Cx5.LIZ(5, null));
    }

    public final void LIZ() {
        List<MaskSrc> list = this.LLILZIL;
        if (list != null) {
            ((ArrayList) list).clear();
        }
    }

    public final float LIZJ() {
        C2247291Cxb c2247291Cxb = this.LLJJJJJIL;
        if (c2247291Cxb == null) {
            return 0.0f;
        }
        if (c2247291Cxb.LLLIIIIL <= 0) {
            return -1.0f;
        }
        float f = (r3 - c2247291Cxb.LLLIIII) / 1000.0f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("frame : ");
        sbLIZ.append(c2247291Cxb.LLLII);
        sbLIZ.append(", duration: ");
        sbLIZ.append(f);
        C1141240fnu.LIZLLL("LocalVideoRendererKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        return c2247291Cxb.LLLII / f;
    }

    public final void LIZLLL() {
        C2246981Cx6 c2246981Cx6;
        try {
            IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer = this.LLJI;
            if (iMediaPlayer != null) {
                iMediaPlayer.initMediaPlayer();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            IMonitor iMonitor = this.LLIZLLLIL;
            if (iMonitor != null) {
                IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer2 = this.LLJI;
                iMonitor.monitorInit(iMediaPlayer2 != null ? iMediaPlayer2.getPlayerSimpleName() : "unknown", e);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initMediaPlayer failed, fallback to system player, msgId=");
            sbLIZ.append(this.LLILLJJLI);
            C20441214yg.LJFF("LocalPlayerControllerKotlin_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ), e);
            C2247221CxU c2247221CxU = new C2247221CxU();
            c2247221CxU.initMediaPlayer();
            this.LLJI = c2247221CxU;
            this.LLJJJ.LIZ = c2247221CxU;
        }
        IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer3 = this.LLJI;
        if (iMediaPlayer3 != null) {
            iMediaPlayer3.setScreenOnWhilePlaying(true);
        }
        IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer4 = this.LLJI;
        if (iMediaPlayer4 != null) {
            iMediaPlayer4.setLooping(this.LLJJJJ);
        }
        if (this.LLJLLL == null) {
            C20441214yg.LJ("LocalPlayerControllerKotlin_gift_video_engine", "initMediaPlayer playerFirstFrameListener null, msgId=" + this.LLILLJJLI);
        }
        if (this.LLJZIJLIL == null) {
            C20441214yg.LJ("LocalPlayerControllerKotlin_gift_video_engine", "initMediaPlayer playerCompletionListener is null, msgId=" + this.LLILLJJLI);
        }
        if (this.LLJZ == null) {
            C20441214yg.LJ("LocalPlayerControllerKotlin_gift_video_engine", "initMediaPlayer playerProgressListener is null, msgId=" + this.LLILLJJLI);
        }
        if (this.LLL == null) {
            C20441214yg.LJ("LocalPlayerControllerKotlin_gift_video_engine", "initMediaPlayer playerSRPlayListener is null, msgId=" + this.LLILLJJLI);
        }
        IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer5 = this.LLJI;
        if (iMediaPlayer5 != null) {
            iMediaPlayer5.setOnFirstFrameListener(this.LLJLLL);
        }
        IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer6 = this.LLJI;
        if (iMediaPlayer6 != null) {
            iMediaPlayer6.setOnCompletionListener(this.LLJZIJLIL);
        }
        IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer7 = this.LLJI;
        if ((iMediaPlayer7 instanceof C2246981Cx6) && (c2246981Cx6 = (C2246981Cx6) iMediaPlayer7) != null) {
            c2246981Cx6.LJIIL = this.LLJZ;
        }
        if (iMediaPlayer7 instanceof InterfaceC2247111CxJ) {
            ((InterfaceC2247111CxJ) iMediaPlayer7).LIZ(this.LLL);
        }
    }

    public final void LJFF() {
        IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer;
        if (this.LLJJIII <= 0 && (iMediaPlayer = this.LLJI) != null) {
            VideoInfo videoInfo = iMediaPlayer.getVideoInfo();
            this.LLJJ = (videoInfo != null ? videoInfo.getVideoWidth() : 0) / 2;
            this.LLJJI = videoInfo != null ? videoInfo.getVideoHeight() : 0;
        }
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.LLJILLL;
        if (interfaceC2246811Cwp == null) {
            return;
        }
        interfaceC2246811Cwp.LIZLLL(this.LLJJ, this.LLJJI);
        InterfaceC2246811Cwp interfaceC2246811Cwp2 = this.LLJILLL;
        DataSource.ScaleType scaleType = interfaceC2246811Cwp2 != null ? interfaceC2246811Cwp2.getScaleType() : null;
        BPEAHandler bPEAHandler = this.LLJILJIL;
        if (bPEAHandler != null) {
            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS103S0200000_34(this, scaleType, 3));
        }
    }

    public final void LJI() {
        IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer = this.LLJI;
        if (iMediaPlayer == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prepareAsync skip, mediaPlayer null, msgId=");
            sbLIZ.append(this.LLILLJJLI);
            C20441214yg.LJ("LocalPlayerControllerKotlin_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        EnumC2246911Cwz enumC2246911Cwz = this.LLILZLL;
        if (enumC2246911Cwz == EnumC2246911Cwz.NOT_PREPARED || enumC2246911Cwz == EnumC2246911Cwz.STOPPED) {
            iMediaPlayer.setOnPreparedListener(this.LLLFFI);
            IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer2 = this.LLJI;
            if (iMediaPlayer2 != null) {
                iMediaPlayer2.setOnErrorListener(this.LLLFZ);
            }
            IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer3 = this.LLJI;
            if (iMediaPlayer3 != null) {
                iMediaPlayer3.prepareAsync();
            }
        }
    }

    public final float LJIIL() {
        IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer = this.LLJI;
        if (iMediaPlayer != null) {
            try {
                VideoInfo videoInfo = iMediaPlayer.getVideoInfo();
                if (videoInfo instanceof C2247041CxC) {
                    return ((C2247041CxC) videoInfo).LIZ;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void cancel() {
        LJII(this, C2246971Cx5.LIZ(12, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final int getCurFrame() {
        if (this.LLJI == null || this.LLJJIJI == 0) {
            return -1;
        }
        float duration = getDuration();
        if (duration <= 0.0f) {
            return -1;
        }
        float currentPosition = (this.LLJI != null ? r0.getCurrentPosition() : 0) / duration;
        if (currentPosition > 1.0f) {
            currentPosition -= (long) currentPosition;
        }
        return (int) Math.ceil(currentPosition * this.LLJJIJI);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final int getDuration() {
        IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer = this.LLJI;
        int duration = -1;
        if (iMediaPlayer == null) {
            return -1;
        }
        try {
            VideoInfo videoInfo = iMediaPlayer.getVideoInfo();
            if (videoInfo != null) {
                duration = videoInfo.getDuration();
                return duration;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return duration;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final String getPlayerType() {
        IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer = this.LLJI;
        return iMediaPlayer != null ? iMediaPlayer.getPlayerSimpleName() : "unknown";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final View getView() {
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.LLJILLL;
        if (interfaceC2246811Cwp != null) {
            return interfaceC2246811Cwp.getView();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final boolean isPlaying() {
        IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer = this.LLJI;
        return iMediaPlayer != null && C176600m4.LIZIZ(Boolean.valueOf(iMediaPlayer.isPlaying()));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void reset() {
        LJII(this, C2246971Cx5.LIZ(9, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void startPlay() {
        if (this.LLJI != null) {
            switch (C2246851Cwt.LIZ[this.LLILZLL.ordinal()]) {
                case 1:
                case 2:
                    return;
                case 3:
                    IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer = this.LLJI;
                    if (iMediaPlayer != null) {
                        iMediaPlayer.start();
                    }
                    this.LLJLL = System.currentTimeMillis();
                    this.LLILLL = true;
                    this.LLILZLL = EnumC2246911Cwz.STARTED;
                    BPEAHandler bPEAHandler = this.LLJILJIL;
                    if (bPEAHandler != null) {
                        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS134S0100000_34(this, 11));
                    }
                    long j = C1141290fnz.LIZ().LJFF;
                    if (j > 0) {
                        BPEAHandler bPEAHandler2 = this.LLJILJIL;
                        if (bPEAHandler2 != null) {
                            bPEAHandler2.removeCallbacks(this.LLLF);
                        }
                        BPEAHandler bPEAHandler3 = this.LLJILJIL;
                        if (bPEAHandler3 != null) {
                            C786410Ut5.LJLIIL(j, bPEAHandler3, this.LLLF);
                        }
                    }
                    this.LLJJJ.LIZJ();
                    return;
                case 4:
                    IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer2 = this.LLJI;
                    if (iMediaPlayer2 != null) {
                        iMediaPlayer2.start();
                    }
                    this.LLILZLL = EnumC2246911Cwz.STARTED;
                    this.LLJJJ.LIZJ();
                    return;
                case 5:
                case 6:
                    try {
                        LJI();
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LJ(false, 0, 0, "prepare and start MediaPlayer failure.");
                        LIZIZ(new C1141050fnb(-23, "prepare and start MediaPlayer failure.", null));
                        return;
                    }
                default:
                    throw new C1954807lC();
            }
        }
    }

    public final void LJIIJJI() {
        long j = C1141290fnz.LIZ().LJI;
        if (j > 0) {
            BPEAHandler bPEAHandler = this.LLJILJIL;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacks(this.LLLFF);
            }
            BPEAHandler bPEAHandler2 = this.LLJILJIL;
            if (bPEAHandler2 != null) {
                C786410Ut5.LJLIIL(j, bPEAHandler2, this.LLLFF);
            }
        }
    }

    public final void LIZIZ(final C1141050fnb c1141050fnb) {
        final long j = this.LLILLJJLI;
        this.LLILLL = false;
        this.LLILLJJLI = 0L;
        if (c1141050fnb != null && c1141050fnb.LIZ == -23) {
            C1BY7.LIZ.storeBoolean("has_gift_play_internal_error", true);
        }
        BPEAHandler bPEAHandler = this.LLJILJIL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(this.LLLF);
        }
        BPEAHandler bPEAHandler2 = this.LLJILJIL;
        if (bPEAHandler2 != null) {
            bPEAHandler2.removeCallbacks(this.LLLFF);
        }
        BPEAHandler bPEAHandler3 = this.LLJILJIL;
        if (bPEAHandler3 != null) {
            C786410Ut5.LJJZZIII(bPEAHandler3, new Runnable() { // from class: X.1Cwj
                public final void LIZ() {
                    AlphaPlayerAction alphaPlayerAction = this.LL.LLJ;
                    if (alphaPlayerAction != null) {
                        if (!(alphaPlayerAction instanceof InterfaceC2246741Cwi)) {
                            alphaPlayerAction.endAction();
                            return;
                        }
                        C1141050fnb c1141050fnb2 = c1141050fnb;
                        if (c1141050fnb2 == null) {
                            alphaPlayerAction.endAction();
                            return;
                        } else {
                            ((InterfaceC2246741Cwi) alphaPlayerAction).LIZ(c1141050fnb2);
                            return;
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("emitEndSignal dropped, alphaPlayerAction null, msgId=");
                    sbLIZ.append(j);
                    sbLIZ.append(", err=");
                    sbLIZ.append(c1141050fnb);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C1141050fnb c1141050fnb3 = c1141050fnb;
                    C20441214yg.LJFF("LocalPlayerControllerKotlin_gift_video_engine", strLIZIZ, c1141050fnb3 != null ? c1141050fnb3.LIZJ : null);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LocalPlayerControllerKotlin@6bf5.emitEndSignal$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LocalPlayerControllerKotlin@6bf5.emitEndSignal$1");
                }
            });
        }
        this.LLJJJ.LIZLLL();
        this.LLJL.set(false);
    }

    public final void LJIIIIZZ(InterfaceC2247121CxK interfaceC2247121CxK) {
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.LLJILLL;
        if (interfaceC2246811Cwp != null) {
            interfaceC2246811Cwp.setFirstGLFrameListener(interfaceC2247121CxK);
        }
    }

    public final void LJIIIZ(int i) {
        C2247291Cxb c2247291Cxb;
        View view;
        if (this.LLJILLL != null && this.LLJJJJJIL != null && i == EnumC1778680wO2.PAD.getValue() && (c2247291Cxb = this.LLJJJJJIL) != null) {
            InterfaceC2246811Cwp interfaceC2246811Cwp = this.LLJILLL;
            if (interfaceC2246811Cwp != null && (view = interfaceC2246811Cwp.getView()) != null) {
                view.getContext();
            }
            c2247291Cxb.LLJLIL = new C1287450jbj();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource r10) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin.LJIIJ(com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource):void");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void attachAlphaView(ViewGroup viewGroup) {
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.LLJILLL;
        if (interfaceC2246811Cwp != null && C176600m4.LIZIZ(Boolean.valueOf(interfaceC2246811Cwp.LJ(viewGroup)))) {
            this.LLJJIJIIJIL = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void detachAlphaView(ViewGroup viewGroup) {
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.LLJILLL;
        if (interfaceC2246811Cwp != null && C176600m4.LIZIZ(Boolean.valueOf(interfaceC2246811Cwp.LIZJ(viewGroup)))) {
            this.LLJJIJIIJIL = false;
        }
        BPEAHandler bPEAHandler = this.LLJILJIL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(this.LLLFF);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r8) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin.handleMessage(android.os.Message):boolean");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void seekTo(int i) {
        IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer = this.LLJI;
        if (iMediaPlayer != null) {
            iMediaPlayer.seekTo(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setMask(MaskSrc maskSrc) {
        LJII(this, C2246971Cx5.LIZ(11, maskSrc));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setMonitor(IMonitor iMonitor) {
        this.LLIZLLLIL = iMonitor;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setOnElementClickListener(InterfaceC1292160jjK interfaceC1292160jjK) {
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.LLJILLL;
        if (interfaceC2246811Cwp != null) {
            interfaceC2246811Cwp.setOnElementClickListener(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setSurface(Surface surface) {
        LJII(this, C2246971Cx5.LIZ(7, surface));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setVisibility(int i) {
        InterfaceC2246811Cwp interfaceC2246811Cwp;
        InterfaceC2246811Cwp interfaceC2246811Cwp2 = this.LLJILLL;
        if (interfaceC2246811Cwp2 != null) {
            interfaceC2246811Cwp2.setVisibility(i);
            if (i == 0 && (interfaceC2246811Cwp = this.LLJILLL) != null) {
                interfaceC2246811Cwp.bringToFront();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void start(DataSource dataSource) {
        this.LLILLJJLI = dataSource.getMessageId();
        boolean zIsValid = dataSource.isValid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start isValid=");
        sbLIZ.append(zIsValid);
        C20441214yg.LJIIIZ("LocalPlayerControllerKotlin_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        if (zIsValid) {
            setVisibility(0);
            LJII(this, C2246971Cx5.LIZ(1, dataSource));
            LJIIJJI();
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dataSource is invalid when start. ErrorInfo: ");
            sbLIZ2.append(dataSource.getErrorInfo());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            LIZIZ(new C1141050fnb(-21, strLIZIZ, null));
            LJ(false, 0, 0, strLIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final IPlayerController withVideoAction(AlphaPlayerAction alphaPlayerAction) {
        this.LLJ = alphaPlayerAction;
        return this;
    }

    public static void LJII(LocalPlayerControllerKotlin localPlayerControllerKotlin, Message message) {
        Boolean boolValueOf;
        HandlerThread handlerThread = localPlayerControllerKotlin.LLJILJILJ;
        if (handlerThread != null && C176600m4.LIZIZ(Boolean.valueOf(handlerThread.isAlive()))) {
            HandlerThread handlerThread2 = localPlayerControllerKotlin.LLJILJILJ;
            BPEAHandler bPEAHandler = null;
            if (handlerThread2 != null) {
                boolValueOf = Boolean.valueOf(handlerThread2.isInterrupted());
            } else {
                boolValueOf = null;
            }
            if (!C176600m4.LIZIZ(boolValueOf)) {
                if (localPlayerControllerKotlin.LLJIJIL == null) {
                    HandlerThread handlerThread3 = localPlayerControllerKotlin.LLJILJILJ;
                    if (handlerThread3 != null) {
                        bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread3), localPlayerControllerKotlin);
                    }
                    localPlayerControllerKotlin.LLJIJIL = bPEAHandler;
                }
                BPEAHandler bPEAHandler2 = localPlayerControllerKotlin.LLJIJIL;
                if (bPEAHandler2 != null) {
                    C786410Ut5.LJLJLJ(bPEAHandler2, message, 0L);
                    return;
                }
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendMessage dropped, playThread dead, what=");
        sbLIZ.append(message.what);
        sbLIZ.append(", msgId=");
        sbLIZ.append(localPlayerControllerKotlin.LLILLJJLI);
        C20441214yg.LJ("LocalPlayerControllerKotlin_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setProgressListener(IProgressListener iProgressListener, long j) {
        C2246821Cwq c2246821Cwq = this.LLJJJ;
        if (iProgressListener != null) {
            c2246821Cwq.LIZIZ = iProgressListener;
        } else {
            c2246821Cwq.LIZIZ = C2246821Cwq.LJFF;
        }
        c2246821Cwq.LIZJ = j;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void startWithLastFrameHold(DataSource dataSource, boolean z) {
        String errorInfo;
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.LLJILLL;
        if (interfaceC2246811Cwp != null) {
            interfaceC2246811Cwp.setLastFrameHold(z);
        }
        DataSource dataSourceCopy = DataSource.copy(dataSource);
        this.LLILLJJLI = dataSource.getMessageId();
        boolean zIsValid = dataSource.isValid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startWithLastFrameHold isValid=");
        sbLIZ.append(zIsValid);
        C20441214yg.LJIIIZ("LocalPlayerControllerKotlin_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        if (zIsValid) {
            setVisibility(0);
            LJIIJJI();
            LJII(this, C2246971Cx5.LIZ(1, dataSourceCopy));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("dataSource is invalid when startWithLastFrameHold. ErrorInfo: ");
        if (dataSourceCopy != null) {
            errorInfo = dataSourceCopy.getErrorInfo();
        } else {
            errorInfo = "null";
        }
        sbLIZ2.append(errorInfo);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        LIZIZ(new C1141050fnb(-21, strLIZIZ, null));
        LJ(false, 0, 0, strLIZIZ);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.1Cx1] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.1Cwo] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1Cwn] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.1Cwk] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.1Cwu] */
    public LocalPlayerControllerKotlin(Configuration configuration, IMediaPlayer iMediaPlayer, boolean z) {
        this.LL = z;
        C2246821Cwq c2246821Cwq = new C2246821Cwq();
        this.LLJJJ = c2246821Cwq;
        this.LLJL = new AtomicBoolean(false);
        this.LLJLLL = new IMediaPlayer.OnFirstFrameListener<AbsPlayer<AbsPlayer<?>>>() { // from class: X.1Cwn
            {
                C20441214yg.LJIIIZ("LocalPlayerControllerKotlin_gift_video_engine", "init playerFirstFrameListener");
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnFirstFrameListener
            public final void onFirstFrame(AbsPlayer<AbsPlayer<?>> absPlayer) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LIZ;
                long j = jCurrentTimeMillis - localPlayerControllerKotlin.LLJLL;
                InterfaceC2246811Cwp interfaceC2246811Cwp = localPlayerControllerKotlin.LLJILLL;
                if (interfaceC2246811Cwp != null) {
                    interfaceC2246811Cwp.LJII();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onFirstFrame, firstFrameDuration=");
                    sbLIZ.append(j);
                    C1149270g0r.LIZ("LocalPlayerControllerKotlin_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                    C2246671Cwb.LIZ.getClass();
                    long j2 = C2246671Cwb.LJIIJ;
                    if (1 <= j2 && j2 < 4000) {
                        return;
                    }
                    C2246671Cwb.LJIIJ = j;
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sdk onFirstFrame fired fail, msgId=");
                sbLIZ2.append(this.LIZ.LLILLJJLI);
                sbLIZ2.append(", firstFrameDur=");
                sbLIZ2.append(j);
                C20441214yg.LJ("LocalPlayerControllerKotlin_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
            }
        };
        this.LLJZ = new C2246691Cwd(this);
        this.LLJZIJLIL = new IMediaPlayer.OnCompletionListener<AbsPlayer<AbsPlayer<?>>>() { // from class: X.1Cwk
            {
                C20441214yg.LIZIZ("LocalPlayerControllerKotlin_gift_video_engine", "init playerCompletionListener");
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnCompletionListener
            public final void onCompletion(AbsPlayer<AbsPlayer<?>> absPlayer) {
                C2246981Cx6 c2246981Cx6;
                boolean z2;
                boolean z3;
                Integer numValueOf;
                Object obj;
                C2246981Cx6 c2246981Cx62;
                AbsPlayer<AbsPlayer<?>> absPlayer2 = absPlayer;
                LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LIZ;
                boolean z4 = absPlayer2 instanceof C2246981Cx6;
                Object obj2 = null;
                if (z4) {
                    c2246981Cx6 = (C2246981Cx6) absPlayer2;
                } else {
                    c2246981Cx6 = null;
                }
                if (c2246981Cx6 != null) {
                    z2 = c2246981Cx6.LIZIZ;
                } else {
                    z2 = false;
                }
                localPlayerControllerKotlin.LLJJL = z2;
                if (z4 && (c2246981Cx62 = (C2246981Cx6) absPlayer2) != null) {
                    z3 = c2246981Cx62.LIZJ;
                } else {
                    z3 = false;
                }
                localPlayerControllerKotlin.LLJJLIIIJLLLLLLLZ = z3;
                if (localPlayerControllerKotlin.LLJJIJIIJIL && this.LIZ.LLJJJJ) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCompletion, isReplay=");
                sbLIZ.append(this.LIZ.LLJJL);
                sbLIZ.append(", isPreload=");
                sbLIZ.append(this.LIZ.LLJJLIIIJLLLLLLLZ);
                sbLIZ.append(", player=");
                sbLIZ.append(absPlayer2);
                sbLIZ.append(", IVideoMessageQueueOperatorProvider=");
                C1141100fng c1141100fng = this.LIZ.LLJLILLLLZIIL;
                if (c1141100fng != null && (obj = c1141100fng.LIZLLL.get(InterfaceC1139410fkx.class)) != null) {
                    numValueOf = Integer.valueOf(obj.hashCode());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C1149270g0r.LIZ("LocalPlayerControllerKotlin_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
                if (!LiveGiftFixVideoGiftQueuePerfSetting.INSTANCE.isEnabled() && LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReplay()) {
                    LocalPlayerControllerKotlin localPlayerControllerKotlin2 = this.LIZ;
                    if (localPlayerControllerKotlin2.LL && z4) {
                        C1141100fng c1141100fng2 = localPlayerControllerKotlin2.LLJLILLLLZIIL;
                        if (c1141100fng2 != null) {
                            Object obj3 = c1141100fng2.LIZLLL.get(InterfaceC1139410fkx.class);
                            if (obj3 != null) {
                                obj2 = obj3;
                            }
                            InterfaceC1139410fkx interfaceC1139410fkx = (InterfaceC1139410fkx) obj2;
                            if (interfaceC1139410fkx != null) {
                                C013C c013c = new C013C();
                                CountDownLatch countDownLatch = new CountDownLatch(1);
                                try {
                                    interfaceC1139410fkx.LIZ(new AwS383S0200000_17(c013c, countDownLatch, 45));
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    countDownLatch.countDown();
                                }
                                try {
                                    countDownLatch.await(1L, TimeUnit.SECONDS);
                                } catch (InterruptedException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                                LIZ(absPlayer2, c013c.element);
                                return;
                            }
                        }
                        LIZ(absPlayer2, false);
                        return;
                    }
                }
                LIZ(absPlayer2, false);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer<com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer<?>> r5, boolean r6) {
                /*
                    r4 = this;
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "doOnCompletion, canNextEffectReplay="
                    r1.append(r0)
                    r1.append(r6)
                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                    java.lang.String r0 = "LocalPlayerControllerKotlin_gift_video_engine"
                    X.C1149270g0r.LIZ(r0, r1)
                    com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin r1 = r4.LIZ
                    boolean r0 = r1.LLJJIJIL
                    if (r0 == 0) goto L2d
                    X.1Cwp r0 = r1.LLJILLL
                    if (r0 == 0) goto L22
                    r0.onCompletion()
                L22:
                    com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin r0 = r4.LIZ
                    java.util.List<com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc> r0 = r0.LLILZIL
                    if (r0 == 0) goto L2d
                    java.util.ArrayList r0 = (java.util.ArrayList) r0
                    r0.clear()
                L2d:
                    com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting r0 = com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting.INSTANCE
                    boolean r0 = r0.isEnableReplay()
                    if (r0 == 0) goto L5d
                    com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin r1 = r4.LIZ
                    boolean r0 = r1.LL
                    if (r0 == 0) goto L5d
                    boolean r0 = r5 instanceof X.C2246981Cx6
                    if (r0 == 0) goto L5d
                    if (r6 == 0) goto L53
                    X.1Cwz r0 = X.EnumC2246911Cwz.PAUSED
                    r1.LLILZLL = r0
                L45:
                    com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin r3 = r4.LIZ
                    r2 = 1
                    r0 = 0
                    r1 = 0
                    r3.LJ(r2, r0, r0, r1)
                    com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin r0 = r4.LIZ
                    r0.LIZIZ(r1)
                    return
                L53:
                    r5.stop()
                    com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin r1 = r4.LIZ
                    X.1Cwz r0 = X.EnumC2246911Cwz.STOPPED
                    r1.LLILZLL = r0
                    goto L45
                L5d:
                    com.bytedance.live.render.engine.alphaplayer.controller.LocalPlayerControllerKotlin r1 = r4.LIZ
                    X.1Cwz r0 = X.EnumC2246911Cwz.PAUSED
                    r1.LLILZLL = r0
                    goto L45
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2246761Cwk.LIZ(com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, boolean):void");
            }
        };
        this.LLL = new InterfaceC2247101CxI() { // from class: X.1Cwu
            @Override // X.InterfaceC2247101CxI
            public final void LIZIZ() {
                try {
                    this.LIZ.LLJJJJLIIL = new JSONObject().put("is_super_resolution_enable", 0);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            {
                C20441214yg.LIZIZ("LocalPlayerControllerKotlin_gift_video_engine", "init playerSRPlayListener");
            }

            @Override // X.InterfaceC2247101CxI
            public final void LIZ(int i) {
                try {
                    this.LIZ.LLJJJJLIIL = new JSONObject().put("is_super_resolution_enable", 1).put("super_resolution_status", i);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init, ");
        sbLIZ.append(this);
        C1149270g0r.LIZ("LocalPlayerControllerKotlin_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        Context context = configuration.getContext();
        LifecycleOwner lifecycleOwner = configuration.getLifecycleOwner();
        String threadName = configuration.getThreadName();
        this.LLIZ = context;
        this.LLJJJIL = lifecycleOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        HandlerThread handlerThread = new HandlerThread(threadName, 10);
        this.LLJILJILJ = handlerThread;
        handlerThread.start();
        this.LLJIJIL = new BPEAHandler(C786410Ut5.W2(handlerThread), this);
        int alphaVideoViewType = configuration.getAlphaVideoViewType();
        boolean zIsEnableRendererWorkerThread = configuration.isEnableRendererWorkerThread();
        boolean zIsEnableElementEvent = configuration.isEnableElementEvent();
        if (alphaVideoViewType == 1) {
            this.LLJILLL = new C1292130jjH(this.LLIZ);
        } else {
            this.LLJILLL = new C1292170jjL(this.LLIZ);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        InterfaceC2246811Cwp interfaceC2246811Cwp = this.LLJILLL;
        if (interfaceC2246811Cwp != null) {
            interfaceC2246811Cwp.setLayoutParams(layoutParams);
            InterfaceC2246811Cwp interfaceC2246811Cwp2 = this.LLJILLL;
            if (interfaceC2246811Cwp2 != null) {
                interfaceC2246811Cwp2.setPlayerController(this);
            }
            C2247291Cxb c2247291Cxb = new C2247291Cxb(this.LLJILLL, zIsEnableRendererWorkerThread);
            this.LLJJJJJIL = c2247291Cxb;
            InterfaceC2246811Cwp interfaceC2246811Cwp3 = this.LLJILLL;
            if (interfaceC2246811Cwp3 != null) {
                interfaceC2246811Cwp3.setVideoRenderer(c2247291Cxb);
            }
            InterfaceC2246811Cwp interfaceC2246811Cwp4 = this.LLJILLL;
            if (interfaceC2246811Cwp4 != null) {
                interfaceC2246811Cwp4.setEnableElementEvent(zIsEnableElementEvent);
            }
        }
        if (iMediaPlayer == null) {
            this.LLJI = new DefaultSystemPlayer();
        } else {
            this.LLJI = iMediaPlayer;
        }
        c2246821Cwq.LIZ = this.LLJI;
        LJII(this, C2246971Cx5.LIZ(10, null));
        this.LLLF = new ARunnableS134S0100000_34(this, 9);
        this.LLLFF = new ARunnableS134S0100000_34(this, 10);
        this.LLLFFI = new IMediaPlayer.OnPreparedListener<AbsPlayer<AbsPlayer<?>>>() { // from class: X.1Cx1
            @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnPreparedListener
            public final void onPrepared(AbsPlayer<AbsPlayer<?>> absPlayer) {
                LocalPlayerControllerKotlin.LJII(this.LIZ, C2246971Cx5.LIZ(2, null));
            }
        };
        this.LLLFZ = new IMediaPlayer.OnErrorListener<AbsPlayer<AbsPlayer<?>>>() { // from class: X.1Cwo
            @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnErrorListener
            public final void onError(AbsPlayer<AbsPlayer<?>> absPlayer, int i, int i2, String str) {
                LocalPlayerControllerKotlin localPlayerControllerKotlin = this.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("mediaPlayer error, info:");
                sbLIZ2.append(str);
                localPlayerControllerKotlin.LJ(false, i, i2, C2188811AlT.LIZIZ(sbLIZ2));
                LocalPlayerControllerKotlin localPlayerControllerKotlin2 = this.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("mediaPlayer error, info:");
                sbLIZ3.append(str);
                localPlayerControllerKotlin2.LIZIZ(new C1141050fnb(-23, C2188811AlT.LIZIZ(sbLIZ3), null));
            }
        };
    }

    public final void LJ(boolean z, int i, int i2, String str) {
        String playerSimpleName;
        IMonitor iMonitor = this.LLIZLLLIL;
        if (iMonitor == null) {
            return;
        }
        IMediaPlayer<AbsPlayer<AbsPlayer<?>>> iMediaPlayer = this.LLJI;
        if (iMediaPlayer != null) {
            playerSimpleName = iMediaPlayer.getPlayerSimpleName();
        } else {
            playerSimpleName = "unknown";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", messageId: ");
        sbLIZ.append(this.LLILLJJLI);
        iMonitor.monitor(z, playerSimpleName, i, i2, C2188811AlT.LIZIZ(sbLIZ));
    }
}
