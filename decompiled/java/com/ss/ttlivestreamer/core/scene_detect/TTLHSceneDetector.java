package com.ss.ttlivestreamer.core.scene_detect;

import X.C1271630jCD;
import X.C1273010jER;
import X.C1273050jEV;
import X.C1273070jEX;
import X.C1273100jEa;
import X.C1273120jEc;
import X.C1273150jEf;
import X.C1963707md;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1273040jEU;
import X.EnumC1273060jEW;
import X.EnumC1273550jFJ;
import X.InterfaceC1269980j9Y;
import X.InterfaceC1271560jC6;
import X.InterfaceC1272550jDh;
import X.InterfaceC1273080jEY;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS7S0102000_20;
import Y.ARunnableS89S0200000_20;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.NativeObject;
import com.ss.ttlivestreamer.core.opengl.GLTexture;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHSceneDetector extends NativeObject implements InterfaceC1273080jEY, ITTLHSceneDetectResourceHandler, InterfaceC1272550jDh, InterfaceC1269980j9Y {
    public boolean isEnableArchOptPhase2;
    public C1273050jEV mAppliedExposureValue;
    public int mDownSampledHeight;
    public int mDownSampledTextureId;
    public int mDownSampledWidth;
    public boolean mEnableDetect;
    public boolean mEnableHARDetect;
    public Handler mGLHandler;
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public long mLastProcessTimeMs;
    public C1273050jEV mLatestExposureValue;
    public TTLHSceneDetectResultInfo mLatestResultInfo;
    public int mMinProcessIntervalMs;
    public boolean mNeedForceProcess;
    public int mProcessIntervalMs;
    public ITTLHSceneDetectResourceHandler mResourceHandler;
    public String mResourcePath;
    public int mShorterEdgeLength;
    public C1273070jEX mTextureFilter;
    public ByteBuffer rgbaBuffer;
    public final Object mStatisticResourceLock = new Object();
    public EnumC1273040jEU mStatus = EnumC1273040jEU.STATUS_UNINIT;
    public String mDeviceName = "Android";
    public int mAppliedEffectFaceCount = 0;
    public int mLatestEffectFaceCount = 0;
    public long mAppliedExposureTime = 0;
    public long mLatestExposureTime = 0;
    public long mAppliedIso = 0;
    public long mLatestIso = 0;
    public long mDetectedFrameCount = 0;
    public long mInitTimeMicros = 0;

    public native int nativeInitAlgorithm(String str, String str2, ITTLHSceneDetectResourceHandler iTTLHSceneDetectResourceHandler);

    public native int nativeSceneDetect(ByteBuffer byteBuffer, int i, int i2, TTLHSceneDetectResultInfo tTLHSceneDetectResultInfo);

    @Override // com.ss.ttlivestreamer.core.scene_detect.ITTLHSceneDetectResourceHandler
    public boolean requestDownloadResources(String str, WeakReference<InterfaceC1273080jEY> weakReference) {
        return false;
    }

    public void requestForceProcessOnce() {
        this.mNeedForceProcess = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean checkNeedProcess() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetector.checkNeedProcess():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$release$1() {
        C1C7U.LIZ("TTLHSceneDetector@3ccd.release$1L");
        C1273070jEX c1273070jEX = this.mTextureFilter;
        if (c1273070jEX != null) {
            C1271630jCD c1271630jCD = c1273070jEX.LIZ;
            if (c1271630jCD != null) {
                GlUtil.destroyFrameBuffer(c1271630jCD.LIZ);
                c1271630jCD.LIZ = 0;
            }
            C1273120jEc c1273120jEc = c1273070jEX.LIZIZ;
            if (c1273120jEc != null) {
                GLES20.glDeleteProgram(c1273120jEc.LJFF.LIZIZ);
                GLES20.glDeleteProgram(c1273120jEc.LJI.LIZIZ);
            }
        }
        if (this.mDownSampledTextureId >= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release mDownSampledTextureId:");
            sbLIZ.append(this.mDownSampledTextureId);
            AVLog.logKibana(6, "TTLHSceneDetector", C2188811AlT.LIZIZ(sbLIZ), null);
            GlUtil.destroyTexture(this.mDownSampledTextureId);
            this.mDownSampledTextureId = -1;
        }
        ByteBuffer byteBuffer = this.rgbaBuffer;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.rgbaBuffer = null;
        }
        C1C7U.LIZIZ("TTLHSceneDetector@3ccd.release$1L");
    }

    public int init() {
        if (this.mHandler == null) {
            this.mStatus = EnumC1273040jEU.STATUS_UNINIT;
            return -1;
        }
        AVLog.i("TTLHSceneDetector", "requestDownloadResources");
        ITTLHSceneDetectResourceHandler iTTLHSceneDetectResourceHandler = this.mResourceHandler;
        if (iTTLHSceneDetectResourceHandler == null || iTTLHSceneDetectResourceHandler.requestDownloadResources("ttlh_algo_resources", new WeakReference<>(this))) {
            return 0;
        }
        AVLog.e("TTLHSceneDetector", "requestDownloadResources failed.");
        return 0;
    }

    public int initAlgorithmInternal() {
        Handler handler = this.mHandler;
        if (handler == null) {
            return -1;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 115));
        return 0;
    }

    @Override // X.InterfaceC1273080jEY
    public void onResourceDownloadFailed() {
        this.mStatus = EnumC1273040jEU.STATUS_INIT_FAILED;
        AVLog.logKibana(6, "TTLHSceneDetector", "Scene Detector onResourceDownloadFailed", null);
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void release() {
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 312);
        Handler handler = this.mGLHandler;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, aRunnableS120S0100000_20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onData$0(VideoFrame videoFrame) {
        C1C7U.LIZ("TTLHSceneDetector@3ccd.onData$1L");
        InterfaceC1271560jC6 interfaceC1271560jC6 = (InterfaceC1271560jC6) videoFrame.getBuffer();
        int width = interfaceC1271560jC6.getWidth();
        int height = interfaceC1271560jC6.getHeight();
        if (this.isEnableArchOptPhase2) {
            width = videoFrame.getRotatedWidth();
            height = videoFrame.getRotatedHeight();
        }
        sceneDetect(interfaceC1271560jC6, width, height);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHSceneDetector_");
        sbLIZ.append(hashCode());
        videoFrame.release(C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("TTLHSceneDetector@3ccd.onData$1L");
    }

    @Override // com.ss.ttlivestreamer.core.scene_detect.ITTLHSceneDetectResourceHandler
    public String getModelPath(String str) {
        Uri uri;
        ITTLHSceneDetectResourceHandler iTTLHSceneDetectResourceHandler = this.mResourceHandler;
        if (iTTLHSceneDetectResourceHandler == null || (uri = UriProtector.parse(iTTLHSceneDetectResourceHandler.getModelPath(str))) == null || uri.getPath() == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getModelUri: ");
        sbLIZ.append(uri.getPath());
        AVLog.i("TTLHSceneDetector", C2188811AlT.LIZIZ(sbLIZ));
        return uri.getPath();
    }

    public void onExposureTime(long j) {
        this.mLatestExposureTime = j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set exposure_time:");
        sbLIZ.append(j);
        AVLog.d("TTLHSceneDetector", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1272550jDh
    public void onFaceDetectResultCallback(int i) {
        this.mLatestEffectFaceCount = i;
    }

    public void onIso(long j) {
        this.mLatestIso = j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set iso: ");
        sbLIZ.append(j);
        AVLog.d("TTLHSceneDetector", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1273080jEY
    public void onResourceDownloadSuccess(List<C1273100jEa> list) {
        AVLog.i("TTLHSceneDetector", "onResourceDownloadSuccess");
        if (list != null && !list.isEmpty()) {
            C1273100jEa c1273100jEa = (C1273100jEa) ListProtector.get(list, 0);
            if (c1273100jEa == null) {
                AVLog.e("TTLHSceneDetector", "onResourceDownloadSuccess: effectResource is null");
                this.mStatus = EnumC1273040jEU.STATUS_INIT_FAILED;
                return;
            }
            String str = c1273100jEa.LIZ;
            this.mResourcePath = str;
            if (str != null && !str.isEmpty()) {
                C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS120S0100000_20(this, 116));
                return;
            } else {
                AVLog.e("TTLHSceneDetector", "onResourceDownloadSuccess: modelPath is empty");
                this.mStatus = EnumC1273040jEU.STATUS_INIT_FAILED;
                return;
            }
        }
        AVLog.e("TTLHSceneDetector", "onResourceDownloadSuccess: effectResources is empty");
        this.mStatus = EnumC1273040jEU.STATUS_INIT_FAILED;
    }

    public void setEnableArchOptPhase2(boolean z) {
        this.isEnableArchOptPhase2 = z;
    }

    public void setEnableHARDetect(boolean z) {
        this.mEnableHARDetect = z;
    }

    public void setEnableSceneDetect(boolean z) {
        this.mEnableDetect = z;
    }

    public boolean updateStatisticBundle(TEBundle tEBundle) {
        HashMap map = new HashMap();
        if (!updateStatisticMap(map)) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            tEBundle.setString((String) entry.getKey(), (String) entry.getValue());
        }
        return true;
    }

    public boolean updateStatisticMap(Map<String, String> map) {
        long jNativeTimeUTCMicros;
        int iIntValue;
        synchronized (this.mStatisticResourceLock) {
            try {
                TTLHSceneDetectResultInfo tTLHSceneDetectResultInfo = this.mLatestResultInfo;
                if (tTLHSceneDetectResultInfo == null || !this.mEnableDetect) {
                    return false;
                }
                map.put("bach_scene_type", String.valueOf(tTLHSceneDetectResultInfo.sceneType));
                map.put("environment_avg_brightness", String.valueOf(this.mLatestResultInfo.averageBrightness));
                map.put("environment_strong_luminance", String.valueOf(this.mLatestResultInfo.strongLuminance));
                map.put("bach_scene_face_brightness", String.valueOf(this.mLatestResultInfo.faceBrightness));
                map.put("bach_scene_gender", String.valueOf(this.mLatestResultInfo.gender));
                map.put("bach_scene_age_level", String.valueOf(this.mLatestResultInfo.age));
                map.put("bach_scene_face_count", String.valueOf(this.mLatestResultInfo.faceCount));
                if (this.mEnableHARDetect) {
                    Object objLIZIZ = C1963707md.LIZIZ("getLastStatus", new Class[0], new Object[0]);
                    if (objLIZIZ instanceof Integer) {
                        iIntValue = ((Integer) objLIZIZ).intValue();
                    } else {
                        iIntValue = -2;
                    }
                    map.put("device_motion_status", String.valueOf(iIntValue));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("update motion status: ");
                    sbLIZ.append(map.get("device_motion_status"));
                    AVLog.d("TTLHSceneDetector", C2188811AlT.LIZIZ(sbLIZ));
                }
                map.put("scene_detect_process_ms", String.valueOf(this.mLatestResultInfo.processCostMs));
                if (this.mDetectedFrameCount > 0) {
                    jNativeTimeUTCMicros = (TimeUtils.nativeTimeUTCMicros() - this.mInitTimeMicros) / (this.mDetectedFrameCount * 1000);
                } else {
                    jNativeTimeUTCMicros = -1;
                }
                map.put("scene_detect_avg_interval_ms", String.valueOf(jNativeTimeUTCMicros));
                String strLIZIZ = "";
                List<Float> list = this.mLatestResultInfo.faceRect;
                if (list != null && list.size() == 4) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(e3.e);
                    sbLIZ2.append(this.mLatestResultInfo.faceRect.get(0));
                    sbLIZ2.append(",");
                    sbLIZ2.append(this.mLatestResultInfo.faceRect.get(1));
                    sbLIZ2.append(",");
                    sbLIZ2.append(this.mLatestResultInfo.faceRect.get(2));
                    sbLIZ2.append(",");
                    sbLIZ2.append(this.mLatestResultInfo.faceRect.get(3));
                    sbLIZ2.append(e3.f);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                map.put("bach_scene_face_position", strLIZIZ);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1269980j9Y
    public void onData(VideoFrame videoFrame, Bundle bundle) {
        if (this.mGLHandler != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TTLHSceneDetector_");
            sbLIZ.append(hashCode());
            videoFrame.retain(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.LJJZZIII(this.mGLHandler, new ARunnableS89S0200000_20(videoFrame, this, 190));
        }
    }

    public int sceneDetect(InterfaceC1271560jC6 interfaceC1271560jC6, int i, int i2) {
        int i3;
        int i4;
        float[] fArrLIZIZ;
        int i5;
        int i6;
        if (interfaceC1271560jC6 == null) {
            AVLog.w("TTLHSceneDetector", "sceneDetect: input textureBuffer is null.");
            return -1;
        }
        if (this.mShorterEdgeLength < Math.min(i, i2)) {
            float fMin = this.mShorterEdgeLength / Math.min(i, i2);
            i3 = (int) (i * fMin);
            i4 = (int) (i2 * fMin);
        } else {
            i3 = i;
            i4 = i2;
        }
        if (i3 > 0 && i4 > 0) {
            if (!checkNeedProcess()) {
                return -3;
            }
            this.mStatus = EnumC1273040jEU.STATUS_RUNNING;
            this.mLastProcessTimeMs = TimeUtils.nativeTimeUTCMicros() / 1000;
            this.mNeedForceProcess = false;
            this.mAppliedEffectFaceCount = this.mLatestEffectFaceCount;
            this.mAppliedExposureValue = this.mLatestExposureValue;
            this.mAppliedExposureTime = this.mLatestExposureTime;
            this.mAppliedIso = this.mLatestIso;
            if (this.mEnableHARDetect) {
                C1963707md.LIZJ();
            }
            this.mDetectedFrameCount++;
            AVLog.d("TTLHSceneDetector", "sceneDetect: Scene detection triggered.");
            if (this.mHandler == null) {
                AVLog.e("TTLHSceneDetector", "sceneDetect: Handler is null.");
                return -4;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sceneDetect: Converting texture ID ");
            sbLIZ.append(interfaceC1271560jC6.getTextureId());
            sbLIZ.append(" (");
            sbLIZ.append(i);
            sbLIZ.append("x");
            sbLIZ.append(i2);
            sbLIZ.append(", type: ");
            sbLIZ.append(interfaceC1271560jC6.getType());
            sbLIZ.append(") to RGBA ByteBuffer (");
            sbLIZ.append(i3);
            sbLIZ.append("x");
            sbLIZ.append(i4);
            sbLIZ.append(").");
            AVLog.d("TTLHSceneDetector", C2188811AlT.LIZIZ(sbLIZ));
            if (this.mDownSampledTextureId <= 0) {
                this.mDownSampledTextureId = GlUtil.createTexture(i3, i4);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("createTexture mDownSampledTextureId:");
                sbLIZ2.append(this.mDownSampledTextureId);
                AVLog.logKibana(6, "TTLHSceneDetector", C2188811AlT.LIZIZ(sbLIZ2), null);
                this.mDownSampledWidth = i3;
                this.mDownSampledHeight = i4;
            }
            int i7 = this.mDownSampledTextureId;
            if (i7 != -1 && ((i6 = this.mDownSampledWidth) != i3 || this.mDownSampledHeight != i4)) {
                GlUtil.reSizeTexture(i7, i6, this.mDownSampledHeight);
                this.mDownSampledWidth = i3;
                this.mDownSampledHeight = i4;
            }
            if (this.mTextureFilter == null) {
                this.mTextureFilter = new C1273070jEX();
            }
            if (this.isEnableArchOptPhase2) {
                fArrLIZIZ = Arrays.copyOf(interfaceC1271560jC6.getTransformMatrixArray(), interfaceC1271560jC6.getTransformMatrixArray().length);
                Matrix.multiplyMM(fArrLIZIZ, 0, fArrLIZIZ, 0, GlUtil.V_FLIP_MATRIX, 0);
            } else {
                android.graphics.Matrix matrix = new android.graphics.Matrix(interfaceC1271560jC6.getTransformMatrix());
                matrix.preTranslate(0.5f, 0.5f);
                matrix.preScale(1.0f, -1.0f);
                matrix.preTranslate(-0.5f, -0.5f);
                fArrLIZIZ = C1273010jER.LIZIZ(matrix);
            }
            C1273070jEX c1273070jEX = this.mTextureFilter;
            int textureId = interfaceC1271560jC6.getTextureId();
            int i8 = this.mDownSampledTextureId;
            int i9 = this.mDownSampledWidth;
            int i10 = this.mDownSampledHeight;
            if (interfaceC1271560jC6.getType() == EnumC1273550jFJ.OES) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            C1271630jCD c1271630jCD = c1273070jEX.LIZ;
            if (c1271630jCD != null) {
                c1271630jCD.LIZJ = i9;
                c1271630jCD.LIZLLL = i10;
                c1271630jCD.LIZIZ = i8;
                c1271630jCD.LIZ();
                GLTexture gLTexture = new GLTexture(textureId, i, i2, 0, 0L);
                gLTexture.setTextureType(i5);
                if (fArrLIZIZ != null) {
                    gLTexture.setTransformMatrixFloats4x4(fArrLIZIZ);
                }
                C1273120jEc c1273120jEc = c1273070jEX.LIZIZ;
                if (c1273120jEc != null) {
                    c1273120jEc.LIZLLL = i9;
                    c1273120jEc.LJ = i10;
                    c1273120jEc.LIZ(gLTexture, C1273150jEf.LJFF);
                }
                c1271630jCD.LIZIZ();
            }
            if (this.rgbaBuffer == null) {
                this.rgbaBuffer = ByteBuffer.allocateDirect(this.mDownSampledWidth * this.mDownSampledHeight * 4);
            }
            int i11 = this.mDownSampledTextureId;
            int i12 = this.mDownSampledWidth;
            int i13 = this.mDownSampledHeight;
            ByteBuffer byteBuffer = this.rgbaBuffer;
            byteBuffer.clear();
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            int i14 = iArr[0];
            int[] iArr2 = new int[1];
            GLES20.glGetIntegerv(36006, IntBuffer.wrap(iArr2));
            int i15 = iArr2[0];
            GLES20.glBindFramebuffer(36160, i14);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i11, 0);
            GLES20.glReadPixels(0, 0, i12, i13, 6408, 5121, byteBuffer);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, i15);
            byteBuffer.clear();
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS7S0102000_20(i3, this, i4, 2));
            return 0;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("sceneDetect: Invalid texture dimensions for RGBA conversion: ");
        sbLIZ3.append(i3);
        sbLIZ3.append("x");
        sbLIZ3.append(i4);
        AVLog.e("TTLHSceneDetector", C2188811AlT.LIZIZ(sbLIZ3));
        return -2;
    }

    public TTLHSceneDetector(ITTLHSceneDetectResourceHandler iTTLHSceneDetectResourceHandler, String str, int i, int i2, int i3, Handler handler, int i4) {
        EnumC1273060jEW enumC1273060jEW = EnumC1273060jEW.ExposureValueType_Invalid;
        this.mAppliedExposureValue = new C1273050jEV(0.0d, enumC1273060jEW);
        this.mLatestExposureValue = new C1273050jEV(0.0d, enumC1273060jEW);
        this.mDownSampledTextureId = -1;
        this.mDownSampledWidth = 0;
        this.mDownSampledHeight = 0;
        this.mTextureFilter = null;
        this.isEnableArchOptPhase2 = false;
        this.mShorterEdgeLength = 0;
        this.mEnableDetect = true;
        this.mEnableHARDetect = false;
        this.rgbaBuffer = null;
        this.mResourceHandler = iTTLHSceneDetectResourceHandler;
        HandlerThread handlerThread = new HandlerThread("TTLHSceneDetector");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new BPEAHandler(C786410Ut5.W2(this.mHandlerThread));
        this.mLastProcessTimeMs = (TimeUtils.nativeTimeUTCMicros() / 1000) - ((long) i);
        this.mProcessIntervalMs = i2;
        this.mMinProcessIntervalMs = i3;
        this.mGLHandler = handler;
        this.mShorterEdgeLength = i4;
    }
}
