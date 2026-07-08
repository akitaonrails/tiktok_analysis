package com.ss.android.ttve.mediacodec;

import X.C1283310jV3;
import X.C1283330jV5;
import X.C1284320jWg;
import X.C1284420jWq;
import X.C1284430jWr;
import X.C1284450jWt;
import X.C1284460jWu;
import X.C1284480jWw;
import X.C1284730jXL;
import X.C1311120kDu;
import X.C1C7U;
import X.C2188811AlT;
import X.C2484209oO;
import X.C2484309oP;
import X.C419990GdR;
import X.C786410Ut5;
import X.EnumC1284440jWs;
import X.EnumC2074108Ap;
import X.EnumC2074208Aq;
import Y.ARunnableS120S0100000_20;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.algorithm.VideoDynamicBitrate;
import com.ss.android.ttve.algorithm.VideoDynamicBitrateResult;
import com.ss.android.ttve.algorithm.VideoSmartCodec;
import com.ss.android.ttve.algorithm.VideoSmartCodecResult;
import com.ss.android.ttve.common.TESharedContext;
import com.ss.android.ttve.nativePort.TEUtils;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.runtime.VERuntime;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: loaded from: classes21.dex */
public class TEAvcEncoder {
    public static boolean DEBUG;
    public VideoDynamicBitrate dynamicBitrate;
    public C1284320jWg m_eglStateSaver;
    public TESharedContext m_sharedContext;
    public C1284420jWq m_textureDrawer;
    public byte[] pps;
    public byte[] sps;
    public static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES = {"OMX.google.", "OMX.SEC.", "c2.android"};
    public static int MIN_FRAME_RATE = 7;
    public static int MAX_FRAME_RATE = 2000;
    public static long MAX_PRODUCT_OF_SIZE_AND_FPS = -1;
    public static int m_uploadSpeed = -2;
    public static List<String> mSmartCodecPathList = new ArrayList();
    public static String mJsonSettings = "";
    public static float mVmaf = 0.0f;
    public static int ENCODE_RESOLUTION_ALIGN = 16;
    public static final Object kInitSyncObj = new Object();
    public static Boolean kInitialized = Boolean.FALSE;
    public static int file_count = 0;
    public final int ENCODE_COUNT_DEFAULT = 10;
    public LinkedBlockingQueue<C1284460jWu> AVCQueue = new LinkedBlockingQueue<>();
    public Queue<Long> m_PTSQueue = new LinkedList();
    public long m_lastDts = 0;
    public boolean m_bPrintExistBFrame = false;
    public byte[] configByte = null;
    public MediaCodec m_mediaCodec = null;
    public MediaFormat m_codecFormat = null;
    public Surface m_surface = null;
    public int m_codec_type = 0;
    public int m_width = 0;
    public int m_height = 0;
    public int m_OesSrcRotation = 0;
    public int m_OesSrcWidth = 0;
    public int m_OesSrcHeight = 0;
    public boolean m_OesFlipY = false;
    public int m_width_align = 0;
    public int m_height_align = 0;
    public int m_frameRate = 0;
    public int m_colorFormat = 0;
    public int m_bitRate = 0;
    public int m_maxBitRate = 0;
    public int m_iFrameInternal = 0;
    public int m_profile = 0;
    public boolean isSupportBFrame = true;
    public int m_colorspace = 0;
    public int m_bColorRangeFull = 0;
    public int m_colorTrc = 0;
    public double m_dHpBitrateRatio = 0.75d;
    public double m_TransitionKeyframeRatio = 1.0d;
    public int m_TransitionFrameCounter = 0;
    public int m_level = 0;
    public boolean m_useInputSurface = true;
    public long m_getnerateIndex = 0;
    public int m_pageMode = -1;
    public int m_streamID = -1;
    public int m_hardWare = -1;
    public String m_mime_type = "video/avc";
    public float mSmartBitrate = 0.0f;
    public int mCurBitrate = 0;
    public boolean mNeedIFrame = false;
    public long mProcessSCTimestamp = 0;
    public float mEncodedFrameSizeSum = -1.0f;
    public int mEncodedFrameSize = -1;
    public int mEncodedFrameNum = -1;
    public boolean mEnableSmartEncoder = true;
    public C1284460jWu m_lastCodecData = null;
    public boolean m_bSuccessInit = false;
    public boolean m_isNeedReconfigure = false;
    public boolean m_bNeedSingalEnd = false;
    public boolean m_bSignalEndOfStream = false;
    public boolean m_bByteVC110BitHWDecoder = false;
    public boolean m_useHDR10Bit = false;
    public int m_configStatus = 0;
    public long m_encodeStartTime = -1;
    public C1283330jV5 m_textureOESDrawer = null;
    public TEMediaCodecDecoder m_MediaCodecDecInstance = null;
    public boolean m_bEncodeOESTexture = false;
    public boolean m_bEncoderGLContextReuse = false;
    public boolean m_bEncoderBanExtraDataLoop = false;
    public boolean isEnableHwEncoderOpt = false;
    public boolean m_bEncodeGLFinish = true;
    public boolean mSkipRecord = false;
    public boolean mNeedStartRecordMonitor = false;
    public long mFirstFrameTimestamp = Long.MIN_VALUE;
    public long mLastKeyFramePTS = 0;
    public long MINIMUM_KEY_FRAME_PTS_DISTANCE_IN_US = 500000;
    public long mEncFrameCount = 0;
    public long mTotalFrameCount = 0;
    public long mLastFramePTS = -1;
    public long mGOPSize = -1;
    public boolean mEnableOperatingRate = true;
    public boolean mEnableEncodeBt601 = true;
    public int mBusinessQpMin = -1;
    public int mBusinessQpMax = -1;
    public boolean mUseForRecorder = false;
    public boolean mRecorderEncodeFail = false;
    public Handler mHandler = null;
    public long mLastEncodeFramePTS = -1;
    public long mPicBufferCount = 0;
    public long mPicEncodeCount = 0;
    public long mPicSendCount = 0;
    public VideoSmartCodec mSmartCodec = null;
    public VideoSmartCodecResult mVideoSmartCodecResult = new VideoSmartCodecResult();
    public int mSmartCodecInitNum = 0;
    public boolean isOesTexture = false;
    public boolean mEnableDynamicBitrate = false;
    public ByteBuffer mByteBuf = null;
    public boolean mFirstFrame = true;
    public boolean mEndOfStream = false;
    public int mBufferIndex = -1;

