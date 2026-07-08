package ttpobfuscated;

import X.C13LP;
import X.C15438062q;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttp.orbu.sdk.repository.model.DBEvent;
import ttpobfuscated.b2;
import ttpobfuscated.zb;

/* JADX INFO: loaded from: classes24.dex */
public final class l2 implements fg<b> {
    public static final a p = new a();
    public final UUID k;
    public final Date l;
    public final b m;
    public final String n = "crashLog";
    public final zb.a o = zb.a.h;

    public static final class b implements b2 {
        public static final a d = new a();
        public List<g5> a;
        public final String b;
        public final xe c;

        public final JSONObject h() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientIdentifier", this.b);
            JSONArray jSONArray = new JSONArray();
            for (g5 g5Var : this.a) {
                String str = g5Var.a;
                String strLJJZZIII = kotlin.text.a0.LJJZZIII('/', str, str);
                String str2 = g5Var.a;
                String strLJJLJ = kotlin.text.a0.LJJLJ('/', str2, str2);
                xe xeVar = this.c;
                byte[] bArr = g5Var.d;
                String strA = bArr != null ? xeVar.a(bArr) : null;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("path", strLJJZZIII);
                jSONObject2.put("fileName", strLJJLJ);
                jSONObject2.put("operationType", g5Var.b);
                jSONObject2.put("isFolder", g5Var.c);
                jSONObject2.put("content", strA);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("logs", jSONArray);
            return jSONObject;
        }

        public int hashCode() {
            return this.c.hashCode() + m2.a(this.b, this.a.hashCode() * 31, 31);
        }

        public String toString() {
            return "Metadata(data=" + this.a + ", clientIdentifier=" + this.b + ", stringUtils=" + this.c + ')';
        }

        @Override // ttpobfuscated.b2
        public String a() {
            return b();
        }

        @Override // ttpobfuscated.b2
        public String b() {
            return C786410Ut5.J3(h());
        }

        public final List<g5> c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final xe e() {
            return this.c;
        }

        public final String f() {
            return this.b;
        }

        public final List<g5> g() {
            return this.a;
        }

        public static final class a implements b2.a<b> {
            @Override // ttpobfuscated.b2.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(String str) {
                List<Object> listA;
                g5 g5Var;
                Map map;
                byte[] bArrA;
                String str2;
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArrayD = q4.d(jSONObject, "logs");
                List listLLIIII = null;
                if (jSONArrayD != null && (listA = b8.a(jSONArrayD)) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listA, 10));
                    for (Object obj : listA) {
                        if ((obj instanceof Map) && (map = (Map) obj) != null) {
                            ye yeVar = ye.a;
                            Object obj2 = map.get("content");
                            if ((obj2 instanceof String) && (str2 = (String) obj2) != null) {
                                yeVar.getClass();
                                bArrA = ze.a(str2);
                            } else {
                                bArrA = null;
                            }
                            g5Var = new g5(((String) map.get("path")) + '/' + ((String) map.get("fileName")), d5.valueOf((String) map.get("operationType")), ((Boolean) map.get("isFolder")).booleanValue(), bArrA);
                        } else {
                            g5Var = null;
                        }
                        arrayList.add(g5Var);
                    }
                    listLLIIII = C13LP.LLIIII(arrayList);
                }
                String strF = q4.f(jSONObject, "clientIdentifier");
                if (strF == null) {
                    strF = "";
                }
                return new b(listLLIIII, strF, ye.a);
            }
        }

        public final void a(List<g5> list) {
            this.a = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Intrinsics.LJFF(this.a, bVar.a) && Intrinsics.LJFF(this.b, bVar.b) && Intrinsics.LJFF(this.c, bVar.c)) {
                return true;
            }
            return false;
        }

        public b(List<g5> list, String str, xe xeVar) {
            this.a = list;
            this.b = str;
            this.c = xeVar;
        }

        public final b a(List<g5> list, String str, xe xeVar) {
            return new b(list, str, xeVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, List list, String str, xe xeVar, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bVar.a;
            }
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            if ((i & 4) != 0) {
                xeVar = bVar.c;
            }
            return bVar.a(list, str, xeVar);
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
        jSONObject.put("sent", true);
        jSONObject.put("metadata", this.m.h());
        return C786410Ut5.J3(jSONObject);
    }

    public int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + (this.k.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "CrashlogEvent(id=" + this.k + ", timestamp=" + this.l + ", metadata=" + this.m + ')';
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

    public static final class a implements c4<l2> {
        @Override // ttpobfuscated.c4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l2 a(DBEvent dBEvent) {
            return new l2(dBEvent.a, dBEvent.b, b.d.a(dBEvent.d));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        if (Intrinsics.LJFF(this.k, l2Var.k) && Intrinsics.LJFF(this.l, l2Var.l) && Intrinsics.LJFF(this.m, l2Var.m)) {
            return true;
        }
        return false;
    }

    public l2(UUID uuid, Date date, b bVar) {
        this.k = uuid;
        this.l = date;
        this.m = bVar;
    }

    public final l2 a(UUID uuid, Date date, b bVar) {
        return new l2(uuid, date, bVar);
    }

    public static l2 a(l2 l2Var, UUID uuid, Date date, b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = l2Var.k;
        }
        if ((i & 2) != 0) {
            date = l2Var.l;
        }
        if ((i & 4) != 0) {
            bVar = l2Var.m;
        }
        return l2Var.a(uuid, date, bVar);
    }
}
