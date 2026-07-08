package kotlin.jvm.internal;

import X.C09AY;
import X.C14XN;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public class AwS0S0313000_29 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public int i5;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AwS0S0313000_29 awS0S0313000_29, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C14XN) awS0S0313000_29.l0).LJJII(awS0S0313000_29.i4, (Question) awS0S0313000_29.l1, awS0S0313000_29.i5, awS0S0313000_29.z3, (Function1) awS0S0313000_29.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0313000_29.i6 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0313000_29 awS0S0313000_29, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C14XN) awS0S0313000_29.l0).LJJII(awS0S0313000_29.i4, (Question) awS0S0313000_29.l1, awS0S0313000_29.i5, awS0S0313000_29.z3, (Function1) awS0S0313000_29.l2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0313000_29.i6 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0313000_29(C14XN c14xn, C14XN c14xn2, int i, Question question, int i2, boolean z, Function1<? super Integer, Unit> function1, int i3) {
        super(2);
        this.$t = i3;
        this.l0 = c14xn;
        this.i4 = c14xn2;
        this.l1 = i;
        this.i5 = question;
        this.z3 = i2;
        this.l2 = z;
        this.i6 = function1;
    }
}
