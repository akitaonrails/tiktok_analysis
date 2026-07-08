package oc;

import X.C07A6;
import X.C1488660oqG;
import X.C260310AIb;
import X.C269060Aga;
import X.InterfaceC1848690yCx;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes28.dex */
public class a extends FrameLayout {
    public static volatile boolean LL;

    @Override // android.view.View, android.view.ViewParent
    public final void requestFitSystemWindows() {
        if (!((Boolean) C07A6.LIZ.getValue()).booleanValue()) {
            super.requestFitSystemWindows();
            return;
        }
        Object context = getContext();
        if (!(context instanceof InterfaceC1848690yCx)) {
            super.requestFitSystemWindows();
        } else {
            if (((InterfaceC1848690yCx) context).enableSkipInset()) {
                return;
            }
            super.requestFitSystemWindows();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (Looper.getMainLooper() != Looper.myLooper() && C1488660oqG.LIZIZ != null) {
            new HashMap();
            C1488660oqG.LIZIZ.LIZ();
        }
        super.requestLayout();
    }

    public a(Context context) {
        super(context);
    }

    public static void setIsOpenMultiWindowOptimize(boolean z) {
        LL = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        if ((((Number) C269060Aga.LIZ.getValue()).intValue() & 1) == 1 && (getContext() instanceof InterfaceC1848690yCx)) {
            return windowInsets;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C1488660oqG.LIZIZ.LIZJ(true);
        super.dispatchDraw(canvas);
        C1488660oqG.LIZIZ.LIZJ(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (!((Boolean) C260310AIb.LIZ.getValue()).booleanValue()) {
            return super.gatherTransparentRegion(region);
        }
        Object context = getContext();
        if (!(context instanceof InterfaceC1848690yCx)) {
            return super.gatherTransparentRegion(region);
        }
        if (!((InterfaceC1848690yCx) context).enableSkipGatherRegion()) {
            return super.gatherTransparentRegion(region);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (Looper.getMainLooper() != Looper.myLooper() && C1488660oqG.LIZIZ != null) {
            new HashMap();
            C1488660oqG.LIZIZ.LIZ();
        }
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        if (Looper.getMainLooper() != Looper.myLooper() && C1488660oqG.LIZIZ != null) {
            new HashMap();
            C1488660oqG.LIZIZ.LIZ();
        }
        super.onDescendantInvalidated(view, view2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1488660oqG.LIZIZ.LIZIZ(true);
        super.onLayout(z, i, i2, i3, i4);
        C1488660oqG.LIZIZ.LIZIZ(false);
    }
}
