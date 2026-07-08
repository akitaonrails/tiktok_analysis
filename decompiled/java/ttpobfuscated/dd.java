package ttpobfuscated;

import X.C2097608Jq;
import X.C786410Ut5;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
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
public final class dd implements fg<b> {
    public static final a p = new a();
    public final UUID k;
    public final Date l;
    public final b m;
    public final String n = "sample";
    public final zb.a o = zb.a.h;

    public static final class b implements b2 {
        public static final a j = new a();
        public final String a;
        public final String b;
        public final int c;
        public final long d;
        public final String e;
        public final Map<String, String> f;
        public String g;
        public final String h;
        public final Map<String, String> i;

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bucketId", this.a);
            jSONObject.put("actualBucketId", this.b);
            jSONObject.put("frequencyId", this.c);
            jSONObject.put("startTime", this.d);
            jSONObject.put("requestType", this.e);
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : this.f.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("requestMetadata", jSONObject2);
            jSONObject.put("data", this.g);
            jSONObject.put("clientIdentifier", this.h);
            if (!this.i.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, String> entry2 : this.i.entrySet()) {
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject.put("o3", jSONObject3);
            }
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            return this.i.hashCode() + m2.a(this.h, m2.a(this.g, (this.f.hashCode() + m2.a(this.e, (C786410Ut5.Y2(this.d) + ((this.c + m2.a(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31, 31)) * 31, 31), 31);
        }

        public final JSONObject l() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bucketId", this.a);
            jSONObject.put("actualBucketId", this.b);
            jSONObject.put("frequencyId", this.c);
            jSONObject.put("startTime", o3.a(this.d));
            jSONObject.put("requestType", this.e);
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : this.f.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("requestMetadata", jSONObject2);
            jSONObject.putOpt("data", this.g);
            jSONObject.put("clientIdentifier", this.h);
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : this.i.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject.put("o3", jSONObject3);
            return jSONObject;
        }

        public String toString() {
            return "Metadata(bucketId=" + this.a + ", actualBucketId=" + this.b + ", frequencyId=" + this.c + ", startTime=" + this.d + ", requestType=" + this.e + ", requestMetadata=" + this.f + ", data=" + this.g + ", clientIdentifier=" + this.h + ", genericPayloadItems=" + this.i + ')';
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

        public final long f() {
            return this.d;
        }

        public final String g() {
            return this.e;
        }

        public final Map<String, String> h() {
            return this.f;
        }

        public final String i() {
            return this.g;
        }

        public final String j() {
            return this.h;
        }

        public final Map<String, String> k() {
            return this.i;
        }

        public final String m() {
            return this.b;
        }

        public final String n() {
            return this.a;
        }

        public final String o() {
            return this.h;
        }

        public final String p() {
            return this.g;
        }

        public final int q() {
            return this.c;
        }

        public final Map<String, String> r() {
            return this.i;
        }

        public final Map<String, String> s() {
            return this.f;
        }

        public final String t() {
            return this.e;
        }

        public final long u() {
            return this.d;
        }

        public static final class a implements b2.a<b> {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r12v1, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r12v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
            @Override // ttpobfuscated.b2.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(String str) {
                ?? LJ;
                Map<String, String> mapLJ;
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObjectE = q4.e(jSONObject, "o3");
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
                String string = JSONObjectProtectorUtils.getString(jSONObject, "bucketId");
                String string2 = JSONObjectProtectorUtils.getString(jSONObject, "actualBucketId");
                int i = JSONObjectProtectorUtils.getInt(jSONObject, "frequencyId");
                long j = JSONObjectProtectorUtils.getLong(jSONObject, "startTime");
                String string3 = JSONObjectProtectorUtils.getString(jSONObject, "requestType");
                JSONObject jSONObjectE2 = q4.e(jSONObject, "requestMetadata");
                if (jSONObjectE2 == null || (mapLJ = b8.c(jSONObjectE2)) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                String strF2 = q4.f(jSONObject, "data");
                String str2 = "";
                if (strF2 == null) {
                    strF2 = "";
                }
                String strF3 = q4.f(jSONObject, "clientIdentifier");
                if (strF3 != null) {
                    str2 = strF3;
                }
                return new b(string, string2, i, j, string3, mapLJ, strF2, str2, LJ);
            }
        }

        public final void a(String str) {
            this.g = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Intrinsics.LJFF(this.a, bVar.a) && Intrinsics.LJFF(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && Intrinsics.LJFF(this.e, bVar.e) && Intrinsics.LJFF(this.f, bVar.f) && Intrinsics.LJFF(this.g, bVar.g) && Intrinsics.LJFF(this.h, bVar.h) && Intrinsics.LJFF(this.i, bVar.i)) {
                return true;
            }
            return false;
        }

        public b(String str, String str2, int i, long j2, String str3, Map<String, String> map, String str4, String str5, Map<String, String> map2) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = j2;
            this.e = str3;
            this.f = map;
            this.g = str4;
            this.h = str5;
            this.i = map2;
        }

        public final b a(String str, String str2, int i, long j2, String str3, Map<String, String> map, String str4, String str5, Map<String, String> map2) {
            return new b(str, str2, i, j2, str3, map, str4, str5, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, String str, String str2, int i, long j2, String str3, Map map, String str4, String str5, Map map2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = bVar.a;
            }
            if ((i2 & 2) != 0) {
                str2 = bVar.b;
            }
            if ((i2 & 4) != 0) {
                i = bVar.c;
            }
            if ((i2 & 8) != 0) {
                j2 = bVar.d;
            }
            if ((i2 & 16) != 0) {
                str3 = bVar.e;
            }
            if ((i2 & 32) != 0) {
                map = bVar.f;
            }
            if ((i2 & 64) != 0) {
                str4 = bVar.g;
            }
            if ((i2 & 128) != 0) {
                str5 = bVar.h;
            }
            if ((i2 & 256) != 0) {
                map2 = bVar.i;
            }
            return bVar.a(str, str2, i, j2, str3, map, str4, str5, map2);
        }
    }

    @Override // ttpobfuscated.fg
    public String f() {
        return "android";
    }

    @Override // ttpobfuscated.fg
    public String g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("$schema", "http://example.com/schemas/events/event.schema.json");
        jSONObject.put("operatingSystem", "android");
        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, this.k);
        jSONObject.put("kind", this.n);
        jSONObject.put("timestamp", o3.c(this.l, null, null, 3, null));
        jSONObject.put("sent", false);
        jSONObject.put("metadata", this.m.l());
        return C786410Ut5.J3(jSONObject);
    }

