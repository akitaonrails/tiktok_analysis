package com.tts.mobsec.oecsec.ov;

import X.C08XM;
import X.C20164313v7;
import android.content.Context;
import cs.bd.o.e1;
import cs.bd.o.f1;

/* JADX INFO: loaded from: classes4.dex */
public final class CSManagerUtils {
    public static synchronized C20164313v7 LIZ(String str) {
        e1 e1VarLIZ;
        e1VarLIZ = f1.LIZ(str);
        return e1VarLIZ != null ? new C20164313v7(e1VarLIZ) : null;
    }

    public static synchronized void LIZJ(Context context, C08XM c08xm) {
        f1.LIZLLL(context, c08xm.LJIJI);
    }

    public static void LIZLLL() {
        setABSwitchNative(true);
    }

    public static native long getNativeOecCallbackAddress();

    public static native void setABSwitchNative(boolean z);

    public static native void setLiteTokenInfoNative(boolean z, int i, String str);
}
