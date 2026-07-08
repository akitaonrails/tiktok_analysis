package com.ss.android.vesdk;

import X.C1284730jXL;
import X.C1286570jaJ;
import X.C1305710k5B;
import X.C1311120kDu;
import X.C1649180t1A;
import X.C1664350tPd;
import X.C1A83;
import X.C1AIY;
import X.C1DIC;
import X.C1DIE;
import X.C1DIL;
import X.C1DIP;
import X.C1DJ6;
import X.C1DJ7;
import X.C1DJ8;
import X.C1DJ9;
import X.C1DJA;
import X.C1DJC;
import X.C1DJG;
import X.C1DJJ;
import X.C1DJP;
import X.C1DJU;
import X.C212350188e;
import X.C21309418aK;
import X.C2183321Acc;
import X.C2183341Ace;
import X.C2183531Acx;
import X.C2185991Agv;
import X.C2186321AhS;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2484209oO;
import X.C786410Ut5;
import X.EnumC2183331Acd;
import X.InterfaceC1271000jBC;
import X.InterfaceC1283630jVZ;
import X.InterfaceC1287190jbJ;
import X.InterfaceC1305670k57;
import X.InterfaceC1305720k5C;
import X.InterfaceC1673870tez;
import X.InterfaceC1780750wRN;
import X.InterfaceC2183541Acy;
import X.InterfaceC2186091Ah5;
import X.InterfaceC2186211AhH;
import X.InterfaceC2189431AmT;
import X.InterfaceC2254611DMl;
import X.InterfaceC2254701DMu;
import X.ThreadFactoryC638870P4b;
import Y.ARunnableS102S0200000_33;
import Y.ARunnableS9S0102000_22;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TELogcat;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VESize;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: loaded from: classes36.dex */
public class VECameraCapture implements C1DIC, C1DJP, InterfaceC2254701DMu, InterfaceC1287190jbJ {
    public VECameraSettings LL;
    public C1DJ6 LLILLJJLI;
    public C1DJ6 LLILLL;
    public Context LLILZ;
    public InterfaceC1780750wRN LLIZ;
    public InterfaceC2186091Ah5 LLIZLLLIL;
    public InterfaceC2254611DMl LLJ;
    public C1664350tPd<C2185991Agv> LLJIJIL;
    public final TECameraCapture LLJILJIL;
    public C2183531Acx LLJJJ;
    public C1DJ9 LLJJJIL;
    public final VESize LLILZIL = new VESize(1280, 720);
    public final VESize LLILZLL = new VESize(960, 720);
    public InterfaceC2183541Acy LLJI = null;
    public final AtomicBoolean LLJILJILJ = new AtomicBoolean(false);
    public long LLJILLL = 0;
    public long LLJJ = 0;
    public boolean LLJJI = false;
    public boolean LLJJIII = true;
    public final ExecutorService LLJJIJI = C786410Ut5.i4(new ThreadFactoryC638870P4b(0));
    public final Object LLJJIJIIJIL = new Object();
    public final C1DJA LLJJIJIL = new C1DJA(this);

    @Override // X.C1DIC
    public final int LIZ() {
        return LJJJZ(false);
    }

    @Override // X.C1DIC
    public final void Q3() {
        this.LLJILJIL.setDeviceRotation(-1);
    }

    @Override // X.C1DIC
    public final long S3() {
        return this.LLJILJIL.getAvgExpTime(true);
    }

    @Override // X.InterfaceC2254701DMu
    public final boolean LJII() {
        InterfaceC1780750wRN interfaceC1780750wRN = this.LLIZ;
        if (interfaceC1780750wRN == null) {
            return false;
        }
        interfaceC1780750wRN.LJII();
        return false;
    }

