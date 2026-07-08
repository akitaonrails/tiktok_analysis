package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLEUploadParams {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLEUploadParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public MapStrStr getMetadata() {
        long jNLEUploadParams_metadata_get = NLEMediaJniJNI.NLEUploadParams_metadata_get(this.swigCPtr, this);
        if (jNLEUploadParams_metadata_get == 0) {
            return null;
        }
        return new MapStrStr(jNLEUploadParams_metadata_get, false);
    }

    public boolean getRemoveSourceMetadata() {
        return NLEMediaJniJNI.NLEUploadParams_removeSourceMetadata_get(this.swigCPtr, this);
    }

    public VecString getSourceFilePaths() {
        long jNLEUploadParams_sourceFilePaths_get = NLEMediaJniJNI.NLEUploadParams_sourceFilePaths_get(this.swigCPtr, this);
        if (jNLEUploadParams_sourceFilePaths_get == 0) {
            return null;
        }
        return new VecString(jNLEUploadParams_sourceFilePaths_get, false);
    }

    public NLEUploadParams() {
        this(NLEMediaJniJNI.new_NLEUploadParams(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEUploadParams nLEUploadParams) {
        if (nLEUploadParams == null) {
            return 0L;
        }
        return nLEUploadParams.swigCPtr;
    }

    public void setMetadata(MapStrStr mapStrStr) {
        NLEMediaJniJNI.NLEUploadParams_metadata_set(this.swigCPtr, this, MapStrStr.getCPtr(mapStrStr), mapStrStr);
    }

    public void setRemoveSourceMetadata(boolean z) {
        NLEMediaJniJNI.NLEUploadParams_removeSourceMetadata_set(this.swigCPtr, this, z);
    }

    public void setSourceFilePaths(VecString vecString) {
        NLEMediaJniJNI.NLEUploadParams_sourceFilePaths_set(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public NLEUploadParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
