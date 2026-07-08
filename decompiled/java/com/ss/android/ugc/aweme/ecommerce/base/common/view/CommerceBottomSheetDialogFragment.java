package com.ss.android.ugc.aweme.ecommerce.base.common.view;

import X.AbstractC1177930gl5;
import X.C034S;
import X.C04JA;
import X.C1120604Zw;
import X.C1308910kAL;
import X.C1766560w4U;
import X.C19FO;
import X.C1AF0;
import X.C1AQS;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C958103op;
import Y.ACListenerS136S0100000_1;
import Y.ARunnableS101S0100000_1;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfEditFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class CommerceBottomSheetDialogFragment extends ECBaseBottomSheetDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyw8JSHELIOSgjJ2ElISA7Zww8JSgpOyw2Cio4PSA+Gy0pLDsXISQgJigVOiQrJCo9PA==";
    public final boolean LLILLJJLI;
    public Boolean LLILLL;
    public Boolean LLILZ;
    public KeyBoardVisibilityUtil LLILZIL;
    public Function1<? super Boolean, Unit> LLILZLL;
    public Integer LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;

    public CommerceBottomSheetDialogFragment() {
        this(0);
    }

    public int UR() {
        return R.drawable.b21;
    }

    public Integer VR() {
        return null;
    }

    public boolean uH() {
        return !(this instanceof CpfEditFragment);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        if (this.mCancelable) {
            super.dismiss();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        if (this.mCancelable) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return Intrinsics.LJFF(this.LLILZ, Boolean.FALSE) ? R.style.aah : R.style.aaf;
    }

    public final void SR() {
        Integer numLIZJ;
        ViewTreeObserver viewTreeObserver;
        Context context = getContext();
        if (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a3j, context)) == null) {
            return;
        }
        final int iIntValue = numLIZJ.intValue();
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
        tuxImmersionBarLIZJ.LIZIZ.LJIIL();
        tuxImmersionBarLIZJ.LJFF(iIntValue);
        tuxImmersionBarLIZJ.LIZ(true);
        tuxImmersionBarLIZJ.LIZLLL();
        View view = getView();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0HC6
            public int LL = -1;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserver viewTreeObserver2;
                Window window;
                View decorView;
                CommerceBottomSheetDialogFragment commerceBottomSheetDialogFragment = this.LLILLJJLI;
                View view2 = commerceBottomSheetDialogFragment.getView();
                commerceBottomSheetDialogFragment.getClass();
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
                        gradientDrawable2.setColor(iIntValue);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
                        layerDrawable.setLayerInset(1, 0, measuredHeight, 0, 0);
                        Dialog dialog = this.LLILLJJLI.getDialog();
                        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                            decorView.setBackground(layerDrawable);
                        }
                        View view4 = this.LLILLJJLI.getView();
                        if (view4 == null || (viewTreeObserver2 = view4.getViewTreeObserver()) == null) {
                            return;
                        }
                        viewTreeObserver2.removeOnGlobalLayoutListener(this);
                        C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnGlobalLayoutListener.class);
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

    public final void aS() {
        float fLIZIZ;
        int iIntValue;
        View view;
        Bundle arguments = getArguments();
        if (arguments != null) {
            iIntValue = arguments.getInt("height");
            if (iIntValue == 0) {
                fLIZIZ = C958103op.LIZIZ();
                iIntValue = (int) fLIZIZ;
            }
        } else {
            Integer num = this.LLIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                fLIZIZ = C958103op.LIZIZ();
                iIntValue = (int) fLIZIZ;
            }
        }
        View view2 = getView();
        Object parent = view2 != null ? view2.getParent() : null;
        if ((parent instanceof View) && (view = (View) parent) != null) {
            view.setBackgroundResource(UR());
        }
        ZR(iIntValue);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LLILZIL;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.LIZ();
        }
        this.LLILZIL = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        View decorView;
        this.LLJ = SystemClock.elapsedRealtime();
        super.onStart();
        if (!this.LLIZLLLIL) {
            try {
                SR();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fixNavigationBarNavDim error: ");
                sbLIZ.append(e.getMessage());
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LLIZLLLIL = true;
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public CommerceBottomSheetDialogFragment(int i) {
        this.LLILLJJLI = true;
        setCancelable(false);
        this.LLJ = SystemClock.elapsedRealtime();
    }

    public static final void WR(CommerceBottomSheetDialogFragment commerceBottomSheetDialogFragment) {
        Object objH2;
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = commerceBottomSheetDialogFragment.LLILZIL;
        if (keyBoardVisibilityUtil != null) {
            if (keyBoardVisibilityUtil.LLILZ) {
                Context context = commerceBottomSheetDialogFragment.getContext();
                IBinder windowToken = null;
                if (context != null) {
                    objH2 = C786410Ut5.H2(context, "input_method");
                } else {
                    objH2 = null;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) objH2;
                View view = commerceBottomSheetDialogFragment.getView();
                if (view != null) {
                    windowToken = view.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                return;
            }
            commerceBottomSheetDialogFragment.dismissAllowingStateLoss();
        }
    }

    public final void ZR(int i) {
        View view;
        bS(i);
        View view2 = getView();
        Object parent = null;
        if (view2 != null) {
            parent = view2.getParent();
        }
        if ((parent instanceof View) && (view = (View) parent) != null) {
            try {
                BottomSheetBehavior.from(view).setPeekHeight(i);
                final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(view);
                if (!uH() && bottomSheetBehaviorFrom != null) {
                    bottomSheetBehaviorFrom.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.04AP
                        @Override // X.AbstractC1177930gl5
                        public final void LIZJ(View view3, float f) {
                        }

                        @Override // X.AbstractC1177930gl5
                        public final void LIZLLL(int i2, View view3) {
                            if (i2 == 1) {
                                bottomSheetBehaviorFrom.setState(3);
                            }
                        }
                    });
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            view.setOutlineProvider(new C04JA(0));
            view.setClipToOutline(true);
        }
    }

    public void bS(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view = getView();
        if (view != null) {
            View view2 = getView();
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                layoutParams.height = i;
            } else {
                layoutParams = null;
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        C19FO c19fo;
        View view;
        View viewFindViewById;
        ViewParent parent;
        Window window;
        Integer numVR = VR();
        if (numVR != null) {
            int iIntValue = numVR.intValue();
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putInt("height", iIntValue);
            }
            this.LLIZ = Integer.valueOf(iIntValue);
        }
        super.onActivityCreated(bundle);
        aS();
        if (this.LLILZLL != null) {
            SettingsManager.LIZLLL().getClass();
            Object parent2 = null;
            if (SettingsManager.LIZ("ccdc_add_card_keyboard_scroll_fallback_settings", true)) {
                Dialog dialog = getDialog();
                if (dialog != null) {
                    window = dialog.getWindow();
                } else {
                    window = null;
                }
                View view2 = getView();
                if (window != null && view2 != null) {
                    this.LLILZIL = new KeyBoardVisibilityUtil(getViewLifecycleOwner().getLifecycle(), window, view2, 32, new AwS615S0100000_1(this, 10));
                }
            } else {
                Context context = getContext();
                if ((context instanceof C19FO) && (c19fo = (C19FO) context) != null) {
                    this.LLILZIL = new KeyBoardVisibilityUtil(c19fo, (Integer) 32, (Function2<? super Boolean, ? super Integer, Unit>) new AwS615S0100000_1(this, 11));
                }
            }
            View view3 = getView();
            if (view3 != null && (parent = view3.getParent()) != null) {
                parent2 = parent.getParent();
            }
            if ((parent2 instanceof View) && (view = (View) parent2) != null && (viewFindViewById = view.findViewById(R.id.yg_)) != null) {
                C786410Ut5.I7(new ACListenerS136S0100000_1(this, 3), viewFindViewById);
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                dialog2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.04AO
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        if (i == 4) {
                            this.LL.getClass();
                            CommerceBottomSheetDialogFragment.WR(this.LL);
                            return false;
                        }
                        return false;
                    }
                });
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        super.onConfigurationChanged(configuration);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isPad()) {
            Integer numVR = VR();
            if (numVR != null) {
                int iIntValue = numVR.intValue();
                Bundle arguments = getArguments();
                if (arguments != null) {
                    arguments.putInt("height", iIntValue);
                }
                this.LLIZ = Integer.valueOf(iIntValue);
            }
            aS();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Boolean boolValueOf;
        super.onCreate(bundle);
        if (bundle != null) {
            setCancelable(true);
            dismissAllowingStateLoss();
        }
        if (this.LLILLJJLI) {
            C786410Ut5.LJLIIL(450L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS101S0100000_1(this, 3));
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("needs_dim", true));
        } else {
            boolValueOf = null;
        }
        this.LLILZ = boolValueOf;
    }
}
