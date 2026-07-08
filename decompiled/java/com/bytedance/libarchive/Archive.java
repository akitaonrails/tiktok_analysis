package com.bytedance.libarchive;

import X.C0VSJ;
import X.C2188811AlT;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes4.dex */
public class Archive {
    public static native int decompress(String str, String str2);

    static {
        LoadSoLancet.LIZJ("Archive");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("Archive");
        LoadSoLancet.LJ(jUptimeMillis, "Archive");
        LoadSoLancet.LIZLLL(jUptimeMillis, "Archive");
        LoadSoLancet.LIZIZ("Archive");
    }

    public static int LIZ(String str, String str2) throws FileNotFoundException {
        C0VSJ c0vsj = new C0VSJ(str);
        C0VSJ c0vsj2 = new C0VSJ(str2);
        if (c0vsj.exists()) {
            if (!c0vsj2.exists()) {
                c0vsj2.mkdirs();
            } else if (c0vsj2.isFile()) {
                c0vsj2.delete();
                c0vsj2.mkdirs();
            }
            return decompress(c0vsj.getAbsolutePath(), c0vsj2.getAbsolutePath());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Input file not found ");
        sbLIZ.append(c0vsj.getAbsolutePath());
        throw new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
