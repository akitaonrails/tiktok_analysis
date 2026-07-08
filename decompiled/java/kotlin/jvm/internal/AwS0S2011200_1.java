package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS0S2011200_1 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public long j4;
    public long j5;
    public String s0;
    public String s1;
    public boolean z2;

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

    public static final Object invoke$0(AwS0S2011200_1 awS0S2011200_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "product_detail");
        laneParams.plusAssign("module_name", "head_pic");
        laneParams.plusAssign("video_show_type", awS0S2011200_1.s0);
        laneParams.plusAssign("position_rank", Integer.valueOf(awS0S2011200_1.i3));
        if (awS0S2011200_1.z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("is_first_show", str);
        laneParams.plusAssign("video_id", awS0S2011200_1.s1);
        laneParams.plusAssign("duration", Long.valueOf(awS0S2011200_1.j4));
        laneParams.plusAssign("video_whole_duration", Long.valueOf(awS0S2011200_1.j5));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S2011200_1 awS0S2011200_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "product_detail");
        laneParams.plusAssign("module_name", "head_pic");
        laneParams.plusAssign("video_show_type", awS0S2011200_1.s0);
        laneParams.plusAssign("position_rank", Integer.valueOf(awS0S2011200_1.i3));
        if (awS0S2011200_1.z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("is_first_show", str);
        laneParams.plusAssign("video_id", awS0S2011200_1.s1);
        laneParams.plusAssign("duration", Long.valueOf(awS0S2011200_1.j4));
        laneParams.plusAssign("video_whole_duration", Long.valueOf(awS0S2011200_1.j5));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2011200_1(int i, String str, boolean z, String str2, long j, long j2, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i3 = i;
        this.z2 = z;
        this.s1 = str2;
        this.j4 = j;
        this.j5 = j2;
    }
}
