package kotlin.jvm.internal;

import X.AbstractC1135610fep;
import X.AbstractC1135650fet;
import X.AbstractC1136420fg8;
import X.AbstractC1136440fgA;
import X.C09AY;
import X.C1135280feI;
import X.C1138500fjU;
import X.C2188811AlT;
import X.InterfaceC1136020ffU;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
public class AwS27S0401000_17 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS27S0401000_17 awS27S0401000_17, Object obj, Object obj2) {
        String str = (String) obj2;
        if (((Boolean) obj).booleanValue()) {
            ((AbstractC1136440fgA) awS27S0401000_17.l0).getClass();
        } else {
            AbstractC1136440fgA abstractC1136440fgA = (AbstractC1136440fgA) awS27S0401000_17.l0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadFromGeckoForLynxGift fail, msg:");
            sbLIZ.append(str);
            AbstractC1135610fep.LJI(abstractC1136440fgA, C2188811AlT.LIZIZ(sbLIZ));
        }
        ((AbstractC1136440fgA) awS27S0401000_17.l0).LJIIJ(awS27S0401000_17.i4, (GiftMessage) awS27S0401000_17.l1, (C1135280feI) awS27S0401000_17.l2, (C1138500fjU) awS27S0401000_17.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS27S0401000_17 awS27S0401000_17, Object obj, Object obj2) {
        String str = (String) obj2;
        if (((Boolean) obj).booleanValue()) {
            ((AbstractC1136420fg8) awS27S0401000_17.l0).getClass();
        } else {
            AbstractC1136420fg8 abstractC1136420fg8 = (AbstractC1136420fg8) awS27S0401000_17.l0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadFromGeckoForLynxGift fail, msg:");
            sbLIZ.append(str);
            AbstractC1135650fet.LJII(abstractC1136420fg8, C2188811AlT.LIZIZ(sbLIZ));
        }
        ((AbstractC1136420fg8) awS27S0401000_17.l0).LJIIL(awS27S0401000_17.i4, (InterfaceC1136020ffU) awS27S0401000_17.l1, (C1135280feI) awS27S0401000_17.l2, (C1138500fjU) awS27S0401000_17.l3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0401000_17(AbstractC1136420fg8 abstractC1136420fg8, int i, InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI, C1138500fjU c1138500fjU, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = abstractC1136420fg8;
        this.i4 = i;
        this.l1 = interfaceC1136020ffU;
        this.l2 = c1135280feI;
        this.l3 = c1138500fjU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0401000_17(AbstractC1136440fgA abstractC1136440fgA, int i, GiftMessage giftMessage, C1135280feI c1135280feI, C1138500fjU c1138500fjU, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = abstractC1136440fgA;
        this.i4 = i;
        this.l1 = giftMessage;
        this.l2 = c1135280feI;
        this.l3 = c1138500fjU;
    }
}
