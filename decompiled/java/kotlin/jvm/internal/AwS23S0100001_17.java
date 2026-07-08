package kotlin.jvm.internal;

import X.C09AY;
import X.C0GY9;
import X.C1126230fPh;
import X.C1126380fPw;
import X.C1126390fPx;
import X.C1126400fPy;
import X.C1146270fw1;
import X.C1697810uHb;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS23S0100001_17 extends C09AY implements Function1 {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS23S0100001_17 awS23S0100001_17, Object obj) {
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        C1126230fPh c1126230fPh = (C1126230fPh) awS23S0100001_17.l0;
        c1126390fPx.LIZJ = C1697810uHb.LJIIJJI(c1126230fPh.LJIIJJI, c1126230fPh.LJIIL);
        C1126390fPx.LJ(c1126390fPx, awS23S0100001_17.f1, ((C1126230fPh) awS23S0100001_17.l0).LIZJ);
        c1126390fPx.LIZLLL = 100L;
        c1126390fPx.LJ = C1126400fPy.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS23S0100001_17 awS23S0100001_17, Object obj) {
        ((C1126380fPw) obj).LIZ(new AwS23S0100001_17((C1126230fPh) awS23S0100001_17.l0, awS23S0100001_17.f1, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS23S0100001_17 awS23S0100001_17, Object obj) {
        float f;
        float f2;
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        C1146270fw1 c1146270fw1 = (C1146270fw1) awS23S0100001_17.l0;
        if (c1146270fw1.LLJJ) {
            f = 1.0f;
            f2 = awS23S0100001_17.f1;
        } else {
            f = awS23S0100001_17.f1;
            f2 = 1.0f;
        }
        c1126390fPx.LIZJ = C1697810uHb.LJIIJJI(c1146270fw1.LLILZIL, c1146270fw1.LLILZLL);
        C1126390fPx.LJ(c1126390fPx, f, f2);
        c1126390fPx.LIZLLL = 433L;
        c1126390fPx.LJ = C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0100001_17(C1126230fPh c1126230fPh, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1126230fPh;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0100001_17(C1146270fw1 c1146270fw1, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1146270fw1;
        this.f1 = f;
    }
}
