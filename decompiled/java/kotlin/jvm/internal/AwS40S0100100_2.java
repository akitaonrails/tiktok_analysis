package kotlin.jvm.internal;

import X.C09AY;
import X.C189200o6;
import X.C23260099m;
import X.C259800zU;
import X.EnumC1399205dm;
import X.EnumC1487070onh;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AwS40S0100100_2 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

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

    public static final Object invoke$0(AwS40S0100100_2 awS40S0100100_2, Object obj) throws JSONException {
        long jOptLong;
        JSONObject jSONObject = (JSONObject) obj;
        long j = awS40S0100100_2.j1;
        Long lValueOf = Long.valueOf(jSONObject.optLong("t_click"));
        if (lValueOf.longValue() != 0) {
            jOptLong = lValueOf.longValue();
        } else {
            jOptLong = jSONObject.optLong("t_open_schema");
        }
        jSONObject.put("t_real_data_play", awS40S0100100_2.j1);
        jSONObject.put("d_click_to_play", j - jOptLong);
        jSONObject.put("report_scene", ((EnumC1487070onh) awS40S0100100_2.l0).getValue());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS40S0100100_2 awS40S0100100_2, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS40S0100100_2.l0;
        Pair pair = new Pair(obj, Long.valueOf(System.currentTimeMillis() - awS40S0100100_2.j1));
        C189200o6.m2constructorimpl(pair);
        interfaceC1364105Vn.resumeWith(pair);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS40S0100100_2 awS40S0100100_2, Object obj) throws JSONException {
        boolean z;
        JSONObject jSONObject = (JSONObject) obj;
        long j = awS40S0100100_2.j1;
        C259800zU c259800zU = (C259800zU) awS40S0100100_2.l0;
        jSONObject.put("t_request_aweme_start", j);
        jSONObject.put("t_request_aweme_end", System.currentTimeMillis() - j);
        if (c259800zU.element == 0) {
            z = true;
        } else {
            z = false;
        }
        jSONObject.put("aweme_fetch_fail", z);
        jSONObject.put("data_type", EnumC1399205dm.FULL_DATA);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS40S0100100_2) (LINE:50331651) kotlin.jvm.internal.AwS40S0100100_2.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS40S0100100_2) (LINE:50331653) kotlin.jvm.internal.AwS40S0100100_2.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS40S0100100_2] */
    public AwS40S0100100_2(long j, long j2, C259800zU<Aweme> c259800zU) {
        long j3;
        Object obj;
        c09ay.$t = c259800zU;
        c09ay.j1 = j3;
        c09ay.l0 = obj;
        ?? c09ay = new C09AY(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0100100_2(long j, EnumC1487070onh enumC1487070onh, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = enumC1487070onh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0100100_2(C23260099m c23260099m, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c23260099m;
        this.j1 = j;
    }
}
