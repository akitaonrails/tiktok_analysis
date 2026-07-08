package com.ss.android.ugc.aweme.feed.adapter;

import X.C01GW;
import X.C035D;
import X.C0J4Y;
import X.C0R6M;
import X.C0RDR;
import X.C0RDS;
import X.C0RGM;
import X.C0RHA;
import X.C0SKK;
import X.C0SYH;
import X.C0SZ8;
import X.C1365850leB;
import X.C1365860leC;
import X.C1365870leD;
import X.C1440005kM;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1519760peQ;
import X.C1702430uP3;
import X.C1AV2;
import X.C2187451AjH;
import X.C452501pT;
import X.C583360MuM;
import X.C583620Mum;
import X.C583890MvD;
import X.C584270Mvp;
import X.C690190R5l;
import X.C697110RWb;
import X.C714530S1b;
import X.C786410Ut5;
import X.EnumC2281141EQm;
import X.InterfaceC583650Mup;
import X.InterfaceC689860R4e;
import X.InterfaceC739930T0t;
import android.content.Context;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseFeedLiveViewHolder extends LiveRecyclableWidget implements C0SZ8, InterfaceC583650Mup, C0RGM {
    public static final C01GW<HashMap<View, Object>> LLILZLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(76));
    public final View LL;
    public final Fragment LLILLJJLI;
    public final Context LLILLL;
    public Aweme LLILZ;
    public LiveRoomStruct LLILZIL;

    @Override // X.C0SZ8
    public final /* synthetic */ void A(boolean z, C1AV2 c1av2) {
    }

    @Override // X.InterfaceC583650Mup
    public final void Ai1(boolean z) {
    }

    @Override // X.C0SZ8
    public final void Ar(Aweme aweme) {
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void C80() {
    }

    @Override // X.InterfaceC583650Mup
    public final boolean Da() {
        return true;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ BaseFeedPlayerView E() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void F0(String str) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ ImageView F2() {
        return null;
    }

    @Override // X.C0SZ8
    public final void G() {
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ View Hk() {
        return null;
    }

    @Override // X.C0SZ8
    public final void K1(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void K8(View.OnTouchListener onTouchListener) {
    }

    @Override // X.C0SZ8
    public final InterfaceC689860R4e K9() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void L0(int i, Aweme aweme) {
    }

    @Override // X.C0SZ8
    public void LJIIZILJ(boolean z) {
    }

    @Override // X.C0SZ8, X.C0SZA
    public final InterfaceC739930T0t LJIJJLI() {
        return null;
    }

    @Override // X.C0SZ8
    public void LJJIFFI(boolean z) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LJJIIJ() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ C0SZ8 LJJIJIL(String str) {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJJIL(C0R6M c0r6m) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJJIZ(C0RHA c0rha) {
    }

    @Override // X.C0SZ8
    public final void LJJJJJ(long j) {
    }

    @Override // X.C0SZ8
    public final void LJJJLIIL(int i, long j) {
    }

    @Override // X.C0SZ8
    public void LJJJLZIJ(C1365850leB c1365850leB) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LJJLIIIJ() {
        return true;
    }

    @Override // X.C0SZ8
    public void LJLIIIL(int i) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJLJLLL(int i, int i2, int i3, String str, String str2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJLLILLLL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJZI(boolean z, boolean z2) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean LL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLFF() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLFII(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLFZ(Object obj) {
    }

    @Override // X.C0RGM
    public void LLI() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLIIII(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLIIIJ(C0SYH c0syh) {
    }

    @Override // X.C0SZ8
    public final void LLIIL(String str) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean LLIILZL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLIIZ() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLILII(boolean z) {
    }

    @Override // X.C0SZ8
    public void LLILLL(C1365860leC c1365860leC) {
    }

    @Override // X.C0SZ8
    public final void LLJI(C697110RWb c697110RWb) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJ(int i, boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJIJIIJIL(String str) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLJJJJ(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJJJJIL(boolean z, boolean z2) {
    }

    @Override // X.C0SZ8
    public final void LLJL(boolean z, boolean z2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJLIL(Long l) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJLILLLLZIIL(int i, String str, String str2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJLL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ C0SZ8 LLJLLL() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLF() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLFFI(int i, String str, String str2) {
    }

    @Override // X.C0SZ8
    public void LLLI(int i) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLIIII() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLILZLLLI() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View LLLJIL() {
        return null;
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean LLLLIIIILLL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLLIIL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLLIILL(int i, String str) {
    }

    @Override // X.InterfaceC583650Mup
    public void LLLLIL(Aweme aweme) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLLJ(int i, String str) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ C584270Mvp LLLLLJIL() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLLLLLIL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLLLLJ(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLLLZL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View LLLLZLLIL() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLLZ() {
        return true;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLLZIL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLZLZ(Map map) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLLZZIL() {
        return true;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLZ() {
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean LLZLI() {
        return false;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLZLLLL(int i) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View LLZZ(String str) {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLZZJLIL(View view) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLZZZIL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void M0(C690190R5l c690190R5l) {
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ boolean Mg() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View Qg(String str, boolean z) {
        return null;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void Rl(C035D c035d) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void Y0(int i, int i2, long j, long j2, long j3, long j4, long j5) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void Z(int i, boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ C583360MuM Z0() {
        return null;
    }

    @Override // X.InterfaceC583650Mup
    public final void Z1() {
    }

    @Override // X.C0SZ8
    public final void e1() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void ev() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void g1(int i) {
    }

    @Override // X.C0SZ8
    public int getAwemeType() {
        return 101;
    }

    @Override // X.InterfaceC583650Mup
    public final int getContentType() {
        return 2;
    }

    @Override // X.InterfaceC583650Mup
    public final Surface getSurface() {
        return null;
    }

    @Override // X.InterfaceC583650Mup
    public final View getVideoView() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ boolean go1() {
        return false;
    }

    @Override // X.C0SZ8
    public void h(boolean z) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void h0(Aweme aweme) {
    }

    @Override // X.C0SZ8
    public final void i0() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void k1(String str, boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean l() {
        return true;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean l1() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void o(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean o1() {
        return false;
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

    @Override // X.C0SZ8
    public void onDestroyView() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C583620Mum.LJIILIIL(this, i, j, j2, map);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJIILJJIL(this, str, c1480420ocy);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLoopPlay(String str, int i) {
        C583620Mum.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        C583620Mum.LJIILLIIL(this, str, c1480290ocl);
    }

    @Override // X.C0SZ8
    public final void onPageSelected(int i) {
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
    public final void onRenderReady(C1480430ocz c1480430ocz) {
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

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onStopPlay(String str) {
        C583620Mum.LJJJLIIL(this, str);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
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

    @Override // X.C0SZ8
    public final /* synthetic */ void p(int i) {
    }

    @Override // X.C0SZ8
    public final void q(String str, String str2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View.OnTouchListener q5() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void qi() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void s0() {
    }

    @Override // X.InterfaceC583650Mup
    public final void sc() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void u1() {
    }

    @Override // X.C0SZ8
    public void unBind() {
    }

    @Override // X.C0SZ8
    public void uq(C1365870leD c1365870leD) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void v(long j, long j2, long j3, long j4, int i, long j5, int i2) {
    }

    public void x1(Aweme aweme) {
    }

    @Override // X.C0SZ8
    public final InterfaceC583650Mup x3() {
        return this;
    }

    @Override // X.InterfaceC583650Mup
    public final void ys(int i) {
    }

    @Override // X.InterfaceC583650Mup
    public final ViewGroup zt1() {
        return null;
    }

    @Override // X.C0SZ8
    public final void LJIIJ() {
        C0RDS c0rds = C0RDR.LJJIFFI;
        Context context = this.LLILLL;
        c0rds.getClass();
        C1519760peQ<SurfaceView> c1519760peQ = C0RDS.LIZIZ.get(context);
        if (c1519760peQ != null) {
            Iterator<SurfaceView> it2 = c1519760peQ.iterator();
            while (it2.hasNext()) {
                C786410Ut5.LLIIII(it2.next(), 8);
            }
        }
        C1519760peQ<C0RDR> c1519760peQ2 = C0RDS.LIZJ.get(context);
        if (c1519760peQ2 != null) {
            for (C0RDR c0rdr : c1519760peQ2) {
                if (c0rdr.getAweme() != null) {
                    c0rdr.Qi1(c0rdr.getAweme().getVideo());
                }
            }
        }
    }

    @Override // X.C0SZ8
    public final void LLIZLLLIL() {
        C2187451AjH.LJJI(1000L);
        C2187451AjH.LJI(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        if (C1702430uP3.LJI) {
            C2187451AjH.LJFF(LSPassThroughRecordSizeConfig.DEFAULT);
        }
        C2187451AjH.LJJIFFI(2000L);
        C583890MvD.LIZ.LJFF();
    }

    @Override // X.C0SZ8
    public final void LLJJJIL() {
        int i = C2187451AjH.LIZ;
        DoFrameController.LIZIZ = 0;
        C583890MvD.LIZ.LJ();
    }

    @Override // X.C0SZ8, X.C0SZA
    public final Aweme LJIIIIZZ() {
        return getAweme();
    }

    @Override // X.C0SZ8
    public final Aweme hm() {
        return getAweme();
    }

    @Override // X.C0SZ8
    public final C0SKK LJLLLL() {
        return C0SKK.INITIALIZED;
    }

    @Override // X.C0SZ8
    public Aweme getAweme() {
        return this.LLILZ;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public final Context getContext() {
        return this.LLILLL;
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
    }

    @Override // X.C0SZ8
    public final void LJI(Aweme aweme) {
        this.LLILZ = aweme;
        if (aweme != null) {
            this.LLILZIL = C0J4Y.LJI(aweme);
        }
    }

    @Override // X.C0SZ8
    public void LJJIJIIJIL(int i) {
        C1440005kM.LIZ(new C714530S1b(this.LLILZ));
        C1440005kM.LIZ(new SuperEntranceEvent(0, false));
    }

    @Override // X.C0SZ8
    public final void LLJLLIL(boolean z) {
        LLLI(2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        Video video;
        Aweme aweme = this.LLILZ;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            video.getDuration();
        }
    }

    public BaseFeedLiveViewHolder(View view, Fragment fragment) {
        this.LL = view;
        this.LLILLJJLI = fragment;
        this.LLILLL = view.getContext();
    }

    @Override // X.C0SZ8
    public void LJJJJ(int i, Aweme aweme) {
        LJI(aweme);
    }
}
