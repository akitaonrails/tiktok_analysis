package kotlin.jvm.internal;

import X.AbstractC1126600fQI;
import X.AnonymousClass0054;
import X.C09AY;
import X.C1126220fPg;
import X.C1126970fQt;
import X.C1128940fU4;
import X.C1136400fg6;
import X.C1136410fg7;
import X.C1136560fgM;
import X.C500260Jjc;
import X.InterfaceC1126580fQG;
import X.InterfaceC1136020ffU;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
public class AwS59S0301000_17 extends C09AY implements Function2 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS59S0301000_17 awS59S0301000_17, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((C1136410fg7) awS59S0301000_17.l0).LJIIJ(awS59S0301000_17.i3, (GiftMessage) awS59S0301000_17.l1, (C1136560fgM) awS59S0301000_17.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS59S0301000_17 awS59S0301000_17, Object obj, Object obj2) {
        int comboCount;
        ((Number) obj).longValue();
        ((Number) obj2).intValue();
        C500260Jjc.LLFFF(((C1126970fQt) awS59S0301000_17.l0).LLLLII);
        C500260Jjc.LJIILLIIL(((C1126970fQt) awS59S0301000_17.l0).LLLJL);
        C1128940fU4 c1128940fU4 = (C1128940fU4) awS59S0301000_17.l1;
        if (c1128940fU4.LJIJJ == awS59S0301000_17.i3 && !c1128940fU4.LJIJJLI) {
            C1126220fPg c1126220fPg = ((C1126970fQt) awS59S0301000_17.l0).LLLJL;
            if (c1126220fPg != null) {
                comboCount = c1126220fPg.getComboCount();
            } else {
                comboCount = 1;
            }
            c1128940fU4.LJIJI = comboCount;
            InterfaceC1126580fQG interfaceC1126580fQG = ((C1126970fQt) awS59S0301000_17.l0).LLJL;
            if (interfaceC1126580fQG != null) {
                interfaceC1126580fQG.LJIIJ((AbstractC1126600fQI) awS59S0301000_17.l2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS59S0301000_17 awS59S0301000_17, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((C1136400fg6) awS59S0301000_17.l0).LJIIL(awS59S0301000_17.i3, (InterfaceC1136020ffU) awS59S0301000_17.l1, (C1136560fgM) awS59S0301000_17.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S0301000_17(int i, C1136400fg6 c1136400fg6, InterfaceC1136020ffU interfaceC1136020ffU, C1136560fgM c1136560fgM, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1136400fg6;
        this.i3 = i;
        this.l1 = interfaceC1136020ffU;
        this.l2 = c1136560fgM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S0301000_17(int i, C1136410fg7 c1136410fg7, GiftMessage giftMessage, C1136560fgM c1136560fgM, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1136410fg7;
        this.i3 = i;
        this.l1 = giftMessage;
        this.l2 = c1136560fgM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS59S0301000_17(C1126970fQt c1126970fQt, C1126970fQt c1126970fQt2, C1128940fU4 c1128940fU4, int i, AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        super(2);
        this.$t = abstractC1126600fQI;
        this.l0 = c1126970fQt;
        this.l1 = c1126970fQt2;
        this.i3 = c1128940fU4;
        this.l2 = i;
    }
}
