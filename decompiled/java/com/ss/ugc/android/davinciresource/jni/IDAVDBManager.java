package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class IDAVDBManager {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_IDAVDBManager(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        DavinciResourceJniJNI.IDAVDBManager_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        DavinciResourceJniJNI.IDAVDBManager_change_ownership(this, this.swigCPtr, true);
    }

    public boolean Close() {
        return DavinciResourceJniJNI.IDAVDBManager_Close(this.swigCPtr, this);
    }

    public VecVecString GetAllData() {
        return new VecVecString(DavinciResourceJniJNI.IDAVDBManager_GetAllData__SWIG_1(this.swigCPtr, this), true);
    }

    public boolean Open() {
        return DavinciResourceJniJNI.IDAVDBManager_Open(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public IDAVDBManager(String str) {
        this(DavinciResourceJniJNI.new_IDAVDBManager(str), true);
        DavinciResourceJniJNI.IDAVDBManager_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(IDAVDBManager iDAVDBManager) {
        if (iDAVDBManager == null) {
            return 0L;
        }
        return iDAVDBManager.swigCPtr;
    }

    public boolean CreateTable(VecString vecString) {
        return DavinciResourceJniJNI.IDAVDBManager_CreateTable__SWIG_1(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public VecVecString GetAllData(String str) {
        return new VecVecString(DavinciResourceJniJNI.IDAVDBManager_GetAllData__SWIG_0(this.swigCPtr, this, str), true);
    }

    public VecVecString GetData(PairStringString pairStringString) {
        return new VecVecString(DavinciResourceJniJNI.IDAVDBManager_GetData__SWIG_6(this.swigCPtr, this, PairStringString.getCPtr(pairStringString), pairStringString), true);
    }

    public VecString GetDatas(String str) {
        return new VecString(DavinciResourceJniJNI.IDAVDBManager_GetDatas__SWIG_1(this.swigCPtr, this, str), true);
    }

    public void InitConfig(String str) {
        DavinciResourceJniJNI.IDAVDBManager_InitConfig(this.swigCPtr, this, str);
    }

    public boolean RemoveData(String str) {
        return DavinciResourceJniJNI.IDAVDBManager_RemoveData__SWIG_1(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public VecVecString GetData(VecPairStringString vecPairStringString) {
        return new VecVecString(DavinciResourceJniJNI.IDAVDBManager_GetData__SWIG_9(this.swigCPtr, this, VecPairStringString.getCPtr(vecPairStringString), vecPairStringString), true);
    }

    public IDAVDBManager(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean CreateTable(VecString vecString, String str) {
        return DavinciResourceJniJNI.IDAVDBManager_CreateTable__SWIG_0(this.swigCPtr, this, VecString.getCPtr(vecString), vecString, str);
    }

    public VecString GetData(PairStringString pairStringString, String str) {
        return new VecString(DavinciResourceJniJNI.IDAVDBManager_GetData__SWIG_3(this.swigCPtr, this, PairStringString.getCPtr(pairStringString), pairStringString, str), true);
    }

    public VecString GetDatas(String str, String str2) {
        return new VecString(DavinciResourceJniJNI.IDAVDBManager_GetDatas__SWIG_0(this.swigCPtr, this, str, str2), true);
    }

    public boolean InsertData(String str, VecPairStringString vecPairStringString) {
        return DavinciResourceJniJNI.IDAVDBManager_InsertData__SWIG_3(this.swigCPtr, this, str, VecPairStringString.getCPtr(vecPairStringString), vecPairStringString);
    }

    public boolean RemoveData(String str, String str2) {
        return DavinciResourceJniJNI.IDAVDBManager_RemoveData__SWIG_0(this.swigCPtr, this, str, str2);
    }

    public boolean UpdateData(String str, VecPairStringString vecPairStringString) {
        return DavinciResourceJniJNI.IDAVDBManager_UpdateData__SWIG_1(this.swigCPtr, this, str, VecPairStringString.getCPtr(vecPairStringString), vecPairStringString);
    }

    public VecVecString GetData(PairStringString pairStringString, boolean z) {
        return new VecVecString(DavinciResourceJniJNI.IDAVDBManager_GetData__SWIG_5(this.swigCPtr, this, PairStringString.getCPtr(pairStringString), pairStringString, z), true);
    }

    public boolean InsertData(String str, VecString vecString) {
        return DavinciResourceJniJNI.IDAVDBManager_InsertData__SWIG_1(this.swigCPtr, this, str, VecString.getCPtr(vecString), vecString);
    }

    public boolean UpdateData(String str, VecString vecString) {
        return DavinciResourceJniJNI.IDAVDBManager_UpdateData__SWIG_3(this.swigCPtr, this, str, VecString.getCPtr(vecString), vecString);
    }

    public VecVecString GetData(VecPairStringString vecPairStringString, boolean z) {
        return new VecVecString(DavinciResourceJniJNI.IDAVDBManager_GetData__SWIG_8(this.swigCPtr, this, VecPairStringString.getCPtr(vecPairStringString), vecPairStringString, z), true);
    }

    public String GetData(String str, String str2) {
        return DavinciResourceJniJNI.IDAVDBManager_GetData__SWIG_1(this.swigCPtr, this, str, str2);
    }

    public VecString GetData(PairStringString pairStringString, String str, String str2) {
        return new VecString(DavinciResourceJniJNI.IDAVDBManager_GetData__SWIG_2(this.swigCPtr, this, PairStringString.getCPtr(pairStringString), pairStringString, str, str2), true);
    }

    public VecVecString GetDataByRange(String str, String str2, String str3) {
        return new VecVecString(DavinciResourceJniJNI.IDAVDBManager_GetDataByRange__SWIG_3(this.swigCPtr, this, str, str2, str3), true);
    }

    public boolean InsertData(String str, VecPairStringString vecPairStringString, String str2) {
        return DavinciResourceJniJNI.IDAVDBManager_InsertData__SWIG_2(this.swigCPtr, this, str, VecPairStringString.getCPtr(vecPairStringString), vecPairStringString, str2);
    }

    public boolean UpdateData(String str, VecPairStringString vecPairStringString, String str2) {
        return DavinciResourceJniJNI.IDAVDBManager_UpdateData__SWIG_0(this.swigCPtr, this, str, VecPairStringString.getCPtr(vecPairStringString), vecPairStringString, str2);
    }

    public VecVecString GetData(PairStringString pairStringString, boolean z, String str) {
        return new VecVecString(DavinciResourceJniJNI.IDAVDBManager_GetData__SWIG_4(this.swigCPtr, this, PairStringString.getCPtr(pairStringString), pairStringString, z, str), true);
    }

    public boolean InsertData(String str, VecString vecString, String str2) {
        return DavinciResourceJniJNI.IDAVDBManager_InsertData__SWIG_0(this.swigCPtr, this, str, VecString.getCPtr(vecString), vecString, str2);
    }

    public boolean UpdateData(String str, VecString vecString, String str2) {
        return DavinciResourceJniJNI.IDAVDBManager_UpdateData__SWIG_2(this.swigCPtr, this, str, VecString.getCPtr(vecString), vecString, str2);
    }

    public VecVecString GetData(VecPairStringString vecPairStringString, boolean z, String str) {
        return new VecVecString(DavinciResourceJniJNI.IDAVDBManager_GetData__SWIG_7(this.swigCPtr, this, VecPairStringString.getCPtr(vecPairStringString), vecPairStringString, z, str), true);
    }

    public String GetData(String str, String str2, String str3) {
        return DavinciResourceJniJNI.IDAVDBManager_GetData__SWIG_0(this.swigCPtr, this, str, str2, str3);
    }

    public VecVecString GetDataByRange(String str, String str2, String str3, VecPairStringString vecPairStringString) {
        return new VecVecString(DavinciResourceJniJNI.IDAVDBManager_GetDataByRange__SWIG_2(this.swigCPtr, this, str, str2, str3, VecPairStringString.getCPtr(vecPairStringString), vecPairStringString), true);
    }

    public VecVecString GetDataByRange(String str, String str2, String str3, VecPairStringString vecPairStringString, boolean z) {
        return new VecVecString(DavinciResourceJniJNI.IDAVDBManager_GetDataByRange__SWIG_1(this.swigCPtr, this, str, str2, str3, VecPairStringString.getCPtr(vecPairStringString), vecPairStringString, z), true);
    }

    public VecVecString GetDataByRange(String str, String str2, String str3, VecPairStringString vecPairStringString, boolean z, String str4) {
        return new VecVecString(DavinciResourceJniJNI.IDAVDBManager_GetDataByRange__SWIG_0(this.swigCPtr, this, str, str2, str3, VecPairStringString.getCPtr(vecPairStringString), vecPairStringString, z, str4), true);
    }
}
