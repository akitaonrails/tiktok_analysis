package com.ss.android.ugc.aweme.feed.collection.sub;

import X.AnonymousClass0723;
import X.C01GW;
import X.C035D;
import X.C03H5;
import X.C0QSJ;
import X.C0R56;
import X.C0R6M;
import X.C0R93;
import X.C0REZ;
import X.C0RF0;
import X.C0RF2;
import X.C0RGF;
import X.C0RGJ;
import X.C0RHA;
import X.C0SKK;
import X.C0SMO;
import X.C0SYH;
import X.C0SZ8;
import X.C1035180d2q;
import X.C1365850leB;
import X.C1365860leC;
import X.C1365870leD;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1558420qem;
import X.C19EG;
import X.C19K7;
import X.C19K8;
import X.C1AV2;
import X.C2189821An6;
import X.C452501pT;
import X.C583360MuM;
import X.C583620Mum;
import X.C584270Mvp;
import X.C673150Qan;
import X.C687700QyG;
import X.C690190R5l;
import X.C690430R6j;
import X.C690870R8b;
import X.C697110RWb;
import X.C723850SaN;
import X.C737030Svd;
import X.EnumC2281141EQm;
import X.InterfaceC1146704e9;
import X.InterfaceC1482650ogZ;
import X.InterfaceC1587906Jp;
import X.InterfaceC583650Mup;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC689860R4e;
import X.InterfaceC713360RyY;
import X.InterfaceC739930T0t;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.collection.common.component.SimpleRootCellComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import com.ss.android.ugc.feed.platform.container.scope.CommonVideoCellScope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseSubViewHolder<R extends C0SMO<R, ITEM>, ITEM extends InterfaceC1587906Jp> extends AssemReusedContainer<R, ITEM> implements C0RGJ, C0RGF<R, ITEM>, ViewModelStoreOwner, C0QSJ, InterfaceC1146704e9 {
    public final C0RF0 LLJILJILJ;
    public final C19EG LLJILLL;
    public final View LLJJ;
    public final Fragment LLJJI;
    public final InterfaceC665370Q7z LLJJIII;
    public final Fragment LLJJIJI;
    public Aweme LLJJIJIIJIL;
    public int LLJJIJIL;
    public BaseCellContentComponent LLJJJ;
    public boolean LLJJJIL;
    public Boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    @Override // X.C0SZ8
    public final /* synthetic */ void A(boolean z, C1AV2 c1av2) {
    }

    public void Ar(Aweme aweme) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void B0(boolean z) {
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void C80() {
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void Dh1(Aweme aweme) {
    }

    public /* synthetic */ BaseFeedPlayerView E() {
        return null;
    }

    public /* synthetic */ void F0(String str) {
    }

    public /* synthetic */ ImageView F2() {
        return null;
    }

    public void Fm() {
    }

    public void G() {
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ View Hk() {
        return null;
    }

    public void K1(boolean z) {
    }

    public /* synthetic */ void K8(View.OnTouchListener onTouchListener) {
    }

    public InterfaceC689860R4e K9() {
        return null;
    }

    public void LIZ() {
    }

    @Override // X.C0SZ8
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC739930T0t
    public final /* synthetic */ void LJIIJJI() {
    }

    @Override // X.InterfaceC739930T0t
    public final void LJIILIIL() {
    }

    @Override // X.C0SZ8
    public final void LJIIZILJ(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJIJJ() {
    }

    @Override // X.C0SZ8, X.C0SZA
    public final InterfaceC739930T0t LJIJJLI() {
        return this;
    }

    @Override // X.C0SZ8
    public final void LJJIFFI(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJJIIJ() {
    }

    public /* synthetic */ C0SZ8 LJJIJIL(String str) {
        return null;
    }

    public /* synthetic */ void LJJIL(C0R6M c0r6m) {
    }

    public /* synthetic */ void LJJIZ(C0RHA c0rha) {
    }

    @Override // X.C0SZ8
    public final void LJJJJJ(long j) {
    }

    @Override // X.C0SZ8
    public final void LJJJLIIL(int i, long j) {
    }

    @Override // X.C0SZ8
    public final void LJJJLZIJ(C1365850leB c1365850leB) {
    }

    @Override // X.InterfaceC739930T0t
    public final void LJJLJLI() {
    }

    @Override // X.InterfaceC739930T0t
    public final void LJJLL() {
    }

    @Override // X.InterfaceC739930T0t
    public final /* synthetic */ void LJL() {
    }

    @Override // X.InterfaceC739930T0t
    public final /* synthetic */ void LJLJJI(C2189821An6 c2189821An6) {
    }

    @Override // X.InterfaceC739930T0t
    public final /* synthetic */ boolean LJLJJLL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJLJLLL(int i, int i2, int i3, String str, String str2) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LJLLILLLL() {
    }

    @Override // X.InterfaceC739930T0t
    public final /* synthetic */ void LJLLL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJZI(boolean z, boolean z2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LL() {
        return false;
    }

    public void LLF(int i, int i2) {
    }

    public /* synthetic */ void LLFF() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLFII(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLFZ(Object obj) {
    }

    public /* synthetic */ void LLIIIJ(C0SYH c0syh) {
    }

    @Override // X.C0SZ8
    public final void LLIIL(String str) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLIILZL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLIIZ() {
        return false;
    }

    @Override // X.InterfaceC739930T0t
    public final void LLILIL(Aweme aweme) {
    }

    @Override // X.C0SZ8
    public final void LLILLL(C1365860leC c1365860leC) {
    }

    public /* synthetic */ void LLIZLLLIL() {
    }

    @Override // X.C0SZ8
    public final void LLJI(C697110RWb c697110RWb) {
    }

    public /* synthetic */ void LLJJ(int i, boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJIJIIJIL(String str) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJIJIL() {
    }

    public /* synthetic */ void LLJJJIL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJJJ(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJJJJIL(boolean z, boolean z2) {
    }

    @Override // X.C0SZ8
    public final void LLJL(boolean z, boolean z2) {
    }

    public /* synthetic */ void LLJLIL(Long l) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJLILLLLZIIL(int i, String str, String str2) {
    }

    public /* synthetic */ void LLJLL() {
    }

    public /* synthetic */ C0SZ8 LLJLLL() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLF() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLFFI(int i, String str, String str2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLIIII() {
    }

    public String LLLIIL() {
        return "";
    }

    public abstract VideoItemParams LLLIILIL(Aweme aweme, boolean z);

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLILZLLLI() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View LLLJIL() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLLLIIIILLL() {
        return false;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLLLIIL() {
    }

    public /* synthetic */ void LLLLIILL(int i, String str) {
    }

    public abstract List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z);

    public void LLLLIL(Aweme aweme) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLLJ(int i, String str) {
    }

    public /* synthetic */ C584270Mvp LLLLLJIL() {
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
    public final /* synthetic */ View LLLLZLLIL() {
        return null;
    }

    public /* synthetic */ boolean LLLZ() {
        return true;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLLZIL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLZLZ(Map map) {
    }

    public /* synthetic */ boolean LLLZZIL() {
        return true;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLZ() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLZLI() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLZLLLL(int i) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View LLZZ(String str) {
        return null;
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean LLZZZIL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void M(C0REZ c0rez) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void M0(C690190R5l c690190R5l) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean Nv() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View Qg(String str, boolean z) {
        return null;
    }

    @Override // X.C0SZ8
    public final void Rl(C035D c035d) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void Y0(int i, int i2, long j, long j2, long j3, long j4, long j5) {
    }

    public /* synthetic */ void Z(int i, boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ C583360MuM Z0() {
        return null;
    }

    public void Z1() {
    }

    public void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void ce1(String str, String str2) {
    }

    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CommonVideoCellScope.class});
    }

    @Override // X.C0SZ8
    public void e1() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void ev() {
    }

    public /* synthetic */ void g1(int i) {
    }

    public Object getAbility(Class cls) {
        return null;
    }

    public int getContentType() {
        return 1;
    }

    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommonVideoCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC739930T0t
    public final /* synthetic */ View getRootView() {
        return null;
    }

    public List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommonVideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // X.C0SZ8
    public final void i0() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void k1(String str, boolean z) {
    }

    public /* synthetic */ boolean l() {
        return true;
    }

    public /* synthetic */ boolean l1() {
        return false;
    }

    public void no() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void o(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void o6(boolean z) {
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

    public /* synthetic */ void onBuffering(String str, boolean z) {
        C583620Mum.LJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJFF(this, str, z, c1480430ocz);
    }

    public /* synthetic */ void onBuffering(boolean z) {
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

    @Override // X.C0SZ8
    public final void onPageSelected(int i) {
    }

    public void onPause() {
    }

    public /* synthetic */ void onPausePlay(String str) {
        C583620Mum.LJIIZILJ(this, str);
    }

    public /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    public /* synthetic */ void onPlayCompleted(String str) {
        C583620Mum.LJIJI(this, str);
    }

    public /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    public /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C583620Mum.LJIJJLI(this, str);
    }

    public /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
    }

    public /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
        C583620Mum.LJJIFFI(this, c1481290oeN);
    }

    public /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
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

    public /* synthetic */ void onPlayProgressChange(float f) {
        C583620Mum.LJJIIJZLJL(this, f);
    }

    public /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C583620Mum.LJJIIZ(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C583620Mum.LJJIIZI(this, str);
    }

    public /* synthetic */ void onPlayStop(String str) {
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

    public /* synthetic */ void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
    }

    public /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    public /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C583620Mum.LJJJJ(this, c1480420ocy);
    }

    public /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    public /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
    }

    @Override // X.C0SZ8
    public final void onResume() {
    }

    public /* synthetic */ void onResumePlay(String str) {
        C583620Mum.LJJJJJ(this, str);
    }

    public /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
    }

    public /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJL(this, str, c1481290oeN);
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void onScrollEnd() {
    }

    public /* synthetic */ void onSeekEnd(String str, boolean z) {
        C583620Mum.LJJJJLL(this, str, z);
    }

    public /* synthetic */ void onSeekStart(String str, int i, float f) {
        C583620Mum.LJJJJZ(this, str, i, f);
    }

    public /* synthetic */ void onSpeedChanged(String str, float f) {
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

    @Override // X.C0SZ8
    public final void q(String str, String str2) {
    }

    public /* synthetic */ View.OnTouchListener q5() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void q7(float f, int i, int i2, int i3) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void qi() {
    }

    public void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void s0() {
    }

    public void sc() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void u1() {
    }

    public void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    public void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public void uq(C1365870leD c1365870leD) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void v(long j, long j2, long j3, long j4, int i, long j5, int i2) {
    }

    public InterfaceC583650Mup x3() {
        return this;
    }

    public void ys(int i) {
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public ReusedUIAssem<?> LLILLJJLI() {
        SimpleRootCellComponent simpleRootCellComponent = new SimpleRootCellComponent(LLLIZZ(), new AwS590S0100000_11((BaseSubViewHolder) this, 125));
        this.LLJJJ = simpleRootCellComponent;
        return simpleRootCellComponent;
    }

    public final C690430R6j LLLIZZ() {
        return (C690430R6j) this.LLJJJJLIIL.getValue();
    }

    @Override // X.C0RGJ
    public final View Xz0() {
        return this.LLJILJILJ.LIZ;
    }

    @Override // X.C0SZ8
    public final int getAwemeType() {
        Aweme aweme = this.LLJJIJIIJIL;
        if (aweme != null) {
            return aweme.getAwemeType();
        }
        return 0;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return new ViewModelStore();
    }

    public void onDestroyView() {
        BaseCellContentComponent baseCellContentComponent = this.LLJJJ;
        if (baseCellContentComponent != null) {
            baseCellContentComponent.onDestroyView();
        }
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        if (baseFeedPlayerViewE != null) {
            baseFeedPlayerViewE.onDestroyView();
        }
    }

    @Override // X.InterfaceC583650Mup
    public final boolean Da() {
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        return baseFeedPlayerViewE != null && baseFeedPlayerViewE.Da();
    }

    public Aweme LJIIIIZZ() {
        return getAweme();
    }

    @Override // X.C0SZ8
    public final boolean LJJLIIIJ() {
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        if (baseFeedPlayerViewE == null || !baseFeedPlayerViewE.Mg() || this.LLJJJJ == null) {
            return true;
        }
        return E().Mg() && Intrinsics.LJFF(this.LLJJJJ, Boolean.TRUE);
    }

    @Override // X.C0SZ8
    public final void LLLLLZL() {
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        if (baseFeedPlayerViewE != null) {
            baseFeedPlayerViewE.onPagePause();
        }
    }

    @Override // X.InterfaceC583650Mup
    public final boolean Mg() {
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        if (baseFeedPlayerViewE != null) {
            return baseFeedPlayerViewE.Mg();
        }
        return false;
    }

    @Override // X.InterfaceC583650Mup
    public final Surface getSurface() {
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        if (baseFeedPlayerViewE != null) {
            return baseFeedPlayerViewE.getSurface();
        }
        return null;
    }

    public View getVideoView() {
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        if (baseFeedPlayerViewE != null) {
            return baseFeedPlayerViewE.getVideoView();
        }
        return null;
    }

    @Override // X.InterfaceC583650Mup
    public final boolean go1() {
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        if (baseFeedPlayerViewE != null) {
            return baseFeedPlayerViewE.go1();
        }
        return false;
    }

    public Aweme hm() {
        return getAweme();
    }

    public void unBind() {
        wY0();
        BaseCellContentComponent baseCellContentComponent = this.LLJJJ;
        if (baseCellContentComponent != null) {
            baseCellContentComponent.LJLLLL();
        }
        Ai1(false);
    }

    @Override // X.InterfaceC583650Mup
    public final ViewGroup zt1() {
        View videoView = getVideoView();
        ViewParent parent = videoView != null ? videoView.getParent() : null;
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.LLJJ;
    }

    public C0SKK LJLLLL() {
        return C0SKK.INITIALIZED;
    }

    @Override // X.InterfaceC739930T0t
    public final Boolean LLIL() {
        return Boolean.FALSE;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final LifecycleOwner LLILZ() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LLJILLL;
    }

    public Aweme getAweme() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC583650Mup
    public final void Ai1(boolean z) {
        InterfaceC1482650ogZ surfaceHolder;
        InterfaceC1482650ogZ surfaceHolder2;
        this.LLJJJJJIL = z;
        if (z) {
            BaseFeedPlayerView baseFeedPlayerViewE = E();
            if (baseFeedPlayerViewE != null && (surfaceHolder2 = baseFeedPlayerViewE.getSurfaceHolder()) != null) {
                surfaceHolder2.LIZ();
                return;
            }
            return;
        }
        BaseFeedPlayerView baseFeedPlayerViewE2 = E();
        if (baseFeedPlayerViewE2 == null || (surfaceHolder = baseFeedPlayerViewE2.getSurfaceHolder()) == null) {
            return;
        }
        surfaceHolder.LJFF();
    }

    @Override // X.C0SZ8
    public void LJI(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        LLLL(aweme);
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        if (baseFeedPlayerViewE != null) {
            baseFeedPlayerViewE.Dn(this);
        }
        SN1(this.LLJJIJIL, LLLIILIL(aweme, false));
    }

    public void LJJIJIIJIL(int i) {
        BaseFeedPlayerView baseFeedPlayerViewE;
        InterfaceC1482650ogZ surfaceHolder;
        this.LLJJJIL = true;
        this.LLJJJJ = Boolean.TRUE;
        this.LLJJIJIL = i;
        LLIIII(true);
        BaseCellContentComponent baseCellContentComponent = this.LLJJJ;
        if (baseCellContentComponent != null) {
            baseCellContentComponent.J1(i, getAweme());
        }
        String str = this.LLJILJILJ.LJ.eventType;
        if (str == null) {
            str = "";
        }
        if (C0R93.LIZLLL(str)) {
            if (this.LLJJJJJIL && (baseFeedPlayerViewE = E()) != null && (surfaceHolder = baseFeedPlayerViewE.getSurfaceHolder()) != null) {
                surfaceHolder.resume();
            }
            this.LLJJJJJIL = false;
        }
    }

    public void LJLIIIL(int i) {
        BaseCellContentComponent baseCellContentComponent = this.LLJJJ;
        if (baseCellContentComponent != null) {
            baseCellContentComponent.LJLIIIL(C0R56.LIZ(i));
        }
    }

    public void LLIIII(boolean z) {
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        if (baseFeedPlayerViewE == null || !baseFeedPlayerViewE.Mg()) {
            return;
        }
        baseFeedPlayerViewE.wa(z);
        LLJJLIIIJLLLLLLLZ(baseFeedPlayerViewE, z);
    }

    @Override // X.C0SZ8
    public final void LLILII(boolean z) {
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        if (baseFeedPlayerViewE != null) {
            baseFeedPlayerViewE.jj(z);
        }
    }

    @Override // X.C0SZ8
    public void LLJLLIL(boolean z) {
        LLLI(2);
    }

    public void LLLI(int i) {
        BaseCellContentComponent baseCellContentComponent = this.LLJJJ;
        if (baseCellContentComponent != null) {
            baseCellContentComponent.LLLI(C0R56.LIZIZ(i));
        }
    }

    public void LLLL(Aweme aweme) {
        this.LLJJIJIIJIL = aweme;
    }

    @Override // X.C0SZ8
    public final void LLZZJLIL(View view) {
        C723850SaN.LJ(this, new AwS590S0100000_11((BaseSubViewHolder) this, 126));
        Sl0(view, this);
    }

    public void h(boolean z) {
        this.LLJJJIL = false;
        this.LLJJJJ = Boolean.FALSE;
        LLIIII(false);
        BaseCellContentComponent baseCellContentComponent = this.LLJJJ;
        if (baseCellContentComponent != null) {
            baseCellContentComponent.LJL();
        }
    }

    @Override // X.C0SZ8
    public void h0(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        LLLL(aweme);
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        if (baseFeedPlayerViewE != null) {
            baseFeedPlayerViewE.Dn(this);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C19K7 c19k7;
        if (AnonymousClass0723.LIZ() && (c19k7 = (C19K7) C19K8.LIZ.getValue()) != null && c19k7.LLILLL) {
            c19k7.LIZLLL();
        }
    }

    public void p(int i) {
        BaseCellContentComponent baseCellContentComponent = this.LLJJJ;
        if (baseCellContentComponent != null) {
            baseCellContentComponent.p(C0R56.LIZIZ(1));
        }
    }

    public BaseSubViewHolder(C0RF0 c0rf0, C0RF2<R, ITEM> c0rf2) {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super(c0rf2);
        this.LLJILJILJ = c0rf0;
        this.LLJILLL = c0rf0.LIZJ.getActivity();
        this.LLJJ = c0rf0.LIZ;
        this.LLJJI = c0rf0.LIZJ;
        InterfaceC713360RyY interfaceC713360RyY = c0rf0.LJIIL;
        if (interfaceC713360RyY != null) {
            interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyY);
        } else {
            interfaceC665370Q7zLIZIZ = null;
        }
        this.LLJJIII = interfaceC665370Q7zLIZIZ;
        this.LLJJIJI = c0rf0.LIZJ;
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS555S0100000_11((BaseSubViewHolder) this, 324));
    }

    @Override // X.C0SZ8
    public void L0(int i, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        LLLL(aweme);
        this.LLJJIJIL = i;
        SN1(i, LLLIILIL(aweme, false));
        BaseCellContentComponent baseCellContentComponent = this.LLJJJ;
        if (baseCellContentComponent != null) {
            baseCellContentComponent.H();
        }
    }

    @Override // X.C0SZ8
    public void LJJJJ(int i, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        this.LLJJIJIL = i;
        LJI(aweme);
    }

    public void LLILLIZIL(int i, int i2) {
        BaseFeedPlayerView baseFeedPlayerViewE = E();
        if (baseFeedPlayerViewE != null && baseFeedPlayerViewE.Mg()) {
            baseFeedPlayerViewE.wa(this.LLJJJIL);
            if (!this.LLJJJIL) {
                baseFeedPlayerViewE.mZ0(new AwS555S0100000_11((BaseSubViewHolder) this, 325));
            }
        }
        if (!C1035180d2q.LIZLLL) {
            this.LLJILJILJ.LIZIZ.LLIIL(new C737030Svd(0, getAweme()));
        }
        BaseFeedPlayerView baseFeedPlayerViewE2 = E();
        if (baseFeedPlayerViewE2 != null) {
            baseFeedPlayerViewE2.Fe0();
        }
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    /* JADX INFO: renamed from: LLJJIJI */
    public void SN1(int i, ITEM item) {
        BaseCellContentComponent baseCellContentComponent = this.LLJJJ;
        if (baseCellContentComponent != null) {
            baseCellContentComponent.T6(i, getAweme());
        }
        LLJJJJLIIL(i, item, null);
    }

    public void LLJJLIIIJLLLLLLLZ(BaseFeedPlayerView baseFeedPlayerView, boolean z) {
        if (!z) {
            baseFeedPlayerView.L41();
        }
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.C0SMN
    public /* bridge */ /* synthetic */ void SN1(int i, Object obj) {
        SN1(i, (InterfaceC1587906Jp) obj);
    }
}
