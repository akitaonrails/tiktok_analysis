package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh;

import X.C01GW;
import X.C03H5;
import X.C0SDF;
import X.C0SDJ;
import X.C0SDP;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1261804wi;
import X.C13LE;
import X.C1587740rQ4;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C705700RmC;
import X.C736680Sv4;
import X.C737910Sx3;
import X.EnumC21696919vj;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import X.InterfaceC1361290lWp;
import X.InterfaceC1473950oSX;
import X.InterfaceC1582750rI1;
import X.InterfaceC1588310rQz;
import X.InterfaceC1588320rR0;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS107S1200000_24;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FriendsV3BaseSimpleAssemCell<ASSEM extends ReusedUISlotAssem<? extends C03H5>, T extends InterfaceC1361290lWp> extends AssemPowerCell<ASSEM, T> implements InterfaceC724530SbT, InterfaceC1588310rQz, InterfaceC1582750rI1 {
    public final C01GW LLIZ = C737910Sx3.LIZLLL(this, C13LE.LIZ(FriendsV3CellAreaViewModel.class), AFwS243S0000000_11.get$arr$(290), EnumC452301pR.SYNCHRONIZED);

    @Override // X.InterfaceC1582750rI1
    public final boolean E6() {
        return false;
    }

    @Override // X.InterfaceC1588310rQz
    public final boolean G2() {
        return false;
    }

    @Override // X.InterfaceC1582750rI1
    public final void Hh(AwS107S1200000_24 awS107S1200000_24) {
    }

    public InterfaceC1361290lWp LJIL() {
        return null;
    }

    @Override // X.InterfaceC1588310rQz
    public final InterfaceC1582750rI1 LLIZLLLIL() {
        return this;
    }

    @Override // X.InterfaceC1588310rQz
    public final View W8() {
        return null;
    }

    @Override // X.InterfaceC1588310rQz
    public final InterfaceC1588320rR0 Z0() {
        return null;
    }

    @Override // X.InterfaceC1582750rI1
    public final void bk() {
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ boolean bn() {
        return true;
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

    @Override // X.InterfaceC1588310rQz
    public final Aweme getAweme() {
        return null;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
        return null;
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

    @Override // X.InterfaceC1582750rI1, X.InterfaceC1483820oiS
    public final Surface getSurface() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void hj() {
    }

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void pe() {
    }

    @Override // X.InterfaceC1483820oiS
    public final HashMap getParams() {
        return new HashMap();
    }

    @Override // X.InterfaceC1582750rI1, X.InterfaceC1483820oiS
    public final FrameLayout getPlayViewContainer() {
        View view = this.itemView;
        if (view instanceof FrameLayout) {
            return (FrameLayout) view;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        Boolean bool = Boolean.FALSE;
        LLJJ(new C0SDJ(bool, bool, bool, EnumC21696919vj.ON_DETACHED));
    }

    @Override // X.InterfaceC1588310rQz
    public final int y2() {
        return getBindingAdapterPosition();
    }

    @Override // X.InterfaceC1582750rI1
    public final C0SDF ed() {
        return C0SDF.NONE;
    }

    public void LLJJ(C0SDJ c0sdj) {
        AssemViewModel assemViewModel = (AssemViewModel) this.LLIZ.getValue();
        if (!Intrinsics.LJFF(assemViewModel.getState(), c0sdj)) {
            assemViewModel.setStateImmediate(new AwS590S0100000_11(c0sdj, 13));
        }
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        VideoItemParams videoItemParams;
        super.onBindItemView(interfaceC1891350zJl);
        T item = getItem();
        if ((item instanceof VideoItemParams) && (videoItemParams = (VideoItemParams) item) != null) {
            videoItemParams.currentPosition = getAdapterPosition();
            C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
            c1587740rQ4.getClass();
            if (!C1587740rQ4.LJIJI) {
                C1587740rQ4.LJIILIIL = SystemClock.elapsedRealtime() - C1587740rQ4.LIZJ;
                C1587740rQ4.LJJI = videoItemParams.getAweme();
                C1587740rQ4.LJI(c1587740rQ4, C0SDP.FEED_LIST, false, null, 6);
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup viewGroup) {
        if (C1261804wi.LIZ()) {
            this.LL = C705700RmC.LIZIZ(viewGroup.getContext(), ((ReusedUISlotAssem) NG1()).Oo(), viewGroup, false, false, 20);
            Sl0(LJJIJL(), this);
            return LJJIJL();
        }
        return super.onCreateItemView(viewGroup);
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
