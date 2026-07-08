package com.bytedance.lynx.hybrid.i18n;

import X.C01GW;
import X.C08CX;
import X.C098200Yq;
import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C1520080pew;
import X.C1520360pfO;
import X.C1540360qBe;
import X.C1540370qBf;
import X.C15438062q;
import X.C1546210qL5;
import X.C1546820qM4;
import X.C1546840qM6;
import X.C1546860qM8;
import X.C1546870qM9;
import X.C189200o6;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C236800vm;
import X.C443120HZe;
import X.C452501pT;
import X.EnumC452301pR;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkI18nManager {
    public static final SparkI18nManager LIZ = new SparkI18nManager();
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static volatile C1540360qBe LIZLLL;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        LIZIZ = C452501pT.LIZ(enumC452301pR, new C1546860qM8());
        LIZJ = C452501pT.LIZ(enumC452301pR, new C1540370qBf());
    }

    public static String LIZ() {
        Function0<String> function0;
        String strInvoke;
        C1540360qBe c1540360qBe = LIZLLL;
        if (c1540360qBe != null && (function0 = c1540360qBe.LIZJ) != null && (strInvoke = function0.invoke()) != null) {
            return strInvoke;
        }
        C1546210qL5.LIZ.getClass();
        return C1546210qL5.LIZIZ();
    }

    public static C1546870qM9 LIZIZ() {
        return (C1546870qM9) LIZIZ.getValue();
    }

    public static String LIZJ(Meta meta) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(meta.channel);
        sbLIZ.append('-');
        sbLIZ.append(meta.keySetVersion);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJI(Meta meta) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("page-");
        sbLIZ.append(meta.channel);
        sbLIZ.append('-');
        sbLIZ.append(meta.pageKeySetVersion);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Meta LJIIIIZZ(Map map) {
        String str;
        String str2;
        String str3;
        Map mapLJ;
        List list;
        Map mapLJ2;
        String str4;
        String str5;
        try {
            Object obj = map.get("channel");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            String str6 = "";
            if (str == null) {
                str = "";
            }
            Object obj2 = map.get("keyset_version");
            if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                str2 = "";
            }
            Object obj3 = map.get("page_keyset_version");
            if (!(obj3 instanceof String) || (str3 = (String) obj3) == null) {
                str3 = "";
            }
            Object obj4 = map.get("detail");
            if (!(obj4 instanceof Map) || (mapLJ = (Map) obj4) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            Object obj5 = mapLJ.get("lang_tags");
            if (!(obj5 instanceof List) || (list = (List) obj5) == null) {
                list = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj6 : list) {
                if (obj6 instanceof String) {
                    arrayList.add(obj6);
                }
            }
            Object obj7 = mapLJ.get("convert_map");
            if (!(obj7 instanceof Map) || (mapLJ2 = (Map) obj7) == null) {
                mapLJ2 = C2097608Jq.LJ();
            }
            Set setEntrySet = mapLJ2.entrySet();
            ArrayList<Map.Entry> arrayList2 = new ArrayList();
            for (Object obj8 : setEntrySet) {
                if (obj8 instanceof Map.Entry) {
                    arrayList2.add(obj8);
                }
            }
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Map.Entry entry : arrayList2) {
                Pair pair = new Pair(entry.getKey(), entry.getValue());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            Object obj9 = mapLJ.get("public_path");
            if (!(obj9 instanceof String) || (str4 = (String) obj9) == null) {
                str4 = "";
            }
            Object obj10 = mapLJ.get("hash");
            if ((obj10 instanceof String) && (str5 = (String) obj10) != null) {
                str6 = str5;
            }
            if (a0.LJJJIL(str) || a0.LJJJIL(str4) || arrayList.isEmpty()) {
                return null;
            }
            if (a0.LJJJIL(str2) && a0.LJJJIL(str3)) {
                return null;
            }
            return new Meta(str, str2, str3, new ResDetail(C13LP.LLIIJI(arrayList), str4, str6, linkedHashMap));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C1540610qC3 r15, X.InterfaceC1546990qML r16) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.i18n.SparkI18nManager.LIZLLL(X.0qC3, X.0qML):void");
    }

    public static void LJII(JSONObject jSONObject, long j) throws JSONException {
        jSONObject.put("trigger", "gecko");
        jSONObject.put("cost_time", System.currentTimeMillis() - j);
        C1520360pfO c1520360pfO = new C1520360pfO("hybrid_starling_update_status");
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LIZIZ(0);
        C1520080pew.LIZ(null, c1520360pfO.LIZ());
    }

    public static void LJ(Meta meta, String str, Function1 function1) {
        C1540360qBe c1540360qBe = LIZLLL;
        if (c1540360qBe != null && c1540360qBe.LIZ) {
            C1546870qM9 c1546870qM9LIZIZ = LIZIZ();
            C1546840qM6 c1546840qM6 = (C1546840qM6) LIZJ.getValue();
            if (c1546870qM9LIZIZ != null && c1546840qM6 != null) {
                ResDetail resDetail = meta.detail;
                String strLJFF = LJFF(str, resDetail.convertMap, resDetail.languageTags);
                if (strLJFF == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unsupported language, language=");
                    sbLIZ.append(str);
                    C098200Yq c098200Yq = new C098200Yq(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq);
                    function1.invoke(C189200o6.m1boximpl(c098200Yq));
                    return;
                }
                c1546840qM6.LIZ(meta.detail, strLJFF, new C1546820qM4(function1, strLJFF, meta, a0.LJJIIZI(meta.detail.publicPath, meta.pageKeySetVersion, false), c1546870qM9LIZIZ));
                return;
            }
            C098200Yq c098200Yq2 = new C098200Yq(new RuntimeException("sink or fetcher is null."));
            C189200o6.m2constructorimpl(c098200Yq2);
            function1.invoke(C189200o6.m1boximpl(c098200Yq2));
            return;
        }
        C098200Yq c098200Yq3 = new C098200Yq(new RuntimeException("Disable by settings."));
        C189200o6.m2constructorimpl(c098200Yq3);
        function1.invoke(C189200o6.m1boximpl(c098200Yq3));
    }

    public static String LJFF(String str, Map map, Set set) {
        boolean z;
        Object next;
        Object next2;
        int i;
        int i2;
        String str2;
        if (set.contains(str)) {
            return str;
        }
        String str3 = (String) map.get(str);
        if (C13LP.LJJJJ(str3, set)) {
            return str3;
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!set.contains(str)) {
                Iterator it2 = set.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (u.LJIJI((String) next, str, true)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                String str4 = (String) next;
                if (str4 != null) {
                    return str4;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : set) {
                    Locale locale = Locale.ROOT;
                    if (u.LJJIIJZLJL(((String) obj).toLowerCase(locale), str.toLowerCase(locale), false)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == 1 && (str2 = (String) C13LP.LJJJLL(arrayList)) != null) {
                    return str2;
                }
                C443120HZe c443120HZeLIZ = C236800vm.LIZ(str);
                ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj2 : set) {
                    if (u.LJJIIJZLJL((String) obj2, (String) c443120HZeLIZ.getFirst(), true)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (String str5 : arrayList2) {
                    arrayList3.add(new Pair(str5, C236800vm.LIZ(str5)));
                }
                Iterator it3 = arrayList3.iterator();
                if (!it3.hasNext()) {
                    next2 = null;
                } else {
                    next2 = it3.next();
                    if (it3.hasNext()) {
                        C443120HZe c443120HZe = (C443120HZe) ((Pair) next2).getSecond();
                        if (((CharSequence) c443120HZe.getSecond()).length() > 0 && u.LJIJI((String) c443120HZe.getSecond(), (String) c443120HZeLIZ.getSecond(), true)) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        if (((CharSequence) c443120HZe.getThird()).length() > 0 && u.LJIJI((String) c443120HZe.getThird(), (String) c443120HZeLIZ.getThird(), true)) {
                            i++;
                        }
                        do {
                            Object next3 = it3.next();
                            C443120HZe c443120HZe2 = (C443120HZe) ((Pair) next3).getSecond();
                            if (((CharSequence) c443120HZe2.getSecond()).length() > 0 && u.LJIJI((String) c443120HZe2.getSecond(), (String) c443120HZeLIZ.getSecond(), true)) {
                                i2 = 2;
                            } else {
                                i2 = 0;
                            }
                            if (((CharSequence) c443120HZe2.getThird()).length() > 0 && u.LJIJI((String) c443120HZe2.getThird(), (String) c443120HZeLIZ.getThird(), true)) {
                                i2++;
                            }
                            if (i < i2) {
                                next2 = next3;
                                i = i2;
                            }
                        } while (it3.hasNext());
                    }
                }
                Pair pair = (Pair) next2;
                if (pair != null) {
                    return (String) pair.getFirst();
                }
            } else {
                return str;
            }
        }
        return null;
    }

    public static final class Meta {
        public static final ResDetail LIZ = new ResDetail(null, null, null, null, 15, null);

        @C09CT("channel")
        public final String channel;

        @C09CT("detail")
        public final ResDetail detail;

        @C09CT("keyset_version")
        public final String keySetVersion;

        @C09CT("page_keyset_version")
        public final String pageKeySetVersion;

        /* JADX WARN: Multi-variable type inference failed */
        public Meta() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Meta(channel=");
            sbLIZ.append(this.channel);
            sbLIZ.append(", keySetVersion=");
            sbLIZ.append(this.keySetVersion);
            sbLIZ.append(", pageKeySetVersion=");
            sbLIZ.append(this.pageKeySetVersion);
            sbLIZ.append(", detail=");
            sbLIZ.append(this.detail);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Meta(String str, String str2, String str3, ResDetail resDetail) {
            this.channel = str;
            this.keySetVersion = str2;
            this.pageKeySetVersion = str3;
            this.detail = resDetail;
        }

        public /* synthetic */ Meta(String str, String str2, String str3, ResDetail resDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? LIZ : resDetail);
        }
    }

    public static final class ResDetail {

        @C09CT("convert_map")
        public final Map<String, String> convertMap;

        @C09CT("file_hash")
        public final String fileHash;

        @C09CT("lang_tags")
        public final Set<String> languageTags;

        @C09CT("public_path")
        public final String publicPath;

        public ResDetail() {
            this(null, null, null, null, 15, null);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ResDetail(languageTags=");
            sbLIZ.append(this.languageTags);
            sbLIZ.append(", publicPath=");
            sbLIZ.append(this.publicPath);
            sbLIZ.append(", fileHash=");
            sbLIZ.append(this.fileHash);
            sbLIZ.append(", convertMap=");
            sbLIZ.append(this.convertMap);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ResDetail(Set<String> set, String str, String str2, Map<String, String> map) {
            this.languageTags = set;
            this.publicPath = str;
            this.fileHash = str2;
            this.convertMap = map;
        }

        public ResDetail(Set set, String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? C2097608Jq.LJ() : map);
        }
    }
}
