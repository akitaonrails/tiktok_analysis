package com.ss.android.ugc.aweme.legoImp.task.pumbaa;

import X.C08Q0;
import X.C13LQ;
import X.C1697810uHb;
import X.C825970Wah;
import X.C837700Wtc;
import X.C837760Wti;
import X.C837770Wtj;
import X.C837960Wu2;
import X.C837970Wu3;
import X.C837980Wu4;
import X.C837990Wu5;
import X.C838190WuP;
import X.C838220WuS;
import X.C844470XAv;
import X.InterfaceC837710Wtd;
import X.InterfaceC837780Wtk;
import X.InterfaceC838160WuM;
import Y.ACallableS69S1200000_13;
import Y.ARunnableS82S0200000_13;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.core.IBPEALazyInit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.TTPSystemAPIInit;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class TTPSystemAPIInit implements IBPEALazyInit {
    public final List<C837770Wtj> LIZ = C1697810uHb.LJIIJJI(new C837770Wtj("contact", null), new C837770Wtj("sensor", null), new C837770Wtj("clipboard", C1697810uHb.LJIIJJI("clipboard_setText", "clipboard_setClip", "clipboard_getText", "clipboard_getClip")), new C837770Wtj("ip", null), new C837770Wtj("gaid", null), new C837770Wtj("country/carrier", null), new C837770Wtj("screenRecord", null), new C837770Wtj("audio", null), new C837770Wtj("video", null), new C837770Wtj("screenShot", null), new C837770Wtj("location", null));
    public final String LIZIZ = "LiveCore";
    public final String LIZJ = "SpeechSDK";
    public final String LIZLLL = "effectSDK";
    public final List<String> LJ = C1697810uHb.LJIIJJI("LiveCore", "SpeechSDK", "effectSDK");
    public final C837760Wti LJFF = new InterfaceC837780Wtk() { // from class: X.0Wti
        @Override // X.InterfaceC837780Wtk
        public final boolean LIZ(C825940Wae c825940Wae) {
            List<String> list;
            List<String> list2;
            Object objLIZIZ = c825940Wae.LIZIZ("isPreCheck");
            if (!(objLIZIZ instanceof Boolean)) {
                objLIZIZ = null;
            }
            if (Intrinsics.LJFF(objLIZIZ, Boolean.TRUE)) {
                return false;
            }
            Integer num = c825940Wae.LIZLLL;
            int type = EnumC746240TPa.DIRECT_AUTH.getType();
            if (num != null && num.intValue() == type) {
                if (!C13LP.LJJJJ(c825940Wae.LIZIZ("sdkName"), this.LIZ.LJ)) {
                    return false;
                }
            }
            for (C837770Wtj c837770Wtj : this.LIZ.LIZ) {
                c837770Wtj.getClass();
                String[] strArr = c825940Wae.LIZJ;
                if (strArr != null && C13LQ.LJJIJIIJI(c837770Wtj.LIZ, strArr) >= 0 && ((list = c837770Wtj.LIZIZ) == null || list.isEmpty() || ((list2 = c837770Wtj.LIZIZ) != null && C13LP.LJJJJ(c825940Wae.LIZIZ, list2)))) {
                    return true;
                }
            }
            return false;
        }
    };
    public final String LJI = "1477443583";
    public final int LJII = 1476395008;
    public final C837700Wtc LJIIIIZZ = new InterfaceC837710Wtd() { // from class: X.0Wtc
        /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
        @Override // X.InterfaceC837710Wtd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.C838040WuA LIZ(X.C825970Wah r11) throws X.C838130WuJ {
            /*
                Method dump skipped, instruction units count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C837700Wtc.LIZ(X.0Wah):X.0WuA");
        }
    };
    public final List<String> LJIIIZ = C1697810uHb.LJIIJJI("LiveCoreImpl.switchAudioCapture", "LiveCoreImpl.setAudioMute(false)", "LiveCoreImpl.startAudioCapture", "LiveCoreImpl.resume", "sendDirectiveStartCapture");
    public final List<String> LJIIJ = C1697810uHb.LJIIJJI("LiveCoreImpl.setAudioMute(true)", "LiveCoreImpl.stopAudioCapture", "LiveCoreImpl.pause", "LiveCoreImpl.release", "sendDirectiveStopCapture");
    public final Set<String> LJIIJJI = C13LQ.LJLIIL(new String[]{"release()V", "stop()V", "close()V"});
    public final Set<String> LJIIL = C13LQ.LJLIIL(new String[]{"android/hardware/camera2/CameraManager", "android/hardware/Camera", "android/media/AudioRecord"});
    public final Set<Integer> LJIILIIL = C13LQ.LJLIIL(new Integer[]{1476788481, 1476788482, 1476788483, 1476788484, 1476788485});
    public final int LJIILJJIL = 1476788485;
    public final int LJIILL = 1476788229;
    public final C837960Wu2 LJIILLIIL = new InterfaceC838160WuM() { // from class: X.0Wu2
        @Override // X.InterfaceC838160WuM
        public final void LIZ(C825940Wae c825940Wae) {
            Integer num = c825940Wae.LIZLLL;
            int type = EnumC746240TPa.DIRECT_AUTH.getType();
            if (num != null && num.intValue() == type) {
                Object objLIZIZ = c825940Wae.LIZIZ("sdkName");
                Integer numLIZ = null;
                if (Intrinsics.LJFF(objLIZIZ, this.LIZ.LIZLLL)) {
                    C837860Wts.LIZ(c825940Wae, "android/hardware/SensorManager", "registerListener(Landroid/hardware/SensorListener;I)Z", null);
                    return;
                }
                if (!Intrinsics.LJFF(objLIZIZ, this.LIZ.LIZIZ) && !Intrinsics.LJFF(objLIZIZ, this.LIZ.LIZJ)) {
                    return;
                }
                Object objLIZIZ2 = c825940Wae.LIZIZ("methodName");
                if (C13LP.LJJJJ(objLIZIZ2, this.LIZ.LJIIIZ)) {
                    C837860Wts.LIZ(c825940Wae, "android/media/AudioRecord", "startRecording()V", null);
                    return;
                }
                if (C13LP.LJJJJ(objLIZIZ2, this.LIZ.LJIIJ)) {
                    C837860Wts.LIZ(c825940Wae, "android/media/AudioRecord", "stop()V", null);
                    return;
                }
                C837860Wts.LIZ(c825940Wae, "android/media/AudioRecord", "stop()V", null);
                Cert cert = c825940Wae.LIZ;
                if (cert != null) {
                    numLIZ = C825920Wac.LIZ(cert);
                }
                TTPSystemAPIInit tTPSystemAPIInit = this.LIZ;
                C825970Wah c825970Wah = new C825970Wah(numLIZ, null, null, null, c825940Wae);
                tTPSystemAPIInit.getClass();
                TTPSystemAPIInit.LIZ("sandbox_system_api_unknown_sdk_method", c825970Wah);
            }
        }
    };

    @Override // com.bytedance.bpea.core.IBPEALazyInit
    public final void LIZJ() {
        System.currentTimeMillis();
        C844470XAv.LIZ.getClass();
        if (C08Q0.LJ(C844470XAv.LIZ(), "pns_bpea_sandbox_switch", true)) {
            C837990Wu5.LIZ = this.LJFF;
            C837990Wu5.LIZIZ = this.LJIIIIZZ;
            C837980Wu4.LIZ = this.LJIILLIIL;
        }
    }

    public static void LIZ(String str, C825970Wah c825970Wah) {
        Throwable th = new Throwable();
        ExecutorService executorService = C838190WuP.LJFF;
        ACallableS69S1200000_13 aCallableS69S1200000_13 = new ACallableS69S1200000_13(str, c825970Wah, th, 0);
        ExecutorService executorService2 = C838190WuP.LJFF;
        C838220WuS c838220WuS = new C838220WuS();
        try {
            executorService2.execute(new ARunnableS82S0200000_13(aCallableS69S1200000_13, c838220WuS, 11));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c838220WuS.LIZ(new C837970Wu3(e));
        }
    }
}