    private void reportEncInfo() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("picEncodeCount", String.valueOf(this.mPicEncodeCount));
            jSONObject.put("picBufferCount", String.valueOf(this.mPicBufferCount));
            jSONObject.put("picSendCount", String.valueOf(this.mPicSendCount));
            jSONObject.put("useForRecorder", String.valueOf(this.mUseForRecorder));
            b.LIZIZ("vesdk_event_hwencode_error", "behavior", jSONObject, false);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("releaseEncoder, Exception ");
            sbLIZ.append(stringWriter);
            C2484209oO.LJIIIIZZ("TEAvcEncoder", C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ), new C2484309oP[0]));
        }
    }

    public static boolean saveFrameToFile(int i, int i2, int i3, long j) {
        return true;
    }

    private boolean checkHDR10bitSupport() {
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/hevc");
            if (mediaCodecCreateEncoderByType == null) {
                C2484209oO.LJI("TEAvcEncoder", "ByteVC1 HW codec not supported");
                return false;
            }
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfo.getCapabilitiesForType(codecInfo.getSupportedTypes()[0]);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("encoder supported color formats ");
            sbLIZ.append(Arrays.toString(capabilitiesForType.colorFormats));
            C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("encoder supported profiles: ");
            sbLIZ2.append(Arrays.toString(capabilitiesForType.profileLevels));
            C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            int[] iArr = capabilitiesForType.colorFormats;
            for (int i : iArr) {
                if (i == 54) {
                    C2484209oO.LJI("TEAvcEncoder", "Supports HDR 10 bit encoding");
                    return true;
                }
            }
            mediaCodecCreateEncoderByType.release();
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(" Exception ");
            sbLIZ3.append(stringWriter);
            C2484209oO.LJIIIIZZ("TEAvcEncoder", C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ3), new C2484309oP[0]));
            return false;
        }
    }

    private int cleanUpMediaCodec() {
        if (this.mEndOfStream) {
            return 0;
        }
        try {
            MediaCodec mediaCodec = this.m_mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.signalEndOfInputStream();
            }
            int i = 30;
            while (!this.mEndOfStream && i > 0) {
                int iDrainOutputBuffer = drainOutputBuffer(10000L);
                if (iDrainOutputBuffer != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CleanUpMediaCodec drainOutputBuffer failed ret: ");
                    sbLIZ.append(iDrainOutputBuffer);
                    C2484209oO.LIZJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
                    return iDrainOutputBuffer;
                }
                i--;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CleanUpMediaCodec: cnt= ");
            sbLIZ2.append(i);
            sbLIZ2.append(" mEndOfStream = ");
            sbLIZ2.append(this.mEndOfStream);
            C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            if (!this.mEndOfStream) {
                C2484209oO.LIZJ("TEAvcEncoder", "CleanUpMediaCodec: Not reaching end of stream but encoder is alive so let's keep it going!");
                return 0;
            }
            if (restartEncoder() >= 0) {
                return 0;
            }
            C2484209oO.LIZJ("TEAvcEncoder", C2484209oO.LJ("TEAvcEncoder", "CleanupMediaCodec restartEncoder failed", new C2484309oP[0]));
            return -213;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("CleanUpMediaCodec signalEndOfInputStream exception: ");
            sbLIZ3.append(stringWriter);
            String strLJ = C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ3), new C2484309oP[0]);
            C2484209oO.LJIIIIZZ("TEAvcEncoder", strLJ);
            reportErrorInfo("CleanUpMediaCodec", strLJ);
            return -213;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x022e: INVOKE (r5 I:com.ss.android.ttve.mediacodec.TEAvcEncoder), (r3 I:java.lang.String), (r0 I:java.lang.String) DIRECT call: com.ss.android.ttve.mediacodec.TEAvcEncoder.reportErrorInfo(java.lang.String, java.lang.String):void A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:558), block:B:64:0x0205 */
    private int configEncode() {
        TEAvcEncoder tEAvcEncoderReportErrorInfo;
        C1311120kDu.LIZ("configEncode");
        try {
            Surface surface = this.m_surface;
            if (surface != null) {
                surface.release();
                this.m_surface = null;
            }
            MediaCodec mediaCodec = this.m_mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            if (VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", false).booleanValue()) {
                TEMediaCodecResourceManager.sHWEncoderStateIsBeforeRunning = true;
                TEMediaCodecResourceManager.sExistHWEncoder = true;
                if (!TEMediaCodecResourceManager.tryUseCodecBlocksSize(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode())) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ERROR_HW_OVERLOAD, MaxCodecBlocksSize is: ");
                    sbLIZ.append(TEMediaCodecResourceManager.getMaxCodecBlocksSize());
                    sbLIZ.append(", UsedCodecBlocksSize is: ");
                    sbLIZ.append(TEMediaCodecResourceManager.getUsedCodecBlocksSize());
                    C2484209oO.LJIIIIZZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(this.m_mime_type);
            this.m_mediaCodec = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            String lowerCase = codecInfo.getName().toLowerCase();
            if (lowerCase.contains(".qcom.") || lowerCase.contains(".qti.")) {
                this.m_hardWare = 1;
            } else if (lowerCase.contains(".hisi.")) {
                this.m_hardWare = 2;
            } else if (lowerCase.contains(".mtk.")) {
                this.m_hardWare = 3;
            } else if (lowerCase.contains(".exynos.") || lowerCase.contains(".sec.")) {
                this.m_hardWare = 4;
            }
            if (this.m_hardWare > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("encoderType", "hw");
                jSONObject.put("encoderName", lowerCase);
                b.LIZIZ("vesdk_event_hwencode_codec_support", "behavior", jSONObject, false);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("configEncode m_hardWare ");
                sbLIZ2.append(this.m_hardWare);
                C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                String[] strArr = SOFTWARE_IMPLEMENTATION_PREFIXES;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (lowerCase.startsWith(strArr[i])) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("encoderType", "sw");
                        jSONObject2.put("encoderName", lowerCase);
                        b.LIZIZ("vesdk_event_hwencode_codec_support", "behavior", jSONObject2, false);
                        break;
                    }
                    i++;
                }
            }
            String[] supportedTypes = codecInfo.getSupportedTypes();
            C2484209oO.LIZ("TEAvcEncoder", "configEncode supports " + Arrays.toString(supportedTypes));
            C2484209oO.LJI("TEAvcEncoder", "configEncode caps " + Arrays.toString(codecInfo.getCapabilitiesForType(supportedTypes[0]).colorFormats));
            if (codecInfo.getName().startsWith("OMX.google.")) {
                C2484209oO.LJIIIIZZ("TEAvcEncoder", C2484209oO.LJ("TEAvcEncoder", "TEAvcEncoder mediaCodecInfo Name() startsWith OMX.google.", new C2484309oP[0]));
                return -2;
            }
            if (reconfigureMediaFormat(codecInfo) != 0) {
                C2484209oO.LJIIIIZZ("TEAvcEncoder", C2484209oO.LJ("TEAvcEncoder", "TEAvcEncoder reconfigureMediaFormat failed", new C2484309oP[0]));
                return -3;
            }
            boolean zBooleanValue = VEConfigCenter.getInstance().getValue("ve_encoder_enable_dynamic_bitrate", false).booleanValue();
            this.mEnableDynamicBitrate = zBooleanValue;
            if (zBooleanValue) {
                VideoDynamicBitrate videoDynamicBitrate = new VideoDynamicBitrate();
                this.dynamicBitrate = videoDynamicBitrate;
                boolean zLIZIZ = videoDynamicBitrate.LIZIZ(lowerCase, this.m_bitRate, this.m_mime_type.equals("video/hevc"), Math.min(this.m_width, this.m_height), this.m_streamID);
                this.mEnableDynamicBitrate = zLIZIZ;
                if (!zLIZIZ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("dynamicBitrate Init failed streamID=");
                    sbLIZ3.append(this.m_streamID);
                    C2484209oO.LIZJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ3));
                    this.dynamicBitrate.LIZLLL();
                    this.dynamicBitrate = null;
                }
            }
            this.m_mediaCodec.configure(this.m_codecFormat, (Surface) null, (MediaCrypto) null, 1);
            if (this.m_useInputSurface) {
                this.m_surface = this.m_mediaCodec.createInputSurface();
                StringBuilder sb = new StringBuilder();
                sb.append("m_mediaCodec.createInputSurface(), m_surface.isValid=");
                Surface surface2 = this.m_surface;
                sb.append(surface2 == null ? "null" : Boolean.valueOf(surface2.isValid()));
                C2484209oO.LJI("TEAvcEncoder", sb.toString());
            }
            C1311120kDu.LIZIZ();
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("TEAvcEncoder configEncode Exception");
            sbLIZ4.append(stringWriter);
            String strLJ = C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ4), new C2484309oP[0]);
            C2484209oO.LJIIIIZZ("TEAvcEncoder", strLJ);
            tEAvcEncoderReportErrorInfo.reportErrorInfo("configEncode", strLJ);
            return -4;
        }
    }

    public static TEAvcEncoder createEncoderObject() {
        return new TEAvcEncoder();
    }

    private int forceToPrepareKeyFrame() {
        C1311120kDu.LIZ("forceToPrepareKeyFrame");
        C2484209oO.LIZ("TEAvcEncoder", "HW_ENCODE forceToPrepareKeyFrame");
        this.m_mediaCodec.signalEndOfInputStream();
        int i = 30;
        while (!this.mEndOfStream) {
            int iDrainOutputBuffer = drainOutputBuffer(10000L);
            if (iDrainOutputBuffer != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("forceToPrepareKeyFrame failed ret: ");
                sbLIZ.append(iDrainOutputBuffer);
                C2484209oO.LIZJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
                return iDrainOutputBuffer;
            }
            if (this.mBufferIndex >= 0 || i - 1 <= 0) {
                break;
            }
        }
        restartEncoder();
        C1311120kDu.LIZIZ();
        return 0;
    }

    public static String[] getSmartCodecPath() {
        return (String[]) mSmartCodecPathList.toArray(new String[mSmartCodecPathList.size()]);
    }

    public static void initializeHookImageCopy() {
        if (kInitialized.booleanValue()) {
            return;
        }
        synchronized (kInitSyncObj) {
            try {
                if (kInitialized.booleanValue()) {
                    return;
                }
                kInitialized = Boolean.TRUE;
                try {
                    if (VEConfigCenter.getInstance().getValue("veabtest_hook_image_copy", false).booleanValue() && shouldHookImageCopy()) {
                        TEUtils.nativeHookImageCopy();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C2484209oO.LIZLLL("TEAvcEncoder", "Hook image copy failed", th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    private int mediaCodecStart() {
        if (this.mUseForRecorder || !VEConfigCenter.getInstance().getValue("veabtest_hook_image_copy", false).booleanValue() || !shouldHookImageCopy()) {
            this.m_mediaCodec.start();
            return 0;
        }
        try {
            TEUtils.nativeSetEncodeThreadId(TEUtils.nativeGetPThreadId());
            if (TEUtils.nativeTryExecute(new ARunnableS120S0100000_20(this, 75))) {
                TEUtils.nativeSetEncodeThreadId(-1L);
                return 0;
            }
            C2484209oO.LIZJ("TEAvcEncoder", "MediaCodec.start() failed!");
            TEUtils.nativeSetEncodeThreadId(-1L);
            return -4;
        } finally {
        }
    }

    private void setBFrames() {
        String value;
        if (this.m_codecFormat == null || Build.VERSION.SDK_INT < 29 || (value = VEConfigCenter.getInstance().getValue("ve_encoder_b_frame", "")) == null || value.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            int i = JSONObjectProtectorUtils.getInt(this.mUseForRecorder ? JSONObjectProtectorUtils.getJSONObject(jSONObject, "recorder") : this.m_pageMode == 1 ? JSONObjectProtectorUtils.getJSONObject(jSONObject, "crop") : JSONObjectProtectorUtils.getJSONObject(jSONObject, "common"), "count");
            if (i > 0) {
                this.m_codecFormat.setInteger("max-bframes", i);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setBFrames json str parse error : ");
            sbLIZ.append(e.getLocalizedMessage());
            C2484209oO.LJIIIIZZ("TEAvcEncoder", C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ), new C2484309oP[0]));
        }
    }

    public static boolean shouldHookImageCopy() {
        return Build.VERSION.SDK_INT == 31 && Build.SOC_MODEL.compareToIgnoreCase("SM7325") == 0;
    }

    private void startupRecordMonitor() {
        int value;
        if (this.mUseForRecorder && (value = VEConfigCenter.getInstance().getValue("ve_hwencode_detect_duration", 0)) != 0) {
            if (this.mHandler == null) {
                this.mHandler = new BPEAHandler(Looper.getMainLooper()) { // from class: com.ss.android.ttve.mediacodec.TEAvcEncoder.2
                    @Override // android.os.Handler
                    public final void handleMessage(Message message) {
                        C1C7U.LIZ("TEAvcEncoder@d09b.startupRecordMonitor$1");
                        boolean z = true;
                        if (message.what == 1) {
                            TEAvcEncoder tEAvcEncoder = TEAvcEncoder.this;
                            if (tEAvcEncoder.mPicEncodeCount != 0) {
                                z = false;
                            }
                            tEAvcEncoder.mRecorderEncodeFail = z;
                            if (z) {
                                C2484209oO.LIZJ("TEAvcEncoder", "recorder encode check failed, picEncodeCount=0, following frames will return TER_MEDIA_CODEC_HW_ENCODE_EXCEPTION");
                            }
                        }
                        C1C7U.LIZIZ("TEAvcEncoder@d09b.startupRecordMonitor$1");
                    }
                };
            }
            Handler handler = this.mHandler;
            C786410Ut5.LJLJLJ(handler, handler.obtainMessage(1), value);
        }
    }

    private int videoSmartCodecInit() {
        this.mCurBitrate = this.m_bitRate;
        this.mEncodedFrameSizeSum = 0.0f;
        this.mEncodedFrameNum = 0;
        if (this.mSmartCodec == null) {
            VideoSmartCodec videoSmartCodec = new VideoSmartCodec();
            this.mSmartCodec = videoSmartCodec;
            int i = this.m_width_align;
            int i2 = this.m_height_align;
            if (!videoSmartCodec.LIZIZ(i, i2, i, i2, this.m_frameRate, this.m_bitRate, EnumC2074208Aq.MEDIUM, EnumC2074108Ap.SURFACE_RGBA, (String) ListProtector.get(mSmartCodecPathList, 0), (String) ListProtector.get(mSmartCodecPathList, 1), this.isOesTexture, mJsonSettings)) {
                C2484209oO.LIZJ("TEAvcEncoder", "smartEncoder initSmartCodec failed");
                mSmartCodecPathList.clear();
                this.mSmartCodec.LIZLLL();
                this.mSmartCodec = null;
                return -116;
            }
        }
        this.mSmartCodecInitNum++;
        return 0;
    }

    public byte[] getExtraData() {
        byte[] bArr = this.configByte;
        return bArr != null ? bArr : new byte[0];
    }

    public ByteBuffer getFrameCacheBuf() {
        if (this.mByteBuf == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.m_width * this.m_height * 4);
            this.mByteBuf = byteBufferAllocateDirect;
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        }
        this.mByteBuf.position(0);
        return this.mByteBuf;
    }

    public boolean initTextureDrawer() {
        C1284420jWq c1284420jWq = null;
        C1283330jV5 c1283330jV5 = null;
        if (this.m_bEncodeOESTexture) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initTextureDrawer m_bEncodeOESTexture = ");
            sbLIZ.append(this.m_bEncodeOESTexture);
            C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
            C1283330jV5 c1283330jV52 = new C1283330jV5();
            c1283330jV52.LIZJ = C1283330jV5.LIZ(C1283330jV5.LJII);
            c1283330jV52.LIZLLL = C1283330jV5.LIZ(C1283330jV5.LJIIIIZZ);
            C1283310jV3 c1283310jV3 = new C1283310jV3();
            c1283330jV52.LIZ = c1283310jV3;
            if (c1283310jV3.LIZIZ("attribute vec4 aPosition;\nattribute vec2 aTextureCoord;\nuniform mat4 uMVPMatrix;\nvarying vec2 vTextureCoord;\nvoid main()\n{\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = aTextureCoord;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES uTextureSampler;\nvarying vec2 vTextureCoord;\nvoid main() \n{\n  gl_FragColor = texture2D(uTextureSampler, vTextureCoord);\n}")) {
                c1283330jV52.LIZ.LIZ();
                c1283330jV52.LJ = GLES20.glGetUniformLocation(c1283330jV52.LIZ.LIZ, "uMVPMatrix");
                int[] iArr = new int[2];
                c1283330jV52.LIZIZ = iArr;
                GLES20.glGenBuffers(2, iArr, 0);
                GLES20.glBindAttribLocation(c1283330jV52.LIZ.LIZ, 0, "aPosition");
                GLES20.glBindBuffer(34962, c1283330jV52.LIZIZ[0]);
                c1283330jV52.LIZJ.position(0);
                GLES20.glBufferData(34962, 32, c1283330jV52.LIZJ, 35044);
                GLES20.glBindAttribLocation(c1283330jV52.LIZ.LIZ, 1, "aTextureCoord");
                GLES20.glBindBuffer(34962, c1283330jV52.LIZIZ[1]);
                c1283330jV52.LIZLLL.position(0);
                GLES20.glBufferData(34962, 32, c1283330jV52.LIZLLL, 35048);
                c1283330jV52.LIZLLL(0, 0, 0, 0, 0, false);
                C2484209oO.LJI("TETextureOESDrawer", "init: success.");
                c1283330jV5 = c1283330jV52;
            } else {
                C1283310jV3 c1283310jV32 = c1283330jV52.LIZ;
                int i = c1283310jV32.LIZ;
                if (i != 0) {
                    GLES20.glDeleteProgram(i);
                    c1283310jV32.LIZ = 0;
                }
                c1283330jV52.LIZ = null;
                C2484209oO.LIZJ("TETextureOESDrawer", "TETextureOESDrawer create failed!");
                c1283330jV52.LIZJ();
            }
            this.m_textureOESDrawer = c1283330jV5;
            if (c1283330jV5 != null) {
                return true;
            }
            C2484209oO.LIZJ("TEAvcEncoder", "NULL OES texture drawer!");
            return false;
        }
        C1284420jWq c1284420jWq2 = this.m_textureDrawer;
        if (c1284420jWq2 != null) {
            c1284420jWq2.LIZIZ();
            this.m_textureDrawer = null;
        }
        C1284420jWq c1284420jWq3 = new C1284420jWq();
        C1283310jV3 c1283310jV33 = new C1283310jV3();
        c1284420jWq3.LIZ = c1283310jV33;
        if (c1283310jV33.LIZIZ("attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n}")) {
            c1284420jWq3.LIZ.LIZ();
            c1284420jWq3.LIZJ = GLES20.glGetUniformLocation(c1284420jWq3.LIZ.LIZ, "rotation");
            c1284420jWq3.LIZLLL = GLES20.glGetUniformLocation(c1284420jWq3.LIZ.LIZ, "flipScale");
            GLES20.glBindAttribLocation(c1284420jWq3.LIZ.LIZ, 0, "vPosition");
            int[] iArr2 = new int[1];
            GLES20.glGenBuffers(1, iArr2, 0);
            int i2 = iArr2[0];
            c1284420jWq3.LIZIZ = i2;
            GLES20.glBindBuffer(34962, i2);
            FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            floatBufferAsFloatBuffer.put(C1284420jWq.LJ);
            floatBufferAsFloatBuffer.position(0);
            GLES20.glBufferData(34962, 32, floatBufferAsFloatBuffer, 35044);
            c1284420jWq3.LIZJ();
            c1284420jWq3.LIZ.LIZ();
            GLES20.glUniform2f(c1284420jWq3.LIZLLL, 1.0f, 1.0f);
            C2484209oO.LJI("TETextureDrawer", "init: success.");
            c1284420jWq = c1284420jWq3;
        } else {
            C1283310jV3 c1283310jV34 = c1284420jWq3.LIZ;
            int i3 = c1283310jV34.LIZ;
            if (i3 != 0) {
                GLES20.glDeleteProgram(i3);
                c1283310jV34.LIZ = 0;
            }
            c1284420jWq3.LIZ = null;
            C2484209oO.LIZJ("TETextureDrawer", "TETextureDrawer create failed!");
            c1284420jWq3.LIZIZ();
        }
        this.m_textureDrawer = c1284420jWq;
        if (c1284420jWq == null) {
            C2484209oO.LIZJ("TEAvcEncoder", "NULL texture drawer!");
            return false;
        }
        c1284420jWq.LIZJ();
        C1284420jWq c1284420jWq4 = this.m_textureDrawer;
        c1284420jWq4.LIZ.LIZ();
        GLES20.glUniform2f(c1284420jWq4.LIZLLL, 1.0f, -1.0f);
        return true;
    }

    public void releaseTextureDrawer() {
        if (this.m_bEncodeOESTexture) {
            C1283330jV5 c1283330jV5 = this.m_textureOESDrawer;
            if (c1283330jV5 != null) {
                c1283330jV5.LIZJ();
                this.m_textureOESDrawer = null;
                return;
            }
            return;
        }
        C1284420jWq c1284420jWq = this.m_textureDrawer;
        if (c1284420jWq == null) {
            return;
        }
        c1284420jWq.LIZIZ();
        this.m_textureDrawer = null;
    }

    public int restartEncoder() {
        C1311120kDu.LIZ("restartEncoder");
        C2484209oO.LJI("TEAvcEncoder", "HW_ENCODE restartEncoder...");
        this.m_bNeedSingalEnd = false;
        stopEncoder();
        int iConfigEncode = configEncode();
        if (iConfigEncode >= 0) {
            C1311120kDu.LIZIZ();
            return startEncoder();
        }
        if (VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", false).booleanValue()) {
            TEMediaCodecResourceManager.freeCodecBlocksSize(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode());
        }
        return iConfigEncode;
    }

    public void setSharedEGLContext() {
        if (this.m_eglStateSaver == null) {
            C1284320jWg c1284320jWg = new C1284320jWg();
            this.m_eglStateSaver = c1284320jWg;
            c1284320jWg.LIZIZ();
        }
    }

    public int startEncoder() {
        C1311120kDu.LIZ("startEncoder");
        C2484209oO.LJI("TEAvcEncoder", "startEncoder...");
        try {
            if (this.m_useInputSurface) {
                boolean z = this.m_useHDR10Bit;
                int i = z ? 4 : 12610;
                if (this.m_bEncoderGLContextReuse) {
                    if (this.m_eglStateSaver == null) {
                        C1284320jWg c1284320jWg = new C1284320jWg();
                        this.m_eglStateSaver = c1284320jWg;
                        c1284320jWg.LIZIZ();
                    }
                    if (this.m_sharedContext == null) {
                        C1284320jWg c1284320jWg2 = this.m_eglStateSaver;
                        this.m_sharedContext = TESharedContext.LIZJ(c1284320jWg2.LIZ, c1284320jWg2.LIZLLL, i, this.m_useHDR10Bit);
                    }
                    if (!this.m_sharedContext.LJFF(12610, this.m_surface) && this.mUseForRecorder) {
                        C2484209oO.LIZJ("TEAvcEncoder", "updateSurface failed!");
                        return -2;
                    }
                } else {
                    TESharedContext tESharedContext = this.m_sharedContext;
                    if (tESharedContext == null) {
                        TESharedContext tESharedContextLIZIZ = TESharedContext.LIZIZ(this.m_eglStateSaver.LIZ, i, this.m_surface, z);
                        this.m_sharedContext = tESharedContextLIZIZ;
                        if (tESharedContextLIZIZ == null) {
                            C2484209oO.LIZJ("TEAvcEncoder", "create shared context failed!");
                            return -2;
                        }
                    } else if (!tESharedContext.LJFF(i, this.m_surface)) {
                        C2484209oO.LIZJ("TEAvcEncoder", "updateSurface failed!");
                        return -2;
                    }
                }
                if (!initTextureDrawer()) {
                    return -3;
                }
            }
            int iMediaCodecStart = mediaCodecStart();
            if (iMediaCodecStart != 0) {
                return iMediaCodecStart;
            }
            this.m_encodeStartTime = System.nanoTime();
            this.m_isNeedReconfigure = false;
            this.mEndOfStream = false;
            C1311120kDu.LIZIZ();
            return 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startEncoder, ERROR_OCCUR_EXCEPTION Exception ");
            sbLIZ.append(stringWriter);
            String strLJ = C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ), new C2484309oP[0]);
            C2484209oO.LJIIIIZZ("TEAvcEncoder", strLJ);
            reportErrorInfo("startEncoder", strLJ);
            return -1;
        }
    }

    public void stopEncoder() {
        C1311120kDu.LIZ("stopEncoder");
        try {
            this.m_bByteVC110BitHWDecoder = false;
            TESharedContext tESharedContext = this.m_sharedContext;
            if (tESharedContext != null) {
                tESharedContext.LIZLLL();
            }
            C1284420jWq c1284420jWq = this.m_textureDrawer;
            if (c1284420jWq != null) {
                c1284420jWq.LIZIZ();
                this.m_textureDrawer = null;
            }
            C1283330jV5 c1283330jV5 = this.m_textureOESDrawer;
            if (c1283330jV5 != null) {
                c1283330jV5.LIZJ();
                this.m_textureOESDrawer = null;
            }
            MediaCodec mediaCodec = this.m_mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopEncoder, Exception ");
            sbLIZ.append(stringWriter);
            String strLJ = C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ), new C2484309oP[0]);
            C2484209oO.LJIIIIZZ("TEAvcEncoder", strLJ);
            reportErrorInfo("stopEncoder", strLJ);
        }
        C1311120kDu.LIZIZ();
    }

    public void releaseEncoder() {
        EGLSurface eGLSurface;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TE_RECORD_IS_STOP_BEFORE_EXTRA_DATA: ");
        sbLIZ.append(this.configByte == null);
        C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("HW_ENCODE AVCQueue = ");
        sbLIZ2.append(this.AVCQueue.size());
        sbLIZ2.append(", mPicSendCount = ");
        sbLIZ2.append(this.mPicSendCount);
        sbLIZ2.append(", mPicBufferCount = ");
        sbLIZ2.append(this.mPicBufferCount);
        sbLIZ2.append(", mPicEncodeCount = ");
        sbLIZ2.append(this.mPicEncodeCount);
        C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ2));
        C2484209oO.LIZ("TEAvcEncoder", "HW_ENCODE releaseEncoder");
        stopEncoder();
        reportEncInfo();
        C2484209oO.LJI("TEAvcEncoder", "releaseEncoder");
        if (this.mSmartCodec != null) {
            C2484209oO.LIZJ("TEAvcEncoder", "release SmartCodec");
            this.mSmartCodec.LIZLLL();
            this.mSmartCodec = null;
        }
        if (this.mEnableDynamicBitrate && this.dynamicBitrate != null) {
            C2484209oO.LIZJ("TEAvcEncoder", "release VideoDynamicBitrate");
            this.dynamicBitrate.LIZLLL();
            this.dynamicBitrate = null;
        }
        TESharedContext tESharedContext = this.m_sharedContext;
        if (tESharedContext != null) {
            if (this.m_bEncoderGLContextReuse) {
                EGLDisplay eGLDisplay = tESharedContext.LIZJ;
                if (eGLDisplay != null && (eGLSurface = tESharedContext.LIZLLL) != null) {
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                }
            } else {
                tESharedContext.LJ();
            }
            this.m_sharedContext = null;
        }
        if (this.m_surface != null) {
            C2484209oO.LIZ("TEAvcEncoder", "release surface");
            this.m_surface.release();
            this.m_surface = null;
        }
        if (this.m_mediaCodec != null) {
            C2484209oO.LIZ("TEAvcEncoder", "release mediaCodec");
            this.m_mediaCodec.release();
            this.m_mediaCodec = null;
            if (VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", false).booleanValue()) {
                TEMediaCodecResourceManager.freeCodecBlocksSize(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode());
                TEMediaCodecResourceManager.sExistHWEncoder = false;
            }
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
    }

    public static float getSmartCodecVmaf() {
        return mVmaf;
    }

    public Surface getInputSurface() {
        return this.m_surface;
    }

    private int drainOutputBuffer(long j) {
        int length;
        int i;
        VideoDynamicBitrate videoDynamicBitrate;
        int i2;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        C2484209oO.LIZ("TEAvcEncoder", "drainOutputBuffer before dequeueOutputBuffer");
        int i3 = -1;
        this.mBufferIndex = -1;
        int i4 = 0;
        try {
            int iDequeueOutputBuffer = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            this.mBufferIndex = iDequeueOutputBuffer;
            if (this.configByte == null && iDequeueOutputBuffer == -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("configByte = null and mBufferIndex = MediaCodec.INFO_TRY_AGAIN_LATER, timeoutUs: ");
                sbLIZ.append(j);
                C2484209oO.LJIIIIZZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("HW_ENCODE drainOutputBuffer mBufferIndex ");
            sbLIZ2.append(this.mBufferIndex);
            sbLIZ2.append(" buffer-flag= ");
            sbLIZ2.append(bufferInfo.flags);
            C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            while (true) {
                int i5 = this.mBufferIndex;
                if (i5 < 0) {
                    break;
                }
                int i6 = bufferInfo.size;
                byte[] bArr = new byte[i6];
                try {
                    ByteBuffer outputBufferByIdx = getOutputBufferByIdx(i5);
                    outputBufferByIdx.position(bufferInfo.offset);
                    outputBufferByIdx.limit(bufferInfo.offset + bufferInfo.size);
                    outputBufferByIdx.get(bArr);
                    if (this.mSmartCodec != null && (i2 = this.mBufferIndex) != i3 && i2 != -2 && i2 != -3) {
                        this.mEncodedFrameSizeSum += bufferInfo.size;
                        this.mEncodedFrameNum++;
                    }
                    if (this.mEnableDynamicBitrate && (videoDynamicBitrate = this.dynamicBitrate) != null) {
                        videoDynamicBitrate.LIZJ(bArr);
                        VideoDynamicBitrateResult videoDynamicBitrateResultLIZ = this.dynamicBitrate.LIZ(new VideoDynamicBitrateResult());
                        Object[] objArr = new Object[3];
                        objArr[i4] = Integer.valueOf(this.m_bitRate);
                        objArr[1] = Integer.valueOf((int) (((double) this.m_bitRate) * videoDynamicBitrateResultLIZ.bitrateScale));
                        objArr[2] = Boolean.valueOf(videoDynamicBitrateResultLIZ.bUpdate);
                        C2484209oO.LIZ("VideoDynamicBitrate", C786410Ut5.j4("Update: m_bitRate=%d bitrate=%d bUpdate=%b", objArr));
                        if (videoDynamicBitrateResultLIZ.bUpdate) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("video-bitrate", (int) (((double) this.m_bitRate) * videoDynamicBitrateResultLIZ.bitrateScale));
                            this.m_mediaCodec.setParameters(bundle);
                        }
                    }
                    int i7 = bufferInfo.flags;
                    if (i7 == 2) {
                        C2484209oO.LIZ("TEAvcEncoder", "HW_ENCODE drainOutputBuffer BUFFER_FLAG_CODEC_CONFIG");
                        this.configByte = bArr;
                    } else if (i7 == 1) {
                        C2484209oO.LIZ("TEAvcEncoder", "HW_ENCODE drainOutputBuffer data BUFFER_FLAG_KEY_FRAME");
                        byte[] bArr2 = this.configByte;
                        if (bArr2 != null && bArr2.length > 4 && i6 > bArr2.length + 4) {
                            if (bArr[4] == bArr2[4] && (bArr[bArr2.length + 4] & 31) == 5) {
                                int length2 = i6 - bArr2.length;
                                byte[] bArr3 = new byte[length2];
                                System.arraycopy(bArr, bArr2.length, bArr3, 0, length2);
                                bArr = bArr3;
                            }
                        } else {
                            C2484209oO.LIZJ("TEAvcEncoder", "I can't find configByte!!!! NEED extract from I frame!!!");
                        }
                        addOutputData(bArr, bufferInfo);
                        this.mPicEncodeCount++;
                    } else {
                        if (i7 == 4) {
                            C2484209oO.LJI("TEAvcEncoder", "HW_ENCODE drainOutputBuffer BUFFER_FLAG_END_OF_STREAM");
                            this.mEndOfStream = true;
                            break;
                        }
                        C2484209oO.LIZ("TEAvcEncoder", "HW_ENCODE drainOutputBuffer data");
                        addOutputData(bArr, bufferInfo);
                        this.mPicEncodeCount++;
                    }
                    try {
                        this.m_mediaCodec.releaseOutputBuffer(this.mBufferIndex, false);
                        this.mBufferIndex = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j);
                        i3 = -1;
                        i4 = 0;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringWriter stringWriter = new StringWriter();
                        e.printStackTrace(new PrintWriter(stringWriter));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("releaseOutputBuffer exception:");
                        sbLIZ3.append(stringWriter);
                        String strLJ = C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ3), new C2484309oP[0]);
                        C2484209oO.LIZJ("TEAvcEncoder", strLJ);
                        reportErrorInfo("releaseOutputBuffer", strLJ);
                        return -214;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringWriter stringWriter2 = new StringWriter();
                    e2.printStackTrace(new PrintWriter(stringWriter2));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("getOutputBufferByIdx exception:");
                    sbLIZ4.append(stringWriter2);
                    String strLJ2 = C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ4), new C2484309oP[i4]);
                    C2484209oO.LIZJ("TEAvcEncoder", strLJ2);
                    reportErrorInfo("getOutputBufferByIdx", strLJ2);
                    return -214;
                }
            }
            if (this.mBufferIndex == -2) {
                C2484209oO.LIZ("TEAvcEncoder", "HW_ENCODE drainOutputBuffer INFO_OUTPUT_FORMAT_CHANGED");
                try {
                    MediaFormat outputFormat = this.m_mediaCodec.getOutputFormat();
                    ByteBuffer byteBuffer = outputFormat.getByteBuffer("csd-0");
                    ByteBuffer byteBuffer2 = outputFormat.getByteBuffer("csd-1");
                    if (byteBuffer != null) {
                        byte[] bArr4 = (byte[]) byteBuffer.array().clone();
                        this.sps = bArr4;
                        length = bArr4.length;
                    } else {
                        length = 0;
                    }
                    if (byteBuffer2 != null) {
                        byte[] bArr5 = (byte[]) byteBuffer2.array().clone();
                        this.pps = bArr5;
                        length += bArr5.length;
                    }
                    byte[] bArr6 = new byte[length];
                    this.configByte = bArr6;
                    if (byteBuffer != null) {
                        byte[] bArr7 = this.sps;
                        i = 0;
                        System.arraycopy(bArr7, 0, bArr6, 0, bArr7.length);
                    } else {
                        i = 0;
                    }
                    if (byteBuffer2 != null) {
                        byte[] bArr8 = this.pps;
                        System.arraycopy(bArr8, i, this.configByte, this.sps.length, bArr8.length);
                        return 0;
                    }
                    return 0;
                } catch (IllegalStateException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    StringWriter stringWriter3 = new StringWriter();
                    e3.printStackTrace(new PrintWriter(stringWriter3));
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("getOutputFormat exception:");
                    sbLIZ5.append(stringWriter3);
                    String strLJ3 = C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ5), new C2484309oP[0]);
                    C2484209oO.LIZJ("TEAvcEncoder", strLJ3);
                    reportErrorInfo("getOutputFormat", strLJ3);
                    return -214;
                }
            }
            return 0;
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringWriter stringWriter4 = new StringWriter();
            e4.printStackTrace(new PrintWriter(stringWriter4));
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("dequeueOutputBuffer exception:");
            sbLIZ6.append(stringWriter4);
            String strLJ4 = C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ6), new C2484309oP[0]);
            C2484209oO.LIZJ("TEAvcEncoder", strLJ4);
            reportErrorInfo("drainOutputBuffer", strLJ4);
            return -214;
        }
    }

    private ByteBuffer getInputBufferByIdx(int i) {
        return this.m_mediaCodec.getInputBuffer(i);
    }

    private ByteBuffer getOutputBufferByIdx(int i) {
        return this.m_mediaCodec.getOutputBuffer(i);
    }

    private int reconfigureMediaFormat(MediaCodecInfo mediaCodecInfo) {
        boolean zBooleanValue;
        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        C2484209oO.LIZ("TEAvcEncoder", "CodecNames:");
        for (String str : supportedTypes) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Codec: ");
            sbLIZ.append(str);
            C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.m_mime_type, this.m_width_align, this.m_height_align);
        this.m_codecFormat = mediaFormatCreateVideoFormat;
        mediaFormatCreateVideoFormat.setInteger("color-format", this.m_colorFormat);
        this.m_codecFormat.setInteger("bitrate", this.m_bitRate);
        int i = this.m_frameRate;
        long j = MAX_PRODUCT_OF_SIZE_AND_FPS;
        if (j > 0) {
            long j2 = j / ((long) (this.m_width_align * this.m_height_align));
            if (i > j2) {
                i = (int) j2;
            }
        }
        this.m_codecFormat.setInteger("frame-rate", i);
        this.m_codecFormat.setInteger("i-frame-interval", this.m_iFrameInternal);
        this.mGOPSize = i * this.m_iFrameInternal;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("m_colorspace ");
        sbLIZ2.append(this.m_colorspace);
        sbLIZ2.append(" m_bColorRangeFull ");
        sbLIZ2.append(this.m_bColorRangeFull);
        sbLIZ2.append(" m_colorTrc ");
        sbLIZ2.append(this.m_colorTrc);
        C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ2));
        this.m_codecFormat.setInteger("color-standard", this.m_colorspace);
        this.m_codecFormat.setInteger("color-range", this.m_bColorRangeFull);
        this.m_codecFormat.setInteger("color-transfer", this.m_colorTrc);
        if (this.mEnableEncodeBt601 && this.m_useInputSurface && (zBooleanValue = VEConfigCenter.getInstance().getValue("ve_encode_color_space_bt601", true).booleanValue())) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("enableEncodeColorSpace601: ");
            sbLIZ3.append(zBooleanValue);
            C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ3));
            this.m_codecFormat.setInteger("color-standard", 2);
            this.m_codecFormat.setInteger("color-range", 2);
            this.m_codecFormat.setInteger("color-transfer", 3);
        }
        setProfile(mediaCodecInfo.getCapabilitiesForType(this.m_mime_type));
        setCacMode(mediaCodecInfo);
        setQpParameters(mediaCodecInfo);
        setBFrames();
        this.mEncFrameCount = 0L;
        C2484209oO.LJI("TEAvcEncoder", C786410Ut5.j4("RequestSyncFrame width:[%d] height:[%d] frameRate:[%d] iFrameInternal:[%d] bitRate:[%d] colorFormat:[%d] codec_type:[%d] gop_size: [%d]", new Object[]{Integer.valueOf(this.m_width_align), Integer.valueOf(this.m_height_align), Integer.valueOf(this.m_frameRate), Integer.valueOf(this.m_iFrameInternal), Integer.valueOf(this.m_bitRate), Integer.valueOf(this.m_colorFormat), Integer.valueOf(this.m_codec_type), Long.valueOf(this.mGOPSize)}));
        return 0;
    }

    private void setBitRateMode(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        String[] strArr = {"BITRATE_MODE_CQ", "BITRATE_MODE_VBR", "BITRATE_MODE_CBR"};
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        int i = 0;
        do {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strArr[i]);
            sbLIZ.append(": ");
            sbLIZ.append(encoderCapabilities.isBitrateModeSupported(i));
            C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
            i++;
        } while (i < 3);
        this.m_codecFormat.setInteger("bitrate-mode", 1);
    }

    private void setByteVC110BitHWDecoderFlag(boolean z) {
        this.m_bByteVC110BitHWDecoder = z;
    }

    private void setCacMode(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            String lowerCase = mediaCodecInfo.getName().toLowerCase();
            if (lowerCase.contains(".qcom.") || lowerCase.contains(".qti.")) {
                int value = VEConfigCenter.getInstance().getValue("ve_content_adaptive_coding_mode", -1);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set cac value = ");
                sbLIZ.append(value);
                C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
                if (value >= 0) {
                    this.m_codecFormat.setInteger("vendor.qti-ext-enc-content-adaptive-mode.value", value);
                }
            }
        }
    }

    public static void setEncodeParams(C1284480jWw c1284480jWw) {
        C2188811AlT.LIZ().append("setEncodeParams ");
        throw null;
    }

    public static void setEncodeResolutionAlign(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            ENCODE_RESOLUTION_ALIGN = i;
        }
    }

    private void setMediaCodecDecInstance(Object obj) {
        TEMediaCodecDecoder tEMediaCodecDecoder = (TEMediaCodecDecoder) obj;
        this.m_MediaCodecDecInstance = tEMediaCodecDecoder;
        if (tEMediaCodecDecoder == null) {
            C2484209oO.LIZJ("TEAvcEncoder", "m_MediaCodecDecInstance is null");
        }
    }

    private void setProcessFlag(int i) {
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        this.m_bEncodeOESTexture = z;
    }

    private void setProfile(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        VEConfigCenter vEConfigCenter;
        String str;
        int iIntValue;
        int iMin;
        int i;
        if (Build.VERSION.SDK_INT < 24) {
            C2484209oO.LJIIIIZZ("TEAvcEncoder", "setProfile return due to version");
            return;
        }
        boolean z = true;
        if (!this.m_useInputSurface) {
            this.m_codecFormat.setInteger("operating-rate", 240);
            this.m_codecFormat.setInteger("bitrate-mode", 1);
        } else if (this.mEnableOperatingRate) {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (this.mUseForRecorder) {
                vEConfigCenter = VEConfigCenter.getInstance();
                str = "ve_enable_record_encode_operating_rate";
            } else {
                vEConfigCenter = VEConfigCenter.getInstance();
                str = "ve_enable_encode_operating_rate";
            }
            int value = vEConfigCenter.getValue(str, 0);
            int value2 = VEConfigCenter.getInstance().getValue("ve_crop_encode_operating_rate", 0);
            boolean zBooleanValue = VEConfigCenter.getInstance().getValue("ve_enable_operating_rate_support_2k4k", false).booleanValue();
            if (value2 > 0 && this.m_pageMode == 1) {
                value = value2;
            }
            String value3 = VEConfigCenter.getInstance().getValue("ve_encode_support_operating_rate", "");
            if (value3 != null && !value3.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(value3);
                    int iOptInt = jSONObject.optInt("upload");
                    int iOptInt2 = jSONObject.optInt("waterMark");
                    int iOptInt3 = jSONObject.optInt("editSave");
                    int iOptInt4 = jSONObject.optInt("compileOther");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("operatingRateStr uploadOpt:");
                    sbLIZ.append(iOptInt);
                    sbLIZ.append(", waterMarkOpt:");
                    sbLIZ.append(iOptInt2);
                    sbLIZ.append(", editSaveOpt:");
                    sbLIZ.append(iOptInt3);
                    sbLIZ.append(", compileOtherOpt:");
                    sbLIZ.append(iOptInt4);
                    C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
                    int i2 = this.m_pageMode;
                    if (i2 == 0) {
                        if (iOptInt > 0 && this.m_streamID == 1) {
                            value = iOptInt;
                        } else if (iOptInt2 > 0) {
                            if (this.m_streamID == 2) {
                                value = iOptInt2;
                            }
                        }
                    } else if (i2 == 10) {
                        if (iOptInt3 > 0) {
                            value = iOptInt3;
                        }
                    } else if ((i2 == 11 || i2 == 12) && iOptInt4 > 0) {
                        value = iOptInt4;
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                try {
                    iIntValue = ((Double) videoCapabilities.getSupportedFrameRatesFor(this.m_width_align, this.m_height_align).getUpper()).intValue();
                } catch (IllegalArgumentException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2484209oO.LJIIIIZZ("TEAvcEncoder", "getSupportedFrameRate unsupported size");
                    iIntValue = 0;
                }
                if (iIntValue < 60) {
                    i = 0;
                } else {
                    i = iIntValue;
                }
                iMin = Math.min(i, value);
            } else {
                try {
                    iIntValue = ((Double) videoCapabilities.getSupportedFrameRatesFor(this.m_width_align, this.m_height_align).getUpper()).intValue();
                } catch (IllegalArgumentException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C2484209oO.LJIIIIZZ("TEAvcEncoder", "getSupportedFrameRate unsupported size");
                    iIntValue = Integer.MAX_VALUE;
                }
                iMin = Math.min((iIntValue / 120) * 120, value);
            }
            C2484209oO.LIZ("TEAvcEncoder", C786410Ut5.k4(Locale.getDefault(), "device support max_fps for Res(%d * %d) is %d, libra val = %d, crop libra val = %d, final val = %d pageMode val = %d", new Object[]{Integer.valueOf(this.m_width_align), Integer.valueOf(this.m_height_align), Integer.valueOf(iIntValue), Integer.valueOf(value), Integer.valueOf(value2), Integer.valueOf(iMin), Integer.valueOf(this.m_pageMode)}));
            if (iMin != 0 && (Math.max(this.m_width_align, this.m_height_align) <= 1920 || zBooleanValue)) {
                this.m_codecFormat.setInteger("operating-rate", iMin);
                C2484209oO.LJI("TEAvcEncoder", C786410Ut5.k4(Locale.getDefault(), "set operating-rate, value is %d, is recorder: %d", new Object[]{Integer.valueOf(iMin), Integer.valueOf(this.mUseForRecorder ? 1 : 0)}));
            }
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevelLIZIZ = C1284430jWr.LIZIZ(codecCapabilities, this.m_profile, this.m_codec_type);
        if (this.m_mime_type.equals("video/avc") && codecProfileLevelLIZIZ != null) {
            this.m_codecFormat.setInteger("profile", codecProfileLevelLIZIZ.profile);
            int iLIZ = codecProfileLevelLIZIZ.level;
            if (VEConfigCenter.getInstance().getValue("ve_enable_adaptive_encode_level", false).booleanValue() || VEConfigCenter.getInstance().getValue("veabtest_aboffline_performance", false).booleanValue()) {
                iLIZ = C1284430jWr.LIZ(codecProfileLevelLIZIZ, this.m_width_align, this.m_height_align, this.m_frameRate, this.m_bitRate);
            }
            this.m_codecFormat.setInteger("level", iLIZ);
            int i3 = codecProfileLevelLIZIZ.profile;
            if (i3 != 2) {
                if (i3 != 8) {
                    C1284730jXL.LIZIZ("te_composition_video_hw_profile", "baseline");
                } else {
                    C2484209oO.LIZ("TEAvcEncoder", "Set High Profile");
                    this.m_bitRate = (int) (((double) this.m_maxBitRate) * this.m_dHpBitrateRatio);
                    C1284730jXL.LIZIZ("te_composition_video_hw_profile", "high");
                }
            } else {
                C2484209oO.LIZ("TEAvcEncoder", "Set Main Profile");
                this.m_bitRate = (int) (((double) this.m_maxBitRate) * this.m_dHpBitrateRatio);
                C1284730jXL.LIZIZ("te_composition_video_hw_profile", "main");
            }
            this.m_codecFormat.setInteger("bitrate", this.m_bitRate);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Set Profile for AVC: ");
            sbLIZ2.append(codecProfileLevelLIZIZ.profile);
            sbLIZ2.append(", Level = ");
            sbLIZ2.append(iLIZ);
            sbLIZ2.append(", maxLevel = ");
            sbLIZ2.append(codecProfileLevelLIZIZ.level);
            sbLIZ2.append("，m_bitRate = ");
            sbLIZ2.append(this.m_bitRate);
            C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            if (Build.VERSION.SDK_INT >= 27) {
                int i4 = codecProfileLevelLIZIZ.profile;
                if (i4 == 1 || i4 == 65536) {
                    z = false;
                }
                this.isSupportBFrame = z;
                return;
            }
            if (codecProfileLevelLIZIZ.profile == 1) {
                z = false;
            }
            this.isSupportBFrame = z;
            return;
        }
        if (this.m_mime_type.equals("video/mp4v-es")) {
            this.m_codecFormat.setInteger("profile", 1);
            this.m_codecFormat.setInteger("level", 1);
            this.m_codecFormat.setInteger("bitrate", this.m_bitRate * 2);
            this.isSupportBFrame = false;
            return;
        }
        if (!this.m_mime_type.equals("video/hevc") || codecProfileLevelLIZIZ == null) {
            return;
        }
        this.m_codecFormat.setInteger("profile", codecProfileLevelLIZIZ.profile);
        this.m_codecFormat.setInteger("level", codecProfileLevelLIZIZ.level);
        this.m_bitRate = (int) (((double) this.m_maxBitRate) * this.m_dHpBitrateRatio);
        if ((codecProfileLevelLIZIZ.profile & 89478485) != 0) {
            C1284730jXL.LIZIZ("te_composition_video_hw_profile", "main");
        } else {
            C1284730jXL.LIZIZ("te_composition_video_hw_profile", "high");
        }
        this.m_codecFormat.setInteger("bitrate", this.m_bitRate);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Set Profile for H E V C: ");
        sbLIZ3.append(codecProfileLevelLIZIZ.profile);
        sbLIZ3.append(", level = ");
        sbLIZ3.append(codecProfileLevelLIZIZ.level);
        sbLIZ3.append("，m_bitRate = ");
        sbLIZ3.append(this.m_bitRate);
        C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ3));
        this.isSupportBFrame = true;
    }

    private void setQpParameters(MediaCodecInfo mediaCodecInfo) {
        String value;
        boolean z;
        boolean z2;
        if (this.m_codecFormat != null) {
            String lowerCase = mediaCodecInfo.getName().toLowerCase();
            if (!this.mUseForRecorder || (value = VEConfigCenter.getInstance().getValue("ve_encoder_qp_range_for_recorder", "")) == null || value.isEmpty()) {
                value = VEConfigCenter.getInstance().getValue("ve_encoder_qp_range", "");
            }
            String value2 = VEConfigCenter.getInstance().getValue("ve_encoder_initial_qp", "");
            if (value != null && !value.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (value2 != null && !value2.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setQpParameters codecName:");
            sbLIZ.append(lowerCase);
            sbLIZ.append(", hasQpRangeJson:");
            sbLIZ.append(z);
            sbLIZ.append(", hasInitialQpJson:");
            sbLIZ.append(z2);
            sbLIZ.append(", useForRecorder:");
            sbLIZ.append(this.mUseForRecorder);
            C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                try {
                    JSONObject jSONObject = new JSONObject(value);
                    if (!lowerCase.contains(".qcom.") && !lowerCase.contains(".qti.")) {
                        if (!lowerCase.contains(".exynos.") && !lowerCase.contains(".sec.")) {
                            if (lowerCase.contains(".mtk.")) {
                                setQpRange(JSONObjectProtectorUtils.getJSONObject(jSONObject, "mtk"), "mtk");
                            } else if (lowerCase.contains(".hisi.")) {
                                setQpRange(JSONObjectProtectorUtils.getJSONObject(jSONObject, "hisi"), "hisi");
                            } else {
                                setQpRange(JSONObjectProtectorUtils.getJSONObject(jSONObject, "others"), "others");
                            }
                        } else {
                            setQpRange(JSONObjectProtectorUtils.getJSONObject(jSONObject, "exynos"), "exynos");
                        }
                    } else {
                        setQpRange(JSONObjectProtectorUtils.getJSONObject(jSONObject, "qcom"), "qcom");
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setQpParameters, qp range json str parse error : ");
                    sbLIZ2.append(e.getLocalizedMessage());
                    C2484209oO.LJIIIIZZ("TEAvcEncoder", C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ2), new C2484309oP[0]));
                }
            }
            if (z2) {
                try {
                    JSONObject jSONObject2 = new JSONObject(value2);
                    if (lowerCase.contains(".qcom.") || lowerCase.contains(".qti.")) {
                        JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "qcom");
                        int i = JSONObjectProtectorUtils.getInt(jSONObject3, "i");
                        int i2 = JSONObjectProtectorUtils.getInt(jSONObject3, "p");
                        int i3 = JSONObjectProtectorUtils.getInt(jSONObject3, "b");
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("parse initial QP, I:");
                        sbLIZ3.append(i);
                        sbLIZ3.append(" P:");
                        sbLIZ3.append(i2);
                        sbLIZ3.append(" B:");
                        sbLIZ3.append(i3);
                        C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ3));
                        if (i >= 1 && i <= 51) {
                            this.m_codecFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-i-enable", 1);
                            this.m_codecFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-i", i);
                        }
                        if (i2 >= 1 && i2 <= 51) {
                            this.m_codecFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-p-enable", 1);
                            this.m_codecFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-p", i2);
                        }
                        if (i3 >= 1 && i3 <= 51) {
                            this.m_codecFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-b-enable", 1);
                            this.m_codecFormat.setInteger("vendor.qti-ext-enc-initial-qp.qp-b", i3);
                        }
                    }
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("setQpParameters, initial qp json str parse error : ");
                    sbLIZ4.append(e2.getLocalizedMessage());
                    C2484209oO.LJIIIIZZ("TEAvcEncoder", C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ4), new C2484309oP[0]));
                }
            }
        }
    }

    public static void setSmartCodecPath(List<String> list) {
        mSmartCodecPathList.clear();
        if (list != null && !list.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("smartEncoder != null path1:");
            sbLIZ.append((String) ListProtector.get(list, 0));
            sbLIZ.append(" path2:");
            sbLIZ.append((String) ListProtector.get(list, 1));
            C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
            mSmartCodecPathList.addAll(list);
        }
    }

    public void enableEncodeBt601(boolean z) {
        this.mEnableEncodeBt601 = z;
    }

    public void enableOperatingRate(boolean z) {
        this.mEnableOperatingRate = z;
    }

    public void enableSmartEncoder(boolean z) {
        this.mEnableSmartEncoder = z;
    }

    public byte[] getCodecData(int i) {
        C1284460jWu c1284460jWu = this.m_lastCodecData;
        if (c1284460jWu != null) {
            return c1284460jWu.LIZ;
        }
        return null;
    }

    public void setUseForRecorder(boolean z) {
        this.mUseForRecorder = z;
    }

    private void addOutputData(byte[] bArr, MediaCodec.BufferInfo bufferInfo) {
        long jCeil;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("encode: pts queue size = ");
        sbLIZ.append(this.m_PTSQueue.size());
        sbLIZ.append(" avc sdata size= ");
        sbLIZ.append(this.AVCQueue.size());
        C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
        if (this.m_PTSQueue.size() <= 0 && this.m_profile >= 8) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("encode: no available pts!!! profile ");
            sbLIZ2.append(this.m_profile);
            C2484209oO.LJIIIIZZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (this.m_PTSQueue.size() <= 0) {
            C2484209oO.LJIIIIZZ("TEAvcEncoder", "encode: no available pts!!!");
            return;
        }
        C1284460jWu c1284460jWu = new C1284460jWu();
        long j = bufferInfo.presentationTimeUs;
        if (j <= 0) {
            j = 0;
        }
        if (VEConfigCenter.getInstance().getValue("ve_enable_opt_hwencode_dts", false).booleanValue()) {
            if (j == this.m_PTSQueue.poll().longValue()) {
                jCeil = j;
            } else {
                jCeil = (long) Math.ceil((this.m_lastDts + Math.min(r2, j)) / 2.0f);
                if (!this.m_bPrintExistBFrame) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("exist B frame, pts = ");
                    sbLIZ3.append(j);
                    sbLIZ3.append(", dts = ");
                    sbLIZ3.append(jCeil);
                    C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ3));
                    this.m_bPrintExistBFrame = true;
                }
            }
            this.m_lastDts = jCeil;
        } else {
            long jLongValue = this.m_PTSQueue.poll().longValue();
            if (this.isSupportBFrame) {
                jCeil = jLongValue - 200000;
            } else {
                jCeil = j;
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("isSupportBFrame:");
        sbLIZ4.append(this.isSupportBFrame);
        sbLIZ4.append(", dts = ");
        sbLIZ4.append(jCeil);
        sbLIZ4.append(", pts = ");
        sbLIZ4.append(j);
        sbLIZ4.append(" add codecdata-encode AVCQueue-size= ");
        sbLIZ4.append(this.AVCQueue.size());
        C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ4));
        c1284460jWu.LIZ = bArr;
        c1284460jWu.LIZIZ = j;
        c1284460jWu.LIZJ = jCeil;
        try {
            this.AVCQueue.add(c1284460jWu);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Add data to AVCQueue FAILED! Packet lost! ");
            sbLIZ5.append(e.getLocalizedMessage());
            C2484209oO.LIZJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    private int mergeBusinessQp(int i, int i2) {
        if (!this.mUseForRecorder && VEConfigCenter.getInstance().getValue("ve_enable_business_hw_encode_qp_range", false).booleanValue() && i2 != -1) {
            return i2;
        }
        return i;
    }

    private void reportErrorInfo(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errFunction", str);
            jSONObject.put("errMessage", str2);
            jSONObject.put("useForRecorder", String.valueOf(this.mUseForRecorder));
            b.LIZ("vesdk_event_hwencode_error", "behavior", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(str2);
            sbLIZ.append(", Exception ");
            sbLIZ.append(stringWriter);
            C2484209oO.LJIIIIZZ("TEAvcEncoder", C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ), new C2484309oP[0]));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setQpRange(org.json.JSONObject r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAvcEncoder.setQpRange(org.json.JSONObject, java.lang.String):void");
    }

    public static void setSmartCodecPath(List<String> list, float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("smartEncoder set path and vmaf, vmaf: f%");
        sbLIZ.append(f);
        C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
        mSmartCodecPathList.clear();
        if (list != null && !list.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("smartEncoder != null path1:");
            sbLIZ2.append((String) ListProtector.get(list, 0));
            sbLIZ2.append(" path2:");
            sbLIZ2.append((String) ListProtector.get(list, 1));
            C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            mSmartCodecPathList.addAll(list);
        }
        mVmaf = f;
    }

    private int videoSmartCodecProcess(long j, int i) {
        VideoSmartCodec videoSmartCodec = this.mSmartCodec;
        if (videoSmartCodec == null) {
            return -117;
        }
        if (videoSmartCodec.LIZJ(i, this.m_width_align, this.m_height_align, new float[]{1.0f}, (float) (j * 1.0E-6d), this.mEncodedFrameSizeSum, this.mEncodedFrameNum) < 0) {
            C2484209oO.LIZJ("TEAvcEncoder", "smartEncoder SmartCodecProcess failed");
            mSmartCodecPathList.clear();
            this.mSmartCodec.LIZLLL();
            this.mSmartCodec = null;
            return -117;
        }
        VideoSmartCodecResult videoSmartCodecResultLIZ = this.mSmartCodec.LIZ(this.mVideoSmartCodecResult);
        this.mVideoSmartCodecResult = videoSmartCodecResultLIZ;
        this.mSmartBitrate = videoSmartCodecResultLIZ.bitrate;
        this.mNeedIFrame = videoSmartCodecResultLIZ.needIFrame;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("smartEncoder smartBitrate: ");
        sbLIZ.append(this.mSmartBitrate);
        sbLIZ.append(", needIFrame: ");
        sbLIZ.append(this.mNeedIFrame);
        C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
        return 0;
    }

    public int getInfoByFlag(long[] jArr, int i) {
        if (i == 1) {
            C1284460jWu c1284460jWu = this.m_lastCodecData;
            jArr[0] = c1284460jWu.LIZIZ;
            jArr[1] = c1284460jWu.LIZJ;
            return 4;
        }
        return -1;
    }

    public void setBusinessQpRange(int i, int i2) {
        this.mBusinessQpMin = i;
        this.mBusinessQpMax = i2;
    }

    public static Bitmap convertTexToBitmap(int i, int i2, int i3) {
        ByteBuffer textureToByteBuffer = readTextureToByteBuffer(i, i2, i3);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(textureToByteBuffer);
        return bitmapCreateBitmap;
    }

    public static ByteBuffer readTextureToByteBuffer(int i, int i2, int i3) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(36006, iArr2, 0);
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2 * i3 * 4);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, byteBufferAllocate);
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        return byteBufferAllocate;
    }

    public int encodeVideoFromBuffer(int i, long j, boolean z, boolean z2) {
        int i2;
        int length = 0;
        if (!this.m_bSuccessInit) {
            return 0;
        }
        if (this.m_mediaCodec == null) {
            return -211;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HW_ENCODE encodeVideoFromBuffer start isSignalEndStream = ");
        sbLIZ.append(z);
        sbLIZ.append(", mEndOfStream = ");
        sbLIZ.append(this.mEndOfStream);
        sbLIZ.append(", size= ");
        sbLIZ.append(i);
        C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
        this.m_PTSQueue.offer(Long.valueOf(j));
        if (this.m_isNeedReconfigure || (this.m_configStatus & 4) != 0) {
            if (this.m_mediaCodec != null && this.m_configStatus == 1) {
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", this.m_bitRate);
                this.m_mediaCodec.setParameters(bundle);
                this.m_configStatus = 0;
            } else {
                restartEncoder();
            }
            this.m_isNeedReconfigure = false;
        }
        if (z2 && (VERuntime.getInstance().isTransitionKeyFrameEnable() || VERuntime.getInstance().getTransitionKeyFrameVersion() > -1)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("request-sync", 0);
            bundle2.putInt("video-bitrate", (int) (((double) this.m_bitRate) * this.m_TransitionKeyframeRatio));
            this.m_mediaCodec.setParameters(bundle2);
        }
        if (this.m_encodeStartTime == -1) {
            this.m_encodeStartTime = System.nanoTime();
        }
        int iDrainOutputBuffer = drainOutputBuffer(0L);
        if (iDrainOutputBuffer != 0) {
            return iDrainOutputBuffer;
        }
        if (!z) {
            C2484209oO.LIZ("TEAvcEncoder", "HW_ENCODE encodeYUV420");
            int iEncodeYUV420 = encodeYUV420(this.mByteBuf.array(), this.mByteBuf.arrayOffset(), i, j);
            if (iEncodeYUV420 != 0) {
                return iEncodeYUV420;
            }
        } else {
            if (this.AVCQueue.isEmpty()) {
                i2 = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            } else {
                i2 = 30;
            }
            while (!this.mEndOfStream) {
                C2484209oO.LJI("TEAvcEncoder", "HW_ENCODE signal flush() from buffer");
                try {
                    this.m_mediaCodec.queueInputBuffer(this.m_mediaCodec.dequeueInputBuffer(10000L), 0, 0, 0L, 4);
                    int iDrainOutputBuffer2 = drainOutputBuffer(10000L);
                    if (iDrainOutputBuffer2 != 0) {
                        return iDrainOutputBuffer2;
                    }
                    if (this.mBufferIndex >= 0 || i2 - 1 <= 0) {
                        break;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("encodeVideoFromBuffer, TER_MEDIA_CODEC_SIG_END_EXCEPTION, Exception ");
                    sbLIZ2.append(stringWriter);
                    String strLJ = C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ2), new C2484309oP[0]);
                    C2484209oO.LJIIIIZZ("TEAvcEncoder", strLJ);
                    reportErrorInfo("encodeVideoFromBuffer", strLJ);
                    return -213;
                }
            }
            if (!this.mEndOfStream && this.AVCQueue.isEmpty()) {
                C2484209oO.LIZJ("TEAvcEncoder", "encodeVideoFromBuffer - Timeout waiting for encoder finish!");
                return -211;
            }
        }
        C1284460jWu c1284460jWuPoll = this.AVCQueue.poll();
        this.m_lastCodecData = c1284460jWuPoll;
        if (c1284460jWuPoll != null) {
            length = c1284460jWuPoll.LIZ.length;
            this.mPicSendCount++;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("HW_ENCODE AVCQueue = ");
        sbLIZ3.append(this.AVCQueue.size());
        sbLIZ3.append(", mPicSendCount = ");
        sbLIZ3.append(this.mPicSendCount);
        sbLIZ3.append(", mPicBufferCount = ");
        sbLIZ3.append(this.mPicBufferCount);
        sbLIZ3.append(", mPicEncodeCount = ");
        sbLIZ3.append(this.mPicEncodeCount);
        C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ3));
        return length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (r14.AVCQueue.size() >= 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        r0 = 10000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        r0 = drainOutputBuffer(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r0 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int encodeYUV420(byte[] r15, int r16, int r17, long r18) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAvcEncoder.encodeYUV420(byte[], int, int, long):int");
    }

    public void setOESSrcFrameParams(int i, int i2, int i3, boolean z) {
        this.m_OesSrcRotation = i;
        this.m_OesSrcWidth = i2;
        this.m_OesSrcHeight = i3;
        this.m_OesFlipY = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Oes Width:");
        sbLIZ.append(this.m_OesSrcWidth);
        sbLIZ.append(" Height:");
        sbLIZ.append(this.m_OesSrcHeight);
        sbLIZ.append(" FlipY:");
        sbLIZ.append(this.m_OesFlipY);
        sbLIZ.append(" rotation:");
        sbLIZ.append(this.m_OesSrcRotation);
        C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
    }

    public int encodeVideoFromTexture(int i, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        TEMediaCodecDecoder tEMediaCodecDecoder;
        int iIntValue;
        int length;
        int i2;
        int iVideoSmartCodecInit;
        if (!this.m_bSuccessInit) {
            return 0;
        }
        if (this.mUseForRecorder && this.mRecorderEncodeFail) {
            return -223;
        }
        if (z4) {
            C2484209oO.LJI("TEAvcEncoder", "is skip record, stop timer");
            this.mSkipRecord = true;
            Handler handler = this.mHandler;
            if (handler != null) {
                this.mNeedStartRecordMonitor = handler.hasMessages(1);
                this.mHandler.removeCallbacksAndMessages(null);
            }
            return 0;
        }
        if (this.mSkipRecord) {
            C2484209oO.LJI("TEAvcEncoder", "no longer skip record, restart timer");
            this.mSkipRecord = false;
            if (this.mNeedStartRecordMonitor) {
                startupRecordMonitor();
                this.mNeedStartRecordMonitor = false;
            }
        }
        if (j != this.mLastFramePTS) {
            long j2 = this.mGOPSize;
            if (j2 <= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RequestSyncFrame: GOPSize incorrect! GOPSize=");
                sbLIZ.append(this.mGOPSize);
                C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
            } else if (this.mEncFrameCount % j2 == 0) {
                this.mLastKeyFramePTS = j;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("RequestSyncFrame: KeyFrame from PresetGOP size=");
                sbLIZ2.append(this.mGOPSize);
                sbLIZ2.append(" ClipFrameNo.=");
                sbLIZ2.append(this.mEncFrameCount);
                sbLIZ2.append(" TotalFrameCount=");
                sbLIZ2.append(this.mTotalFrameCount);
                sbLIZ2.append(" lastKeyFramePTS=");
                sbLIZ2.append(this.mLastKeyFramePTS);
                C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            }
            this.mEncFrameCount++;
            this.mTotalFrameCount++;
            this.mLastFramePTS = j;
        }
        int i3 = this.m_TransitionFrameCounter;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.m_TransitionFrameCounter = i4;
            if (i4 == 0) {
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", this.m_bitRate);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("RequestSyncFrame: Reset video_bitrate back to normal as ");
                sbLIZ3.append(this.m_bitRate);
                sbLIZ3.append(" PTS =");
                sbLIZ3.append(j);
                sbLIZ3.append(" ClipFrameNo.=");
                sbLIZ3.append(this.mEncFrameCount);
                sbLIZ3.append(" TotalFrameCount=");
                sbLIZ3.append(this.mTotalFrameCount);
                C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ3));
                this.m_mediaCodec.setParameters(bundle);
            }
        }
        int value = VEConfigCenter.getInstance().getValue("ve_hardware_encode_fallback", 0);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(" Hardware video encoder fallback mode =");
        sbLIZ4.append(value);
        C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ4));
        int i5 = C1284450jWt.LIZLLL;
        EnumC1284440jWs enumC1284440jWs = EnumC1284440jWs.VIDEO_ENC_ENCODING_FALLBACK;
        if (i5 != enumC1284440jWs.getValue() && value != enumC1284440jWs.getValue()) {
            if (Long.MIN_VALUE == this.mFirstFrameTimestamp) {
                this.mFirstFrameTimestamp = System.currentTimeMillis();
            }
            this.m_PTSQueue.offer(Long.valueOf(j));
            if (this.m_eglStateSaver == null) {
                C1284320jWg c1284320jWg = new C1284320jWg();
                this.m_eglStateSaver = c1284320jWg;
                c1284320jWg.LIZIZ();
            }
            if (this.m_isNeedReconfigure && this.isEnableHwEncoderOpt) {
                startEncoder();
            }
            if (this.m_isNeedReconfigure || (this.m_configStatus & 4) != 0) {
                if (this.m_mediaCodec != null && this.m_configStatus == 1) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("video-bitrate", this.m_bitRate);
                    this.m_mediaCodec.setParameters(bundle2);
                    z5 = false;
                    this.m_configStatus = 0;
                } else {
                    z5 = false;
                    if (!this.m_bEncoderBanExtraDataLoop) {
                        restartEncoder();
                    }
                }
                this.m_isNeedReconfigure = z5;
            }
            try {
                int iDrainOutputBuffer = drainOutputBuffer(0L);
                if (iDrainOutputBuffer != 0) {
                    return iDrainOutputBuffer;
                }
                if (z2 && (VERuntime.getInstance().isTransitionKeyFrameEnable() || VERuntime.getInstance().getTransitionKeyFrameVersion() > -1)) {
                    C2484209oO.LIZ("TEAvcEncoder", "RequestSyncFrame: TransitionKeyFrame Enabled");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Bundle bundle3 = new Bundle();
                    int i6 = (int) (((double) this.m_bitRate) * this.m_TransitionKeyframeRatio);
                    bundle3.putInt("video-bitrate", i6);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("RequestSyncFrame: Boost video_bitrate as ");
                    sbLIZ5.append(i6);
                    sbLIZ5.append(" mbitRate=");
                    sbLIZ5.append(this.m_bitRate);
                    sbLIZ5.append(" transitionRatio=");
                    sbLIZ5.append(this.m_TransitionKeyframeRatio);
                    sbLIZ5.append(" PTS =");
                    sbLIZ5.append(j);
                    sbLIZ5.append(" FrameNo.=");
                    sbLIZ5.append(this.mEncFrameCount);
                    sbLIZ5.append(" TotalFrameCount=");
                    sbLIZ5.append(this.mTotalFrameCount);
                    C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ5));
                    this.mEncFrameCount = 0L;
                    int transitionKeyFrameMode = VERuntime.getInstance().getTransitionKeyFrameMode();
                    if (transitionKeyFrameMode != 1) {
                        if (transitionKeyFrameMode != 2) {
                            C2484209oO.LIZ("TEAvcEncoder", "RequestSyncFrame_MODE0");
                            bundle3.putInt("request-sync", 0);
                        } else {
                            int transitionFrameCount = VERuntime.getInstance().getTransitionFrameCount();
                            this.m_TransitionFrameCounter = transitionFrameCount;
                            if (transitionFrameCount < 1) {
                                this.m_TransitionFrameCounter = 1;
                            }
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("RequestSyncFrame_MODE2: set transition frame count = ");
                            sbLIZ6.append(this.m_TransitionFrameCounter);
                            C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ6));
                        }
                    } else if (j - this.mLastKeyFramePTS < this.MINIMUM_KEY_FRAME_PTS_DISTANCE_IN_US) {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("RequestSyncFrame: KeyFrames too close. Skipped! CurrFramePTS = ");
                        sbLIZ7.append(j);
                        sbLIZ7.append(" LastKeyFramePTS=");
                        sbLIZ7.append(this.mLastKeyFramePTS);
                        sbLIZ7.append(" CurrFrameNo.=");
                        sbLIZ7.append(this.mTotalFrameCount);
                        C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ7));
                    } else {
                        this.mLastKeyFramePTS = j;
                        C2484209oO.LIZ("TEAvcEncoder", "RequestSyncFrame_MODE1");
                        if (cleanUpMediaCodec() == 0) {
                            C2484209oO.LIZ("TEAvcEncoder", " RequestSyncFrame Success");
                            bundle3.putInt("request-sync", 0);
                        } else {
                            C2484209oO.LIZJ("TEAvcEncoder", "RequestSyncFrame Fail");
                        }
                    }
                    this.m_mediaCodec.setParameters(bundle3);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("RequestSyncFrame:: pts = ");
                    sbLIZ8.append(j);
                    sbLIZ8.append(" isKeyFrame= ");
                    sbLIZ8.append(z2);
                    sbLIZ8.append(" bp_ratio ");
                    sbLIZ8.append(this.m_TransitionKeyframeRatio);
                    sbLIZ8.append("  SyncOnceTime=");
                    sbLIZ8.append(jCurrentTimeMillis2);
                    C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ8));
                }
                if (z3) {
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("isForceIFrame pts = ");
                    sbLIZ9.append(j);
                    sbLIZ9.append(" keyframe isKeyFrame= ");
                    sbLIZ9.append(z2);
                    sbLIZ9.append(" bp_ratio ");
                    sbLIZ9.append(this.m_TransitionKeyframeRatio);
                    C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ9));
                    forceToPrepareKeyFrame();
                }
                if (this.m_encodeStartTime == -1) {
                    this.m_encodeStartTime = System.nanoTime();
                }
                List<String> list = mSmartCodecPathList;
                if (list != null && !list.isEmpty() && this.mEnableSmartEncoder && !this.m_useHDR10Bit && this.m_streamID == 1) {
                    if (this.mSmartCodecInitNum == 0) {
                        iVideoSmartCodecInit = videoSmartCodecInit();
                    } else {
                        iVideoSmartCodecInit = 0;
                    }
                    if (this.mSmartCodec != null) {
                        int iVideoSmartCodecProcess = videoSmartCodecProcess(j, i);
                        if (iVideoSmartCodecProcess == 0) {
                            int i7 = this.mCurBitrate;
                            int i8 = (int) this.mSmartBitrate;
                            if (i7 != i8) {
                                this.mCurBitrate = i8;
                                Bundle bundle4 = new Bundle();
                                bundle4.putInt("video-bitrate", (int) this.mSmartBitrate);
                                this.m_mediaCodec.setParameters(bundle4);
                            }
                        } else {
                            Bundle bundle5 = new Bundle();
                            bundle5.putInt("video-bitrate", this.m_bitRate);
                            this.m_mediaCodec.setParameters(bundle5);
                            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                            sbLIZ10.append("smartEncode videoSmartCodecProcess failed！errorCode：");
                            sbLIZ10.append(iVideoSmartCodecProcess);
                            C2484209oO.LIZJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ10));
                        }
                    } else {
                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                        sbLIZ11.append("smartEncode videoSmartCodecInit failed！errorCode：");
                        sbLIZ11.append(iVideoSmartCodecInit);
                        C2484209oO.LIZJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ11));
                    }
                }
                try {
                    if (i != 0) {
                        try {
                            if (this.m_textureDrawer != null || this.m_textureOESDrawer != null) {
                                if ((!C1284450jWt.LIZ && !VEConfigCenter.getInstance().getValue("vesdk_use_agfxcontext", false).booleanValue()) || !EGL14.eglGetCurrentContext().equals(this.m_sharedContext.LIZ)) {
                                    this.m_sharedContext.LIZLLL();
                                }
                                GLES20.glViewport(0, 0, this.m_width, this.m_height);
                                if (this.m_bEncodeOESTexture) {
                                    if (this.mUseForRecorder) {
                                        this.m_textureOESDrawer.LJ(new RectF(0.0f, 0.0f, 1.0f, 1.0f));
                                        this.m_textureOESDrawer.LIZLLL(-this.m_OesSrcRotation, this.m_OesSrcWidth, this.m_OesSrcHeight, this.m_width, this.m_height, this.m_OesFlipY);
                                    } else {
                                        this.m_textureOESDrawer.LJ(this.m_MediaCodecDecInstance.getRenderParam().LIZ);
                                        this.m_textureOESDrawer.LIZLLL(-this.m_MediaCodecDecInstance.getRenderParam().LIZIZ, this.m_MediaCodecDecInstance.getRenderParam().LIZJ, this.m_MediaCodecDecInstance.getRenderParam().LIZLLL, this.m_width_align, this.m_height_align, true);
                                    }
                                    this.m_textureOESDrawer.LIZIZ(i);
                                } else {
                                    this.m_textureDrawer.LIZ(i);
                                }
                                if (this.mFirstFrame) {
                                    if (DEBUG) {
                                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(3686400);
                                        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                                        byteBufferAllocateDirect.position(0);
                                        GLES20.glReadPixels(0, 0, 1280, 720, 6408, 5121, byteBufferAllocateDirect);
                                    }
                                    this.mFirstFrame = false;
                                    startupRecordMonitor();
                                }
                                TESharedContext tESharedContext = this.m_sharedContext;
                                long j3 = 1000 * j;
                                EGLExt.eglPresentationTimeANDROID(tESharedContext.LIZJ, tESharedContext.LIZLLL, j3);
                                TESharedContext.LIZ("eglPresentationTimeANDROID");
                                if (this.m_bEncodeGLFinish) {
                                    GLES20.glFinish();
                                }
                                TESharedContext tESharedContext2 = this.m_sharedContext;
                                EGL14.eglSwapBuffers(tESharedContext2.LIZJ, tESharedContext2.LIZLLL);
                                this.m_bNeedSingalEnd = true;
                                this.mPicBufferCount++;
                                if (this.configByte != null && (tEMediaCodecDecoder = this.m_MediaCodecDecInstance) != null) {
                                    tEMediaCodecDecoder.signalReEncodeOptCV();
                                }
                                int iDrainOutputBuffer2 = drainOutputBuffer(0L);
                                if (iDrainOutputBuffer2 != 0) {
                                    return iDrainOutputBuffer2;
                                }
                                if (this.isEnableHwEncoderOpt && this.configByte == null && this.AVCQueue.size() >= 30) {
                                    C2484209oO.LIZJ("TEAvcEncoder", "get config fail, back to soft encode");
                                    return -211;
                                }
                                if (this.configByte == null && !this.m_bEncoderBanExtraDataLoop && !this.isEnableHwEncoderOpt) {
                                    int i9 = 0;
                                    do {
                                        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                        sbLIZ12.append("Encoder first frame, count = ");
                                        sbLIZ12.append(i9);
                                        C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ12));
                                        GLES20.glViewport(0, 0, this.m_width, this.m_height);
                                        if (this.m_bEncodeOESTexture) {
                                            if (this.mUseForRecorder) {
                                                this.m_textureOESDrawer.LJ(new RectF(0.0f, 0.0f, 1.0f, 1.0f));
                                                this.m_textureOESDrawer.LIZLLL(-this.m_OesSrcRotation, this.m_OesSrcWidth, this.m_OesSrcHeight, this.m_width, this.m_height, this.m_OesFlipY);
                                            } else {
                                                this.m_textureOESDrawer.LJ(this.m_MediaCodecDecInstance.getRenderParam().LIZ);
                                                this.m_textureOESDrawer.LIZLLL(-this.m_MediaCodecDecInstance.getRenderParam().LIZIZ, this.m_MediaCodecDecInstance.getRenderParam().LIZJ, this.m_MediaCodecDecInstance.getRenderParam().LIZLLL, this.m_width_align, this.m_height_align, true);
                                            }
                                            this.m_textureOESDrawer.LIZIZ(i);
                                        } else {
                                            this.m_textureDrawer.LIZ(i);
                                        }
                                        TESharedContext tESharedContext3 = this.m_sharedContext;
                                        EGLExt.eglPresentationTimeANDROID(tESharedContext3.LIZJ, tESharedContext3.LIZLLL, j3);
                                        TESharedContext.LIZ("eglPresentationTimeANDROID");
                                        GLES20.glFinish();
                                        TESharedContext tESharedContext4 = this.m_sharedContext;
                                        EGL14.eglSwapBuffers(tESharedContext4.LIZJ, tESharedContext4.LIZLLL);
                                        int iDrainOutputBuffer3 = drainOutputBuffer(0L);
                                        if (iDrainOutputBuffer3 == 0) {
                                            i9++;
                                            if (i9 > 30) {
                                                break;
                                            }
                                            Thread.sleep(10L, 0);
                                        } else {
                                            return iDrainOutputBuffer3;
                                        }
                                    } while (this.configByte == null);
                                    if (this.configByte == null) {
                                        C2484309oP[] c2484309oPArr = new C2484309oP[7];
                                        c2484309oPArr[0] = new C2484309oP(Integer.valueOf(this.AVCQueue.size()), "AVCQueue count");
                                        c2484309oPArr[1] = new C2484309oP(Integer.valueOf(i), "textureID");
                                        c2484309oPArr[2] = new C2484309oP(Boolean.valueOf(GLES20.glIsTexture(i)), "isTexture");
                                        c2484309oPArr[3] = new C2484309oP(Long.valueOf(j), "timestampUs");
                                        c2484309oPArr[4] = new C2484309oP(Integer.valueOf(GLES20.glGetError()), "glCheckError");
                                        c2484309oPArr[5] = new C2484309oP(Boolean.valueOf(this.m_bEncoderGLContextReuse), "m_bEncoderGLContextReuse");
                                        if (this.m_sharedContext.LIZ != null) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        c2484309oPArr[6] = new C2484309oP(Boolean.valueOf(z6), "currentContext");
                                        C2484209oO.LIZJ("TEAvcEncoder", C2484209oO.LJ("TEAvcEncoder", "TEAvcEncoder Generate configData failed!!!", c2484309oPArr));
                                        return -211;
                                    }
                                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                                    sbLIZ13.append("Generate configData succeed!!!");
                                    sbLIZ13.append(i9);
                                    C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ13));
                                    this.AVCQueue.clear();
                                    restartEncoder();
                                    this.m_getnerateIndex = 0L;
                                    this.m_sharedContext.LIZLLL();
                                    GLES20.glViewport(0, 0, this.m_width, this.m_height);
                                    if (this.m_bEncodeOESTexture) {
                                        if (this.mUseForRecorder) {
                                            this.m_textureOESDrawer.LJ(new RectF(0.0f, 0.0f, 1.0f, 1.0f));
                                            this.m_textureOESDrawer.LIZLLL(-this.m_OesSrcRotation, this.m_OesSrcWidth, this.m_OesSrcHeight, this.m_width, this.m_height, this.m_OesFlipY);
                                        } else {
                                            this.m_textureOESDrawer.LJ(this.m_MediaCodecDecInstance.getRenderParam().LIZ);
                                            this.m_textureOESDrawer.LIZLLL(-this.m_MediaCodecDecInstance.getRenderParam().LIZIZ, this.m_MediaCodecDecInstance.getRenderParam().LIZJ, this.m_MediaCodecDecInstance.getRenderParam().LIZLLL, this.m_width_align, this.m_height_align, true);
                                        }
                                        this.m_textureOESDrawer.LIZIZ(i);
                                    } else {
                                        this.m_textureDrawer.LIZ(i);
                                    }
                                    TESharedContext tESharedContext5 = this.m_sharedContext;
                                    EGLExt.eglPresentationTimeANDROID(tESharedContext5.LIZJ, tESharedContext5.LIZLLL, j3);
                                    TESharedContext.LIZ("eglPresentationTimeANDROID");
                                    GLES20.glFinish();
                                    TESharedContext tESharedContext6 = this.m_sharedContext;
                                    EGL14.eglSwapBuffers(tESharedContext6.LIZJ, tESharedContext6.LIZLLL);
                                    TEMediaCodecDecoder tEMediaCodecDecoder2 = this.m_MediaCodecDecInstance;
                                    if (tEMediaCodecDecoder2 != null) {
                                        tEMediaCodecDecoder2.signalReEncodeOptCV();
                                    }
                                    long j4 = this.mFirstFrameTimestamp;
                                    if (j4 > 0 && j4 != Long.MAX_VALUE) {
                                        long jCurrentTimeMillis3 = System.currentTimeMillis() - this.mFirstFrameTimestamp;
                                        this.mFirstFrameTimestamp = Long.MAX_VALUE;
                                        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                                        sbLIZ14.append("TE_RECORD_GEN_EXTRA_DATA_COST: ");
                                        sbLIZ14.append(jCurrentTimeMillis3);
                                        C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ14));
                                    }
                                }
                                if (VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", true).booleanValue() && this.m_getnerateIndex == 0) {
                                    TEMediaCodecResourceManager.sHWEncoderStateIsBeforeRunning = false;
                                }
                            }
                            this.m_getnerateIndex++;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringWriter stringWriter = new StringWriter();
                            e.printStackTrace(new PrintWriter(stringWriter));
                            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                            sbLIZ15.append("encodeVideoFromTexture, TER_MEDIA_CODEC_ENC_EXCEPTION, Exception ");
                            sbLIZ15.append(stringWriter);
                            String strLJ = C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ15), new C2484309oP[0]);
                            C2484209oO.LJIIIIZZ("TEAvcEncoder", strLJ);
                            reportErrorInfo("encodeVideoFromTexture", strLJ);
                            return -211;
                        }
                    } else if (this.m_mediaCodec != null && !this.m_bSignalEndOfStream && this.m_bNeedSingalEnd) {
                        try {
                            C2484209oO.LJI("TEAvcEncoder", "HW_ENCODE signal flush() from texture");
                            this.m_bSignalEndOfStream = true;
                            this.mEndOfStream = false;
                            this.m_mediaCodec.signalEndOfInputStream();
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            StringWriter stringWriter2 = new StringWriter();
                            e2.printStackTrace(new PrintWriter(stringWriter2));
                            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                            sbLIZ16.append("encodeVideoFromTexture, TER_MEDIA_CODEC_SIG_END_EXCEPTION Exception ");
                            sbLIZ16.append(stringWriter2);
                            String strLJ2 = C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ16), new C2484309oP[0]);
                            C2484209oO.LJIIIIZZ("TEAvcEncoder", strLJ2);
                            reportErrorInfo("encodeVideoFromTexture", strLJ2);
                            return -213;
                        }
                    }
                    if (!C1284450jWt.LIZ && !VEConfigCenter.getInstance().getValue("vesdk_use_agfxcontext", false).booleanValue()) {
                        this.m_eglStateSaver.LIZ();
                    }
                    if (this.m_bSignalEndOfStream) {
                        if (this.AVCQueue.isEmpty()) {
                            i2 = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                        } else {
                            i2 = 30;
                        }
                        while (!this.mEndOfStream) {
                            int iDrainOutputBuffer4 = drainOutputBuffer(10000L);
                            if (iDrainOutputBuffer4 != 0) {
                                return iDrainOutputBuffer4;
                            }
                            if (this.mBufferIndex >= 0 || i2 - 1 <= 0) {
                                break;
                            }
                        }
                        if (!this.mEndOfStream && this.AVCQueue.isEmpty()) {
                            C2484209oO.LIZJ("TEAvcEncoder", "encodeVideoFromTexture - Timeout waiting for encoder finish!");
                            return -211;
                        }
                    } else {
                        VEConfigCenter.ValuePkt value2 = VEConfigCenter.getInstance().getValue("byteVC1_10bit_hardware_encoder_timeout", VEConfigCenter.DataType.INTEGER, 10000);
                        if (value2 == null || value2.getValue() == null || !this.m_bByteVC110BitHWDecoder || (iIntValue = ((Integer) value2.getValue()).intValue()) <= 0) {
                            iIntValue = 0;
                        }
                        int iDrainOutputBuffer5 = drainOutputBuffer(iIntValue);
                        if (iDrainOutputBuffer5 != 0) {
                            return iDrainOutputBuffer5;
                        }
                        if (this.m_bEncoderBanExtraDataLoop || this.isEnableHwEncoderOpt) {
                            if (this.configByte == null) {
                                C2484209oO.LIZ("TEAvcEncoder", "Skip extra data looper.");
                                return 0;
                            }
                            long j5 = this.mFirstFrameTimestamp;
                            if (j5 > 0 && j5 != Long.MAX_VALUE) {
                                long jCurrentTimeMillis4 = System.currentTimeMillis() - this.mFirstFrameTimestamp;
                                this.mFirstFrameTimestamp = Long.MAX_VALUE;
                                StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                                sbLIZ17.append("TE_RECORD_GEN_EXTRA_DATA_COST: ");
                                sbLIZ17.append(jCurrentTimeMillis4);
                                C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ17));
                                int size = this.AVCQueue.size();
                                StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                                sbLIZ18.append("TE_RECORD_PACKET_COUNT_BEFORE_EXTRA_DATA: ");
                                sbLIZ18.append(size);
                                C2484209oO.LIZ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ18));
                            }
                        }
                    }
                    C1284460jWu c1284460jWuPoll = this.AVCQueue.poll();
                    this.m_lastCodecData = c1284460jWuPoll;
                    if (c1284460jWuPoll != null) {
                        length = c1284460jWuPoll.LIZ.length;
                        this.mPicSendCount++;
                    } else {
                        length = 0;
                    }
                    C2484209oO.LIZ("TEAvcEncoder", "HW_ENCODE AVCQueue = " + this.AVCQueue.size() + ", mPicSendCount = " + this.mPicSendCount + ", mPicBufferCount = " + this.mPicBufferCount + ", mPicEncodeCount = " + this.mPicEncodeCount);
                    return length;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                sbLIZ19.append("drainOutputBuffer exception:");
                sbLIZ19.append(e3.getMessage());
                C2484209oO.LIZJ("TEAvcEncoder", C2484209oO.LJ("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ19), new C2484309oP[0]));
                return -214;
            }
        }
        C2484209oO.LIZJ("TEAvcEncoder", "TESTING! HW VIDEO ENC ENCODING FALLBACK");
        return -211;
    }

    private void setEncoder(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, double d, int i9, int i10, int i11) {
        this.m_configStatus = 0;
        this.m_codec_type = i;
        VEVideoEncodeSettings.ENCODE_STANDARD encode_standard = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1;
        if (i == encode_standard.ordinal()) {
            this.m_mime_type = "video/hevc";
        } else if (i == VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_MPEG4.ordinal()) {
            this.m_mime_type = "video/mp4v-es";
        } else {
            this.m_mime_type = "video/avc";
        }
        if (i2 > 0) {
            this.m_width = i2;
            this.m_width_align = i2;
        }
        if (i3 > 0) {
            this.m_height = i3;
            this.m_height_align = i3;
        }
        Math.min(this.m_width_align, this.m_height_align);
        if (this.m_useInputSurface) {
            int i12 = this.m_width_align;
            int i13 = ENCODE_RESOLUTION_ALIGN;
            if (i12 % i13 != 0) {
                this.m_width_align = ((i12 / i13) + 1) * i13;
            }
            int i14 = this.m_height_align;
            if (i14 % i13 != 0) {
                this.m_height_align = ((i14 / i13) + 1) * i13;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Encoder set OutResolution align: ");
            sbLIZ.append(ENCODE_RESOLUTION_ALIGN);
            sbLIZ.append(", dstResolution: ");
            sbLIZ.append(this.m_width_align);
            sbLIZ.append("*");
            sbLIZ.append(this.m_height_align);
            sbLIZ.append(", srcResolution: ");
            sbLIZ.append(this.m_width);
            sbLIZ.append("*");
            sbLIZ.append(this.m_height);
            C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i4 > 0) {
            if (!VEConfigCenter.getInstance().getValue("veabtest_aboffline_performance", false).booleanValue() && VEConfigCenter.getInstance().getValue("ve_enable_limit_min_encode_fps", true).booleanValue() && i4 < MIN_FRAME_RATE) {
                C2484209oO.LJIIIIZZ("TEAvcEncoder", C786410Ut5.k4(Locale.getDefault(), "_frameRate:[%d] is too small, change to %d", new Object[]{Integer.valueOf(i4), Integer.valueOf(MIN_FRAME_RATE)}));
                i4 = MIN_FRAME_RATE;
            }
            if (i4 > MAX_FRAME_RATE) {
                C2484209oO.LJIIIIZZ("TEAvcEncoder", C786410Ut5.k4(Locale.getDefault(), "_frameRate:[%d] is too large, change to %d", new Object[]{Integer.valueOf(i4), Integer.valueOf(MAX_FRAME_RATE)}));
                i4 = MAX_FRAME_RATE;
            }
            if (this.m_frameRate != i4) {
                this.m_frameRate = i4;
                if (i4 < this.m_iFrameInternal) {
                    this.m_iFrameInternal = i4;
                }
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 2;
            }
        }
        if (i5 > 0) {
            this.m_maxBitRate = i5;
            if (this.m_bitRate != i5) {
                this.m_bitRate = i5;
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 1;
            }
        }
        if (i6 >= 0) {
            this.m_iFrameInternal = i6;
        }
        if (i7 > 0) {
            this.m_colorFormat = i7;
        }
        if (this.m_codec_type == encode_standard.ordinal()) {
            if (this.m_useHDR10Bit) {
                this.m_profile = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            } else {
                this.m_profile = 1;
            }
        } else {
            this.m_profile = C419990GdR.LIZIZ(i8, 1, 64);
        }
        this.m_dHpBitrateRatio = d;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setEncoder, m_mime_type = ");
        sbLIZ2.append(this.m_mime_type);
        sbLIZ2.append(", bitRate = ");
        sbLIZ2.append(this.m_bitRate);
        sbLIZ2.append(", maxBitRate = ");
        sbLIZ2.append(this.m_maxBitRate);
        sbLIZ2.append(", m_dHpBitrateRatio = ");
        sbLIZ2.append(this.m_dHpBitrateRatio);
        C2484209oO.LJI("TEAvcEncoder", C2188811AlT.LIZIZ(sbLIZ2));
        this.m_colorspace = i9;
        this.m_bColorRangeFull = i10;
        this.m_colorTrc = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2 A[Catch: JSONException -> 0x0112, TryCatch #0 {JSONException -> 0x0112, blocks: (B:26:0x00c2, B:28:0x00fa, B:24:0x00be), top: B:85:0x00be }] */
    /* JADX WARN: Type inference failed for: r0v2, types: [double] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int initEncoder(int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, double r32, boolean r34, int r35, int r36, int r37, double r38, int r40, boolean r41, boolean r42, int r43, int r44, boolean r45, boolean r46) {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAvcEncoder.initEncoder(int, int, int, int, int, int, int, int, double, boolean, int, int, int, double, int, boolean, boolean, int, int, boolean, boolean):int");
    }
}
