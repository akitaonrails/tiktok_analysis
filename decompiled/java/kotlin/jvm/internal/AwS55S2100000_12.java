package kotlin.jvm.internal;

import X.C09AY;
import X.C1392810mLf;
import X.C1397510mTF;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class AwS55S2100000_12 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS55S2100000_12 awS55S2100000_12) {
        C1392810mLf.LIZLLL((Context) awS55S2100000_12.l2, awS55S2100000_12.s0, awS55S2100000_12.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS55S2100000_12 awS55S2100000_12) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = awS55S2100000_12.s0;
        String str2 = awS55S2100000_12.s1;
        jSONObject.put("action_type", str);
        jSONObject.put("ui_type", str2);
        jSONObject.put("reason", "click_button");
        ((C1397510mTF) awS55S2100000_12.l2).LIZIZ(jSONObject);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S2100000_12(C1397510mTF c1397510mTF, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = c1397510mTF;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S2100000_12(Context context, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = context;
        this.s0 = str;
        this.s1 = str2;
    }
}
