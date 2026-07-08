package ttpobfuscated;

import X.C2097608Jq;
import X.C786410Ut5;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ttp.orbu.sdk.repository.model.DBEvent;
import ttpobfuscated.b2;
import ttpobfuscated.zb;

/* JADX INFO: loaded from: classes24.dex */
public final class b9 implements fg<b> {
    public static final a p = new a();
    public final UUID k;
    public final Date l;
    public final b m;
    public final String n = "orbuCodeLog";
    public final zb.a o = zb.a.h;

    public static final class b implements b2 {
        public static final a h = new a();
        public final String a;
        public final String b;
        public final int c;
        public final int d;
        public final String e;
        public final Map<String, String> f;
        public final Map<String, String> g;

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bucketId", this.a);
            jSONObject.put("actualBucketId", this.b);
            jSONObject.put("reasonCode", this.d);
            jSONObject.put("frequencyId", this.c);
            jSONObject.put("requestType", this.e);
            if (!this.f.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, String> entry : this.f.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("genericPayloadItems", jSONObject2);
            }
            if (!this.g.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, String> entry2 : this.g.entrySet()) {
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject.put("specificPayloadItems", jSONObject3);
            }
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + m2.a(this.e, (this.d + ((this.c + m2.a(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31, 31)) * 31);
        }

        public final JSONObject j() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("o1", this.a);
            jSONObject.put("o2", this.d);
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : this.f.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("o3", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : this.g.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject.put("o4", jSONObject3);
            return jSONObject;
        }

        public String toString() {
            return "Metadata(bucketId=" + this.a + ", actualBucketId=" + this.b + ", frequencyId=" + this.c + ", reasonCode=" + this.d + ", requestType=" + this.e + ", genericPayloadItems=" + this.f + ", specificPayloadItems=" + this.g + ')';
        }

        @Override // ttpobfuscated.b2
        public String a() {
            return b();
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final int e() {
            return this.c;
        }

        public final int f() {
            return this.d;
        }

        public final String g() {
            return this.e;
        }

        public final Map<String, String> h() {
            return this.f;
        }

        public final Map<String, String> i() {
            return this.g;
        }

        public final String k() {
            return this.b;
        }

        public final String l() {
            return this.a;
        }

        public final int m() {
            return this.c;
        }

        public final Map<String, String> n() {
            return this.f;
        }

        public final int o() {
            return this.d;
        }

        public final String p() {
            return this.e;
        }

        public final Map<String, String> q() {
            return this.g;
        }

        public static final class a implements b2.a<b> {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r10v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
            @Override // ttpobfuscated.b2.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(String str) {
                ?? LJ;
                ?? LJ2;
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObjectE = q4.e(jSONObject, "genericPayloadItems");
                if (jSONObjectE != null) {
                    c9[] c9VarArrValues = c9.values();
                    LJ = new LinkedHashMap();
                    for (c9 c9Var : c9VarArrValues) {
                        String strF = q4.f(jSONObjectE, String.valueOf(c9Var.a));
                        if (strF != null) {
                            LJ.put(String.valueOf(c9Var.a), strF);
                        }
                    }
                } else {
                    LJ = C2097608Jq.LJ();
                }
                JSONObject jSONObjectE2 = q4.e(jSONObject, "specificPayloadItems");
                if (jSONObjectE2 != null) {
                    f9[] f9VarArrValues = f9.values();
                    LJ2 = new LinkedHashMap();
                    for (f9 f9Var : f9VarArrValues) {
                        String strF2 = q4.f(jSONObjectE2, String.valueOf(f9Var.a));
                        if (strF2 != null) {
                            LJ2.put(String.valueOf(f9Var.a), strF2);
                        }
                    }
                } else {
                    LJ2 = C2097608Jq.LJ();
                }
                return new b(JSONObjectProtectorUtils.getString(jSONObject, "bucketId"), JSONObjectProtectorUtils.getString(jSONObject, "actualBucketId"), JSONObjectProtectorUtils.getInt(jSONObject, "frequencyId"), JSONObjectProtectorUtils.getInt(jSONObject, "reasonCode"), JSONObjectProtectorUtils.getString(jSONObject, "requestType"), LJ, LJ2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Intrinsics.LJFF(this.a, bVar.a) && Intrinsics.LJFF(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && Intrinsics.LJFF(this.e, bVar.e) && Intrinsics.LJFF(this.f, bVar.f) && Intrinsics.LJFF(this.g, bVar.g)) {
                return true;
            }
            return false;
        }

        public b(String str, String str2, int i, int i2, String str3, Map<String, String> map, Map<String, String> map2) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = i2;
            this.e = str3;
            this.f = map;
            this.g = map2;
        }

        public final b a(String str, String str2, int i, int i2, String str3, Map<String, String> map, Map<String, String> map2) {
            return new b(str, str2, i, i2, str3, map, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, String str, String str2, int i, int i2, String str3, Map map, Map map2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = bVar.a;
            }
            if ((i3 & 2) != 0) {
                str2 = bVar.b;
            }
            if ((i3 & 4) != 0) {
                i = bVar.c;
            }
            if ((i3 & 8) != 0) {
                i2 = bVar.d;
            }
            if ((i3 & 16) != 0) {
                str3 = bVar.e;
            }
            if ((i3 & 32) != 0) {
                map = bVar.f;
            }
            if ((i3 & 64) != 0) {
                map2 = bVar.g;
            }
            return bVar.a(str, str2, i, i2, str3, map, map2);
        }
    }

    @Override // ttpobfuscated.fg
    public String f() {
        return "android";
    }

    @Override // ttpobfuscated.fg
    public String b() {
        return e().a();
    }

    @Override // ttpobfuscated.fg
    public String g() {
        return e().b();
    }

    @Override // ttpobfuscated.fg
    public UUID a() {
        return this.k;
    }

    @Override // ttpobfuscated.fg
    public zb c() {
        return this.o;
    }

    @Override // ttpobfuscated.fg
    public String d() {
        return this.n;
    }

    @Override // ttpobfuscated.fg
    public b2 e() {
        return this.m;
    }

    @Override // ttpobfuscated.fg
    public Date h() {
        return this.l;
    }

    public zb.a i() {
        return this.o;
    }

    public b j() {
        return this.m;
    }

    public static final class a implements c4<b9> {
        @Override // ttpobfuscated.c4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b9 a(DBEvent dBEvent) {
            return new b9(dBEvent.a, dBEvent.b, b.h.a(dBEvent.d));
        }
    }

    public b9(UUID uuid, Date date, b bVar) {
        this.k = uuid;
        this.l = date;
        this.m = bVar;
    }
}
