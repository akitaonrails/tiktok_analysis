package kotlin.jvm.internal;

import X.C09AY;
import X.C1054104Ah;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS5S2100100_26 extends C09AY implements Function1 {
    public final int $t;
    public long j3;
    public Object l2;
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

    public static final Object invoke$0(AwS5S2100100_26 awS5S2100100_26, Object obj) {
        boolean z;
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("stay_time", Long.valueOf(awS5S2100100_26.j3));
        laneParams.plusAssign("input_method", awS5S2100100_26.s0);
        String str = awS5S2100100_26.s1;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("has_normal_input", obj2);
        laneParams.plusAssign("has_auto_input", CardStruct.IStatusCode.DEFAULT);
        if (((DistrictFragment) awS5S2100100_26.l2).LLLI) {
            str2 = "1";
        }
        laneParams.plusAssign("has_sug_input", str2);
        laneParams.plusAssign("is_valid", "1");
        laneParams.plusAssign("previous_page", ((DistrictFragment) awS5S2100100_26.l2).mS().LLJJ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S2100100_26 awS5S2100100_26, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS5S2100100_26.l2).LIZIZ);
        laneParams.plusAssign("page_name", "product_detail");
        laneParams.plusAssign("module_name", "head_pic");
        ProductPackStruct productPackStruct = ((C1054104Ah) awS5S2100100_26.l2).LJIIL;
        if (productPackStruct != null) {
            str = productPackStruct.productId;
        } else {
            str = null;
        }
        laneParams.plusAssign("product_id", str);
        laneParams.plusAssign("head_pic_content_id", awS5S2100100_26.s0);
        laneParams.plusAssign("loading_latency", Long.valueOf(awS5S2100100_26.j3));
        laneParams.plusAssign("render_type", awS5S2100100_26.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS5S2100100_26 awS5S2100100_26, Object obj) {
        boolean z;
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("stay_time", Long.valueOf(awS5S2100100_26.j3));
        laneParams.plusAssign("input_method", awS5S2100100_26.s0);
        String str = awS5S2100100_26.s1;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("has_normal_input", obj2);
        laneParams.plusAssign("has_auto_input", CardStruct.IStatusCode.DEFAULT);
        if (((DistrictFragment) awS5S2100100_26.l2).LLLI) {
            str2 = "1";
        }
        laneParams.plusAssign("has_sug_input", str2);
        laneParams.plusAssign("is_valid", "1");
        laneParams.plusAssign("previous_page", ((DistrictFragment) awS5S2100100_26.l2).mS().LLJJ);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS5S2100100_26 awS5S2100100_26, Object obj) {
        boolean z;
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("stay_time", Long.valueOf(awS5S2100100_26.j3));
        laneParams.plusAssign("input_method", awS5S2100100_26.s0);
        String str = awS5S2100100_26.s1;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("has_normal_input", obj2);
        laneParams.plusAssign("has_auto_input", CardStruct.IStatusCode.DEFAULT);
        if (((DistrictFragment) awS5S2100100_26.l2).LLLI) {
            str2 = "1";
        }
        laneParams.plusAssign("has_sug_input", str2);
        laneParams.plusAssign("is_valid", "1");
        laneParams.plusAssign("previous_page", ((DistrictFragment) awS5S2100100_26.l2).mS().LLJJ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S2100100_26(long j, String str, String str2, DistrictFragment districtFragment, int i) {
        super(1);
        this.$t = i;
        this.j3 = j;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = districtFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S2100100_26(C1054104Ah c1054104Ah, String str, long j, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1054104Ah;
        this.s0 = str;
        this.j3 = j;
        this.s1 = str2;
    }
}
