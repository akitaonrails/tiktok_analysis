package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.C098200Yq;
import X.C1071540dzU;
import X.C1074520e4I;
import X.C1074610e4R;
import X.C1074630e4T;
import X.C1369580lkC;
import X.C1370940lmO;
import X.C13IQ;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2001407si;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C444910HcX;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1074240e3q;
import X.InterfaceC1368050lhj;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.share.InviteFriendsPageSharePackage;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class RecEmptyFragment extends FFPBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJSHELIOS4nISoiZyk1OGs5IGEBLSYJJD8nMQM+KCg+LSs4";
    public InviteFriendsPageSharePackage LLIZLLLIL;
    public C1074610e4R LLJ;
    public View LLJI;
    public final int LLJIJIL = -1;

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void cS() {
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0dwS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1069810dwh) obj).LLILLJJLI;
            }
        }, null, new AwS630S0100000_16(this, 26), 6);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InviteFriendsPageSharePackage inviteFriendsPageSharePackage = this.LLIZLLLIL;
        if (inviteFriendsPageSharePackage == null) {
            inviteFriendsPageSharePackage = null;
        }
        inviteFriendsPageSharePackage.LJJ();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int UR() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void aS(C13IQ<? extends Fragment> c13iq) {
        if (!SR().getState().LLILZLL) {
            new C2001407si("invite", VR().getPreviousPage(), VR().getNewMafCount()).LIZLLL(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void bS(View view) {
        View view2 = this.LLJI;
        if (view2 == null) {
            view2 = null;
        }
        C1749280vcc c1749280vcc = (C1749280vcc) view2.findViewById(R.id.w28);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = getString(2131834649);
        C444910HcX c444910HcX = new C444910HcX(getString(2131834648));
        c444910HcX.LIZ(51);
        c1722300uv6.LJIIIIZZ = c444910HcX;
        c1749280vcc.setStatus(c1722300uv6);
        View view3 = this.LLJI;
        if (view3 == null) {
            view3 = null;
        }
        ((TextView) view3.findViewById(R.id.kz6)).setText(2131834657);
        View view4 = this.LLJI;
        if (view4 == null) {
            view4 = null;
        }
        C426750GoL.LJIIIZ(view4.findViewById(R.id.kz5), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 26);
        View view5 = this.LLJI;
        if (view5 == null) {
            view5 = null;
        }
        C1369580lkC c1369580lkC = (C1369580lkC) view5.findViewById(R.id.nhp);
        final Context context = c1369580lkC.getContext();
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "text";
        InviteFriendsPageSharePackage inviteFriendsPageSharePackage = new InviteFriendsPageSharePackage(c1370940lmO);
        this.LLIZLLLIL = inviteFriendsPageSharePackage;
        inviteFriendsPageSharePackage.LJJIFFI();
        InviteFriendsPageSharePackage inviteFriendsPageSharePackage2 = this.LLIZLLLIL;
        if (inviteFriendsPageSharePackage2 == null) {
            inviteFriendsPageSharePackage2 = null;
        }
        c1369580lkC.LJIIZILJ(inviteFriendsPageSharePackage2.LJJI(requireActivity()), false);
        c1369580lkC.LLJJ = new InterfaceC1368050lhj() { // from class: X.0dwl
            @Override // X.InterfaceC1368050lhj
            public final void LJIIIIZZ(InterfaceC1369790lkX interfaceC1369790lkX, View view6) {
                InviteFriendsPageSharePackage inviteFriendsPageSharePackage3 = this.LL.LLIZLLLIL;
                if (inviteFriendsPageSharePackage3 == null) {
                    inviteFriendsPageSharePackage3 = null;
                }
                inviteFriendsPageSharePackage3.LJI(context, interfaceC1369790lkX);
            }
        };
        C1074610e4R c1074610e4R = this.LLJ;
        if (c1074610e4R == null) {
            c1074610e4R = null;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLIZIZ = c1074610e4R.LIZIZ();
        View view6 = this.LLJI;
        if (view6 == null) {
            view6 = null;
        }
        viewOnAttachStateChangeListenerC20604515jvLIZIZ.LJ(0, view6);
        C1074610e4R c1074610e4R2 = this.LLJ;
        if (c1074610e4R2 == null) {
            c1074610e4R2 = null;
        }
        c1074610e4R2.LIZIZ().setLayoutManager(new WrapLinearLayoutManager(getContext(), 1));
        if (!SR().getState().LLILZLL) {
            new C2001407si("invite", VR().getPreviousPage(), VR().getNewMafCount()).LIZLLL(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        C1074610e4R c1074610e4R = (C1074610e4R) C1071540dzU.LIZIZ.LJFF();
        c1074610e4R.LIZJ(new C1074630e4T(requireActivity(), EnumC1074240e3q.FIND_FRIENDS, new C1074520e4I(SR().getState().LLILZIL.LIZ, null, 30), false, false, false, false, null, 2131847890, false, null, null, 254568));
        c1074610e4R.LLJILJILJ = new AwS560S0100000_16(this, 499);
        this.LLJ = c1074610e4R;
        this.LLJI = C786410Ut5.LJLLJ(getContext(), R.layout.c_i, null);
        C1074610e4R c1074610e4R2 = this.LLJ;
        if (c1074610e4R2 == null) {
            c1074610e4R2 = null;
        }
        View view = (View) c1074610e4R2.LLIZ.getValue();
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                view.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                } else {
                    c19gs = null;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view;
    }
}
