package com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.play;

import X.AbstractC20628015ni;
import X.C01GW;
import X.C0MRE;
import X.C1404250me7;
import X.C1473870oSP;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1482640ogY;
import X.C19711612Ag;
import X.C19713312Ax;
import X.C2487409ou;
import X.C375780EoK;
import X.C452501pT;
import X.C580710Mq5;
import X.C583620Mum;
import X.C786410Ut5;
import X.EnumC2281141EQm;
import X.InterfaceC1473950oSX;
import X.InterfaceC19711512Af;
import Y.ACListenerS163S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS33S1100000_29;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS218S0000000_29;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class PlayViewComponent implements OnUIPlayListener, InterfaceC19711512Af, GenericLifecycleObserver {
    public final ViewGroup LL;
    public final C580710Mq5 LLILLJJLI;
    public BaseActivity LLILLL;
    public boolean LLILZLL;
    public boolean LLIZLLLIL;
    public long LLJ;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(238));
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLIZ = true;
    public final ARunnableS129S0100000_29 LLJI = new ARunnableS129S0100000_29(this, 99);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
        C583620Mum.LIZIZ(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        C583620Mum.LIZJ(this, str, j, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C583620Mum.LIZLLL(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C583620Mum.LJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJFF(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C583620Mum.LJI(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        C583620Mum.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str) {
        C583620Mum.LJIIIIZZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
        C583620Mum.LJIIIZ(this, str, list);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C583620Mum.LJIIJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C583620Mum.LJIIL(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C583620Mum.LJIILIIL(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJIILJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLoopPlay(String str, int i) {
        C583620Mum.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        C583620Mum.LJIILLIIL(this, str, c1480290ocl);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C583620Mum.LJIIZILJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C583620Mum.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
        C583620Mum.LJJIFFI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C583620Mum.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C583620Mum.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C583620Mum.LJJIIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C583620Mum.LJJIIJZLJL(this, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C583620Mum.LJJIIZ(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C583620Mum.LJJIIZI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str) {
        C583620Mum.LJJIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C583620Mum.LJJIJIIJI(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C583620Mum.LJJIJIL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C583620Mum.LJJIJL(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str) {
        C583620Mum.LJJIJLIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C583620Mum.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str) {
        C583620Mum.LJJJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJL(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C583620Mum.LJJJJZ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C583620Mum.LJJJJZI(this, str, f);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onStopPlay(String str) {
        C583620Mum.LJJJLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSecondFrame(String str) {
        C583620Mum.LJJJLZIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C583620Mum.LJJJZ(this, str, i, i2);
    }

    public final VideoViewComponent LIZ() {
        return (VideoViewComponent) this.LLILZ.getValue();
    }

    public final void LIZIZ() {
        this.LLILZIL.removeCallbacks(this.LLJI);
        C786410Ut5.LJLIIL(300L, this.LLILZIL, this.LLJI);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        if (this.LLILLJJLI.LIZ().getVideo() == null) {
            BaseActivity baseActivity = this.LLILLL;
            if (baseActivity == null) {
                baseActivity = null;
            }
            baseActivity.finish();
        }
        this.LLJ = System.currentTimeMillis();
        this.LL.setClipToOutline(true);
        this.LL.setOutlineProvider(new C0MRE(C19711612Ag.LIZ));
        C786410Ut5.Qa((C1473870oSP) this.LL.findViewById(R.id.videoView), new ACListenerS163S0100000_29(this, 123));
        Video video = this.LLILLJJLI.LIZ().getVideo();
        if (video != null && video.getWidth() > 0 && video.getHeight() > 0) {
            ((FixedRatioFrameLayout) this.LL.findViewById(R.id.qm0)).setMode(video.getWidth() < video.getHeight() ? 0 : 1);
            ((FixedRatioFrameLayout) this.LL.findViewById(R.id.qm0)).setWhRatio(video.getWidth() / video.getHeight());
        }
        C2487409ou.LIZLLL(500L, new ARunnableS129S0100000_29(this, 98));
        LIZIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        BaseActivity baseActivity = this.LLILLL;
        if (baseActivity == null) {
            baseActivity = null;
        }
        baseActivity.getLifecycle().removeObserver(this);
        this.LLILZIL.removeCallbacks(this.LLJI);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.LLIZ) {
            return;
        }
        pause(false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (!this.LLILZLL && this.LLIZ) {
            play();
        }
        Activity activityLIZIZ = C19713312Ax.LIZIZ();
        C786410Ut5.LJLIIL(500L, this.LLILZIL, new ARunnableS33S1100000_29(this, activityLIZIZ != null ? activityLIZIZ.getLocalClassName() : null, 4));
    }

    @Override // X.InterfaceC19711512Af
    public final void play() {
        if (this.LLIZ) {
            LIZ().LJIIL(this.LLILLJJLI.LIZ().getVideo());
            C786410Ut5.LJZI(8, (ImageView) this.LL.findViewById(R.id.q4c));
            this.LLIZ = false;
            this.LLILZLL = false;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        LIZ().LJIILJJIL((C1473870oSP) this.LL.findViewById(R.id.videoView));
        LIZ().LIZ(this);
        C1482640ogY.LJIIIIZZ((C1473870oSP) this.LL.findViewById(R.id.videoView)).Dn(new InterfaceC1473950oSX() { // from class: X.12Ae
            @Override // X.InterfaceC1473950oSX
            public final void LIZ() {
            }

            @Override // X.InterfaceC1473950oSX
            public final void LLF(int i, int i2) {
            }

            @Override // X.InterfaceC1473950oSX
            public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // X.InterfaceC1473950oSX
            public final void LLILLIZIL(int i, int i2) {
                BaseActivity baseActivity = this.LL.LLILLL;
                if (baseActivity == null) {
                    baseActivity = null;
                }
                if (baseActivity.isActive()) {
                    this.LL.WA0(0.0d);
                    this.LL.play();
                } else {
                    this.LL.pause(false);
                    this.LL.LIZ().pause();
                }
                this.LL.LIZIZ();
            }
        });
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        LIZ().H1(this);
    }

    @Override // X.InterfaceC19711512Af
    public final boolean isPaused() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC19711512Af
    public final void WA0(double d) {
        LIZ().LJIIIZ((float) (((d * ((double) LSPassThroughRecordSizeConfig.DEFAULT)) / LIZ().LJ()) * ((double) 100)));
        this.LLILZIL.removeCallbacks(this.LLJI);
        C786410Ut5.LJLIIL(1500L, this.LLILZIL, this.LLJI);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        BaseActivity baseActivity = this.LLILLL;
        if (baseActivity == null) {
            baseActivity = null;
        }
        if (!baseActivity.isActive()) {
            pause(false);
            LIZ().pause();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        this.LLIZLLLIL = true;
        C1404250me7.LIZJ(0, this.LLILLJJLI.LIZ().getAid(), "", this.LLJ, this.LLILLJJLI.LIZJ());
        ((AbstractC20628015ni) this.LL.findViewById(R.id.nl5)).setLoading(false);
        C375780EoK.LIZIZ(this.LL.findViewById(R.id.nl3), false);
    }

    @Override // X.InterfaceC19711512Af
    public final void pause(boolean z) {
        if (!this.LLIZ) {
            LIZ().pause();
            C786410Ut5.LJZI(0, (ImageView) this.LL.findViewById(R.id.q4c));
            this.LLIZ = true;
            if (z) {
                this.LLILZLL = true;
            }
        }
    }

    public PlayViewComponent(ViewGroup viewGroup, C580710Mq5 c580710Mq5) {
        this.LL = viewGroup;
        this.LLILLJJLI = c580710Mq5;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        int i;
        Integer numValueOf;
        long j = this.LLJ;
        if (c1481290oeN != null) {
            i = c1481290oeN.LJ;
            numValueOf = Integer.valueOf(c1481290oeN.LJFF);
        } else {
            i = -1;
            numValueOf = null;
        }
        C1404250me7.LIZJ(i, str, String.valueOf(numValueOf), j, this.LLILLJJLI.LIZJ());
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        LIZIZ();
    }
}
