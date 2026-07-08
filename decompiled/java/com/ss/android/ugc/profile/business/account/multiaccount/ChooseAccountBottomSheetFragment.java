package com.ss.android.ugc.profile.business.account.multiaccount;

import X.C01GW;
import X.C098200Yq;
import X.C0H1U;
import X.C0HZO;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1255340ilw;
import X.C1255380im0;
import X.C1255390im1;
import X.C12ES;
import X.C1391190mJ3;
import X.C14EU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C343970De7;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1255400im2;
import X.InterfaceC344240DeY;
import Y.AObserverS182S0200000_19;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS592S0100000_13;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class ChooseAccountBottomSheetFragment extends Fragment implements InterfaceC344240DeY, InterfaceC1255400im2 {
    public static ChooseAccountBottomSheetFragment LLILZIL = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9KSYvJjo9PGshHELIOSPCMnISQvKiAmJjFiCic8JzYpCCwwJzAiPQ08PDEjJBw7LSA4Dz0yLygpJzs=";
    public C1255340ilw LL;
    public MultiProfilesViewModel LLILLJJLI;
    public final long LLILLL = System.currentTimeMillis();
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2045));

    static {
        new C1255380im0();
    }

    public final C1255390im1 MR() {
        return (C1255390im1) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131829327);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LJIIIIZZ = getString(2131823173);
        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 2044));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // X.InterfaceC1255400im2
    public final void dismiss() {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LLILZIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        EventBus.LIZLLL().LJJI(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LLILZIL = this;
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLILLJJLI = (MultiProfilesViewModel) ViewModelProviders.of(activity).get(MultiProfilesViewModel.class);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void refreshNoticeCount(C0HZO c0hzo) {
        C1255340ilw c1255340ilw = this.LL;
        C1255340ilw c1255340ilw2 = null;
        if (c1255340ilw == null) {
            c1255340ilw = null;
        }
        int itemCount = c1255340ilw.getItemCount();
        if (itemCount <= 2) {
            return;
        }
        C1255340ilw c1255340ilw3 = this.LL;
        if (c1255340ilw3 != null) {
            c1255340ilw2 = c1255340ilw3;
        }
        c1255340ilw2.notifyItemRangeChanged(1, itemCount - 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = new RecyclerView(getContext());
        C786410Ut5.p6(recyclerView, new ViewGroup.LayoutParams(-1, -2));
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null) {
            this.LL = new C1255340ilw(new WeakReference(this), MR(), activity, getArguments());
            C0H1U.LJIIJ((int) C12ES.LIZJ(8.0f, getContext()), recyclerView);
            C0H1U.LJII((int) C12ES.LIZJ(8.0f, getContext()), recyclerView);
            MultiProfilesViewModel multiProfilesViewModel = this.LLILLJJLI;
            if (multiProfilesViewModel == null) {
                multiProfilesViewModel = null;
            }
            Transformations.map(multiProfilesViewModel.LLILLJJLI, new AwS592S0100000_13(multiProfilesViewModel, 59)).observe(getViewLifecycleOwner(), new AObserverS182S0200000_19(this, recyclerView, 1));
        }
        try {
            ViewTreeLifecycleOwner.set(recyclerView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(recyclerView, this);
            recyclerView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity2 = getActivity();
            if (activity2 instanceof C19GS) {
                c19gs = (C19GS) activity2;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return recyclerView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return recyclerView;
        }
    }
}
