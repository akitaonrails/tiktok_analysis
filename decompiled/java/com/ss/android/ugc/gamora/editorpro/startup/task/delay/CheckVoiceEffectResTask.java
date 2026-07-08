package com.ss.android.ugc.gamora.editorpro.startup.task.delay;

import X.C01GW;
import X.C0PEM;
import X.C2296208zA;
import X.C2296808zG;
import X.C2299808zk;
import X.C23250099c;
import X.C353070Dsn;
import X.C452501pT;
import X.InterfaceC359970E9j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class CheckVoiceEffectResTask implements InterfaceC359970E9j {
    public static boolean LLILLJJLI = true;
    public final C01GW LL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(276));

    @Override // X.InterfaceC359970E9j
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC359970E9j
    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C353070Dsn(this, null), 3);
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.gamora.editorpro.startup.task.delay.CheckVoiceEffectResTask$run$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C2296208zA.LIZ().getClass();
                    C2299808zk.LIZJ();
                    CheckVoiceEffectResTask.LLILLJJLI = true;
                }
            }
        });
    }
}
