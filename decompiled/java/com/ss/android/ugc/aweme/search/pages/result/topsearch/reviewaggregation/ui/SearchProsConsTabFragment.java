package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0DXR;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C301390Brd;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427690Gpr;
import X.C452070Ho5;
import X.C452501pT;
import X.C636700OyC;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1206390hUz;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC636740OyG;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.Tag;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui.SearchProsConsTabFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsPanelAssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS19S0010000_4;
import kotlin.jvm.internal.AwS282S0300000_4;
import kotlin.jvm.internal.AwS440S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchProsConsTabFragment extends Fragment implements InterfaceC724530SbT, InterfaceC636740OyG, InterfaceC1206390hUz {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiPSAjOyAtHELIOSOyw7ZjcpPyY2PyQrLj02LyQ4ICA9ZjAlZxw2KTcvIR8hJzYPJiEgHCQuDz0yLygpJzs=";
    public final C01GW LL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1466));
    public final AssemVMLazy LLILLJJLI = new AssemVMLazy(C724750Sbp.LJIIJ(this, C13LE.LIZ(SearchProsConsTabAssemViewModel.class)), new AwS553S0100000_9(this, 1465), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1464), new AwS588S0100000_9(this, 376));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchProsConsTabFragment.class, "tabAssemViewModel", "getTabAssemViewModel()Lcom/ss/android/ugc/aweme/search/pages/result/topsearch/reviewaggregation/vm/SearchProsConsTabAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
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

    @Override // X.InterfaceC636740OyG
    public final SearchProsConsTabAssemViewModel DQ() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (SearchProsConsTabAssemViewModel) assemVMLazy.getValue();
    }

    public final TabFragmentItem MR() {
        return (TabFragmentItem) this.LL.getValue();
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
        DQ().setState(new AwS19S0010000_4(false, 1));
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        DQ().setState(new AwS19S0010000_4(true, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SearchProsConsPanelAssemViewModel searchProsConsPanelAssemViewModel;
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchProsConsPanelAssemViewModel.class);
            searchProsConsPanelAssemViewModel = (SearchProsConsPanelAssemViewModel) new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c19719912DlLIZ), new AwS548S0100000_4(c19719912DlLIZ, 203), new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) parentFragment, 204), AFwS232S0000000_4.get$arr$(61)).getValue();
        } else {
            searchProsConsPanelAssemViewModel = null;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.th9);
        viewOnAttachStateChangeListenerC20604515jv.setNestedScrollingEnabled(false);
        if (MR().tags.isEmpty() || (C301390Brd.LIZ() && MR().tags.size() <= 1)) {
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.hyc));
        } else {
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR() { // from class: X.06XI
                public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    boolean z;
                    int iLIZIZ;
                    int iLIZIZ2;
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                    if (childAdapterPosition < 0) {
                        return;
                    }
                    if (recyclerView.getLayoutDirection() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (childAdapterPosition == 0) {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                            iLIZIZ2 = 0;
                        } else {
                            AbstractC21673619ry adapter = recyclerView.getAdapter();
                            if (adapter != null && childAdapterPosition == adapter.getItemCount() - 1) {
                                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                iLIZIZ = 0;
                            }
                            iLIZIZ = 0;
                            iLIZIZ2 = 0;
                        }
                    } else if (childAdapterPosition == 0) {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        iLIZIZ = 0;
                    } else {
                        AbstractC21673619ry adapter2 = recyclerView.getAdapter();
                        if (adapter2 != null && childAdapterPosition == adapter2.getItemCount() - 1) {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                            iLIZIZ2 = 0;
                        }
                        iLIZIZ = 0;
                        iLIZIZ2 = 0;
                    }
                    int i = this.LL;
                    rect.set(iLIZIZ + i, 0, i + iLIZIZ2, 0);
                }
            });
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SearchProsConsTagPowerCell.class);
            View viewFindViewById2 = view.findViewById(R.id.k2e);
            C427690Gpr.LJ(viewFindViewById2, C418440Gaw.LIZIZ(200));
            C736680Sv4.LJIIIIZZ(this, DQ(), new C2217381BqS() { // from class: X.0CwD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C329680CwA) obj).LLILLJJLI;
                }
            }, null, new AwS282S0300000_4(viewOnAttachStateChangeListenerC20604515jv, viewFindViewById2, searchProsConsPanelAssemViewModel, 1), 6);
            Context context = getContext();
            if (context != null && C426750GoL.LIZLLL(context) && (viewFindViewById = view.findViewById(R.id.ffl)) != null) {
                C786410Ut5.Ob(viewFindViewById, -1.0f);
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.tga);
        viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new LinearLayoutManager(getContext()));
        final Context context2 = getContext();
        final AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(viewOnAttachStateChangeListenerC20604515jv2, 205);
        viewOnAttachStateChangeListenerC20604515jv2.addItemDecoration(new C0DXR(context2, awS548S0100000_4) { // from class: X.0cVn
            public final Function0<Integer> LL;
            public final Paint LLILLJJLI;
            public final int LLILLL;

            {
                int iIntValue;
                Integer numLIZJ;
                this.LL = awS548S0100000_4;
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.STROKE);
                if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context2)) != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                paint.setColor(iIntValue);
                paint.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                this.LLILLJJLI = paint;
                this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }

            @Override // X.C0DXR
            public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                if (!c21673919s1.LJIIJ && !c21673919s1.LJIIIZ) {
                    int iIntValue = this.LL.invoke().intValue();
                    Iterator it2 = new C1077420e8y(recyclerView, 21).iterator();
                    while (true) {
                        C1077410e8x c1077410e8x = (C1077410e8x) it2;
                        if (c1077410e8x.hasNext()) {
                            if (recyclerView.getChildAdapterPosition((View) c1077410e8x.next()) < iIntValue - 1) {
                                canvas.drawLine(r2.getLeft() + this.LLILLL, r2.getBottom(), r2.getRight() - this.LLILLL, r2.getBottom(), this.LLILLJJLI);
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        });
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZLLL = RemoteNoMoreHintFooter.class;
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 1;
        viewOnAttachStateChangeListenerC20604515jv2.setListConfig(c20603715jn);
        viewOnAttachStateChangeListenerC20604515jv2.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv2.LJII(new C636700OyC(view, this));
        viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(SearchProsConsUserContentPowerCell.class);
        C736680Sv4.LJIIIIZZ(this, DQ(), new C2217381BqS() { // from class: X.0Cw4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C329680CwA) obj).LLILLL;
            }
        }, null, new AwS618S0100000_4(viewOnAttachStateChangeListenerC20604515jv2, 23), 6);
        C736680Sv4.LJIIIIZZ(this, DQ(), new C2217381BqS() { // from class: X.0CwC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C329680CwA) obj).LLILZ;
            }
        }, null, new AwS440S0200000_4(viewOnAttachStateChangeListenerC20604515jv2, this, 6), 6);
        DQ().LL = new AwS583S0100000_4(viewOnAttachStateChangeListenerC20604515jv2, 115);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f2o, viewGroup, false);
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

    public static final class TabFragmentItem extends PowerViewPagerFragmentItem<SearchProsConsTabFragment> {
        public final String key;
        public final Map<String, String> logParams;
        public final String pageName;
        public final Map<String, String> requestParams;
        public final String requestPath;
        public final Boolean showTrailingText;
        public final String singleSelectedTag;
        public final List<Tag> tags;
        public final Map<String, String> takoMediaParams;
        public final Tag voidTag;
        public static final Parcelable.Creator<TabFragmentItem> CREATOR = new Parcelable.Creator<TabFragmentItem>() { // from class: X.0Oy1
            @Override // android.os.Parcelable.Creator
            public final SearchProsConsTabFragment.TabFragmentItem createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                Tag tagCreateFromParcel = Tag.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                boolean z = false;
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Tag.CREATOR.createFromParcel(parcel));
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    linkedHashMap3.put(parcel.readString(), parcel.readString());
                }
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                return new SearchProsConsTabFragment.TabFragmentItem(string, tagCreateFromParcel, arrayList, string2, string3, linkedHashMap, linkedHashMap2, linkedHashMap3, string4, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final SearchProsConsTabFragment.TabFragmentItem[] newArray(int i) {
                return new SearchProsConsTabFragment.TabFragmentItem[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabFragmentItem)) {
                return false;
            }
            TabFragmentItem tabFragmentItem = (TabFragmentItem) obj;
            return Intrinsics.LJFF(this.pageName, tabFragmentItem.pageName) && Intrinsics.LJFF(this.voidTag, tabFragmentItem.voidTag) && Intrinsics.LJFF(this.tags, tabFragmentItem.tags) && Intrinsics.LJFF(this.key, tabFragmentItem.key) && Intrinsics.LJFF(this.requestPath, tabFragmentItem.requestPath) && Intrinsics.LJFF(this.requestParams, tabFragmentItem.requestParams) && Intrinsics.LJFF(this.logParams, tabFragmentItem.logParams) && Intrinsics.LJFF(this.takoMediaParams, tabFragmentItem.takoMediaParams) && Intrinsics.LJFF(this.singleSelectedTag, tabFragmentItem.singleSelectedTag) && Intrinsics.LJFF(this.showTrailingText, tabFragmentItem.showTrailingText);
        }

        public final int hashCode() {
            int iHashCode = ((((((((((((((this.pageName.hashCode() * 31) + this.voidTag.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.key.hashCode()) * 31) + this.requestPath.hashCode()) * 31) + this.requestParams.hashCode()) * 31) + this.logParams.hashCode()) * 31) + this.takoMediaParams.hashCode()) * 31;
            String str = this.singleSelectedTag;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.showTrailingText;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TabFragmentItem(pageName=");
            sbLIZ.append(this.pageName);
            sbLIZ.append(", voidTag=");
            sbLIZ.append(this.voidTag);
            sbLIZ.append(", tags=");
            sbLIZ.append(this.tags);
            sbLIZ.append(", key=");
            sbLIZ.append(this.key);
            sbLIZ.append(", requestPath=");
            sbLIZ.append(this.requestPath);
            sbLIZ.append(", requestParams=");
            sbLIZ.append(this.requestParams);
            sbLIZ.append(", logParams=");
            sbLIZ.append(this.logParams);
            sbLIZ.append(", takoMediaParams=");
            sbLIZ.append(this.takoMediaParams);
            sbLIZ.append(", singleSelectedTag=");
            sbLIZ.append(this.singleSelectedTag);
            sbLIZ.append(", showTrailingText=");
            sbLIZ.append(this.showTrailingText);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18, types: [int] */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v34 */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.os.Parcel] */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            ?? BooleanValue;
            parcel.writeString(this.pageName);
            this.voidTag.writeToParcel(parcel, i);
            List<Tag> list = this.tags;
            parcel.writeInt(list.size());
            Iterator<Tag> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
            parcel.writeString(this.key);
            parcel.writeString(this.requestPath);
            Map<String, String> map = this.requestParams;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
            Map<String, String> map2 = this.logParams;
            parcel.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
            Map<String, String> map3 = this.takoMediaParams;
            parcel.writeInt(map3.size());
            for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                parcel.writeString(entry3.getKey());
                parcel.writeString(entry3.getValue());
            }
            parcel.writeString(this.singleSelectedTag);
            Boolean bool = this.showTrailingText;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                parcel.writeInt(1);
                BooleanValue = bool.booleanValue();
            }
            parcel.writeInt(BooleanValue);
        }

        public TabFragmentItem(String str, Tag tag, List<Tag> list, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, String str4, Boolean bool) {
            this.pageName = str;
            this.voidTag = tag;
            this.tags = list;
            this.key = str2;
            this.requestPath = str3;
            this.requestParams = map;
            this.logParams = map2;
            this.takoMediaParams = map3;
            this.singleSelectedTag = str4;
            this.showTrailingText = bool;
        }
    }
}
