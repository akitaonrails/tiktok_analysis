package ttpobfuscated;

import X.C098200Yq;
import X.C09AY;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C189200o6;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C786410Ut5;
import android.util.Base64;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ze {

    public final class a extends C09AY implements Function1<String, CharSequence> {
        public final /* synthetic */ Map.Entry<String, List<String>> a;
        public final /* synthetic */ String b;

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a.getKey());
            return lf.a(sb, this.b, str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Map.Entry<String, ? extends List<String>> entry, String str) {
            super(1);
            this.a = entry;
            this.b = str;
        }
    }

    public static final String a(Map<?, ?> map) {
        Object c098200Yq;
        Object value;
        Map map2;
        try {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                Object value2 = entry.getValue();
                if (value2 != null && !(value2 instanceof List) && !(value2 instanceof String) && !(value2 instanceof Number) && !(value2 instanceof Boolean)) {
                    value = null;
                    if (value2 instanceof Map) {
                        Object value3 = entry.getValue();
                        if (value3 instanceof Map) {
                            map2 = (Map) value3;
                        } else {
                            map2 = null;
                        }
                        if (map2 != null) {
                            value = b((Map<?, ?>) map2);
                        }
                    } else {
                        Object value4 = entry.getValue();
                        if (value4 != null) {
                            value = value4.getClass().getSimpleName();
                        }
                    }
                } else {
                    value = entry.getValue();
                }
                arrayList.add(new Pair(entry.getKey(), value));
            }
            c098200Yq = C786410Ut5.J3(new JSONObject(C2097608Jq.LJIILLIIL(arrayList)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "";
        }
        return (String) c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<?, ?> b(java.util.Map<?, ?> r6) {
        /*
            r3 = 0
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L76
            int r0 = r6.size()     // Catch: java.lang.Throwable -> L76
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L76
            java.util.Set r0 = r6.entrySet()     // Catch: java.lang.Throwable -> L76
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L76
        L12:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L6e
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> L76
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L76
            java.lang.Object r1 = r4.getValue()     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L58
            boolean r0 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L58
            boolean r0 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L58
            boolean r0 = r1 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L58
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L58
            boolean r0 = r1 instanceof java.util.Map     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L47
            java.lang.Object r1 = r4.getValue()     // Catch: java.lang.Throwable -> L76
            boolean r0 = r1 instanceof java.util.Map     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L43
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L76
            goto L44
        L43:
            r1 = r3
        L44:
            if (r1 == 0) goto L56
            goto L5d
        L47:
            java.lang.Object r0 = r4.getValue()     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L56
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L76
            goto L61
        L56:
            r2 = r3
            goto L61
        L58:
            java.lang.Object r2 = r4.getValue()     // Catch: java.lang.Throwable -> L76
            goto L61
        L5d:
            java.util.Map r2 = b(r1)     // Catch: java.lang.Throwable -> L76
        L61:
            java.lang.Object r1 = r4.getKey()     // Catch: java.lang.Throwable -> L76
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> L76
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L76
            r5.add(r0)     // Catch: java.lang.Throwable -> L76
            goto L12
        L6e:
            java.util.Map r1 = X.C2097608Jq.LJIILLIIL(r5)     // Catch: java.lang.Throwable -> L76
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L76
            goto L82
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L82:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L89
            r3 = r1
        L89:
            java.util.Map r3 = (java.util.Map) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.ze.b(java.util.Map):java.util.Map");
    }

    public static final List<Integer> c(String str) {
        List listLJJLIIIJ = kotlin.text.a0.LJJLIIIJ(kotlin.text.a0.LJLIIIL(str).toString(), new char[]{'.'}, false, 0, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
        Iterator it2 = listLJJLIIIJ.iterator();
        while (it2.hasNext()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
            if (numLJIIJJI != null) {
                arrayList.add(numLJIIJJI);
            } else {
                return null;
            }
        }
        return arrayList;
    }

    public static final <R> List<R> a(List<?> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<?> it2 = list.iterator();
        if (!it2.hasNext()) {
            if (arrayList.size() != list.size()) {
                return null;
            }
            return arrayList;
        }
        it2.next();
        Intrinsics.LJIILIIL();
        throw null;
    }

    public static final String b(String str) {
        Object c098200Yq;
        try {
            StringBuilder sb = new StringBuilder("0x");
            int i = Integer.parseInt(str);
            CharsKt__CharJVMKt.checkRadix(16);
            sb.append(Integer.toString(i, 16));
            c098200Yq = sb.toString();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = str;
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String a(byte[] bArr) {
        return new String(Base64.encode(bArr, 2), StandardCharsets.UTF_8);
    }

    public static final List<String> b(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((String) it2.next()).toLowerCase(Locale.ROOT));
        }
        return arrayList2;
    }

    public static final byte[] a(String str) {
        return Base64.decode(str.getBytes(Charsets.UTF_8), 0);
    }

    public static final int a(List<Integer> list, List<Integer> list2) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Integer> it2 = list.iterator();
        int i = 0;
        while (true) {
            Object obj = null;
            if (it2.hasNext()) {
                Integer next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(Integer.valueOf(Intrinsics.LJI(next.intValue(), ((Number) ListProtector.get(list2, i)).intValue())));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (((Number) next2).intValue() != 0) {
                        obj = next2;
                        break;
                    }
                }
                Integer num = (Integer) obj;
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            }
        }
    }

    public static final String a(Map<String, ? extends List<String>> map, String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            arrayList.add(C13LP.LJJLIIIJ(entry.getValue(), str, null, null, 0, null, new a(entry, str2), 30));
        }
        stringBuffer.append(C13LP.LJJLIIIJ(arrayList, str, null, null, 0, null, null, 62));
        return stringBuffer.toString();
    }

    public static final String b(String str, String str2, String str3) {
        String strLJJLIL = kotlin.text.a0.LJJLIL(str, str2, str);
        return kotlin.text.a0.LJJZ(strLJJLIL, str3, strLJJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> a(List<? extends T> list, int i, T t) {
        if (list.size() < i) {
            int size = i - list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(t);
            }
            return C13LP.LJLIL(arrayList, list);
        }
        return list;
    }

    public static final boolean a(List<String> list, String str, boolean z) {
        if (z) {
            return b(list).contains(str.toLowerCase(Locale.ROOT));
        }
        return list.contains(str);
    }

    public static final boolean a(List<String> list, List<String> list2, boolean z) {
        if (z) {
            return Intrinsics.LJFF(b(list), b(list2));
        }
        return Intrinsics.LJFF(list, list2);
    }

    public static final Integer a(String str, String str2, String str3) {
        return C2095008Iq.LJIIJJI(b(str, str2, str3));
    }

    public static /* synthetic */ String a(Map map, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "&";
        }
        if ((i & 2) != 0) {
            str2 = "=";
        }
        return a((Map<String, ? extends List<String>>) map, str, str2);
    }

    public static /* synthetic */ boolean a(List list, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a((List<String>) list, str, z);
    }

    public static /* synthetic */ boolean a(List list, List list2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a((List<String>) list, (List<String>) list2, z);
    }
}
