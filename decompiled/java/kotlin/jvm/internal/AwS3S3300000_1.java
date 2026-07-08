package kotlin.jvm.internal;

import X.C09AY;
import X.C1054004Ag;
import X.C1054104Ah;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS3S3300000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;

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

    public static final Object invoke$0(AwS3S3300000_1 awS3S3300000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS3S3300000_1.l3).LIZIZ);
        laneParams.plusAssign("glide_type", awS3S3300000_1.s0);
        String str = awS3S3300000_1.s1;
        if (str != null) {
            laneParams.plusAssign("glide_direction", str);
        }
        Integer num = (Integer) awS3S3300000_1.l4;
        if (num != null) {
            num.intValue();
            laneParams.plusAssign("is_algo_cut", num);
        }
        String str2 = awS3S3300000_1.s2;
        if (str2 != null) {
            laneParams.plusAssign("first_category_id", str2);
        }
        Map map = (Map) awS3S3300000_1.l5;
        if (map != null) {
            laneParams.putAll(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S3300000_1 awS3S3300000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS3S3300000_1.l3).LIZIZ);
        laneParams.plusAssign("button_name", awS3S3300000_1.s0);
        laneParams.plusAssign("sku_id", awS3S3300000_1.s1);
        laneParams.withParamsGroup(((C1054004Ag) awS3S3300000_1.l3).LJIIJJI(awS3S3300000_1.s1));
        HashMap map = (HashMap) awS3S3300000_1.l4;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        laneParams.plusAssign("page_name", awS3S3300000_1.s2);
        Map<String, ? extends Object> map2 = (Map) awS3S3300000_1.l5;
        if (map2 != null) {
            laneParams.withParamsGroup(map2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS3S3300000_1(C1054004Ag c1054004Ag, C1054004Ag c1054004Ag2, String str, String str2, HashMap<String, Object> map, String str3, Map<String, ? extends Object> map2) {
        super(1);
        this.$t = map2;
        this.l3 = c1054004Ag;
        this.s0 = c1054004Ag2;
        this.s1 = str;
        this.l4 = str2;
        this.s2 = map;
        this.l5 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS3S3300000_1(C1054104Ah c1054104Ah, C1054104Ah c1054104Ah2, String str, String str2, Integer num, String str3, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l3 = c1054104Ah;
        this.s0 = c1054104Ah2;
        this.s1 = str;
        this.l4 = str2;
        this.s2 = num;
        this.l5 = str3;
    }
}
