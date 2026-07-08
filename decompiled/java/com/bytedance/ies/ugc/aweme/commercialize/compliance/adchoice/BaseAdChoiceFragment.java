package com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC746220TOy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseAdChoiceFragment extends Fragment {
    public final C01GW LL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(153));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 338));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(152));
    public String LLILZ;

    public abstract int MR();

    public final IConsistentContentAndAdChoiceService NR() {
        return (IConsistentContentAndAdChoiceService) this.LL.getValue();
    }

    public final AdChoiceViewModel OR() {
        return (AdChoiceViewModel) this.LLILLJJLI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        String strLIZ;
        InterfaceC746220TOy interfaceC746220TOyLIZIZ;
        super.onActivityCreated(bundle);
        IConsistentContentAndAdChoiceService iConsistentContentAndAdChoiceServiceNR = NR();
        if (iConsistentContentAndAdChoiceServiceNR != null && (interfaceC746220TOyLIZIZ = iConsistentContentAndAdChoiceServiceNR.LIZIZ()) != null) {
            strLIZ = interfaceC746220TOyLIZIZ.LIZ();
        } else {
            strLIZ = null;
        }
        this.LLILZ = strLIZ;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, MR(), viewGroup, false);
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
