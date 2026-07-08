package com.ss.android.ugc.aweme.feed.assem.tikbot;

import X.AbstractC1387200mCc;
import X.AnonymousClass0956;
import X.C01GW;
import X.C04SF;
import X.C04WD;
import X.C07EE;
import X.C07EF;
import X.C07G1;
import X.C07G7;
import X.C0PEM;
import X.C13LE;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1483410ohn;
import X.C14LC;
import X.C14T7;
import X.C14TF;
import X.C14TG;
import X.C14TH;
import X.C14TI;
import X.C1558520qew;
import X.C1590970rVH;
import X.C19659111vp;
import X.C19751612Pq;
import X.C1DFH;
import X.C1E9G;
import X.C20235514Ft;
import X.C2107308Nj;
import X.C2136408Yo;
import X.C2189821An6;
import X.C2260908tT;
import X.C2296808zG;
import X.C23250099c;
import X.C287280BNu;
import X.C298790BnR;
import X.C418440Gaw;
import X.C452501pT;
import X.C520040KaQ;
import X.C583620Mum;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C708910RrN;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC2281141EQm;
import X.InterfaceC1350790lFt;
import X.InterfaceC497601wk;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.InterfaceC739770T0d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.tikbot.ability.ITakoFeedIconAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS491S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoAssem extends BaseCellSlotComponent<TakoAssem> implements ComponentPriorityProtocol, OnUIPlayListener, ITakoFeedIconAbility {
    public static volatile boolean LLLIILIL;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS274S0000000_30.get$arr$(59));
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(76));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 54));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 52));
    public InterfaceC497601wk LLL;
    public boolean LLLF;
    public AnonymousClass0956 LLLFF;
    public boolean LLLFFI;
    public Boolean LLLFZ;
    public Boolean LLLI;
    public boolean LLLII;
    public final C01GW LLLIIII;
    public C19751612Pq LLLIIIIL;
    public final C14TI LLLIIIL;
    public final C01GW LLLIIL;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "right_container_chat_gpt";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
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
    public final /* synthetic */ void onPlayCompleted(String str) {
        C583620Mum.LJIJI(this, str);
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
    public final /* synthetic */ void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C583620Mum.LJJJJ(this, c1480420ocy);
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

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    public final Long Fp() {
        IPlayerComponentAbility iPlayerComponentAbility;
        InterfaceC739770T0d interfaceC739770T0dP2;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid();
        if (aid == null || aid.length() <= 0 || (iPlayerComponentAbility = (IPlayerComponentAbility) this.LLJZ.getValue()) == null || (interfaceC739770T0dP2 = iPlayerComponentAbility.P2()) == null) {
            return null;
        }
        return Long.valueOf(interfaceC739770T0dP2.LJLJJI(aid));
    }

    public final void Ip() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        C14TF c14tf = C14TF.LIZIZ;
        if (c14tf.LJIJJ(aweme)) {
            c14tf.LJLLJ(C1483410ohn.LJLJJI().getCurrentPosition(), aweme.getAid());
        } else if (c14tf.LJLIIL(aweme)) {
            String aid = aweme.getAid();
            IPhotoModeAbility iPhotoModeAbility = (IPhotoModeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPhotoModeAbility.class, null);
            c14tf.LJJIJL(iPhotoModeAbility != null ? iPhotoModeAbility.fj1() : -1, aid);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        AnonymousClass0956 anonymousClass0956 = this.LLLFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLFF = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return this.LLLIIIL.layoutRes();
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return ((Boolean) this.LLLIIL.getValue()).booleanValue();
    }

    public TakoAssem() {
        C14TI c14tg;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLL = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLLIIII = C452501pT.LIZIZ(new AwS574S0100000_30(this, 55));
        if ((C07G1.LIZ() & 1024) != 0) {
            c14tg = new C14TH();
        } else if (((Boolean) C04SF.LIZ.getValue()).booleanValue() && C14LC.LJIIIZ) {
            c14tg = new C14TH();
        } else {
            SettingsManager.LIZLLL().getClass();
            c14tg = SettingsManager.LIZ("tako_feed_icon_bubble_enable", true) ? new C14TG() : new C14TH();
        }
        this.LLLIIIL = c14tg;
        this.LLLIIL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(75));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    public static void Jp(View view) {
        if ((C07G1.LIZ() & 8) != 0) {
            if (view.getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(0, view);
    }

    public final void Bp(boolean z) {
        boolean z2;
        InterfaceC497601wk interfaceC497601wk;
        InteractAreaCommonAbility interactAreaCommonAbility;
        boolean z3 = true;
        if ((C07G1.LIZ() & 64) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = 8;
        if (z2) {
            if (LJJIJL().getVisibility() != 0) {
                z3 = false;
            }
            if (z3 != z) {
                View viewLJJIJL = LJJIJL();
                if (z) {
                    i = 0;
                }
                C786410Ut5.LJLLLLLL(i, viewLJJIJL);
            }
        } else {
            View viewLJJIJL2 = LJJIJL();
            if (z) {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, viewLJJIJL2);
        }
        if (((Boolean) this.LLLIIL.getValue()).booleanValue() && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJZIJLIL.getValue()) != null) {
            interactAreaCommonAbility.CL("right_container_chat_gpt", this, z);
        }
        if (this.LLLFFI && z) {
            this.LLLFFI = false;
            if (LJJIJL().isShown() && (interfaceC497601wk = this.LLL) != null) {
                C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C20235514Ft(this, null), 2);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void Ep(boolean z) {
        Object obj;
        Object obj2;
        C2189821An6 c2189821An6;
        C2189821An6 c2189821An62 = null;
        Object obj3 = null;
        if (z) {
            C14TF c14tf = C14TF.LIZIZ;
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj2 = c724270Sb3.LL;
            } else {
                obj2 = null;
            }
            BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) obj2).baseFeedPageParams;
            if (baseFeedPageParams != null) {
                c2189821An6 = baseFeedPageParams.param;
            } else {
                c2189821An6 = null;
            }
            LifecycleOwner lifecycleOwnerLIZ = C1590970rVH.LIZ(this);
            if (lifecycleOwnerLIZ == null) {
                lifecycleOwnerLIZ = C724240Sb0.LIZ(this);
            }
            ImageView iconView = this.LLLIIIL.getIconView();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj3 = c724270Sb32.LL;
            }
            c14tf.LJJLIIIJL(c2189821An6, lifecycleOwnerLIZ, iconView, ((VideoItemParams) obj3).getAweme(), new AwS574S0100000_30(this, 51), new AwS609S0100000_30(this, 65), new C14T7(this));
            return;
        }
        C14TF c14tf2 = C14TF.LIZIZ;
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj = c724270Sb33.LL;
        } else {
            obj = null;
        }
        BaseFeedPageParams baseFeedPageParams2 = ((VideoItemParams) obj).baseFeedPageParams;
        if (baseFeedPageParams2 != null) {
            c2189821An62 = baseFeedPageParams2.param;
        }
        LifecycleOwner lifecycleOwnerLIZ2 = C1590970rVH.LIZ(this);
        if (lifecycleOwnerLIZ2 == null) {
            lifecycleOwnerLIZ2 = C724240Sb0.LIZ(this);
        }
        c14tf2.LJJLIIIJL(c2189821An62, lifecycleOwnerLIZ2, null, null, AFwS217S0000000_28.get$arr$(392), AFwS231S0000000_3.get$arr$(98), AFwS274S0000000_30.get$arr$(156));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Qp(X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C2441709hX
            if (r0 == 0) goto L55
            r5 = r7
            X.09hX r5 = (X.C2441709hX) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L5b
            com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem r0 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L26:
            r0.LLLFZ = r1
            java.lang.Boolean r1 = r6.LLLFZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L37:
            X.C155000ia.LIZIZ(r1)
            java.lang.Boolean r1 = r6.LLLFZ
            if (r1 != 0) goto L53
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0CrQ r1 = new X.0CrQ
            r0 = 0
            r1.<init>(r6, r0)
            r5.LL = r6
            r5.LLILZ = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L51
            return r4
        L51:
            r0 = r6
            goto L24
        L53:
            r0 = r6
            goto L26
        L55:
            X.09hX r5 = new X.09hX
            r5.<init>(r6, r7)
            goto L12
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem.Qp(X.05Vn):java.lang.Object");
    }

    public final boolean Tp(VideoItemParams videoItemParams) {
        C2189821An6 c2189821An6;
        Boolean boolValueOf = this.LLLI;
        if (boolValueOf == null) {
            InterfaceC1350790lFt interfaceC1350790lFtLJIILL = C14TF.LIZIZ.LJIILL();
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams != null) {
                c2189821An6 = baseFeedPageParams.param;
            } else {
                c2189821An6 = null;
            }
            boolValueOf = Boolean.valueOf(interfaceC1350790lFtLJIILL.LJIILL(c2189821An6));
        }
        this.LLLI = boolValueOf;
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return false;
        }
        if ((C298790BnR.LIZ() & 2) == 0 && !C14TF.LIZIZ.LJIILL().LJFF(videoItemParams.getAweme())) {
            return false;
        }
        return true;
    }

    public final void Up(boolean z) {
        boolean z2;
        Object obj;
        String aid;
        if ((C07G1.LIZ() & 128) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !C07EE.LIZ()) {
            if (!z) {
                AnonymousClass0956 anonymousClass0956 = this.LLLFF;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLLFF = null;
                return;
            }
            return;
        }
        if (!z) {
            AnonymousClass0956 anonymousClass09562 = this.LLLFF;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            this.LLLFF = null;
            if (LLLIILIL && C07EE.LIZ()) {
                Ep(false);
                return;
            }
            return;
        }
        if (!LLLIILIL) {
            if (!C07EF.LIZ()) {
                AnonymousClass0956 anonymousClass09563 = this.LLLFF;
                if (anonymousClass09563 != null) {
                    anonymousClass09563.LIZIZ(null);
                }
                this.LLLFF = null;
                LLLIILIL = true;
            } else {
                if (this.LLLFF != null) {
                    return;
                }
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                Aweme aweme = ((VideoItemParams) obj).getAweme();
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                LifecycleOwner lifecycleOwnerLIZ = C1590970rVH.LIZ(this);
                if (lifecycleOwnerLIZ != null || (lifecycleOwnerLIZ = C724240Sb0.LIZ(this)) != null) {
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ);
                    C1DFH c1dfh = C0PEM.LIZ;
                    this.LLLFF = C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C2260908tT(this, aid, lifecycleOwnerLIZ, null), 2);
                    return;
                }
                return;
            }
        }
        if (!C07EE.LIZ()) {
            return;
        }
        Ep(true);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Context context;
        LifecycleOwner lifecycleOwnerLJFF;
        C708910RrN c708910RrN;
        super.onViewCreated(view);
        LifecycleCoroutineScope lifecycleScope = null;
        if (((Boolean) C07G7.LIZ.getValue()).booleanValue()) {
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof C708910RrN) && (c708910RrN = (C708910RrN) viewLJJIJL) != null) {
                c708910RrN.setGroupClickable(false);
            }
            C786410Ut5.I7(null, LJJIJL());
            LJJIJL().setClickable(false);
        }
        this.LLLIIIL.LIZ(view, new AwS574S0100000_30(this, 53), new AwS609S0100000_30(this, 66));
        if ((C07G1.LIZ() & 512) == 0) {
            C1E9G.LIZ.getClass();
            if (((Boolean) C1E9G.LIZLLL.getValue()).booleanValue()) {
                C1558520qew.LJI(this, VideoCellScope.class, this, ITakoFeedIconAbility.class, null, null);
            }
        }
        if ((C07G1.LIZ() & 1) != 0) {
            C298790BnR.LIZ();
        }
        if ((C07G1.LIZ() & 2) != 0) {
            AbstractC1387200mCc abstractC1387200mCcLIZ = C520040KaQ.LIZ(LJJIJL());
            if (abstractC1387200mCcLIZ != null && (lifecycleOwnerLJFF = abstractC1387200mCcLIZ.LJFF()) != null) {
                lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLJFF);
            }
            this.LLL = lifecycleScope;
        }
        if ((C07G1.LIZ() & 16) != 0 && C04WD.LIZ() && (context = getContext()) != null) {
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZLLL = C418440Gaw.LIZIZ(8);
            c19659111vp.LJ = Integer.valueOf(R.attr.p0);
            c19659111vp.LIZ = C418440Gaw.LIZIZ(18);
            this.LLLIIIIL = c19659111vp.LIZ(context);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        InterfaceC497601wk interfaceC497601wk;
        VideoItemParams videoItemParams2 = videoItemParams;
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJZIJLIL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zB1(this);
        }
        this.LLLIIIL.LIZJ(new AwS491S0200000_30(this, videoItemParams2, 3));
        if ((C298790BnR.LIZ() & 32) == 0 && (interfaceC497601wk = this.LLL) != null) {
            C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C2136408Yo(this, null), 2);
        }
    }

    public final void Gp(SmartImageView smartImageView, ImageView imageView, View view) {
        Context context;
        C19751612Pq c19751612PqLIZ;
        Drawable drawableLIZIZ;
        if (!this.LLLII) {
            this.LLLII = true;
            boolean z = false;
            if (((Boolean) C287280BNu.LIZ.getValue()).booleanValue()) {
                if ((C07G1.LIZ() & 4) != 0 && (drawableLIZIZ = C14TF.LIZIZ.LJIILL().LIZIZ()) != null) {
                    if (imageView != null) {
                        imageView.setBackground(drawableLIZIZ);
                        Jp(imageView);
                    }
                } else {
                    Integer numLIZLLL = C14TF.LIZIZ.LJJLIIIJ().LIZLLL();
                    if (numLIZLLL != null) {
                        int iIntValue = numLIZLLL.intValue();
                        if (imageView != null) {
                            imageView.setBackgroundResource(iIntValue);
                            Jp(imageView);
                        }
                    } else if (imageView != null) {
                        Jp(imageView);
                    }
                }
            } else if (smartImageView != null) {
                smartImageView.setActualImageResource(C14TF.LIZIZ.LJJLIIIJ().LJFF());
            }
            if (C04WD.LIZ() && (context = getContext()) != null) {
                if ((C07G1.LIZ() & 16) != 0) {
                    z = true;
                }
                if (z) {
                    c19751612PqLIZ = this.LLLIIIIL;
                    if (c19751612PqLIZ == null) {
                        C19659111vp c19659111vp = new C19659111vp();
                        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(8);
                        c19659111vp.LJ = Integer.valueOf(R.attr.p0);
                        c19659111vp.LIZ = C418440Gaw.LIZIZ(18);
                        c19751612PqLIZ = c19659111vp.LIZ(context);
                    }
                } else {
                    C19659111vp c19659111vp2 = new C19659111vp();
                    c19659111vp2.LIZLLL = C418440Gaw.LIZIZ(8);
                    c19659111vp2.LJ = Integer.valueOf(R.attr.p0);
                    c19659111vp2.LIZ = C418440Gaw.LIZIZ(18);
                    c19751612PqLIZ = c19659111vp2.LIZ(context);
                }
                if (view != null) {
                    Jp(view);
                    view.setBackground(c19751612PqLIZ);
                }
            }
        }
        Bp(true);
    }
}
