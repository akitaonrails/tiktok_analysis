package com.bytedance.tux.sheet.sheet;

import X.C098200Yq;
import X.C1388190mED;
import X.C1389600mGU;
import X.C1391280mJC;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C19GU;
import X.C338700DPo;
import X.C338760DPu;
import X.C786410Ut5;
import X.DialogInterfaceOnKeyListenerC1390880mIY;
import Y.ACListenerS155S0100000_21;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.BaseSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class TuxSheetTablets extends TuxSheet {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDd9Oy0pLDHELIOSt9Oy0pLDt9HDA0Gic2LTEYKC0/LTE/";

    @Override // com.bytedance.tux.sheet.BaseSheet
    public final void MR() {
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheet, com.bytedance.tux.sheet.BaseSheet, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        final Context contextRequireContext;
        View decorView;
        if (this.LLJIJIL != null) {
            contextRequireContext = C1388190mED.LJ(C1388190mED.LIZJ(requireContext(), true), requireContext());
        } else if (this.LLJI != null) {
            contextRequireContext = C1388190mED.LJ(C1388190mED.LIZJ(requireContext(), C1388190mED.LIZLLL(this.LLJI.intValue())), requireContext());
        } else if (this.LLILZLL != null) {
            contextRequireContext = C1388190mED.LJ(this.LLILZLL.intValue(), requireContext());
        } else {
            contextRequireContext = requireContext();
        }
        C19GU c19gu = new C19GU(contextRequireContext) { // from class: X.0lyO
            @Override // X.DialogC19728412Gs, android.app.Dialog
            public final void show() throws Throwable {
                Object obj;
                C1389610mGV.LIZIZ(this);
                C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW+o1UGj6gboecirkGnN8ZHno6dBlp0HlNWTwl", null);
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

            {
                super(contextRequireContext, R.style.ji);
                TypedArray typedArrayObtainStyledAttributes = contextRequireContext.obtainStyledAttributes(null, R$styleable.TuxModal, R.attr.ya, 0);
                typedArrayObtainStyledAttributes.getFloat(R$styleable.TuxModal_tux_modalOverlayRatioPad, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                Window window = getWindow();
                if (window != null) {
                    window.requestFeature(1);
                }
                setContentView(new FrameLayout(contextRequireContext));
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setWindowAnimations(android.R.style.Animation);
                    window2.setBackgroundDrawable(new ColorDrawable(0));
                    window2.clearFlags(2);
                    window2.getAttributes().height = -1;
                    window2.getAttributes().gravity = 1;
                    window2.getAttributes().width = -1;
                }
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(contextRequireContext);
                if (c19egLIZIZ != null) {
                    TuxImmersionBar tuxImmersionBarLJFF = C1766560w4U.LJFF(c19egLIZIZ, this);
                    tuxImmersionBarLJFF.LJIIJJI();
                    tuxImmersionBarLJFF.LIZLLL();
                }
            }
        };
        c19gu.setCanceledOnTouchOutside(this.LLILLL);
        Window window = c19gu.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.aky);
        }
        c19gu.setOnKeyListener(new DialogInterfaceOnKeyListenerC1390880mIY(new AwS565S0100000_21(this, 75)));
        Integer num = this.LLLII;
        if (num != null) {
            int iIntValue = num.intValue();
            Window window2 = c19gu.getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(iIntValue);
            }
        }
        Window window3 = c19gu.getWindow();
        if (window3 != null && (decorView = window3.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(c19gu);
        return c19gu;
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheet, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int color;
        int i;
        Window window;
        Window window2;
        Window window3;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.h4, viewGroup, false);
        C19GS c19gs = null;
        TypedArray typedArrayObtainStyledAttributes = layoutInflater.getContext().obtainStyledAttributes(null, R$styleable.TuxModal, R.attr.ya, 0);
        Integer num = this.LLJI;
        if (num != null) {
            color = num.intValue();
        } else {
            color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxModal_tux_modalContainerColor, 0);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxModal_tux_modalContainerRadius, 0);
        typedArrayObtainStyledAttributes.recycle();
        RadiusLayout radiusLayout = (RadiusLayout) viewTd.findViewById(R.id.spp);
        this.LLLFZ = radiusLayout;
        if (radiusLayout != null) {
            radiusLayout.setBackgroundColor(color);
        }
        RadiusLayout radiusLayout2 = this.LLLFZ;
        if (radiusLayout2 != null) {
            radiusLayout2.setRadius(dimensionPixelSize);
        }
        this.LLLILZJ = true;
        C338760DPu c338760DPu = (C338760DPu) viewTd.findViewById(R.id.acb);
        c338760DPu.setConstraints(new C338700DPo());
        ViewStub viewStub = (ViewStub) viewTd.findViewById(R.id.v4c);
        if (this.LLJLILLLLZIIL) {
            i = R.layout.h2;
        } else {
            i = R.layout.h3;
        }
        viewStub.setLayoutResource(i);
        C786410Ut5.LJLLLL(viewStub);
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
            c1391280mJC.setNavActions(this.LLJJIJIL);
        }
        C1391280mJC c1391280mJC2 = this.LLLFFI;
        if (c1391280mJC2 != null) {
            c1391280mJC2.setNavBarBackgroundColor(0);
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
        if (this.LLILLL) {
            C786410Ut5.S8(c338760DPu, new ACListenerS155S0100000_21(this, 14));
            RadiusLayout radiusLayout3 = this.LLLFZ;
            if (radiusLayout3 != null) {
                C786410Ut5.p9(radiusLayout3, new View.OnClickListener() { // from class: X.0mIb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                    }
                });
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
