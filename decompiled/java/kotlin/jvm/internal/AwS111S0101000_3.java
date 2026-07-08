package kotlin.jvm.internal;

import X.C09AY;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class AwS111S0101000_3 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AwS111S0101000_3 awS111S0101000_3, Object obj) {
        ((List) obj).addAll(awS111S0101000_3.i1, (Collection) awS111S0101000_3.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS111S0101000_3 awS111S0101000_3, Object obj) {
        ListProtector.add((List) obj, awS111S0101000_3.i1, awS111S0101000_3.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS111S0101000_3(int i, int i2, Object obj) {
        super(1);
        this.$t = obj;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS111S0101000_3(int i, int i2, Collection<Object> collection) {
        super(1);
        this.$t = collection;
        this.i1 = i;
        this.l0 = i2;
    }
}
