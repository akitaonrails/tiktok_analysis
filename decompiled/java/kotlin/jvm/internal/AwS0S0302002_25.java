package kotlin.jvm.internal;

import X.C05UN;
import X.C09AY;
import X.C1669280tXa;
import X.C1679750toT;
import X.C341440Da2;
import X.C563580M8m;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0302002_25 extends C09AY implements Function2 {
    public final int $t;
    public float f5;
    public float f6;
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

    public static final Object invoke$0(AwS0S0302002_25 awS0S0302002_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1679750toT.LIZLLL((C05UN) awS0S0302002_25.l0, awS0S0302002_25.f5, awS0S0302002_25.f6, (InterfaceC1685750ty9) awS0S0302002_25.l1, (Function0) awS0S0302002_25.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0302002_25.i3 | 1), awS0S0302002_25.i4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0302002_25 awS0S0302002_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669280tXa.LIZ(awS0S0302002_25.f5, awS0S0302002_25.f6, (SocialMediaPickerViewModel) awS0S0302002_25.l0, (Function1) awS0S0302002_25.l1, (InterfaceC1685750ty9) awS0S0302002_25.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0302002_25.i3 | 1), awS0S0302002_25.i4);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0302002_25(float f, float f2, float f3, SocialMediaPickerViewModel socialMediaPickerViewModel, Function1<? super C563580M8m, Unit> function1, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.f5 = f;
        this.f6 = f2;
        this.l0 = f3;
        this.l1 = socialMediaPickerViewModel;
        this.l2 = function1;
        this.i3 = interfaceC1685750ty9;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0302002_25(C05UN c05un, C05UN c05un2, float f, float f2, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c05un;
        this.f5 = c05un2;
        this.f6 = f;
        this.l1 = f2;
        this.l2 = interfaceC1685750ty9;
        this.i3 = function0;
        this.i4 = i;
    }
}
