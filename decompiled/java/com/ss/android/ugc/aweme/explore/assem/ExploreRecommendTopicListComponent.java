package com.ss.android.ugc.aweme.explore.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C036E;
import X.C0BK4;
import X.C0GS8;
import X.C0H62;
import X.C0HTI;
import X.C0HU6;
import X.C0O0L;
import X.C1057450dcl;
import X.C1086520eNe;
import X.C1220000hqw;
import X.C1342130l1v;
import X.C1389890mGx;
import X.C13LE;
import X.C1558520qew;
import X.C15SN;
import X.C15TA;
import X.C15V2;
import X.C1623606Xi;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1844860y6m;
import X.C19719912Dl;
import X.C20515215Pi;
import X.C20521215Rq;
import X.C20521515Rt;
import X.C20603715jn;
import X.C20673315v1;
import X.C20673415v2;
import X.C21647019ng;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C292320Bd0;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C627260Oiy;
import X.C720620SOm;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC696450RTn;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS165S0100000_31;
import Y.AObserverS233S0100000_31;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS5S2100000_11;
import Y.ARunnableS75S0200000_6;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility;
import com.ss.android.ugc.aweme.explore.ability.FirstScreenCheckingAbility;
import com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility;
import com.ss.android.ugc.aweme.explore.common.ExploreStaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.explore.scope.ExploreFeedComponentScope;
import com.ss.android.ugc.aweme.explore.scope.ExploreFragmentContainerScope;
import com.ss.android.ugc.aweme.explore.ui.container.BaseExploreFeedFragment;
import com.ss.android.ugc.aweme.explore.vm.ExploreRecommendTopicListViewModel;
import com.ss.android.ugc.aweme.explore.vm.ExploreTopicFeedSharedVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS113S0110000_27;
import kotlin.jvm.internal.AwS117S0110000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreRecommendTopicListComponent extends ExploreTopicGeneralFeedListComponent implements C0H62 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLILI;
    public static final C0HU6 LLLLJ;
    public static final C0HU6 LLLLJI;
    public static final C0HU6 LLLLL;
    public static final int LLLLLIL;
    public int LLLII;
    public long LLLIIII;
    public C20515215Pi LLLIIIL;
    public boolean LLLIILIL;
    public final C736950SvV LLLILZLLLI;
    public final AssemVMLazy LLLIZZ;
    public final List<C21647019ng> LLLJ;
    public final int LLLJIL;
    public final int LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public C21647019ng LLLLIIIILLL;
    public boolean LLLLIIL;
    public C1389890mGx LLLLIILL;
    public C0GS8 LLLLIILLL;
    public final C01GW LLLLIL;
    public final AObserverS233S0100000_31 LLLI = new AObserverS233S0100000_31(this, 15);
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(165));
    public final ARunnableS131S0100000_31 LLLIIL = new ARunnableS131S0100000_31(this, 55);
    public long LLLIL = 10000;
    public final C01GW LLLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 570));
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 571));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ExploreRecommendTopicListComponent.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/explore/vm/ExploreRecommendTopicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLLILI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLJ = new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(32.31f));
        LLLLJI = new C0HU6(new C1342130l1v(438.65f), new C1342130l1v(29.32f));
        LLLLL = new C0HU6(new C1342130l1v(194.96f), new C1342130l1v(25.13f));
        LLLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent
    public final void kp() {
        Long l;
        C15V2 c15v2Ja = ja();
        String string = (c15v2Ja == null || (l = c15v2Ja.LIZIZ) == null) ? null : l.toString();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            C20521215Rq c20521215RqEk = Ek();
            sbLIZ.append(c20521215RqEk != null ? c20521215RqEk.LIZ : null);
            C1558520qew.LJI(fragmentLJI, ExploreFeedComponentScope.class, this, FirstScreenCheckingAbility.class, this, C2188811AlT.LIZIZ(sbLIZ));
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(string);
            C20521215Rq c20521215RqEk2 = Ek();
            sbLIZ2.append(c20521215RqEk2 != null ? c20521215RqEk2.LIZ : null);
            C1558520qew.LJI(fragmentLJI2, ExploreFragmentContainerScope.class, this, MiddleBridgeCellAbility.class, this, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent
    public final void sp() {
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent
    public final void tp() {
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.15Rp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C15SN c15sn = (C15SN) obj;
                c15sn.getClass();
                return C627260Oiy.LIZLLL(c15sn);
            }
        }, this, null, new AwS610S0100000_31(this, 162), new AwS575S0100000_31(this, 575), new AwS610S0100000_31(this, 164), 4, null);
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent
    public final void up() {
        super.up();
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.15Rs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C15SN c15sn = (C15SN) obj;
                c15sn.getClass();
                return C627260Oiy.LIZ(c15sn);
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 106), 4);
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent
    public final void zp() {
    }

    public ExploreRecommendTopicListComponent() {
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 569);
        this.LLLILZLLLI = new C736950SvV(C13LE.LIZ(ExploreTopicFeedSharedVM.class), awS575S0100000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(85), new AwS575S0100000_31((AbstractC738140SxQ) this, 574), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ExploreRecommendTopicListViewModel.class);
        this.LLLIZZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS575S0100000_31(c19719912DlLIZ, 573), AFwS276S0000000_31.get$arr$(84), null, true);
        this.LLLJ = new ArrayList();
        this.LLLJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
        this.LLLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        this.LLLL = true;
        this.LLLLII = true;
        this.LLLLIIL = true;
        this.LLLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 572));
    }

    public final void Fp() {
        ViewGroup viewGroup;
        View view = (View) this.LLLLIL.getValue();
        if (view == null || (viewGroup = (ViewGroup) LJJIJL().getRootView().findViewById(R.id.content)) == null) {
            return;
        }
        viewGroup.addView(view);
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent, com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = ExploreRecommendTopicFooterCell.class;
        c20603715jn.LIZ = ((Number) C0BK4.LIZ.getValue()).intValue();
        c20603715jn.LJI = C292320Bd0.LIZ > 0;
        c20603715jn.LJIIIZ = "homepage_explore_topic_sheet";
        return c20603715jn;
    }

    public final ExploreManageTabAbility Vp() {
        return (ExploreManageTabAbility) this.LLLILZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent
    public final C1722300uv6 bp() {
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = com.zhiliaoapp.musically.R.drawable.nl;
        Drawable drawableLIZ = c0hti.LIZ(Jp());
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        c1722300uv6.LJIIIIZZ = Jp().getString(2131829437);
        c1722300uv6.LJIIIZ = new AwS606S0100000_27(this, 100);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        return c1722300uv6;
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent
    /* JADX INFO: renamed from: dq, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ExploreRecommendTopicListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLLIZZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLILI;
        return (ExploreRecommendTopicListViewModel) assemVMLazy.getValue();
    }

    public final void fq() {
        if (this.LLLLIIL) {
            this.LLLLIIL = false;
            C15TA c15ta = C15TA.LIZ;
            final String strQp = Qp();
            final String strValueOf = String.valueOf(Tp());
            C20521215Rq c20521215RqEk = Ek();
            final String str = c20521215RqEk != null ? c20521215RqEk.LIZIZ : null;
            c15ta.getClass();
            C15TA.LJIILL(new Runnable() { // from class: X.0RTh
                public final void LIZ() {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C15TA c15ta2 = C15TA.LIZ;
                    String str2 = strValueOf;
                    String str3 = strQp;
                    c15ta2.getClass();
                    c2344009Gk.LJIIIIZZ("explore_topic", C15TA.LIZIZ(str2, str3));
                    c2344009Gk.LJIIIIZZ("explore_topic_id", strValueOf);
                    c2344009Gk.LJIIIIZZ("post_num", str);
                    c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                    C20684815ws.LJIILLIIL("ttexp_topic_popup_page_enter", c2344009Gk.LIZ);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ExploreMobUtils@18af.logTopicPopupPageEnter$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicPopupPageEnter$1");
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean jq() {
        if (!this.LLLL) {
            return false;
        }
        C15SN c15sn = (C15SN) Jo().getState();
        c15sn.getClass();
        if (!(C627260Oiy.LIZLLL(c15sn) instanceof C1623606Xi) || this.LLLIILIL) {
            return false;
        }
        ExploreManageTabAbility exploreManageTabAbilityVp = Vp();
        if (exploreManageTabAbilityVp != null) {
            if (exploreManageTabAbilityVp.lT1(Tp(), Qp())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Iterator it2 = ((ArrayList) this.LLLJ).iterator();
        while (it2.hasNext()) {
            ((C21647019ng) it2.next()).LIZ();
        }
        ExploreManageTabAbility exploreManageTabAbilityVp = Vp();
        if (exploreManageTabAbilityVp != null) {
            if (exploreManageTabAbilityVp.lT1(Tp(), Qp())) {
                MiddleBridgeCellAbility middleBridgeCellAbility = (MiddleBridgeCellAbility) this.LLLILZJ.getValue();
                if (middleBridgeCellAbility != null) {
                    middleBridgeCellAbility.wY1(Tp(), Qp());
                }
                ExploreManageTabAbility exploreManageTabAbilityVp2 = Vp();
                if (exploreManageTabAbilityVp2 != null) {
                    exploreManageTabAbilityVp2.mp2();
                }
            }
        }
        C720620SOm.LIZ.removeObserver(this.LLLI);
        ExploreManageTabAbility exploreManageTabAbilityVp3 = Vp();
        if (exploreManageTabAbilityVp3 != null) {
            exploreManageTabAbilityVp3.GD(null);
        }
        super.onDestroy();
    }

    public final void tq() {
        ViewGroup viewGroup;
        View view = (View) this.LLLLIL.getValue();
        if (view == null || (viewGroup = (ViewGroup) LJJIJL().getRootView().findViewById(R.id.content)) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(view, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent
    public final void Ap() throws IllegalAccessException {
        Long l;
        Long l2;
        ExploreManageTabAbility exploreManageTabAbilityVp = Vp();
        if (exploreManageTabAbilityVp != null) {
            if (exploreManageTabAbilityVp.lT1(Tp(), Qp())) {
                return;
            }
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C15V2 c15v2Ja = ja();
            sbLIZ.append((c15v2Ja == null || (l2 = c15v2Ja.LIZIZ) == null) ? null : l2.toString());
            C20521215Rq c20521215RqEk = Ek();
            sbLIZ.append(c20521215RqEk != null ? c20521215RqEk.LIZ : null);
            C1558520qew.LJIIJ(fragmentLJI, ExploreFeedComponentScope.class, FirstScreenCheckingAbility.class, C2188811AlT.LIZIZ(sbLIZ));
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            C15V2 c15v2Ja2 = ja();
            sbLIZ2.append((c15v2Ja2 == null || (l = c15v2Ja2.LIZIZ) == null) ? null : l.toString());
            C20521215Rq c20521215RqEk2 = Ek();
            sbLIZ2.append(c20521215RqEk2 != null ? c20521215RqEk2.LIZ : null);
            C1558520qew.LJIIJ(fragmentLJI2, ExploreFragmentContainerScope.class, MiddleBridgeCellAbility.class, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final Context Jp() {
        Context context = getContext();
        return context == null ? LJJIJL().getContext() : context;
    }

    public final String Qp() {
        String str;
        C15V2 c15v2Ja = ja();
        return (c15v2Ja == null || (str = c15v2Ja.LIZ) == null) ? "" : str;
    }

    public final long Tp() {
        Long l;
        C15V2 c15v2Ja = ja();
        if (c15v2Ja == null || (l = c15v2Ja.LIZIZ) == null) {
            return -1L;
        }
        return l.longValue();
    }

    public final ConstraintLayout Up() {
        return (ConstraintLayout) LJJIJL().findViewById(com.zhiliaoapp.musically.R.id.kvo);
    }

    public final ConstraintLayout Wp() {
        return (ConstraintLayout) LJJIJL().findViewById(com.zhiliaoapp.musically.R.id.hhf);
    }

    public final TuxIconView Xp() {
        return (TuxIconView) LJJIJL().findViewById(com.zhiliaoapp.musically.R.id.qgh);
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent
    public final C1722300uv6 ap() {
        Context contextJp = Jp();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = com.zhiliaoapp.musically.R.drawable.n4;
        Drawable drawableLIZ = c0hti.LIZ(contextJp);
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        c1722300uv6.LJIIIIZZ = contextJp.getString(2131829896);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        return c1722300uv6;
    }

    public final TuxTextView aq() {
        return (TuxTextView) LJJIJL().findViewById(com.zhiliaoapp.musically.R.id.qgy);
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent
    public final BaseExploreFeedFragment dp() {
        Fragment parentFragment;
        Fragment parentFragment2;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        Fragment parentFragment3 = (fragmentLJI == null || (parentFragment = fragmentLJI.getParentFragment()) == null || (parentFragment2 = parentFragment.getParentFragment()) == null) ? null : parentFragment2.getParentFragment();
        if (parentFragment3 instanceof BaseExploreFeedFragment) {
            return (BaseExploreFeedFragment) parentFragment3;
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        DialogFragment dialogFragment;
        Dialog dialog;
        Window window;
        super.onPause();
        MutableLiveData<String> mutableLiveData = C720620SOm.LIZ;
        if (mutableLiveData.getValue() != null) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            Fragment parentFragment = fragmentLJI != null ? fragmentLJI.getParentFragment() : null;
            if ((parentFragment instanceof TuxSheet) && (dialogFragment = (DialogFragment) parentFragment) != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
                window.setDimAmount(0.0f);
            }
            mutableLiveData.observeForever(this.LLLI);
        }
        C036E.LIZ.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C036E.LIZ.LIZ(this);
    }

    public final void qq() {
        ViewGroup viewGroup;
        if (jq()) {
            this.LLLIILIL = true;
            ((Handler) this.LLLIIIIL.getValue()).removeCallbacks(this.LLLIIL);
            View viewLJJIJL = LJJIJL();
            if (!(viewLJJIJL instanceof ViewGroup) || (viewGroup = (ViewGroup) viewLJJIJL) == null || C724240Sb0.LJI(this) == null) {
                return;
            }
            C20515215Pi c20515215Pi = new C20515215Pi(viewGroup);
            c20515215Pi.LIZ.LJFF = Jp().getString(2131829898);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = com.zhiliaoapp.musically.R.raw.icon_pin;
            c419910GdJ.LJ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.a1k);
            c20515215Pi.LJFF(c419910GdJ);
            c20515215Pi.LIZ.LJI = LJJIJL().getContext().getString(2131829900);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            C1057450dcl c1057450dcl = c20515215Pi.LIZ;
            c1057450dcl.LJIIIZ = iLIZIZ;
            c1057450dcl.LJIIIIZZ = 0;
            C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
            c1057450dcl2.LJIIJ = 0;
            c1057450dcl2.LIZJ = false;
            c1057450dcl2.LJIILL = true;
            c1057450dcl2.LJIIJJI = new View.OnClickListener() { // from class: X.15Ru
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            };
            c1057450dcl2.LJIILIIL = new ACListenerS165S0100000_31(this, 68);
            c20515215Pi.LIZ.LJIILJJIL = new AwS610S0100000_31(this, 159);
            this.LLLIIIL = c20515215Pi;
            c20515215Pi.LJ();
            C15TA c15ta = C15TA.LIZ;
            C15V2 c15v2Ja = ja();
            Long l = c15v2Ja != null ? c15v2Ja.LIZIZ : null;
            C15V2 c15v2Ja2 = ja();
            String str = c15v2Ja2 != null ? c15v2Ja2.LIZ : null;
            C20521215Rq c20521215RqEk = Ek();
            String str2 = c20521215RqEk != null ? c20521215RqEk.LIZIZ : null;
            c15ta.getClass();
            C15TA.LJIILL(new ARunnableS5S2100000_11(l, str, str2, 1));
        }
    }

    public final void Gp(boolean z) {
        float f;
        View viewFindViewById;
        if (z == this.LLLLII) {
            return;
        }
        C21647019ng c21647019ng = this.LLLLIIIILLL;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
        View viewFindViewById2 = LJJIJL().findViewById(com.zhiliaoapp.musically.R.id.yet);
        if (viewFindViewById2 == null) {
            return;
        }
        this.LLLLII = z;
        int i = this.LLLII - LLLLLIL;
        float alpha = viewFindViewById2.getAlpha();
        if (!z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        C20673415v2 c20673415v2 = new C20673415v2(null, null, Float.valueOf(alpha), Float.valueOf(f), null, null, null, null, null, null, 4047);
        if (!z && (viewFindViewById = LJJIJL().findViewById(com.zhiliaoapp.musically.R.id.uqb)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        C20673315v1 c20673315v1 = C20673315v1.LIZ;
        Context contextJp = Jp();
        C0HU6 c0hu6 = LLLLJ;
        C1844860y6m c1844860y6m = new C1844860y6m(z, this, i);
        AwS113S0110000_27 awS113S0110000_27 = new AwS113S0110000_27(z, this, 1);
        c20673315v1.getClass();
        C21647019ng c21647019ngLIZ = C20673315v1.LIZ("topic_info_animation_tag", contextJp, viewFindViewById2, c0hu6, c20673415v2, c1844860y6m, awS113S0110000_27);
        this.LLLLIIIILLL = c21647019ngLIZ;
        if (c21647019ngLIZ != null) {
            c21647019ngLIZ.LJI(true);
        }
    }

    public final void Ip(boolean z) {
        View viewFindViewById;
        TuxTextView tuxTextViewAq;
        float f = 1.0f;
        float f2 = 0.0f;
        if (!z) {
            f2 = 1.0f;
            f = 0.0f;
        }
        TuxIconView tuxIconViewXp = Xp();
        if (tuxIconViewXp == null || (viewFindViewById = LJJIJL().findViewById(com.zhiliaoapp.musically.R.id.unpin_icon)) == null || (tuxTextViewAq = aq()) == null) {
            return;
        }
        C20673415v2 c20673415v2 = new C20673415v2(null, null, Float.valueOf(f), Float.valueOf(f2), null, null, null, null, null, null, 4047);
        C20673415v2 c20673415v22 = new C20673415v2(null, null, Float.valueOf(f2), Float.valueOf(f), null, null, null, null, null, null, 4047);
        C20673315v1 c20673315v1 = C20673315v1.LIZ;
        Context contextJp = Jp();
        C0HU6 c0hu6 = LLLLJ;
        AwS113S0110000_27 awS113S0110000_27 = new AwS113S0110000_27(z, this, 2);
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 160);
        c20673315v1.getClass();
        C21647019ng c21647019ngLIZ = C20673315v1.LIZ("pin_icon_animation_tag", contextJp, tuxIconViewXp, c0hu6, c20673415v2, awS113S0110000_27, awS610S0100000_31);
        if (c21647019ngLIZ != null) {
            ((ArrayList) this.LLLJ).add(c21647019ngLIZ);
        }
        Context contextJp2 = Jp();
        AwS117S0110000_31 awS117S0110000_31 = new AwS117S0110000_31(z, this, 4);
        c20673315v1.getClass();
        C21647019ng c21647019ngLIZ2 = C20673315v1.LIZ("unpin_icon_animation_tag", contextJp2, viewFindViewById, c0hu6, c20673415v22, null, awS117S0110000_31);
        if (c21647019ngLIZ2 != null) {
            ((ArrayList) this.LLLJ).add(c21647019ngLIZ2);
        }
        Context contextJp3 = Jp();
        AwS610S0100000_31 awS610S0100000_312 = new AwS610S0100000_31(this, 161);
        c20673315v1.getClass();
        C21647019ng c21647019ngLIZ3 = C20673315v1.LIZ("unpin_icon_animation_tag", contextJp3, tuxTextViewAq, c0hu6, c20673415v2, null, awS610S0100000_312);
        if (c21647019ngLIZ3 != null) {
            ((ArrayList) this.LLLJ).add(c21647019ngLIZ3);
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent
    public final void No(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View viewFindViewById;
        C1086520eNe c1086520eNeLP2;
        ExploreStaggeredGridLayoutManager exploreStaggeredGridLayoutManager;
        MiddleBridgeCellAbility middleBridgeCellAbility = (MiddleBridgeCellAbility) this.LLLILZJ.getValue();
        C0GS8 c0gs8 = null;
        if (middleBridgeCellAbility != null && (c1086520eNeLP2 = middleBridgeCellAbility.lP2()) != null) {
            RecyclerView.LayoutManager layoutManager = c1086520eNeLP2.getLayoutManager();
            if ((layoutManager instanceof ExploreStaggeredGridLayoutManager) && (exploreStaggeredGridLayoutManager = (ExploreStaggeredGridLayoutManager) layoutManager) != null) {
                exploreStaggeredGridLayoutManager.LLJJLIIIJLLLLLLLZ = false;
            }
        }
        View rootView = viewGroup.getRootView();
        if (rootView != null && (viewGroup2 = (ViewGroup) rootView.findViewById(R.id.content)) != null && (viewFindViewById = viewGroup2.findViewById(com.zhiliaoapp.musically.R.id.v4a)) != null) {
            Context context = getContext();
            if (context != null) {
                c0gs8 = new C0GS8(context);
            }
            this.LLLLIILLL = c0gs8;
            C0GS8 c0gs82 = this.LLLLIILLL;
            if (c0gs82 != null) {
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gs82);
                c0gs82.setLayoutParams(layoutParams);
                c0gs82.setBackgroundColor(0);
                Rect rectIq = iq(viewGroup, viewGroup2);
                Rect rectIq2 = iq(viewFindViewById, viewGroup2);
                rectIq.top = Math.max(rectIq.top, rectIq2.top);
                rectIq.bottom = Math.min(rectIq.bottom, rectIq2.bottom);
                c0gs82.setHoleRect$explore_release(rectIq);
                viewGroup2.addView(c0gs82);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gs82);
                c0gs82.setAlpha(0.0f);
                c0gs82.animate().alpha(0.9f).setDuration(150L).start();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent
    public final void Oo(View view) {
        C1086520eNe c1086520eNeLP2;
        ExploreStaggeredGridLayoutManager exploreStaggeredGridLayoutManager;
        MiddleBridgeCellAbility middleBridgeCellAbility = (MiddleBridgeCellAbility) this.LLLILZJ.getValue();
        if (middleBridgeCellAbility != null && (c1086520eNeLP2 = middleBridgeCellAbility.lP2()) != null) {
            RecyclerView.LayoutManager layoutManager = c1086520eNeLP2.getLayoutManager();
            if ((layoutManager instanceof ExploreStaggeredGridLayoutManager) && (exploreStaggeredGridLayoutManager = (ExploreStaggeredGridLayoutManager) layoutManager) != null) {
                exploreStaggeredGridLayoutManager.LLJJLIIIJLLLLLLLZ = true;
            }
        }
        C0GS8 c0gs8 = this.LLLLIILLL;
        if (c0gs8 != null) {
            c0gs8.animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS75S0200000_6(c0gs8, this, 35)).start();
        }
    }

    public final void kq(boolean z) {
        C1722300uv6 c1722300uv6Ap;
        int marginStart;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1749280vcc c1749280vcc = this.LLJILJIL;
        if (c1749280vcc != null) {
            int marginEnd = 0;
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            C786410Ut5.S(Go(), 8);
            C1086520eNe c1086520eNeHp = Go();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1086520eNeHp);
            c1086520eNeHp.setScaleX(0.0f);
            C1086520eNe c1086520eNeHp2 = Go();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1086520eNeHp2);
            c1086520eNeHp2.setScaleY(0.0f);
            if (z) {
                c1722300uv6Ap = bp();
            } else {
                c1722300uv6Ap = ap();
            }
            c1749280vcc.setStatus(c1722300uv6Ap);
            View viewFindViewById = c1749280vcc.findViewById(com.zhiliaoapp.musically.R.id.w2c);
            if (viewFindViewById != null) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                } else {
                    marginStart = 0;
                }
                Integer numValueOf = Integer.valueOf(marginStart);
                ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    i = marginLayoutParams.topMargin;
                } else {
                    i = 0;
                }
                Integer numValueOf2 = Integer.valueOf(i);
                ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
                }
                C426750GoL.LJIIIZ(viewFindViewById, numValueOf, numValueOf2, Integer.valueOf(marginEnd), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(144))), false, 16);
            }
        }
    }

    public final void lq(boolean z) {
        int i;
        if (z) {
            i = com.zhiliaoapp.musically.R.attr.a1h;
            ConstraintLayout constraintLayoutWp = Wp();
            if (constraintLayoutWp != null) {
                C786410Ut5.I7(new C20521515Rt(this, EnumC696450RTn.TOP.getValue()), constraintLayoutWp);
            }
        } else {
            i = com.zhiliaoapp.musically.R.attr.a1k;
            ConstraintLayout constraintLayoutWp2 = Wp();
            if (constraintLayoutWp2 != null) {
                C786410Ut5.Y7(constraintLayoutWp2, null);
            }
        }
        TuxTextView tuxTextViewAq = aq();
        if (tuxTextViewAq != null) {
            tuxTextViewAq.setTextColorRes(i);
        }
        TuxIconView tuxIconViewXp = Xp();
        if (tuxIconViewXp != null) {
            tuxIconViewXp.setTintColorRes(i);
        }
        Context contextJp = Jp();
        try {
            ConstraintLayout constraintLayoutWp3 = Wp();
            if (constraintLayoutWp3 != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.a03);
                c384050F3z.LIZJ = Float.valueOf(contextJp.getResources().getDimension(com.zhiliaoapp.musically.R.dimen.b4));
                constraintLayoutWp3.setBackground(c384050F3z.LIZ(contextJp));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[PHI: r0
      0x0051: PHI (r0v27 java.lang.Integer) = (r0v26 java.lang.Integer), (r0v35 java.lang.Integer) binds: [B:10:0x0027, B:20:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent, com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.assem.ExploreRecommendTopicListComponent.onViewCreated(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pq(java.lang.String r41) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.assem.ExploreRecommendTopicListComponent.pq(java.lang.String):void");
    }

    public final Rect iq(View view, ViewGroup viewGroup) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    @Override // X.C0H62
    public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
        if (c0o0l != c0o0l2) {
            if (c0o0l2 == C0O0L.AVAILABLE) {
                this.LLLL = true;
                lq(true);
            } else {
                this.LLLL = false;
                lq(false);
            }
        }
    }
}
