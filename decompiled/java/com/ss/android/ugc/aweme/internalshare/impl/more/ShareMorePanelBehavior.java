package com.ss.android.ugc.aweme.internalshare.impl.more;

import X.C14K9;
import X.C16G0;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class ShareMorePanelBehavior<V extends View> extends BottomSheetBehavior<V> {
    public float LIZ;
    public ViewConfiguration LIZIZ;
    public WeakReference<View> LIZJ;
    public boolean LIZLLL;

    public static View LIZ(View view) {
        if (view == null) {
            return null;
        }
        if (C14K9.LJIILL(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewLIZ = LIZ(viewGroup.getChildAt(i));
                if (viewLIZ != null) {
                    return viewLIZ;
                }
            }
        }
        return null;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        RecyclerView recyclerView;
        int scaledTouchSlop;
        WeakReference<View> weakReference;
        View view;
        if (this.LIZIZ == null) {
            this.LIZIZ = ViewConfiguration.get(c16g0.getContext());
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action == 2) {
                float y = motionEvent.getY() - this.LIZ;
                ViewConfiguration viewConfiguration = this.LIZIZ;
                if (viewConfiguration != null) {
                    scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                } else {
                    scaledTouchSlop = 0;
                }
                if (y > scaledTouchSlop && (weakReference = this.LIZJ) != null && (view = weakReference.get()) != null && !view.canScrollVertically(-1) && !this.LIZLLL) {
                    return true;
                }
            }
        } else {
            this.LIZ = motionEvent.getY();
            motionEvent.getPointerId(motionEvent.getActionIndex());
            WeakReference<View> weakReference2 = this.LIZJ;
            View view2 = null;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if ((view2 instanceof RecyclerView) && (recyclerView = (RecyclerView) view2) != null && recyclerView.getScrollState() == 2) {
                recyclerView.stopScroll();
            }
        }
        return super.onInterceptTouchEvent(c16g0, v, motionEvent);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        this.LIZJ = new WeakReference<>(LIZ(v));
        return super.onLayoutChild(c16g0, v, i);
    }
}
