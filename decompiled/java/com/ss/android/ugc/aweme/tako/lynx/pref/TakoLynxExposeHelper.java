package com.ss.android.ugc.aweme.tako.lynx.pref;

import X.C098200Yq;
import X.C189200o6;
import X.C2187701Ajg;
import X.EnumC20300114bv;
import X.InterfaceC20300314bx;
import Y.ARunnableS63S0300000_30;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoLynxExposeHelper {
    public static final HashMap<Integer, Boolean> LIZ = new HashMap<>();

    public static final class ExposeView implements GenericLifecycleObserver {
        public final WeakReference<View> LL;
        public final InterfaceC20300314bx LLILLJJLI;
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
                TakoLynxExposeHelper.LIZ.remove(Integer.valueOf(view.hashCode()));
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

        public final void LIZIZ(EnumC20300114bv enumC20300114bv) {
            View view = this.LL.get();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS63S0300000_30(view, this, enumC20300114bv, 5));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
        /* JADX WARN: Type inference failed for: r2v0, types: [X.14bw, android.view.ViewTreeObserver$OnScrollChangedListener] */
        /* JADX WARN: Type inference failed for: r3v0, types: [X.14bt, android.view.ViewTreeObserver$OnWindowFocusChangeListener] */
        /* JADX WARN: Type inference failed for: r4v0, types: [X.14bu, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ExposeView(java.lang.ref.WeakReference r9, X.C20300714c1 r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.lynx.pref.TakoLynxExposeHelper.ExposeView.<init>(java.lang.ref.WeakReference, X.14c1):void");
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
