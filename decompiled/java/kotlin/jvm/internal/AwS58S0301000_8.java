package kotlin.jvm.internal;

import X.C09AY;
import X.C0MA2;
import X.C0MBC;
import X.C1666410tSx;
import X.C341440Da2;
import X.InterfaceC1673420teG;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AwS58S0301000_8 extends C09AY implements Function2 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS58S0301000_8 awS58S0301000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C0MA2.LIZ((InterfaceC1685750ty9) awS58S0301000_8.l0, (SocialMediaPickerViewModel) awS58S0301000_8.l1, (InterfaceC1673420teG) awS58S0301000_8.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS58S0301000_8.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS58S0301000_8 awS58S0301000_8, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666410tSx.LIZ((C0MBC) awS58S0301000_8.l0, (InterfaceC1685750ty9) awS58S0301000_8.l1, (Function1) awS58S0301000_8.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS58S0301000_8.i3 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS58S0301000_8(C0MBC c0mbc, C0MBC c0mbc2, InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super String, Unit> function1, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0mbc;
        this.l1 = c0mbc2;
        this.l2 = interfaceC1685750ty9;
        this.i3 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS58S0301000_8(InterfaceC1685750ty9 interfaceC1685750ty9, SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1673420teG interfaceC1673420teG, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC1685750ty9;
        this.l1 = socialMediaPickerViewModel;
        this.l2 = interfaceC1673420teG;
        this.i3 = i;
    }
}
