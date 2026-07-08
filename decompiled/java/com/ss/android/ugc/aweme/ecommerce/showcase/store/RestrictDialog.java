package com.ss.android.ugc.aweme.ecommerce.showcase.store;

import X.C098200Yq;
import X.C0DU7;
import X.C1018703yb;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C519860Ka8;
import X.C786410Ut5;
import X.C948503nH;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class RestrictDialog extends CommerceBottomSheetDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvHELIOSLGEgICo7Ki4gLWs/PSAhLWseLDwnOiwvPQs6KSkjLg==";
    public TuxTextView LLJI;
    public TuxIconView LLJIJIL;
    public TuxTextView LLJILJIL;

    public RestrictDialog() {
        super(0);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C1018703yb.LIZIZ("tiktokec_enter_page", C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("previous_page", "edit_profile"), new Pair("page_name", "change_restriction"), new Pair("restriction_type", "copy_address")));
        C1018703yb.LIZIZ("tiktokec_button_show", C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("previous_page", "edit_profile"), new Pair("page_name", "change_restriction"), new Pair("button_name", "copy_address")));
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("ecom_store_share_link", "seller.tiktok.com");
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.www_res_0x7f0a9874);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = (TuxTextView) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(strLJI);
        View viewFindViewById2 = this.LLJIJIL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.e1g);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJIJIL = (TuxIconView) viewFindViewById2;
        }
        C948503nH.LJIILIIL(viewFindViewById2, getViewLifecycleOwner(), new C0DU7(this, null), 2);
        View viewFindViewById3 = this.LLJILJIL;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.d6g);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJILJIL = (TuxTextView) viewFindViewById3;
        }
        C948503nH.LJIILIIL(viewFindViewById3, getViewLifecycleOwner(), new C519860Ka8(this, strLJI, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aun, viewGroup, false);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
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
