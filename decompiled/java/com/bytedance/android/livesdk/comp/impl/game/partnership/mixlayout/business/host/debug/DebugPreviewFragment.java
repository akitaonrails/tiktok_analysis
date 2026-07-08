package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.debug;

import X.C098200Yq;
import X.C1685300txQ;
import X.C1881170z3L;
import X.C1881180z3M;
import X.C1883060z6O;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21578619ce;
import X.C786410Ut5;
import X.InterfaceC1881340z3c;
import android.app.Dialog;
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
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public final class DebugPreviewFragment extends LiveSheetHostFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7HELIOSITViJCYrJCQ1JjonZic5OiY9LTY/Zyc8OzFiLSoxPSJiDSoxPSIcOyolISA7Dz0yLygpJzs=";
    public C1881170z3L LLJ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0z8k
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i == 4 && keyEvent.getAction() == 1) {
                        this.LL.dismissAllowingStateLoss();
                        return true;
                    }
                    return false;
                }
            });
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1881170z3L c1881170z3L;
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ;
        C1883060z6O c1883060z6OLJIIJJI;
        int i;
        C1881180z3M c1881180z3M;
        int i2;
        C1881180z3M c1881180z3M2;
        super.onViewCreated(view, bundle);
        C21578619ce c21578619ce = (C21578619ce) view.findViewById(R.id.ts4);
        ViewGroup.LayoutParams layoutParams = c21578619ce.getLayoutParams();
        if (layoutParams != null) {
            C1881170z3L c1881170z3L2 = this.LLJ;
            if (c1881170z3L2 != null && (c1881180z3M2 = c1881170z3L2.LLJILJILJ) != null) {
                i = c1881180z3M2.LIZLLL;
            } else {
                i = 0;
            }
            int i3 = -1;
            if (i <= 0) {
                i = -1;
            }
            layoutParams.width = i;
            if (c1881170z3L2 != null && (c1881180z3M = c1881170z3L2.LLJILJILJ) != null && (i2 = c1881180z3M.LJ) > 0) {
                i3 = i2;
            }
            layoutParams.height = i3;
        }
        C1881170z3L c1881170z3L3 = this.LLJ;
        if (c1881170z3L3 != null && (interfaceC1881340z3cLJIIIZ = c1881170z3L3.LJIIIZ()) != null && (c1883060z6OLJIIJJI = interfaceC1881340z3cLJIIIZ.LJIIJJI()) != null) {
            c1883060z6OLJIIJJI.LJI(c21578619ce);
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.trb);
        if (frameLayout != null && (c1881170z3L = this.LLJ) != null) {
            c1881170z3L.h(frameLayout);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (viewOnCreateView instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) viewOnCreateView;
        } else {
            viewGroup2 = null;
        }
        C786410Ut5.Td(layoutInflater, R.layout.gmv, viewGroup2, true);
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }
}
