package kotlin.jvm.internal;

import X.AbstractC1556970qcR;
import X.AbstractC1676640tjS;
import X.AbstractC1676650tjT;
import X.C09AY;
import X.C1668110tVh;
import X.C1668880tWw;
import X.C1674100tfM;
import X.C1676630tjR;
import X.C1685680ty2;
import X.C1685710ty5;
import X.C1685910tyP;
import X.C341440Da2;
import X.InterfaceC1631620sYq;
import X.InterfaceC1671930tbr;
import X.InterfaceC1679150tnV;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S1412000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i6;
    public int i7;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public boolean z5;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S1412000_25 awS0S1412000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1676630tjR.LJI(awS0S1412000_25.z5, (InterfaceC1685750ty9) awS0S1412000_25.l1, (AbstractC1676640tjS) awS0S1412000_25.l2, (AbstractC1676650tjT) awS0S1412000_25.l3, awS0S1412000_25.s0, (InterfaceC1631620sYq) awS0S1412000_25.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1412000_25.i6 | 1), awS0S1412000_25.i7);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1412000_25 awS0S1412000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1685680ty2.LIZIZ(awS0S1412000_25.s0, awS0S1412000_25.z5, (C1685710ty5) awS0S1412000_25.l1, (InterfaceC1685750ty9) awS0S1412000_25.l2, (InterfaceC1631620sYq) awS0S1412000_25.l3, (Function0) awS0S1412000_25.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1412000_25.i6 | 1), awS0S1412000_25.i7);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S1412000_25 awS0S1412000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1674100tfM.LIZ(awS0S1412000_25.s0, (PurchaseOptionWithPrice) awS0S1412000_25.l1, awS0S1412000_25.z5, (Function1) awS0S1412000_25.l2, (Function1) awS0S1412000_25.l3, (InterfaceC1685750ty9) awS0S1412000_25.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1412000_25.i6 | 1), awS0S1412000_25.i7);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS0S1412000_25 awS0S1412000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1668110tVh.LIZ(awS0S1412000_25.s0, awS0S1412000_25.z5, (Function0) awS0S1412000_25.l1, (InterfaceC1685750ty9) awS0S1412000_25.l2, (C1668880tWw) awS0S1412000_25.l3, (InterfaceC1679150tnV) awS0S1412000_25.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1412000_25.i6 | 1), awS0S1412000_25.i7);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1412000_25(String str, String str2, PurchaseOptionWithPrice purchaseOptionWithPrice, boolean z, Function1<? super PurchaseOptionWithPrice, Unit> function1, Function1<? super AbstractC1556970qcR, Unit> function12, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.s0 = str;
        this.l1 = str2;
        this.z5 = purchaseOptionWithPrice;
        this.l2 = z;
        this.l3 = function1;
        this.l4 = function12;
        this.i6 = interfaceC1685750ty9;
        this.i7 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1412000_25(String str, String str2, boolean z, C1685710ty5 c1685710ty5, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1631620sYq<? super C1685910tyP, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$t = i2;
        this.s0 = str;
        this.z5 = str2;
        this.l1 = z;
        this.l2 = c1685710ty5;
        this.l3 = interfaceC1685750ty9;
        this.l4 = interfaceC1631620sYq;
        this.i6 = function0;
        this.i7 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1412000_25(String str, String str2, boolean z, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, C1668880tWw c1668880tWw, InterfaceC1679150tnV interfaceC1679150tnV, int i, int i2) {
        super(2);
        this.$t = i2;
        this.s0 = str;
        this.z5 = str2;
        this.l1 = z;
        this.l2 = function0;
        this.l3 = interfaceC1685750ty9;
        this.l4 = c1668880tWw;
        this.i6 = interfaceC1679150tnV;
        this.i7 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1412000_25(boolean z, boolean z2, InterfaceC1685750ty9 interfaceC1685750ty9, AbstractC1676640tjS abstractC1676640tjS, AbstractC1676650tjT abstractC1676650tjT, String str, InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, int i, int i2) {
        super(2);
        this.$t = i2;
        this.z5 = z;
        this.l1 = z2;
        this.l2 = interfaceC1685750ty9;
        this.l3 = abstractC1676640tjS;
        this.s0 = abstractC1676650tjT;
        this.l4 = str;
        this.i6 = interfaceC1631620sYq;
        this.i7 = i;
    }
}
