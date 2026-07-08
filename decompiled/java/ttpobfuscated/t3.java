package ttpobfuscated;

import X.C01GW;
import X.C098200Yq;
import X.C09AY;
import X.C13LE;
import X.C13LP;
import X.C189200o6;
import X.C452501pT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.p8;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public class t3 implements p8 {
    public final String a = C13LE.LIZ(getClass()).LJI();
    public final Map<String, Boolean> b;

    public final class a extends C09AY implements Function0<s7> {
        public final /* synthetic */ List<String> b;
        public final /* synthetic */ Map<String, Object> c;

        /* JADX INFO: renamed from: ttpobfuscated.t3$a$a, reason: collision with other inner class name */
        public final class C0074a extends C09AY implements Function0<StringBuilder> {
            public static final C0074a a = new C0074a();

            public C0074a() {
                super(0);
            }

            public final StringBuilder a() {
                return new StringBuilder();
            }

            @Override // kotlin.jvm.functions.Function0
            public StringBuilder invoke() {
                return new StringBuilder();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s7 invoke() throws p8.a.C0065a {
            Object c098200Yq;
            Map map;
            Object obj;
            t3 t3Var = t3.this;
            List<String> list = this.b;
            Map<String, Object> map2 = this.c;
            try {
                Pair<List<String>, h> pairA = t3Var.a(list);
                List<String> first = pairA.getFirst();
                if (first.size() < 2 || !Intrinsics.LJFF(first.get(0), e3.c)) {
                    c098200Yq = new s7(null, null);
                    C189200o6.m2constructorimpl(c098200Yq);
                } else {
                    C01GW c01gwLIZIZ = C452501pT.LIZIZ(C0074a.a);
                    for (int i = 1; i < first.size(); i++) {
                        String str = first.get(i);
                        if (map2.containsKey(str)) {
                            c098200Yq = t3Var.a(t3Var.b(), (StringBuilder) c01gwLIZIZ.getValue(), Integer.valueOf(i), str, map2.get(str), pairA);
                            if (c098200Yq != null) {
                                break;
                            }
                            Object obj2 = map2.get(str);
                            if (obj2 == null) {
                                Map<String, Boolean> mapB = t3Var.b();
                                if (mapB != null) {
                                    u3.b(i, pairA.getFirst(), mapB, pairA.getSecond());
                                } else {
                                    mapB = null;
                                }
                                c098200Yq = new s7(mapB, null);
                            } else if (!(obj2 instanceof Map) || (map2 = (Map) obj2) == null) {
                                Map<String, Boolean> mapB2 = t3Var.b();
                                if (mapB2 != null) {
                                    u3.b(i, pairA.getFirst(), mapB2, pairA.getSecond());
                                } else {
                                    mapB2 = null;
                                }
                                c098200Yq = new s7(mapB2, null);
                            }
                        } else if (pairA.getSecond().a || !kotlin.text.a0.LJJIJIIJIL(first.get(first.size() - 1), ']')) {
                            Map<String, Boolean> mapB3 = t3Var.b();
                            if (mapB3 != null) {
                                mapB3.put(str, Boolean.FALSE);
                            }
                            Map<String, Boolean> mapB4 = t3Var.b();
                            if (mapB4 != null) {
                                u3.b(i, pairA.getFirst(), mapB4, pairA.getSecond());
                            } else {
                                mapB4 = null;
                            }
                            c098200Yq = new s7(mapB4, null);
                        } else {
                            Matcher matcher = u3.d().matcher(str);
                            if (matcher.find()) {
                                String strSubstring = str.substring(0, matcher.start());
                                String strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    strGroup = "";
                                }
                                Object obj3 = map2.get(strSubstring);
                                if ((obj3 instanceof Map) && (map = (Map) obj3) != null && (obj = map.get(strGroup)) != null && (c098200Yq = t3Var.a(t3Var.b(), (StringBuilder) c01gwLIZIZ.getValue(), Integer.valueOf(i), str, obj, pairA)) != null) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    c098200Yq = new s7(null, null);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            t3 t3Var2 = t3.this;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return (s7) c098200Yq;
            }
            q3.a aVar = q3.a;
            String message = thM5exceptionOrNullimpl.getMessage();
            String str2 = t3Var2.a;
            aVar.getClass();
            q3.a.c.b(message, str2, thM5exceptionOrNullimpl);
            throw new p8.a.C0065a(thM5exceptionOrNullimpl);
        }

        public static final StringBuilder a(C01GW<StringBuilder> c01gw) {
            return c01gw.getValue();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<String> list, Map<String, ? extends Object> map) {
            super(0);
            this.b = list;
            this.c = map;
        }
    }

    public final String a() {
        return this.a;
    }

    public Map<String, Boolean> b() {
        return this.b;
    }

    public final Pair<List<String>, h> a(List<String> list) {
        Integer numValueOf = null;
        if (list.size() > 1 && kotlin.text.a0.LJJIJIIJIL((CharSequence) ListProtector.get(list, list.size() - 1), ']')) {
            String str = (String) ListProtector.get(list, list.size() - 1);
            Matcher matcher = u3.c().matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                if (strGroup != null) {
                    numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(strGroup));
                }
                String strSubstring = str.substring(0, matcher.start());
                ArrayList arrayList = new ArrayList(C13LP.LL(list, list.size() - 1));
                arrayList.add(strSubstring);
                return new Pair<>(arrayList, new h(true, numValueOf));
            }
            return new Pair<>(list, new h(false, null));
        }
        return new Pair<>(list, new h(false, null));
    }

    @Override // ttpobfuscated.p8
    public s7 a(List<String> list, Map<String, ? extends Object> map) {
        return (s7) mb.a("DefaultKeyParserRepository.find", false, null, new a(list, map), 6, null);
    }

    public final s7 a(Map<String, Boolean> map, StringBuilder sb, Integer num, String str, Object obj, Pair<? extends List<String>, h> pair) {
        CharSequence charSequenceSubSequence;
        if (map != null) {
            map.put(str, Boolean.TRUE);
        }
        sb.append(e3.d + str);
        int size = pair.getFirst().size() + (-1);
        if (num != null && num.intValue() == size) {
            h second = pair.getSecond();
            if (kotlin.text.a0.LJJLIIIJL(sb, e3.d)) {
                charSequenceSubSequence = sb.subSequence(1, sb.length());
            } else {
                charSequenceSubSequence = sb.subSequence(0, sb.length());
            }
            return u3.b(map, second, str, charSequenceSubSequence.toString(), obj);
        }
        return null;
    }
}
