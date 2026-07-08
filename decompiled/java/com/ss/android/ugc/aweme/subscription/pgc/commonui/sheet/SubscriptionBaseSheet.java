package com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet;

import X.C098200Yq;
import X.C0H20;
import X.C0HE7;
import X.C0HE8;
import X.C0HN5;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C439350HKr;
import X.C786410Ut5;
import X.ViewTreeObserverOnGlobalLayoutListenerC434490H1z;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS75S0200000_6;
import android.R;
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
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.BaseSheet;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SubscriptionBaseSheet extends BaseSheet {
    public C439350HKr LLJJJ;
    public boolean LLJJJIL;
    public ViewTreeObserverOnGlobalLayoutListenerC434490H1z LLJJJJ;
    public final float LLJJIII = 0.5f;
    public final float LLJJIJI = 0.9f;
    public final boolean LLJJIJIIJIL = true;
    public final boolean LLJJIJIL = true;
    public final C0HE7 LLJJJJJIL = new C0H20() { // from class: X.0HE7
        @Override // X.C0H20
        public final void LIZ(int i, boolean z) {
            SubscriptionBaseSheet subscriptionBaseSheet = this.LIZ;
            if (!z) {
                i = 0;
            }
            subscriptionBaseSheet.UR(i);
        }
    };

    public abstract int VR();

    public Float WR() {
        return null;
    }

    public Integer ZR() {
        return null;
    }

    public boolean bS() {
        return false;
    }

    public boolean cS() {
        return false;
    }

    public C0HN5 dS() {
        return null;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet
    public final boolean RR() {
        return aS() > 0.0f;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (bS()) {
            ViewTreeObserverOnGlobalLayoutListenerC434490H1z viewTreeObserverOnGlobalLayoutListenerC434490H1z = this.LLJJJJ;
            if (viewTreeObserverOnGlobalLayoutListenerC434490H1z != null) {
                viewTreeObserverOnGlobalLayoutListenerC434490H1z.LLILZIL.remove(this.LLJJJJJIL);
            }
            ViewTreeObserverOnGlobalLayoutListenerC434490H1z viewTreeObserverOnGlobalLayoutListenerC434490H1z2 = this.LLJJJJ;
            if (viewTreeObserverOnGlobalLayoutListenerC434490H1z2 != null) {
                C786410Ut5.C3(viewTreeObserverOnGlobalLayoutListenerC434490H1z2.getContentView().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC434490H1z2);
                viewTreeObserverOnGlobalLayoutListenerC434490H1z2.dismiss();
            }
            this.LLJJJJ = null;
            UR(0);
            this.LLJJJIL = false;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ViewTreeObserverOnGlobalLayoutListenerC434490H1z viewTreeObserverOnGlobalLayoutListenerC434490H1z;
        if (bS() && (viewTreeObserverOnGlobalLayoutListenerC434490H1z = this.LLJJJJ) != null) {
            C786410Ut5.C3(viewTreeObserverOnGlobalLayoutListenerC434490H1z.getContentView().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC434490H1z);
            viewTreeObserverOnGlobalLayoutListenerC434490H1z.dismiss();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        ViewTreeObserverOnGlobalLayoutListenerC434490H1z viewTreeObserverOnGlobalLayoutListenerC434490H1z;
        View viewFindViewById;
        super.onResume();
        if (!bS() || (viewTreeObserverOnGlobalLayoutListenerC434490H1z = this.LLJJJJ) == null || (viewFindViewById = viewTreeObserverOnGlobalLayoutListenerC434490H1z.LL.findViewById(R.id.content)) == null) {
            return;
        }
        HandlerHook.viewPost(viewFindViewById, new ARunnableS75S0200000_6(viewFindViewById, viewTreeObserverOnGlobalLayoutListenerC434490H1z, 107));
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        View decorView;
        C19EG activity;
        Window window2;
        Window window3;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.setDimAmount(aS());
        }
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS106S0100000_6(this, 228));
        }
        if (bS() && !this.LLJJJIL && (activity = getActivity()) != null) {
            Dialog dialog2 = getDialog();
            if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
                window2.setSoftInputMode(48);
            }
            View view2 = getView();
            if (view2 != null) {
                HandlerHook.viewPost(view2, new ARunnableS75S0200000_6(this, activity, 56));
            }
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, this);
    }

    public float aS() {
        return this.LLJJIII;
    }

    public final void UR(int i) {
        View view;
        View view2 = getView();
        Object parent = null;
        if (view2 != null) {
            parent = view2.getParent();
        }
        if ((parent instanceof View) && (view = (View) parent) != null) {
            if (i < 0) {
                i = 0;
            }
            float f = -i;
            if (view.getTranslationY() == f) {
                return;
            }
            C786410Ut5.ed(view, f);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Context activity = getActivity();
        if (activity == null) {
            activity = requireContext();
        }
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C0HE8.LIZ(activity));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, VR(), viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, this);
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
