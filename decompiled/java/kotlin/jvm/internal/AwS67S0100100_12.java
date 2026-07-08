package kotlin.jvm.internal;

import X.AbstractC1102390enF;
import X.C09AY;
import X.C1102370enD;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyFCConfig;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS67S0100100_12 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS67S0100100_12 awS67S0100100_12) {
        Collection collectionValues = C1102370enD.LIZJ().values();
        NotifyFCConfig notifyFCConfig = (NotifyFCConfig) awS67S0100100_12.l0;
        long j = awS67S0100100_12.j1;
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            ((AbstractC1102390enF) it2.next()).LJIIJJI(notifyFCConfig, 3, j);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS67S0100100_12 awS67S0100100_12) {
        ((Function1) awS67S0100100_12.l0).invoke(Long.valueOf(awS67S0100100_12.j1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S0100100_12(long j, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l0 = function1;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S0100100_12(NotifyFCConfig notifyFCConfig, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = notifyFCConfig;
        this.j1 = j;
    }
}
