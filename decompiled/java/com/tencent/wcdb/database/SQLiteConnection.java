package com.tencent.wcdb.database;

import X.C08I6;
import X.C2188811AlT;
import X.C908000Zji;
import X.C908080Zjq;
import X.C908180Zk0;
import X.C908200Zk2;
import X.C908210Zk3;
import X.C908220Zk4;
import X.C908250Zk7;
import X.C908260Zk8;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes15.dex */
public final class SQLiteConnection {
    public static final String[] LJIILL = new String[0];
    public static final byte[] LJIILLIIL = new byte[0];
    public static final Pattern LJIIZILJ = PatternProtector.compile("[\\s]*\\n+[\\s]*");
    public final C908180Zk0 LIZ;
    public final C908220Zk4 LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C908260Zk8 LJFF;
    public C908250Zk7 LJI;
    public final C908200Zk2 LJII = new C908200Zk2(this);
    public int LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public byte[] LJIIJJI;
    public final SQLiteCipherSpec LJIIL;
    public C908210Zk3 LJIILIIL;
    public int LJIILJJIL;

    public static native void nativeBindBlob(long j, long j2, int i, byte[] bArr);

    public static native void nativeBindDouble(long j, long j2, int i, double d);

    public static native void nativeBindLong(long j, long j2, int i, long j3);

    public static native void nativeBindNull(long j, long j2, int i);

    public static native void nativeBindString(long j, long j2, int i, String str);

    public static native void nativeCancel(long j);

    public static native void nativeClose(long j);

    public static native void nativeExecute(long j, long j2);

    public static native int nativeExecuteForChangedRowCount(long j, long j2);

    public static native long nativeExecuteForCursorWindow(long j, long j2, long j3, int i, int i2, boolean z);

    public static native long nativeExecuteForLastInsertedRowId(long j, long j2);

    public static native long nativeExecuteForLong(long j, long j2);

    public static native String nativeExecuteForString(long j, long j2);

    public static native void nativeFinalizeStatement(long j, long j2);

    public static native int nativeGetColumnCount(long j, long j2);

    public static native String nativeGetColumnName(long j, long j2, int i);

    public static native int nativeGetDbLookaside(long j);

    public static native int nativeGetParameterCount(long j, long j2);

    public static native boolean nativeIsReadOnly(long j, long j2);

    private native long nativeOpen(String str, int i, String str2);

    public static native long nativePrepareStatement(long j, String str);

    public static native void nativeRegisterCustomFunction(long j, SQLiteCustomFunction sQLiteCustomFunction);

    public static native void nativeRegisterLocalizedCollators(long j, String str);

    public static native void nativeResetCancel(long j, boolean z);

    public static native void nativeResetStatement(long j, long j2, boolean z);

    public static native long nativeSQLiteHandle(long j, boolean z);

    public static native void nativeSetKey(long j, byte[] bArr);

    public static native void nativeSetUpdateNotification(long j, boolean z, boolean z2);

    public static native void nativeSetWalHook(long j);

    public static native long nativeWalCheckpoint(long j, String str);

