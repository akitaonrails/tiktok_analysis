package com.ss.android.vesdk;

import X.AbstractC2239611ClD;
import X.C00G6;
import X.C1284730jXL;
import X.C1293970jmF;
import X.C1305700k5A;
import X.C1311120kDu;
import X.C1404320meE;
import X.C1AO5;
import X.C1AO7;
import X.C1AO8;
import X.C1AWM;
import X.C1DIC;
import X.C1DIT;
import X.C1DJZ;
import X.C1DLN;
import X.C1DM1;
import X.C1DM5;
import X.C1DM9;
import X.C1DMH;
import X.C1DMT;
import X.C1DMU;
import X.C21620919jT;
import X.C2183341Ace;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2219521Btu;
import X.C2254311DLh;
import X.C2254321DLi;
import X.C2254331DLj;
import X.C2254351DLl;
import X.C2254361DLm;
import X.C2254371DLn;
import X.C2254401DLq;
import X.C2254411DLr;
import X.C2484209oO;
import X.C578870Mn7;
import X.EnumC1780170wQR;
import X.EnumC1780180wQS;
import X.EnumC2249751D3t;
import X.EnumC2254471DLx;
import X.EnumC2254481DLy;
import X.EnumC578750Mmv;
import X.EnumC578800Mn0;
import X.InterfaceC1464200oCo;
import X.InterfaceC2173471A4j;
import X.InterfaceC2178571ANz;
import X.InterfaceC2183551Acz;
import X.InterfaceC2219581Bu0;
import X.InterfaceC2219671Bu9;
import X.InterfaceC2254571DMh;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.nativePort.TEAudioDataInterface;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ttve.nativePort.TERecorderInterface;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEFileUtils;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEReshapeFilterParam;
import com.ss.android.vesdk.k;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.ss.android.vesdk.lens.VETaintSceneDetectParams;
import com.ss.android.vesdk.runtime.VERuntime;
import gro.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: loaded from: classes36.dex */
public class VERecorder {
    public AbstractC2239611ClD LIZ;
    public final k LIZIZ;
    public final VERuntime LIZJ;
    public Surface LIZLLL;
    public InterfaceC2219581Bu0 LJ;

    /* JADX INFO: loaded from: classes34.dex */
    public interface IVECallEffectAPIRunnable {
        void run(long j);
    }

    /* JADX INFO: loaded from: classes34.dex */
    public interface IVEEffectGeneralCallback {
    }

    /* JADX INFO: loaded from: classes34.dex */
    public interface IVEFrameShotScreenCallback {
        void onShotScreen(VEFrame vEFrame, int i);
    }

    /* JADX INFO: loaded from: classes34.dex */
    public interface OnFrameAvailableListenerExt {
        void OnFrameAvailable(VEFrame vEFrame);

        C00G6 config();
    }

