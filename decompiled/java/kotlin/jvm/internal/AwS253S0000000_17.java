package kotlin.jvm.internal;

import X.AbstractC1125980fPI;
import X.C09AY;
import X.C1124730fNH;
import X.C1125970fPH;
import X.C1128250fSx;
import X.C1128590fTV;
import X.C1128710fTh;
import X.C1130220fW8;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS253S0000000_17 extends C09AY implements Function1 {
    public final int $t;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0000000_17(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS253S0000000_17(C1128710fTh c1128710fTh, int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AwS253S0000000_17 awS253S0000000_17, Object obj) {
        C1124730fNH.LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS253S0000000_17 awS253S0000000_17, Object obj) {
        AbstractC1125980fPI abstractC1125980fPI = (AbstractC1125980fPI) obj;
        if (abstractC1125980fPI instanceof C1125970fPH) {
            C1125970fPH c1125970fPH = (C1125970fPH) abstractC1125980fPI;
            C1128250fSx.LIZ.LJ.put(c1125970fPH.LIZIZ, Integer.valueOf(c1125970fPH.LIZ ? 1 : 0));
            if (C1130220fW8.LIZ.LIZ && c1125970fPH.LIZ) {
                C1128590fTV.LJJIIZI++;
            }
        }
        return Unit.LIZ;
    }
}
