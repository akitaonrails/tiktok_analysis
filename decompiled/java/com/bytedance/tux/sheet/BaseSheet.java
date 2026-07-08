package com.bytedance.tux.sheet;

import X.C07XO;
import X.C1388190mED;
import X.C1389600mGU;
import X.C1389610mGV;
import X.C1389930mH1;
import X.C1390200mHS;
import X.C1390660mIC;
import X.C1766560w4U;
import X.C1766570w4V;
import X.C1896507bn;
import X.C19EH;
import X.C20589915hZ;
import X.C20590015ha;
import X.C20590315hd;
import X.C20590915hj;
import X.C20591715hr;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C23250099c;
import X.C418440Gaw;
import X.DialogC1389560mGQ;
import X.EnumC1390870mIX;
import X.EnumC20591315hn;
import X.InterfaceC1593800rZq;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.BaseSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes22.dex */
public class BaseSheet extends AppCompatDialogFragment {
    public static final float LLJJ = C1389610mGV.LIZ();
    public static final float LLJJI = C418440Gaw.LIZIZ(26);
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDHELIOSd9Oy0pLDt9CiQ/LBw7LSA4";
    public DialogInterface.OnCancelListener LL;
    public DialogInterface.OnDismissListener LLILLJJLI;
    public boolean LLILLL = true;
    public boolean LLILZ;
    public boolean LLILZIL;
    public Integer LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public Integer LLJI;
    public GradientDrawable LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public Observer<C20590315hd> LLJILLL;
    public long mDestroyTime;

    public static int PR(float f) {
        return f < 0.33333334f ? R.style.akx : f < 0.6666667f ? R.style.aky : R.style.akw;
    }

    public int NR() {
        return R.attr.yq;
    }

    public int OR() {
        return R.style.aky;
    }

    public boolean RR() {
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Observer<C20590315hd> observer = this.LLJILLL;
        if (observer != null) {
            C20589915hZ.LIZLLL(observer);
        }
        this.LLJILLL = null;
        super.onDestroyView();
    }

