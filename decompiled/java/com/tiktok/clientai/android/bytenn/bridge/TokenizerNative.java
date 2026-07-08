package com.tiktok.clientai.android.bytenn.bridge;

import X.C2188811AlT;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class TokenizerNative {
    public static final TokenizerNative LIZ = new TokenizerNative();

    private final native boolean nativeInit(String str, String str2);

    private final native void nativeRelease();

    private final native int[] nativeTokenize(String str, String str2, String str3);

    public final synchronized void LIZIZ() {
        try {
            nativeRelease();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    static {
        LoadSoLancet.LIZJ("client_ai_impl_jni");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("client_ai_impl_jni");
        LoadSoLancet.LJ(jUptimeMillis, "client_ai_impl_jni");
        LoadSoLancet.LIZLLL(jUptimeMillis, "client_ai_impl_jni");
        LoadSoLancet.LIZIZ("client_ai_impl_jni");
    }

    public final boolean LIZ(String str, String str2) {
        try {
            boolean zNativeInit = nativeInit(str, str2);
            if (zNativeInit) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Native BertTokenizer initialized: name=");
                sbLIZ.append(str);
                sbLIZ.append(" path=");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                return zNativeInit;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Native BertTokenizer init failed: name=");
            sbLIZ2.append(str);
            sbLIZ2.append(" path=");
            sbLIZ2.append(str2);
            C2188811AlT.LIZIZ(sbLIZ2);
            return zNativeInit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final int[] LIZJ(String str, String str2, String str3, boolean z) {
        if (z) {
            try {
                str3 = str3.toLowerCase(Locale.ROOT);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return nativeTokenize(str, str2, str3);
    }
}
