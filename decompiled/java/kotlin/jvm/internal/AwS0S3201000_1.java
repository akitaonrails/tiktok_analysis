package kotlin.jvm.internal;

import X.C09AY;
import X.C1054004Ag;
import X.C1054104Ah;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS0S3201000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i5;
    public Object l3;
    public Object l4;
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

    public static final Object invoke$0(AwS0S3201000_1 awS0S3201000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS0S3201000_1.l3).LIZIZ);
        laneParams.plusAssign("photo_id", awS0S3201000_1.s0);
        laneParams.plusAssign("rank", Integer.valueOf(awS0S3201000_1.i5));
        String str = awS0S3201000_1.s1;
        if (str != null) {
            laneParams.plusAssign("review_id", str);
        }
        laneParams.plusAssign("is_self", Integer.valueOf(Intrinsics.LJFF((Boolean) awS0S3201000_1.l4, Boolean.TRUE) ? 1 : 0));
        String str2 = awS0S3201000_1.s2;
        if (str2 != null) {
            laneParams.plusAssign("rate", str2);
        }
        ((C1054104Ah) awS0S3201000_1.l3).getClass();
        laneParams.plusAssign("photo_show_type", "has_text");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S3201000_1 awS0S3201000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS0S3201000_1.l3).LIZIZ);
        laneParams.plusAssign("photo_id", awS0S3201000_1.s0);
        laneParams.plusAssign("rank", Integer.valueOf(awS0S3201000_1.i5));
        String str = awS0S3201000_1.s1;
        if (str != null) {
            laneParams.plusAssign("review_id", str);
        }
        laneParams.plusAssign("is_self", Integer.valueOf(Intrinsics.LJFF((Boolean) awS0S3201000_1.l4, Boolean.TRUE) ? 1 : 0));
        String str2 = awS0S3201000_1.s2;
        if (str2 != null) {
            laneParams.plusAssign("rate", str2);
        }
        ((C1054004Ag) awS0S3201000_1.l3).getClass();
        laneParams.plusAssign("photo_show_type", "has_text");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S3201000_1(C1054004Ag c1054004Ag, String str, int i, String str2, Boolean bool, String str3, int i2) {
        super(1);
        this.$t = i2;
        this.l3 = c1054004Ag;
        this.s0 = str;
        this.i5 = i;
        this.s1 = str2;
        this.l4 = bool;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S3201000_1(C1054104Ah c1054104Ah, String str, int i, String str2, Boolean bool, String str3, int i2) {
        super(1);
        this.$t = i2;
        this.l3 = c1054104Ah;
        this.s0 = str;
        this.i5 = i;
        this.s1 = str2;
        this.l4 = bool;
        this.s2 = str3;
    }
}
