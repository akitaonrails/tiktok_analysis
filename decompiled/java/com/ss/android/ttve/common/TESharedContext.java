package com.ss.android.ttve.common;

import X.C2188811AlT;
import X.C2484209oO;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class TESharedContext {
    public static boolean LJ;
    public EGLContext LIZ;
    public EGLConfig LIZIZ;
    public EGLDisplay LIZJ;
    public EGLSurface LIZLLL;

    public static native void refEGLDisplay();

    public static native boolean unrefEGLDisplay();

    public final boolean LIZLLL() {
        EGLDisplay eGLDisplay = this.LIZJ;
        EGLSurface eGLSurface = this.LIZLLL;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.LIZ)) {
            return true;
        }
        LIZ("eglMakeCurrent");
        return false;
    }

    public final void LJ() {
        C2484209oO.LJI("TESharedContext", "#### CGESharedGLContext Destroying context... ####");
        EGLDisplay eGLDisplay = this.LIZJ;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            try {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.LIZJ, this.LIZ);
                EGL14.eglDestroySurface(this.LIZJ, this.LIZLLL);
                if (unrefEGLDisplay()) {
                    EGL14.eglTerminate(this.LIZJ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("#### CGESharedGLContext Destroying err: ");
                sbLIZ.append(th.toString());
                C2484209oO.LJI("TESharedContext", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        this.LIZJ = EGL14.EGL_NO_DISPLAY;
        this.LIZLLL = EGL14.EGL_NO_SURFACE;
        this.LIZ = EGL14.EGL_NO_CONTEXT;
    }

    public static void LIZ(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(": EGL error: 0x");
            sbLIZ.append(Integer.toHexString(iEglGetError));
            C2484209oO.LIZJ("TESharedContext", C2188811AlT.LIZIZ(sbLIZ));
            if (iEglGetError == 12294) {
                C2484209oO.LIZJ("TESharedContext", "gl error EGL_BAD_CONTEXT");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(int r7, java.lang.Object r8) {
        /*
            r6 = this;
            android.opengl.EGLDisplay r1 = r6.LIZJ
            if (r1 == 0) goto Lb
            android.opengl.EGLSurface r0 = r6.LIZLLL
            if (r0 == 0) goto Lb
            android.opengl.EGL14.eglDestroySurface(r1, r0)
        Lb:
            r0 = 5
            int[] r5 = new int[r0]
            r5 = {x005e: FILL_ARRAY_DATA , data: [12375, 0, 12374, 0, 12344} // fill-array
            r4 = 0
            r2 = 2
            if (r7 == r2) goto L4d
            r0 = 4
            r1 = 12344(0x3038, float:1.7298E-41)
            if (r7 == r0) goto L38
            r0 = 12610(0x3142, float:1.767E-41)
            if (r7 == r0) goto L34
            android.opengl.EGLDisplay r1 = r6.LIZJ
            android.opengl.EGLConfig r0 = r6.LIZIZ
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglCreatePbufferSurface(r1, r0, r5, r4)
            r6.LIZLLL = r0
        L28:
            android.opengl.EGLSurface r1 = r6.LIZLLL
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r1 != r0) goto L58
            java.lang.String r0 = "eglCreateSurface"
            LIZ(r0)
            return r4
        L34:
            r5[r4] = r1
            r5[r2] = r1
        L38:
            r0 = 1
            int[] r3 = new int[r0]
            r3[r4] = r1
            android.opengl.EGLDisplay r2 = r6.LIZJ
            android.opengl.EGLConfig r1 = r6.LIZIZ
            boolean r0 = com.ss.android.ttve.common.TESharedContext.LJ
            if (r0 == 0) goto L46
            r5 = r3
        L46:
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglCreateWindowSurface(r2, r1, r8, r5, r4)
            r6.LIZLLL = r0
            goto L28
        L4d:
            android.opengl.EGLDisplay r1 = r6.LIZJ
            android.opengl.EGLConfig r0 = r6.LIZIZ
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglCreatePixmapSurface(r1, r0, r4, r5, r4)
            r6.LIZLLL = r0
            goto L28
        L58:
            boolean r0 = r6.LIZLLL()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.common.TESharedContext.LJFF(int, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ttve.common.TESharedContext LIZIZ(android.opengl.EGLContext r21, int r22, java.lang.Object r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.common.TESharedContext.LIZIZ(android.opengl.EGLContext, int, java.lang.Object, boolean):com.ss.android.ttve.common.TESharedContext");
    }

    public static TESharedContext LIZJ(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        TESharedContext tESharedContext = new TESharedContext();
        tESharedContext.LIZ = eGLContext;
        tESharedContext.LIZJ = eGLDisplay;
        tESharedContext.LIZLLL = null;
        LJ = z;
        if (z) {
            i2 = 10;
        } else {
            i2 = 8;
        }
        if (z) {
            i3 = 2;
        } else {
            i3 = 8;
        }
        int i5 = !z ? 1 : 0;
        int[] iArr = new int[13];
        iArr[0] = 12324;
        iArr[1] = i2;
        iArr[2] = 12323;
        iArr[3] = i2;
        iArr[4] = 12322;
        iArr[5] = i2;
        iArr[6] = 12321;
        iArr[7] = i3;
        iArr[8] = 12352;
        if (z) {
            i4 = 64;
        } else {
            i4 = 4;
        }
        iArr[9] = i4;
        iArr[10] = 12610;
        iArr[11] = i5;
        iArr[12] = 12344;
        if (i == 12610) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = {12324, i2, 12323, i2, 12322, i2, 12321, i3, 12344};
        if (!z) {
            iArr3 = iArr;
        }
        EGL14.eglChooseConfig(eGLDisplay, iArr3, 0, eGLConfigArr, 0, 1, iArr2, 0);
        tESharedContext.LIZIZ = eGLConfigArr[0];
        return tESharedContext;
    }
}
