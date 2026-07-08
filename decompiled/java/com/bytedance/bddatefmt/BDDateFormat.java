package com.bytedance.bddatefmt;

import X.C2215091Bml;
import X.EnumC1283470jVJ;
import X.EnumC21173917tZ;
import X.EnumC21631119l7;
import X.EnumC2207011BZj;
import X.EnumC2215081Bmk;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes35.dex */
public class BDDateFormat {
    public static boolean LIZIZ;
    public final String LIZ;

    static {
        new C2215091Bml();
    }

    private final native String nFormat(long j, String str, String str2);

    private final native String nFormatAbbr(int i, int i2, String str);

    private final native String nFormatFull(int i, int i2, String str);

    private final native String nFormatRangeV2(long j, long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);

    private final native String nFormatRelative(int i, int i2, String str);

    private final native String nFormatRelativeLong(int i, int i2, String str);

    private final native String nFormatTimeRange(long j, long j2, int i, String str);

    private final native String nFormatTimeZone(String str, String str2, String str3);

    private final native String nFormatV2(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, long j2);

    public BDDateFormat() {
        this("");
    }

    public BDDateFormat(String str) {
        this.LIZ = str;
        if (!LIZIZ) {
            LoadSoLancet.LIZJ("rex");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("rex");
            LoadSoLancet.LJ(jUptimeMillis, "rex");
            LoadSoLancet.LIZLLL(jUptimeMillis, "rex");
            LoadSoLancet.LIZIZ("rex");
            LIZIZ = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r2.equals("TW") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r2.equals("SG") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if (r2.equals("MO") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r2.equals("HK") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        if (r2.equals("CN") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(r3);
        r1.append("-Hant-");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cd, code lost:
    
        return X.C2188811AlT.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ce, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(r3);
        r1.append("-Hans-");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
    
        return X.C2188811AlT.LIZIZ(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.bytedance.bddatefmt.BDDateFormat r5, java.util.Locale r6) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bddatefmt.BDDateFormat.LIZ(com.bytedance.bddatefmt.BDDateFormat, java.util.Locale):java.lang.String");
    }

    public final synchronized String LIZIZ(long j, Locale locale) {
        return nFormat(j, LIZ(this, locale), this.LIZ);
    }

    public final String LIZLLL(int i, EnumC21173917tZ enumC21173917tZ, Locale locale) {
        return nFormatAbbr(i, enumC21173917tZ.ordinal(), LIZ(this, locale));
    }

    public final String LJ(int i, EnumC21173917tZ enumC21173917tZ, Locale locale) {
        return nFormatRelative(i, enumC21173917tZ.ordinal(), LIZ(this, locale));
    }

    public final String LJFF(int i, EnumC21173917tZ enumC21173917tZ, Locale locale) {
        return nFormatRelativeLong(i, enumC21173917tZ.ordinal(), LIZ(this, locale));
    }

    public final String LJI(long j, long j2, EnumC21631119l7 enumC21631119l7, Locale locale) {
        return nFormatTimeRange(j, j2, enumC21631119l7.ordinal(), LIZ(this, locale));
    }

    public final String LJII(long j, Locale locale, Set<? extends EnumC2215081Bmk> set, EnumC2207011BZj enumC2207011BZj, EnumC1283470jVJ enumC1283470jVJ, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j2) {
        boolean z6;
        String strLIZ = LIZ(this, locale);
        boolean zContains = set.contains(EnumC2215081Bmk.Year);
        boolean zContains2 = set.contains(EnumC2215081Bmk.Month);
        boolean zContains3 = set.contains(EnumC2215081Bmk.Date);
        boolean zContains4 = set.contains(EnumC2215081Bmk.Time);
        boolean zContains5 = set.contains(EnumC2215081Bmk.Week);
        boolean zContains6 = set.contains(EnumC2215081Bmk.Zone);
        if (enumC2207011BZj == EnumC2207011BZj.Long) {
            z6 = true;
        } else {
            z6 = false;
        }
        return nFormatV2(j, strLIZ, zContains, zContains2, zContains3, zContains4, zContains5, zContains6, z6, enumC1283470jVJ.ordinal(), z, z2, z3, z4, z5, j2);
    }
}
