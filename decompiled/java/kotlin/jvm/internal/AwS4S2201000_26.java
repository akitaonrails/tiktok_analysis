package kotlin.jvm.internal;

import X.C09AY;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1746780vYa;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS4S2201000_26 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS4S2201000_26 awS4S2201000_26, Object obj) {
        int iIntValue;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS4S2201000_26.l2).LIZIZ);
        laneParams.plusAssign("module_name", awS4S2201000_26.s0);
        String str = awS4S2201000_26.s1;
        if (str == null) {
            str = "";
        }
        laneParams.plusAssign("video_id", str);
        laneParams.plusAssign("video_whole_duration", Integer.valueOf(awS4S2201000_26.i4));
        Integer num = (Integer) awS4S2201000_26.l3;
        if (num != null) {
            iIntValue = num.intValue() + 1;
        } else {
            iIntValue = 0;
        }
        laneParams.plusAssign("position_rank", String.valueOf(iIntValue));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S2201000_26 awS4S2201000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", ((C1746780vYa) awS4S2201000_26.l2).LIZIZ);
        laneParams.withNotCheckParams(((C1746780vYa) awS4S2201000_26.l2).LIZ);
        HashMap map = (HashMap) awS4S2201000_26.l3;
        if (map != null) {
            laneParams.withNotCheckParams(map);
        }
        laneParams.plusAssign("previous_page", ((C1746780vYa) awS4S2201000_26.l2).LIZ.get("previous_page"));
        laneParams.withNotCheckParam("option_type", "sug_address");
        laneParams.withNotCheckParam("option_name", awS4S2201000_26.s0);
        laneParams.withNotCheckParam("rank", Integer.valueOf(awS4S2201000_26.i4));
        String str = awS4S2201000_26.s1;
        if (str != null) {
            laneParams.withNotCheckParam("log_id", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS4S2201000_26 awS4S2201000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", ((C1746780vYa) awS4S2201000_26.l2).LIZIZ);
        laneParams.withNotCheckParams(((C1746780vYa) awS4S2201000_26.l2).LIZ);
        HashMap map = (HashMap) awS4S2201000_26.l3;
        if (map != null) {
            laneParams.withNotCheckParams(map);
        }
        laneParams.plusAssign("previous_page", ((C1746780vYa) awS4S2201000_26.l2).LIZ.get("previous_page"));
        laneParams.withNotCheckParam("option_type", "sug_address");
        laneParams.withNotCheckParam("option_name", awS4S2201000_26.s0);
        laneParams.withNotCheckParam("rank", Integer.valueOf(awS4S2201000_26.i4));
        String str = awS4S2201000_26.s1;
        if (str != null) {
            laneParams.withNotCheckParam("log_id", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS4S2201000_26 awS4S2201000_26, Object obj) {
        int iIntValue;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS4S2201000_26.l2).LIZIZ);
        laneParams.plusAssign("module_name", awS4S2201000_26.s0);
        laneParams.plusAssign("video_id", awS4S2201000_26.s1);
        laneParams.plusAssign("duration", Integer.valueOf(awS4S2201000_26.i4));
        Integer num = (Integer) awS4S2201000_26.l3;
        if (num != null) {
            iIntValue = num.intValue() + 1;
        } else {
            iIntValue = 0;
        }
        laneParams.plusAssign("position_rank", String.valueOf(iIntValue));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S2201000_26(C1054004Ag c1054004Ag, String str, String str2, int i, Integer num, int i2) {
        super(1);
        this.$t = i2;
        this.l2 = c1054004Ag;
        this.s0 = str;
        this.s1 = str2;
        this.i4 = i;
        this.l3 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S2201000_26(C1054104Ah c1054104Ah, String str, String str2, int i, Integer num, int i2) {
        super(1);
        this.$t = i2;
        this.l2 = c1054104Ah;
        this.s0 = str;
        this.s1 = str2;
        this.i4 = i;
        this.l3 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S2201000_26(C1746780vYa c1746780vYa, C1746780vYa c1746780vYa2, HashMap<String, Object> map, String str, int i, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = c1746780vYa;
        this.l3 = c1746780vYa2;
        this.s0 = map;
        this.i4 = str;
        this.s1 = i;
    }
}
