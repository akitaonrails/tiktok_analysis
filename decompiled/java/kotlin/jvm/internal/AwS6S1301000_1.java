package kotlin.jvm.internal;

import X.C09AY;
import X.C855703Vz;
import X.C957403oi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS6S1301000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final Object invoke$0(AwS6S1301000_1 awS6S1301000_1, Object obj) {
        C855703Vz.LIZ((C957403oi) obj, (Map) awS6S1301000_1.l1, (ProductPackStruct) awS6S1301000_1.l2, (SkuPrice) awS6S1301000_1.l3, awS6S1301000_1.i4, awS6S1301000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S1301000_1 awS6S1301000_1, Object obj) {
        C855703Vz.LIZ((C957403oi) obj, (Map) awS6S1301000_1.l1, (ProductPackStruct) awS6S1301000_1.l2, (SkuPrice) awS6S1301000_1.l3, awS6S1301000_1.i4, awS6S1301000_1.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1301000_1(int i, ProductPackStruct productPackStruct, SkuPrice skuPrice, String str, Map map, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = map;
        this.l2 = productPackStruct;
        this.l3 = skuPrice;
        this.i4 = i;
        this.s0 = str;
    }
}