    public final void LIZLLL() {
        if (this.LJIIIZ != 0) {
            int i = this.LJII.LIZ("close", null, null).LJII;
            try {
                LJI(-1);
                nativeClose(this.LJIIIZ);
                this.LJIIIZ = 0L;
                this.LJII.LIZIZ(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJII.LIZIZ(i);
                throw th;
            }
        }
    }

    public final void LJ() {
        int i = this.LJIILJJIL - 1;
        this.LJIILJJIL = i;
        if (i != 0 || this.LJIILIIL == null) {
            return;
        }
        nativeSQLiteHandle(this.LJIIIZ, false);
        this.LJII.LIZJ(this.LJIILIIL.LJII);
        this.LJIILIIL = null;
    }

    public final void LJIILJJIL() {
        long j;
        String str;
        int i;
        C908220Zk4 c908220Zk4 = this.LIZIZ;
        long jNativeOpen = nativeOpen(c908220Zk4.LIZ, c908220Zk4.LIZLLL, c908220Zk4.LIZJ);
        this.LJIIIZ = jNativeOpen;
        byte[] bArr = this.LJIIJJI;
        if (bArr != null && bArr.length == 0) {
            this.LJIIJJI = null;
        }
        byte[] bArr2 = this.LJIIJJI;
        if (bArr2 != null) {
            nativeSetKey(jNativeOpen, bArr2);
            SQLiteCipherSpec sQLiteCipherSpec = this.LJIIL;
            if (sQLiteCipherSpec != null) {
                if (sQLiteCipherSpec.cipher != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PRAGMA cipher=");
                    String str2 = this.LJIIL.cipher;
                    StringBuilder sb = new StringBuilder("'");
                    if (str2.indexOf(39) != -1) {
                        int length = str2.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            char cCharAt = str2.charAt(i2);
                            if (cCharAt == '\'') {
                                sb.append('\'');
                            }
                            sb.append(cCharAt);
                        }
                    } else {
                        sb.append(str2);
                    }
                    sb.append('\'');
                    sbLIZ.append(sb.toString());
                    LJFF(C2188811AlT.LIZIZ(sbLIZ), null);
                }
                if (this.LJIIL.kdfIteration != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("PRAGMA kdf_iter=");
                    sbLIZ2.append(this.LJIIL.kdfIteration);
                    LJFF(C2188811AlT.LIZIZ(sbLIZ2), null);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("PRAGMA cipher_use_hmac=");
                sbLIZ3.append(this.LJIIL.hmacEnabled);
                LJFF(C2188811AlT.LIZIZ(sbLIZ3), null);
            }
        }
        if (!this.LIZIZ.LIZ.equalsIgnoreCase(":memory:")) {
            if (this.LJIIJJI != null) {
                SQLiteCipherSpec sQLiteCipherSpec2 = this.LJIIL;
                if (sQLiteCipherSpec2 == null || (i = sQLiteCipherSpec2.pageSize) <= 0) {
                    i = SQLiteGlobal.LIZ;
                }
                j = i;
                str = "PRAGMA cipher_page_size";
            } else {
                j = SQLiteGlobal.LIZ;
                str = "PRAGMA page_size";
            }
            if (LJIIIZ(str, null) != j) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append("=");
                sbLIZ4.append(j);
                LJFF(C2188811AlT.LIZIZ(sbLIZ4), null);
            }
        }
        if (this.LJ) {
            LJFF("PRAGMA query_only = 1", null);
        }
        LJIJI();
        LJIJJLI();
        int i3 = this.LIZIZ.LJIIIIZZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("PRAGMA synchronous=");
        sbLIZ5.append(i3);
        LJFF(C2188811AlT.LIZIZ(sbLIZ5), null);
        if (!this.LIZIZ.LIZ.equalsIgnoreCase(":memory:") && !this.LJ && LJIIIZ("PRAGMA journal_size_limit", null) != PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
            LJIIIZ("PRAGMA journal_size_limit=524288", null);
        }
        LJIJ();
        LJIJJ();
        long j2 = this.LJIIIZ;
        C908220Zk4 c908220Zk42 = this.LIZIZ;
        nativeSetUpdateNotification(j2, c908220Zk42.LJIIIZ, c908220Zk42.LJIIJ);
        int size = this.LIZIZ.LJIIJJI.size();
        for (int i4 = 0; i4 < size; i4++) {
            nativeRegisterCustomFunction(this.LJIIIZ, (SQLiteCustomFunction) ListProtector.get(this.LIZIZ.LJIIJJI, i4));
        }
    }

    public final void LJIJ() {
        if (this.LIZIZ.LIZ.equalsIgnoreCase(":memory:") || this.LJ) {
            return;
        }
        if (this.LIZIZ.LJII) {
            nativeSetWalHook(this.LJIIIZ);
        } else if (LJIIIZ("PRAGMA wal_autocheckpoint", null) != 100) {
            LJIIIZ("PRAGMA wal_autocheckpoint=100", null);
        }
    }

