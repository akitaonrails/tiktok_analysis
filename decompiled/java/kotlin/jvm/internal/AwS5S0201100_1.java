package kotlin.jvm.internal;

import X.C09AY;
import X.C1054004Ag;
import X.C1054104Ah;
import android.os.SystemClock;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS5S0201100_1 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public long j3;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS5S0201100_1 awS5S0201100_1, Object obj) {
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.putAll((Map) awS5S0201100_1.l0);
        Map map = (Map) awS5S0201100_1.l1;
        if (map != null) {
            laneParams.putAll(map);
        }
        Map map2 = (Map) awS5S0201100_1.l1;
        if (map2 == null || (obj2 = map2.get("click_product_start_time")) == null) {
            obj2 = -1L;
        }
        if ((obj2 instanceof Long) && !Intrinsics.LJFF(obj2, -1L)) {
            laneParams.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj2).longValue()));
        }
        laneParams.put("api_duration", Long.valueOf(awS5S0201100_1.j3));
        laneParams.put("is_success", "yes");
        laneParams.put("preload_type", Integer.valueOf(awS5S0201100_1.i2));
        if (!laneParams.containsKey((Object) "page_name")) {
            laneParams.put("page_name", "product_detail");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S0201100_1 awS5S0201100_1, Object obj) {
        String string;
        String string2;
        HashMap map = (HashMap) obj;
        Object obj2 = awS5S0201100_1.l0;
        if (obj2 != null && (obj2 instanceof Long)) {
            map.put("duration", Long.valueOf(awS5S0201100_1.j3 - ((Number) obj2).longValue()));
        }
        map.put(Scene.SCENE_SERVICE, Integer.valueOf(awS5S0201100_1.i2));
        Object obj3 = ((C1054104Ah) awS5S0201100_1.l1).LIZIZ.get("entrance_form");
        String str = "";
        if (obj3 == null || (string = obj3.toString()) == null) {
            string = "";
        }
        map.put("entrance_form", string);
        Object obj4 = ((C1054104Ah) awS5S0201100_1.l1).LIZIZ.get("enter_from_info");
        if (obj4 != null && (string2 = obj4.toString()) != null) {
            str = string2;
        }
        map.put("enter_from_info", str);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS5S0201100_1 awS5S0201100_1, Object obj) {
        String string;
        String string2;
        HashMap map = (HashMap) obj;
        Object obj2 = awS5S0201100_1.l0;
        if (obj2 != null && (obj2 instanceof Long)) {
            map.put("duration", Long.valueOf(awS5S0201100_1.j3 - ((Number) obj2).longValue()));
        }
        map.put(Scene.SCENE_SERVICE, Integer.valueOf(awS5S0201100_1.i2));
        Object obj3 = ((C1054004Ag) awS5S0201100_1.l1).LIZIZ.get("entrance_form");
        String str = "";
        if (obj3 == null || (string = obj3.toString()) == null) {
            string = "";
        }
        map.put("entrance_form", string);
        Object obj4 = ((C1054004Ag) awS5S0201100_1.l1).LIZIZ.get("enter_from_info");
        if (obj4 != null && (string2 = obj4.toString()) != null) {
            str = string2;
        }
        map.put("enter_from_info", str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0201100_1(Object obj, long j, int i, C1054004Ag c1054004Ag, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = obj;
        this.j3 = j;
        this.i2 = i;
        this.l1 = c1054004Ag;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0201100_1(Object obj, long j, int i, C1054104Ah c1054104Ah, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = obj;
        this.j3 = j;
        this.i2 = i;
        this.l1 = c1054104Ah;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:int), (r1 I:kotlin.jvm.internal.AwS5S0201100_1) (LINE:84017161) kotlin.jvm.internal.AwS5S0201100_1.i2 int, block:B:2:0x0000 */
    public AwS5S0201100_1(Map map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, long j, int i) {
        int i2;
        super(1);
        this.$t = i;
        this.l0 = map;
        this.l1 = map2;
        this.j3 = map3;
        this.i2 = i2;
    }
}
