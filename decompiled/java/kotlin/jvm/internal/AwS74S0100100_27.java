package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AwS74S0100100_27 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS74S0100100_27 awS74S0100100_27) {
        ((ExploreViewPagerComponent) awS74S0100100_27.l0).bp(awS74S0100100_27.j1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS74S0100100_27 awS74S0100100_27) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("evict last topic tab for lynx pin: topicId ");
        sbLIZ.append(awS74S0100100_27.j1);
        sbLIZ.append(" topicName ");
        sbLIZ.append(((ExploreCustomTopicResponse) awS74S0100100_27.l0).topicName);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS74S0100100_27(long j, ExploreViewPagerComponent exploreViewPagerComponent, int i) {
        super(0);
        this.$t = i;
        this.l0 = exploreViewPagerComponent;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS74S0100100_27(long j, ExploreCustomTopicResponse exploreCustomTopicResponse, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = exploreCustomTopicResponse;
    }
}
