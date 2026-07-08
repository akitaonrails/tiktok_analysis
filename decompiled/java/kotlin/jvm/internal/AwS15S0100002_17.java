package kotlin.jvm.internal;

import X.C09AY;
import X.C0GY9;
import X.C1126390fPx;
import X.C1146270fw1;
import X.C1324720kZq;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS15S0100002_17 extends C09AY implements Function1 {
    public final int $t;
    public float f1;
    public float f2;
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

    public static final Object invoke$0(AwS15S0100002_17 awS15S0100002_17, Object obj) {
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        c1126390fPx.LIZJ = Collections.singletonList(((C1146270fw1) awS15S0100002_17.l0).LLILZIL);
        C1126390fPx.LIZ(c1126390fPx, awS15S0100002_17.f1, awS15S0100002_17.f2);
        c1126390fPx.LIZLLL = 433L;
        c1126390fPx.LJ = C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS15S0100002_17 awS15S0100002_17, Object obj) {
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        c1126390fPx.LIZJ = Collections.singletonList(((C1146270fw1) awS15S0100002_17.l0).LLILZLL);
        C1126390fPx.LIZ(c1126390fPx, awS15S0100002_17.f1, awS15S0100002_17.f2);
        c1126390fPx.LIZLLL = 433L;
        c1126390fPx.LJ = C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS15S0100002_17 awS15S0100002_17, Object obj) {
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        c1126390fPx.LIZJ = Collections.singletonList((C1324720kZq) awS15S0100002_17.l0);
        C1126390fPx.LIZ(c1126390fPx, awS15S0100002_17.f1, awS15S0100002_17.f2);
        c1126390fPx.LIZLLL = 433L;
        c1126390fPx.LJ = C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS15S0100002_17 awS15S0100002_17, Object obj) {
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        c1126390fPx.LIZJ = Collections.singletonList(((C1146270fw1) awS15S0100002_17.l0).LLILZ);
        C1126390fPx.LIZ(c1126390fPx, awS15S0100002_17.f1, awS15S0100002_17.f2);
        c1126390fPx.LIZLLL = 433L;
        c1126390fPx.LJ = C0GY9.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0100002_17(C1146270fw1 c1146270fw1, float f, float f2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1146270fw1;
        this.f1 = f;
        this.f2 = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0100002_17(C1324720kZq c1324720kZq, float f, float f2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1324720kZq;
        this.f1 = f;
        this.f2 = f2;
    }
}
