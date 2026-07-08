package kotlin.jvm.internal;

import X.C09AY;
import X.C1569250qwF;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedMonitorImpl;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS17S1001000_24 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS17S1001000_24 awS17S1001000_24) {
        HashMap<Integer, Pair<Long, Map<String, String>>> map;
        Pair<Long, Map<String, String>> pair;
        LinkedHashMap linkedHashMap = (LinkedHashMap) LandscapeFeedMonitorImpl.LJI;
        C1569250qwF c1569250qwF = (C1569250qwF) linkedHashMap.get("landscape_feed_launch_performance");
        if (c1569250qwF != null) {
            if (Intrinsics.LJFF(c1569250qwF.LJFF, awS17S1001000_24.s0) && (pair = (map = LandscapeFeedMonitorImpl.LJIIIIZZ).get(Integer.valueOf(awS17S1001000_24.i1))) != null) {
                long jLongValue = pair.getFirst().longValue();
                Map<String, String> second = pair.getSecond();
                HashMap<Integer, Pair<Long, Map<String, String>>> map2 = LandscapeFeedMonitorImpl.LJIIIZ;
                Pair<Long, Map<String, String>> pair2 = map2.get(Integer.valueOf(awS17S1001000_24.i1));
                if (pair2 != null) {
                    long jLongValue2 = pair2.getFirst().longValue();
                    Map<String, String> second2 = pair2.getSecond();
                    C1569250qwF c1569250qwF2 = (C1569250qwF) linkedHashMap.get("landscape_feed_launch_performance");
                    if (c1569250qwF2 != null) {
                        c1569250qwF2.LIZ("landscape_feed_interaction_layer_start_construct", Long.valueOf(jLongValue), awS17S1001000_24.s0, second);
                    }
                    C1569250qwF c1569250qwF3 = (C1569250qwF) linkedHashMap.get("landscape_feed_launch_performance");
                    if (c1569250qwF3 != null) {
                        c1569250qwF3.LIZ("landscape_feed_interaction_layer_finish_construct", Long.valueOf(jLongValue2), awS17S1001000_24.s0, second2);
                    }
                    map.clear();
                    map2.clear();
                    LandscapeFeedMonitorImpl.LJIIJJI = true;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS17S1001000_24 awS17S1001000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("high networkLevel ");
        sbLIZ.append(awS17S1001000_24.i1);
        sbLIZ.append(' ');
        sbLIZ.append(awS17S1001000_24.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS17S1001000_24 awS17S1001000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("weak networkLevel high priority ");
        sbLIZ.append(awS17S1001000_24.i1);
        sbLIZ.append(' ');
        sbLIZ.append(awS17S1001000_24.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS17S1001000_24 awS17S1001000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("weak networkLevel ");
        sbLIZ.append(awS17S1001000_24.i1);
        sbLIZ.append(' ');
        sbLIZ.append(awS17S1001000_24.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS17S1001000_24 awS17S1001000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("high networkLevel high priority ");
        sbLIZ.append(awS17S1001000_24.i1);
        sbLIZ.append(' ');
        sbLIZ.append(awS17S1001000_24.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S1001000_24(int i, String str, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S1001000_24(String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
