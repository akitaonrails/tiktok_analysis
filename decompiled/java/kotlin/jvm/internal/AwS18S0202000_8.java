package kotlin.jvm.internal;

import X.C09AY;
import X.C1666410tSx;
import X.C1666710tTR;
import X.C1666900tTk;
import X.C1669170tXP;
import X.C1669180tXQ;
import X.C341440Da2;
import X.C570170MXv;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AwS18S0202000_8 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

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
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS18S0202000_8 awS18S0202000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C570170MXv.LIZ((InterfaceC1685750ty9) awS18S0202000_8.l0, (Function2) awS18S0202000_8.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS18S0202000_8.i2 | 1), awS18S0202000_8.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS18S0202000_8 awS18S0202000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666900tTk.LIZ((InterfaceC1685750ty9) awS18S0202000_8.l0, (Function2) awS18S0202000_8.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS18S0202000_8.i2 | 1), awS18S0202000_8.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS18S0202000_8 awS18S0202000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669180tXQ.LIZ((SocialMediaPickerViewModel) awS18S0202000_8.l0, (InterfaceC1685750ty9) awS18S0202000_8.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS18S0202000_8.i2 | 1), awS18S0202000_8.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS18S0202000_8 awS18S0202000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669170tXP.LIZ((SocialMediaPickerViewModel) awS18S0202000_8.l0, (InterfaceC1685750ty9) awS18S0202000_8.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS18S0202000_8.i2 | 1), awS18S0202000_8.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS18S0202000_8 awS18S0202000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666410tSx.LIZJ((SocialMediaPickerViewModel) awS18S0202000_8.l0, (InterfaceC1685750ty9) awS18S0202000_8.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS18S0202000_8.i2 | 1), awS18S0202000_8.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS18S0202000_8 awS18S0202000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Function0 function0 = (Function0) awS18S0202000_8.l0;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS18S0202000_8.l1;
        C1666710tTR.LJ(C341440Da2.LIZ(awS18S0202000_8.i2 | 1), awS18S0202000_8.i3, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, function0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S0202000_8(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = function0;
        this.l1 = interfaceC1685750ty9;
        this.i2 = i;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S0202000_8(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1685750ty9 interfaceC1685750ty92, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC1685750ty9;
        this.l1 = interfaceC1685750ty92;
        this.i2 = function2;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS18S0202000_8(SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = socialMediaPickerViewModel;
        this.l1 = interfaceC1685750ty9;
        this.i2 = i;
        this.i3 = i2;
    }
}
