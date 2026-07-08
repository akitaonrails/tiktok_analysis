package com.bytedance.tux.adaptive;

import X.C098200Yq;
import X.C1246120iX4;
import X.C1389600mGU;
import X.C1389610mGV;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20589915hZ;
import X.C20590015ha;
import X.C20590315hd;
import X.C20590915hj;
import X.C20591715hr;
import X.C338740DPs;
import X.C338760DPu;
import X.C786410Ut5;
import X.DialogC1391040mIo;
import X.EnumC1390870mIX;
import X.EnumC20591315hn;
import X.InterfaceC1593800rZq;
import Y.ACListenerS155S0100000_21;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public final class TuxModal extends AppCompatDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDd9HELIOSKSEtOTs6PiBiHTorBSooKCM=";
    public boolean LL = true;
    public boolean LLILLJJLI = true;
    public boolean LLILLL = true;
    public Fragment LLILZ;
    public boolean LLILZIL;
    public Observer<C20590315hd> LLILZLL;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Observer<C20590315hd> observer = this.LLILZLL;
        if (observer != null) {
            C20589915hZ.LIZLLL(observer);
        }
        this.LLILZLL = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C1389610mGV.LIZIZ(getDialog());
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        DialogC1391040mIo dialogC1391040mIo = new DialogC1391040mIo(requireContext(), this.LL);
        Window window = dialogC1391040mIo.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogC1391040mIo);
        return dialogC1391040mIo;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final C338760DPu c338760DPu;
        super.onViewCreated(view, bundle);
        C1246120iX4 c1246120iX4 = (C1246120iX4) view.findViewById(R.id.oip);
        c1246120iX4.LIZ(this.LLILLJJLI, this.LLILZIL);
        c1246120iX4.LIZIZ(getChildFragmentManager(), this.LLILZ);
        C20591715hr c20591715hr = C20591715hr.LIZ;
        if ((!c20591715hr.isPad() && !c20591715hr.LIZ()) || !c20591715hr.LJ(EnumC1390870mIX.DIALOG) || (c338760DPu = (C338760DPu) view.findViewById(R.id.acb)) == null) {
            return;
        }
        C20590915hj c20590915hj = C20589915hZ.LIZ;
        C20590015ha c20590015ha = new C20590015ha(view);
        c20590015ha.LIZIZ = EnumC20591315hn.HORIZONTAL;
        this.LLILZLL = C20589915hZ.LIZ(new InterfaceC1593800rZq() { // from class: X.0mIe
            @Override // X.InterfaceC1593800rZq
            public final void LIZ(C20590315hd c20590315hd) {
                c338760DPu.requestLayout();
            }
        }, c20590015ha, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gm, viewGroup, false);
        C19GS c19gs = null;
        TypedArray typedArrayObtainStyledAttributes = layoutInflater.getContext().obtainStyledAttributes(null, R$styleable.TuxModal, R.attr.ya, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxModal_tux_modalContainerColor, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxModal_tux_modalContainerRadius, 0);
        typedArrayObtainStyledAttributes.recycle();
        C338760DPu c338760DPu = (C338760DPu) viewTd.findViewById(R.id.acb);
        c338760DPu.setConstraints(new C338740DPs());
        RadiusLayout radiusLayout = (RadiusLayout) viewTd.findViewById(R.id.spp);
        radiusLayout.setBackgroundColor(color);
        radiusLayout.setRadius(dimensionPixelSize);
        ((C1246120iX4) viewTd.findViewById(R.id.oip)).setNavBarBackground$tux_theme_release(Integer.valueOf(color));
        if (this.LLILLL) {
            C786410Ut5.S8(c338760DPu, new ACListenerS155S0100000_21(this, 13));
            C786410Ut5.p9(radiusLayout, new View.OnClickListener() { // from class: X.0mId
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
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
