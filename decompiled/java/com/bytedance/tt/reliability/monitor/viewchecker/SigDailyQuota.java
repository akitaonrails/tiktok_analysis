package com.bytedance.tt.reliability.monitor.viewchecker;

import X.C786410Ut5;
import X.C810670Vr7;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class SigDailyQuota {
    public final Map<String, Integer> counters = new HashMap();
    public int currentDayKey = -1;
    public boolean loaded = false;
    public final int maxPerSigPerDay;
    public final SharedPreferences sp;

    private void ensureLoaded() {
        if (this.loaded) {
            return;
        }
        this.loaded = true;
        try {
            int i = todayKey();
            if (this.sp.getInt("day_key", -1) != i) {
                this.currentDayKey = i;
                this.sp.edit().clear().putInt("day_key", i).apply();
                return;
            }
            this.currentDayKey = i;
            String string = this.sp.getString("counters_json", null);
            if (string == null || string.isEmpty()) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.counters.put(next, Integer.valueOf(jSONObject.optInt(next, 0)));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private void persist() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Integer> entry : this.counters.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.sp.edit().putInt("day_key", this.currentDayKey).putString("counters_json", C786410Ut5.J3(jSONObject)).apply();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static int todayKey() {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(1) * LSPassThroughRecordSizeConfig.DEFAULT) + calendar.get(6);
    }

    public synchronized boolean tryAcquire(String str) {
        int iIntValue;
        if (str == null) {
            return false;
        }
        ensureLoaded();
        int i = todayKey();
        if (i != this.currentDayKey) {
            this.counters.clear();
            this.currentDayKey = i;
            this.sp.edit().clear().putInt("day_key", i).apply();
        }
        Integer num = this.counters.get(str);
        if (num == null) {
            iIntValue = 0;
        } else {
            iIntValue = num.intValue();
        }
        if (iIntValue >= this.maxPerSigPerDay) {
            return false;
        }
        this.counters.put(str, Integer.valueOf(iIntValue + 1));
        persist();
        return true;
    }

    public SigDailyQuota(Context context, int i) {
        this.sp = C810670Vr7.LIZJ(context, 0, "popup_trace_quota");
        this.maxPerSigPerDay = Math.max(1, i);
    }
}
