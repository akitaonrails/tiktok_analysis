package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public class NLECompileMediaInfo {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaJniJNI.delete_NLECompileMediaInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getFilePath() {
        return NLEMediaJniJNI.NLECompileMediaInfo_filePath_get(this.swigCPtr, this);
    }

    public MapStrStr getMetadata() {
        long jNLECompileMediaInfo_metadata_get = NLEMediaJniJNI.NLECompileMediaInfo_metadata_get(this.swigCPtr, this);
        if (jNLECompileMediaInfo_metadata_get == 0) {
            return null;
        }
        return new MapStrStr(jNLECompileMediaInfo_metadata_get, false);
    }

    public NLECompileMediaInfo() {
        this(NLEMediaJniJNI.new_NLECompileMediaInfo(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLECompileMediaInfo nLECompileMediaInfo) {
        if (nLECompileMediaInfo == null) {
            return 0L;
        }
        return nLECompileMediaInfo.swigCPtr;
    }

    public void setFilePath(String str) {
        NLEMediaJniJNI.NLECompileMediaInfo_filePath_set(this.swigCPtr, this, str);
    }

    public void setMetadata(MapStrStr mapStrStr) {
        NLEMediaJniJNI.NLECompileMediaInfo_metadata_set(this.swigCPtr, this, MapStrStr.getCPtr(mapStrStr), mapStrStr);
    }

    public NLECompileMediaInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
