package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum gb {
    SandboxPreActivate(1),
    SandboxActivate(2),
    SandboxDeactivate(3),
    OrbuCodeDataLoad(4);

    public final int a;

    public final int b() {
        return this.a;
    }

    public static gb valueOf(String str) {
        return (gb) C08FF.LIZ(gb.class, str);
    }

    gb(int i) {
        this.a = i;
    }
}
