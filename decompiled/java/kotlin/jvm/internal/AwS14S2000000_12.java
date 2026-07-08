package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C1720106oR;
import X.C189200o6;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C773210UUt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class AwS14S2000000_12 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS14S2000000_12 awS14S2000000_12, Object obj) {
        Map map = (Map) obj;
        String str = awS14S2000000_12.s0;
        if (str == null) {
            str = "";
        }
        map.put("enter_from", str);
        map.put("timestamp", String.valueOf(System.currentTimeMillis()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoCcdcServiceImpl_");
        sbLIZ.append(awS14S2000000_12.s1);
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS14S2000000_12 awS14S2000000_12, Object obj) {
        Object c098200Yq;
        JSONObject jSONObject = (JSONObject) obj;
        String str = awS14S2000000_12.s0;
        String str2 = awS14S2000000_12.s1;
        try {
            jSONObject.put("enter_from_merge", str);
            jSONObject.put("enter_method", "live_cover");
            c098200Yq = jSONObject.put("close_type", str2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZJ("FeedSkylightTracker", thM5exceptionOrNullimpl);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS14S2000000_12 awS14S2000000_12, Object obj) {
        ((C773210UUt) obj).LIZJ(awS14S2000000_12.s0, awS14S2000000_12.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS14S2000000_12 awS14S2000000_12, Object obj) {
        ((C773210UUt) obj).LIZJ(awS14S2000000_12.s0, awS14S2000000_12.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S2000000_12(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
