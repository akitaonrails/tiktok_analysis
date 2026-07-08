package com.bytedance.ext_power_list;

import X.C0SMO;
import X.C2145508ar;
import X.C724140Saq;
import X.C724150Sar;
import X.C724180Sau;
import X.C724190Sav;
import X.C724200Saw;
import X.C724270Sb3;
import X.C725080ScM;
import X.C725300Sci;
import X.C725320Sck;
import X.C725430Scv;
import X.C725450Scx;
import X.C725480Sd0;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC725440Scw;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class AssemReusedDispatcher<R extends C0SMO<R, ITEM>, ITEM> {
    public ReusedUIAssem<?> LIZ;
    public final LifecycleEventObserver LIZIZ = new LifecycleEventObserver(this) { // from class: com.bytedance.ext_power_list.AssemReusedDispatcher$dispatcher$1
        public final /* synthetic */ AssemReusedDispatcher<R, ITEM> LL;

        {
            this.LL = this;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            ReusedUIAssem<?> reusedUIAssem = this.LL.LIZ;
            if (reusedUIAssem == null) {
            }
            switch (C2145508ar.LIZ[event.ordinal()]) {
                case 1:
                    Lifecycle.State currentState = reusedUIAssem.getLifecycle().getCurrentState();
                    Lifecycle.State state = Lifecycle.State.CREATED;
                    if (currentState.compareTo(state) < 0) {
                        if (C725080ScM.LJJI) {
                            reusedUIAssem.handleOnCreate$assem_release();
                        } else {
                            reusedUIAssem.onCreate();
                        }
                    } else {
                        if (reusedUIAssem.getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) > 0) {
                            if (C725080ScM.LJJI) {
                                reusedUIAssem.handleOnPause$assem_release();
                            } else {
                                reusedUIAssem.onPause();
                            }
                        }
                        if (reusedUIAssem.getLifecycle().getCurrentState().compareTo(state) > 0) {
                            if (C725080ScM.LJJI) {
                                reusedUIAssem.handleOnStop$assem_release();
                            } else {
                                reusedUIAssem.onStop();
                            }
                        }
                    }
                    reusedUIAssem.getLifecycle().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
                    break;
                case 2:
                    Lifecycle.State currentState2 = reusedUIAssem.getLifecycle().getCurrentState();
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (currentState2.compareTo(state2) < 0) {
                        if (reusedUIAssem.getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) < 0) {
                            if (C725080ScM.LJJI) {
                                reusedUIAssem.handleOnCreate$assem_release();
                            } else {
                                reusedUIAssem.onCreate();
                            }
                        }
                        if (C725080ScM.LJJI) {
                            reusedUIAssem.handleOnStart$assem_release();
                        } else {
                            reusedUIAssem.onStart();
                        }
                    } else if (reusedUIAssem.getLifecycle().getCurrentState().compareTo(state2) > 0) {
                        if (C725080ScM.LJJI) {
                            reusedUIAssem.handleOnPause$assem_release();
                        } else {
                            reusedUIAssem.onPause();
                        }
                    }
                    reusedUIAssem.getLifecycle().handleLifecycleEvent(Lifecycle.Event.ON_START);
                    break;
                case 3:
                    if (reusedUIAssem.getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) < 0) {
                        if (reusedUIAssem.getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) < 0) {
                            if (C725080ScM.LJJI) {
                                reusedUIAssem.handleOnCreate$assem_release();
                            } else {
                                reusedUIAssem.onCreate();
                            }
                        }
                        if (reusedUIAssem.getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) < 0) {
                            if (C725080ScM.LJJI) {
                                reusedUIAssem.handleOnStart$assem_release();
                            } else {
                                reusedUIAssem.onStart();
                            }
                        }
                        if (C725080ScM.LJJI) {
                            reusedUIAssem.handleOnResume();
                        } else {
                            reusedUIAssem.onResume();
                        }
                    }
                    reusedUIAssem.getLifecycle().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                    break;
                case 4:
                    if (C725080ScM.LJJI) {
                        reusedUIAssem.handleOnPause$assem_release();
                    } else {
                        reusedUIAssem.getLifecycle().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                        reusedUIAssem.onPause();
                    }
                    break;
                case 5:
                    if (C725080ScM.LJJI) {
                        reusedUIAssem.handleOnStop$assem_release();
                    } else {
                        reusedUIAssem.getLifecycle().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                        reusedUIAssem.onStop();
                    }
                    break;
                case 6:
                    if (C725080ScM.LJJI) {
                        reusedUIAssem.handleOnDestroy$assem_release();
                    } else {
                        reusedUIAssem.getLifecycle().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                        reusedUIAssem.onDestroy();
                    }
                    break;
            }
        }
    };

    public final void LIZIZ() {
        ReusedUIAssem<?> reusedUIAssem = this.LIZ;
        if (reusedUIAssem != null) {
            if (C725080ScM.LJIILL) {
                C724270Sb3 c724270Sb3 = reusedUIAssem.LLJI;
                if (c724270Sb3 != null && c724270Sb3.LLILLL) {
                    c724270Sb3.LJII();
                    reusedUIAssem.lo();
                }
            } else {
                C724270Sb3 c724270Sb32 = reusedUIAssem.LLJI;
                if (c724270Sb32 != null) {
                    c724270Sb32.LJII();
                }
                reusedUIAssem.lo();
            }
            ((CopyOnWriteArrayList) reusedUIAssem.LL.LL.getValue()).clear();
            reusedUIAssem.ko(new C724180Sau());
        }
    }

    public final <T extends InterfaceC1587906Jp> void LIZ(T t) {
        ReusedUIAssem<?> reusedUIAssem = this.LIZ;
        if (reusedUIAssem != null) {
            C725320Sck c725320Sck = C725320Sck.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
                if (arrayList.size() > 0) {
                    Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().onEventBegin(c725320Sck);
                    }
                }
                if (C725480Sd0.LIZ(c725320Sck)) {
                    C725430Scv.LIZ(new C724190Sav(c725320Sck, "default", SystemClock.elapsedRealtimeNanos()));
                }
            }
            C724270Sb3 c724270Sb3 = reusedUIAssem.LLJI;
            if (c724270Sb3 != null) {
                c724270Sb3.LLILLL = true;
                Iterator it3 = ((CopyOnWriteArrayList) c724270Sb3.LLJJIJIIJIL).iterator();
                while (it3.hasNext()) {
                    ((Function1) it3.next()).invoke(Boolean.TRUE);
                }
            }
            C725320Sck c725320Sck2 = C725320Sck.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                if (arrayList2.size() > 0) {
                    Iterator<InterfaceC725440Scw> it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        it4.next().onEventEnd(c725320Sck2);
                    }
                }
                if (C725480Sd0.LIZ(c725320Sck2)) {
                    C725430Scv.LIZ(new C724140Saq(c725320Sck2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), reusedUIAssem));
                }
            }
            C725300Sci c725300Sci = C725300Sci.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList3 = C725430Scv.LIZIZ;
                if (arrayList3.size() > 0) {
                    Iterator<InterfaceC725440Scw> it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        it5.next().onEventBegin(c725300Sci);
                    }
                }
                if (C725480Sd0.LIZ(c725300Sci)) {
                    C725430Scv.LIZ(new C724200Saw(c725300Sci, "default", SystemClock.elapsedRealtimeNanos()));
                }
            }
            reusedUIAssem.ho(t);
            C725300Sci c725300Sci2 = C725300Sci.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList4 = C725430Scv.LIZIZ;
                if (arrayList4.size() > 0) {
                    Iterator<InterfaceC725440Scw> it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        it6.next().onEventEnd(c725300Sci2);
                    }
                }
                if (C725480Sd0.LIZ(c725300Sci2)) {
                    C725430Scv.LIZ(new C724150Sar(c725300Sci2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), reusedUIAssem));
                }
            }
        }
    }
}
