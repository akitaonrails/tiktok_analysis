package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid.logger;

import X.AbstractC683150Qqv;
import X.C0PPG;
import X.C2187701Ajg;
import X.C356901a3;
import X.C786410Ut5;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class BshCardVisibilityManager implements View.OnAttachStateChangeListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnWindowFocusChangeListener, DefaultLifecycleObserver, GenericLifecycleObserver {
    public final LifecycleOwner LL;
    public final C0PPG LLILLJJLI;
    public final WeakReference<View> LLILLL;
    public final Rect LLILZ = new Rect();
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final void LIZ() {
        View view = this.LLILLL.get();
        Pair pair = view == null ? new Pair(Boolean.FALSE, new AbstractC683150Qqv() { // from class: X.0Qqx
        }) : (view.isShown() && this.LLIZLLLIL) ? (view.getWidth() == 0 || view.getHeight() == 0) ? new Pair(Boolean.FALSE, new AbstractC683150Qqv() { // from class: X.0Qqz
        }) : !view.getGlobalVisibleRect(this.LLILZ) ? new Pair(Boolean.FALSE, new AbstractC683150Qqv() { // from class: X.0Qqw
        }) : !this.LLIZ ? new Pair(Boolean.FALSE, new AbstractC683150Qqv() { // from class: X.0Qr0
        }) : new Pair(Boolean.TRUE, null) : new Pair(Boolean.FALSE, new AbstractC683150Qqv() { // from class: X.0Qqy
        });
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        pair.getSecond();
        if (zBooleanValue != this.LLILZIL) {
            this.LLILZIL = zBooleanValue;
            this.LLILLJJLI.onVisibilityChanged(zBooleanValue);
        }
    }

    public final void LIZIZ() {
        View view;
        if (this.LLILZLL || (view = this.LLILLL.get()) == null) {
            return;
        }
        this.LLILZLL = true;
        this.LL.getLifecycle().addObserver(this);
        this.LLIZ = view.hasWindowFocus();
        this.LLIZLLLIL = true;
        C786410Ut5.z3(view.getViewTreeObserver(), this);
        C786410Ut5.x3(view.getViewTreeObserver(), this);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        LIZ();
    }

    public final void LIZJ() {
        if (this.LLILZLL) {
            this.LLILZLL = false;
            View view = this.LLILLL.get();
            this.LL.getLifecycle().removeObserver(this);
            if (view != null) {
                view.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                    return;
                }
                viewTreeObserver.removeOnScrollChangedListener(this);
                C2187701Ajg.LIZIZ(viewTreeObserver, this, ViewTreeObserver.OnScrollChangedListener.class);
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                C2187701Ajg.LIZIZ(viewTreeObserver, this, ViewTreeObserver.OnGlobalLayoutListener.class);
                viewTreeObserver.removeOnWindowFocusChangeListener(this);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        LIZ();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        LIZ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        this.LLIZLLLIL = false;
        LIZ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LLIZLLLIL = true;
        LIZ();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        LIZIZ();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.LLILZLL && this.LLILZIL) {
            this.LLILZIL = false;
            this.LLILLJJLI.onVisibilityChanged(false);
        }
        LIZJ();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.LLIZ = z;
        LIZ();
    }

    public BshCardVisibilityManager(View view, LifecycleOwner lifecycleOwner, C0PPG c0ppg) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = c0ppg;
        this.LLILLL = new WeakReference<>(view);
        if (view.isAttachedToWindow()) {
            LIZIZ();
        }
        view.addOnAttachStateChangeListener(this);
    }
}
