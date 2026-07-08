package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C0ZBQ;
import X.C0ZN6;
import X.C1397660mTU;
import X.C1714830uj3;
import X.C910030Zmz;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaSafetyBridgeApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class AwS15S2000000_14 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS15S2000000_14 awS15S2000000_14, Object obj) {
        ((C062P) obj).LIZ = new C910030Zmz(awS15S2000000_14.s0, awS15S2000000_14.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS15S2000000_14 awS15S2000000_14, Object obj) {
        ((C062P) obj).LIZ = new C0ZBQ(awS15S2000000_14.s0, awS15S2000000_14.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS15S2000000_14 awS15S2000000_14, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("enter_from", "video_edit_page");
        jSONObject.put("shoot_way", awS15S2000000_14.s0);
        jSONObject.put("creation_id", awS15S2000000_14.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS15S2000000_14 awS15S2000000_14, Object obj) {
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        IMMediaSafetyBridgeApi.LIZ.getClass();
        IMMediaSafetyBridgeApi iMMediaSafetyBridgeApiLIZ = C0ZN6.LIZ();
        if (iMMediaSafetyBridgeApiLIZ != null) {
            iMMediaSafetyBridgeApiLIZ.LIZ(null, awS15S2000000_14.s0, awS15S2000000_14.s1, "cancel");
        }
        c1397660mTU.LIZJ = true;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS15S2000000_14 awS15S2000000_14, Object obj) {
        boolean z;
        C1714830uj3 c1714830uj3 = (C1714830uj3) obj;
        if (awS15S2000000_14.s0.length() == awS15S2000000_14.s1.length()) {
            z = true;
        } else {
            z = false;
        }
        return C1714830uj3.LIZ(c1714830uj3, null, null, z, false, false, false, false, false, 0, 505);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S2000000_14(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
