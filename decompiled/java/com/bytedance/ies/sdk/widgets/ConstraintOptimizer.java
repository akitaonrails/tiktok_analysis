package com.bytedance.ies.sdk.widgets;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes18.dex */
public final class ConstraintOptimizer {
    public static final ConstraintOptimizer INSTANCE = new ConstraintOptimizer();
    public static boolean enableMeasureOptimize = true;
    public static volatile boolean hasSet;
    public static boolean isInvalidParamPanic;

    public static final void setEnableOpt(boolean z) {
        if (hasSet) {
            if (!isInvalidParamPanic) {
            } else {
                throw new IllegalAccessError("setEnableOpt could only be called once!");
            }
        } else {
            hasSet = true;
            isInvalidParamPanic = z;
        }
    }

    public final void correctHelperParams$live_widget_release(ViewGroup.LayoutParams layoutParams) {
        if (!enableMeasureOptimize) {
            return;
        }
        if (layoutParams.width >= 0) {
            if (!isInvalidParamPanic) {
                layoutParams.width = -2;
            } else {
                throw new IllegalArgumentException("Invalid width, You can only use wrap_content or match_parent for this type of view");
            }
        }
        if (layoutParams.height >= 0) {
            if (!isInvalidParamPanic) {
                layoutParams.height = -2;
                return;
            }
            throw new IllegalArgumentException("Invalid height, You can only use wrap_content or match_parent for this type of view");
        }
    }

    public final int getOptMeasureSize$live_widget_release(int i, int i2) {
        if (!enableMeasureOptimize || i == -2 || View.MeasureSpec.getMode(i2) == 0) {
            return 0;
        }
        return View.MeasureSpec.getSize(i2);
    }
}
