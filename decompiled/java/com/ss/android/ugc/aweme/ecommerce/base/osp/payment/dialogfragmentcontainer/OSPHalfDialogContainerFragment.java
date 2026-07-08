package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dialogfragmentcontainer;

import X.C098200Yq;
import X.C128Y;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C786410Ut5;
import X.C865203Zq;
import X.C865703Zv;
import X.C958103op;
import X.EnumC865603Zu;
import X.InterfaceC883003ci;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class OSPHalfDialogContainerFragment extends CommerceBottomSheetDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGs8KDY+LSs4Zys6HELIOSKSkjLikhKSIhLCEnKyoiPS46JiA+ZwAAGA0tJSkXISQgJigQJys4KCY9LTcKOy40JSAiPQ==";
    public Fragment LLJI;
    public EnumC865603Zu LLJIJIL;
    public boolean LLJILJIL;
    public final float LLJILJILJ;

    public OSPHalfDialogContainerFragment() {
        super(0);
        this.LLJILJILJ = C958103op.LIZJ() * 0.93f;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final Integer VR() {
        EnumC865603Zu enumC865603Zu = this.LLJIJIL;
        if (enumC865603Zu != null) {
            int i = C865703Zv.LIZ[enumC865603Zu.ordinal()];
            return i != 1 ? i != 2 ? Integer.valueOf((int) (C958103op.LIZJ() * 0.9f)) : Integer.valueOf((int) this.LLJILJILJ) : Integer.valueOf((int) C958103op.LIZ());
        }
        if (!C865203Zq.LIZ() || this.LLJILJIL) {
            return null;
        }
        return Integer.valueOf((int) (C958103op.LIZJ() * 0.9f));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final boolean uH() {
        C128Y c128y = this.LLJI;
        if (c128y instanceof InterfaceC883003ci) {
            return ((InterfaceC883003ci) c128y).uH();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Fragment fragment = this.LLJI;
        if (fragment != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.eqx, fragment);
            c19ehLJIIJ.LJII(null);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.apm, viewGroup, false);
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
