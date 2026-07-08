package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS0S4011200_1 extends C09AY implements Function1 {
    public final int $t;
    public int i5;
    public long j6;
    public long j7;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public boolean z4;

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

    public static final Object invoke$0(AwS0S4011200_1 awS0S4011200_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        String str2 = awS0S4011200_1.s0;
        if (str2 == null) {
            str2 = "product_detail";
        }
        laneParams.plusAssign("page_name", str2);
        laneParams.plusAssign("module_name", "head_pic");
        laneParams.plusAssign("video_show_type", awS0S4011200_1.s1);
        laneParams.plusAssign("position_rank", Integer.valueOf(awS0S4011200_1.i5));
        if (awS0S4011200_1.z4) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("is_first_show", str);
        laneParams.plusAssign("video_id", awS0S4011200_1.s2);
        laneParams.plusAssign("duration", Long.valueOf(awS0S4011200_1.j6));
        laneParams.plusAssign("video_whole_duration", Long.valueOf(awS0S4011200_1.j7));
        laneParams.plusAssign("play_type", awS0S4011200_1.s3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S4011200_1 awS0S4011200_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        String str2 = awS0S4011200_1.s0;
        if (str2 == null) {
            str2 = "product_detail";
        }
        laneParams.plusAssign("page_name", str2);
        laneParams.plusAssign("module_name", "head_pic");
        laneParams.plusAssign("video_show_type", awS0S4011200_1.s1);
        laneParams.plusAssign("position_rank", Integer.valueOf(awS0S4011200_1.i5));
        if (awS0S4011200_1.z4) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("is_first_show", str);
        laneParams.plusAssign("video_id", awS0S4011200_1.s2);
        laneParams.plusAssign("duration", Long.valueOf(awS0S4011200_1.j6));
        laneParams.plusAssign("video_whole_duration", Long.valueOf(awS0S4011200_1.j7));
        laneParams.plusAssign("play_type", awS0S4011200_1.s3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S4011200_1(String str, int i, String str2, String str3, long j, long j2, boolean z, String str4, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.s1 = str2;
        this.i5 = i;
        this.z4 = z;
        this.s2 = str3;
        this.j6 = j;
        this.j7 = j2;
        this.s3 = str4;
    }
}
