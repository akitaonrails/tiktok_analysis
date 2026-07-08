package ttpobfuscated;

import X.C15438062q;
import X.C2097608Jq;
import X.C786410Ut5;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
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
public final class g7 implements fg<b> {
    public static final a p = new a();
    public final UUID k;
    public final Date l;
    public final b m;
    public final String n = "heartbeat";
    public final zb.f o = new zb.f(604800000);

    /* JADX INFO: loaded from: classes14.dex */
    public static final class b implements b2 {
        public static final a j = new a();
        public final String a;
        public final String b;
        public final String c;
        public final List<jg> d;
        public final List<jg> e;
        public final List<jg> f;
        public final String g;
        public final Map<String, String> h;
        public final String i;

        @Override // ttpobfuscated.b2
        public String a() {
            return a(true);
        }

        @Override // ttpobfuscated.b2
        public String b() {
            return a(false);
        }

        public int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31)) * 31;
            String str4 = this.g;
            return this.i.hashCode() + ((this.h.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Metadata(userId=");
            sb.append(this.a);
            sb.append(", deviceId=");
            sb.append(this.b);
            sb.append(", region=");
            sb.append(this.c);
            sb.append(", usAccounts=");
            sb.append(this.d);
            sb.append(", nonUsAccounts=");
            sb.append(this.e);
            sb.append(", migratedAccounts=");
            sb.append(this.f);
            sb.append(", statistics=");
            sb.append(this.g);
            sb.append(", heartbeatGenericDataMap=");
            sb.append(this.h);
            sb.append(", clientIdentifier=");
            return n0.a(sb, this.i, ')');
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public final List<jg> f() {
            return this.d;
        }

        public final List<jg> g() {
            return this.e;
        }

        public final List<jg> h() {
            return this.f;
        }

        public final String i() {
            return this.g;
        }

        public final Map<String, String> j() {
            return this.h;
        }

        public final String k() {
            return this.i;
        }

        public final String l() {
            return this.i;
        }

        public final String m() {
            return this.b;
        }

        public final Map<String, String> n() {
            return this.h;
        }

        public final List<jg> o() {
            return this.f;
        }

        public final List<jg> p() {
            return this.e;
        }

        public final String q() {
            return this.c;
        }

        public final String r() {
            return this.g;
        }

        public final List<jg> s() {
            return this.d;
        }

        public final String t() {
            return this.a;
        }

        public static final class a implements b2.a<b> {
            public final List<jg> a(JSONArray jSONArray) {
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            arrayList.add(jg.i.a(jSONObjectOptJSONObject));
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                return arrayList;
            }

            @Override // ttpobfuscated.b2.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(String str) {
                Map<String, String> mapLJ;
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("userId");
                String strOptString2 = jSONObject.optString("deviceId");
                String string = JSONObjectProtectorUtils.getString(jSONObject, "region");
                a aVar = b.j;
                List<jg> listA = aVar.a(JSONObjectProtectorUtils.getJSONArray(jSONObject, "usAccounts"));
                List<jg> listA2 = aVar.a(JSONObjectProtectorUtils.getJSONArray(jSONObject, "nonUsAccounts"));
                List<jg> listA3 = aVar.a(JSONObjectProtectorUtils.getJSONArray(jSONObject, "migratedAccounts"));
                String strOptString3 = jSONObject.optString("statistics");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("o3");
                if (jSONObjectOptJSONObject == null || (mapLJ = b8.c(jSONObjectOptJSONObject)) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                return new b(strOptString, strOptString2, string, listA, listA2, listA3, strOptString3, mapLJ, jSONObject.optString("clientIdentifier"));
            }
        }

        public final String a(boolean z) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("userId", this.a);
            jSONObject.putOpt("deviceId", this.b);
            jSONObject.put("region", this.c);
            jSONObject.put("clientIdentifier", this.i);
            jSONObject.putOpt("statistics", this.g);
            List<jg> list = this.d;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<jg> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().a(z));
            }
            jSONObject.put("usAccounts", new JSONArray((Collection) arrayList));
            List<jg> list2 = this.e;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<jg> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().a(z));
            }
            jSONObject.put("nonUsAccounts", new JSONArray((Collection) arrayList2));
            List<jg> list3 = this.f;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator<jg> it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(it4.next().a(z));
            }
            jSONObject.put("migratedAccounts", new JSONArray((Collection) arrayList3));
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : this.h.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("o3", jSONObject2);
            jSONObject.put("clientIdentifier", this.i);
            return C786410Ut5.J3(jSONObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Intrinsics.LJFF(this.a, bVar.a) && Intrinsics.LJFF(this.b, bVar.b) && Intrinsics.LJFF(this.c, bVar.c) && Intrinsics.LJFF(this.d, bVar.d) && Intrinsics.LJFF(this.e, bVar.e) && Intrinsics.LJFF(this.f, bVar.f) && Intrinsics.LJFF(this.g, bVar.g) && Intrinsics.LJFF(this.h, bVar.h) && Intrinsics.LJFF(this.i, bVar.i)) {
                return true;
            }
            return false;
        }

        public b(String str, String str2, String str3, List<jg> list, List<jg> list2, List<jg> list3, String str4, Map<String, String> map, String str5) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = list;
            this.e = list2;
            this.f = list3;
            this.g = str4;
            this.h = map;
            this.i = str5;
        }

        public final b a(String str, String str2, String str3, List<jg> list, List<jg> list2, List<jg> list3, String str4, Map<String, String> map, String str5) {
            return new b(str, str2, str3, list, list2, list3, str4, map, str5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, String str, String str2, String str3, List list, List list2, List list3, String str4, Map map, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            if ((i & 2) != 0) {
                str2 = bVar.b;
            }
            if ((i & 4) != 0) {
                str3 = bVar.c;
            }
            if ((i & 8) != 0) {
                list = bVar.d;
            }
            if ((i & 16) != 0) {
                list2 = bVar.e;
            }
            if ((i & 32) != 0) {
                list3 = bVar.f;
            }
            if ((i & 64) != 0) {
                str4 = bVar.g;
            }
            if ((i & 128) != 0) {
                map = bVar.h;
            }
            if ((i & 256) != 0) {
                str5 = bVar.i;
            }
            return bVar.a(str, str2, str3, list, list2, list3, str4, map, str5);
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

    public zb.f i() {
        return this.o;
    }

    public b j() {
        return this.m;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class a implements c4<g7> {
        @Override // ttpobfuscated.c4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g7 a(DBEvent dBEvent) {
            return new g7(dBEvent.a, dBEvent.b, b.j.a(dBEvent.d));
        }
    }

    public g7(UUID uuid, Date date, b bVar) {
        this.k = uuid;
        this.l = date;
        this.m = bVar;
    }
}
