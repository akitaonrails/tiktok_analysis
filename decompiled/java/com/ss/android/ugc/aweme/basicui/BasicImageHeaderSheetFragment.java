package com.ss.android.ugc.aweme.basicui;

import X.AbstractC1177930gl5;
import X.C01GW;
import X.C098200Yq;
import X.C0TVI;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1379000lzO;
import X.C1383370m6R;
import X.C1389600mGU;
import X.C14K9;
import X.C1619980sG4;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C21578619ce;
import X.C2187701Ajg;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.DialogC1389100mFg;
import X.EnumC1338240kve;
import X.InterfaceC1391500mJY;
import X.InterfaceC565110MEj;
import X.InterfaceC658750Psf;
import Y.ACListenerS124S0200000_21;
import Y.ACListenerS155S0100000_21;
import Y.AUListenerS56S0201000_6;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS53S0000100_21;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BasicImageHeaderSheetFragment<T> extends BottomSheetDialogFragment {
    public View LL;
    public C21578619ce LLILLJJLI;
    public boolean LLILLL;
    public FrameLayout LLILZ;
    public boolean LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS552S0100000_8((BasicImageHeaderSheetFragment) this, 117));

    public void OR() {
    }

    public void PR() {
    }

    public void RR() {
    }

    public InterfaceC658750Psf UR(Function0<Long> function0) {
        return null;
    }

    public abstract String VR();

    public InterfaceC565110MEj<T> WR() {
        return null;
    }

    public abstract Pair<Integer, String> ZR();

    public abstract String aS();

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return R.style.a_z;
    }

    public static ViewGroup.MarginLayoutParams NR() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final void bS() {
        TextView textView;
        TuxIconView tuxIconView;
        View viewFindViewById;
        Pair<Integer, String> pairZR = ZR();
        if (pairZR == null) {
            View view = this.LL;
            if (view == null || (viewFindViewById = view.findViewById(R.id.wm4)) == null) {
                return;
            }
            C337180DJs.LIZ(viewFindViewById);
            return;
        }
        View view2 = this.LL;
        if (view2 != null && (tuxIconView = (TuxIconView) view2.findViewById(R.id.wm_)) != null) {
            tuxIconView.setIconRes(pairZR.getFirst().intValue());
        }
        View view3 = this.LL;
        if (view3 == null || (textView = (TextView) view3.findViewById(R.id.wmw)) == null) {
            return;
        }
        textView.setText(pairZR.getSecond());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        Integer numLIZJ;
        super.onStart();
        if (!this.LLILLL) {
            Context context = getContext();
            final int iIntValue = (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context)) == null) ? -1 : numLIZJ.intValue();
            TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
            tuxImmersionBarLIZJ.LIZIZ.LJIIL();
            tuxImmersionBarLIZJ.LJFF(iIntValue);
            tuxImmersionBarLIZJ.LIZ(true);
            tuxImmersionBarLIZJ.LIZLLL();
            View view = getView();
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: X.0HCC
                    public int LL = -1;
                    public final /* synthetic */ BasicImageHeaderSheetFragment<Object> LLILLJJLI;

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        Window window2;
                        View decorView2;
                        BasicImageHeaderSheetFragment<Object> basicImageHeaderSheetFragment = this.LLILLJJLI;
                        View view2 = basicImageHeaderSheetFragment.getView();
                        basicImageHeaderSheetFragment.getClass();
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
                                if (dialog == null || (window2 = dialog.getWindow()) == null || (decorView2 = window2.getDecorView()) == null) {
                                    return;
                                }
                                decorView2.setBackground(layerDrawable);
                                return;
                            }
                            if (!(parent instanceof View)) {
                                return;
                            } else {
                                view2 = (View) parent;
                            }
                        } while (view2 != null);
                    }

                    {
                        this.LLILLJJLI = this;
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            this.LLILLL = true;
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public View SR(InterfaceC565110MEj<T> interfaceC565110MEj) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        C197039127h c197039127h = new C197039127h(context, null, 6, 0);
        c197039127h.setTuxFont(102);
        c197039127h.setButtonSize(3);
        c197039127h.setButtonVariant(0);
        ViewGroup.MarginLayoutParams marginLayoutParamsNR = NR();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C426750GoL.LJIIJ(marginLayoutParamsNR, context, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(iLIZIZ2), 32);
        C786410Ut5.J6(c197039127h, marginLayoutParamsNR);
        return c197039127h;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        PR();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        final DialogC1389100mFg dialogC1389100mFg = (DialogC1389100mFg) dialogOnCreateDialog;
        dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.0mJV
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Integer numLIZJ;
                View viewFindViewById = dialogC1389100mFg.findViewById(R.id.yg_);
                FrameLayout frameLayout = (FrameLayout) dialogC1389100mFg.findViewById(R.id.eqx);
                int iIntValue = 0;
                frameLayout.setFitsSystemWindows(false);
                BasicImageHeaderSheetFragment<T> basicImageHeaderSheetFragment = this;
                basicImageHeaderSheetFragment.LLILZ = frameLayout;
                if (viewFindViewById != null) {
                    C786410Ut5.I7(new ACListenerS124S0200000_21(viewFindViewById, basicImageHeaderSheetFragment, 7), viewFindViewById);
                }
                dialogC1389100mFg.setCanceledOnTouchOutside(false);
                View viewFindViewById2 = dialogC1389100mFg.findViewById(R.id.fpl);
                if (viewFindViewById2 != null) {
                    Context context = this.getContext();
                    if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
                        iIntValue = numLIZJ.intValue();
                    }
                    viewFindViewById2.setBackgroundColor(iIntValue);
                }
                C14K9.LJIJJ(viewFindViewById2, new C0TVI() { // from class: X.0mJX
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                        return c20246014Ju;
                    }
                });
            }
        });
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    public final void MR(int i, boolean z) {
        float f;
        if (getContext() == null) {
            return;
        }
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f = 1.0f;
        }
        FrameLayout frameLayout = this.LLILZ;
        if (frameLayout != null && frameLayout.getPaddingBottom() == ((int) f2) * i) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS56S0201000_6(valueAnimatorOfFloat, this, i, 2));
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.start();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C21578619ce c21578619ce;
        Dialog dialog;
        Dialog dialog2;
        View viewFindViewById;
        Window window;
        ViewGroup viewGroup;
        View viewLLLILZJ;
        View view2;
        ViewGroup viewGroup2;
        SmartImageView smartImageView;
        TextView textView;
        View viewFindViewById2;
        Integer numLIZJ;
        View viewFindViewById3;
        View viewFindViewById4;
        super.onViewCreated(view, bundle);
        this.LL = view;
        if (view != null && (viewFindViewById4 = view.findViewById(R.id.eqx)) != null && Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(viewFindViewById4, new C0TVI() { // from class: X.0DM9
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view3, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view3.setPadding(c20244914JjLIZ.LIZ, c20244914JjLIZ.LIZIZ, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        OR();
        View view3 = this.LL;
        Window window2 = null;
        if (view3 != null) {
            c21578619ce = (C21578619ce) view3.findViewById(R.id.pgc);
        } else {
            c21578619ce = null;
        }
        this.LLILLJJLI = c21578619ce;
        if (c21578619ce != null) {
            c21578619ce.setOnTouchListener(new View.OnTouchListener() { // from class: X.0GhV
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view4, MotionEvent motionEvent) {
                    if (view4.canScrollVertically(1) || view4.canScrollVertically(-1)) {
                        view4.getParent().requestDisallowInterceptTouchEvent(true);
                        if ((motionEvent.getAction() & 255) == 1 || (motionEvent.getAction() & 255) == 3) {
                            view4.getParent().requestDisallowInterceptTouchEvent(false);
                        }
                    }
                    return false;
                }
            });
        }
        View view4 = this.LL;
        if (view4 != null && (viewFindViewById3 = view4.findViewById(R.id.hfk)) != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 239), viewFindViewById3);
        }
        View view5 = this.LL;
        if (view5 != null && (viewFindViewById2 = view5.findViewById(R.id.btx)) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            Context context = getContext();
            if (context != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context);
            } else {
                numLIZJ = null;
            }
            c384050F3z.LIZ = numLIZJ;
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(14));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(14));
            Context context2 = getContext();
            if (context2 != null) {
                viewFindViewById2.setBackground(c384050F3z.LIZ(context2));
                dialog = getDialog();
                if (dialog != null) {
                    window.setSoftInputMode(16);
                }
                dialog2 = getDialog();
                if (dialog2 != null) {
                    BottomSheetBehavior.from(viewFindViewById).addBottomSheetCallback(new AbstractC1177930gl5(this) { // from class: X.0mJU
                        public final /* synthetic */ BasicImageHeaderSheetFragment<Object> LIZ;

                        @Override // X.AbstractC1177930gl5
                        public final void LIZJ(View view6, float f) {
                        }

                        {
                            this.LIZ = this;
                        }

                        @Override // X.AbstractC1177930gl5
                        public final void LIZLLL(int i, View view6) {
                            if (i != 1 && i != 2) {
                                return;
                            }
                            InputMethodManager inputMethodManager = (InputMethodManager) this.LIZ.LLILZLL.getValue();
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(view6.getWindowToken(), 0);
                            }
                            FrameLayout frameLayout = this.LIZ.LLILZ;
                            if (frameLayout == null) {
                                return;
                            }
                            C426750GoL.LJIIL(frameLayout, null, null, null, 0, 23);
                        }
                    });
                }
            }
        } else {
            dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setSoftInputMode(16);
            }
            dialog2 = getDialog();
            if (dialog2 != null && (viewFindViewById = dialog2.findViewById(R.id.fpl)) != null) {
                BottomSheetBehavior.from(viewFindViewById).addBottomSheetCallback(new AbstractC1177930gl5(this) { // from class: X.0mJU
                    public final /* synthetic */ BasicImageHeaderSheetFragment<Object> LIZ;

                    @Override // X.AbstractC1177930gl5
                    public final void LIZJ(View view6, float f) {
                    }

                    {
                        this.LIZ = this;
                    }

                    @Override // X.AbstractC1177930gl5
                    public final void LIZLLL(int i, View view6) {
                        if (i != 1 && i != 2) {
                            return;
                        }
                        InputMethodManager inputMethodManager = (InputMethodManager) this.LIZ.LLILZLL.getValue();
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(view6.getWindowToken(), 0);
                        }
                        FrameLayout frameLayout = this.LIZ.LLILZ;
                        if (frameLayout == null) {
                            return;
                        }
                        C426750GoL.LJIIL(frameLayout, null, null, null, 0, 23);
                    }
                });
            }
        }
        View view6 = this.LL;
        if (view6 != null && (textView = (TextView) view6.findViewById(R.id.v4u)) != null) {
            textView.setText(aS());
        }
        bS();
        final InterfaceC565110MEj<T> interfaceC565110MEjWR = WR();
        View view7 = this.LL;
        if (view7 != null && (smartImageView = (SmartImageView) view7.findViewById(R.id.ki9)) != null) {
            smartImageView.setActualImageScaleType(EnumC1338240kve.CENTER_CROP);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(VR());
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            c1331670kl3LJIIIZ.LIZLLL = true;
            InterfaceC658750Psf interfaceC658750PsfUR = UR(new AwS53S0000100_21(jCurrentTimeMillis, 2));
            if (interfaceC658750PsfUR != null) {
                c1331670kl3LJIIIZ.LJJJIL = interfaceC658750PsfUR;
            }
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            smartImageView.setClipToOutline(true);
            smartImageView.setOutlineProvider(new C1379000lzO(Float.valueOf(smartImageView.getResources().getDimension(R.dimen.b1) - C418440Gaw.LIZIZ(3))));
        }
        if (interfaceC565110MEjWR != null && (viewLLLILZJ = interfaceC565110MEjWR.LLLILZJ()) != null && (view2 = this.LL) != null && (viewGroup2 = (ViewGroup) view2.findViewById(R.id.ksi)) != null) {
            viewGroup2.addView(viewLLLILZJ);
        }
        View viewSR = SR(interfaceC565110MEjWR);
        if (viewSR != null) {
            View view8 = this.LL;
            if (view8 != null && (viewGroup = (ViewGroup) view8.findViewById(R.id.d81)) != null) {
                viewGroup.addView(viewSR);
            }
            C1383370m6R.LJI(viewSR);
            C19EG activity = getActivity();
            Dialog dialog3 = getDialog();
            if (dialog3 != null) {
                window2 = dialog3.getWindow();
            }
            new SoftKeyBoardListener(activity, null, window2, null, 8).LIZIZ(new InterfaceC1391500mJY(this) { // from class: X.0mJW
                public final /* synthetic */ BasicImageHeaderSheetFragment<Object> LL;

                @Override // X.InterfaceC1391500mJY
                public final void LLLL(int i) {
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJJIIJ(int i) {
                    this.LL.MR(i, true);
                    InterfaceC565110MEj<Object> interfaceC565110MEj = interfaceC565110MEjWR;
                    if (interfaceC565110MEj != null) {
                        interfaceC565110MEj.LJJIIJ(i);
                    }
                    this.LL.RR();
                    this.LL.LLILZIL = true;
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJZI(int i) {
                    this.LL.MR(i, false);
                    InterfaceC565110MEj<Object> interfaceC565110MEj = interfaceC565110MEjWR;
                    if (interfaceC565110MEj != null) {
                        interfaceC565110MEj.LJZI(i);
                    }
                    this.LL.getClass();
                    this.LL.LLILZIL = false;
                }

                {
                    this.LL = this;
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d24, viewGroup, false);
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
