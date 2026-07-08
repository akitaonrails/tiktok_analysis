package com.ss.android.vesdk;

import X.C1284180jWS;
import X.C1664350tPd;
import X.C1DJ7;
import X.C2185601AgI;
import X.C2185991Agv;
import X.C2186001Agw;
import X.C2186011Agx;
import X.C2186021Agy;
import X.C2186031Agz;
import X.C2186041Ah0;
import X.C2188811AlT;
import X.C2484209oO;
import X.C386801es;
import X.EnumC2185621AgK;
import X.EnumC2186221AhI;
import X.InterfaceC2185971Agt;
import X.InterfaceC2186051Ah1;
import X.InterfaceC2186151AhB;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.medialib.camera.ImageFrame;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TECameraFrameSetting;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.k;
import com.ss.android.vesdk.utils.TEFrameUtils;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes34.dex */
public class TECamera {
    public int dropFramesCount;
    public TECameraFrameSetting mCameraFrameSetting;
    public InterfaceC2185971Agt mCameraPreview;
    public VECameraSettings mCameraSetting;
    public final InterfaceC2186151AhB mCameraStatusListener;
    public boolean mCanDropFrame;
    public C1DJ7 mCaptureListener;
    public C2185991Agv mCapturePipeline;
    public final C1664350tPd<C2185991Agv> mCapturePipelines;
    public C2186031Agz mConfig;
    public int mDropFrame;
    public boolean mEnableCameraSwitchCamera1Optimize;
    public boolean mEnableCameraThreadCleanup;
    public boolean mEnableNotify;
    public boolean mEnablePreviewSizeChangeOpt1;
    public volatile long mHandle;
    public int mHdrCameraSwitchDropResidualFramesCount;
    public InterfaceC2186051Ah1 mOnCameraInfoListener;
    public boolean mPreventTextureRender;
    public final C1284180jWS mTextureHolder;
    public int mUseFront;
    public boolean mbCanReleaseSurfaceTexture;
    public int originFacing;
    public int originFrameHeight;
    public int originFrameWidth;

    private native long nativeCameraCreate();

    private native void nativeCameraDestroy(long j);

    private native int nativeCameraParam(long j, TECameraFrameSetting tECameraFrameSetting);

    private native int nativeInit(long j);

    public synchronized int getNextFrame() {
        int i;
        if (this.mTextureHolder.LIZIZ != this.mCapturePipeline.LIZIZ()) {
            C2484209oO.LJI("TECamera", "getNextFrame, mSurfaceTexture is different from mCapturePipeline's surfaceTexture.");
            this.mCapturePipeline.LIZLLL(this.mTextureHolder.LIZIZ);
        }
        try {
            this.mTextureHolder.LJII();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZLLL("TECamera", "CAMERA_COST updateTexImage error: ", e);
        }
        if (this.mPreventTextureRender || this.mCanDropFrame) {
            if (this.mCanDropFrame) {
                C2484209oO.LJIIIIZZ("TECamera", "can drop frame");
            }
            i = C386801es.DEFAULT;
        } else {
            i = 0;
        }
        if (VEConfigCenter.getInstance().getValue("ve_enable_camera_render_independent_thread_gf", false).booleanValue() || VEConfigCenter.getInstance().getValue("ve_camera_gf_effect_graph_thread_setting", 0) == 1) {
            notifyFrameDealCompleted();
        }
        return i;
    }

    public native void nativeExtFrameDataAttached(long j, Object obj);

    public native int nativeNotifyCameraFrameAvailable(long j, int i);

    public native void nativeUpdateCameraStatus(long j, float f);

    public void notifyFrameDealCompleted() {
    }

    private void updatePipelineTextureId() {
        C2185991Agv c2185991Agv = this.mCapturePipeline;
        if (c2185991Agv instanceof C2186001Agw) {
            int i = this.mTextureHolder.LIZ;
            ((C2186001Agw) c2185991Agv).LJIIJ = i;
            InterfaceC2185971Agt interfaceC2185971Agt = this.mCameraPreview;
            if (interfaceC2185971Agt != null) {
                interfaceC2185971Agt.LJIIJJI(i);
            }
        }
    }

    public long getTexImageTimeDelay() {
        TECameraFrameSetting tECameraFrameSetting = this.mCameraFrameSetting;
        return (tECameraFrameSetting == null || tECameraFrameSetting.isDependSurfaceTimestamp()) ? (long) (((System.nanoTime() / 1000000.0d) - this.mTextureHolder.LJ()) * 1000.0d) : (System.nanoTime() - this.mCameraFrameSetting.getTimestampInNS()) / 1000;
    }

