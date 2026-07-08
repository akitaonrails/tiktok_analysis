package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum y1 {
    Continue(0),
    ApproveIf(1),
    RejectIf(2),
    JumpIf(3),
    ReturnCodeIf(4);

    public static final a b = new a();
    public final int a;

    public final int b() {
        return this.a;
    }

    public static final class a {
        public final y1 a(int i) {
            for (y1 y1Var : y1.values()) {
                if (y1Var.a == i) {
                    return y1Var;
                }
            }
            return null;
        }
    }

    public static y1 valueOf(String str) {
        return (y1) C08FF.LIZ(y1.class, str);
    }

    y1(int i) {
        this.a = i;
    }
}
