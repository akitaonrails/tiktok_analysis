package com.ss.android.ugc.aweme.explore.assem;

import X.AbstractC1335900krs;
import X.AbstractC21673619ry;
import X.AbstractC738140SxQ;
import X.AnonymousClass0208;
import X.C019F;
import X.C01GW;
import X.C03IT;
import X.C05DG;
import X.C0AB9;
import X.C0BK2;
import X.C0BK4;
import X.C0HWQ;
import X.C0I7Z;
import X.C0IDP;
import X.C0IDX;
import X.C0P0T;
import X.C0PEM;
import X.C1085640eME;
import X.C1086520eNe;
import X.C118300cf;
import X.C11JF;
import X.C1220000hqw;
import X.C1257390ipF;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1391600mJi;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1558520qew;
import X.C1570830qyn;
import X.C1589640rT8;
import X.C15SB;
import X.C15SJ;
import X.C15SN;
import X.C15T5;
import X.C15TA;
import X.C15UD;
import X.C15UU;
import X.C15V2;
import X.C15VE;
import X.C15VK;
import X.C1623706Xj;
import X.C1637806bA;
import X.C1697810uHb;
import X.C16FG;
import X.C16HB;
import X.C16HO;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1846010y8d;
import X.C19719912Dl;
import X.C19EG;
import X.C20521215Rq;
import X.C20522315Sb;
import X.C20523115Sj;
import X.C20526015Tm;
import X.C20532515Vz;
import X.C20603715jn;
import X.C2153908cD;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C288830BTt;
import X.C291001Au;
import X.C292320Bd0;
import X.C341940Daq;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C443090HZb;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C487280J9a;
import X.C627260Oiy;
import X.C720620SOm;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C725950Sdl;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.EnumC19356710o9;
import X.EnumC452301pR;
import X.InterfaceC1340660kzY;
import X.InterfaceC2217461Bqa;
import X.InterfaceC336510DHd;
import X.InterfaceC487330J9f;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS2S0102000_6;
import Y.ARunnableS35S1100000_31;
import Y.AsS38S0200000_31;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.explore.ExploreFeedParams;
import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility;
import com.ss.android.ugc.aweme.explore.ability.ExplorePowerListAbility;
import com.ss.android.ugc.aweme.explore.ability.FirstScreenCheckingAbility;
import com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility;
import com.ss.android.ugc.aweme.explore.common.ExploreStaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.explore.data.ExploreTopBannerData;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTopicMonitorManager;
import com.ss.android.ugc.aweme.explore.scope.ExploreFeedComponentScope;
import com.ss.android.ugc.aweme.explore.scope.ExploreFragmentContainerScope;
import com.ss.android.ugc.aweme.explore.ui.container.BaseExploreFeedFragment;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedStateSharedVM;
import com.ss.android.ugc.aweme.explore.vm.ExploreTopicFeedSharedVM;
import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import wh6.AbS516S0200000_31;

