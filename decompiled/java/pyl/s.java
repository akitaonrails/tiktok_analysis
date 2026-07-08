package pyl;

import X.C08FF;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes36.dex */
public abstract class s {
    public static final s EPIC;
    public static final s FAST;
    public static final s LAPSE;
    public static final /* synthetic */ s[] LL;
    public static final s NORMAL;
    public static final s SLOW;
    public static final s STORY_BOOM;
    public static final s ULTRA;

    public s() {
        throw null;
    }

    public abstract String description();

    public abstract float value();

    static {
        s sVar = new s() { // from class: X.1DQP
            @Override // pyl.s
            public final String description() {
                return "slowest";
            }

            @Override // pyl.s
            public final float value() {
                return 0.1f;
            }
        };
        ULTRA = sVar;
        s sVar2 = new s() { // from class: X.1DQQ
            @Override // pyl.s
            public final String description() {
                return "slowest";
            }

            @Override // pyl.s
            public final float value() {
                return 0.333333f;
            }
        };
        EPIC = sVar2;
        s sVar3 = new s() { // from class: X.1DQR
            @Override // pyl.s
            public final String description() {
                return "slower";
            }

            @Override // pyl.s
            public final float value() {
                return 0.5f;
            }
        };
        SLOW = sVar3;
        s sVar4 = new s() { // from class: X.1DQO
            @Override // pyl.s
            public final String description() {
                return "normal";
            }

            @Override // pyl.s
            public final float value() {
                return 1.0f;
            }
        };
        NORMAL = sVar4;
        s sVar5 = new s() { // from class: X.1DQS
            @Override // pyl.s
            public final String description() {
                return "story_boom";
            }

            @Override // pyl.s
            public final float value() {
                return 1.5f;
            }
        };
        STORY_BOOM = sVar5;
        s sVar6 = new s() { // from class: X.1DQT
            @Override // pyl.s
            public final String description() {
                return "faster";
            }

            @Override // pyl.s
            public final float value() {
                return 2.0f;
            }
        };
        FAST = sVar6;
        s sVar7 = new s() { // from class: X.1DQU
            @Override // pyl.s
            public final String description() {
                return "fastest";
            }

            @Override // pyl.s
            public final float value() {
                return 3.0f;
            }
        };
        LAPSE = sVar7;
        LL = new s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7};
    }

    public static s[] values() {
        return (s[]) LL.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return description();
    }

    public static s fromValue(float f) {
        s sVar = EPIC;
        if (f == sVar.value()) {
            return sVar;
        }
        s sVar2 = SLOW;
        if (f == sVar2.value()) {
            return sVar2;
        }
        s sVar3 = NORMAL;
        if (f == sVar3.value()) {
            return sVar3;
        }
        s sVar4 = FAST;
        if (f == sVar4.value()) {
            return sVar4;
        }
        s sVar5 = LAPSE;
        if (f == sVar5.value()) {
            return sVar5;
        }
        s sVar6 = STORY_BOOM;
        if (f == sVar6.value()) {
            return sVar6;
        }
        return null;
    }

    public static s valueOf(String str) {
        return (s) C08FF.LIZ(s.class, str);
    }

    public s(String str, int i) {
    }
}
