package com.ss.android.ugc.aweme;

import X.C0XQ7;
import X.C10EU;
import X.C15438062q;
import X.C1592450rXf;
import X.C19EG;
import X.C282880B6w;
import X.C324440Cni;
import X.C343520DdO;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC1585090rLn;
import X.InterfaceC1570900qyu;
import X.InterfaceC1583870rJp;
import X.RunnableC324460Cnk;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.spi.IHomeTabStabilityService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class HomeTabStabilityServiceImpl implements IHomeTabStabilityService {
    public static boolean LJFF() {
        if (!((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            C0XQ7.LJFF().getClass();
            return (C10EU.LJIILIIL() || ComplianceServiceProvider.LJIL().LJJJJZI() || !((Boolean) C282880B6w.LIZ.getValue()).booleanValue()) ? false : true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.spi.IHomeTabStabilityService
    public final void LIZJ(C1592450rXf c1592450rXf) {
        if (c1592450rXf.isLaidOut() && !c1592450rXf.isLayoutRequested()) {
            C343520DdO.LIZ.getClass();
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), RunnableC324460Cnk.LL);
        } else {
            c1592450rXf.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0Cnj
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    C343520DdO.LIZ.getClass();
                    C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), RunnableC324460Cnk.LL);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.spi.IHomeTabStabilityService
    public final void LIZIZ(C19EG c19eg, EnumC1585090rLn enumC1585090rLn) {
        if (!LJFF()) {
            return;
        }
        C343520DdO.LIZ.getClass();
        C343520DdO.LJ(c19eg, enumC1585090rLn);
    }

    @Override // com.ss.android.ugc.aweme.spi.IHomeTabStabilityService
    public final void LJ(C19EG c19eg, EnumC1585090rLn enumC1585090rLn, Pair<? extends List<? extends InterfaceC1570900qyu>, ? extends List<? extends InterfaceC1570900qyu>> pair) {
        if (!LJFF()) {
            return;
        }
        Objects.toString(enumC1585090rLn);
        List<? extends InterfaceC1570900qyu> first = pair.getFirst();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(first, 10));
        Iterator<T> it2 = first.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC1570900qyu) it2.next()).getTag());
        }
        arrayList.toString();
        List<? extends InterfaceC1570900qyu> second = pair.getSecond();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(second, 10));
        Iterator<T> it3 = second.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((InterfaceC1570900qyu) it3.next()).getTag());
        }
        C343520DdO.LIZ.getClass();
        C343520DdO.LJ(c19eg, enumC1585090rLn);
    }

    @Override // com.ss.android.ugc.aweme.spi.IHomeTabStabilityService
    public final void LIZ(C19EG c19eg, EnumC1585090rLn enumC1585090rLn, List<? extends InterfaceC1583870rJp> list, List<? extends InterfaceC1583870rJp> list2) {
        if (!LJFF()) {
            return;
        }
        Objects.toString(enumC1585090rLn);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC1583870rJp) it2.next()).tag());
        }
        arrayList.toString();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list2;
        Iterator it3 = copyOnWriteArrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((InterfaceC1583870rJp) it3.next()).tag());
        }
        if (!C324440Cni.LIZ(list, copyOnWriteArrayList)) {
            C343520DdO.LIZ.getClass();
            C343520DdO.LJ(c19eg, enumC1585090rLn);
        }
    }

    @Override // com.ss.android.ugc.aweme.spi.IHomeTabStabilityService
    public final void LIZLLL(C19EG c19eg, EnumC1585090rLn enumC1585090rLn, List<? extends InterfaceC1583870rJp> list, List<? extends InterfaceC1583870rJp> list2) {
        if (!LJFF()) {
            return;
        }
        Objects.toString(enumC1585090rLn);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC1583870rJp) it2.next()).tag());
        }
        arrayList.toString();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list2;
        Iterator it3 = copyOnWriteArrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((InterfaceC1583870rJp) it3.next()).tag());
        }
        if (!C324440Cni.LIZ(list, copyOnWriteArrayList)) {
            C343520DdO.LIZ.getClass();
            C343520DdO.LJ(c19eg, enumC1585090rLn);
        }
    }
}
