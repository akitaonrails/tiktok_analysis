package com.ss.android.ugc.aweme.subscription.pgc.commonui.fragmentcontainer;

import X.C098200Yq;
import X.C0K45;
import X.C13IQ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C723850SaN;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: loaded from: classes8.dex */
public final class SubContentFragmentContainer extends PgcBaseFragment implements PgcFragmentContainerAbility {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KyohJCA9HELIOSPSxiLz0yLygpJzswJys4KCY9LTdiGjoxCyoiPSo9PAM+KCg+LSs4CiA9PCQlJyoh";
    public String LLILLJJLI = "";

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragmentcontainer.PgcFragmentContainerAbility
    public final void ow() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        DialogFragment dialogFragment;
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof DialogFragment) && (dialogFragment = (DialogFragment) parentFragment) != null) {
            dialogFragment.dismissAllowingStateLoss();
            return;
        }
        if (getParentFragmentManager().LJJLIIIIJ() > 0) {
            getParentFragmentManager().LJLLILLLL();
            return;
        }
        C19EG activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.LJ();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        if (this.LLILLJJLI.length() == 0) {
            Bundle arguments = getArguments();
            if (arguments == null || (string = arguments.getString("fragment_id")) == null) {
                string = "";
            }
            this.LLILLJJLI = string;
        }
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, PgcFragmentContainerAbility.class, null, this);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C13IQ c13iq;
        super.onViewCreated(view, bundle);
        Pair pair = (Pair) ((LinkedHashMap) C0K45.LIZ).get(this.LLILLJJLI);
        if (pair != null && (c13iq = (C13IQ) pair.getSecond()) != null) {
            C723850SaN.LIZ(this, false, null, new AwS368S0200000_2((Fragment) this, (Fragment) c13iq, (C13IQ<? extends UISlotAssem>) 118), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fgo, viewGroup, false);
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
