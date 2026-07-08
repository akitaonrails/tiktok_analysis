package kotlin.jvm.internal;

import X.C09AY;
import X.C1687820u1U;
import X.C1688920u3G;
import X.C1688930u3H;
import X.C1689150u3d;
import X.C1689590u4L;
import X.C2013107ub;
import X.C2015407uy;
import X.C2018407vS;
import X.C2025707wd;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS1S0121000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i3;
    public Object l0;
    public boolean z1;
    public boolean z2;

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

    public static final Object invoke$0(AwS1S0121000_25 awS1S0121000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1689590u4L.LIZ((C2025707wd) awS1S0121000_25.l0, awS1S0121000_25.z1, awS1S0121000_25.z2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS1S0121000_25.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0121000_25 awS1S0121000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1688930u3H.LIZ((C2015407uy) awS1S0121000_25.l0, awS1S0121000_25.z1, awS1S0121000_25.z2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS1S0121000_25.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS1S0121000_25 awS1S0121000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1688920u3G.LIZ((C2018407vS) awS1S0121000_25.l0, awS1S0121000_25.z1, awS1S0121000_25.z2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS1S0121000_25.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS1S0121000_25 awS1S0121000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1689150u3d.LIZ((C2013107ub) awS1S0121000_25.l0, awS1S0121000_25.z1, awS1S0121000_25.z2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS1S0121000_25.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS1S0121000_25 awS1S0121000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1687820u1U.LJI(awS1S0121000_25.z1, awS1S0121000_25.z2, (View.OnClickListener) awS1S0121000_25.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS1S0121000_25.i3 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0121000_25(C2013107ub c2013107ub, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c2013107ub;
        this.z1 = z;
        this.z2 = z2;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0121000_25(C2015407uy c2015407uy, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c2015407uy;
        this.z1 = z;
        this.z2 = z2;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0121000_25(C2018407vS c2018407vS, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c2018407vS;
        this.z1 = z;
        this.z2 = z2;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0121000_25(C2025707wd c2025707wd, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c2025707wd;
        this.z1 = z;
        this.z2 = z2;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0121000_25(boolean z, boolean z2, View.OnClickListener onClickListener, int i, int i2) {
        super(2);
        this.$t = i2;
        this.z1 = z;
        this.z2 = z2;
        this.l0 = onClickListener;
        this.i3 = i;
    }
}
