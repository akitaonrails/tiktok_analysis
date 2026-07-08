package wuk;

import X.AbstractC23051091l;
import X.C01GW;
import X.C091J;
import X.C094000Xa;
import X.C11PQ;
import X.C13BV;
import X.C13LP;
import X.C19475711Hn;
import X.C19719612Di;
import X.InterfaceC2176408fq;
import X.InterfaceC23045091f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS88S1200000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements InterfaceC23045091f {
    public final C01GW<C091J> LIZ;
    public final C11PQ<List<AbstractC23051091l>> LIZIZ = new C11PQ<>();
    public final List<AbstractC23051091l> LIZJ = new ArrayList();

    @Override // X.InterfaceC23045091f
    public final C19475711Hn LIZIZ() {
        C11PQ<List<AbstractC23051091l>> c11pq = this.LIZIZ;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    @Override // X.InterfaceC1621240sI6
    public final C094000Xa LIZJ() {
        return new C094000Xa(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(C01GW<? extends C091J> c01gw) {
        this.LIZ = c01gw;
    }

    @Override // X.InterfaceC23045091f
    public final List<AbstractC23051091l> LIZLLL(String str) {
        List<AbstractC23051091l> list = this.LIZJ;
        InterfaceC2176408fq interfaceC2176408fq = this.LIZ.getValue().LIZLLL().get(str);
        if (interfaceC2176408fq != null) {
            interfaceC2176408fq.getFilters();
        }
        return C13LP.LJLIL(C13BV.INSTANCE, list);
    }

    @Override // X.InterfaceC1621240sI6
    public final void LIZ(String str, List<Effect> list) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        List<AbstractC23051091l> list2 = this.LIZJ;
        InterfaceC2176408fq interfaceC2176408fq = this.LIZ.getValue().LIZLLL().get(str);
        if (interfaceC2176408fq != null) {
            interfaceC2176408fq.getFilters();
        }
        C19719612Di.LJJIIJ(list, new AwS88S1200000_3(this, (c) str2, (String) C13LP.LJLIL(C13BV.INSTANCE, list2), (List<? extends AbstractC23051091l>) 4), true);
    }
}
