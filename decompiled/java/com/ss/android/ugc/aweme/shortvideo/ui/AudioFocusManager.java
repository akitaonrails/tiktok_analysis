package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C01GW;
import X.C19393510u5;
import X.C2188811AlT;
import X.C452501pT;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class AudioFocusManager implements GenericLifecycleObserver {
    public final LifecycleOwner LL;
    public final String LLILLJJLI;
    public final C01GW LLILLL;
    public final C19393510u5 LLILZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_START) {
            onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        Function0<Unit> function0;
        C19393510u5 c19393510u5 = this.LLILZ;
        c19393510u5.getClass();
        int i = C19393510u5.LIZJ + 1;
        C19393510u5.LIZJ = i;
        if (i != 1 || (function0 = c19393510u5.LIZ) == null) {
            return;
        }
        function0.invoke();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        Function0<Unit> function0;
        C19393510u5 c19393510u5 = this.LLILZ;
        c19393510u5.getClass();
        int i = C19393510u5.LIZJ - 1;
        C19393510u5.LIZJ = i;
        if (i != 0 || (function0 = c19393510u5.LIZIZ) == null) {
            return;
        }
        function0.invoke();
    }

    public AudioFocusManager(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioFocusManager");
        sbLIZ.append(hashCode());
        this.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LLILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(184));
        this.LLILZ = new C19393510u5(new AwS573S0100000_29(this, 273), new AwS573S0100000_29(this, 274));
    }
}
