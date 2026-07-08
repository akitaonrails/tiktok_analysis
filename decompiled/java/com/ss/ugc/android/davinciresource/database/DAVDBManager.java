package com.ss.ugc.android.davinciresource.database;

import X.C2188811AlT;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.android.davinciresource.DavinciResource;
import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;
import com.ss.ugc.android.davinciresource.jni.DAVLoggerListener;
import com.ss.ugc.android.davinciresource.jni.IDAVDBManager;
import com.ss.ugc.android.davinciresource.jni.PairStringString;
import com.ss.ugc.android.davinciresource.jni.VecPairStringString;
import com.ss.ugc.android.davinciresource.jni.VecString;
import com.ss.ugc.android.davinciresource.jni.VecVecString;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes35.dex */
public final class DAVDBManager extends IDAVDBManager {
    public static final Companion Companion = new Companion();
    public final Context context;
    public String dbName;
    public DAVSQLiteHelper sqLiteOpenHelper;

    public static final class Companion {
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean Open() {
        return true;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean Close() {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            dAVSQLiteHelper.close();
        }
        DBManagerFactory dbManagerFactory = DavinciResource.INSTANCE.getDbManagerFactory();
        if (dbManagerFactory == null) {
            return true;
        }
        dbManagerFactory.removeDBManager(this.dbName);
        return true;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDbName() {
        return this.dbName;
    }

    public final DAVSQLiteHelper getSqLiteOpenHelper() {
        return this.sqLiteOpenHelper;
    }

    private final void errorLog(String str) {
        DAVLoggerListener logger = DavinciResource.INSTANCE.getLogger();
        if (logger != null) {
            DAVLogLevel dAVLogLevel = DAVLogLevel.LEVEL_ERROR;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DAVDBManager:");
            sbLIZ.append(str);
            logger.onLog(dAVLogLevel, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public VecVecString GetAllData(String str) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.getAllData();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                errorLog(e.getMessage());
            }
        }
        return new VecVecString();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public void InitConfig(String str) {
        if (str != null) {
            this.dbName = str;
        }
    }

    public final void setDbName(String str) {
        this.dbName = str;
    }

    public final void setSqLiteOpenHelper(DAVSQLiteHelper dAVSQLiteHelper) {
        this.sqLiteOpenHelper = dAVSQLiteHelper;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean CreateTable(VecString vecString, String str) {
        if (vecString == null || vecString.isEmpty() || str == null || a0.LJJJIL(str)) {
            return false;
        }
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it2 = vecString.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                this.sqLiteOpenHelper = new DAVSQLiteHelper(this.context, this.dbName, str, arrayList, 1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return true;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public VecString GetDatas(String str, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.getDatas(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                errorLog(e.getMessage());
            }
        }
        return new VecString();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean RemoveData(String str, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.removeData(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                errorLog(e.getMessage());
                return false;
            }
        }
        return false;
    }

    public DAVDBManager(Context context, String str, DAVSQLiteHelper dAVSQLiteHelper) {
        super(str);
        this.context = context;
        this.dbName = str;
        this.sqLiteOpenHelper = dAVSQLiteHelper;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public VecString GetData(PairStringString pairStringString, String str, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.getData(pairStringString, str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                errorLog(e.getMessage());
            }
        }
        return new VecString();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean InsertData(String str, VecPairStringString vecPairStringString, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.insertData(str, vecPairStringString);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                errorLog(e.getMessage());
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean UpdateData(String str, VecPairStringString vecPairStringString, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.updateData(str, vecPairStringString);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                errorLog(e.getMessage());
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public VecVecString GetData(PairStringString pairStringString, boolean z, String str) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.getData(pairStringString, z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                errorLog(e.getMessage());
            }
        }
        return new VecVecString();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean InsertData(String str, VecString vecString, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.insertData(str, vecString);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                errorLog(e.getMessage());
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean UpdateData(String str, VecString vecString, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.updateData(str, vecString);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                errorLog(e.getMessage());
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public VecVecString GetData(VecPairStringString vecPairStringString, boolean z, String str) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.getData(vecPairStringString, z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                errorLog(e.getMessage());
            }
        }
        return new VecVecString();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public String GetData(String str, String str2, String str3) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.getData(str, str2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                errorLog(e.getMessage());
                return "";
            }
        }
        return "";
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public VecVecString GetDataByRange(String str, String str2, String str3, VecPairStringString vecPairStringString, boolean z, String str4) {
        return new VecVecString();
    }
}
