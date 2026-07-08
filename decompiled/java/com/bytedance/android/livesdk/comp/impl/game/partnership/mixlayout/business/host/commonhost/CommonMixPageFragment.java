package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.commonhost;

import X.C098200Yq;
import X.C0DKT;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C1881200z3O;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.base.view.MixPageInnerDialog;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.commonhost.CommonMixPageActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public final class CommonMixPageFragment extends LiveSheetHostFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITViHELIOSJCYrJCQ1JjonZic5OiY9LTY/Zyc8OzFiKiA+JSoiISAgPGsPJiI+JysBIDcDKSIpDz0yLygpJzs=";
    public C1881200z3O LLJ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isFollowAppTheme() {
        return true;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1881200z3O c1881200z3O = this.LLJ;
        if (c1881200z3O != null) {
            c1881200z3O.LJI();
        }
        this.LLJ = null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        MixPageInnerDialog mixPageInnerDialog = new MixPageInnerDialog(getContext(), getTheme());
        mixPageInnerDialog.LLJILJILJ = this;
        Window window = mixPageInnerDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(mixPageInnerDialog);
        return mixPageInnerDialog;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        C1881200z3O c1881200z3O;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("schema")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.getString("extra");
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.trb);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0DKS
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i != 4 || keyEvent.getAction() != 1) {
                        return false;
                    }
                    this.LL.dismissAllowingStateLoss();
                    C19EG activity = this.LL.getActivity();
                    if (activity instanceof CommonMixPageActivity) {
                        activity.finish();
                        try {
                            C1389600mGU.LIZIZ(activity);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        activity.overridePendingTransition(0, 0);
                    }
                    return true;
                }
            });
        }
        Context context = getContext();
        if (context != null) {
            C1881200z3O c1881200z3O2 = new C1881200z3O(context, string);
            this.LLJ = c1881200z3O2;
            c1881200z3O2.e(this);
            C1881200z3O c1881200z3O3 = this.LLJ;
            if (c1881200z3O3 != null) {
                c1881200z3O3.LLJJ = new C0DKT(this);
            }
            if (frameLayout != null && (c1881200z3O = this.LLJ) != null) {
                c1881200z3O.h(frameLayout);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f912gh6, viewGroup, false);
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
