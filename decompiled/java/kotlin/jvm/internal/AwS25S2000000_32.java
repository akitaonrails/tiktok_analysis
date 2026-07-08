package kotlin.jvm.internal;

import X.C09AY;
import X.C18C3;
import X.C957403oi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class AwS25S2000000_32 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS25S2000000_32 awS25S2000000_32, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("btm_page", awS25S2000000_32.s0);
        Regex regex = C18C3.LIZ;
        jSONObject.put("btm", C18C3.LJII(awS25S2000000_32.s1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS25S2000000_32 awS25S2000000_32, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZLLL("popup_name", awS25S2000000_32.s0);
        c957403oi.LIZLLL("action_type", awS25S2000000_32.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S2000000_32(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
