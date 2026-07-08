package com.ss.android.ugc.aweme.ecommercelive.audience.common.preload;

import X.C01GW;
import X.C098200Yq;
import X.C1391190mJ3;
import X.C1685300txQ;
import X.C16G0;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1541990qEH;
import X.InterfaceC1766510w4P;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopBagListContainerFragment extends ECBaseSheetFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLCM6PiBiKDo3ISAiKiHELIOSp9KyohJCA9ZjU+LCM8KSFiGic8OActLgM6OzEPJiEnKSwiLD0VOiQrJCo9PA==";
    public ShopBagListSparkFragment LLIZ;
    public InterfaceC1766510w4P LLIZLLLIL;
    public boolean LLJ = true;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 665));

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void bS(C16G0 c16g0) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void cS(TuxSheet tuxSheet, float f) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void dS(int i, int i2, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void gS() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void iS() {
        LJJJJLL(true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final boolean isHalfScreen() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        LJJJJLL(true);
        return true;
    }

    public final void mS() {
        C19EG activity;
        View viewE1;
        ViewGroup viewGroup;
        ShopBagListSparkFragment shopBagListSparkFragment = this.LLIZ;
        if (shopBagListSparkFragment != null) {
            InterfaceC1541990qEH kitView = shopBagListSparkFragment.getKitView();
            if (kitView != null && (viewE1 = kitView.e1()) != null) {
                ViewParent parent = viewE1.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(viewE1, viewGroup);
                }
            }
            shopBagListSparkFragment.release();
            try {
                if (isAdded() && !isRemoving() && getActivity() != null && ((activity = getActivity()) == null || !activity.isFinishing())) {
                    C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                    c19ehLJIIJ.LJIIZILJ(shopBagListSparkFragment);
                    c19ehLJIIJ.LJIIL();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Dialog dialog;
        super.onStart();
        if (this.LLJ || (dialog = getDialog()) == null) {
            return;
        }
        dialog.hide();
    }

    public final void LJJJJLL(boolean z) {
        InterfaceC1766510w4P interfaceC1766510w4P;
        this.LLJ = false;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIILIIL(this);
        ShopBagListSparkFragment shopBagListSparkFragment = this.LLIZ;
        if (shopBagListSparkFragment != null) {
            shopBagListSparkFragment.onFragmentHide();
        }
        if (z && (interfaceC1766510w4P = this.LLIZLLLIL) != null) {
            interfaceC1766510w4P.onHide();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener((ViewTreeObserver.OnWindowFocusChangeListener) this.LLJI.getValue());
        }
        InterfaceC1766510w4P interfaceC1766510w4P = this.LLIZLLLIL;
        if (interfaceC1766510w4P != null) {
            interfaceC1766510w4P.onDismiss();
        }
        this.LLIZLLLIL = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnWindowFocusChangeListener((ViewTreeObserver.OnWindowFocusChangeListener) this.LLJI.getValue());
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bwf, viewGroup, false);
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
