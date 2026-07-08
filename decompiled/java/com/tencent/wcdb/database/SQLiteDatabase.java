package com.tencent.wcdb.database;

import X.C0VSJ;
import X.C2188811AlT;
import X.C796930VNz;
import X.C907980Zjg;
import X.C907990Zjh;
import X.C908000Zji;
import X.C908010Zjj;
import X.C908020Zjk;
import X.C908050Zjn;
import X.C908100Zjs;
import X.C908180Zk0;
import X.C908190Zk1;
import X.C908220Zk4;
import X.C908270Zk9;
import X.InterfaceC2186508hT;
import X.InterfaceC875360YVq;
import android.content.ContentValues;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.Log;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes15.dex */
public final class SQLiteDatabase extends a {
    public static final WeakHashMap<SQLiteDatabase, Object> LLIZLLLIL;
    public static final String[] LLJ;
    public final InterfaceC2186508hT LLILLJJLI;
    public final InterfaceC875360YVq LLILLL;
    public final C908220Zk4 LLILZIL;
    public C908180Zk0 LLILZLL;
    public boolean LLIZ;
    public final C908050Zjn LL = new ThreadLocal<C908190Zk1>() { // from class: X.0Zjn
        @Override // java.lang.ThreadLocal
        public final C908190Zk1 initialValue() {
            C908180Zk0 c908180Zk0;
            SQLiteDatabase sQLiteDatabase = this.LIZ;
            synchronized (sQLiteDatabase.LLILZ) {
                try {
                    sQLiteDatabase.LJLJI();
                    c908180Zk0 = sQLiteDatabase.LLILZLL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return new C908190Zk1(c908180Zk0);
        }
    };
    public final Object LLILZ = new Object();

    public interface CustomFunction {
        void LIZ();
    }

    @Override // com.tencent.wcdb.database.a
    public final void LIZIZ() {
        LJIJJ(false);
    }

    public final void LJIIIIZZ() {
        LJI(true);
    }

    public final void finalize() throws Throwable {
        try {
            LJIJJ(true);
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    public final void LJIIZILJ() {
        synchronized (this.LLILZ) {
            try {
                LJLJI();
                C908220Zk4 c908220Zk4 = this.LLILZIL;
                int i = c908220Zk4.LIZLLL;
                if ((i & 536870912) == 0) {
                    return;
                }
                c908220Zk4.LIZLLL = i & (-536870913);
                try {
                    this.LLILZLL.LJIJJLI(c908220Zk4);
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C908220Zk4 c908220Zk42 = this.LLILZIL;
                    c908220Zk42.LIZLLL = 536870912 | c908220Zk42.LIZLLL;
                    throw e;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIJJLI() {
        synchronized (this.LLILZ) {
            try {
                LJLJI();
                C908220Zk4 c908220Zk4 = this.LLILZIL;
                int i = c908220Zk4.LIZLLL;
                if ((i & 536870912) != 0) {
                    return;
                }
                if ((i & 1) == 1) {
                    return;
                }
                if (c908220Zk4.LIZ.equalsIgnoreCase(":memory:")) {
                    Log.LIZJ("WCDB.SQLiteDatabase", "can't enable WAL for memory databases.");
                    return;
                }
                if (this.LLIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("this database: ");
                    sbLIZ.append(this.LLILZIL.LIZIZ);
                    sbLIZ.append(" has attached databases. can't  enable WAL.");
                    Log.LIZJ("WCDB.SQLiteDatabase", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                C908220Zk4 c908220Zk42 = this.LLILZIL;
                c908220Zk42.LIZLLL |= 536870912;
                try {
                    this.LLILZLL.LJIJJLI(c908220Zk42);
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LLILZIL.LIZLLL &= -536870913;
                    throw e;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final List<Pair<String, String>> LJJIL() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.LLILZ) {
            try {
                C908020Zjk c908020ZjkLJJLL = null;
                if (this.LLILZLL == null) {
                    return null;
                }
                if (!this.LLIZ) {
                    arrayList.add(new Pair("main", this.LLILZIL.LIZ));
                    return arrayList;
                }
                LIZ();
                try {
                    try {
                        c908020ZjkLJJLL = LJJLL("pragma database_list;", null, null);
                        while (c908020ZjkLJJLL.moveToNext()) {
                            arrayList.add(new Pair(c908020ZjkLJJLL.getString(1), c908020ZjkLJJLL.getString(2)));
                        }
                        c908020ZjkLJJLL.close();
                        LIZLLL();
                        return arrayList;
                    } catch (Throwable th) {
                        if (c908020ZjkLJJLL != null) {
                            c908020ZjkLJJLL.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    LIZLLL();
                    throw th2;
                }
            } finally {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public final String LJJJ() {
        String str;
        synchronized (this.LLILZ) {
            try {
                str = this.LLILZIL.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str;
    }

    public final C908190Zk1 LJJJJJ() {
        return get();
    }

    public final void LJJJJJL() {
        synchronized (this.LLILZ) {
            try {
                LJLJI();
                this.LLILZLL.getClass();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final int LJJJLL() {
        LIZ();
        try {
            C907990Zjh c907990Zjh = new C907990Zjh(this, "PRAGMA user_version;", null);
            LIZLLL();
            try {
                long jLIZIZ = C908000Zji.LIZIZ(c907990Zjh);
                c907990Zjh.LIZLLL();
                return Long.valueOf(jLIZIZ).intValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c907990Zjh.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            LIZLLL();
            throw th2;
        }
    }

    public final boolean LJJL() {
        boolean z;
        synchronized (this.LLILZ) {
            try {
                z = (this.LLILZIL.LIZLLL & 1) == 1;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final void LJJLIIIJ() {
        this.LLILLL.LIZ(this);
    }

    public final void LJJZ() {
        synchronized (this.LLILZ) {
            try {
                LJLJI();
                C908220Zk4 c908220Zk4 = this.LLILZIL;
                int i = c908220Zk4.LIZLLL;
                if ((i & 1) == 1) {
                    c908220Zk4.LIZLLL = i & (-2);
                    try {
                        this.LLILZLL.LJIJJLI(c908220Zk4);
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LLILZIL.LIZLLL = i;
                        throw e;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJLJI() {
        if (this.LLILZLL != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The database '");
        sbLIZ.append(this.LLILZIL.LIZIZ);
        sbLIZ.append("' is not open.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean isOpen() {
        boolean z;
        synchronized (this.LLILZ) {
            try {
                z = this.LLILZLL != null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    static {
        SQLiteGlobal.loadLib();
        LLIZLLLIL = new WeakHashMap<>();
        LLJ = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    }

    public final void LJJIIZ() {
        LIZ();
        try {
            C908270Zk9 c908270Zk9 = LJJJJJ().LJ;
            if (c908270Zk9 == null) {
                throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
            }
            if (c908270Zk9.LIZJ) {
                throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
            }
            c908270Zk9.LIZJ = true;
            LIZLLL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    public final void LJJIIZI() {
        LIZ();
        try {
            LJJJJJ().LIZJ();
            LIZLLL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SQLiteDatabase: ");
        sbLIZ.append(LJJJ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJIILLIIL(File file) {
        if (file != null) {
            boolean zDelete = file.delete();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(file.getPath());
            sbLIZ.append("-journal");
            boolean zDelete2 = zDelete | new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).delete();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(file.getPath());
            sbLIZ2.append("-shm");
            boolean zDelete3 = zDelete2 | new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)).delete();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(file.getPath());
            sbLIZ3.append("-wal");
            boolean zDelete4 = zDelete3 | new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3)).delete();
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(file.getName());
                sbLIZ4.append("-mj");
                final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                File[] fileArrListFiles = parentFile.listFiles(new FileFilter() { // from class: X.0Zjp
                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        return file2.getName().startsWith(strLIZIZ);
                    }
                });
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        zDelete4 |= file2.delete();
                    }
                }
            }
            return zDelete4;
        }
        throw new IllegalArgumentException("file must not be null");
    }

    public static int LJJJJ(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper == Looper.getMainLooper()) {
            return i | 4;
        }
        return i;
    }

    public final void LJI(boolean z) {
        int i;
        LIZ();
        try {
            C908190Zk1 c908190Zk1LJJJJJ = LJJJJJ();
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            c908190Zk1LJJJJJ.LIZIZ(i, LJJJJ(false));
            LIZLLL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    public final void LJII(ArrayList<SQLiteDebug.DbStats> arrayList) {
        synchronized (this.LLILZ) {
            try {
                if (this.LLILZLL != null) {
                    this.LLILZLL.LIZLLL(arrayList);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIJJ(boolean z) {
        C908180Zk0 c908180Zk0;
        synchronized (this.LLILZ) {
            try {
                c908180Zk0 = this.LLILZLL;
                this.LLILZLL = null;
            } finally {
            }
        }
        if (!z) {
            WeakHashMap<SQLiteDatabase, Object> weakHashMap = LLIZLLLIL;
            synchronized (weakHashMap) {
                try {
                    weakHashMap.remove(this);
                } finally {
                }
            }
            if (c908180Zk0 != null) {
                c908180Zk0.LJFF();
            }
        }
    }

    public final void LJL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PRAGMA user_version = ");
        sbLIZ.append(i);
        LJJ(C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public final long LJFF(String str, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C908190Zk1 c908190Zk1LJJJJJ = LJJJJJ();
        c908190Zk1LJJJJJ.LIZ(null, i);
        long jLJIILIIL = c908190Zk1LJJJJJ.LIZIZ.LJIILIIL(str);
        if (jLJIILIIL != 0) {
            return jLJIILIIL;
        }
        throw new IllegalStateException("SQLiteConnection native handle not initialized.");
    }

    public final void LJJ(String str, Object[] objArr) {
        boolean z;
        LIZ();
        try {
            if (C908000Zji.LIZ(str) == 3) {
                synchronized (this.LLILZ) {
                    try {
                        if (!this.LLIZ) {
                            z = true;
                            this.LLIZ = true;
                        } else {
                            z = false;
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                if (z) {
                    LJIIZILJ();
                }
            }
            C907990Zjh c907990Zjh = new C907990Zjh(this, str, objArr);
            try {
                c907990Zjh.LJII();
                c907990Zjh.LIZLLL();
                LIZLLL();
            } catch (Throwable th) {
                c907990Zjh.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            LIZLLL();
            throw th2;
        }
    }

    public final void LJJLIIJ(byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        synchronized (this.LLILZ) {
            try {
                this.LLILZLL = C908180Zk0.LJIIZILJ(this, this.LLILZIL, bArr, sQLiteCipherSpec);
            } finally {
            }
        }
        synchronized (LLIZLLLIL) {
            try {
                LLIZLLLIL.put(this, null);
            } finally {
            }
        }
    }

    public final int LJIILL(String str, String str2, String[] strArr) {
        String strLIZIZ;
        LIZ();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DELETE FROM ");
            sbLIZ.append(str);
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" WHERE ");
                sbLIZ2.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZIZ = "";
            }
            sbLIZ.append(strLIZIZ);
            C907990Zjh c907990Zjh = new C907990Zjh(this, C2188811AlT.LIZIZ(sbLIZ), strArr);
            try {
                int iLJII = c907990Zjh.LJII();
                c907990Zjh.LIZLLL();
                LIZLLL();
                return iLJII;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c907990Zjh.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            LIZLLL();
            throw th2;
        }
    }

    public final long LJJJZ(String str, ContentValues contentValues, int i) {
        int size;
        Object[] objArr;
        String str2;
        LIZ();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(LLJ[i]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            int i2 = 0;
            if (contentValues.size() > 0) {
                size = contentValues.size();
            } else {
                size = 0;
            }
            if (size > 0) {
                objArr = new Object[size];
                int i3 = 0;
                for (String str3 : contentValues.keySet()) {
                    if (i3 > 0) {
                        str2 = ",";
                    } else {
                        str2 = "";
                    }
                    sb.append(str2);
                    sb.append(str3);
                    objArr[i3] = contentValues.get(str3);
                    i3++;
                }
                sb.append(')');
                sb.append(" VALUES (");
                loop1: while (true) {
                    String str4 = "?";
                    while (true) {
                        sb.append(str4);
                        i2++;
                        if (i2 >= size) {
                            break loop1;
                        }
                        if (i2 > 0) {
                            str4 = ",?";
                        }
                    }
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                objArr = null;
                sbLIZ.append((String) null);
                sbLIZ.append(") VALUES (NULL");
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            sb.append(')');
            C907990Zjh c907990Zjh = new C907990Zjh(this, sb.toString(), objArr);
            try {
                long jLJIL = c907990Zjh.LJIL();
                c907990Zjh.LIZLLL();
                LIZLLL();
                return jLJIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c907990Zjh.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            LIZLLL();
            throw th2;
        }
    }

    public final C908020Zjk LJJLL(String str, Object[] objArr, String str2) {
        C907980Zjg c907980Zjg;
        LIZ();
        try {
            C908010Zjj c908010Zjj = new C908010Zjj(this, str, str2);
            Object obj = this.LLILLJJLI;
            if (obj == null) {
                obj = C908010Zjj.LIZLLL;
            }
            try {
                ((C908100Zjs) obj).getClass();
                c907980Zjg = new C907980Zjg(this, str, objArr);
            } catch (RuntimeException e) {
                e = e;
                c907980Zjg = null;
            }
            try {
                C908020Zjk c908020Zjk = new C908020Zjk(c908010Zjj, c907980Zjg);
                c908010Zjj.LIZJ = c907980Zjg;
                LIZLLL();
                return c908020Zjk;
            } catch (RuntimeException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                if (c907980Zjg != null) {
                    c907980Zjg.LIZLLL();
                }
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Zjn] */
    public SQLiteDatabase(int i, InterfaceC875360YVq interfaceC875360YVq, InterfaceC2186508hT interfaceC2186508hT, String str) {
        this.LLILLJJLI = interfaceC2186508hT;
        this.LLILLL = interfaceC875360YVq == null ? new InterfaceC875360YVq() { // from class: X.0YVp
            public static final String[] LIZ = {"", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1"};

            public static final void LIZIZ(String str2) {
                if (!str2.equalsIgnoreCase(":memory:") && str2.trim().length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Remove database file: ");
                    sbLIZ.append(str2);
                    Log.LIZ("WCDB.DefaultDatabaseErrorHandler", C2188811AlT.LIZIZ(sbLIZ));
                    for (String str3 : LIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str2);
                        sbLIZ2.append(str3);
                        new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)).delete();
                    }
                }
            }

            @Override // X.InterfaceC875360YVq
            public final void LIZ(SQLiteDatabase sQLiteDatabase) {
                List<Pair<String, String>> listLJJIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Corruption reported by sqlite on database: ");
                sbLIZ.append(sQLiteDatabase.LJJJ());
                Log.LIZ("WCDB.DefaultDatabaseErrorHandler", C2188811AlT.LIZIZ(sbLIZ));
                if (!sQLiteDatabase.isOpen()) {
                    LIZIZ(sQLiteDatabase.LJJJ());
                    return;
                }
                try {
                    listLJJIL = sQLiteDatabase.LJJIL();
                } catch (SQLiteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    listLJJIL = null;
                }
                sQLiteDatabase.LJJJJJL();
                try {
                    try {
                        sQLiteDatabase.LIZLLL();
                        if (listLJJIL != null) {
                            Iterator<Pair<String, String>> it2 = listLJJIL.iterator();
                            while (it2.hasNext()) {
                                LIZIZ((String) it2.next().second);
                            }
                            return;
                        }
                    } catch (SQLiteException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        if (listLJJIL != null) {
                            Iterator<Pair<String, String>> it3 = listLJJIL.iterator();
                            while (it3.hasNext()) {
                                LIZIZ((String) it3.next().second);
                            }
                            return;
                        }
                    }
                    LIZIZ(sQLiteDatabase.LJJJ());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (listLJJIL != null) {
                        Iterator<Pair<String, String>> it4 = listLJJIL.iterator();
                        while (it4.hasNext()) {
                            LIZIZ((String) it4.next().second);
                        }
                    } else {
                        LIZIZ(sQLiteDatabase.LJJJ());
                    }
                    throw th;
                }
            }
        } : interfaceC875360YVq;
        this.LLILZIL = new C908220Zk4(str, i);
    }

    public final C908020Zjk LJJLIL(String str, String[] strArr, String str2, Object[] objArr, String str3) {
        LIZ();
        try {
            String strLIZIZ = C796930VNz.LIZIZ(str, strArr, str2, str3);
            if (!TextUtils.isEmpty(str)) {
                int iIndexOf = str.indexOf(32);
                int iIndexOf2 = str.indexOf(44);
                if (iIndexOf <= 0 || (iIndexOf >= iIndexOf2 && iIndexOf2 >= 0)) {
                    if (iIndexOf2 > 0 && (iIndexOf2 < iIndexOf || iIndexOf < 0)) {
                        str = str.substring(0, iIndexOf2);
                    }
                } else {
                    str = str.substring(0, iIndexOf);
                }
                C908020Zjk c908020ZjkLJJLL = LJJLL(strLIZIZ, objArr, str);
                LIZLLL();
                return c908020ZjkLJJLL;
            }
            throw new IllegalStateException("Invalid tables");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    public static SQLiteDatabase LJJLIIIJL(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, InterfaceC2186508hT interfaceC2186508hT, int i, InterfaceC875360YVq interfaceC875360YVq) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(i, interfaceC875360YVq, interfaceC2186508hT, str);
        try {
            try {
                sQLiteDatabase.LJJLIIJ(bArr, sQLiteCipherSpec);
                return sQLiteDatabase;
            } catch (SQLiteDatabaseCorruptException e) {
                TryCatchGuardChecker.doCheck(e);
                sQLiteDatabase.LJJLIIIJ();
                sQLiteDatabase.LJJLIIJ(bArr, sQLiteCipherSpec);
                return sQLiteDatabase;
            }
        } catch (SQLiteException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to open database '");
            synchronized (sQLiteDatabase.LLILZ) {
                try {
                    sbLIZ.append(sQLiteDatabase.LLILZIL.LIZIZ);
                    sbLIZ.append("'.");
                    Log.LIZIZ("WCDB.SQLiteDatabase", C2188811AlT.LIZIZ(sbLIZ), e2);
                    sQLiteDatabase.LIZLLL();
                    throw e2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
