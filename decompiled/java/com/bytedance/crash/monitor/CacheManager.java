package com.bytedance.crash.monitor;

import X.C08SE;
import X.C0VJB;
import X.C0VSJ;
import X.C0VX9;
import X.C2112008Pe;
import X.C2188811AlT;
import X.C801940Vd2;
import X.C803540Vfc;
import com.bytedance.crash.monitor.CacheManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public final class CacheManager {
    public final C0VSJ LIZ;
    public CachedString LIZIZ;
    public CachedString LIZJ;
    public CachedString LIZLLL;
    public CachedString LJ;
    public CachedVersion LJFF;

    public static class CachedVersion implements Serializable {
        public static final long serialVersionUID = 1;
        public long mCreateTime;
        public long mManifestCode;
        public String mName;
        public long mUpdateVersionCode;
        public long mVersionCode;

        public static CachedVersion getCurrent(File file) {
            CachedVersion cachedVersion = (CachedVersion) C0VJB.LIZ(new C0VSJ(file, "current.ver"));
            if (cachedVersion == null) {
                return new CachedVersion();
            }
            return cachedVersion;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public X.C803540Vfc getAfter(java.io.File r19, long r20) {
            /*
                r18 = this;
                r3 = r18
                long r1 = r3.mCreateTime
                r8 = 0
                int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                r10 = 0
                if (r0 == 0) goto L10
                int r0 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
                if (r0 <= 0) goto L10
                return r10
            L10:
                long r11 = r3.mVersionCode
                int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r0 == 0) goto L26
                java.lang.String r2 = r3.mName
                if (r2 == 0) goto L26
                X.0Vfc r10 = new X.0Vfc
                long r13 = r3.mUpdateVersionCode
                long r0 = r3.mManifestCode
                r15 = r0
                r17 = r2
                r10.<init>(r11, r13, r15, r17)
            L26:
                java.lang.String r6 = ".ver"
                r0 = r19
                java.io.File[] r5 = com.bytedance.crash.monitor.CacheManager.LJFF(r0, r6)
                if (r5 == 0) goto L63
                int r4 = r5.length
                r3 = 0
            L32:
                if (r3 >= r4) goto L63
                r7 = r5[r3]
                long r1 = com.bytedance.crash.monitor.CacheManager.LIZLLL(r7, r6)
                int r0 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
                if (r0 >= 0) goto L5c
                java.lang.Object r1 = X.C0VJB.LIZ(r7)
                com.bytedance.crash.monitor.CacheManager$CachedVersion r1 = (com.bytedance.crash.monitor.CacheManager.CachedVersion) r1
                if (r1 == 0) goto L5f
                java.lang.String r2 = r1.mName
                if (r2 == 0) goto L5f
                long r11 = r1.mVersionCode
                int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r0 == 0) goto L5f
                X.0Vfc r10 = new X.0Vfc
                long r13 = r1.mUpdateVersionCode
                long r0 = r1.mManifestCode
                r15 = r0
                r17 = r2
                r10.<init>(r11, r13, r15, r17)
            L5c:
                int r3 = r3 + 1
                goto L32
            L5f:
                X.C08SE.LIZIZ(r7)
                goto L5c
            L63:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.monitor.CacheManager.CachedVersion.getAfter(java.io.File, long):X.0Vfc");
        }

        public C803540Vfc getBefore(File file, long j) {
            String str;
            if (j != 0) {
                long j2 = this.mCreateTime;
                if (j2 == 0 || j <= j2) {
                    File[] fileArrLJFF = CacheManager.LJFF(file, ".ver");
                    if (fileArrLJFF != null) {
                        for (File file2 : fileArrLJFF) {
                            if (j > CacheManager.LIZLLL(file2, ".ver")) {
                                CachedVersion cachedVersion = (CachedVersion) C0VJB.LIZ(file2);
                                if (cachedVersion != null && (str = cachedVersion.mName) != null) {
                                    long j3 = cachedVersion.mVersionCode;
                                    if (j3 != 0) {
                                        long j4 = cachedVersion.mUpdateVersionCode;
                                        if (j4 != 0) {
                                            return new C803540Vfc(j3, j4, cachedVersion.mManifestCode, str);
                                        }
                                    }
                                }
                                C08SE.LIZIZ(file2);
                            }
                        }
                        return null;
                    }
                    return null;
                }
            }
            return new C803540Vfc(this.mVersionCode, this.mUpdateVersionCode, this.mManifestCode, this.mName);
        }

        public void update(File file, long j, long j2, long j3, String str) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str2 = this.mName;
            if (str2 != null && this.mVersionCode != 0) {
                if (str2.equals(str) && this.mVersionCode == j && j3 == this.mManifestCode && this.mUpdateVersionCode == j2) {
                    return;
                }
                C0VX9.LIZIZ().getClass();
                CacheManager.LIZ(file, ".ver");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.mCreateTime);
                sbLIZ.append(".ver");
                C0VJB.LIZIZ(new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ)), this);
            } else {
                C0VX9.LIZIZ().getClass();
            }
            this.mName = str;
            this.mVersionCode = j;
            this.mUpdateVersionCode = j2;
            this.mCreateTime = jCurrentTimeMillis;
            this.mManifestCode = j3;
            C0VJB.LIZIZ(new C0VSJ(file, "current.ver"), this);
        }
    }

    public CacheManager(C0VSJ c0vsj) {
        this.LIZ = C2112008Pe.LIZIZ(c0vsj, "params");
    }

    public final String LIZIZ(long j) {
        return LIZJ(".aid").getBefore(this.LIZ, ".aid", j);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final CachedString LIZJ(String str) {
        switch (str.hashCode()) {
            case 1466958:
                if (str.equals(".aid")) {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = CachedString.getCurrent(this.LIZ, str);
                    }
                    return this.LIZLLL;
                }
                break;
            case 1468859:
                if (str.equals(".chn")) {
                }
                break;
            case 1469841:
                if (str.equals(".did")) {
                    if (this.LIZIZ == null) {
                        this.LIZIZ = CachedString.getCurrent(this.LIZ, str);
                    }
                    return this.LIZIZ;
                }
                break;
            case 1486178:
                if (str.equals(".uid")) {
                    if (this.LJ == null) {
                        this.LJ = CachedString.getCurrent(this.LIZ, str);
                    }
                    return this.LJ;
                }
                break;
        }
        if (this.LIZJ == null) {
            this.LIZJ = CachedString.getCurrent(this.LIZ, ".chn");
        }
        return this.LIZJ;
    }

    public final String LJ(long j) {
        return LIZJ(".did").getBefore(this.LIZ, ".did", j);
    }

    public final long LJI(long j) {
        String before = LIZJ(".uid").getBefore(this.LIZ, ".uid", j);
        if (before != null) {
            try {
                return Long.decode(before).longValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C801940Vd2.LIZJ(th);
                return 0L;
            }
        }
        return 0L;
    }

    public final void LJII(String str) {
        LIZJ(".aid").update(this.LIZ, ".aid", str);
    }

    public static class CachedString implements Serializable {
        public static final long serialVersionUID = 1;
        public long mCreateTime;
        public String mValue;

        public static CachedString getCurrent(File file, String str) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current");
            sbLIZ.append(str);
            CachedString cachedString = (CachedString) C0VJB.LIZ(new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ)));
            if (cachedString == null) {
                return new CachedString();
            }
            return cachedString;
        }

        public String getBefore(File file, String str, long j) {
            String str2;
            String str3;
            if (j != 0) {
                long j2 = this.mCreateTime;
                if (j2 == 0 || j <= j2) {
                    File[] fileArrLJFF = CacheManager.LJFF(file, str);
                    if (fileArrLJFF == null) {
                        return this.mValue;
                    }
                    for (File file2 : fileArrLJFF) {
                        if (j > CacheManager.LIZLLL(file2, str)) {
                            CachedString cachedString = (CachedString) C0VJB.LIZ(file2);
                            if (cachedString != null && (str3 = cachedString.mValue) != null) {
                                return str3;
                            }
                            C08SE.LIZIZ(file2);
                        }
                    }
                    for (int length = fileArrLJFF.length - 1; length >= 0; length--) {
                        CachedString cachedString2 = (CachedString) C0VJB.LIZ(fileArrLJFF[length]);
                        if (cachedString2 != null && (str2 = cachedString2.mValue) != null) {
                            return str2;
                        }
                        fileArrLJFF[length].delete();
                    }
                    return this.mValue;
                }
            }
            return this.mValue;
        }

        public void update(File file, String str, String str2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str3 = this.mValue;
            if (str3 != null) {
                if (str3.equals(str2)) {
                    return;
                }
                CacheManager.LIZ(file, str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.mCreateTime);
                sbLIZ.append(str);
                C0VJB.LIZIZ(new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ)), this);
            }
            this.mValue = str2;
            this.mCreateTime = jCurrentTimeMillis;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("current");
            sbLIZ2.append(str);
            C0VJB.LIZIZ(new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ2)), this);
        }
    }

    public CacheManager(C0VSJ c0vsj, String str) {
        this.LIZ = C2112008Pe.LIZIZ(C2112008Pe.LIZIZ(c0vsj, "params"), str);
    }

    public static void LIZ(File file, String str) {
        File[] fileArrLJFF = LJFF(file, str);
        if (fileArrLJFF != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (File file2 : fileArrLJFF) {
                long jLIZLLL = LIZLLL(file2, str);
                if (jLIZLLL > jCurrentTimeMillis || jCurrentTimeMillis - jLIZLLL > 1209600000) {
                    C08SE.LIZIZ(file2);
                }
            }
        }
    }

    public static long LIZLLL(File file, String str) {
        try {
            String name = file.getName();
            return CastLongProtector.parseLong(name.substring(0, name.length() - str.length()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C801940Vd2.LIZJ(th);
            return -1L;
        }
    }

    public static File[] LJFF(File file, final String str) {
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: X.0VfB
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                if (str2.endsWith(str) && !str2.startsWith("current")) {
                    return true;
                }
                return false;
            }
        });
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: X.0Vf2
                @Override // java.util.Comparator
                public final int compare(File file2, File file3) {
                    return Long.compare(CacheManager.LIZLLL(file3, str), CacheManager.LIZLLL(file2, str));
                }
            });
        }
        return fileArrListFiles;
    }

    public final void LJIIIIZZ(long j, long j2, long j3, String str) {
        if (this.LJFF == null) {
            this.LJFF = CachedVersion.getCurrent(this.LIZ);
        }
        this.LJFF.update(this.LIZ, j, j2, j3, str);
    }
}
