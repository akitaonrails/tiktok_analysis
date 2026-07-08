package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEResourceIdParser {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEEditorJniJNI.delete_NLEResourceIdParser(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getHost() {
        return NLEEditorJniJNI.NLEResourceIdParser_host_get(this.swigCPtr, this);
    }

    public String getProtocol() {
        return NLEEditorJniJNI.NLEResourceIdParser_protocol_get(this.swigCPtr, this);
    }

    public String getQuery() {
        return NLEEditorJniJNI.NLEResourceIdParser_query_get(this.swigCPtr, this);
    }

    public UnorderedMapStrStr getQueryParams() {
        long jNLEResourceIdParser_queryParams_get = NLEEditorJniJNI.NLEResourceIdParser_queryParams_get(this.swigCPtr, this);
        if (jNLEResourceIdParser_queryParams_get == 0) {
            return null;
        }
        return new UnorderedMapStrStr(jNLEResourceIdParser_queryParams_get, false);
    }

    public void finalize() {
        delete();
    }

    public NLEResourceIdParser(String str) {
        this(NLEEditorJniJNI.new_NLEResourceIdParser(str), true);
    }

    public static long getCPtr(NLEResourceIdParser nLEResourceIdParser) {
        if (nLEResourceIdParser == null) {
            return 0L;
        }
        return nLEResourceIdParser.swigCPtr;
    }

    public void setHost(String str) {
        NLEEditorJniJNI.NLEResourceIdParser_host_set(this.swigCPtr, this, str);
    }

    public void setProtocol(String str) {
        NLEEditorJniJNI.NLEResourceIdParser_protocol_set(this.swigCPtr, this, str);
    }

    public void setQuery(String str) {
        NLEEditorJniJNI.NLEResourceIdParser_query_set(this.swigCPtr, this, str);
    }

    public void setQueryParams(UnorderedMapStrStr unorderedMapStrStr) {
        NLEEditorJniJNI.NLEResourceIdParser_queryParams_set(this.swigCPtr, this, UnorderedMapStrStr.getCPtr(unorderedMapStrStr), unorderedMapStrStr);
    }

    public NLEResourceIdParser(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
