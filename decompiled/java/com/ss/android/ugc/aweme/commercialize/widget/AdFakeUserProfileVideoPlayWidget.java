package com.ss.android.ugc.aweme.commercialize.widget;

import X.C01GW;
import X.C0N0Y;
import X.C0N0Z;
import X.C1019030ccn;
import X.C1020020ceO;
import X.C1020030ceP;
import X.C1022820ciu;
import X.C1035130d2l;
import X.C1052870dVN;
import X.C11FJ;
import X.C12ES;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C14EU;
import X.C1AF0;
import X.C2184171Adz;
import X.C2277881EDy;
import X.C452501pT;
import X.C583620Mum;
import X.C586860N0a;
import X.C786410Ut5;
import X.C989800bre;
import X.EnumC2281141EQm;
import Y.ACListenerS163S0100000_29;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS40S0101000_29;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class AdFakeUserProfileVideoPlayWidget extends AbsAdProfileWidget implements OnUIPlayListener {
    public C0N0Z LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 219));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 220));
    public final C11FJ LLJJ = new C11FJ();
    public final BPEAHandler LLJJIII = new BPEAHandler(Looper.getMainLooper());

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
    public final void onBuffering(boolean z) {
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
    public final void onDecoderBuffering(boolean z) {
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
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C1481290oeN c1481290oeN) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJ(this, str, c1481290oeN);
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
    public final void onPlayProgressChange(float f) {
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
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
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
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C1481290oeN c1481290oeN) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJL(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        C583620Mum.LJJJJLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C583620Mum.LJJJJZ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C583620Mum.LJJJJZI(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
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

    public final void LJIJ() {
        ImageView imageView = (ImageView) this.LLJILJIL.getValue();
        if (imageView != null) {
            imageView.animate().alpha(0.0f).scaleX(2.5f).scaleY(2.5f).withEndAction(new ARunnableS112S0100000_12(imageView, 157)).setDuration(100L).start();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        C586860N0a c586860N0a;
        C0N0Y c0n0y;
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C0N0Z c0n0z = this.LLJILJILJ;
        if (c0n0z != null) {
            if (c0n0z.LIZ().LJLJI(c0n0z) && (c0n0y = (c586860N0a = c0n0z.LLILZIL).LJFF) != null && c0n0y.LJLJI(c586860N0a.LIZLLL)) {
                c586860N0a.LJFF.LJJIJ(null);
            }
            c0n0z.LLILZ.LLILLL.s5(c0n0z.LLIZLLLIL);
            c0n0z.LLILLJJLI.clear();
            try {
                c0n0z.LIZ().LJJIIJZLJL();
                c0n0z.LIZ().release();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
        }
        Context context = this.LL;
        Aweme aweme = this.LLIZLLLIL;
        long j = this.LLJJ.LIZ;
        List<String> list = C1019030ccn.LIZ;
        C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
        c1020020ceOLIZ.LIZ = "homepage_ad";
        c1020020ceOLIZ.LIZIZ = "play_break";
        c1020020ceOLIZ.LJ.LIZ(j, "duration");
        c1020020ceOLIZ.LJ(aweme);
        c1020020ceOLIZ.LJIIJ(context);
        if (aweme != null) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "play_break", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ(Long.valueOf(j), "duration");
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        if (this.LLJILLL) {
            C0N0Z c0n0z = this.LLJILJILJ;
            if (c0n0z != null) {
                c0n0z.LIZIZ();
            }
            LJIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        C0N0Z c0n0z;
        super.onResume();
        if (!this.LLJILLL || this.LLJJI || (c0n0z = this.LLJILJILJ) == null || c0n0z.LLILLL.LIZ == 0) {
            return;
        }
        c0n0z.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    public final void LJIILL(C1035130d2l c1035130d2l) {
        Video video;
        ViewGroup viewGroup;
        C0N0Y c0n0yLIZ;
        super.LJIILL(c1035130d2l);
        Aweme aweme = this.LLIZLLLIL;
        if (aweme != null && (video = aweme.getVideo()) != null && (viewGroup = (ViewGroup) this.LLJIJIL.getValue()) != null) {
            LJIJI(video.getWidth(), video.getHeight(), viewGroup);
            C0N0Z c0n0z = new C0N0Z(viewGroup, this.LLIZLLLIL);
            this.LLJILJILJ = c0n0z;
            if (!c0n0z.LLILLJJLI.contains(this)) {
                c0n0z.LLILLJJLI.add(this);
            }
            C0N0Z c0n0z2 = this.LLJILJILJ;
            if (c0n0z2 != null && (c0n0yLIZ = c0n0z2.LIZ()) != null) {
                WeakReference<C0N0Y> weakReference = C1052870dVN.LIZ;
                C1052870dVN.LIZIZ = new WeakReference<>(c0n0yLIZ);
            }
            View view = this.LLILLL;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS163S0100000_29(this, 294), view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c2, code lost:
    
        if (r9 != false) goto L10;
     */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(boolean r9) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget.LJIIZILJ(boolean):void");
    }

    @C14EU
    public final void onAdPopupWebPageEvent(C989800bre c989800bre) {
        boolean z = c989800bre.LIZ;
        this.LLJJI = z;
        int currentPosition = 0;
        if (z) {
            C0N0Z c0n0z = this.LLJILJILJ;
            if (c0n0z != null && c0n0z.LLILLL.LIZ != 3 && c0n0z.LLILLL.LIZ != 0) {
                c0n0z.LIZIZ();
                return;
            }
            return;
        }
        if (!this.LLJILLL) {
            return;
        }
        C0N0Z c0n0z2 = this.LLJILJILJ;
        if (c0n0z2 != null) {
            if (c0n0z2.LLILLL.LIZ == 0) {
                C0N0Y c0n0y = C1052870dVN.LIZ.get();
                if (c0n0y != null) {
                    currentPosition = (int) c0n0y.getCurrentPosition();
                }
                if (!C2277881EDy.LIZIZ.getAdFakeUserProfileBugfixSetting()) {
                    C0N0Z c0n0z3 = this.LLJILJILJ;
                    if (c0n0z3 == null) {
                        return;
                    }
                    c0n0z3.LIZLLL(currentPosition);
                    return;
                }
                C786410Ut5.LJJZZIII(this.LLJJIII, new ARunnableS40S0101000_29(this, currentPosition, 3));
                return;
            }
            c0n0z2.LIZJ();
        }
        LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Context context = this.LL;
        Aweme aweme = this.LLIZLLLIL;
        List<String> list = C1019030ccn.LIZ;
        C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
        c1020020ceOLIZ.LIZ = "homepage_ad";
        c1020020ceOLIZ.LIZIZ = "pause";
        c1020020ceOLIZ.LJ(aweme);
        c1020020ceOLIZ.LJIIJ(context);
        if (aweme != null) {
            C2184171Adz.LIZLLL("homepage_ad", "pause", aweme.getAwemeRawAd()).LJIIIIZZ();
        }
        C11FJ c11fj = this.LLJJ;
        if (c11fj.LIZLLL) {
            c11fj.LIZLLL = false;
            c11fj.LIZJ = System.currentTimeMillis();
            if (c11fj.LIZJ > 0 && c11fj.LIZIZ > 0 && c11fj.LIZJ - c11fj.LIZIZ > 0) {
                c11fj.LIZ += c11fj.LIZJ - c11fj.LIZIZ;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        C0N0Y c0n0yLIZ;
        View view;
        C0N0Z c0n0z = this.LLJILJILJ;
        if (c0n0z != null && (c0n0yLIZ = c0n0z.LIZ()) != null && (view = (View) this.LLJIJIL.getValue()) != null) {
            LJIJI(c0n0yLIZ.getVideoWidth(), c0n0yLIZ.getVideoHeight(), view);
        }
        C11FJ c11fj = this.LLJJ;
        if (!c11fj.LIZLLL) {
            c11fj.LIZLLL = true;
            c11fj.LIZIZ = System.currentTimeMillis();
        }
        C1019030ccn.LJJIL(this.LL, this.LLIZLLLIL);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        C1019030ccn.LJJIL(this.LL, this.LLIZLLLIL);
        C11FJ c11fj = this.LLJJ;
        if (!c11fj.LIZLLL) {
            c11fj.LIZLLL = true;
            c11fj.LIZIZ = System.currentTimeMillis();
        }
    }

    public final void LJIJI(int i, int i2, View view) {
        if (i > 0 && i2 > 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int iLJIIJ = C12ES.LJIIJ(this.LL);
            layoutParams.width = iLJIIJ;
            layoutParams.height = (int) ((iLJIIJ * i2) / i);
            view.requestLayout();
            DataCenter dataCenter = this.LLILZ;
            if (dataCenter != null) {
                dataCenter.zQ2(null, "ON_VIDEO_CONTAINER_SIZE_CHANGE");
            }
        }
    }
}
