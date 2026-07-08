package com.ss.ugc.android.davinciresource.database;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.android.davinciresource.jni.DAVDBManagerFactory;
import com.ss.ugc.android.davinciresource.jni.IDAVDBManager;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes35.dex */
public final class DBManagerFactory extends DAVDBManagerFactory {
    public final Context context;
    public final ConcurrentHashMap<String, DAVDBManager> dbMap = new ConcurrentHashMap<>();

    public final Context getContext() {
        return this.context;
    }

    public DBManagerFactory(Context context) {
        this.context = context;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVDBManagerFactory
    public IDAVDBManager getDBManager(String str) {
        if (str == null) {
            str = "dav_default";
        }
        synchronized (this) {
            try {
                DAVDBManager dAVDBManager = this.dbMap.get(str);
                if (dAVDBManager != null) {
                    return dAVDBManager;
                }
                DAVDBManager dAVDBManager2 = new DAVDBManager(this.context, str, null);
                this.dbMap.put(str, dAVDBManager2);
                return dAVDBManager2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void removeDBManager(String str) {
        synchronized (this) {
            try {
                if (this.dbMap.contains(str)) {
                    this.dbMap.remove(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
