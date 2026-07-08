package kotlin.jvm.internal;

import X.C09AY;
import X.C0MAE;
import X.C19719212De;
import X.C20600815jK;
import X.C615070OAn;
import X.C615190OAz;
import X.InterfaceC1680500tpg;
import X.InterfaceC636240OxS;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class AwS31S0310000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS31S0310000_9 awS31S0310000_9, Object obj) {
        C0MAE c0mae = (C0MAE) obj;
        ((Function2) awS31S0310000_9.l0).invoke(c0mae, (InterfaceC636240OxS) awS31S0310000_9.l1);
        if (awS31S0310000_9.z3) {
            c0mae.LIZIZ("paging_loading", "paging_loading", new C19719212De(872112359, new AwS653S0100000_4((Function2) awS31S0310000_9.l2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) 0), true));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS31S0310000_9 awS31S0310000_9, Object obj) {
        int iLJIIIZ;
        C20600815jK<ITEM> c20600815jK = ((AddYoursCollectionListVM) awS31S0310000_9.l0).state;
        if (c20600815jK != 0 && (iLJIIIZ = c20600815jK.LJIIIZ((C615070OAn) awS31S0310000_9.l1)) >= 0) {
            AddYoursCollectionListVM addYoursCollectionListVM = (AddYoursCollectionListVM) awS31S0310000_9.l0;
            C615070OAn c615070OAn = (C615070OAn) awS31S0310000_9.l1;
            addYoursCollectionListVM.listSetItemAt(iLJIIIZ, new C615070OAn(c615070OAn.LL, c615070OAn.LLILLJJLI, c615070OAn.LLILLL, c615070OAn.LLILZ, c615070OAn.LLILZIL, c615070OAn.LLILZLL, c615070OAn.LLIZ, awS31S0310000_9.z3, (C615190OAz) awS31S0310000_9.l2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S0310000_9(AddYoursCollectionListVM addYoursCollectionListVM, C615070OAn c615070OAn, boolean z, C615190OAz c615190OAz, int i) {
        super(1);
        this.$t = i;
        this.l0 = addYoursCollectionListVM;
        this.l1 = c615070OAn;
        this.z3 = z;
        this.l2 = c615190OAz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS31S0310000_9(Function2 function2, Function2<? super C0MAE, ? super InterfaceC636240OxS<T>, Unit> function22, InterfaceC636240OxS<T> interfaceC636240OxS, boolean z, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23) {
        super(1);
        this.$t = function23;
        this.l0 = function2;
        this.l1 = function22;
        this.z3 = interfaceC636240OxS;
        this.l2 = z;
    }
}
