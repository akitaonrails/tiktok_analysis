package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C1835700xs0;
import X.C1850360yFe;
import X.C1850370yFf;
import X.C1850380yFg;
import X.EnumC1782910wUr;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS2S0001100_27 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f985i0;
    public long j1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S0001100_27 awS2S0001100_27, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1850360yFe.LIZ.getClass();
        c1023640ckE.withParam(C1850360yFe.LIZJ, Long.valueOf(awS2S0001100_27.f985i0));
        c1023640ckE.withParam(C1850360yFe.LIZIZ, Long.valueOf(awS2S0001100_27.j1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S0001100_27 awS2S0001100_27, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1850380yFg.LIZ.getClass();
        c1023640ckE.withParam(C1850380yFg.LIZJ, Long.valueOf(awS2S0001100_27.f985i0));
        c1023640ckE.withParam(C1850380yFg.LIZIZ, Long.valueOf(awS2S0001100_27.j1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS2S0001100_27 awS2S0001100_27, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1850370yFf.LIZ.getClass();
        c1023640ckE.withParam(C1850370yFf.LIZJ, Long.valueOf(awS2S0001100_27.f985i0));
        c1023640ckE.withParam(C1850370yFf.LIZIZ, Long.valueOf(awS2S0001100_27.j1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS2S0001100_27 awS2S0001100_27, Object obj) {
        return C1835700xs0.LIZ((C1835700xs0) obj, Long.valueOf(awS2S0001100_27.j1), awS2S0001100_27.f985i0, EnumC1782910wUr.IDLE, 0L, 0L, 0, 0, 24);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0001100_27(int i, long j, int i2) {
        super(1);
        this.$t = i2;
        this.f985i0 = i;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0001100_27(long j, int i, int i2) {
        super(1);
        this.$t = i2;
        this.j1 = j;
        this.f985i0 = i;
    }
}
