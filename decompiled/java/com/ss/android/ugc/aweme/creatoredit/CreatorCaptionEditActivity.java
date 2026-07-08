package com.ss.android.ugc.aweme.creatoredit;

import X.AbstractC2126608Uu;
import X.AbstractC21674919sB;
import X.C01GW;
import X.C01WU;
import X.C0PEM;
import X.C11IR;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1749280vcc;
import X.C18ZR;
import X.C1DFH;
import X.C20094213jo;
import X.C2107308Nj;
import X.C21383018mC;
import X.C21383818mK;
import X.C21384118mN;
import X.C21673919s1;
import X.C21674119s3;
import X.C2296808zG;
import X.C23250099c;
import X.C277510AuD;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C583620Mum;
import X.C742490TAp;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC2281141EQm;
import X.EnumC335920DEw;
import X.InterfaceC21383418mG;
import X.RunnableC21383718mJ;
import Y.ACListenerS166S0100000_32;
import Y.AObserverS234S0100000_32;
import Y.AfS148S0200000_12;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.impl.SimplifyAsyncPlayer;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import u4.q0;

/* JADX INFO: loaded from: classes33.dex */
public final class CreatorCaptionEditActivity extends BaseActivity implements OnUIPlayListener, InterfaceC21383418mG {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiY+LC4nJzHELIOScpLSYnZgY+LC4nJzcPKD8nISoiDCs6PAQvPSYlITE1";
    public HighLightLayoutManager LL;
    public C21383018mC LLILLJJLI;
    public Aweme LLILLL;
    public Long LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public Boolean LLJI;
    public Boolean LLJIJIL;
    public Video LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIL;
    public boolean LLJILJIL = true;
    public float LLJJIJIIJIL = 0.004f;
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 66));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 106));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 107));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 108));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 121));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 115));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(47));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 119));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 126));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 117));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 109));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 122));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 118));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 116));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 113));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 111));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 125));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 110));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 124));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 67));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 120));
    public final ACListenerS166S0100000_32 LLLII = new ACListenerS166S0100000_32(this, 6);
    public final ACListenerS166S0100000_32 LLLIIII = new ACListenerS166S0100000_32(this, 7);
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 114));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 112));

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
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
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
    public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
        C583620Mum.LJJIFFI(this, c1481290oeN);
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
    public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity", "onStart", false);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final RecyclerView LLII() {
        return (RecyclerView) this.LLLFZ.getValue();
    }

    public final CreatorCaptionEditViewModel LLLLZLL() {
        return (CreatorCaptionEditViewModel) this.LLJJL.getValue();
    }

    public final DialogC1389620mGW LLLLZLLIL() {
        return (DialogC1389620mGW) this.LLJLLL.getValue();
    }

    public final C21384118mN LLLLZLLLI() {
        return (C21384118mN) this.LLLI.getValue();
    }

    public final View LLLZ() {
        return (View) this.LLJLLIL.getValue();
    }

    public final C1749280vcc LLLZIL() {
        return (C1749280vcc) this.LLJLL.getValue();
    }

    public final VideoViewComponent LLLZLZ() {
        return (VideoViewComponent) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void LLZ() {
        if (!this.LLJJIII || this.LLJILJILJ == null) {
            return;
        }
        LLLZLZ().LJIIL(this.LLJILJILJ);
        C786410Ut5.O7((FrameLayout) this.LLJLILLLLZIIL.getValue(), new ACListenerS166S0100000_32(this, 10));
        ((View) this.LLJLILLLLZIIL.getValue()).setContentDescription(getString(2131823202));
        final String string = getString(2131823179);
        final String string2 = getString(2131823177);
        q0.LJIJ((View) this.LLJLILLLLZIIL.getValue(), new C20094213jo() { // from class: X.18mY
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                String str;
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                if (this.LIZ.LLJJ) {
                    str = string;
                } else {
                    str = string2;
                }
                accessibilityNodeInfoCompat.addAction(new C20092413jW(16, str));
            }
        });
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity", "onResume", true);
        super.onResume();
        ((Handler) this.LLJJJJ.getValue()).post((RunnableC21383718mJ) this.LLJJJJLIIL.getValue());
        if (LLLZIL().getVisibility() == 8 && this.LLJILJILJ != null && !LLLZLZ().LJFF() && !this.LLJJI) {
            LLLZZIL(false);
        }
        SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity", "onResume", false);
    }

    public final void LLLLZI() {
        if (LLLLZLL().zQ2()) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131833215);
            c1389890mGx.LJIIJJI();
        } else {
            if (LLLLZLL().yQ2()) {
                if (Intrinsics.LJFF(LLLLZLL().xQ2().getValue(), Boolean.FALSE)) {
                    return;
                }
                C1389890mGx c1389890mGx2 = new C1389890mGx(this);
                c1389890mGx2.LJIIIZ(2131829439);
                c1389890mGx2.LJIIJJI();
                return;
            }
            SettingsManager.LIZLLL().getClass();
            int iLJ = SettingsManager.LJ("creator_caption_max_edit_times", 2);
            String string = ((Boolean) C277510AuD.LIZ.getValue()).booleanValue() ? getString(2131828791, Integer.valueOf(iLJ)) : C786410Ut5.j4(getResources().getQuantityString(2131755298, iLJ), Arrays.copyOf(new Object[]{Integer.valueOf(iLJ)}, 1));
            C1389890mGx c1389890mGx3 = new C1389890mGx(this);
            c1389890mGx3.LJIIJ(string);
            c1389890mGx3.LJIIJJI();
        }
    }

    public final void LLZLI() {
        C11NZ<CreatorCaptionEditModel> c11nzQueryAwemeAndCaption;
        C786410Ut5.LLLZLZ(LLLZIL(), 0);
        LLLZIL().LJ();
        CreatorCaptionEditViewModel creatorCaptionEditViewModelLLLLZLL = LLLLZLL();
        Long l = this.LLILZ;
        String str = this.LLILZIL;
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 123);
        AwS611S0100000_32 awS611S0100000_32 = new AwS611S0100000_32(this, 51);
        creatorCaptionEditViewModelLLLLZLL.getClass();
        if (l != null) {
            try {
                c11nzQueryAwemeAndCaption = C01WU.LIZ().queryAwemeAndCaption(Long.valueOf(l.longValue()), str);
            } catch (ExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                AbstractC2126608Uu.getCompatibleException(e);
                c11nzQueryAwemeAndCaption = C11IR.LL;
            }
            new C11NJ().LIZ(c11nzQueryAwemeAndCaption.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS148S0200000_12(creatorCaptionEditViewModelLLLLZLL, awS576S0100000_32, 37), new AfS148S0200000_12(creatorCaptionEditViewModelLLLLZLL, awS611S0100000_32, 62)));
        }
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (((Boolean) LLLLZLL().LLILZ.getValue()).booleanValue()) {
            LLZLLLL(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (LLLZLZ().LJFF()) {
            LLLZLZ().LJIIJJI();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((Handler) this.LLJJJIL.getValue()).removeCallbacksAndMessages(null);
        ((Handler) this.LLJJJJ.getValue()).removeCallbacksAndMessages(null);
        if (LLLZIL().getVisibility() == 8 && this.LLJILJILJ != null && LLLZLZ().LJFF()) {
            LLLZZIL(false);
        }
        SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
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

    @Override // X.InterfaceC21383418mG
    public final void B1() {
        LLLLZI();
    }

    public final int LLLLZIL(long j) {
        List<CreatorCaptionEditData> list;
        CreatorCaptionEditItem creatorCaptionEditItem = LLLLZLL().LLIZ;
        if (creatorCaptionEditItem != null && (list = creatorCaptionEditItem.transSubtitleItem) != null) {
            int i = 0;
            for (CreatorCaptionEditData creatorCaptionEditData : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    CreatorCaptionEditData creatorCaptionEditData2 = creatorCaptionEditData;
                    if (creatorCaptionEditData2.getStartTime() <= j && j < creatorCaptionEditData2.getEndTime()) {
                        return i;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void LLLZZIL(boolean z) {
        C21383018mC c21383018mC = null;
        if (this.LLJJ) {
            if (!LLLZLZ().LJFF() && this.LLJILJILJ != null) {
                this.LLJJIJI = false;
                C21383018mC c21383018mC2 = this.LLILLJJLI;
                if (c21383018mC2 != null) {
                    c21383018mC = c21383018mC2;
                }
                c21383018mC.LLLII();
                LLLZLZ().resume();
                this.LLJJ = false;
                this.LLJJI = false;
                C786410Ut5.LJLLLLLL(8, LLLZ());
                return;
            }
            return;
        }
        if (!LLLZLZ().LJFF()) {
            return;
        }
        LLLZLZ().pause();
        if (this.LLJJIJI) {
            C21383018mC c21383018mC3 = this.LLILLJJLI;
            if (c21383018mC3 != null) {
                c21383018mC = c21383018mC3;
            }
            c21383018mC.LLLI();
        }
        this.LLJJ = true;
        if (!z) {
            return;
        }
        this.LLJJI = true;
        C786410Ut5.LJLLLLLL(0, LLLZ());
    }

    public final void LLZLLLL(boolean z) {
        int i;
        String string;
        if (!((Boolean) LLLLZLL().LLILZ.getValue()).booleanValue() && z) {
            LLLLZLLLI().LJIIIIZZ(null, null);
        }
        LLLLZLL().LLILLL.setValue(Boolean.valueOf(z));
        C21383818mK c21383818mK = (C21383818mK) this.LLLIIIIL.getValue();
        Resources resources = getResources();
        if (z) {
            i = R.string.sg8;
        } else {
            i = R.string.hz2;
        }
        c21383818mK.LJFF(resources.getString(i));
        C21383818mK c21383818mK2 = (C21383818mK) this.LLLIIIIL.getValue();
        if (z) {
            string = getResources().getString(2131826896);
        } else {
            string = "";
        }
        ((TextView) c21383818mK2.LJIIIZ.getValue()).setText(string);
        C21383818mK.LJ((View) c21383818mK2.LJIIIZ.getValue(), true);
    }

    public final void LLZZ(int i) {
        String text;
        List<CreatorCaptionEditData> list;
        CreatorCaptionEditData creatorCaptionEditData;
        if (!this.LLJILJIL) {
            C786410Ut5.LJLZ(8, (ViewGroup) this.LLJZIJLIL.getValue());
            return;
        }
        C786410Ut5.LJLLLLLL(8, (View) this.LLJZ.getValue());
        C786410Ut5.LJLZ(0, (ViewGroup) this.LLJZIJLIL.getValue());
        if (i == -1) {
            C786410Ut5.LJLZ(8, (ViewGroup) this.LLL.getValue());
            return;
        }
        C786410Ut5.LJLZ(0, (ViewGroup) this.LLL.getValue());
        TextView textView = (TextView) this.LLLFF.getValue();
        CreatorCaptionEditItem creatorCaptionEditItem = LLLLZLL().LLIZ;
        if (creatorCaptionEditItem != null && (list = creatorCaptionEditItem.transSubtitleItem) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(list, i)) != null) {
            text = creatorCaptionEditData.getText();
        } else {
            text = null;
        }
        textView.setText(text);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity", "onCreate", true);
        super.onCreate(bundle);
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        setContentView(R.layout.b5l);
        try {
            this.LLILZ = Long.valueOf(getIntent().getLongExtra("cla_subtitle_id", 0L));
            this.LLILZIL = LLLLLZL(getIntent(), "item_id");
            this.LLILZLL = LLLLLZL(getIntent(), "group_id");
            this.LLIZ = LLLLLZL(getIntent(), "author_id");
            this.LLIZLLLIL = LLLLLZL(getIntent(), "enter_from");
            this.LLJ = LLLLLZL(getIntent(), "enter_method");
            this.LLJILJIL = getIntent().getBooleanExtra("should_show_caption_on_video", true);
            LLLLZLL().vQ2().setValue((Aweme) getIntent().getSerializableExtra("aweme"));
            this.LLJI = Boolean.valueOf(getIntent().getBooleanExtra("add_caption_flow_entry", false));
            this.LLJIJIL = Boolean.valueOf(getIntent().getBooleanExtra("with_tap_to_edit", false));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        getWindow().setNavigationBarColor(-16777216);
        this.LLILLJJLI = new C21383018mC(LLLLZLL(), this);
        this.LL = new HighLightLayoutManager(this);
        RecyclerView recyclerViewLLII = LLII();
        HighLightLayoutManager highLightLayoutManager = this.LL;
        if (highLightLayoutManager == null) {
            highLightLayoutManager = null;
        }
        recyclerViewLLII.setLayoutManager(highLightLayoutManager);
        C21383018mC c21383018mC = this.LLILLJJLI;
        if (c21383018mC == null) {
            c21383018mC = null;
        }
        recyclerViewLLII.setAdapter(c21383018mC);
        ((AbstractC21674919sB) recyclerViewLLII.getItemAnimator()).LLIZ = false;
        C786410Ut5.O7((FrameLayout) this.LLJL.getValue(), new ACListenerS166S0100000_32(this, 8));
        LLZLLLL(false);
        C786410Ut5.I7(new ACListenerS166S0100000_32(this, 9), (View) this.LLLFFI.getValue());
        LLZLI();
        LLLLZLL().vQ2().observe(this, new AObserverS234S0100000_32(this, 10));
        LLLLZLL().xQ2().observe(this, new AObserverS234S0100000_32(this, 11));
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C18ZR(this, null), 3);
        LLLLZLL().wQ2().observe(this, new AObserverS234S0100000_32(this, 12));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        SimplifyAsyncPlayer simplifyAsyncPlayer = LLLZLZ().LLILLJJLI;
        if (simplifyAsyncPlayer != null) {
            simplifyAsyncPlayer.LJJIIZI();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        if (this.LLJJIJI) {
            LLLZLZ().pause();
            this.LLJJ = true;
            this.LLJJI = true;
            C786410Ut5.LJLLLLLL(0, LLLZ());
            C21383018mC c21383018mC = this.LLILLJJLI;
            if (c21383018mC == null) {
                c21383018mC = null;
            }
            c21383018mC.LLLI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPlayProgressChange(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.LLJJIJI
            r5 = 0
            r4 = 0
            if (r0 != 0) goto L8b
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.LLLZLZ()
            long r0 = r0.LIZLLL()
            int r6 = r9.LLLLZIL(r0)
            if (r6 < 0) goto L59
            X.18mC r1 = r9.LLILLJJLI
            if (r1 != 0) goto L89
            r0 = r4
        L19:
            int r0 = r0.LLILZ
            if (r0 == r6) goto L59
            if (r1 != 0) goto L20
            r1 = r4
        L20:
            int r0 = r1.getItemCount()
            if (r6 >= r0) goto L59
            X.18mC r0 = r9.LLILLJJLI
            if (r0 != 0) goto L2b
            r0 = r4
        L2b:
            int r0 = r0.LLILZ
            int r0 = r0 + (-1)
            if (r6 != r0) goto L5d
            com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditViewModel r0 = r9.LLLLZLL()
            com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditItem r0 = r0.LLIZ
            if (r0 == 0) goto L5d
            java.util.List<com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData> r0 = r0.transSubtitleItem
            if (r0 == 0) goto L5d
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData r1 = (com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData) r1
            if (r1 == 0) goto L5d
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.LLLZLZ()
            long r7 = r0.LIZLLL()
            int r0 = r1.getEndTime()
            long r1 = (long) r0
            long r1 = r1 - r7
            r7 = 100
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L5d
        L59:
            r9.LLZZ(r6)
        L5c:
            return
        L5d:
            if (r6 != 0) goto L84
            r0 = 998445679(0x3b83126f, float:0.004)
            r9.LLJJIJIIJIL = r0
        L64:
            com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity$HighLightLayoutManager r3 = r9.LL
            if (r3 != 0) goto L69
            r3 = r4
        L69:
            androidx.recyclerview.widget.RecyclerView r2 = r9.LLII()
            X.19s1 r1 = new X.19s1
            r1.<init>()
            int r0 = r6 + (-2)
            int r0 = java.lang.Math.max(r0, r5)
            r3.smoothScrollToPosition(r2, r1, r0)
            X.18mC r0 = r9.LLILLJJLI
            if (r0 == 0) goto L80
            r4 = r0
        L80:
            r4.LLLFZ(r6)
            goto L59
        L84:
            r0 = 1137180672(0x43c80000, float:400.0)
            r9.LLJJIJIIJIL = r0
            goto L64
        L89:
            r0 = r1
            goto L19
        L8b:
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.LLLZLZ()
            long r2 = r0.LJ()
            float r1 = (float) r2
            float r1 = r1 * r10
            int r0 = r9.LLJJIJIL
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L5c
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.LLLZLZ()
            r0.pause()
            r0 = 1
            r9.LLJJ = r0
            r9.LLJJI = r0
            android.view.View r0 = r9.LLLZ()
            X.C786410Ut5.LJLLLLLL(r5, r0)
            X.18mC r0 = r9.LLILLJJLI
            if (r0 == 0) goto Lb4
            r4 = r0
        Lb4:
            r4.LLLI()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity.onPlayProgressChange(float):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        if (this.LLJILJILJ != null && !LLLZLZ().LJFF()) {
            LLLZZIL(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        LLLZLZ().LJIIJ();
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

    @Override // X.InterfaceC21383418mG
    public final void y1(int i) {
        List<CreatorCaptionEditData> list;
        CreatorCaptionEditData creatorCaptionEditData;
        CreatorCaptionEditItem creatorCaptionEditItem = LLLLZLL().LLIZ;
        if (creatorCaptionEditItem != null && (list = creatorCaptionEditItem.transSubtitleItem) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(list, i)) != null) {
            LLLZLZ().LJIIIZ((creatorCaptionEditData.getStartTime() * 100.0f) / LLLZLZ().LJ());
            this.LLJJIJIL = creatorCaptionEditData.getEndTime();
        }
        this.LLJJIJI = true;
        LLLZLZ().resume();
        this.LLJJ = false;
        this.LLJJI = false;
        C786410Ut5.LJLLLLLL(8, LLLZ());
    }

    @Override // X.InterfaceC21383418mG
    public final void z1(int i) {
        CreatorCaptionEditItem creatorCaptionEditItem;
        List<CreatorCaptionEditData> list;
        CreatorCaptionEditData creatorCaptionEditData;
        C742490TAp value;
        if (LLLLZLL().wQ2() != null) {
            MutableLiveData<C742490TAp> mutableLiveDataWQ2 = LLLLZLL().wQ2();
            if (mutableLiveDataWQ2 != null && (value = mutableLiveDataWQ2.getValue()) != null && (value.LIZ == 0 || value.LIZIZ)) {
                return;
            }
            LLZLLLL(true);
            C21383018mC c21383018mC = this.LLILLJJLI;
            C21383018mC c21383018mC2 = null;
            if (c21383018mC == null) {
                c21383018mC = null;
            }
            if (c21383018mC.LLILZ != i && (creatorCaptionEditItem = LLLLZLL().LLIZ) != null && (list = creatorCaptionEditItem.transSubtitleItem) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(list, i)) != null) {
                LLLZLZ().LJIIIZ((creatorCaptionEditData.getStartTime() * 100.0f) / LLLZLZ().LJ());
                this.LLJJIJIL = creatorCaptionEditData.getEndTime();
            }
            if (this.LLJJIJI) {
                C21383018mC c21383018mC3 = this.LLILLJJLI;
                if (c21383018mC3 == null) {
                    c21383018mC3 = null;
                }
                if (c21383018mC3.LLILZ == i) {
                    return;
                }
            }
            LLLZLZ().pause();
            this.LLJJ = true;
            this.LLJJI = true;
            this.LLJJIJI = true;
            C786410Ut5.LJLLLLLL(0, LLLZ());
            C21383018mC c21383018mC4 = this.LLILLJJLI;
            if (c21383018mC4 != null) {
                c21383018mC2 = c21383018mC4;
            }
            c21383018mC2.LLLFZ(i);
        }
    }

    public final class HighLightLayoutManager extends LinearLayoutManager {
        public HighLightLayoutManager(Context context) {
            super(context, 1, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
            final Context context;
            if (recyclerView != null) {
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.18ms
                @Override // X.C21674119s3
                public final int LJIIIIZZ(int i2, int i3, int i4, int i5, int i6) {
                    return i4 - i2;
                }

                @Override // X.C21674119s3
                public final int LJIILL() {
                    return -1;
                }

                @Override // X.AbstractC21674019s2
                public final PointF LIZ(int i2) {
                    return this.LJIILL.computeScrollVectorForPosition(i2);
                }

                @Override // X.C21674119s3
                public final float LJIIJJI(DisplayMetrics displayMetrics) {
                    int i2;
                    float f = CreatorCaptionEditActivity.this.LLJJIJIIJIL;
                    if (displayMetrics != null) {
                        i2 = displayMetrics.densityDpi;
                    } else {
                        i2 = 200;
                    }
                    return f / i2;
                }
            };
            c21674119s3.LIZ = i;
            startSmoothScroll(c21674119s3);
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
}
