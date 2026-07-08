package kotlin.jvm.internal;

import X.C09AY;
import X.C1251350ifV;
import X.C291001Au;
import X.C443120HZe;
import android.content.Intent;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class AwS25S0102000_3 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS25S0102000_3 awS25S0102000_3, Object obj) {
        return C1251350ifV.LIZ((C1251350ifV) obj, null, false, false, null, null, null, null, null, null, null, null, new C291001Au(new C443120HZe(Integer.valueOf(awS25S0102000_3.i1), Integer.valueOf(awS25S0102000_3.i2), (Intent) awS25S0102000_3.l0)), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 31);
    }

    public static final Object invoke$1(AwS25S0102000_3 awS25S0102000_3, Object obj) {
        return C1251350ifV.LIZ((C1251350ifV) obj, null, false, false, null, null, null, null, null, null, null, null, new C291001Au(new C443120HZe(Integer.valueOf(awS25S0102000_3.i1), Integer.valueOf(awS25S0102000_3.i2), (Intent) awS25S0102000_3.l0)), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 31);
    }

    public static final Object invoke$2(AwS25S0102000_3 awS25S0102000_3, Object obj) {
        List list = (List) obj;
        int i = awS25S0102000_3.i1;
        list.removeAll(list.subList(i, awS25S0102000_3.i2 + i));
        list.addAll(awS25S0102000_3.i1, (Collection) awS25S0102000_3.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S0102000_3(int i, int i2, Intent intent, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS25S0102000_3(int i, int i2, int i3, Collection<Object> collection) {
        super(1);
        this.$t = collection;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = i3;
    }
}
