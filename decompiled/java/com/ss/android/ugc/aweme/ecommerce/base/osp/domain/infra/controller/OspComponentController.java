package com.ss.android.ugc.aweme.ecommerce.base.osp.domain.infra.controller;

import X.C01GW;
import X.C035K;
import X.C035P;
import X.C035S;
import X.C035U;
import X.C036G;
import X.C03VG;
import X.C098200Yq;
import X.C13LP;
import X.C189200o6;
import X.C1AF0;
import X.C452501pT;
import X.InterfaceC765602ys;
import X.InterfaceC769902zZ;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class OspComponentController implements C035S {
    public final OrderSubmitAssemViewModel LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 120));
    public final OspComponentController$observer$1 LIZJ = new OspComponentController$observer$1(this);

    public OspComponentController(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZ = orderSubmitAssemViewModel;
    }

    @Override // X.C035S
    public final void LIZ(Function1<? super C035U, Unit> function1) {
        Object c098200Yq;
        Iterator it2 = ((List) this.LIZIZ.getValue()).iterator();
        while (it2.hasNext()) {
            try {
                function1.invoke(it2.next());
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
        }
    }

    @Override // X.C035S
    public final <T extends InterfaceC769902zZ> T LIZIZ(Class<T> cls) {
        Object next;
        Iterator it2 = ((List) this.LIZIZ.getValue()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (cls.isInstance(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof InterfaceC769902zZ)) {
            return null;
        }
        return (T) next;
    }

    @Override // X.C035S
    public final void LIZJ(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(this.LIZJ);
    }

    @Override // X.C035S
    public final void LIZLLL(Function1<? super C036G, Unit> function1) {
        Object c098200Yq;
        final OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
        ArrayList arrayList = new ArrayList();
        if (C035K.LIZ().enableAddCart) {
            arrayList.add(new C03VG(orderSubmitAssemViewModel) { // from class: X.03Tx
                public final OrderSubmitAssemViewModel LIZ;

                {
                    this.LIZ = orderSubmitAssemViewModel;
                }

                public final void LIZIZ(View view) {
                    if (this.LIZ.qS2()) {
                        boolean z = C03U8.LIZ;
                        if (Intrinsics.LJFF(C03U8.LIZ(this.LIZ.n), Boolean.TRUE)) {
                            this.LIZ.wQ2(view);
                        }
                    }
                }

                @Override // X.C036G
                public final void LJJLIIIJILLIZJL(C850403Ty c850403Ty) {
                    int i = C03U6.LIZ[c850403Ty.LIZ.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3 && this.LIZ.qS2()) {
                                this.LIZ.wQ2(c850403Ty.LIZIZ);
                                return;
                            }
                            return;
                        }
                        LIZIZ(c850403Ty.LIZIZ);
                        return;
                    }
                    LIZIZ(c850403Ty.LIZIZ);
                }
            });
        }
        List list = (List) C035P.LIZ.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C036G) {
                arrayList2.add(obj);
            }
        }
        List listLJLIL = C13LP.LJLIL(arrayList2, arrayList);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(listLJLIL);
        arrayList3.addAll((Collection) this.LIZIZ.getValue());
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            try {
                function1.invoke(it2.next());
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
        }
    }

    @Override // X.C035S
    public final <T extends InterfaceC765602ys> T LJ(Class<T> cls) {
        Object next;
        Iterator it2 = ((List) this.LIZIZ.getValue()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (cls.isInstance(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof InterfaceC765602ys)) {
            return null;
        }
        return (T) next;
    }
}
