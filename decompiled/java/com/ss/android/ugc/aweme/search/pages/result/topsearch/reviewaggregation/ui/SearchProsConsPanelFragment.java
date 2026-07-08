package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui;

import X.AbstractC712240Rwk;
import X.C03H5;
import X.C098200Yq;
import X.C0DV6;
import X.C0OM1;
import X.C0P2H;
import X.C0ZP4;
import X.C1194810hCJ;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1389340mG4;
import X.C13LE;
import X.C13LP;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1846060y8i;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452070Ho5;
import X.C5185020h;
import X.C622840Obq;
import X.C636570Oxz;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC622850Obr;
import X.InterfaceC0148002o;
import X.InterfaceC1194840hCM;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC636580Oy0;
import X.InterfaceC636730OyF;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ACListenerS139S0100000_4;
import Y.ARunnableS78S0200000_9;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.SearchProsConsJSBRequestModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.Tag;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui.SearchProsConsTabFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsPanelAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchProsConsPanelFragment extends Fragment implements InterfaceC344240DeY, InterfaceC724530SbT, InterfaceC636580Oy0 {
    public static final C0DV6 LLILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiPSAjOyAtOyHELIOSw7ZjcpPyY2PyQrLj02LyQ4ICA9ZjAlZxw2KTcvIR8hJzYPJiEgGCQiLCMVOiQrJCo9PA==";
    public final AssemVMLazy LL;
    public String LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchProsConsPanelFragment.class, "panelAssemViewModel", "getPanelAssemViewModel()Lcom/ss/android/ugc/aweme/search/pages/result/topsearch/reviewaggregation/vm/SearchProsConsPanelAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILLL = new C0DV6();
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC636580Oy0
    public final SearchProsConsPanelAssemViewModel Pw() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (SearchProsConsPanelAssemViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String str = this.LLILLJJLI;
        if (str == null) {
            return null;
        }
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = true;
        return c0om1;
    }

    public SearchProsConsPanelFragment() {
        AwS583S0100000_4 awS583S0100000_4 = new AwS583S0100000_4(this, 114);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchProsConsPanelAssemViewModel.class);
        this.LL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS548S0100000_4(c19719912DlLIZ, 201), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 202), awS583S0100000_4);
    }

    public static List MR(SearchProsConsJSBRequestModel searchProsConsJSBRequestModel) {
        List<String> list = searchProsConsJSBRequestModel.showTabs;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            C636570Oxz c636570OxzLIZ = searchProsConsJSBRequestModel.LIZ(str);
            if (c636570OxzLIZ != null) {
                String str2 = c636570OxzLIZ.LIZ;
                Tag tag = c636570OxzLIZ.LIZIZ;
                List<Tag> list2 = c636570OxzLIZ.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(searchProsConsJSBRequestModel.sessionID);
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String str3 = searchProsConsJSBRequestModel.requestPath;
                HashMap map = new HashMap(searchProsConsJSBRequestModel.requestParams);
                String str4 = searchProsConsJSBRequestModel.userContentMap.get(c636570OxzLIZ.LIZIZ.uniqueId);
                if (str4 != null) {
                    map.put("user_content", str4);
                }
                arrayList.add(new SearchProsConsTabFragment.TabFragmentItem(str2, tag, list2, strLIZIZ, str3, map, searchProsConsJSBRequestModel.logParams, searchProsConsJSBRequestModel.takoMediaParams, searchProsConsJSBRequestModel.initialTagString, searchProsConsJSBRequestModel.shouldShowTrailingText));
            }
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final SearchProsConsJSBRequestModel searchProsConsJSBRequestModel;
        Object c098200Yq;
        String str;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (searchProsConsJSBRequestModel = (SearchProsConsJSBRequestModel) arguments.getParcelable(":model")) != null) {
            try {
                c098200Yq = MR(searchProsConsJSBRequestModel);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                final List list = (List) c098200Yq;
                final ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) view.findViewById(R.id.rn9);
                InterfaceC636730OyF fragmentItemOperator = viewOnAttachStateChangeListenerC20631115oD.getFragmentItemOperator();
                C622840Obq c622840Obq = new C622840Obq();
                c622840Obq.LIZ = -1;
                c622840Obq.LJII = EnumC622850Obr.FRAGMENTS_NO_DESTROY;
                fragmentItemOperator.LIZLLL(c622840Obq);
                ((ViewGroup) viewOnAttachStateChangeListenerC20631115oD.getChildAt(0)).getChildAt(0).setNestedScrollingEnabled(false);
                viewOnAttachStateChangeListenerC20631115oD.registerOnPageChangeCallback(new AbstractC712240Rwk() { // from class: X.0OyD
                    @Override // X.AbstractC712240Rwk
                    public final void onPageScrollStateChanged(int i) {
                        this.LL.Pw().setState(AFwS232S0000000_4.get$arr$(180));
                    }

                    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
                    @Override // X.AbstractC712240Rwk
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onPageSelected(int r8) {
                        /*
                            r7 = this;
                            X.15oD r4 = r2
                            X.0OyF r0 = r4.getFragmentItemOperator()
                            X.15jK r0 = r0.getState()
                            int r3 = r0.LJIIIIZZ()
                            r2 = 0
                        Lf:
                            r1 = 1
                            r6 = 0
                            if (r2 >= r3) goto L2c
                            X.0OyF r0 = r4.getFragmentItemOperator()
                            androidx.fragment.app.Fragment r0 = r0.LIZIZ(r2)
                            if (r0 == 0) goto L29
                            android.view.View r0 = r0.getView()
                            if (r0 == 0) goto L29
                            if (r2 == r8) goto L26
                            r1 = 0
                        L26:
                            X.C636720OyE.LIZ(r0, r1)
                        L29:
                            int r2 = r2 + 1
                            goto Lf
                        L2c:
                            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui.SearchProsConsPanelFragment r0 = r7.LL
                            androidx.fragment.app.Fragment r1 = r0.getParentFragment()
                            boolean r0 = r1 instanceof com.bytedance.tux.sheet.sheet.TuxSheet
                            if (r0 == 0) goto L4c
                            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
                            if (r1 == 0) goto L4c
                            android.app.Dialog r1 = r1.getDialog()
                            if (r1 == 0) goto L4c
                            r0 = 2131369782(0x7f0a1f36, float:1.8359552E38)
                            android.view.View r0 = r1.findViewById(r0)
                            if (r0 == 0) goto L4c
                            r0.requestLayout()
                        L4c:
                            X.15oD r0 = r2
                            X.0OyF r0 = r0.getFragmentItemOperator()
                            X.15jK r0 = r0.getState()
                            int r5 = r0.LJIIIIZZ()
                            r4 = 0
                        L5b:
                            if (r4 >= r5) goto L90
                            X.15oD r0 = r2
                            X.0OyF r0 = r0.getFragmentItemOperator()
                            androidx.fragment.app.Fragment r1 = r0.LIZIZ(r4)
                            if (r1 == 0) goto L8e
                            boolean r0 = r1.isAdded()
                            if (r0 == 0) goto L8e
                        L6f:
                            boolean r0 = r1 instanceof X.InterfaceC636740OyG
                            if (r0 == 0) goto L89
                            X.0OyG r1 = (X.InterfaceC636740OyG) r1
                            if (r1 == 0) goto L89
                            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel r3 = r1.DQ()
                            if (r3 == 0) goto L89
                            if (r4 != r8) goto L8c
                            r2 = 1
                        L80:
                            kotlin.jvm.internal.AwS19S0010000_4 r1 = new kotlin.jvm.internal.AwS19S0010000_4
                            r0 = 1
                            r1.<init>(r2, r0)
                            r3.setState(r1)
                        L89:
                            int r4 = r4 + 1
                            goto L5b
                        L8c:
                            r2 = 0
                            goto L80
                        L8e:
                            r1 = r6
                            goto L6f
                        L90:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C636710OyD.onPageSelected(int):void");
                    }
                });
                C1846060y8i c1846060y8i = (C1846060y8i) view.findViewById(R.id.z1b);
                if (list.size() == 1) {
                    SearchProsConsTabFragment.TabFragmentItem tabFragmentItem = (SearchProsConsTabFragment.TabFragmentItem) C13LP.LJJJLL(list);
                    if (tabFragmentItem != null) {
                        str = tabFragmentItem.pageName;
                    } else {
                        str = null;
                    }
                    this.LLILLJJLI = str;
                    C786410Ut5.LLZLI(c1846060y8i, 8);
                } else {
                    new C1194810hCJ(c1846060y8i, viewOnAttachStateChangeListenerC20631115oD, true, new InterfaceC1194840hCM() { // from class: X.0Oxy
                        @Override // X.InterfaceC1194840hCM
                        public final void LIZ(C1845940y8W c1845940y8W, int i) {
                            c1845940y8W.LIZIZ(((SearchProsConsTabFragment.TabFragmentItem) ListProtector.get(list, i)).pageName);
                            C1845930y8V c1845930y8V = c1845940y8W.LJFF;
                            if (c1845930y8V != null) {
                                C786410Ut5.m9(c1845930y8V, new ACListenerS139S0100000_4(searchProsConsJSBRequestModel, 46));
                            }
                        }
                    }).LIZ();
                }
                viewOnAttachStateChangeListenerC20631115oD.getFragmentItemOperator().getState().LIZLLL(list, new ARunnableS78S0200000_9(viewOnAttachStateChangeListenerC20631115oD, searchProsConsJSBRequestModel, 50));
                View viewFindViewById = view.findViewById(R.id.hy8);
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf((((double) C1389340mG4.LIZLLL()) * 0.75d) * 0.85d))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
                    C786410Ut5.W5(viewFindViewById, layoutParams);
                    final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.hy9);
                    viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
                    C0P2H c0p2h = new C0P2H(viewOnAttachStateChangeListenerC20604515jv) { // from class: X.0Oy2
                        public final ViewOnAttachStateChangeListenerC20604515jv LLILZ;

                        {
                            super(viewOnAttachStateChangeListenerC20604515jv.getContext());
                            this.LLILZ = viewOnAttachStateChangeListenerC20604515jv;
                        }

                        @Override // X.C0P2H, X.C0DXR
                        public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                            int i;
                            super.LIZIZ(rect, view2, recyclerView, c21673919s1);
                            int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                            if (childAdapterPosition < 0) {
                                return;
                            }
                            if (this.LLILZ.getState().LJI(childAdapterPosition) instanceof C1876907Wt) {
                                if (childAdapterPosition == 0) {
                                    i = 4;
                                } else {
                                    i = 18;
                                }
                                rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                                return;
                            }
                            rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                            rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                        }
                    };
                    c0p2h.LLILLJJLI = 3;
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LJII = 0;
                    c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                    c0p2h.LJ(c384050F3z.LIZ(viewOnAttachStateChangeListenerC20604515jv.getContext()));
                    viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(c0p2h);
                    viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new FlexboxLayoutManager(getContext(), 0));
                    viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SearchProsConsDropdownPanelTagPowerCell.class, SearchProsConsDropdownPanelCategoryPowerCell.class);
                    C736680Sv4.LJIIIIZZ(this, Pw(), new C2217381BqS() { // from class: X.0CyS
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C331090CyR) obj).LLILLJJLI;
                        }
                    }, null, new AwS620S0100000_6(viewOnAttachStateChangeListenerC20604515jv, 114), 6);
                    View viewFindViewById2 = view.findViewById(R.id.hy_);
                    C736680Sv4.LJIIIIZZ(this, Pw(), new C2217381BqS() { // from class: X.0CyT
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return Boolean.valueOf(((C331090CyR) obj).LL);
                        }
                    }, C736820SvI.LIZLLL(), new C5185020h(viewFindViewById2, 17), 4);
                    C786410Ut5.I7(new ACListenerS139S0100000_4(this, 67), viewFindViewById2);
                    View viewFindViewById3 = view.findViewById(R.id.jzk);
                    C427690Gpr.LJ(viewFindViewById3, C418440Gaw.LIZIZ(200));
                    C786410Ut5.I7(new ACListenerS139S0100000_4(this, 68), viewFindViewById3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildTabs failed, ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f2m, viewGroup, false);
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
