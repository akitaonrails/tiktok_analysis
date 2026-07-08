package com.bytedance.pipo.piposecuritysdk;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes27.dex */
public final class Signature {
    public final native int nativeGenerateKeyPairAndCSR(String str, String str2, String[] strArr, String[] strArr2, String[] strArr3);

    public final native int nativeGenerateSignature(String str, byte[] bArr, String[] strArr);

    public final native int nativeVerifySignature(String str, String str2, byte[] bArr);

    static {
        LoadSoLancet.LIZJ("pipo-security-sdk");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("pipo-security-sdk");
        LoadSoLancet.LJ(jUptimeMillis, "pipo-security-sdk");
        LoadSoLancet.LIZLLL(jUptimeMillis, "pipo-security-sdk");
        LoadSoLancet.LIZIZ("pipo-security-sdk");
    }
}
