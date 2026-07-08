package kotlin.jvm.internal;

import X.AbstractC1541130qCt;
import X.AbstractC1541140qCu;
import X.C09AY;
import X.C1532720pzK;
import X.C1532960pzi;
import X.C1540850qCR;
import X.C1540870qCT;
import X.C1540890qCV;
import X.C1540900qCW;
import X.C1540930qCZ;
import X.C1541080qCo;
import X.C1541180qCy;
import X.EnumC1518670pcf;
import X.EnumC1541150qCv;
import X.InterfaceC1518910pd3;
import X.InterfaceC1540940qCa;
import X.InterfaceC1541060qCm;
import Y.ARunnableS117S0100000_17;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TTKUserCommunicationServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes24.dex */
public class AwS198S1100000_23 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS198S1100000_23(TTKUserCommunicationServiceImpl tTKUserCommunicationServiceImpl, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = tTKUserCommunicationServiceImpl;
        this.s0 = str;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$0(AwS198S1100000_23 awS198S1100000_23, Object obj, Object obj2) {
        C1540870qCT c1540870qCT;
        C1540900qCW c1540900qCW;
        InterfaceC1540940qCa interfaceC1540940qCa;
        C1540890qCV c1540890qCV;
        C1540900qCW c1540900qCW2;
        InterfaceC1540940qCa interfaceC1540940qCa2;
        C1540930qCZ c1540930qCZ = (C1540930qCZ) obj;
        AbstractC1541140qCu abstractC1541140qCu = (AbstractC1541140qCu) obj2;
        InterfaceC1541060qCm interfaceC1541060qCm = c1540930qCZ.LIZLLL;
        if ((interfaceC1541060qCm instanceof C1540870qCT) && (c1540870qCT = (C1540870qCT) interfaceC1541060qCm) != null && Intrinsics.LJFF(c1540870qCT.LIZ, awS198S1100000_23.s0)) {
            Function2 function2 = (Function2) awS198S1100000_23.l1;
            C1532720pzK c1532720pzK = c1540870qCT.LJIIJJI;
            if (((Boolean) function2.invoke(c1532720pzK, c1532720pzK)).booleanValue()) {
                if (C1540850qCR.LIZJ.LJIIJJI.LIZJ(c1540930qCZ, (AbstractC1541140qCu<V>) abstractC1541140qCu, EnumC1541150qCv.EXPLICIT_RELEASE)) {
                    if (abstractC1541140qCu instanceof C1541080qCo) {
                        AbstractC1541130qCt<? extends AbstractC1541130qCt<?>> abstractC1541130qCt = ((C1541080qCo) abstractC1541140qCu).LJIIIZ;
                        if ((abstractC1541130qCt instanceof C1540890qCV) && (c1540890qCV = (C1540890qCV) abstractC1541130qCt) != null && (c1540900qCW2 = c1540890qCV.LIZLLL) != null && (interfaceC1540940qCa2 = c1540900qCW2.LIZ) != null) {
                            C1532960pzi.LJFF(new ARunnableS117S0100000_17(interfaceC1540940qCa2, 17));
                        }
                    } else if (abstractC1541140qCu instanceof C1541180qCy) {
                        Output output = ((C1541180qCy) abstractC1541140qCu).LJI;
                        if ((output instanceof C1540900qCW) && (c1540900qCW = (C1540900qCW) output) != null && (interfaceC1540940qCa = c1540900qCW.LIZ) != null) {
                            C1532960pzi.LJFF(new ARunnableS117S0100000_17(interfaceC1540940qCa, 18));
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS198S1100000_23 awS198S1100000_23, Object obj, Object obj2) {
        InterfaceC1518910pd3 interfaceC1518910pd3;
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == EnumC1518670pcf.SCENE_COLD_LAUNCH.getValue()) {
            ((TTKUserCommunicationServiceImpl) awS198S1100000_23.l1).LIZIZ();
        }
        TTKUserCommunicationServiceImpl tTKUserCommunicationServiceImpl = (TTKUserCommunicationServiceImpl) awS198S1100000_23.l1;
        if (obj2 instanceof InterfaceC1518910pd3) {
            interfaceC1518910pd3 = (InterfaceC1518910pd3) obj2;
        } else {
            interfaceC1518910pd3 = null;
        }
        tTKUserCommunicationServiceImpl.LJIILL(iIntValue, interfaceC1518910pd3, awS198S1100000_23.s0, true);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS198S1100000_23(String str, String str2, Function2<? super C1532720pzK, ? super C1532720pzK, Boolean> function2) {
        super(2);
        this.$t = function2;
        this.s0 = str;
        this.l1 = str2;
    }
}
