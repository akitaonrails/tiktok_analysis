package com.ss.android.ugc.aweme.inbox.bulletin;

import X.C03H5;
import X.C098200Yq;
import X.C0OJX;
import X.C0OLV;
import X.C0OPX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1246860iYG;
import X.C13LE;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC21503819Do;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class BulletinProfileFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC724530SbT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZiHELIOSc5JSM2PCwiZw0mJCkpPSY9GDcjLyY/LQM+KCg+LSs4";
    public long LLIZ;
    public final C736950SvV LLIZLLLIL;

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
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

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final BulletinProfileViewModel SR() {
        return (BulletinProfileViewModel) this.LLIZLLLIL.getValue();
    }

    public BulletinProfileFragment() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 242);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(160), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C0OPX.LJIIJJI("bulletin_board_profile_page", "onDestroy");
        SR().LLJJJJLIIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C0OPX.LJIIJJI("bulletin_board_profile_page", "onPause");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0OPX.LJIIJJI("bulletin_board_profile_page", "onResume");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C0OPX.LJIIJJI("bulletin_board_profile_page", "onCreate");
        this.LLIZ = C0OPX.LIZLLL(getArguments(), "bulletin_board_id");
        NR(AFwS240S0000000_9.get$arr$(158));
        activityConfiguration(AFwS240S0000000_9.get$arr$(159));
        super.onCreate(bundle);
        C1246860iYG c1246860iYG = C1246860iYG.LIZ;
        Bundle arguments = getArguments();
        c1246860iYG.getClass();
        C1246860iYG.LIZIZ(this, arguments, 1001);
    }

    @Override // X.InterfaceC21503819Do
    public final void qO(Intent intent) {
        C0OPX.LJIIJJI("bulletin_board_profile_page", "onActivityNewIntent");
        C1246860iYG c1246860iYG = C1246860iYG.LIZ;
        Bundle arguments = getArguments();
        c1246860iYG.getClass();
        C1246860iYG.LIZIZ(this, arguments, 1001);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        String string;
        boolean z;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        Integer numLJIIJJI;
        super.onViewCreated(view, bundle);
        C0OPX.LJIIJJI("bulletin_board_profile_page", "onViewCreated");
        Bundle arguments = getArguments();
        if (arguments != null && (string6 = arguments.getString("bulletin_account_status")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string6)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 1;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("previous_page")) == null) {
            string = "";
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z = arguments3.getBoolean("enter_from_create");
        } else {
            z = false;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string2 = arguments4.getString("conv_short_id");
        } else {
            string2 = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            string3 = arguments5.getString("msg_id");
        } else {
            string3 = null;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            string4 = arguments6.getString("profile_open_reason");
        } else {
            string4 = null;
        }
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            string5 = arguments7.getString("next_action");
        } else {
            string5 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("channelID = ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", previousPage = ");
        sbLIZ.append(string);
        sbLIZ.append(", enterFromCreate = ");
        sbLIZ.append(z);
        sbLIZ.append(", bulletinBoardStatus = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", conversationId = ");
        sbLIZ.append(string2);
        sbLIZ.append(", messageId = ");
        sbLIZ.append(string3);
        sbLIZ.append(", openReason = ");
        sbLIZ.append(string4);
        sbLIZ.append(", enterAction = ");
        sbLIZ.append(string5);
        C0OPX.LJIILJJIL("bulletin_board_profile_page", C2188811AlT.LIZIZ(sbLIZ));
        C0OLV c0olv = new C0OLV(String.valueOf(this.LLIZ), string, z, iIntValue, string2, string3, false, string4, false, false, null, null, null, null, null, null, string5, 65280);
        if (SR().LLILLJJLI == null || C0OJX.LIZIZ()) {
            SR().KQ2(this.LLIZ, string2, string3, null);
            SR().UQ2();
        }
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0OLP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJJI;
            }
        }, null, new AwS623S0100000_9(this, 40), 6);
        C723850SaN.LIZ(this, false, null, new AwS375S0200000_9(this, c0olv, 42), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a8y, viewGroup, false);
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
