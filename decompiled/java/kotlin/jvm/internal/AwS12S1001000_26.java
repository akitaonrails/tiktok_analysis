package kotlin.jvm.internal;

import X.C09AY;
import X.C1718390uon;
import X.EnumC488160JCk;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS12S1001000_26 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public String s0;

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

    public static final Object invoke$0(AwS12S1001000_26 awS12S1001000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("request_api", awS12S1001000_26.s0);
        laneParams.plusAssign("request_success", Integer.valueOf(awS12S1001000_26.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S1001000_26 awS12S1001000_26, Object obj) {
        EnumC488160JCk enumC488160JCk = EnumC488160JCk.ERROR;
        String strValueOf = String.valueOf(awS12S1001000_26.i1);
        String str = awS12S1001000_26.s0;
        return C1718390uon.LIZ((C1718390uon) obj, enumC488160JCk, str, str, strValueOf, Boolean.TRUE, 32);
    }

    public static final Object invoke$2(AwS12S1001000_26 awS12S1001000_26, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        String str = awS12S1001000_26.s0;
        if (str == null) {
            str = "";
        }
        laneParams.plusAssign("drop_down_list_name", str);
        laneParams.plusAssign("item_num", Integer.valueOf(awS12S1001000_26.i1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S1001000_26(int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S1001000_26(String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
