package com.bytedance.minizip;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public class MiniZip {
    public static native boolean doExtractZip(String str, String str2);

    static {
        LoadSoLancet.LIZJ("minizip");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("minizip");
        LoadSoLancet.LJ(jUptimeMillis, "minizip");
        LoadSoLancet.LIZLLL(jUptimeMillis, "minizip");
        LoadSoLancet.LIZIZ("minizip");
    }

    public static boolean LIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return doExtractZip(str, str2);
        }
        return false;
    }
}
