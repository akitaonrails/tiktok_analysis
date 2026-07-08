package com.ss.android.ugc.aweme.feed.activity;

import X.AnonymousClass0716;
import X.C0T3R;
import X.C14EU;
import X.C1570220qxo;
import X.C1912080zrC;
import X.C19308310gL;
import X.C19EG;
import X.C285090BFj;
import X.C823050WQl;
import X.InterfaceC1570250qxr;
import Y.ARunnableS124S0100000_24;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class GlobalAcViewModel extends ViewModel {
    public static final /* synthetic */ int LLIZ = 0;
    public WeakReference<ViewGroup> LL;
    public WeakReference<C19EG> LLILLJJLI;
    public final MutableLiveData<Boolean> LLILLL = new MutableLiveData<>();
    public C1912080zrC LLILZ;
    public final C1570220qxo LLILZIL;
    public final GlobalAcViewModel$mainActivityLifecycleObserver$1 LLILZLL;

    public final void wQ2() {
        WeakReference<ViewGroup> weakReference;
        if (!C19308310gL.LJI) {
            ((ArrayList) C19308310gL.LJII.LIZIZ).add(new WeakReference(this.LLILZIL));
            return;
        }
        UgAwemeActivitySetting ugAwemeActivitySetting = C19308310gL.LJII.LIZ;
        if (ugAwemeActivitySetting != null) {
            WeakReference<C19EG> weakReference2 = this.LLILLJJLI;
            if (weakReference2 == null || weakReference2.get() == null || (weakReference = this.LL) == null || weakReference.get() == null) {
                return;
            }
            WeakReference<ViewGroup> weakReference3 = this.LL;
            ViewGroup viewGroup = weakReference3 != null ? weakReference3.get() : null;
            WeakReference<C19EG> weakReference4 = this.LLILLJJLI;
            this.LLILZ = new C1912080zrC(viewGroup, weakReference4 != null ? weakReference4.get() : null, ugAwemeActivitySetting);
            Boolean value = this.LLILLL.getValue();
            if (value != null) {
                value.booleanValue();
            }
            C1912080zrC c1912080zrC = this.LLILZ;
            if (c1912080zrC != null) {
                WeakReference<C19EG> weakReference5 = this.LLILLJJLI;
                c1912080zrC.LIZJ(weakReference5 != null ? weakReference5.get() : null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0qxo] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel$mainActivityLifecycleObserver$1] */
    public GlobalAcViewModel() {
        EventBus.LIZLLL().LJIJJ(this);
        this.LLILZIL = new InterfaceC1570250qxr() { // from class: X.0qxo
            @Override // X.InterfaceC1570250qxr
            public final void LIZ(UgAwemeActivitySetting ugAwemeActivitySetting) {
                WeakReference<ViewGroup> weakReference;
                ViewGroup viewGroup;
                C19EG c19eg;
                if (ugAwemeActivitySetting != null) {
                    WeakReference<C19EG> weakReference2 = this.LIZ.LLILLJJLI;
                    C19EG c19eg2 = null;
                    if (weakReference2 != null && weakReference2.get() != null && (weakReference = this.LIZ.LL) != null && weakReference.get() != null) {
                        GlobalAcViewModel globalAcViewModel = this.LIZ;
                        WeakReference<ViewGroup> weakReference3 = this.LIZ.LL;
                        if (weakReference3 != null) {
                            viewGroup = weakReference3.get();
                        } else {
                            viewGroup = null;
                        }
                        WeakReference<C19EG> weakReference4 = this.LIZ.LLILLJJLI;
                        if (weakReference4 != null) {
                            c19eg = weakReference4.get();
                        } else {
                            c19eg = null;
                        }
                        globalAcViewModel.LLILZ = new C1912080zrC(viewGroup, c19eg, ugAwemeActivitySetting);
                        GlobalAcViewModel globalAcViewModel2 = this.LIZ;
                        C1912080zrC c1912080zrC = globalAcViewModel2.LLILZ;
                        if (c1912080zrC != null) {
                            WeakReference<C19EG> weakReference5 = globalAcViewModel2.LLILLJJLI;
                            if (weakReference5 != null) {
                                c19eg2 = weakReference5.get();
                            }
                            c1912080zrC.LIZJ(c19eg2);
                        }
                    }
                }
            }
        };
        this.LLILZLL = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.feed.activity.GlobalAcViewModel$mainActivityLifecycleObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                EventBus.LIZLLL().LJJI(this.LL);
            }
        };
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLiveSkyShowEvent(C0T3R c0t3r) {
        C1912080zrC c1912080zrC = this.LLILZ;
        if (c1912080zrC != null) {
            c1912080zrC.LJII = c0t3r.LIZ;
            c1912080zrC.LIZ(false);
        }
    }

    public final void vQ2(ViewGroup viewGroup, Fragment fragment, C19EG c19eg) {
        new WeakReference(fragment);
        this.LL = new WeakReference<>(viewGroup);
        this.LLILLJJLI = new WeakReference<>(c19eg);
        IMainSAFLifecycleKt.requireSAFExpLifecycle(fragment, false, c19eg).addObserver(this.LLILZLL);
        this.LLILLL.observe(c19eg, new Observer<Boolean>() { // from class: X.0qxm
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Boolean bool) {
                bool.booleanValue();
            }
        });
        if (((Boolean) C285090BFj.LJIIIIZZ.getValue()).booleanValue()) {
            if (!((Boolean) AnonymousClass0716.LJIJI.getValue()).booleanValue()) {
                C823050WQl.LIZIZ().submit(new ARunnableS124S0100000_24(this, 143));
                return;
            }
            return;
        }
        wQ2();
    }
}
