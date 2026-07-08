package kotlin.jvm.internal;

import X.C09AY;
import X.C1745180vW0;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS2S3010000_26 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;
    public boolean z3;

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

    public static final Object invoke$0(AwS2S3010000_26 awS2S3010000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "suggested_address_list");
        laneParams.plusAssign("previous_page", awS2S3010000_26.s0);
        laneParams.plusAssign("entrance_info", awS2S3010000_26.s1);
        if (awS2S3010000_26.z3) {
            laneParams.plusAssign("fill_type", awS2S3010000_26.s2);
            laneParams.plusAssign("trigger_event", "click_map_pin");
            laneParams.withNotCheckParam("address_authorization_type", C1745180vW0.LIZJ());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S3010000_26 awS2S3010000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "suggested_address_list");
        laneParams.plusAssign("previous_page", awS2S3010000_26.s0);
        laneParams.plusAssign("input_box_name", "address");
        laneParams.plusAssign("input_method", "normal");
        if (awS2S3010000_26.z3) {
            laneParams.plusAssign("fill_type", awS2S3010000_26.s1);
            laneParams.plusAssign("entrance_info", awS2S3010000_26.s2);
            laneParams.plusAssign("trigger_event", "click_map_pin");
            laneParams.withNotCheckParam("address_authorization_type", C1745180vW0.LIZJ());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S3010000_26(String str, String str2, boolean z, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.z3 = z;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S3010000_26(String str, boolean z, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z3 = z;
        this.s1 = str2;
        this.s2 = str3;
    }
}
