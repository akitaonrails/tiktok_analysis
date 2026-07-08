package com.bytedance.android.livesdk.mvi.core;

import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.C01KE;
import X.C09IC;
import X.C09IR;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C330901Qd;
import X.C776170UcZ;
import X.C776180Uca;
import X.C776190Ucb;
import X.C861640Xr8;
import X.InterfaceC1180504jb;
import X.InterfaceC1364105Vn;
import X.InterfaceC774460UZo;
import X.InterfaceC775640Ubi;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public abstract class MviViewModel<S extends InterfaceC775640Ubi, I extends InterfaceC774460UZo, E extends InterfaceC1180504jb> extends ViewModel {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public final C2252331DDr LLILLL;
    public final C2252331DDr LLILZ;
    public final AnonymousClass0950 LLILZIL;

    public abstract Object yQ2(I i, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public final S xQ2() {
        return (S) this.LLILLJJLI.getValue();
    }

    public MviViewModel(S s) {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(s);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 64, null, 5);
        this.LLILLL = c2252331DDrLIZIZ;
        AnonymousClass0950 anonymousClass0950LIZ = C09IC.LIZ(c2252331DDrLIZIZ);
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 64, null, 5);
        this.LLILZ = c2252331DDrLIZIZ2;
        this.LLILZIL = C09IC.LIZ(c2252331DDrLIZIZ2);
        new AtomicReference(c2252321DDqLIZ.getValue());
        C01KE.LIZ(ViewModelKt.getViewModelScope(this), new C330901Qd(new C861640Xr8(new C776180Uca(this, null), anonymousClass0950LIZ), null));
    }

    public final void setState(Function1<? super S, ? extends S> function1) {
        this.LL.setValue(function1.invoke(xQ2()));
    }

    public final void vQ2(I i) {
        C01KE.LIZ(ViewModelKt.getViewModelScope(this), new C776190Ucb(this, i, null));
    }

    public final void wQ2(E e) {
        C01KE.LIZ(ViewModelKt.getViewModelScope(this), new C776170UcZ(this, e, null));
    }
}
