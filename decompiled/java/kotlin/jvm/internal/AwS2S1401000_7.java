package kotlin.jvm.internal;

import X.C09AY;
import X.C1397620mTQ;
import X.C497740JfY;
import X.C499900Jj2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AwS2S1401000_7 extends C09AY implements Function1 {
    public final int $t;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    public static final Object invoke$0(AwS2S1401000_7 awS2S1401000_7, Object obj) {
        ((Function0) awS2S1401000_7.l1).invoke();
        C499900Jj2 c499900Jj2 = (C499900Jj2) awS2S1401000_7.l2;
        int i = awS2S1401000_7.i5;
        Function0 function0 = (Function0) awS2S1401000_7.l3;
        Function0 function02 = (Function0) awS2S1401000_7.l4;
        c499900Jj2.getClass();
        C499900Jj2.LIZLLL(i, function0, function02);
        C499900Jj2 c499900Jj22 = (C499900Jj2) awS2S1401000_7.l2;
        String str = awS2S1401000_7.s0;
        c499900Jj22.getClass();
        C499900Jj2.LIZJ(str, "click", "confirm");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S1401000_7 awS2S1401000_7, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, C497740JfY.LJIJI(2131855664), new AwS2S1401000_7((Function0) awS2S1401000_7.l1, (C499900Jj2) awS2S1401000_7.l2, awS2S1401000_7.i5, (Function0) awS2S1401000_7.l3, (Function0) awS2S1401000_7.l4, awS2S1401000_7.s0, 0));
        c1397620mTQ.LIZJ(1, C497740JfY.LJIJI(2131855662), new AwS92S1200000_7((Function0) awS2S1401000_7.l4, (Function0<Unit>) awS2S1401000_7.l2, (C499900Jj2) awS2S1401000_7.s0, (String) 0));
        c1397620mTQ.LJFF = false;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S1401000_7(Function0 function0, Function0<Unit> function02, C499900Jj2 c499900Jj2, int i, Function0<Unit> function03, Function0<Unit> function04, String str) {
        super(1);
        this.$t = str;
        this.l1 = function0;
        this.l2 = function02;
        this.i5 = c499900Jj2;
        this.l3 = i;
        this.l4 = function03;
        this.s0 = function04;
    }
}
