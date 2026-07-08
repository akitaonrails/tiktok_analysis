package kotlin.jvm.internal;

import X.C09AY;
import X.C1755400vmU;
import X.C2188811AlT;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpSparkLiteCardHolder;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.SkuLynxPowerCell;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS46S0200100_26 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS46S0200100_26 awS46S0200100_26) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1755400vmU) awS46S0200100_26.l0).LLILLL);
        sbLIZ.append(" hashCode ");
        sbLIZ.append(((SkuLynxPowerCell) awS46S0200100_26.l1).hashCode());
        sbLIZ.append(" lynx render cost ");
        sbLIZ.append(SystemClock.elapsedRealtime() - awS46S0200100_26.j2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS46S0200100_26 awS46S0200100_26) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1755400vmU) awS46S0200100_26.l0).LLILLL);
        sbLIZ.append(" hashCode ");
        sbLIZ.append(((PdpSparkLiteCardHolder) awS46S0200100_26.l1).hashCode());
        sbLIZ.append(" lynx render cost ");
        sbLIZ.append(SystemClock.elapsedRealtime() - awS46S0200100_26.j2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0200100_26(C1755400vmU c1755400vmU, PdpSparkLiteCardHolder pdpSparkLiteCardHolder, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1755400vmU;
        this.l1 = pdpSparkLiteCardHolder;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0200100_26(C1755400vmU c1755400vmU, SkuLynxPowerCell skuLynxPowerCell, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1755400vmU;
        this.l1 = skuLynxPowerCell;
        this.j2 = j;
    }
}
