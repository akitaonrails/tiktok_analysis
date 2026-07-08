package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t {
    public static final t DEFAULT;
    public static final /* synthetic */ t[] LL;
    public static final t STRING;

    public t() {
        throw null;
    }

    public abstract k serialize(Long l);

    static {
        t tVar = new t() { // from class: com.google.gson.t.a
            @Override // com.google.gson.t
            public final k serialize(Long l) {
                return new q((Number) l);
            }
        };
        DEFAULT = tVar;
        t tVar2 = new t() { // from class: com.google.gson.t.b
            @Override // com.google.gson.t
            public final k serialize(Long l) {
                return new q(String.valueOf(l));
            }
        };
        STRING = tVar2;
        LL = new t[]{tVar, tVar2};
    }

    public static t[] values() {
        return (t[]) LL.clone();
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public t(String str, int i) {
    }
}
