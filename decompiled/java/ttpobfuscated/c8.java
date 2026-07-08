package ttpobfuscated;

import X.C01GW;
import X.C09AY;
import X.C13BV;
import X.C13LP;
import X.C452501pT;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public final class c8 implements ng {
    public final URI a;
    public final C01GW b;
    public final C01GW c;
    public final C01GW d;
    public final C01GW e;
    public final C01GW f;
    public final C01GW g;
    public final C01GW h;
    public final C01GW i;
    public final C01GW j;
    public final C01GW k;
    public final C01GW l;
    public final C01GW m;
    public final C01GW n;

    public final class b extends C09AY implements Function0<Map<String, ? extends List<? extends String>>> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, List<String>> invoke() {
            return og.a((Map<String, ? extends List<String>>) c8.this.d.getValue());
        }

        public b() {
            super(0);
        }
    }

    public final class c extends C09AY implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String fragment = c8.this.a.getFragment();
            return fragment == null ? "" : fragment;
        }

        public c() {
            super(0);
        }
    }

    public final class d extends C09AY implements Function0<Map<String, ? extends List<? extends String>>> {
        public final /* synthetic */ Map<String, List<String>> a;

        public final Map<String, List<String>> a() {
            return og.b(new TreeMap(this.a));
        }

        @Override // kotlin.jvm.functions.Function0
        public Map<String, ? extends List<? extends String>> invoke() {
            return og.b(new TreeMap(this.a));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Map<String, ? extends List<String>> map) {
            super(0);
            this.a = map;
        }
    }

    public final class e extends C09AY implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return c8.this.a.getHost();
        }

        public e() {
            super(0);
        }
    }

    public final class g extends C09AY implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return og.a(c8.this.a.getUserInfo());
        }

        public g() {
            super(0);
        }
    }

    public final class h extends C09AY implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String path = c8.this.a.getPath();
            return path == null ? "" : path;
        }

        public h() {
            super(0);
        }
    }

    public final class i extends C09AY implements Function0<Integer> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return og.a(c8.this.a.getPort(), 0, 1, (Object) null);
        }

        public i() {
            super(0);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public final class j extends C09AY implements Function0<Integer> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            Collection collectionValues;
            Map map = (Map) c8.this.b.getValue();
            int size = 0;
            if (map != null && (collectionValues = map.values()) != null) {
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    size += ((List) it2.next()).size();
                }
            }
            return Integer.valueOf(size);
        }

        public j() {
            super(0);
        }
    }

    public final class k extends C09AY implements Function0<Map<String, ? extends List<? extends String>>> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, List<String>> invoke() {
            c8 c8Var = c8.this;
            return c8Var.e(c8Var.a.getQuery());
        }

        public k() {
            super(0);
        }
    }

    public final class l extends C09AY implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return c8.this.a.getScheme();
        }

        public l() {
            super(0);
        }
    }

    public final class m extends C09AY implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return og.b(c8.this.a.getUserInfo());
        }

        public m() {
            super(0);
        }
    }

    @Override // ttpobfuscated.ng
    public Map<String, List<String>> a() {
        return (Map) this.b.getValue();
    }

    @Override // ttpobfuscated.ng
    public String b() {
        return (String) this.g.getValue();
    }

    @Override // ttpobfuscated.ng
    public Integer c() {
        return (Integer) this.h.getValue();
    }

    @Override // ttpobfuscated.ng
    public boolean d() {
        return this.b.getValue() != null;
    }

    @Override // ttpobfuscated.ng
    public boolean e() {
        byte[] bArr = (byte[]) this.c.getValue();
        return (bArr == null || bArr.length == 0) ? false : true;
    }

    @Override // ttpobfuscated.ng
    public String f() {
        return (String) this.l.getValue();
    }

    @Override // ttpobfuscated.ng
    public String g() {
        return (String) this.i.getValue();
    }

    @Override // ttpobfuscated.ng
    public String getPath() {
        return (String) this.k.getValue();
    }

    @Override // ttpobfuscated.ng
    public String h() {
        return (String) this.n.getValue();
    }

    @Override // ttpobfuscated.ng
    public int i() {
        return ((Number) this.m.getValue()).intValue();
    }

    @Override // ttpobfuscated.ng
    public boolean j() {
        Map map = (Map) this.e.getValue();
        return map != null && (map.isEmpty() ^ true);
    }

    @Override // ttpobfuscated.ng
    public String k() {
        return (String) this.f.getValue();
    }

    @Override // ttpobfuscated.ng
    public Map<String, List<String>> l() {
        return (Map) this.d.getValue();
    }

    @Override // ttpobfuscated.ng
    public String m() {
        return (String) this.j.getValue();
    }

    public final byte[] n() {
        return (byte[]) this.c.getValue();
    }

    public final Map<String, List<String>> o() {
        return (Map) this.e.getValue();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public final class f extends C09AY implements Function0<String> {
        public final /* synthetic */ String a;

        public final String a() {
            return this.a;
        }

        @Override // kotlin.jvm.functions.Function0
        public String invoke() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }
    }

    public final class a extends C09AY implements Function0<byte[]> {
        public final /* synthetic */ byte[] a;

        public final byte[] a() {
            return this.a;
        }

        @Override // kotlin.jvm.functions.Function0
        public byte[] invoke() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(byte[] bArr) {
            super(0);
            this.a = bArr;
        }
    }

    @Override // ttpobfuscated.ng
    public List<String> a(String str) {
        Map map = (Map) this.b.getValue();
        if (map != null) {
            return (List) map.get(str);
        }
        return null;
    }

    @Override // ttpobfuscated.ng
    public String b(String str) {
        List list;
        Map map = (Map) this.e.getValue();
        if (map != null && (list = (List) map.get(str)) != null) {
            return (String) C13LP.LJJLIIIJL(list);
        }
        return null;
    }

    @Override // ttpobfuscated.ng
    public String c(String str) {
        Iterable iterable = (Iterable) ((Map) this.d.getValue()).get(str);
        if (iterable != null) {
            return C13LP.LJJLIIIJ(iterable, ",", null, null, 0, null, null, 62);
        }
        return null;
    }

    @Override // ttpobfuscated.ng
    public boolean d(String str) {
        Map map = (Map) this.b.getValue();
        if (map != null && map.containsKey(str)) {
            return true;
        }
        return false;
    }

    public final Map<String, List<String>> e(String str) {
        if (str != null && str.length() != 0) {
            List listLJJLIIIJ = kotlin.text.a0.LJJLIIIJ(str, new char[]{'&'}, false, 0, 6);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = listLJJLIIIJ.iterator();
            while (it2.hasNext()) {
                Pair pairA = og.a((String) it2.next(), '=', false, null, 4, null);
                if (pairA != null) {
                    Collection collection = (Collection) linkedHashMap.get(pairA.getFirst());
                    if (collection == null) {
                        collection = C13BV.INSTANCE;
                    }
                    linkedHashMap.put(pairA.getFirst(), C13LP.LJLILLLLZI(pairA.getSecond(), collection));
                }
            }
            return linkedHashMap;
        }
        return null;
    }

    public c8(String str, String str2, byte[] bArr, Map<String, ? extends List<String>> map) throws URISyntaxException {
        if (str.length() != 0) {
            this.a = URI.create(str);
            this.b = C452501pT.LIZIZ(new k());
            this.c = C452501pT.LIZIZ(new a(bArr));
            this.d = C452501pT.LIZIZ(new d(map));
            this.e = C452501pT.LIZIZ(new b());
            this.f = C452501pT.LIZIZ(new l());
            this.g = C452501pT.LIZIZ(new e());
            this.h = C452501pT.LIZIZ(new i());
            this.i = C452501pT.LIZIZ(new m());
            this.j = C452501pT.LIZIZ(new g());
            this.k = C452501pT.LIZIZ(new h());
            this.l = C452501pT.LIZIZ(new c());
            this.m = C452501pT.LIZIZ(new j());
            this.n = C452501pT.LIZIZ(new f(str2));
            return;
        }
        throw new URISyntaxException(str, "URL cannot be empty");
    }
}
