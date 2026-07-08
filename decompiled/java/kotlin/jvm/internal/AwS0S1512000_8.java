package kotlin.jvm.internal;

import X.C09AY;
import X.C1668720tWg;
import X.C1671080taU;
import X.C341440Da2;
import X.C569940MWy;
import X.EnumC1668730tWh;
import X.InterfaceC1665500tRU;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AwS0S1512000_8 extends C09AY implements Function2 {
    public final int $t;
    public int i7;
    public int i8;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public boolean z6;

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

    public static final Object invoke$0(AwS0S1512000_8 awS0S1512000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1668720tWg.LIZ((Function0) awS0S1512000_8.l1, (Function0) awS0S1512000_8.l2, (Function0) awS0S1512000_8.l3, (EnumC1668730tWh) awS0S1512000_8.l4, awS0S1512000_8.i7, awS0S1512000_8.s0, awS0S1512000_8.z6, (ViewGroup) awS0S1512000_8.l5, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1512000_8.i8 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1512000_8 awS0S1512000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1671080taU.LJFF((InterfaceC1665500tRU) awS0S1512000_8.l1, (Function1) awS0S1512000_8.l2, awS0S1512000_8.s0, (Function0) awS0S1512000_8.l3, (InterfaceC1685750ty9) awS0S1512000_8.l4, awS0S1512000_8.z6, (Function1) awS0S1512000_8.l5, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1512000_8.i7 | 1), awS0S1512000_8.i8);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1512000_8(InterfaceC1665500tRU interfaceC1665500tRU, InterfaceC1665500tRU<C569940MWy> interfaceC1665500tRU2, Function1<? super Integer, Unit> function1, String str, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, Function1<? super Integer, Unit> function12, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = interfaceC1665500tRU;
        this.l2 = interfaceC1665500tRU2;
        this.s0 = function1;
        this.l3 = str;
        this.l4 = function0;
        this.z6 = interfaceC1685750ty9;
        this.l5 = z;
        this.i7 = function12;
        this.i8 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1512000_8(Function0 function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, EnumC1668730tWh enumC1668730tWh, int i, String str, boolean z, ViewGroup viewGroup, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = function0;
        this.l2 = function02;
        this.l3 = function03;
        this.l4 = function04;
        this.i7 = enumC1668730tWh;
        this.s0 = i;
        this.z6 = str;
        this.l5 = z;
        this.i8 = viewGroup;
    }
}
