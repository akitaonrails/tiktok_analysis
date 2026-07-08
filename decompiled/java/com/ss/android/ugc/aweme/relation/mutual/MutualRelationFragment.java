package com.ss.android.ugc.aweme.relation.mutual;

import X.AbstractC1263540izA;
import X.AbstractC1263550izB;
import X.AbstractC1890380zIC;
import X.AbstractC1903730zdj;
import X.AbstractC1906720ziY;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0PEM;
import X.C0ZP4;
import X.C1073940e3M;
import X.C1075440e5m;
import X.C1076010e6h;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1222990hvl;
import X.C1223080hvu;
import X.C1253000iiA;
import X.C1262300ixA;
import X.C1262310ixB;
import X.C1262320ixC;
import X.C1262590ixd;
import X.C1262780ixw;
import X.C1262790ixx;
import X.C1262970iyF;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C23250099c;
import X.C295390Bhx;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1261750iwH;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS223S0100000_19;
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
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MutualRelationFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final C1223080hvu LLJILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nISHELIOSoiZyImPDAtJWEePTE5KCMBLSktPSY8JgM+KCg+LSs4";
    public C1749280vcc LLIZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public AbstractC1263550izB LLJILJIL;
    public boolean LLJILJILJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0hvu] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MutualRelationFragment.class, "mutualRelationViewModel", "getMutualRelationViewModel()Lcom/ss/android/ugc/aweme/relation/mutual/MutualRelationViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILLL = new Object() { // from class: X.0hvu
        };
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

    public MutualRelationFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MutualRelationViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1738);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(292);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1739), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 1740), aFwS257S0000000_19, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1741), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1737));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1736));
        this.LLJILJILJ = true;
    }

    public final C1075440e5m SR() {
        return (C1075440e5m) this.LLJI.getValue();
    }

    public final MutualRelationViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (MutualRelationViewModel) assemVMLazy.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv VR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rn0) : null;
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final C1749280vcc WR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLIZ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final void ZR() {
        ArrayList<String> stringArrayList;
        ArrayList<String> stringArrayList2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            stringArrayList2 = arguments.getStringArrayList("mutual_relation_user_list");
            stringArrayList = arguments.getStringArrayList("mutual_relation_sec_user_list");
        } else {
            stringArrayList = null;
            stringArrayList2 = null;
        }
        UR().setState(AFwS257S0000000_19.get$arr$(301));
        if (stringArrayList2 != null && stringArrayList != null) {
            MutualRelationViewModel mutualRelationViewModelUR = UR();
            mutualRelationViewModelUR.setState(new AwS385S0200000_19(stringArrayList2, stringArrayList, (ArrayList<String>) 44));
            C23250099c.LIZLLL(mutualRelationViewModelUR.getAssemVMScope(), C0PEM.LIZJ, null, new C1222990hvl(mutualRelationViewModelUR, stringArrayList2, stringArrayList, null), 2);
        }
        AbstractC1263550izB abstractC1263550izB = this.LLJILJIL;
        ((C1262970iyF) (abstractC1263550izB != null ? abstractC1263550izB : null)).LLFZ(false);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJILJILJ) {
            this.LLJILJILJ = false;
            int i = C2187451AjH.LIZ;
            ZR();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object objLJ;
        C1749280vcc c1749280vccWR;
        super.onViewCreated(view, bundle);
        VR().LIZJ((AbstractC1906720ziY) this.LLJIJIL.getValue());
        VR().LIZJ(SR());
        AbstractC1263550izB abstractC1263550izB = null;
        C1262310ixB c1262310ixB = new C1262310ixB(false ? 1 : 0, this, 1);
        c1262310ixB.LIZ(AFwS257S0000000_19.get$arr$(599));
        new AwS598S0100000_19(this, 563).invoke(c1262310ixB.LJ);
        c1262310ixB.LIZLLL(AFwS257S0000000_19.get$arr$(600));
        c1262310ixB.LIZIZ(AFwS257S0000000_19.get$arr$(601));
        IRelationUserCardInternalService.LIZ.getClass();
        IRelationUserCardInternalService iRelationUserCardInternalServiceLIZ = C1073940e3M.LIZ();
        C1262320ixC c1262320ixC = c1262310ixB.LIZLLL;
        if (c1262320ixC.LIZLLL == -1) {
            int i = c1262310ixB.LJFF.LIZJ - 10;
            if (i < 5) {
                i = 5;
            }
            c1262320ixC.LIZLLL = i;
        }
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AbstractC1263550izB.class);
        if (!Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262790ixx.class)) && !Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262780ixw.class)) && (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1263550izB.class)) || Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1890380zIC.class)))) {
            C1262590ixd c1262590ixd = c1262310ixB.LJFF;
            if (c1262590ixd.LJIILJJIL == null) {
                c1262590ixd.LJIILJJIL = Boolean.TRUE;
            }
        }
        C1262300ixA c1262300ixA = new C1262300ixA(c1262310ixB.LIZ, c1262310ixB.LIZIZ, c1262310ixB.LIZJ, c1262310ixB.LIZLLL, c1262310ixB.LJ, c1262310ixB.LJFF, null, c1262310ixB.LJI);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AbstractC1263550izB.class);
        if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262790ixx.class))) {
            objLJ = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 1).getLayout();
        } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262780ixw.class))) {
            objLJ = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 0).getLayout();
        } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263550izB.class))) {
            objLJ = iRelationUserCardInternalServiceLIZ.LIZIZ(c1262300ixA);
        } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1890380zIC.class))) {
            objLJ = iRelationUserCardInternalServiceLIZ.LIZJ(c1262300ixA);
        } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1903730zdj.class))) {
            objLJ = iRelationUserCardInternalServiceLIZ.LIZLLL(c1262300ixA);
        } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263540izA.class))) {
            objLJ = iRelationUserCardInternalServiceLIZ.LJ(c1262300ixA);
        } else {
            "type is error!".toString();
            throw new IllegalStateException("type is error!");
        }
        if (objLJ != null) {
            AbstractC1263550izB abstractC1263550izB2 = (AbstractC1263550izB) objLJ;
            this.LLJILJIL = abstractC1263550izB2;
            ((C1262970iyF) abstractC1263550izB2).LJI(null);
            AbstractC1263550izB abstractC1263550izB3 = this.LLJILJIL;
            if (abstractC1263550izB3 == null) {
                abstractC1263550izB3 = null;
            }
            ((C1262970iyF) abstractC1263550izB3).Eg(new InterfaceC1261750iwH() { // from class: X.0hvs
                @Override // X.InterfaceC1261750iwH
                public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
                }

                @Override // X.InterfaceC1261750iwH
                public final void LLF(RecyclerView recyclerView, int i2) {
                }

                @Override // X.InterfaceC1261750iwH
                public final void nO0(C1075800e6M c1075800e6M) {
                    this.LL.UR().setState(new AwS598S0100000_19(c1075800e6M, 231));
                }
            });
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvVR = VR();
            AbstractC1263550izB abstractC1263550izB4 = this.LLJILJIL;
            if (abstractC1263550izB4 != null) {
                abstractC1263550izB = abstractC1263550izB4;
            }
            viewOnAttachStateChangeListenerC20604515jvVR.LIZJ(abstractC1263550izB);
            C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0hvq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1222980hvk) obj).LLILLL;
                }
            }, C736820SvI.LJ(), new AwS633S0100000_19(this, 222), 4);
            C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0hvi
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1222980hvk) obj).LL;
                }
            }, C736820SvI.LJ(), new AwS633S0100000_19(this, 78), 4);
            C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0hvp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1222980hvk) obj).LLILZ;
                }
            }, null, new AwS633S0100000_19(this, 79), 6);
            UR().vQ2(this);
            C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0hve
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1222980hvk) obj).LLIZ;
                }
            }, null, new AwS633S0100000_19(this, 221), 6);
            if (C295390Bhx.LIZJ() && (c1749280vccWR = WR()) != null) {
                c1749280vccWR.setLayoutVariant(0);
            }
            if (C1253000iiA.LIZ()) {
                C1076010e6h.LIZJ.LIZIZ().LIZ().subscribe(this, new AObserverS223S0100000_19(this, 54));
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.controller.AbsRelationUserCardChunk");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9a, viewGroup, false);
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
