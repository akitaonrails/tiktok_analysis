package kotlin.jvm.internal;

import X.C09AY;
import X.C1682390tsj;
import X.C2097608Jq;
import X.InterfaceC1631620sYq;
import X.InterfaceC1690470u5l;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS3S0102100_25 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public int i1;
    public int i2;
    public long j3;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S0102100_25 awS3S0102100_25, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        return ((InterfaceC1690470u5l) awS3S0102100_25.l0).LJLJJL(C1682390tsj.LJI(iIntValue + awS3S0102100_25.i1, awS3S0102100_25.j3), C1682390tsj.LJFF(iIntValue2 + awS3S0102100_25.i2, awS3S0102100_25.j3), C2097608Jq.LJ(), (Function1) obj3);
    }

    public static final Object invoke$1(AwS3S0102100_25 awS3S0102100_25, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        return ((InterfaceC1690470u5l) awS3S0102100_25.l0).LJLJJL(C1682390tsj.LJI(iIntValue + awS3S0102100_25.i1, awS3S0102100_25.j3), C1682390tsj.LJFF(iIntValue2 + awS3S0102100_25.i2, awS3S0102100_25.j3), C2097608Jq.LJ(), (Function1) obj3);
    }

    public static final Object invoke$2(AwS3S0102100_25 awS3S0102100_25, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        return ((InterfaceC1690470u5l) awS3S0102100_25.l0).LJLJJL(C1682390tsj.LJI(iIntValue + awS3S0102100_25.i1, awS3S0102100_25.j3), C1682390tsj.LJFF(iIntValue2 + awS3S0102100_25.i2, awS3S0102100_25.j3), C2097608Jq.LJ(), (Function1) obj3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0102100_25(InterfaceC1690470u5l interfaceC1690470u5l, long j, int i, int i2, int i3) {
        super(3);
        this.$t = i3;
        this.l0 = interfaceC1690470u5l;
        this.j3 = j;
        this.i1 = i;
        this.i2 = i2;
    }
}
