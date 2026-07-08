package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp;

import X.C1389600mGU;
import X.C19GU;
import X.C497820Jfg;
import X.C786410Ut5;
import X.DialogC1389100mFg;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseBottomSheetFragment extends BottomSheetDialogFragment {
    public float LL;

    public double NR() {
        return 0.8d;
    }

    public int OR() {
        return (int) (((double) C497820Jfg.LIZ(requireContext())) * NR());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        View decorView;
        C19GU c19gu;
        View viewFindViewById;
        ViewGroup viewGroup;
        super.onStart();
        Dialog dialog = getDialog();
        View childAt = null;
        if ((dialog instanceof DialogC1389100mFg) && (c19gu = (C19GU) dialog) != null && (viewFindViewById = c19gu.findViewById(R.id.fpl)) != null) {
            int iOR = OR();
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = iOR;
            C786410Ut5.W5(viewFindViewById, layoutParams);
            if ((viewFindViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById) != null) {
                childAt = viewGroup.getChildAt(0);
            }
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                layoutParams2.height = iOR == -2 ? -2 : -1;
                C786410Ut5.W5(childAt, layoutParams2);
            }
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setSkipCollapsed(true);
            bottomSheetBehaviorFrom.setFitToContents(true);
            if (iOR == -2) {
                iOR = -1;
            }
            bottomSheetBehaviorFrom.setPeekHeight(iOR);
            bottomSheetBehaviorFrom.setHideable(true);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        DialogC1389100mFg dialogC1389100mFg = new DialogC1389100mFg(requireContext(), R.style.ze);
        Window window = dialogC1389100mFg.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogC1389100mFg);
        return dialogC1389100mFg;
    }

    public final void MR(View view, final View view2) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0DPi
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
            
                if (r1 != 3) goto L10;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
                /*
                    r6 = this;
                    com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.BaseBottomSheetFragment r3 = r6.LL
                    android.view.View r5 = r2
                    r3.getClass()
                    int r1 = r8.getActionMasked()
                    r2 = 0
                    r4 = -1
                    if (r1 == 0) goto L19
                    r0 = 1
                    if (r1 == r0) goto L66
                    r0 = 2
                    if (r1 == r0) goto L33
                    r0 = 3
                    if (r1 == r0) goto L66
                L18:
                    return r2
                L19:
                    float r0 = r8.getRawY()
                    r3.LL = r0
                    boolean r0 = r5.canScrollVertically(r4)
                    if (r0 != 0) goto L18
                    android.view.ViewParent r0 = r7.getParent()
                L29:
                    if (r0 == 0) goto L18
                    r0.requestDisallowInterceptTouchEvent(r2)
                    android.view.ViewParent r0 = r0.getParent()
                    goto L29
                L33:
                    float r1 = r8.getRawY()
                    float r0 = r3.LL
                    float r1 = r1 - r0
                    android.content.Context r0 = r7.getContext()
                    android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
                    int r0 = r0.getScaledTouchSlop()
                    float r0 = (float) r0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L5f
                    boolean r0 = r5.canScrollVertically(r4)
                    if (r0 != 0) goto L5f
                    android.view.ViewParent r0 = r7.getParent()
                L55:
                    if (r0 == 0) goto L5f
                    r0.requestDisallowInterceptTouchEvent(r2)
                    android.view.ViewParent r0 = r0.getParent()
                    goto L55
                L5f:
                    float r0 = r8.getRawY()
                    r3.LL = r0
                    return r2
                L66:
                    r0 = 0
                    r3.LL = r0
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC338640DPi.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                MR(viewGroup.getChildAt(i), view2);
            }
        }
    }
}
