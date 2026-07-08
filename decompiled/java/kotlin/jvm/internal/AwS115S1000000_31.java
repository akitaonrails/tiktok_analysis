package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AwS115S1000000_31 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

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
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS115S1000000_31 awS115S1000000_31) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[NativePriorityCallbackImpl] native doHttpPost submitted with url: ");
        sbLIZ.append(awS115S1000000_31.s0);
        sbLIZ.append('!');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS115S1000000_31 awS115S1000000_31) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismissLynxOverlay: enterFrom=");
        sbLIZ.append(awS115S1000000_31.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS115S1000000_31 awS115S1000000_31) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timer_name", awS115S1000000_31.s0);
        TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream("timer_is_up", jSONObject, (ExecutorService) null);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS115S1000000_31 awS115S1000000_31) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LsParamChecker asyncRegisterSceneWithSceneKey sceneName: ");
        sbLIZ.append(awS115S1000000_31.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS115S1000000_31 awS115S1000000_31) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LsParamChecker resultValue, code: ");
        sbLIZ.append(awS115S1000000_31.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS115S1000000_31 awS115S1000000_31) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LsParamChecker resultValue, data: ");
        sbLIZ.append(awS115S1000000_31.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS115S1000000_31(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