    public void release() {
        C2484209oO.LJI("TECamera", "release...");
        InterfaceC2185971Agt interfaceC2185971Agt = this.mCameraPreview;
        if ((interfaceC2185971Agt instanceof VECameraCapture) && !this.mbCanReleaseSurfaceTexture) {
            ((VECameraCapture) interfaceC2185971Agt).LLJILJIL.needToReleaseSurfaceTexture(true);
        }
        this.mTextureHolder.LJFF(this.mbCanReleaseSurfaceTexture);
        this.mCapturePipelines.LIZIZ();
    }

    public TECamera() {
        this.mTextureHolder = new C1284180jWS();
        this.mCapturePipelines = new C1664350tPd<>();
        this.mCameraPreview = null;
        this.mDropFrame = -1;
        this.dropFramesCount = 0;
        this.mEnableNotify = true;
        this.mbCanReleaseSurfaceTexture = true;
        this.mEnableCameraThreadCleanup = false;
        this.mEnableCameraSwitchCamera1Optimize = false;
        this.mEnablePreviewSizeChangeOpt1 = false;
        this.mHdrCameraSwitchDropResidualFramesCount = 0;
        this.mCanDropFrame = false;
        this.mConfig = null;
        this.mCameraStatusListener = new C2186041Ah0(this);
        this.mCaptureListener = new C1DJ7() { // from class: X.1Ags
            /* JADX WARN: Removed duplicated region for block: B:65:0x020d  */
            @Override // X.C1DJX
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(com.ss.android.ttvecamera.TECameraFrame r12) {
                /*
                    Method dump skipped, instruction units count: 580
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2185961Ags.LIZIZ(com.ss.android.ttvecamera.TECameraFrame):void");
            }

            @Override // X.C1DJ7
            public final void LJJJJZI(boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("canReleaseSurfaceTexture, canRelease = ");
                sbLIZ.append(z);
                C2484209oO.LJI("TECamera", C2188811AlT.LIZIZ(sbLIZ));
                this.LL.mbCanReleaseSurfaceTexture = z;
            }

            @Override // X.InterfaceC1283630jVZ
            public final void LJLJJL(TEFrameSizei tEFrameSizei) {
                InterfaceC2186051Ah1 interfaceC2186051Ah1 = this.LL.mOnCameraInfoListener;
                if (interfaceC2186051Ah1 != null) {
                    int i = tEFrameSizei.width;
                    int i2 = tEFrameSizei.height;
                    k kVar = (k) interfaceC2186051Ah1;
                    VESize vESize = kVar.LJJJJ.LJJIIJ;
                    int i3 = vESize.width;
                    int i4 = vESize.height;
                    int i5 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[onCameraPreviewSizeChanged], previewW = ");
                    sbLIZ.append(i);
                    sbLIZ.append(", previewH = ");
                    sbLIZ.append(i2);
                    sbLIZ.append(", renderW = ");
                    sbLIZ.append(i3);
                    sbLIZ.append(", renderH = ");
                    sbLIZ.append(i4);
                    C2183341Ace.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                    if (i < i4 && i2 < i3) {
                        int i6 = i2 - (i2 & 3);
                        int i7 = (int) (((i4 * 1.0f) / i3) * i6);
                        int i8 = i7 - (3 & i7);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[onCameraPreviewSizeChanged], will change render size, newRenderW = ");
                        sbLIZ2.append(i6);
                        sbLIZ2.append(", newRenderH ");
                        sbLIZ2.append(i8);
                        C2183341Ace.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ2));
                        kVar.LJIIJ(new VESize(i6, i8));
                    }
                }
            }

            @Override // X.C1DJX
            public final void LJLLILLLL(SurfaceTexture surfaceTexture) {
                this.LL.mTextureHolder.LIZIZ = surfaceTexture;
            }

            @Override // X.C1DJ7, X.C1DJQ
            public final void LIZJ(SurfaceTexture surfaceTexture, boolean z) {
                LJLLILLLL(surfaceTexture);
                this.LL.mTextureHolder.LJI(z);
            }
        };
        this.mHandle = nativeCameraCreate();
    }

    public void createOESTextureIfNeed() {
        if (!VEConfigCenter.getInstance().getValue("ve_enable_multi_capture_pipeline", false).booleanValue()) {
            if (this.mTextureHolder.LIZIZ()) {
                updatePipelineTextureId();
                return;
            }
            return;
        }
        C1284180jWS c1284180jWS = this.mTextureHolder;
        int i = c1284180jWS.LIZ;
        if (c1284180jWS.LIZIZ()) {
            C2185991Agv c2185991Agv = this.mCapturePipeline;
            if (c2185991Agv instanceof C2186001Agw) {
                int i2 = this.mTextureHolder.LIZ;
                ((C2186001Agw) c2185991Agv).LJIIJ = i2;
                InterfaceC2185971Agt interfaceC2185971Agt = this.mCameraPreview;
                if (interfaceC2185971Agt != null) {
                    interfaceC2185971Agt.LJIILL(i, i2);
                }
            }
        }
    }

    public void destroy() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy, mHandle=");
        sbLIZ.append(this.mHandle);
        C2484209oO.LJI("TECamera", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mHandle != 0) {
            nativeCameraDestroy(this.mHandle);
            this.mHandle = 0L;
            this.mCaptureListener = null;
            this.mOnCameraInfoListener = null;
        }
    }

    static {
        TENativeLibsLoader.loadLibrary();
    }

    public InterfaceC2186151AhB getCameraStatusListener() {
        return this.mCameraStatusListener;
    }

    public C1664350tPd<C2185991Agv> getCapturePipelines() {
        return this.mCapturePipelines;
    }

    public TECamera(long j) {
        this.mTextureHolder = new C1284180jWS();
        this.mCapturePipelines = new C1664350tPd<>();
        this.mCameraPreview = null;
        this.mDropFrame = -1;
        this.dropFramesCount = 0;
        this.mEnableNotify = true;
        this.mbCanReleaseSurfaceTexture = true;
        this.mEnableCameraThreadCleanup = false;
        this.mEnableCameraSwitchCamera1Optimize = false;
        this.mEnablePreviewSizeChangeOpt1 = false;
        this.mHdrCameraSwitchDropResidualFramesCount = 0;
        this.mCanDropFrame = false;
        this.mConfig = null;
        this.mCameraStatusListener = new C2186041Ah0(this);
        this.mCaptureListener = new C1DJ7() { // from class: X.1Ags
            /* JADX WARN: Removed duplicated region for block: B:65:0x020d  */
            @Override // X.C1DJX
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(com.ss.android.ttvecamera.TECameraFrame r12) {
                /*
                    Method dump skipped, instruction units count: 580
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2185961Ags.LIZIZ(com.ss.android.ttvecamera.TECameraFrame):void");
            }

            @Override // X.C1DJ7
            public final void LJJJJZI(boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("canReleaseSurfaceTexture, canRelease = ");
                sbLIZ.append(z);
                C2484209oO.LJI("TECamera", C2188811AlT.LIZIZ(sbLIZ));
                this.LL.mbCanReleaseSurfaceTexture = z;
            }

            @Override // X.InterfaceC1283630jVZ
            public final void LJLJJL(TEFrameSizei tEFrameSizei) {
                InterfaceC2186051Ah1 interfaceC2186051Ah1 = this.LL.mOnCameraInfoListener;
                if (interfaceC2186051Ah1 != null) {
                    int i = tEFrameSizei.width;
                    int i2 = tEFrameSizei.height;
                    k kVar = (k) interfaceC2186051Ah1;
                    VESize vESize = kVar.LJJJJ.LJJIIJ;
                    int i3 = vESize.width;
                    int i4 = vESize.height;
                    int i5 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[onCameraPreviewSizeChanged], previewW = ");
                    sbLIZ.append(i);
                    sbLIZ.append(", previewH = ");
                    sbLIZ.append(i2);
                    sbLIZ.append(", renderW = ");
                    sbLIZ.append(i3);
                    sbLIZ.append(", renderH = ");
                    sbLIZ.append(i4);
                    C2183341Ace.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                    if (i < i4 && i2 < i3) {
                        int i6 = i2 - (i2 & 3);
                        int i7 = (int) (((i4 * 1.0f) / i3) * i6);
                        int i8 = i7 - (3 & i7);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[onCameraPreviewSizeChanged], will change render size, newRenderW = ");
                        sbLIZ2.append(i6);
                        sbLIZ2.append(", newRenderH ");
                        sbLIZ2.append(i8);
                        C2183341Ace.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ2));
                        kVar.LJIIJ(new VESize(i6, i8));
                    }
                }
            }

            @Override // X.C1DJX
            public final void LJLLILLLL(SurfaceTexture surfaceTexture) {
                this.LL.mTextureHolder.LIZIZ = surfaceTexture;
            }

            @Override // X.C1DJ7, X.C1DJQ
            public final void LIZJ(SurfaceTexture surfaceTexture, boolean z) {
                LJLLILLLL(surfaceTexture);
                this.LL.mTextureHolder.LJI(z);
            }
        };
        this.mHandle = j;
        if (nativeInit(this.mHandle) != 0) {
            this.mHandle = 0L;
        }
        this.mEnableCameraThreadCleanup = VEConfigCenter.getInstance().getValue("ve_enable_camera_thread_cleanup", false).booleanValue();
        this.mEnableCameraSwitchCamera1Optimize = VEConfigCenter.getInstance().getValue("ve_enable_camera_switch_camera1_optimize", false).booleanValue();
        this.mEnablePreviewSizeChangeOpt1 = VEConfigCenter.getInstance().getValue("ve_enable_preview_size_change_opt1", false).booleanValue();
        this.mHdrCameraSwitchDropResidualFramesCount = VEConfigCenter.getInstance().getValue("ve_hdr_camera_switch_drop_residual_frames_count", 0);
        this.dropFramesCount = VEConfigCenter.getInstance().getValue("ve_hdr_camera_switch_drop_residual_frames_count", 0);
    }

    public void preventTextureRender(boolean z) {
        this.mPreventTextureRender = z;
    }

    public void setCameraParams(TECameraFrame tECameraFrame) {
        int rotation = tECameraFrame.getRotation();
        if (tECameraFrame.getPixelFormat() == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES) {
            if (tECameraFrame.getTextureID() == 0 && this.mTextureHolder.LIZ != 0) {
                updatePipelineTextureId();
                tECameraFrame.setTextureID(this.mTextureHolder.LIZ);
            }
            TECameraFrameSetting tECameraFrameSetting = new TECameraFrameSetting(tECameraFrame.getTextureID(), VEPreviewSettings.CAMERA_OUTPUT_MODE.SURFACE.ordinal(), tECameraFrame.getSize().width, tECameraFrame.getSize().height, rotation, tECameraFrame.getMVPMatrix(), this.mUseFront, tECameraFrame.getPixelFormat().ordinal(), 0);
            this.mCameraFrameSetting = tECameraFrameSetting;
            tECameraFrameSetting.setDependSurfaceTimestamp(tECameraFrame.isDependSurfaceTimestamp());
            this.mCameraFrameSetting.setEnableMatchFrameHandleFps(tECameraFrame.isMatchFrameHandleFps());
            this.mCameraFrameSetting.setTimestampInNS(tECameraFrame.getTimeStampNS());
            TECameraFrame.Metadata metadata = tECameraFrame.getMetadata();
            if (metadata != null) {
                this.mCameraFrameSetting.setMetadata(metadata);
            }
        } else if (tECameraFrame.getType() == 3) {
            ImageFrame imageFrameTEImageFrame2ImageFrame = TEFrameUtils.TEImageFrame2ImageFrame(tECameraFrame);
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 3, 3);
            ByteBuffer[] byteBufferArr = new ByteBuffer[3];
            new C2185601AgI(imageFrameTEImageFrame2ImageFrame).LIZ(iArr, byteBufferArr);
            this.mCameraFrameSetting = new TECameraFrameSetting(VEPreviewSettings.CAMERA_OUTPUT_MODE.FRAME.ordinal(), imageFrameTEImageFrame2ImageFrame.getWidth(), imageFrameTEImageFrame2ImageFrame.getHeight(), rotation, this.mUseFront, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_YUV420P.ordinal());
        } else if (tECameraFrame.getPixelFormat() != TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV21 && tECameraFrame.getPixelFormat() != TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_JPEG) {
            if (tECameraFrame.getPixelFormat() == TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_ARGB8) {
                TECameraFrameSetting tECameraFrameSetting2 = new TECameraFrameSetting(tECameraFrame.getBufferData(), ByteBuffer.wrap(tECameraFrame.getBufferData()).capacity(), tECameraFrame.getSize().width, tECameraFrame.getSize().height, rotation, EnumC2185621AgK.TEPixFmt_ARGB8.ordinal());
                this.mCameraFrameSetting = tECameraFrameSetting2;
                tECameraFrameSetting2.setCameraOutPutMode(VEPreviewSettings.CAMERA_OUTPUT_MODE.FRAME.ordinal());
            } else {
                C2484209oO.LIZJ("TECamera", "Not support now!!");
            }
        } else {
            this.mCameraFrameSetting = new TECameraFrameSetting(VEPreviewSettings.CAMERA_OUTPUT_MODE.FRAME.ordinal(), tECameraFrame.getSize().width, tECameraFrame.getSize().height, rotation, this.mUseFront, tECameraFrame.getBufferData(), tECameraFrame.getPixelFormat().ordinal());
        }
        this.mCameraFrameSetting.setCustomTag(tECameraFrame.getCustomTag());
        if (this.mHandle != 0) {
            nativeCameraParam(this.mHandle, this.mCameraFrameSetting);
        }
    }

    public void setConfig(C2186031Agz c2186031Agz) {
        this.mConfig = c2186031Agz;
    }

    public void setEnableCameraNotify(boolean z) {
        this.mEnableNotify = z;
    }

    public void setOnCameraInfoListener(InterfaceC2186051Ah1 interfaceC2186051Ah1) {
        this.mOnCameraInfoListener = interfaceC2186051Ah1;
    }

    public int startCameraPreview(InterfaceC2185971Agt interfaceC2185971Agt) {
        C2185991Agv next;
        TEFrameSizei tEFrameSizei;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCameraPreview, cameraPreview = ");
        sbLIZ.append(interfaceC2185971Agt);
        C2484209oO.LJI("TECamera", C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC2185971Agt != null) {
            C2186031Agz c2186031Agz = this.mConfig;
            if (c2186031Agz != null) {
                c2186031Agz.LIZIZ = interfaceC2185971Agt.N2();
            }
            VESize vESizeN2 = interfaceC2185971Agt.N2();
            Iterator<C2185991Agv> it2 = this.mCapturePipelines.LIZJ().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next != null && next.LIZLLL) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (vESizeN2 != null && next != null && (tEFrameSizei = next.LIZIZ) != null) {
                tEFrameSizei.width = vESizeN2.width;
                tEFrameSizei.height = vESizeN2.height;
            }
            return interfaceC2185971Agt.LJIILIIL(this.mCapturePipelines);
        }
        C2484209oO.LJIIIIZZ("TECamera", "startCameraPreview skip, cameraPreview is null.");
        return 0;
    }

    public void updateCameraSetting(VECameraSettings vECameraSettings) {
        this.mCameraSetting = vECameraSettings;
    }

    public C1664350tPd<C2185991Agv> createCapturePipeline(InterfaceC2185971Agt interfaceC2185971Agt, boolean z, VEPreviewSettings.CAMERA_OUTPUT_MODE camera_output_mode) {
        setEnableCameraNotify(true);
        VECameraSettings vECameraSettingsLIZIZ = interfaceC2185971Agt.LIZIZ();
        this.mCameraSetting = vECameraSettingsLIZIZ;
        if (vECameraSettingsLIZIZ == null) {
            C2484209oO.LIZJ("TECamera", "mCameraSetting is null.");
            return this.mCapturePipelines;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createCapturePipeline, enableDetach = ");
        sbLIZ.append(z);
        C2484209oO.LJI("TECamera", C2188811AlT.LIZIZ(sbLIZ));
        this.mCameraPreview = interfaceC2185971Agt;
        this.mTextureHolder.LIZJ(z);
        if (!VEConfigCenter.getInstance().getValue("ve_enable_multi_capture_pipeline", false).booleanValue()) {
            if (camera_output_mode == VEPreviewSettings.CAMERA_OUTPUT_MODE.FRAME) {
                if (this.mCameraSetting.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE1) {
                    this.mCapturePipeline = new C2186021Agy(0, this.mTextureHolder.LIZIZ, new TEFrameSizei(interfaceC2185971Agt.N2().width, interfaceC2185971Agt.N2().height), this.mCaptureListener);
                }
            } else if (camera_output_mode != VEPreviewSettings.CAMERA_OUTPUT_MODE.SURFACE && camera_output_mode != VEPreviewSettings.CAMERA_OUTPUT_MODE.EXTERNAL_SURFACE) {
                if (camera_output_mode == VEPreviewSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                    this.mCapturePipeline = new C2186021Agy(1, this.mTextureHolder.LIZIZ, new TEFrameSizei(interfaceC2185971Agt.N2().width, interfaceC2185971Agt.N2().height), this.mCaptureListener);
                }
            } else {
                TEFrameSizei tEFrameSizei = new TEFrameSizei(interfaceC2185971Agt.N2().width, interfaceC2185971Agt.N2().height);
                C1DJ7 c1dj7 = this.mCaptureListener;
                C1284180jWS c1284180jWS = this.mTextureHolder;
                this.mCapturePipeline = new C2186001Agw(c1284180jWS.LIZ, c1284180jWS.LIZIZ, tEFrameSizei, c1dj7);
            }
        } else {
            C2186031Agz c2186031Agz = this.mConfig;
            if (c2186031Agz != null && c2186031Agz.LIZIZ != null) {
                C2186031Agz c2186031Agz2 = this.mConfig;
                VESize vESize = c2186031Agz2.LIZIZ;
                final TEFrameSizei tEFrameSizei2 = new TEFrameSizei(vESize.width, vESize.height);
                if (!c2186031Agz2.LIZLLL) {
                    EnumC2186221AhI enumC2186221AhI = c2186031Agz2.LIZ;
                    if (enumC2186221AhI == EnumC2186221AhI.PROVIDER_TYPE_SURFACE_TEXTURE) {
                        C1DJ7 c1dj72 = this.mCaptureListener;
                        C1284180jWS c1284180jWS2 = this.mTextureHolder;
                        this.mCapturePipeline = new C2186001Agw(c1284180jWS2.LIZ, c1284180jWS2.LIZIZ, tEFrameSizei2, c1dj72);
                    } else if (enumC2186221AhI == EnumC2186221AhI.PROVIDER_TYPE_BUFFER_CALLBACK) {
                        this.mCapturePipeline = new C2186021Agy(1, this.mTextureHolder.LIZIZ, tEFrameSizei2, this.mCaptureListener);
                    } else if (enumC2186221AhI == EnumC2186221AhI.PROVIDER_TYPE_IMAGE_READER) {
                        final TECameraFrame.ETEPixelFormat eTEPixelFormat = TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_NV12;
                        final C1DJ7 c1dj73 = this.mCaptureListener;
                        this.mCapturePipeline = new C2185991Agv(eTEPixelFormat, tEFrameSizei2, c1dj73) { // from class: X.1Agu
                            public final Surface LJIIJ = null;

                            @Override // X.C2185991Agv
                            public final boolean LIZJ() {
                                return super.LIZJ();
                            }

                            @Override // X.C2185991Agv
                            public final Surface LIZ() {
                                return this.LJIIJ;
                            }
                        };
                    } else if (enumC2186221AhI == EnumC2186221AhI.PROVIDER_TYPE_RECORDER) {
                        this.mCapturePipeline = new C2186011Agx(tEFrameSizei2, this.mCaptureListener);
                    } else {
                        C1DJ7 c1dj74 = this.mCaptureListener;
                        C1284180jWS c1284180jWS3 = this.mTextureHolder;
                        this.mCapturePipeline = new C2186001Agw(c1284180jWS3.LIZ, c1284180jWS3.LIZIZ, tEFrameSizei2, c1dj74);
                    }
                    this.mCapturePipeline.LJ = this.mConfig.LIZJ;
                }
            } else {
                C2484209oO.LIZJ("TECamera", "mConfig is null or size is null.");
                return this.mCapturePipelines;
            }
        }
        C2185991Agv c2185991Agv = this.mCapturePipeline;
        if (c2185991Agv != null) {
            c2185991Agv.LJIIIZ = this.mTextureHolder;
            this.mCapturePipelines.LIZIZ();
            this.mCapturePipelines.LIZ(this.mCapturePipeline);
        }
        return this.mCapturePipelines;
    }

    public int start(InterfaceC2185971Agt interfaceC2185971Agt, boolean z, VEPreviewSettings.CAMERA_OUTPUT_MODE camera_output_mode) {
        C2484209oO.LJI("TECamera", "start");
        createCapturePipeline(interfaceC2185971Agt, z, camera_output_mode);
        if (this.mCameraSetting == null) {
            C2484209oO.LIZJ("TECamera", "start failed, mCameraSetting is null.");
            return -100;
        }
        return startCameraPreview(interfaceC2185971Agt);
    }
}