    public int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + (this.k.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "SampleEvent(id=" + this.k + ", timestamp=" + this.l + ", metadata=" + this.m + ')';
    }

    @Override // ttpobfuscated.fg
    public String b() {
        return e().a();
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

    public final UUID i() {
        return this.k;
    }

    public final Date j() {
        return this.l;
    }

    public final b k() {
        return this.m;
    }

    public zb.a l() {
        return this.o;
    }

    public b m() {
        return this.m;
    }

    public static final class a implements c4<dd> {
        @Override // ttpobfuscated.c4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public dd a(DBEvent dBEvent) {
            return new dd(dBEvent.a, dBEvent.b, b.j.a(dBEvent.d));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj;
        if (Intrinsics.LJFF(this.k, ddVar.k) && Intrinsics.LJFF(this.l, ddVar.l) && Intrinsics.LJFF(this.m, ddVar.m)) {
            return true;
        }
        return false;
    }

    public dd(UUID uuid, Date date, b bVar) {
        this.k = uuid;
        this.l = date;
        this.m = bVar;
    }

    public final dd a(UUID uuid, Date date, b bVar) {
        return new dd(uuid, date, bVar);
    }

    public static dd a(dd ddVar, UUID uuid, Date date, b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = ddVar.k;
        }
        if ((i & 2) != 0) {
            date = ddVar.l;
        }
        if ((i & 4) != 0) {
            bVar = ddVar.m;
        }
        return ddVar.a(uuid, date, bVar);
    }
}
