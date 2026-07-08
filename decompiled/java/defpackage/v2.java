package defpackage;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v2 {
    public static final /* synthetic */ v2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final v2 TAKO_MSG_INTERCEPT_TYPE_NORMAL;
    public static final v2 TAKO_MSG_INTERCEPT_TYPE_TNS_BLOCKED;

    public static InterfaceC2044707zh<v2> getEntries() {
        return LLILLJJLI;
    }

    static {
        v2 v2Var = new v2("TAKO_MSG_INTERCEPT_TYPE_NORMAL", 0);
        TAKO_MSG_INTERCEPT_TYPE_NORMAL = v2Var;
        v2 v2Var2 = new v2("TAKO_MSG_INTERCEPT_TYPE_TNS_BLOCKED", 1);
        TAKO_MSG_INTERCEPT_TYPE_TNS_BLOCKED = v2Var2;
        v2[] v2VarArr = {v2Var, v2Var2};
        LL = v2VarArr;
        LLILLJJLI = new C2254308sP(v2VarArr);
    }

    public static v2[] values() {
        return (v2[]) LL.clone();
    }

    public static v2 valueOf(String str) {
        return (v2) C08FF.LIZ(v2.class, str);
    }

    public v2(String str, int i) {
    }
}
