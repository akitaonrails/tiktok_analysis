package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC2217701Bqy;
import X.InterfaceC2217711Bqz;
import com.bytedance.hybrid.spark.page.SparkActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes35.dex */
public class AwS69S0010000_34 extends C09AY implements Function2 {
    public final int $t;
    public boolean z0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS69S0010000_34(boolean z, int i) {
        super(2);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS69S0010000_34 awS69S0010000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).LJJIII((SparkActivity) obj2, awS69S0010000_34.z0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS69S0010000_34 awS69S0010000_34, Object obj, Object obj2) {
        ((InterfaceC2217701Bqy) obj).LJIILLIIL(awS69S0010000_34.z0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS69S0010000_34 awS69S0010000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJIILLIIL(awS69S0010000_34.z0);
        return Unit.LIZ;
    }
}
