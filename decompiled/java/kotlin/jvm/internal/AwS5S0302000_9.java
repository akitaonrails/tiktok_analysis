package kotlin.jvm.internal;

import X.C09AY;
import X.C1666190tSb;
import X.C1667330tUR;
import X.C341440Da2;
import X.C634270OuH;
import X.C634290OuJ;
import X.C634850OvD;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC665370Q7z;
import X.InterfaceC898260ZLs;
import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.aweme.profilerec.vm.ProfileRecViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class AwS5S0302000_9 extends C09AY implements Function2 {
    public final int $t;
    public int i3;
    public int i4;
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
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S0302000_9 awS5S0302000_9, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667330tUR.LJ((InterfaceC898260ZLs) awS5S0302000_9.l0, (Function2) awS5S0302000_9.l1, (ProfileRecViewModel) awS5S0302000_9.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS5S0302000_9.i3 | 1), awS5S0302000_9.i4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S0302000_9 awS5S0302000_9, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C634850OvD.LIZ((ComposeView) awS5S0302000_9.l0, (InterfaceC665370Q7z) awS5S0302000_9.l1, (Function2) awS5S0302000_9.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS5S0302000_9.i3 | 1), awS5S0302000_9.i4);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS5S0302000_9 awS5S0302000_9, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666190tSb.LJ((Function2) awS5S0302000_9.l0, (InterfaceC1685750ty9) awS5S0302000_9.l1, (Function2) awS5S0302000_9.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS5S0302000_9.i3 | 1), awS5S0302000_9.i4);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS5S0302000_9 awS5S0302000_9, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Function0 function0 = (Function0) awS5S0302000_9.l0;
        Function0 function02 = (Function0) awS5S0302000_9.l1;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS5S0302000_9.l2;
        C634270OuH.LIZ(C341440Da2.LIZ(awS5S0302000_9.i3 | 1), awS5S0302000_9.i4, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, function0, function02);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS5S0302000_9 awS5S0302000_9, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Function0 function0 = (Function0) awS5S0302000_9.l0;
        Function0 function02 = (Function0) awS5S0302000_9.l1;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS5S0302000_9.l2;
        C634290OuJ.LIZ(C341440Da2.LIZ(awS5S0302000_9.i3 | 1), awS5S0302000_9.i4, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, function0, function02);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0302000_9(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, Function0 function02, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = function0;
        this.l1 = function02;
        this.l2 = interfaceC1685750ty9;
        this.i3 = i;
        this.i4 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS5S0302000_9(InterfaceC898260ZLs interfaceC898260ZLs, InterfaceC898260ZLs interfaceC898260ZLs2, Function2<? super Boolean, ? super Boolean, Unit> function2, ProfileRecViewModel profileRecViewModel, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC898260ZLs;
        this.l1 = interfaceC898260ZLs2;
        this.l2 = function2;
        this.i3 = profileRecViewModel;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS5S0302000_9(ComposeView composeView, ComposeView composeView2, InterfaceC665370Q7z interfaceC665370Q7z, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = composeView;
        this.l1 = composeView2;
        this.l2 = interfaceC665370Q7z;
        this.i3 = function2;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS5S0302000_9(Function2 function2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = function2;
        this.l1 = function22;
        this.l2 = interfaceC1685750ty9;
        this.i3 = function23;
        this.i4 = i;
    }
}
