package kotlin.jvm.internal;

import X.C05ZL;
import X.C09AY;
import X.C1377105aD;
import X.C1382705b7;
import X.C13DA;
import X.C13FE;
import X.C1671570tbH;
import X.C1682900ttY;
import X.EnumC1382405b4;
import X.InterfaceC1381705ax;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS8S0200001_2 extends C09AY implements Function1 {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS8S0200001_2 awS8S0200001_2, Object obj) {
        long j = ((C1682900ttY) obj).LIZ;
        float f = awS8S0200001_2.f2;
        C1382705b7 c1382705b7 = (C1382705b7) awS8S0200001_2.l0;
        C13DA c13da = new C13DA();
        c13da.put(EnumC1382405b4.Hidden, Float.valueOf(f));
        float f2 = f / 2.0f;
        if (!c1382705b7.LIZIZ && C1682900ttY.LIZJ(j) > f2) {
            c13da.put(EnumC1382405b4.HalfExpanded, Float.valueOf(f2));
        }
        if (C1682900ttY.LIZJ(j) != 0) {
            c13da.put(EnumC1382405b4.Expanded, Float.valueOf(Math.max(0.0f, f - C1682900ttY.LIZJ(j))));
        }
        ((C1382705b7) awS8S0200001_2.l0).LIZJ.LJIIIIZZ(c13da.build(), (InterfaceC1381705ax) awS8S0200001_2.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS8S0200001_2 awS8S0200001_2, Object obj) {
        long j = ((C1682900ttY) obj).LIZ;
        ((C13FE) ((C1377105aD) awS8S0200001_2.l0).LIZLLL).setValue(new C1682900ttY(j));
        C1377105aD c1377105aD = (C1377105aD) awS8S0200001_2.l0;
        float f = (int) (j >> 32);
        float f2 = (int) (j & 4294967295L);
        float fMax = Math.max(0.0f, Math.min(f, f2) - (awS8S0200001_2.f2 * 2.0f));
        ((C13FE) c1377105aD.LJ).setValue(C1671570tbH.LIZJ((((long) Float.floatToRawIntBits((f2 - fMax) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits((f - fMax) / 2.0f) << 32), (((long) Float.floatToRawIntBits(fMax)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32)));
        ((C05ZL) awS8S0200001_2.l1).LJIILJJIL(Math.min(f / ((C1377105aD) awS8S0200001_2.l0).LIZ.getWidth(), f2 / ((C1377105aD) awS8S0200001_2.l0).LIZ.getHeight()));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0200001_2(C1377105aD c1377105aD, float f, C05ZL c05zl, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1377105aD;
        this.f2 = f;
        this.l1 = c05zl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS8S0200001_2(C1382705b7 c1382705b7, C1382705b7 c1382705b72, InterfaceC1381705ax<EnumC1382405b4> interfaceC1381705ax, float f) {
        super(1);
        this.$t = f;
        this.l0 = c1382705b7;
        this.l1 = c1382705b72;
        this.f2 = interfaceC1381705ax;
    }
}
