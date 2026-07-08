package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public class NLELokiResourceProtocol extends NLEResourceProtocol {
    public transient boolean swigCMemOwnDerived;
    public transient long swigCPtr;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwnDerived) {
                this.swigCMemOwnDerived = false;
                NLEEditorJniJNI.delete_NLELokiResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    public String getEffectId() {
        return NLEEditorJniJNI.NLELokiResourceProtocol_effectId_get(this.swigCPtr, this);
    }

    public String getPanel() {
        return NLEEditorJniJNI.NLELokiResourceProtocol_panel_get(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public UnorderedMapStrStr getParameters() {
        return new UnorderedMapStrStr(NLEEditorJniJNI.NLELokiResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    public String getResourceId() {
        return NLEEditorJniJNI.NLELokiResourceProtocol_resourceId_get(this.swigCPtr, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public String getSourceFrom() {
        return NLEEditorJniJNI.NLELokiResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public NLELokiResourceType getType() {
        return NLELokiResourceType.swigToEnum(NLEEditorJniJNI.NLELokiResourceProtocol_type_get(this.swigCPtr, this));
    }

    public static String EXTRA_PARAM_SAVE_PATH() {
        return NLEEditorJniJNI.NLELokiResourceProtocol_EXTRA_PARAM_SAVE_PATH();
    }

    public static String PARAM_EFFECT_ID() {
        return NLEEditorJniJNI.NLELokiResourceProtocol_PARAM_EFFECT_ID();
    }

    public static String PARAM_PANEL() {
        return NLEEditorJniJNI.NLELokiResourceProtocol_PARAM_PANEL();
    }

    public static String PARAM_RESOURCE_ID() {
        return NLEEditorJniJNI.NLELokiResourceProtocol_PARAM_RESOURCE_ID();
    }

    public static String PLATFORM_STRING() {
        return NLEEditorJniJNI.NLELokiResourceProtocol_PLATFORM_STRING();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public void finalize() {
        delete();
    }

    public NLELokiResourceProtocol(String str) {
        this(NLEEditorJniJNI.new_NLELokiResourceProtocol__SWIG_0(str), true);
    }

    public static NLELokiResourceProtocol NLELokiResourceProtocolWithURS(String str) {
        long jNLELokiResourceProtocol_NLELokiResourceProtocolWithURS = NLEEditorJniJNI.NLELokiResourceProtocol_NLELokiResourceProtocolWithURS(str);
        if (jNLELokiResourceProtocol_NLELokiResourceProtocolWithURS == 0) {
            return null;
        }
        return new NLELokiResourceProtocol(jNLELokiResourceProtocol_NLELokiResourceProtocolWithURS, true);
    }

    public static long getCPtr(NLELokiResourceProtocol nLELokiResourceProtocol) {
        if (nLELokiResourceProtocol == null) {
            return 0L;
        }
        return nLELokiResourceProtocol.swigCPtr;
    }

    public static boolean isLokiResource(String str) {
        return NLEEditorJniJNI.NLELokiResourceProtocol_isLokiResource(str);
    }

    public void setEffectId(String str) {
        NLEEditorJniJNI.NLELokiResourceProtocol_effectId_set(this.swigCPtr, this, str);
    }

    public void setPanel(String str) {
        NLEEditorJniJNI.NLELokiResourceProtocol_panel_set(this.swigCPtr, this, str);
    }

    public void setResourceId(String str) {
        NLEEditorJniJNI.NLELokiResourceProtocol_resourceId_set(this.swigCPtr, this, str);
    }

    public void setType(NLELokiResourceType nLELokiResourceType) {
        NLEEditorJniJNI.NLELokiResourceProtocol_type_set(this.swigCPtr, this, nLELokiResourceType.swigValue());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceProtocol
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public NLELokiResourceProtocol(long j, boolean z) {
        super(NLEEditorJniJNI.NLELokiResourceProtocol_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public NLELokiResourceProtocol(String str, String str2) {
        this(NLEEditorJniJNI.new_NLELokiResourceProtocol__SWIG_1(str, str2), true);
    }
}
