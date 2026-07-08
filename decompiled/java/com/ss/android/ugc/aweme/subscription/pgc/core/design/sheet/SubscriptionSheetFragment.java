package com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet;

import X.C420740Gee;
import X.C437700HEi;
import X.C437720HEk;
import Y.ARunnableS7S0210000_4;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.sheet.BaseSheet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SubscriptionSheetFragment extends BaseSheet {
    public C437720HEk LLJJIII;
    public C420740Gee LLJJIJI;

    public int QM(Context context) {
        return 0;
    }

    public C437720HEk UR() {
        return null;
    }

    public abstract View VR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public C437700HEi WR() {
        return null;
    }

    public SheetOptions ZR() {
        return null;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        requireContext();
        SheetOptions sheetOptionsZR = ZR();
        float f = (sheetOptionsZR == null || sheetOptionsZR.dimBehindType != 0) ? 0.5f : 0.0f;
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setDimAmount(f);
        }
        boolean z = sheetOptionsZR != null ? sheetOptionsZR.isDraggable : true;
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS7S0210000_4(this, sheetOptionsZR, z, 0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0101  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SubscriptionSheetFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
