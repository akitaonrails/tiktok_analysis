package com.tencent.wcdb.database;

import X.C2188811AlT;
import X.C786410Ut5;
import X.C908190Zk1;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes15.dex */
public final class SQLiteDebug {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX INFO: loaded from: classes14.dex */
    public static class IOTraceStats {
        public String dbName;
        public String journalMode;
        public long lastJournalReadOffset;
        public byte[] lastJournalReadPage;
        public long lastJournalWriteOffset;
        public byte[] lastJournalWritePage;
        public long lastReadOffset;
        public byte[] lastReadPage;
        public long lastWriteOffset;
        public byte[] lastWritePage;
        public long pageCount;
        public long pageSize;
        public String path;

        public String toString() {
            return C786410Ut5.j4("[%s | %s] pageSize: %d, pageCount: %d, journal: %s, lastRead: %d, lastWrite: %d, lastJournalRead: %d, lastJournalWrite: %d", new Object[]{this.dbName, this.path, Long.valueOf(this.pageSize), Long.valueOf(this.pageCount), this.journalMode, Long.valueOf(this.lastReadOffset), Long.valueOf(this.lastWriteOffset), Long.valueOf(this.lastJournalReadOffset), Long.valueOf(this.lastJournalWriteOffset)});
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class PagerStats {
        public ArrayList<DbStats> dbStats;
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    public static native void nativeGetIOTraceStats(long j, ArrayList<IOTraceStats> arrayList);

    public static native int nativeGetLastErrorLine();

    public static native void nativeGetPagerStats(PagerStats pagerStats);

    public static native void nativeSetIOTraceFlags(int i);

    public static PagerStats LIZJ() {
        PagerStats pagerStats = new PagerStats();
        nativeGetPagerStats(pagerStats);
        WeakHashMap<SQLiteDatabase, Object> weakHashMap = SQLiteDatabase.LLIZLLLIL;
        ArrayList<DbStats> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        WeakHashMap<SQLiteDatabase, Object> weakHashMap2 = SQLiteDatabase.LLIZLLLIL;
        synchronized (weakHashMap2) {
            try {
                arrayList2.addAll(weakHashMap2.keySet());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((SQLiteDatabase) it2.next()).LJII(arrayList);
        }
        pagerStats.dbStats = arrayList;
        return pagerStats;
    }

    static {
        SQLiteGlobal.loadLib();
    }

    public static void LIZ(SQLiteConnection sQLiteConnection) {
        try {
            nativeGetLastErrorLine();
            ArrayList arrayList = new ArrayList();
            long jLJIILIIL = sQLiteConnection.LJIILIIL(null);
            if (jLJIILIIL != 0) {
                nativeGetIOTraceStats(jLJIILIIL, arrayList);
                sQLiteConnection.LJ();
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot collect I/O trace statistics: ");
            sbLIZ.append(e.getMessage());
            Log.LIZ("WCDB.SQLiteDebug", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZIZ(SQLiteDatabase sQLiteDatabase) {
        try {
            nativeGetLastErrorLine();
            ArrayList arrayList = new ArrayList();
            long jLJFF = sQLiteDatabase.LJFF("collectIoStat", false);
            if (jLJFF != 0) {
                nativeGetIOTraceStats(jLJFF, arrayList);
            }
            C908190Zk1 c908190Zk1LJJJJJ = sQLiteDatabase.LJJJJJ();
            SQLiteConnection sQLiteConnection = c908190Zk1LJJJJJ.LIZIZ;
            if (sQLiteConnection != null) {
                sQLiteConnection.LJ();
            }
            c908190Zk1LJJJJJ.LJIIIIZZ();
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot collect I/O trace statistics: ");
            sbLIZ.append(e.getMessage());
            Log.LIZ("WCDB.SQLiteDebug", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class DbStats {
        public String cache;
        public String dbName;
        public long dbSize;
        public int lookaside;
        public long pageSize;

        public DbStats(String str, long j, long j2, int i, int i2, int i3, int i4) {
            this.dbName = str;
            this.pageSize = j2 / 1024;
            this.dbSize = (j * j2) / 1024;
            this.lookaside = i;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i2);
            sbLIZ.append("/");
            sbLIZ.append(i3);
            sbLIZ.append("/");
            sbLIZ.append(i4);
            this.cache = C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
