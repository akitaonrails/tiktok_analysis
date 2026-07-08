package kotlin.jvm.internal;

import X.C01TT;
import X.C09AY;
import X.C118300cf;
import X.C1448240nn4;
import X.C1450180nqC;
import X.C1450330nqR;
import X.C1457050o1H;
import X.C1457060o1I;
import X.C1463670oBx;
import X.C1464870oDt;
import X.C348100Dkm;
import X.EnumC356070Dxd;
import X.InterfaceC1450310nqP;
import X.InterfaceC1452170ntP;
import X.InterfaceC1624480sNK;
import X.InterfaceC1627350sRx;
import X.InterfaceC1629300sV6;
import X.InterfaceC364330EQd;
import X.InterfaceC366450EYh;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ui.component.u;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lnn.q;

/* JADX INFO: loaded from: classes23.dex */
public class AwS150S0400000_22 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS150S0400000_22 awS150S0400000_22) {
        C1457060o1I.LIZ.getClass();
        return C1457060o1I.LIZJ.LJI(((C1457050o1H) awS150S0400000_22.l0).LIZ, (InterfaceC1452170ntP) awS150S0400000_22.l1, (LifecycleOwner) awS150S0400000_22.l2, ((C118300cf) awS150S0400000_22.l3).element, 3);
    }

    public static final Object invoke$1(AwS150S0400000_22 awS150S0400000_22) {
        int i;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1627350sRx stickerRepository;
        InterfaceC1629300sV6 interfaceC1629300sV6LJI;
        C1448240nn4 c1448240nn4 = (C1448240nn4) awS150S0400000_22.l0;
        q qVar = (q) awS150S0400000_22.l1;
        if (qVar != null && (interfaceC1624480sNKC0 = qVar.C0()) != null && (stickerRepository = interfaceC1624480sNKC0.getStickerRepository()) != null && (interfaceC1629300sV6LJI = stickerRepository.LJI()) != null && interfaceC1629300sV6LJI.LIZ((Effect) awS150S0400000_22.l2)) {
            i = 1;
        } else {
            i = 0;
        }
        c1448240nn4.LIZJ = i;
        C1448240nn4 c1448240nn42 = ((u) awS150S0400000_22.l3).LLJJI.get(((Effect) awS150S0400000_22.l2).getEffect_id());
        if (c1448240nn42 != null && !c1448240nn42.LJFF.get() && ((C1448240nn4) awS150S0400000_22.l0).LIZJ == 1) {
            c1448240nn42.LJI.set(true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS150S0400000_22 awS150S0400000_22) {
        List list = (List) awS150S0400000_22.l0;
        InterfaceC364330EQd interfaceC364330EQd = (InterfaceC364330EQd) awS150S0400000_22.l2;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            interfaceC364330EQd.B1((String) it2.next(), EnumC356070Dxd.DONE);
        }
        InterfaceC366450EYh interfaceC366450EYhW2 = ((C1464870oDt) awS150S0400000_22.l1).w2();
        if (interfaceC366450EYhW2 != null) {
            interfaceC366450EYhW2.LC1(false);
        }
        C01TT.LIZJ(new AwS566S0100000_22((Function0) awS150S0400000_22.l3, (Function0<Boolean>) 735));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS150S0400000_22 awS150S0400000_22) {
        ((C1463670oBx) ((InterfaceC1452170ntP) awS150S0400000_22.l0)).setLoopPlay(false);
        InterfaceC1450310nqP interfaceC1450310nqP = (InterfaceC1450310nqP) awS150S0400000_22.l1;
        if (interfaceC1450310nqP != null) {
            C348100Dkm c348100DkmLIZLLL = ((C1463670oBx) ((InterfaceC1452170ntP) awS150S0400000_22.l0)).LIZLLL();
            ((C1450330nqR) awS150S0400000_22.l2).getClass();
            interfaceC1450310nqP.LIZ(c348100DkmLIZLLL, "live_model");
        }
        ((C1463670oBx) ((InterfaceC1452170ntP) awS150S0400000_22.l0)).LIZLLL().LIZIZ.getPlayerApi().play();
        ((C1450330nqR) awS150S0400000_22.l2).LJIIIIZZ((C1450180nqC) awS150S0400000_22.l3, false);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0400000_22(C1448240nn4 c1448240nn4, q qVar, Effect effect, u uVar, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1448240nn4;
        this.l1 = qVar;
        this.l2 = effect;
        this.l3 = uVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0400000_22(InterfaceC1452170ntP interfaceC1452170ntP, InterfaceC1450310nqP interfaceC1450310nqP, C1450330nqR c1450330nqR, C1450180nqC c1450180nqC, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1452170ntP;
        this.l1 = interfaceC1450310nqP;
        this.l2 = c1450330nqR;
        this.l3 = c1450180nqC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS150S0400000_22(List list, List<String> list2, C1464870oDt c1464870oDt, InterfaceC364330EQd interfaceC364330EQd, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c1464870oDt;
        this.l3 = interfaceC364330EQd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS150S0400000_22(C1457050o1H c1457050o1H, InterfaceC1452170ntP interfaceC1452170ntP, Context context, LifecycleOwner lifecycleOwner, C118300cf c118300cf, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1457050o1H;
        this.l1 = interfaceC1452170ntP;
        this.l2 = lifecycleOwner;
        this.l3 = c118300cf;
    }
}
