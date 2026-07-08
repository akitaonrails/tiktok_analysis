package ttpobfuscated;

import X.C01GW;
import X.C09AY;
import X.C452501pT;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final class u3 {
    public static final C01GW a = C452501pT.LIZIZ(a.a);
    public static final C01GW b = C452501pT.LIZIZ(b.a);

    public static final class a extends C09AY implements Function0<Pattern> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        public final Pattern a() {
            return PatternProtector.compile("\\[(\\d+)]$");
        }

        @Override // kotlin.jvm.functions.Function0
        public Pattern invoke() {
            return PatternProtector.compile("\\[(\\d+)]$");
        }
    }

    public static final class b extends C09AY implements Function0<Pattern> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        public final Pattern a() {
            return PatternProtector.compile("\\[(\\D+)]$");
        }

        @Override // kotlin.jvm.functions.Function0
        public Pattern invoke() {
            return PatternProtector.compile("\\[(\\D+)]$");
        }
    }

    public static final Pattern c() {
        return (Pattern) a.getValue();
    }

    public static final Pattern d() {
        return (Pattern) b.getValue();
    }

    public static final /* synthetic */ Map a(int i, List list, Map map, h hVar) {
        b(i, list, map, hVar);
        return map;
    }

    public static final Map<String, Boolean> b(int i, List<String> list, Map<String, Boolean> map, h hVar) {
        while (true) {
            i++;
            if (i < list.size()) {
                String str = (String) ListProtector.get(list, i);
                if (i == list.size() - 1 && hVar.a) {
                    map.put(str + '[' + hVar.b + ']', Boolean.FALSE);
                } else {
                    map.put(str, Boolean.FALSE);
                }
            } else {
                return map;
            }
        }
    }

    public static final s7 b(Map<String, Boolean> map, h hVar, String str, String str2, Object obj) {
        if (hVar.a && hVar.b != null && (obj instanceof List)) {
            if (map != null) {
                map.remove(str);
            }
            List list = (List) obj;
            if (hVar.b.intValue() >= list.size()) {
                if (map != null) {
                    map.put(str + '[' + hVar.b + ']', Boolean.FALSE);
                }
                return new s7(map, new Pair(str2, null));
            }
            if (map != null) {
                map.put(str + '[' + hVar.b + ']', Boolean.TRUE);
            }
            return new s7(map, new Pair(str2, ListProtector.get(list, hVar.b.intValue())));
        }
        return new s7(map, new Pair(str2, obj));
    }
}
