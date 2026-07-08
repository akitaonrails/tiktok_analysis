package com.ss.android.ugc.aweme.feed.adapter.playerview;

import X.C01GW;
import X.C0C23;
import X.C0RF0;
import X.C1170404hy;
import X.C1473870oSP;
import X.C1473990oSb;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481060oe0;
import X.C1481290oeN;
import X.C1486080om6;
import X.C1591220rVg;
import X.C2188811AlT;
import X.C2260271DdR;
import X.C2276411E8h;
import X.C583620Mum;
import X.C786410Ut5;
import X.EnumC2281141EQm;
import X.InterfaceC1473950oSX;
import X.InterfaceC1482650ogZ;
import Y.ARunnableS92S0200000_23;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class FeedVideoPlayerView implements BaseFeedPlayerView {
    public final ViewGroup LL;
    public final C0RF0 LLILLJJLI;
    public final InterfaceC1482650ogZ LLILLL;
    public final C1486080om6 LLILZ;
    public final C01GW LLILZIL;

    @Override // X.InterfaceC690050R4x
    public final void H1(OnUIPlayListener onUIPlayListener) {
    }

    @Override // X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
    }

    @Override // X.InterfaceC583650Mup
    public final void Z1() {
    }

    @Override // X.InterfaceC583650Mup
    public final int getContentType() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
        C583620Mum.LIZIZ(this, str, f);
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
    public final void onPausePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
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
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C583620Mum.LJJIIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
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
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C583620Mum.LJJIJL(this, str, i, jSONObject);
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
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
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
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C583620Mum.LJJJJZI(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onStopPlay(String str) {
        C583620Mum.LJJJLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSecondFrame(String str) {
        C583620Mum.LJJJLZIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C583620Mum.LJJJZ(this, str, i, i2);
    }

    @Override // X.InterfaceC583650Mup
    public final void sc() {
    }

    @Override // X.InterfaceC583650Mup
    public final void ys(int i) {
    }

    @Override // X.InterfaceC583650Mup
    public final boolean Da() {
        return this.LLILLL.Da();
    }

    @Override // X.InterfaceC583650Mup
    public final View Hk() {
        return this.LLILLL.Hk();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.FeedSurfaceViewHolderAbility
    public final void L41() {
        C786410Ut5.LJLIIL(100L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0om3
            public final void LIZ() {
                Rect rectLIZ;
                View videoView = this.LL.getVideoView();
                if (videoView == null || (rectLIZ = this.LL.LIZ(videoView)) == null || rectLIZ.centerX() >= C14KQ.LJIIIIZZ(videoView.getContext())) {
                    return;
                }
                C2276411E8h.LIZIZ.LIZJ("common_feed", 3, "SurfaceView", "abnormal case, unselected SurfaceView still on screen, try set gone/visible");
                if (!(((Boolean) C270730AjH.LIZ.getValue()).booleanValue())) {
                    this.LL.getClass();
                    C786410Ut5.LJLLLLLL(8, videoView);
                    C786410Ut5.LJLLLLLL(0, videoView);
                } else if (videoView instanceof C1473990oSb) {
                    C1473990oSb c1473990oSb = (C1473990oSb) videoView;
                    c1473990oSb.LIZLLL(8, true);
                    c1473990oSb.LIZLLL(0, true);
                } else {
                    this.LL.getClass();
                    C786410Ut5.LJLLLLLL(8, videoView);
                    C786410Ut5.LJLLLLLL(0, videoView);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedVideoPlayerView@2bfc.checkAbnormalSurfaceViewCase$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedVideoPlayerView@2bfc.checkAbnormalSurfaceViewCase$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void LJIJJ() {
        this.LLILLL.LIZLLL();
    }

    @Override // X.InterfaceC583650Mup
    public final boolean Mg() {
        return this.LLILLL.LJIILL() == 1 || this.LLILLL.LJIILL() == 2;
    }

    @Override // X.InterfaceC583650Mup
    public final Surface getSurface() {
        return this.LLILLL.getSurface();
    }

    @Override // X.InterfaceC583650Mup
    public final View getVideoView() {
        return this.LLILLL.getView();
    }

    @Override // X.InterfaceC583650Mup
    public final boolean go1() {
        return this.LLILLL.LJIILL() == 2;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void onPagePause() {
        this.LLILLL.onPagePause();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void onScrollEnd() {
        this.LLILLL.q3(false);
    }

    @Override // X.InterfaceC690050R4x
    public final void release() {
        InterfaceC1482650ogZ interfaceC1482650ogZ = this.LLILLL;
        if (interfaceC1482650ogZ != null) {
            interfaceC1482650ogZ.release();
        }
    }

    @Override // X.InterfaceC583650Mup
    public final void C80() {
        C1473990oSb c1473990oSb;
        View videoView = getVideoView();
        if (!(videoView instanceof C1473990oSb) || (c1473990oSb = (C1473990oSb) videoView) == null) {
            return;
        }
        c1473990oSb.LIZIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.FeedSurfaceViewHolderAbility
    public final void Fe0() {
        TextureView textureView;
        View videoView = getVideoView();
        if (!(videoView instanceof TextureView) || (textureView = (TextureView) videoView) == null) {
            return;
        }
        for (String str : (String[]) this.LLILZIL.getValue()) {
            if (u.LJIJI(str, Build.BRAND, true)) {
                return;
            }
        }
        JatoXL.optimizeSurfaceHandler(textureView, false);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.FeedSurfaceViewHolderAbility
    public final void VJ2() {
        View videoView;
        if (C1481060oe0.LJI() && Mg() && (videoView = getVideoView()) != null && videoView.getVisibility() != 0) {
            C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleResumeP");
            sbLIZ.append(" , visible: ");
            sbLIZ.append(true);
            sbLIZ.append(", surface = ");
            sbLIZ.append(getSurface());
            c2276411E8h.LIZJ("common_feed", 3, "SurfaceView", C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.LJLLLLLL(0, videoView);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void onDestroyView() {
        C1473870oSP c1473870oSP;
        if (C1591220rVg.LIZLLL()) {
            View videoView = getVideoView();
            if (!(videoView instanceof C1473870oSP) || (c1473870oSP = (C1473870oSP) videoView) == null) {
                return;
            }
            c1473870oSP.setSurfaceTextureListener(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final InterfaceC1482650ogZ getSurfaceHolder() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC583650Mup
    public final ViewGroup zt1() {
        return this.LL;
    }

    @Override // X.InterfaceC583650Mup
    public final void Ai1(boolean z) {
        if (z) {
            this.LLILLL.LIZ();
        } else {
            this.LLILLL.LJFF();
        }
    }

    @Override // X.InterfaceC583650Mup
    public final void Dh1(Aweme aweme) {
        String aid;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            this.LLILLL.LJIIIZ(aid);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void Dn(InterfaceC1473950oSX interfaceC1473950oSX) {
        this.LLILLL.Dn(interfaceC1473950oSX);
    }

    public final Rect LIZ(View view) {
        if (view instanceof SurfaceView) {
            try {
                Field declaredField = SurfaceView.class.getDeclaredField("mRTLastReportedPosition");
                declaredField.setAccessible(true);
                return (Rect) declaredField.get(view);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void jj(boolean z) {
        this.LLILLL.jj(z);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.FeedSurfaceViewHolderAbility
    public final void mZ0(Function0<Boolean> function0) {
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        C2276411E8h.LIZIZ.LIZJ("common_feed", 3, "SurfaceView", "FeedPlayerPresenter.onSurfaceAvailable, check if unselected surface view is in screen in 50ms");
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS92S0200000_23(this, function0, 25));
    }

    @Override // X.InterfaceC583650Mup
    public final void o6(boolean z) {
        C1486080om6 c1486080om6 = this.LLILZ;
        c1486080om6.LIZJ = z;
        if (z) {
            c1486080om6.LIZ();
            View view = c1486080om6.LIZIZ;
            if (view != null) {
                view.setBackgroundColor(0);
            }
            View view2 = c1486080om6.LIZIZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            ((ValueAnimator) c1486080om6.LIZLLL.getValue()).cancel();
            ((ValueAnimator) c1486080om6.LIZLLL.getValue()).setIntValues(0, ((Number) C2260271DdR.LIZJ.getValue()).intValue());
            ((ValueAnimator) c1486080om6.LIZLLL.getValue()).start();
            return;
        }
        View view3 = c1486080om6.LIZIZ;
        if (view3 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view3);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        C583620Mum.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        C583620Mum.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        C583620Mum.LJJIIZI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        C583620Mum.LJJIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        C583620Mum.LJJIJLIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void s5(InterfaceC1473950oSX interfaceC1473950oSX) {
        this.LLILLL.s5(interfaceC1473950oSX);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void wa(boolean z) {
        View view;
        if (C0C23.LIZ(this.LLILLJJLI.LIZJ) && (this.LLILLL.getView() instanceof SurfaceView) && (view = this.LLILLL.getView()) != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        this.LLILLL.u(z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7 A[PHI: r5
      0x00d7: PHI (r5v2 android.widget.FrameLayout) = (r5v0 android.widget.FrameLayout), (r5v3 android.widget.FrameLayout) binds: [B:36:0x00d2, B:38:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FeedVideoPlayerView(android.view.ViewGroup r10, X.C0RF0 r11) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.playerview.FeedVideoPlayerView.<init>(android.view.ViewGroup, X.0RF0):void");
    }

    @Override // X.InterfaceC583650Mup
    public final void ce1(String str, String str2) {
        InterfaceC1482650ogZ interfaceC1482650ogZ = this.LLILLL;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        interfaceC1482650ogZ.LJJ(new C1170404hy(str, str2));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
        C583620Mum.LIZLLL(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        C583620Mum.LJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJ(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        C583620Mum.LJJIJIL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        C583620Mum.LJJJJLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        C583620Mum.LIZJ(this, str, j, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        C583620Mum.LJJIIZ(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        C583620Mum.LJJJJZ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void q7(float f, int i, int i2, int i3) {
        this.LLILLL.LJIIJ(f, i, i2, i3);
    }
}
