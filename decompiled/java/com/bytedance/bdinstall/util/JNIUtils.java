package com.bytedance.bdinstall.util;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class JNIUtils {
    public static native int getInInfos(JSONObject jSONObject, long j, String str);

    static {
        LoadSoLancet.LIZJ("bd-install");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("bd-install");
        LoadSoLancet.LJ(jUptimeMillis, "bd-install");
        LoadSoLancet.LIZLLL(jUptimeMillis, "bd-install");
        LoadSoLancet.LIZIZ("bd-install");
    }
}
