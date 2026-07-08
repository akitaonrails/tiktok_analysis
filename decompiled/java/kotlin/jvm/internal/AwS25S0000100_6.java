package kotlin.jvm.internal;

import X.C09AY;
import X.C13LP;
import X.C291001Au;
import X.C448440HiE;
import X.C461100I6i;
import X.C461170I6p;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS25S0000100_6 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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
    public AwS25S0000100_6(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS25S0000100_6 awS25S0000100_6, Object obj) {
        C461100I6i c461100I6i = (C461100I6i) obj;
        Pair pair = new Pair(Long.valueOf(awS25S0000100_6.j0), new C291001Au(Boolean.TRUE));
        C291001Au<C461170I6p> c291001Au = c461100I6i.LL;
        c461100I6i.getClass();
        return new C461100I6i(c291001Au, pair);
    }

    public static final Object invoke$1(AwS25S0000100_6 awS25S0000100_6, Object obj) {
        C448440HiE c448440HiE = (C448440HiE) obj;
        Set setLLIIIZ = C13LP.LLIIIZ(c448440HiE.LLILLJJLI);
        setLLIIIZ.add(Long.valueOf(awS25S0000100_6.j0));
        return C448440HiE.LIZ(c448440HiE, null, setLLIIIZ, 1);
    }
}
