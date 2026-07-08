package defpackage;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a8 {
    public static final a8 BUTTON;
    public static final a8 LIST;
    public static final /* synthetic */ a8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final a8 NONE;

    public static InterfaceC2044707zh<a8> getEntries() {
        return LLILLJJLI;
    }

    static {
        a8 a8Var = new a8("NONE", 0);
        NONE = a8Var;
        a8 a8Var2 = new a8("LIST", 1);
        LIST = a8Var2;
        a8 a8Var3 = new a8("BUTTON", 2);
        BUTTON = a8Var3;
        a8[] a8VarArr = {a8Var, a8Var2, a8Var3};
        LL = a8VarArr;
        LLILLJJLI = new C2254308sP(a8VarArr);
    }

    public static a8[] values() {
        return (a8[]) LL.clone();
    }

    public static a8 valueOf(String str) {
        return (a8) C08FF.LIZ(a8.class, str);
    }

    public a8(String str, int i) {
    }
}
