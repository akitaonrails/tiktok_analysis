package kotlin.jvm.internal;

import X.C05P1;
import X.C09AY;
import X.C1669700tYG;
import X.C1670830ta5;
import X.C1676910tjt;
import X.C1679460to0;
import X.C341440Da2;
import X.DialogC1389620mGW;
import X.InterfaceC1631620sYq;
import X.InterfaceC1675680thu;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import com.ss.android.ugc.aweme.account.passwordless.leaked.NoPasskeyPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S1402000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i5;
    public int i6;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    public static final Object invoke$0(AwS0S1402000_25 awS0S1402000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669700tYG.LIZIZ((DialogC1389620mGW) awS0S1402000_25.l1, awS0S1402000_25.s0, (Function0) awS0S1402000_25.l2, (Function0) awS0S1402000_25.l3, (NoPasskeyPageViewModel) awS0S1402000_25.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1402000_25.i5 | 1), awS0S1402000_25.i6);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1402000_25 awS0S1402000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1679460to0.LJIIIZ((C05P1) awS0S1402000_25.l1, (C05P1) awS0S1402000_25.l2, awS0S1402000_25.s0, (C1676910tjt) awS0S1402000_25.l3, (InterfaceC1685750ty9) awS0S1402000_25.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1402000_25.i5 | 1), awS0S1402000_25.i6);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S1402000_25 awS0S1402000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1670830ta5.LIZIZ(awS0S1402000_25.l1, (InterfaceC1685750ty9) awS0S1402000_25.l2, (InterfaceC1675680thu) awS0S1402000_25.l3, awS0S1402000_25.s0, (InterfaceC1631620sYq) awS0S1402000_25.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1402000_25.i5 | 1), awS0S1402000_25.i6);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1402000_25(C05P1 c05p1, C05P1<String> c05p12, C05P1<Boolean> c05p13, String str, C1676910tjt<Boolean> c1676910tjt, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = c05p1;
        this.l2 = c05p12;
        this.s0 = c05p13;
        this.l3 = str;
        this.l4 = c1676910tjt;
        this.i5 = interfaceC1685750ty9;
        this.i6 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1402000_25(DialogC1389620mGW dialogC1389620mGW, DialogC1389620mGW dialogC1389620mGW2, String str, Function0<Unit> function0, Function0<Unit> function02, NoPasskeyPageViewModel noPasskeyPageViewModel, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = dialogC1389620mGW;
        this.s0 = dialogC1389620mGW2;
        this.l2 = str;
        this.l3 = function0;
        this.l4 = function02;
        this.i5 = noPasskeyPageViewModel;
        this.i6 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1402000_25(Object obj, T t, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1675680thu<Float> interfaceC1675680thu, String str, InterfaceC1631620sYq<? super T, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = obj;
        this.l2 = t;
        this.l3 = interfaceC1685750ty9;
        this.s0 = interfaceC1675680thu;
        this.l4 = str;
        this.i5 = interfaceC1631620sYq;
        this.i6 = i;
    }
}
