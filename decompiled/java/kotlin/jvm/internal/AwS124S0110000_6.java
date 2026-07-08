package kotlin.jvm.internal;

import X.C09AY;
import X.C0I05;
import X.C1341150l0L;
import X.C1350920lG6;
import X.C451460Hn6;
import X.C451620HnM;
import androidx.fragment.app.Fragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS124S0110000_6 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS124S0110000_6 awS124S0110000_6) {
        return new C451620HnM((Fragment) awS124S0110000_6.l0, awS124S0110000_6.z1).invoke();
    }

    public static final Object invoke$1(AwS124S0110000_6 awS124S0110000_6) {
        return new C451460Hn6((Fragment) awS124S0110000_6.l0, awS124S0110000_6.z1).invoke();
    }

    public static final Object invoke$2(AwS124S0110000_6 awS124S0110000_6) {
        Map<String, String> mapLIZJ = ((C1341150l0L) awS124S0110000_6.l0).LIZJ();
        C1350920lG6.LJJIFFI(Boolean.valueOf(awS124S0110000_6.z1), ((C1341150l0L) awS124S0110000_6.l0).LJIIIZ, mapLIZJ);
        C0I05.LIZ.getClass();
        if (!C0I05.LJII()) {
            C0I05.LJIIIIZZ = Boolean.TRUE;
            C0I05.LIZIZ().storeBoolean("sticker_quick_save_used", true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0110000_6(C1341150l0L c1341150l0L, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1341150l0L;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS124S0110000_6(Fragment fragment, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.z1 = z;
    }
}