    public void MR() {
        ViewTreeObserver viewTreeObserver;
        final int i = ((DialogC1389560mGQ) getDialog()).LLJILJILJ;
        if (RR()) {
            TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
            tuxImmersionBarLIZJ.LIZIZ.LJIIL();
            tuxImmersionBarLIZJ.LJFF(i);
            tuxImmersionBarLIZJ.LIZ(true);
            tuxImmersionBarLIZJ.LIZLLL();
        } else {
            TuxImmersionBar tuxImmersionBarLIZJ2 = C1766560w4U.LIZJ(this, true);
            tuxImmersionBarLIZJ2.LJFF(i);
            tuxImmersionBarLIZJ2.LIZ(true);
            tuxImmersionBarLIZJ2.LIZLLL();
        }
        View view = getView();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0HC8
            public int LL = -1;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Window window;
                View decorView;
                BaseSheet baseSheet = this.LLILLJJLI;
                View view2 = baseSheet.getView();
                baseSheet.getClass();
                do {
                    Object parent = view2 != null ? view2.getParent() : null;
                    if (parent instanceof C16G0) {
                        View view3 = (View) parent;
                        if (view3 == null || this.LL == view3.getMeasuredHeight()) {
                            return;
                        }
                        this.LL = view3.getMeasuredHeight();
                        int[] iArr = new int[2];
                        view3.getLocationInWindow(iArr);
                        int measuredHeight = iArr[1] + view3.getMeasuredHeight();
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setShape(0);
                        gradientDrawable2.setColor(i);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
                        layerDrawable.setLayerInset(1, 0, measuredHeight, 0, 0);
                        Dialog dialog = this.LLILLJJLI.getDialog();
                        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                            return;
                        }
                        decorView.setBackground(layerDrawable);
                        return;
                    }
                    if (!(parent instanceof View)) {
                        return;
                    } else {
                        view2 = (View) parent;
                    }
                } while (view2 != null);
            }
        };
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.mDestroyTime = System.currentTimeMillis();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        View decorView;
        View view;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            C1389610mGV.LIZIZ(dialog);
        }
        if (!this.LLJILJILJ) {
            MR();
            this.LLJILJILJ = true;
        }
        if (this.LLJILLL == null) {
            C20591715hr c20591715hr = C20591715hr.LIZ;
            if ((c20591715hr.isPad() || c20591715hr.LIZ()) && c20591715hr.LJ(EnumC1390870mIX.SHEET) && (view = getView()) != null) {
                C20590915hj c20590915hj = C20589915hZ.LIZ;
                C20590015ha c20590015ha = new C20590015ha(view);
                c20590015ha.LIZIZ = EnumC20591315hn.HORIZONTAL;
                this.LLJILLL = C20589915hZ.LIZ(new InterfaceC1593800rZq() { // from class: X.0mIw
                    @Override // X.InterfaceC1593800rZq
                    public final void LIZ(C20590315hd c20590315hd) {
                        DialogC1389560mGQ dialogC1389560mGQ;
                        View viewFindViewById;
                        Dialog dialog2 = this.LIZ.getDialog();
                        if ((dialog2 instanceof DialogC1389560mGQ) && (dialogC1389560mGQ = (DialogC1389560mGQ) dialog2) != null && (viewFindViewById = dialogC1389560mGQ.findViewById(R.id.fpl)) != null) {
                            C1280204zg c1280204zgLIZLLL = C20591715hr.LIZ.LIZIZ().LIZLLL(c20590315hd.LIZLLL);
                            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.width = c1280204zgLIZLLL.LIZ;
                                C786410Ut5.W5(viewFindViewById, layoutParams);
                                dialogC1389560mGQ.LJLIL(true, c1280204zgLIZLLL.LIZIZ);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                }, c20590015ha, true);
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        if (getContext() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("context is ");
            sbLIZ.append(getContext().getClass());
            sbLIZ.append(", this is ");
            sbLIZ.append(this);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("TUX", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.LL;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext;
        int iOR;
        View decorView;
        Integer num;
        if (this.LLIZ && (num = this.LLILZLL) != null) {
            contextRequireContext = C1388190mED.LJ(num.intValue(), requireContext());
        } else if (this.LLJIJIL != null) {
            contextRequireContext = C1388190mED.LJ(C1388190mED.LIZJ(requireContext(), true), requireContext());
        } else if (this.LLJI != null) {
            contextRequireContext = C1388190mED.LJ(C1388190mED.LIZJ(requireContext(), C1388190mED.LIZLLL(this.LLJI.intValue())), requireContext());
        } else if (this.LLILZLL != null) {
            contextRequireContext = C1388190mED.LJ(this.LLILZLL.intValue(), requireContext());
        } else {
            contextRequireContext = requireContext();
        }
        DialogC1389560mGQ dialogC1389560mGQ = new DialogC1389560mGQ(contextRequireContext, NR(), this.LLJI, this.LLJIJIL, this.LLJ);
        dialogC1389560mGQ.setCanceledOnTouchOutside(this.LLILLL);
        dialogC1389560mGQ.LLJJI = this.LLILZ;
        dialogC1389560mGQ.LLJJIII = this.LLILZIL;
        dialogC1389560mGQ.LLJJIJI = this.LLIZLLLIL;
        if (C07XO.LIZ) {
            iOR = -1;
        } else {
            iOR = OR();
        }
        Window window = dialogC1389560mGQ.getWindow();
        if (window != null) {
            window.setWindowAnimations(iOR);
        }
        Window window2 = dialogC1389560mGQ.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogC1389560mGQ);
        return dialogC1389560mGQ;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.LLILLJJLI;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.LLJILJILJ = false;
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        SR(fragmentManager, str, false);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
        if (PopupMonitorServiceImpl.LJJJJIZL()) {
            C1390660mIC c1390660mICLJJIJL = PopupMonitorServiceImpl.LJJIJL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Sheet-");
            sbLIZ.append(this);
            C23250099c.LIZLLL(PopupMonitorServiceImpl.LIZIZ, null, null, new C1390200mHS(this, new C1389930mH1(C2188811AlT.LIZIZ(sbLIZ), "tux_sheet"), c1390660mICLJJIJL, null), 3);
        }
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896507bn c1896507bn = new C1896507bn(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896507bn);
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void showNow(FragmentManager fragmentManager, String str) {
        SR(fragmentManager, str, true);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }

    public final void SR(FragmentManager fragmentManager, String str, boolean z) {
        C19EH c19ehLJIIJ;
        try {
            Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.FALSE);
            Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
            declaredField2.setAccessible(true);
            declaredField2.set(this, Boolean.TRUE);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (fragmentManager != null) {
            c19ehLJIIJ = fragmentManager.LJIIJ();
        } else {
            c19ehLJIIJ = null;
        }
        if (isAdded()) {
            if (c19ehLJIIJ != null) {
                c19ehLJIIJ.LJJIFFI(this);
            }
        } else if (c19ehLJIIJ != null) {
            c19ehLJIIJ.LIZLLL(this, str);
        }
        if (z) {
            if (c19ehLJIIJ != null) {
                c19ehLJIIJ.LJIIL();
            }
        } else {
            if (c19ehLJIIJ == null) {
                return;
            }
            c19ehLJIIJ.LJIIJ();
        }
    }
}
