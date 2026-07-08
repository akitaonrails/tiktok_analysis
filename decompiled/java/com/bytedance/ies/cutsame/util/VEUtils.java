package com.bytedance.ies.cutsame.util;

import X.C01GW;
import X.C2188811AlT;
import X.C2491509pZ;
import X.C452501pT;
import X.InterfaceC2491409pY;
import Y.AObjectS56S0000000_3;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VECurveSpeedUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class VEUtils {
    public static final VEUtils LIZ = new VEUtils();
    public static final C01GW LIZIZ;

    static {
        new ConcurrentHashMap();
        LIZIZ = C452501pT.LIZIZ(new AObjectS56S0000000_3(6));
    }

    public final float calculateAveCurveSpeed(String str) {
        C2491509pZ.LIZ("VEUtils", "calculateAveCurveSpeed: ");
        if (TextUtils.isEmpty(str)) {
            InterfaceC2491409pY interfaceC2491409pY = C2491509pZ.LIZ;
            if (interfaceC2491409pY != null) {
                interfaceC2491409pY.LJ("VEUtils", "curveParamJson is empty");
                return -19.0f;
            }
            return -19.0f;
        }
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(new JSONObject(str), "speed_points");
            int length = jSONArray.length();
            float[] fArr = new float[length];
            float[] fArr2 = new float[length];
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                float f = (float) JSONObjectProtectorUtils.getDouble(jSONObject, "x");
                float f2 = (float) JSONObjectProtectorUtils.getDouble(jSONObject, "y");
                fArr[i] = f;
                fArr2[i] = f2;
            }
            double aveCurveSpeed = new VECurveSpeedUtils(VECurveSpeedUtils.transferTrimPointXtoSeqPointX(fArr, fArr2), fArr2).getAveCurveSpeed();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("curve speed");
            float f3 = (float) aveCurveSpeed;
            sbLIZ.append(f3);
            C2491509pZ.LIZ("VEUtils", C2188811AlT.LIZIZ(sbLIZ));
            return f3;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return 1.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0091 -> B:51:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0093 -> B:51:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String transGif2Png(java.lang.String r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.cutsame.util.VEUtils.transGif2Png(java.lang.String):java.lang.String");
    }
}
