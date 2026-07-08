package com.ss.android.ttve.model;

import X.C2188811AlT;
import X.C2484209oO;
import X.EnumC994290byt;
import android.opengl.EGLContext;

/* JADX INFO: loaded from: classes34.dex */
public class VERenderContext {
    public EGLContext eglContext;
    public EnumC994290byt envType;

    public EGLContext getEGLContext() {
        if (this.envType != EnumC994290byt.VE_RENDER_ENV_OPENGL) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getEGLContext ");
        sbLIZ.append(this.eglContext);
        sbLIZ.append(", current env type ");
        sbLIZ.append(this.envType);
        C2484209oO.LIZ("VERenderContext", C2188811AlT.LIZIZ(sbLIZ));
        return this.eglContext;
    }

    public VERenderContext() {
        this.envType = EnumC994290byt.VE_RENDER_ENV_OPENGL;
    }

    public EnumC994290byt getCurrentEnvType() {
        return this.envType;
    }
}
