package ttpobfuscated;

import X.C13BV;
import X.C15438062q;
import X.C2217421BqW;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ttp.orbu.sdk.repository.model.DBEvent;

/* JADX INFO: loaded from: classes24.dex */
public final class vc implements o4 {
    public final x2 a;
    public final m4 b;

    public final /* synthetic */ class f extends C2217421BqW implements Function0<List<? extends String>> {
        public final List<String> a() {
            return ((x2) this.receiver).b();
        }

        @Override // kotlin.jvm.functions.Function0
        public List<? extends String> invoke() {
            return ((x2) this.receiver).b();
        }

        public f(Object obj) {
            super(0, obj, x2.class, "getAllKinds", "getAllKinds()Ljava/util/List;", 0);
        }
    }

    @Override // ttpobfuscated.o4
    public List<String> b() {
        return (List) m3.a(new f(this.a), C13BV.INSTANCE);
    }

    public final /* synthetic */ class a extends C2217421BqW implements Function1<List<? extends String>, Integer> {
        public a(Object obj) {
            super(1, obj, x2.class, "countAll", "countAll(Ljava/util/List;)I", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(List<String> list) {
            return Integer.valueOf(((x2) this.receiver).a(list));
        }
    }

    public final /* synthetic */ class b extends C2217421BqW implements Function1<String, Integer> {
        public b(Object obj) {
            super(1, obj, x2.class, "countByKind", "countByKind(Ljava/lang/String;)I", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(String str) {
            return Integer.valueOf(((x2) this.receiver).a(str));
        }
    }

    public final /* synthetic */ class c extends C2217421BqW implements Function1<UUID, Integer> {
        public c(Object obj) {
            super(1, obj, x2.class, "delete", "delete(Ljava/util/UUID;)I", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(UUID uuid) {
            return Integer.valueOf(((x2) this.receiver).a(uuid));
        }
    }

    public final /* synthetic */ class d extends C2217421BqW implements Function1<UUID, DBEvent> {
        public d(Object obj) {
            super(1, obj, x2.class, "get", "get(Ljava/util/UUID;)Lttp/orbu/sdk/repository/model/DBEvent;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBEvent invoke(UUID uuid) {
            return ((x2) this.receiver).b(uuid);
        }
    }

    public final /* synthetic */ class e extends C2217421BqW implements Function2<List<? extends String>, Integer, List<? extends DBEvent>> {
        public e(Object obj) {
            super(2, obj, x2.class, "getAll", "getAll(Ljava/util/List;I)Ljava/util/List;", 0);
        }

        public final List<DBEvent> a(List<String> list, int i) {
            return ((x2) this.receiver).a(list, i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<? extends DBEvent> invoke(List<? extends String> list, Integer num) {
            return a(list, num.intValue());
        }
    }

    public final /* synthetic */ class g extends C2217421BqW implements Function2<String, Integer, List<? extends DBEvent>> {
        public g(Object obj) {
            super(2, obj, x2.class, "getByKind", "getByKind(Ljava/lang/String;I)Ljava/util/List;", 0);
        }

        public final List<DBEvent> a(String str, int i) {
            return ((x2) this.receiver).a(str, i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<? extends DBEvent> invoke(String str, Integer num) {
            return a(str, num.intValue());
        }
    }

    public final /* synthetic */ class h extends C2217421BqW implements Function1<DBEvent, Long> {
        public h(Object obj) {
            super(1, obj, x2.class, "set", "set(Lttp/orbu/sdk/repository/model/DBEvent;)J", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke(DBEvent dBEvent) {
            return Long.valueOf(((x2) this.receiver).b(dBEvent));
        }
    }

    public final /* synthetic */ class i extends C2217421BqW implements Function1<DBEvent, Integer> {
        public i(Object obj) {
            super(1, obj, x2.class, "update", "update(Lttp/orbu/sdk/repository/model/DBEvent;)I", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(DBEvent dBEvent) {
            return Integer.valueOf(((x2) this.receiver).a(dBEvent));
        }
    }

    @Override // ttpobfuscated.y8
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean set(fg<? extends b2> fgVar) {
        Long l = (Long) m3.a(new h(this.a), r2.a(fgVar), null, 4, null);
        if (l != null && l.longValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // ttpobfuscated.y8
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(fg<? extends b2> fgVar) {
        Integer num = (Integer) m3.a(new i(this.a), r2.a(fgVar), null, 4, null);
        if (num != null && num.intValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // ttpobfuscated.y8
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean b(UUID uuid) {
        Integer num = (Integer) m3.a(new c(this.a), uuid, null, 4, null);
        if (num != null && num.intValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // ttpobfuscated.y8
    /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public fg<? extends b2> get(UUID uuid) {
        DBEvent dBEvent = (DBEvent) m3.a(new d(this.a), uuid, null, 4, null);
        if (dBEvent == null) {
            return null;
        }
        return a(dBEvent);
    }

    @Override // ttpobfuscated.o4
    public int a(String str) {
        Integer num = (Integer) m3.a(new b(this.a), str, 0);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // ttpobfuscated.o4
    public int a(List<String> list) {
        Integer num = (Integer) m3.a(new a(this.a), list, 0);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final fg<? extends b2> a(DBEvent dBEvent) {
        fg<? extends b2> fgVarA = this.b.a(dBEvent);
        if (fgVarA != null) {
            return fgVarA;
        }
        throw new IllegalStateException("TtpEvent factory not found");
    }

    public vc(x2 x2Var, m4 m4Var) {
        this.a = x2Var;
        this.b = m4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<ttpobfuscated.fg<? extends ttpobfuscated.b2>>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // ttpobfuscated.o4
    public List<fg<? extends b2>> a(int i2, String str) {
        g gVar = new g(this.a);
        Integer numValueOf = Integer.valueOf(i2);
        ?? arrayList = C13BV.INSTANCE;
        List list = (List) m3.a(gVar, str, numValueOf, arrayList);
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(a((DBEvent) it2.next()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<ttpobfuscated.fg<? extends ttpobfuscated.b2>>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // ttpobfuscated.o4
    public List<fg<? extends b2>> a(int i2, List<String> list) {
        e eVar = new e(this.a);
        Integer numValueOf = Integer.valueOf(i2);
        ?? arrayList = C13BV.INSTANCE;
        List list2 = (List) m3.a(eVar, list, numValueOf, arrayList);
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(a((DBEvent) it2.next()));
            }
        }
        return arrayList;
    }
}
