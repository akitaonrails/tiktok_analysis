package com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment;

import X.AnonymousClass0951;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C23250099c;
import X.C318630CeL;
import X.C428380Gqy;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.effectcreatormobile.infrastructure.ui.base.CKEFragment;
import com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment.CommonFetchViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CommonFetchFragment<T, VM extends CommonFetchViewModel<T>> extends CKEFragment {
    public abstract int OR();

    public abstract C428380Gqy PR();

    public abstract VM RR();

    public void UR(View view, Bundle bundle) {
    }

    public abstract void VR(T t);

    public void SR(Bundle bundle) {
        AnonymousClass0951 anonymousClass0951 = RR().LLILLJJLI;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C318630CeL(viewLifecycleOwner, Lifecycle.State.STARTED, anonymousClass0951, null, this), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RR().vQ2();
        UR(view, bundle);
        SR(bundle);
    }

    @Override // com.bytedance.effectcreatormobile.infrastructure.ui.base.CKEFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, OR(), viewGroup, false);
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
