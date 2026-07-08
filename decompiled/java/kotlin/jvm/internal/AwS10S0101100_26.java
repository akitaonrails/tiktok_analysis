package kotlin.jvm.internal;

import X.C09AY;
import X.C1744320vUc;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS10S0101100_26 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

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

    public static final Object invoke$0(AwS10S0101100_26 awS10S0101100_26, Object obj) {
        int size;
        District district;
        List<District> list;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("item_num", Integer.valueOf(awS10S0101100_26.i1));
        laneParams.plusAssign("stay_time", Long.valueOf(awS10S0101100_26.j2));
        laneParams.plusAssign("drop_down_list_area", ((DistrictFragment) awS10S0101100_26.l0).mS().LLJJI);
        C1744320vUc<District> c1744320vUc = ((DistrictFragment) awS10S0101100_26.l0).LLLII;
        if (c1744320vUc != null && (district = c1744320vUc.LIZ) != null && (list = district.parRegions) != null) {
            size = list.size() + 1;
        } else {
            size = 0;
        }
        laneParams.plusAssign("max_region_level", Integer.valueOf(size));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS10S0101100_26 awS10S0101100_26, Object obj) {
        int size;
        District district;
        List<District> list;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("item_num", Integer.valueOf(awS10S0101100_26.i1));
        laneParams.plusAssign("stay_time", Long.valueOf(awS10S0101100_26.j2));
        laneParams.plusAssign("drop_down_list_area", ((DistrictFragment) awS10S0101100_26.l0).mS().LLJJI);
        C1744320vUc<District> c1744320vUc = ((DistrictFragment) awS10S0101100_26.l0).LLLII;
        if (c1744320vUc != null && (district = c1744320vUc.LIZ) != null && (list = district.parRegions) != null) {
            size = list.size() + 1;
        } else {
            size = 0;
        }
        laneParams.plusAssign("max_region_level", Integer.valueOf(size));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0101100_26(int i, long j, DistrictFragment districtFragment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.j2 = j;
        this.l0 = districtFragment;
    }
}
