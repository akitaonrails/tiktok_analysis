package com.bytedance.android.livesdk.comp.api.subscription.lifecycleawarecomponents;

import X.C1161920gLG;
import X.C356901a3;
import X.C499870Jiz;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.subscription.model.PunishmentData;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriptionSuspensionLifecycleObserver implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final Function1<PunishmentData, Unit> LL;
    public final C499870Jiz LLILLJJLI = new C499870Jiz(new AwS586S0100000_7(this, 96));

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

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionSuspensionLifecycleObserver(Function1<? super PunishmentData, Unit> function1) {
        this.LL = function1;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).registerHostWS(50331740, 1, this.LLILLJJLI);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).unRegisterHostWS(50331740, 1, this.LLILLJJLI);
    }
}
