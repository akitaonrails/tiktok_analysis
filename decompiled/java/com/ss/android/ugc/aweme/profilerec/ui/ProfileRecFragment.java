package com.ss.android.ugc.aweme.profilerec.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0PEM;
import X.C13LE;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C23250099c;
import X.C2344009Gk;
import X.C336720DHy;
import X.C452501pT;
import X.C590920NFq;
import X.C632880Os2;
import X.C632950Os9;
import X.C786410Ut5;
import X.EnumC1427810nG7;
import X.EnumC452301pR;
import X.InterfaceC898260ZLs;
import Y.AObserverS174S0200000_9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profilerec.vm.ProfileRecViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS445S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ProfileRecFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+JiHELIOSk6JCA+LCx9PSxiGT08LiwgLB02KwM+KCg+LSs4";
    public Function2<? super Boolean, ? super Boolean, Unit> LL;
    public final ViewModelLazy LLILLJJLI;

    public ProfileRecFragment() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS553S0100000_9(new AwS553S0100000_9((Fragment) this, 1449), (Function0<Unit>) 1450));
        this.LLILLJJLI = C336720DHy.LIZ(this, C13LE.LIZ(ProfileRecViewModel.class), new AwS553S0100000_9(c01gwLIZ, 1451), new AwS410S0200000_9((Function0) null, c01gwLIZ, 60), new AwS410S0200000_9(this, c01gwLIZ, 61));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C590920NFq(null), 2);
        ProfileRecViewModel profileRecViewModel = (ProfileRecViewModel) this.LLILLJJLI.getValue();
        if (profileRecViewModel.LLJIJIL.getAndSet(true)) {
            return;
        }
        C632880Os2 c632880Os2 = ((C632950Os9) profileRecViewModel.LLILLL.getValue()).LIZ;
        String str = c632880Os2.LIZ;
        String strLIZJ = c632880Os2.LIZJ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", str);
        c2344009Gk.LJIIIIZZ("item_id", strLIZJ);
        C20684815ws.LJIILLIIL("friend_reco_card_show", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ProfileRecViewModel profileRecViewModel = (ProfileRecViewModel) this.LLILLJJLI.getValue();
        if (profileRecViewModel.LLJILJIL.getAndSet(true)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("exit_method", profileRecViewModel.LLIZLLLIL);
        C20684815ws.LJIILLIIL("friend_reco_card_disappear", c2344009Gk.LIZ);
        profileRecViewModel.LLIZLLLIL = "close";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null && !Hox.LLJILJIL.LIZ(activity).KQ2("For You")) {
            Function2<? super Boolean, ? super Boolean, Unit> function2 = this.LL;
            if (function2 != null) {
                function2.invoke(null, Boolean.TRUE);
                return;
            }
            return;
        }
        ComposeView composeView = (ComposeView) view.findViewById(R.id.eoa);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1448));
        ((ProfileRecViewModel) this.LLILLJJLI.getValue()).LLIZ.observe(getViewLifecycleOwner(), new AObserverS174S0200000_9(this, c01gwLIZIZ, 0));
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(412664647, new AwS445S0200000_9(this, (ProfileRecFragment) c01gwLIZIZ, (C01GW<? extends InterfaceC898260ZLs>) 17), true));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Function2<? super Boolean, ? super Boolean, Unit> function2;
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null && !Hox.LLJILJIL.LIZ(activity).KQ2("For You") && (function2 = this.LL) != null) {
            function2.invoke(null, Boolean.TRUE);
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i77, viewGroup, false);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity2 = getActivity();
            if (activity2 instanceof C19GS) {
                c19gs = (C19GS) activity2;
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
}
