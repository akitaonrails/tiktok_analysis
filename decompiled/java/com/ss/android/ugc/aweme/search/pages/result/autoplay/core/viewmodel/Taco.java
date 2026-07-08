package com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel;

import X.AbstractC641560PEk;
import X.C01GW;
import X.C036E;
import X.C0C64;
import X.C0P5P;
import X.C0P6X;
import X.C0P74;
import X.C0P7T;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C19EG;
import X.C255980A1k;
import X.C325901Of;
import X.C356901a3;
import X.C452501pT;
import X.C588600N6s;
import X.C607370Nrz;
import X.C648290Pbn;
import X.C650620PfY;
import X.C650640Pfa;
import X.InterfaceC588610N6t;
import X.InterfaceC588620N6u;
import X.InterfaceC639400P6c;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.enablestatus.FragmentLifecycleStatus;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.enablestatus.LifeCycleEnableStatus;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class Taco implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJ = 0;
    public final LifecycleOwner LL;
    public InterfaceC588610N6t LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(596));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1242));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(682));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(683));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(685));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(684));

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
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

    public final C588600N6s LIZJ() {
        return (C588600N6s) this.LLILLL.getValue();
    }

    public final SparseArray<C0P74> LIZLLL() {
        return (SparseArray) this.LLIZ.getValue();
    }

    public final void LJFF() {
        C325901Of.LIZ(this.LL, this);
        if (C0P5P.LIZ()) {
            C325901Of.LIZ(this.LL, (FragmentLifecycleStatus) this.LLILZLL.getValue());
            LIZIZ((AbstractC641560PEk) this.LLILZLL.getValue());
        } else {
            C325901Of.LIZ(this.LL, (LifeCycleEnableStatus) this.LLILZIL.getValue());
            LIZIZ((AbstractC641560PEk) this.LLILZIL.getValue());
        }
        if (C648290Pbn.LIZ < 0) {
            C648290Pbn.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_player_prepare_next_opt", true);
        }
        this.LLILLJJLI = C648290Pbn.LIZ == 1 ? new C650620PfY() : new C650640Pfa();
        C588600N6s c588600N6sLIZJ = LIZJ();
        InterfaceC588610N6t interfaceC588610N6t = this.LLILLJJLI;
        if (interfaceC588610N6t == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        c588600N6sLIZJ.LIZIZ = interfaceC588610N6t;
        C036E.LIZ.LIZ(c588600N6sLIZJ.LIZJ);
        LifecycleOwner lifecycleOwner = this.LL;
        if (lifecycleOwner instanceof C19EG) {
            C1554960qZC.LIZ(C1558360qeg.LJI((C19EG) lifecycleOwner, null), new C0P7T(this), C0P7T.class, "source_default_key");
        } else if (lifecycleOwner instanceof Fragment) {
            C1554960qZC.LIZ(C1558360qeg.LJFF((Fragment) lifecycleOwner, null), new C0P7T(this), C0P7T.class, "source_default_key");
        }
    }

    public Taco(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    public final void LIZIZ(InterfaceC588620N6u interfaceC588620N6u) {
        if (interfaceC588620N6u == null) {
            return;
        }
        final C607370Nrz c607370Nrz = (C607370Nrz) this.LLILZ.getValue();
        if (!c607370Nrz.LIZ().contains(interfaceC588620N6u)) {
            if (interfaceC588620N6u instanceof C0P6X) {
                if (C0P5P.LIZ()) {
                    interfaceC588620N6u.getTag();
                    Observer<Integer> observer = new Observer<Integer>() { // from class: X.0Nry
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Integer num) {
                            int iIntValue = num.intValue();
                            C607370Nrz c607370Nrz2 = c607370Nrz;
                            c607370Nrz2.LIZ.LIZ(new C588540N6m(iIntValue, c607370Nrz2.LIZ()));
                        }
                    };
                    MutableLiveData<Integer> mutableLiveDataLIZ = interfaceC588620N6u.LIZ();
                    if (mutableLiveDataLIZ != null) {
                        mutableLiveDataLIZ.observeForever(observer);
                    }
                    c607370Nrz.LIZLLL.put(interfaceC588620N6u, observer);
                } else {
                    MutableLiveData<Integer> mutableLiveDataLIZ2 = interfaceC588620N6u.LIZ();
                    if (mutableLiveDataLIZ2 != null) {
                        mutableLiveDataLIZ2.observeForever(c607370Nrz.LIZJ);
                    }
                }
            } else if (interfaceC588620N6u instanceof InterfaceC639400P6c) {
                if (C255980A1k.LIZ()) {
                    interfaceC588620N6u.getTag();
                    Observer<Integer> observer2 = new Observer<Integer>() { // from class: X.0Nry
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Integer num) {
                            int iIntValue = num.intValue();
                            C607370Nrz c607370Nrz2 = c607370Nrz;
                            c607370Nrz2.LIZ.LIZ(new C588540N6m(iIntValue, c607370Nrz2.LIZ()));
                        }
                    };
                    MutableLiveData<Integer> mutableLiveDataLIZ3 = interfaceC588620N6u.LIZ();
                    if (mutableLiveDataLIZ3 != null) {
                        mutableLiveDataLIZ3.observeForever(observer2);
                    }
                    c607370Nrz.LIZLLL.put(interfaceC588620N6u, observer2);
                } else {
                    MutableLiveData<Integer> mutableLiveDataLIZ4 = interfaceC588620N6u.LIZ();
                    if (mutableLiveDataLIZ4 != null) {
                        mutableLiveDataLIZ4.observeForever(c607370Nrz.LIZJ);
                    }
                }
            } else {
                MutableLiveData<Integer> mutableLiveDataLIZ5 = interfaceC588620N6u.LIZ();
                if (mutableLiveDataLIZ5 != null) {
                    mutableLiveDataLIZ5.observeForever(c607370Nrz.LIZJ);
                }
            }
            c607370Nrz.LIZ().add(interfaceC588620N6u);
        }
        if (interfaceC588620N6u instanceof AbstractC641560PEk) {
            ((AbstractC641560PEk) interfaceC588620N6u).LL = LIZJ();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        MutableLiveData<Integer> mutableLiveDataLIZ;
        MutableLiveData<Integer> mutableLiveDataLIZ2;
        if (C0P5P.LIZ()) {
            C325901Of.LJ(this.LL, (FragmentLifecycleStatus) this.LLILZLL.getValue());
        } else {
            C325901Of.LJ(this.LL, (LifeCycleEnableStatus) this.LLILZIL.getValue());
        }
        C607370Nrz c607370Nrz = (C607370Nrz) this.LLILZ.getValue();
        for (InterfaceC588620N6u interfaceC588620N6u : c607370Nrz.LIZ()) {
            if (interfaceC588620N6u instanceof C0P6X) {
                if (C0P5P.LIZ()) {
                    Observer<Integer> observer = c607370Nrz.LIZLLL.get(interfaceC588620N6u);
                    if (observer != null && (mutableLiveDataLIZ = interfaceC588620N6u.LIZ()) != null) {
                        mutableLiveDataLIZ.removeObserver(observer);
                    }
                } else {
                    MutableLiveData<Integer> mutableLiveDataLIZ3 = interfaceC588620N6u.LIZ();
                    if (mutableLiveDataLIZ3 != null) {
                        mutableLiveDataLIZ3.removeObserver(c607370Nrz.LIZJ);
                    }
                }
            } else if (interfaceC588620N6u instanceof InterfaceC639400P6c) {
                if (C255980A1k.LIZ()) {
                    Observer<Integer> observer2 = c607370Nrz.LIZLLL.get(interfaceC588620N6u);
                    if (observer2 != null && (mutableLiveDataLIZ2 = interfaceC588620N6u.LIZ()) != null) {
                        mutableLiveDataLIZ2.removeObserver(observer2);
                    }
                } else {
                    MutableLiveData<Integer> mutableLiveDataLIZ4 = interfaceC588620N6u.LIZ();
                    if (mutableLiveDataLIZ4 != null) {
                        mutableLiveDataLIZ4.removeObserver(c607370Nrz.LIZJ);
                    }
                }
            } else {
                MutableLiveData<Integer> mutableLiveDataLIZ5 = interfaceC588620N6u.LIZ();
                if (mutableLiveDataLIZ5 != null) {
                    mutableLiveDataLIZ5.removeObserver(c607370Nrz.LIZJ);
                }
            }
        }
        c607370Nrz.LIZ().clear();
        c607370Nrz.LIZLLL.clear();
        InterfaceC588610N6t interfaceC588610N6t = this.LLILLJJLI;
        if (interfaceC588610N6t != null) {
            interfaceC588610N6t.release();
        }
        SparseArray<C0P74> sparseArrayLIZLLL = LIZLLL();
        int size = sparseArrayLIZLLL.size();
        for (int i = 0; i < size; i++) {
            sparseArrayLIZLLL.keyAt(i);
            sparseArrayLIZLLL.valueAt(i).LJL();
        }
        LIZLLL().clear();
        ((SparseArray) this.LLIZLLLIL.getValue()).clear();
        C588600N6s c588600N6sLIZJ = LIZJ();
        c588600N6sLIZJ.getClass();
        C036E.LIZ.LIZLLL(c588600N6sLIZJ.LIZJ);
        LifecycleOwner lifecycleOwner2 = this.LL;
        if (lifecycleOwner2 instanceof C19EG) {
            C1554960qZC.LIZLLL(C1558360qeg.LJI((C19EG) lifecycleOwner2, null), C0P7T.class, "source_default_key");
        } else {
            if (!(lifecycleOwner2 instanceof Fragment)) {
                return;
            }
            C1554960qZC.LIZLLL(C1558360qeg.LJFF((Fragment) lifecycleOwner2, null), C0P7T.class, "source_default_key");
        }
    }

    public static void LIZ(Taco taco, C0P74 c0p74) {
        if (c0p74 != null) {
            taco.LIZLLL().put(c0p74.hashCode(), c0p74);
            c0p74.z1(taco.LIZJ());
        }
    }

    public static void LJ(Taco taco, C0P74 c0p74) {
        if (c0p74 != null) {
            int iHashCode = c0p74.hashCode();
            C0P74 c0p742 = taco.LIZLLL().get(iHashCode);
            if (c0p742 != null) {
                c0p742.LJL();
            }
            taco.LIZLLL().remove(iHashCode);
        }
    }
}
