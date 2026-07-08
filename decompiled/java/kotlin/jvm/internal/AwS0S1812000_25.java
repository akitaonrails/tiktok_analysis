package kotlin.jvm.internal;

import X.C05P1;
import X.C09AY;
import X.C1679460to0;
import X.C1679570toB;
import X.C341440Da2;
import X.EnumC1679580toC;
import X.InterfaceC1680500tpg;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S1812000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i10;
    public int i11;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public Object l8;
    public String s0;
    public boolean z9;

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

    public static final Object invoke$0(AwS0S1812000_25 awS0S1812000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1679460to0.LJIIIIZZ((C1679570toB) awS0S1812000_25.l1, (C05P1) awS0S1812000_25.l2, (C05P1) awS0S1812000_25.l3, awS0S1812000_25.z9, (C05P1) awS0S1812000_25.l4, (Function1) awS0S1812000_25.l5, (Function1) awS0S1812000_25.l6, (Function1) awS0S1812000_25.l7, awS0S1812000_25.s0, (Function1) awS0S1812000_25.l8, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1812000_25.i10 | 1), awS0S1812000_25.i11);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1812000_25 awS0S1812000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1679460to0.LJIIIIZZ((C1679570toB) awS0S1812000_25.l1, (C05P1) awS0S1812000_25.l2, (C05P1) awS0S1812000_25.l3, awS0S1812000_25.z9, (C05P1) awS0S1812000_25.l4, (Function1) awS0S1812000_25.l5, (Function1) awS0S1812000_25.l6, (Function1) awS0S1812000_25.l7, awS0S1812000_25.s0, (Function1) awS0S1812000_25.l8, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1812000_25.i10 | 1), awS0S1812000_25.i11);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1812000_25(C1679570toB c1679570toB, C1679570toB c1679570toB2, C05P1<Float> c05p1, C05P1<String> c05p12, boolean z, C05P1<Boolean> c05p13, Function1<? super EnumC1679580toC, Unit> function1, Function1<? super EnumC1679580toC, Unit> function12, Function1<? super View, Unit> function13, String str, Function1<? super String, Boolean> function14, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = c1679570toB;
        this.l2 = c1679570toB2;
        this.l3 = c05p1;
        this.z9 = c05p12;
        this.l4 = z;
        this.l5 = c05p13;
        this.l6 = function1;
        this.l7 = function12;
        this.s0 = function13;
        this.l8 = str;
        this.i10 = function14;
        this.i11 = i;
    }
}
