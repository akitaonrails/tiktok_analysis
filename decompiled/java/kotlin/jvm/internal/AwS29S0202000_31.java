package kotlin.jvm.internal;

import X.AbstractC1604130rqV;
import X.C09AY;
import X.C15VE;
import X.C15VQ;
import X.C20530015Va;
import X.C20530915Vj;
import X.C20531115Vl;
import X.C20600815jK;
import X.C2188811AlT;
import X.InterfaceC636270OxV;
import X.InterfaceC636340Oxc;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS29S0202000_31 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS29S0202000_31 awS29S0202000_31, Object obj) {
        InterfaceC636340Oxc interfaceC636340Oxc = (InterfaceC636340Oxc) obj;
        AssemListViewModel assemListViewModel = (AssemListViewModel) awS29S0202000_31.l0;
        C20600815jK<ITEM> c20600815jK = assemListViewModel.state;
        if (c20600815jK != 0) {
            C20600815jK.LJIILLIIL(c20600815jK, awS29S0202000_31.i2, awS29S0202000_31.i3, (Collection) awS29S0202000_31.l1);
            assemListViewModel.modifyListState(interfaceC636340Oxc, c20600815jK);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS29S0202000_31 awS29S0202000_31, Object obj) {
        ((AssemSingleListViewModel) awS29S0202000_31.l0).modifyListState((InterfaceC636270OxV) obj, new AwS25S0102000_3(awS29S0202000_31.i2, awS29S0202000_31.i3, (int) awS29S0202000_31.l1, (Collection<Object>) 2));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS29S0202000_31 awS29S0202000_31, Object obj) {
        C20530915Vj next;
        C20530015Va c20530015Va = null;
        if (((Boolean) obj).booleanValue()) {
            C20531115Vl c20531115Vl = ((C15VE) awS29S0202000_31.l0).LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load success aid = ");
            sbLIZ.append(((C20530015Va) awS29S0202000_31.l1).LIZ);
            sbLIZ.append(", position = ");
            sbLIZ.append(awS29S0202000_31.i2 + awS29S0202000_31.i3);
            sbLIZ.append(", cover = ");
            sbLIZ.append(((C20530015Va) awS29S0202000_31.l1).LIZIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            boolean z = AbstractC1604130rqV.LIZLLL;
            c20531115Vl.LIZ(strLIZIZ, null);
            C20530015Va c20530015Va2 = (C20530015Va) awS29S0202000_31.l1;
            c20530015Va2.LIZLLL = C15VQ.LOADED;
            C15VE c15ve = (C15VE) awS29S0202000_31.l0;
            synchronized (c15ve.LJIIIIZZ) {
                try {
                    Iterator<C20530915Vj> it2 = c15ve.LJII.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.LIZ, c20530015Va2.LIZIZ)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C20530915Vj c20530915Vj = next;
                    if (c20530915Vj != null) {
                        c15ve.LJII.remove(c20530915Vj);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            ((C20530015Va) awS29S0202000_31.l1).LIZLLL = C15VQ.FAIL;
        }
        if (((C15VE) awS29S0202000_31.l0).LJIIIZ == 0) {
            C15VE c15ve2 = (C15VE) awS29S0202000_31.l0;
            synchronized (c15ve2.LJIIIIZZ) {
                try {
                    int iMin = Math.min(C15VE.LIZJ(), c15ve2.LJI.size());
                    Iterator<C20530015Va> it3 = c15ve2.LJI.subList(0, iMin).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        C20530015Va next2 = it3.next();
                        if (next2.LIZLLL == C15VQ.START) {
                            c20530015Va = next2;
                            break;
                        }
                    }
                    if (c20530015Va == null) {
                        c15ve2.LJ(iMin - 1);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0202000_31(C15VE c15ve, C20530015Va c20530015Va, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = c15ve;
        this.l1 = c20530015Va;
        this.i2 = i;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS29S0202000_31(AssemListViewModel assemListViewModel, AssemListViewModel<S, ITEM, Cursor> assemListViewModel2, int i, int i2, Collection<? extends ITEM> collection) {
        super(1);
        this.$t = collection;
        this.l0 = assemListViewModel;
        this.i2 = assemListViewModel2;
        this.i3 = i;
        this.l1 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS29S0202000_31(AssemSingleListViewModel assemSingleListViewModel, AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel2, int i, int i2, Collection<? extends ITEM> collection) {
        super(1);
        this.$t = collection;
        this.l0 = assemSingleListViewModel;
        this.i2 = assemSingleListViewModel2;
        this.i3 = i;
        this.l1 = i2;
    }
}
