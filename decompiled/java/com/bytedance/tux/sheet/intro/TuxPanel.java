package com.bytedance.tux.sheet.intro;

import X.AbstractC1177930gl5;
import X.AbstractC439520HLi;
import X.C098200Yq;
import X.C1388190mED;
import X.C1389600mGU;
import X.C1389610mGV;
import X.C1390900mIa;
import X.C1685300txQ;
import X.C16G1;
import X.C189200o6;
import X.C19659111vp;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C19GU;
import X.C1CRB;
import X.C20092413jW;
import X.C20589915hZ;
import X.C20590015ha;
import X.C20590315hd;
import X.C20590915hj;
import X.C20591715hr;
import X.C418440Gaw;
import X.C439540HLk;
import X.C497820Jfg;
import X.C786410Ut5;
import X.DialogInterfaceOnKeyListenerC1390880mIY;
import X.EnumC1390870mIX;
import X.EnumC20591315hn;
import X.InterfaceC1593800rZq;
import X.InterfaceC20092813ja;
import Y.ACListenerS142S0100000_7;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.BaseSheet;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.bytedance.tux.system.TuxImmersionBar;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS565S0100000_21;
import u4.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class TuxPanel extends AppCompatDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDd9OyHELIOS0pLDt9ISs4OyB9HDA0GS49LSk=";
    public Integer LL;
    public Fragment LLILLJJLI;
    public View LLILLL;
    public Function1<? super Context, ? extends View> LLILZ;
    public DialogInterface.OnDismissListener LLILZIL;
    public DialogInterface.OnCancelListener LLILZLL;
    public Integer LLIZ;
    public boolean LLJ;
    public BottomSheetBehavior<View> LLJILJILJ;
    public AbstractC439520HLi LLJILLL;
    public C439540HLk LLJJ;
    public Observer<C20590315hd> LLJJI;
    public boolean LLIZLLLIL = true;
    public boolean LLJI = true;
    public boolean LLJIJIL = true;
    public boolean LLJILJIL = true;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Observer<C20590315hd> observer = this.LLJJI;
        if (observer != null) {
            C20589915hZ.LIZLLL(observer);
        }
        this.LLJJI = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        BottomSheetBehavior<View> bottomSheetBehavior;
        Window window;
        View decorView;
        BottomSheetBehavior<View> bottomSheetBehavior2;
        super.onStart();
        C1389610mGV.LIZIZ(getDialog());
        BottomSheetBehavior<View> bottomSheetBehavior3 = this.LLJILJILJ;
        if (((bottomSheetBehavior3 != null && bottomSheetBehavior3.getState() == 5) || ((bottomSheetBehavior = this.LLJILJILJ) != null && bottomSheetBehavior.getState() == 4)) && (bottomSheetBehavior2 = this.LLJILJILJ) != null) {
            bottomSheetBehavior2.setState(3);
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.LLILZLL;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        final Context contextRequireContext;
        View decorView;
        this.LLJILJILJ = new BottomSheetBehavior<>();
        Integer num = this.LL;
        if (num != null) {
            contextRequireContext = C1388190mED.LJ(num.intValue(), requireContext());
        } else {
            contextRequireContext = requireContext();
        }
        final boolean z = this.LLIZLLLIL;
        C19GU c19gu = new C19GU(contextRequireContext, z) { // from class: X.0lyM
            public boolean LLILZLL;

            @Override // X.DialogC19728412Gs, android.app.Dialog
            public final void show() throws Throwable {
                Object obj;
                C1389610mGV.LIZIZ(this);
                C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW+o1UGj6gdIGNnaIGocSketRmS1niA/pdpakIiRQEdMPQE8/yaBphbw==", null);
                C0WST c0wst = new C0WST();
                Object[] objArr = new Object[0];
                C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", this, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", null, objArr, this, c0wzw, false);
                    return;
                }
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
                super.show();
                c0wst.LIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
            }

            @Override // android.app.Dialog, android.view.Window.Callback
            public final void onWindowFocusChanged(boolean z2) {
                super.onWindowFocusChanged(z2);
                if (this.LLILZLL != z2) {
                    if (z2) {
                        C1378370lyN.LIZ.getClass();
                        C1378370lyN.LIZIZ(this);
                    } else {
                        C1378370lyN.LIZ.getClass();
                        C1378370lyN.LIZ();
                    }
                    this.LLILZLL = z2;
                }
            }

            {
                int i;
                Window window = getWindow();
                if (window != null) {
                    window.requestFeature(1);
                }
                setContentView(new FrameLayout(getContext()));
                Window window2 = getWindow();
                if (window2 != null) {
                    if (C497820Jfg.LJ(window2.getContext())) {
                        i = R.style.aku;
                    } else {
                        i = R.style.akt;
                    }
                    window2.setWindowAnimations(i);
                    window2.setBackgroundDrawable(new ColorDrawable(0));
                    window2.addFlags(2);
                    if (z) {
                        window2.getAttributes().dimAmount = BaseSheet.LLJJ;
                    } else {
                        window2.getAttributes().dimAmount = 0.0f;
                    }
                    window2.getAttributes().gravity = 1;
                    window2.getAttributes().height = -1;
                    window2.getAttributes().width = -1;
                }
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
                if (c19egLIZIZ != null) {
                    TuxImmersionBar tuxImmersionBarLJFF = C1766560w4U.LJFF(c19egLIZIZ, this);
                    tuxImmersionBarLJFF.LJIIJJI();
                    tuxImmersionBarLJFF.LIZLLL();
                }
            }
        };
        c19gu.setOnKeyListener(new DialogInterfaceOnKeyListenerC1390880mIY(new AwS565S0100000_21(this, 72)));
        Window window = c19gu.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(c19gu);
        return c19gu;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.LLILZIL;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Fragment fragment = this.LLILLJJLI;
        if (fragment != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.z0r, fragment, "panel_content");
            c19ehLJIIJ.LJIIJ();
        }
        C20591715hr c20591715hr = C20591715hr.LIZ;
        if ((!c20591715hr.isPad() && !c20591715hr.LIZ()) || !c20591715hr.LJ(EnumC1390870mIX.PANEL)) {
            return;
        }
        C20590915hj c20590915hj = C20589915hZ.LIZ;
        C20590015ha c20590015ha = new C20590015ha(view);
        c20590015ha.LIZIZ = EnumC20591315hn.HORIZONTAL;
        this.LLJJI = C20589915hZ.LIZ(new InterfaceC1593800rZq() { // from class: X.0mIx
            @Override // X.InterfaceC1593800rZq
            public final void LIZ(C20590315hd c20590315hd) {
                TuxPanel tuxPanel = this.LIZ;
                View view2 = view;
                tuxPanel.getClass();
                View viewFindViewById = view2.findViewById(R.id.trr);
                if (viewFindViewById != null) {
                    int iLIZ = C20591715hr.LIZ.LIZIZ().LIZ(c20590315hd.LIZLLL);
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = iLIZ;
                        C786410Ut5.W5(viewFindViewById, layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }, c20590015ha, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInvoke;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.go, viewGroup, false);
        Context context = layoutInflater.getContext();
        C19GS c19gs = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxPanel, R.attr.ye, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxPanel__tux_panelBackgroundColor, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxPanel__tux_panelShadow, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxPanel__tux_panelCloseHint);
        typedArrayObtainStyledAttributes.recycle();
        RadiusLayout radiusLayout = (RadiusLayout) viewTd.findViewById(R.id.spp);
        radiusLayout.setBackgroundColor(color);
        radiusLayout.setSmoothRadius(true);
        View viewFindViewById = viewTd.findViewById(R.id.uxw);
        if (!this.LLIZLLLIL) {
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZ = C418440Gaw.LIZIZ(36);
            c19659111vp.LIZIZ(Integer.valueOf(i));
            viewFindViewById.setBackground(c19659111vp.LIZ(viewFindViewById.getContext()));
        }
        C1CRB c1crb = (C1CRB) viewTd.findViewById(R.id.trr);
        C16G1 c16g1 = (C16G1) c1crb.getLayoutParams();
        C1390900mIa c1390900mIa = (C1390900mIa) viewTd.findViewById(R.id.evm);
        if (!this.LLJ && !this.LLJIJIL) {
            c1390900mIa.setFocusable(true);
            c1390900mIa.setFocusableInTouchMode(true);
            c1390900mIa.setContentDescription(strXd);
            q0.LJIILL(c1390900mIa, C20092413jW.LJIL, strXd, new InterfaceC20092813ja() { // from class: X.0mIZ
                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    this.LIZ.dismiss();
                    return true;
                }
            });
        }
        Integer num = this.LLIZ;
        if (num != null) {
            c1390900mIa.LLILZIL = Integer.valueOf(num.intValue());
        }
        View view = this.LLILLL;
        if (view != null) {
            c1390900mIa.LLILLL.addView(view);
        }
        Function1<? super Context, ? extends View> function1 = this.LLILZ;
        if (function1 != null && (viewInvoke = function1.invoke(c1390900mIa.getContext())) != null) {
            c1390900mIa.LLILLL.addView(viewInvoke);
        }
        if (C497820Jfg.LJ(context)) {
            c16g1.LIZJ = 17;
        } else if (this.LLJILJIL) {
            c16g1.LIZIZ(this.LLJILJILJ);
            BottomSheetBehavior<View> bottomSheetBehavior = this.LLJILJILJ;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0JSY
                    @Override // X.AbstractC1177930gl5
                    public final void LIZJ(View view2, float f) {
                        Dialog dialog;
                        Window window;
                        TuxPanel tuxPanel = this.LIZ;
                        if (tuxPanel.LLIZLLLIL && (dialog = tuxPanel.getDialog()) != null && (window = dialog.getWindow()) != null) {
                            window.setDimAmount(f * BaseSheet.LLJJ);
                        }
                    }

                    @Override // X.AbstractC1177930gl5
                    public final void LIZLLL(int i2, View view2) {
                        if (i2 != 4 && i2 != 5) {
                            return;
                        }
                        TuxPanel tuxPanel = this.LIZ;
                        tuxPanel.LLJILLL = C439550HLl.LIZ;
                        Dialog dialog = tuxPanel.getDialog();
                        if (dialog == null) {
                            return;
                        }
                        dialog.cancel();
                    }
                });
            }
        } else {
            c16g1.LIZJ = 80;
        }
        C786410Ut5.Z6(c1crb, c16g1);
        if (this.LLJI) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 123), viewTd.findViewById(R.id.yg_));
            C786410Ut5.p9(radiusLayout, new View.OnClickListener() { // from class: X.0JSa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
        }
        if (this.LLJ) {
            FrameLayout frameLayout = (FrameLayout) viewTd.findViewById(R.id.e2c);
            C786410Ut5.LJZ(0, frameLayout);
            C786410Ut5.O7(frameLayout, new ACListenerS142S0100000_7(this, 124));
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
