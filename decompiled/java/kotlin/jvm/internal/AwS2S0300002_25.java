package kotlin.jvm.internal;

import X.C09AY;
import X.C1669280tXa;
import X.C563580M8m;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS2S0300002_25 extends C09AY implements Function2 {
    public final int $t;
    public float f3;
    public float f4;
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

    public static final Object invoke$0(AwS2S0300002_25 awS2S0300002_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1669280tXa.LIZ(awS2S0300002_25.f3, awS2S0300002_25.f4, (SocialMediaPickerViewModel) awS2S0300002_25.l0, (Function1) awS2S0300002_25.l1, (InterfaceC1685750ty9) awS2S0300002_25.l2, interfaceC1680500tpg, 0, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S0300002_25 awS2S0300002_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1669280tXa.LIZ(awS2S0300002_25.f3, awS2S0300002_25.f4, (SocialMediaPickerViewModel) awS2S0300002_25.l0, (Function1) awS2S0300002_25.l1, (InterfaceC1685750ty9) awS2S0300002_25.l2, interfaceC1680500tpg, 0, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0300002_25(float f, float f2, float f3, SocialMediaPickerViewModel socialMediaPickerViewModel, Function1<? super C563580M8m, Unit> function1, InterfaceC1685750ty9 interfaceC1685750ty9) {
        super(2);
        this.$t = interfaceC1685750ty9;
        this.f3 = f;
        this.f4 = f2;
        this.l0 = f3;
        this.l1 = socialMediaPickerViewModel;
        this.l2 = function1;
    }
}
