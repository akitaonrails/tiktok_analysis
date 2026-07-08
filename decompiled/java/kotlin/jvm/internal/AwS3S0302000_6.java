package kotlin.jvm.internal;

import X.C09AY;
import X.C1675730thz;
import X.C20084413iE;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS3S0302000_6 extends C09AY implements Function2 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S0302000_6 awS3S0302000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((PurePreviewMediaEngine) awS3S0302000_6.l0).LIZLLL((SocMediaResource) awS3S0302000_6.l1, (InterfaceC1685750ty9) awS3S0302000_6.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS3S0302000_6.i3 | 1), awS3S0302000_6.i4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0302000_6 awS3S0302000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1675730thz.LIZJ((InterfaceC1685750ty9) awS3S0302000_6.l0, (Function1) awS3S0302000_6.l1, (Function2) awS3S0302000_6.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS3S0302000_6.i3 | 1), awS3S0302000_6.i4);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS3S0302000_6 awS3S0302000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Function1 function1 = (Function1) awS3S0302000_6.l0;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS3S0302000_6.l1;
        Function1 function12 = (Function1) awS3S0302000_6.l2;
        C20084413iE.LIZ(C341440Da2.LIZ(awS3S0302000_6.i3 | 1), awS3S0302000_6.i4, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, function1, function12);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0302000_6(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, Function1 function1, Function1 function12, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = function1;
        this.l1 = interfaceC1685750ty9;
        this.l2 = function12;
        this.i3 = i;
        this.i4 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS3S0302000_6(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1685750ty9 interfaceC1685750ty92, Function1<? super String, Unit> function1, Function2<? super ImageView, ? super String, Unit> function2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC1685750ty9;
        this.l1 = interfaceC1685750ty92;
        this.l2 = function1;
        this.i3 = function2;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0302000_6(PurePreviewMediaEngine purePreviewMediaEngine, SocMediaResource socMediaResource, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = purePreviewMediaEngine;
        this.l1 = socMediaResource;
        this.l2 = interfaceC1685750ty9;
        this.i3 = i;
        this.i4 = i2;
    }
}
