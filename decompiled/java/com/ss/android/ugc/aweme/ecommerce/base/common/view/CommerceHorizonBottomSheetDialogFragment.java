package com.ss.android.ugc.aweme.ecommerce.base.common.view;

import X.C098200Yq;
import X.C1685300txQ;
import X.C1748770vbn;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C786410Ut5;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public class CommerceHorizonBottomSheetDialogFragment extends CommerceBottomSheetDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyw8JSgjJ2HELIOSElISA7Zww8JSgpOyw2ACo+IDU8JgcjPTs8JRYkLConDCwtJSA0DjctLiI2JjE=";
    public final boolean LLJI;
    public DialogInterface.OnDismissListener LLJIJIL;
    public ECBaseFragment LLJILJIL;
    public Integer LLJILJILJ;
    public boolean LLJILLL;

    public CommerceHorizonBottomSheetDialogFragment() {
        super(0);
        this.LLJI = true;
        this.LLJILLL = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return R.style.aad;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final boolean NR() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public Integer VR() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public boolean uH() {
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        ECBaseFragment eCBaseFragment = this.LLJILJIL;
        if (eCBaseFragment != null) {
            eCBaseFragment.NR(c1748770vbn);
        }
    }

    public final void cS(Integer num) {
        if (num != null) {
            num.intValue();
            this.LLJILJILJ = num;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ECBaseFragment eCBaseFragment = this.LLJILJIL;
        if (eCBaseFragment != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.iiv, eCBaseFragment);
            c19ehLJIIJ.LJII(null);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.LLJIJIL;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public static void dS(CommerceHorizonBottomSheetDialogFragment commerceHorizonBottomSheetDialogFragment, ECBaseFragment eCBaseFragment) {
        commerceHorizonBottomSheetDialogFragment.LLJILJIL = eCBaseFragment;
        eCBaseFragment.LLILLJJLI = new AwS545S0100000_1(commerceHorizonBottomSheetDialogFragment, 1614);
        commerceHorizonBottomSheetDialogFragment.LLJIJIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aln, viewGroup, false);
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
