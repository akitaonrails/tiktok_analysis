package ttpobfuscated;

import X.C13LE;
import X.C15438062q;
import X.C2097608Jq;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ttp.orbu.sdk.logging.LogEntry;
import ttp.orbu.sdk.logging.LogParams;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class k4 {
    public static final k4 a = new k4();

    public final String a(fg<? extends b2> fgVar) throws JSONException {
        JSONObject jSONObject;
        if (fgVar instanceof b9) {
            jSONObject = ((b9) fgVar).m.j();
        } else if (fgVar instanceof dd) {
            jSONObject = ((dd) fgVar).m.l();
        } else {
            jSONObject = new JSONObject(fgVar.b());
        }
        return a(jSONObject, fgVar.a().toString(), fgVar.d(), fgVar.h(), true);
    }

    public final JSONObject a(String str, String str2, Date date, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("operatingSystem", "android");
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, str);
        jSONObject.put("kind", str2);
        jSONObject.put("timestamp", o3.c(date, null, null, 3, null));
        jSONObject.put("sent", z);
        return jSONObject;
    }

    public final LogParams a(List<? extends fg<? extends b2>> list, String str, Map<String, String> map, Map<String, String> map2, String str2) {
        String str3 = str2;
        q3.a aVar = q3.a;
        q3.b.a(aVar, "Transform to LogParams", C13LE.LIZ(k4.class).LJI(), (Throwable) null, 4, (Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        if (str3 == null || !(!kotlin.text.a0.LJJJIL(str3))) {
            aVar.getClass();
            if (q3.a.d) {
                str3 = "testLogId1";
            } else {
                str3 = "logId1";
            }
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (fg<? extends b2> fgVar : list) {
            arrayList.add(new LogEntry(fgVar.a().toString(), a.a(fgVar), fgVar.h()));
        }
        return new LogParams(arrayList, x3.d(), str, null, null, linkedHashMap, str3);
    }

    public final String a(JSONObject jSONObject, String str, String str2, Date date, boolean z) throws JSONException {
        JSONObject jSONObjectA = a(str, str2, date, z);
        jSONObjectA.put("metadata", jSONObject);
        return C786410Ut5.J3(jSONObjectA);
    }

    public static /* synthetic */ JSONObject a(k4 k4Var, String str, String str2, Date date, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return k4Var.a(str, str2, date, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogParams a(k4 k4Var, List list, String str, Map map, Map map2, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            map = C2097608Jq.LJ();
        }
        if ((i & 8) != 0) {
            map2 = C2097608Jq.LJ();
        }
        return k4Var.a((List<? extends fg<? extends b2>>) list, str, (Map<String, String>) map, (Map<String, String>) map2, str2);
    }

    public static /* synthetic */ String a(k4 k4Var, JSONObject jSONObject, String str, String str2, Date date, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        return k4Var.a(jSONObject, str, str2, date, z);
    }
}
