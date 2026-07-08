package kotlin.jvm.internal;

import X.C09AY;
import X.C0T6L;
import X.C12835050n;
import X.C20653815rs;
import X.C2097908Jt;
import X.C699180Rbg;
import X.C700180RdI;
import X.C700190RdJ;
import X.C700340RdY;
import X.C729510SjV;
import X.InterfaceC699200Rbi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AwS4S3100000_11 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS4S3100000_11 awS4S3100000_11, Object obj) {
        String str;
        C12835050n c12835050n = (C12835050n) obj;
        C20653815rs c20653815rs = C20653815rs.LIZ;
        String str2 = awS4S3100000_11.s0;
        String str3 = awS4S3100000_11.s1;
        String str4 = awS4S3100000_11.s2;
        c20653815rs.getClass();
        RuleHitState ruleHitStateLIZ = C20653815rs.LIZ(str2, str3, str4);
        boolean zLIZ = C700340RdY.LIZ(ruleHitStateLIZ);
        String str5 = null;
        if (!zLIZ) {
            str = "density check failed";
        } else {
            str = null;
        }
        if (ruleHitStateLIZ != null) {
            str5 = ruleHitStateLIZ.ruleStrategy;
        }
        c12835050n.LIZ(str, C2097908Jt.LIZJ(new Pair("outreach_strategy", str5)));
        if (!zLIZ) {
            C699180Rbg c699180Rbg = C699180Rbg.LIZ;
            Function0<InterfaceC699200Rbi<?>> function0 = ((C700190RdJ) awS4S3100000_11.l3).LJIIIZ;
            String str6 = awS4S3100000_11.s1;
            c699180Rbg.getClass();
            C699180Rbg.LIZ(function0, str6, ruleHitStateLIZ);
        }
        return Boolean.valueOf(zLIZ);
    }

    public static final Object invoke$1(AwS4S3100000_11 awS4S3100000_11, Object obj) {
        String str;
        C12835050n c12835050n = (C12835050n) obj;
        C20653815rs c20653815rs = C20653815rs.LIZ;
        String str2 = awS4S3100000_11.s0;
        String str3 = awS4S3100000_11.s1;
        String str4 = awS4S3100000_11.s2;
        c20653815rs.getClass();
        RuleHitState ruleHitStateLIZ = C20653815rs.LIZ(str2, str3, str4);
        boolean zLIZ = C700340RdY.LIZ(ruleHitStateLIZ);
        String str5 = null;
        if (!zLIZ) {
            str = "density check failed";
        } else {
            str = null;
        }
        if (ruleHitStateLIZ != null) {
            str5 = ruleHitStateLIZ.ruleStrategy;
        }
        c12835050n.LIZ(str, C2097908Jt.LIZJ(new Pair("outreach_strategy", str5)));
        if (!zLIZ) {
            C699180Rbg c699180Rbg = C699180Rbg.LIZ;
            Function0<InterfaceC699200Rbi<?>> function0 = ((C700180RdI) awS4S3100000_11.l3).LJII;
            String str6 = awS4S3100000_11.s1;
            c699180Rbg.getClass();
            C699180Rbg.LIZ(function0, str6, ruleHitStateLIZ);
        }
        new AwS11S1010000_11(awS4S3100000_11.s1, zLIZ, 1);
        C0T6L.LIZLLL();
        return Boolean.valueOf(zLIZ);
    }

    public static final Object invoke$2(AwS4S3100000_11 awS4S3100000_11, Object obj) throws JSONException {
        Object objValueOf;
        AwemeStatistics statistics;
        AwemeStatistics statistics2;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("enter_from", awS4S3100000_11.s0);
        jSONObject.put("enter_method", awS4S3100000_11.s1);
        Aweme aweme = (Aweme) awS4S3100000_11.l3;
        if (aweme != null && (statistics2 = aweme.getStatistics()) != null) {
            jSONObject.put("vved", statistics2.getPlayCount());
        }
        Aweme aweme2 = (Aweme) awS4S3100000_11.l3;
        if (aweme2 != null && (statistics = aweme2.getStatistics()) != null) {
            objValueOf = Long.valueOf(statistics.getDiggCount());
        } else {
            objValueOf = null;
        }
        jSONObject.put("liked", objValueOf);
        jSONObject.put("action_on", awS4S3100000_11.s2);
        jSONObject.put("is_expired", C729510SjV.LJJI((Aweme) awS4S3100000_11.l3) ? 1 : 0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S3100000_11(String str, String str2, String str3, C700180RdI c700180RdI, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = c700180RdI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S3100000_11(String str, String str2, String str3, C700190RdJ c700190RdJ, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = c700190RdJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S3100000_11(String str, String str2, String str3, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = aweme;
        this.s2 = str3;
    }
}
