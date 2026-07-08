package com.ss.android.ugc.now.interaction.ui;

import X.AbstractC480470Isn;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0QSJ;
import X.C0XQ7;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C128Y;
import X.C1349760lEE;
import X.C1353070lJZ;
import X.C1383090m5z;
import X.C1402280maw;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C19YK;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C799570VYd;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1352360lIQ;
import X.InterfaceC1352370lIR;
import X.InterfaceC1352410lIV;
import X.InterfaceC1352430lIX;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS97S0000000_21;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.now.interaction.InteractionFragmentScope;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import com.ss.android.ugc.now.interaction.ui.InteractionFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class InteractionFragment extends AbsFragment implements InterfaceC1352370lIR, InterfaceC724530SbT, C0QSJ, InterfaceC1146704e9 {
    public static long LLJJJ = 0;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZisjPmE6JjEpOyHELIOS4wPCwjJ2EmIWsFJzs2OiQvPSY8JgM+KCg+LSs4";
    public C1353070lJZ LL;
    public Aweme LLILLJJLI;
    public TuxIconView LLILLL;
    public View LLILZ;
    public ViewGroup LLILZIL;
    public ViewPager LLILZLL;
    public C19YK LLIZ;
    public View LLIZLLLIL;
    public List<AbsFragment> LLJ;
    public List<Integer> LLJIJIL;
    public ViewGroup LLJILJIL;
    public NowFeedMobHierarchyData LLJILJILJ;
    public Integer LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public Comment LLJJIII;
    public String LLJJIJI;
    public int LLJI = -1;
    public boolean LLJJIJIIJIL = true;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1133));

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{InteractionFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InteractionFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InteractionFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final void show() {
        try {
            Integer num = this.LLJILLL;
            if (num != null) {
                int iIntValue = num.intValue();
                List<Integer> list = this.LLJIJIL;
                if (list != null) {
                    int iIndexOf = ((LinkedList) list).indexOf(Integer.valueOf(iIntValue));
                    this.LLJI = iIndexOf;
                    ViewPager viewPager = this.LLILZLL;
                    if (viewPager != null) {
                        viewPager.setCurrentItem(iIndexOf, false);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
        }
        List<AbsFragment> list2 = this.LLJ;
        if (list2 != null) {
            for (C128Y c128y : list2) {
                if (c128y instanceof InterfaceC1352410lIV) {
                    ((InterfaceC1352410lIV) c128y).lg(this.LLJILJILJ);
                }
            }
        }
        C1353070lJZ c1353070lJZ = this.LL;
        if (c1353070lJZ != null) {
            c1353070lJZ.LIZ("", true, true);
        }
    }

    public final void zB2(int i) {
        int iIndexOf;
        C1383090m5z c1383090m5zLJIIIIZZ;
        C128Y c128y;
        Long lValueOf;
        AwemeStatistics statistics;
        AwemeStatistics statistics2;
        List<Integer> list = this.LLJIJIL;
        if (list != null) {
            iIndexOf = ((LinkedList) list).indexOf(Integer.valueOf(i));
        } else {
            iIndexOf = 0;
        }
        C19YK c19yk = this.LLIZ;
        if (c19yk != null && c19yk.getTabCount() > iIndexOf) {
            Long lValueOf2 = null;
            if (1 != 0 && (c1383090m5zLJIIIIZZ = c19yk.LJIIIIZZ(iIndexOf)) != null) {
                List<AbsFragment> list2 = this.LLJ;
                if (list2 != null) {
                    c128y = (AbsFragment) ListProtector.get(list2, iIndexOf);
                } else {
                    c128y = null;
                }
                InterfaceC1352410lIV interfaceC1352410lIV = (InterfaceC1352410lIV) c128y;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Fragment getTabDisplayTitle ");
                sbLIZ.append(interfaceC1352410lIV);
                sbLIZ.append(' ');
                Aweme aweme = this.LLILLJJLI;
                if (aweme != null && (statistics2 = aweme.getStatistics()) != null) {
                    lValueOf = Long.valueOf(statistics2.getCommentCount());
                } else {
                    lValueOf = null;
                }
                sbLIZ.append(lValueOf);
                sbLIZ.append(' ');
                Aweme aweme2 = this.LLILLJJLI;
                if (aweme2 != null && (statistics = aweme2.getStatistics()) != null) {
                    lValueOf2 = Long.valueOf(statistics.getDiggCount());
                }
                sbLIZ.append(lValueOf2);
                C1349760lEE.LIZ("interaction_page", C2188811AlT.LIZIZ(sbLIZ));
                c1383090m5zLJIIIIZZ.LIZIZ = interfaceC1352410lIV.Nu();
                c1383090m5zLJIIIIZZ.LIZIZ();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void MR(AbsFragment absFragment, int i) {
        InterfaceC1352410lIV interfaceC1352410lIV = (InterfaceC1352410lIV) absFragment;
        interfaceC1352410lIV.dd(this);
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            interfaceC1352410lIV.setAid(aweme.getAid());
            interfaceC1352410lIV.OA(aweme);
            interfaceC1352410lIV.lg(this.LLJILJILJ);
        }
        List<AbsFragment> list = this.LLJ;
        if (list != null) {
            ((LinkedList) list).add(absFragment);
        }
        List<Integer> list2 = this.LLJIJIL;
        if (list2 != null) {
            ((LinkedList) list2).add(Integer.valueOf(i));
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Object obj = (InterfaceC1352360lIQ) this.LLJJIJIL.getValue();
        if (obj != null) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) obj, new C2217381BqS() { // from class: X.0lJD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((InteractionSyncViewModelState) obj2).getLikeState();
                }
            }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 167), 4);
        }
        Object obj2 = (InterfaceC1352360lIQ) this.LLJJIJIL.getValue();
        if (obj2 != null) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) obj2, new C2217381BqS() { // from class: X.0lJA
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj3) {
                    return ((InteractionSyncViewModelState) obj3).getCommentCountState();
                }
            }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 168), 4);
        }
        this.LLJ = new LinkedList();
        this.LLJIJIL = new LinkedList();
        if (this.LLJJIJIIJIL) {
            NowCommentListFragment nowCommentListFragment = new NowCommentListFragment();
            nowCommentListFragment.LLJILJILJ = this.LL;
            nowCommentListFragment.LLJJ = this.LLJJ;
            boolean z = this.LLJJI;
            Comment comment = this.LLJJIII;
            nowCommentListFragment.LLJJI = z;
            nowCommentListFragment.LLJJIII = comment;
            MR(nowCommentListFragment, 0);
        }
        ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        MR(new NowLikeListFragment(), 1);
        ViewPager viewPager = this.LLILZLL;
        if (viewPager != null) {
            final FragmentManager childFragmentManager = getChildFragmentManager();
            final List<AbsFragment> list = this.LLJ;
            final List<Integer> list2 = this.LLJIJIL;
            viewPager.setAdapter(new AbstractC480470Isn(childFragmentManager, list, list2) { // from class: X.0lIT
                public final List<T> LLIZ;
                public final List<Integer> LLIZLLLIL;
                public final FragmentManager LLJ;

                @Override // androidx.viewpager.widget.PagerAdapter
                public final int getCount() {
                    return this.LLIZ.size();
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final int LJIJJ(Object obj3) {
                    if (this.LLIZ.contains(obj3)) {
                        return this.LLIZ.indexOf(obj3);
                    }
                    return -2;
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final CharSequence LJIJJLI(int i) {
                    C128Y c128y = (Fragment) ListProtector.get(this.LLIZ, i);
                    if (c128y instanceof InterfaceC1352410lIV) {
                        return ((InterfaceC1352410lIV) c128y).Nu();
                    }
                    return "";
                }

                @Override // X.AbstractC480470Isn
                public final Fragment LJJIJIL(int i) {
                    return (Fragment) ListProtector.get(this.LLIZ, i);
                }

                @Override // X.AbstractC480470Isn
                public final long LJJIJL(int i) {
                    Fragment fragment;
                    if (i >= 0 && i < this.LLIZ.size() && (fragment = (Fragment) ListProtector.get(this.LLIZ, i)) != null) {
                        return fragment.hashCode();
                    }
                    return 0L;
                }

                {
                    super(childFragmentManager, 0);
                    this.LLJ = childFragmentManager;
                    this.LLIZ = list;
                    this.LLIZLLLIL = list2;
                }

                @Override // X.AbstractC480470Isn, androidx.viewpager.widget.PagerAdapter
                public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj3) {
                    C19EH c19ehLJIIJ = this.LLJ.LJIIJ();
                    c19ehLJIIJ.LJIIZILJ((Fragment) obj3);
                    c19ehLJIIJ.LJIIJ();
                }
            });
        }
        C19YK c19yk = this.LLIZ;
        if (c19yk != null) {
            c19yk.setupWithViewPager(this.LLILZLL);
        }
        show();
    }

    public final void NR(int i, int i2, String str) {
        if (i == i2) {
            C1349760lEE.LIZ("interaction_page", "tabVisibleChange  same position");
            return;
        }
        this.LLJI = i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tabVisibleChange  ");
        sbLIZ.append(i);
        sbLIZ.append("  ");
        sbLIZ.append(i2);
        C1349760lEE.LIZ("interaction_page", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLIIL(500L, C799570VYd.LIZJ(), new ARunnableS97S0000000_21(0));
        List<AbsFragment> list = this.LLJ;
        if (list != null && (!list.isEmpty())) {
            if (i == -1) {
                ((InterfaceC1352410lIV) ListProtector.get(list, i2)).Z4(getActivity(), this.LLJJIJI);
                return;
            }
            if (i2 == -1) {
                InterfaceC1352410lIV interfaceC1352410lIV = (InterfaceC1352410lIV) ListProtector.get(list, i);
                getActivity();
                interfaceC1352410lIV.zD(str, this.LLJJIJI);
                return;
            }
            int i3 = 0;
            for (C128Y c128y : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C128Y c128y2 = (AbsFragment) c128y;
                    if (i3 == i) {
                        getActivity();
                        ((InterfaceC1352410lIV) c128y2).zD("change_tab", this.LLJJIJI);
                    } else if (i3 == i2) {
                        this.LLJJIJI = "change_tab";
                        ((InterfaceC1352410lIV) c128y2).Z4(getActivity(), "change_tab");
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19YK c19yk;
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ctp, viewGroup, false);
        this.LL = (C1353070lJZ) viewTd.findViewById(R.id.trr);
        this.LLILZLL = (ViewPager) viewTd.findViewById(R.id.tpz);
        this.LLILZIL = (ViewGroup) viewTd.findViewById(R.id.i4g);
        this.LLIZLLLIL = viewTd.findViewById(R.id.vw_divider);
        this.LLILLL = (TuxIconView) viewTd.findViewById(R.id.bn2);
        this.LLILZ = viewTd.findViewById(R.id.e_n);
        viewTd.findViewById(R.id.vct);
        this.LLJILJIL = (ViewGroup) viewTd.findViewById(R.id.es2);
        if (this.LLJJIJIIJIL) {
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            View view = this.LLIZLLLIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            c19yk = (C19YK) viewTd.findViewById(R.id.wya);
        } else {
            View view2 = this.LLIZLLLIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            c19yk = (C19YK) viewTd.findViewById(R.id.vcs);
        }
        this.LLIZ = c19yk;
        if (c19yk != null) {
            int visibility = c19yk.getVisibility();
            c19yk.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c19yk);
        }
        C1353070lJZ c1353070lJZ = this.LL;
        if (c1353070lJZ != null) {
            c1353070lJZ.setCommentContainer(this.LLILZLL);
        }
        C1353070lJZ c1353070lJZ2 = this.LL;
        if (c1353070lJZ2 != null) {
            c1353070lJZ2.setScrollableContainer(new InterfaceC1352430lIX() { // from class: X.0lIU
                @Override // X.InterfaceC1352430lIX
                public final RecyclerView LJJLIIIJILLIZJL() {
                    Integer numValueOf;
                    ViewPager viewPager = this.LIZ.LLILZLL;
                    if (viewPager == null || (numValueOf = Integer.valueOf(viewPager.getCurrentItem())) == null) {
                        return null;
                    }
                    InteractionFragment interactionFragment = this.LIZ;
                    int iIntValue = numValueOf.intValue();
                    List<AbsFragment> list = interactionFragment.LLJ;
                    return ((InterfaceC1352410lIV) (list != null ? (AbsFragment) ListProtector.get(list, iIntValue) : null)).wd();
                }
            });
        }
        C1353070lJZ c1353070lJZ3 = this.LL;
        if (c1353070lJZ3 != null) {
            c1353070lJZ3.setVisibleChangedListener(new AwS600S0100000_21(this, 352));
        }
        ViewPager viewPager = this.LLILZLL;
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(3);
            viewPager.addOnPageChangeListener(new C1402280maw(this, 1));
        }
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS155S0100000_21(this, 242));
        }
        ViewGroup viewGroup2 = this.LLILZIL;
        if (viewGroup2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(8));
            viewGroup2.setBackground(c384050F3z.LIZ(requireContext()));
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
