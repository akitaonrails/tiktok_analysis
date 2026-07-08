package kotlin.jvm.internal;

import X.AbstractC1520540pfg;
import X.C098200Yq;
import X.C09AY;
import X.C1523770pkt;
import X.C1523780pku;
import X.C1533480q0Y;
import X.C1534250q1n;
import X.C189200o6;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadConfigItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class AwS61S2100000_23 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS61S2100000_23 awS61S2100000_23) {
        C1523770pkt.LIZ.LIZ((ECSparkPreloadConfigItem) awS61S2100000_23.l2, new C1523780pku(awS61S2100000_23.s0, awS61S2100000_23.s1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS61S2100000_23 awS61S2100000_23) {
        ((GeckoXAdapter) awS61S2100000_23.l2).doGeckoStatistics$forest_release(awS61S2100000_23.s0, awS61S2100000_23.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS61S2100000_23 awS61S2100000_23) {
        Object c098200Yq;
        List<AbstractC1520540pfg> list = C1533480q0Y.LIZJ;
        String str = awS61S2100000_23.s0;
        String str2 = awS61S2100000_23.s1;
        JSONObject jSONObject = (JSONObject) awS61S2100000_23.l2;
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            try {
                ((AbstractC1520540pfg) it2.next()).LIZ("forest_event", str, "hybridkit_default_bid", str2, jSONObject, new JSONObject(), new JSONObject(), 0);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1534250q1n.LIZJ("ResourceReporter", "failed to customReport", thM5exceptionOrNullimpl, true);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S2100000_23(GeckoXAdapter geckoXAdapter, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = geckoXAdapter;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S2100000_23(ECSparkPreloadConfigItem eCSparkPreloadConfigItem, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = eCSparkPreloadConfigItem;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S2100000_23(String str, String str2, JSONObject jSONObject, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = jSONObject;
    }
}