    public final void LJFF() {
        k kVar = this.LIZIZ;
        int iLIZLLL = kVar.LJJJ.LIZLLL(false);
        synchronized (kVar.LJL) {
            if (iLIZLLL == 0) {
                try {
                    C1DMH c1dmh = kVar.LJJZZIII;
                    if (c1dmh != null) {
                        c1dmh.LIZIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final TEAudioDataInterface LJII() {
        k kVar = this.LIZIZ;
        if (kVar.LJLIIIL == null) {
            kVar.LJLIIIL = new TEAudioDataInterface();
        }
        return kVar.LJLIIIL;
    }

    public final int LJIIIIZZ() {
        int i = this.LIZIZ.LJJLIIIJLJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bgm index is ");
        sbLIZ.append(i);
        C2484209oO.LIZ("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
        return this.LIZIZ.LJJLIIIJLJLI;
    }

    public final VEDisplaySettings LJIIIZ() {
        return this.LIZIZ.LJLJL;
    }

    public final a LJIIL() {
        a aVar = this.LIZIZ.LJJIZ;
        if (aVar instanceof C2254311DLh) {
            return aVar;
        }
        return null;
    }

    public final void LJIILJJIL() {
        C2484209oO.LJI("VERecorder", "onDestroy...");
        k kVar = this.LIZIZ;
        if (kVar != null) {
            kVar.LIZJ();
        }
        AbstractC2239611ClD abstractC2239611ClD = this.LIZ;
        if (abstractC2239611ClD != null) {
            List<String> list = abstractC2239611ClD.LIZJ;
            if (list != null) {
                ((ArrayList) list).clear();
                abstractC2239611ClD.LIZJ = null;
            }
            List<String> list2 = abstractC2239611ClD.LIZLLL;
            if (list2 != null) {
                ((ArrayList) list2).clear();
                abstractC2239611ClD.LIZLLL = null;
            }
        }
    }

    public final void LJIJ() {
        k kVar = this.LIZIZ;
        kVar.getClass();
        if (VEConfigCenter.getInstance().getValue("veabtest_enable_remove_effect_deprecatingAPI", false).booleanValue()) {
            return;
        }
        a aVar = kVar.LJJIZ;
        aVar.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 54);
        aVar.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJJJJ() {
        C2484209oO.LJI("VERecorder", "stopCameraPreview");
        k kVar = this.LIZIZ;
        if (kVar.LJJJJIZL == null) {
            C2484209oO.LJIIIIZZ("TERecorder", "No Camera capture to stopCameraPreview");
        } else {
            C2484209oO.LJI("TERecorder", "stopCameraPreview");
            kVar.LJJJJIZL.LIZ();
        }
    }

    public VERecorder(final String str) {
        k kVar;
        if (!TextUtils.isEmpty(str)) {
            this.LIZ = new AbstractC2239611ClD(str) { // from class: X.1ClC
                @Override // X.AbstractC2239611ClD
                public final String LIZJ() {
                    if (TextUtils.isEmpty(this.LIZIZ)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(File.separator);
                        sbLIZ.append("segments");
                        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    return this.LIZIZ;
                }
            };
            this.LIZJ = VERuntime.getInstance();
            AbstractC2239611ClD abstractC2239611ClD = this.LIZ;
            if (VERuntime.getInstance().isEnableRefactorRecorder()) {
                kVar = new k(abstractC2239611ClD);
            } else {
                kVar = null;
            }
            this.LIZIZ = kVar;
            return;
        }
        throw new VEException(-100, "workSpace is null");
    }

    public final void LIZ(InterfaceC1464200oCo interfaceC1464200oCo) {
        k kVar = this.LIZIZ;
        kVar.getClass();
        if (interfaceC1464200oCo == null) {
            C2484209oO.LIZJ("TERecorder", "VECommonCallback is null...");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addCommonCallback: ");
        sbLIZ.append(interfaceC1464200oCo.hashCode());
        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (kVar.LJJJLIIL) {
            try {
                if (!((ArrayList) kVar.LJJJJZI).contains(interfaceC1464200oCo)) {
                    ((ArrayList) kVar.LJJJJZI).add(interfaceC1464200oCo);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(VERecordMode vERecordMode) {
        boolean z;
        k kVar = this.LIZIZ;
        if (kVar.LJIIJJI != vERecordMode) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeRecordMode ");
            sbLIZ.append(vERecordMode);
            C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
            kVar.LJIIJJI = vERecordMode;
            synchronized (kVar.LJL) {
                try {
                    if (kVar.LJIIIIZZ != null && !kVar.LJIL() && kVar.LJIIZILJ() == 2) {
                        C1DMH c1dmh = kVar.LJJZZIII;
                        if (c1dmh != null) {
                            c1dmh.onDestroy();
                            kVar.LJJZZIII = null;
                        }
                        VERecordMode vERecordMode2 = kVar.LJIIJJI;
                        if (vERecordMode2 == VERecordMode.DUET) {
                            C2254371DLn c2254371DLn = new C2254371DLn(kVar, kVar.LJIIJ, kVar.LJIIIIZZ.getVideoRes());
                            kVar.LJJZZIII = c2254371DLn;
                            c2254371DLn.LJII();
                        } else if (vERecordMode2 == VERecordMode.REACTION) {
                            C2254351DLl c2254351DLl = new C2254351DLl(kVar, kVar.LJIIIIZZ.getVideoRes());
                            kVar.LJJZZIII = c2254351DLl;
                            c2254351DLl.LJII();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            boolean z2 = true;
            if (kVar.LJIIJJI == VERecordMode.DUET_KARAOKE) {
                kVar.LJJJ.LJIJJLI("EnableAudioGraphRefactor", true);
            }
            kVar.LJJJ.LJIJJLI("Karaoke", kVar.LJIL());
            TERecorderInterface tERecorderInterface = kVar.LJJJ;
            VERecordMode vERecordMode3 = kVar.LJIIJJI;
            if (vERecordMode3 != VERecordMode.KARAOKE_PURE_AUDIO && vERecordMode3 != VERecordMode.AUDIO) {
                z = false;
            } else {
                z = true;
            }
            tERecorderInterface.LJIJJLI("PureAudio", z);
            TERecorderInterface tERecorderInterface2 = kVar.LJJJ;
            VERecordMode vERecordMode4 = kVar.LJIIJJI;
            if (vERecordMode4 != VERecordMode.DUET && vERecordMode4 != VERecordMode.REACTION) {
                z2 = false;
            }
            tERecorderInterface2.LJIJJLI("FocusSingleAudioTrack", z2);
            kVar.LJJJ.LJJIII("VERecordMode", kVar.LJIIJJI.ordinal());
        }
    }

    public final void LIZJ(Surface surface) {
        k kVar = this.LIZIZ;
        kVar.LJJIJ(surface);
        kVar.LJJJ.LJJI(surface);
        this.LIZLLL = surface;
    }

    public final void LIZLLL(VEVideoEncodeSettings vEVideoEncodeSettings) {
        k kVar = this.LIZIZ;
        kVar.LJIIIIZZ = vEVideoEncodeSettings;
        kVar.LJFF(vEVideoEncodeSettings);
        TERecorderInterface tERecorderInterface = kVar.LJJJ;
        tERecorderInterface.getClass();
        tERecorderInterface.LJIL("VideoEncode", C2254321DLi.LJFF(vEVideoEncodeSettings));
    }

    public final void LJI(C1AWM c1awm) {
        k kVar = this.LIZIZ;
        kVar.LJJLIIIJILLIZJL = c1awm;
        int iLIZLLL = kVar.LJJJ.LIZLLL(true);
        synchronized (kVar.LJL) {
            if (iLIZLLL == 0) {
                try {
                    C1DMH c1dmh = kVar.LJJZZIII;
                    if (c1dmh != null) {
                        c1dmh.LIZIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (iLIZLLL != 0) {
            kVar.LJJLIIIJILLIZJL.onDone(iLIZLLL);
            kVar.LJJLIIIJILLIZJL = null;
        }
    }

    public final String LJIIJ(int i) {
        String string;
        a aVar = this.LIZIZ.LJJIZ;
        aVar.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 58);
        tEBundleObtain.setInt("etType", i);
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        if (aVar.LL.callEffectInterfaceWithResult(tEBundleObtain, tEBundleObtain2) == 0) {
            string = tEBundleObtain2.getString("Result");
            String str = C2254311DLh.LLJIJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getETData etData = ");
            sbLIZ.append(string);
            C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        } else {
            string = null;
        }
        tEBundleObtain2.recycle();
        return string;
    }

    public final void LJIIJJI(final C2254411DLr c2254411DLr) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C1AO7 c1ao7 = c2254411DLr.LJII;
        if (c1ao7 != null) {
            c2254411DLr.LJII = new C1AO7() { // from class: X.1AO6
                @Override // X.C1AO7
                public final void onResult(int i) {
                    c1ao7.onResult(i);
                }

                @Override // X.C1AO7
                public final void LIZIZ(VEFrame vEFrame, int i) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        VESize vESize = c2254411DLr.LIZIZ;
                        if (vESize != null) {
                            jSONObject.put("width", vESize.width);
                            jSONObject.put("height", c2254411DLr.LIZIZ.height);
                        }
                        if (c2254411DLr.LIZ.equals(C1AO8.NORMAL_GET_FRAME_MODE) || c2254411DLr.LIZ.equals(C1AO8.HD_GET_FRAME_MODE)) {
                            jSONObject.put("is_effect", c2254411DLr.LJ.equals(EnumC578750Mmv.NO_EFFECT));
                            jSONObject.put("duration", System.currentTimeMillis() - jCurrentTimeMillis);
                        }
                        jSONObject.put("resultCode", i);
                        b.LIZ("vesdk_event_recorder_shot_screen", "business", jSONObject);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    c1ao7.LIZIZ(vEFrame, i);
                }

                @Override // X.C1AO7
                public final void LIZ(int i, int i2, int[] iArr) {
                    HashMap map = new HashMap();
                    map.put("capture_mode", String.valueOf(c2254411DLr.LIZ.ordinal()));
                    map.put("enable_effect", String.valueOf(c2254411DLr.LJ.ordinal()));
                    map.put("camera_photo_size", c2254411DLr.LIZIZ.toString());
                    map.put("total_cost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    c1ao7.LIZ(i, i2, iArr);
                    c2254411DLr.getClass();
                }
            };
        }
        this.LIZIZ.LJIILLIIL(c2254411DLr);
    }

    public final void LJIILLIIL(C1DIC c1dic) {
        boolean z = c1dic instanceof VECameraCapture;
        if (z && VEConfigCenter.getInstance().getValue("ve_enable_low_light_enhance", false).booleanValue()) {
            VECameraCapture vECameraCapture = (VECameraCapture) c1dic;
            vECameraCapture.LLJ = new C1DJZ(this);
            vECameraCapture.LLJILJIL.registerCameraCaptureUpdateListener(vECameraCapture.LLJJIJIL);
        }
        k kVar = this.LIZIZ;
        if (kVar != null && z) {
            ((VECameraCapture) c1dic).LLJILJIL.registerCameraStatusListener(kVar.LJJJI.getCameraStatusListener());
        }
        k kVar2 = this.LIZIZ;
        if (kVar2 != null && z) {
            ((VECameraCapture) c1dic).LLJILJIL.registerVEPerformanceChannel(kVar2.LLIIIJ);
        }
    }

    public final void LJIIZILJ(InterfaceC1464200oCo interfaceC1464200oCo) {
        int iHashCode;
        k kVar = this.LIZIZ;
        kVar.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeCommonCallback: ");
        if (interfaceC1464200oCo != null) {
            iHashCode = interfaceC1464200oCo.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (kVar.LJJJLIIL) {
            try {
                ((ArrayList) kVar.LJJJJZI).remove(interfaceC1464200oCo);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIJJLI(InterfaceC1464200oCo interfaceC1464200oCo) {
        k kVar = this.LIZIZ;
        kVar.getClass();
        C2484209oO.LJI("TERecorder", "setCommonCallback...");
        synchronized (kVar.LJJJLIIL) {
            try {
                kVar.LJJJJZ = interfaceC1464200oCo;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final int LJJI(VEDisplaySettings vEDisplaySettings) {
        return this.LIZIZ.LJJIIZ(vEDisplaySettings);
    }

    public final void LJJIIJ(C1DIT c1dit) {
        k kVar = this.LIZIZ;
        kVar.LJJIJL = c1dit;
        kVar.LJJJ.LJJIIZ(c1dit);
    }

    public final void LJJIIJZLJL(OnFrameAvailableListenerExt onFrameAvailableListenerExt) {
        k kVar = this.LIZIZ;
        kVar.LJ = onFrameAvailableListenerExt;
        if (VEConfigCenter.getInstance().getValue("ve_disable_mt_unused_bins", false).booleanValue() && onFrameAvailableListenerExt != null) {
            kVar.LJJJ.LJIL("OnFrameAvailable", TEBundle.obtain());
        }
    }

    public final void LJJIIZ(InterfaceC1464200oCo interfaceC1464200oCo) {
        k kVar = this.LIZIZ;
        kVar.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setOnInfoListener=");
        sbLIZ.append(interfaceC1464200oCo);
        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
        kVar.LJJJLL = interfaceC1464200oCo;
    }

    public final void LJJIJIIJIL(final C1AO5 c1ao5) {
        boolean z;
        EnumC578750Mmv enumC578750Mmv;
        final IVEFrameShotScreenCallback iVEFrameShotScreenCallback;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1284730jXL.LIZ(1L, "ve_use_camera");
        final InterfaceC2178571ANz interfaceC2178571ANz = c1ao5.LJII;
        if (interfaceC2178571ANz != null) {
            c1ao5.LJII = new InterfaceC2178571ANz() { // from class: X.1AO3
                @Override // X.InterfaceC2178571ANz
                public final void LIZ(int i) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        VESize vESize = c1ao5.LIZ;
                        if (vESize != null) {
                            jSONObject.put("width", vESize.width);
                            jSONObject.put("height", c1ao5.LIZ.height);
                        }
                        jSONObject.put("resultCode", i);
                        c1ao5.getClass();
                        jSONObject.put("is_effect", c1ao5.LIZIZ);
                        jSONObject.put("duration", System.currentTimeMillis() - jCurrentTimeMillis);
                        b.LIZIZ("vesdk_event_recorder_shot_screen", "business", jSONObject, true);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    HashMap map = new HashMap();
                    c1ao5.getClass();
                    map.put("capture_mode", String.valueOf(false));
                    map.put("enable_effect", String.valueOf(c1ao5.LIZIZ));
                    map.put("camera_photo_size", c1ao5.LIZ.toString());
                    map.put("total_cost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    map.put("error_code", String.valueOf(i));
                    InterfaceC2178571ANz interfaceC2178571ANz2 = interfaceC2178571ANz;
                    if (interfaceC2178571ANz2 != null) {
                        interfaceC2178571ANz2.LIZ(i);
                    }
                    c1ao5.getClass();
                }
            };
        }
        final InterfaceC2173471A4j interfaceC2173471A4j = c1ao5.LJIIIIZZ;
        if (interfaceC2173471A4j != null) {
            c1ao5.LJIIIIZZ = new InterfaceC2173471A4j() { // from class: X.1AO2
                @Override // X.InterfaceC2173471A4j
                public final void LIZ(int i, Bitmap bitmap) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        VESize vESize = c1ao5.LIZ;
                        if (vESize != null) {
                            jSONObject.put("width", vESize.width);
                            jSONObject.put("height", c1ao5.LIZ.height);
                        }
                        jSONObject.put("resultCode", i);
                        c1ao5.getClass();
                        jSONObject.put("is_effect", c1ao5.LIZIZ);
                        jSONObject.put("duration", System.currentTimeMillis() - jCurrentTimeMillis);
                        b.LIZIZ("vesdk_event_recorder_shot_screen", "business", jSONObject, true);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    HashMap map = new HashMap();
                    c1ao5.getClass();
                    map.put("capture_mode", String.valueOf(false));
                    map.put("enable_effect", String.valueOf(c1ao5.LIZIZ));
                    map.put("camera_photo_size", c1ao5.LIZ.toString());
                    map.put("total_cost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    map.put("error_code", String.valueOf(i));
                    InterfaceC2173471A4j interfaceC2173471A4j2 = interfaceC2173471A4j;
                    if (interfaceC2173471A4j2 != null) {
                        interfaceC2173471A4j2.LIZ(i, bitmap);
                    }
                    c1ao5.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Perf Screenshot: w: ");
                    sbLIZ.append(c1ao5.LIZ.width);
                    sbLIZ.append(", h: ");
                    sbLIZ.append(c1ao5.LIZ.height);
                    sbLIZ.append(", cost: ");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ.append("ms");
                    C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
                }
            };
        }
        if (interfaceC2178571ANz == null && interfaceC2173471A4j == null && (iVEFrameShotScreenCallback = c1ao5.LJIIIZ) != null) {
            c1ao5.LJIIIZ = new IVEFrameShotScreenCallback() { // from class: X.1AO4
                @Override // com.ss.android.vesdk.VERecorder.IVEFrameShotScreenCallback
                public final void onShotScreen(VEFrame vEFrame, int i) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        VESize vESize = c1ao5.LIZ;
                        if (vESize != null) {
                            jSONObject.put("width", vESize.width);
                            jSONObject.put("height", c1ao5.LIZ.height);
                        }
                        jSONObject.put("resultCode", i);
                        c1ao5.getClass();
                        jSONObject.put("is_effect", c1ao5.LIZIZ);
                        jSONObject.put("duration", System.currentTimeMillis() - jCurrentTimeMillis);
                        b.LIZ("vesdk_event_recorder_shot_screen", "business", jSONObject);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    HashMap map = new HashMap();
                    c1ao5.getClass();
                    map.put("capture_mode", String.valueOf(false));
                    map.put("enable_effect", String.valueOf(c1ao5.LIZIZ));
                    map.put("camera_photo_size", c1ao5.LIZ.toString());
                    map.put("total_cost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    map.put("error_code", String.valueOf(i));
                    VERecorder.IVEFrameShotScreenCallback iVEFrameShotScreenCallback2 = iVEFrameShotScreenCallback;
                    if (iVEFrameShotScreenCallback2 != null) {
                        iVEFrameShotScreenCallback2.onShotScreen(vEFrame, i);
                    }
                    c1ao5.getClass();
                }
            };
        }
        final k kVar = this.LIZIZ;
        kVar.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shotScreen settings = ");
        sbLIZ.append(c1ao5);
        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
        kVar.LJLJI = c1ao5.LJFF;
        kVar.LJLJJI = false;
        kVar.LJLJJL = c1ao5.LJI;
        if (VEConfigCenter.getInstance().getValue("ve_titan_shot_screen_opt", 0) != 0) {
            z = true;
        } else {
            z = false;
        }
        kVar.LJLJJLL = z;
        VESize vESize = c1ao5.LIZ;
        if (vESize == null) {
            C2484209oO.LJIIIIZZ("TERecorder", "size is null, can not shotscreen");
            return;
        }
        InterfaceC2173471A4j interfaceC2173471A4j2 = c1ao5.LJIIIIZZ;
        if (interfaceC2173471A4j2 != null) {
            IVEFrameShotScreenCallback iVEFrameShotScreenCallback2 = c1ao5.LJIIIZ;
            if (iVEFrameShotScreenCallback2 != null) {
                kVar.LJJIJIL(vESize.width, vESize.height, c1ao5.LIZIZ, interfaceC2173471A4j2, false, iVEFrameShotScreenCallback2);
                return;
            } else {
                kVar.LJJIJL(vESize.width, vESize.height, c1ao5.LIZLLL, c1ao5.LIZIZ, interfaceC2173471A4j2);
                return;
            }
        }
        InterfaceC2178571ANz interfaceC2178571ANz2 = c1ao5.LJII;
        if (interfaceC2178571ANz2 != null) {
            kVar.LJJIJLIJ(c1ao5.LIZJ, vESize.width, vESize.height, c1ao5.LIZLLL, c1ao5.LIZIZ, c1ao5.LJ, interfaceC2178571ANz2);
            return;
        }
        final IVEFrameShotScreenCallback iVEFrameShotScreenCallback3 = c1ao5.LJIIIZ;
        if (iVEFrameShotScreenCallback3 != null) {
            int i = vESize.width;
            int i2 = vESize.height;
            boolean z2 = c1ao5.LIZIZ;
            if (kVar.LJJJJJL.isSyncCapture()) {
                C2484209oO.LIZJ("TERecorder", "isSyncCapture should not be open");
            }
            if (kVar.LJJZZI.get()) {
                C2484209oO.LJIIIIZZ("TERecorder", "Last screenshot not complete");
                iVEFrameShotScreenCallback3.onShotScreen(null, -1);
                return;
            }
            kVar.LJJZZI.set(true);
            System.currentTimeMillis();
            VESize vESize2 = new VESize(i, i2);
            if (kVar.LJJIJIIJIL && kVar.LJLJL != null) {
                VESize vESize3 = new VESize(i, i2);
                VESize renderSize = kVar.LJLJL.getRenderSize();
                if (renderSize != null && renderSize.width > 0 && renderSize.height > 0) {
                    VESize vESizeLJIIIZ = k.LJIIIZ(vESize3, renderSize);
                    if (vESizeLJIIIZ.width > 0 && vESizeLJIIIZ.height > 0) {
                        vESize2 = vESizeLJIIIZ;
                    } else {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("aspect shot screen size err: ");
                        sbLIZ2.append(vESizeLJIIIZ);
                        C2183341Ace.LIZIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
            EnumC1780170wQR enumC1780170wQR = EnumC1780170wQR.NO_MIRROR;
            int i4 = kVar.LL;
            if (i4 != 0) {
                if (i4 == 1) {
                    enumC1780170wQR = EnumC1780170wQR.X_MIRROR;
                } else if (i4 == 2) {
                    enumC1780170wQR = EnumC1780170wQR.Y_MIRROR;
                }
            }
            C1AO7 c1ao7 = new C1AO7() { // from class: X.1AO9
                @Override // X.C1AO7
                public final /* synthetic */ void onResult(int i5) {
                }

                @Override // X.C1AO7
                public final void LIZIZ(VEFrame vEFrame, int i5) {
                    kVar.LJJZZI.set(false);
                    iVEFrameShotScreenCallback3.onShotScreen(vEFrame, i5);
                }

                @Override // X.C1AO7
                public final void LIZ(int i5, int i6, int[] iArr) {
                    kVar.LJJZZI.set(false);
                    C2484209oO.LIZJ("TERecorder", "onResult in shotScreen should not be called");
                    iVEFrameShotScreenCallback3.onShotScreen(null, -1);
                }
            };
            EnumC578800Mn0 enumC578800Mn0 = EnumC578800Mn0.RGBA_ARRAY;
            if (kVar.LJLJJI && !kVar.LJLJJL.isEmpty()) {
                enumC578800Mn0 = EnumC578800Mn0.TEXTURE;
            } else {
                kVar.LJLJJL = "";
            }
            C578870Mn7 c578870Mn7 = new C578870Mn7();
            C1AO8 c1ao8 = C1AO8.NORMAL_GET_FRAME_MODE;
            C2254411DLr c2254411DLr = c578870Mn7.LIZ;
            c2254411DLr.LIZ = c1ao8;
            c2254411DLr.LJFF = true;
            if (z2) {
                enumC578750Mmv = EnumC578750Mmv.FULL_EFFECT;
            } else {
                enumC578750Mmv = EnumC578750Mmv.NO_EFFECT;
            }
            c2254411DLr.LJ = enumC578750Mmv;
            c2254411DLr.LJI = EnumC1780180wQS.CENTER_CROP;
            c2254411DLr.LIZIZ = vESize2;
            c2254411DLr.LJII = c1ao7;
            c2254411DLr.LJIIIZ = false;
            c2254411DLr.LJIIJJI = kVar.LJLJI;
            c2254411DLr.LJIILIIL = enumC578800Mn0;
            c2254411DLr.LJIILL = kVar.LJLJJL;
            c2254411DLr.LJIIIIZZ = enumC1780170wQR;
            kVar.LJIILLIIL(c2254411DLr);
            return;
        }
        C2484209oO.LJIIIIZZ("TERecorder", "All screenshot callback are null");
    }

    public final void LJJIJLIJ(C21620919jT c21620919jT) {
        a aVar = this.LIZIZ.LJJIZ;
        aVar.LL.setARTextBitmapCallback(c21620919jT);
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 10);
        tEBundleObtain.setInt("FlagType", 4);
        C2254311DLh.LJIIJ();
        tEBundleObtain.setInt("flag", 1);
        aVar.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJJIZ(C1DIC c1dic) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCameraPreview, cameraPreview = ");
        sbLIZ.append(c1dic);
        C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
        LJIILLIIL(c1dic);
        this.LIZIZ.LJJIL(c1dic, true);
    }

    public final void LJJJ(Surface surface) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPreview, surface = ");
        sbLIZ.append(surface);
        C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
        k kVar = this.LIZIZ;
        TECamera tECamera = kVar.LJJJI;
        if (tECamera != null) {
            tECamera.setEnableCameraNotify(true);
        }
        TECamera tECamera2 = kVar.LJJJIL;
        if (tECamera2 != null) {
            tECamera2.setEnableCameraNotify(true);
        }
        kVar.LJJIJ(surface);
        int iLJJIJIIJIL = kVar.LJJJ.LJJIJIIJIL(surface);
        C1305700k5A.LIZIZ(iLJJIJIIJIL, "te_record_start_preview_ret");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", iLJJIJIIJIL);
            b.LIZIZ("vesdk_event_recorder_start_preview_async", "business", jSONObject, true);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        kVar.LJJIFFI(1020, 0, "You can replace the Res Manager here.");
        synchronized (kVar.LJL) {
            try {
                VEVideoEncodeSettings vEVideoEncodeSettings = kVar.LJIIIIZZ;
                if (vEVideoEncodeSettings != null && kVar.LJJZZIII == null) {
                    VERecordMode vERecordMode = kVar.LJIIJJI;
                    if (vERecordMode == VERecordMode.DUET) {
                        C2254371DLn c2254371DLn = new C2254371DLn(kVar, kVar.LJIIJ, vEVideoEncodeSettings.getVideoRes());
                        kVar.LJJZZIII = c2254371DLn;
                        c2254371DLn.LJII();
                    } else if (vERecordMode == VERecordMode.REACTION) {
                        C2254351DLl c2254351DLl = new C2254351DLl(kVar, kVar.LJIIIIZZ.getVideoRes());
                        kVar.LJJZZIII = c2254351DLl;
                        c2254351DLl.LJII();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJJJI(InterfaceC2183551Acz interfaceC2183551Acz) {
        C1DMU c1dmu = new C1DMT().LIZ;
        c1dmu.LIZ = false;
        C2484209oO.LJI("VERecorder", "stopPrePlay");
        this.LIZIZ.LJJJI(interfaceC2183551Acz, c1dmu);
    }

    public final void LJJJJIZL(InterfaceC2183551Acz interfaceC2183551Acz) {
        k kVar = this.LIZIZ;
        kVar.LJJJZ = interfaceC2183551Acz;
        int iLJJJJI = kVar.LJJJJI();
        if (iLJJJJI != 0 && !kVar.LJLILLLLZI) {
            interfaceC2183551Acz.onDone(iLJJJJI);
        }
        if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("resultCode", iLJJJJI);
                b.LIZIZ("vesdk_event_recorder_record_finish", "business", jSONObject, true);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJJJJJ(final InterfaceC2183551Acz interfaceC2183551Acz) {
        C2484209oO.LJI("VERecorder", "stopRecordAsync");
        InterfaceC2183551Acz interfaceC2183551Acz2 = new InterfaceC2183551Acz() { // from class: X.1AOL
            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
                if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("resultCode", i);
                        b.LIZ("vesdk_event_recorder_record_finish", "business", jSONObject);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                InterfaceC2183551Acz interfaceC2183551Acz3 = interfaceC2183551Acz;
                if (interfaceC2183551Acz3 != null) {
                    interfaceC2183551Acz3.onDone(i);
                }
            }
        };
        k kVar = this.LIZIZ;
        kVar.LJJJZ = interfaceC2183551Acz2;
        int iLJJJJI = kVar.LJJJJI();
        if (iLJJJJI != 0 && !kVar.LJLILLLLZI) {
            interfaceC2183551Acz2.onDone(iLJJJJI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJJJJL(com.ss.android.vesdk.filterparam.VEEffectFilterParam r13) {
        /*
            r12 = this;
            com.ss.android.vesdk.k r5 = r12.LIZIZ
            r5.getClass()
            X.0meE r3 = new X.0meE
            r3.<init>()
            r9 = r13
            java.lang.String r0 = r9.effectPath
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r0 != 0) goto Lb9
            java.lang.String r1 = r9.effectPath
            java.lang.String r0 = java.io.File.separator
            java.lang.String[] r1 = r1.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto Lb9
            int r0 = r1.length
            int r0 = r0 - r2
            r1 = r1[r0]
        L23:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L2b
            java.lang.String r1 = "0"
        L2b:
            java.lang.String r0 = "iesve_verecorder_set_sticker_id"
            r3.LIZJ(r0, r1)
            java.lang.String r0 = "old"
            r3.LIZIZ(r2, r0)
            boolean r0 = r9.multicamMode
            if (r0 == 0) goto Lb6
            X.1DIT r1 = X.C1DIT.DEFAULT_PRIMARY
        L3b:
            X.1DIT r0 = r5.LJJIJL
            if (r1 == r0) goto L48
            r5.LJJIJL = r1
            com.ss.android.ttve.nativePort.TERecorderInterface r0 = r5.LJJJ
            r0.LJJIIZ(r1)
            r5.LJJIJL = r1
        L48:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r6 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[switchEffect]switchEffectInternal, stickerId = "
            r6.append(r0)
            long r3 = r9.longStickerId
            r6.append(r3)
            java.lang.String r0 = ", path = "
            r6.append(r0)
            java.lang.String r0 = r9.effectPath
            r6.append(r0)
            java.lang.String r0 = ", timeStamp = "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r6)
            java.lang.String r0 = "TERecorder"
            X.C2484209oO.LJI(r0, r1)
            java.util.Map<java.lang.Integer, android.util.Pair<com.ss.android.vesdk.filterparam.VEBaseFilterParam, java.lang.Integer>> r1 = r5.LJJLIIIJLLLLLLLZ
            r0 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r3 = r1.get(r4)
            android.util.Pair r3 = (android.util.Pair) r3
            if (r3 == 0) goto Laa
            java.lang.Object r0 = r3.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r2 = r0.intValue()
            if (r2 < 0) goto Laa
            gro.a r0 = r5.LJJIZ
            int r1 = r0.updateTrackFilterParam(r2, r9)
        L97:
            if (r3 != 0) goto La2
            android.util.Pair r3 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.<init>(r9, r0)
        La2:
            java.util.Map<java.lang.Integer, android.util.Pair<com.ss.android.vesdk.filterparam.VEBaseFilterParam, java.lang.Integer>> r0 = r5.LJJLIIIJLLLLLLLZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r4, r3)
            return r1
        Laa:
            gro.a r6 = r5.LJJIZ
            r7 = 0
            r10 = -1
            r8 = r7
            r11 = r10
            int r2 = r6.addTrackFilter(r7, r8, r9, r10, r11)
            r1 = r2
            goto L97
        Lb6:
            X.1DIT r1 = X.C1DIT.NONE
            goto L3b
        Lb9:
            java.lang.String r1 = ""
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VERecorder.LJJJJJL(com.ss.android.vesdk.filterparam.VEEffectFilterParam):int");
    }

    public VERecorder(AbstractC2239611ClD abstractC2239611ClD) {
        k kVar;
        this.LIZ = abstractC2239611ClD;
        this.LIZJ = VERuntime.getInstance();
        AbstractC2239611ClD abstractC2239611ClD2 = this.LIZ;
        if (VERuntime.getInstance().isEnableRefactorRecorder()) {
            kVar = new k(abstractC2239611ClD2);
        } else {
            kVar = null;
        }
        this.LIZIZ = kVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [X.1DM2] */
    public final void LJ(final String str, final InterfaceC2254571DMh interfaceC2254571DMh) {
        try {
            AbstractC2239611ClD abstractC2239611ClD = this.LIZ;
            abstractC2239611ClD.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1293970jmF.LIZIZ(abstractC2239611ClD.LIZ, "concat"));
            String str2 = File.separator;
            sbLIZ.append(str2);
            sbLIZ.append("concat");
            sbLIZ.append(".mp4");
            abstractC2239611ClD.LJ = C2188811AlT.LIZIZ(sbLIZ);
            AbstractC2239611ClD abstractC2239611ClD2 = this.LIZ;
            abstractC2239611ClD2.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C1293970jmF.LIZIZ(abstractC2239611ClD2.LIZ, "concat"));
            sbLIZ2.append(str2);
            sbLIZ2.append("concat");
            sbLIZ2.append(".wav");
            abstractC2239611ClD2.LJFF = C2188811AlT.LIZIZ(sbLIZ2);
            final String strLIZIZ = this.LIZ.LIZIZ();
            final String strLIZ = this.LIZ.LIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(".tmp");
            final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZ);
            sbLIZ4.append(".tmp");
            final String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
            VEFileUtils.deleteFile(strLIZIZ2);
            VEFileUtils.deleteFile(strLIZIZ3);
            VEFileUtils.renameFile(strLIZIZ, strLIZIZ2);
            VEFileUtils.renameFile(strLIZ, strLIZIZ3);
            if (this.LIZIZ.LJIILJJIL() != VERecordMode.DUET) {
                this.LIZIZ.LJIILJJIL();
            }
            final k kVar = this.LIZIZ;
            final ?? r1 = new InterfaceC2183551Acz() { // from class: X.1DM2
                @Override // X.InterfaceC2183551Acz
                public final void onDone(int i) {
                    if (!VEFileUtils.exists(strLIZIZ) && VEFileUtils.exists(strLIZIZ2)) {
                        VEFileUtils.renameFile(strLIZIZ2, strLIZIZ);
                        if (!VEFileUtils.exists(strLIZ) && VEFileUtils.exists(strLIZIZ3)) {
                            VEFileUtils.renameFile(strLIZIZ3, strLIZ);
                        }
                        int i2 = C2187451AjH.LIZ;
                        C2183341Ace.LIZLLL("VERecorder", "Concat failed. Restore concat file.");
                    }
                    InterfaceC2254571DMh interfaceC2254571DMh2 = interfaceC2254571DMh;
                    if (interfaceC2254571DMh2 != null) {
                        interfaceC2254571DMh2.LIZ(i, strLIZIZ, strLIZ);
                    }
                }
            };
            kVar.LJJLIIJ.execute(new Runnable() { // from class: X.1DLs
                public final /* synthetic */ String LLILZ = "";

                public final void LIZ() {
                    int iConcatRecordFrag;
                    k kVar2 = kVar;
                    String str3 = strLIZIZ;
                    String str4 = strLIZ;
                    String str5 = str;
                    String str6 = this.LLILZ;
                    if (kVar2.LJJJ.LJIILL()) {
                        iConcatRecordFrag = -105;
                    } else {
                        int i = 0;
                        VERecordData vERecordDataCreate = VERecordData.create(kVar2.LIZIZ, kVar2.LJJJJLL && kVar2.LJJJJ.LJJIII != EnumC2249751D3t.ENABLE);
                        if (vERecordDataCreate == null) {
                            iConcatRecordFrag = -100;
                        } else {
                            int size = vERecordDataCreate.getSegmentData().size();
                            if (size <= 0) {
                                C2484209oO.LIZJ("VEUtils", "frag count is 0");
                                iConcatRecordFrag = -100;
                            } else {
                                System.currentTimeMillis();
                                String[] strArr = new String[size];
                                String[] strArr2 = new String[size];
                                long[] jArr = new long[size];
                                long[] jArr2 = new long[size];
                                do {
                                    strArr[i] = ((VERecordData.VERecordSegmentData) ListProtector.get(vERecordDataCreate.getSegmentData(), i)).mVideo;
                                    jArr2[i] = ((VERecordData.VERecordSegmentData) ListProtector.get(vERecordDataCreate.getSegmentData(), i)).mVideoLength;
                                    strArr2[i] = ((VERecordData.VERecordSegmentData) ListProtector.get(vERecordDataCreate.getSegmentData(), i)).mAudio;
                                    jArr[i] = ((VERecordData.VERecordSegmentData) ListProtector.get(vERecordDataCreate.getSegmentData(), i)).mAudioLength;
                                    i++;
                                } while (i < size);
                                vERecordDataCreate.concatVideo = str3;
                                vERecordDataCreate.concatAudio = str4;
                                iConcatRecordFrag = TEVideoUtils.concatRecordFrag(strArr, jArr2, strArr2, jArr, vERecordDataCreate.isUseMusic(), 0, str5, str6, vERecordDataCreate.concatVideo, vERecordDataCreate.concatAudio);
                            }
                        }
                    }
                    InterfaceC2183551Acz interfaceC2183551Acz = r1;
                    if (interfaceC2183551Acz != null) {
                        interfaceC2183551Acz.onDone(iConcatRecordFrag);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TERecorder@aadd.concatAsync$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TERecorder@aadd.concatAsync$1");
                }
            });
        } catch (VEException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("No need to concat because: ");
            sbLIZ5.append(e.getMsgDes());
            C2183341Ace.LIZIZ("VERecorder", C2188811AlT.LIZIZ(sbLIZ5));
            interfaceC2254571DMh.LIZ(-108, "", "");
        }
    }

    public final void LJIILL(int i, int i2) {
        int iLJJIII = this.LIZIZ.LJJIII(i, i2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pausePlayTrack ret= ");
        sbLIZ.append(iLJJIII);
        sbLIZ.append(" trackIndex = ");
        sbLIZ.append(i);
        sbLIZ.append(" trackType = ");
        sbLIZ.append(i2);
        C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIJJ(float f, int i) {
        String str;
        C1404320meE c1404320meE = new C1404320meE();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("iesve_verecorder_");
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 9) {
                            switch (i) {
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    str = "beauty_lipstick";
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                    str = "beauty_blusher";
                                    break;
                                case 19:
                                    str = "beauty_nasolabial";
                                    break;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                    str = "beauty_pouch";
                                    break;
                                default:
                                    str = "";
                                    break;
                            }
                        } else {
                            str = "sharp";
                        }
                    } else {
                        str = "reshape cheek";
                    }
                } else {
                    str = "reshape_eye";
                }
            } else {
                str = "beauty_smooth";
            }
        } else {
            str = "beauty_brighten";
        }
        sbLIZ.append(str);
        sbLIZ.append("_level");
        c1404320meE.LIZ(f, C2188811AlT.LIZIZ(sbLIZ));
        c1404320meE.LIZIZ(1, "old");
        this.LIZIZ.getClass();
    }

    public final void LJIL(String str, String str2) {
        k kVar = this.LIZIZ;
        synchronized (kVar.LJL) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    C1DMH c1dmh = kVar.LJJZZIII;
                    if (c1dmh != null && !(c1dmh instanceof C2254361DLm)) {
                        c1dmh.onDestroy();
                        kVar.LJJZZIII = null;
                    }
                    C1DMH c1dmh2 = kVar.LJJZZIII;
                    if (c1dmh2 == null) {
                        C2254361DLm c2254361DLm = new C2254361DLm(kVar, str, str2);
                        kVar.LJJZZIII = c2254361DLm;
                        kVar.LIZ(c2254361DLm);
                        c2254361DLm.LJIIIZ();
                    } else {
                        C2254361DLm c2254361DLm2 = (C2254361DLm) c1dmh2;
                        int i = c2254361DLm2.LIZLLL;
                        if (i >= 0) {
                            c2254361DLm2.LIZ.LJJIIJ(0, i, true);
                            c2254361DLm2.LIZLLL = -1;
                        }
                        int i2 = c2254361DLm2.LJFF;
                        if (i2 != -1) {
                            c2254361DLm2.LIZ.LJJIZ.removeTrackFilter(i2);
                            c2254361DLm2.LJFF = -1;
                        }
                        c2254361DLm2.LIZIZ = str;
                        c2254361DLm2.LIZJ = str2;
                        c2254361DLm2.LJIIIZ();
                    }
                } else {
                    C1DMH c1dmh3 = kVar.LJJZZIII;
                    if (c1dmh3 != null && (c1dmh3 instanceof C2254361DLm)) {
                        c1dmh3.onDestroy();
                        kVar.LJJZZIII = null;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(float r14, java.lang.String r15) {
        /*
            r13 = this;
            X.0meE r5 = new X.0meE
            r5.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            r2 = 1
            java.lang.String r9 = ""
            if (r0 != 0) goto L8e
            java.lang.String r0 = java.io.File.separator
            java.lang.String[] r1 = r15.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L8e
            int r0 = r1.length
            int r0 = r0 - r2
            r1 = r1[r0]
        L1b:
            r8 = 0
            float r3 = java.lang.Math.max(r14, r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r0, r3)
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 >= 0) goto L2c
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L2c:
            java.lang.String r0 = "iesve_verecorder_set_filter_click_idfilter_id"
            r5.LIZJ(r0, r1)
            java.lang.String r0 = "old"
            r5.LIZIZ(r2, r0)
            com.ss.android.vesdk.k r6 = r13.LIZIZ
            java.util.Map<java.lang.Integer, android.util.Pair<com.ss.android.vesdk.filterparam.VEBaseFilterParam, java.lang.Integer>> r3 = r6.LJJLIIIJLLLLLLLZ
            r0 = 7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r7 = r3.get(r5)
            android.util.Pair r7 = (android.util.Pair) r7
            if (r7 == 0) goto L87
            java.lang.Object r10 = r7.first
            com.ss.android.vesdk.filterparam.VEColorFilterParam r10 = (com.ss.android.vesdk.filterparam.VEColorFilterParam) r10
            java.lang.Object r0 = r7.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r3 = r0.intValue()
        L55:
            if (r15 != 0) goto L58
            r15 = r9
        L58:
            r10.leftFilterPath = r15
            r10.rightFilterPath = r9
            r10.position = r8
            r10.intensity = r4
            r10.rightIntensity = r8
            r10.useFilterV3 = r2
            if (r3 < 0) goto L73
            gro.a r0 = r6.LJJIZ
            r0.updateTrackFilterParam(r3, r10)
        L6b:
            java.util.Map<java.lang.Integer, android.util.Pair<com.ss.android.vesdk.filterparam.VEBaseFilterParam, java.lang.Integer>> r0 = r6.LJJLIIIJLLLLLLLZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r5, r7)
            goto L90
        L73:
            gro.a r7 = r6.LJJIZ
            r8 = 0
            r11 = -1
            r9 = r8
            r12 = r11
            int r0 = r7.addTrackFilter(r8, r9, r10, r11, r12)
            android.util.Pair r7 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.<init>(r10, r0)
            goto L6b
        L87:
            com.ss.android.vesdk.filterparam.VEColorFilterParam r10 = new com.ss.android.vesdk.filterparam.VEColorFilterParam
            r10.<init>()
            r3 = -1
            goto L55
        L8e:
            r1 = r9
            goto L1b
        L90:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lba
            r3.<init>()     // Catch: org.json.JSONException -> Lba
            java.lang.String r0 = "filterId"
            r3.put(r0, r1)     // Catch: org.json.JSONException -> Lba
            java.lang.String r1 = "intensity"
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch: org.json.JSONException -> Lba
            r3.put(r1, r0)     // Catch: org.json.JSONException -> Lba
            java.lang.String r1 = "tag"
            java.lang.String r0 = "setFilterNew"
            r3.put(r1, r0)     // Catch: org.json.JSONException -> Lba
            java.lang.String r1 = "resultCode"
            r0 = 0
            r3.put(r1, r0)     // Catch: org.json.JSONException -> Lba
            java.lang.String r1 = "vesdk_event_recorder_single_filter"
            java.lang.String r0 = "business"
            ud7.b.LIZIZ(r1, r0, r3, r2)     // Catch: org.json.JSONException -> Lba
            return
        Lba:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VERecorder.LJJII(float, java.lang.String):void");
    }

    public final void LJJIII(VEBaseRecorderLensParams vEBaseRecorderLensParams, InterfaceC2219671Bu9 interfaceC2219671Bu9) {
        int i = vEBaseRecorderLensParams.algorithmFlag;
        if (i != 15) {
            if (i != 21) {
                if (i != 24) {
                    if (i != 27) {
                        if (i != 28) {
                            this.LIZIZ.LJ(vEBaseRecorderLensParams, interfaceC2219671Bu9);
                            return;
                        } else {
                            this.LIZIZ.LJ(vEBaseRecorderLensParams, interfaceC2219671Bu9);
                            return;
                        }
                    }
                } else {
                    this.LIZIZ.LJ(vEBaseRecorderLensParams, interfaceC2219671Bu9);
                    return;
                }
            } else {
                VETaintSceneDetectParams vETaintSceneDetectParams = (VETaintSceneDetectParams) vEBaseRecorderLensParams;
                InterfaceC2219581Bu0 interfaceC2219581Bu0 = this.LJ;
                if (interfaceC2219581Bu0 == null) {
                    return;
                }
                ((C1DLN) interfaceC2219581Bu0).LIZ.q9("lens_taint_scene_detect", "TaintSceneDetectModel", new C2219521Btu(this, vETaintSceneDetectParams, interfaceC2219671Bu9));
                return;
            }
        }
        this.LIZIZ.LJ(vEBaseRecorderLensParams, interfaceC2219671Bu9);
    }

    public final void LJJIL(VECameraCapture vECameraCapture, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCameraPreview, cameraPreview = ");
        sbLIZ.append(vECameraCapture);
        sbLIZ.append(", isGLReady = ");
        sbLIZ.append(z);
        C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
        LJIILLIIL(vECameraCapture);
        this.LIZIZ.LJJIL(vECameraCapture, z);
    }

    public final void LJJJI(Surface surface, final InterfaceC2183551Acz interfaceC2183551Acz) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPreviewAsync, surface = ");
        sbLIZ.append(surface);
        C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC2183551Acz interfaceC2183551Acz2 = new InterfaceC2183551Acz() { // from class: X.1ANv
            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
                InterfaceC2183551Acz interfaceC2183551Acz3 = interfaceC2183551Acz;
                if (interfaceC2183551Acz3 != null) {
                    interfaceC2183551Acz3.onDone(i);
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("resultCode", i);
                    b.LIZ("vesdk_event_recorder_start_preview_async", "business", jSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
        k kVar = this.LIZIZ;
        TECamera tECamera = kVar.LJJJI;
        if (tECamera != null) {
            tECamera.setEnableCameraNotify(true);
        }
        TECamera tECamera2 = kVar.LJJJIL;
        if (tECamera2 != null) {
            tECamera2.setEnableCameraNotify(true);
        }
        C1311120kDu.LIZ("startPreviewAsync");
        kVar.LJJLIIIJ = interfaceC2183551Acz2;
        C1311120kDu.LIZ("startPreview");
        int iLJJIJIIJIL = kVar.LJJJ.LJJIJIIJIL(surface);
        C1311120kDu.LIZIZ();
        synchronized (kVar.LJL) {
            try {
                VEVideoEncodeSettings vEVideoEncodeSettings = kVar.LJIIIIZZ;
                if (vEVideoEncodeSettings != null && kVar.LJJZZIII == null) {
                    VERecordMode vERecordMode = kVar.LJIIJJI;
                    if (vERecordMode == VERecordMode.DUET) {
                        C2254371DLn c2254371DLn = new C2254371DLn(kVar, kVar.LJIIJ, vEVideoEncodeSettings.getVideoRes());
                        kVar.LJJZZIII = c2254371DLn;
                        c2254371DLn.LJII();
                    } else if (vERecordMode == VERecordMode.REACTION) {
                        C2254351DLl c2254351DLl = new C2254351DLl(kVar, kVar.LJIIIIZZ.getVideoRes());
                        kVar.LJJZZIII = c2254351DLl;
                        c2254351DLl.LJII();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1305700k5A.LIZIZ(iLJJIJIIJIL, "te_record_start_preview_ret");
        if (iLJJIJIIJIL != 0) {
            kVar.LJJLIIIJ.onDone(iLJJIJIIJIL);
            kVar.LJJLIIIJ = null;
        }
        C1311120kDu.LIZIZ();
    }

    public final void LJJJIL(final float f, final InterfaceC2183551Acz interfaceC2183551Acz) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startRecordAsync, speed = ");
        sbLIZ.append(f);
        C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC2183551Acz interfaceC2183551Acz2 = new InterfaceC2183551Acz() { // from class: X.1ANu
            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("speed", f);
                    jSONObject.put("resultCode", i);
                    b.LIZ("vesdk_event_recorder_start_record_async", "business", jSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                InterfaceC2183551Acz interfaceC2183551Acz3 = interfaceC2183551Acz;
                if (interfaceC2183551Acz3 != null) {
                    interfaceC2183551Acz3.onDone(i);
                }
            }
        };
        k kVar = this.LIZIZ;
        int iLJJJ = kVar.LJJJ(false, f, "");
        if (iLJJJ == 0 && kVar.LJIIJJI != VERecordMode.KARAOKE_PURE_AUDIO) {
            kVar.LJJJLZIJ = interfaceC2183551Acz2;
        } else {
            interfaceC2183551Acz2.onDone(iLJJJ);
        }
    }

    public final void LJIJI(int i, int i2, long j) {
        int iLJJIIJZLJL = this.LIZIZ.LJJIIJZLJL(i, i2, j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("seekPlayTrack ret= ");
        sbLIZ.append(iLJJIIJZLJL);
        sbLIZ.append(" trackIndex = ");
        sbLIZ.append(i);
        sbLIZ.append(" trackType = ");
        sbLIZ.append(i2);
        sbLIZ.append(" time ");
        sbLIZ.append(j);
        C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCustomVideoBg ");
        sbLIZ.append(str);
        sbLIZ.append(" ");
        sbLIZ.append(str2);
        sbLIZ.append(" ");
        sbLIZ.append(str3);
        C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
        k kVar = this.LIZIZ;
        synchronized (kVar.LJL) {
            try {
                C1DMH c1dmh = kVar.LJJZZIII;
                if (c1dmh != null && !(c1dmh instanceof C2254331DLj)) {
                    c1dmh.onDestroy();
                    kVar.LJJZZIII = null;
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    if (kVar.LJJZZIII == null) {
                        C2254331DLj c2254331DLj = new C2254331DLj(kVar, str, str2, str3);
                        kVar.LJJZZIII = c2254331DLj;
                        c2254331DLj.LIZ.LIZ(c2254331DLj);
                        c2254331DLj.LJIILJJIL();
                    }
                    ((C2254331DLj) kVar.LJJZZIII).LJIIIZ(str, str2, str3);
                } else {
                    C1DMH c1dmh2 = kVar.LJJZZIII;
                    if (c1dmh2 != null) {
                        c1dmh2.onDestroy();
                    }
                    kVar.LJJZZIII = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIFFI(String str, float f, float f2) {
        VEReshapeFilterParam vEReshapeFilterParam;
        int iAddTrackFilter;
        String str2;
        C1404320meE c1404320meE = new C1404320meE();
        c1404320meE.LIZ(f, "iesve_verecorder_set_bigeyes_smallface_level");
        c1404320meE.LIZIZ(1, "old");
        k kVar = this.LIZIZ;
        Pair pair = (Pair) ((HashMap) kVar.LJJLIIIJLLLLLLLZ).get(13);
        if (pair != null) {
            vEReshapeFilterParam = (VEReshapeFilterParam) pair.first;
            iAddTrackFilter = ((Integer) pair.second).intValue();
        } else {
            vEReshapeFilterParam = new VEReshapeFilterParam();
            iAddTrackFilter = -1;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        vEReshapeFilterParam.resPath = str2;
        vEReshapeFilterParam.eyeIntensity = f;
        vEReshapeFilterParam.cheekIntensity = f2;
        if (iAddTrackFilter >= 0) {
            kVar.LJJIZ.updateTrackFilterParam(iAddTrackFilter, vEReshapeFilterParam);
        } else {
            iAddTrackFilter = kVar.LJJIZ.addTrackFilter(0, 0, vEReshapeFilterParam, -1, -1);
        }
        if (pair == null) {
            pair = new Pair(vEReshapeFilterParam, Integer.valueOf(iAddTrackFilter));
        }
        ((HashMap) kVar.LJJLIIIJLLLLLLLZ).put(13, pair);
        if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("strResPath", str);
                jSONObject.put("fEyeIntensity", String.valueOf(f));
                jSONObject.put("fCheekIntensity", String.valueOf(f2));
                jSONObject.put("resultCode", 0);
                b.LIZIZ("vesdk_event_recorder_face_reshape", "business", jSONObject, true);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final int LJJIJL(float f, float f2, int i, int i2) {
        EnumC2254481DLy enumC2254481DLy;
        k kVar = this.LIZIZ;
        kVar.getClass();
        if (i == 0) {
            enumC2254481DLy = EnumC2254481DLy.TOUCH_DOWN;
        } else if (i == 1) {
            enumC2254481DLy = EnumC2254481DLy.PAN;
        } else if (i == 2) {
            enumC2254481DLy = EnumC2254481DLy.TOUCH_UP;
        } else if (i == 3) {
            enumC2254481DLy = EnumC2254481DLy.TOUCH_LONG;
        } else {
            return -100;
        }
        EnumC2254471DLx enumC2254471DLx = EnumC2254471DLx.values()[i2];
        C1DM1 c1dm1 = new C1DM1();
        c1dm1.LIZ = new C1DM9(enumC2254481DLy, enumC2254471DLx, f, f2);
        return kVar.LJJIZ.LJIIL(c1dm1);
    }

    public final void LJJJJL(boolean z, boolean z2, boolean z3, boolean z4) {
        k kVar = this.LIZIZ;
        kVar.LJJJJ.LJIILLIIL = z2;
        boolean z5 = true;
        kVar.LJJJ.LJIJJLI("EnableAudioGraphRefactor", true);
        if (!z2) {
            kVar.LJJJJ.getClass();
            kVar.LJJJ.LJIJJLI("AudioCapturingForSomeScenes", false);
            VEAudioCapture vEAudioCapture = kVar.LIZ;
            if (vEAudioCapture != null) {
                vEAudioCapture.stop(null);
            }
            C2254401DLq c2254401DLq = kVar.LJJJJ;
            EnumC2249751D3t enumC2249751D3t = EnumC2249751D3t.DISABLE;
            c2254401DLq.LJJIII = enumC2249751D3t;
            kVar.LJJJ.LJJIII("RecordMicConfig", enumC2249751D3t.ordinal());
            VEAudioCapture vEAudioCapture2 = kVar.LIZ;
            if (vEAudioCapture2 != null) {
                vEAudioCapture2.release(null);
            }
        }
        kVar.LJIIL(z2, z4);
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setBool("UseAudioGraph", z2);
        tEBundleObtain.setBool("UseOutPut", z);
        tEBundleObtain.setBool("UseMicIn", z3);
        tEBundleObtain.setBool("UseBgm", z4);
        kVar.LJJJ.LJIL("AudioGraphParam", tEBundleObtain);
        TERecorderInterface tERecorderInterface = kVar.LJJJ;
        if (z2 && !z3) {
            z5 = false;
        }
        tERecorderInterface.LJIJJLI("UseMicIn", z5);
    }

    public final int LJIILIIL(VECameraCapture vECameraCapture, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, VEPreviewSettings vEPreviewSettings, boolean z) {
        boolean z2;
        C1311120kDu.LIZ("VECamera-VERecorder-init");
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZJ = this.LIZ.LIZJ();
        VERuntime vERuntime = this.LIZJ;
        boolean z3 = false;
        if (vERuntime != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (vERuntime.getEnv() != null) {
            z3 = true;
        }
        if (z2 & z3) {
            this.LIZJ.getEnv().LIZ();
        }
        int i = -1;
        try {
            try {
                try {
                    int iLJIJI = this.LIZIZ.LJIJI(vECameraCapture, vEVideoEncodeSettings, vEAudioEncodeSettings, vEPreviewSettings, strLIZJ, z);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", System.currentTimeMillis() - jCurrentTimeMillis);
                        b.LIZIZ("vesdk_event_recorder_init", "performance", jSONObject, true);
                        C1311120kDu.LIZIZ();
                        return iLJIJI;
                    } catch (JSONException e) {
                        e = e;
                        i = iLJIJI;
                        TryCatchGuardChecker.doCheck(e);
                        C2484209oO.LIZLLL("VERecorder", "init recorder applog failed.", e);
                        C1311120kDu.LIZIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("init recorder exit early, ret = ");
                        sbLIZ.append(i);
                        C2484209oO.LJIIIIZZ("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
                        return i;
                    }
                } catch (NullPointerException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2484209oO.LIZLLL("VERecorder", "init recorder failed, runtime env is null.", e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("init failed: VESDK need to be init: ");
                    sbLIZ2.append(Log.getStackTraceString(e2));
                    throw new VEException(-1, C2188811AlT.LIZIZ(sbLIZ2));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1311120kDu.LIZIZ();
                throw th;
            }
        } catch (JSONException e3) {
            e = e3;
        }
    }

    public final int LJJIIZI(int i, int i2, int i3, int i4, String str) {
        int iLJJIIZI = this.LIZIZ.LJJIIZI(i3, i, i2, i4, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRecordBGM ");
        sbLIZ.append(str);
        sbLIZ.append(", ret=");
        sbLIZ.append(iLJJIIZI);
        C2484209oO.LJI("VERecorder", C2188811AlT.LIZIZ(sbLIZ));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", iLJJIIZI);
            jSONObject.put("trimIn", i);
            jSONObject.put("trimOut", i2);
            jSONObject.put("bgmType", i3);
            b.LIZIZ("vesdk_event_recorder_set_bgm", "behavior", jSONObject, true);
            return iLJJIIZI;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return iLJJIIZI;
        }
    }

    public final void LJJIJ(final int i, final int i2, final InterfaceC2173471A4j interfaceC2173471A4j, boolean z, IVEFrameShotScreenCallback iVEFrameShotScreenCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZIZ.LJJIJIL(i, i2, true, new InterfaceC2173471A4j() { // from class: X.1ANw
            public final /* synthetic */ boolean LIZJ = false;
            public final /* synthetic */ boolean LIZLLL = true;

            @Override // X.InterfaceC2173471A4j
            public final void LIZ(int i3, Bitmap bitmap) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    String str = "vesdk_event_recorder_shot_screen";
                    jSONObject.put("width", i);
                    jSONObject.put("height", i2);
                    jSONObject.put("resultCode", i3);
                    if (this.LIZJ) {
                        str = "vesdk_event_recorder_take_picture";
                    }
                    jSONObject.put("is_effect", this.LIZLLL);
                    jSONObject.put("duration", System.currentTimeMillis() - jCurrentTimeMillis);
                    b.LIZIZ(str, "business", jSONObject, true);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                interfaceC2173471A4j.LIZ(i3, bitmap);
            }
        }, z, iVEFrameShotScreenCallback);
    }

    public final int LJJIJIL(float f, float f2, float f3, float f4, float f5) {
        k kVar = this.LIZIZ;
        kVar.getClass();
        C1DM1 c1dm1 = new C1DM1();
        c1dm1.LIZ = new C1DM5(f, f2, f3, f4, f5);
        return kVar.LJJIZ.LJIIL(c1dm1);
    }

    public final void LJJIJIIJI(final int i, final int i2, boolean z, final boolean z2, final InterfaceC2173471A4j interfaceC2173471A4j, final boolean z3) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1284730jXL.LIZ(1L, "ve_use_camera");
        this.LIZIZ.LJJIJL(i, i2, z, z2, new InterfaceC2173471A4j() { // from class: X.1ANx
            @Override // X.InterfaceC2173471A4j
            public final void LIZ(int i3, Bitmap bitmap) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    String str = "vesdk_event_recorder_shot_screen";
                    jSONObject.put("width", i);
                    jSONObject.put("height", i2);
                    jSONObject.put("resultCode", i3);
                    if (z3) {
                        str = "vesdk_event_recorder_take_picture";
                    }
                    jSONObject.put("is_effect", z2);
                    jSONObject.put("duration", System.currentTimeMillis() - jCurrentTimeMillis);
                    b.LIZIZ(str, "business", jSONObject, true);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                interfaceC2173471A4j.LIZ(i3, bitmap);
            }
        });
    }
}
