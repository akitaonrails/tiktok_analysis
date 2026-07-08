package com.gyf.barlibrary;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class BarConfig {
    public final int mActionBarHeight;
    public final boolean mHasNavigationBar;
    public final boolean mHasNotchScreen;
    public final boolean mInPortrait;
    public final int mNavigationBarHeight;
    public final int mNavigationBarWidth;
    public final float mSmallestWidthDp;
    public final int mStatusBarHeight;

    public boolean isNavigationAtBottom() {
        return this.mSmallestWidthDp >= 600.0f || this.mInPortrait;
    }

    public int getActionBarHeight() {
        return this.mActionBarHeight;
    }

    public int getNavigationBarHeight() {
        return this.mNavigationBarHeight;
    }

    public int getNavigationBarWidth() {
        return this.mNavigationBarWidth;
    }

    public int getStatusBarHeight() {
        return this.mStatusBarHeight;
    }

    public boolean hasNavigationBar() {
        return this.mHasNavigationBar;
    }

    public boolean hasNotchScreen() {
        return this.mHasNotchScreen;
    }

    public BarConfig(Activity activity) {
        boolean z;
        if (activity.getResources().getConfiguration().orientation == 1) {
            z = true;
        } else {
            z = false;
        }
        this.mInPortrait = z;
        this.mSmallestWidthDp = getSmallestWidthDp(activity);
        this.mStatusBarHeight = getInternalDimensionSize(activity, "status_bar_height");
        this.mActionBarHeight = getActionBarHeight(activity);
        int navigationBarHeight = getNavigationBarHeight(activity);
        this.mNavigationBarHeight = navigationBarHeight;
        this.mNavigationBarWidth = getNavigationBarWidth(activity);
        this.mHasNavigationBar = navigationBarHeight > 0;
        this.mHasNotchScreen = NotchUtils.hasNotchScreen(activity);
    }

    private int getActionBarHeight(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
        return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    private int getNavigationBarHeight(Context context) {
        String str;
        if (hasNavBar((Activity) context)) {
            if (this.mInPortrait) {
                str = "navigation_bar_height";
            } else {
                str = "navigation_bar_height_landscape";
            }
            return getInternalDimensionSize(context, str);
        }
        return 0;
    }

    private int getNavigationBarWidth(Context context) {
        if (hasNavBar((Activity) context)) {
            return getInternalDimensionSize(context, "navigation_bar_width");
        }
        return 0;
    }

    private float getSmallestWidthDp(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dzBzEgUjWYTeVEUtTBCWZ3wqfyFm0+qSkHx0dQ==", null)).getRealMetrics(displayMetrics);
        float f = displayMetrics.widthPixels;
        float f2 = displayMetrics.density;
        return Math.min(f / f2, displayMetrics.heightPixels / f2);
    }

    private boolean hasNavBar(Activity activity) throws Throwable {
        if (Settings.Global.getInt(activity.getContentResolver(), "force_fsg_nav_bar", 0) != 0) {
            return false;
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dzBzEgUjWYTeVEUtTBCWZ3wqfyFm0+qSkHx0dQ==", null));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayLLILZIL.getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayLLILZIL.getMetrics(displayMetrics2);
        int i3 = displayMetrics2.heightPixels;
        if (i2 - displayMetrics2.widthPixels <= 0 && i - i3 <= 0) {
            return false;
        }
        return true;
    }

    private int getInternalDimensionSize(Context context, String str) {
        try {
            int iN3 = C786410Ut5.n3(Resources.getSystem(), str, "dimen", "android");
            if (iN3 <= 0) {
                return 0;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(iN3);
            int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(iN3);
            if (dimensionPixelSize2 >= dimensionPixelSize) {
                return dimensionPixelSize2;
            }
            return Math.round((dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }
}
