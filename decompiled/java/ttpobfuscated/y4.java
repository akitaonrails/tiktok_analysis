package ttpobfuscated;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class y4 {
    public static final y4 a = new y4();
    public static x4 b;

    public final synchronized x4 a(Context context) {
        x4 x4Var;
        x4Var = b;
        if (x4Var == null) {
            x4Var = new x4(context);
            b = x4Var;
        }
        return x4Var;
    }
}
