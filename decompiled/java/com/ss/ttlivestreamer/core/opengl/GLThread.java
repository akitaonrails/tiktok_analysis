package com.ss.ttlivestreamer.core.opengl;

import X.C0W9U;
import X.C1273690jFX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;

/* JADX INFO: loaded from: classes21.dex */
public class GLThread extends SafeHandlerThread {
    public boolean enableGpuHint;

    public void enableGpuHint() {
        this.enableGpuHint = true;
    }

    @Override // com.ss.ttlivestreamer.core.utils.SafeHandlerThread, android.os.HandlerThread
    public void onLooperPrepared() {
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            bpea_origin_onLooperPrepared();
            if (zLJ) {
                C0W9U.LJFF();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    @Override // com.ss.ttlivestreamer.core.utils.NativeHandlerThread, android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        C1C7U.LIZ("GLThread@ccd.run");
        com_ss_ttlivestreamer_core_opengl_GLThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        C1C7U.LIZIZ("GLThread@ccd.run");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void bpea_origin_onLooperPrepared() {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.core.opengl.GLThread.bpea_origin_onLooperPrepared():void");
    }

    public void com_ss_ttlivestreamer_core_opengl_GLThread__run$___twin___() {
        GLTracer.traceStack();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gl thread(");
        sbLIZ.append(getName());
        sbLIZ.append(") is runing ...");
        AVLog.ioi("GLThread", C2188811AlT.LIZIZ(sbLIZ));
        super.run();
        if (this.enableGpuHint) {
            C1273690jFX.LIZIZ();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("gl thread(");
        sbLIZ2.append(getName());
        sbLIZ2.append(") is exit ...");
        AVLog.ioi("GLThread", C2188811AlT.LIZIZ(sbLIZ2));
        GlUtil.nativeDetachThreadToOpenGl();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("gl thread(");
        sbLIZ3.append(getName());
        sbLIZ3.append(") is exit done");
        AVLog.ioi("GLThread", C2188811AlT.LIZIZ(sbLIZ3));
        GLThreadManager gLThreadManager = GLThreadManager.get();
        if (gLThreadManager != null) {
            gLThreadManager.decrementRef();
        }
        GLTracer.removeTraceStack();
    }

    public GLThread(String str) {
        super(str);
    }

    public static void com_ss_ttlivestreamer_core_opengl_GLThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(GLThread gLThread) {
        try {
            gLThread.com_ss_ttlivestreamer_core_opengl_GLThread__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public GLThread(String str, int i) {
        super(str, i);
    }
}
