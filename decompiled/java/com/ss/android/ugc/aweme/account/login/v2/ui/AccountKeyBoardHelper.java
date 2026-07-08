package com.ss.android.ugc.aweme.account.login.v2.ui;

import X.C01GW;
import X.C19EG;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC452301pR;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountKeyBoardHelper implements ViewTreeObserver.OnGlobalLayoutListener, GenericLifecycleObserver {
    public static final C01GW<Boolean> LLJ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS207S0000000_19.get$arr$(38));
    public final View LL;
    public final Fragment LLILLJJLI;
    public Boolean LLILZLL;
    public Fragment LLIZLLLIL;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 238));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 237));
    public final Rect LLILZIL = new Rect();
    public boolean LLIZ = true;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            startListen();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            stopListen();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private final void startListen() {
        C786410Ut5.x3(this.LL.getViewTreeObserver(), this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private final void stopListen() {
        C786410Ut5.C3(this.LL.getViewTreeObserver(), this);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0iAl, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0iAl, androidx.fragment.app.Fragment] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Window window;
        View decorView;
        if (this.LLIZ) {
            this.LLIZ = false;
            return;
        }
        this.LLILZIL.setEmpty();
        C19EG activity = this.LLILLJJLI.getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(this.LLILZIL);
        }
        boolean z = ((Number) this.LLILLL.getValue()).intValue() - this.LLILZIL.bottom > ((Number) this.LLILZ.getValue()).intValue();
        if (Intrinsics.LJFF(Boolean.valueOf(z), this.LLILZLL)) {
            return;
        }
        this.LLILZLL = Boolean.valueOf(z);
        if (z) {
            ?? r0 = this.LLIZLLLIL;
            if (r0 != 0) {
                r0.ln();
                return;
            }
            return;
        }
        ?? r02 = this.LLIZLLLIL;
        if (r02 != 0) {
            r02.LLIIIZ();
        }
    }

    public AccountKeyBoardHelper(View view, Fragment fragment) {
        this.LL = view;
        this.LLILLJJLI = fragment;
        fragment.getLifecycle().addObserver(this);
    }
}
