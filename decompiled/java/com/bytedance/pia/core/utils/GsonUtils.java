package com.bytedance.pia.core.utils;

import X.C01GW;
import X.C09CU;
import X.C09DL;
import X.C09EJ;
import X.C452501pT;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.q;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class GsonUtils {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C09EJ());
    public static final p LIZIZ = new p();

    public static final Gson LIZ() {
        return (Gson) LIZ.getValue();
    }

    public static final class JSONArrayAdapter extends TypeAdapter<JSONArray> {
        public static final JSONArrayAdapter LIZ = new JSONArrayAdapter();

        @Override // com.google.gson.TypeAdapter
        public final JSONArray read(C09CU c09cu) {
            GsonUtils.LIZIZ.getClass();
            k kVarLIZ = p.LIZ(c09cu);
            kVarLIZ.getClass();
            if (!(kVarLIZ instanceof h)) {
                return null;
            }
            return GsonUtils.LIZJ(kVarLIZ.LJIIL());
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, JSONArray jSONArray) throws IOException {
            GsonUtils.LJ(c09dl, jSONArray);
        }
    }

    public static final class JSONObjectAdapter extends TypeAdapter<JSONObject> {
        public static final JSONObjectAdapter LIZ = new JSONObjectAdapter();

        @Override // com.google.gson.TypeAdapter
        public final JSONObject read(C09CU c09cu) {
            GsonUtils.LIZIZ.getClass();
            k kVarLIZ = p.LIZ(c09cu);
            kVarLIZ.getClass();
            if (!(kVarLIZ instanceof n)) {
                return null;
            }
            return GsonUtils.LIZLLL(kVarLIZ.LJIILIIL());
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, JSONObject jSONObject) throws IOException {
            GsonUtils.LJFF(c09dl, jSONObject);
        }
    }

    public static final JSONArray LIZJ(h hVar) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (k kVar : hVar) {
            if (kVar instanceof n) {
                jSONArray.put(LIZLLL((n) kVar));
            } else if (kVar instanceof h) {
                jSONArray.put(LIZJ((h) kVar));
            } else if (kVar instanceof m) {
                jSONArray.put(JSONObject.NULL);
            } else if (kVar instanceof q) {
                q qVar = (q) kVar;
                Object obj = qVar.LL;
                if (obj instanceof Boolean) {
                    jSONArray.put(qVar.LJ());
                } else if (obj instanceof String) {
                    jSONArray.put(qVar.LJIL());
                } else if (obj instanceof Number) {
                    if (a0.LJJIJ(qVar.LJIJ().toString(), '.')) {
                        jSONArray.put(qVar.LJIJ().doubleValue());
                    } else {
                        jSONArray.put(qVar.LJIJ().longValue());
                    }
                }
            }
        }
        return jSONArray;
    }

    public static final JSONObject LIZLLL(n nVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Iterator<T> it2 = nVar.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str = (String) entry.getKey();
            k kVar = (k) entry.getValue();
            if (kVar instanceof n) {
                jSONObject.put(str, LIZLLL((n) kVar));
            } else if (kVar instanceof h) {
                jSONObject.put(str, LIZJ((h) kVar));
            } else if (kVar instanceof m) {
                jSONObject.put(str, JSONObject.NULL);
            } else if (kVar instanceof q) {
                q qVar = (q) kVar;
                Object obj = qVar.LL;
                if (obj instanceof Boolean) {
                    jSONObject.put(str, qVar.LJ());
                } else if (obj instanceof String) {
                    jSONObject.put(str, qVar.LJIL());
                } else if (obj instanceof Number) {
                    if (a0.LJJIJ(qVar.LJIJ().toString(), '.')) {
                        jSONObject.put(str, qVar.LJIJ().doubleValue());
                    } else {
                        jSONObject.put(str, qVar.LJIJ().longValue());
                    }
                }
            }
        }
        return jSONObject;
    }

    public static void LIZIZ(C09DL c09dl, Object obj) throws IOException {
        if (obj instanceof Boolean) {
            c09dl.LJJJJJL(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            c09dl.LJJJJ((Number) obj);
            return;
        }
        if (obj instanceof String) {
            c09dl.LJJJJJ((String) obj);
            return;
        }
        if (obj instanceof JSONObject) {
            LJFF(c09dl, (JSONObject) obj);
        } else if (obj instanceof JSONArray) {
            LJ(c09dl, (JSONArray) obj);
        } else {
            c09dl.LJIJJ();
        }
    }

    public static void LJ(C09DL c09dl, JSONArray jSONArray) throws IOException {
        c09dl.LIZIZ();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            LIZIZ(c09dl, jSONArray.opt(i));
        }
        c09dl.LJI();
    }

    public static void LJFF(C09DL c09dl, JSONObject jSONObject) throws IOException {
        c09dl.LIZLLL();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c09dl.LJIILLIIL(next);
            LIZIZ(c09dl, jSONObject.opt(next));
        }
        c09dl.LJII();
    }
}
