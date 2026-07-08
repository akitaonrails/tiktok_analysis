package kotlin.jvm.internal;

import X.C09AY;
import X.C1665450tRP;
import X.C1666500tT6;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AwS4S0302000_8 extends C09AY implements Function2 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS4S0302000_8 awS4S0302000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS4S0302000_8.l0;
        Function0 function0 = (Function0) awS4S0302000_8.l1;
        Function0 function02 = (Function0) awS4S0302000_8.l2;
        C1665450tRP.LIZ(C341440Da2.LIZ(awS4S0302000_8.i3 | 1), awS4S0302000_8.i4, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, function0, function02);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S0302000_8 awS4S0302000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666500tT6.LIZ((SocialMediaPickerViewModel) awS4S0302000_8.l0, (Function0) awS4S0302000_8.l1, (InterfaceC1685750ty9) awS4S0302000_8.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS4S0302000_8.i3 | 1), awS4S0302000_8.i4);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0302000_8(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, Function0 function02, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = interfaceC1685750ty9;
        this.l1 = function0;
        this.l2 = function02;
        this.i3 = i;
        this.i4 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0302000_8(SocialMediaPickerViewModel socialMediaPickerViewModel, SocialMediaPickerViewModel socialMediaPickerViewModel2, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = socialMediaPickerViewModel;
        this.l1 = socialMediaPickerViewModel2;
        this.l2 = function0;
        this.i3 = interfaceC1685750ty9;
        this.i4 = i;
    }
}
