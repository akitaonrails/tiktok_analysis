package com.tiktok.strategycenterengineimpl.storagecenter.nativedb;

import X.C0VSJ;
import X.C2188811AlT;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.tiktok.strategycenterengineimpl.storagecenter.model.TTMSceneModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes14.dex */
public final class TTMNativeDataManager {
    public static long dbPtr;
    public static final TTMNativeDataManager INSTANCE = new TTMNativeDataManager();
    public static final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    public static String dbName = "ttm_strategy.db";
    public static String dbPath = "";

    public final native boolean nativeDeleteAllData(long j);

    public final native List<String> nativeGetAllSceneKey(long j);

    public final native TTMSceneModel nativeGetSceneModel(long j, String str);

    public final native long nativeInitDB(String str);

    static {
        INVOKESTATIC_com_tiktok_strategycenterengineimpl_storagecenter_nativedb_TTMNativeDataManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("wcdb");
    }

    public final boolean deleteAllData() {
        int readHoldCount;
        int i = 0;
        if (dbPtr == 0) {
            return false;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = readWriteLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            boolean zNativeDeleteAllData = INSTANCE.nativeDeleteAllData(dbPtr);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            return zNativeDeleteAllData;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final List<TTMSceneModel> getAllSceneModelFromDB() {
        if (dbPtr == 0) {
            return new ArrayList();
        }
        ReentrantReadWriteLock.ReadLock lock = readWriteLock.readLock();
        lock.lock();
        try {
            List<String> listNativeGetAllSceneKey = INSTANCE.nativeGetAllSceneKey(dbPtr);
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = listNativeGetAllSceneKey.iterator();
            while (it2.hasNext()) {
                TTMSceneModel tTMSceneModelNativeGetSceneModel = INSTANCE.nativeGetSceneModel(dbPtr, it2.next());
                if (tTMSceneModelNativeGetSceneModel != null) {
                    arrayList.add(tTMSceneModelNativeGetSceneModel);
                }
            }
            lock.unlock();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public final long getDBFileSize() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(dbPath);
        sbLIZ.append(dbName);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists()) {
            return c0vsj.length();
        }
        return 0L;
    }

    public static void INVOKESTATIC_com_tiktok_strategycenterengineimpl_storagecenter_nativedb_TTMNativeDataManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public final TTMSceneModel getSceneModelWithKeyFromDB(String str) {
        if (dbPtr == 0) {
            return null;
        }
        ReentrantReadWriteLock.ReadLock lock = readWriteLock.readLock();
        lock.lock();
        try {
            TTMSceneModel tTMSceneModelNativeGetSceneModel = INSTANCE.nativeGetSceneModel(dbPtr, str);
            lock.unlock();
            return tTMSceneModelNativeGetSceneModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public final long initDB(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("db/");
        dbPath = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(dbPath);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(dbPath);
        sbLIZ2.append(dbName);
        long jNativeInitDB = nativeInitDB(C2188811AlT.LIZIZ(sbLIZ2));
        dbPtr = jNativeInitDB;
        if (jNativeInitDB != 0) {
            return 0L;
        }
        return -1L;
    }

    public final int insertSceneModelToDB(TTMSceneModel tTMSceneModel) {
        int readHoldCount;
        if (dbPtr == 0) {
            return -1;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = readWriteLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            int iSaveTTMSceneToNativeDB = tTMSceneModel.saveTTMSceneToNativeDB(dbPtr);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            return iSaveTTMSceneToNativeDB;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }
}
