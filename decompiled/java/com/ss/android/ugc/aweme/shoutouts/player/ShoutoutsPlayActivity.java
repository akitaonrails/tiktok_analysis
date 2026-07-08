package com.ss.android.ugc.aweme.shoutouts.player;

import X.AbstractC1252750ihl;
import X.AbstractC848400XPy;
import X.C004I;
import X.C01GW;
import X.C0CQT;
import X.C0XQ7;
import X.C11CE;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C11S5;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1390130mHL;
import X.C13LE;
import X.C1473870oSP;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1482640ogY;
import X.C14LC;
import X.C1634100scq;
import X.C1644460stY;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1765020w20;
import X.C194404113y;
import X.C197039127h;
import X.C19719912Dl;
import X.C19774012Yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C299020Bno;
import X.C309690CBz;
import X.C335910DEv;
import X.C452501pT;
import X.C583620Mum;
import X.C692910RFx;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC2281141EQm;
import X.EnumC335920DEw;
import X.InterfaceC1075600e62;
import X.InterfaceC1171660gay;
import X.InterfaceC1473950oSX;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.ViewTreeObserverOnGlobalLayoutListenerC738820SyW;
import Y.ACListenerS155S0100000_21;
import Y.ACListenerS163S0100000_29;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrder;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayState;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS317S0000000_29;
import kotlin.jvm.internal.AwS157S0400000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class ShoutoutsPlayActivity extends BaseActivity implements OnUIPlayListener, InterfaceC1171660gay, InterfaceC1075600e62<C194404113y> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJjonJzHELIOSA4OmEjJCQ1LD19Gy0jPDs8PTE/GSMyMQQvPSYlITE1";
    public C197039127h LL;
    public TuxIconView LLILLJJLI;
    public RelativeLayout LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxIconView LLIZLLLIL;
    public C1473870oSP LLJ;
    public TuxIconView LLJI;
    public C1390130mHL LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(189));
    public final boolean LLJILJILJ = true;
    public boolean LLJILLL;
    public boolean LLJJ;
    public Video LLJJI;
    public boolean LLJJIII;
    public final lifecycleAwareLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    public ShoutoutsPlayActivity() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShoutoutsPlayViewModel.class);
        this.LLJJIJI = new lifecycleAwareLazy(this, new AwS157S0400000_29(this, c19719912DlLIZ, AFwS317S0000000_29.get$arr$(8), c19719912DlLIZ, 8));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(190));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 292));
    }

    public final void LLZZ() throws Throwable {
        int i;
        int iLJ;
        int i2;
        if (!this.LLJJIII || this.LLJJI == null) {
            return;
        }
        LLZLI().LJIIL(this.LLJJI);
        Video video = this.LLJJI;
        C1473870oSP c1473870oSPLLZ = LLZ();
        if (c1473870oSPLLZ.getWidth() == 0 || c1473870oSPLLZ.getHeight() == 0) {
            C786410Ut5.x3(c1473870oSPLLZ.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC738820SyW(c1473870oSPLLZ, video, this, 0));
            return;
        }
        if (video.getWidth() <= 0 || video.getHeight() <= 0) {
            return;
        }
        C692910RFx c692910RFx = new C692910RFx();
        int width = video.getWidth();
        int height = video.getHeight();
        C692910RFx.LIZLLL(this);
        double d = ((double) C692910RFx.LJFF) / ((double) C692910RFx.LJI);
        if (d > 0.5d) {
            if (d >= 0.6666666666666666d) {
                c692910RFx.LJIIIZ(width, height, C692910RFx.LJFF, C692910RFx.LJI, c1473870oSPLLZ, null, null);
                return;
            }
            int i3 = C692910RFx.LJIIIIZZ;
            boolean z = C14LC.LJIIIZ;
            C14LC c14lc = C309690CBz.LIZ;
            c692910RFx.LJIIIIZZ(c1473870oSPLLZ, width, height, (i3 - (c14lc.LJFF ? C14LC.LIZIZ() : 0)) - c14lc.LIZ, C692910RFx.LJFF, null, null);
            return;
        }
        boolean z2 = C14LC.LJIIIZ;
        C14LC c14lc2 = C309690CBz.LIZ;
        if (c14lc2.LIZIZ != 0) {
            i = c14lc2.LIZJ;
            if (i == 0) {
                iLJ = C692910RFx.LJ();
                i2 = c14lc2.LIZ;
            }
            c692910RFx.LIZJ(c1473870oSPLLZ, width, height, i, C692910RFx.LJFF, null, null);
        }
        if (c14lc2.LJFF) {
            iLJ = C692910RFx.LJ() - C14LC.LIZIZ();
            i2 = 0;
            c14lc2.getClass();
        } else {
            iLJ = C692910RFx.LJ();
            i2 = c14lc2.LIZ;
        }
        i = iLJ - i2;
        if (!c14lc2.LIZLLL) {
            i -= c14lc2.LIZIZ;
        }
        c692910RFx.LIZJ(c1473870oSPLLZ, width, height, i, C692910RFx.LJFF, null, null);
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
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
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
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
    public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onResume", true);
        super.onResume();
        if (!LLZLI().LJFF() && this.LLJJI != null && !this.LLJJ) {
            LLZLLLL(false);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onResume", false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onStart", true);
        super.onStart();
        LLZLI().LJIILJJIL(LLZ());
        LLZLI().LIZ(this);
        C1482640ogY.LJIIIIZZ(LLZ()).Dn(new InterfaceC1473950oSX() { // from class: X.11CH
            @Override // X.InterfaceC1473950oSX
            public final void LLF(int i, int i2) {
            }

            @Override // X.InterfaceC1473950oSX
            public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // X.InterfaceC1473950oSX
            public final void LIZ() {
                this.LL.LLJJIII = false;
            }

            @Override // X.InterfaceC1473950oSX
            public final void LLILLIZIL(int i, int i2) throws Throwable {
                ShoutoutsPlayActivity shoutoutsPlayActivity = this.LL;
                shoutoutsPlayActivity.LLJJIII = true;
                shoutoutsPlayActivity.LLZZ();
            }
        });
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onStart", false);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final ShoutoutsPlayViewModel LLLLZIL() {
        return (ShoutoutsPlayViewModel) this.LLJJIJI.getValue();
    }

    public final TuxTextView LLLLZLL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v9f);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v9g);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final RelativeLayout LLLLZLLLI() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v9i);
            this.LLILLL = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final C197039127h LLLZ() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v9l);
            this.LL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C1390130mHL LLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v9m);
            this.LLJIJIL = (C1390130mHL) callbackFindViewById;
        }
        return (C1390130mHL) callbackFindViewById;
    }

    public final TuxIconView LLLZLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v9n);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView LLLZZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v9o);
            this.LLJI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C1473870oSP LLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v9p);
            this.LLJ = (C1473870oSP) callbackFindViewById;
        }
        return (C1473870oSP) callbackFindViewById;
    }

    public final VideoViewComponent LLZLI() {
        return (VideoViewComponent) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC1075600e62
    public final ViewModelProvider.Factory jl() {
        return (C194404113y) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        if (LLZLI().LJFF()) {
            LLZLLLL(false);
        }
        super.onPause();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        LLZLI().H1(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void LLZLLLL(boolean z) {
        if (LLLZIL().getVisibility() == 0) {
            return;
        }
        if (this.LLJILLL) {
            if (!LLZLI().LJFF() && this.LLJJI != null) {
                LLZLI().LJIIL(this.LLJJI);
                C786410Ut5.LLLLLLZZ(LLLZZIL(), 8);
                this.LLJILLL = false;
                this.LLJJ = false;
                return;
            }
            return;
        }
        if (!LLZLI().LJFF()) {
            return;
        }
        LLZLI().pause();
        C786410Ut5.LLLLLLZZ(LLLZZIL(), 0);
        this.LLJILLL = true;
        if (!z) {
            return;
        }
        this.LLJJ = true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onCreate", true);
        activityConfiguration(AFwS273S0000000_29.get$arr$(142));
        super.onCreate(bundle);
        setContentView(R.layout.f90);
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v9j);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        TuxIconView tuxIconView = (TuxIconView) callbackFindViewById;
        if (tuxIconView != null) {
            tuxIconView.setTintColor(C960203pA.LIZ(R.attr.ef, tuxIconView.getContext()));
            C786410Ut5.a9(tuxIconView, new ACListenerS163S0100000_29(this, 194));
        }
        C1473870oSP c1473870oSPLLZ = LLZ();
        if (c1473870oSPLLZ != null) {
            C786410Ut5.Qa(c1473870oSPLLZ, new ACListenerS163S0100000_29(this, 195));
        }
        TuxIconView tuxIconViewLLLZZIL = LLLZZIL();
        if (tuxIconViewLLLZZIL != null) {
            C786410Ut5.a9(tuxIconViewLLLZZIL, new ACListenerS163S0100000_29(this, 196));
        }
        C786410Ut5.U8(LLLZ(), new ACListenerS163S0100000_29(this, 197));
        LLLZ().setBackgroundColor(C960203pA.LIZ(R.attr.e1, this));
        if (Intrinsics.LJFF(LLLLLZL(getIntent(), "author_id"), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            C786410Ut5.LLLLLLZZ(LLLZLZ(), 8);
        } else {
            C786410Ut5.a9(LLLZLZ(), new ACListenerS155S0100000_21(this, 123));
        }
        final String strLLLLLZL = LLLLLZL(getIntent(), "cover");
        final String strLLLLLZL2 = LLLLLZL(getIntent(), "download_url");
        if (strLLLLLZL != null && strLLLLLZL.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && strLLLLLZL2 != null && strLLLLLZL2.length() != 0) {
            String strLLLLLZL3 = LLLLLZL(getIntent(), "order_id");
            if (strLLLLLZL3 != null) {
                LLLLZIL().LLILZIL.observe(this, new Observer() { // from class: X.0omj
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) throws Throwable {
                        int iIntValue;
                        int iIntValue2;
                        Video video;
                        Video video2;
                        ShoutoutsOrder shoutoutsOrder = (ShoutoutsOrder) obj;
                        this.LL.LLJJI = new Video();
                        ShoutoutsPlayActivity shoutoutsPlayActivity = this.LL;
                        Video video3 = shoutoutsPlayActivity.LLJJI;
                        if (video3 != null) {
                            String str = strLLLLLZL2;
                            String str2 = strLLLLLZL;
                            VideoUrlModel videoUrlModel = new VideoUrlModel();
                            videoUrlModel.setUrlList(Collections.singletonList(str));
                            videoUrlModel.setSourceId(str);
                            videoUrlModel.setUrlKey(str);
                            videoUrlModel.setUri((String) C13LP.LJJJLL(videoUrlModel.getUrlList()));
                            video3.setPlayAddr(videoUrlModel);
                            video3.setDownloadAddr(video3.getPlayAddr());
                            UrlModel urlModel = new UrlModel();
                            urlModel.setUri(str2);
                            urlModel.setUrlList(Collections.singletonList(str2));
                            video3.setCover(urlModel);
                            Aweme aweme = shoutoutsOrder.aweme;
                            if (aweme != null && (video2 = aweme.getVideo()) != null) {
                                iIntValue = video2.getWidth();
                            } else {
                                Integer num = 0;
                                iIntValue = num.intValue();
                            }
                            video3.setWidth(iIntValue);
                            Aweme aweme2 = shoutoutsOrder.aweme;
                            if (aweme2 != null && (video = aweme2.getVideo()) != null) {
                                iIntValue2 = video.getHeight();
                            } else {
                                Integer num2 = 0;
                                iIntValue2 = num2.intValue();
                            }
                            video3.setHeight(iIntValue2);
                            video3.setSourceId(str);
                            shoutoutsPlayActivity.LLZZ();
                        }
                    }
                });
                ShoutoutsPlayViewModel shoutoutsPlayViewModelLLLLZIL = LLLLZIL();
                shoutoutsPlayViewModelLLLLZIL.getClass();
                C11CE.LIZ.getClass();
                ((C11CE) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(C11CE.class)).LIZ(strLLLLLZL3).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new C19774012Yg(shoutoutsPlayViewModelLLLLZIL, 0));
            } else {
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                c1389890mGx.LJIIIZ(R.string.m25);
                c1389890mGx.LJIIJJI();
            }
        } else {
            C1389890mGx c1389890mGx2 = new C1389890mGx(this);
            c1389890mGx2.LJIIIZ(R.string.m25);
            c1389890mGx2.LJIIJJI();
        }
        if (((Boolean) this.LLJJIJIL.getValue()).booleanValue()) {
            C786410Ut5.LLLLLLJ(LLLZ(), 8);
            C786410Ut5.LLLLLLZZ(LLLZLZ(), 8);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onCreate", false);
        } else {
            C11EA.LJII(this, LLLLZIL(), new C2217381BqS() { // from class: X.11CG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((ShoutoutsPlayState) obj).getStatus();
                }
            }, new AwS643S0100000_29(this, 43));
            C11EA.LJII(this, LLLLZIL(), new C2217381BqS() { // from class: X.11CF
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((ShoutoutsPlayState) obj).getProgress());
                }
            }, new AwS633S0100000_19(this, 94));
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onCreate", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        if (!this.LLJILJILJ) {
            finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C1481290oeN c1481290oeN) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error_code = ");
        if (c1481290oeN != null) {
            string = c1481290oeN.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        C1390130mHL c1390130mHLLLLZIL = LLLZIL();
        if (c1390130mHLLLLZIL != null) {
            C786410Ut5.LLZ(c1390130mHLLLLZIL, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[PHI: r1
      0x0031: PHI (r1v7 java.lang.String) = (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:14:0x002f, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[PHI: r1
      0x0043: PHI (r1v9 java.lang.String) = (r1v2 java.lang.String), (r1v10 java.lang.String) binds: [B:7:0x001c, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRenderFirstFrame(X.C1480420ocy r6) {
        /*
            r5 = this;
            X.0mHL r1 = r5.LLLZIL()
            r0 = 8
            X.C786410Ut5.LLZ(r1, r0)
            r1 = 0
            r0 = 1
            X.09Gk r4 = LLLLZI(r5, r1, r0, r0)
            X.1D0F r3 = X.C1D0F.LIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L1b
            java.lang.String r1 = r3.LIZ()
            if (r1 != 0) goto L43
        L1b:
            r1 = r2
            if (r3 != 0) goto L43
            r0 = 0
        L1f:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.LJIIIIZZ(r1, r0)
            if (r3 == 0) goto L2e
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L31
        L2e:
            r1 = r2
            if (r3 == 0) goto L38
        L31:
            java.lang.String r0 = r3.LIZJ()
            if (r0 == 0) goto L38
            r2 = r0
        L38:
            r4.LJIIIIZZ(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "video_play"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L43:
            boolean r0 = r3.isConnected()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity.onRenderFirstFrame(X.0ocy):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C1481290oeN c1481290oeN) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error_code = ");
        if (c1481290oeN != null) {
            numValueOf = Integer.valueOf(c1481290oeN.LJ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public static String LLLLLZL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public static C2344009Gk LLLLZI(ShoutoutsPlayActivity shoutoutsPlayActivity, boolean z, boolean z2, int i) {
        String str;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        boolean zLJFF = Intrinsics.LJFF(LLLLLZL(shoutoutsPlayActivity.getIntent(), "author_id"), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C2344009Gk c2344009Gk = new C2344009Gk();
        String strLLLLLZL = LLLLLZL(shoutoutsPlayActivity.getIntent(), "enter_from");
        if (strLLLLLZL == null) {
            strLLLLLZL = "chat";
        }
        c2344009Gk.LJIIIIZZ("enter_from", strLLLLLZL);
        c2344009Gk.LJIIIIZZ("content_source", "shoutouts");
        if (zLJFF) {
            str = "creator";
        } else {
            str = "consumer";
        }
        c2344009Gk.LJIIIIZZ("user_type", str);
        c2344009Gk.LJIIIIZZ("author_id", LLLLLZL(shoutoutsPlayActivity.getIntent(), "author_id"));
        c2344009Gk.LJIIIIZZ("group_id", LLLLLZL(shoutoutsPlayActivity.getIntent(), "aweme_id"));
        if (zLJFF && z2) {
            if (((Boolean) shoutoutsPlayActivity.LLJJIJIL.getValue()).booleanValue()) {
                c2344009Gk.LJIIIIZZ("video_status", "review");
            } else {
                c2344009Gk.LJIIIIZZ("video_status", "finish");
            }
        }
        if (z) {
            String strLLLLLZL2 = LLLLLZL(shoutoutsPlayActivity.getIntent(), "order_id");
            if (strLLLLLZL2 == null) {
                strLLLLLZL2 = "";
            }
            c2344009Gk.LJIIIIZZ("order_id", strLLLLLZL2);
        }
        return c2344009Gk;
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
