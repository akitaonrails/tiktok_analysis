package kotlin.jvm.internal;

import X.AbstractC1394705d3;
import X.AbstractC20074613ge;
import X.C095E;
import X.C095G;
import X.C09AY;
import X.C0PEM;
import X.C1378605aS;
import X.C1394305cz;
import X.C1394805d4;
import X.C1395105d7;
import X.C1395205d8;
import X.C1462705o1;
import X.C1469405p6;
import X.C1470105pD;
import X.C1DFH;
import X.C20066813fO;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC1502480pCY;
import X.InterfaceC1469505p7;
import X.InterfaceC1631620sYq;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class AwS472S0200000_2 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS472S0200000_2(AbstractC20074613ge abstractC20074613ge, C1395205d8 c1395205d8, int i) {
        super(3);
        this.$t = i;
        this.l0 = abstractC20074613ge;
        this.l1 = c1395205d8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS472S0200000_2(CompletionBlock completionBlock, CompletionBlock<InterfaceC1469505p7> completionBlock2, C1470105pD c1470105pD) {
        super(3);
        this.$t = c1470105pD;
        this.l0 = completionBlock;
        this.l1 = completionBlock2;
    }

    public static final Object invoke$0(AwS472S0200000_2 awS472S0200000_2, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        String str = (String) obj2;
        Map map = (Map) obj3;
        int value = EnumC1502480pCY.SUCCESS.getValue();
        if (num != null && num.intValue() == value) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1469405p6((CompletionBlock) awS472S0200000_2.l0, (C1470105pD) awS472S0200000_2.l1, map, null), 3);
        } else {
            C1DFH c1dfh2 = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1462705o1((CompletionBlock) awS472S0200000_2.l0, str, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS472S0200000_2 awS472S0200000_2, Object obj, Object obj2, Object obj3) {
        C20066813fO c20066813fO = (C20066813fO) obj;
        C20066813fO c20066813fO2 = (C20066813fO) obj2;
        long j = ((C1378605aS) obj3).LIZ;
        if (((AbstractC20074613ge) awS472S0200000_2.l0).LLJJIJI.invoke(c20066813fO).booleanValue()) {
            AbstractC20074613ge abstractC20074613ge = (AbstractC20074613ge) awS472S0200000_2.l0;
            if (!abstractC20074613ge.LLJJJJ) {
                if (abstractC20074613ge.LLJJJ == null) {
                    abstractC20074613ge.LLJJJ = C095G.LIZ(Integer.MAX_VALUE, null, 6);
                }
                AbstractC20074613ge abstractC20074613ge2 = (AbstractC20074613ge) awS472S0200000_2.l0;
                abstractC20074613ge2.LLJJJJ = true;
                C23250099c.LIZLLL(abstractC20074613ge2.LLILLIZIL(), null, null, new C1394305cz(abstractC20074613ge2, null), 3);
            }
            C1395105d7.LIZ((C1395205d8) awS472S0200000_2.l1, c20066813fO);
            long jLJFF = C1378605aS.LJFF(c20066813fO2.LIZJ, j);
            C095E<AbstractC1394705d3> c095e = ((AbstractC20074613ge) awS472S0200000_2.l0).LLJJJ;
            if (c095e != null) {
                c095e.LJIIIIZZ(new C1394805d4(jLJFF));
            }
        }
        return Unit.LIZ;
    }
}
