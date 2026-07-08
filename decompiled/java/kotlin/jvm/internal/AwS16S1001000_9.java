package kotlin.jvm.internal;

import X.C09AY;
import X.C0NDV;
import X.C2188811AlT;
import X.C590280NDe;
import X.C786410Ut5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AwS16S1001000_9 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS16S1001000_9 awS16S1001000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS16S1001000_9.i1);
        sbLIZ.append(" start to show ");
        sbLIZ.append(awS16S1001000_9.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS16S1001000_9 awS16S1001000_9) throws JSONException {
        JSONObject jSONObject;
        String str;
        C0NDV.LIZ.getClass();
        C590280NDe c590280NDeLIZIZ = C0NDV.LJII().LIZIZ(awS16S1001000_9.s0);
        if (c590280NDeLIZIZ != null && (str = c590280NDeLIZIZ.LJIIZILJ) != null && (!a0.LJJJIL(str)) && str != null) {
            jSONObject = new JSONObject(str);
        } else {
            jSONObject = new JSONObject();
        }
        jSONObject.put("bitrate", awS16S1001000_9.i1);
        C0NDV.LJII().LJIIL(awS16S1001000_9.s0, C786410Ut5.J3(jSONObject));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS16S1001000_9 awS16S1001000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Freq] onClicked strategy=");
        sbLIZ.append(awS16S1001000_9.i1);
        sbLIZ.append(" aid=");
        sbLIZ.append(awS16S1001000_9.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1001000_9(int i, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.s0 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1001000_9(int i, String str, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS16S1001000_9(String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
