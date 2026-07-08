package kotlin.jvm.internal;

import X.C09AY;
import X.C0NDV;
import X.C590280NDe;
import X.C786410Ut5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AwS29S2000000_9 extends C09AY implements Function0 {
    public final int $t;
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
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS29S2000000_9 awS29S2000000_9) {
        C0NDV c0ndv = C0NDV.LIZ;
        String str = awS29S2000000_9.s0;
        String str2 = awS29S2000000_9.s1;
        c0ndv.getClass();
        if (C0NDV.LJIIJ() && !a0.LJJJIL(str) && !a0.LJJJIL(str2)) {
            C0NDV.LJIILIIL(new AwS29S2000000_9(str, str2, 1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS29S2000000_9 awS29S2000000_9) {
        C0NDV.LIZ.getClass();
        C0NDV.LJII().LIZJ(awS29S2000000_9.s0, awS29S2000000_9.s1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS29S2000000_9 awS29S2000000_9) throws JSONException {
        JSONObject jSONObject;
        String str;
        C0NDV.LIZ.getClass();
        C590280NDe c590280NDeLIZIZ = C0NDV.LJII().LIZIZ(awS29S2000000_9.s0);
        if (c590280NDeLIZIZ != null && (str = c590280NDeLIZIZ.LJIIZILJ) != null && (!a0.LJJJIL(str)) && str != null) {
            jSONObject = new JSONObject(str);
        } else {
            jSONObject = new JSONObject();
        }
        jSONObject.put("snapshots", awS29S2000000_9.s1);
        C0NDV.LJII().LJIIL(awS29S2000000_9.s0, C786410Ut5.J3(jSONObject));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS29S2000000_9 awS29S2000000_9) {
        C0NDV c0ndv = C0NDV.LIZ;
        String str = awS29S2000000_9.s0;
        String str2 = awS29S2000000_9.s1;
        c0ndv.getClass();
        if (!a0.LJJJIL(str) && C0NDV.LJIIJ()) {
            C0NDV.LJIILIIL(new AwS29S2000000_9(str, str2, 2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S2000000_9(String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
