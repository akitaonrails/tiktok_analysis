package kotlin.jvm.internal;

import X.C09AY;
import X.C1126240fPi;
import X.C1126260fPk;
import X.C1126380fPw;
import X.C1126390fPx;
import X.C1126400fPy;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS0S0100101_17 extends C09AY implements Function1 {
    public final int $t;
    public float f2;
    public long j1;
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
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S0100101_17 awS0S0100101_17, Object obj) {
        ((C1126380fPw) obj).LIZ(new AwS0S0100101_17((C1126260fPk) awS0S0100101_17.l0, awS0S0100101_17.f2, awS0S0100101_17.j1, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0100101_17 awS0S0100101_17, Object obj) {
        ((C1126380fPw) obj).LIZ(new AwS0S0100101_17((C1126240fPi) awS0S0100101_17.l0, awS0S0100101_17.f2, awS0S0100101_17.j1, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S0100101_17 awS0S0100101_17, Object obj) {
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        c1126390fPx.LIZJ = Collections.singletonList(((C1126260fPk) awS0S0100101_17.l0).LL);
        C1126390fPx.LIZIZ(c1126390fPx, awS0S0100101_17.f2, 0.0f, new AwS631S0100000_17((C1126260fPk) awS0S0100101_17.l0, 18));
        c1126390fPx.LIZLLL = awS0S0100101_17.j1;
        c1126390fPx.LJFF = 250L;
        c1126390fPx.LJ = C1126400fPy.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS0S0100101_17 awS0S0100101_17, Object obj) {
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        c1126390fPx.LIZJ = Collections.singletonList(((C1126240fPi) awS0S0100101_17.l0).LL);
        C1126390fPx.LIZIZ(c1126390fPx, awS0S0100101_17.f2, 0.0f, new AwS631S0100000_17((C1126240fPi) awS0S0100101_17.l0, 19));
        c1126390fPx.LIZLLL = awS0S0100101_17.j1;
        c1126390fPx.LJFF = 250L;
        c1126390fPx.LJ = C1126400fPy.LIZ();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0100101_17(C1126240fPi c1126240fPi, float f, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1126240fPi;
        this.f2 = f;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0100101_17(C1126260fPk c1126260fPk, float f, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1126260fPk;
        this.f2 = f;
        this.j1 = j;
    }
}
