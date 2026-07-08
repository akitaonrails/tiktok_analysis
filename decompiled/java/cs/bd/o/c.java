package cs.bd.o;

import X.C0VCC;
import X.C0VCZ;
import X.C2110608Oq;
import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends cs.bd.o.a {
    public C0VCC LIZIZ;

    public class a implements C0VCZ {
        public final /* synthetic */ JSONObject LIZ;
        public final /* synthetic */ String LIZIZ;

        public a(JSONObject jSONObject, String str) {
            this.LIZ = jSONObject;
            this.LIZIZ = str;
        }

        @Override // X.C0VCZ
        public final Map<String, String> getCommonParams() {
            HashMap map = new HashMap();
            try {
                map.put("oversea", JSONObjectProtectorUtils.getBoolean(this.LIZ, "oversea") ? "1" : CardStruct.IStatusCode.DEFAULT);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            map.put("host_aid", this.LIZIZ);
            return map;
        }

        @Override // X.C0VCZ
        public final String getSessionId() {
            return null;
        }
    }

    @Override // cs.bd.o.a
    public final void LIZJ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.LIZIZ == null) {
            return;
        }
        if (jSONObject.length() > 0 || jSONObject2.length() > 0) {
            this.LIZIZ.LJIIJ(str, jSONObject, jSONObject2, jSONObject3);
        }
    }

    @Override // cs.bd.o.a
    public final boolean LIZLLL(String str) {
        JSONObject jSONObject;
        String string;
        Context context = C2110608Oq.LIZIZ.LIZ;
        String string2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            string = JSONObjectProtectorUtils.getString(jSONObject, "sdk_aid");
        } catch (JSONException e2) {
            e = e2;
            string = null;
        }
        try {
            string2 = JSONObjectProtectorUtils.getString(jSONObject, "host_aid");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "configURLs");
            JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject, "reportURLs");
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
            }
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(JSONArrayProtectorUtils.getString(jSONArray2, i2));
            }
            if (arrayList.size() <= 0 || arrayList2.size() <= 0) {
                return false;
            }
            SDKMonitorUtils.setConfigUrl(string, arrayList);
            SDKMonitorUtils.setDefaultReportUrl(string, arrayList2);
        } catch (JSONException e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
        }
        jSONObject.remove("configURLs");
        jSONObject.remove("reportURLs");
        SDKMonitorUtils.initMonitor(context, string, jSONObject, new a(jSONObject, string2));
        this.LIZIZ = SDKMonitorUtils.getInstance(string);
        return true;
    }

    @Override // cs.bd.o.a
    public final void LJ(long j, long j2, String str, String str2, int i) {
        C0VCC c0vcc = this.LIZIZ;
        if (c0vcc == null) {
            return;
        }
        c0vcc.LJIIIZ(j, j2, str, str2, i);
    }

    @Override // cs.bd.o.a
    public final void LJFF(long j, long j2, String str, String str2, int i) {
        C0VCC c0vcc = this.LIZIZ;
        if (c0vcc == null) {
            return;
        }
        c0vcc.LJIIJJI(j, j2, str, str2, i);
    }
}
