package kotlin.jvm.internal;

import X.C09AY;
import X.C708520Rqk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AwS4S1010000_11 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public boolean z1;

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

    public static final Object invoke$0(AwS4S1010000_11 awS4S1010000_11, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.putOpt("current_source_id", awS4S1010000_11.s0);
        jSONObject.put("is_music_paused", awS4S1010000_11.z1 ? 1 : 0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S1010000_11 awS4S1010000_11, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.putOpt("current_source_id", awS4S1010000_11.s0);
        jSONObject.put("is_music_paused", awS4S1010000_11.z1 ? 1 : 0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS4S1010000_11 awS4S1010000_11, Object obj) {
        return new C708520Rqk(awS4S1010000_11.s0, awS4S1010000_11.z1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S1010000_11(String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }
}
