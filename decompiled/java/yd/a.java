package yd;

import android.app.Fragment;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* JADX INFO: loaded from: classes33.dex */
public final class a extends Fragment implements LifecycleOwner {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJTx9LDYgZw4wHELIOSPCw6IDsqBCwqLCwqKykpDz0yLygpJzs=";
    public final LifecycleRegistry LL = new LifecycleRegistry(this);

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL;
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }
}
