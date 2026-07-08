package com.bytedance.tux.sheet.sidesheet;

import X.AbstractC1391030mIn;
import X.C098200Yq;
import X.C1175270ggn;
import X.C1246120iX4;
import X.C1389610mGV;
import X.C1685300txQ;
import X.C16G1;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C497820Jfg;
import X.C786410Ut5;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS27S0201000_21;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.BaseSheet;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public final class TuxSideSheet extends AppCompatDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDd9Oy0pLDt9HELIOSOywoLDw7LSA4ZxsmMBYlLSoAICApPQ==";
    public Fragment LLILLL;
    public Integer LLILZ;
    public boolean LLIZ;
    public SideSheetBehavior<View> LLIZLLLIL;
    public boolean LL = true;
    public final boolean LLILLJJLI = true;
    public final int LLILZIL = 8388613;
    public final boolean LLILZLL = true;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        View view;
        super.onStart();
        C1389610mGV.LIZIZ(getDialog());
        SideSheetBehavior<View> sideSheetBehavior = this.LLIZLLLIL;
        if (sideSheetBehavior != null && sideSheetBehavior.LIZJ == 5) {
            Reference reference = sideSheetBehavior.LIZLLL;
            if (reference == null || (view = (View) reference.get()) == null) {
                sideSheetBehavior.setStateInternal(3);
            } else {
                ARunnableS27S0201000_21 aRunnableS27S0201000_21 = new ARunnableS27S0201000_21(view, sideSheetBehavior, 1);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                    HandlerHook.viewPost(view, aRunnableS27S0201000_21);
                } else {
                    aRunnableS27S0201000_21.run();
                }
            }
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Dialog onCreateDialog(android.os.Bundle r5) {
        /*
            r4 = this;
            android.content.Context r3 = r4.requireContext()
            int r1 = r4.LLILZIL
            r0 = 3
            if (r1 == r0) goto L48
            r0 = 5
            if (r1 == r0) goto L4a
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 == r0) goto L42
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r1 != r0) goto L4a
            boolean r0 = X.C426750GoL.LIZLLL(r3)
        L1a:
            r4.LLIZ = r0
            com.bytedance.tux.sheet.sidesheet.SideSheetBehavior r1 = new com.bytedance.tux.sheet.sidesheet.SideSheetBehavior
            boolean r0 = r4.LLIZ
            r1.<init>(r0)
            r4.LLIZLLLIL = r1
            X.0lyL r2 = new X.0lyL
            boolean r0 = r4.LLIZ
            r2.<init>(r3, r0)
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L3e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L3e
            r0 = 2131396171(0x7f0a864b, float:1.8413075E38)
            r1.setTag(r0, r4)
        L3e:
            X.C1389600mGU.LIZJ(r2)
            return r2
        L42:
            boolean r0 = X.C426750GoL.LIZLLL(r3)
            if (r0 != 0) goto L4a
        L48:
            r0 = 1
            goto L1a
        L4a:
            r0 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.sheet.sidesheet.TuxSideSheet.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1246120iX4 c1246120iX4 = (C1246120iX4) view.findViewById(R.id.v4_);
        c1246120iX4.LIZ(this.LL, false);
        c1246120iX4.LIZIZ(getChildFragmentManager(), this.LLILLL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gp, viewGroup, false);
        Context context = layoutInflater.getContext();
        C19GS c19gs = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxSheet, R.attr.yq, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSheet__tux_sheetBackgroundColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        RadiusLayout radiusLayout = (RadiusLayout) viewTd.findViewById(R.id.spp);
        radiusLayout.setBackgroundColor(color);
        ((C1246120iX4) viewTd.findViewById(R.id.v4_)).setNavBarBackground$tux_theme_release(Integer.valueOf(color));
        C16G1 c16g1 = (C16G1) radiusLayout.getLayoutParams();
        Integer num = this.LLILZ;
        if (num != null) {
            int iIntValue = num.intValue();
            int iLIZIZ = C497820Jfg.LIZIZ(context);
            if (iIntValue > iLIZIZ) {
                iIntValue = iLIZIZ;
            }
            ((ViewGroup.MarginLayoutParams) c16g1).width = iIntValue;
        }
        c16g1.LIZJ = this.LLILZIL;
        C786410Ut5.b7(radiusLayout, c16g1);
        float f = BaseSheet.LLJJI;
        if (this.LLIZ) {
            radiusLayout.LIZ(0.0f, f, 0.0f, f);
        } else {
            radiusLayout.LIZ(f, 0.0f, f, 0.0f);
        }
        if (this.LLILZLL) {
            c16g1.LIZIZ(this.LLIZLLLIL);
            SideSheetBehavior<View> sideSheetBehavior = this.LLIZLLLIL;
            if (sideSheetBehavior != null) {
                sideSheetBehavior.LJ.add(new AbstractC1391030mIn() { // from class: X.0mIk
                    @Override // X.AbstractC1391030mIn
                    public final void LIZ() {
                    }

                    @Override // X.AbstractC1391030mIn
                    public final void LIZIZ(int i) {
                        Dialog dialog;
                        if (i == 5 && (dialog = this.LIZ.getDialog()) != null) {
                            dialog.cancel();
                        }
                    }
                });
            }
        }
        View viewFindViewById = viewTd.findViewById(R.id.yg_);
        if (this.LLILLJJLI) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 15), viewFindViewById);
            C786410Ut5.p9(radiusLayout, new View.OnClickListener() { // from class: X.0mIl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        C1175270ggn c1175270ggn = (C1175270ggn) viewTd.findViewById(R.id.window_insets_layout);
        if (this.LLIZ) {
            c1175270ggn.setRemoveRightInsets(true);
        } else {
            c1175270ggn.setRemoveLeftInsets(true);
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
