package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class AwS59S0100100_33 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

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

    public static final Object invoke$0(AwS59S0100100_33 awS59S0100100_33, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("camera_authorized", 1);
        jSONObject.put("duration", awS59S0100100_33.j1 - ((EcTakePhotoActivity) awS59S0100100_33.l0).LLJLLIL);
        jSONObject.put("duration2", awS59S0100100_33.j1 - ((EcTakePhotoActivity) awS59S0100100_33.l0).LLJZ);
        EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) awS59S0100100_33.l0;
        jSONObject.put("duration3", ecTakePhotoActivity.LLJZ - ecTakePhotoActivity.LLJLLIL);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS59S0100100_33 awS59S0100100_33, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("has_request_permission", ((EcTakePhotoActivity) awS59S0100100_33.l0).LLLIIIIL ? 1 : 0);
        EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) awS59S0100100_33.l0;
        jSONObject.put("duration2", ecTakePhotoActivity.LLJZ - ecTakePhotoActivity.LLJLLIL);
        EcTakePhotoActivity ecTakePhotoActivity2 = (EcTakePhotoActivity) awS59S0100100_33.l0;
        jSONObject.put("duration3", ecTakePhotoActivity2.LLJLLL - ecTakePhotoActivity2.LLJZ);
        jSONObject.put("duration4", awS59S0100100_33.j1 - ((EcTakePhotoActivity) awS59S0100100_33.l0).LLJLLL);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS59S0100100_33(long r3, com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            if (r6 == 0) goto Le
            r1 = r2
            r1.l0 = r5
            r1.j1 = r3
            r0 = 1
        La:
            r1.<init>(r0)
            return
        Le:
            r1 = r2
            r1.j1 = r3
            r1.l0 = r5
            r0 = 1
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS59S0100100_33.<init>(long, com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity, int):void");
    }
}
