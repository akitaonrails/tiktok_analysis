package com.ss.android.ugc.aweme.favorites.base.ui;

import X.C098200Yq;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C607410Ns3;
import X.C607420Ns4;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1206390hUz;
import X.InterfaceC1258040iqI;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseFavoritePage extends BaseFragment implements InterfaceC1258040iqI, InterfaceC1206390hUz {
    public abstract boolean SR();

    public abstract String UR();

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    public abstract C19719912Dl VR();

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        BasicFavoritePageAbilities basicFavoritePageAbilities;
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper()) && getViewLifecycleOwner().getLifecycle().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) > 0 && (basicFavoritePageAbilities = (BasicFavoritePageAbilities) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), BasicFavoritePageAbilities.class, null)) != null) {
            return basicFavoritePageAbilities.fj0();
        }
        return null;
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C607420Ns4(this, null));
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C607410Ns3(this, null));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS375S0200000_9(this, view, 31), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.d23, viewGroup, false);
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
}
