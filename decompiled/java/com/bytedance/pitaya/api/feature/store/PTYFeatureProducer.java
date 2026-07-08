package com.bytedance.pitaya.api.feature.store;

import X.C1850990yGf;
import X.C786410Ut5;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public abstract class PTYFeatureProducer implements ReflectionCall {
    public static final C1850990yGf Companion = new Object() { // from class: X.0yGf
    };

    public abstract JSONObject getDictFeature(String str, JSONObject jSONObject);

    public double getDoubleFeature(String str, JSONObject jSONObject) {
        return 0.0d;
    }

    public abstract String getGroupName();

    public abstract float getNumericFeature(String str, JSONObject jSONObject);

    public abstract JSONArray getSeqFeature(String str, JSONObject jSONObject);

    public abstract String getStringFeature(String str, JSONObject jSONObject);

    private final JSONObject parseParams(String str) {
        boolean z;
        try {
            if (str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return new JSONObject(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    private final String getDictFeature(String str, String str2) {
        String strJ3 = null;
        try {
            JSONObject dictFeature = getDictFeature(str, parseParams(str2));
            if (dictFeature != null) {
                strJ3 = C786410Ut5.J3(dictFeature);
                return strJ3;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return strJ3;
    }

    private final double getDoubleFeature(String str, String str2) {
        try {
            return getDoubleFeature(str, parseParams(str2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0.0d;
        }
    }

    private final float getNumericFeature(String str, String str2) {
        try {
            return getNumericFeature(str, parseParams(str2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0.0f;
        }
    }

    private final String getSeqFeature(String str, String str2) {
        String string = null;
        try {
            JSONArray seqFeature = getSeqFeature(str, parseParams(str2));
            if (seqFeature != null) {
                string = seqFeature.toString();
                return string;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return string;
    }

    private final String getStringFeature(String str, String str2) {
        try {
            return getStringFeature(str, parseParams(str2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
