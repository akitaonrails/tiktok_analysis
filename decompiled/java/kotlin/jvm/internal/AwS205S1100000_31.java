package kotlin.jvm.internal;

import X.C09AY;
import X.C20526015Tm;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.explore.topic.ExploreRecommendTopicBottomSheetFragment;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public class AwS205S1100000_31 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS205S1100000_31(ExploreRecommendTopicBottomSheetFragment exploreRecommendTopicBottomSheetFragment, int i) {
        super(3);
        this.$t = i;
        this.l1 = exploreRecommendTopicBottomSheetFragment;
        this.s0 = "exit_popup_page";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS205S1100000_31(ExploreRecommendTopicBottomSheetFragment exploreRecommendTopicBottomSheetFragment, String str, int i) {
        super(3);
        this.$t = i;
        this.l1 = exploreRecommendTopicBottomSheetFragment;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS205S1100000_31 awS205S1100000_31, Object obj, Object obj2, Object obj3) {
        ((ExploreRecommendTopicBottomSheetFragment) awS205S1100000_31.l1).UR((Long) obj, (C20526015Tm) obj2, (Map) obj3, true, awS205S1100000_31.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS205S1100000_31 awS205S1100000_31, Object obj, Object obj2, Object obj3) {
        ((ExploreRecommendTopicBottomSheetFragment) awS205S1100000_31.l1).UR((Long) obj, (C20526015Tm) obj2, (Map) obj3, false, awS205S1100000_31.s0);
        return Unit.LIZ;
    }
}
