package com.bytedance.tux.sheet.sheet;

import X.AbstractC1177930gl5;
import X.AbstractC1391240mJ8;
import X.C098200Yq;
import X.C0OM1;
import X.C0P2N;
import X.C0R19;
import X.C1066370dr9;
import X.C128Y;
import X.C1389600mGU;
import X.C1391150mIz;
import X.C1391160mJ0;
import X.C1391180mJ2;
import X.C1391190mJ3;
import X.C1391280mJC;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C189200o6;
import X.C1954807lC;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2188811AlT;
import X.C343960De6;
import X.C344650DfD;
import X.C418440Gaw;
import X.C421100GfE;
import X.C426750GoL;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.DialogC1389560mGQ;
import X.DialogInterfaceOnKeyListenerC1390880mIY;
import X.EnumC344640DfC;
import X.InterfaceC1058150ddt;
import X.InterfaceC1391170mJ1;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS139S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.BaseSheet;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class TuxSheet extends BaseSheet {
    public static boolean LLLILZLLLI = false;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDd9OyHELIOS0pLDt9Oy0pLDt9HDA0Gic2LTE=";
    public View LLJJIII;
    public Fragment LLJJIJI;
    public C0OM1 LLJJIJIL;
    public C0P2N LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public Integer LLJJJJJIL;
    public Integer LLJJJJLIIL;
    public boolean LLJLL;
    public Float LLJZ;
    public boolean LLJZIJLIL;
    public Float LLL;
    public Float LLLF;
    public Boolean LLLFF;
    public C1391280mJC LLLFFI;
    public RadiusLayout LLLFZ;
    public C1391180mJ2 LLLI;
    public Integer LLLII;
    public BottomSheetBehavior<?> LLLIIII;
    public TuxSheetBehavior<?> LLLIIIIL;
    public Boolean LLLIIIL;
    public View LLLIIL;
    public C421100GfE LLLIILIL;
    public boolean LLLILZJ;
    public boolean LLJJIJIIJIL = true;
    public int LLJJL = -1;
    public int LLJJLIIIJLLLLLLLZ = -1;
    public int LLJL = -1;
    public int LLJLIL = -1;
    public boolean LLJLILLLLZIIL = true;
    public boolean LLJLLIL = true;
    public boolean LLJLLL = true;
    public final C1391150mIz LLLIL = new AbstractC1177930gl5() { // from class: X.0mIz
        @Override // X.AbstractC1177930gl5
        public final void LIZJ(View view, float f) {
            this.LIZ.UR(view, f);
        }

        @Override // X.AbstractC1177930gl5
        public final void LIZLLL(int i, View view) {
            this.LIZ.VR(i, view);
        }
    };
    public final C1391160mJ0 LLLILZ = new AbstractC1391240mJ8() { // from class: X.0mJ0
        @Override // X.AbstractC1391240mJ8
        public final void LIZ(View view, float f) {
            this.LIZ.UR(view, f);
        }

        @Override // X.AbstractC1391240mJ8
        public final void LIZIZ(int i, View view) {
            this.LIZ.VR(i, view);
        }
    };

    static {
        new C1391190mJ3();
    }

    @Override // com.bytedance.tux.sheet.BaseSheet
    public final int OR() {
        int i = this.LLJJJIL;
        if (i == 0) {
            return R.style.aky;
        }
        if (i == 1) {
            int i2 = this.LLJJL;
            return getContext() != null ? BaseSheet.PR(i2 / C497820Jfg.LIZ(r0)) : R.style.aky;
        }
        if (i == 2) {
            int i3 = this.LLJL;
            return getContext() != null ? BaseSheet.PR(i3 / C497820Jfg.LIZ(r0)) : R.style.aky;
        }
        if (i != 3) {
            return R.style.aky;
        }
        Float f = this.LLJZ;
        return BaseSheet.PR(f != null ? f.floatValue() : 0.73f);
    }

    public final void iS() {
        Window window;
        Float f = this.LLJZ;
        float fFloatValue = f != null ? f.floatValue() : 0.73f;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(BaseSheet.PR(1 - fFloatValue));
    }

    public final void WR() {
        if (getChildFragmentManager().LJJLIIIIJ() > 0) {
            getChildFragmentManager().LJLLL();
            return;
        }
        if (this.LLJLLIL) {
            Dialog dialog = getDialog();
            C343960De6 c343960De6 = C343960De6.LIZ;
            if (dialog instanceof DialogC1389560mGQ) {
                DialogC1389560mGQ dialogC1389560mGQ = (DialogC1389560mGQ) dialog;
                dialogC1389560mGQ.LLJILLL = c343960De6;
                dialogC1389560mGQ.LLJJ = c343960De6;
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                onCancel(dialog2);
            }
            dismissAllowingStateLoss();
        }
    }

    public final void ZR() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            C786410Ut5.B4(dialog);
        }
    }

    @Override // com.bytedance.tux.sheet.BaseSheet
    public final boolean RR() {
        return this.LLJJIJIIJIL;
    }

    public final void cS(View view) {
        View view2;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C128Y c128y = this.LLJJIJI;
        if (c128y != null && (c128y instanceof InterfaceC1391170mJ1) && ((InterfaceC1391170mJ1) c128y).Hb() && (view2 = this.LLLIIL) != null) {
            float top = view.getTop() - view2.getHeight();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i = marginLayoutParams.bottomMargin;
            } else {
                i = 0;
            }
            C786410Ut5.ed(view2, top - i);
        }
    }

    public final void dS(C0OM1 c0om1) {
        ViewGroup.LayoutParams layoutParams;
        if (this.LLJJJIL == 2 && c0om1 != null) {
            C1391280mJC c1391280mJC = this.LLLFFI;
            C1066370dr9 handleView = null;
            if (c1391280mJC != null) {
                layoutParams = c1391280mJC.getLayoutParams();
            } else {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            C1391280mJC c1391280mJC2 = this.LLLFFI;
            if (c1391280mJC2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1391280mJC2);
                c1391280mJC2.setLayoutParams(layoutParams2);
            }
            C1391180mJ2 c1391180mJ2 = this.LLLI;
            if (c1391180mJ2 != null) {
                handleView = c1391180mJ2.getHandleView();
            }
            C1391280mJC c1391280mJC3 = this.LLLFFI;
            if (c1391280mJC3 != null) {
                c1391280mJC3.LL.LLJ.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                c1391280mJC3.LLILLJJLI.LLJ.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            }
            C1391280mJC c1391280mJC4 = this.LLLFFI;
            if (c1391280mJC4 != null) {
                int currentNavBarBackgroundColor = c1391280mJC4.getCurrentNavBarBackgroundColor();
                if (handleView != null) {
                    handleView.setBackgroundColor(currentNavBarBackgroundColor);
                }
            }
            C1391280mJC c1391280mJC5 = this.LLLFFI;
            if (c1391280mJC5 != null) {
                c1391280mJC5.getCurrentNavBarBackgroundColor();
            }
        }
    }

    public final void gS(View view) {
        int iLIZJ;
        ViewGroup.LayoutParams layoutParams;
        int i = this.LLJJJIL;
        int i2 = 0;
        if ((i == 3 || (i == 5 && this.LLILZ)) && this.LLJZIJLIL) {
            int top = view.getTop();
            Context context = getContext();
            if (context != null) {
                iLIZJ = C497820Jfg.LIZJ(context);
            } else {
                iLIZJ = 0;
            }
            View viewFindViewById = view.findViewById(R.id.v48);
            if (iLIZJ > 0) {
                if (viewFindViewById != null) {
                    layoutParams = viewFindViewById.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (top <= iLIZJ) {
                    i2 = iLIZJ - top;
                }
                marginLayoutParams.topMargin = i2;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById);
                viewFindViewById.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void hS(boolean z) {
        if (z) {
            if (!this.LLLILZJ) {
                RadiusLayout radiusLayout = this.LLLFZ;
                if (radiusLayout != null) {
                    float f = BaseSheet.LLJJI;
                    radiusLayout.LIZ(f, f, 0.0f, 0.0f);
                }
                DialogC1389560mGQ dialogC1389560mGQ = (DialogC1389560mGQ) getDialog();
                if (dialogC1389560mGQ != null) {
                    dialogC1389560mGQ.LJLIL(true, false);
                }
                this.LLLILZJ = true;
                return;
            }
            return;
        }
        if (!this.LLLILZJ) {
            return;
        }
        RadiusLayout radiusLayout2 = this.LLLFZ;
        if (radiusLayout2 != null) {
            radiusLayout2.setRadius(0.0f);
        }
        DialogC1389560mGQ dialogC1389560mGQ2 = (DialogC1389560mGQ) getDialog();
        if (dialogC1389560mGQ2 != null) {
            dialogC1389560mGQ2.LJLIL(false, false);
        }
        this.LLLILZJ = false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getChildFragmentManager().LJZL(new C0R19(new AwS635S0100000_21(this, 6)), false);
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setOnKeyListener(new DialogInterfaceOnKeyListenerC1390880mIY(new AwS565S0100000_21(this, 73)));
        Integer num = this.LLLII;
        if (num != null) {
            int iIntValue = num.intValue();
            Window window = dialogOnCreateDialog.getWindow();
            if (window != null) {
                window.setSoftInputMode(iIntValue);
            }
        }
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    public final void UR(View view, float f) {
        int iLIZJ;
        ViewGroup.LayoutParams layoutParams;
        Dialog dialog;
        Window window;
        Object obj = this.LLJJIII;
        if (obj == null) {
            obj = this.LLJJIJI;
        }
        if (obj instanceof InterfaceC1058150ddt) {
            ((InterfaceC1058150ddt) obj).LLLFFI(this, f);
        }
        boolean z = true;
        if (this.LLJJIJIIJIL && f <= 0.0f && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setDimAmount((1 + f) * BaseSheet.LLJJ);
        }
        cS(view);
        gS(view);
        int i = this.LLJJJIL;
        int i2 = 0;
        if (i != 3 && (i != 5 || !this.LLILZ)) {
            z = false;
        }
        if (this.LLJJJJ && this.LLLIILIL != null && z) {
            int top = view.getTop();
            Context context = getContext();
            if (context != null && (iLIZJ = C497820Jfg.LIZJ(context)) > 0) {
                C421100GfE c421100GfE = this.LLLIILIL;
                if (c421100GfE != null) {
                    layoutParams = c421100GfE.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (top <= iLIZJ) {
                    i2 = iLIZJ - top;
                }
                marginLayoutParams.topMargin = i2;
                C421100GfE c421100GfE2 = this.LLLIILIL;
                if (c421100GfE2 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c421100GfE2);
                    c421100GfE2.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public final void VR(int i, View view) {
        boolean z;
        Object obj = this.LLJJIII;
        if (obj == null) {
            obj = this.LLJJIJI;
        }
        if (obj instanceof InterfaceC1058150ddt) {
            ((InterfaceC1058150ddt) obj).LLLLIIIILLL(this, i);
        }
        if (this.LLJJJIL == 3) {
            if (i != 3) {
                z = true;
            } else {
                z = false;
            }
            hS(z);
            iS();
            gS(view);
        }
        cS(view);
    }

    public final void aS(Fragment fragment, boolean z, EnumC344640DfC enumC344640DfC) {
        boolean z2 = true;
        int iLJJLIIIIJ = getChildFragmentManager().LJJLIIIIJ() + 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sheet_content_fragment");
        sbLIZ.append(iLJJLIIIIJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        int i = C344650DfD.LIZ[enumC344640DfC.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c19ehLJIIJ.LJIJJLI(R.animator.a_, R.animator.aa, R.animator.ab, R.animator.ac);
            } else {
                throw new C1954807lC();
            }
        } else {
            Context context = getContext();
            if (context == null || !C426750GoL.LIZLLL(context)) {
                z2 = false;
            }
            if (z2) {
                c19ehLJIIJ.LJIJJLI(R.anim.fm, R.anim.fp, R.anim.fn, R.anim.fo);
            } else {
                c19ehLJIIJ.LJIJJLI(R.anim.fn, R.anim.fo, R.anim.fm, R.anim.fp);
            }
        }
        c19ehLJIIJ.LJIJ(R.id.v4a, fragment, strLIZIZ);
        if (z) {
            c19ehLJIIJ.LJII(strLIZIZ);
        }
        c19ehLJIIJ.LJIIJ();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Window window;
        Window window2;
        Window window3;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f848h0, viewGroup, false);
        this.LLLFZ = (RadiusLayout) viewTd.findViewById(R.id.spp);
        this.LLLILZJ = false;
        hS(true);
        C1391180mJ2 c1391180mJ2 = (C1391180mJ2) viewTd.findViewById(R.id.v48);
        this.LLLI = c1391180mJ2;
        c1391180mJ2.setFixedHeightPx(this.LLJJL);
        c1391180mJ2.setDynamicPeekHeightPx(this.LLJL);
        c1391180mJ2.setDynamicMaxHeightPx(this.LLJLIL);
        c1391180mJ2.setFullScreenSheetInitialVisibleRatio(this.LLJZ);
        c1391180mJ2.setCustomAutoSizeMaxHeightRatio(this.LLL);
        c1391180mJ2.setCustomAutoSizeMinHeightRatio(this.LLLF);
        c1391180mJ2.setVariant(this.LLJJJIL);
        c1391180mJ2.setMinVisibleHeightPx(this.LLJJLIIIJLLLLLLLZ);
        c1391180mJ2.setHideable(this.LLJLLL);
        c1391180mJ2.setDismissFunc(new AwS565S0100000_21(this, 74));
        c1391180mJ2.setBehavior(this.LLLIIII);
        c1391180mJ2.setExpandOnShow(this.LLJILJIL);
        c1391180mJ2.setDragBehavior(this.LLLIIIIL);
        c1391180mJ2.setBottomSheetCallback(this.LLLIL);
        c1391180mJ2.setTuxSheetCallback(this.LLLILZ);
        c1391180mJ2.setForceSheetHandleShow(this.LLLFF);
        C19GS c19gs = null;
        c1391180mJ2.setStopHeightsConfig(null);
        c1391180mJ2.setOnInitialExpandLayout(new AwS600S0100000_21(this, 31));
        ViewStub viewStub = (ViewStub) viewTd.findViewById(R.id.v4c);
        if (this.LLJLILLLLZIIL) {
            i = R.layout.h2;
        } else {
            i = R.layout.h3;
        }
        viewStub.setLayoutResource(i);
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        if (Intrinsics.LJFF(this.LLLIIIL, Boolean.TRUE)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewLJLLLL.getLayoutParams();
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C786410Ut5.W5(viewLJLLLL, marginLayoutParams);
        }
        if (this.LLJLL) {
            ViewGroup viewGroup2 = (ViewGroup) viewTd.findViewById(R.id.v4a);
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            layoutParams.height = -1;
            C786410Ut5.X5(layoutParams, viewGroup2);
        }
        View view = this.LLJJIII;
        if (view != null) {
            view.setTag(R.id.fds, this);
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
            }
            ((ViewGroup) viewTd.findViewById(R.id.v4a)).addView(view);
        }
        Fragment fragment = this.LLJJIJI;
        if (fragment != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.v4a, fragment, "sheet_content_fragment");
            c19ehLJIIJ.LJIIJ();
        }
        this.LLLFFI = (C1391280mJC) viewTd.findViewById(R.id.v4n);
        C1391280mJC c1391280mJC = this.LLLFFI;
        if (c1391280mJC != null) {
            c1391280mJC.setAlignment(this.LLJJJ);
        }
        C1391280mJC c1391280mJC2 = this.LLLFFI;
        if (c1391280mJC2 != null) {
            c1391280mJC2.setNavActions(this.LLJJIJIL);
        }
        C1391280mJC c1391280mJC3 = this.LLLFFI;
        if (c1391280mJC3 != null) {
            c1391280mJC3.setNavBarBackgroundColor(0);
        }
        dS(this.LLJJIJIL);
        if (this.LLJJIJIIJIL) {
            Dialog dialog = getDialog();
            if (dialog != null && (window3 = dialog.getWindow()) != null) {
                window3.addFlags(2);
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
                window2.setDimAmount(BaseSheet.LLJJ);
            }
        } else {
            Dialog dialog3 = getDialog();
            if (dialog3 != null && (window = dialog3.getWindow()) != null) {
                window.clearFlags(2);
            }
        }
        if (this.LLJJJJ) {
            C421100GfE c421100GfE = (C421100GfE) viewTd.findViewById(R.id.e26);
            this.LLLIILIL = c421100GfE;
            if (c421100GfE != null) {
                int visibility = c421100GfE.getVisibility();
                c421100GfE.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c421100GfE);
            }
            Integer num = this.LLJJJJJIL;
            if (num != null) {
                int iIntValue = num.intValue();
                C421100GfE c421100GfE2 = this.LLLIILIL;
                if (c421100GfE2 != null) {
                    c421100GfE2.setTintColor(iIntValue);
                }
            }
            Integer num2 = this.LLJJJJLIIL;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                C421100GfE c421100GfE3 = this.LLLIILIL;
                if (c421100GfE3 != null) {
                    c421100GfE3.setBgColor(iIntValue2);
                }
            }
            C421100GfE c421100GfE4 = this.LLLIILIL;
            if (c421100GfE4 != null) {
                C786410Ut5.Z8(c421100GfE4, new ACListenerS139S0100000_4(this, 5));
            }
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
