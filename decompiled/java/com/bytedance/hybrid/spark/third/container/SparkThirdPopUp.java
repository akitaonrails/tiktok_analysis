package com.bytedance.hybrid.spark.third.container;

import X.AbstractC1911210zpn;
import X.C01CR;
import X.C01GW;
import X.C098200Yq;
import X.C0TVG;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1052290dUR;
import X.C1389600mGU;
import X.C1546200qL4;
import X.C1549350qQ9;
import X.C1554250qY3;
import X.C1554470qYP;
import X.C16G0;
import X.C189200o6;
import X.C1912890zsV;
import X.C19EG;
import X.C19EH;
import X.C20246014Ju;
import X.C20533215Wg;
import X.C2183921Ada;
import X.C2200821BBo;
import X.C415540GRc;
import X.C452501pT;
import X.C786410Ut5;
import X.DialogC197046127o;
import X.EnumC1067640dtC;
import X.InterfaceC1554280qY6;
import X.InterfaceC1800900wxs;
import Y.ARunnableS123S0100000_23;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.hybrid.spark.third.container.SparkThirdFragment;
import com.bytedance.hybrid.spark.third.container.SparkThirdPopUp;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkThirdPopUp extends AppCompatDialogFragment implements InterfaceC1800900wxs, View.OnAttachStateChangeListener, ViewTreeObserver.OnWindowFocusChangeListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWskMC0hISFiOj8yOi5iPSc6HELIOSOiFiKiA9PCQlJyohZhY8KD04HC0lOysDJzUZOQ==";
    public FrameLayout LLILLJJLI;
    public LinearLayout LLILLL;
    public C415540GRc LLILZ;
    public FrameLayout LLILZIL;
    public View LLILZLL;
    public C16G0 LLIZ;
    public C2183921Ada LLJ;
    public SparkPopupSchemaParam LLJI;
    public SparkThirdContext LLJIJIL;
    public SparkThirdFragment LLJILJIL;
    public BottomSheetBehavior<LinearLayout> LLJILJILJ;
    public C1912890zsV LLJJ;
    public int LLJJI;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public ViewTreeObserver.OnGlobalLayoutListener LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public C20246014Ju LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public View LLJLILLLLZIIL;
    public boolean LLJLL;
    public final int LL = (int) ((Resources.getSystem().getDisplayMetrics().density * 100.0f) + 0.5f);
    public final List<InterfaceC1554280qY6> LLIZLLLIL = new ArrayList();
    public final C1554250qY3 LLJILLL = new C1554250qY3();
    public int LLJJIII = -1;
    public int LLJJL = -1;
    public final boolean LLJL = true;
    public final boolean LLJLIL = true;
    public Integer[] LLJLLIL = new Integer[0];
    public final C1554470qYP LLJLLL = new C1554470qYP(this, 1);
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(47));

    static {
        new C1549350qQ9();
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        SR(true);
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        this.LLJJJJLIIL = false;
        NR(false);
        super.onPause();
    }

    @Override // X.InterfaceC1800900wxs
    public final void Lm() {
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LLJILJILJ;
        if (bottomSheetBehavior != null && bottomSheetBehavior.LJJIIJ == 3) {
            Window windowN7 = n7();
            getActivity();
            SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
            if (sparkPopupSchemaParam == null) {
                sparkPopupSchemaParam = null;
            }
            int iLIZIZ = C1549350qQ9.LIZIZ(windowN7, sparkPopupSchemaParam, this, true);
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = this.LLJILJILJ;
            if (bottomSheetBehavior2 == null) {
                bottomSheetBehavior2 = null;
            }
            if (bottomSheetBehavior2.getPeekHeight() != iLIZIZ) {
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior3 = this.LLJILJILJ;
                if (bottomSheetBehavior3 == null) {
                    bottomSheetBehavior3 = null;
                }
                bottomSheetBehavior3.setPeekHeight(iLIZIZ);
            }
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior4 = this.LLJILJILJ;
            (bottomSheetBehavior4 != null ? bottomSheetBehavior4 : null).LIZIZ(4, true);
            UR(this, false, true, 5);
        }
    }

    public final boolean VR() {
        SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
        if (sparkPopupSchemaParam == null) {
            sparkPopupSchemaParam = null;
        }
        if (sparkPopupSchemaParam.getEnablePullDownClose()) {
            return true;
        }
        SparkPopupSchemaParam sparkPopupSchemaParam2 = this.LLJI;
        if (sparkPopupSchemaParam2 == null) {
            sparkPopupSchemaParam2 = null;
        }
        if (sparkPopupSchemaParam2.getDragByGesture()) {
            return true;
        }
        SparkPopupSchemaParam sparkPopupSchemaParam3 = this.LLJI;
        return Intrinsics.LJFF((sparkPopupSchemaParam3 != null ? sparkPopupSchemaParam3 : null).getRealGravity(getContext()), "bottom");
    }

    @Override // X.InterfaceC1800900wxs
    public final void cj() {
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LLJILJILJ;
        if (bottomSheetBehavior != null && bottomSheetBehavior.LJJIIJ == 4) {
            SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
            if (sparkPopupSchemaParam == null) {
                sparkPopupSchemaParam = null;
            }
            int dragHeight = sparkPopupSchemaParam.getDragHeight();
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = this.LLJILJILJ;
            if (bottomSheetBehavior2 == null) {
                bottomSheetBehavior2 = null;
            }
            if (bottomSheetBehavior2.LIZ() != dragHeight) {
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior3 = this.LLJILJILJ;
                if (bottomSheetBehavior3 == null) {
                    bottomSheetBehavior3 = null;
                }
                bottomSheetBehavior3.LJIJJLI = dragHeight;
            }
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior4 = this.LLJILJILJ;
            (bottomSheetBehavior4 != null ? bottomSheetBehavior4 : null).LIZIZ(3, true);
            UR(this, false, true, 5);
        }
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
        SparkThirdFragment sparkThirdFragment = this.LLJILJIL;
        if (sparkThirdFragment != null) {
            sparkThirdFragment.refresh();
        }
    }

    public final Window n7() {
        DialogFragment dialogFragment;
        Dialog dialog;
        Window window;
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            Fragment parentFragment = getParentFragment();
            if (!(parentFragment instanceof DialogFragment) || (dialogFragment = (DialogFragment) parentFragment) == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null) {
                Activity activityLIZ = C01CR.LIZ();
                if (activityLIZ != null) {
                    return activityLIZ.getWindow();
                }
                return null;
            }
        }
        return window;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        View view;
        ViewTreeObserver viewTreeObserver2;
        super.onDestroy();
        View view2 = getView();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive() && (view = getView()) != null && (viewTreeObserver2 = view.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnWindowFocusChangeListener(this);
        }
        View view3 = this.LLJLILLLLZIIL;
        if (view3 != null) {
            C0TVG.LIZIZ(view3, this.LLJLLL);
        }
        this.LLJLILLLLZIIL = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        NR(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLJJJJLIIL = true;
        NR(true);
        if (this.LLJJIII == -1) {
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LLJILJILJ;
            this.LLJJIII = bottomSheetBehavior != null ? bottomSheetBehavior.LJJIIJ : 3;
        }
    }

    public final void NR(boolean z) {
        boolean zHasWindowFocus;
        View decorView;
        C20246014Ju c20246014Ju;
        if (z == this.LLJJJJJIL) {
            return;
        }
        boolean z2 = this.LLJJJJLIIL;
        boolean zIsVisible = isVisible();
        boolean userVisibleHint = getUserVisibleHint();
        View view = getView();
        boolean z3 = false;
        if (view != null) {
            zHasWindowFocus = view.hasWindowFocus();
        } else {
            zHasWindowFocus = false;
        }
        if (z2 && zIsVisible && userVisibleHint && zHasWindowFocus) {
            z3 = true;
        }
        if (z3 != this.LLJJJJJIL) {
            this.LLJJJJJIL = z3;
            Window windowN7 = n7();
            if (windowN7 != null && (decorView = windowN7.getDecorView()) != null && (c20246014Ju = this.LLJJJJ) != null) {
                MR(decorView, c20246014Ju);
            }
        }
    }

    public final void OR(C19EH c19eh) {
        try {
            ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(c19eh, 178);
            if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                aRunnableS123S0100000_23.run();
            } else {
                C786410Ut5.LJJZZIII((Handler) this.LLJZ.getValue(), aRunnableS123S0100000_23);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c19eh.LJIIJ();
        }
    }

    public final void PR(int i) {
        View decorView;
        Object parent;
        View view;
        int paddingBottom;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        FrameLayout.LayoutParams layoutParams2;
        ViewGroup viewGroup;
        View childAt;
        Window windowN7 = n7();
        SparkPopupSchemaParam sparkPopupSchemaParam = null;
        if (windowN7 != null) {
            decorView = windowN7.getDecorView();
        } else {
            decorView = null;
        }
        View view2 = getView();
        if (view2 != null) {
            parent = view2.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        if (view != null) {
            paddingBottom = view.getPaddingBottom();
        } else {
            paddingBottom = 0;
        }
        if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null && (childAt = viewGroup.getChildAt(0)) != null) {
            layoutParams = childAt.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
            i2 = layoutParams2.bottomMargin;
        } else {
            i2 = 0;
        }
        int i3 = (i - paddingBottom) - i2;
        if (decorView != null && (decorView.getWindowSystemUiVisibility() & 1024) != 0) {
            SparkPopupSchemaParam sparkPopupSchemaParam2 = this.LLJI;
            if (sparkPopupSchemaParam2 == null) {
                sparkPopupSchemaParam2 = null;
            }
            if (sparkPopupSchemaParam2.getEngineType() == EnumC1067640dtC.WEB) {
                decorView.setPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), i3);
                decorView.requestLayout();
            }
        }
        SparkPopupSchemaParam sparkPopupSchemaParam3 = this.LLJI;
        if (sparkPopupSchemaParam3 != null) {
            sparkPopupSchemaParam = sparkPopupSchemaParam3;
        }
        if (!sparkPopupSchemaParam.getSelfAdaptiveHeight()) {
            UR(this, false, true, 5);
        }
    }

    public final int RR(Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LLJILJILJ;
            if (bottomSheetBehavior != null) {
                iIntValue = bottomSheetBehavior.LJJIIJ;
            } else {
                iIntValue = -1;
            }
        }
        SparkPopupSchemaParam sparkPopupSchemaParam = null;
        if (iIntValue == 3) {
            SparkPopupSchemaParam sparkPopupSchemaParam2 = this.LLJI;
            if (sparkPopupSchemaParam2 == null) {
                sparkPopupSchemaParam2 = null;
            }
            if (sparkPopupSchemaParam2.getDragMinMarginTop() > 0) {
                SparkPopupSchemaParam sparkPopupSchemaParam3 = this.LLJI;
                if (sparkPopupSchemaParam3 != null) {
                    sparkPopupSchemaParam = sparkPopupSchemaParam3;
                }
                return sparkPopupSchemaParam.getDragMinMarginTop();
            }
        }
        SparkPopupSchemaParam sparkPopupSchemaParam4 = this.LLJI;
        if (sparkPopupSchemaParam4 != null) {
            sparkPopupSchemaParam = sparkPopupSchemaParam4;
        }
        return sparkPopupSchemaParam.getMinMarginTop();
    }

    public final void SR(boolean z) {
        AbstractC1911210zpn abstractC1911210zpn;
        if (this.LLJLL) {
            return;
        }
        String str = null;
        if (getFragmentManager() != null) {
            if (z) {
                C2183921Ada c2183921Ada = this.LLJ;
                if (c2183921Ada == null) {
                    c2183921Ada = null;
                }
                SparkThirdContext sparkThirdContext = this.LLJIJIL;
                if (sparkThirdContext != null) {
                    abstractC1911210zpn = sparkThirdContext.popupAnimator;
                } else {
                    abstractC1911210zpn = null;
                }
                c2183921Ada.LIZIZ(abstractC1911210zpn, new AwS567S0100000_23(this, 69));
            } else {
                try {
                    dismissAllowingStateLoss();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
        SparkThirdContext sparkThirdContext2 = this.LLJIJIL;
        if (sparkThirdContext2 != null) {
            str = sparkThirdContext2.containerId;
        }
        Map<String, SparkThirdContext> map = C1052290dUR.LIZ;
        if (str == null) {
            str = "";
        }
        map.remove(str);
        this.LLJLL = true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        NR(true);
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        SparkPopupSchemaParam sparkPopupSchemaParam;
        View decorView;
        final Context contextRequireContext = requireContext();
        DialogC197046127o dialogC197046127o = new DialogC197046127o(contextRequireContext) { // from class: X.0qXv
            @Override // X.C19EK, android.app.Dialog
            public final void onBackPressed() {
                SparkThirdFragment sparkThirdFragment = this.LLIZ.LLJILJIL;
                if (sparkThirdFragment == null || !sparkThirdFragment.MR()) {
                    super.onBackPressed();
                    this.LLIZ.SR(true);
                }
            }
        };
        C19EG activity = getActivity();
        if (activity != null) {
            dialogC197046127o.setOwnerActivity(activity);
        }
        SparkThirdContext sparkThirdContext = this.LLJIJIL;
        if (sparkThirdContext == null || (sparkPopupSchemaParam = sparkThirdContext.popupSchemaParam) == null) {
            sparkPopupSchemaParam = new SparkPopupSchemaParam(null, 1, null);
        }
        dialogC197046127o.LLILZLL = sparkPopupSchemaParam;
        Window window = dialogC197046127o.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogC197046127o);
        return dialogC197046127o;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/hybrid/spark/third/container/SparkThirdPopUp", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHMkyqC1a3lHjjAphFW+srA+EfRw21HT0wyPrboxx6xA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        NR(!z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        NR(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        NR(false);
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        NR(z);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/hybrid/spark/third/container/SparkThirdPopUp", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHMkyqC1a3lHjjAphFW+srA+EfRw21HT0wyPrboxx6xA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        NR(z);
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(SparkThirdPopUp.class);
        }
    }

    public final C20246014Ju MR(View view, C20246014Ju c20246014Ju) {
        int i;
        View view2;
        boolean z;
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior;
        int measuredHeight;
        if (view == null) {
            return C20246014Ju.LIZIZ;
        }
        C20246014Ju c20246014JuLJIIL = q0.LJIIL(view, c20246014Ju);
        boolean zLJIIIIZZ = c20246014Ju.LJIIIIZZ(8);
        boolean zLIZJ = C1549350qQ9.LIZJ(view, n7(), getView());
        if (c20246014Ju.LJIIIIZZ(2) && !zLIZJ) {
            i = c20246014Ju.LIZ(2).LIZLLL;
        } else {
            i = 0;
        }
        if (zLJIIIIZZ) {
            i = c20246014Ju.LIZ(8).LIZLLL;
        }
        int i2 = this.LLJJL;
        if (i2 == -1) {
            this.LLJJL = i;
            return c20246014JuLJIIL;
        }
        if (i2 == i) {
            return c20246014JuLJIIL;
        }
        SparkPopupSchemaParam sparkPopupSchemaParam = this.LLJI;
        SparkPopupSchemaParam sparkPopupSchemaParam2 = null;
        C415540GRc c415540GRc = null;
        if (sparkPopupSchemaParam == null) {
            sparkPopupSchemaParam = null;
        }
        if (sparkPopupSchemaParam.getIgnoreKeyboardStatusChange() || !this.LLJJJJJIL) {
            return c20246014JuLJIIL;
        }
        int i3 = this.LLJJL;
        int i4 = i - i3;
        int i5 = this.LL;
        if (i4 > i5) {
            Math.abs(i4);
            Math.abs(i4);
            if (getActivity() != null && (view2 = getView()) != null) {
                SparkPopupSchemaParam sparkPopupSchemaParam3 = this.LLJI;
                if (sparkPopupSchemaParam3 == null) {
                    sparkPopupSchemaParam3 = null;
                }
                if (!sparkPopupSchemaParam3.getSelfAdaptiveHeight()) {
                    int iLIZ = C1549350qQ9.LIZ(n7(), view2, this);
                    if (this.LLJJI == 0) {
                        SparkPopupSchemaParam sparkPopupSchemaParam4 = this.LLJI;
                        if (sparkPopupSchemaParam4 == null) {
                            sparkPopupSchemaParam4 = null;
                        }
                        if (sparkPopupSchemaParam4.getSelfAdaptiveHeight()) {
                            SparkPopupSchemaParam sparkPopupSchemaParam5 = this.LLJI;
                            if (sparkPopupSchemaParam5 == null) {
                                sparkPopupSchemaParam5 = null;
                            }
                            measuredHeight = sparkPopupSchemaParam5.getHeight();
                            int iRR = iLIZ - RR(null);
                            if (measuredHeight > iRR) {
                                measuredHeight = iRR;
                            }
                            if (measuredHeight < 0) {
                                measuredHeight = 0;
                            }
                        } else {
                            LinearLayout linearLayout = this.LLILLL;
                            if (linearLayout == null) {
                                linearLayout = null;
                            }
                            measuredHeight = linearLayout.getMeasuredHeight();
                        }
                        this.LLJJI = measuredHeight;
                    }
                    int i6 = this.LLJJI;
                    int iRR2 = iLIZ - RR(null);
                    if (i6 > iRR2) {
                        i6 = iRR2;
                    }
                    LinearLayout linearLayout2 = this.LLILLL;
                    if (linearLayout2 == null) {
                        linearLayout2 = null;
                    }
                    ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = i6;
                    }
                    C415540GRc c415540GRc2 = this.LLILZ;
                    if (c415540GRc2 == null) {
                        c415540GRc2 = null;
                    }
                    ViewGroup.LayoutParams layoutParams2 = c415540GRc2.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = i6;
                    }
                    LinearLayout linearLayout3 = this.LLILLL;
                    if (linearLayout3 == null) {
                        linearLayout3 = null;
                    }
                    int iLIZ2 = C1546200qL4.LIZ(linearLayout3) & 7;
                    LinearLayout linearLayout4 = this.LLILLL;
                    if (linearLayout4 == null) {
                        linearLayout4 = null;
                    }
                    C1546200qL4.LIZJ(iLIZ2 | 80, linearLayout4);
                    BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = this.LLJILJILJ;
                    if (bottomSheetBehavior2 != null) {
                        bottomSheetBehavior2.LJJIII = true;
                        if (this.LLJJJ == 0) {
                            this.LLJJJ = bottomSheetBehavior2.getPeekHeight();
                        }
                        BottomSheetBehavior<LinearLayout> bottomSheetBehavior3 = this.LLJILJILJ;
                        if (bottomSheetBehavior3 == null) {
                            bottomSheetBehavior = null;
                        } else {
                            bottomSheetBehavior = bottomSheetBehavior3;
                        }
                        if (bottomSheetBehavior.LJJIIJ != 3) {
                            if (bottomSheetBehavior3 == null) {
                                bottomSheetBehavior3 = null;
                            }
                            bottomSheetBehavior3.setPeekHeight(i6);
                        } else {
                            if (bottomSheetBehavior3 == null) {
                                bottomSheetBehavior3 = null;
                            }
                            bottomSheetBehavior3.LJIJJLI = i6;
                        }
                    }
                }
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior4 = this.LLJILJILJ;
                if (bottomSheetBehavior4 != null && (z = bottomSheetBehavior4.LJIIZILJ)) {
                    bottomSheetBehavior4.LJJIII = true;
                    this.LLJJJIL = z;
                    bottomSheetBehavior4.LJIIZILJ = false;
                    SparkPopupSchemaParam sparkPopupSchemaParam6 = this.LLJI;
                    if (sparkPopupSchemaParam6 == null) {
                        sparkPopupSchemaParam6 = null;
                    }
                    sparkPopupSchemaParam6.setDragByGesture(false);
                    BottomSheetBehavior<LinearLayout> bottomSheetBehavior5 = this.LLJILJILJ;
                    if (bottomSheetBehavior5 == null) {
                        bottomSheetBehavior5 = null;
                    }
                    bottomSheetBehavior5.setHideable(false);
                }
                LinearLayout linearLayout5 = this.LLILLL;
                if (linearLayout5 == null) {
                    linearLayout5 = null;
                }
                linearLayout5.requestLayout();
                C415540GRc c415540GRc3 = this.LLILZ;
                if (c415540GRc3 != null) {
                    c415540GRc = c415540GRc3;
                }
                c415540GRc.requestLayout();
            }
            PR(i);
            this.LLJJL = i;
            return c20246014JuLJIIL;
        }
        if (i3 - i > i5) {
            Math.abs(i4);
            if (getActivity() != null) {
                View view3 = getView();
                if (view3 != null) {
                    SparkPopupSchemaParam sparkPopupSchemaParam7 = this.LLJI;
                    if (sparkPopupSchemaParam7 == null) {
                        sparkPopupSchemaParam7 = null;
                    }
                    if (!sparkPopupSchemaParam7.getSelfAdaptiveHeight()) {
                        LinearLayout linearLayout6 = this.LLILLL;
                        if (linearLayout6 == null) {
                            linearLayout6 = null;
                        }
                        ViewGroup.LayoutParams layoutParams3 = linearLayout6.getLayoutParams();
                        Window windowN7 = n7();
                        getActivity();
                        SparkPopupSchemaParam sparkPopupSchemaParam8 = this.LLJI;
                        if (sparkPopupSchemaParam8 == null) {
                            sparkPopupSchemaParam8 = null;
                        }
                        layoutParams3.height = C1549350qQ9.LIZIZ(windowN7, sparkPopupSchemaParam8, this, false);
                        C415540GRc c415540GRc4 = this.LLILZ;
                        if (c415540GRc4 == null) {
                            c415540GRc4 = null;
                        }
                        ViewGroup.LayoutParams layoutParams4 = c415540GRc4.getLayoutParams();
                        LinearLayout linearLayout7 = this.LLILLL;
                        if (linearLayout7 == null) {
                            linearLayout7 = null;
                        }
                        layoutParams4.height = linearLayout7.getLayoutParams().height;
                        BottomSheetBehavior<LinearLayout> bottomSheetBehavior6 = this.LLJILJILJ;
                        if (bottomSheetBehavior6 != null) {
                            bottomSheetBehavior6.LJJIII = true;
                            if (bottomSheetBehavior6.LJJIIJ != 3) {
                                LinearLayout linearLayout8 = this.LLILLL;
                                if (linearLayout8 == null) {
                                    linearLayout8 = null;
                                }
                                bottomSheetBehavior6.setPeekHeight(linearLayout8.getLayoutParams().height);
                            } else {
                                LinearLayout linearLayout9 = this.LLILLL;
                                if (linearLayout9 == null) {
                                    linearLayout9 = null;
                                }
                                bottomSheetBehavior6.LJIJJLI = linearLayout9.getLayoutParams().height;
                            }
                        }
                        SparkPopupSchemaParam sparkPopupSchemaParam9 = this.LLJI;
                        if (sparkPopupSchemaParam9 == null) {
                            sparkPopupSchemaParam9 = null;
                        }
                        int iLIZIZ = C1546200qL4.LIZIZ(sparkPopupSchemaParam9, view3, this.LLJLLIL);
                        LinearLayout linearLayout10 = this.LLILLL;
                        if (linearLayout10 == null) {
                            linearLayout10 = null;
                        }
                        C1546200qL4.LIZJ(iLIZIZ, linearLayout10);
                    }
                }
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior7 = this.LLJILJILJ;
                if (bottomSheetBehavior7 != null) {
                    bottomSheetBehavior7.LJJIII = true;
                    if (this.LLJJJIL) {
                        bottomSheetBehavior7.LJIIZILJ = true;
                        SparkPopupSchemaParam sparkPopupSchemaParam10 = this.LLJI;
                        if (sparkPopupSchemaParam10 == null) {
                            sparkPopupSchemaParam10 = null;
                        }
                        sparkPopupSchemaParam10.setDragByGesture(true);
                    }
                    BottomSheetBehavior<LinearLayout> bottomSheetBehavior8 = this.LLJILJILJ;
                    if (bottomSheetBehavior8 == null) {
                        bottomSheetBehavior8 = null;
                    }
                    SparkPopupSchemaParam sparkPopupSchemaParam11 = this.LLJI;
                    if (sparkPopupSchemaParam11 != null) {
                        sparkPopupSchemaParam2 = sparkPopupSchemaParam11;
                    }
                    bottomSheetBehavior8.setHideable(sparkPopupSchemaParam2.getEnablePullDownClose());
                }
                C16G0 c16g0 = this.LLIZ;
                if (c16g0 != null) {
                    c16g0.requestLayout();
                }
            }
            PR(i);
            this.LLJJL = i;
        }
        return c20246014JuLJIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x013e  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.third.container.SparkThirdPopUp.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        if (this.LLJIJIL != null) {
            try {
                Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.FALSE);
                Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
                declaredField2.setAccessible(true);
                declaredField2.set(this, Boolean.TRUE);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LIZLLL(this, str);
            OR(c19ehLJIIJ);
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a2  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r15, android.view.ViewGroup r16, android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.third.container.SparkThirdPopUp.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public static void UR(final SparkThirdPopUp sparkThirdPopUp, boolean z, boolean z2, int i) {
        int i2;
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior;
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior2;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        Window windowN7 = sparkThirdPopUp.n7();
        sparkThirdPopUp.getActivity();
        SparkPopupSchemaParam sparkPopupSchemaParam = sparkThirdPopUp.LLJI;
        SparkPopupSchemaParam sparkPopupSchemaParam2 = null;
        if (sparkPopupSchemaParam == null) {
            sparkPopupSchemaParam = null;
        }
        int iLIZIZ = C1549350qQ9.LIZIZ(windowN7, sparkPopupSchemaParam, sparkThirdPopUp, false);
        if (i2 <= -1) {
            i2 = iLIZIZ;
        }
        if (z2 && (bottomSheetBehavior = sparkThirdPopUp.LLJILJILJ) != null && bottomSheetBehavior.getPeekHeight() != i2) {
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior3 = sparkThirdPopUp.LLJILJILJ;
            if (bottomSheetBehavior3 == null) {
                bottomSheetBehavior2 = null;
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior3;
            }
            if (bottomSheetBehavior2.LJJIIJ != 3) {
                if (bottomSheetBehavior3 == null) {
                    bottomSheetBehavior3 = null;
                }
                bottomSheetBehavior3.setPeekHeight(i2);
            } else {
                if (bottomSheetBehavior3 == null) {
                    bottomSheetBehavior3 = null;
                }
                bottomSheetBehavior3.LJIJJLI = i2;
            }
            LinearLayout linearLayout = sparkThirdPopUp.LLILLL;
            if (linearLayout == null) {
                linearLayout = null;
            }
            linearLayout.requestLayout();
        }
        if (z) {
            final SparkPopupSchemaParam sparkPopupSchemaParam3 = sparkThirdPopUp.LLJI;
            if (sparkPopupSchemaParam3 == null) {
                sparkPopupSchemaParam3 = null;
            }
            final C415540GRc c415540GRc = sparkThirdPopUp.LLILZ;
            if (c415540GRc == null) {
                c415540GRc = null;
            }
            final Window windowN72 = sparkThirdPopUp.n7();
            final C19EG activity = sparkThirdPopUp.getActivity();
            new InterfaceC1554280qY6(sparkPopupSchemaParam3, c415540GRc, sparkThirdPopUp, windowN72, activity) { // from class: X.0qXt
                public final SparkPopupSchemaParam LIZ;
                public final View LIZIZ;
                public final SparkThirdPopUp LIZJ;
                public final Window LIZLLL;

                @Override // X.InterfaceC1554280qY6
                public final void invoke() {
                    if (!this.LIZ.getSelfAdaptiveHeight()) {
                        this.LIZIZ.getLayoutParams().height = C1549350qQ9.LIZIZ(this.LIZLLL, this.LIZ, this.LIZJ, false);
                        this.LIZIZ.requestLayout();
                    } else {
                        if (this.LIZJ.LLJJLIIIJLLLLLLLZ) {
                            return;
                        }
                        this.LIZIZ.getLayoutParams().height = -2;
                        this.LIZIZ.requestLayout();
                    }
                }

                {
                    this.LIZ = sparkPopupSchemaParam3;
                    this.LIZIZ = c415540GRc;
                    this.LIZJ = sparkThirdPopUp;
                    this.LIZLLL = windowN72;
                }
            }.invoke();
            final SparkPopupSchemaParam sparkPopupSchemaParam4 = sparkThirdPopUp.LLJI;
            if (sparkPopupSchemaParam4 == null) {
                sparkPopupSchemaParam4 = null;
            }
            final LinearLayout linearLayout2 = sparkThirdPopUp.LLILLL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            final Window windowN73 = sparkThirdPopUp.n7();
            final C19EG activity2 = sparkThirdPopUp.getActivity();
            new InterfaceC1554280qY6(sparkPopupSchemaParam4, linearLayout2, sparkThirdPopUp, windowN73, activity2) { // from class: X.0qXt
                public final SparkPopupSchemaParam LIZ;
                public final View LIZIZ;
                public final SparkThirdPopUp LIZJ;
                public final Window LIZLLL;

                @Override // X.InterfaceC1554280qY6
                public final void invoke() {
                    if (!this.LIZ.getSelfAdaptiveHeight()) {
                        this.LIZIZ.getLayoutParams().height = C1549350qQ9.LIZIZ(this.LIZLLL, this.LIZ, this.LIZJ, false);
                        this.LIZIZ.requestLayout();
                    } else {
                        if (this.LIZJ.LLJJLIIIJLLLLLLLZ) {
                            return;
                        }
                        this.LIZIZ.getLayoutParams().height = -2;
                        this.LIZIZ.requestLayout();
                    }
                }

                {
                    this.LIZ = sparkPopupSchemaParam4;
                    this.LIZIZ = linearLayout2;
                    this.LIZJ = sparkThirdPopUp;
                    this.LIZLLL = windowN73;
                }
            }.invoke();
            SparkPopupSchemaParam sparkPopupSchemaParam5 = sparkThirdPopUp.LLJI;
            if (sparkPopupSchemaParam5 != null) {
                sparkPopupSchemaParam2 = sparkPopupSchemaParam5;
            }
            if (sparkPopupSchemaParam2.getSelfAdaptiveHeight() && !sparkThirdPopUp.LLJJLIIIJLLLLLLLZ) {
                sparkThirdPopUp.LLJJLIIIJLLLLLLLZ = true;
            }
        }
    }
}
