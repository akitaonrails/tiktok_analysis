package com.tencent.wcdb.repair;

import X.C0YQI;
import X.C0YQJ;
import X.C2188811AlT;
import X.C868780Y6i;
import X.C908190Zk1;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import m4p.a;

/* JADX INFO: loaded from: classes15.dex */
public class RepairKit {
    public long LIZ;
    public C0YQI LIZIZ;
    public C0YQJ LIZJ;
    public RepairCursor LIZLLL;

    public static class RepairCursor extends a {
        public long LLJILJIL;

        public static native byte[] nativeGetBlob(long j, int i);

        public static native int nativeGetColumnCount(long j);

        public static native double nativeGetDouble(long j, int i);

        public static native long nativeGetLong(long j, int i);

        public static native String nativeGetString(long j, int i);

        public static native int nativeGetType(long j, int i);

        @Override // m4p.a, android.database.Cursor
        public final int getColumnCount() {
            return nativeGetColumnCount(this.LLJILJIL);
        }

        @Override // m4p.a, android.database.Cursor
        public final String[] getColumnNames() {
            throw new UnsupportedOperationException();
        }

        @Override // m4p.a, X.C1ETH, android.database.Cursor
        public final int getCount() {
            throw new UnsupportedOperationException();
        }

        @Override // m4p.a, X.C1ETH, android.database.Cursor
        public final byte[] getBlob(int i) {
            return nativeGetBlob(this.LLJILJIL, i);
        }

        @Override // android.database.Cursor
        public final double getDouble(int i) {
            return nativeGetDouble(this.LLJILJIL, i);
        }

        @Override // android.database.Cursor
        public final float getFloat(int i) {
            return (float) getDouble(i);
        }

        @Override // X.C1ETH, android.database.Cursor
        public final int getInt(int i) {
            return (int) getLong(i);
        }

        @Override // m4p.a, X.C1ETH, android.database.Cursor
        public final long getLong(int i) {
            return nativeGetLong(this.LLJILJIL, i);
        }

        @Override // android.database.Cursor
        public final short getShort(int i) {
            return (short) getLong(i);
        }

        @Override // m4p.a, X.C1ETH, android.database.Cursor
        public final String getString(int i) {
            return nativeGetString(this.LLJILJIL, i);
        }

        @Override // m4p.a, X.C1ETH, android.database.Cursor
        public final int getType(int i) {
            return nativeGetType(this.LLJILJIL, i);
        }

        @Override // android.database.Cursor
        public final boolean isNull(int i) {
            if (getType(i) == 0) {
                return true;
            }
            return false;
        }
    }

    public static native void nativeCancel(long j);

    public static native void nativeFini(long j);

    public static native void nativeFreeMaster(long j);

    public static native long nativeInit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, byte[] bArr2);

    public static native int nativeIntegrityFlags(long j);

    public static native String nativeLastError();

    public static native long nativeLoadMaster(String str, byte[] bArr, String[] strArr, byte[] bArr2);

    public static native long nativeMakeMaster(String[] strArr);

    private native int nativeOutput(long j, long j2, long j3, int i);

    public static native boolean nativeSaveMaster(long j, String str, byte[] bArr);

    public final void LIZIZ() {
        C0YQI c0yqi = this.LIZIZ;
        if (c0yqi != null) {
            long j = c0yqi.LIZ;
            if (j != 0) {
                nativeFreeMaster(j);
                c0yqi.LIZ = 0L;
            }
            this.LIZIZ = null;
        }
        long j2 = this.LIZ;
        if (j2 != 0) {
            nativeFini(j2);
            this.LIZ = 0L;
        }
    }

    public final void finalize() throws Throwable {
        LIZIZ();
        super.finalize();
    }

    public final int LIZ(SQLiteDatabase sQLiteDatabase) {
        long j;
        if (this.LIZ != 0) {
            C0YQI c0yqi = this.LIZIZ;
            if (c0yqi == null) {
                j = 0;
            } else {
                j = c0yqi.LIZ;
            }
            int iNativeOutput = nativeOutput(this.LIZ, sQLiteDatabase.LJFF("repair", false), j, 0);
            C908190Zk1 c908190Zk1LJJJJJ = sQLiteDatabase.LJJJJJ();
            SQLiteConnection sQLiteConnection = c908190Zk1LJJJJJ.LIZIZ;
            if (sQLiteConnection != null) {
                sQLiteConnection.LJ();
            }
            c908190Zk1LJJJJJ.LJIIIIZZ();
            this.LIZLLL = null;
            nativeIntegrityFlags(this.LIZ);
            return iNativeOutput;
        }
        throw new IllegalArgumentException();
    }

    public RepairKit(String str, byte[] bArr, C0YQI c0yqi) {
        byte[] bArr2;
        if (str != null) {
            if (c0yqi == null) {
                bArr2 = null;
            } else {
                bArr2 = c0yqi.LIZIZ;
            }
            long jNativeInit = nativeInit(str, bArr, null, bArr2);
            this.LIZ = jNativeInit;
            if (jNativeInit != 0) {
                nativeIntegrityFlags(jNativeInit);
                this.LIZIZ = c0yqi;
                return;
            }
            throw new SQLiteException("Failed initialize RepairKit.");
        }
        throw new IllegalArgumentException();
    }

    private int onProgress(String str, int i, long j) {
        if (this.LIZJ == null) {
            return 0;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new RepairCursor();
        }
        this.LIZLLL.LLJILJIL = j;
        C0YQJ c0yqj = this.LIZJ;
        c0yqj.LIZ.LIZ++;
        C868780Y6i c868780Y6iLIZLLL = c0yqj.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalWcdbOpenHelper RepairKit.Callback onProgress, table:");
        sbLIZ.append(str);
        sbLIZ.append(", root:");
        sbLIZ.append(i);
        sbLIZ.append(", repairCount:");
        sbLIZ.append(c0yqj.LIZ.LIZ);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        return 0;
    }
}
