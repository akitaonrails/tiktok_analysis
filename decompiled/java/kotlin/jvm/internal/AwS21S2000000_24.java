package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS21S2000000_24 extends C09AY implements Function1 {
    public final int $t;
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

    public static final Object invoke$0(AwS21S2000000_24 awS21S2000000_24, Object obj) {
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent pagePerformanceEvent = (MiniDramaPagePerformanceMonitor.PagePerformanceEvent) obj;
        pagePerformanceEvent.errorCode = awS21S2000000_24.s0;
        pagePerformanceEvent.errorMsg = String.valueOf(awS21S2000000_24.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S2000000_24 awS21S2000000_24, Object obj) {
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent pagePerformanceEvent = (MiniDramaPagePerformanceMonitor.PagePerformanceEvent) obj;
        pagePerformanceEvent.errorCode = awS21S2000000_24.s0;
        pagePerformanceEvent.errorMsg = String.valueOf(awS21S2000000_24.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS21S2000000_24 awS21S2000000_24, Object obj) {
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent pagePerformanceEvent = (MiniDramaPagePerformanceMonitor.PagePerformanceEvent) obj;
        pagePerformanceEvent.errorCode = awS21S2000000_24.s0;
        pagePerformanceEvent.errorMsg = String.valueOf(awS21S2000000_24.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS21S2000000_24 awS21S2000000_24, Object obj) {
        Map map = (Map) obj;
        map.put("is_success", CardStruct.IStatusCode.DEFAULT);
        map.put("error_code", awS21S2000000_24.s0);
        map.put("error_message", awS21S2000000_24.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S2000000_24(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
