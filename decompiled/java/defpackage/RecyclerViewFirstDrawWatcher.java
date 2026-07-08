package defpackage;

import X.C356901a3;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC2189571Amh;
import X.ViewTreeObserverOnPreDrawListenerC2189661Amq;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public final class RecyclerViewFirstDrawWatcher implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final RecyclerView LL;
    public final Function0<Unit> LLILLJJLI;
    public boolean LLILLL;
    public final ViewTreeObserverOnPreDrawListenerC2189661Amq LLILZ = new ViewTreeObserverOnPreDrawListenerC2189661Amq(this, 0);
    public final ViewOnAttachStateChangeListenerC2189571Amh LLILZIL = new ViewOnAttachStateChangeListenerC2189571Amh(this, 4);

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
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
        if (this.LL.getViewTreeObserver().isAlive()) {
            C786410Ut5.D3(this.LL.getViewTreeObserver(), this.LLILZ);
        }
        this.LL.removeOnAttachStateChangeListener(this.LLILZIL);
    }

    public final void LIZIZ() {
        if (!this.LL.isAttachedToWindow()) {
            this.LL.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2189571Amh(this, 0));
        } else {
            C786410Ut5.y3(this.LL.getViewTreeObserver(), this.LLILZ);
            this.LL.addOnAttachStateChangeListener(this.LLILZIL);
        }
    }

    public RecyclerViewFirstDrawWatcher(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, Function0 function0) {
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
        this.LLILLJJLI = function0;
    }
}
