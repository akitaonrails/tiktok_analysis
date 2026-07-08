package kotlin.jvm.internal;

import X.C09AY;
import X.C1054004Ag;
import X.C1054104Ah;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS1S2201000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S2201000_1 awS1S2201000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll((Map) awS1S2201000_1.l2);
        Map map = (Map) awS1S2201000_1.l3;
        if (map != null) {
            laneParams.putAll(map);
        }
        laneParams.plusAssign("error_message", awS1S2201000_1.s0);
        laneParams.plusAssign("error_code", awS1S2201000_1.s1);
        laneParams.plusAssign("preload_type", Integer.valueOf(awS1S2201000_1.i4));
        laneParams.plusAssign("is_success", "no");
        if (!laneParams.containsKey((Object) "page_name")) {
            laneParams.put("page_name", "product_detail");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S2201000_1 awS1S2201000_1, Object obj) {
        int iIntValue;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS1S2201000_1.l2).LIZIZ);
        laneParams.plusAssign("module_name", awS1S2201000_1.s0);
        laneParams.plusAssign("video_id", awS1S2201000_1.s1);
        laneParams.plusAssign("duration", Integer.valueOf(awS1S2201000_1.i4));
        Integer num = (Integer) awS1S2201000_1.l3;
        if (num != null) {
            iIntValue = num.intValue() + 1;
        } else {
            iIntValue = 0;
        }
        laneParams.plusAssign("position_rank", String.valueOf(iIntValue));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS1S2201000_1 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r4 = (com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams) r4
            java.lang.Object r0 = r3.l2
            X.04Ah r0 = (X.C1054104Ah) r0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r0.LIZIZ
            r4.withParamsGroup(r0)
            java.lang.String r1 = r3.s0
            if (r1 != 0) goto L11
            java.lang.String r1 = "discounts_module"
        L11:
            java.lang.String r0 = "coupon_zone"
            r4.put(r0, r1)
            java.lang.Object r0 = r3.l3
            com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher r0 = (com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher) r0
            X.04CB r2 = X.C04CA.LIZLLL(r0)
            java.lang.String r1 = r2.LIZ
            java.lang.String r0 = "coupon_id"
            r4.put(r0, r1)
            java.lang.String r1 = "coupon_type_id"
            java.lang.String r0 = r2.LIZIZ
            r4.put(r1, r0)
            java.lang.String r1 = "coupon_name"
            java.lang.String r0 = r2.LIZJ
            r4.put(r1, r0)
            java.lang.String r1 = "coupon_type"
            java.lang.String r0 = r2.LIZLLL
            r4.put(r1, r0)
            java.lang.String r1 = "coupon_type_info"
            java.lang.String r0 = r2.LJ
            r4.put(r1, r0)
            java.lang.String r1 = "coupon_cost_role"
            java.lang.String r0 = r2.LJFF
            r4.put(r1, r0)
            java.lang.String r1 = "coupon_cnt"
            java.lang.String r0 = r2.LJI
            r4.put(r1, r0)
            java.lang.String r1 = "coupon_logo_type"
            java.lang.String r0 = r2.LJII
            r4.put(r1, r0)
            java.lang.String r1 = "instance_key"
            java.lang.String r0 = r2.LJIIIIZZ
            r4.put(r1, r0)
            java.lang.String r1 = "benefit_type"
            java.lang.String r0 = r2.LJIIIZ
            r4.put(r1, r0)
            java.lang.String r1 = "click_area"
            java.lang.String r0 = r3.s1
            r4.put(r1, r0)
            int r0 = r3.i4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "coupon_order"
            r4.put(r0, r1)
            java.lang.Object r0 = r3.l3
            com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher r0 = (com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher) r0
            java.lang.Integer r0 = r0.getCostType()
            if (r0 == 0) goto L97
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L94
            r0 = 3
            if (r1 != r0) goto L97
            java.lang.String r1 = "seller_min_spend_off"
        L8c:
            java.lang.String r0 = "coupon_cost_type"
            r4.put(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L94:
            java.lang.String r1 = "seller_free_shipping"
            goto L8c
        L97:
            r1 = 0
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS1S2201000_1.invoke$2(kotlin.jvm.internal.AwS1S2201000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS1S2201000_1 awS1S2201000_1, Object obj) {
        int iIntValue;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS1S2201000_1.l2).LIZIZ);
        laneParams.plusAssign("module_name", awS1S2201000_1.s0);
        String str = awS1S2201000_1.s1;
        if (str == null) {
            str = "";
        }
        laneParams.plusAssign("video_id", str);
        laneParams.plusAssign("video_whole_duration", Integer.valueOf(awS1S2201000_1.i4));
        Integer num = (Integer) awS1S2201000_1.l3;
        if (num != null) {
            iIntValue = num.intValue() + 1;
        } else {
            iIntValue = 0;
        }
        laneParams.plusAssign("position_rank", String.valueOf(iIntValue));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2201000_1(int i, Voucher voucher, C1054104Ah c1054104Ah, String str, String str2, int i2) {
        super(1);
        this.$t = i2;
        this.l2 = c1054104Ah;
        this.s0 = str;
        this.l3 = voucher;
        this.s1 = str2;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2201000_1(int i, String str, Map map, String str2, Map map2, int i2) {
        super(1);
        this.$t = i2;
        this.l2 = map;
        this.l3 = map2;
        this.s0 = str;
        this.s1 = str2;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2201000_1(C1054004Ag c1054004Ag, String str, String str2, int i, Integer num, int i2) {
        super(1);
        this.$t = i2;
        this.l2 = c1054004Ag;
        this.s0 = str;
        this.s1 = str2;
        this.i4 = i;
        this.l3 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S2201000_1(C1054104Ah c1054104Ah, String str, String str2, int i, Integer num, int i2) {
        super(1);
        this.$t = i2;
        this.l2 = c1054104Ah;
        this.s0 = str;
        this.s1 = str2;
        this.i4 = i;
        this.l3 = num;
    }
}
