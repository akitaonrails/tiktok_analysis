package com.ss.pusher.core.codec;

import X.C1277590jLp;
import X.C1280090jPr;
import X.C2188811AlT;
import android.opengl.EGLContext;
import android.os.HandlerThread;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.engine.VideoEncoder;
import com.ss.pusher.core.engine.VideoEncoderFactory;
import com.ss.pusher.core.opengl.GLThreadManager;
import com.ss.pusher.core.opengl.GlUtil;
import com.ss.pusher.core.utils.AVLog;
import com.ss.pusher.core.utils.SafeHandlerThread;

/* JADX INFO: loaded from: classes21.dex */
public class DefaultVideoEncoderFactory extends VideoEncoderFactory {
    public final C1280090jPr LL;

    private native VideoEncoder nativeDefaultCreateVideoEncoder(String str, boolean z);

    private native String nativeDefaultGetSupportedFormats();

    @Override // com.ss.pusher.core.engine.VideoEncoderFactory, com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        super.release();
        release();
    }

    @Override // com.ss.pusher.core.engine.VideoEncoderFactory
    public final String GetSupportedFormats() {
        getClass();
        String strNativeDefaultGetSupportedFormats = nativeDefaultGetSupportedFormats();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video_type=video/avc,video_enable_accelera=true,oes_texture_frame=true:video_type=video/bytevc1,video_enable_accelera=true,oes_texture_frame=true");
        sbLIZ.append(":");
        sbLIZ.append(strNativeDefaultGetSupportedFormats);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0jPr] */
    public DefaultVideoEncoderFactory(final C1277590jLp c1277590jLp) {
        this.LL = new VideoEncoderFactory(c1277590jLp) { // from class: X.0jPr
            public HandlerThreadC1273720jFa LL;
            public SafeHandlerThread.SafeHandler LLILLJJLI;
            public final C1277590jLp LLILLL;

            @Override // com.ss.pusher.core.engine.VideoEncoderFactory
            public final String GetSupportedFormats() {
                return "video_type=video/avc,video_enable_accelera=true,oes_texture_frame=true:video_type=video/bytevc1,video_enable_accelera=true,oes_texture_frame=true";
            }

            @Override // com.ss.pusher.core.engine.VideoEncoderFactory, com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
            public final synchronized void release() {
                HandlerThreadC1273720jFa handlerThreadC1273720jFa = this.LL;
                this.LL = null;
                if (handlerThreadC1273720jFa != null) {
                    handlerThreadC1273720jFa.release();
                }
                super.release();
            }

            @Override // com.ss.ttlivestreamer.core.engine.NativeObject
            public final void finalize() {
                release();
                super.finalize();
            }

            {
                this.LLILLL = c1277590jLp;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [X.0jFa, com.ss.pusher.core.utils.SafeHandlerThread] */
            @Override // com.ss.pusher.core.engine.VideoEncoderFactory
            public final VideoEncoder CreateVideoEncoder(String str, boolean z) {
                C1282400jTa c1282360jTW;
                if (!z) {
                    return null;
                }
                String str2 = "";
                boolean zEqualsIgnoreCase = false;
                for (String str3 : str.split(",")) {
                    String[] strArrSplit = str3.split("=");
                    if (strArrSplit.length > 1) {
                        if (strArrSplit[0].equalsIgnoreCase("video_type")) {
                            str2 = strArrSplit[1];
                        } else if (strArrSplit[0].equalsIgnoreCase("oes_texture_frame")) {
                            zEqualsIgnoreCase = strArrSplit[1].equalsIgnoreCase("true");
                        }
                    }
                }
                if (!zEqualsIgnoreCase) {
                    if (this.LL == null) {
                        ?? r0 = new SafeHandlerThread() { // from class: X.0jFa
                            @Override // android.os.HandlerThread
                            public final void onLooperPrepared() {
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

                            @Override // com.ss.pusher.core.utils.NativeHandlerThread, android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("GLThread@8477.run");
                                try {
                                    LIZIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("GLThread@8477.run");
                            }

                            public final void LIZIZ() {
                                C1273710jFZ.LJ(C786410Ut5.u3());
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("gl thread(");
                                sbLIZ.append(getName());
                                sbLIZ.append(") is runing ...");
                                AVLog.ioi("GLThread", C2188811AlT.LIZIZ(sbLIZ));
                                super.run();
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
                                GLThreadManager gLThreadManagerLJ = GLThreadManager.LJ();
                                if (gLThreadManagerLJ != null) {
                                    gLThreadManagerLJ.LIZIZ();
                                }
                                C1273710jFZ.LIZJ();
                            }

                            public final void bpea_origin_onLooperPrepared() {
                                GLThreadManager gLThreadManagerLJ = GLThreadManager.LJ();
                                if (gLThreadManagerLJ != null) {
                                    int iIncrementAndGet = gLThreadManagerLJ.LIZLLL.incrementAndGet();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("addRef ");
                                    sbLIZ.append(iIncrementAndGet);
                                    AVLog.iow("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
                                }
                                EGLContext eGLContextLJFF = GLThreadManager.LJFF();
                                if (GlUtil.nativeAttachThreadToOpenGl(eGLContextLJFF != null ? eGLContextLJFF.getNativeHandle() : 0L, 0, 0L) == 0) {
                                    try {
                                        HandlerThread.sleep(1000L);
                                    } catch (InterruptedException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                    throw new AndroidRuntimeException("OpenGl thread created failed.");
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("gl thread(");
                                sbLIZ2.append(getName());
                                sbLIZ2.append(") is attached to opengl ...");
                                AVLog.ioi("GLThread", C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        };
                        this.LL = r0;
                        r0.start();
                    }
                    if (this.LLILLJJLI == null) {
                        this.LLILLJJLI = (SafeHandlerThread.SafeHandler) getHandler();
                    }
                }
                if (zEqualsIgnoreCase) {
                    C1282370jTX c1282370jTX = new C1282370jTX(this.LLILLL, str2.equalsIgnoreCase("video/bytevc1"));
                    if (!c1282370jTX.LLJJI()) {
                        c1282370jTX.release();
                    } else {
                        return c1282370jTX;
                    }
                } else {
                    if (str2.equalsIgnoreCase("video/avc")) {
                        c1282360jTW = new C1282380jTY(this.LLILLL, this.LLILLJJLI);
                        if (!c1282360jTW.LLJJI()) {
                            c1282360jTW.release();
                            return null;
                        }
                    } else if (str2.equalsIgnoreCase("video/bytevc1")) {
                        c1282360jTW = new C1282360jTW(this.LLILLL, this.LLILLJJLI);
                        if (!c1282360jTW.LLJJI()) {
                            c1282360jTW.release();
                            return null;
                        }
                    }
                    return c1282360jTW;
                }
                return null;
            }
        };
    }

    @Override // com.ss.pusher.core.engine.VideoEncoderFactory
    public final VideoEncoder CreateVideoEncoder(String str, boolean z) {
        VideoEncoder videoEncoderCreateVideoEncoder = CreateVideoEncoder(str, z);
        if (videoEncoderCreateVideoEncoder == null) {
            return nativeDefaultCreateVideoEncoder(str, z);
        }
        return videoEncoderCreateVideoEncoder;
    }
}
