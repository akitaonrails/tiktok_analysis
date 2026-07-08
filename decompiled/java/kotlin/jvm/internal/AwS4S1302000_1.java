package kotlin.jvm.internal;

import X.C042Y;
import X.C09AY;
import X.C936903lP;
import X.C937003lQ;
import X.C937203lS;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.UsSkuVH;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS4S1302000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public int i5;
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

    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS4S1302000_1 r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS4S1302000_1.invoke$0(kotlin.jvm.internal.AwS4S1302000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS4S1302000_1 awS4S1302000_1, Object obj) {
        return C936903lP.LIZ((C936903lP) obj, (List) awS4S1302000_1.l1, awS4S1302000_1.s0, (Image) awS4S1302000_1.l2, awS4S1302000_1.i5, new C937203lS(awS4S1302000_1.i4, false), (C937003lQ) awS4S1302000_1.l3, 0, null, null, null, 0, 1920);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S1302000_1(int i, int i2, List<String> list, String str, Image image, int i3, C937003lQ c937003lQ) {
        super(1);
        this.$t = c937003lQ;
        this.i4 = i;
        this.l1 = i2;
        this.s0 = list;
        this.l2 = str;
        this.i5 = image;
        this.l3 = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1302000_1(C042Y c042y, String str, int i, int i2, SkuItem skuItem, UsSkuVH usSkuVH, int i3) {
        super(1);
        this.$t = i3;
        this.l1 = c042y;
        this.s0 = str;
        this.i4 = i;
        this.i5 = i2;
        this.l2 = skuItem;
        this.l3 = usSkuVH;
    }
}
