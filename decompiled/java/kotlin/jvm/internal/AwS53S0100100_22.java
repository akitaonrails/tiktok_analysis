package kotlin.jvm.internal;

import X.C0267007d;
import X.C09AY;
import X.C13LP;
import X.C1412000mqc;
import X.C1415220mvo;
import X.C1461220o80;
import X.C1637890six;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class AwS53S0100100_22 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS53S0100100_22 awS53S0100100_22, Object obj) {
        List listLL = C13LP.LL((List) awS53S0100100_22.l0, 3);
        long j = awS53S0100100_22.j1;
        obj.getClass();
        return new C0267007d(listLL, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS53S0100100_22 r81, java.lang.Object r82) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS53S0100100_22.invoke$1(kotlin.jvm.internal.AwS53S0100100_22, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS53S0100100_22 awS53S0100100_22, Object obj) throws JSONException {
        ((C1415220mvo) awS53S0100100_22.l0).LLLIIIL = false;
        C1412000mqc.LJ((int) (System.currentTimeMillis() - awS53S0100100_22.j1), (String) obj);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", (int) (System.currentTimeMillis() - awS53S0100100_22.j1));
        C1637890six.LIZ.LJIIIZ("edit_recommend_effect_request_info", 1, jSONObject, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0100100_22(C1415220mvo c1415220mvo, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1415220mvo;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0100100_22(C1461220o80 c1461220o80, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1461220o80;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0000: IPUT (r6 I:int), (r2 I:kotlin.jvm.internal.AwS53S0100100_22) (LINE:50462720) kotlin.jvm.internal.AwS53S0100100_22.$t int, block:B:2:0x0000 */
    public AwS53S0100100_22(List list, List<? extends User> list2, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l0 = list;
        this.j1 = list2;
    }
}
