package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLEMusicResourceProtocol extends NLEResourceProtocol {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLEMusicResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public UnorderedMapStrStr getParameters() {
        return new UnorderedMapStrStr(NLEEditorJniJNI.NLEMusicResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public String getSourceFrom() {
        return NLEEditorJniJNI.NLEMusicResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public static String EXTRA_PARAM_SAVE_PATH() {
        return NLEEditorJniJNI.NLEMusicResourceProtocol_EXTRA_PARAM_SAVE_PATH();
    }

    public static String KEY_CLIP_ID() {
        return NLEEditorJniJNI.NLEMusicResourceProtocol_KEY_CLIP_ID();
    }

    public static String KEY_TIME_CLIP_START_ID() {
        return NLEEditorJniJNI.NLEMusicResourceProtocol_KEY_TIME_CLIP_START_ID();
    }

    public static String PLATFORM_STRING() {
        return NLEEditorJniJNI.NLEMusicResourceProtocol_PLATFORM_STRING();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public void finalize() {
        delete();
    }

    public NLEMusicResourceProtocol(String str) {
        this(NLEEditorJniJNI.new_NLEMusicResourceProtocol(str), true);
    }

    public static long getCPtr(NLEMusicResourceProtocol nLEMusicResourceProtocol) {
        if (nLEMusicResourceProtocol == null) {
            return 0L;
        }
        return nLEMusicResourceProtocol.swigCPtr;
    }

    public static boolean isMusicResource(String str) {
        return NLEEditorJniJNI.NLEMusicResourceProtocol_isMusicResource(str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLEMusicResourceProtocol(long j, boolean z) {
        super(NLEEditorJniJNI.NLEMusicResourceProtocol_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }
}
