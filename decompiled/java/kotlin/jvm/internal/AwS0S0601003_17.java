package kotlin.jvm.internal;

import X.C09AY;
import X.C1126380fPw;
import X.C1146270fw1;
import X.C1146290fw3;
import X.C1324720kZq;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS0S0601003_17 extends C09AY implements Function1 {
    public final int $t;
    public float f7;
    public float f8;
    public float f9;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final Object invoke$0(AwS0S0601003_17 awS0S0601003_17, Object obj) {
        C1126380fPw c1126380fPw = (C1126380fPw) obj;
        c1126380fPw.LIZ(new AwS23S0100001_17((C1146270fw1) awS0S0601003_17.l0, awS0S0601003_17.f7, 2));
        c1126380fPw.LIZ(new AwS15S0100002_17((C1146270fw1) awS0S0601003_17.l0, awS0S0601003_17.f8, awS0S0601003_17.f9, 0));
        c1126380fPw.LIZ(new AwS15S0100002_17((C1146270fw1) awS0S0601003_17.l0, awS0S0601003_17.f9, awS0S0601003_17.f8, 1));
        c1126380fPw.LIZ(new C1146290fw3((C1324720kZq) awS0S0601003_17.l1, (C1146270fw1) awS0S0601003_17.l0, awS0S0601003_17.f7, (Function1) awS0S0601003_17.l2));
        if (((C1146270fw1) awS0S0601003_17.l0).LLILLJJLI) {
            c1126380fPw.LIZ(new AwS15S0100002_17((C1324720kZq) awS0S0601003_17.l1, awS0S0601003_17.f8, awS0S0601003_17.f9, 2));
            c1126380fPw.LIZ(new AwS15S0100002_17((C1146270fw1) awS0S0601003_17.l0, awS0S0601003_17.f9, awS0S0601003_17.f8, 3));
        }
        c1126380fPw.LIZLLL = new AwS141S0201000_17((Function0) awS0S0601003_17.l3, (Function0<Unit>) awS0S0601003_17.l0, (C1146270fw1) awS0S0601003_17.i6, 4);
        c1126380fPw.LJ = new AwS74S0301000_17((C1146270fw1) awS0S0601003_17.l0, (C1146270fw1) awS0S0601003_17.l4, (FrameLayout) awS0S0601003_17.i6, (int) awS0S0601003_17.l5, (Function0<Unit>) 6);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0601003_17 awS0S0601003_17, Object obj) {
        ((C1126380fPw) obj).LIZJ(new AwS0S0601003_17((C1146270fw1) awS0S0601003_17.l0, awS0S0601003_17.f7, awS0S0601003_17.f8, awS0S0601003_17.f9, (C1324720kZq) awS0S0601003_17.l1, (Function1) awS0S0601003_17.l2, (Function0) awS0S0601003_17.l3, awS0S0601003_17.i6, (FrameLayout) awS0S0601003_17.l4, (Function0) awS0S0601003_17.l5, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0601003_17(C1146270fw1 c1146270fw1, C1146270fw1 c1146270fw12, float f, float f2, float f3, C1324720kZq c1324720kZq, Function1<? super Integer, Unit> function1, Function0<Unit> function0, int i, FrameLayout frameLayout, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l0 = c1146270fw1;
        this.f7 = c1146270fw12;
        this.f8 = f;
        this.f9 = f2;
        this.l1 = f3;
        this.l2 = c1324720kZq;
        this.l3 = function1;
        this.i6 = function0;
        this.l4 = i;
        this.l5 = frameLayout;
    }
}
