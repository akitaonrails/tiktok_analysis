package com.ss.android.ugc.aweme.search.performance.core.utils.cardpreload;

import X.C01KJ;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C356901a3;
import X.C651290Pgd;
import X.InterfaceC342110Db7;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderCard;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class CardPageLocalPreloader implements InterfaceC342110Db7, DefaultLifecycleObserver, GenericLifecycleObserver {
    public final boolean LL;
    public final Function0<InterfaceC342110Db7> LLILLJJLI;
    public final Map<Integer, InterfaceC342110Db7> LLILLL = new LinkedHashMap();

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
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // X.InterfaceC342110Db7
    public final void LIZ(PreRenderCard preRenderCard) {
        LifecycleOwner lifecycleOwnerLIZLLL;
        if (!this.LL || (lifecycleOwnerLIZLLL = C651290Pgd.LIZLLL()) == null) {
            return;
        }
        if (((LinkedHashMap) this.LLILLL).get(Integer.valueOf(System.identityHashCode(lifecycleOwnerLIZLLL))) == null) {
            WeakReference weakReference = new WeakReference(lifecycleOwnerLIZLLL);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C01KJ(weakReference, this, null), 3);
            Map<Integer, InterfaceC342110Db7> map = this.LLILLL;
            Integer numValueOf = Integer.valueOf(System.identityHashCode(lifecycleOwnerLIZLLL));
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object obj = linkedHashMap.get(numValueOf);
            if (obj == null) {
                obj = (InterfaceC342110Db7) this.LLILLJJLI.invoke();
                linkedHashMap.put(numValueOf, obj);
            }
            ((InterfaceC342110Db7) obj).LIZ(preRenderCard);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.LLILLL.remove(Integer.valueOf(System.identityHashCode(lifecycleOwner)));
    }

    public CardPageLocalPreloader(Function0 function0, boolean z) {
        this.LL = z;
        this.LLILLJJLI = function0;
    }
}
