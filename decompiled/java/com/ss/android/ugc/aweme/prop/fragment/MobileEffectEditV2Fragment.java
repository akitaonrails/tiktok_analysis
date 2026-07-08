package com.ss.android.ugc.aweme.prop.fragment;

import X.C098200Yq;
import X.C1252710ihh;
import X.C13LE;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1733820vDg;
import X.InterfaceC1737690vJv;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS109S1200000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class MobileEffectEditV2Fragment extends Fragment implements InterfaceC1737690vJv {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99LjctHELIOSLiI2JjFiBCAxISkpDCk1LSY4DCs6PBN+Dz0yLygpJzs=";

    @Override // X.InterfaceC1737690vJv
    public final boolean onBackPressed() {
        try {
            ((InterfaceC1733820vDg) C1252710ihh.LIZLLL(this, C13LE.LIZ(InterfaceC1733820vDg.class))).LJJLIIIJJIZ();
            C189200o6.m2constructorimpl(Unit.LIZ);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MobileEffectData mobileEffectData;
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            mobileEffectData = (MobileEffectData) arguments.getParcelable("effect_init_data");
        } else {
            mobileEffectData = null;
        }
        if ((mobileEffectData instanceof MobileEffectData) && mobileEffectData != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                string = arguments2.getString("effect_sdk_extra");
            } else {
                string = null;
            }
            C723850SaN.LIZ(this, false, null, new AwS109S1200000_26(this, mobileEffectData, string, 13), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c92, viewGroup, false);
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
