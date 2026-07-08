package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEMediaReverseUtil {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEMediaReverseUtil(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEMediaReverseUtil() {
        this(NLEMediaPublicJniJNI.new_NLEMediaReverseUtil(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaReverseUtil nLEMediaReverseUtil) {
        if (nLEMediaReverseUtil == null) {
            return 0L;
        }
        return nLEMediaReverseUtil.swigCPtr;
    }

    public NLEMediaReverseUtil(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static NLEError reverseAudio(String str, String str2) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaReverseUtil_reverseAudio(str, str2));
    }

    public static NLEError reverseNLEModel(NLEModel nLEModel, String str, NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper, NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper, String str2) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaReverseUtil_reverseNLEModel__SWIG_3(NLEModel.getCPtr(nLEModel), nLEModel, str, NLEMediaOnProgressChangedWrapper.getCPtr(nLEMediaOnProgressChangedWrapper), nLEMediaOnProgressChangedWrapper, NLEMediaOnDoneWrapper.getCPtr(nLEMediaOnDoneWrapper), nLEMediaOnDoneWrapper, str2));
    }

    public static NLEError reverseNLEModel(NLEModel nLEModel, String str, NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper, NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper, String str2, int i) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaReverseUtil_reverseNLEModel__SWIG_2(NLEModel.getCPtr(nLEModel), nLEModel, str, NLEMediaOnProgressChangedWrapper.getCPtr(nLEMediaOnProgressChangedWrapper), nLEMediaOnProgressChangedWrapper, NLEMediaOnDoneWrapper.getCPtr(nLEMediaOnDoneWrapper), nLEMediaOnDoneWrapper, str2, i));
    }

    public static NLEError reverseNLEModel(NLEModel nLEModel, String str, NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper, NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper, String str2, int i, int i2) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaReverseUtil_reverseNLEModel__SWIG_1(NLEModel.getCPtr(nLEModel), nLEModel, str, NLEMediaOnProgressChangedWrapper.getCPtr(nLEMediaOnProgressChangedWrapper), nLEMediaOnProgressChangedWrapper, NLEMediaOnDoneWrapper.getCPtr(nLEMediaOnDoneWrapper), nLEMediaOnDoneWrapper, str2, i, i2));
    }

    public static NLEError reverseNLEModel(NLEModel nLEModel, String str, NLEMediaOnProgressChangedWrapper nLEMediaOnProgressChangedWrapper, NLEMediaOnDoneWrapper nLEMediaOnDoneWrapper, String str2, int i, int i2, boolean z) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaReverseUtil_reverseNLEModel__SWIG_0(NLEModel.getCPtr(nLEModel), nLEModel, str, NLEMediaOnProgressChangedWrapper.getCPtr(nLEMediaOnProgressChangedWrapper), nLEMediaOnProgressChangedWrapper, NLEMediaOnDoneWrapper.getCPtr(nLEMediaOnDoneWrapper), nLEMediaOnDoneWrapper, str2, i, i2, z));
    }
}
