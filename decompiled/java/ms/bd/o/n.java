package ms.bd.o;

import X.C0VCC;
import X.C0VCZ;
import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends m {
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
                map.put(k.a(16777217, 0, 0L, "d6e4a6", new byte[]{122, 34, 19, 82, 77, 36, 102}), JSONObjectProtectorUtils.getBoolean(this.LIZ, (String) k.a(16777217, 0, 0L, "cd0ba0", new byte[]{125, 112, 70, 4, 77, 34, 97})) ? k.a(16777217, 0, 0L, "76bf66", new byte[]{119}) : k.a(16777217, 0, 0L, "4653ac", new byte[]{117}));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                k.a(16777217, 0, 0L, "9e5fb7", new byte[]{59, 98, 75, 45, 90, 51});
            }
            map.put(k.a(16777217, 0, 0L, "bb97be", new byte[]{123, 111, 89, 87, 98, 115, 104, 71}), this.LIZIZ);
            return map;
        }

        @Override // X.C0VCZ
        public final String getSessionId() {
            return null;
        }
    }

    @Override // ms.bd.o.m
    public final void LIZJ(long j, long j2, String str, String str2, int i) {
        C0VCC c0vcc = this.LIZIZ;
        if (c0vcc == null) {
            return;
        }
        c0vcc.LJIIIZ(j, j2, str, str2, i);
    }

    @Override // ms.bd.o.m
    public final void LIZLLL(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.LIZIZ == null) {
            return;
        }
        if (jSONObject.length() > 0 || jSONObject2.length() > 0) {
            this.LIZIZ.LJIIJ(str, jSONObject, jSONObject2, jSONObject3);
        }
    }

    @Override // ms.bd.o.m
    public final void LJFF(long j, long j2, String str, String str2, int i) {
        C0VCC c0vcc = this.LIZIZ;
        if (c0vcc == null) {
            return;
        }
        c0vcc.LJIIJJI(j, j2, str, str2, i);
    }

    @Override // ms.bd.o.m
    public final boolean LJ(String str) {
        JSONObject jSONObject;
        String str2;
        String string;
        Context context = ms.bd.o.a.LIZIZ.LIZ;
        String string2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            k.a(16777217, 0, 0L, "83c772", new byte[]{58, 52, 29});
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            string = JSONObjectProtectorUtils.getString(jSONObject, (String) k.a(16777217, 0, 0L, "8adc88", new byte[]{58, 103, 28, 40, 6, 38, 63}));
            try {
                string2 = JSONObjectProtectorUtils.getString(jSONObject, (String) k.a(16777217, 0, 0L, "d3cf15", new byte[]{125, 62, 3, 6, 49, 35, 110, 22}));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, (String) k.a(16777217, 0, 0L, "78064b", new byte[]{37, 53, 77, 68, 2, 114, 1, 43, 77, 117}));
                JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject, (String) k.a(16777217, 0, 0L, "211c18", new byte[]{49, 54, 82, 24, 28, 59, 4, 34, 76, 32}));
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
            } catch (JSONException e2) {
                e = e2;
                str2 = string2;
                string2 = string;
                TryCatchGuardChecker.doCheck(e);
                k.a(16777217, 0, 0L, "bc5551", new byte[]{96, 100, 75, 126, 3});
                string = string2;
                string2 = str2;
            }
        } catch (JSONException e3) {
            e = e3;
            str2 = null;
        }
        jSONObject.remove((String) k.a(16777217, 0, 0L, "9a2df6", new byte[]{43, 108, 79, 22, 80, 38, 15, 114, 79, 39}));
        jSONObject.remove((String) k.a(16777217, 0, 0L, "bd4e11", new byte[]{97, 99, 87, 30, 28, 50, 84, 119, 73, 38}));
        SDKMonitorUtils.initMonitor(context, string, jSONObject, new a(jSONObject, string2));
        this.LIZIZ = SDKMonitorUtils.getInstance(string);
        return true;
    }
}
