package kotlin.jvm.internal;

import X.C06LY;
import X.C09AY;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS0S1010000_2 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public boolean z1;

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

    public static final Object invoke$0(AwS0S1010000_2 awS0S1010000_2, Object obj) {
        IStreakService.LJJIIZ.getClass();
        return C06LY.LIZ().z(awS0S1010000_2.s0, awS0S1010000_2.z1, (List) obj);
    }

    public static final Object invoke$1(AwS0S1010000_2 awS0S1010000_2, Object obj) {
        IStreakService.LJJIIZ.getClass();
        return C06LY.LIZ().t(awS0S1010000_2.s0, awS0S1010000_2.z1, (List) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1010000_2(String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }
}
