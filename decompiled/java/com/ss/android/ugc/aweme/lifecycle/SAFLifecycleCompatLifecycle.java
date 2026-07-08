package com.ss.android.ugc.aweme.lifecycle;

import X.C19CP;
import X.C2145108an;
import X.C2188811AlT;
import X.C2296808zG;
import X.InterfaceC214902198i;
import X.InterfaceC497601wk;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.lifecycle.SAFLifecycleCompatLifecycle;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class SAFLifecycleCompatLifecycle extends Lifecycle {
    public final InterfaceC214902198i LL;
    public final Lifecycle LLILLJJLI;
    public final CopyOnWriteArrayList<LifecycleEventObserver> LLILLL = new CopyOnWriteArrayList<>();
    public boolean LLILZ;

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State getCurrentState() {
        return this.LLILZ ? Lifecycle.State.DESTROYED : this.LLILLJJLI.getCurrentState();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public final class AdaptedEventObserver implements LifecycleEventObserver {
        public LifecycleObserver LL;

        public AdaptedEventObserver(LifecycleObserver lifecycleObserver) {
            this.LL = lifecycleObserver;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            LifecycleObserver lifecycleObserver = this.LL;
            if (lifecycleObserver == null) {
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[AdaptedEventObserver] handleLifecycleEvent:");
            sbLIZ.append(event.name());
            sbLIZ.append(" hash:");
            sbLIZ.append(hashCode());
            sbLIZ.append(" observer:");
            sbLIZ.append(lifecycleObserver);
            C2188811AlT.LIZIZ(sbLIZ);
            if (lifecycleObserver instanceof DefaultLifecycleObserver) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[AdaptedEventObserver] Dispatch to DefaultLifecycleObserver:");
                sbLIZ2.append(event.name());
                C2188811AlT.LIZIZ(sbLIZ2);
                switch (C2145108an.LIZ[event.ordinal()]) {
                    case 1:
                        ((DefaultLifecycleObserver) lifecycleObserver).onCreate(lifecycleOwner);
                        break;
                    case 2:
                        ((DefaultLifecycleObserver) lifecycleObserver).onStart(lifecycleOwner);
                        break;
                    case 3:
                        ((DefaultLifecycleObserver) lifecycleObserver).onResume(lifecycleOwner);
                        break;
                    case 4:
                        ((DefaultLifecycleObserver) lifecycleObserver).onPause(lifecycleOwner);
                        break;
                    case 5:
                        ((DefaultLifecycleObserver) lifecycleObserver).onStop(lifecycleOwner);
                        break;
                    case 6:
                        ((DefaultLifecycleObserver) lifecycleObserver).onDestroy(lifecycleOwner);
                        break;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SAFLifecycleCompatLifecycle(InterfaceC214902198i interfaceC214902198i) {
        this.LL = interfaceC214902198i;
        this.LLILLJJLI = ((Fragment) interfaceC214902198i).getLifecycle();
        interfaceC214902198i.uG(new C19CP() { // from class: X.11U7
            @Override // X.C19CP
            public final void LIZIZ(InterfaceC214902198i interfaceC214902198i2, Bundle bundle) {
            }

            @Override // X.C19CP
            public final void LJ(InterfaceC214902198i interfaceC214902198i2) {
            }

            @Override // X.C19CP
            public final void LJFF(InterfaceC214902198i interfaceC214902198i2) {
            }

            @Override // X.C19CP
            public final void LJI(InterfaceC214902198i interfaceC214902198i2) {
            }

            @Override // X.C19CP
            public final void LJIIJ(InterfaceC214902198i interfaceC214902198i2) {
            }

            @Override // X.C19CP
            public final void LJJIIJZLJL(InterfaceC214902198i interfaceC214902198i2) {
            }

            @Override // X.C19CP
            public final void LJJIJ(InterfaceC214902198i interfaceC214902198i2, Bundle bundle) {
            }

            @Override // X.C19CP
            public final void LJJIJIL(InterfaceC214902198i interfaceC214902198i2) {
            }

            @Override // X.C19CP
            public final void LJJIJLIJ(InterfaceC214902198i interfaceC214902198i2) {
            }

            @Override // X.C19CP
            public final void LJJIL(InterfaceC214902198i interfaceC214902198i2) {
            }

            @Override // X.C19CP
            public final void LJJJJI(InterfaceC214902198i interfaceC214902198i2) {
            }

            @Override // X.C19CP
            public final void LJJJJJ(InterfaceC214902198i interfaceC214902198i2, Bundle bundle) {
            }

            @Override // X.C19CP
            public final void LJJJJJL(InterfaceC214902198i interfaceC214902198i2, Bundle bundle) {
            }

            @Override // X.C19CP
            public final void LJJJJLI(InterfaceC214902198i interfaceC214902198i2) {
            }

            @Override // X.C19CP
            public final void LJJJJLL(InterfaceC214902198i interfaceC214902198i2, Bundle bundle) {
            }

            @Override // X.C19CP
            public final void LJIILL(InterfaceC214902198i interfaceC214902198i2) {
                this.LIZ.LIZJ(Lifecycle.Event.ON_RESUME);
            }

            @Override // X.C19CP
            public final void LJIJ(InterfaceC214902198i interfaceC214902198i2) {
                this.LIZ.LIZJ(Lifecycle.Event.ON_START);
            }

            @Override // X.C19CP
            public final void LJIL(InterfaceC214902198i interfaceC214902198i2) {
                this.LIZ.LIZJ(Lifecycle.Event.ON_PAUSE);
            }

            @Override // X.C19CP
            public final void LJJII(InterfaceC214902198i interfaceC214902198i2) {
                this.LIZ.LIZJ(Lifecycle.Event.ON_DESTROY);
            }

            @Override // X.C19CP
            public final void LJJIJL(InterfaceC214902198i interfaceC214902198i2) {
                this.LIZ.LIZJ(Lifecycle.Event.ON_STOP);
            }

            @Override // X.C19CP
            public final void LJJJJZI(InterfaceC214902198i interfaceC214902198i2) {
                SAFLifecycleCompatLifecycle sAFLifecycleCompatLifecycle = this.LIZ;
                sAFLifecycleCompatLifecycle.LLILZ = true;
                sAFLifecycleCompatLifecycle.LIZJ(Lifecycle.Event.ON_DESTROY);
                SAFLifecycleCompatLifecycle sAFLifecycleCompatLifecycle2 = this.LIZ;
                int size = sAFLifecycleCompatLifecycle2.LLILLL.size();
                for (LifecycleEventObserver lifecycleEventObserver : sAFLifecycleCompatLifecycle2.LLILLL) {
                    if (lifecycleEventObserver != null) {
                        sAFLifecycleCompatLifecycle2.LLILLJJLI.removeObserver(lifecycleEventObserver);
                        if (lifecycleEventObserver instanceof SAFLifecycleCompatLifecycle.AdaptedEventObserver) {
                            ((SAFLifecycleCompatLifecycle.AdaptedEventObserver) lifecycleEventObserver).LL = null;
                        }
                    }
                }
                sAFLifecycleCompatLifecycle2.LLILLL.clear();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[SAFLifecycleCompatLifecycle] cleared ");
                sbLIZ.append(size);
                sbLIZ.append(" observers");
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C19CP
            public final void LJIJI(InterfaceC214902198i interfaceC214902198i2, Bundle bundle) {
                SAFLifecycleCompatLifecycle sAFLifecycleCompatLifecycle = this.LIZ;
                sAFLifecycleCompatLifecycle.LLILZ = false;
                sAFLifecycleCompatLifecycle.LIZJ(Lifecycle.Event.ON_CREATE);
            }

            @Override // X.C19CP
            public final void LJJJIL(InterfaceC214902198i interfaceC214902198i2, Bundle bundle) {
                SAFLifecycleCompatLifecycle sAFLifecycleCompatLifecycle = this.LIZ;
                sAFLifecycleCompatLifecycle.LLILZ = false;
                sAFLifecycleCompatLifecycle.LIZJ(Lifecycle.Event.ON_CREATE);
            }
        });
    }

    public final void LIZJ(Lifecycle.Event event) {
        Fragment fragment = (Fragment) this.LL;
        for (LifecycleEventObserver lifecycleEventObserver : this.LLILLL) {
            if (lifecycleEventObserver != null) {
                if ((lifecycleEventObserver instanceof InterfaceC497601wk) && event == Lifecycle.Event.ON_DESTROY) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("only dispatch LifecycleCoroutineScope to onStop, don't destroy. isActive:");
                    sbLIZ.append(C2296808zG.LJI(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this)));
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    lifecycleEventObserver.onStateChanged(fragment, event);
                }
            }
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(LifecycleObserver lifecycleObserver) {
        if (!(lifecycleObserver instanceof LifecycleEventObserver)) {
            lifecycleObserver = new AdaptedEventObserver(lifecycleObserver);
        }
        this.LLILLL.add((LifecycleEventObserver) lifecycleObserver);
        this.LLILLJJLI.addObserver(lifecycleObserver);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void removeObserver(LifecycleObserver lifecycleObserver) {
        AdaptedEventObserver adaptedEventObserver;
        for (LifecycleEventObserver lifecycleEventObserver : this.LLILLL) {
            if (lifecycleEventObserver != null && (Intrinsics.LJFF(lifecycleEventObserver, lifecycleObserver) || (!(lifecycleObserver instanceof LifecycleEventObserver) && (lifecycleEventObserver instanceof AdaptedEventObserver) && Intrinsics.LJFF(((AdaptedEventObserver) lifecycleEventObserver).LL, lifecycleObserver)))) {
                if ((lifecycleEventObserver instanceof AdaptedEventObserver) && (adaptedEventObserver = (AdaptedEventObserver) lifecycleEventObserver) != null) {
                    adaptedEventObserver.LL = null;
                }
                this.LLILLJJLI.removeObserver(lifecycleEventObserver);
                this.LLILLL.remove(lifecycleEventObserver);
            }
        }
        this.LLILLJJLI.removeObserver(lifecycleObserver);
    }
}
