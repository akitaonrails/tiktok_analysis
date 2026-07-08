package kotlin.jvm.internal;

import X.C09AY;
import X.C1683920tvC;
import X.C316150CaL;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public class AwS173S0101000_4 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S0101000_4(C316150CaL c316150CaL, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c316150CaL;
        this.i1 = i;
    }

    public static final Object invoke$0(AwS173S0101000_4 awS173S0101000_4, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1683920tvC.LJ((FailedReviewViewModel) awS173S0101000_4.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS173S0101000_4.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS173S0101000_4 awS173S0101000_4, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1683920tvC.LJI((C316150CaL) awS173S0101000_4.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS173S0101000_4.i1 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S0101000_4(FailedReviewViewModel failedReviewViewModel, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = failedReviewViewModel;
        this.i1 = i;
    }
}
