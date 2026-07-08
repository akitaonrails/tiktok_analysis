package com.ss.android.ugc.aweme.newcreatoredit;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.C01GW;
import X.C098200Yq;
import X.C0IDF;
import X.C12ES;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20094213jo;
import X.C21383818mK;
import X.C21384118mN;
import X.C21384318mP;
import X.C21384818mU;
import X.C21673919s1;
import X.C21674119s3;
import X.C23250099c;
import X.C277510AuD;
import X.C418440Gaw;
import X.C452501pT;
import X.C480401ty;
import X.C480601u0;
import X.C583620Mum;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC21383518mH;
import X.EnumC2281141EQm;
import X.InterfaceC1473950oSX;
import X.InterfaceC21384918mV;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS134S0200000_32;
import Y.ACListenerS166S0100000_32;
import Y.AsS0S0120000_32;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.creatoredit.NewCreatorCaptionEditItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.impl.SimplifyAsyncPlayer;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import u4.q0;

/* JADX INFO: loaded from: classes33.dex */
public abstract class NewCreatorCaptionEditFragment extends Fragment implements OnUIPlayListener, InterfaceC21384918mV {
    public static final /* synthetic */ int LLJZ = 0;
    public boolean LL;
    public NewCreatorCaptionEditItem LLILLJJLI;
    public NewCreatorCaptionEditViewModel LLILZ;
    public C21384318mP LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJILJIL;
    public int LLJJ;
    public HighLightLayoutManager LLJJIJI;
    public RecyclerView LLJJIJIIJIL;
    public C21383818mK LLJJIJIL;
    public FrameLayout LLJJJIL;
    public RoundedFrameLayout LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public C1749280vcc LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public ViewGroup LLJLIL;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 227));
    public float LLJIJIL = 0.004f;
    public final int LLJILJILJ = 2;
    public final int LLJILLL = 5;
    public final ACListenerS166S0100000_32 LLJJI = new ACListenerS166S0100000_32(this, 27);
    public final ACListenerS166S0100000_32 LLJJIII = new ACListenerS166S0100000_32(this, 25);
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(76));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 924));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 925));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 926));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 228));

    public abstract void MR(boolean z);

    public abstract void OR();

    public abstract ViewGroup ZR(View view);

    public abstract boolean cS();

    public abstract void dS();

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
    public final void onPlayProgressChange(String str, long j, long j2) {
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

    public final C21384118mN RR() {
        return (C21384118mN) this.LLILLL.getValue();
    }

    public final VideoViewComponent VR() {
        return (VideoViewComponent) this.LLJJJ.getValue();
    }

    public final Aweme getAweme() {
        C21384818mU c21384818mU;
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LLILZ;
        if (newCreatorCaptionEditViewModel == null || (c21384818mU = newCreatorCaptionEditViewModel.LLILZLL) == null) {
            return null;
        }
        return c21384818mU.LJII;
    }

    public final void hS() {
        if (!this.LLJ || UR() == null) {
            return;
        }
        VR().LJIIL(UR());
        FrameLayout frameLayout = this.LLJJJJJIL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS166S0100000_32(this, 26));
        }
        FrameLayout frameLayout2 = this.LLJJJJJIL;
        if (frameLayout2 != null) {
            frameLayout2.setContentDescription(getString(2131823202));
        }
        final String string = getString(2131823179);
        final String string2 = getString(2131823177);
        FrameLayout frameLayout3 = this.LLJJJJJIL;
        if (frameLayout3 != null) {
            q0.LJIJ(frameLayout3, new C20094213jo() { // from class: X.18mX
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    String str;
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    if (this.LIZ.LLIZ) {
                        str = string;
                    } else {
                        str = string2;
                    }
                    accessibilityNodeInfoCompat.addAction(new C20092413jW(16, str));
                }
            });
        }
    }

    public final void mS() {
        C21384818mU c21384818mU;
        Long l;
        C21384818mU c21384818mU2;
        String str;
        String aid;
        String strYQ2;
        NewCreatorCaptionEditItem newCreatorCaptionEditItemZQ2;
        String strVQ2;
        NewCreatorCaptionEditItem newCreatorCaptionEditItemXQ2;
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LLILZ;
        Integer numValueOf = null;
        if (newCreatorCaptionEditViewModel == null || (c21384818mU = newCreatorCaptionEditViewModel.LLILZLL) == null || (l = c21384818mU.LIZ) == null) {
            return;
        }
        long jLongValue = l.longValue();
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel2 = this.LLILZ;
        if (newCreatorCaptionEditViewModel2 == null || (c21384818mU2 = newCreatorCaptionEditViewModel2.LLILZLL) == null || (str = c21384818mU2.LIZIZ) == null) {
            return;
        }
        Aweme aweme = getAweme();
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        if (this.LL) {
            AwS146S1100000_32 awS146S1100000_32 = new AwS146S1100000_32(this, aid, 3);
            NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel3 = this.LLILZ;
            AwS146S1100000_32 awS146S1100000_322 = new AwS146S1100000_32(this, newCreatorCaptionEditViewModel3 != null ? newCreatorCaptionEditViewModel3.vQ2() : null, 2);
            if (cS()) {
                NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel4 = this.LLILZ;
                if (newCreatorCaptionEditViewModel4 != null && (newCreatorCaptionEditItemXQ2 = newCreatorCaptionEditViewModel4.xQ2()) != null) {
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(newCreatorCaptionEditViewModel4), null, null, new C480601u0(awS146S1100000_322, awS146S1100000_32, jLongValue, str, newCreatorCaptionEditItemXQ2, null), 3);
                }
            } else {
                NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel5 = this.LLILZ;
                if (newCreatorCaptionEditViewModel5 != null) {
                    long j = CastLongProtector.parseLong(str);
                    if (this.LLILZ != null && (strYQ2 = NewCreatorCaptionEditViewModel.yQ2()) != null && (newCreatorCaptionEditItemZQ2 = newCreatorCaptionEditViewModel5.zQ2()) != null) {
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(newCreatorCaptionEditViewModel5), null, null, new C480401ty(awS146S1100000_322, awS146S1100000_32, jLongValue, j, strYQ2, newCreatorCaptionEditItemZQ2, null), 3);
                    }
                }
            }
            NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel6 = this.LLILZ;
            if (newCreatorCaptionEditViewModel6 != null && (strVQ2 = newCreatorCaptionEditViewModel6.vQ2()) != null) {
                newCreatorCaptionEditViewModel6.LLJJIJI.add(strVQ2);
            }
            MR(true);
            kS(false);
            if (this.LLIZ) {
                gS(false);
            }
            NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel7 = this.LLILZ;
            if (newCreatorCaptionEditViewModel7 != null) {
                NewCreatorCaptionEditItem newCreatorCaptionEditItemWQ2 = newCreatorCaptionEditViewModel7.wQ2(cS());
                numValueOf = Integer.valueOf((newCreatorCaptionEditItemWQ2 != null ? newCreatorCaptionEditItemWQ2.remainingEditTimes : 0) - 1);
            }
            String string = getString(2131828797, numValueOf);
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nS() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.creatoredit.NewCreatorCaptionEditItem r1 = r4.LLILLJJLI
            r3 = 1
            if (r1 == 0) goto L1b
            boolean r0 = r1.isUnderReview()
            if (r0 != 0) goto L1b
            int r0 = r1.remainingEditTimes
            if (r0 <= 0) goto L1b
            java.util.List<com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData> r1 = r1.transSubtitleItem
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L3f
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L3f
        L1b:
            r0 = 0
        L1c:
            X.18mK r2 = r4.LLJJIJIL
            if (r2 == 0) goto L3c
            if (r0 == 0) goto L26
            boolean r0 = r4.LL
            if (r0 != 0) goto L39
        L26:
            com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel r0 = r4.LLILZ
            if (r0 == 0) goto L3d
            X.18mU r0 = r0.LLILZLL
            if (r0 == 0) goto L3d
            java.lang.Boolean r1 = r0.LJI
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L39
            r3 = 0
        L39:
            r2.LIZJ(r3)
        L3c:
            return
        L3d:
            r1 = 0
            goto L30
        L3f:
            java.util.Iterator r1 = r1.iterator()
        L43:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData r0 = (com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData) r0
            java.lang.String r0 = r0.getText()
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L43
            r0 = 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment.nS():void");
    }

    public final String SR() {
        return cS() ? "original" : "translation";
    }

    public final Video UR() {
        Aweme aweme = getAweme();
        if (aweme != null) {
            return aweme.getVideo();
        }
        return null;
    }

    public final void WR() {
        ViewGroup.LayoutParams layoutParams;
        Aweme aweme = getAweme();
        if (aweme == null) {
            return;
        }
        int iLJIIIIZZ = C12ES.LJIIIIZZ(requireContext());
        int iLJIIJ = C12ES.LJIIJ(requireContext());
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        int i = (int) (iLJIIIIZZ * 0.4f);
        int i2 = (i - iLIZIZ) - iLIZIZ2;
        int iMin = Math.min(iLJIIJ, (aweme.getVideo().getWidth() * i2) / aweme.getVideo().getHeight());
        int iMin2 = Math.min(i2, (iLJIIJ * aweme.getVideo().getHeight()) / aweme.getVideo().getWidth());
        FrameLayout frameLayout = this.LLJJJIL;
        if (frameLayout != null) {
            frameLayout.setPadding(0, iLIZIZ, 0, iLIZIZ2);
        }
        FrameLayout frameLayout2 = this.LLJJJIL;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (frameLayout2 != null) {
            layoutParams = frameLayout2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i;
            }
        } else {
            layoutParams = null;
        }
        FrameLayout frameLayout3 = this.LLJJJIL;
        if (frameLayout3 != null) {
            C786410Ut5.a6(frameLayout3, layoutParams);
        }
        RoundedFrameLayout roundedFrameLayout = this.LLJJJJ;
        if (roundedFrameLayout != null && (layoutParams2 = roundedFrameLayout.getLayoutParams()) != null) {
            layoutParams2.width = iMin;
            layoutParams2.height = iMin2;
        }
        RoundedFrameLayout roundedFrameLayout2 = this.LLJJJJ;
        if (roundedFrameLayout2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(roundedFrameLayout2);
            roundedFrameLayout2.setLayoutParams(layoutParams2);
        }
        RoundedFrameLayout roundedFrameLayout3 = this.LLJJJJ;
        if (roundedFrameLayout3 != null) {
            roundedFrameLayout3.invalidate();
        }
        if (!this.LLILZLL) {
            FrameLayout frameLayout4 = this.LLJJJJJIL;
            if (frameLayout4 != null) {
                C786410Ut5.LJZ(0, frameLayout4);
            }
            if (aweme.getVideo() != null) {
                VR().LIZIZ(this.LLJJJJJIL);
                VR().LIZ(this);
                VR().LJIIJ();
                VR().LLILLL.Dn(new InterfaceC1473950oSX() { // from class: X.18mT
                    @Override // X.InterfaceC1473950oSX
                    public final void LLF(int i3, int i4) {
                    }

                    @Override // X.InterfaceC1473950oSX
                    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    }

                    @Override // X.InterfaceC1473950oSX
                    public final void LIZ() {
                        this.LL.LLJ = false;
                    }

                    @Override // X.InterfaceC1473950oSX
                    public final void LLILLIZIL(int i3, int i4) {
                        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel;
                        NewCreatorCaptionEditFragment newCreatorCaptionEditFragment = this.LL;
                        newCreatorCaptionEditFragment.LLJ = true;
                        if (newCreatorCaptionEditFragment.cS() || ((newCreatorCaptionEditViewModel = this.LL.LLILZ) != null && newCreatorCaptionEditViewModel.LLJJ)) {
                            this.LL.hS();
                        }
                    }
                });
                this.LLILZLL = true;
            }
        }
        if (cS()) {
            hS();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void aS() {
        /*
            r3 = this;
            boolean r0 = r3.cS()
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel r0 = r3.LLILZ
            if (r0 == 0) goto L18
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r2 = r0.LLJILJIL
        Lc:
            if (r2 == 0) goto L18
            Y.AObserverS234S0100000_32 r1 = new Y.AObserverS234S0100000_32
            r0 = 22
            r1.<init>(r3, r0)
            r2.observe(r3, r1)
        L18:
            com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel r0 = r3.LLILZ
            if (r0 == 0) goto L2a
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r2 = r0.LLJIJIL
            if (r2 == 0) goto L2a
            Y.AObserverS234S0100000_32 r1 = new Y.AObserverS234S0100000_32
            r0 = 23
            r1.<init>(r3, r0)
            r2.observe(r3, r1)
        L2a:
            boolean r0 = r3.cS()
            if (r0 == 0) goto L43
            com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel r0 = r3.LLILZ
            if (r0 == 0) goto L42
            androidx.lifecycle.MutableLiveData<X.0wOw<com.ss.android.ugc.aweme.creatoredit.NewCreatorCaptionEditItem>> r2 = r0.LLJ
        L36:
            if (r2 == 0) goto L42
            Y.AObserverS234S0100000_32 r1 = new Y.AObserverS234S0100000_32
            r0 = 24
            r1.<init>(r3, r0)
            r2.observe(r3, r1)
        L42:
            return
        L43:
            com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel r0 = r3.LLILZ
            if (r0 == 0) goto L42
            androidx.lifecycle.MutableLiveData<X.0wOw<com.ss.android.ugc.aweme.creatoredit.NewCreatorCaptionEditItem>> r2 = r0.LLJI
            goto L36
        L4a:
            com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel r0 = r3.LLILZ
            if (r0 == 0) goto L18
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r2 = r0.LLJILJILJ
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment.aS():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (VR().LJFF()) {
            VR().LJIIJJI();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((Handler) this.LLJLL.getValue()).removeCallbacksAndMessages(null);
        if (VR() != null && VR().LJFF()) {
            gS(false);
        }
        SystemClock.elapsedRealtime();
    }

    public final void NR(Boolean bool) {
        int i;
        String strJ4;
        NewCreatorCaptionEditItem newCreatorCaptionEditItemWQ2;
        EnumC21383518mH enumC21383518mH;
        NewCreatorCaptionEditItem newCreatorCaptionEditItemWQ22;
        String strVQ2;
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LLILZ;
        if (newCreatorCaptionEditViewModel != null && (((newCreatorCaptionEditItemWQ22 = newCreatorCaptionEditViewModel.wQ2(cS())) != null && newCreatorCaptionEditItemWQ22.isUnderReview()) || ((strVQ2 = newCreatorCaptionEditViewModel.vQ2()) != null && newCreatorCaptionEditViewModel.LLJJIJI.contains(strVQ2)))) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131828792);
            c1389890mGx.LJIIJJI();
        } else {
            NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel2 = this.LLILZ;
            if (newCreatorCaptionEditViewModel2 != null && (newCreatorCaptionEditItemWQ2 = newCreatorCaptionEditViewModel2.wQ2(cS())) != null && newCreatorCaptionEditItemWQ2.remainingEditTimes > 0) {
                if (this.LL) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(this);
                    c1389890mGx2.LJIIIZ(2131829439);
                    c1389890mGx2.LJIIJJI();
                }
            } else {
                if (cS()) {
                    i = this.LLJILJILJ;
                } else {
                    i = this.LLJILLL;
                }
                if (((Boolean) C277510AuD.LIZ.getValue()).booleanValue()) {
                    strJ4 = getString(2131828791, Integer.valueOf(i));
                } else {
                    strJ4 = C786410Ut5.j4(getResources().getQuantityString(2131755298, i), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                }
                C1389890mGx c1389890mGx3 = new C1389890mGx(this);
                c1389890mGx3.LJIIJ(strJ4);
                c1389890mGx3.LJIIJJI();
            }
        }
        if (bool != null) {
            C21384118mN c21384118mNRR = RR();
            if (bool.booleanValue()) {
                enumC21383518mH = EnumC21383518mH.PENCIL;
            } else {
                enumC21383518mH = EnumC21383518mH.CLICK_SUBTITLE;
            }
            c21384118mNRR.LJ(enumC21383518mH, SR(), false, false);
        }
    }

    public final int PR(long j) {
        List<CreatorCaptionEditData> list;
        NewCreatorCaptionEditItem newCreatorCaptionEditItem = this.LLILLJJLI;
        if (newCreatorCaptionEditItem != null && (list = newCreatorCaptionEditItem.transSubtitleItem) != null) {
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

    public void bS(View view) {
        int iIntValue;
        int iIntValue2;
        Integer numLIZJ;
        Integer numLIZJ2;
        AbstractC21674919sB abstractC21674919sB;
        this.LLJJJIL = (FrameLayout) view.findViewById(R.id.qta);
        this.LLJJJJ = (RoundedFrameLayout) view.findViewById(R.id.tsy);
        this.LLJJJJJIL = (FrameLayout) view.findViewById(R.id.video_view_new);
        this.LLJJJJLIIL = (C1749280vcc) view.findViewById(R.id.nng);
        this.LLJJL = view.findViewById(R.id.video_play_btn_new);
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.tf6);
        this.LLJL = (TuxTextView) view.findViewById(R.id.dl4);
        this.LLJJIJIIJIL = (RecyclerView) view.findViewById(R.id.gov);
        this.LLJJIJIL = new C21383818mK(view.findViewById(R.id.ye2));
        RecyclerView recyclerView = this.LLJJIJIIJIL;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new C0IDF(this, 5));
            recyclerView.addOnScrollListener(new AsS0S0120000_32(this, 1));
            NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LLILZ;
            C21384318mP c21384318mP = null;
            if (newCreatorCaptionEditViewModel != null) {
                c21384318mP = new C21384318mP(newCreatorCaptionEditViewModel, this, cS(), RR());
            }
            this.LLILZIL = c21384318mP;
            HighLightLayoutManager highLightLayoutManager = new HighLightLayoutManager(requireContext());
            this.LLJJIJI = highLightLayoutManager;
            recyclerView.setLayoutManager(highLightLayoutManager);
            recyclerView.setAdapter(this.LLILZIL);
            AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
            if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                abstractC21674919sB.LLIZ = false;
            }
        }
        C21383818mK c21383818mK = this.LLJJIJIL;
        if (c21383818mK != null) {
            String string = getString(R.string.f1_);
            TextView textView = (TextView) c21383818mK.LJFF.getValue();
            C21383818mK.LJ(textView, true);
            textView.setText(string);
            C21383818mK.LJ((View) c21383818mK.LJII.getValue(), false);
            c21383818mK.LJFF(getString(R.string.hz2));
            c21383818mK.LIZJ(false);
            c21383818mK.LIZJ = new ACListenerS166S0100000_32(this, 116);
            c21383818mK.LJI();
            c21383818mK.LIZLLL = new ACListenerS166S0100000_32(this, 117);
            c21383818mK.LJI();
            c21383818mK.LJ = new ACListenerS166S0100000_32(this, 118);
            c21383818mK.LJI();
        }
        this.LLJLIL = ZR(view);
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 226);
        String string2 = getString(2131828796);
        String string3 = getString(2131828795);
        String strJ4 = C786410Ut5.j4(string2, Arrays.copyOf(new Object[]{string3}, 1));
        SpannableString spannableString = new SpannableString(strJ4);
        int iLJJJ = a0.LJJJ(strJ4, string3, 0, false, 6);
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.zk, topActivity)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), 0, iLJJJ, 33);
        int length = string3.length() + iLJJJ;
        Activity topActivity2 = ActivityStack.getTopActivity();
        if (topActivity2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, topActivity2)) != null) {
            iIntValue2 = numLIZJ.intValue();
        } else {
            iIntValue2 = 0;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue2), iLJJJ, length, 33);
        final ACListenerS134S0200000_32 aCListenerS134S0200000_32 = new ACListenerS134S0200000_32(this, awS576S0100000_32, 22);
        C786410Ut5.p2(spannableString, new ClickableSpan(aCListenerS134S0200000_32) { // from class: X.15Wj
            public final View.OnClickListener LL;

            {
                this.LL = aCListenerS134S0200000_32;
            }

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view2) {
                this.LL.onClick(view2);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        }, iLJJJ, length, 33);
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null) {
            tuxTextView.setText(spannableString);
        }
        TuxTextView tuxTextView2 = this.LLJL;
        if (tuxTextView2 != null) {
            tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        View view2 = this.LLJJLIIIJLLLLLLLZ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS134S0200000_32(this, awS576S0100000_32, 21), view2);
        }
        FrameLayout frameLayout = this.LLJJJIL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS166S0100000_32(this, 115));
        }
        kS(false);
    }

    public final void gS(boolean z) {
        C21384318mP c21384318mP;
        if (this.LLIZ) {
            if (!VR().LJFF() && UR() != null) {
                this.LLJI = false;
                C21384318mP c21384318mP2 = this.LLILZIL;
                if (c21384318mP2 != null) {
                    c21384318mP2.LLLILZ();
                }
                VR().resume();
                this.LLIZ = false;
                this.LLIZLLLIL = false;
                View view = this.LLJJL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                    return;
                }
                return;
            }
            return;
        }
        if (!VR().LJFF()) {
            return;
        }
        VR().pause();
        if (this.LLJI && (c21384318mP = this.LLILZIL) != null) {
            c21384318mP.LLLIILIL();
        }
        this.LLIZ = true;
        if (!z) {
            return;
        }
        this.LLIZLLLIL = true;
        View view2 = this.LLJJL;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view2);
    }

    public final void kS(boolean z) {
        String string;
        int i;
        int i2;
        C21383818mK c21383818mK = this.LLJJIJIL;
        if (c21383818mK != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            c21383818mK.LIZLLL(i2);
        }
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LLILZ;
        if (newCreatorCaptionEditViewModel != null && !Intrinsics.LJFF(Boolean.valueOf(z), newCreatorCaptionEditViewModel.LLJIJIL.getValue())) {
            newCreatorCaptionEditViewModel.LLJIJIL.postValue(Boolean.valueOf(z));
        }
        C21383818mK c21383818mK2 = this.LLJJIJIL;
        if (c21383818mK2 != null) {
            Resources resources = getResources();
            if (z) {
                i = R.string.sg8;
            } else {
                i = R.string.hz2;
            }
            c21383818mK2.LJFF(resources.getString(i));
        }
        C21383818mK c21383818mK3 = this.LLJJIJIL;
        if (c21383818mK3 != null) {
            if (z) {
                string = getResources().getString(2131826896);
            } else {
                string = "";
            }
            ((TextView) c21383818mK3.LJIIIZ.getValue()).setText(string);
            C21383818mK.LJ((View) c21383818mK3.LJIIIZ.getValue(), true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        context.setTheme(R.style.y0);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        SimplifyAsyncPlayer simplifyAsyncPlayer = VR().LLILLJJLI;
        if (simplifyAsyncPlayer != null) {
            simplifyAsyncPlayer.LJJIIZI();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        if (this.LLJI) {
            VR().pause();
            this.LLIZ = true;
            this.LLIZLLLIL = true;
            View view = this.LLJJL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            C21384318mP c21384318mP = this.LLILZIL;
            if (c21384318mP != null) {
                c21384318mP.LLLIILIL();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        if (!this.LLJI) {
            RecyclerView recyclerView = this.LLJJIJIIJIL;
            if (recyclerView != null && recyclerView.getVisibility() == 0) {
                iS(PR(VR().LIZLLL()), false);
                return;
            }
            return;
        }
        if (VR().LJ() * f < this.LLJILJIL) {
            return;
        }
        VR().pause();
        this.LLIZ = true;
        this.LLIZLLLIL = true;
        View view = this.LLJJL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C21384318mP c21384318mP = this.LLILZIL;
        if (c21384318mP == null) {
            return;
        }
        c21384318mP.LLLIILIL();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        if (UR() != null && !VR().LJFF()) {
            gS(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        VR().LJIIJ();
    }

    @Override // X.InterfaceC21384918mV
    public final void y1(int i) {
        List<CreatorCaptionEditData> list;
        CreatorCaptionEditData creatorCaptionEditData;
        NewCreatorCaptionEditItem newCreatorCaptionEditItem = this.LLILLJJLI;
        if (newCreatorCaptionEditItem != null && (list = newCreatorCaptionEditItem.transSubtitleItem) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(list, i)) != null) {
            VR().LJIIIZ((creatorCaptionEditData.getStartTime() * 100.0f) / VR().LJ());
            this.LLJILJIL = creatorCaptionEditData.getEndTime();
        }
        this.LLJI = true;
        VR().resume();
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        View view = this.LLJJL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    /* JADX INFO: loaded from: classes32.dex */
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
            C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.1580
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
                    float f = NewCreatorCaptionEditFragment.this.LLJIJIL;
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

    public final void iS(int i, boolean z) {
        C21384318mP c21384318mP;
        NewCreatorCaptionEditItem newCreatorCaptionEditItem;
        List<CreatorCaptionEditData> list;
        CreatorCaptionEditData creatorCaptionEditData;
        C21384318mP c21384318mP2 = this.LLILZIL;
        if (c21384318mP2 != null && i >= 0) {
            if ((!z && c21384318mP2.LLILZIL == i) || i >= c21384318mP2.getItemCount()) {
                return;
            }
            C21384318mP c21384318mP3 = this.LLILZIL;
            if (c21384318mP3 != null && i == c21384318mP3.LLILZIL - 1 && (newCreatorCaptionEditItem = this.LLILLJJLI) != null && (list = newCreatorCaptionEditItem.transSubtitleItem) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(list, i)) != null) {
                if (((long) creatorCaptionEditData.getEndTime()) - VR().LIZLLL() <= 100) {
                    return;
                }
            }
            if (i != 0 && !z) {
                this.LLJIJIL = 400.0f;
            } else {
                this.LLJIJIL = 0.004f;
            }
            HighLightLayoutManager highLightLayoutManager = this.LLJJIJI;
            if (highLightLayoutManager != null) {
                highLightLayoutManager.smoothScrollToPosition(this.LLJJIJIIJIL, new C21673919s1(), Math.max(i - 2, 0));
            }
            if (z || (c21384318mP = this.LLILZIL) == null) {
                return;
            }
            c21384318mP.LLLII(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bS(view);
        aS();
    }

    @Override // X.InterfaceC21384918mV
    public final void uo(int i, boolean z) {
        boolean zLJFF;
        C21384318mP c21384318mP;
        List<CreatorCaptionEditData> list;
        CreatorCaptionEditData creatorCaptionEditData;
        EnumC21383518mH enumC21383518mH;
        EnumC21383518mH enumC21383518mH2;
        MutableLiveData<Boolean> mutableLiveData;
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LLILZ;
        if (newCreatorCaptionEditViewModel != null && (mutableLiveData = newCreatorCaptionEditViewModel.LLJIJIL) != null) {
            zLJFF = Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.FALSE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            C21384118mN c21384118mNRR = RR();
            if (z) {
                enumC21383518mH = EnumC21383518mH.PENCIL;
            } else {
                enumC21383518mH = EnumC21383518mH.CLICK_SUBTITLE;
            }
            c21384118mNRR.LJ(enumC21383518mH, SR(), true, false);
            C21384118mN c21384118mNRR2 = RR();
            if (z) {
                enumC21383518mH2 = EnumC21383518mH.CLICK_PENCIL;
            } else {
                enumC21383518mH2 = EnumC21383518mH.CLICK_SUBTITLE;
            }
            c21384118mNRR2.LJIIIIZZ(enumC21383518mH2, SR());
        }
        this.LLJJ = i;
        kS(true);
        NewCreatorCaptionEditItem newCreatorCaptionEditItem = this.LLILLJJLI;
        if (newCreatorCaptionEditItem != null && (list = newCreatorCaptionEditItem.transSubtitleItem) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(list, i)) != null) {
            VR().LJIIIZ((creatorCaptionEditData.getStartTime() * 100.0f) / VR().LJ());
            this.LLJILJIL = creatorCaptionEditData.getEndTime();
        }
        if (this.LLJI && (c21384318mP = this.LLILZIL) != null && c21384318mP.LLILZIL == i) {
            return;
        }
        VR().pause();
        this.LLIZ = true;
        this.LLIZLLLIL = true;
        this.LLJI = true;
        View view = this.LLJJL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C21384318mP c21384318mP2 = this.LLILZIL;
        if (c21384318mP2 == null) {
            return;
        }
        c21384318mP2.LLLII(i);
    }

    @Override // X.InterfaceC21384918mV
    public final void zQ(int i, boolean z) {
        NewCreatorCaptionEditItem newCreatorCaptionEditItem;
        List<CreatorCaptionEditData> list;
        CreatorCaptionEditData creatorCaptionEditData;
        NR(Boolean.valueOf(z));
        if (!z && (newCreatorCaptionEditItem = this.LLILLJJLI) != null && (list = newCreatorCaptionEditItem.transSubtitleItem) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(list, i)) != null) {
            VR().LJIIIZ((creatorCaptionEditData.getStartTime() * 100.0f) / VR().LJ());
            this.LLJILJIL = creatorCaptionEditData.getEndTime();
            if (this.LLIZ) {
                gS(false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.b5o, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
