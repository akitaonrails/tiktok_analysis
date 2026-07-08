package ttpobfuscated;

import X.C2217421BqW;
import kotlin.jvm.functions.Function1;
import ttp.orbu.sdk.repository.model.DBEventSent;

/* JADX INFO: loaded from: classes24.dex */
public final class wc implements td {
    public final u2 a;

    public final /* synthetic */ class a extends C2217421BqW implements Function1<String, Integer> {
        public a(Object obj) {
            super(1, obj, u2.class, "delete", "delete(Ljava/lang/String;)I", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(String str) {
            return Integer.valueOf(((u2) this.receiver).a(str));
        }
    }

    public final /* synthetic */ class b extends C2217421BqW implements Function1<String, DBEventSent> {
        public b(Object obj) {
            super(1, obj, u2.class, "get", "get(Ljava/lang/String;)Lttp/orbu/sdk/repository/model/DBEventSent;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBEventSent invoke(String str) {
            return ((u2) this.receiver).b(str);
        }
    }

    public final /* synthetic */ class c extends C2217421BqW implements Function1<String, DBEventSent> {
        public c(Object obj) {
            super(1, obj, u2.class, "getLastEventByType", "getLastEventByType(Ljava/lang/String;)Lttp/orbu/sdk/repository/model/DBEventSent;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DBEventSent invoke(String str) {
            return ((u2) this.receiver).c(str);
        }
    }

    public final /* synthetic */ class d extends C2217421BqW implements Function1<DBEventSent, Long> {
        public d(Object obj) {
            super(1, obj, u2.class, "set", "set(Lttp/orbu/sdk/repository/model/DBEventSent;)J", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke(DBEventSent dBEventSent) {
            return Long.valueOf(((u2) this.receiver).b(dBEventSent));
        }
    }

    public final /* synthetic */ class e extends C2217421BqW implements Function1<DBEventSent, Integer> {
        public e(Object obj) {
            super(1, obj, u2.class, "update", "update(Lttp/orbu/sdk/repository/model/DBEventSent;)I", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(DBEventSent dBEventSent) {
            return Integer.valueOf(((u2) this.receiver).a(dBEventSent));
        }
    }

    public wc(u2 u2Var) {
        this.a = u2Var;
    }

    @Override // ttpobfuscated.y8
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean set(qd qdVar) {
        Long l = (Long) m3.a(new d(this.a), w2.a(qdVar), null, 4, null);
        if (l != null && l.longValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // ttpobfuscated.y8
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(qd qdVar) {
        Integer num = (Integer) m3.a(new e(this.a), w2.a(qdVar), null, 4, null);
        if (num != null && num.intValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // ttpobfuscated.y8
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(String str) {
        Integer num = (Integer) m3.a(new a(this.a), str, null, 4, null);
        if (num != null && num.intValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // ttpobfuscated.y8
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public qd get(String str) {
        DBEventSent dBEventSent = (DBEventSent) m3.a(new b(this.a), str, null, 4, null);
        if (dBEventSent == null) {
            return null;
        }
        return w2.a(dBEventSent);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ttpobfuscated.td
    public qd b(String str) {
        DBEventSent dBEventSent = (DBEventSent) m3.a(new c(this.a), str, null, 4, null);
        if (dBEventSent == null) {
            return null;
        }
        return w2.a(dBEventSent);
    }
}