    public final void LJIJI() {
        if (this.LJ) {
            return;
        }
        long j = this.LIZIZ.LJI ? 1L : 0L;
        if (LJIIIZ("PRAGMA foreign_keys", null) != j) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PRAGMA foreign_keys=");
            sbLIZ.append(j);
            LJFF(C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }

    public final void LJIJJ() {
        C908220Zk4 c908220Zk4 = this.LIZIZ;
        int i = c908220Zk4.LIZLLL | 16;
        c908220Zk4.LIZLLL = i;
        if ((i & 16) != 0) {
            return;
        }
        String string = c908220Zk4.LJFF.toString();
        nativeRegisterLocalizedCollators(this.LJIIIZ, string);
        if (this.LJ) {
            return;
        }
        try {
            LJFF("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null);
            String strLJIIJ = LJIIJ("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1");
            if (strLJIIJ == null || !strLJIIJ.equals(string)) {
                LJFF("BEGIN", null);
                try {
                    LJFF("DELETE FROM android_metadata", null);
                    LJFF("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{string});
                    LJFF("REINDEX LOCALIZED", null);
                    LJFF("COMMIT", null);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LJFF("ROLLBACK", null);
                    throw th;
                }
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to change locale for db '");
            sbLIZ.append(this.LIZIZ.LIZIZ);
            sbLIZ.append("' to '");
            sbLIZ.append(string);
            sbLIZ.append("'.");
            throw new SQLiteException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public final void LJIJJLI() {
        if (this.LIZIZ.LIZ.equalsIgnoreCase(":memory:") || this.LJ) {
            return;
        }
        String str = (this.LIZIZ.LIZLLL & 536870912) != 0 ? "WAL" : "PERSIST";
        String strLJIIJ = LJIIJ("PRAGMA journal_mode");
        if (strLJIIJ.equalsIgnoreCase(str)) {
            return;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PRAGMA journal_mode=");
            sbLIZ.append(str);
            if (LJIIJ(C2188811AlT.LIZIZ(sbLIZ)).equalsIgnoreCase(str)) {
                return;
            }
        } catch (SQLiteDatabaseLockedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Could not change the database journal mode of '");
        sbLIZ2.append(this.LIZIZ.LIZIZ);
        sbLIZ2.append("' from '");
        sbLIZ2.append(strLJIIJ);
        sbLIZ2.append("' to '");
        sbLIZ2.append(str);
        sbLIZ2.append("' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
        Log.LJ("WCDB.SQLiteConnection", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void finalize() throws Throwable {
        try {
            C908180Zk0 c908180Zk0 = this.LIZ;
            if (c908180Zk0 != null && this.LJIIIZ != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("A SQLiteConnection object for database '");
                sbLIZ.append(c908180Zk0.LLILZLL.LIZIZ);
                sbLIZ.append("' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
                Log.LJ("WCDB.SQLiteConnectionPool", C2188811AlT.LIZIZ(sbLIZ));
                c908180Zk0.LLILZIL.set(true);
            }
            LIZLLL();
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SQLiteConnection: ");
        sbLIZ.append(this.LIZIZ.LIZ);
        sbLIZ.append(" (");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C908250Zk7 LIZ(String str) {
        boolean z;
        C908250Zk7 c908250Zk7LIZIZ = LIZIZ(str);
        if (c908250Zk7LIZIZ != null) {
            if (!c908250Zk7LIZIZ.LJII) {
                c908250Zk7LIZIZ.LJII = true;
                return c908250Zk7LIZIZ;
            }
            z = true;
        } else {
            z = false;
        }
        long jNativePrepareStatement = nativePrepareStatement(this.LJIIIZ, str);
        try {
            int iNativeGetParameterCount = nativeGetParameterCount(this.LJIIIZ, jNativePrepareStatement);
            int iLIZ = C908000Zji.LIZ(str);
            boolean zNativeIsReadOnly = nativeIsReadOnly(this.LJIIIZ, jNativePrepareStatement);
            C908250Zk7 c908250Zk7 = this.LJI;
            if (c908250Zk7 != null) {
                this.LJI = c908250Zk7.LIZ;
                c908250Zk7.LIZ = null;
                c908250Zk7.LJI = false;
            } else {
                c908250Zk7 = new C908250Zk7(this);
            }
            c908250Zk7.LIZIZ = str;
            c908250Zk7.LIZJ = jNativePrepareStatement;
            c908250Zk7.LIZLLL = iNativeGetParameterCount;
            c908250Zk7.LJ = iLIZ;
            c908250Zk7.LJFF = zNativeIsReadOnly;
            if (!z && (iLIZ == 2 || iLIZ == 1)) {
                try {
                    LIZLLL(str, c908250Zk7);
                    c908250Zk7.LJI = true;
                } catch (RuntimeException e) {
                    e = e;
                    c908250Zk7LIZIZ = c908250Zk7;
                    TryCatchGuardChecker.doCheck(e);
                    if (c908250Zk7LIZIZ == null || !c908250Zk7LIZIZ.LJI) {
                        nativeFinalizeStatement(this.LJIIIZ, jNativePrepareStatement);
                    }
                    throw e;
                }
            }
            c908250Zk7.LJII = true;
            return c908250Zk7;
        } catch (RuntimeException e2) {
            e = e2;
        }
    }

    public final void LIZJ(ArrayList<SQLiteDebug.DbStats> arrayList) {
        long jLJIIIZ;
        long jLJIIIZ2;
        long jLJIIIZ3;
        long jLJIIIZ4;
        int iNativeGetDbLookaside = nativeGetDbLookaside(this.LJIIIZ);
        try {
            jLJIIIZ = LJIIIZ("PRAGMA page_count;", null);
            try {
                jLJIIIZ2 = LJIIIZ("PRAGMA page_size;", null);
            } catch (SQLiteException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                jLJIIIZ2 = 0;
            }
        } catch (SQLiteException e2) {
            e = e2;
            jLJIIIZ = 0;
        }
        arrayList.add(LJIIL(iNativeGetDbLookaside, jLJIIIZ, jLJIIIZ2));
        CursorWindow cursorWindow = new CursorWindow("collectDbStats");
        try {
            try {
                LJII("PRAGMA database_list;", null, cursorWindow, 0, 0, false);
                for (int i = 1; i < cursorWindow.LJIIZILJ(); i++) {
                    String strLJIJJ = cursorWindow.LJIJJ(i, 1);
                    String strLJIJJ2 = cursorWindow.LJIJJ(i, 2);
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PRAGMA ");
                        sbLIZ.append(strLJIJJ);
                        sbLIZ.append(".page_count;");
                        jLJIIIZ3 = LJIIIZ(C2188811AlT.LIZIZ(sbLIZ), null);
                        try {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("PRAGMA ");
                            sbLIZ2.append(strLJIJJ);
                            sbLIZ2.append(".page_size;");
                            jLJIIIZ4 = LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), null);
                        } catch (SQLiteException e3) {
                            e = e3;
                            TryCatchGuardChecker.doCheck(e);
                            jLJIIIZ4 = 0;
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        jLJIIIZ3 = 0;
                    }
                    String strLIZIZ = "  (attached) " + strLJIJJ;
                    if (strLJIJJ2.length() != 0) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZIZ);
                        sbLIZ3.append(": ");
                        sbLIZ3.append(strLJIJJ2);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    arrayList.add(new SQLiteDebug.DbStats(strLIZIZ, jLJIIIZ3, jLJIIIZ4, 0, 0, 0, 0));
                }
            } catch (SQLiteException e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            cursorWindow.LIZLLL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorWindow.LIZLLL();
            throw th;
        }
    }

    public final String LJIIJ(String str) {
        C908180Zk0 c908180Zk0;
        if (str != null) {
            C908210Zk3 c908210Zk3LIZ = this.LJII.LIZ("executeForString", str, null);
            int i = c908210Zk3LIZ.LJII;
            try {
                try {
                    C908250Zk7 c908250Zk7LIZ = LIZ(str);
                    c908210Zk3LIZ.getClass();
                    try {
                        LJIL(c908250Zk7LIZ);
                        LIZIZ(c908250Zk7LIZ, null);
                        try {
                            String strNativeExecuteForString = nativeExecuteForString(this.LJIIIZ, c908250Zk7LIZ.LIZJ);
                            LJIIZILJ(c908250Zk7LIZ);
                            this.LJII.LIZIZ(i);
                            return strNativeExecuteForString;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } catch (Throwable th) {
                        LJIIZILJ(c908250Zk7LIZ);
                        throw th;
                    }
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c908180Zk0 = this.LIZ) != null) {
                        c908180Zk0.LJII();
                    }
                    this.LJII.LJ(i, e);
                    throw e;
                }
            } catch (Throwable th2) {
                this.LJII.LIZIZ(i);
                throw th2;
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final void LJIIJJI(C908250Zk7 c908250Zk7) {
        nativeFinalizeStatement(this.LJIIIZ, c908250Zk7.LIZJ);
        c908250Zk7.LIZIZ = null;
        c908250Zk7.LIZ = this.LJI;
        this.LJI = c908250Zk7;
    }

    public final long LJIILIIL(String str) {
        if (this.LJIIIZ == 0) {
            return 0L;
        }
        if (str != null && this.LJIILIIL == null) {
            C908210Zk3 c908210Zk3LIZ = this.LJII.LIZ(str, null, null);
            this.LJIILIIL = c908210Zk3LIZ;
            c908210Zk3LIZ.getClass();
        }
        this.LJIILJJIL++;
        return nativeSQLiteHandle(this.LJIIIZ, true);
    }

    public final void LJIILLIIL(C908220Zk4 c908220Zk4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        this.LJIIJ = false;
        int size = c908220Zk4.LJIIJJI.size();
        for (int i = 0; i < size; i++) {
            SQLiteCustomFunction sQLiteCustomFunction = (SQLiteCustomFunction) ListProtector.get(c908220Zk4.LJIIJJI, i);
            if (!this.LIZIZ.LJIIJJI.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.LJIIIZ, sQLiteCustomFunction);
            }
        }
        int i2 = c908220Zk4.LIZLLL;
        C908220Zk4 c908220Zk42 = this.LIZIZ;
        if (((i2 ^ c908220Zk42.LIZLLL) & 536870912) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (c908220Zk4.LJI != c908220Zk42.LJI) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = !c908220Zk4.LJFF.equals(c908220Zk42.LJFF);
        boolean z7 = c908220Zk4.LJII;
        C908220Zk4 c908220Zk43 = this.LIZIZ;
        if (z7 != c908220Zk43.LJII) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c908220Zk4.LJIIIIZZ != c908220Zk43.LJIIIIZZ) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c908220Zk4.LJIIIZ != c908220Zk43.LJIIIZ || c908220Zk4.LJIIJ != c908220Zk43.LJIIJ) {
            z5 = true;
        }
        c908220Zk43.LIZ(c908220Zk4);
        C908260Zk8 c908260Zk8 = this.LJFF;
        int i3 = c908220Zk4.LJ;
        if (i3 > 0) {
            synchronized (c908260Zk8) {
                try {
                    c908260Zk8.LIZJ = i3;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c908260Zk8.LJI(i3);
            if (z2) {
                LJIJI();
            }
            if (z) {
                LJIJJLI();
            }
            if (z4) {
                int i4 = this.LIZIZ.LJIIIIZZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PRAGMA synchronous=");
                sbLIZ.append(i4);
                LJFF(C2188811AlT.LIZIZ(sbLIZ), null);
            }
            if (z3) {
                LJIJ();
            }
            if (z6) {
                LJIJJ();
            }
            if (z5) {
                long j = this.LJIIIZ;
                C908220Zk4 c908220Zk44 = this.LIZIZ;
                nativeSetUpdateNotification(j, c908220Zk44.LJIIIZ, c908220Zk44.LJIIJ);
                return;
            }
            return;
        }
        c908260Zk8.getClass();
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void LJIIZILJ(C908250Zk7 c908250Zk7) {
        c908250Zk7.LJII = false;
        if (c908250Zk7.LJI) {
            try {
                nativeResetStatement(this.LJIIIZ, c908250Zk7.LIZJ, true);
                return;
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
                LJ(c908250Zk7.LIZIZ);
                return;
            }
        }
        LJIIJJI(c908250Zk7);
    }

    public final void LJIL(C908250Zk7 c908250Zk7) {
        if (this.LJIIJ && !c908250Zk7.LJFF) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    private void notifyCheckpoint(String str, int i) {
        this.LIZ.LL.get();
    }

    public final void LIZIZ(C908250Zk7 c908250Zk7, Object[] objArr) {
        int length;
        long j;
        if (objArr != null) {
            length = objArr.length;
        } else {
            length = 0;
        }
        if (length == c908250Zk7.LIZLLL) {
            if (length == 0) {
                return;
            }
            long j2 = c908250Zk7.LIZJ;
            int i = 0;
            do {
                Object obj = objArr[i];
                if (obj == null) {
                    nativeBindNull(this.LJIIIZ, j2, i + 1);
                } else if (obj instanceof byte[]) {
                    nativeBindBlob(this.LJIIIZ, j2, i + 1, (byte[]) obj);
                } else if (!(obj instanceof Float) && !(obj instanceof Double)) {
                    if (!(obj instanceof Long) && !(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
                        if (obj instanceof Boolean) {
                            long j3 = this.LJIIIZ;
                            int i2 = i + 1;
                            if (((Boolean) obj).booleanValue()) {
                                j = 1;
                            } else {
                                j = 0;
                            }
                            nativeBindLong(j3, j2, i2, j);
                        } else {
                            nativeBindString(this.LJIIIZ, j2, i + 1, obj.toString());
                        }
                    } else {
                        nativeBindLong(this.LJIIIZ, j2, i + 1, ((Number) obj).longValue());
                    }
                } else {
                    nativeBindDouble(this.LJIIIZ, j2, i + 1, ((Number) obj).doubleValue());
                }
                i++;
            } while (i < length);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected ");
        sbLIZ.append(c908250Zk7.LIZLLL);
        sbLIZ.append(" bind arguments but ");
        sbLIZ.append(length);
        sbLIZ.append(" were provided.");
        throw new SQLiteBindOrColumnIndexOutOfRangeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJFF(String str, Object[] objArr) {
        C908180Zk0 c908180Zk0;
        if (str != null) {
            C908210Zk3 c908210Zk3LIZ = this.LJII.LIZ("execute", str, objArr);
            int i = c908210Zk3LIZ.LJII;
            try {
                try {
                    C908250Zk7 c908250Zk7LIZ = LIZ(str);
                    c908210Zk3LIZ.getClass();
                    try {
                        LJIL(c908250Zk7LIZ);
                        LIZIZ(c908250Zk7LIZ, objArr);
                        try {
                            nativeExecute(this.LJIIIZ, c908250Zk7LIZ.LIZJ);
                            LJIIZILJ(c908250Zk7LIZ);
                            this.LJII.LIZIZ(i);
                            return;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } catch (Throwable th) {
                        LJIIZILJ(c908250Zk7LIZ);
                        throw th;
                    }
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c908180Zk0 = this.LIZ) != null) {
                        c908180Zk0.LJII();
                    }
                    this.LJII.LJ(i, e);
                    throw e;
                }
            } catch (Throwable th2) {
                this.LJII.LIZIZ(i);
                throw th2;
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final int LJI(String str, Object[] objArr) {
        C908180Zk0 c908180Zk0;
        if (str != null) {
            C908210Zk3 c908210Zk3LIZ = this.LJII.LIZ("executeForChangedRowCount", str, objArr);
            int i = c908210Zk3LIZ.LJII;
            try {
                try {
                    C908250Zk7 c908250Zk7LIZ = LIZ(str);
                    c908210Zk3LIZ.getClass();
                    try {
                        LJIL(c908250Zk7LIZ);
                        LIZIZ(c908250Zk7LIZ, objArr);
                        try {
                            int iNativeExecuteForChangedRowCount = nativeExecuteForChangedRowCount(this.LJIIIZ, c908250Zk7LIZ.LIZJ);
                            LJIIZILJ(c908250Zk7LIZ);
                            if (this.LJII.LIZJ(i)) {
                                C908200Zk2 c908200Zk2 = this.LJII;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("changedRows=");
                                sbLIZ.append(iNativeExecuteForChangedRowCount);
                                c908200Zk2.LJI(i, C2188811AlT.LIZIZ(sbLIZ));
                            }
                            return iNativeExecuteForChangedRowCount;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } catch (Throwable th) {
                        LJIIZILJ(c908250Zk7LIZ);
                        throw th;
                    }
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c908180Zk0 = this.LIZ) != null) {
                        c908180Zk0.LJII();
                    }
                    this.LJII.LJ(i, e);
                    throw e;
                }
            } catch (Throwable th2) {
                if (this.LJII.LIZJ(i)) {
                    C908200Zk2 c908200Zk22 = this.LJII;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("changedRows=");
                    sbLIZ2.append(0);
                    c908200Zk22.LJI(i, C2188811AlT.LIZIZ(sbLIZ2));
                }
                throw th2;
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final long LJIIIIZZ(String str, Object[] objArr) {
        C908180Zk0 c908180Zk0;
        if (str != null) {
            C908210Zk3 c908210Zk3LIZ = this.LJII.LIZ("executeForLastInsertedRowId", str, objArr);
            int i = c908210Zk3LIZ.LJII;
            try {
                try {
                    C908250Zk7 c908250Zk7LIZ = LIZ(str);
                    c908210Zk3LIZ.getClass();
                    try {
                        LJIL(c908250Zk7LIZ);
                        LIZIZ(c908250Zk7LIZ, objArr);
                        try {
                            long jNativeExecuteForLastInsertedRowId = nativeExecuteForLastInsertedRowId(this.LJIIIZ, c908250Zk7LIZ.LIZJ);
                            LJIIZILJ(c908250Zk7LIZ);
                            this.LJII.LIZIZ(i);
                            return jNativeExecuteForLastInsertedRowId;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } catch (Throwable th) {
                        LJIIZILJ(c908250Zk7LIZ);
                        throw th;
                    }
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c908180Zk0 = this.LIZ) != null) {
                        c908180Zk0.LJII();
                    }
                    this.LJII.LJ(i, e);
                    throw e;
                }
            } catch (Throwable th2) {
                this.LJII.LIZIZ(i);
                throw th2;
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final long LJIIIZ(String str, Object[] objArr) {
        C908180Zk0 c908180Zk0;
        if (str != null) {
            C908210Zk3 c908210Zk3LIZ = this.LJII.LIZ("executeForLong", str, objArr);
            int i = c908210Zk3LIZ.LJII;
            try {
                try {
                    C908250Zk7 c908250Zk7LIZ = LIZ(str);
                    c908210Zk3LIZ.getClass();
                    try {
                        LJIL(c908250Zk7LIZ);
                        LIZIZ(c908250Zk7LIZ, objArr);
                        try {
                            long jNativeExecuteForLong = nativeExecuteForLong(this.LJIIIZ, c908250Zk7LIZ.LIZJ);
                            LJIIZILJ(c908250Zk7LIZ);
                            this.LJII.LIZIZ(i);
                            return jNativeExecuteForLong;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } catch (Throwable th) {
                        LJIIZILJ(c908250Zk7LIZ);
                        throw th;
                    }
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c908180Zk0 = this.LIZ) != null) {
                        c908180Zk0.LJII();
                    }
                    this.LJII.LJ(i, e);
                    throw e;
                }
            } catch (Throwable th2) {
                this.LJII.LIZIZ(i);
                throw th2;
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final void LJIILL(String str, C908080Zjq c908080Zjq) {
        C908180Zk0 c908180Zk0;
        C908210Zk3 c908210Zk3LIZ = this.LJII.LIZ("prepare", str, null);
        int i = c908210Zk3LIZ.LJII;
        try {
            try {
                C908250Zk7 c908250Zk7LIZ = LIZ(str);
                c908210Zk3LIZ.getClass();
                try {
                    c908080Zjq.LIZ = c908250Zk7LIZ.LIZLLL;
                    c908080Zjq.LIZJ = c908250Zk7LIZ.LJFF;
                    int iNativeGetColumnCount = nativeGetColumnCount(this.LJIIIZ, c908250Zk7LIZ.LIZJ);
                    if (iNativeGetColumnCount == 0) {
                        c908080Zjq.LIZIZ = LJIILL;
                    } else {
                        c908080Zjq.LIZIZ = new String[iNativeGetColumnCount];
                        for (int i2 = 0; i2 < iNativeGetColumnCount; i2++) {
                            c908080Zjq.LIZIZ[i2] = nativeGetColumnName(this.LJIIIZ, c908250Zk7LIZ.LIZJ, i2);
                        }
                    }
                    LJIIZILJ(c908250Zk7LIZ);
                    this.LJII.LIZIZ(i);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LJIIZILJ(c908250Zk7LIZ);
                    throw th;
                }
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c908180Zk0 = this.LIZ) != null) {
                    c908180Zk0.LJII();
                }
                this.LJII.LJ(i, e);
                throw e;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LJII.LIZIZ(i);
            throw th2;
        }
    }

    public final SQLiteDebug.DbStats LJIIL(int i, long j, long j2) {
        int i2;
        String strLIZIZ = this.LIZIZ.LIZ;
        if (!this.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(" (");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(")");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C908260Zk8 c908260Zk8 = this.LJFF;
        synchronized (c908260Zk8) {
            i2 = c908260Zk8.LIZLLL;
        }
        return new SQLiteDebug.DbStats(strLIZIZ, j, j2, i, i2, LIZJ(), LJFF());
    }

    private void notifyChange(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        this.LIZ.LL.get();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Zk8] */
    public SQLiteConnection(C908180Zk0 c908180Zk0, C908220Zk4 c908220Zk4, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        this.LJIIJJI = bArr;
        if (sQLiteCipherSpec == null) {
            sQLiteCipherSpec2 = null;
        } else {
            sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
        }
        this.LJIIL = sQLiteCipherSpec2;
        this.LIZ = c908180Zk0;
        C908220Zk4 c908220Zk42 = new C908220Zk4(c908220Zk4);
        this.LIZIZ = c908220Zk42;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = (c908220Zk4.LIZLLL & 1) != 0;
        final int i2 = c908220Zk42.LJ;
        this.LJFF = new C08I6<String, C908250Zk7>(i2) { // from class: X.0Zk8
            @Override // X.C08I6
            public final void LIZ(Object obj, Object obj2, Object obj3) {
                C908250Zk7 c908250Zk7 = (C908250Zk7) obj2;
                c908250Zk7.LJI = false;
                if (!c908250Zk7.LJII) {
                    this.LJFF.LJIIJJI(c908250Zk7);
                }
            }
        };
    }

    public final int LJII(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z) {
        int i3;
        int i4;
        int iLJIIZILJ;
        C908180Zk0 c908180Zk0;
        if (str != null) {
            if (cursorWindow != null) {
                cursorWindow.LIZ();
                try {
                    try {
                        C908210Zk3 c908210Zk3LIZ = this.LJII.LIZ("executeForCursorWindow", str, objArr);
                        int i5 = c908210Zk3LIZ.LJII;
                        try {
                            try {
                                C908250Zk7 c908250Zk7LIZ = LIZ(str);
                                c908210Zk3LIZ.getClass();
                                try {
                                    LJIL(c908250Zk7LIZ);
                                    LIZIZ(c908250Zk7LIZ, objArr);
                                    try {
                                        try {
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    try {
                                        long jNativeExecuteForCursorWindow = nativeExecuteForCursorWindow(this.LJIIIZ, c908250Zk7LIZ.LIZJ, cursorWindow.mWindowPtr, i, i2, z);
                                        i4 = (int) (jNativeExecuteForCursorWindow >> 32);
                                        i3 = (int) jNativeExecuteForCursorWindow;
                                        try {
                                            iLJIIZILJ = cursorWindow.LJIIZILJ();
                                            try {
                                                cursorWindow.mStartPos = i4;
                                                try {
                                                    LJIIZILJ(c908250Zk7LIZ);
                                                    if (this.LJII.LIZJ(i5)) {
                                                        C908200Zk2 c908200Zk2 = this.LJII;
                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                        sbLIZ.append("window='");
                                                        sbLIZ.append(cursorWindow);
                                                        sbLIZ.append("', startPos=");
                                                        sbLIZ.append(i);
                                                        sbLIZ.append(", actualPos=");
                                                        sbLIZ.append(i4);
                                                        sbLIZ.append(", filledRows=");
                                                        sbLIZ.append(iLJIIZILJ);
                                                        sbLIZ.append(", countedRows=");
                                                        sbLIZ.append(i3);
                                                        c908200Zk2.LJI(i5, C2188811AlT.LIZIZ(sbLIZ));
                                                    }
                                                    cursorWindow.LIZLLL();
                                                    return i3;
                                                } catch (RuntimeException e) {
                                                    e = e;
                                                    TryCatchGuardChecker.doCheck(e);
                                                    if (!(e instanceof SQLiteDatabaseLockedException)) {
                                                        c908180Zk0.LJII();
                                                    } else {
                                                        c908180Zk0.LJII();
                                                    }
                                                    this.LJII.LJ(i5, e);
                                                    throw e;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    TryCatchGuardChecker.doCheck(th);
                                                    if (this.LJII.LIZJ(i5)) {
                                                        C908200Zk2 c908200Zk22 = this.LJII;
                                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                        sbLIZ2.append("window='");
                                                        sbLIZ2.append(cursorWindow);
                                                        sbLIZ2.append("', startPos=");
                                                        sbLIZ2.append(i);
                                                        sbLIZ2.append(", actualPos=");
                                                        sbLIZ2.append(i4);
                                                        sbLIZ2.append(", filledRows=");
                                                        sbLIZ2.append(iLJIIZILJ);
                                                        sbLIZ2.append(", countedRows=");
                                                        sbLIZ2.append(i3);
                                                        c908200Zk22.LJI(i5, C2188811AlT.LIZIZ(sbLIZ2));
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                while (true) {
                                                    try {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        throw th;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        while (true) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    TryCatchGuardChecker.doCheck(th);
                                    try {
                                        LJIIZILJ(c908250Zk7LIZ);
                                        throw th;
                                    } catch (RuntimeException e2) {
                                        e = e2;
                                        TryCatchGuardChecker.doCheck(e);
                                        if ((!(e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (c908180Zk0 = this.LIZ) != null) {
                                            c908180Zk0.LJII();
                                        }
                                        this.LJII.LJ(i5, e);
                                        throw e;
                                    }
                                }
                            } catch (Throwable th9) {
                                th = th9;
                            }
                        } catch (RuntimeException e3) {
                            e = e3;
                        } catch (Throwable th10) {
                            th = th10;
                            iLJIIZILJ = -1;
                            i4 = -1;
                            i3 = -1;
                        }
                    } catch (Throwable th11) {
                        TryCatchGuardChecker.doCheck(th11);
                        cursorWindow.LIZLLL();
                        throw th11;
                    }
                } catch (Throwable th12) {
                    th = th12;
                }
            } else {
                throw new IllegalArgumentException("window must not be null.");
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }
}
