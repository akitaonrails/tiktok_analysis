package kotlin.jvm.internal;

import X.C09AY;
import X.C1189060h32;
import X.C1196140hES;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS37S1110000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AwS37S1110000_18 awS37S1110000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(awS37S1110000_18.z2)), "success");
        Integer num = (Integer) awS37S1110000_18.l1;
        if (num != null) {
            c1196140hES.LIZIZ(num.intValue(), "error_code");
        }
        String str = awS37S1110000_18.s0;
        if (str != null) {
            c1196140hES.LJ("error_msg", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS37S1110000_18 awS37S1110000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(awS37S1110000_18.z2)), "is_success");
        Integer num = (Integer) awS37S1110000_18.l1;
        if (num != null) {
            c1196140hES.LIZIZ(num.intValue(), "error_code");
        }
        String str = awS37S1110000_18.s0;
        if (str != null) {
            c1196140hES.LJ("error_msg", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS37S1110000_18 awS37S1110000_18, Object obj) {
        C1196140hES c1196140hES = (C1196140hES) obj;
        c1196140hES.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(awS37S1110000_18.z2)), "is_success");
        Integer num = (Integer) awS37S1110000_18.l1;
        if (num != null) {
            c1196140hES.LIZIZ(num.intValue(), "error_code");
        }
        String str = awS37S1110000_18.s0;
        if (str != null) {
            c1196140hES.LJ("error_msg", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS37S1110000_18 awS37S1110000_18, Object obj) {
        ((HashtagFeedbackViewModel) awS37S1110000_18.l1).setState(new AwS5S1010000_18(awS37S1110000_18.s0, awS37S1110000_18.z2, 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S1110000_18(HashtagFeedbackViewModel hashtagFeedbackViewModel, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = hashtagFeedbackViewModel;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S1110000_18(Integer num, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l1 = num;
        this.s0 = str;
    }
}
