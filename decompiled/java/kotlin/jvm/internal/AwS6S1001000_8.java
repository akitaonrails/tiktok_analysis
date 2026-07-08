package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class AwS6S1001000_8 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public String s0;

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

    public static final Object invoke$0(AwS6S1001000_8 awS6S1001000_8, Object obj) {
        C0LAB c0lab = (C0LAB) obj;
        c0lab.LIZ(awS6S1001000_8.i1, "error_code");
        c0lab.LJ("error_msg", awS6S1001000_8.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S1001000_8 awS6S1001000_8, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("album_type", awS6S1001000_8.s0);
        jSONObject.put("click_type", "click");
        jSONObject.put("position", awS6S1001000_8.i1 + 1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS6S1001000_8 awS6S1001000_8, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("album_type", awS6S1001000_8.s0);
        jSONObject.put("click_type", "click");
        jSONObject.put("position", awS6S1001000_8.i1 + 1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1001000_8(int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1001000_8(String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
