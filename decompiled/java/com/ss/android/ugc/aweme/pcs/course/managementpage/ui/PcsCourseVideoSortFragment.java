package com.ss.android.ugc.aweme.pcs.course.managementpage.ui;

import X.AbstractC488460JDo;
import X.C03H5;
import X.C098200Yq;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1361400lX0;
import X.C13LE;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C1834150xpV;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C21688219uK;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C488430JDl;
import X.C489110JGb;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC489200JGk;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseVideoSortFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUvOmEwJzA+Oip9JSQiKCHELIOSg2JSAiPT8yLyBiPCZ9GCY/CiAmOjYpHyY3LSofJj0nDjctLiI2JjE=";
    public final C736950SvV LL = new C736950SvV(C13LE.LIZ(PcsCourseManageVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS237S0000000_7.get$arr$(141), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    public final List<InterfaceC489200JGk> LLILLJJLI = new ArrayList();
    public LiveIconView LLILLL;
    public RecyclerView LLILZ;
    public C197039127h LLILZIL;
    public C21688219uK LLILZLL;
    public C488430JDl LLIZ;

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

    public final PcsCourseManageVM NR() {
        return (PcsCourseManageVM) this.LL.getValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLL = (LiveIconView) view.findViewById(R.id.mk3);
        view.findViewById(R.id.f47);
        this.LLILZ = (RecyclerView) view.findViewById(R.id.vpa);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.u01);
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
        } else {
            c197039127h = null;
        }
        this.LLILZIL = c197039127h;
        LiveIconView liveIconView = this.LLILLL;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS142S0100000_7(this, 198));
        }
        this.LLIZ = new C488430JDl();
        RecyclerView recyclerView = this.LLILZ;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.LLIZ);
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setOverScrollMode(2);
            C21688219uK c21688219uK = new C21688219uK(new AbstractC488460JDo() { // from class: X.0JDj
                public Integer LJ;

                @Override // X.AbstractC21688119uJ
                public final boolean LJIIIIZZ() {
                    return false;
                }

                @Override // X.AbstractC21688119uJ
                public final void LJIILL() {
                }

                /* JADX WARN: Illegal instructions before constructor call */
                {
                    final int i = 3;
                    new AbstractC21688119uJ(i) { // from class: X.0JDo
                        public final int LIZJ = 0;
                        public final int LIZLLL;

                        {
                            this.LIZLLL = i;
                        }

                        @Override // X.AbstractC21688119uJ
                        public final int LJFF(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder) {
                            return AbstractC21688119uJ.LJIIIZ(this.LIZLLL, this.LIZJ);
                        }
                    };
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC21688119uJ
                public final void LIZJ(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder) {
                    int iIntValue;
                    List<Long> list;
                    InterfaceC488420JDk interfaceC488420JDk;
                    super.LIZJ(recyclerView2, viewHolder);
                    if ((viewHolder instanceof InterfaceC488420JDk) && (interfaceC488420JDk = (InterfaceC488420JDk) viewHolder) != null) {
                        interfaceC488420JDk.LJIIJ();
                    }
                    Integer num = this.LJ;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    int adapterPosition = viewHolder.getAdapterPosition();
                    C488430JDl c488430JDl = this.LJFF.LLIZ;
                    if (c488430JDl != null && ((list = c488430JDl.LLILLL) == null || !list.equals(c488430JDl.LLLFZ()))) {
                        C197039127h c197039127h2 = this.LJFF.LLILZIL;
                        if (c197039127h2 != null) {
                            c197039127h2.setEnabled(true);
                        }
                        C489110JGb.LJIILL(this.LJFF.NR().zQ2(), "drag", null, (InterfaceC489200JGk) C13LP.LJJJLZIJ(adapterPosition, this.LJFF.LLILLJJLI), iIntValue + 1, adapterPosition + 1, 4);
                    }
                    this.LJ = null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC21688119uJ
                public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
                    InterfaceC488420JDk interfaceC488420JDk;
                    Integer numValueOf = null;
                    if (i != 0) {
                        if ((viewHolder instanceof InterfaceC488420JDk) && (interfaceC488420JDk = (InterfaceC488420JDk) viewHolder) != null) {
                            interfaceC488420JDk.LJIIZILJ();
                        }
                        if (i == 2) {
                            if (viewHolder != 0) {
                                numValueOf = Integer.valueOf(viewHolder.getAdapterPosition());
                            }
                            this.LJ = numValueOf;
                        }
                    }
                }

                @Override // X.AbstractC21688119uJ
                public final boolean LJIIL(RecyclerView recyclerView2, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    C488430JDl c488430JDl = this.LJFF.LLIZ;
                    if (c488430JDl != null) {
                        int adapterPosition = viewHolder.getAdapterPosition();
                        int adapterPosition2 = viewHolder2.getAdapterPosition();
                        Collections.swap(c488430JDl.LL, adapterPosition, adapterPosition2);
                        c488430JDl.notifyItemMoved(adapterPosition, adapterPosition2);
                        return true;
                    }
                    return true;
                }
            });
            this.LLILZLL = c21688219uK;
            c21688219uK.LJ(recyclerView);
            C488430JDl c488430JDl = this.LLIZ;
            if (c488430JDl != null) {
                c488430JDl.LLILLJJLI = this.LLILZLL;
            }
        }
        ((ArrayList) this.LLILLJJLI).addAll(NR().getVideoList());
        C488430JDl c488430JDl2 = this.LLIZ;
        if (c488430JDl2 != null) {
            c488430JDl2.LL = this.LLILLJJLI;
            c488430JDl2.LLILLL = c488430JDl2.LLLFZ();
            c488430JDl2.notifyDataSetChanged();
        }
        C197039127h c197039127h2 = this.LLILZIL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS142S0100000_7(this, 199));
        }
        C489110JGb.LJIILL(NR().zQ2(), "show", null, null, 0, 0, 52);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (C1834150xpV.LJI(getContext())) {
            i = R.style.uy;
        } else {
            i = R.style.v0;
        }
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(new C1361400lX0(requireActivity(), i)), R.layout.hlr, viewGroup, false);
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