    public final void LJJIII() {
        C1311120kDu.LIZ("VECameraCapture-destroy");
        this.LLIZ = null;
        this.LLJJJIL = null;
        this.LLIZLLLIL = null;
        this.LLILZ = null;
        this.LLJJJ = null;
        C1DJ6 c1dj6 = this.LLILLJJLI;
        if (c1dj6 != null) {
            c1dj6.LL = null;
            c1dj6.LLLF.clear();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[destroy] clean camera params: ");
            sbLIZ.append(this.LLILLJJLI);
            C2484209oO.LJI("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLJJLI = null;
        }
        C1DJ6 c1dj62 = this.LLILLL;
        if (c1dj62 != null) {
            c1dj62.LL = null;
            c1dj62.LLLF.clear();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[destroy] clean temp camera params: ");
            sbLIZ2.append(this.LLILLL);
            C2484209oO.LJI("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLILLL = null;
        }
        TECameraCapture.registerLogOutput(C2484209oO.LIZIZ, null);
        TECameraCapture.registerMonitor(this.LLJILJIL, null);
        TECameraCapture.registerException(null);
        C1311120kDu.LIZIZ();
    }

    public final void LJJIIJZLJL() {
        JSONObject cameraCapabilitiesForBytebench = this.LLJILJIL.getCameraCapabilitiesForBytebench(new C2186321AhS(this));
        if (cameraCapabilitiesForBytebench == null || cameraCapabilitiesForBytebench.length() <= 0) {
            return;
        }
        if (VEConfigCenter.getInstance().getValue("ve_move_camera_capability_report_bytebench_to_background_thread", false).booleanValue()) {
            this.LLJJIJI.execute(new ARunnableS102S0200000_33(this, cameraCapabilitiesForBytebench, 22));
            return;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("VECameraCapture", "cameraThreadOptimization Bytebench reports on camera thread.");
        LJJJJLI(cameraCapabilitiesForBytebench);
    }

    public final C1286570jaJ LJJIIZ() {
        return this.LLJILJIL.getCameraECInfo();
    }

    public final VECameraSettings.CAMERA_FACING_ID LJJIIZI() {
        return this.LL.getCameraFacing();
    }

    public final float LJJIJ() {
        return this.LLJILJIL.getCameraFps();
    }

    public final int LJJIJIIJI() {
        return this.LLJILJIL.getCameraState();
    }

    public final int LJJJ() {
        return this.LLJILJIL.getSessionCameraFpsEligibleCount();
    }

    public final int LJJJI() {
        return this.LLJILJIL.getSessionCameraFpsLowerCount();
    }

    public final int LJJJIL() {
        return this.LLJILJIL.getSessionCameraFpsRestoreCount();
    }

    public final int LJJJJ() {
        return this.LLJILJIL.getSessionCameraFpsUpdateCount();
    }

    public final boolean LJJJJI() {
        return this.LLJILJIL.isSupportedExposureCompensation();
    }

    public final boolean LJJJJIZL() {
        return this.LLJILJIL.isTorchSupported();
    }

    public final void LJJJJJ() {
        C2484209oO.LJI("VECameraCapture", "newSurfaceTexture...");
        this.LLJJI = true;
    }

    public final void LJJJJJL() {
        C2484209oO.LJI("VECameraCapture", "onBackGround");
        this.LLJILJIL.changeAppLifeCycle(true);
    }

    public final void LJJJJL() {
        C2484209oO.LJI("VECameraCapture", "onForeGround");
        this.LLJILJIL.changeAppLifeCycle(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01df A[PHI: r1
      0x01df: PHI (r1v13 boolean) = (r1v12 boolean), (r1v15 boolean) binds: [B:54:0x01b0, B:56:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJJLZIJ() {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VECameraCapture.LJJJLZIJ():int");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.1Acx] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.1DJ9] */
    public VECameraCapture() {
        C1DJ8 c1dj8 = new C1DJ8(this);
        this.LLJJJ = new InterfaceC1271000jBC() { // from class: X.1Acx
            @Override // X.InterfaceC1271000jBC
            public final TEFrameSizei LJJJ(List<TEFrameSizei> list) {
                if (this.LL.LLJI == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (TEFrameSizei tEFrameSizei : list) {
                    arrayList.add(new VESize(tEFrameSizei.width, tEFrameSizei.height));
                }
                VESize vESizeLIZ = this.LL.LLJI.LIZ(arrayList);
                if (vESizeLIZ == null) {
                    return null;
                }
                TEFrameSizei tEFrameSizei2 = new TEFrameSizei();
                tEFrameSizei2.width = vESizeLIZ.width;
                tEFrameSizei2.height = vESizeLIZ.height;
                return tEFrameSizei2;
            }
        };
        this.LLJJJIL = new C1DJU() { // from class: X.1DJ9
        };
        this.LLJILJIL = new TECameraCapture(this, c1dj8);
    }

    public static boolean LJJIJIL() {
        return VEConfigCenter.getInstance().getValue("ve_support_camera_multicam_zoom", true).booleanValue();
    }

    @Override // X.InterfaceC2185971Agt
    public final VECameraSettings LIZIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC2185971Agt
    public final VESize LJIIJ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC2185971Agt
    public final VESize N2() {
        return this.LLILZIL;
    }

    public static int LJJIFFI(VECameraSettings.CAMERA_FACING_ID camera_facing_id) {
        switch (C1A83.LIZ[camera_facing_id.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            default:
                return 8;
        }
    }

    @Override // X.C1DIC
    public final int LJ(Cert cert) {
        boolean z = this.LLJILJILJ.get();
        int cameraState = this.LLJILJIL.getCameraState();
        C1DJ6 c1dj6 = this.LLILLL;
        if (c1dj6 != null && this.LL != null) {
            TEFrameSizei tEFrameSizei = c1dj6.LLJJJIL;
            if (tEFrameSizei.width > 0 && tEFrameSizei.height > 0) {
                if (!this.LLJILJILJ.get()) {
                    C1DJC.LIZ = System.currentTimeMillis();
                }
                if (this.LLILLL.LLILLJJLI != this.LL.getCameraType().ordinal()) {
                    this.LLILLL = LJJII(this.LL);
                }
                C2484209oO.LJI("VECameraCapture", "CAMERA_COST VECameraCapture open");
                C1311120kDu.LIZ("VECamera-VECameraCapture-open");
                int iConnect = this.LLJILJIL.connect(this.LLILLL, cert);
                if (iConnect == 0) {
                    this.LLILLJJLI = this.LLILLL;
                }
                C1311120kDu.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("open, result = ");
                sbLIZ.append(iConnect);
                sbLIZ.append(", connectedBefore = ");
                sbLIZ.append(z);
                sbLIZ.append(", connectedAfter = ");
                sbLIZ.append(this.LLJILJILJ.get());
                sbLIZ.append(", stateBefore = ");
                sbLIZ.append(cameraState);
                sbLIZ.append(", stateAfter = ");
                sbLIZ.append(this.LLJILJIL.getCameraState());
                sbLIZ.append(", tempSettings = ");
                sbLIZ.append(this.LLILLL);
                C2484209oO.LJI("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ));
                return iConnect;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("open, result = -100, reason = invalid preview size, connectedBefore = ");
            sbLIZ2.append(z);
            sbLIZ2.append(", connectedAfter = ");
            sbLIZ2.append(this.LLJILJILJ.get());
            sbLIZ2.append(", stateBefore = ");
            sbLIZ2.append(cameraState);
            sbLIZ2.append(", stateAfter = ");
            sbLIZ2.append(this.LLJILJIL.getCameraState());
            sbLIZ2.append(", tempSettings = ");
            sbLIZ2.append(this.LLILLL);
            C2484209oO.LJIIIIZZ("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ2));
            return -100;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("VECameraCapture", "mCameraParams == null, please init VECameraCapture!");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("open, result = -105, reason = camera settings not initialized, connectedBefore = ");
        sbLIZ3.append(z);
        sbLIZ3.append(", connectedAfter = ");
        sbLIZ3.append(this.LLJILJILJ.get());
        sbLIZ3.append(", stateBefore = ");
        sbLIZ3.append(cameraState);
        sbLIZ3.append(", stateAfter = ");
        sbLIZ3.append(this.LLJILJIL.getCameraState());
        C2484209oO.LJI("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ3));
        return -105;
    }

    @Override // X.C1DIC
    public final void LJFF(C1DIE c1die) {
        this.LLIZLLLIL = c1die;
    }

    @Override // X.C1DIC
    public final void LJI(C1DIP c1dip) {
        this.LLIZ = c1dip;
    }

    @Override // X.C1DIC
    public final float[] LJIIIZ(InterfaceC2186211AhH interfaceC2186211AhH) {
        return this.LLJILJIL.getFOV(interfaceC2186211AhH);
    }

    @Override // X.InterfaceC2185971Agt
    public final void LJIIJJI(int i) {
        this.LLJILJIL.updateTextureId(i);
    }

    @Override // X.InterfaceC2185971Agt
    public final int LJIILIIL(C1664350tPd<C2185991Agv> c1664350tPd) {
        this.LLJIJIL = c1664350tPd;
        if (c1664350tPd != null && !c1664350tPd.LIZLLL()) {
            C2484209oO.LIZ("VECameraCapture", "start with TECapturePipeline list");
            C1311120kDu.LIZ("[FF]VECamera-VECameraCapture-start");
            int iLJJJLZIJ = LJJJLZIJ();
            C1311120kDu.LIZIZ();
            return iLJJJLZIJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start, result = -100, reason = empty TECapturePipeline list, connected = ");
        sbLIZ.append(this.LLJILJILJ.get());
        sbLIZ.append(", state = ");
        sbLIZ.append(this.LLJILJIL.getCameraState());
        C2484209oO.LIZJ("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ));
        return -100;
    }

    @Override // X.C1DJP
    public final void LJIILJJIL(int i) {
        InterfaceC2186091Ah5 interfaceC2186091Ah5 = this.LLIZLLLIL;
        if (interfaceC2186091Ah5 != null) {
            interfaceC2186091Ah5.onInfo(5, 0, "Camera is closed!");
        }
    }

    @Override // X.InterfaceC2185971Agt
    public final void LJIILLIIL(boolean z) {
        if (z) {
            this.LLJILJIL.startRecording();
        } else {
            this.LLJILJIL.stopRecording();
        }
    }

    public final void LJIIZILJ(VESize vESize) {
        boolean z;
        if (this.LL.isBindSurfaceLifecycleToCamera() && this.LL.getCameraType() != VECameraSettings.CAMERA_TYPE.TYPE1) {
            z = true;
            TECameraCapture tECameraCapture = this.LLJILJIL;
            if (tECameraCapture != null) {
                tECameraCapture.abortSession();
            }
            LIZ();
        } else {
            z = false;
            LJJJZ(true);
        }
        C1664350tPd<C2185991Agv> c1664350tPd = this.LLJIJIL;
        if (c1664350tPd != null) {
            Iterator<C2185991Agv> it2 = c1664350tPd.LIZJ().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C2185991Agv next = it2.next();
                if (next.LIZLLL) {
                    next.LIZIZ = new TEFrameSizei(vESize.height, vESize.width);
                    break;
                }
            }
        }
        C1DJ6 c1dj6 = this.LLILLJJLI;
        if (c1dj6 != null) {
            VESize vESize2 = this.LLILZIL;
            vESize2.width = vESize.height;
            int i = vESize.width;
            vESize2.height = i;
            TEFrameSizei tEFrameSizei = c1dj6.LLJJJIL;
            tEFrameSizei.width = vESize.height;
            tEFrameSizei.height = i;
        } else {
            C2484209oO.LIZJ("VECameraCapture", "setPreviewSize failed: params is null!");
        }
        if (!z || this.LLILLJJLI.LLLLLZL) {
            LJJJJJ();
        }
        LJJJLZIJ();
        this.LL.setPreviewSize(vESize.width, vESize.height);
    }

    public final void LJIJJLI(VECameraSettings vECameraSettings) {
        boolean z;
        if (this.LLILLJJLI != null && vECameraSettings != null) {
            boolean z2 = true;
            if (this.LL.getEnableHDR10BitRecord() == vECameraSettings.getEnableHDR10BitRecord() && this.LL.getDynamicRangeProfile() == vECameraSettings.getDynamicRangeProfile()) {
                z = false;
            } else {
                z = true;
            }
            if (this.LL.getPreviewSize().equals(vECameraSettings.getPreviewSize()) && this.LL.getSecondaryPreviewSize().equals(vECameraSettings.getSecondaryPreviewSize())) {
                z2 = false;
            }
            C1DJC.LIZIZ = System.currentTimeMillis();
            this.LL = vECameraSettings;
            LJJLIIIJL(this.LLILLJJLI, vECameraSettings);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changePreview, preview size = ");
            sbLIZ.append(vECameraSettings.getPreviewSize());
            C2484209oO.LJI("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ));
            if (VEConfigCenter.getInstance().getValue("ve_enable_multi_capture_pipeline", false).booleanValue() && this.LL.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE2) {
                LJIJ(vECameraSettings.getPreviewSize(), vECameraSettings.getSecondaryPreviewSize(), z, z2);
            } else {
                LJIIZILJ(vECameraSettings.getPreviewSize());
            }
        }
    }

    public final boolean LJIL(VESize vESize) {
        C1DJC.LIZIZ = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VECameraCapture-changePreviewSize(w");
        sbLIZ.append(vESize.width);
        sbLIZ.append(",h");
        sbLIZ.append(vESize.height);
        sbLIZ.append(")");
        C1311120kDu.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LL.getPreviewSize().equals(vESize)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("changePreviewSize, size = ");
            sbLIZ2.append(vESize);
            C2484209oO.LJI("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ2));
            if (VEConfigCenter.getInstance().getValue("ve_enable_multi_capture_pipeline", false).booleanValue()) {
                if (vESize.equals(this.LLILZIL)) {
                    LJIJ(vESize, this.LLILZLL, false, false);
                } else {
                    LJIJ(vESize, this.LLILZIL, false, true);
                }
            } else {
                LJIIZILJ(vESize);
            }
            C1311120kDu.LIZIZ();
            return true;
        }
        C1311120kDu.LIZIZ();
        return false;
    }

    public final int LJJ(Cert cert) {
        boolean z = this.LLJILJILJ.get();
        int cameraState = this.LLJILJIL.getCameraState();
        C1311120kDu.LIZ("VECameraCapture-close(cert)");
        this.LLJILJILJ.set(false);
        int iDisConnect = this.LLJILJIL.disConnect(cert);
        C1311120kDu.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("close, result = ");
        sbLIZ.append(iDisConnect);
        sbLIZ.append(", connectedBefore = ");
        sbLIZ.append(z);
        sbLIZ.append(", connectedAfter = ");
        sbLIZ.append(this.LLJILJILJ.get());
        sbLIZ.append(", stateBefore = ");
        sbLIZ.append(cameraState);
        sbLIZ.append(", stateAfter = ");
        sbLIZ.append(this.LLJILJIL.getCameraState());
        C2484209oO.LJI("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ));
        return iDisConnect;
    }

    public final C1DJ6 LJJII(VECameraSettings vECameraSettings) {
        if (vECameraSettings == null) {
            return null;
        }
        C1DJ6 c1dj6 = new C1DJ6(this.LLILZ);
        LJJLIIIJL(c1dj6, vECameraSettings);
        return c1dj6;
    }

    public final int LJJIIJ(final VEFocusSettings vEFocusSettings) {
        C1DJG c1djg = new C1DJG(vEFocusSettings.getWidth(), vEFocusSettings.getHeight(), vEFocusSettings.getX(), vEFocusSettings.getY(), vEFocusSettings.getDisplayDensity());
        c1djg.LJI = vEFocusSettings.isNeedFocus();
        c1djg.LJII = vEFocusSettings.isNeedMetering();
        c1djg.LJIIIIZZ = vEFocusSettings.isLock();
        c1djg.LJIIIZ = vEFocusSettings.isFromUser();
        c1djg.LJIIJ = vEFocusSettings.getCoordinatesMode();
        vEFocusSettings.getCameraFocusArea();
        vEFocusSettings.getCameraMeteringArea();
        if (vEFocusSettings.getFocusCallback() != null) {
            c1djg.LJIIJJI = new InterfaceC2189431AmT() { // from class: X.0nFE
                @Override // X.InterfaceC2189431AmT
                public final void LIZ(int i, int i2, String str) {
                    C1425400nCE c1425400nCE = (C1425400nCE) vEFocusSettings.getFocusCallback();
                    SafeHandler safeHandler = c1425400nCE.LIZ.get();
                    if (safeHandler != null) {
                        safeHandler.post(new ARunnableS9S0102000_22(c1425400nCE, i, i2, 1));
                    }
                }
            };
        }
        return this.LLJILJIL.focusAtPoint(c1djg);
    }

    public final String LJJIJIIJIL(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    switch (i) {
                        case 8:
                            return "xiaomi_camera";
                        case BdTuring.TYPE_ECAF /* 9 */:
                            return "oppo_camera";
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            return "huawei_camera";
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            return "oppo_camera_unit";
                        default:
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("unknown_camera_");
                            sbLIZ.append(i);
                            return C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                return "oppo_camera_media";
            }
            return "camera2";
        }
        return "camera1";
    }

    public final int LJJIJL(C1DIL c1dil) {
        return this.LLJILJIL.getISO(c1dil);
    }

    public final float LJJIJLIJ(boolean z) {
        return this.LLJILJIL.getSessionAverageCameraFPS(z);
    }

    public final float LJJIL(boolean z) {
        return this.LLJILJIL.getSessionAverageExposureTime(z);
    }

    public final float LJJIZ(boolean z) {
        return this.LLJILJIL.getSessionAverageISO(z);
    }

    public final void LJJJJLI(JSONObject jSONObject) {
        try {
            jSONObject.putOpt("camera_type", Integer.valueOf(this.LLILLJJLI.LLILLJJLI));
            jSONObject.putOpt("camera_facing", Integer.valueOf(this.LLILLJJLI.LLILZ));
            jSONObject.putOpt("camera_ai_night_video", Integer.valueOf(VEConfigCenter.getInstance().getValue("ve_camera_ai_augmentation", 0)));
            jSONObject.putOpt("camera_multicamera_zoom", Boolean.valueOf(LJJIJIL()));
            C212350188e.LIZJ().getClass();
            C21309418aK.LIZ("bytebench_camera", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJJJLL(boolean z) {
        this.LLJILJIL.setCaptureMode(z);
    }

    public final void LJJJJZ(int i) {
        this.LLJILJIL.setExposureCompensation(i);
    }

    public final void LJJJJZI(Bundle bundle) {
        this.LLJILJIL.setFeatureParameters(bundle);
    }

    public final void LJJJLIIL(C1649180t1A c1649180t1A) {
        C2183531Acx c2183531Acx;
        this.LLJI = c1649180t1A;
        TECameraCapture tECameraCapture = this.LLJILJIL;
        if (c1649180t1A != null) {
            c2183531Acx = this.LLJJJ;
        } else {
            c2183531Acx = null;
        }
        tECameraCapture.registerPreviewListener(c2183531Acx);
    }

    public final void LJJJLL(InterfaceC1673870tez interfaceC1673870tez) {
        TECameraCapture tECameraCapture = this.LLJILJIL;
        if (tECameraCapture != null) {
            tECameraCapture.setSATZoomCallback(this.LLJJJIL);
        }
    }

    public final int LJJJZ(boolean z) {
        boolean z2 = this.LLJILJILJ.get();
        int cameraState = this.LLJILJIL.getCameraState();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VECameraCapture-stopPreview sync=");
        sbLIZ.append(z);
        C1311120kDu.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        int iStop = this.LLJILJIL.stop(z);
        C1311120kDu.LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("stopPreview, sync = ");
        sbLIZ2.append(z);
        sbLIZ2.append(", result = ");
        sbLIZ2.append(iStop);
        sbLIZ2.append(", connectedBefore = ");
        sbLIZ2.append(z2);
        sbLIZ2.append(", connectedAfter = ");
        sbLIZ2.append(this.LLJILJILJ.get());
        sbLIZ2.append(", stateBefore = ");
        sbLIZ2.append(cameraState);
        sbLIZ2.append(", stateAfter = ");
        sbLIZ2.append(this.LLJILJIL.getCameraState());
        C2484209oO.LJI("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ2));
        return iStop;
    }

    public final int LJJLIIIIJ(VECameraSettings.CAMERA_FLASH_MODE camera_flash_mode) {
        int i;
        if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF) {
            i = 0;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_ON) {
            i = 1;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO) {
            i = 3;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH) {
            i = 2;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_RED_EYE) {
            i = 4;
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_EXTERNAL) {
            i = 5;
        } else {
            return -100;
        }
        return this.LLJILJIL.switchFlashMode(i);
    }

    public final void LJJLIIIJILLIZJL(Cert cert) {
        if (!this.LLJILJILJ.get()) {
            C2484209oO.LIZJ("VECameraCapture", "Camera server is not connected now!!");
            return;
        }
        int cameraState = this.LLJILJIL.getCameraState();
        if (cameraState != 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("click to switch normal camera, camera state = ");
            sbLIZ.append(cameraState);
            C2484209oO.LIZJ("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1DJ6 c1dj6 = this.LLILLJJLI;
        c1dj6.LLLII = true;
        LJJLIIIJJIZ(c1dj6);
        LJJJJJ();
        this.LLJILJIL.switchCamera(this.LLILLJJLI, cert);
    }

    public final void LJJLIIIJJI(boolean z) {
        this.LLJILJIL.toggleTorch(z);
    }

    public final void LJJLIIIJJIZ(C1DJ6 c1dj6) {
        int cameraState = this.LLJILJIL.getCameraState();
        boolean z = false;
        if (cameraState != 3) {
            boolean z2 = c1dj6.LLLII;
            c1dj6.LLLII = false;
            z = z2;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryWaitSwitchTask, state: ");
        sbLIZ.append(cameraState);
        C2183341Ace.LIZIZ("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            synchronized (this.LLJJIJIIJIL) {
                int i2 = 10;
                while (true) {
                    try {
                        TECameraCapture tECameraCapture = this.LLJILJIL;
                        if (tECameraCapture == null || tECameraCapture.getCameraState() == 3 || i2 <= 0) {
                            break;
                        }
                        i2--;
                        try {
                            this.LLJJIJIIJIL.wait(100);
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        int i3 = C2187451AjH.LIZ;
                        C2183341Ace.LJ("VECameraCapture", "wait switch task, to mode: " + c1dj6.LLJZIJLIL + ", try block...count:" + i2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    @Override // X.C1DIC
    public final C2185991Agv LJIIIIZZ(VESize vESize, boolean z) {
        C1664350tPd<C2185991Agv> c1664350tPd = this.LLJIJIL;
        if (c1664350tPd != null) {
            for (C2185991Agv c2185991Agv : c1664350tPd.LIZJ()) {
                if (c2185991Agv.LIZLLL) {
                    TEFrameSizei tEFrameSizei = c2185991Agv.LIZIZ;
                    if (tEFrameSizei.width == vESize.width && tEFrameSizei.height == vESize.height && c2185991Agv.LJ == z) {
                        return c2185991Agv;
                    }
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.C1DIC
    public final void LJIIL(Context context, VECameraSettings vECameraSettings) {
        C1311120kDu.LIZ("VECamera-VECameraCapture-init");
        this.LLILZ = context;
        this.LL = vECameraSettings;
        C1DJ6 c1dj6LJJII = LJJII(vECameraSettings);
        C1DJ6 c1dj6 = this.LLILLJJLI;
        boolean z = true;
        if (c1dj6 != null && c1dj6LJJII != null && c1dj6.LLJZIJLIL == 2) {
            if (c1dj6LJJII.LLILLJJLI != 2) {
                c1dj6LJJII.LLILLJJLI = 2;
            }
            c1dj6LJJII.LLJZIJLIL = 2;
            c1dj6LJJII.LLLLZLL = c1dj6.LLLLZLL;
            c1dj6LJJII.LLJIJIL = true;
            c1dj6LJJII.LLLII = true;
        }
        this.LLILLL = c1dj6LJJII;
        TECameraCapture.registerLogOutput(C2484209oO.LIZIZ, new InterfaceC1305670k57() { // from class: X.1Acg
            @Override // X.InterfaceC1305670k57
            public final void LIZ(byte b, String str, String str2) {
                TELogcat.nativeLog(b, str, str2);
            }
        });
        TECameraCapture.registerMonitor(this.LLJILJIL, new InterfaceC1305720k5C() { // from class: X.0k59
            @Override // X.InterfaceC1305720k5C
            public final void LJFF(String str, String str2) {
                if (str == "te_record_camera_runtime_info") {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        C1305700k5A.LIZJ("AvgFps", jSONObject.get("AvgFps").toString());
                        C1305700k5A.LIZJ("avgExposureTime", jSONObject.get("avgExposureTime").toString());
                        C1305700k5A.LIZJ("AvgISO", jSONObject.get("AvgISO").toString());
                        C1305700k5A.LIZJ("AvgCaptureResultFPS", jSONObject.get("AvgCaptureResultFPS").toString());
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i = C2187451AjH.LIZ;
                        C2183341Ace.LIZJ("perfString", "Catch exception! ", e);
                        return;
                    }
                }
                C1305700k5A.LIZJ(str, str2);
            }

            @Override // X.InterfaceC1305720k5C
            public final void LJI(long j, String str) {
                C1305700k5A.LIZIZ(j, str);
            }

            @Override // X.InterfaceC1305720k5C
            public final void LJII(double d, String str) {
                C1305700k5A.LIZ(str, d);
            }
        });
        TECameraCapture.registerException(new C1DJJ() { // from class: X.1Alz
            @Override // X.C1DJJ
            public final void onException(Throwable th) {
                InterfaceC2189121Aly interfaceC2189121Aly;
                WeakReference<InterfaceC2189121Aly> weakReference = C2189081Alu.LIZ;
                if (weakReference != null && (interfaceC2189121Aly = weakReference.get()) != null) {
                    interfaceC2189121Aly.onException(th);
                }
            }
        });
        if (VEConfigCenter.getInstance().getValue("ve_enable_camera_thread_cleanup", false).booleanValue() && Math.random() > VEConfigCenter.getInstance().getValue("ve_bytebench_camera_capabilities_report_sampling_rate", 1.0f)) {
            z = false;
        }
        this.LLJJIII = z;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cameraThreadOptimization mShouldReportCameraCapabilitiesToBytebench: ");
        sbLIZ.append(this.LLJJIII);
        C2183341Ace.LIZ("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ));
        C1311120kDu.LIZIZ();
    }

    @Override // X.InterfaceC2185971Agt
    public final void LJIILL(int i, int i2) {
        this.LLJILJIL.updateTextureId(i, i2);
    }

    public final int LJJI(boolean z, Cert cert) {
        boolean z2 = this.LLJILJILJ.get();
        int cameraState = this.LLJILJIL.getCameraState();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VECameraCapture-close(async=");
        sbLIZ.append(z);
        sbLIZ.append(",cert)");
        C1311120kDu.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJILJ.set(false);
        int iDisConnect = this.LLJILJIL.disConnect(!z, cert);
        C1311120kDu.LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("close, async = ");
        sbLIZ2.append(z);
        sbLIZ2.append(", result = ");
        sbLIZ2.append(iDisConnect);
        sbLIZ2.append(", connectedBefore = ");
        sbLIZ2.append(z2);
        sbLIZ2.append(", connectedAfter = ");
        sbLIZ2.append(this.LLJILJILJ.get());
        sbLIZ2.append(", stateBefore = ");
        sbLIZ2.append(cameraState);
        sbLIZ2.append(", stateAfter = ");
        sbLIZ2.append(this.LLJILJIL.getCameraState());
        C2484209oO.LJI("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ2));
        return iDisConnect;
    }

    public final int LJJL(VECameraSettings.CAMERA_FACING_ID camera_facing_id, Cert cert) {
        C1DJ6 c1dj6;
        C1311120kDu.LIZ("VECameraCapture-switchCamera(facing, cert)");
        System.currentTimeMillis();
        if (!this.LLJILJILJ.get()) {
            C2484209oO.LIZJ("VECameraCapture", "Camera server is not connected now!!");
            C1311120kDu.LIZIZ();
            return -105;
        }
        if (this.LL.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_GNOB || ((c1dj6 = this.LLILLJJLI) != null && c1dj6.LLLLLZIL)) {
            LJJJJJ();
        }
        this.LLJILJILJ.set(false);
        int iSwitchCamera = this.LLJILJIL.switchCamera(LJJIFFI(camera_facing_id), cert);
        C1311120kDu.LIZIZ();
        return iSwitchCamera;
    }

    public final int LJJLI(VECameraSettings vECameraSettings, Cert cert) {
        C1DJ6 c1dj6;
        C1311120kDu.LIZ("VECameraCapture-switchCamera(setting, cert)");
        C1DJ6 c1dj62 = this.LLILLJJLI;
        if (c1dj62 != null && c1dj62.LLJZIJLIL == 2) {
            LJJJJJ();
        }
        System.currentTimeMillis();
        this.LL = vECameraSettings;
        this.LLILLL = LJJII(vECameraSettings);
        if (this.LL.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_GNOB || ((c1dj6 = this.LLILLL) != null && c1dj6.LLLLLZIL)) {
            LJJJJJ();
        }
        int iSwitchCamera = this.LLJILJIL.switchCamera(this.LLILLL, cert);
        if (iSwitchCamera == 0) {
            this.LLILLJJLI = this.LLILLL;
        }
        C1311120kDu.LIZIZ();
        return iSwitchCamera;
    }

    public final void LJJLIIIJ(C1AIY c1aiy, Cert cert) {
        if (!this.LLJILJILJ.get()) {
            C2484209oO.LIZJ("VECameraCapture", "Camera server is not connected now!!");
            return;
        }
        C1DJ6 c1dj6LJJII = LJJII(this.LL);
        this.LLILLL = c1dj6LJJII;
        if (c1dj6LJJII == null) {
            C2484209oO.LIZJ("VECameraCapture", "click to switch ar camera failed, cameraParams is null");
            return;
        }
        if (c1dj6LJJII.LLILLJJLI == 1) {
            C2484209oO.LIZJ("VECameraCapture", "click to switch ar camera failed, not support camera type");
            return;
        }
        int cameraState = this.LLJILJIL.getCameraState();
        if (cameraState != 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("click to switch ar camera, camera state = ");
            sbLIZ.append(cameraState);
            C2484209oO.LIZJ("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ));
        }
        LJJJJJ();
        C1DJ6 c1dj6 = this.LLILLL;
        if (c1dj6.LLILLJJLI != 2) {
            c1dj6.LLILLJJLI = 2;
        }
        c1dj6.LLJZIJLIL = 2;
        c1dj6.LLLLZLL = c1aiy;
        c1dj6.LLJIJIL = true;
        c1dj6.LLLII = true;
        LJJLIIIJJIZ(c1dj6);
        if (this.LLJILJIL.switchCamera(this.LLILLL, cert) == 0) {
            this.LLILLJJLI = this.LLILLL;
        }
    }

    public final void LJJLIIIJL(C1DJ6 c1dj6, VECameraSettings vECameraSettings) {
        boolean z;
        vECameraSettings.getCameraFaceDetect();
        vECameraSettings.getCameraVideoModeTemplate();
        c1dj6.LLILLJJLI = vECameraSettings.getCameraType().ordinal();
        c1dj6.LLILZ = LJJIFFI(vECameraSettings.getCameraFacing());
        c1dj6.LLLFFI = vECameraSettings.getCameraHardwareID();
        c1dj6.LLL = vECameraSettings.getHwLevel().ordinal();
        c1dj6.LLJJJIL.width = vECameraSettings.getPreviewSize().height;
        c1dj6.LLJJJIL.height = vECameraSettings.getPreviewSize().width;
        c1dj6.LLJJJJ.width = vECameraSettings.getSecondaryPreviewSize().height;
        c1dj6.LLJJJJ.height = vECameraSettings.getSecondaryPreviewSize().width;
        c1dj6.LLLJL = vECameraSettings.getEnableStabilization();
        c1dj6.LLLL = vECameraSettings.getStabilizationMode();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createInternalSettings settings.mEnableStabilization = ");
        sbLIZ.append(c1dj6.LLLJL);
        C2484209oO.LJI("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ));
        c1dj6.LLJLLIL = vECameraSettings.isUseMaxWidthTakePicture();
        c1dj6.LLJLL = vECameraSettings.getMaxWidthTakePictureSizeAccuracy();
        c1dj6.LLJJJJLIIL = vECameraSettings.getMaxWidth();
        c1dj6.LLJZIJLIL = vECameraSettings.getCamera2OutputMode().ordinal();
        VESize vESize = this.LLILZIL;
        TEFrameSizei tEFrameSizei = c1dj6.LLJJJIL;
        vESize.width = tEFrameSizei.width;
        vESize.height = tEFrameSizei.height;
        VESize vESize2 = this.LLILZLL;
        TEFrameSizei tEFrameSizei2 = c1dj6.LLJJJJ;
        vESize2.width = tEFrameSizei2.width;
        vESize2.height = tEFrameSizei2.height;
        c1dj6.LLLI = vECameraSettings.getEnableFallback();
        c1dj6.LLJ = vECameraSettings.getEnableZsl();
        c1dj6.LLJJL = vECameraSettings.getRetryCnt();
        c1dj6.LLJJLIIIJLLLLLLLZ = vECameraSettings.getmRetryStartPreviewCnt();
        c1dj6.LLJL = vECameraSettings.getCamera2RetryCnt();
        c1dj6.LLJLIL = vECameraSettings.getEnableHDR10BitRecord();
        c1dj6.LLJLILLLLZIIL = vECameraSettings.getDynamicRangeProfile();
        c1dj6.LLLLII = vECameraSettings.getFpsMode();
        c1dj6.LLLIIII = vECameraSettings.getCameraFrameRateStrategy().ordinal();
        c1dj6.LLLF = vECameraSettings.getExtParameters();
        c1dj6.LLLLILI = vECameraSettings.getCaptureFlashStrategy().ordinal();
        C2183321Acc.LJIIIIZZ = vECameraSettings.getOptionFlag();
        c1dj6.LLLIIIIL = vECameraSettings.getIsUseHint();
        c1dj6.LLLIIIL = vECameraSettings.getEnableSurfaceSharing();
        c1dj6.LLLJ = vECameraSettings.getIsCameraOpenCloseSync();
        c1dj6.LLLJIL = vECameraSettings.getIsForceCloseCamera();
        vECameraSettings.getFocusTimeout();
        c1dj6.LLLLIIIILLL = vECameraSettings.getEnableGcForCameraMetadataThreshold();
        c1dj6.LLLLIIL = vECameraSettings.getFpsMaxLimit();
        c1dj6.LLLLIILL = vECameraSettings.isOptCameraSceneFps();
        c1dj6.LLJI = vECameraSettings.getEnableManualReleaseCaptureResult();
        c1dj6.LLJIJIL = vECameraSettings.isSyncModeOnCamera2();
        c1dj6.LLJILJILJ = vECameraSettings.isEnableRefactorFocusAndMeter();
        c1dj6.LLJILLL = VEConfigCenter.getInstance().getValue("ve_enable_camera2_monitor_gyroscope", false).booleanValue();
        c1dj6.LLJJJ = vECameraSettings.getCameraZoomLimitFactor();
        c1dj6.LLJILJIL = vECameraSettings.getWideFOV();
        vECameraSettings.getCameraCaptureHdrFromCenter();
        if (vECameraSettings.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_RDHW) {
            c1dj6.LLJJ = !vECameraSettings.getCameraRDHWRecordDisableFromCenter();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("settings.mStartRecord = ");
            sbLIZ2.append(c1dj6.LLJJ);
            C2484209oO.LIZ("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ2));
            if (vECameraSettings.getCameraFacing() == VECameraSettings.CAMERA_FACING_ID.FACING_FRONT) {
                c1dj6.LLLF.putBoolean("enable_video_stabilization", false);
                if (!vECameraSettings.getCameraHdrDisableFromCenter()) {
                    C2484209oO.LJI("VECameraCapture", "ENABLE_VIDEO_HDR");
                    c1dj6.LLLF.putBoolean("enable_video_hdr", true);
                }
            } else {
                if (c1dj6.LLJZIJLIL != 1) {
                    z = c1dj6.LLLJL;
                } else {
                    z = false;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("huawei stable = ");
                sbLIZ3.append(z);
                C2484209oO.LIZ("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ3));
                c1dj6.LLLF.putBoolean("enable_video_stabilization", z);
                if (vECameraSettings.getCameraNoiseReduceFromCenter()) {
                    C786410Ut5.LJJJI("noise_reduce", "fast", c1dj6.LLLF);
                }
            }
        } else if (vECameraSettings.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE_OGXM_V2) {
            vECameraSettings.getCameraCaptureMFNRFromCenter();
        }
        c1dj6.LLLLLIL = vECameraSettings.isPreferOpenCameraByCameraId();
        if (vECameraSettings.isEnablePreviewingFallback()) {
            c1dj6.LLLLJ = true;
        } else {
            c1dj6.LLLLJ = VEConfigCenter.getInstance().getValue("ve_camera_enable_previewing_fallback", c1dj6.LLLLJ).booleanValue();
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("camera previewing fallback enabled: ");
        sbLIZ4.append(c1dj6.LLLLJ);
        C2484209oO.LIZ("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ4));
        c1dj6.LLJZ = vECameraSettings.getDualCameraExtensionScheme();
        c1dj6.LLLLJI = vECameraSettings.isEnableOpenCamera1Opt();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("enable open camera1 opt : ");
        sbLIZ5.append(c1dj6.LLLLJI);
        C2484209oO.LIZ("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ5));
        c1dj6.LLLLIILLL = vECameraSettings.getEnableRecordStream();
        vECameraSettings.getEnableRecord60Fps();
        vECameraSettings.getRecordStreamFolderPath();
        int[] fpsRange = vECameraSettings.getFpsRange();
        c1dj6.LLILLL = new TEFrameRateRange(fpsRange[0], fpsRange[1]);
        c1dj6.LLLLLILLIL = vECameraSettings.isEnableForceRestartWhenCameraError();
        c1dj6.LLLLLLJ = vECameraSettings.isBindSurfaceLifecycleToCamera();
        c1dj6.LLLF.putBoolean("ve_enable_camera_devices_cache", VEConfigCenter.getInstance().getValue("ve_enable_camera_devices_cache", false).booleanValue());
        c1dj6.LLLLLLL = vECameraSettings.isEnableYuvBufferCapture();
        c1dj6.LLIZLLLIL = VEConfigCenter.getInstance().getValue("ve_enable_camera2_zsl_capture", false).booleanValue();
        c1dj6.LLLLLLLLL = VEConfigCenter.getInstance().getValue("ve_enable_camera_api2_detect", false).booleanValue();
        c1dj6.LLLLLLLLLL = VEConfigCenter.getInstance().getValue("ve_camera_zoom_ratio_max", -1.0f);
        c1dj6.LLLLLLLZIL = VEConfigCenter.getInstance().getValue("ve_camera_zoom_ratio_min", -1.0f);
        c1dj6.LLLLLJIL = vECameraSettings.getMetadataConfig();
        c1dj6.LLLLLJLJLL = VEConfigCenter.getInstance().getValue("ve_enable_camera2_deferred_surface", false).booleanValue();
        c1dj6.LLLLLLZ = VEConfigCenter.getInstance().getValue("ve_enable_collect_camera_capbilities", false).booleanValue();
        c1dj6.LLLLLLZZ = vECameraSettings.getDefaultZoomRatio();
        c1dj6.LLLLLZ = vECameraSettings.getDefaultZoomUsingZoomV2();
        c1dj6.LLLLLZIL = VEConfigCenter.getInstance().getValue("ve_enable_camera_switch_camera1_optimize", false).booleanValue();
        c1dj6.LLLLLZL = VEConfigCenter.getInstance().getValue("ve_enable_preview_size_change_opt1", false).booleanValue();
        c1dj6.LLLLLLIL = VEConfigCenter.getInstance().getValue("ve_enable_force_close_camera_opt", false).booleanValue();
        c1dj6.LLLLLL = VEConfigCenter.getInstance().getValue("ve_enable_camera2_abort_session_capture", false).booleanValue();
        c1dj6.LLJJI = vECameraSettings.isEnableMonitorRuntimeInfo();
        c1dj6.LLJJIJIL = vECameraSettings.getMonitorRuntimeInfoPeriod();
        c1dj6.LLLLZ = VEConfigCenter.getInstance().getValue("ve_camera_prop_cache", false).booleanValue();
        c1dj6.LLLLZLLLI = vECameraSettings.getCameraPrivacyCertMap();
        c1dj6.LLLZ = EnumC2183331Acd.values()[vECameraSettings.getPreviewSizeStrategy().ordinal()];
        c1dj6.LLJJIII = LJJIJIL();
        c1dj6.LLJJIJI = VEConfigCenter.getInstance().getValue("ve_enable_multi_camera_surface", false).booleanValue();
        c1dj6.LLJJIJIIJIL = VEConfigCenter.getInstance().getValue("ve_try_fix_crash_when_close_and_switch_flash_mode", false).booleanValue();
        c1dj6.LLLLZI = VEConfigCenter.getInstance().getValue("ve_disable_handler_message", false).booleanValue();
        c1dj6.LLLIIL = VEConfigCenter.getInstance().getValue("ve_delay_gyro", false).booleanValue();
        c1dj6.LLLIILIL = VEConfigCenter.getInstance().getValue("ve_delay_report_camera_capability", false).booleanValue();
        c1dj6.LLLLZIL = VEConfigCenter.getInstance().getValue("ve_enable_camera_focus_mode_fps", true).booleanValue();
        c1dj6.LLLIL = VEConfigCenter.getInstance().getValue("ve_camera_fps_op", false).booleanValue();
        c1dj6.LLLILZ = VEConfigCenter.getInstance().getValue("ve_restore_camera_fps_under_better_lighting", false).booleanValue();
        c1dj6.LLLILZJ = VEConfigCenter.getInstance().getValue("ve_low_light_camera_fps_lower_threshold", 10);
        c1dj6.LLLILZLLLI = VEConfigCenter.getInstance().getValue("ve_low_light_camera_fps_lower_bound_min", 15);
        c1dj6.LLLIZZ = VEConfigCenter.getInstance().getValue("ve_low_light_camera_fps_lower_bound_max", 20);
    }

    @Override // X.C1DJP
    public final void LLIIL(int i, int i2) {
        VECameraSettings.CAMERA_TYPE camera_type;
        VECameraSettings.CAMERA_FACING_ID camera_facing_id;
        String str;
        C1305710k5B.LIZ(i2, "te_record_camera_open_ret");
        C1305710k5B.LIZ(System.currentTimeMillis() - this.LLJILLL, "te_record_camera_open_cost");
        C1311120kDu.LIZ("VECameraCapture-onCaptureStarted");
        synchronized (this) {
            try {
                C1DJ6 c1dj6 = this.LLILLJJLI;
                if (c1dj6 != null) {
                    VECameraSettings vECameraSettings = this.LL;
                    int i3 = c1dj6.LLILZ;
                    if (i3 == 0) {
                        camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
                    } else if (i3 == 1) {
                        camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
                    } else if (i3 == 2) {
                        camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE;
                    } else if (i3 == 3) {
                        camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_TELEPHOTO;
                    } else if (i3 == 5) {
                        camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_REAR_WIDE;
                    } else if (i3 == 7) {
                        camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_FRONT_MAIN;
                    } else {
                        camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
                    }
                    vECameraSettings.setCameraFacing(camera_facing_id);
                    if (i == 2) {
                        str = "cameraAPI2";
                    } else if (i == 1) {
                        str = "cameraAPI1";
                    } else {
                        str = "Private API";
                    }
                    C1284730jXL.LIZIZ("te_camera_api", str);
                    if (c1dj6.LLJJJJJIL != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("width = ");
                        sbLIZ.append(c1dj6.LLJJJJJIL.width);
                        sbLIZ.append(", height = ");
                        sbLIZ.append(c1dj6.LLJJJJJIL.height);
                        C1284730jXL.LIZIZ("te_camera_texture_size", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (c1dj6.LLJJJIL != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("width = ");
                        sbLIZ2.append(c1dj6.LLJJJIL.width);
                        sbLIZ2.append(", height = ");
                        sbLIZ2.append(c1dj6.LLJJJIL.height);
                        C1284730jXL.LIZIZ("te_camera_preview_size", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        InterfaceC2186091Ah5 interfaceC2186091Ah5 = this.LLIZLLLIL;
        if (i2 == 0) {
            this.LLJILJILJ.set(true);
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        switch (i) {
                            case 8:
                                camera_type = VECameraSettings.CAMERA_TYPE.TYPE_OGXM_V2;
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                camera_type = VECameraSettings.CAMERA_TYPE.TYPE_GNOB;
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                camera_type = VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_RDHW;
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                camera_type = VECameraSettings.CAMERA_TYPE.TYPE_VENDOR_GNOB;
                                break;
                            default:
                                camera_type = VECameraSettings.CAMERA_TYPE.TYPE2;
                                break;
                        }
                    } else {
                        camera_type = VECameraSettings.CAMERA_TYPE.TYPE_GNOB_MEDIA;
                    }
                } else {
                    camera_type = VECameraSettings.CAMERA_TYPE.TYPE2;
                }
            } else {
                camera_type = VECameraSettings.CAMERA_TYPE.TYPE1;
            }
            this.LL.setCameraType(camera_type);
            this.LL.setConfigCameraType(camera_type);
            LJJJLZIJ();
            if (interfaceC2186091Ah5 != null) {
                interfaceC2186091Ah5.LIZIZ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Camera type: ");
                sbLIZ3.append(i);
                interfaceC2186091Ah5.onInfo(2, i, C2188811AlT.LIZIZ(sbLIZ3));
            }
        } else if (interfaceC2186091Ah5 != null) {
            interfaceC2186091Ah5.LIZ(i);
        }
        if (this.LL.getCameraFacing().ordinal() == 7) {
            LJIJI(i2, i, "vesdk_event_recorder_dual_camera_open_ret");
        }
        C1311120kDu.LIZIZ();
    }

    @Override // X.C1DJP
    public final void onError(int i, String str) {
        InterfaceC2186091Ah5 interfaceC2186091Ah5 = this.LLIZLLLIL;
        if (interfaceC2186091Ah5 != null) {
            if (this.LL.getCameraFacing().ordinal() == 7) {
                if (i != -409 && i != 3) {
                    if (i == -410 || i == -402) {
                        LJIJI(i, this.LL.getCameraType().ordinal(), "vesdk_event_recorder_dual_camera_preview_ret");
                    }
                } else {
                    LJIJI(i, this.LL.getCameraType().ordinal(), "vesdk_event_recorder_dual_camera_open_ret");
                }
            }
            interfaceC2186091Ah5.onError(i, str);
        }
    }

    public static void LJIJI(int i, int i2, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", i);
            jSONObject.put("cameraType", i2);
            b.LIZIZ(str, "behavior", jSONObject, true);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static JSONObject LJIJJ(long j, long j2, Integer num) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", num);
            jSONObject.put("state", num);
            jSONObject.put("duration", j2 - j);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    @Override // X.InterfaceC2254701DMu
    public final void LIZLLL(float f, int i, boolean z) {
        InterfaceC1780750wRN interfaceC1780750wRN = this.LLIZ;
        if (interfaceC1780750wRN != null) {
            interfaceC1780750wRN.LIZLLL(f, i, z);
        }
    }

    @Override // X.C1DJP
    public final void onInfo(int i, int i2, String str) {
        String[] strArrSplit;
        InterfaceC1283630jVZ interfaceC1283630jVZ;
        int i3;
        C1664350tPd<C2185991Agv> c1664350tPd;
        InterfaceC2186091Ah5 interfaceC2186091Ah5 = this.LLIZLLLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInfo, infoType = ");
        sbLIZ.append(i);
        sbLIZ.append(", ext = ");
        sbLIZ.append(i2);
        sbLIZ.append(", msg = ");
        sbLIZ.append(str);
        sbLIZ.append(", listener = ");
        sbLIZ.append(interfaceC2186091Ah5);
        C2484209oO.LIZ("VECameraCapture", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("VECameraCapture: onInfo, infoType = ");
        sbLIZ2.append(i);
        C1311120kDu.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (123 == i && (c1664350tPd = this.LLJIJIL) != null && !c1664350tPd.LIZLLL()) {
            C2484209oO.LJI("VECameraCapture", "onInfo, camera is starting preview, can not release SurfaceTexture.");
            Iterator<C2185991Agv> it2 = this.LLJIJIL.LIZJ().iterator();
            while (it2.hasNext()) {
                InterfaceC1283630jVZ interfaceC1283630jVZ2 = it2.next().LIZJ;
                if (interfaceC1283630jVZ2 instanceof C1DJ7) {
                    ((C1DJ7) interfaceC1283630jVZ2).LJJJJZI(false);
                }
            }
            return;
        }
        if (124 == i) {
            C1664350tPd<C2185991Agv> c1664350tPd2 = this.LLJIJIL;
            if (c1664350tPd2 != null && !c1664350tPd2.LIZLLL()) {
                C2484209oO.LJI("VECameraCapture", "onInfo, camera finished starting preview, can release SurfaceTexture.");
                Iterator<C2185991Agv> it3 = this.LLJIJIL.LIZJ().iterator();
                while (it3.hasNext()) {
                    InterfaceC1283630jVZ interfaceC1283630jVZ3 = it3.next().LIZJ;
                    if (interfaceC1283630jVZ3 instanceof C1DJ7) {
                        ((C1DJ7) interfaceC1283630jVZ3).LJJJJZI(true);
                    }
                }
                return;
            }
        } else if (1 == i) {
            Bundle bundle = new Bundle();
            bundle.putInt("device_support_wide_angle_mode", VEConfigCenter.getInstance().getValue("ve_camera_wide_angle", -1));
            bundle.putInt("device_support_antishake_mode", VEConfigCenter.getInstance().getValue("ve_camera_stablization", -1));
            bundle.putInt("device_support_ai_night_video", VEConfigCenter.getInstance().getValue("ve_camera_ai_augmentation", 0));
            bundle.putBoolean("device_support_multicamera_zoom", LJJIJIL());
            this.LLJILJIL.updateAllCameraFeatures(bundle);
        }
        if (interfaceC2186091Ah5 != null) {
            if (i != 6) {
                i3 = i;
            } else {
                i3 = 6;
            }
            interfaceC2186091Ah5.onInfo(i3, i2, str);
        }
        if (i == 0) {
            if (this.LLJJIII && !VEConfigCenter.getInstance().getValue("ve_delay_report_camera_capability", false).booleanValue()) {
                int i4 = C2187451AjH.LIZ;
                C2183341Ace.LIZ("VECameraCapture", "cameraThreadOptimization reportBytebench");
                LJJIIJZLJL();
            }
        } else if (i == 50) {
            if (str != null && (strArrSplit = str.split("x")) != null && strArrSplit.length == 2) {
                TEFrameSizei tEFrameSizei = new TEFrameSizei(CastIntegerProtector.valueOf(strArrSplit[0]).intValue(), CastIntegerProtector.valueOf(strArrSplit[1]).intValue());
                for (C2185991Agv c2185991Agv : this.LLJIJIL.LIZJ()) {
                    if (!c2185991Agv.LJ && (interfaceC1283630jVZ = c2185991Agv.LIZJ) != null) {
                        interfaceC1283630jVZ.LJLJJL(tEFrameSizei);
                    }
                }
                new VESize(tEFrameSizei.height, tEFrameSizei.width);
            }
        } else if (i == 6) {
            if (i2 == 2) {
                System.currentTimeMillis();
            }
        } else if (i == 51) {
            LJJJJJ();
        }
        switch (i) {
            case 106:
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.LLJILLL = jCurrentTimeMillis;
                Integer numValueOf = Integer.valueOf(i2);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("resultCode", numValueOf);
                    jSONObject.put("state", numValueOf);
                    jSONObject.put("time", jCurrentTimeMillis);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                b.LIZIZ("vesdk_event_will_start_camera", "behavior", jSONObject, true);
                break;
            case 107:
                b.LIZIZ("vesdk_event_did_start_camera", "behavior", LJIJJ(this.LLJILLL, System.currentTimeMillis(), Integer.valueOf(i2)), true);
                break;
            case 108:
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.LLJJ = jCurrentTimeMillis2;
                Integer numValueOf2 = Integer.valueOf(i2);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("resultCode", numValueOf2);
                    jSONObject2.put("state", numValueOf2);
                    jSONObject2.put("time", jCurrentTimeMillis2);
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                b.LIZIZ("vesdk_event_will_stop_camera", "behavior", jSONObject2, true);
                break;
            case 109:
                b.LIZIZ("vesdk_event_did_stop_camera", "behavior", LJIJJ(this.LLJJ, System.currentTimeMillis(), Integer.valueOf(i2)), true);
                break;
        }
        C1311120kDu.LIZIZ();
    }

    public final void LJIJ(VESize vESize, VESize vESize2, boolean z, boolean z2) {
        boolean z3;
        if (this.LL.isBindSurfaceLifecycleToCamera() && this.LL.getCameraType() != VECameraSettings.CAMERA_TYPE.TYPE1) {
            z3 = true;
            TECameraCapture tECameraCapture = this.LLJILJIL;
            if (tECameraCapture != null) {
                tECameraCapture.abortSession();
            }
        } else {
            z3 = false;
        }
        C2185991Agv c2185991AgvLJIIIIZZ = LJIIIIZZ(new VESize(vESize.height, vESize.width), true);
        C2185991Agv c2185991AgvLJIIIIZZ2 = LJIIIIZZ(new VESize(vESize2.height, vESize2.width), false);
        if (c2185991AgvLJIIIIZZ != null && c2185991AgvLJIIIIZZ2 != null && this.LL.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE2 && !z) {
            c2185991AgvLJIIIIZZ.LJ = false;
            c2185991AgvLJIIIIZZ2.LJ = true;
            this.LLJILJIL.updateCameraProviderState(c2185991AgvLJIIIIZZ.LJII, false);
            this.LLJILJIL.updateCameraProviderState(c2185991AgvLJIIIIZZ2.LJII, true);
            this.LLJILJIL.updateCameraSurface();
            return;
        }
        if (!z3) {
            LJJJZ(true);
        } else {
            LIZ();
        }
        if (z2) {
            C1664350tPd<C2185991Agv> c1664350tPd = this.LLJIJIL;
            if (c1664350tPd != null) {
                for (C2185991Agv c2185991Agv : c1664350tPd.LIZJ()) {
                    if (c2185991Agv.LIZLLL) {
                        if (c2185991Agv.LJ) {
                            c2185991Agv.LIZIZ = new TEFrameSizei(vESize.height, vESize.width);
                            c2185991Agv.LJ = false;
                        } else if (!c2185991Agv.LJ) {
                            c2185991Agv.LIZIZ = new TEFrameSizei(vESize2.height, vESize2.width);
                            c2185991Agv.LJ = true;
                        }
                    }
                }
            }
            C1DJ6 c1dj6 = this.LLILLJJLI;
            if (c1dj6 != null) {
                VESize vESize3 = this.LLILZIL;
                vESize3.width = vESize.height;
                int i = vESize.width;
                vESize3.height = i;
                TEFrameSizei tEFrameSizei = c1dj6.LLJJJIL;
                tEFrameSizei.width = vESize.height;
                tEFrameSizei.height = i;
                VESize vESize4 = this.LLILZLL;
                vESize4.width = vESize2.height;
                int i2 = vESize2.width;
                vESize4.height = i2;
                TEFrameSizei tEFrameSizei2 = c1dj6.LLJJJJ;
                tEFrameSizei2.width = vESize2.height;
                tEFrameSizei2.height = i2;
            } else {
                C2484209oO.LIZJ("VECameraCapture", "setPreviewSize failed: params is null!");
            }
        }
        if (!z3 || this.LLILLJJLI.LLLLLZL) {
            LJJJJJ();
        }
        LJJJLZIJ();
        this.LL.setPreviewSize(vESize.width, vESize.height);
        this.LL.setSecondaryPreviewSize(vESize2.width, vESize2.height);
    }

    @Override // X.InterfaceC2254701DMu
    public final void LIZJ(int i, boolean z, boolean z2, float f, List<Integer> list) {
        InterfaceC1780750wRN interfaceC1780750wRN = this.LLIZ;
        if (interfaceC1780750wRN != null) {
            interfaceC1780750wRN.LIZJ(i, z, z2, f, list);
        }
    }
}
