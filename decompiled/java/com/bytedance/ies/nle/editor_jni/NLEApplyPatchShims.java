package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLEApplyPatchShims {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEApplyPatchShims(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void finalize() {
        delete();
    }

    public NLEApplyPatchShims(NLEModel nLEModel) {
        this(NLEMediaPublicJniJNI.new_NLEApplyPatchShims(NLEModel.getCPtr(nLEModel), nLEModel), true);
    }

    public static long getCPtr(NLEApplyPatchShims nLEApplyPatchShims) {
        if (nLEApplyPatchShims == null) {
            return 0L;
        }
        return nLEApplyPatchShims.swigCPtr;
    }

    public NLEModel rebindNLEModel(NLEModel nLEModel) {
        long jNLEApplyPatchShims_rebindNLEModel = NLEMediaPublicJniJNI.NLEApplyPatchShims_rebindNLEModel(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel);
        if (jNLEApplyPatchShims_rebindNLEModel == 0) {
            return null;
        }
        return new NLEModel(jNLEApplyPatchShims_rebindNLEModel, true);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEApplyPatchShims(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public NLESafetyApplyPatchToken applyNLEModel(NLEModel nLEModel, INLEApplyPatchCallback iNLEApplyPatchCallback) {
        long jNLEApplyPatchShims_applyNLEModel__SWIG_0 = NLEMediaPublicJniJNI.NLEApplyPatchShims_applyNLEModel__SWIG_0(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, INLEApplyPatchCallback.getCPtr(iNLEApplyPatchCallback), iNLEApplyPatchCallback);
        if (jNLEApplyPatchShims_applyNLEModel__SWIG_0 == 0) {
            return null;
        }
        return new NLESafetyApplyPatchToken(jNLEApplyPatchShims_applyNLEModel__SWIG_0, true);
    }

    public NLESafetyApplyPatchToken applyNLEModelWithJSON(String str, INLEApplyPatchCallback iNLEApplyPatchCallback) {
        long jNLEApplyPatchShims_applyNLEModelWithJSON = NLEMediaPublicJniJNI.NLEApplyPatchShims_applyNLEModelWithJSON(this.swigCPtr, this, str, INLEApplyPatchCallback.getCPtr(iNLEApplyPatchCallback), iNLEApplyPatchCallback);
        if (jNLEApplyPatchShims_applyNLEModelWithJSON == 0) {
            return null;
        }
        return new NLESafetyApplyPatchToken(jNLEApplyPatchShims_applyNLEModelWithJSON, true);
    }

    public NLESafetyApplyPatchToken applyNLEModel(NLEModel nLEModel, INLEApplyPatchCallback iNLEApplyPatchCallback, boolean z) {
        long jNLEApplyPatchShims_applyNLEModel__SWIG_1 = NLEMediaPublicJniJNI.NLEApplyPatchShims_applyNLEModel__SWIG_1(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, INLEApplyPatchCallback.getCPtr(iNLEApplyPatchCallback), iNLEApplyPatchCallback, z);
        if (jNLEApplyPatchShims_applyNLEModel__SWIG_1 == 0) {
            return null;
        }
        return new NLESafetyApplyPatchToken(jNLEApplyPatchShims_applyNLEModel__SWIG_1, true);
    }
}
