package com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.utils;

import X.C098200Yq;
import X.C0R1H;
import X.C189200o6;
import X.C19FO;
import X.C786410Ut5;
import android.R;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes4.dex */
public final class KeyBoardVisibilityUtil implements ViewTreeObserver.OnGlobalLayoutListener, GenericLifecycleObserver {
    public final View LL;
    public final Function2<Boolean, Integer, Unit> LLILLJJLI;
    public boolean LLILLL;
    public final int LLILZ;
    public final Rect LLILZIL;

    public KeyBoardVisibilityUtil() {
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C786410Ut5.C3(this.LL.getViewTreeObserver(), this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iApplyDimension = (int) TypedValue.applyDimension(1, this.LLILZ, this.LL.getResources().getDisplayMetrics());
        this.LL.getWindowVisibleDisplayFrame(this.LLILZIL);
        int height = this.LL.getRootView().getHeight();
        Rect rect = this.LLILZIL;
        boolean z = height - (rect.bottom - rect.top) >= iApplyDimension;
        if (z == this.LLILLL) {
            return;
        }
        this.LLILLL = z;
        this.LLILLJJLI.invoke(Boolean.valueOf(z), Integer.valueOf(this.LLILZIL.bottom));
    }

    public KeyBoardVisibilityUtil(C19FO c19fo, Integer num, AwS640S0100000_26 awS640S0100000_26) {
        Window window = c19fo.getWindow();
        this.LL = ((ViewGroup) C786410Ut5.oe(c19fo, R.id.content)).getChildAt(0);
        this.LLILLJJLI = awS640S0100000_26;
        this.LLILZ = 148;
        this.LLILZIL = new Rect();
        if (num != null) {
            window.setSoftInputMode(num.intValue());
        }
        try {
            C0R1H.LIZIZ(c19fo, this);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C786410Ut5.x3(this.LL.getViewTreeObserver(), this);
    }
}