/* JADX INFO: loaded from: classes32.dex */
public class ExploreTopicGeneralFeedListComponent extends UIListContentAssem<ExploreTopicGeneralFeedListViewModel> implements C15SB, InterfaceC487330J9f, InterfaceC336510DHd, FirstScreenCheckingAbility, MiddleBridgeCellAbility, ExplorePowerListAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final C736950SvV LLIZLLLIL;
    public final C736950SvV LLJ;
    public final AssemVMLazy LLJI;
    public C20522315Sb LLJIJIL;
    public C1749280vcc LLJILJIL;
    public final C01GW LLJILJILJ;
    public C20523115Sj LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public C0P0T LLJJIII;
    public View LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public AsS38S0200000_31 LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public C16HO LLJL;
    public C0IDP LLJLIL;
    public C16HB LLJLILLLLZIIL;
    public View LLJLL;
    public boolean LLJLLIL;
    public C11JF LLJLLL;
    public TuxSkeletonLayout LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final Set<Integer> LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ExploreTopicGeneralFeedListComponent.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/explore/vm/ExploreTopicGeneralFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void Gs2(C15T5 c15t5) {
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void LD2() {
        ip().LLJJIII = false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public void kp() {
        Long l;
        C15V2 c15v2Ja = ja();
        String string = (c15v2Ja == null || (l = c15v2Ja.LIZIZ) == null) ? null : l.toString();
        C2153908cD c2153908cD = C2153908cD.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJI(fragmentLJI, ExploreFeedComponentScope.class, this, FirstScreenCheckingAbility.class, this, string);
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            C1558520qew.LJI(fragmentLJI2, ExploreFragmentContainerScope.class, this, MiddleBridgeCellAbility.class, this, string);
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null) {
            C1558520qew.LJI(fragmentLJI3, ExploreFragmentContainerScope.class, this, ExplorePowerListAbility.class, this, string);
        }
    }

    public void sp() {
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.15S7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C15SN c15sn = (C15SN) obj;
                c15sn.getClass();
                return C627260Oiy.LIZJ(c15sn);
            }
        }, this, null, new AwS610S0100000_31(this, 171), new AwS575S0100000_31(this, 615), new AwS610S0100000_31(this, 165), 4, null);
    }

    public void tp() {
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.15Rx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C15SN c15sn = (C15SN) obj;
                c15sn.getClass();
                return C627260Oiy.LIZLLL(c15sn);
            }
        }, this, null, new AwS610S0100000_31(this, 166), new AwS575S0100000_31(this, 605), new AwS610S0100000_31(this, 169), 4, null);
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void tw2() {
        ip().LLJJJJJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void wY1(long j, String str) {
    }

    public ExploreTopicGeneralFeedListComponent() {
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 608);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ExploreTopicFeedSharedVM.class);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(89);
        AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((AbstractC738140SxQ) this, 613);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLIZLLLIL = new C736950SvV(c19719912DlLIZ, awS575S0100000_31, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS276S0000000_31, awS575S0100000_312, c451610HnL, c723700Sa8);
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(170);
        this.LLJ = new C736950SvV(C13LE.LIZ(ExploreFeedStateSharedVM.class), aFwS221S0000000_31, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(90), new AwS575S0100000_31((AbstractC738140SxQ) this, 614), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ExploreTopicGeneralFeedListViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new AwS575S0100000_31(c19719912DlLIZ2, 612), AFwS276S0000000_31.get$arr$(88), null, true);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 609));
        this.LLJZIJLIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS575S0100000_31(this, 611));
        this.LLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 607));
        this.LLLF = new LinkedHashSet();
        this.LLLFF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 606));
        this.LLLFFI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 610));
    }

    @Override // X.C15SB
    public final C20521215Rq Ek() {
        return (C20521215Rq) this.LLLFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void H00() {
        C0P0T c0p0t = this.LLJJIII;
        if (c0p0t == null || !c0p0t.isShowing()) {
            return;
        }
        c0p0t.dismiss();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = ((Number) C0BK4.LIZ.getValue()).intValue();
        c20603715jn.LIZLLL = ExploreTopicFeedFooterCell.class;
        boolean z = true;
        c20603715jn.LJI = C292320Bd0.LIZ > 0;
        c20603715jn.LJIIIZ = "homepage_explore_topic";
        c20603715jn.LJIIIIZZ = new OptimizeAbility(6, z, null, 4);
        return c20603715jn;
    }

    @Override // X.C15SB
    public final void Z6() {
        ExploreManageTabAbility exploreManageTabAbility = (ExploreManageTabAbility) this.LLLFFI.getValue();
        if (exploreManageTabAbility != null) {
            exploreManageTabAbility.Z6();
        }
    }

    public final int Zo() {
        View viewFindViewById;
        View view = this.LLJJJ;
        if (view == null) {
            C1085640eME c1085640eME = C1846010y8d.LLJL;
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.hgn)) == null) {
            C1085640eME c1085640eME2 = C1846010y8d.LLJL;
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        viewFindViewById.getLocationInWindow(iArr2);
        int height = (iArr2[1] + viewFindViewById.getHeight()) - iArr[1];
        if (height < 0) {
            return 0;
        }
        return height;
    }

    public C1722300uv6 ap() {
        String string;
        String string2;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_no_video;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        c1722300uv6.LJIIIZ = new AwS610S0100000_31(this, 167);
        Context context = getContext();
        String str = "";
        if (context == null || (string = context.getString(2131834313)) == null) {
            string = "";
        }
        c1722300uv6.LJI = string;
        Context context2 = getContext();
        if (context2 != null && (string2 = context2.getString(2131834314)) != null) {
            str = string2;
        }
        c1722300uv6.LJIIIIZZ = str;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        return c1722300uv6;
    }

    public C1722300uv6 bp() {
        String string;
        String string2;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_wifi_slash;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        Context context = getContext();
        String str = "";
        if (context == null || (string = context.getString(R.string.m25)) == null) {
            string = "";
        }
        c1722300uv6.LJI = string;
        Context context2 = getContext();
        if (context2 != null && (string2 = context2.getString(2131836051)) != null) {
            str = string2;
        }
        c1722300uv6.LJIIIIZZ = str;
        c1722300uv6.LJIIIZ = new AwS606S0100000_27(this, 101);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        return c1722300uv6;
    }

    public final void cp() {
        View view;
        View view2;
        C0IDP c0idp = this.LLJLIL;
        if (c0idp != null && (view2 = this.LLJJIJI) != null) {
            view2.removeOnLayoutChangeListener(c0idp);
        }
        this.LLJLIL = null;
        C16HB c16hb = this.LLJLILLLLZIIL;
        if (c16hb != null && (view = this.LLJLL) != null) {
            view.removeOnLayoutChangeListener(c16hb);
        }
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
    }

    public final ExploreFeedStateSharedVM ep() {
        return (ExploreFeedStateSharedVM) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: hp, reason: merged with bridge method [inline-methods] */
    public final C1086520eNe Go() {
        return (C1086520eNe) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public ExploreTopicGeneralFeedListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        return (ExploreTopicGeneralFeedListViewModel) assemVMLazy.getValue();
    }

    @Override // X.C15SB
    public final C15V2 ja() {
        return (C15V2) this.LLL.getValue();
    }

    public final void lp() {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2;
        StaggeredGridLayoutManager staggeredGridLayoutManager3;
        C720620SOm.LIZ.setValue(null);
        C1086520eNe c1086520eNeGo = Go();
        if (c1086520eNeGo != null) {
            RecyclerView.LayoutManager layoutManager = c1086520eNeGo.getLayoutManager();
            int iLJJIII = (!(layoutManager instanceof StaggeredGridLayoutManager) || (staggeredGridLayoutManager3 = (StaggeredGridLayoutManager) layoutManager) == null) ? 2 : staggeredGridLayoutManager3.LJJIII();
            int[] iArr = new int[iLJJIII];
            int[] iArr2 = new int[iLJJIII];
            RecyclerView.LayoutManager layoutManager2 = c1086520eNeGo.getLayoutManager();
            if ((layoutManager2 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) layoutManager2) != null) {
                staggeredGridLayoutManager2.LJIJ(iArr);
            }
            int iLJJJJZI = C13LQ.LJJJJZI(iArr);
            RecyclerView.LayoutManager layoutManager3 = c1086520eNeGo.getLayoutManager();
            if ((layoutManager3 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager3) != null) {
                staggeredGridLayoutManager.LJIJJ(iArr2);
            }
            int iLJJJJLI = C13LQ.LJJJJLI(iArr2);
            if (iLJJJJZI >= 0 && iLJJJJLI >= 0 && iLJJJJLI >= iLJJJJZI && iLJJJJZI <= iLJJJJLI) {
                while (true) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = c1086520eNeGo.findViewHolderForLayoutPosition(iLJJJJZI);
                    if (!(viewHolderFindViewHolderForLayoutPosition instanceof ExploreFeedCell)) {
                        viewHolderFindViewHolderForLayoutPosition = null;
                    }
                    ExploreFeedCell exploreFeedCell = (ExploreFeedCell) viewHolderFindViewHolderForLayoutPosition;
                    if (exploreFeedCell != null) {
                        TuxIconDrawable tuxIconDrawable = ExploreFeedCell.LLLF;
                        exploreFeedCell.h7(false);
                        exploreFeedCell.h7(true);
                    }
                    if (iLJJJJZI == iLJJJJLI) {
                        break;
                    } else {
                        iLJJJJZI++;
                    }
                }
            }
        }
        ExploreFeedListViewModel.LLJZIJLIL = "other";
    }

    public void up() {
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.15SS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15SN) obj).LLILZ;
            }
        }, null, new AwS645S0100000_31(this, 103), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.15SU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15SN) obj).LLILLJJLI;
            }
        }, null, AnonymousClass0208.get$arr$(51), 6);
        if (C0BK2.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.15SP
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C15SN) obj).LLJ;
                }
            }, C736820SvI.LIZLLL(), AnonymousClass0208.get$arr$(50), 4);
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.15SW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15SN) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 104), 4);
        tp();
        sp();
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.15SY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15SN) obj).LLILZLL;
            }
        }, null, new AwS645S0100000_31(this, 105), 6);
        if (C288830BTt.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.15SL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C15SN) obj).LLIZLLLIL;
                }
            }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 107), 4);
            ep().vQ2(new AwS610S0100000_31(this, 484));
            ExploreFeedStateSharedVM exploreFeedStateSharedVMEp = ep();
            AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 485);
            exploreFeedStateSharedVMEp.getClass();
            AssemViewModel.selectSubscribe$default(exploreFeedStateSharedVMEp, C15SJ.LL, null, null, null, new AwS610S0100000_31(awS610S0100000_31, (Function1<? super C291001Au<Long>, Unit>) 358), 14, null);
        }
        ep().vQ2(new AwS610S0100000_31(this, 486));
    }

    public void Ap() throws IllegalAccessException {
        Long l;
        Long l2;
        Long l3;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        String string = null;
        if (fragmentLJI != null) {
            C15V2 c15v2Ja = ja();
            C1558520qew.LJIIJ(fragmentLJI, ExploreFeedComponentScope.class, FirstScreenCheckingAbility.class, (c15v2Ja == null || (l3 = c15v2Ja.LIZIZ) == null) ? null : l3.toString());
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            C15V2 c15v2Ja2 = ja();
            C1558520qew.LJIIJ(fragmentLJI2, ExploreFragmentContainerScope.class, MiddleBridgeCellAbility.class, (c15v2Ja2 == null || (l2 = c15v2Ja2.LIZIZ) == null) ? null : l2.toString());
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null) {
            C15V2 c15v2Ja3 = ja();
            if (c15v2Ja3 != null && (l = c15v2Ja3.LIZIZ) != null) {
                string = l.toString();
            }
            C1558520qew.LJIIJ(fragmentLJI3, ExploreFragmentContainerScope.class, ExplorePowerListAbility.class, string);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final boolean LJJIIJZLJL() {
        C15SN c15sn = (C15SN) ip().getState();
        c15sn.getClass();
        return C627260Oiy.LIZLLL(c15sn) instanceof C1623706Xj;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void Vq1() {
        ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModelIp = ip();
        exploreTopicGeneralFeedListViewModelIp.getClass();
        exploreTopicGeneralFeedListViewModelIp.setState(new AwS610S0100000_31(exploreTopicGeneralFeedListViewModelIp, 364));
    }

    public BaseExploreFeedFragment dp() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        Fragment parentFragment = fragmentLJI != null ? fragmentLJI.getParentFragment() : null;
        if (parentFragment instanceof BaseExploreFeedFragment) {
            return (BaseExploreFeedFragment) parentFragment;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final String getEnterFrom() {
        ip().getClass();
        return "homepage_explore";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final Aweme gt() {
        C20526015Tm c20526015Tm;
        List<C20526015Tm> list = ((C15SN) ip().getState()).LL.LLILZ;
        if (list == null || (c20526015Tm = (C20526015Tm) C13LP.LJJJLZIJ(0, list)) == null) {
            return null;
        }
        return c20526015Tm.LL;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final C1086520eNe lP2() {
        return Go();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C15VE c15veXm = ip().xm();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        c15veXm.LIZIZ = fragmentLJI;
        c15veXm.LIZJ = fragmentLJI != null ? LifecycleOwnerKt.getLifecycleScope(fragmentLJI) : null;
        kp();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        Long l;
        super.onDestroy();
        Ap();
        ((C15VK) this.LLJZIJLIL.getValue()).LIZ();
        ip().xm().LIZLLL();
        C487280J9a.LIZJ(this);
        C1589640rT8.LIZIZ.H2(this.LLJILLL);
        this.LLJILLL = null;
        View view = this.LLJJIJI;
        if (view != null) {
            mp(view);
        }
        cp();
        AsS38S0200000_31 asS38S0200000_31 = this.LLJJL;
        if (asS38S0200000_31 != null) {
            Go().removeOnScrollListener(asS38S0200000_31);
        }
        this.LLJJL = null;
        if (this.LLJJJJ) {
            C15V2 c15v2Ja = ja();
            if (c15v2Ja != null && (l = c15v2Ja.LIZIZ) != null) {
                Explore0VVTopicMonitorManager.INSTANCE.reportSession(l.longValue(), C15UD.OTHER);
            }
            this.LLJJJJ = false;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        if (!ActivityLifeObserver.getInstance().isForeground()) {
            ExploreFeedListViewModel.LLJZIJLIL = "exit_app";
        } else if (Intrinsics.LJFF(ExploreFeedListViewModel.LLJZIJLIL, "other")) {
            super.onStop();
            HandlerHook.viewPost(LJJIJL(), new ARunnableS131S0100000_31(this, 56));
            return;
        }
        super.onStop();
        lp();
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final boolean pJ2() {
        return ip().LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final C15VE xm() {
        return ip().xm();
    }

    public void zp() {
        withStateSafe(ip(), new AwS610S0100000_31(this, 170));
    }

    public static final ExploreManageTabAbility Lo(ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent) {
        return (ExploreManageTabAbility) exploreTopicGeneralFeedListComponent.LLLFFI.getValue();
    }

    public final void Bp(int i) {
        int i2 = this.LLJJLIIIJLLLLLLLZ;
        int i3 = (this.LLJJJJLIIL + i2) - i;
        if (i3 >= i2) {
            i2 = i3;
        }
        View view = this.LLJJIJIL;
        if (view != null) {
            C786410Ut5.ed(view, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void Dt2(int i) {
        ip().LLJJIJIIJIL = i;
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void E62(ExploreFeedParams exploreFeedParams) {
        ExploreLynxParams exploreLynxParams;
        C19EG activity;
        Intent intent;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (activity = fragmentLJI.getActivity()) == null || (intent = activity.getIntent()) == null || (exploreLynxParams = (ExploreLynxParams) intent.getParcelableExtra("explore_lynx_params")) == null) {
            exploreLynxParams = new ExploreLynxParams(0);
        }
        ip().HQ2(exploreFeedParams, exploreLynxParams);
        ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModelIp = ip();
        String str = exploreTopicGeneralFeedListViewModelIp.LLJILJILJ;
        exploreTopicGeneralFeedListViewModelIp.LLJILJILJ = null;
        if (str != null) {
            HandlerHook.viewPost(Go(), new ARunnableS35S1100000_31(this, str, 7));
        }
    }

    public final void Ep(ExploreTopBannerData exploreTopBannerData) {
        boolean z;
        boolean z2;
        Long l;
        String str;
        boolean z3;
        String methodName;
        Long l2;
        Long l3;
        int width;
        int iIntValue;
        Long l4;
        Context context;
        Resources resources;
        DisplayMetrics displayMetrics;
        Long l5;
        View view;
        View rootView;
        View viewFindViewById;
        int width2;
        int iIntValue2;
        Resources resources2;
        DisplayMetrics displayMetrics2;
        Integer numValueOf;
        boolean z4 = false;
        int i = 1;
        if (((Boolean) C0AB9.LIZ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View view2 = this.LLJJIJI;
            if (view2 != null) {
                if (exploreTopBannerData != null && exploreTopBannerData.isActiveNow()) {
                    Vo(view2, exploreTopBannerData);
                    if (view2.getVisibility() != 0) {
                        if (this.LLJJJJLIIL > 0) {
                            C1086520eNe c1086520eNeGo = Go();
                            c1086520eNeGo.setPaddingRelative(c1086520eNeGo.getPaddingStart(), this.LLJJLIIIJLLLLLLLZ + this.LLJJJJLIIL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), c1086520eNeGo.getPaddingEnd(), c1086520eNeGo.getPaddingBottom());
                            C20522315Sb c20522315Sb = this.LLJIJIL;
                            if (c20522315Sb != null) {
                                c20522315Sb.setOverScrollMode(EnumC19356710o9.ONLY_TOP);
                            }
                            View view3 = this.LLJJJ;
                            if (view3 != null) {
                                view3.setClipBounds(new Rect(0, this.LLJJLIIIJLLLLLLLZ, view3.getWidth(), view3.getHeight()));
                            }
                        }
                        C786410Ut5.LJLLLLLL(0, view2);
                        if (exploreTopBannerData != null) {
                            C15TA.LIZ.getClass();
                            if (C15TA.LJIILIIL.compareAndSet(false, true)) {
                                C15TA.LJIILL(new ARunnableS131S0100000_31(exploreTopBannerData, 219));
                            }
                        }
                        if (this.LLJJJJLIIL == 0) {
                            View view4 = this.LLJJJ;
                            if (view4 != null) {
                                width2 = view4.getWidth();
                            } else {
                                width2 = 0;
                            }
                            Integer numValueOf2 = Integer.valueOf(width2);
                            if (numValueOf2.intValue() > 0) {
                                iIntValue2 = numValueOf2.intValue();
                            } else {
                                Context context2 = getContext();
                                if (context2 != null && (resources2 = context2.getResources()) != null && (displayMetrics2 = resources2.getDisplayMetrics()) != null && (numValueOf = Integer.valueOf(displayMetrics2.widthPixels)) != null) {
                                    iIntValue2 = numValueOf.intValue();
                                } else {
                                    iIntValue2 = 0;
                                }
                            }
                            int iLIZIZ = iIntValue2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                            if (iLIZIZ >= 1) {
                                i = iLIZIZ;
                            }
                            view2.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                            int measuredHeight = view2.getMeasuredHeight();
                            if (measuredHeight > 0) {
                                int iLIZIZ2 = measuredHeight + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                C1086520eNe c1086520eNeGo2 = Go();
                                c1086520eNeGo2.setPaddingRelative(c1086520eNeGo2.getPaddingStart(), this.LLJJLIIIJLLLLLLLZ + iLIZIZ2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), c1086520eNeGo2.getPaddingEnd(), c1086520eNeGo2.getPaddingBottom());
                                C20522315Sb c20522315Sb2 = this.LLJIJIL;
                                if (c20522315Sb2 != null) {
                                    c20522315Sb2.setOverScrollMode(EnumC19356710o9.ONLY_TOP);
                                }
                                View view5 = this.LLJJJ;
                                if (view5 != null) {
                                    view5.setClipBounds(new Rect(0, this.LLJJLIIIJLLLLLLLZ, view5.getWidth(), view5.getHeight()));
                                }
                            }
                        }
                    }
                    if (this.LLJLIL == null) {
                        C0IDP c0idp = new C0IDP(this, 12);
                        this.LLJLIL = c0idp;
                        view2.addOnLayoutChangeListener(c0idp);
                    }
                    if (this.LLJLILLLLZIIL == null && (view = this.LLJJJ) != null && (rootView = view.getRootView()) != null && (viewFindViewById = rootView.findViewById(R.id.hgn)) != null) {
                        C16HB c16hb = new C16HB(this, 7);
                        this.LLJLILLLLZIIL = c16hb;
                        this.LLJLL = viewFindViewById;
                        viewFindViewById.addOnLayoutChangeListener(c16hb);
                    }
                    if (view2.isLaidOut() && view2.getHeight() > 0) {
                        So(view2.getHeight(), view2);
                        return;
                    }
                    return;
                }
                yp(view2);
                return;
            }
            return;
        }
        View view6 = this.LLJJIJI;
        if (view6 == null) {
            return;
        }
        if (exploreTopBannerData != null && exploreTopBannerData.isActiveNow()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2153908cD c2153908cD = C2153908cD.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Banner] updateLocalBanner tabId=");
        C15V2 c15v2Ja = ja();
        if (c15v2Ja != null) {
            l = c15v2Ja.LIZIZ;
        } else {
            l = null;
        }
        sbLIZ.append(l);
        sbLIZ.append(" active=");
        sbLIZ.append(z2);
        sbLIZ.append(" title=");
        if (exploreTopBannerData != null) {
            str = exploreTopBannerData.title;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" bannerVisible=");
        if (view6.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        sbLIZ.append(z3);
        sbLIZ.append(" bannerTotalHeight=");
        sbLIZ.append(this.LLJJJJLIIL);
        sbLIZ.append(" caller=");
        StackTraceElement stackTraceElement = (StackTraceElement) C13LQ.LJJIIZ(3, ThreadMethodProxy.getStackTrace(C786410Ut5.u3()));
        if (stackTraceElement != null) {
            methodName = stackTraceElement.getMethodName();
        } else {
            methodName = null;
        }
        sbLIZ.append(methodName);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2153908cD.getClass();
        C2153908cD.LIZJ(3, strLIZIZ, "ExploreTopicGeneralFeedListComponent");
        if (z2) {
            if (view6.getVisibility() == 0 && this.LLJJJJLIIL > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[Banner] updateLocalBanner -> earlyReturn (already setup) tabId=");
                C15V2 c15v2Ja2 = ja();
                if (c15v2Ja2 != null) {
                    l5 = c15v2Ja2.LIZIZ;
                } else {
                    l5 = null;
                }
                sbLIZ2.append(l5);
                C2153908cD.LIZJ(3, C2188811AlT.LIZIZ(sbLIZ2), "ExploreTopicGeneralFeedListComponent");
                if (exploreTopBannerData != null) {
                    Vo(view6, exploreTopBannerData);
                }
                view6.addOnLayoutChangeListener(new C16HB(this, 6));
                return;
            }
            if (this.LLJJJJLIIL > 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[Banner] updateLocalBanner -> preApplyLastKnownPadding paddingTop=");
                sbLIZ3.append(this.LLJJLIIIJLLLLLLLZ + this.LLJJJJLIIL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                C2153908cD.LIZJ(3, C2188811AlT.LIZIZ(sbLIZ3), "ExploreTopicGeneralFeedListComponent");
                C1086520eNe c1086520eNeGo3 = Go();
                c1086520eNeGo3.setPaddingRelative(c1086520eNeGo3.getPaddingStart(), this.LLJJLIIIJLLLLLLLZ + this.LLJJJJLIIL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), c1086520eNeGo3.getPaddingEnd(), c1086520eNeGo3.getPaddingBottom());
                C20522315Sb c20522315Sb3 = this.LLJIJIL;
                if (c20522315Sb3 != null) {
                    c20522315Sb3.setOverScrollMode(EnumC19356710o9.ONLY_TOP);
                }
                View view7 = this.LLJJJ;
                if (view7 != null) {
                    view7.setClipBounds(new Rect(0, this.LLJJLIIIJLLLLLLLZ, view7.getWidth(), view7.getHeight()));
                }
            }
            C786410Ut5.LJLLLLLL(0, view6);
            if (exploreTopBannerData != null) {
                Vo(view6, exploreTopBannerData);
                C15TA.LIZ.getClass();
                if (C15TA.LJIILIIL.compareAndSet(false, true)) {
                    C15TA.LJIILL(new ARunnableS131S0100000_31(exploreTopBannerData, 219));
                }
            }
            if (this.LLJJJJLIIL == 0) {
                View view8 = this.LLJJJ;
                if (view8 != null) {
                    width = view8.getWidth();
                } else {
                    width = 0;
                }
                Integer numValueOf3 = Integer.valueOf(width);
                if (numValueOf3.intValue() > 0 || ((context = getContext()) != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null && (numValueOf3 = Integer.valueOf(displayMetrics.widthPixels)) != null)) {
                    iIntValue = numValueOf3.intValue();
                } else {
                    iIntValue = 0;
                }
                int iLIZIZ3 = iIntValue - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                if (iLIZIZ3 >= 1) {
                    i = iLIZIZ3;
                }
                view6.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight2 = view6.getMeasuredHeight();
                if (measuredHeight2 > 0) {
                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + measuredHeight2;
                    C1086520eNe c1086520eNeGo4 = Go();
                    c1086520eNeGo4.setPaddingRelative(c1086520eNeGo4.getPaddingStart(), this.LLJJLIIIJLLLLLLLZ + iLIZIZ4 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), c1086520eNeGo4.getPaddingEnd(), c1086520eNeGo4.getPaddingBottom());
                    C20522315Sb c20522315Sb4 = this.LLJIJIL;
                    if (c20522315Sb4 != null) {
                        c20522315Sb4.setOverScrollMode(EnumC19356710o9.ONLY_TOP);
                    }
                    View view9 = this.LLJJJ;
                    if (view9 != null) {
                        view9.setClipBounds(new Rect(0, this.LLJJLIIIJLLLLLLLZ, view9.getWidth(), view9.getHeight()));
                    }
                    StringBuilder sb = new StringBuilder("[Banner] syncMeasure tabId=");
                    C15V2 c15v2Ja3 = ja();
                    if (c15v2Ja3 != null) {
                        l4 = c15v2Ja3.LIZIZ;
                    } else {
                        l4 = null;
                    }
                    sb.append(l4);
                    sb.append(" syncH=");
                    sb.append(measuredHeight2);
                    sb.append(" syncTotal=");
                    sb.append(iLIZIZ4);
                    sb.append(" paddingTop=");
                    sb.append(this.LLJJLIIIJLLLLLLLZ + iLIZIZ4 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    C2153908cD.LIZJ(3, sb.toString(), "ExploreTopicGeneralFeedListComponent");
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[Banner] updateLocalBanner -> setupStart tabId=");
            C15V2 c15v2Ja4 = ja();
            if (c15v2Ja4 != null) {
                l3 = c15v2Ja4.LIZIZ;
            } else {
                l3 = null;
            }
            sbLIZ4.append(l3);
            sbLIZ4.append(" prevBannerTotalHeight=");
            sbLIZ4.append(this.LLJJJJLIIL);
            C2153908cD.LIZJ(3, C2188811AlT.LIZIZ(sbLIZ4), "ExploreTopicGeneralFeedListComponent");
            mp(view6);
            C16HO c16ho = new C16HO(view6, this, 3);
            C786410Ut5.x3(view6.getViewTreeObserver(), c16ho);
            this.LLJL = c16ho;
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("[Banner] updateLocalBanner -> teardown tabId=");
        C15V2 c15v2Ja5 = ja();
        if (c15v2Ja5 != null) {
            l2 = c15v2Ja5.LIZIZ;
        } else {
            l2 = null;
        }
        sbLIZ5.append(l2);
        sbLIZ5.append(" prevVisible=");
        if (view6.getVisibility() == 0) {
            z4 = true;
        }
        sbLIZ5.append(z4);
        C2153908cD.LIZJ(3, C2188811AlT.LIZIZ(sbLIZ5), "ExploreTopicGeneralFeedListComponent");
        yp(view6);
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void FI(SmartRoute smartRoute) {
        C1257390ipF c1257390ipF = C1257390ipF.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        c1257390ipF.getClass();
        C1257390ipF.LIZ(smartRoute, this, fragmentLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final Map<String, String> Ln(String str) {
        Object next;
        Integer exploreCommunityCommentShowType;
        AwemeStatistics statistics;
        String aid;
        Aweme aweme;
        List<C20526015Tm> list = ((C15SN) ip().getState()).LL.LLILZ;
        String string = null;
        if (list != null) {
            Iterator it2 = new ArrayList(list).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C20526015Tm c20526015Tm = (C20526015Tm) next;
                    if ((c20526015Tm instanceof C20526015Tm) && c20526015Tm != null && (aweme = c20526015Tm.LL) != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C20526015Tm c20526015Tm2 = (C20526015Tm) next;
            if (c20526015Tm2 != null) {
                Aweme aweme2 = c20526015Tm2.LL;
                if (aweme2 != null && (exploreCommunityCommentShowType = aweme2.getExploreCommunityCommentShowType()) != null && exploreCommunityCommentShowType.intValue() == 1 && (statistics = aweme2.getStatistics()) != null) {
                    string = Long.valueOf(statistics.getCommentCount()).toString();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("model_source", String.valueOf(c20526015Tm2.LLILZLL));
                if (string != null) {
                    linkedHashMap.put("show_comment_number", string);
                }
                return linkedHashMap;
            }
        }
        return null;
    }

    public void No(ViewGroup viewGroup) {
        BaseExploreFeedFragment baseExploreFeedFragmentDp = dp();
        if (baseExploreFeedFragmentDp != null) {
            baseExploreFeedFragmentDp.aS(viewGroup);
        }
    }

    public void Oo(View view) {
        BaseExploreFeedFragment baseExploreFeedFragmentDp = dp();
        if (baseExploreFeedFragmentDp != null) {
            baseExploreFeedFragmentDp.ZR(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExplorePowerListAbility
    public final void eJ0(long j) {
        Long l;
        RecyclerView.LayoutManager layoutManager;
        C15V2 c15v2Ja = ja();
        if (c15v2Ja != null && (l = c15v2Ja.LIZIZ) != null && j == l.longValue() && (layoutManager = Go().getLayoutManager()) != null) {
            layoutManager.scrollToPosition(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.FirstScreenCheckingAbility
    public final void kp0(int i) {
        if (ip().LLJJIJIL) {
            this.LLLF.add(Integer.valueOf(i));
        }
    }

    public final void mp(View view) {
        C16HO c16ho = this.LLJL;
        if (c16ho != null && view.getViewTreeObserver().isAlive()) {
            C786410Ut5.C3(view.getViewTreeObserver(), c16ho);
        }
        this.LLJL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x019b  */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.15Sj] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent.onViewCreated(android.view.View):void");
    }

    public final void op(boolean z) {
        C16FG nestedHeader;
        Integer numValueOf;
        TuxSkeletonLayout tuxSkeletonLayout;
        if (z) {
            C1749280vcc c1749280vcc = this.LLJILJIL;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
            if (this.LLJZ == null) {
                C15UU.LIZ.getClass();
                if (this.LLJILJIL == null) {
                    return;
                }
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.c5e, this.LLJILJIL, false);
                if (viewTd instanceof TuxSkeletonLayout) {
                    tuxSkeletonLayout = (TuxSkeletonLayout) viewTd;
                } else {
                    tuxSkeletonLayout = null;
                }
                this.LLJZ = tuxSkeletonLayout;
            }
            TuxSkeletonLayout tuxSkeletonLayout2 = this.LLJZ;
            if (tuxSkeletonLayout2 != null) {
                C1749280vcc c1749280vcc2 = this.LLJILJIL;
                if (c1749280vcc2 != null) {
                    c1749280vcc2.LIZIZ(tuxSkeletonLayout2);
                }
                C20522315Sb c20522315Sb = this.LLJIJIL;
                if (c20522315Sb != null && (nestedHeader = c20522315Sb.getNestedHeader()) != null && (numValueOf = Integer.valueOf(nestedHeader.getActualHeight())) != null) {
                    C0I7Z.LIZIZ(numValueOf.intValue(), tuxSkeletonLayout2);
                }
            }
            TuxSkeletonLayout tuxSkeletonLayout3 = this.LLJZ;
            if (tuxSkeletonLayout3 != null) {
                tuxSkeletonLayout3.setLoading(true);
            }
            C1749280vcc c1749280vcc3 = this.LLJILJIL;
            if (c1749280vcc3 != null) {
                c1749280vcc3.LJ();
            }
            C20522315Sb c20522315Sb2 = this.LLJIJIL;
            if (c20522315Sb2 != null) {
                c20522315Sb2.setRefreshing(true);
                return;
            }
            return;
        }
        C1749280vcc c1749280vcc4 = this.LLJILJIL;
        if (c1749280vcc4 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc4, 8);
        }
        C20522315Sb c20522315Sb3 = this.LLJIJIL;
        if (c20522315Sb3 != null) {
            c20522315Sb3.setRefreshing(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void rh1(ExploreLynxParams exploreLynxParams) {
        ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModelIp = ip();
        ExploreFeedParams exploreFeedParams = ip().LL;
        if (exploreFeedParams == null) {
            return;
        }
        exploreTopicGeneralFeedListViewModelIp.HQ2(exploreFeedParams, exploreLynxParams);
        ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModelIp2 = ip();
        String str = exploreTopicGeneralFeedListViewModelIp2.LLJILJILJ;
        exploreTopicGeneralFeedListViewModelIp2.LLJILJILJ = null;
        if (str != null) {
            HandlerHook.viewPost(Go(), new ARunnableS35S1100000_31(this, str, 7));
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.FirstScreenCheckingAbility
    public final boolean xC0(int i) {
        return this.LLLF.contains(Integer.valueOf(i));
    }

    public final void yp(View view) {
        mp(view);
        cp();
        AsS38S0200000_31 asS38S0200000_31 = this.LLJJL;
        if (asS38S0200000_31 != null) {
            Go().removeOnScrollListener(asS38S0200000_31);
        }
        this.LLJJL = null;
        C786410Ut5.ed(view, 0.0f);
        view.setTranslationZ(0.0f);
        View view2 = this.LLJJIJIL;
        if (view2 != null) {
            C786410Ut5.ed(view2, 0.0f);
        }
        View view3 = this.LLJJJ;
        if (view3 != null) {
            view3.setClipBounds(null);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            C786410Ut5.W5(view, marginLayoutParams);
            C786410Ut5.LJLLLLLL(8, view);
            C20522315Sb c20522315Sb = this.LLJIJIL;
            if (c20522315Sb != null) {
                c20522315Sb.setBallOffset(0.0f);
            }
            C20522315Sb c20522315Sb2 = this.LLJIJIL;
            if (c20522315Sb2 != null) {
                c20522315Sb2.setBallPullThreshold(0);
            }
            C20522315Sb c20522315Sb3 = this.LLJIJIL;
            if (c20522315Sb3 != null) {
                ViewGroup.LayoutParams layoutParams2 = c20522315Sb3.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = 0;
                    C786410Ut5.W5(c20522315Sb3, marginLayoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            C20522315Sb c20522315Sb4 = this.LLJIJIL;
            if (c20522315Sb4 != null) {
                c20522315Sb4.setOverScrollMode(EnumC19356710o9.ALWAYS);
            }
            C1086520eNe c1086520eNeGo = Go();
            c1086520eNeGo.setPaddingRelative(c1086520eNeGo.getPaddingStart(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), c1086520eNeGo.getPaddingEnd(), c1086520eNeGo.getPaddingBottom());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void So(int i, View view) {
        int i2;
        boolean z;
        boolean z2;
        AbstractC21673619ry adapter;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iZo = Zo();
        int iLIZIZ = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + iZo;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i2 = marginLayoutParams.topMargin;
        } else {
            i2 = -1;
        }
        boolean z3 = true;
        if (this.LLJJLIIIJLLLLLLLZ != iZo) {
            z = true;
        } else {
            z = false;
        }
        int i3 = this.LLJJJJLIIL;
        if (i3 != iLIZIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i2 == iLIZIZ2) {
            z3 = false;
        }
        if (!z && !z2 && !z3) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = iZo;
        this.LLJJJJLIIL = iLIZIZ;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = iLIZIZ2;
            C786410Ut5.W5(view, marginLayoutParams2);
            C20522315Sb c20522315Sb = this.LLJIJIL;
            if (c20522315Sb != null) {
                ViewGroup.LayoutParams layoutParams3 = c20522315Sb.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams3.topMargin = 0;
                    C786410Ut5.W5(c20522315Sb, marginLayoutParams3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            int i4 = iLIZIZ + iZo;
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + i4;
            C1086520eNe c1086520eNeGo = Go();
            c1086520eNeGo.setPaddingRelative(c1086520eNeGo.getPaddingStart(), iLIZIZ3, c1086520eNeGo.getPaddingEnd(), c1086520eNeGo.getPaddingBottom());
            C20522315Sb c20522315Sb2 = this.LLJIJIL;
            if (c20522315Sb2 != null) {
                c20522315Sb2.setOverScrollMode(EnumC19356710o9.ONLY_TOP);
            }
            View view2 = this.LLJJJ;
            if (view2 != null) {
                view2.setClipBounds(new Rect(0, iZo, view2.getWidth(), view2.getHeight()));
            }
            Bp(this.LLJJJJJIL);
            if (this.LLJJL == null) {
                this.LLJJL = null;
                this.LLJJJJJIL = 0;
                C786410Ut5.ed(view, 0.0f);
                AsS38S0200000_31 asS38S0200000_31 = new AsS38S0200000_31(view, this, 1);
                this.LLJJL = asS38S0200000_31;
                Go().addOnScrollListener(asS38S0200000_31);
            }
            C20522315Sb c20522315Sb3 = this.LLJIJIL;
            if (c20522315Sb3 != null) {
                c20522315Sb3.setBallOffset(i4);
            }
            C20522315Sb c20522315Sb4 = this.LLJIJIL;
            if (c20522315Sb4 != null) {
                c20522315Sb4.setBallPullThreshold(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            }
            if (i3 == 0 && (adapter = Go().getAdapter()) != null && adapter.getItemCount() > 0) {
                RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
                if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
                    staggeredGridLayoutManager.scrollToPositionWithOffset(0, 0);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.ExplorePowerListAbility
    public final void VP(long j, String str) {
        Long l;
        C15V2 c15v2Ja = ja();
        if (c15v2Ja != null && (l = c15v2Ja.LIZIZ) != null && j == l.longValue()) {
            ip().NQ2(str);
        }
    }

    public final void Vo(View view, ExploreTopBannerData exploreTopBannerData) {
        String string;
        View viewFindViewById;
        View viewFindViewById2;
        TextView textView = (TextView) view.findViewById(R.id.hhy);
        if (textView != null) {
            textView.setText(exploreTopBannerData.title);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.hhv);
        if (textView2 != null) {
            textView2.setText(exploreTopBannerData.subtitle);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.hhy);
        if (tuxTextView != null && (viewFindViewById = view.findViewById(R.id.hhx)) != null && (viewFindViewById2 = view.findViewById(R.id.hht)) != null) {
            tuxTextView.addOnLayoutChangeListener(new C0IDX(tuxTextView, this, viewFindViewById, viewFindViewById2, 2));
        }
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.hhw);
        Drawable drawable = null;
        if (smartImageView != null) {
            String str = exploreTopBannerData.iconUrl;
            if (str == null || (string = a0.LJLIIIL(str).toString()) == null) {
                string = "";
            }
            if (string.length() > 0) {
                final View viewFindViewById3 = view.findViewById(R.id.hhx);
                final int i = (int) (40 * view.getResources().getDisplayMetrics().density);
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(string)));
                c1331670kl3LJIIJ.LJJIJL(smartImageView.getContext());
                c1331670kl3LJIIJ.LJJ(smartImageView);
                c1331670kl3LJIIJ.LJIIJ(new AbstractC1335900krs() { // from class: X.0GnG
                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view2, Throwable th) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view2, C428600GrK c428600GrK, Animatable animatable) {
                        if (c428600GrK != null) {
                            int i2 = c428600GrK.LIZ;
                            int i3 = c428600GrK.LIZIZ;
                            if (i2 > 0 && i3 > 0 && viewFindViewById3 != null) {
                                int i4 = i;
                                int i5 = (int) ((i2 / i3) * i4);
                                View view3 = viewFindViewById3;
                                HandlerHook.viewPost(view3, new ARunnableS2S0102000_6(view3, i5, i4, 0));
                            }
                        }
                    }
                });
            }
        }
        C786410Ut5.I7(new AbS516S0200000_31(exploreTopBannerData, view, 0), view);
        if ((view.getContext().getResources().getConfiguration().uiMode & 48) == 32) {
            final DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
            drawable = new Drawable(displayMetrics) { // from class: X.0Eai
                public final float LIZ;
                public final float LIZIZ;
                public final int[] LIZJ;
                public final float[] LIZLLL;
                public final Paint LJ;
                public final RectF LJFF;

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
                    return -3;
                }

                {
                    float f = displayMetrics.density;
                    this.LIZ = 16.0f * f;
                    float f2 = f * 0.5f;
                    this.LIZIZ = f2;
                    this.LIZJ = new int[]{1728053247, 16777215, 16777215, 452984831};
                    this.LIZLLL = new float[]{0.0212f, 0.6f, 0.72f, 0.9302f};
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(f2);
                    this.LJ = paint;
                    this.LJFF = new RectF();
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    RectF rectF = this.LJFF;
                    float f = this.LIZ;
                    canvas.drawRoundRect(rectF, f, f, this.LJ);
                }

                @Override // android.graphics.drawable.Drawable
                public final void onBoundsChange(Rect rect) {
                    super.onBoundsChange(rect);
                    float fWidth = rect.width();
                    float fHeight = rect.height();
                    if (fWidth > 0.0f && fHeight > 0.0f) {
                        float f = this.LIZIZ / 2.0f;
                        this.LJFF.set(rect.left + f, rect.top + f, rect.right - f, rect.bottom - f);
                        double radians = Math.toRadians(156.52d);
                        float fSin = (float) Math.sin(radians);
                        float fCos = (float) Math.cos(radians);
                        float f2 = fWidth / 2.0f;
                        float f3 = fHeight / 2.0f;
                        float fAbs = (Math.abs(fSin) * f2) + (Math.abs(fCos) * f3);
                        float f4 = rect.left + f2;
                        float f5 = rect.top + f3;
                        float f6 = fSin * fAbs;
                        float f7 = (-fCos) * fAbs;
                        this.LJ.setShader(new LinearGradient(f4 - f6, f5 - f7, f4 + f6, f5 + f7, this.LIZJ, this.LIZLLL, Shader.TileMode.CLAMP));
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i2) {
                    this.LJ.setAlpha(i2);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                    this.LJ.setColorFilter(colorFilter);
                }
            };
        }
        view.setForeground(drawable);
    }

    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void ck1(String str, AwS412S0200000_11 awS412S0200000_11) {
        C23250099c.LIZLLL(ip().getAssemVMScope(), C0PEM.LIZJ, null, new C05DG(str, awS412S0200000_11, null), 2);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
        if ((layoutManager instanceof ExploreStaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
            staggeredGridLayoutManager.LJJJ(2);
            Go().invalidateItemDecorations();
            AbstractC21673619ry adapter = Go().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility
    public final void Fh0(C20526015Tm c20526015Tm, final ViewGroup viewGroup, ExploreFeedCell exploreFeedCell) {
        Object uid;
        String uid2;
        String string;
        String string2;
        String string3;
        User author;
        User currentUser;
        C15SN c15sn = (C15SN) ip().getState();
        c15sn.getClass();
        if (c15sn.getListState().LL instanceof C1623706Xj) {
            return;
        }
        ViewParent parent = viewGroup.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
            uid = -1;
        }
        Aweme aweme = c20526015Tm.LL;
        String str = "";
        if (aweme == null || (author = aweme.getAuthor()) == null || (uid2 = author.getUid()) == null) {
            uid2 = "";
        }
        String aid = c20526015Tm.LL.getAid();
        if (aid == null) {
            aid = "";
        }
        final String strV5 = exploreFeedCell.V5();
        if (Intrinsics.LJFF(uid, uid2)) {
            return;
        }
        if (dp() != null && !BaseExploreFeedFragment.iS(viewGroup)) {
            return;
        }
        C20532515Vz.LIZ(new C725950Sdl(aid, uid2, strV5));
        Context context = getContext();
        if (context == null || (string = context.getString(2131839831)) == null) {
            string = "";
        }
        C443090HZb c443090HZb = new C443090HZb(string, new AwS275S0300000_31(c20526015Tm, viewGroup, this, 22), R.raw.icon_flag, null, 0, null, 0, false, false, null, 1016);
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = C341940Daq.LIZ(-6.0d);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            int height = c19egLIZ.getWindow().getDecorView().getHeight();
            View viewLIZ = C1570830qyn.LIZ(c19egLIZ);
            if (viewLIZ == null) {
                viewLIZ = c19egLIZ.findViewById(R.id.nwe);
            }
            int[] iArr = new int[2];
            viewLIZ.getLocationInWindow(iArr);
            c118300cf.element += height - iArr[1];
        }
        Context context2 = getContext();
        if (context2 == null || (string2 = context2.getString(2131839830)) == null) {
            string2 = "";
        }
        C443090HZb c443090HZb2 = new C443090HZb(string2, new AwS275S0300000_31(c20526015Tm, this, c118300cf, 21), R.raw.icon_heart_broken, null, 0, null, 0, false, false, null, 1016);
        Context context3 = getContext();
        if (context3 != null && (string3 = context3.getString(2131839829)) != null) {
            str = string3;
        }
        List listSingletonList = Collections.singletonList(C1697810uHb.LJIIJJI(c443090HZb2, new C443090HZb(str, new AwS275S0300000_31(c20526015Tm, this, c118300cf, 20), R.raw.icon_person_x_mark, null, 0, null, 0, false, false, null, 1016), c443090HZb));
        C0HWQ c0hwq = new C0HWQ(viewGroup.getContext());
        c0hwq.LJIIL(listSingletonList);
        c0hwq.LLJ = true;
        int iLIZ = C341940Daq.LIZ(0.0d);
        C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
        c1391600mJi.LJFF = iLIZ;
        c1391600mJi.LIZIZ = viewGroup;
        int iLIZ2 = C341940Daq.LIZ(5.0d);
        C1391600mJi c1391600mJi2 = c0hwq.LLILLJJLI;
        c1391600mJi2.LJIIIIZZ = iLIZ2;
        c1391600mJi2.LJIIL = false;
        c1391600mJi2.LJII = -1001L;
        c1391600mJi2.LIZLLL = EnumC1235690iGF.BOTTOM;
        c0hwq.LLILZLL = (ViewGroup) viewGroup.getRootView();
        C0P0T c0p0tLIZIZ = c0hwq.LIZIZ();
        c0p0tLIZIZ.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.15SZ
            @Override // X.InterfaceC1340660kzY
            public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                this.LIZ.Oo(viewGroup);
                this.LIZ.LLJJ = false;
                ViewParent parent2 = viewGroup.getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                if ((abstractC1391670mJp instanceof C1391690mJr) && !this.LIZ.LLJJI) {
                    C20532515Vz.LIZ(new C1565410qq3(strV5));
                }
                this.LIZ.LLJJIII = null;
            }
        });
        if (this.LLJJ) {
            return;
        }
        this.LLJJ = true;
        this.LLJJI = false;
        this.LLJJIII = c0p0tLIZIZ;
        c0p0tLIZIZ.show();
        No(viewGroup);
    }
}
