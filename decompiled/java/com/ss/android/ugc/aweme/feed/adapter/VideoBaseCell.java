package com.ss.android.ugc.aweme.feed.adapter;

import X.C01GW;
import X.C035D;
import X.C0QSJ;
import X.C0R6M;
import X.C0R7E;
import X.C0RA4;
import X.C0RA5;
import X.C0RAC;
import X.C0RAE;
import X.C0RDF;
import X.C0RDR;
import X.C0REZ;
import X.C0RF0;
import X.C0RGF;
import X.C0RHA;
import X.C0SKK;
import X.C0SYH;
import X.C0SZ8;
import X.C1365850leB;
import X.C1365860leC;
import X.C1365870leD;
import X.C13LE;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1558420qem;
import X.C19EG;
import X.C1AF0;
import X.C1AV2;
import X.C21415018rM;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C452501pT;
import X.C583360MuM;
import X.C583620Mum;
import X.C584270Mvp;
import X.C673150Qan;
import X.C687700QyG;
import X.C690190R5l;
import X.C723830SaL;
import X.C724240Sb0;
import X.EnumC2281141EQm;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC713360RyY;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.container.interaction.FeedInteractionAreaContainer;
import com.ss.android.ugc.feed.platform.container.scope.CommonVideoCellScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS198S0000000_11;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class VideoBaseCell extends AssemReusedContainer<VideoBaseCell, VideoItemParams> implements C0RDR, C0RGF<VideoBaseCell, VideoItemParams>, C0R7E, C0RAE<VideoBaseCell, VideoItemParams>, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final C0RF0 LLJILJILJ;
    public VideoItemParams LLJILLL;
    public Aweme LLJJ;
    public int LLJJI;
    public Fragment LLJJIII;
    public FeedVideoAssem LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public ReusedUIAssem<?> LLJJIJIL;
    public volatile HomePageViewPagerAbility LLJJJ;
    public InterfaceC665370Q7z LLJJJIL;
    public C0QSJ LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoBaseCell.class, "homepageViewPagerAbility", "getHomepageViewPagerAbility()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0SZ8
    public /* synthetic */ void A(boolean z, C1AV2 c1av2) {
    }

    public /* synthetic */ void B0(boolean z) {
    }

    @Override // X.InterfaceC583650Mup
    public /* synthetic */ void C80() {
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void Dh1(Aweme aweme) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ BaseFeedPlayerView E() {
        return null;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void F0(String str) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ ImageView F2() {
        return null;
    }

    @Override // X.InterfaceC583650Mup
    public /* synthetic */ View Hk() {
        return null;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void K8(View.OnTouchListener onTouchListener) {
    }

    public /* synthetic */ void L0(int i, Aweme aweme) {
    }

    public void LJI(Aweme aweme) {
    }

    @Override // X.InterfaceC739930T0t
    public /* synthetic */ void LJIIJJI() {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LJIJJ() {
    }

    @Override // X.C0SIV
    public void LJJ() {
    }

    @Override // X.C0SIV
    public int LJJI() {
        return 0;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LJJIIJ() {
    }

    public void LJJIJIIJIL(int i) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ C0SZ8 LJJIJIL(String str) {
        return null;
    }

    public /* synthetic */ void LJJIL(C0R6M c0r6m) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LJJIZ(C0RHA c0rha) {
    }

    @Override // X.C0SIV
    public float LJJJJJL(C21415018rM c21415018rM) {
        return 0.0f;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LJJJLZIJ(C1365850leB c1365850leB) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean LJJLIIIJ() {
        return true;
    }

    @Override // X.C0SIV
    public int LJJLIIIJILLIZJL(C21415018rM c21415018rM) {
        return 0;
    }

    @Override // X.C0SIV
    public void LJJLIIIJLJLI(boolean z) {
    }

    @Override // X.C0SIV
    public float LJJZZI() {
        return 0.0f;
    }

    @Override // X.InterfaceC739930T0t
    public /* synthetic */ void LJL() {
    }

    @Override // X.C0SIV
    public void LJLI() {
    }

    @Override // X.C0SIV
    public void LJLJI(boolean z) {
    }

    @Override // X.InterfaceC739930T0t
    public /* synthetic */ void LJLJJI(C2189821An6 c2189821An6) {
    }

    @Override // X.InterfaceC739930T0t
    public /* synthetic */ boolean LJLJJLL() {
        return false;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LJLJLLL(int i, int i2, int i3, String str, String str2) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LJLLILLLL() {
    }

    @Override // X.InterfaceC739930T0t
    public /* synthetic */ void LJLLL() {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LJZI(boolean z, boolean z2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LL() {
        return false;
    }

    @Override // X.C0SIV
    public void LLD(int i, int i2) {
    }

    @Override // X.InterfaceC1473950oSX
    public /* synthetic */ void LLF(int i, int i2) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLFF() {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLFII(boolean z) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLFZ(Object obj) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLIIII(boolean z) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLIIIJ(C0SYH c0syh) {
    }

    @Override // X.C0SIV
    public void LLIIIZ() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLIILZL() {
        return false;
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean LLIIZ() {
        return false;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLILII(boolean z) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLILLL(C1365860leC c1365860leC) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLIZLLLIL() {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLJJ(int i, boolean z) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLJJIJIIJIL(String str) {
    }

    public /* synthetic */ void LLJJIJIL() {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLJJJIL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJJJ(boolean z) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLJJJJJIL(boolean z, boolean z2) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLJLIL(Long l) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLJLILLLLZIIL(int i, String str, String str2) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLJLL() {
    }

    @Override // X.C0SZ8
    public /* synthetic */ C0SZ8 LLJLLL() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLF() {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLLFFI(int i, String str, String str2) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLLIIII() {
    }

    public int LLLIIL() {
        return 3;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLLILZLLLI() {
    }

    @Override // X.C0SZ8
    public /* synthetic */ View LLLJIL() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLLLIIIILLL() {
        return false;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLLLIIL() {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLLLIILL(int i, String str) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLLLJ(int i, String str) {
    }

    public /* synthetic */ C584270Mvp LLLLLJIL() {
        return null;
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean LLLLLLIL() {
        return false;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLLLLLJ(boolean z) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLLLLZL() {
    }

    @Override // X.C0SZ8
    public /* synthetic */ View LLLLZLLIL() {
        return null;
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean LLLZ() {
        return true;
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean LLLZIL() {
        return false;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void LLLZLZ(Map map) {
    }

    @Override // X.C0SZ8
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
    public /* synthetic */ void LLZLLLL(int i) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ View LLZZ(String str) {
        return null;
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean LLZZZIL() {
        return false;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void M(C0REZ c0rez) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void M0(C690190R5l c690190R5l) {
    }

    @Override // X.InterfaceC583650Mup
    public /* synthetic */ boolean Mg() {
        return false;
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean Nv() {
        return false;
    }

    @Override // X.C0SZ8
    public /* synthetic */ View Qg(String str, boolean z) {
        return null;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void Rl(C035D c035d) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void Y0(int i, int i2, long j, long j2, long j3, long j4, long j5) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void Z(int i, boolean z) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ C583360MuM Z0() {
        return null;
    }

    @Override // X.C0QSJ
    public void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void ce1(String str, String str2) {
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class, CommonVideoCellScope.class});
    }

    @Override // X.C0SZ8
    public /* synthetic */ void ev() {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void g1(int i) {
    }

    @Override // X.C0QSJ
    public Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        arrayList.add(CommonVideoCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC739930T0t
    public /* synthetic */ View getRootView() {
        return null;
    }

    @Override // X.C0QSJ
    public List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommonVideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // X.InterfaceC583650Mup
    public /* synthetic */ boolean go1() {
        return false;
    }

    public String gq() {
        return "cell_feed";
    }

    @Override // X.C0SZ8
    public /* synthetic */ void h0(Aweme aweme) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void k1(String str, boolean z) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean l() {
        return true;
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean l1() {
        return false;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void o(boolean z) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ boolean o1() {
        return false;
    }

    @Override // X.InterfaceC583650Mup
    public /* synthetic */ void o6(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onBrightnessChanged(String str, float f) {
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onPausePlay(String str) {
        C583620Mum.LJIIZILJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onPlayCompleted(String str) {
        C583620Mum.LJIJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C583620Mum.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
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
    public /* synthetic */ void onPlayPrepare(String str) {
        C583620Mum.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C583620Mum.LJJIIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onPlayProgressChange(float f) {
        C583620Mum.LJJIIJZLJL(this, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C583620Mum.LJJIIZ(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C583620Mum.LJJIIZI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
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
    public /* synthetic */ void onPlaying(String str) {
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
    public /* synthetic */ void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    public /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C583620Mum.LJJJJ(this, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onResumePlay(String str) {
        C583620Mum.LJJJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJL(this, str, c1481290oeN);
    }

    @Override // X.C0SZ8
    public /* synthetic */ void onScrollEnd() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onSeekEnd(String str, boolean z) {
        C583620Mum.LJJJJLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onSeekStart(String str, int i, float f) {
        C583620Mum.LJJJJZ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public /* synthetic */ void onSpeedChanged(String str, float f) {
        C583620Mum.LJJJJZI(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onStopPlay(String str) {
        C583620Mum.LJJJLIIL(this, str);
    }

    @Override // X.InterfaceC1473950oSX
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
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
    public /* synthetic */ void p(int i) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ View.OnTouchListener q5() {
        return null;
    }

    @Override // X.C0SZ8
    public /* synthetic */ void q7(float f, int i, int i2, int i3) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void qi() {
    }

    @Override // X.C0QSJ
    public void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void s0() {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void u1() {
    }

    @Override // X.C0QSJ
    public void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void uq(C1365870leD c1365870leD) {
    }

    @Override // X.C0SZ8
    public /* synthetic */ void v(long j, long j2, long j3, long j4, int i, long j5, int i2) {
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return this.LLJILJILJ.LIZJ;
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.LLJILJILJ.LIZ;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final LifecycleOwner LLILZ() {
        return this.LLJILJILJ.LIZJ;
    }

    public void LLJJLIIIJLLLLLLLZ() {
        if (this.LLJJIJI != null) {
            return;
        }
        this.LLJJIJI = new FeedVideoAssem(this.LLJILJILJ.LJ, AFwS198S0000000_11.get$arr$(448), LLLIIL(), null);
    }

    public final FeedInteractionAreaContainer LLLIILIL() {
        return (FeedInteractionAreaContainer) this.LLJJIJIIJIL.getValue();
    }

    @Override // X.C0R7E
    public final Fragment Q71() {
        return this.LLJILJILJ.LIZJ;
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LLJILJILJ.LIZJ.getActivity();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return new ViewModelStore();
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        InterfaceC713360RyY interfaceC713360RyY = this.LLJILJILJ.LJIIL;
        if (interfaceC713360RyY != null) {
            return C1558420qem.LIZIZ(interfaceC713360RyY);
        }
        return null;
    }

    @Override // X.C0SZ8, X.C0SZA
    public Aweme LJIIIIZZ() {
        return getAweme();
    }

    public Aweme hm() {
        return getAweme();
    }

    @Override // X.C0SZ8
    public C0SKK LJLLLL() {
        return C0SKK.INITIALIZED;
    }

    @Override // X.InterfaceC739930T0t
    public Boolean LLIL() {
        return Boolean.FALSE;
    }

    public void unBind() {
        wY0();
    }

    public VideoBaseCell(C0RF0 c0rf0) throws Exception {
        Lifecycle.State currentState;
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        super(c0rf0.LJIILL);
        this.LLJILJILJ = c0rf0;
        View view = c0rf0.LIZ;
        try {
            ReusedUIAssem<?> reusedUIAssemNG1 = NG1();
            Sl0(view, this);
            this.LLJJIJIL = reusedUIAssemNG1;
            this.LLJJIJIIJIL = C452501pT.LIZIZ(new C0RAC(this));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Assem.Supervisor==null >>>eventType:");
                sbLIZ.append(this.LLJILJILJ.LJIIIZ);
                sbLIZ.append(", activity state:");
                C19EG activity = getActivity();
                Lifecycle.State currentState2 = null;
                if (activity != null && (lifecycle2 = activity.getLifecycle()) != null) {
                    currentState = lifecycle2.getCurrentState();
                } else {
                    currentState = null;
                }
                sbLIZ.append(currentState);
                sbLIZ.append(",paren state:");
                Fragment fragment = this.LLJILJILJ.LIZJ;
                if (fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
                    currentState2 = lifecycle.getCurrentState();
                }
                sbLIZ.append(currentState2);
                sbLIZ.append(",activity:");
                sbLIZ.append(getActivity());
                sbLIZ.append(", fragment:");
                sbLIZ.append(this.LLJILJILJ.LIZJ);
                sbLIZ.append(' ');
                System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
                throw e;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw e;
            }
        }
    }

    @Override // X.C0SZ8
    public void LLJLLIL(boolean z) {
        LLLI(2);
    }

    @Override // X.C0SZ8
    public void LLZZJLIL(View view) throws Exception {
        Lifecycle lifecycle;
        LLJJLIIIJLLLLLLLZ();
        ReusedUIAssem<?> reusedUIAssem = this.LLJJIJIL;
        if (reusedUIAssem != null) {
            Lifecycle.State currentState = null;
            C723830SaL.LIZ(reusedUIAssem, null, new C0RA4(reusedUIAssem, this, view));
            AssemSupervisor assemSupervisorLJFF = C724240Sb0.LJFF(this);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C0RA5(this, assemSupervisorLJFF));
            if (assemSupervisorLJFF != null) {
                Fragment fragment = this.LLJILJILJ.LIZJ;
                if (fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
                    currentState = lifecycle.getCurrentState();
                }
                if (currentState != Lifecycle.State.DESTROYED) {
                    try {
                        LLLIILIL().J4();
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        System.out.println(c01gwLIZIZ.getValue());
                        throw e;
                    }
                }
            }
            C1AF0.LIZJ((String) c01gwLIZIZ.getValue());
        }
    }

    @Override // X.C0SZ8
    public void LJJJJ(int i, Aweme aweme) {
        LJI(aweme);
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.C0SMN
    /* JADX INFO: renamed from: LLLIL, reason: merged with bridge method [inline-methods] */
    public final void SN1(int i, VideoItemParams videoItemParams) {
        C0RDF c0rdfC41;
        Set<AssemViewModel<?>> setLIZ;
        FeedBaseHolderViewModel feedBaseHolderViewModel;
        ReusedUIAssem<?> reusedUIAssem = this.LLJJIJIL;
        if (reusedUIAssem instanceof RootCellComponent) {
            ((RootCellComponent) reusedUIAssem).ep(i, this.LLJJ);
        }
        LLLIILIL().ep(i, this.LLJJ);
        LLJJJJLIIL(i, videoItemParams, null);
        if (videoItemParams != null && (c0rdfC41 = C41()) != null && (setLIZ = c0rdfC41.LIZ()) != null) {
            Iterator<T> it2 = setLIZ.iterator();
            while (it2.hasNext()) {
                AssemViewModel assemViewModel = (AssemViewModel) it2.next();
                if ((assemViewModel instanceof FeedBaseHolderViewModel) && (feedBaseHolderViewModel = (FeedBaseHolderViewModel) assemViewModel) != null) {
                    feedBaseHolderViewModel.vQ2(videoItemParams);
                }
            }
        }
    }
}
