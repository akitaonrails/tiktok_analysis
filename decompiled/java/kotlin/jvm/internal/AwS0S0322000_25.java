package kotlin.jvm.internal;

import X.C05P1;
import X.C09AY;
import X.C1666810tTb;
import X.C1666830tTd;
import X.C1675330thL;
import X.C1675370thP;
import X.C1678920tn8;
import X.C341440Da2;
import X.InterfaceC1679000tnG;
import X.InterfaceC1680500tpg;
import X.InterfaceC1680710tq1;
import X.InterfaceC1685750ty9;
import X.InterfaceC595010NVj;
import android.util.Size;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0322000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i5;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;
    public boolean z4;

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

    public static final Object invoke$0(AwS0S0322000_25 awS0S0322000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1678920tn8 c1678920tn8 = C1678920tn8.LIZ;
            boolean z = awS0S0322000_25.z3;
            boolean z2 = awS0S0322000_25.z4;
            InterfaceC595010NVj interfaceC595010NVj = (InterfaceC595010NVj) awS0S0322000_25.l0;
            InterfaceC1679000tnG interfaceC1679000tnG = (InterfaceC1679000tnG) awS0S0322000_25.l1;
            InterfaceC1680710tq1 interfaceC1680710tq1 = (InterfaceC1680710tq1) awS0S0322000_25.l2;
            int i = ((awS0S0322000_25.i5 >> 9) & 14) | 12582912;
            int i2 = awS0S0322000_25.i6;
            c1678920tn8.LIZ(z, z2, interfaceC595010NVj, interfaceC1679000tnG, interfaceC1680710tq1, 0.0f, 0.0f, interfaceC1680500tpg, i | ((i2 << 3) & 112) | ((i2 >> 15) & 896) | ((i2 >> 18) & 7168) | ((i2 >> 12) & 57344), 96);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0322000_25 awS0S0322000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((PurePreviewMediaEngine) awS0S0322000_25.l0).LJ((SocMediaResource) awS0S0322000_25.l1, awS0S0322000_25.z3, awS0S0322000_25.i5, awS0S0322000_25.z4, (Size) awS0S0322000_25.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0322000_25.i6 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S0322000_25 awS0S0322000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((PurePreviewMediaEngine) awS0S0322000_25.l0).Bk((SocMediaResource) awS0S0322000_25.l1, awS0S0322000_25.z3, awS0S0322000_25.i5, awS0S0322000_25.z4, (Size) awS0S0322000_25.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0322000_25.i6 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS0S0322000_25 awS0S0322000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666810tTb.LIZLLL((C05P1) awS0S0322000_25.l0, (C1666830tTd) awS0S0322000_25.l1, awS0S0322000_25.z3, (Function1) awS0S0322000_25.l2, awS0S0322000_25.z4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0322000_25.i5 | 1), awS0S0322000_25.i6);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS0S0322000_25 awS0S0322000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) awS0S0322000_25.l0;
        Function0 function0 = (Function0) awS0S0322000_25.l1;
        Function0 function02 = (Function0) awS0S0322000_25.l2;
        boolean z = awS0S0322000_25.z3;
        boolean z2 = awS0S0322000_25.z4;
        C1675330thL.LIZ(C341440Da2.LIZ(awS0S0322000_25.i5 | 1), awS0S0322000_25.i6, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, function0, function02, z, z2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS0S0322000_25 awS0S0322000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1675330thL.LJ((C1675370thP) awS0S0322000_25.l0, awS0S0322000_25.z3, (Function0) awS0S0322000_25.l1, (InterfaceC1685750ty9) awS0S0322000_25.l2, awS0S0322000_25.z4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0322000_25.i5 | 1), awS0S0322000_25.i6);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0322000_25(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, Function0 function02, boolean z, boolean z2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = interfaceC1685750ty9;
        this.l1 = function0;
        this.l2 = function02;
        this.z3 = z;
        this.z4 = z2;
        this.i5 = i;
        this.i6 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0322000_25(C05P1 c05p1, C05P1<Float> c05p12, C1666830tTd c1666830tTd, boolean z, Function1<? super Boolean, Unit> function1, boolean z2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c05p1;
        this.l1 = c05p12;
        this.z3 = c1666830tTd;
        this.l2 = z;
        this.z4 = function1;
        this.i5 = z2 ? 1 : 0;
        this.i6 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0322000_25(C1675370thP c1675370thP, C1675370thP c1675370thP2, boolean z, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1675370thP;
        this.z3 = c1675370thP2;
        this.l1 = z;
        this.l2 = function0;
        this.z4 = interfaceC1685750ty9;
        this.i5 = z2 ? 1 : 0;
        this.i6 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0322000_25(PurePreviewMediaEngine purePreviewMediaEngine, SocMediaResource socMediaResource, boolean z, int i, boolean z2, Size size, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = purePreviewMediaEngine;
        this.l1 = socMediaResource;
        this.z3 = z;
        this.i5 = i;
        this.z4 = z2;
        this.l2 = size;
        this.i6 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0322000_25(boolean z, boolean z2, InterfaceC595010NVj interfaceC595010NVj, InterfaceC1679000tnG interfaceC1679000tnG, InterfaceC1680710tq1 interfaceC1680710tq1, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.z3 = z;
        this.z4 = z2;
        this.l0 = interfaceC595010NVj;
        this.l1 = interfaceC1679000tnG;
        this.l2 = interfaceC1680710tq1;
        this.i5 = i;
        this.i6 = i2;
    }
}
