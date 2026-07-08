package defpackage;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes29.dex */
public final class h9 {
    public static final h9 CONFIG;
    public static final h9 DEEP;
    public static final h9 FLOW;
    public static final /* synthetic */ h9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final h9 TASKS;

    public static InterfaceC2044707zh<h9> getEntries() {
        return LLILLJJLI;
    }

    static {
        h9 h9Var = new h9("FLOW", 0);
        FLOW = h9Var;
        h9 h9Var2 = new h9("CONFIG", 1);
        CONFIG = h9Var2;
        h9 h9Var3 = new h9("TASKS", 2);
        TASKS = h9Var3;
        h9 h9Var4 = new h9("DEEP", 3);
        DEEP = h9Var4;
        h9[] h9VarArr = {h9Var, h9Var2, h9Var3, h9Var4};
        LL = h9VarArr;
        LLILLJJLI = new C2254308sP(h9VarArr);
    }

    public static h9[] values() {
        return (h9[]) LL.clone();
    }

    public static h9 valueOf(String str) {
        return (h9) C08FF.LIZ(h9.class, str);
    }

    public h9(String str, int i) {
    }
}
