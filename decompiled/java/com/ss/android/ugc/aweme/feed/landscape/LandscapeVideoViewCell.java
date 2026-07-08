package com.ss.android.ugc.aweme.feed.landscape;

import X.C00I7;
import X.C01GW;
import X.C0BXH;
import X.C0HTT;
import X.C0N0Y;
import X.C0Q69;
import X.C0Q6C;
import X.C0R5I;
import X.C0R89;
import X.C0R9L;
import X.C0RA2;
import X.C0RD4;
import X.C0REZ;
import X.C0RF0;
import X.C0RGD;
import X.C0RGG;
import X.C0RJN;
import X.C0RLJ;
import X.C0RQB;
import X.C0RQD;
import X.C0SIV;
import X.C0SUL;
import X.C0SXF;
import X.C0SYH;
import X.C12P2;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1349800lEI;
import X.C1365850leB;
import X.C1365860leC;
import X.C1365870leD;
import X.C13LE;
import X.C1440005kM;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481060oe0;
import X.C1483410ohn;
import X.C1558420qem;
import X.C1558520qew;
import X.C1578630rBN;
import X.C161N;
import X.C19719912Dl;
import X.C19EG;
import X.C1EE2;
import X.C20684815ws;
import X.C2189821An6;
import X.C2217401BqU;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C2549509yv;
import X.C305460ByC;
import X.C418440Gaw;
import X.C421520Gfu;
import X.C425650GmZ;
import X.C426750GoL;
import X.C438710HIf;
import X.C452501pT;
import X.C487360J9i;
import X.C520680KbS;
import X.C583620Mum;
import X.C584270Mvp;
import X.C584470Mw9;
import X.C586380MzE;
import X.C621180OYa;
import X.C673150Qan;
import X.C680890QnH;
import X.C687700QyG;
import X.C689910R4j;
import X.C690180R5k;
import X.C690430R6j;
import X.C690650R7f;
import X.C690870R8b;
import X.C691080R8w;
import X.C692450REd;
import X.C692480REg;
import X.C692720RFe;
import X.C692760RFi;
import X.C692850RFr;
import X.C692880RFu;
import X.C692890RFv;
import X.C697110RWb;
import X.C705920RmY;
import X.C712430Rx3;
import X.C722660SWi;
import X.C723850SaN;
import X.C726690Sex;
import X.C729980SkG;
import X.C730120SkU;
import X.C735370Ssx;
import X.C735410St1;
import X.C735610StL;
import X.C737030Svd;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1334360kpO;
import X.EnumC452301pR;
import X.EnumC730430Skz;
import X.InterfaceC0241006d;
import X.InterfaceC1210900hcG;
import X.InterfaceC1282004zy;
import X.InterfaceC1294060jmO;
import X.InterfaceC1482650ogZ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC448830Hir;
import X.InterfaceC583650Mup;
import X.InterfaceC687730QyJ;
import X.InterfaceC689860R4e;
import X.InterfaceC690460R6m;
import X.InterfaceC704110Rjd;
import X.InterfaceC739930T0t;
import X.RunnableC686980Qx6;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS30S0110000_11;
import Y.ARunnableS80S0200000_11;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.LandscapeClearScreenViewModel;
import com.ss.android.ugc.aweme.abilities.LandscapePanelStateNotificationAbility;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.LandscapeCellAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.clean.LandscapeCellCleanModeViewModel;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeAutoRotationTipsAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeProfilePanelAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.IStickerService;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility;
import com.ss.android.ugc.feed.platform.container.interaction.FeedInteractionAreaContainer;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS0S1000001_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS62S1000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class LandscapeVideoViewCell extends VideoBaseCell implements C0SIV, C0R5I, ETParamsProvider<C00I7> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLZZIL;
    public RelativeLayout LLJJJJLIIL;
    public RelativeLayout LLJJL;
    public BaseFeedPlayerView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public ViewGroup LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public FrameLayout LLJLLIL;
    public FrameLayout LLJLLL;
    public C487360J9i LLJZ;
    public C0RGD LLJZIJLIL;
    public LinearLayout LLL;
    public RelativeLayout LLLF;
    public FrameLayout LLLFF;
    public C0SUL LLLFFI;
    public FrameLayout LLLFZ;
    public final C692850RFr LLLI;
    public Context LLLII;
    public C0HTT<C737030Svd> LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public final C705920RmY LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public DataCenter LLLILZ;
    public View LLLILZJ;
    public VideoViewModel LLLILZLLLI;
    public VideoPlayViewModel LLLIZZ;
    public final C01GW LLLJ;
    public C425650GmZ LLLJIL;
    public C12P2 LLLJL;
    public ViewGroup LLLL;
    public ViewGroup LLLLII;
    public TuxIconView LLLLIIIILLL;
    public TuxTextView LLLLIIL;
    public TuxTextView LLLLIILL;
    public TuxTextView LLLLIILLL;
    public ImageView LLLLIL;
    public ImageView LLLLILI;
    public SmartImageView LLLLJ;
    public C421520Gfu LLLLJI;
    public final BPEAHandler LLLLL;
    public final ConcurrentHashSet LLLLLIL;
    public LandscapeCellAssem LLLLLILLIL;
    public C692720RFe LLLLLJIL;
    public final C01GW LLLLLJLJLL;
    public final C01GW LLLLLL;
    public final int LLLLLLIL;
    public final C01GW LLLLLLJ;
    public final BPEAHandler LLLLLLL;
    public final ARunnableS111S0100000_11 LLLLLLLLL;
    public C0R9L LLLLLLLLLL;
    public WidgetManager LLLLLLLZIL;
    public BaseFeedPageParams LLLLLLZ;
    public final Set<View> LLLLLLZZ;
    public Aweme LLLLLZ;
    public float LLLLLZIL;
    public long LLLLLZL;
    public boolean LLLLZ;
    public BottomSlideIndicatorAbility LLLLZI;
    public IPhotoModeAbility LLLLZIL;
    public IPhotoSlidesAbility LLLLZLL;
    public IPhotoSlidesEventDispatchAbility LLLLZLLIL;
    public ISlideIndicatorAbility LLLLZLLLI;
    public ICommercePhotoSlideAbility LLLZ;
    public ICarouselComponentTranslationAbility LLLZI;
    public PauseTimeAbility LLLZIIL;
    public FeedBarSearchAbility LLLZIL;
    public InterfaceC448830Hir LLLZL;
    public InterfaceC704110Rjd LLLZLL;
    public FcpMetaTagAbility LLLZLZ;
    public List<InterfaceC687730QyJ> LLLZZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(LandscapeVideoViewCell.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLLZZIL = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    @Override // X.InterfaceC739930T0t
    public final void Fm() {
    }

    @Override // X.C0SZ8
    public final void K1(boolean z) {
    }

    @Override // X.C0SZ8
    public final InterfaceC689860R4e K9() {
        return null;
    }

    @Override // X.InterfaceC1473950oSX
    public final void LIZ() {
    }

    @Override // X.C0SZ8
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC739930T0t
    public final void LJIILIIL() {
    }

    @Override // X.C0SZ8, X.C0SZA
    public final InterfaceC739930T0t LJIJJLI() {
        return this;
    }

    @Override // X.C0SZ8
    public final void LJJJJJ(long j) {
    }

    @Override // X.C0SZ8
    public final void LJJJLIIL(int i, long j) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJJLZIJ(C1365850leB c1365850leB) {
    }

    @Override // X.InterfaceC739930T0t
    public final void LJJLJLI() {
    }

    @Override // X.C0SZ8
    public void LJLIIIL(int i) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC1473950oSX
    public final void LLF(int i, int i2) {
    }

    @Override // X.C0RGM
    public final void LLI() {
    }

    @Override // X.C0SZ8
    public final void LLIIL(String str) {
    }

    @Override // X.InterfaceC739930T0t
    public final void LLILIL(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLILLL(C1365860leC c1365860leC) {
    }

    @Override // X.C0SZ8
    public final void LLJI(C697110RWb c697110RWb) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLJJ(int i, boolean z) {
    }

    @Override // X.C0SZ8
    public final void LLJL(boolean z, boolean z2) {
    }

    @Override // X.C0SZ8
    public void LLLI(int i) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public int LLLIIL() {
        return 28;
    }

    @Override // X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLZZJLIL(View view) {
    }

    @Override // X.C0RDR
    public final void VE1(View.OnTouchListener onTouchListener) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void Z(int i, boolean z) {
    }

    @Override // X.InterfaceC583650Mup
    public final void Z1() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.C0SZ8
    public final void e1() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public Object getAbility(Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            return this.LLLLZI;
        }
        if (cls == IPhotoModeAbility.class) {
            return this.LLLLZIL;
        }
        if (cls == IPhotoSlidesAbility.class) {
            return this.LLLLZLL;
        }
        if (cls == IPhotoSlidesEventDispatchAbility.class) {
            return this.LLLLZLLIL;
        }
        if (cls == ISlideIndicatorAbility.class) {
            return this.LLLLZLLLI;
        }
        if (cls == ICommercePhotoSlideAbility.class) {
            return this.LLLZ;
        }
        if (cls == ICarouselComponentTranslationAbility.class) {
            return this.LLLZI;
        }
        if (cls == PauseTimeAbility.class) {
            return this.LLLZIIL;
        }
        if (cls == FeedBarSearchAbility.class) {
            return this.LLLZIL;
        }
        if (cls == InterfaceC448830Hir.class) {
            return this.LLLZL;
        }
        if (cls == InterfaceC704110Rjd.class) {
            return this.LLLZLL;
        }
        if (cls == FcpMetaTagAbility.class) {
            return this.LLLZLZ;
        }
        return null;
    }

    @Override // X.InterfaceC583650Mup
    public final int getContentType() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final String gq() {
        throw null;
    }

    @Override // X.C0SZ8
    public final void i0() {
    }

    @Override // X.C0SZ8
    public final void onPageSelected(int i) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
    }

    @Override // X.C0SZ8
    public final void q(String str, String str2) {
    }

    @Override // X.InterfaceC583650Mup
    public final void sc() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLLZZ;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void uq(C1365870leD c1365870leD) {
    }

    @Override // X.C0SZ8
    public final InterfaceC583650Mup x3() {
        return this;
    }

    @Override // X.InterfaceC583650Mup
    public final void ys(int i) {
    }

    @Override // X.InterfaceC583650Mup
    public final boolean Da() {
        BaseFeedPlayerView baseFeedPlayerView = this.LLJJLIIIJLLLLLLLZ;
        return baseFeedPlayerView != null && baseFeedPlayerView.Da();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final ImageView F2() {
        boolean z = C692450REd.LIZ;
        if (!C692450REd.LIZ) {
            return null;
        }
        return this.LLLLILI;
    }

    @Override // X.C0SZ8
    public final void G() {
        SmartImageView smartImageView = this.LLLLJ;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC739930T0t
    public final void LJIIJJI() {
        DataCenter dataCenter = this.LLLILZ;
        if (dataCenter == null) {
            dataCenter = null;
        }
        dataCenter.zQ2(null, "video_hide_share_stay_home_animation");
        VideoShareViewModel videoShareViewModelLIZLLL = C0RLJ.LIZLLL(this);
        if (videoShareViewModelLIZLLL != null) {
            videoShareViewModelLIZLLL.FQ2();
        }
    }

    @Override // X.C0RDR
    public final DataCenter LJJIIZI() {
        DataCenter dataCenter = this.LLLILZ;
        if (dataCenter == null) {
            return null;
        }
        return dataCenter;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC739930T0t
    public final void LJL() {
        DataCenter dataCenter = this.LLLILZ;
        if (dataCenter == null) {
            dataCenter = null;
        }
        dataCenter.zQ2(null, "video_show_share_stay_home_animation");
        VideoShareViewModel videoShareViewModelLIZLLL = C0RLJ.LIZLLL(this);
        if (videoShareViewModelLIZLLL != null) {
            videoShareViewModelLIZLLL.SQ2();
        }
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final ReusedUIAssem LLILLJJLI() {
        LandscapeCellAssem landscapeCellAssem = this.LLLLLILLIL;
        if (landscapeCellAssem != null) {
            return landscapeCellAssem;
        }
        BaseFeedPageParams baseFeedPageParams = this.LLJILJILJ.LJ;
        this.LLLLLLZ = baseFeedPageParams;
        if (baseFeedPageParams == null) {
            baseFeedPageParams = null;
        }
        AFwS198S0000000_11 aFwS198S0000000_11 = AFwS198S0000000_11.get$arr$(394);
        int iLLLIIL = LLLIIL();
        ConcurrentHashSet concurrentHashSet = this.LLLLLIL;
        C690870R8b c690870R8b = new C690870R8b();
        c690870R8b.LIZ = LLLIIL();
        c690870R8b.LIZIZ = "cell_landscape";
        C0RF0 c0rf0 = this.LLJILJILJ;
        c690870R8b.LIZLLL = c0rf0;
        c690870R8b.LJ = c0rf0.LJ;
        c690870R8b.LJI = aFwS198S0000000_11;
        C723850SaN.LJ(this, new C0RA2(this, new C690430R6j(c690870R8b)));
        System.identityHashCode(this);
        LandscapeCellAssem landscapeCellAssem2 = new LandscapeCellAssem(baseFeedPageParams, aFwS198S0000000_11, iLLLIIL, concurrentHashSet);
        this.LLLLLILLIL = landscapeCellAssem2;
        return landscapeCellAssem2;
    }

    public final void LLLLIILLL() {
        BaseFeedPageParams baseFeedPageParams = this.LLLLLLZ;
        if (baseFeedPageParams == null) {
            baseFeedPageParams = null;
        }
        if (baseFeedPageParams.isPlayListCleanMode()) {
            return;
        }
        C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
        this.LLLIIL.LJIIJ(this.LLJJ);
        C705920RmY c705920RmY = this.LLLIIL;
        c705920RmY.LJFF = c0n0yLJLJJI;
        c705920RmY.LIZJ();
        C705920RmY c705920RmY2 = this.LLLIIL;
        Aweme aweme = this.LLJJ;
        c705920RmY2.LJII(aweme != null ? aweme.getAid() : null);
    }

    public final void LLLLILI() {
        this.LLLLL.removeCallbacksAndMessages(null);
    }

    public final void LLLLJI() {
        for (View view : this.LLLLLLZZ) {
            if (view != null) {
                C786410Ut5.LJLLLLLL(4, view);
            }
        }
        LLLLZIL(C0RQD.IS_CLEAN);
        ImageView imageView = this.LLLLILI;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        LLLIZZ(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final C584270Mvp LLLLLJIL() {
        boolean z = C2549509yv.LIZ;
        return new C584270Mvp(C2549509yv.LIZ);
    }

    public final boolean LLLLLLLLL() {
        if (this.LLLIL) {
            return true;
        }
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        return C586380MzE.LIZ().LIZLLL;
    }

    public final void LLLLZ() {
        RelativeLayout relativeLayout;
        LandscapeProfilePanelAbility landscapeProfilePanelAbility = (LandscapeProfilePanelAbility) this.LLLLLLJ.getValue();
        if (landscapeProfilePanelAbility != null && landscapeProfilePanelAbility.LJJII()) {
            LLLLJI();
            return;
        }
        if (!C692480REg.LIZ()) {
            LLLLILI();
            for (View view : this.LLLLLLZZ) {
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                    C786410Ut5.T4(view, 0.99f);
                }
            }
            LLLLZIL(C0RQD.IS_NOT_CLEAN);
            return;
        }
        LLLLILI();
        for (View view2 : this.LLLLLLZZ) {
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(4, view2);
                C786410Ut5.T4(view2, 0.99f);
            }
        }
        ImageView imageView = this.LLLLILI;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        LLLLZIL(C0RQD.IS_LANDSCAPE_CLEAN);
        RelativeLayout relativeLayout2 = this.LLJJJJLIIL;
        if (relativeLayout2 != null) {
            C786410Ut5.LLIIL(relativeLayout2, 0);
        }
        View view3 = this.LLJLL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        LinearLayout linearLayout = this.LLL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        RelativeLayout relativeLayout3 = this.LLJJL;
        if (relativeLayout3 != null) {
            C786410Ut5.LLIIL(relativeLayout3, 8);
        }
        if (!C692760RFi.LIZ || (relativeLayout = this.LLLF) == null) {
            return;
        }
        C786410Ut5.LLIIL(relativeLayout, 8);
    }

    @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
    public final InterfaceC0241006d Mb0() {
        return C161N.LIZIZ.LJJIJIIJIL(new WeakReference<>(this.LLLII), this.LLJJ, this.LLJILJILJ.LJIIIZ);
    }

    @Override // X.C0SZ8
    public final int getAwemeType() {
        Aweme aweme = this.LLJJ;
        if (aweme != null) {
            return aweme.getAwemeType();
        }
        return 0;
    }

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        if (lt2(C00I7.class)) {
            return C161N.LIZIZ.LJJIJIIJIL(new WeakReference<>(this.LLLII), this.LLJJ, this.LLJILJILJ.LJIIIZ);
        }
        return null;
    }

    @Override // X.InterfaceC583650Mup
    public final Surface getSurface() {
        BaseFeedPlayerView baseFeedPlayerViewLIZ = this.LLJJLIIIJLLLLLLLZ;
        if (baseFeedPlayerViewLIZ == null) {
            C0RF0 c0rf0 = this.LLJILJILJ;
            ViewGroup viewGroup = this.LLLFZ;
            if (viewGroup == null) {
                viewGroup = (ViewGroup) C520680KbS.LIZ(R.id.player_view, c0rf0.LIZ);
            }
            baseFeedPlayerViewLIZ = C691080R8w.LIZ(viewGroup, c0rf0);
        }
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            this.LLJJLIIIJLLLLLLLZ = baseFeedPlayerViewLIZ;
        }
        return baseFeedPlayerViewLIZ.getSurface();
    }

    @Override // X.InterfaceC583650Mup
    public final View getVideoView() {
        BaseFeedPlayerView baseFeedPlayerView = this.LLJJLIIIJLLLLLLLZ;
        if (baseFeedPlayerView != null) {
            return baseFeedPlayerView.getVideoView();
        }
        return null;
    }

    @Override // X.InterfaceC739930T0t
    public final void no() {
        AbsInteractStickerWidget absInteractStickerWidget = this.LLLIIL.LJIIJJI;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.LIZ();
        }
    }

    @Override // X.C0SZ8
    public void onDestroyView() {
        AbsInteractStickerWidget absInteractStickerWidget = this.LLLIIL.LJIIJJI;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.onDestroyView();
        }
        C692720RFe c692720RFe = this.LLLLLJIL;
        if (c692720RFe != null) {
            c692720RFe.onDestroy();
        }
    }

    @Override // X.C0SZ8
    public final void onResume() {
        BaseFeedPlayerView baseFeedPlayerView = this.LLJJLIIIJLLLLLLLZ;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.jj(true);
        }
    }

    @Override // X.InterfaceC583650Mup
    public final ViewGroup zt1() {
        BaseFeedPlayerView baseFeedPlayerView = this.LLJJLIIIJLLLLLLLZ;
        if (baseFeedPlayerView != null) {
            return baseFeedPlayerView.zt1();
        }
        return null;
    }

    @Override // X.InterfaceC739930T0t
    public final void LJJLL() {
        VideoShareViewModel videoShareViewModelLIZLLL = C0RLJ.LIZLLL(this);
        if (videoShareViewModelLIZLLL != null) {
            videoShareViewModelLIZLLL.LLILLL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC739930T0t
    public final boolean LJLJJLL() {
        VideoShareViewModel videoShareViewModelLIZLLL = C0RLJ.LIZLLL(this);
        if (videoShareViewModelLIZLLL != null) {
            return videoShareViewModelLIZLLL.LLILLL;
        }
        return false;
    }

    @Override // X.InterfaceC386401eo
    public final long LLL() {
        return C1483410ohn.LJLJJI().getCurrentPosition();
    }

    public final boolean LLLLLLZZ() {
        return C1483410ohn.LJLJJI().isPlaying();
    }

    public final void LLLLLZ() {
        LLLLILI();
        C786410Ut5.LJLIIL(3000L, this.LLLLL, new ARunnableS111S0100000_11(this, 128));
    }

    @Override // X.C0R9I
    public final AbsInteractStickerWidget c6() {
        InteractStickerWidget interactStickerWidgetLIZ = ((IStickerService) ServiceManager.get().getService(IStickerService.class)).LIZ();
        interactStickerWidgetLIZ.LLJIJIL = this;
        interactStickerWidgetLIZ.LLJJJIL = "FEED";
        WidgetManager widgetManager = this.LLLLLLLZIL;
        if (widgetManager == null) {
            widgetManager = null;
        }
        widgetManager.PR(R.id.kvf, interactStickerWidgetLIZ);
        return interactStickerWidgetLIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final boolean o1() {
        if (C692480REg.LIZ()) {
            return this.LLLIIIL;
        }
        return false;
    }

    @Override // X.C0SZ8
    public final void onPause() {
        no();
        DataCenter dataCenter = this.LLLILZ;
        if (dataCenter == null) {
            dataCenter = null;
        }
        dataCenter.zQ2(null, "video_on_pause");
        BaseFeedPlayerView baseFeedPlayerView = this.LLJJLIIIJLLLLLLLZ;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPagePause();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final boolean LLLLLLIL() {
        return this.LLLIIIIL;
    }

    @Override // X.C0SZ8
    public final Aweme getAweme() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC739930T0t
    public final View getRootView() {
        return this.LLLFF;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final Aweme hm() {
        return this.LLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void unBind() {
        wY0();
    }

    public LandscapeVideoViewCell(C0RF0 c0rf0) {
        super(c0rf0);
        this.LLLI = new C692850RFr();
        this.LLLIIIL = true;
        this.LLLIIL = new C705920RmY(this);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LandscapeCellCleanModeViewModel.class);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(179);
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        this.LLLJ = C737910Sx3.LIZLLL(this, c19719912DlLIZ, aFwS243S0000000_11, enumC452301pR);
        this.LLLLL = new BPEAHandler(Looper.getMainLooper());
        this.LLLLLIL = new ConcurrentHashSet();
        this.LLLLLJLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 387));
        this.LLLLLL = C737910Sx3.LIZLLL(this, C13LE.LIZ(LandscapeClearScreenViewModel.class), AFwS243S0000000_11.get$arr$(180), enumC452301pR);
        this.LLLLLLIL = C0RQB.AUTO_PLAY_NEXT.getValue() | C0RQB.SHOW_INTRO.getValue() | C0RQB.DANMAKU_FOCUSABLE.getValue();
        this.LLLLLLJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 386));
        this.LLLLLLL = new BPEAHandler(Looper.getMainLooper());
        this.LLLLLLLLL = new ARunnableS111S0100000_11(this, 33);
        this.LLLLLLZZ = new LinkedHashSet();
        View view = c0rf0.LIZ;
        this.LLLILZJ = view;
        this.LLLFZ = (FrameLayout) C520680KbS.LIZ(R.id.player_view, view == null ? null : view);
        View view2 = this.LLLILZJ;
        RelativeLayout relativeLayout = (RelativeLayout) C520680KbS.LIZ(R.id.widget_container, view2 == null ? null : view2);
        if (relativeLayout != null) {
            C786410Ut5.Y4(relativeLayout, 0.99f);
        } else {
            relativeLayout = null;
        }
        this.LLJJJJLIIL = relativeLayout;
        View view3 = this.LLLILZJ;
        this.LLLFFI = (C0SUL) C520680KbS.LIZ(R.id.long_press_layout, view3 == null ? null : view3);
        this.LLLIZZ = C0R89.LIZ(this);
        this.LLLILZLLLI = C680890QnH.LIZ(this);
        ViewGroup viewGroup = this.LLLFZ;
        BaseFeedPlayerView baseFeedPlayerViewLIZ = C691080R8w.LIZ(viewGroup == null ? (ViewGroup) C520680KbS.LIZ(R.id.player_view, c0rf0.LIZ) : viewGroup, c0rf0);
        this.LLJJLIIIJLLLLLLLZ = baseFeedPlayerViewLIZ;
        baseFeedPlayerViewLIZ.Dn(this);
        Fragment fragment = c0rf0.LIZJ;
        this.LLJJIII = fragment;
        if (fragment != null) {
            this.LLLILZ = DataCenter.vQ2(C712430Rx3.LIZIZ(fragment, this), fragment);
        }
        this.LLLIIII = c0rf0.LIZIZ;
        BaseFeedPageParams baseFeedPageParams = c0rf0.LJ;
        this.LLLLLLZ = baseFeedPageParams;
        baseFeedPageParams = baseFeedPageParams == null ? null : baseFeedPageParams;
        Fragment fragment2 = this.LLJJIII;
        DataCenter dataCenter = this.LLLILZ;
        dataCenter = dataCenter == null ? null : dataCenter;
        if (baseFeedPageParams != null && fragment2 != null && dataCenter != null) {
            this.LLJILLL = VideoItemParams.newBuilder(baseFeedPageParams, null, this, fragment2, "click", dataCenter, this, this);
        }
        C722660SWi.LIZJ(new ARunnableS80S0200000_11(this, c0rf0, 9));
        this.LLLLLZIL = 1.0f;
    }

    public static void LLLLZLL(View view) {
        if (!C692450REd.LIZ) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
        C786410Ut5.W5(view, marginLayoutParams);
    }

    @Override // X.InterfaceC583650Mup
    public final void Ai1(boolean z) {
        BaseFeedPlayerView baseFeedPlayerView;
        InterfaceC1482650ogZ surfaceHolder;
        BaseFeedPlayerView baseFeedPlayerView2;
        InterfaceC1482650ogZ surfaceHolder2;
        if (z) {
            BaseFeedPlayerView baseFeedPlayerView3 = this.LLJJLIIIJLLLLLLLZ;
            if (baseFeedPlayerView3 != null && baseFeedPlayerView3.getSurfaceHolder() != null && (baseFeedPlayerView2 = this.LLJJLIIIJLLLLLLLZ) != null && (surfaceHolder2 = baseFeedPlayerView2.getSurfaceHolder()) != null) {
                surfaceHolder2.LIZ();
                return;
            }
            return;
        }
        BaseFeedPlayerView baseFeedPlayerView4 = this.LLJJLIIIJLLLLLLLZ;
        if (baseFeedPlayerView4 == null || baseFeedPlayerView4.getSurfaceHolder() == null || (baseFeedPlayerView = this.LLJJLIIIJLLLLLLLZ) == null || (surfaceHolder = baseFeedPlayerView.getSurfaceHolder()) == null) {
            return;
        }
        surfaceHolder.LJFF();
    }

    @Override // X.C0SZ8
    public final void Ar(Aweme aweme) {
        VideoViewModel videoViewModel;
        if (this.LLLII != null && (videoViewModel = this.LLLILZLLLI) != null) {
            videoViewModel.yQ2(aweme);
        }
    }

    @Override // X.C0RDR
    public final void Ft2(InterfaceC690460R6m interfaceC690460R6m) {
        C0SUL c0sul = this.LLLFFI;
        if (c0sul != null) {
            c0sul.setListener(interfaceC690460R6m);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    @Override // X.C0SZ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(boolean r7) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell.LJIIZILJ(boolean):void");
    }

    @Override // X.C0SZ8
    public final void LJJIFFI(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction2;
        if (z && LLLLLLLLL()) {
            for (View view : this.LLLLLLZZ) {
                if (view != null && (viewPropertyAnimatorAnimate2 = view.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(0.99f)) != null && (duration2 = viewPropertyAnimatorAlpha2.setDuration(200L)) != null && (viewPropertyAnimatorWithStartAction2 = duration2.withStartAction(new ARunnableS111S0100000_11(view, 34))) != null) {
                    viewPropertyAnimatorWithStartAction2.start();
                }
            }
            LLLIZZ(false);
            return;
        }
        LLLIZZ(z);
        View viewLIZ = null;
        if (z) {
            if (!this.LLLIIIIL) {
                LandscapeFeedDanmakuPresentAbility landscapeFeedDanmakuPresentAbility = (LandscapeFeedDanmakuPresentAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedDanmakuPresentAbility.class, null);
                if (landscapeFeedDanmakuPresentAbility != null) {
                    landscapeFeedDanmakuPresentAbility.setFocusable(true);
                }
                for (View view2 : this.LLLLLLZZ) {
                    if (view2 != null && (!Intrinsics.LJFF(view2, this.LLLJIL) || !this.LLLIILIL)) {
                        view2.animate().alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS111S0100000_11(view2, 35)).start();
                    }
                }
                LandscapeAutoRotationTipsAbility landscapeAutoRotationTipsAbility = (LandscapeAutoRotationTipsAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeAutoRotationTipsAbility.class, null);
                if (landscapeAutoRotationTipsAbility != null) {
                    landscapeAutoRotationTipsAbility.NM0();
                }
                RelativeLayout relativeLayout = this.LLJJJJLIIL;
                if (relativeLayout != null) {
                    HandlerHook.viewPostDelay(relativeLayout, new ARunnableS111S0100000_11(this, 36), 200L);
                }
                LLLLZIL(C0RQD.IS_CLEAN);
                return;
            }
            return;
        }
        if (this.LLLIIIIL || this.LLLIIIL) {
            LandscapeFeedDanmakuPresentAbility landscapeFeedDanmakuPresentAbility2 = (LandscapeFeedDanmakuPresentAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeFeedDanmakuPresentAbility.class, null);
            if (landscapeFeedDanmakuPresentAbility2 != null) {
                landscapeFeedDanmakuPresentAbility2.setFocusable(false);
            }
            RelativeLayout relativeLayout2 = this.LLJJJJLIIL;
            if (relativeLayout2 != null) {
                C786410Ut5.LLIIL(relativeLayout2, 0);
            }
            for (View view3 : this.LLLLLLZZ) {
                if (view3 != null && (viewPropertyAnimatorAnimate = view3.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.99f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(200L)) != null && (viewPropertyAnimatorWithStartAction = duration.withStartAction(new ARunnableS111S0100000_11(view3, 37))) != null) {
                    viewPropertyAnimatorWithStartAction.start();
                }
            }
            LandscapeAutoRotationTipsAbility landscapeAutoRotationTipsAbility2 = (LandscapeAutoRotationTipsAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapeAutoRotationTipsAbility.class, null);
            if (landscapeAutoRotationTipsAbility2 != null) {
                RelativeLayout relativeLayout3 = this.LLJJL;
                if (relativeLayout3 != null) {
                    viewLIZ = C520680KbS.LIZ(R.id.uz4, relativeLayout3);
                }
                landscapeAutoRotationTipsAbility2.T50(viewLIZ);
            }
            LLLLZIL(C0RQD.IS_NOT_CLEAN);
            LLLLLZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public void LJJIJIIJIL(int i) {
        SmartImageView smartImageView = this.LLLLJ;
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
        }
        C692720RFe c692720RFe = this.LLLLLJIL;
        if (c692720RFe != null) {
            c692720RFe.LIZIZ();
        }
        FrameLayout frameLayout = this.LLLFZ;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        this.LLLI.LIZIZ(this.LLLII, this.LLJJ, this.LLLFZ, getVideoView(), this.LLLLJ);
        VideoViewModel videoViewModel = this.LLLILZLLLI;
        if (videoViewModel != null) {
            videoViewModel.BQ2(i, null);
        }
        LLLLZ();
        C786410Ut5.LJLIIL(3000L, this.LLLLL, new ARunnableS111S0100000_11(this, 128));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SIV
    public final void LJLJI(boolean z) {
        View childAt;
        int i;
        int i2;
        View view = this.LLJL;
        int i3 = 8;
        if (view != null) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
        View view2 = this.LLJLL;
        if (view2 != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        ViewGroup viewGroup = this.LLJLIL;
        if (viewGroup != null && viewGroup.getChildCount() > 0 && (childAt = viewGroup.getChildAt(0)) != null) {
            if (z) {
                i3 = 0;
            }
            C786410Ut5.LJLLLLLL(i3, childAt);
        }
        LLLLLZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.InterfaceC739930T0t
    public final void LJLJJI(C2189821An6 c2189821An6) {
        DataCenter dataCenter = this.LLLILZ;
        if (dataCenter == null) {
            dataCenter = null;
        }
        dataCenter.zQ2(null, "video_show_share_guide_animation");
        VideoShareViewModel videoShareViewModelLIZLLL = C0RLJ.LIZLLL(this);
        if (videoShareViewModelLIZLLL != null) {
            videoShareViewModelLIZLLL.RQ2();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLIIIJ(C0SYH c0syh) {
        if (C692480REg.LIZ()) {
            boolean z = true;
            if (c0syh.LIZ != 1) {
                z = false;
            }
            LandscapePanelStateNotificationAbility landscapePanelStateNotificationAbility = (LandscapePanelStateNotificationAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), LandscapePanelStateNotificationAbility.class, null);
            if (landscapePanelStateNotificationAbility != null) {
                landscapePanelStateNotificationAbility.tq1(this.LLLLLLIL, z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLJJIJIIJIL(String str) {
        VideoItemParams videoItemParams = this.LLJILLL;
        if (videoItemParams != null) {
            videoItemParams.adapterType = str;
        }
    }

    public final void LLLIZZ(boolean z) {
        int i;
        if (z) {
            i = 32;
        } else {
            i = 98;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        FrameLayout frameLayout = this.LLLFF;
        if (frameLayout != null) {
            C705920RmY c705920RmY = this.LLLIIL;
            int height = frameLayout.getHeight();
            InteractStickerViewModel interactStickerViewModel = c705920RmY.LJIIIIZZ;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.wQ2(new Pair(Integer.valueOf(iLIZIZ), Integer.valueOf(height)), "interact_sticker_update_intro_layout_y");
            }
        }
        FrameLayout frameLayout2 = this.LLJLLIL;
        if (frameLayout2 != null) {
            C426750GoL.LJIIIZ(frameLayout2, 0, 0, 0, Integer.valueOf(iLIZIZ), false, 16);
        }
        FrameLayout frameLayout3 = this.LLJLLL;
        if (frameLayout3 != null) {
            C426750GoL.LJIIIZ(frameLayout3, 0, 0, 0, Integer.valueOf(iLIZIZ), false, 16);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLLLLLJ(boolean z) {
        if (z) {
            LLLLILI();
            LJJIFFI(false);
        } else {
            LLLLLZ();
        }
        this.LLLIL = z;
    }

    public final void LLLLLLL(String str) {
        String authorUid;
        String aid;
        C19EG activity;
        String aid2;
        LandscapeProfilePanelAbility landscapeProfilePanelAbility;
        LandscapeProfilePanelAbility landscapeProfilePanelAbility2;
        C2189821An6 c2189821An6;
        C0RJN c0rjnLIZIZ;
        boolean z = C305460ByC.LIZ;
        String str2 = "";
        String authorUid2 = null;
        if (z && (landscapeProfilePanelAbility = (LandscapeProfilePanelAbility) this.LLLLLLJ.getValue()) != null && !landscapeProfilePanelAbility.LJJII()) {
            LJJIFFI(true);
            VideoItemParams videoItemParams = this.LLJILLL;
            if (videoItemParams != null && (landscapeProfilePanelAbility2 = (LandscapeProfilePanelAbility) this.LLLLLLJ.getValue()) != null) {
                Fragment fragment = this.LLJJIII;
                if (fragment != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment)) != null) {
                    c2189821An6 = c0rjnLIZIZ.LIZJ;
                } else {
                    c2189821An6 = null;
                }
                landscapeProfilePanelAbility2.Qj0(videoItemParams, c2189821An6);
            }
        } else {
            if (Intrinsics.LJFF(str, "click_view_all")) {
                C735410St1 c735410St1 = new C735410St1();
                c735410St1.LJJIJLIJ(this.LLJILJILJ.LJIIJ, this.LLJJ);
                String str3 = this.LLJILJILJ.LJIIIZ;
                if (str3 == null) {
                    str3 = "";
                }
                c735410St1.LIZLLL = str3;
                c735410St1.LJJIJL(this.LLLII);
                c735410St1.LJJLIIIJILLIZJL = "click_view_all";
                C0SXF.LJIIIIZZ(c735410St1, this.LLJJ, this.LLLII, false);
                C0SXF.LIZJ(c735410St1, this.LLJILJILJ.LJIIIZ, this.LLJJ, null);
                C0SXF.LJIILIIL(c735410St1, this.LLJJ, this.LLLII);
                c735410St1.LJFF("enter_method_landscape", "click_view_all", InterfaceC1210900hcG.LIZ);
                c735410St1.LJIILJJIL();
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getActivity(), "aweme://user/profile/");
            Aweme aweme = this.LLJJ;
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            smartRouteBuildRoute.withParam("uid", authorUid);
            smartRouteBuildRoute.withParam("enter_from", this.LLJILJILJ.LJIIIZ);
            Aweme aweme2 = this.LLJJ;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            smartRouteBuildRoute.withParam("video_id", aid);
            smartRouteBuildRoute.withParam("extra_from_pre_page", "notification_page");
            smartRouteBuildRoute.open();
            if (!z && (activity = getActivity()) != null) {
                activity.finish();
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str4 = this.LLJILJILJ.LJIIIZ;
        if (str4 != null) {
            str2 = str4;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        Aweme aweme3 = this.LLJJ;
        if (aweme3 != null) {
            aid2 = aweme3.getAid();
        } else {
            aid2 = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid2);
        Aweme aweme4 = this.LLJJ;
        if (aweme4 != null) {
            authorUid2 = AwemeExtKt.getAuthorUid(aweme4);
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid2);
        C0SXF.LJ(c2344009Gk, this.LLJJ, this.LLJILJILJ.LJIIIZ);
        C0SXF.LJIIIZ(c2344009Gk, this.LLJJ, this.LLLII, null, Boolean.FALSE);
        C20684815ws.LJIILLIIL("click_author_landscape_screen", c2344009Gk.LIZ);
    }

    public final void LLLLZI(Aweme aweme) {
        C19EG activity;
        C726690Sex.LIZIZ.LJ(System.identityHashCode(this), aweme.getAid());
        this.LLJJ = aweme;
        C692720RFe c692720RFe = this.LLLLLJIL;
        if (c692720RFe != null) {
            c692720RFe.LJLJJI(aweme);
        }
        VideoItemParams videoItemParams = this.LLJILLL;
        if (videoItemParams != null) {
            videoItemParams.setAweme(aweme);
        }
        if (this.LLLLZ) {
            C689910R4j.LIZ.LIZ(new RunnableC686980Qx6(new ARunnableS80S0200000_11(this, aweme, 10)));
        } else {
            VideoItemParams videoItemParams2 = this.LLJILLL;
            if (videoItemParams2 != null) {
                videoItemParams2.setwidgetAweme(aweme);
            }
        }
        if (AwemeExtKt.isPhotoMode(aweme) && ((Number) C0BXH.LIZ.getValue()).intValue() == 3 && (activity = getActivity()) != null) {
            C1EE2.LIZIZ.LJLIL(activity);
        }
        C584470Mw9.LJIIJ(C1481060oe0.LIZLLL, aweme);
    }

    public final void LLLLZIL(C0RQD c0rqd) {
        C0RQD c0rqd2 = C0RQD.IS_NOT_CLEAN;
        if (c0rqd == c0rqd2) {
            this.LLLIIIIL = false;
            this.LLLIIIL = false;
            AssemViewModel assemViewModel = (AssemViewModel) this.LLLLLL.getValue();
            assemViewModel.getClass();
            assemViewModel.setState(new AwS590S0100000_11(c0rqd2, 60));
            return;
        }
        C0RQD c0rqd3 = C0RQD.IS_LANDSCAPE_CLEAN;
        if (c0rqd == c0rqd3) {
            this.LLLIIIL = true;
            this.LLLIIIIL = false;
            AssemViewModel assemViewModel2 = (AssemViewModel) this.LLLLLL.getValue();
            assemViewModel2.getClass();
            assemViewModel2.setState(new AwS590S0100000_11(c0rqd3, 60));
            return;
        }
        this.LLLIIIL = false;
        this.LLLIIIIL = true;
        AssemViewModel assemViewModel3 = (AssemViewModel) this.LLLLLL.getValue();
        C0RQD c0rqd4 = C0RQD.IS_CLEAN;
        assemViewModel3.getClass();
        assemViewModel3.setState(new AwS590S0100000_11(c0rqd4, 60));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLLZLZ(Map map) {
        String aid;
        if (this.LLJJ != null && !map.isEmpty()) {
            int size = map.size();
            for (int i = 0; i < size; i++) {
                Aweme aweme = this.LLJJ;
                if (aweme == null || (aid = aweme.getAid()) == null) {
                    aid = "";
                }
                if (map.get(aid) != null) {
                    DataCenter dataCenter = this.LLLILZ;
                    if (dataCenter == null) {
                        dataCenter = null;
                    }
                    dataCenter.zQ2(this.LLJILLL, "awesome_update_backup_data");
                    VideoViewModel videoViewModel = this.LLLILZLLLI;
                    if (videoViewModel != null) {
                        videoViewModel.setState(new AwS590S0100000_11(this.LLJILLL, 489));
                    }
                }
            }
            return;
        }
        C2344809Gs.LJI(new IllegalArgumentException("list is empty,should never happen!"));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void M(C0REZ c0rez) {
        this.LLLLLIL.add(c0rez);
    }

    @Override // X.C0RDR
    public final void Qi1(Video video) {
        SmartImageView smartImageView = this.LLLLJ;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(video.getOriginCover()));
        c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
        c1331670kl3LJIIIIZZ.LIZLLL("landscape_cell");
        c1331670kl3LJIIIIZZ.LJJ(this.LLLLJ);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
    }

    @Override // X.C0SZ8
    public void h(boolean z) {
        String aid;
        G();
        FrameLayout frameLayout = this.LLLFZ;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        View videoView = getVideoView();
        if (videoView != null) {
            C786410Ut5.LJLLLLLL(8, videoView);
        }
        DataCenter dataCenter = this.LLLILZ;
        String aid2 = null;
        if (dataCenter == null) {
            dataCenter = null;
        }
        dataCenter.zQ2(Boolean.TRUE, "on_page_unselected");
        Aweme aweme = this.LLJJ;
        if (aweme != null) {
            aweme.getAid();
        }
        C1440005kM.LIZ(new C690180R5k());
        VideoViewModel videoViewModel = this.LLLILZLLLI;
        if (videoViewModel != null) {
            Aweme aweme2 = this.LLJJ;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            videoViewModel.CQ2(aid, z);
        }
        FeedInteractionAreaContainer feedInteractionAreaContainerLLLIILIL = LLLIILIL();
        Aweme aweme3 = this.LLJJ;
        if (aweme3 != null) {
            aweme3.getAid();
        }
        feedInteractionAreaContainerLLLIILIL.lp();
        C705920RmY c705920RmY = this.LLLIIL;
        Aweme aweme4 = this.LLJJ;
        if (aweme4 != null) {
            aid2 = aweme4.getAid();
        }
        c705920RmY.LJIIIIZZ(aid2);
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        C586380MzE.LIZ().LIZJ(this.LLJILJILJ.LJIIIZ);
        LLLLZ();
    }

    @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
    public final boolean lt2(Class<? extends InterfaceC0241006d> cls) {
        return Intrinsics.LJFF(cls, C00I7.class);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String noticeTypeForComment;
        LandscapeFeedFragment landscapeFeedFragment;
        LandscapeFragmentPanel landscapeFragmentPanel;
        C2189821An6 c2189821An6;
        LandscapeFeedFragment landscapeFeedFragment2;
        LandscapeFragmentPanel landscapeFragmentPanel2;
        C2189821An6 c2189821An62;
        String uid;
        boolean z;
        String noticeTypeForComment2;
        LandscapeFeedFragment landscapeFeedFragment3;
        LandscapeFragmentPanel landscapeFragmentPanel3;
        C2189821An6 c2189821An63;
        LandscapeFeedFragment landscapeFeedFragment4;
        LandscapeFragmentPanel landscapeFragmentPanel4;
        C2189821An6 c2189821An64;
        String uid2;
        long diggCount;
        C0RD4 c0rd42 = c0rd4;
        String str = c0rd42.LIZ;
        String str2 = "";
        boolean z2 = false;
        Object obj = null;
        Object obj2 = null;
        noticeIdForComment = null;
        noticeIdForComment = null;
        noticeIdForComment = null;
        String noticeIdForComment = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        noticeIdForComment = null;
        noticeIdForComment = null;
        noticeIdForComment = null;
        String noticeIdForComment2 = null;
        switch (str.hashCode()) {
            case -1935883927:
                if (!str.equals("video_favorite_click")) {
                    return;
                }
                LLLLLZ();
                return;
            case -1618328215:
                if (!str.equals("video_digg")) {
                    return;
                }
                Aweme aweme = this.LLJJ;
                if (aweme != null) {
                    String aid = aweme.getAid();
                    AwemeStatistics statistics = aweme.getStatistics();
                    if (statistics != null) {
                        diggCount = statistics.getDiggCount();
                    } else {
                        diggCount = 0;
                    }
                    C1440005kM.LIZ(new C730120SkU(aid, diggCount, aweme.getUserDigg(), EnumC730430Skz.LIST));
                }
                LLLLLZ();
                return;
            case -1410821767:
                if (!str.equals("video_on_pause_play")) {
                    return;
                }
                break;
            case -591633993:
                if (!str.equals("click_land_scape_see_more")) {
                    return;
                }
                LLLLLZ();
                return;
            case -492284990:
                if (!str.equals("video_comment_list")) {
                    return;
                }
                C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(395));
                Aweme aweme2 = this.LLJJ;
                if (aweme2 != null) {
                    C1349800lEI c1349800lEI = new C1349800lEI(aweme2.getAid());
                    User author = aweme2.getAuthor();
                    if (author != null && (uid2 = author.getUid()) != null) {
                        str2 = uid2;
                    }
                    c1349800lEI.setAuthorUid(str2);
                    c1349800lEI.setForceHideBatchManagementView(true);
                    c1349800lEI.setShowTitle(true);
                    c1349800lEI.setOrientationMode(1);
                    c1349800lEI.setEventType(this.LLJILJILJ.LJIIIZ);
                    c1349800lEI.setEnableComment(!aweme2.isCmtSwt());
                    c1349800lEI.setAdCommentStruct(AwemeExtKt.getAdCommentStruct(aweme2));
                    c1349800lEI.setCommentClose(((CommentService) c01gwLIZIZ.getValue()).LJIILLIIL(aweme2));
                    if (((CommentService) c01gwLIZIZ.getValue()).LJIILLIIL(aweme2) && !((CommentService) c01gwLIZIZ.getValue()).LJJIJIIJIL(aweme2)) {
                        z2 = true;
                    }
                    c1349800lEI.setCommentLimited(z2);
                    c1349800lEI.setEnterMethod("click_comment_icon");
                    Fragment fragment = this.LLJJIII;
                    if ((fragment instanceof LandscapeFeedFragment) && (landscapeFeedFragment4 = (LandscapeFeedFragment) fragment) != null && (landscapeFragmentPanel4 = landscapeFeedFragment4.LL) != null && (c2189821An64 = landscapeFragmentPanel4.LLJI) != null) {
                        noticeTypeForComment2 = c2189821An64.getNoticeTypeForComment();
                    } else {
                        noticeTypeForComment2 = null;
                    }
                    c1349800lEI.setAccountType(noticeTypeForComment2);
                    Fragment fragment2 = this.LLJJIII;
                    if ((fragment2 instanceof LandscapeFeedFragment) && (landscapeFeedFragment3 = (LandscapeFeedFragment) fragment2) != null && (landscapeFragmentPanel3 = landscapeFeedFragment3.LL) != null && (c2189821An63 = landscapeFragmentPanel3.LLJI) != null) {
                        noticeIdForComment = c2189821An63.getNoticeIdForComment();
                    }
                    c1349800lEI.setNoticeId(noticeIdForComment);
                    c1349800lEI.setLocatePageType(1);
                    ((CommentService) c01gwLIZIZ.getValue()).LJJL(getActivity(), this.LLJJIII, aweme2, c1349800lEI);
                }
                LJJIFFI(true);
                return;
            case -162745511:
                if (!str.equals("feed_internal_event")) {
                    return;
                }
                C0HTT<C737030Svd> c0htt = this.LLLIIII;
                if (c0htt != 0) {
                    Object obj7 = c0rd42.LIZIZ;
                    if (obj7 != null) {
                        obj3 = obj7;
                    }
                    c0htt.LLIIL(obj3);
                }
                LLLLLZ();
                return;
            case -144973899:
                if (!str.equals("title_view_click")) {
                    return;
                }
                Object obj8 = c0rd42.LIZIZ;
                if (obj8 != null) {
                    obj4 = obj8;
                }
                LLLLLLL((String) obj4);
                return;
            case 102775646:
                if (!str.equals("landscape_danmaku_interaction")) {
                    return;
                }
                LLLLLZ();
                return;
            case 578788135:
                if (!str.equals("enter_play_mode")) {
                    return;
                }
                Object obj9 = c0rd42.LIZIZ;
                if (obj9 != null) {
                    obj5 = obj9;
                }
                LJJIFFI(((Boolean) obj5).booleanValue());
                return;
            case 1150830693:
                if (!str.equals("video_comment_preload")) {
                    return;
                }
                C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(397));
                Aweme aweme3 = this.LLJJ;
                if (aweme3 == null) {
                    return;
                }
                CommentService commentService = (CommentService) c01gwLIZIZ2.getValue();
                C19EG activity = getActivity();
                Fragment fragment3 = this.LLJJIII;
                C0RF0 c0rf0 = this.LLJILJILJ;
                String strLIZ = C735610StL.LIZ(c0rf0.LJIIJ, c0rf0.LJIIIZ, true);
                String str3 = this.LLJILJILJ.LJIIIZ;
                Object obj10 = c0rd42.LIZIZ;
                if (obj10 != null) {
                    obj6 = obj10;
                }
                Integer num = (Integer) obj6;
                if (num != null && num.intValue() == 95) {
                    z = true;
                } else {
                    z = false;
                }
                commentService.LJJLIIIIJ(activity, fragment3, aweme3, 300000, strLIZ, str3, true, z);
                ((CommentService) c01gwLIZIZ2.getValue()).LJJIJIL(getActivity(), this.LLJJIII, aweme3, true);
                return;
            case 1181771620:
                if (!str.equals("video_share_click")) {
                    return;
                }
                Aweme aweme4 = this.LLJJ;
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("event_type", this.LLJILJILJ.LJIIIZ, bundle);
                bundle.putBoolean("is_portrait", false);
                if (getActivity() != null && this.LLJJIII != null && aweme4 != null) {
                    ShareService shareService = C621180OYa.LIZ;
                    C19EG activity2 = getActivity();
                    Fragment fragment4 = this.LLJJIII;
                    shareService.LJJLIIJ(activity2, fragment4, aweme4, ((LandscapeFeedFragment) fragment4).LL, bundle);
                }
                LJJIFFI(true);
                ((LandscapeFeedFragment) this.LLJJIII).LL.LJJJJJL(new C737030Svd(3));
                return;
            case 1423570719:
                if (!str.equals("video_comment_list_from_keyboard")) {
                    return;
                }
                C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(396));
                Aweme aweme5 = this.LLJJ;
                if (aweme5 != null) {
                    C1349800lEI c1349800lEI2 = new C1349800lEI(aweme5.getAid());
                    User author2 = aweme5.getAuthor();
                    if (author2 != null && (uid = author2.getUid()) != null) {
                        str2 = uid;
                    }
                    c1349800lEI2.setAuthorUid(str2);
                    c1349800lEI2.setForceHideBatchManagementView(true);
                    c1349800lEI2.setShowTitle(true);
                    c1349800lEI2.setOrientationMode(1);
                    c1349800lEI2.setEventType(this.LLJILJILJ.LJIIIZ);
                    c1349800lEI2.setEnableComment(!aweme5.isCmtSwt());
                    c1349800lEI2.setAdCommentStruct(AwemeExtKt.getAdCommentStruct(aweme5));
                    c1349800lEI2.setCommentClose(((CommentService) c01gwLIZIZ3.getValue()).LJIILLIIL(aweme5));
                    if (((CommentService) c01gwLIZIZ3.getValue()).LJIILLIIL(aweme5) && !((CommentService) c01gwLIZIZ3.getValue()).LJJIJIIJIL(aweme5)) {
                        z2 = true;
                    }
                    c1349800lEI2.setCommentLimited(z2);
                    c1349800lEI2.setEnterMethod("tablet_on_keyboard_event");
                    Fragment fragment5 = this.LLJJIII;
                    if ((fragment5 instanceof LandscapeFeedFragment) && (landscapeFeedFragment2 = (LandscapeFeedFragment) fragment5) != null && (landscapeFragmentPanel2 = landscapeFeedFragment2.LL) != null && (c2189821An62 = landscapeFragmentPanel2.LLJI) != null) {
                        noticeTypeForComment = c2189821An62.getNoticeTypeForComment();
                    } else {
                        noticeTypeForComment = null;
                    }
                    c1349800lEI2.setAccountType(noticeTypeForComment);
                    Fragment fragment6 = this.LLJJIII;
                    if ((fragment6 instanceof LandscapeFeedFragment) && (landscapeFeedFragment = (LandscapeFeedFragment) fragment6) != null && (landscapeFragmentPanel = landscapeFeedFragment.LL) != null && (c2189821An6 = landscapeFragmentPanel.LLJI) != null) {
                        noticeIdForComment2 = c2189821An6.getNoticeIdForComment();
                    }
                    c1349800lEI2.setNoticeId(noticeIdForComment2);
                    c1349800lEI2.setLocatePageType(1);
                    ((CommentService) c01gwLIZIZ3.getValue()).LJJL(getActivity(), this.LLJJIII, aweme5, c1349800lEI2);
                }
                LJJIFFI(true);
                return;
            case 1747137704:
                if (!str.equals("click_landscape_caption_toggle")) {
                    return;
                }
                break;
            case 1964086245:
                if (!str.equals("to_profile")) {
                    return;
                }
                Object obj11 = c0rd42.LIZIZ;
                if (obj11 != null) {
                    obj = obj11;
                }
                LLLLLLL((String) obj);
                return;
            default:
                return;
        }
        LLLLLZ();
        C692720RFe c692720RFe = this.LLLLLJIL;
        if (c692720RFe == null) {
            return;
        }
        DataCenter dataCenter = this.LLLILZ;
        if (dataCenter == null) {
            dataCenter = null;
        }
        Object obj12 = dataCenter.get("video_on_pause_play");
        if (obj12 instanceof Boolean) {
            obj2 = obj12;
        }
        c692720RFe.LIZJ(Intrinsics.LJFF(obj2, Boolean.TRUE));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
        VideoPlayViewModel videoPlayViewModel = this.LLLIZZ;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.onPausePlay(str);
        }
        BaseFeedPlayerView baseFeedPlayerView = this.LLJJLIIIJLLLLLLLZ;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
        BaseFeedPlayerView baseFeedPlayerView = this.LLJJLIIIJLLLLLLLZ;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPlayCompleted(str);
        }
        VideoPlayViewModel videoPlayViewModel = this.LLLIZZ;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        DataCenter dataCenter = this.LLLILZ;
        if (dataCenter == null) {
            dataCenter = null;
        }
        dataCenter.zQ2(null, "play_complete_first_time");
        VideoPlayViewModel videoPlayViewModel = this.LLLIZZ;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.wQ2();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        BaseFeedPlayerView baseFeedPlayerView = this.LLJJLIIIJLLLLLLLZ;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        VideoPlayViewModel videoPlayViewModel = this.LLLIZZ;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.setState(new AwS62S1000000_11(str, 14));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    @InterfaceC1294060jmO
    public void onPreparePlay(String str) {
        BaseFeedPlayerView baseFeedPlayerView = this.LLJJLIIIJLLLLLLLZ;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    @InterfaceC1294060jmO
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C0N0Y c0n0yLJLJJI;
        String sourceId = null;
        C726690Sex.LIZIZ.LJIILIIL(null);
        C583620Mum.LJJJJ(this, c1480420ocy);
        VideoPlayViewModel videoPlayViewModel = this.LLLIZZ;
        if (videoPlayViewModel != null) {
            if (c1480420ocy != null) {
                sourceId = c1480420ocy.getSourceId();
            }
            videoPlayViewModel.LJJIJIIJI(sourceId);
        }
        this.LLLLLLL.removeCallbacks(this.LLLLLLLLL);
        G();
        if (C2549509yv.LIZ && (c0n0yLJLJJI = C1483410ohn.LJLJJI()) != null) {
            c0n0yLJLJJI.LJJLIIIJL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    @InterfaceC1294060jmO
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        VideoPlayViewModel videoPlayViewModel = this.LLLIZZ;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.setState(new C690650R7f());
        }
        BaseFeedPageParams baseFeedPageParams = this.LLLLLLZ;
        if (baseFeedPageParams == null) {
            baseFeedPageParams = null;
        }
        if (!baseFeedPageParams.isPlayListCleanMode()) {
            this.LLLIIL.LJIIJ(this.LLJJ);
            Context context = this.LLLII;
            if (context != null) {
                this.LLLIIL.LJIIIZ(context, this.LLJJIII);
            }
        }
        LLLLIILLL();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onResumePlay(String str) {
        String aid;
        Aweme awemeLLLLLJLJLL;
        C726690Sex c726690Sex = C726690Sex.LIZIZ;
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) this.LLLLLJLJLL.getValue();
        if (landscapeFeedViewPagerAbility != null && (awemeLLLLLJLJLL = landscapeFeedViewPagerAbility.LLLLLJLJLL()) != null) {
            aid = awemeLLLLLJLJLL.getAid();
        } else {
            aid = null;
        }
        c726690Sex.LJI(aid, null);
        VideoPlayViewModel videoPlayViewModel = this.LLLIZZ;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.onResumePlay(str);
        }
        G();
        BaseFeedPlayerView baseFeedPlayerView = this.LLJJLIIIJLLLLLLLZ;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLLZZ == null) {
            this.LLLZZ = new ArrayList();
        }
        ((ArrayList) this.LLLZZ).add(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void L0(int i, Aweme aweme) {
        this.LLJJI = i;
        this.LLLLLZ = aweme;
        LLLLZI(C729980SkG.LIZLLL(aweme));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0109  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ(int r7, com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell.LJJJJ(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.InterfaceC1473950oSX
    public final void LLILLIZIL(int i, int i2) {
        Aweme aweme;
        if (this.LLLIIII != null && (aweme = this.LLJJ) != null) {
            C737030Svd c737030Svd = new C737030Svd(0, aweme);
            C0HTT<C737030Svd> c0htt = this.LLLIIII;
            if (c0htt != null) {
                c0htt.LLIIL(c737030Svd);
            }
        }
        LLLLIILLL();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLLLJ(int i, String str) {
        VideoViewModel videoViewModel = this.LLLILZLLLI;
        if (videoViewModel != null) {
            C735370Ssx.LIZJ(this.LLJJ);
            C735370Ssx.LIZLLL(this.LLJJ);
            videoViewModel.wQ2(new C692890RFv(i, str));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLLLZI = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLLLZIL = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLLLZLL = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLLLZLLIL = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLLLZLLLI = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLLZ = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLLZI = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.LLLZIIL = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLLZIL = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.LLLZZ, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLLZL = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLLZLL = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLLZLZ = (FcpMetaTagAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        VideoPlayViewModel videoPlayViewModel;
        if (z && (videoPlayViewModel = this.LLLIZZ) != null) {
            videoPlayViewModel.setState(new AwS62S1000000_11(str, 15));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        VideoPlayViewModel videoPlayViewModel = this.LLLIZZ;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.setState(new AwS0S1000001_11(str, f, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0QSJ
    public void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLLLZI = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLLLZIL = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLLLZLL = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLLLZLLIL = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLLLZLLLI = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLLZ = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLLZI = null;
        } else if (cls == PauseTimeAbility.class) {
            this.LLLZIIL = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLLZIL = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLLZL = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLLZLL = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLLZLZ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    public static void LLLL(View view, boolean z, boolean z2) {
        if (view != null) {
            if (z) {
                C786410Ut5.LJLLLLLL(0, view);
                view.animate().alpha(0.99f).setDuration(200L).start();
            } else {
                view.animate().alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS30S0110000_11(view, z2, 2)).start();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLJLILLLLZIIL(int i, String str, String str2) {
        VideoViewModel videoViewModel = this.LLLILZLLLI;
        if (videoViewModel != null) {
            C735370Ssx.LIZJ(this.LLJJ);
            C735370Ssx.LIZLLL(this.LLJJ);
            videoViewModel.wQ2(new C692890RFv(i, str2));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLLFFI(int i, String str, String str2) {
        VideoViewModel videoViewModel = this.LLLILZLLLI;
        if (videoViewModel != null) {
            C735370Ssx.LIZJ(this.LLJJ);
            C735370Ssx.LIZLLL(this.LLJJ);
            videoViewModel.wQ2(new C692890RFv(i, str2));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j, long j2) {
        BaseFeedPlayerView baseFeedPlayerView = this.LLJJLIIIJLLLLLLLZ;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPlayProgressChange(str, j, j2);
        }
        AbsInteractStickerWidget absInteractStickerWidget = this.LLLIIL.LJIIJJI;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekStart(String str, int i, float f) {
        VideoPlayViewModel videoPlayViewModel = this.LLLIZZ;
        if (videoPlayViewModel != null) {
            videoPlayViewModel.setState(new AwS62S1000000_11(str, 16));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJLJLLL(int i, int i2, int i3, String str, String str2) {
        String aid;
        C0Q6C c0q6c = new C0Q6C();
        Aweme aweme = this.LLJJ;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str = aid;
        }
        C0Q69 c0q69 = c0q6c.LIZ;
        c0q69.LIZ = str;
        c0q69.LIZIZ = i;
        c0q69.LIZJ = str2;
        Integer numValueOf = Integer.valueOf(i2);
        C0Q69 c0q692 = c0q6c.LIZ;
        c0q692.LIZLLL = numValueOf;
        c0q692.LJ = i3;
        VideoViewModel videoViewModel = this.LLLILZLLLI;
        if (videoViewModel != null) {
            videoViewModel.xQ2(c0q692);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void Y0(int i, int i2, long j, long j2, long j3, long j4, long j5) {
        VideoViewModel videoViewModel = this.LLLILZLLLI;
        if (videoViewModel != null) {
            C735370Ssx.LIZJ(this.LLJJ);
            C735370Ssx.LIZLLL(this.LLJJ);
            videoViewModel.wQ2(new C692880RFu(false, true, i2));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void v(long j, long j2, long j3, long j4, int i, long j5, int i2) {
        VideoViewModel videoViewModel = this.LLLILZLLLI;
        if (videoViewModel != null) {
            C735370Ssx.LIZJ(this.LLJJ);
            C735370Ssx.LIZLLL(this.LLJJ);
            videoViewModel.wQ2(new C692880RFu(true, false, i2));
        }
    }
}
