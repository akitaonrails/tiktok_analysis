package com.ss.android.ugc.aweme.search.lynx.core.communicate;

import X.C098200Yq;
import X.C189200o6;
import X.C19EG;
import X.C1AWL;
import X.C2187701Ajg;
import X.C325901Of;
import X.C651290Pgd;
import X.C657990PrR;
import X.EnumC20300814c2;
import Y.ARunnableS41S0400000_33;
import Y.ARunnableS66S0300000_33;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.LynxExposeHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxExposeHelper {
    public static final LynxExposeHelper LIZ = new LynxExposeHelper();
    public static final HashMap<Integer, Boolean> LIZIZ = new HashMap<>();

    /* JADX INFO: loaded from: classes34.dex */
    public static final class ExposeView implements GenericLifecycleObserver {
        public final WeakReference<View> LL;
        public final C1AWL LLILLJJLI;
        public Lifecycle.Event LLILLL = Lifecycle.Event.ON_ANY;
        public boolean LLILZ;
        public boolean LLILZIL;
        public ViewTreeObserver LLILZLL;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_PAUSE) {
                onPause();
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                onStop();
                return;
            }
            if (event == Lifecycle.Event.ON_RESUME) {
                onResume();
            } else if (event == Lifecycle.Event.ON_START) {
                onStart();
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        private final void onDestroy() {
            View view = this.LL.get();
            if (view != null) {
                LynxExposeHelper.LIZIZ.remove(Integer.valueOf(view.hashCode()));
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        private final void onPause() {
            this.LLILLL = Lifecycle.Event.ON_PAUSE;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        private final void onResume() {
            this.LLILLL = Lifecycle.Event.ON_RESUME;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        private final void onStart() {
            this.LLILLL = Lifecycle.Event.ON_START;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        private final void onStop() {
            this.LLILLL = Lifecycle.Event.ON_STOP;
        }

        public final void LIZJ() {
            View view = this.LL.get();
            this.LLILZLL = view != null ? view.getViewTreeObserver() : null;
        }

        public final void LIZIZ(EnumC20300814c2 enumC20300814c2) {
            View view = this.LL.get();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS66S0300000_33(enumC20300814c2, view, this, 13));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [X.1AWK, android.view.ViewTreeObserver$OnScrollChangedListener] */
        /* JADX WARN: Type inference failed for: r3v0, types: [X.1AWI, android.view.ViewTreeObserver$OnWindowFocusChangeListener] */
        /* JADX WARN: Type inference failed for: r4v0, types: [X.1AWJ, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
        public ExposeView(WeakReference<View> weakReference, C1AWL c1awl) {
            ViewTreeObserver viewTreeObserver;
            this.LL = weakReference;
            this.LLILLJJLI = c1awl;
            View view = weakReference.get();
            if (view != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            this.LLILZLL = viewTreeObserver;
            final View view2 = weakReference.get();
            if (view2 != null) {
                final ?? r4 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.1AWJ
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        this.LIZIZ(EnumC20300814c2.LAYOUT);
                    }
                };
                final ?? r3 = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.1AWI
                    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                    public final void onWindowFocusChanged(boolean z) {
                        this.LL.LIZIZ(EnumC20300814c2.FOCUS);
                    }
                };
                final ?? r2 = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.1AWK
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        this.LIZIZ(EnumC20300814c2.SCROLL);
                    }
                };
                SAFHelper sAFHelper = SAFHelper.LIZ;
                LynxExposeHelper.LIZ.getClass();
                C19EG c19egLIZ = C657990PrR.LIZ(view2);
                c19egLIZ = c19egLIZ == null ? C651290Pgd.LJ() : c19egLIZ;
                sAFHelper.getClass();
                LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(view2, c19egLIZ);
                if (lifecycleOwnerLJIJI != null) {
                    C325901Of.LIZ(lifecycleOwnerLJIJI, this);
                }
                LIZ(r4, r3, r2);
                view2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.1AWH
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view3) {
                        this.LL.LIZJ();
                        HandlerHook.viewPost(view3, new ARunnableS41S0400000_33(r2, this.LL, r4, r3, 2));
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view3) {
                        Object c098200Yq;
                        if (this.LL.LLILZ) {
                            this.LL.LIZIZ(EnumC20300814c2.ANY);
                        }
                        LynxExposeHelper.ExposeView exposeView = this.LL;
                        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = r4;
                        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = r3;
                        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = r2;
                        if (exposeView.LLILZIL) {
                            ViewTreeObserver viewTreeObserver2 = exposeView.LLILZLL;
                            if (viewTreeObserver2 != null) {
                                try {
                                    viewTreeObserver2.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                                    C2187701Ajg.LIZIZ(viewTreeObserver2, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
                                    viewTreeObserver2.removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
                                    viewTreeObserver2.removeOnScrollChangedListener(onScrollChangedListener);
                                    C2187701Ajg.LIZIZ(viewTreeObserver2, onScrollChangedListener, ViewTreeObserver.OnScrollChangedListener.class);
                                    exposeView.LLILZIL = false;
                                    c098200Yq = Unit.LIZ;
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                    exposeView.LIZJ();
                                }
                            }
                            exposeView.LLILZLL = null;
                        }
                    }
                });
            }
        }

        public final void LIZ(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
            ViewTreeObserver viewTreeObserver;
            Object c098200Yq;
            if (!this.LLILZIL && (viewTreeObserver = this.LLILZLL) != null) {
                try {
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
                    viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListener);
                    viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
                    C2187701Ajg.LIZ(viewTreeObserver, onScrollChangedListener, ViewTreeObserver.OnScrollChangedListener.class);
                    this.LLILZIL = true;
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    LIZJ();
                }
            }
        }
    }
}
