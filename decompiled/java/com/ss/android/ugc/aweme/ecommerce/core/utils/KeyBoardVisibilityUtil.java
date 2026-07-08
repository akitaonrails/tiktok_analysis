package com.ss.android.ugc.aweme.ecommerce.core.utils;

import X.C19EG;
import X.C19FO;
import X.C786410Ut5;
import android.R;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class KeyBoardVisibilityUtil implements ViewTreeObserver.OnGlobalLayoutListener, GenericLifecycleObserver {
    public final Window LL;
    public final View LLILLJJLI;
    public final Function2<Boolean, Integer, Unit> LLILLL;
    public boolean LLILZ;
    public final int LLILZIL;
    public final Rect LLILZLL;
    public int LLIZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LIZ() {
        C786410Ut5.C3(this.LLILLJJLI.getViewTreeObserver(), this);
    }

    public final boolean LIZJ() {
        View decorView = this.LL.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iAbs = Math.abs(decorView.getBottom() - rect.bottom);
        Resources resources = this.LLILLJJLI.getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C786410Ut5.n3(resources, "status_bar_height", "dimen", "android"));
        Resources resources2 = this.LLILLJJLI.getContext().getResources();
        if (iAbs <= dimensionPixelSize + resources2.getDimensionPixelSize(C786410Ut5.n3(resources2, "navigation_bar_height", "dimen", "android"))) {
            this.LLIZ = iAbs;
        } else if (iAbs - this.LLIZ > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iApplyDimension = (int) TypedValue.applyDimension(1, this.LLILZIL, this.LLILLJJLI.getResources().getDisplayMetrics());
        this.LLILLJJLI.getWindowVisibleDisplayFrame(this.LLILZLL);
        int height = this.LLILLJJLI.getRootView().getHeight();
        Rect rect = this.LLILZLL;
        boolean z = height - (rect.bottom - rect.top) >= iApplyDimension;
        if (z == this.LLILZ) {
            return;
        }
        this.LLILZ = z;
        this.LLILLL.invoke(Boolean.valueOf(z), Integer.valueOf(this.LLILZLL.bottom));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LIZ();
    }

    public final void LIZIZ(View view) {
        if (view == null) {
            return;
        }
        try {
            ((InputMethodManager) C786410Ut5.H2(this.LLILLJJLI.getContext(), "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        view.clearFocus();
    }

    public KeyBoardVisibilityUtil(C19FO c19fo, Integer num, Function2<? super Boolean, ? super Integer, Unit> function2) {
        this(c19fo.getLifecycle(), c19fo.getWindow(), ((ViewGroup) C786410Ut5.oe(c19fo, R.id.content)).getChildAt(0), num, function2);
    }

    public /* synthetic */ KeyBoardVisibilityUtil(C19EG c19eg, Lifecycle lifecycle, Function2 function2) {
        this(c19eg, lifecycle, 240, function2);
    }

    public KeyBoardVisibilityUtil(C19EG c19eg, Lifecycle lifecycle, Integer num, Function2 function2) {
        this(lifecycle, c19eg.getWindow(), ((ViewGroup) C786410Ut5.oe(c19eg, R.id.content)).getChildAt(0), num, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyBoardVisibilityUtil(Lifecycle lifecycle, Window window, View view, Integer num, Function2<? super Boolean, ? super Integer, Unit> function2) {
        this.LL = window;
        this.LLILLJJLI = view;
        this.LLILLL = function2;
        this.LLILZIL = 148;
        this.LLILZLL = new Rect();
        if (num != null) {
            window.setSoftInputMode(num.intValue());
        }
        lifecycle.addObserver(this);
        C786410Ut5.x3(view.getViewTreeObserver(), this);
    }
}
