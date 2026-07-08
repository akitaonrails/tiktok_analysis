package com.ss.android.ugc.aweme.feed.adapter;

import X.C00I7;
import X.C01GW;
import X.C035D;
import X.C07H7;
import X.C0BOB;
import X.C0CF8;
import X.C0HTT;
import X.C0QSJ;
import X.C0R5A;
import X.C0R5I;
import X.C0R5N;
import X.C0R6M;
import X.C0R7E;
import X.C0R8B;
import X.C0R8C;
import X.C0R93;
import X.C0R9O;
import X.C0RA6;
import X.C0RA7;
import X.C0RAB;
import X.C0RAE;
import X.C0RAJ;
import X.C0RAK;
import X.C0RAW;
import X.C0RD4;
import X.C0RDF;
import X.C0RDR;
import X.C0REZ;
import X.C0RF0;
import X.C0RGF;
import X.C0RGM;
import X.C0RH0;
import X.C0RHA;
import X.C0SIV;
import X.C0SKK;
import X.C0SPE;
import X.C0SUL;
import X.C0SYH;
import X.C0SZ8;
import X.C0T23;
import X.C1002470cC5;
import X.C1012040cRW;
import X.C1013640cU6;
import X.C1017070cZd;
import X.C1019620cdk;
import X.C1022820ciu;
import X.C1029590ctp;
import X.C1030680cva;
import X.C1045340dJE;
import X.C1233040iBy;
import X.C1322110kVd;
import X.C1365850leB;
import X.C1365860leC;
import X.C1365870leD;
import X.C1387620mDI;
import X.C1388190mED;
import X.C1393420mMe;
import X.C1440005kM;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C14KQ;
import X.C14LC;
import X.C1514430pVp;
import X.C1558420qem;
import X.C1558520qew;
import X.C1576740r8K;
import X.C1594680rbG;
import X.C1604450rr1;
import X.C161N;
import X.C19EG;
import X.C1AV2;
import X.C20684815ws;
import X.C21415018rM;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2241008qG;
import X.C2487409ou;
import X.C309690CBz;
import X.C583360MuM;
import X.C583620Mum;
import X.C584270Mvp;
import X.C588810N7n;
import X.C673150Qan;
import X.C687700QyG;
import X.C690160R5i;
import X.C690190R5l;
import X.C690280R5u;
import X.C690300R5w;
import X.C690330R5z;
import X.C690430R6j;
import X.C690440R6k;
import X.C690450R6l;
import X.C690870R8b;
import X.C690970R8l;
import X.C691710RBh;
import X.C691720RBi;
import X.C692050RCp;
import X.C692070RCr;
import X.C692090RCt;
import X.C697110RWb;
import X.C708600Rqs;
import X.C723850SaN;
import X.C735280Sso;
import X.C736400Suc;
import X.C737030Svd;
import X.C739330SzL;
import X.C786410Ut5;
import X.C988370bpL;
import X.C988820bq4;
import X.EnumC1584370rKd;
import X.EnumC2281141EQm;
import X.EnumC696280RSw;
import X.EnumC721820STc;
import X.InterfaceC0241006d;
import X.InterfaceC1008930cMV;
import X.InterfaceC1146704e9;
import X.InterfaceC1282004zy;
import X.InterfaceC1294060jmO;
import X.InterfaceC1473950oSX;
import X.InterfaceC1483820oiS;
import X.InterfaceC20561815d2;
import X.InterfaceC448830Hir;
import X.InterfaceC582830MtV;
import X.InterfaceC583650Mup;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC689860R4e;
import X.InterfaceC690460R6m;
import X.InterfaceC703980RjQ;
import X.InterfaceC704110Rjd;
import X.InterfaceC713360RyY;
import X.InterfaceC739930T0t;
import X.InterfaceC988050bop;
import Y.ALAdapterS8S0200000_11;
import Y.ARunnableS80S0200000_11;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.crash.Npth;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.component.videoshrink.ICommerceLandingPageVideoShrinkAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.adapter.multicontent.DefaultEmptyInteractStickWidget;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.assem.ability.IStickerAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.main.CleanModeManager2;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.IStickerService;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerTemp;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobAbility;
import com.ss.android.ugc.feed.platform.container.scope.CommonVideoCellScope;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class AdMultiContentViewHolder extends AssemReusedContainer<AdMultiContentViewHolder, VideoItemParams> implements C0SZ8, C0RGF<AdMultiContentViewHolder, VideoItemParams>, ViewModelStoreOwner, InterfaceC1483820oiS, C0RDR, C0R7E, C0SIV, C0R5I, IVideoCellAbility, C0RAE<AdMultiContentViewHolder, VideoItemParams>, ETParamsProvider<C00I7>, IStickerAbility, WeakHandler.IHandler, InterfaceC988050bop, C0RGM, C0QSJ, InterfaceC1146704e9 {
    public final C0RF0 LLJILJILJ;
    public boolean LLJILLL;
    public Aweme LLJJ;
    public String LLJJI;
    public final Fragment LLJJIII;
    public final DataCenter LLJJIJI;
    public final VideoViewModel LLJJIJIIJIL;
    public final VideoPlayViewModel LLJJIJIL;
    public CommerceVideoDelegateKt LLJJJ;
    public InteractVideoTagAbility LLJJJIL;
    public VideoItemParams LLJJJJ;
    public final BaseFeedPageParams LLJJJJJIL;
    public String LLJJJJLIIL;
    public RootCellComponent LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final Context LLJL;
    public int LLJLIL;
    public FrameLayout LLJLILLLLZIIL;
    public FrameLayout LLJLL;
    public RelativeLayout LLJLLIL;
    public FrameLayout LLJLLL;
    public C0SUL LLJZ;
    public C0RH0 LLJZIJLIL;
    public FrameLayout LLL;
    public View LLLF;
    public View LLLFF;
    public ViewGroup LLLFFI;
    public ViewGroup LLLFZ;
    public ViewGroup LLLI;
    public ImageView LLLII;
    public C1322110kVd LLLIIII;
    public final C0T23 LLLIIIIL;
    public final C01GW LLLIIIL;
    public InterfaceC665370Q7z LLLIIL;
    public final C01GW LLLIILIL;
    public final WeakHandler LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public IPlayButtonAbility LLLILZLLLI;
    public WidgetManager LLLIZZ;
    public ReusedUIAssem<?> LLLJ;
    public C1013640cU6 LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public JSONObject LLLLIIL;
    public CellStickerManagerTemp LLLLIILL;
    public IScreenComponentAbility LLLLIILLL;
    public BottomSlideIndicatorAbility LLLLIL;
    public IPhotoModeAbility LLLLILI;
    public IPhotoSlidesAbility LLLLJ;
    public IPhotoSlidesEventDispatchAbility LLLLJI;
    public ISlideIndicatorAbility LLLLL;
    public ICommercePhotoSlideAbility LLLLLIL;
    public ICarouselComponentTranslationAbility LLLLLILLIL;
    public PauseTimeAbility LLLLLJIL;
    public FeedBarSearchAbility LLLLLJLJLL;
    public InterfaceC448830Hir LLLLLL;
    public InterfaceC704110Rjd LLLLLLIL;
    public FcpMetaTagAbility LLLLLLJ;
    public List<InterfaceC687730QyJ> LLLLLLL;

    @Override // X.C0SZ8
    public final /* synthetic */ void A(boolean z, C1AV2 c1av2) {
    }

    @Override // X.InterfaceC583650Mup
    public final void Ai1(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void B0(boolean z) {
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void C80() {
    }

    @Override // X.InterfaceC583650Mup
    public final boolean Da() {
        return true;
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void Dh1(Aweme aweme) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ BaseFeedPlayerView E() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Es(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void F0(String str) {
    }

    @Override // X.InterfaceC739930T0t
    public final void Fm() {
    }

    @Override // X.C0SZ8
    public final void G() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void H8(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ View Hk() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    @InterfaceC1294060jmO
    public final Integer Ia() {
        return 0;
    }

    @Override // X.InterfaceC1473950oSX
    public final void LIZ() {
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
    public final /* synthetic */ void LJIJJ() {
    }

    @Override // X.C0SZ8, X.C0SZA
    public final InterfaceC739930T0t LJIJJLI() {
        return this;
    }

    @Override // X.C0SIV
    public final void LJJ() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LJJIIJ() {
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
    public final /* synthetic */ void LJJJLZIJ(C1365850leB c1365850leB) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LJJLIIIJ() {
        return true;
    }

    @Override // X.C0SIV
    public final void LJJLIIIJLJLI(boolean z) {
    }

    @Override // X.InterfaceC739930T0t
    public final void LJJLL() {
    }

    @Override // X.InterfaceC739930T0t
    public final /* synthetic */ void LJL() {
    }

    @Override // X.C0SIV
    public final void LJLJI(boolean z) {
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
    public final void LJLLILLLL() {
        this.LLJILLL = true;
        InterfaceC1008930cMV interfaceC1008930cMVLLLIILIL = LLLIILIL();
        if (interfaceC1008930cMVLLLIILIL != null) {
            interfaceC1008930cMVLLLIILIL.LJIILL(new C692050RCp(true));
        }
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

    @Override // X.C0SIV
    public final void LLD(int i, int i2) {
    }

    @Override // X.InterfaceC1473950oSX
    public final /* synthetic */ void LLF(int i, int i2) {
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

    @Override // X.C0SZ8
    public final /* synthetic */ void LLIIII(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLIIIJ(C0SYH c0syh) {
    }

    @Override // X.C0SIV
    public final void LLIIIZ() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLIILZL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLIIZ() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLILII(boolean z) {
    }

    @Override // X.InterfaceC1473950oSX
    public final void LLILLIZIL(int i, int i2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLILLL(C1365860leC c1365860leC) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLIZLLLIL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJ(int i, boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJIJIIJIL(String str) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJIJIL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJJIL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJJJ(boolean z) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLJJJJJIL(boolean z, boolean z2) {
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
    public final /* synthetic */ boolean LLLLIIIILLL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLLIIL() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void LLLLIILL(int i, String str) {
    }

    @Override // X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
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
    public final /* synthetic */ boolean LLZLI() {
        return false;
    }

    @Override // X.C0SZ8
    public final void LLZZJLIL(View view) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean LLZZZIL() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void M(C0REZ c0rez) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void M0(C690190R5l c690190R5l) {
    }

    @Override // X.InterfaceC583650Mup
    public final boolean Mg() {
        return false;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ boolean Nv() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Q5(String str) {
    }

    @Override // X.C0RDR
    public final void Qi1(Video video) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void R() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void Rl(C035D c035d) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Uc() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Vu() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View Vy1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final InterfaceC690460R6m Wn0() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void Y0(int i, int i2, long j, long j2, long j3, long j4, long j5) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final int Yf2() {
        return 2;
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

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLLLIL = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLLLILI = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLLLJ = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLLLJI = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLLLL = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLLLLIL = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLLLLILLIL = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.LLLLLJIL = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLLLLJLJLL = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.LLLLLLL, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLLLLL = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLLLLLIL = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLLLLLJ = (FcpMetaTagAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ boolean bn() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    @InterfaceC1294060jmO
    public final Integer br() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View by1() {
        return null;
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void ce1(String str, String str2) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class, VideoCellScope.class, CommonVideoCellScope.class});
    }

    @Override // X.C0SZ8
    public final void e1() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void ek(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void ev() {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void g1(int i) {
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            return this.LLLLIL;
        }
        if (cls == IPhotoModeAbility.class) {
            return this.LLLLILI;
        }
        if (cls == IPhotoSlidesAbility.class) {
            return this.LLLLJ;
        }
        if (cls == IPhotoSlidesEventDispatchAbility.class) {
            return this.LLLLJI;
        }
        if (cls == ISlideIndicatorAbility.class) {
            return this.LLLLL;
        }
        if (cls == ICommercePhotoSlideAbility.class) {
            return this.LLLLLIL;
        }
        if (cls == ICarouselComponentTranslationAbility.class) {
            return this.LLLLLILLIL;
        }
        if (cls == PauseTimeAbility.class) {
            return this.LLLLLJIL;
        }
        if (cls == FeedBarSearchAbility.class) {
            return this.LLLLLJLJLL;
        }
        if (cls == InterfaceC448830Hir.class) {
            return this.LLLLLL;
        }
        if (cls == InterfaceC704110Rjd.class) {
            return this.LLLLLLIL;
        }
        if (cls == FcpMetaTagAbility.class) {
            return this.LLLLLLJ;
        }
        return null;
    }

    @Override // X.InterfaceC583650Mup
    public final int getContentType() {
        return 1;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        arrayList.add(VideoCellScope.class);
        arrayList.add(CommonVideoCellScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        arrayList.add(CommonVideoCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1483820oiS
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
    public final /* synthetic */ void h0(Aweme aweme) {
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void hj() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void ii(boolean z) {
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

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final C0SUL om() {
        return null;
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

    @Override // X.C0SZ8
    public final /* synthetic */ void onScrollEnd() {
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

    @Override // X.InterfaceC1473950oSX
    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
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

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void pe() {
    }

    @Override // X.C0SZ8
    public final void q(String str, String str2) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ View.OnTouchListener q5() {
        return null;
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void q7(float f, int i, int i2, int i3) {
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

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void td(HashMap<String, String> map) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void u1() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLLLIL = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLLLILI = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLLLJ = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLLLJI = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLLLL = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLLLLIL = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLLLLILLIL = null;
        } else if (cls == PauseTimeAbility.class) {
            this.LLLLLJIL = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLLLLJLJLL = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLLLLL = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLLLLLIL = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLLLLLJ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLLLLLL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void uq(C1365870leD c1365870leD) {
    }

    @Override // X.C0SZ8
    public final /* synthetic */ void v(long j, long j2, long j3, long j4, int i, long j5, int i2) {
    }

    @Override // X.C0SZ8
    public final InterfaceC583650Mup x3() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final boolean yE0() {
        return false;
    }

    @Override // X.InterfaceC583650Mup
    public final void ys(int i) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View yy0() {
        return null;
    }

    @Override // X.InterfaceC583650Mup
    public final ViewGroup zt1() {
        return null;
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return this.LLJILJILJ.LIZJ;
    }

    @Override // X.C0SIV
    public final int LJJI() {
        FrameLayout frameLayout = this.LLJLILLLLZIIL;
        if (frameLayout == null) {
            return 0;
        }
        return frameLayout.getHeight();
    }

    @Override // X.C0RDR
    public final DataCenter LJJIIZI() {
        DataCenter dataCenter = this.LLJJIJI;
        return dataCenter == null ? new DataCenter() : dataCenter;
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.LLJILJILJ.LIZ;
    }

    @Override // X.InterfaceC739930T0t
    public final void LJJLJLI() {
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(null, "show_festival_activity_icon");
        }
    }

    @Override // X.C0SIV
    public final float LJJZZI() {
        FrameLayout frameLayout = this.LLJLILLLLZIIL;
        if (frameLayout == null) {
            return 0.0f;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = this.LLLIIL;
        if (interfaceC665370Q7zLIZIZ == null) {
            interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        }
        return C690280R5u.LIZ(frameLayout, interfaceC665370Q7zLIZIZ);
    }

    @Override // X.C0SIV
    public final void LJLI() {
        C0RH0 c0rh0 = this.LLJZIJLIL;
        if (c0rh0 != null) {
            c0rh0.setGradualFullScreenView(null);
        }
    }

    @Override // X.C0RGM
    public final void LLI() {
        if (this.LLJLLIL == null) {
            return;
        }
        LLLLIILLL();
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LLJJJ;
        if (commerceVideoDelegateKt != null) {
            commerceVideoDelegateKt.LLI();
        }
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final ReusedUIAssem<?> LLILLJJLI() {
        RootCellComponent rootCellComponent = this.LLJJL;
        if (rootCellComponent != null) {
            return rootCellComponent;
        }
        C690870R8b c690870R8b = new C690870R8b();
        c690870R8b.LIZ = 7;
        c690870R8b.LIZIZ = "cell_multi_content_horizon_card";
        C0RF0 c0rf0 = this.LLJILJILJ;
        c690870R8b.LIZLLL = c0rf0;
        this.LLJJI = c0rf0.LJIIIZ;
        c690870R8b.LJ = c0rf0.LJ;
        c690870R8b.LJFF = C690330R5z.LIZ(new ViewModelProvider(this), this, C691720RBi.LIZ);
        C690430R6j c690430R6j = new C690430R6j(c690870R8b);
        C723850SaN.LJ(this, new AwS377S0200000_11(this, c690430R6j, 18));
        RootCellComponent rootCellComponent2 = new RootCellComponent(c690430R6j);
        this.LLJJL = rootCellComponent2;
        return rootCellComponent2;
    }

    @Override // X.InterfaceC386401eo
    public final long LLL() {
        C1013640cU6 c1013640cU6 = this.LLLJIL;
        if (c1013640cU6 == null) {
            return 0L;
        }
        return c1013640cU6.LJFF != null ? r0.videoPosition : 0;
    }

    public final InterfaceC1008930cMV LLLIILIL() {
        IFeedService iFeedService;
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ = null;
        if (this.LLLIIIL.getValue() != null && (iFeedService = (IFeedService) this.LLLIIIL.getValue()) != null) {
            interfaceC1008930cMVLIZJ = iFeedService.LIZJ(this.LLJL, this.LLJJ, this.LLJJI, true);
            if (interfaceC1008930cMVLIZJ != null) {
                interfaceC1008930cMVLIZJ.LJJIJ((C0RA7) this.LLLJL.getValue());
            }
        }
        return interfaceC1008930cMVLIZJ;
    }

    public final void LLLLIILLL() {
        FrameLayout.LayoutParams layoutParams;
        boolean z = C14LC.LJIIIZ;
        int iLIZIZ = 0;
        if (C309690CBz.LIZ.LJFF) {
            boolean z2 = (!C1017070cZd.LLIZLLLIL(this.LLJJ) || C1017070cZd.LLJILLL(this.LLJJ) || C1030680cva.LIZLLL || C1030680cva.LJIJ(this.LLJJ)) ? false : true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryDoAdaptation: topViewFullScene=");
            sbLIZ.append(z2);
            sbLIZ.append(",isTopViewAd=");
            sbLIZ.append(C1017070cZd.LLIZLLLIL(this.LLJJ));
            sbLIZ.append(", !isTopViewShown=");
            sbLIZ.append(!C1017070cZd.LLJILLL(this.LLJJ));
            sbLIZ.append(", !shouldSkipFullScene=");
            sbLIZ.append(true ^ C1030680cva.LJIJ(this.LLJJ));
            C2188811AlT.LIZIZ(sbLIZ);
            if (!z2) {
                iLIZIZ = 0 - C14LC.LIZIZ();
            }
        }
        int i = iLIZIZ + C14LC.LJIILJJIL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tryDoAdaptation: bottomMargin：");
        sbLIZ2.append(i);
        C2188811AlT.LIZIZ(sbLIZ2);
        RelativeLayout relativeLayout = this.LLJLLIL;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
            if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null) {
                return;
            }
            layoutParams.bottomMargin = i;
            C786410Ut5.e6(relativeLayout, layoutParams);
        }
    }

    public final void LLLLILI() {
        Aweme aweme = this.LLJJ;
        BaseFeedPageParams baseFeedPageParams = this.LLJJJJJIL;
        JSONObject jSONObjectLIZ = C708600Rqs.LIZ(baseFeedPageParams != null ? baseFeedPageParams.pageType : 0, aweme, this.LLJJJJLIIL, baseFeedPageParams != null ? baseFeedPageParams.eventType : null);
        this.LLLLIIL = jSONObjectLIZ;
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LLJJJ;
        if (commerceVideoDelegateKt != null) {
            commerceVideoDelegateKt.LJLLILLLL(jSONObjectLIZ);
        }
        VideoItemParams videoItemParams = this.LLJJJJ;
        if (videoItemParams != null) {
            videoItemParams.setRequestId(this.LLLLIIL);
        }
    }

    @Override // X.C0SZ8
    public final boolean LLLZ() {
        ICommerceLandingPageVideoShrinkAbility iCommerceLandingPageVideoShrinkAbility;
        Aweme aweme = this.LLJJ;
        return aweme == null || !AwemeExtKt.isAdTraffic(aweme) || (iCommerceLandingPageVideoShrinkAbility = (ICommerceLandingPageVideoShrinkAbility) this.LLLILZJ.getValue()) == null || !iCommerceLandingPageVideoShrinkAbility.xy();
    }

    @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
    public final InterfaceC0241006d Mb0() {
        return C161N.LIZIZ.LJJIJIIJIL(new WeakReference<>(this.LLJL), this.LLJJ, this.LLJJI);
    }

    @Override // X.C0R7E
    public final Fragment Q71() {
        return this.LLJILJILJ.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final List<Aweme> VA1() {
        return new ArrayList();
    }

    @Override // X.C0R9I
    public final AbsInteractStickerWidget c6() {
        InteractStickerWidget interactStickerWidgetLIZ;
        IStickerService iStickerService = (IStickerService) PluggableExtentionKt.pluggableSpi$default(IStickerService.class, false, false, false, 14, null);
        if (iStickerService == null || (interactStickerWidgetLIZ = iStickerService.LIZ()) == null) {
            return new DefaultEmptyInteractStickWidget();
        }
        interactStickerWidgetLIZ.LLJIJIL = this;
        interactStickerWidgetLIZ.LLJJJIL = "FEED";
        return interactStickerWidgetLIZ;
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LLJILJILJ.LIZJ.getActivity();
    }

    @Override // X.C0SZ8
    public final int getAwemeType() {
        Aweme aweme = this.LLJJ;
        if (aweme != null) {
            return aweme.getAwemeType();
        }
        return 200;
    }

    @Override // X.InterfaceC988050bop
    public final long getCurrentPosition() {
        long j;
        C1013640cU6 c1013640cU6 = this.LLLJIL;
        if (c1013640cU6 != null) {
            C0RAB c0rab = c1013640cU6.LJFF;
            j = c0rab != null ? c0rab.videoPosition : 0;
        } else {
            j = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCurrentPosition = ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        return j;
    }

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        if (lt2(C00I7.class)) {
            return C161N.LIZIZ.LJJIJIIJIL(new WeakReference<>(this.LLJL), this.LLJJ, this.LLJJI);
        }
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final HashMap getParams() {
        return new HashMap();
    }

    @Override // X.InterfaceC1483820oiS
    public final FrameLayout getPlayViewContainer() {
        return (FrameLayout) this.LLJILJILJ.LIZ.findViewById(R.id.eux);
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return new ViewModelStore();
    }

    @Override // X.C0SZ8
    public final void i0() {
        if (this.LLJJIJI != null) {
            LLJJLIIIJLLLLLLLZ(this.LLJJ, (int) LLL(), true);
        }
        RootCellComponent rootCellComponent = this.LLJJL;
        if (rootCellComponent != null) {
            rootCellComponent.hp("bottom_banner_playlist");
        }
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        InterfaceC713360RyY interfaceC713360RyY = this.LLJILJILJ.LJIIL;
        if (interfaceC713360RyY != null) {
            return C1558420qem.LIZIZ(interfaceC713360RyY);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final BaseFeedPageParams nJ2() {
        BaseFeedPageParams baseFeedPageParams = this.LLJJJJJIL;
        if (baseFeedPageParams == null) {
            baseFeedPageParams = new BaseFeedPageParams();
        }
        baseFeedPageParams.param.setCellType("cell_multi_content_horizon_card");
        return baseFeedPageParams;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void nO1() {
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.TRUE, "stopPlayAnimation");
        }
        VideoPlayViewModel videoPlayViewModel = this.LLJJIJIL;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.zQ2();
        }
    }

    @Override // X.InterfaceC739930T0t
    public final void no() {
        CellStickerManagerTemp cellStickerManagerTemp = this.LLLLIILL;
        if (cellStickerManagerTemp != null) {
            cellStickerManagerTemp.PQ();
        }
    }

    @Override // X.C0SZ8
    public final void onDestroyView() {
        if (C1594680rbG.LJ(this.LLJJ)) {
            InterfaceC582830MtV interfaceC582830MtVLIZ = C1029590ctp.LIZ();
            Aweme aweme = this.LLJJ;
            C1045340dJE c1045340dJE = (C1045340dJE) interfaceC582830MtVLIZ;
            c1045340dJE.getClass();
            if (C1012040cRW.LIZIZ().LJIIJJI && CommerceSearchAdConfigSetting.LIZ().enableDedupShowAndOmsdk) {
                C1012040cRW.LIZIZ().LJIIJJI = false;
            } else {
                c1045340dJE.LJJIJ(aweme);
            }
        }
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LLJJJ;
        if (commerceVideoDelegateKt != null) {
            commerceVideoDelegateKt.onDestroyView();
        }
        this.LLJLLIL = null;
        ViewGroup viewGroup = this.LLLI;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener((View.OnLayoutChangeListener) this.LLLLIIIILLL.getValue());
        }
    }

    @Override // X.C0SZ8
    public final void onResume() {
        InterfaceC1008930cMV interfaceC1008930cMVLLLIILIL;
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LLJJJ;
        if (commerceVideoDelegateKt != null) {
            commerceVideoDelegateKt.onResume();
        }
        if (!this.LLJILLL || (interfaceC1008930cMVLLLIILIL = LLLIILIL()) == null) {
            return;
        }
        interfaceC1008930cMVLLLIILIL.LJIILL(new C692050RCp(true));
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
    public final void onPause() {
        no();
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(null, "video_on_pause");
        }
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LLJJJ;
        if (commerceVideoDelegateKt != null) {
            commerceVideoDelegateKt.onPause();
        }
        InterfaceC1008930cMV interfaceC1008930cMVLLLIILIL = LLLIILIL();
        if (interfaceC1008930cMVLLLIILIL != null) {
            interfaceC1008930cMVLLLIILIL.LJIILL(new C692050RCp(false));
        }
    }

    @Override // X.C0SZ8
    public final void unBind() {
        String aid;
        LJJJLL().LIZIZ();
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.TRUE, "stopPlayAnimation");
        }
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LLJJJ;
        if (commerceVideoDelegateKt != null) {
            commerceVideoDelegateKt.LIZ();
        }
        RootCellComponent rootCellComponent = this.LLJJL;
        if (rootCellComponent != null) {
            rootCellComponent.LJLLLL();
        }
        InterfaceC1008930cMV interfaceC1008930cMVLLLIILIL = LLLIILIL();
        if (interfaceC1008930cMVLLLIILIL == null) {
            return;
        }
        Aweme aweme = this.LLJJ;
        if (aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
            interfaceC1008930cMVLLLIILIL.LJIILL(new C0RAJ(aid, null, null));
        }
        IAnoleManager iAnoleManagerRi = interfaceC1008930cMVLLLIILIL.Ri();
        if (iAnoleManagerRi != null) {
            iAnoleManagerRi.LJIIJJI(EnumC696280RSw.TT_FEED_MULTI_CONTENT_FULL_CELL.getSlotName());
        }
    }

    @Override // X.C0SZ8
    public final ImageView F2() {
        return this.LLLII;
    }

    @Override // X.C0SZ8
    public final InterfaceC689860R4e K9() {
        return this.LLJJJ;
    }

    @Override // X.C0SZ8
    public final C0SKK LJLLLL() {
        return C0SKK.INITIALIZED;
    }

    @Override // X.InterfaceC739930T0t
    public final Boolean LLIL() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final RootCellCommonAbility gI() {
        return this.LLJJL;
    }

    @Override // X.C0SZ8
    public final Aweme getAweme() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final Fragment getFragment() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC739930T0t
    public final View getRootView() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final Aweme im() {
        return this.LLJJ;
    }

    @Override // X.C0SZ8
    public final void Ar(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        VideoViewModel videoViewModel = this.LLJJIJIIJIL;
        if (videoViewModel != null) {
            videoViewModel.yQ2(aweme);
        }
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(aweme, "handle_double_click");
        }
    }

    @Override // X.C0RDR
    public final void Ft2(InterfaceC690460R6m interfaceC690460R6m) {
        C0SUL c0sul = this.LLJZ;
        if (c0sul != null) {
            c0sul.setListener(interfaceC690460R6m);
        }
    }

    @Override // X.C0SZ8
    public final void K1(boolean z) {
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.valueOf(z), "load_progress_bar");
        }
        VideoViewModel videoViewModel = this.LLJJIJIIJIL;
        if (videoViewModel != null) {
            videoViewModel.setState(new C0R8C(z));
        }
    }

    @Override // X.C0SZ8
    public final void K8(View.OnTouchListener onTouchListener) {
        C0SUL c0sul;
        C0RH0 c0rh0 = this.LLJZIJLIL;
        if (c0rh0 == null) {
            return;
        }
        if (onTouchListener != null) {
            c0sul = this.LLJZ;
        } else {
            c0sul = null;
        }
        c0rh0.LL = onTouchListener;
        c0rh0.LLILLJJLI = c0sul;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    @Override // X.C0SZ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.AdMultiContentViewHolder.LJI(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.C0SZ8
    public final void LJIIZILJ(boolean z) {
        DataCenter dataCenter;
        int i;
        RelativeLayout relativeLayout = this.LLJLLIL;
        if (relativeLayout != null) {
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, relativeLayout);
            if (!z) {
                C786410Ut5.T4(relativeLayout, 1.0f);
            }
        }
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LLJJJ;
        if (commerceVideoDelegateKt != null) {
            commerceVideoDelegateKt.LLJJ(z, false);
        }
        if (z && (dataCenter = this.LLJJIJI) != null) {
            dataCenter.zQ2(Boolean.TRUE, "dismiss_dou_pop");
        }
    }

    @Override // X.C0SZ8
    public final void LJJIFFI(boolean z) {
        float f;
        float f2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate3;
        ViewPropertyAnimator viewPropertyAnimatorAlpha3;
        ViewPropertyAnimator duration3;
        ViewPropertyAnimator viewPropertyAnimatorAnimate4;
        ViewPropertyAnimator viewPropertyAnimatorAlpha4;
        ViewPropertyAnimator duration4;
        C1387620mDI c1387620mDI = C1387620mDI.LIZ;
        Aweme aweme = this.LLJJ;
        c1387620mDI.getClass();
        if (C1387620mDI.LJI(aweme)) {
            return;
        }
        if (C0BOB.LIZ()) {
            RootCellComponent rootCellComponent = this.LLJJL;
            if (rootCellComponent != null) {
                C691710RBh.LIZ(rootCellComponent, "event_enter_dislike_mode", Boolean.valueOf(z));
            }
        } else {
            View view = this.LLLF;
            if (view != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate5 = view.animate();
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                viewPropertyAnimatorAnimate5.alpha(f2).setDuration(200L).start();
            }
            View view2 = this.LLLFF;
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate6 = view2.animate();
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                viewPropertyAnimatorAnimate6.alpha(f).setDuration(200L).start();
            }
        }
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LLJJJ;
        if (commerceVideoDelegateKt != null) {
            commerceVideoDelegateKt.LJJIFFI(z);
        }
        if (!z && !C1594680rbG.LIZLLL(this.LLJJ)) {
            RelativeLayout relativeLayout = this.LLJLLIL;
            if (relativeLayout != null) {
                C786410Ut5.LLIIL(relativeLayout, 0);
            }
            RelativeLayout relativeLayout2 = this.LLJLLIL;
            if (relativeLayout2 != null && (viewPropertyAnimatorAnimate4 = relativeLayout2.animate()) != null && (viewPropertyAnimatorAlpha4 = viewPropertyAnimatorAnimate4.alpha(1.0f)) != null && (duration4 = viewPropertyAnimatorAlpha4.setDuration(200L)) != null) {
                duration4.start();
            }
            FrameLayout frameLayout = this.LLJLL;
            if (frameLayout != null && (viewPropertyAnimatorAnimate3 = frameLayout.animate()) != null && (viewPropertyAnimatorAlpha3 = viewPropertyAnimatorAnimate3.alpha(1.0f)) != null && (duration3 = viewPropertyAnimatorAlpha3.setDuration(200L)) != null) {
                duration3.start();
            }
            if (this.LLJJLIIIJLLLLLLLZ) {
                this.LLJJLIIIJLLLLLLLZ = false;
                return;
            }
            return;
        }
        RelativeLayout relativeLayout3 = this.LLJLLIL;
        if (relativeLayout3 != null && (viewPropertyAnimatorAnimate2 = relativeLayout3.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(0.0f)) != null && (duration2 = viewPropertyAnimatorAlpha2.setDuration(200L)) != null) {
            duration2.start();
        }
        FrameLayout frameLayout2 = this.LLJLL;
        if (frameLayout2 != null && (viewPropertyAnimatorAnimate = frameLayout2.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(200L)) != null) {
            duration.start();
        }
        this.LLJJLIIIJLLLLLLLZ = true;
    }

    @Override // X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        C19EG c19egLIZIZ;
        boolean z;
        int i2;
        C1604450rr1 c1604450rr1HE0;
        String aid;
        InterfaceC1008930cMV interfaceC1008930cMVLLLIILIL;
        this.LLJLIL = i;
        RelativeLayout relativeLayout = this.LLJLLIL;
        if (relativeLayout != null) {
            C690160R5i.LIZ(relativeLayout);
        }
        CellStickerManagerTemp cellStickerManagerTemp = this.LLLLIILL;
        if (cellStickerManagerTemp != null) {
            cellStickerManagerTemp.tP(1.0f);
        }
        if (C1017070cZd.LLIZLLLIL(this.LLJJ) && !C1017070cZd.LLJILLL(this.LLJJ)) {
            LJIIZILJ(true);
            CommerceVideoDelegateKt commerceVideoDelegateKt = this.LLJJJ;
            if (commerceVideoDelegateKt != null) {
                commerceVideoDelegateKt.LLZZ(1);
            }
        } else {
            BaseFeedPageParams baseFeedPageParams = this.LLJJJJJIL;
            if (baseFeedPageParams != null && 1 == baseFeedPageParams.awemeFromPage) {
                RelativeLayout relativeLayout2 = this.LLJLLIL;
                C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
                if (c1576740r8KLIZ != null && (c1576740r8KLIZ.LIZ || ((c1576740r8KLIZ.LIZLLL && C0R93.LIZLLL(this.LLJJI)) || (c1576740r8KLIZ.LJII && C0R93.LJFF(this.LLJJI))))) {
                    z = true;
                } else {
                    z = false;
                }
                if (relativeLayout2 != null) {
                    if (z) {
                        i2 = 4;
                    } else {
                        i2 = 0;
                    }
                    C786410Ut5.LJLLLLLL(i2, relativeLayout2);
                    if (!z) {
                        C786410Ut5.T4(relativeLayout2, 1.0f);
                    }
                }
            } else {
                Context context = this.LLJL;
                if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                    ViewModelProviders.of(c19egLIZIZ).get(CleanModeManager2.class).getClass();
                }
            }
            CommerceVideoDelegateKt commerceVideoDelegateKt2 = this.LLJJJ;
            if (commerceVideoDelegateKt2 != null) {
                commerceVideoDelegateKt2.LLJLILLLLZIIL();
            }
        }
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.TRUE, "on_page_selected");
            dataCenter.zQ2(Integer.valueOf(i), "position_in_list");
        }
        if (C1594680rbG.LJ(this.LLJJ) && this.LLJLILLLLZIIL != null) {
            ((C1045340dJE) C1029590ctp.LIZ()).LJIL(this.LLJL, this.LLJLILLLLZIIL, this.LLJJ, true);
        }
        CommerceVideoDelegateKt commerceVideoDelegateKt3 = this.LLJJJ;
        if (commerceVideoDelegateKt3 != null) {
            commerceVideoDelegateKt3.LIZIZ();
        }
        if (C1017070cZd.LLIZLLLIL(this.LLJJ)) {
            LLLLIILLL();
        }
        RootCellComponent rootCellComponent = this.LLJJL;
        if (rootCellComponent != null) {
            rootCellComponent.J1(i, this.LLJJ);
        }
        Aweme aweme = this.LLJJ;
        if (aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0 && (interfaceC1008930cMVLLLIILIL = LLLIILIL()) != null) {
            interfaceC1008930cMVLLLIILIL.LJIILL(new C0RAJ(aid, new AwS590S0100000_11(this, 492), new AwS590S0100000_11(this, 493)));
        }
        C19EG activity = getActivity();
        if (activity != null) {
            Hox.LLJILJIL.LIZ(activity).wQ2("page_feed", (C0RA6) this.LLLL.getValue());
        }
        IScreenComponentAbility iScreenComponentAbility = this.LLLLIILLL;
        if (iScreenComponentAbility != null && (c1604450rr1HE0 = iScreenComponentAbility.HE0()) != null) {
            c1604450rr1HE0.LIZIZ((InterfaceC20561815d2) this.LLLLII.getValue(), true, false);
        }
        C1013640cU6 c1013640cU6 = this.LLLJIL;
        if (c1013640cU6 != null) {
            c1013640cU6.LIZJ = false;
            c1013640cU6.LIZJ(0);
        }
        VideoViewModel videoViewModel = this.LLJJIJIIJIL;
        if (videoViewModel != null) {
            videoViewModel.BQ2(i, new C0R5A(this.LLJLILLLLZIIL, null));
        }
    }

    @Override // X.C0SZ8
    public final void LJJJJJ(long j) {
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(null, "hide_commerce_second_info");
        }
    }

    @Override // X.C0SIV
    public final float LJJJJJL(C21415018rM c21415018rM) {
        int iLJ = C14KQ.LJ(getActivity());
        ViewGroup viewGroup = this.LLLFFI;
        float height = 0.0f;
        if (viewGroup != null) {
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iLJ, Integer.MIN_VALUE));
            height = 0.0f + viewGroup.getHeight();
        }
        ViewGroup viewGroup2 = this.LLLFZ;
        if (viewGroup2 != null && viewGroup2.getVisibility() == 0) {
            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(viewGroup2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iLJ, Integer.MIN_VALUE));
            height += viewGroup2.getHeight();
        }
        if (c21415018rM != null) {
            return height - c21415018rM.getHeight();
        }
        return height;
    }

    @Override // X.C0SIV
    public final int LJJLIIIJILLIZJL(C21415018rM c21415018rM) {
        return (int) (((double) C14KQ.LJ(getActivity())) * 0.4d);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    @Override // X.C0SZ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIIL(int r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.adapter.VideoViewModel r2 = r6.LLJJIJIIJIL
            if (r2 == 0) goto Ld
            kotlin.jvm.internal.AwS26S0001000_11 r1 = new kotlin.jvm.internal.AwS26S0001000_11
            r0 = 6
            r1.<init>(r7, r0)
            r2.setState(r1)
        Ld:
            com.ss.android.ugc.feed.platform.cell.RootCellComponent r0 = r6.LLJJL
            if (r0 == 0) goto L14
            r0.LJLIIIL(r7)
        L14:
            r4 = 0
            r2 = 4
            r5 = 5
            r3 = 1
            if (r7 == r3) goto L53
            if (r7 == r2) goto L53
            if (r7 == r5) goto L53
        L1e:
            X.0cMV r1 = r6.LLLIILIL()
            if (r1 == 0) goto L2c
            X.0RCp r0 = new X.0RCp
            r0.<init>(r4)
            r1.LJIILL(r0)
        L2c:
            if (r7 == r2) goto L79
            if (r7 == r5) goto L3e
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt r0 = r6.LLJJJ
            if (r0 == 0) goto L37
            r0.LJLIIIL(r7)
        L37:
            if (r7 == r3) goto L3e
            if (r7 == r5) goto L3e
        L3b:
            if (r7 != r3) goto L56
            return
        L3e:
            boolean r0 = X.C1398490mUp.LIZ()
            if (r0 == 0) goto L3b
            com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel r2 = r6.LLJJIJIL
            if (r2 == 0) goto L3b
            kotlin.jvm.internal.AwS26S0010000_11 r1 = new kotlin.jvm.internal.AwS26S0010000_11
            r0 = 10
            r1.<init>(r0)
            r2.setState(r1)
            goto L3b
        L53:
            r6.LLJILLL = r4
            goto L1e
        L56:
            r0 = 6
            if (r7 != r0) goto L5a
            return
        L5a:
            if (r7 != r5) goto L79
            r6.nO1()
            X.0Rzg r3 = new X.0Rzg
            X.0sA9 r0 = X.EnumC1616310sA9.SWITCH_PAGE
            int r2 = r0.getType()
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r6.LLJJJJJIL
            java.lang.String r1 = ""
            if (r0 == 0) goto L71
            java.lang.String r0 = r0.eventType
            if (r0 != 0) goto L72
        L71:
            r0 = r1
        L72:
            r3.<init>(r4, r2, r1, r0)
            X.C1440005kM.LIZ(r3)
            goto L8d
        L79:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r6.LLJJIJI
            if (r2 == 0) goto L86
            java.lang.String r1 = "pausePlayAnimation"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.zQ2(r0, r1)
        L86:
            com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel r0 = r6.LLJJIJIL
            if (r0 == 0) goto L8d
            r0.xQ2(r3)
        L8d:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r6.LLJJIJI
            if (r2 == 0) goto L98
            java.lang.String r1 = "holder_on_pause"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.zQ2(r0, r1)
        L98:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r6.LLJJIJI
            if (r2 == 0) goto La3
            java.lang.String r1 = "in_video_view_holder"
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.zQ2(r0, r1)
        La3:
            com.ss.android.ugc.aweme.feed.adapter.VideoViewModel r0 = r6.LLJJIJIIJIL
            if (r0 == 0) goto Laa
            r0.zQ2()
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.AdMultiContentViewHolder.LJLIIIL(int):void");
    }

    @Override // X.C0SZ8
    public final void LLIIL(String str) {
        this.LLJJJJLIIL = str;
        LLLLILI();
    }

    @Override // X.InterfaceC739930T0t
    public final void LLILIL(Aweme aweme) {
        C2487409ou.LIZJ(new ARunnableS80S0200000_11(this, aweme, 2));
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(this.LLJJJJ, "awesome_update_data");
        }
        VideoViewModel videoViewModel = this.LLJJIJIIJIL;
        if (videoViewModel != null) {
            videoViewModel.setState(new AwS590S0100000_11(this.LLJJJJ, 488));
        }
    }

    @Override // X.C0SZ8
    public final void LLJI(C697110RWb c697110RWb) {
        if (c697110RWb == null) {
            return;
        }
        if (this.LLJJJIL == null) {
            C690300R5w c690300R5w = VideoTagContainer.LLLJ;
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = this.LLLIIL;
            if (interfaceC665370Q7zLIZIZ == null) {
                interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
            }
            c690300R5w.getClass();
            this.LLJJJIL = (InteractVideoTagAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, InteractVideoTagAbility.class, null);
        }
        InteractVideoTagAbility interactVideoTagAbility = this.LLJJJIL;
        if (interactVideoTagAbility != null) {
            interactVideoTagAbility.wA2(c697110RWb);
        }
    }

    @Override // X.C0SZ8
    public final void LLJLLIL(boolean z) {
        LLLI(2);
    }

    @Override // X.C0SZ8
    public final void LLLI(int i) {
        InterfaceC1008930cMV interfaceC1008930cMVLLLIILIL;
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(Integer.valueOf(i), "holder_on_resume");
        }
        RootCellComponent rootCellComponent = this.LLJJL;
        if (rootCellComponent != null) {
            rootCellComponent.LLLI(i);
        }
        if (i == 1 || i == 2) {
            CommerceVideoDelegateKt commerceVideoDelegateKt = this.LLJJJ;
            if (commerceVideoDelegateKt != null) {
                commerceVideoDelegateKt.LLLI(i);
            }
            VideoViewModel videoViewModel = this.LLJJIJIIJIL;
            if (videoViewModel != null) {
                videoViewModel.AQ2();
            }
        }
        if (this.LLJILLL && (interfaceC1008930cMVLLLIILIL = LLLIILIL()) != null) {
            interfaceC1008930cMVLLLIILIL.LJIILL(new C692050RCp(true));
        }
    }

    public final CommerceVideoDelegateKt LLLIIL(C0RF0 c0rf0) {
        String str;
        BaseFeedPageParams baseFeedPageParams = c0rf0.LJ;
        if (baseFeedPageParams != null) {
            str = baseFeedPageParams.eventType;
        } else {
            str = null;
        }
        int i = baseFeedPageParams.pageType;
        C0R5N c0r5nLIZIZ = C1393420mMe.LIZIZ().LIZIZ();
        View view = c0rf0.LIZ;
        C0HTT<C737030Svd> c0htt = c0rf0.LIZIZ;
        Fragment fragment = this.LLJJIII;
        c0r5nLIZIZ.getClass();
        CommerceVideoDelegateKt commerceVideoDelegateKt = new CommerceVideoDelegateKt(this, view, i, str, c0htt, fragment, new C988370bpL());
        commerceVideoDelegateKt.LLJZ(c0rf0.LJ.param);
        commerceVideoDelegateKt.LJIIJ(this.LLJJIJI);
        return commerceVideoDelegateKt;
    }

    public final void LLLIZZ(Integer num) {
        String string;
        Aweme aweme;
        if (num != null) {
            num.intValue();
            JSONObject jSONObject = this.LLLLIIL;
            if (jSONObject != null) {
                try {
                    string = JSONObjectProtectorUtils.getString(jSONObject, "request_id");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    string = "";
                }
                if (!TextUtils.isEmpty(string) && (aweme = this.LLJJ) != null) {
                    aweme.setRequestId(string);
                }
            }
            C0HTT<C737030Svd> c0htt = this.LLJILJILJ.LIZIZ;
            if (c0htt != null && this.LLJJ != null) {
                int iIntValue = num.intValue();
                num.intValue();
                c0htt.LLIIL(new C737030Svd(iIntValue, this.LLJJ));
            }
        }
    }

    @Override // X.C0SZ8
    public final void LLZLLLL(int i) {
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(Integer.valueOf(i), "on_page_scroll_state_changed");
        }
        VideoViewModel videoViewModel = this.LLJJIJIIJIL;
        if (videoViewModel != null) {
            videoViewModel.setState(new C0R8B(i));
        }
    }

    @Override // X.C0SZ8
    public final View LLZZ(String str) {
        return Qg(str, false);
    }

    @Override // X.C0RDR
    public final void VE1(View.OnTouchListener onTouchListener) {
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(onTouchListener, "bind_title_touch_listener");
        }
    }

    @Override // X.C0SZ8
    public final void h(boolean z) {
        String aid;
        C1002470cC5 c1002470cC5;
        int i;
        int i2;
        int i3;
        int iMin;
        int i4;
        C1604450rr1 c1604450rr1HE0;
        C1030680cva.LIZLLL = true;
        if (C1594680rbG.LJ(this.LLJJ) && this.LLJLILLLLZIIL != null) {
            ((C1045340dJE) C1029590ctp.LIZ()).LJIL(this.LLJL, this.LLJLILLLLZIIL, this.LLJJ, true);
        }
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.TRUE, "on_page_unselected");
        }
        RootCellComponent rootCellComponent = this.LLJJL;
        if (rootCellComponent != null) {
            rootCellComponent.LJL();
        }
        C19EG activity = getActivity();
        if (activity != null) {
            Hox.LLJILJIL.LIZ(activity).PQ2("page_feed", (C0RA6) this.LLLL.getValue());
        }
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LLJJJ;
        if (commerceVideoDelegateKt != null) {
            commerceVideoDelegateKt.LJJIII();
        }
        IScreenComponentAbility iScreenComponentAbility = this.LLLLIILLL;
        if (iScreenComponentAbility != null && (c1604450rr1HE0 = iScreenComponentAbility.HE0()) != null) {
            c1604450rr1HE0.LJ((InterfaceC20561815d2) this.LLLLII.getValue());
        }
        C1013640cU6 c1013640cU6 = this.LLLJIL;
        if (c1013640cU6 != null && (c1002470cC5 = (C1002470cC5) c1013640cU6.LIZLLL.getValue()) != null) {
            C0RAB c0rab = c1013640cU6.LJFF;
            if (c0rab != null) {
                i = c0rab.totalPlayTime;
            } else {
                i = 0;
            }
            long j = i;
            if (c0rab != null) {
                i2 = c0rab.playOrder;
            } else {
                i2 = 0;
            }
            long j2 = i2;
            if (c0rab != null) {
                i3 = c0rab.videoLengthSum;
            } else {
                i3 = 0;
            }
            long j3 = i3;
            try {
                AwemeRawAd awemeRawAd = c1002470cC5.LIZ.getAwemeRawAd();
                if (j3 <= 0 || j <= 0) {
                    iMin = 0;
                } else {
                    iMin = (int) Math.min((int) ((((long) 100) * j) / j3), 100.0d);
                }
                HashMap map = new HashMap();
                map.put("play_order", Long.valueOf(j2));
                if (C988820bq4.LJII(c1002470cC5.LIZ)) {
                    if (C988820bq4.LIZLLL(c1002470cC5.LIZ)) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    map.put("is_pre_valid_action", Integer.valueOf(i4));
                }
                if (C1030680cva.LJIIJJI(c1002470cC5.LIZ) && C07H7.LIZ() && C739330SzL.LIZ(c1002470cC5.LIZ)) {
                    map.put("topview_skip", Boolean.TRUE);
                }
                C0CF8.LIZ.getClass();
                map.put("device_overall_score", Float.valueOf(C0CF8.LIZ()));
                if (awemeRawAd != null && awemeRawAd.isReshowAd()) {
                    map.put("is_reshow", 1);
                }
                map.put("duration", Long.valueOf(j));
                map.put("video_length", Long.valueOf(j3));
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "break", awemeRawAd);
                c1022820ciuLIZLLL.LIZJ(Long.valueOf(j), "duration");
                c1022820ciuLIZLLL.LIZJ(Integer.valueOf(iMin), "percent");
                aid = null;
                try {
                    c1022820ciuLIZLLL.LIZJ(null, "break_reason");
                    c1022820ciuLIZLLL.LIZJ(Long.valueOf(j3), "video_length");
                    c1022820ciuLIZLLL.LIZ(map);
                    c1022820ciuLIZLLL.LIZIZ(Long.valueOf(j), "player_duration");
                    c1022820ciuLIZLLL.LIZIZ(C1002470cC5.LJJIIZ(c1002470cC5.LIZ), "bsh_video_id");
                    c1022820ciuLIZLLL.LJIIIIZZ();
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                th = th2;
                aid = null;
            }
        } else {
            aid = null;
        }
        VideoViewModel videoViewModel = this.LLJJIJIIJIL;
        if (videoViewModel != null) {
            Aweme aweme = this.LLJJ;
            if (aweme != null) {
                aid = aweme.getAid();
            }
            videoViewModel.CQ2(aid, z);
        }
        C1322110kVd c1322110kVd = this.LLLIIII;
        if (c1322110kVd != null) {
            C786410Ut5.LLZZLLIL(c1322110kVd, 0);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C1013640cU6 c1013640cU6;
        int i = 1;
        if (message != null && message.what == 1000 && (c1013640cU6 = this.LLLJIL) != null) {
            if (c1013640cU6.LJ instanceof C0RAW) {
                i = 0;
            }
            InterfaceC1008930cMV interfaceC1008930cMV = c1013640cU6.LIZIZ;
            if (interfaceC1008930cMV != null) {
                interfaceC1008930cMV.LJIILL(new C0RAK(i));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
    public final boolean lt2(Class<? extends InterfaceC0241006d> cls) {
        return Intrinsics.LJFF(cls, C00I7.class);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        long jC8;
        int showSeconds;
        CommerceVideoDelegateKt commerceVideoDelegateKt;
        AwemeRawAd awemeRawAd;
        CommerceVideoDelegateKt commerceVideoDelegateKt2;
        C0HTT<C737030Svd> c0htt;
        String str;
        CommerceVideoDelegateKt commerceVideoDelegateKt3;
        Aweme aweme;
        C0RD4 c0rd42 = c0rd4;
        String str2 = c0rd42.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChanged key = ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        int interactionSeconds = 0;
        Object obj = null;
        switch (str2.hashCode()) {
            case -1618328215:
                if (!str2.equals("video_digg")) {
                    return;
                }
                Object obj2 = c0rd42.LIZIZ;
                if (obj2 != null) {
                    obj = obj2;
                }
                LLLIZZ((Integer) obj);
                return;
            case -777668341:
                if (!str2.equals("update_diig_view")) {
                    return;
                }
                Object obj3 = c0rd42.LIZIZ;
                if (obj3 != null) {
                    obj = obj3;
                }
                if (!Intrinsics.LJFF(obj, Boolean.TRUE) || this.LLJJJ == null) {
                    return;
                }
                if (!C1017070cZd.LJLJJL(this.LLJJ) && !C1017070cZd.LJL(this.LLJJ) && (commerceVideoDelegateKt2 = this.LLJJJ) != null) {
                    commerceVideoDelegateKt2.LIZLLL();
                }
                if (!C1017070cZd.LLILLL(this.LLJJ) || C1017070cZd.LJJI(this.LLJJ) == null) {
                    return;
                }
                CommerceVideoDelegateKt commerceVideoDelegateKt4 = this.LLJJJ;
                if (commerceVideoDelegateKt4 != null) {
                    jC8 = commerceVideoDelegateKt4.c8();
                } else {
                    jC8 = 0;
                }
                CardStruct cardStructLJJI = C1017070cZd.LJJI(this.LLJJ);
                if (cardStructLJJI != null) {
                    showSeconds = cardStructLJJI.getShowSeconds();
                } else {
                    showSeconds = 0;
                }
                if (jC8 < showSeconds * LSPassThroughRecordSizeConfig.DEFAULT || (commerceVideoDelegateKt = this.LLJJJ) == null) {
                    return;
                }
                Aweme aweme2 = this.LLJJ;
                if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null) {
                    interactionSeconds = awemeRawAd.getInteractionSeconds();
                }
                commerceVideoDelegateKt.LLIIZ(interactionSeconds * LSPassThroughRecordSizeConfig.DEFAULT);
                return;
            case -492284990:
                if (!str2.equals("video_comment_list")) {
                    return;
                }
                break;
            case -162745511:
                if (!str2.equals("feed_internal_event") || (c0htt = this.LLJILJILJ.LIZIZ) == null) {
                    return;
                }
                Object obj4 = c0rd42.LIZIZ;
                if (obj4 != null) {
                    obj = obj4;
                }
                c0htt.LLIIL((C737030Svd) obj);
                return;
            case -144973899:
                if (!str2.equals("title_view_click")) {
                    return;
                }
                Object obj5 = c0rd42.LIZIZ;
                if (obj5 != null) {
                    obj = obj5;
                }
                if (!Intrinsics.LJFF("new_ad_fake_user", obj) && (commerceVideoDelegateKt3 = this.LLJJJ) != null && commerceVideoDelegateKt3.LJJZZI()) {
                    return;
                }
                Aweme aweme3 = this.LLJJ;
                if (aweme3 != null && aweme3.isCanPlay() && !AwemeExtKt.isDelete(aweme3)) {
                    if (aweme3.getAuthor() != null || C1019620cdk.LIZIZ(3, aweme3)) {
                        LLLIZZ(18);
                        CommerceVideoDelegateKt commerceVideoDelegateKt5 = this.LLJJJ;
                        if (commerceVideoDelegateKt5 != null) {
                            commerceVideoDelegateKt5.LLIIIZ();
                        }
                    }
                    Bundle bundle = new Bundle();
                    C1440005kM.LIZ(new C737030Svd(85, aweme3));
                    Context context = this.LLJL;
                    if (context != null) {
                        C736400Suc c736400Suc = C736400Suc.LIZ;
                        BaseFeedPageParams baseFeedPageParams = this.LLJJJJJIL;
                        if (baseFeedPageParams == null || (str = baseFeedPageParams.eventType) == null) {
                            str = "";
                        }
                        EnumC721820STc enumC721820STc = EnumC721820STc.CLICK_NAME;
                        c736400Suc.getClass();
                        C736400Suc.LIZIZ(aweme3, context, str, enumC721820STc);
                    }
                    C1514430pVp.LJFF(EnumC1584370rKd.PROFILE);
                    LLLL(bundle, "click_name");
                    return;
                }
                C1233040iBy c1233040iBy = new C1233040iBy(this.LLJL);
                c1233040iBy.LIZIZ(2131858174);
                c1233040iBy.LIZLLL();
                return;
            case 1150830693:
                if (!str2.equals("video_comment_preload")) {
                    return;
                }
                break;
            case 1181771620:
                if (!str2.equals("video_share_click")) {
                    return;
                }
                C735280Sso c735280Sso = C735280Sso.LIZ;
                Aweme aweme4 = this.LLJJ;
                c735280Sso.getClass();
                if (C735280Sso.LJ(aweme4) && (aweme = this.LLJJ) != null && !AwemeExtKt.isCollected(aweme) && C735280Sso.LJFF(this.LLJJ)) {
                    C1233040iBy c1233040iBy2 = new C1233040iBy(this.LLJL);
                    c1233040iBy2.LIZIZ(2131858551);
                    c1233040iBy2.LIZLLL();
                    return;
                }
                LLLIZZ(3);
                return;
            case 1724642747:
                if (!str2.equals("video_gift_stripe_show_comment_list_gift_panel")) {
                    return;
                }
                break;
            case 1754262615:
                if (!str2.equals("video_comment_panel_pre_create")) {
                    return;
                }
                break;
            case 1964086245:
                if (!str2.equals("to_profile")) {
                    return;
                }
                Object obj6 = c0rd42.LIZIZ;
                if (obj6 == null) {
                    obj6 = null;
                }
                LLLL(null, (String) obj6);
                return;
            default:
                return;
        }
        Object obj7 = c0rd42.LIZIZ;
        if (obj7 != null) {
            obj = obj7;
        }
        LLLIZZ((Integer) obj);
    }

    @Override // X.C0SZ8
    public final void onPageSelected(int i) {
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(null, "on_viewpager_page_selected");
        }
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLLLLLL == null) {
            this.LLLLLLL = new ArrayList();
        }
        ((ArrayList) this.LLLLLLL).add(interfaceC687730QyJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdMultiContentViewHolder(X.C0RF0 r18, X.C691470RAj r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.AdMultiContentViewHolder.<init>(X.0RF0, X.0RAj):void");
    }

    @Override // X.C0SZ8
    public final void L0(int i, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        this.LLJLIL = i;
        aweme.equals(this.LLJJ);
        this.LLJJ = aweme;
        VideoItemParams videoItemParams = this.LLJJJJ;
        if (videoItemParams == null) {
            return;
        }
        videoItemParams.setAweme(aweme);
        videoItemParams.setwidgetAweme(aweme);
        LLLLILI();
        RootCellComponent rootCellComponent = this.LLJJL;
        if (rootCellComponent != null) {
            rootCellComponent.H();
        }
    }

    @Override // X.C0SZ8
    public final void LJJJJ(int i, Aweme aweme) {
        this.LLJJ = aweme;
        this.LLJLIL = i;
        LJI(aweme);
    }

    @Override // X.C0SZ8
    public final void LJJJLIIL(int i, long j) {
        String strLIZ;
        String aid;
        int i2;
        Aweme aweme = this.LLJJ;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            IRequestIdService iRequestIdService = (IRequestIdService) PluggableExtentionKt.pluggableSpi$default(IRequestIdService.class, false, false, false, 14, null);
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("ad_show");
            C2241008qG c2241008qG = new C2241008qG();
            if (iRequestIdService != null) {
                BaseFeedPageParams baseFeedPageParams = this.LLJJJJJIL;
                if (baseFeedPageParams != null) {
                    i2 = baseFeedPageParams.pageType;
                } else {
                    i2 = 0;
                }
                strLIZ = iRequestIdService.LIZ(i2, aweme);
            } else {
                strLIZ = null;
            }
            c2241008qG.LIZ.put("request_id", strLIZ);
            mobClickObtain.setJsonObject(c2241008qG.LJ());
            Aweme aweme2 = this.LLJJ;
            if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                aid = "";
            }
            mobClickObtain.setExtValueString(aid);
            C20684815ws.onEvent(mobClickObtain);
        }
        if (C0R93.LIZLLL(this.LLJJI)) {
            C1029590ctp.LJFF();
            C588810N7n.LIZ(j, this.LLJL, this.LLJJ);
            C1029590ctp.LJFF();
            C588810N7n.LIZIZ(j, this.LLJL, this.LLJJ);
        }
    }

    @Override // X.C0SZ8
    public final void LLJL(boolean z, boolean z2) {
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        C1387620mDI c1387620mDI = C1387620mDI.LIZ;
        Aweme aweme = this.LLJJ;
        c1387620mDI.getClass();
        if (C1387620mDI.LJI(aweme)) {
            return;
        }
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LLJJJ;
        if (commerceVideoDelegateKt != null) {
            commerceVideoDelegateKt.LJJIFFI(z);
        }
        if (z) {
            RelativeLayout relativeLayout = this.LLJLLIL;
            if (relativeLayout != null && (viewPropertyAnimatorAnimate = relativeLayout.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null) {
                duration = viewPropertyAnimatorAlpha.setDuration(200L);
            } else {
                duration = null;
            }
            if (z2) {
                if (duration != null) {
                    duration.setListener(new ALAdapterS8S0200000_11(this, duration, 1));
                    duration.start();
                }
            } else if (duration != null) {
                duration.start();
            }
            this.LLJJLIIIJLLLLLLLZ = true;
            return;
        }
        RelativeLayout relativeLayout2 = this.LLJLLIL;
        if (relativeLayout2 != null) {
            relativeLayout2.animate().alpha(1.0f).setDuration(200L).start();
        }
        if (!this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = false;
    }

    public final void LLLL(Bundle bundle, String str) {
        int iHashCode;
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(Boolean.TRUE, "dismiss_dou_pop");
        }
        Context context = this.LLJL;
        if (context != null) {
            iHashCode = context.hashCode();
        } else {
            iHashCode = 0;
        }
        C0SPE c0spe = new C0SPE(iHashCode, 0);
        if (C690970R8l.LIZ()) {
            c0spe.LIZIZ = bundle;
        }
        if (str != null && str.length() != 0) {
            c0spe.LIZJ = str;
        }
        C1440005kM.LIZ(new C690450R6l(this.LLJJI));
        C1440005kM.LIZ(c0spe);
    }

    @Override // X.C0SZ8
    public final View Qg(String str, boolean z) {
        View viewQg;
        RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), RootCellCommonAbility.class, null);
        if (rootCellCommonAbility != null) {
            viewQg = rootCellCommonAbility.Qg(str, z);
        } else {
            viewQg = null;
        }
        InteractAreaSizeMobAbility interactAreaSizeMobAbility = (InteractAreaSizeMobAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), InteractAreaSizeMobAbility.class, null);
        if ((viewQg instanceof InterfaceC703980RjQ) && interactAreaSizeMobAbility != null) {
            interactAreaSizeMobAbility.k42((InterfaceC703980RjQ) viewQg, str);
        }
        return viewQg;
    }

    public final void LLJJLIIIJLLLLLLLZ(Aweme aweme, int i, boolean z) {
        int iHashCode;
        C690870R8b c690870R8bJm;
        String str;
        if (aweme == null) {
            return;
        }
        VideoItemParams videoItemParams = this.LLJJJJ;
        if (videoItemParams != null) {
            videoItemParams.currentPosition = i;
        }
        DataCenter dataCenter = this.LLJJIJI;
        if (dataCenter != null) {
            dataCenter.zQ2(videoItemParams, "video_params");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindVideoData,position:");
        sbLIZ.append(i);
        sbLIZ.append(", aweme");
        sbLIZ.append(aweme);
        C2188811AlT.LIZIZ(sbLIZ);
        VideoItemParams videoItemParams2 = this.LLJJJJ;
        String aid = aweme.getAid();
        if (aid != null) {
            Npth.addTag("feed_video_cell_bind_aid", aid);
        }
        if (videoItemParams2 != null && (str = videoItemParams2.mEventType) != null) {
            Npth.addTag("feed_video_cell_bind_scene", str);
        }
        HashMap map = new HashMap();
        map.put("aweme_id", aweme.getAid());
        map.put("request_id", aweme.getRequestId());
        map.put("aweme_type", String.valueOf(aweme.getAwemeType()));
        RootCellComponent rootCellComponent = this.LLJJL;
        if (rootCellComponent != null && (c690870R8bJm = rootCellComponent.jm()) != null) {
            iHashCode = c690870R8bJm.hashCode();
        } else {
            iHashCode = 0;
        }
        String strValueOf = String.valueOf(iHashCode);
        C01GW c01gw = C692070RCr.LIZ;
        C692070RCr.LIZJ(strValueOf, map);
        C692090RCt c692090RCtLIZLLL = C692070RCr.LIZLLL(strValueOf, "VideoViewCell", "onReusedBind");
        LLLIL(i, this.LLJJJJ, C0R9O.LIZ());
        C692070RCr.LIZ(c692090RCtLIZLLL, strValueOf, null, null);
    }

    public final void LLLIL(int i, VideoItemParams videoItemParams, List<? extends Object> list) {
        C0RDF c0rdfC41;
        Set<AssemViewModel<?>> setLIZ;
        FeedBaseHolderViewModel feedBaseHolderViewModel;
        RootCellComponent rootCellComponent;
        ReusedUIAssem<?> reusedUIAssem = this.LLLJ;
        if ((reusedUIAssem instanceof RootCellComponent) && (rootCellComponent = (RootCellComponent) reusedUIAssem) != null) {
            rootCellComponent.ep(i, this.LLJJ);
        }
        RootCellComponent rootCellComponent2 = this.LLJJL;
        if (rootCellComponent2 != null) {
            rootCellComponent2.T6(i, this.LLJJ);
        }
        LLJJJJLIIL(i, videoItemParams, list);
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
