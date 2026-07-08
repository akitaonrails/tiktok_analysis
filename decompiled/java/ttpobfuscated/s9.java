package ttpobfuscated;

import X.C786410Ut5;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ttp.orbu.sdk.repository.model.DBEvent;
import ttpobfuscated.b2;
import ttpobfuscated.zb;

/* JADX INFO: loaded from: classes24.dex */
public final class s9 implements fg<b> {
    public static final a p = new a();
    public final UUID k;
    public final Date l;
    public final b m;
    public final String n = "nativeNetworkValidation";
    public final zb.a o = zb.a.h;

    /* JADX INFO: loaded from: classes14.dex */
    public static final class b implements b2 {
        public static final a h = new a();
        public final int a;
        public final int b;
        public final int c;
        public final String d;
        public final String e;
        public final Map<String, Object> f;
        public final Map<String, Object> g;

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventType", this.a);
            jSONObject.put("dataFlowId", this.b);
            jSONObject.put("codeOffset", this.c);
            String str = this.d;
            if (str != null) {
                jSONObject.put("requestMethod", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("usAccounts", str2);
            }
            if (this.f != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Object> entry : this.f.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("headers", jSONObject2);
            }
            if (this.g != null) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, Object> entry2 : this.g.entrySet()) {
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject.put("metadata", jSONObject3);
            }
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            int i = (this.c + ((this.b + (this.a * 31)) * 31)) * 31;
            String str = this.d;
            int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, Object> map = this.f;
            int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, Object> map2 = this.g;
            return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
        }

        public String toString() {
            return "Metadata(eventType=" + this.a + ", dataFlowId=" + this.b + ", codeOffset=" + this.c + ", requestMethod=" + this.d + ", url=" + this.e + ", headers=" + this.f + ", metadata=" + this.g + ')';
        }

        @Override // ttpobfuscated.b2
        public String a() {
            return b();
        }

        public final int c() {
            return this.a;
        }

        public final int d() {
            return this.b;
        }

        public final int e() {
            return this.c;
        }

        public final String f() {
            return this.d;
        }

        public final String g() {
            return this.e;
        }

        public final Map<String, Object> h() {
            return this.f;
        }

        public final Map<String, Object> i() {
            return this.g;
        }

        public final int j() {
            return this.c;
        }

        public final int k() {
            return this.b;
        }

        public final int l() {
            return this.a;
        }

        public final Map<String, Object> m() {
            return this.f;
        }

        public final Map<String, Object> n() {
            return this.g;
        }

        public final String o() {
            return this.d;
        }

        public final String p() {
            return this.e;
        }

        public static final class a implements b2.a<b> {
            @Override // ttpobfuscated.b2.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(String str) {
                Map<String, String> mapC;
                JSONObject jSONObject = new JSONObject(str);
                int i = JSONObjectProtectorUtils.getInt(jSONObject, "eventType");
                int i2 = JSONObjectProtectorUtils.getInt(jSONObject, "dataFlowId");
                int i3 = JSONObjectProtectorUtils.getInt(jSONObject, "codeOffset");
                String strF = q4.f(jSONObject, "requestMethod");
                String strF2 = q4.f(jSONObject, "usAccounts");
                JSONObject jSONObjectE = q4.e(jSONObject, "headers");
                Map<String, String> mapC2 = null;
                if (jSONObjectE != null) {
                    mapC = b8.c(jSONObjectE);
                } else {
                    mapC = null;
                }
                JSONObject jSONObjectE2 = q4.e(jSONObject, "metadata");
                if (jSONObjectE2 != null) {
                    mapC2 = b8.c(jSONObjectE2);
                }
                return new b(i, i2, i3, strF, strF2, mapC, mapC2);
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
            if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && Intrinsics.LJFF(this.d, bVar.d) && Intrinsics.LJFF(this.e, bVar.e) && Intrinsics.LJFF(this.f, bVar.f) && Intrinsics.LJFF(this.g, bVar.g)) {
                return true;
            }
            return false;
        }

        public b(int i, int i2, int i3, String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = str;
            this.e = str2;
            this.f = map;
            this.g = map2;
        }

        public final b a(int i, int i2, int i3, String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
            return new b(i, i2, i3, str, str2, map, map2);
        }

        public static b a(b bVar, int i, int i2, int i3, String str, String str2, Map map, Map map2, int i4, Object obj) {
            Map map3 = map2;
            Map map4 = map;
            String str3 = str2;
            String str4 = str;
            int i5 = i3;
            int i6 = i2;
            int i7 = i;
            if ((i4 & 1) != 0) {
                i7 = bVar.a;
            }
            if ((i4 & 2) != 0) {
                i6 = bVar.b;
            }
            if ((i4 & 4) != 0) {
                i5 = bVar.c;
            }
            if ((i4 & 8) != 0) {
                str4 = bVar.d;
            }
            if ((i4 & 16) != 0) {
                str3 = bVar.e;
            }
            if ((i4 & 32) != 0) {
                map4 = bVar.f;
            }
            if ((i4 & 64) != 0) {
                map3 = bVar.g;
            }
            bVar.getClass();
            return new b(i7, i6, i5, str4, str3, map4, map3);
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

    /* JADX INFO: loaded from: classes14.dex */
    public static final class a implements c4<s9> {
        @Override // ttpobfuscated.c4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s9 a(DBEvent dBEvent) {
            return new s9(dBEvent.a, dBEvent.b, b.h.a(dBEvent.d));
        }
    }

    public s9(UUID uuid, Date date, b bVar) {
        this.k = uuid;
        this.l = date;
        this.m = bVar;
    }
}
