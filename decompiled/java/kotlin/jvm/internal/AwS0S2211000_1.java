package kotlin.jvm.internal;

import X.C09AY;
import X.C1010603xI;
import X.C1054004Ag;
import X.C1054104Ah;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS0S2211000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i5;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

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

    public static final Object invoke$0(AwS0S2211000_1 awS0S2211000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS0S2211000_1.l2).LIZIZ);
        laneParams.withParamsGroup((Map) awS0S2211000_1.l3);
        C1010603xI.LIZJ(laneParams, awS0S2211000_1.s0);
        laneParams.plusAssign("notice_number", Integer.valueOf(awS0S2211000_1.i5));
        if (awS0S2211000_1.z4) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        laneParams.plusAssign("page_show_type", str);
        laneParams.plusAssign("cart_entrance", awS0S2211000_1.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S2211000_1 awS0S2211000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS0S2211000_1.l2).LIZIZ);
        laneParams.withParamsGroup((Map) awS0S2211000_1.l3);
        C1010603xI.LIZJ(laneParams, awS0S2211000_1.s0);
        laneParams.plusAssign("notice_number", Integer.valueOf(awS0S2211000_1.i5));
        if (awS0S2211000_1.z4) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        laneParams.plusAssign("page_show_type", str);
        laneParams.plusAssign("cart_entrance", awS0S2211000_1.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S2211000_1 awS0S2211000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS0S2211000_1.l2).LIZIZ);
        laneParams.withParamsGroup((Map) awS0S2211000_1.l3);
        C1010603xI.LIZJ(laneParams, awS0S2211000_1.s0);
        laneParams.plusAssign("notice_number", Integer.valueOf(awS0S2211000_1.i5));
        if (awS0S2211000_1.z4) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        laneParams.plusAssign("page_show_type", str);
        laneParams.plusAssign("cart_entrance", awS0S2211000_1.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2211000_1(C1054104Ah c1054104Ah, Map map, String str, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l2 = c1054104Ah;
        this.l3 = map;
        this.s0 = str;
        this.i5 = i;
        this.z4 = z;
        this.s1 = "icon";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S2211000_1(C1054004Ag c1054004Ag, C1054004Ag c1054004Ag2, Map<String, ? extends Object> map, String str, int i, boolean z, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = c1054004Ag;
        this.l3 = c1054004Ag2;
        this.s0 = map;
        this.i5 = str;
        this.z4 = i;
        this.s1 = z;
    }
}
