package ttpobfuscated;

import X.C13BV;
import X.C13LP;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class og {
    public static final Map<String, List<String>> a(Map<String, ? extends List<String>> map) {
        List<String> list = map.get("Cookie");
        if (list != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                Iterator it3 = kotlin.text.a0.LJJLIIIJ(it2.next(), new char[]{';'}, false, 0, 6).iterator();
                while (it3.hasNext()) {
                    Pair pairA = a((String) it3.next(), '=', true, null, 4, null);
                    if (pairA != null) {
                        Collection collection = (Collection) linkedHashMap.get(pairA.getFirst());
                        if (collection == null) {
                            collection = C13BV.INSTANCE;
                        }
                        linkedHashMap.put(pairA.getFirst(), C13LP.LJLILLLLZI(pairA.getSecond(), collection));
                    }
                }
            }
            return linkedHashMap;
        }
        return null;
    }

    public static final Map<String, List<String>> b(Map<String, ? extends List<String>> map) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            Collection collection = (Collection) treeMap.get(entry.getKey());
            if (collection == null) {
                collection = C13BV.INSTANCE;
            }
            treeMap.put(entry.getKey(), C13LP.LJLIL(entry.getValue(), collection));
        }
        return treeMap;
    }

    public static final Map<String, List<String>> c(Map<String, String> map) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Collection collection = (Collection) treeMap.get(entry.getKey());
            if (collection == null) {
                collection = C13BV.INSTANCE;
            }
            treeMap.put(entry.getKey(), C13LP.LJLILLLLZI(entry.getValue(), collection));
        }
        return treeMap;
    }

    public static final String a(String str) {
        String str2;
        if (str != null) {
            List listLJJLIIIJ = kotlin.text.a0.LJJLIIIJ(str, new char[]{':'}, false, 2, 2);
            if (listLJJLIIIJ.size() == 2 && (str2 = (String) C13LP.LJJLIIIJJI(listLJJLIIIJ)) != null) {
                return str2;
            }
        }
        return "";
    }

    public static final String b(String str) {
        List listLJJLIIIJ;
        String str2;
        if (str == null || (listLJJLIIIJ = kotlin.text.a0.LJJLIIIJ(str, new char[]{':'}, false, 2, 2)) == null || (str2 = (String) C13LP.LJJJJZI(listLJJLIIIJ)) == null) {
            return "";
        }
        return str2;
    }

    public static final Integer a(int i, int i2) {
        if (i == i2) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public static final Pair<String, String> a(String str, char c, boolean z, String str2) {
        if (str.length() != 0) {
            List listLJJLIIIJ = kotlin.text.a0.LJJLIIIJ(str, new char[]{c}, false, 0, 6);
            if (listLJJLIIIJ.size() <= 2) {
                String str3 = (String) C13LP.LJJJJZI(listLJJLIIIJ);
                if (listLJJLIIIJ.size() == 2) {
                    str2 = (String) C13LP.LJJLIIIJJI(listLJJLIIIJ);
                }
                if (z) {
                    return new Pair<>(kotlin.text.a0.LJLIIIL(str3).toString(), kotlin.text.a0.LJLIIIL(str2).toString());
                }
                return new Pair<>(str3, str2);
            }
            return null;
        }
        return null;
    }

    public static /* synthetic */ Integer a(int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = -1;
        }
        return a(i, i2);
    }

    public static /* synthetic */ Pair a(String str, char c, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return a(str, c, z, str2);
    }
}
