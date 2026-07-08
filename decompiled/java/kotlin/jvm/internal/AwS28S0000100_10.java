package kotlin.jvm.internal;

import X.C09AY;
import X.C661190Pwb;
import X.C671600QVy;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AwS28S0000100_10 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0000100_10(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS28S0000100_10 awS28S0000100_10, Object obj) {
        ((C671600QVy) obj).LJIIIIZZ = awS28S0000100_10.j0;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS28S0000100_10 awS28S0000100_10, Object obj) {
        ((C671600QVy) obj).LJIIIIZZ = awS28S0000100_10.j0;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS28S0000100_10 awS28S0000100_10, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("step", "compress_screenshot");
        jSONObject.put(Scene.SCENE_SERVICE, "screen_shots_search");
        jSONObject.put("duration", System.currentTimeMillis() - awS28S0000100_10.j0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS28S0000100_10 awS28S0000100_10, Object obj) {
        return C661190Pwb.LIZ((C661190Pwb) obj, null, null, 0, null, null, 0L, false, 0, awS28S0000100_10.j0, null, null, 1791);
    }
}
