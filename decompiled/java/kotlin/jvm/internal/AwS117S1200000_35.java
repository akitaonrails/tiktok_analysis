package kotlin.jvm.internal;

import X.C07YT;
import X.C09AY;
import X.C1383370m6R;
import X.C157K;
import X.C1710306mr;
import X.C1782510wUD;
import X.C1D82;
import X.C1DWA;
import X.C1DWB;
import X.C2250851D7z;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS117S1200000_35 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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

    public static final Object invoke$0(AwS117S1200000_35 awS117S1200000_35, Object obj) {
        try {
            ((Function1) awS117S1200000_35.l2).invoke(obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C157K.LJIIIIZZ.getClass();
            if (C157K.LIZJ.LIZLLL && ((C1D82) awS117S1200000_35.l1).LIZ.LIZLLL.LJIIIIZZ) {
                throw th;
            }
            C2250851D7z c2250851D7z = ((C1D82) awS117S1200000_35.l1).LIZ;
            c2250851D7z.LIZLLL.LJFF(new AwS401S0200000_35(awS117S1200000_35, th, 7));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS117S1200000_35 awS117S1200000_35, Object obj) {
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        String strLIZIZ = C1710306mr.LIZIZ(2131835374, str);
        C1DWA c1dwa = (C1DWA) awS117S1200000_35.l1;
        c1dwa.h0(new C1DWB(new C07YT(C1383370m6R.LIZLLL(c1dwa.LLILZIL, str, strLIZIZ, new AwS87S1000000_2(awS117S1200000_35.s0, 9))), new C1782510wUD(2131835371, new AwS579S0100000_35((Function0) awS117S1200000_35.l2, (Function0<Unit>) 263)), 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S1200000_35(C1D82 c1d82, Function1 function1, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1d82;
        this.l2 = function1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS117S1200000_35(C1DWA c1dwa, C1DWA c1dwa2, String str, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l1 = c1dwa;
        this.s0 = c1dwa2;
        this.l2 = str;
    }
}
