package com.ss.android.ugc.aweme.ecommerce.search.utils;

import X.C19EG;
import X.C2023507wH;
import X.C786410Ut5;
import android.R;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class KeyBoardVisibilityUtil implements LifecycleEventObserver, ViewTreeObserver.OnGlobalLayoutListener {
    public final View LL;
    public final Function2<Boolean, Integer, Unit> LLILLJJLI;
    public boolean LLILLL;
    public final int LLILZ;
    public final Rect LLILZIL;

    public KeyBoardVisibilityUtil() {
        throw null;
    }

    public final boolean LIZ() {
        int iApplyDimension = (int) TypedValue.applyDimension(1, this.LLILZ, this.LL.getResources().getDisplayMetrics());
        this.LL.getWindowVisibleDisplayFrame(this.LLILZIL);
        int height = this.LL.getRootView().getHeight();
        Rect rect = this.LLILZIL;
        return height - (rect.bottom - rect.top) >= iApplyDimension;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zLIZ = LIZ();
        if (zLIZ == this.LLILLL) {
            return;
        }
        this.LLILLL = zLIZ;
        this.LLILLJJLI.invoke(Boolean.valueOf(zLIZ), Integer.valueOf(this.LL.getRootView().getHeight() - this.LLILZIL.bottom));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C2023507wH.LIZ[event.ordinal()] == 1) {
            C786410Ut5.C3(this.LL.getViewTreeObserver(), this);
        }
    }

    public KeyBoardVisibilityUtil(C19EG c19eg, Integer num, Function2 function2) {
        Lifecycle lifecycle = c19eg.getLifecycle();
        Window window = c19eg.getWindow();
        View childAt = ((ViewGroup) C786410Ut5.oe(c19eg, R.id.content)).getChildAt(0);
        this.LL = childAt;
        this.LLILLJJLI = function2;
        this.LLILZ = 148;
        this.LLILZIL = new Rect();
        if (num != null) {
            window.setSoftInputMode(num.intValue());
        }
        lifecycle.addObserver(this);
        C786410Ut5.x3(childAt.getViewTreeObserver(), this);
    }
}
