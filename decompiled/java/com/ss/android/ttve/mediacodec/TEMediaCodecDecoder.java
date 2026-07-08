package com.ss.android.ttve.mediacodec;

import X.C0VSJ;
import X.C0VSV;
import X.C1283290jV1;
import X.C1284320jWg;
import X.C1284330jWh;
import X.C1284350jWj;
import X.C2188811AlT;
import X.C2280341ENk;
import X.C2484209oO;
import X.C2484309oP;
import X.C786410Ut5;
import X.EnumC1284340jWi;
import X.EnumC2185621AgK;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Range;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ttve.common.TEImageUtils;
import com.ss.android.ttve.common.TESharedContext;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VEConfigCenter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class TEMediaCodecDecoder implements SurfaceTexture.OnFrameAvailableListener, ImageReader.OnImageAvailableListener {
    public static int file_count = 0;
    public static int sDequeueOutputTimeoutUs = 10000;
    public static int sPendingInputBufferThreshold = 5;
    public boolean mIs10bit;
    public Handler m_MediaCodechandler;
    public int m_bGlobalDecoderPoolOption;
    public boolean m_bNeedConfigure;
    public boolean m_bUseImageReader;
    public ByteBuffer m_codecSpecificData;
    public ByteBuffer m_extraDataBuf;
    public MediaFormat m_format;
    public int m_iFps;
    public int m_iHeight;
    public int m_iOutputHeight;
    public int m_iOutputWidth;
    public int m_iRotateDegree;
    public int m_iWidth;
    public long m_nativeHandler;
    public Surface m_surface;
    public SurfaceTexture m_surfaceTexture;
    public static Object mCodecListLock = new Object();
    public static ArrayList<MediaCodecInfo> mVideoHWDecoderCodecs = new ArrayList<>();
    public static boolean mIsByteVC1Blocklist = false;
    public static boolean m_useCreateDecoderByName = true;
    public static volatile boolean sDequeueHWDecodeInputBufferOpt = true;
    public static boolean sHWDecodeSupportRtAndOr = false;
    public String VIDEO_MIME_TYPE = "video/avc";
    public int m_iCodecID = 28;
    public int[] m_surfaceTexID = new int[1];
    public int m_pageMode = -1;
    public MediaCodec.BufferInfo m_bufferInfo = new MediaCodec.BufferInfo();
    public volatile MediaCodec m_decoder = null;
    public volatile boolean m_decoderStarted = false;
    public final Object m_frameSyncObject = new Object();
    public boolean m_frameAvailable = false;
    public volatile long m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
    public volatile long m_timestampOfCurTexFrame = Long.MIN_VALUE;
    public volatile boolean m_inputBufferQueued = false;
    public volatile int m_pendingInputFrameCount = 0;
    public volatile boolean m_sawInputEOS = false;
    public volatile boolean m_sawOutputEOS = false;
    public C1283290jV1 m_textureRender = null;
    public TESharedContext m_sharedContext = null;
    public C1284320jWg m_eglStateSaver = null;
    public HandlerThread m_handleThread = new HandlerThread("VE-MediaCodecHandler");
    public HandlerThread mReaderHandlerThread = null;
    public ImageReader mImageReader = null;
    public Image mImage = null;
    public VEFrame mConvertFrame = null;
    public VEFrame mScaleFrame = null;
    public final long MAX_SLEEP_MS = 0;
    public final int MAX_DELAY_COUNT = 10;
    public int m_iCurCount = 0;
    public boolean m_needSendPacketAgain = false;
    public volatile boolean m_awaitNewImageSuccess = false;
    public int m_indexOfOutputBuffer = -1;
    public volatile boolean m_bReEnableOpt = false;
    public ConditionVariable m_ReEncodeOptCV = new ConditionVariable(true);
    public C1284330jWh m_renderParam = new C1284330jWh();
    public int mMinCompressionRatio = 1;
    public boolean m_bHWOverload = false;
    public final float Max_Playback_Speed = 4.0f;
    public final float Normal_Video_Fps = 30.0f;

    public static boolean codecNeedsFlushWorkaround(String str) {
        return false;
    }

    private boolean isHarmonyOS() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean isSupportByteVC10bit() {
        return isSupportFormat("video/hevc", 2, 16384);
    }

    private native boolean nativeOnFrameAvailable(long j, ByteBuffer byteBuffer, int i);

    public static void setHWDecodeBoolConfigFromNative(String str, boolean z) {
    }

    public static void setHWDecodeIntConfigFromNative(String str, int i) {
    }

    private boolean IsValid() {
        return this.m_decoder != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0252 A[PHI: r12
      0x0252: PHI (r12v2 int) = (r12v1 int), (r12v4 int) binds: [B:89:0x0249, B:86:0x0244] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0285 A[Catch: JSONException -> 0x0295, Exception -> 0x02d4, TryCatch #0 {JSONException -> 0x0295, blocks: (B:54:0x0188, B:84:0x0226, B:85:0x0230, B:91:0x0253, B:93:0x0285, B:95:0x028f, B:89:0x0249), top: B:108:0x0188, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int configureMediaFormat() {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.configureMediaFormat():int");
    }

    private int createTexture() {
        GLES20.glGenTextures(1, this.m_surfaceTexID, 0);
        int i = this.m_surfaceTexID[0];
        if (i <= 0) {
            C2484209oO.LIZJ("TEMediaCodecDecoder", "createTexture failed");
            return 0;
        }
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return this.m_surfaceTexID[0];
    }

    private void deleteTexture() {
        int[] iArr = this.m_surfaceTexID;
        if (iArr[0] != 0) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.m_surfaceTexID[0] = 0;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:32|8|(9:10|(0)|15|30|17|28|18|23|24)(1:16)|14|15|30|17|28|18|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C2484209oO.LIZJ("TEMediaCodecDecoder", "call ApplogUtils.onEvent method err " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d6, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C2484209oO.LIZJ("TEMediaCodecDecoder", "report maxBlocksSizePerSecond json err " + r0.getMessage());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getMaxBlocksSizePerSecond() {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.getMaxBlocksSizePerSecond():int");
    }

    public static int getMaxMediaCodecVideoDecoderCount() {
        MediaCodecInfo mediaCodecInfo21 = getMediaCodecInfo21("video/avc");
        if (mediaCodecInfo21 == null) {
            C2484209oO.LIZJ("TEMediaCodecDecoder", "MediaCodecInfo is null!");
            return -2;
        }
        int maxSupportedInstances = mediaCodecInfo21.getCapabilitiesForType("video/avc").getMaxSupportedInstances();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMaxMediaCodecVideoDecoderCount ");
        sbLIZ.append(maxSupportedInstances);
        C2484209oO.LJI("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ));
        return maxSupportedInstances;
    }

    private boolean isHisiByteVC1BlockList() {
        String property = getProperty("ro.board.platform", null);
        if (Build.VERSION.SDK_INT != 26 || property == null) {
            return false;
        }
        if (!property.startsWith("kirin960") && !property.startsWith("hi3660")) {
            return false;
        }
        try {
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return CastDoubleProtector.parseDouble(getProperty("ro.config.hw_codec_support", "0.0")) < 0.18041d;
    }

    private boolean isMtkByteVC1BlockList() {
        String lowerCase = Build.HARDWARE.toLowerCase(Locale.US);
        return lowerCase.startsWith("mt6763") || lowerCase.startsWith("mt6757") || lowerCase.startsWith("mt6739") || lowerCase.startsWith("mt6750");
    }

    private void onImageFrameAvailable() {
        VEFrame vEFrameCreateYUVPlanFrame;
        if (this.mImage.getFormat() != 35) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("image format: ");
            sbLIZ.append(this.mImage.getFormat());
            C2484209oO.LIZJ("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        int width = this.mImage.getWidth();
        int height = this.mImage.getHeight();
        if (this.mImage.getPlanes() == null || this.mImage.getPlanes()[1].getPixelStride() <= 1) {
            vEFrameCreateYUVPlanFrame = VEFrame.createYUVPlanFrame(new C1284350jWj(this.mImage.getPlanes()), width, height, 0, 0L, EnumC2185621AgK.TEPixFmt_YUV420P);
        } else {
            VEFrame vEFrameCreateYUVPlanFrame2 = VEFrame.createYUVPlanFrame(new C1284350jWj(this.mImage.getPlanes()), width, height, 0, 0L, EnumC2185621AgK.TEPixFmt_NV12);
            if (this.mConvertFrame == null) {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((width * height) * 3) / 2);
                byteBufferAllocateDirect.clear();
                this.mConvertFrame = VEFrame.createByteBufferFrame(byteBufferAllocateDirect, width, height, 0, 0L, EnumC2185621AgK.TEPixFmt_YUV420P);
            }
            TEImageUtils.LIZ(vEFrameCreateYUVPlanFrame2, this.mConvertFrame, EnumC1284340jWi.OP_CONVERT);
            vEFrameCreateYUVPlanFrame = this.mConvertFrame;
        }
        if (width == this.m_iOutputWidth && height == this.m_iOutputHeight && (vEFrameCreateYUVPlanFrame.getFrame() instanceof VEFrame.ByteBufferFrame)) {
            ByteBuffer byteBuffer = ((VEFrame.ByteBufferFrame) vEFrameCreateYUVPlanFrame.getFrame()).getByteBuffer();
            nativeOnFrameAvailable(this.m_nativeHandler, byteBuffer, byteBuffer.remaining());
            return;
        }
        if (this.mScaleFrame == null) {
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(((this.m_iOutputWidth * this.m_iOutputHeight) * 3) / 2);
            byteBufferAllocateDirect2.clear();
            this.mScaleFrame = VEFrame.createByteBufferFrame(byteBufferAllocateDirect2, this.m_iOutputWidth, this.m_iOutputHeight, 0, 0L, EnumC2185621AgK.TEPixFmt_YUV420P);
        }
        if (this.m_iWidth == this.m_iOutputWidth && this.m_iHeight == this.m_iOutputHeight) {
            TEImageUtils.LIZ(vEFrameCreateYUVPlanFrame, this.mScaleFrame, EnumC1284340jWi.OP_COPY);
        } else {
            TEImageUtils.LIZ(vEFrameCreateYUVPlanFrame, this.mScaleFrame, EnumC1284340jWi.OP_SCALE);
        }
        ByteBuffer byteBuffer2 = ((VEFrame.ByteBufferFrame) this.mScaleFrame.getFrame()).getByteBuffer();
        nativeOnFrameAvailable(this.m_nativeHandler, byteBuffer2, byteBuffer2.remaining());
    }

    public int closeDecoder() {
        C2484209oO.LJIIIIZZ("TEMediaCodecDecoder", "closeHwDecoder");
        stopDecoder();
        deleteTexture();
        return 0;
    }

    public int getOESTexture() {
        return this.m_surfaceTexID[0];
    }

    public void signalReEncodeOptCV() {
        if (this.m_bReEnableOpt) {
            this.m_ReEncodeOptCV.open();
            C2484209oO.LIZ("TEMediaCodecDecoder", "signalReEncodeOptCV...");
        }
    }

    private int restartDecoder() {
        stopDecoder();
        return startDecoder();
    }

    private int startDecoder() {
        int iCreateTexture;
        if (IsValid()) {
            C2484209oO.LIZJ("TEMediaCodecDecoder", "You can't call startDecoder() twice!");
            return -1;
        }
        if (this.m_bUseImageReader) {
            iCreateTexture = 0;
        } else {
            iCreateTexture = this.m_surfaceTexID[0];
            if (iCreateTexture == 0 && (iCreateTexture = createTexture()) == 0) {
                return -1;
            }
        }
        try {
            if (!this.m_bUseImageReader) {
                this.m_surfaceTexture = new SurfaceTexture(iCreateTexture);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Surface texture with texture (id=");
                sbLIZ.append(iCreateTexture);
                sbLIZ.append(") has been created.");
                C2484209oO.LJI("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.m_handleThread.start();
            BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(this.m_handleThread));
            this.m_MediaCodechandler = bPEAHandler;
            if (this.m_bUseImageReader) {
                this.mReaderHandlerThread = new HandlerThread("VE-ImageReaderHandler");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getVideoFramesHW: mReaderHandlerThread = ");
                sbLIZ2.append(this.mReaderHandlerThread.getThreadId());
                C2484209oO.LJI("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                this.mReaderHandlerThread.start();
                BPEAHandler bPEAHandler2 = new BPEAHandler(C786410Ut5.W2(this.mReaderHandlerThread));
                ImageReader imageReaderNewInstance = ImageReader.newInstance(this.m_iWidth, this.m_iHeight, 35, 2);
                this.mImageReader = imageReaderNewInstance;
                imageReaderNewInstance.setOnImageAvailableListener(this, bPEAHandler2);
            } else {
                this.m_surfaceTexture.setOnFrameAvailableListener(this, bPEAHandler);
                this.m_surface = new Surface(this.m_surfaceTexture);
            }
            if (!this.m_bUseImageReader) {
                C1283290jV1 c1283290jV1 = new C1283290jV1(this.m_surfaceTexture);
                this.m_textureRender = c1283290jV1;
                C1284320jWg c1284320jWg = this.m_eglStateSaver;
                if (c1284320jWg != null) {
                    c1283290jV1.LJIILJJIL = c1284320jWg.LJ;
                }
                if (!VEConfigCenter.getInstance().getValue("ve_enable_opt_hwdecode_moire", false).booleanValue() || c1283290jV1.LJIILJJIL < 3) {
                    c1283290jV1.LJ = C1283290jV1.LIZ("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                } else {
                    c1283290jV1.LJ = C1283290jV1.LIZ("#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 uTexelScale;\nuniform vec2 uTexelSrc;\nuniform samplerExternalOES sTexture;\nvec4 texture2DArea(vec2 coord)\n    {\n        vec4 color = vec4(0.0);\n        vec2 p = max(coord * uTexelSrc - 0.5, 0.0);\n        vec2 q = min(p + uTexelScale, uTexelSrc);\n        vec2 r = 1.0 / uTexelSrc;\n        vec2 r2 = r * 0.5;\n        vec2 s = ceil(p);\n        vec2 t = floor(q);\n        vec2 c0 = s - p;\n        vec2 c1 = q - t;\n        float e = 1.5e-2;\n        if (c0.y > e)\n        {\n            vec4 c = vec4(0.0);\n            if (c0.x > e)\n                c += texture2D(sTexture, (s - 1.0) * r + r2) * c0.x;\n            for (float x = s.x; x < t.x; x += 1.0)\n                c += texture2D(sTexture, vec2(x, s.y - 1.0) * r + r2);\n            if (c1.x > e)\n                c += texture2D(sTexture, vec2(t.x, s.y - 1.0) * r + r2) * c1.x;\n            color += c * c0.y;\n        }\n        for (float y = s.y; y < t.y; y += 1.0)\n        {\n            if (c0.x > e)\n                color += texture2D(sTexture, vec2(s.x - 1.0, y) * r + r2) * c0.x;\n            for (float x = s.x; x < t.x; x += 1.0)\n                color += texture2D(sTexture, vec2(x, y) * r + r2);\n            if (c1.x > e)\n                color += texture2D(sTexture, vec2(t.x, y) * r + r2) * c1.x;\n        }\n        if (c1.y > e)\n        {\n            vec4 c = vec4(0.0);\n            if (c0.x > e)\n                c += texture2D(sTexture, vec2(s.x - 1.0, t.y) * r + r2) * c0.x;\n            for (float x = s.x; x < t.x; x += 1.0)\n                c += texture2D(sTexture, vec2(x, t.y) * r + r2);\n            if (c1.x > e)\n                c += texture2D(sTexture, t * r + r2) * c1.x;\n            color += c * c1.y;\n        }\n        return clamp(color / (uTexelScale.x * uTexelScale.y), 0.0, 1.0);\n    }\nvoid main() {\n  if (uTexelScale.x >= 2.0)\n  {\n     gl_FragColor = texture2DArea(vTextureCoord);\n  } else {\n     gl_FragColor = texture2D(sTexture, vTextureCoord);\n  }\n}\n");
                }
                if (c1283290jV1.LJ == 0) {
                    C2484209oO.LIZJ("TEMediaCodecDecoder", "failed create program");
                }
                int iGlGetAttribLocation = GLES20.glGetAttribLocation(c1283290jV1.LJ, "aPosition");
                c1283290jV1.LJII = iGlGetAttribLocation;
                if (iGlGetAttribLocation == -1) {
                    C2484209oO.LIZJ("TEMediaCodecDecoder", "Could not get attrib location for aPosition");
                }
                int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(c1283290jV1.LJ, "aTextureCoord");
                c1283290jV1.LJIIIIZZ = iGlGetAttribLocation2;
                if (iGlGetAttribLocation2 == -1) {
                    C2484209oO.LIZJ("TEMediaCodecDecoder", "Could not get attrib location for aTextureCoord");
                }
                int iGlGetUniformLocation = GLES20.glGetUniformLocation(c1283290jV1.LJ, "uMVPMatrix");
                c1283290jV1.LJFF = iGlGetUniformLocation;
                if (iGlGetUniformLocation == -1) {
                    C2484209oO.LIZJ("TEMediaCodecDecoder", "Could not get attrib location for uMVPMatrix");
                }
                c1283290jV1.LJI = GLES20.glGetUniformLocation(c1283290jV1.LJ, "uSTMatrix");
                C2484209oO.LIZ("TEMediaCodecDecoder", "glGetUniformLocation uSTMatrix");
                if (c1283290jV1.LJI == -1) {
                    C2484209oO.LJIIIIZZ("TEMediaCodecDecoder", "Could not get attrib location for uSTMatrix");
                }
                if (VEConfigCenter.getInstance().getValue("ve_enable_opt_hwdecode_moire", false).booleanValue() && c1283290jV1.LJIILJJIL >= 3) {
                    int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(c1283290jV1.LJ, "uTexelScale");
                    c1283290jV1.LJIIJ = iGlGetUniformLocation2;
                    if (iGlGetUniformLocation2 == -1) {
                        C2484209oO.LIZJ("TEMediaCodecDecoder", "Could not get uniform location for uTexelScale");
                    }
                    c1283290jV1.LJIIIZ = GLES20.glGetUniformLocation(c1283290jV1.LJ, "uTexelSrc");
                    if (c1283290jV1.LJIIJ == -1) {
                        C2484209oO.LIZJ("TEMediaCodecDecoder", "Could not get uniform location for uTexelSrc");
                    }
                    c1283290jV1.LJIIIZ = GLES20.glGetUniformLocation(c1283290jV1.LJ, "uTexelSrc");
                    if (c1283290jV1.LJIIJ == -1) {
                        C2484209oO.LIZJ("TEMediaCodecDecoder", "Could not get uniform location for uTexelSrc");
                    }
                }
                GLES20.glGenFramebuffers(1, c1283290jV1.LJIIJJI, 0);
                C2484209oO.LIZ("TEMediaCodecDecoder", "glGenFramebuffers");
            }
            if (setupDecoder(this.VIDEO_MIME_TYPE)) {
                return 0;
            }
            stopDecoder();
            if (this.m_bHWOverload) {
                this.m_bHWOverload = false;
                if (VEConfigCenter.getInstance().getValue("ve_enable_video_reader_hw_overload_fallback_opt", false).booleanValue()) {
                    return -104;
                }
            }
            return -1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("");
            sbLIZ3.append(e.getMessage());
            C2484209oO.LIZJ("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ3));
            stopDecoder();
            return -1;
        }
    }

    private int stopDecoder() {
        cleanupDecoder();
        this.m_handleThread.quit();
        HandlerThread handlerThread = this.mReaderHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mReaderHandlerThread = null;
        }
        C1283290jV1 c1283290jV1 = this.m_textureRender;
        if (c1283290jV1 != null) {
            synchronized (c1283290jV1) {
                int i = c1283290jV1.LJ;
                if (i != 0) {
                    GLES20.glDeleteProgram(i);
                    c1283290jV1.LJ = 0;
                }
                int[] iArr = c1283290jV1.LJIIJJI;
                if (iArr[0] != 0) {
                    GLES20.glDeleteFramebuffers(1, iArr, 0);
                }
            }
            this.m_textureRender = null;
        }
        Surface surface = this.m_surface;
        if (surface != null) {
            surface.release();
            this.m_surface = null;
        }
        SurfaceTexture surfaceTexture = this.m_surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            this.m_surfaceTexture.release();
            this.m_surfaceTexture = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopDecoder, this: ");
        sbLIZ.append(this);
        C2484209oO.LJI("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ));
        return 0;
    }

    public void cleanupDecoder() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cleanupDecoder, this: ");
        sbLIZ.append(this);
        C2484209oO.LJI("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ));
        if (this.m_decoder != null) {
            if (this.m_decoderStarted) {
                try {
                    if (this.m_inputBufferQueued) {
                        this.m_decoder.flush();
                        this.m_inputBufferQueued = false;
                    }
                    this.m_decoder.stop();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cleanup decode failed: ");
                    sbLIZ2.append(th.getMessage());
                    C2484209oO.LIZJ("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ2));
                }
                this.m_decoderStarted = false;
            }
            try {
                this.m_decoder.release();
            } finally {
                try {
                } catch (Throwable th2) {
                }
            }
            this.m_decoder = null;
            this.m_iRotateDegree = 0;
        }
        if (VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", false).booleanValue()) {
            TEMediaCodecResourceManager.freeCodecBlocksSize(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode());
        }
        this.m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
        this.m_timestampOfCurTexFrame = Long.MIN_VALUE;
        this.m_pendingInputFrameCount = 0;
        this.m_sawInputEOS = false;
        this.m_sawOutputEOS = false;
    }

    private boolean isNeedSendPacketAgain() {
        return this.m_needSendPacketAgain;
    }

    public C1284330jWh getRenderParam() {
        return this.m_renderParam;
    }

    private boolean AwaitNewImage(int i) {
        synchronized (this.m_frameSyncObject) {
            while (!this.m_frameAvailable) {
                try {
                    try {
                        this.m_frameSyncObject.wait(i);
                        if (!this.m_frameAvailable) {
                            return false;
                        }
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.m_frameAvailable = false;
            return true;
        }
    }

    private ByteBuffer getInputBufferByIdx(int i) {
        return this.m_decoder.getInputBuffer(i);
    }

    public static MediaCodecInfo getMediaCodecInfo(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    for (String str2 : codecInfoAt.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            return codecInfoAt;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static MediaCodecInfo getMediaCodecInfo21(String str) {
        try {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            if (codecInfos != null && codecInfos.length != 0) {
                for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                    if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                        String name = mediaCodecInfo.getName();
                        if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                            for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                                if (str2.equalsIgnoreCase(str)) {
                                    return mediaCodecInfo;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    private boolean isSupportSize(MediaCodecInfo mediaCodecInfo) {
        Range<Integer> range;
        int i;
        if (mediaCodecInfo == null) {
            return false;
        }
        Range<Integer> supportedWidths = mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).getVideoCapabilities().getSupportedWidths();
        Range<Integer> supportedHeights = mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).getVideoCapabilities().getSupportedHeights();
        if (((Integer) supportedWidths.getUpper()).intValue() < ((Integer) supportedHeights.getUpper()).intValue()) {
            range = supportedWidths;
        } else {
            range = supportedHeights;
        }
        if (((Integer) supportedWidths.getUpper()).intValue() <= ((Integer) supportedHeights.getUpper()).intValue()) {
            supportedWidths = supportedHeights;
        }
        int i2 = this.m_iWidth;
        int i3 = this.m_iHeight;
        if (i2 < i3) {
            i = i2;
        } else {
            i = i3;
        }
        if (i2 <= i3) {
            i2 = i3;
        }
        if (!range.contains(Integer.valueOf(i)) || !supportedWidths.contains(Integer.valueOf(i2))) {
            return false;
        }
        return true;
    }

    private void setProcessFlag(int i) {
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        this.m_bReEnableOpt = z;
    }

    private void setRenderParam(int i) {
        this.m_renderParam.LIZIZ = i;
    }

    private boolean setupDecoder(String str) {
        boolean z = true;
        if (VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", false).booleanValue() && !TEMediaCodecResourceManager.tryUseCodecBlocksSize(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            C2484209oO.LJIIIIZZ("TEMediaCodecDecoder", C2484209oO.LJ("TEMediaCodecDecoder", "setupDecoder ERROR_HW_OVERLOAD", new C2484309oP(Integer.valueOf(TEMediaCodecResourceManager.getMaxCodecBlocksSize()), "MaxCodecBlocksSize is"), new C2484309oP(Integer.valueOf(TEMediaCodecResourceManager.getUsedCodecBlocksSize()), "UsedCodecBlocksSize is")));
            if (TEMediaCodecResourceManager.sHWEncoderStateIsBeforeRunning) {
                C2484209oO.LJI("TEMediaCodecDecoder", "guarantee HWEncoder strategy");
                return false;
            }
        }
        try {
            if (!m_useCreateDecoderByName) {
                this.m_decoder = MediaCodec.createDecoderByType(str);
            } else {
                String bestCodecName = getBestCodecName(str);
                this.m_decoder = MediaCodec.createByCodecName(bestCodecName);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setupDecoder, codecName = ");
                sbLIZ.append(bestCodecName);
                C2484209oO.LJI("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sb = new StringBuilder("setupDecoder, m_useCreateDecoderByName = ");
            sb.append(m_useCreateDecoderByName);
            sb.append(", surface: ");
            Object obj = this.m_surface;
            if (obj == null) {
                obj = "null";
            }
            sb.append(obj);
            C2484209oO.LJI("TEMediaCodecDecoder", sb.toString());
            if (this.m_surface != null) {
                this.m_decoder.configure(this.m_format, this.m_surface, (MediaCrypto) null, 0);
            } else {
                this.m_decoder.configure(this.m_format, this.mImageReader.getSurface(), (MediaCrypto) null, 0);
            }
            this.m_decoder.start();
            this.m_decoderStarted = true;
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            sbLIZ2.append(e.getMessage());
            C2484209oO.LIZJ("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ2));
            if (e.getMessage() == null || !e.getMessage().contains("0xffffec77")) {
                z = false;
            }
            this.m_bHWOverload = z;
            cleanupDecoder();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: Exception -> 0x0065, TryCatch #0 {Exception -> 0x0065, blocks: (B:6:0x000a, B:8:0x000e, B:10:0x0012, B:14:0x001f, B:15:0x0025, B:18:0x002b, B:19:0x0037, B:21:0x0050, B:22:0x005f), top: B:28:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int flushDecoder(boolean r6) {
        /*
            r5 = this;
            android.media.MediaCodec r0 = r5.m_decoder
            r4 = -3
            if (r0 == 0) goto L6b
            java.lang.String r2 = "TEMediaCodecDecoder"
            r3 = 0
            if (r6 == 0) goto L25
            boolean r0 = r5.m_sawInputEOS     // Catch: java.lang.Exception -> L65
            if (r0 != 0) goto L12
            boolean r0 = r5.m_sawOutputEOS     // Catch: java.lang.Exception -> L65
            if (r0 == 0) goto L25
        L12:
            r5.cleanupDecoder()     // Catch: java.lang.Exception -> L65
            java.lang.String r0 = r5.VIDEO_MIME_TYPE     // Catch: java.lang.Exception -> L65
            boolean r0 = r5.setupDecoder(r0)     // Catch: java.lang.Exception -> L65
            if (r0 != 0) goto L1f
            r4 = -2
            return r4
        L1f:
            java.lang.String r0 = "Decoder has been recreated."
            X.C2484209oO.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> L65
            goto L6a
        L25:
            boolean r0 = r5.m_inputBufferQueued     // Catch: java.lang.Exception -> L65
            if (r0 == 0) goto L6b
            if (r6 != 0) goto L37
            r0 = -9223372036854775808
            r5.m_timestampOfLastDecodedFrame = r0     // Catch: java.lang.Exception -> L65
            r5.m_timestampOfCurTexFrame = r0     // Catch: java.lang.Exception -> L65
            r5.m_pendingInputFrameCount = r3     // Catch: java.lang.Exception -> L65
            r5.m_sawInputEOS = r3     // Catch: java.lang.Exception -> L65
            r5.m_sawOutputEOS = r3     // Catch: java.lang.Exception -> L65
        L37:
            android.media.MediaCodec r0 = r5.m_decoder     // Catch: java.lang.Exception -> L65
            r0.flush()     // Catch: java.lang.Exception -> L65
            r5.m_inputBufferQueued = r3     // Catch: java.lang.Exception -> L65
            r5.m_pendingInputFrameCount = r3     // Catch: java.lang.Exception -> L65
            com.ss.android.vesdk.VEConfigCenter r1 = com.ss.android.vesdk.VEConfigCenter.getInstance()     // Catch: java.lang.Exception -> L65
            java.lang.String r0 = "ve_mediacodec_resource_reasonable_distribute"
            java.lang.Boolean r0 = r1.getValue(r0, r3)     // Catch: java.lang.Exception -> L65
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L65
            if (r0 == 0) goto L5f
            int r1 = r5.m_iWidth     // Catch: java.lang.Exception -> L65
            int r0 = r5.m_iHeight     // Catch: java.lang.Exception -> L65
            int r1 = r1 * r0
            int r0 = r5.m_iFps     // Catch: java.lang.Exception -> L65
            int r1 = r1 * r0
            int r0 = r5.hashCode()     // Catch: java.lang.Exception -> L65
            com.ss.android.ttve.mediacodec.TEMediaCodecResourceManager.freeCodecBlocksSize(r1, r0)     // Catch: java.lang.Exception -> L65
        L5f:
            java.lang.String r0 = "media decoder has been flushed."
            X.C2484209oO.LJI(r2, r0)     // Catch: java.lang.Exception -> L65
            goto L6a
        L65:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r4
        L6a:
            r4 = 0
        L6b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.flushDecoder(boolean):int");
    }

    public String getBestCodecName(String str) {
        int codecCount;
        MediaCodecInfo codecInfoAt;
        String[] supportedTypes;
        C2280341ENk c2280341ENkLIZ;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("video/hevc") && mIsByteVC1Blocklist) {
            return null;
        }
        ArrayList<C2280341ENk> arrayList = new ArrayList();
        synchronized (mCodecListLock) {
            try {
                boolean z = !mVideoHWDecoderCodecs.isEmpty();
                try {
                    if (z) {
                        codecCount = mVideoHWDecoderCodecs.size();
                    } else {
                        codecCount = MediaCodecList.getCodecCount();
                    }
                    for (int i = 0; i < codecCount && (!z || arrayList.isEmpty()); i++) {
                        if (!z) {
                            codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                        } else {
                            codecInfoAt = mVideoHWDecoderCodecs.get(i);
                        }
                        String name = codecInfoAt.getName();
                        if (!codecInfoAt.isEncoder() && !name.startsWith("OMX.google") && !name.startsWith("c2.android") && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                            for (String str2 : supportedTypes) {
                                if (!TextUtils.isEmpty(str2)) {
                                    if (!z && str2.startsWith("video/")) {
                                        mVideoHWDecoderCodecs.add(codecInfoAt);
                                    }
                                    if (str2.equalsIgnoreCase(str) && ((name.startsWith("OMX.") || name.startsWith("c2.")) && !name.startsWith("OMX.pv") && !name.startsWith("OMX.ittiam") && !name.contains("ffmpeg") && !name.contains("avcodec") && !name.contains("secure"))) {
                                        name.startsWith("OMX.MTK.");
                                        if (!codecNeedsFlushWorkaround(name) && (c2280341ENkLIZ = C2280341ENk.LIZ(codecInfoAt, str)) != null && c2280341ENkLIZ.LIZIZ != 20) {
                                            arrayList.add(c2280341ENkLIZ);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    C2280341ENk c2280341ENk = (C2280341ENk) arrayList.get(0);
                    for (C2280341ENk c2280341ENk2 : arrayList) {
                        if (c2280341ENk2.LIZIZ > c2280341ENk.LIZIZ) {
                            c2280341ENk = c2280341ENk2;
                        }
                    }
                    return c2280341ENk.LIZ.getName();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.m_frameSyncObject) {
            try {
                if (this.m_frameAvailable) {
                    C2484209oO.LIZ("TEMediaCodecDecoder", "m_frameAvailable already set, frame could be dropped!");
                }
                this.m_frameAvailable = true;
                this.m_frameSyncObject.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        synchronized (this.m_frameSyncObject) {
            try {
                if (this.m_frameAvailable) {
                    C2484209oO.LIZ("TEMediaCodecDecoder", "m_frameAvailable already set, frame could be dropped!");
                }
                Image imageAcquireNextImage = imageReader.acquireNextImage();
                Image image = this.mImage;
                if (image != null) {
                    image.close();
                }
                this.mImage = imageAcquireNextImage;
                this.m_frameAvailable = true;
                this.m_frameSyncObject.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(5:(2:4|(1:6)(0))|7|10|(2:12|(2:14|15)(2:16|(3:18|(2:19|(1:21)(1:28))|(1:23))))|25)(0)|26|7|10|(0)|25) */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        r1 = X.C2188811AlT.LIZ();
        r1.append("releaseOutputBuffer error: ");
        r1.append(r2.getMessage());
        X.C2484209oO.LIZJ("TEMediaCodecDecoder", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int releaseOutBuffer(boolean r7) {
        /*
            r6 = this;
            int r0 = r6.m_bGlobalDecoderPoolOption
            java.lang.String r4 = "TEMediaCodecDecoder"
            r5 = 1
            if (r0 <= r5) goto L21
        L7:
            int r2 = android.opengl.GLES20.glGetError()
            if (r2 == 0) goto L21
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "before releaseOutBuffer, glError:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C2484209oO.LIZJ(r4, r0)
            goto L7
        L21:
            int r0 = r6.m_pendingInputFrameCount     // Catch: java.lang.Throwable -> L2e
            int r0 = r0 - r5
            r6.m_pendingInputFrameCount = r0     // Catch: java.lang.Throwable -> L2e
            android.media.MediaCodec r1 = r6.m_decoder     // Catch: java.lang.Throwable -> L2e
            int r0 = r6.m_indexOfOutputBuffer     // Catch: java.lang.Throwable -> L2e
            r1.releaseOutputBuffer(r0, r7)     // Catch: java.lang.Throwable -> L2e
            goto L49
        L2e:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "releaseOutputBuffer error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C2484209oO.LIZJ(r4, r0)
        L49:
            r3 = 0
            if (r7 == 0) goto L83
            r0 = 500(0x1f4, float:7.0E-43)
            boolean r0 = r6.AwaitNewImage(r0)
            if (r0 != 0) goto L5c
            java.lang.String r0 = "release output buffer to surface texture failed!"
            X.C2484209oO.LIZJ(r4, r0)
            r0 = -103(0xffffffffffffff99, float:NaN)
            return r0
        L5c:
            r6.m_awaitNewImageSuccess = r5
            int r0 = r6.m_bGlobalDecoderPoolOption
            if (r0 <= r5) goto L83
            r0 = 0
        L63:
            int r2 = android.opengl.GLES20.glGetError()
            if (r2 == 0) goto L7e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "after releaseOutBuffer, glError:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C2484209oO.LIZJ(r4, r0)
            r0 = 1
            goto L63
        L7e:
            if (r0 == 0) goto L83
            r0 = -105(0xffffffffffffff97, float:NaN)
            return r0
        L83:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.releaseOutBuffer(boolean):int");
    }

    public static String getProperty(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return str2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str2;
        }
    }

    public int getInfoByFlag(long[] jArr, int i) {
        if (i == 1) {
            jArr[0] = this.m_timestampOfLastDecodedFrame;
        } else if (i == 2) {
            jArr[0] = this.m_timestampOfCurTexFrame;
            return 0;
        }
        return 0;
    }

    public static boolean checkHDVideoCanFastImport(int i, int i2, int i3) {
        if (!VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", false).booleanValue()) {
            return false;
        }
        return TEMediaCodecResourceManager.checkCanFastImport(i, i2, i3);
    }

    public static Bitmap convertTexToBitmap(int i, int i2, int i3) {
        ByteBuffer textureToByteBuffer = readTextureToByteBuffer(i, i2, i3);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(textureToByteBuffer);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022c  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0041 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int decodeFrame2Surface(byte[] r20, int r21, long r22) {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.decodeFrame2Surface(byte[], int, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0041 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int decodeFrameWithInputOutput(byte[] r21, int r22, long r23) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.decodeFrameWithInputOutput(byte[], int, long):int");
    }

    public static boolean dumpOESTexture(int i, int i2, int i3) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(36006, iArr2, 0);
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glBindTexture(36197, i);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 36197, i, 0);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2 * i3 * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirect.position(0);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, byteBufferAllocateDirect);
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glBindTexture(36197, 0);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/data/data/com.lemon.lv/files/OES_");
        sbLIZ.append(file_count);
        sbLIZ.append("_");
        sbLIZ.append(i);
        sbLIZ.append(".jpg");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        file_count++;
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        if (c0vsj.exists()) {
            c0vsj.delete();
        }
        try {
            try {
                C0VSV c0vsv = new C0VSV(c0vsj);
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 20, c0vsv);
                c0vsv.flush();
                c0vsv.close();
                if (!bitmapCreateBitmap.isRecycled()) {
                    bitmapCreateBitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                }
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!bitmapCreateBitmap.isRecycled()) {
                    bitmapCreateBitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                }
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!bitmapCreateBitmap.isRecycled()) {
                bitmapCreateBitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
            }
            throw th;
        }
    }

    public static boolean isSupportFormat(String str, int i, int i2) {
        MediaCodecInfo mediaCodecInfo21 = getMediaCodecInfo21(str);
        if (mediaCodecInfo21 == null) {
            C2484209oO.LIZJ("TEMediaCodecDecoder", "MediaCodecInfo is null!");
            return false;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo21.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i && codecProfileLevel.level >= i2) {
                return true;
            }
        }
        return false;
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

    public static boolean saveFrameToFile(int i, int i2, int i3) {
        Bitmap bitmapConvertTexToBitmap = convertTexToBitmap(i, i2, i3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/data/data/com.lemon.lv/files/2D_");
        sbLIZ.append(file_count);
        sbLIZ.append("_");
        sbLIZ.append(i);
        sbLIZ.append(".jpg");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        file_count++;
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        if (c0vsj.exists()) {
            c0vsj.delete();
        }
        try {
            try {
                C0VSV c0vsv = new C0VSV(c0vsj);
                bitmapConvertTexToBitmap.compress(Bitmap.CompressFormat.JPEG, 20, c0vsv);
                c0vsv.flush();
                c0vsv.close();
                if (!bitmapConvertTexToBitmap.isRecycled()) {
                    bitmapConvertTexToBitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapConvertTexToBitmap);
                }
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!bitmapConvertTexToBitmap.isRecycled()) {
                    bitmapConvertTexToBitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapConvertTexToBitmap);
                    return false;
                }
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!bitmapConvertTexToBitmap.isRecycled()) {
                bitmapConvertTexToBitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapConvertTexToBitmap);
            }
            throw th;
        }
    }

    public int decodeFrameWithoutDraw(byte[] bArr, int i, long j) {
        String str;
        int iDecodeFrameWithInputOutput = -2;
        if (this.m_decoder == null) {
            return -2;
        }
        if (!this.m_decoderStarted) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("decodeFrameWithoutDraw decoder ");
            if (this.m_decoder == null) {
                str = "null";
            } else {
                str = "";
            }
            sbLIZ.append(str);
            sbLIZ.append(", started: ");
            sbLIZ.append(this.m_decoderStarted);
            C2484209oO.LJIIIIZZ("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ));
            return -2;
        }
        if (VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", false).booleanValue() && !TEMediaCodecResourceManager.tryUseCodecBlocksSize(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            C2484209oO.LIZ("TEMediaCodecDecoder", C2484209oO.LJ("TEMediaCodecDecoder", "decodeFrameWithoutDraw ERROR_HW_OVERLOAD", new C2484309oP(Integer.valueOf(TEMediaCodecResourceManager.getMaxCodecBlocksSize()), "MaxCodecBlocksSize is"), new C2484309oP(Integer.valueOf(TEMediaCodecResourceManager.getUsedCodecBlocksSize()), "UsedCodecBlocksSize is")));
        }
        try {
            iDecodeFrameWithInputOutput = decodeFrameWithInputOutput(bArr, i, j);
            return iDecodeFrameWithInputOutput;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            return iDecodeFrameWithInputOutput;
        }
    }

    private void updateAndRenderOesWrapped(int i, int i2, int i3, int i4, boolean z) {
        this.m_iOutputWidth = i2;
        this.m_iOutputHeight = i3;
        this.m_iRotateDegree = i4;
        if (!this.m_bUseImageReader && this.m_eglStateSaver == null) {
            C1284320jWg c1284320jWg = new C1284320jWg();
            this.m_eglStateSaver = c1284320jWg;
            c1284320jWg.LIZIZ();
            this.m_textureRender.LJIILJJIL = this.m_eglStateSaver.LJ;
        }
        if (!this.m_bUseImageReader && !EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.LIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("eglGetCurrentContext = ");
            sbLIZ.append(EGL14.eglGetCurrentContext());
            sbLIZ.append(" getSavedEGLContext = ");
            sbLIZ.append(this.m_eglStateSaver.LIZ);
            C2484209oO.LJIIIIZZ("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!this.m_sawOutputEOS) {
            C2484209oO.LIZ("TEMediaCodecDecoder", "Rendering decoded frame to surface texture.");
            if (this.m_awaitNewImageSuccess) {
                this.m_timestampOfCurTexFrame = this.m_bufferInfo.presentationTimeUs;
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.block();
                }
                SurfaceTexture surfaceTexture = this.m_surfaceTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                    if (VEConfigCenter.getInstance().getValue("ve_enable_hw_decoder_use_surfacetexture_matrix", false).booleanValue()) {
                        this.m_surfaceTexture.getTransformMatrix(this.m_textureRender.LIZLLL);
                    }
                }
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.close();
                    this.m_awaitNewImageSuccess = false;
                    return;
                }
                C1283290jV1 c1283290jV1 = this.m_textureRender;
                if (c1283290jV1 != null && i > 0) {
                    c1283290jV1.LIZIZ(this.m_iWidth, this.m_iHeight, this.m_iOutputWidth, this.m_iOutputHeight, this.m_surfaceTexID[0], i, z, this.m_iRotateDegree);
                }
                if (this.m_bUseImageReader) {
                    onImageFrameAvailable();
                }
                this.m_awaitNewImageSuccess = false;
                return;
            }
            C2484209oO.LIZJ("TEMediaCodecDecoder", "Render OES to 2D texture failed: m_awaitNewImageSuccess is false!");
            return;
        }
        C2484209oO.LIZ("TEMediaCodecDecoder", "Render OES to 2D texture failed: m_sawOutputEOS");
    }

    public void updateAndRenderOES(int i, int i2, int i3, int i4, boolean z) {
        String str = "null";
        if (this.m_decoder != null && this.m_decoderStarted) {
            try {
                updateAndRenderOesWrapped(i, i2, i3, i4, z);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateAndRenderOES ");
                if (this.m_decoder != null) {
                    str = "";
                }
                sbLIZ.append(str);
                sbLIZ.append(", started: ");
                sbLIZ.append(this.m_decoderStarted);
                sbLIZ.append(", error: ");
                sbLIZ.append(th);
                C2484209oO.LJIIIIZZ("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateAndRenderOES ");
        if (this.m_decoder != null) {
            str = "";
        }
        sbLIZ2.append(str);
        sbLIZ2.append(", started: ");
        sbLIZ2.append(this.m_decoderStarted);
        C2484209oO.LJIIIIZZ("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public int decodeFrame(byte[] bArr, int i, long j, int i2, int i3, int i4, int i5) {
        this.m_iOutputWidth = i3;
        this.m_iOutputHeight = i4;
        this.m_iRotateDegree = i5;
        if (!this.m_bUseImageReader && this.m_eglStateSaver == null) {
            C1284320jWg c1284320jWg = new C1284320jWg();
            this.m_eglStateSaver = c1284320jWg;
            c1284320jWg.LIZIZ();
        }
        if (!this.m_bUseImageReader && !EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.LIZ)) {
            this.m_bNeedConfigure = true;
        }
        if (this.m_bNeedConfigure) {
            if (!this.m_bUseImageReader) {
                this.m_eglStateSaver.LIZIZ();
            }
            restartDecoder();
            this.m_bNeedConfigure = false;
        }
        int iDecodeFrame2Surface = -2;
        if (this.m_decoder == null) {
            return -2;
        }
        if (VEConfigCenter.getInstance().getValue("ve_mediacodec_resource_reasonable_distribute", false).booleanValue() && !TEMediaCodecResourceManager.tryUseCodecBlocksSize(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            C2484209oO.LIZ("TEMediaCodecDecoder", C2484209oO.LJ("TEMediaCodecDecoder", "decodeFrame ERROR_HW_OVERLOAD", new C2484309oP(Integer.valueOf(TEMediaCodecResourceManager.getMaxCodecBlocksSize()), "MaxCodecBlocksSize is"), new C2484309oP(Integer.valueOf(TEMediaCodecResourceManager.getUsedCodecBlocksSize()), "UsedCodecBlocksSize is")));
        }
        try {
            iDecodeFrame2Surface = decodeFrame2Surface(bArr, i, j);
            if (iDecodeFrame2Surface == 0) {
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.block();
                }
                SurfaceTexture surfaceTexture = this.m_surfaceTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                    if (VEConfigCenter.getInstance().getValue("ve_enable_hw_decoder_use_surfacetexture_matrix", false).booleanValue()) {
                        this.m_surfaceTexture.getTransformMatrix(this.m_textureRender.LIZLLL);
                    }
                }
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.close();
                    return iDecodeFrame2Surface;
                }
                C1283290jV1 c1283290jV1 = this.m_textureRender;
                if (c1283290jV1 != null && i2 > 0) {
                    c1283290jV1.LIZIZ(this.m_iWidth, this.m_iHeight, this.m_iOutputWidth, this.m_iOutputHeight, this.m_surfaceTexID[0], i2, true, this.m_iRotateDegree);
                }
                if (this.m_bUseImageReader) {
                    onImageFrameAvailable();
                    return iDecodeFrame2Surface;
                }
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return iDecodeFrame2Surface;
    }

    public int setDecoderParams(int i, int i2, int i3, byte[] bArr, int i4, int i5, int i6, int i7) {
        this.m_iWidth = i;
        this.m_iHeight = i2;
        this.m_iFps = i3;
        this.m_iOutputWidth = i5;
        this.m_iOutputHeight = i6;
        this.m_codecSpecificData = null;
        this.m_iCodecID = i7;
        if (i7 != 2) {
            if (i7 != 13) {
                if (i7 != 28) {
                    if (i7 != 140) {
                        if (i7 != 168) {
                            if (i7 == 174) {
                                this.VIDEO_MIME_TYPE = "video/hevc";
                                this.mMinCompressionRatio = 4;
                            }
                        } else {
                            this.VIDEO_MIME_TYPE = "video/x-vnd.on2.vp9";
                        }
                    } else {
                        this.VIDEO_MIME_TYPE = "video/x-vnd.on2.vp8";
                    }
                } else {
                    this.VIDEO_MIME_TYPE = "video/avc";
                    this.mMinCompressionRatio = 2;
                }
            } else {
                this.VIDEO_MIME_TYPE = "video/mp4v-es";
            }
        } else {
            this.VIDEO_MIME_TYPE = "video/mpeg2";
        }
        if (i4 > 0) {
            this.m_codecSpecificData = ByteBuffer.wrap(bArr, 0, i4);
        }
        this.m_bNeedConfigure = true;
        return 0;
    }

    public int initDecoder(long j, int i, int i2, int i3, byte[] bArr, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, int i8) {
        this.m_nativeHandler = j;
        this.m_bUseImageReader = z2;
        this.mIs10bit = z3;
        this.m_pageMode = i8;
        this.m_bGlobalDecoderPoolOption = VEConfigCenter.getInstance().getValue("ve_enable_global_decoder_pool", 0);
        m_useCreateDecoderByName = z;
        if (174 == i7 && (isHisiByteVC1BlockList() || isMtkByteVC1BlockList())) {
            mIsByteVC1Blocklist = true;
        }
        int decoderParams = setDecoderParams(i, i2, i3, bArr, i4, i5, i6, i7);
        if (this.m_bNeedConfigure) {
            decoderParams = configureMediaFormat();
        }
        if (decoderParams != 0) {
            return decoderParams;
        }
        if (this.m_eglStateSaver == null && !this.m_bUseImageReader) {
            C1284320jWg c1284320jWg = new C1284320jWg();
            this.m_eglStateSaver = c1284320jWg;
            c1284320jWg.LIZIZ();
        }
        if (this.m_bNeedConfigure && (decoderParams = restartDecoder()) == 0) {
            this.m_bNeedConfigure = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initHwDecoder srcSize:(");
        sbLIZ.append(i);
        sbLIZ.append(",");
        sbLIZ.append(i2);
        sbLIZ.append("), dstSize:(");
        sbLIZ.append(i5);
        sbLIZ.append(",");
        sbLIZ.append(i6);
        sbLIZ.append(") ret=");
        sbLIZ.append(decoderParams);
        C2484209oO.LJIIIIZZ("TEMediaCodecDecoder", C2188811AlT.LIZIZ(sbLIZ));
        return decoderParams;
    }
}
