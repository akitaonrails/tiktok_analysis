package kotlin.jvm.internal;

import X.C09AY;
import X.C15UV;
import X.C20612215lA;
import X.C20666915tz;
import X.C20693315yF;
import X.EnumC1568370qup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AwS43S0001000_31 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1000i0;

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
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS43S0001000_31(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f1000i0 = i;
    }

    public static final Object invoke$0(AwS43S0001000_31 awS43S0001000_31, Object obj) {
        return C20612215lA.LIZ((C20612215lA) obj, false, null, null, awS43S0001000_31.f1000i0, null, false, 55);
    }

    public static final Object invoke$1(AwS43S0001000_31 awS43S0001000_31, Object obj) throws JSONException {
        ((JSONObject) obj).put("has_blocked_account", awS43S0001000_31.f1000i0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS43S0001000_31 awS43S0001000_31, Object obj) {
        return C20666915tz.LIZ((C20666915tz) obj, null, awS43S0001000_31.f1000i0, 1023);
    }

    public static final Object invoke$3(AwS43S0001000_31 awS43S0001000_31, Object obj) {
        return C20693315yF.LJJIJL((C20693315yF) obj, null, awS43S0001000_31.f1000i0, false, false, false, false, 32765);
    }

    public static final Object invoke$4(AwS43S0001000_31 awS43S0001000_31, Object obj) {
        if (awS43S0001000_31.f1000i0 == EnumC1568370qup.NO_PREFETCH.getValue()) {
            C15UV.LIZ.LJ();
        }
        return Unit.LIZ;
    }
}
