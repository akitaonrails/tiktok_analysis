package com.ss.android.common.applog;

import X.C1BF2;
import X.C786410Ut5;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class EventVerify {
    public static volatile EventVerify sInstance;
    public C1BF2 mIEventsSender = new C1BF2() { // from class: X.1BF4
        @Override // X.C1BF2
        public final boolean isEnable() {
            return C1BF3.LIZIZ(String.valueOf(DeviceRegisterManager.getAppId()));
        }

        @Override // X.C1BF2
        public final void LIZJ(List<String> list) {
            C1BF3.LJII(String.valueOf(DeviceRegisterManager.getAppId()), list);
        }

        @Override // X.C1BF2
        public final void LJ(long j) {
            C1BF3.LJFF(j, String.valueOf(DeviceRegisterManager.getAppId()));
        }

        @Override // X.C1BF2
        public final void LJFF(String str) {
            C1BF3.LJ(String.valueOf(DeviceRegisterManager.getAppId()), str);
        }

        @Override // X.C1BF2
        public final void LIZ(String str, Context context) {
            C1BF3.LIZJ(context, String.valueOf(DeviceRegisterManager.getAppId()), str);
        }

        @Override // X.C1BF2
        public final void LIZIZ(String str, JSONArray jSONArray) {
            C1BF3.LIZLLL(String.valueOf(DeviceRegisterManager.getAppId()), str, jSONArray);
        }

        @Override // X.C1BF2
        public final void LIZLLL(boolean z, Context context) {
            C1BF3.LJI(context, String.valueOf(DeviceRegisterManager.getAppId()), z);
        }
    };

    public static EventVerify inst() {
        if (sInstance == null) {
            synchronized (EventVerify.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new EventVerify();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public boolean isEnable() {
        return this.mIEventsSender.isEnable();
    }

    private void setEventVerifyInterval(long j) {
        this.mIEventsSender.LJ(j);
    }

    public void setEventVerifyUrl(String str) {
        this.mIEventsSender.LJFF(str);
    }

    public void setSpecialKeys(List<String> list) {
        this.mIEventsSender.LIZJ(list);
    }

    public void loginEtWithScheme(String str, Context context) {
        this.mIEventsSender.LIZ(str, context);
    }

    public void putEvent(String str, JSONArray jSONArray) {
        this.mIEventsSender.LIZIZ(str, jSONArray);
    }

    public synchronized void setEnable(boolean z, Context context) {
        this.mIEventsSender.LIZLLL(z, context);
    }

    public void putEvent(String str, String str2, String str3, long j, long j2, long j3, long j4, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String str4;
        if (!isEnable()) {
            return;
        }
        if (jSONObject != null) {
            try {
                jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject2 = new JSONObject();
            }
        } else {
            jSONObject2 = new JSONObject();
        }
        if ("event_v3".equals(str)) {
            jSONObject3 = new JSONObject();
            str4 = "event_v3";
        } else {
            jSONObject3 = jSONObject2;
            str4 = "event";
        }
        try {
            if ("event_v3".equals(str)) {
                if (jSONObject2.has("nt")) {
                    jSONObject3.put("nt", jSONObject2.optInt("nt"));
                }
                jSONObject2.remove("nt");
                jSONObject2.remove("_event_v3");
                if (jSONObject2.has("ab_sdk_version")) {
                    jSONObject3.put("ab_sdk_version", jSONObject2.optString("ab_sdk_version"));
                    jSONObject2.remove("ab_sdk_version");
                }
                jSONObject3.put("event", str2);
                jSONObject3.put("params", jSONObject2);
                jSONObject3.put("local_time_ms", j4);
            } else {
                jSONObject3.put("category", str);
                jSONObject3.put("tag", str2);
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject3.put("label", str3);
                }
                if (j != 0) {
                    jSONObject3.put("value", j);
                }
                if (j2 != 0) {
                    jSONObject3.put("ext_value", j2);
                }
            }
            if (j3 > 0) {
                jSONObject3.put("user_id", j3);
            }
            String userUniqueId = AppLog.getUserUniqueId();
            if (!TextUtils.isEmpty(userUniqueId)) {
                jSONObject3.put("user_unique_id", userUniqueId);
            }
            jSONObject3.put("session_id", AppLog.getCurrentSessionId());
            jSONObject3.put("datetime", AppLog.formatDate(j4));
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject3);
        putEvent(str4, jSONArray);
    }
}
