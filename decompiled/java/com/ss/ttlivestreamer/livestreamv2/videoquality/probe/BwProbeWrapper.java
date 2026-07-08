package com.ss.ttlivestreamer.livestreamv2.videoquality.probe;

import X.AbstractC1282800jUE;
import X.C098200Yq;
import X.C1282770jUB;
import X.C1282810jUF;
import X.C1282820jUG;
import X.C1282850jUJ;
import X.C1282880jUM;
import X.C1282920jUQ;
import X.C1282930jUR;
import X.C1282950jUT;
import X.C1283030jUb;
import X.C1283420jVE;
import X.C189200o6;
import X.C1954807lC;
import X.C1C7U;
import X.C2188811AlT;
import X.C2250071D4z;
import X.C786410Ut5;
import X.EnumC1282790jUD;
import X.InterfaceC1282840jUI;
import X.InterfaceC1282900jUO;
import X.InterfaceC1283000jUY;
import X.InterfaceC1283430jVF;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.livestreamv2.videoquality.controler.model.VideoQualityMockConfig;
import com.ss.ttlivestreamer.livestreamv2.videoquality.probe.BwProbeWrapper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class BwProbeWrapper {
    public final HandlerThread LIZ;
    public final Handler LIZIZ;
    public InterfaceC1283000jUY LIZJ;
    public String LIZLLL;
    public VideoQualityMockConfig LJ;
    public volatile C1282850jUJ LJFF;

    public interface VeLiveProbeListenerWrapper {
        void LIZ(EnumC1282790jUD enumC1282790jUD, int i, String str);

        void onLogMonitor(String str);
    }

    public final void LIZLLL() {
        if (this.LIZ == null) {
            return;
        }
        if (C786410Ut5.u3() != this.LIZ) {
            C786410Ut5.LJJZZIII(this.LIZIZ, new Runnable() { // from class: X.0jUW
                @Override // java.lang.Runnable
                public final void run() {
                    BwProbeWrapper bwProbeWrapper = this.LL;
                    bwProbeWrapper.getClass();
                    C1C7U.LIZ("BwProbeWrapper@901e.releaseHandlerAsync$1L");
                    bwProbeWrapper.LIZLLL();
                    C1C7U.LIZIZ("BwProbeWrapper@901e.releaseHandlerAsync$1L");
                }
            });
        } else {
            C786410Ut5.LJJZZIII(this.LIZIZ, new Runnable() { // from class: X.0jUU
                @Override // java.lang.Runnable
                public final void run() {
                    BwProbeWrapper bwProbeWrapper = this.LL;
                    bwProbeWrapper.getClass();
                    C1C7U.LIZ("BwProbeWrapper@901e.releaseHandlerAsync$2L");
                    bwProbeWrapper.LIZIZ.removeCallbacksAndMessages(null);
                    bwProbeWrapper.LIZIZ.getLooper().quitSafely();
                    C1C7U.LIZIZ("BwProbeWrapper@901e.releaseHandlerAsync$2L");
                }
            });
        }
    }

    public final void LJ() {
        int i;
        if (this.LIZ == null) {
            return;
        }
        if (C786410Ut5.u3() != this.LIZ) {
            C786410Ut5.LJJZZIII(this.LIZIZ, new Runnable() { // from class: X.0jUV
                @Override // java.lang.Runnable
                public final void run() {
                    BwProbeWrapper bwProbeWrapper = this.LL;
                    bwProbeWrapper.getClass();
                    C1C7U.LIZ("BwProbeWrapper@901e.releaseProbeAsync$1L");
                    bwProbeWrapper.LJ();
                    C1C7U.LIZIZ("BwProbeWrapper@901e.releaseProbeAsync$1L");
                }
            });
            return;
        }
        C1283420jVE.LIZIZ();
        InterfaceC1283000jUY interfaceC1283000jUY = this.LIZJ;
        VideoQualityMockConfig videoQualityMockConfig = this.LJ;
        if (videoQualityMockConfig != null && videoQualityMockConfig.mockProbeSwitch == 1 && (i = videoQualityMockConfig.mockAsyncReleaseSleepMs) > 0) {
            try {
                Thread.sleep(i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (interfaceC1283000jUY != null) {
            interfaceC1283000jUY.release();
            this.LIZJ = null;
        }
        C1283420jVE.LIZIZ();
    }

    public final int LJFF() {
        if (this.LIZ == null) {
            return -3;
        }
        if (C786410Ut5.u3() != this.LIZ) {
            C786410Ut5.LJJZZIII(this.LIZIZ, new Runnable() { // from class: X.0jUZ
                @Override // java.lang.Runnable
                public final void run() {
                    BwProbeWrapper bwProbeWrapper = this.LL;
                    C1C7U.LIZ("BwProbeWrapper@901e.start$1L");
                    bwProbeWrapper.LJFF();
                }
            });
            return 0;
        }
        C1283420jVE.LIZIZ();
        InterfaceC1283000jUY interfaceC1283000jUY = this.LIZJ;
        if (interfaceC1283000jUY != null) {
            interfaceC1283000jUY.start();
            C1283420jVE.LIZIZ();
            return 0;
        }
        C1283420jVE.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startBWTestAnchorNet(), failed:veLiveProbe is null, url:");
        sbLIZ.append(this.LIZLLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1283430jVF interfaceC1283430jVF = C1283030jUb.LIZ.LIZ;
        if (interfaceC1283430jVF == null) {
            return -2;
        }
        interfaceC1283430jVF.LIZJ(4, "BwProbeWrapper", strLIZIZ, null);
        return -2;
    }

    public final void LJI() {
        if (this.LIZ == null) {
            return;
        }
        if (C786410Ut5.u3() != this.LIZ) {
            C786410Ut5.LJJZZIII(this.LIZIZ, new Runnable() { // from class: X.0jUX
                @Override // java.lang.Runnable
                public final void run() {
                    BwProbeWrapper bwProbeWrapper = this.LL;
                    bwProbeWrapper.getClass();
                    C1C7U.LIZ("BwProbeWrapper@901e.stopAsync$1L");
                    bwProbeWrapper.LJI();
                    C1C7U.LIZIZ("BwProbeWrapper@901e.stopAsync$1L");
                }
            });
            return;
        }
        C1283420jVE.LIZIZ();
        InterfaceC1283000jUY interfaceC1283000jUY = this.LIZJ;
        if (interfaceC1283000jUY != null) {
            interfaceC1283000jUY.stop();
        }
    }

    public BwProbeWrapper() {
        C1282920jUQ c1282920jUQ = C1282930jUR.LIZ;
        InterfaceC1282900jUO interfaceC1282900jUO = c1282920jUQ.LIZ;
        this.LIZ = interfaceC1282900jUO != null ? interfaceC1282900jUO.LIZIZ() : null;
        InterfaceC1282900jUO interfaceC1282900jUO2 = c1282920jUQ.LIZ;
        this.LIZIZ = interfaceC1282900jUO2 != null ? interfaceC1282900jUO2.LIZ() : null;
    }

    public final void LIZJ() {
        C1283420jVE.LIZIZ();
        InterfaceC1283000jUY interfaceC1283000jUY = this.LIZJ;
        if (interfaceC1283000jUY != null) {
            interfaceC1283000jUY.release();
            this.LIZJ = null;
        }
        if (this.LIZ == null) {
            return;
        }
        this.LIZIZ.removeCallbacksAndMessages(null);
        this.LIZIZ.getLooper().quitSafely();
    }

    public final int LIZ(AbstractC1282800jUE abstractC1282800jUE) {
        Object c098200Yq;
        InterfaceC1283000jUY c1282770jUB;
        InterfaceC1283000jUY interfaceC1283000jUY = this.LIZJ;
        Object obj = null;
        if (interfaceC1283000jUY != null) {
            interfaceC1283000jUY.release();
            this.LIZJ = null;
        }
        boolean z = abstractC1282800jUE instanceof C1282810jUF;
        if (z) {
            this.LIZLLL = abstractC1282800jUE.LIZIZ;
        }
        C1283420jVE.LIZIZ();
        InterfaceC1283000jUY.LIZ.getClass();
        if (abstractC1282800jUE instanceof C1282820jUG) {
            c1282770jUB = new C1282770jUB((C1282820jUG) abstractC1282800jUE);
        } else if (z) {
            try {
                Object objNewInstance = Class.forName("com.ss.pusher.anet.VeLiveProbeRtcImp").getConstructor(C1282810jUF.class).newInstance(abstractC1282800jUE);
                if (objNewInstance instanceof InterfaceC1283000jUY) {
                    c098200Yq = (InterfaceC1283000jUY) objNewInstance;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            c1282770jUB = (InterfaceC1283000jUY) obj;
        } else {
            throw new C1954807lC();
        }
        this.LIZJ = c1282770jUB;
        if (c1282770jUB != null) {
            return 0;
        }
        return -1;
    }

    public final void LIZIZ(final C1282880jUM c1282880jUM, final C2250071D4z c2250071D4z, final VeLiveProbeListenerWrapper veLiveProbeListenerWrapper) {
        if (this.LIZ == null) {
            return;
        }
        if (C786410Ut5.u3() != this.LIZ) {
            C786410Ut5.LJJZZIII(this.LIZIZ, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.videoquality.probe.BwProbeWrapper.1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BwProbeWrapper@901e.initAnchorNetProbeAsync$1");
                    try {
                        BwProbeWrapper.this.LIZIZ(c1282880jUM, c2250071D4z, veLiveProbeListenerWrapper);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BwProbeWrapper@901e.initAnchorNetProbeAsync$1");
                }
            });
            return;
        }
        C1283420jVE.LIZIZ();
        String str = c1282880jUM.LIZJ;
        Context context = c2250071D4z.LJFF;
        String str2 = c2250071D4z.LIZIZ;
        String str3 = c2250071D4z.LIZ;
        JSONObject jSONObjectLIZ = C1282950jUT.LIZ(c1282880jUM);
        if (context != null && str2 != null && str3 != null) {
            if (LIZ(new C1282810jUF(context, str2, str, str3, jSONObjectLIZ, new InterfaceC1282840jUI() { // from class: com.ss.ttlivestreamer.livestreamv2.videoquality.probe.BwProbeWrapper.2
                @Override // X.InterfaceC1282840jUI
                public final void LIZIZ(JSONObject jSONObject) {
                }

                @Override // X.InterfaceC1282840jUI
                public final void onLogMonitor(String str4) {
                    veLiveProbeListenerWrapper.onLogMonitor(str4);
                }

                @Override // X.InterfaceC1282840jUI
                public final void LIZ(EnumC1282790jUD enumC1282790jUD, int i, String str4) {
                    veLiveProbeListenerWrapper.LIZ(enumC1282790jUD, i, str4);
                }
            })) != 0) {
                C1283420jVE.LIZIZ();
                LJ();
                LIZLLL();
                return;
            }
            return;
        }
        C1283420jVE.LIZIZ();
        LJ();
        LIZLLL();
    }
}
