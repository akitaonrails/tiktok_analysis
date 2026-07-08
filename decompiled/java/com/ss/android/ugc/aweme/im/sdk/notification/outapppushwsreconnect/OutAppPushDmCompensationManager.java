package com.ss.android.ugc.aweme.im.sdk.notification.outapppushwsreconnect;

import X.C01GW;
import X.C04TD;
import X.C0C64;
import X.C0I0B;
import X.C0XE1;
import X.C0XEZ;
import X.C19328310jZ;
import X.C2104108Md;
import X.C2188811AlT;
import X.C2203431BLp;
import X.C2214201BlK;
import X.C452501pT;
import X.C786410Ut5;
import X.C805820VjI;
import X.C805870VjN;
import X.C821280WJq;
import X.C869590Y9l;
import X.C894660Z7w;
import X.EnumC805800VjG;
import X.InterfaceC805830VjJ;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.setting.OutAppPushWsReconnectConfigModel;
import com.ss.android.ugc.aweme.im.service.IOutAppPushDmCompensationManager;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class OutAppPushDmCompensationManager implements IOutAppPushDmCompensationManager, C0XEZ {
    public static final C01GW<IOutAppPushDmCompensationManager> LLIZ = C452501pT.LIZIZ(new C805870VjN());
    public final OutAppPushWsReconnectConfigModel LL;
    public final InterfaceC805830VjJ LLILLJJLI;
    public volatile HandlerThread LLILLL;
    public volatile boolean LLILZ;
    public volatile OutAppPushDmCompensationHandler LLILZIL;
    public volatile long LLILZLL;

    public OutAppPushDmCompensationManager() {
        this(0);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IOutAppPushDmCompensationManager
    public final void LIZIZ() {
        synchronized (this) {
            try {
                if (LJ() && this.LL.upload_event) {
                    this.LLILZ = false;
                    C2203431BLp.LIZIZ.LJIIJJI(this);
                    OutAppPushDmCompensationHandler outAppPushDmCompensationHandler = this.LLILZIL;
                    if (outAppPushDmCompensationHandler != null) {
                        C786410Ut5.LJLJJLL(outAppPushDmCompensationHandler, outAppPushDmCompensationHandler.obtainMessage(EnumC805800VjG.LOGOUT.getWhat()));
                    }
                    HandlerThread handlerThread = this.LLILLL;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                    this.LLILLL = null;
                    this.LLILZIL = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IOutAppPushDmCompensationManager
    public final void LJIIJ() {
        Looper mainLooper;
        synchronized (this) {
            try {
                if (LJ() && this.LL.upload_event) {
                    if (!this.LLILZ) {
                        this.LLILZ = true;
                        C2203431BLp.LIZIZ.LIZLLL(this);
                        this.LLILLL = new HandlerThread("OutAppPushWsReconnectThread");
                        HandlerThread handlerThread = this.LLILLL;
                        if (handlerThread != null) {
                            handlerThread.start();
                        }
                        HandlerThread handlerThread2 = this.LLILLL;
                        if (handlerThread2 == null || (mainLooper = C786410Ut5.W2(handlerThread2)) == null) {
                            mainLooper = Looper.getMainLooper();
                        }
                        this.LLILZIL = new OutAppPushDmCompensationHandler(mainLooper, this.LLILLJJLI);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static IOutAppPushDmCompensationManager LIZLLL() {
        Object objLIZ = C04TD.LIZ(IOutAppPushDmCompensationManager.class, false);
        if (objLIZ != null) {
            return (IOutAppPushDmCompensationManager) objLIZ;
        }
        if (C04TD.e1 == null) {
            synchronized (IOutAppPushDmCompensationManager.class) {
                if (C04TD.e1 == null) {
                    C04TD.e1 = new OutAppPushDmCompensationManager();
                }
            }
        }
        return C04TD.e1;
    }

    public static boolean LJ() {
        C0I0B.LJFF.LIZJ();
        return C2104108Md.LIZLLL(C894660Z7w.LIZ());
    }

    public final boolean LIZJ() {
        if (!LJ() || !this.LL.upload_event) {
            return false;
        }
        C0XE1 c0xe1LIZIZ = this.LLILLJJLI.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current connectState : ");
        sbLIZ.append(c0xe1LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        return c0xe1LIZIZ == C0XE1.CONNECT_CLOSED || c0xe1LIZIZ == C0XE1.CONNECT_FAILED;
    }

    public OutAppPushDmCompensationManager(int i) {
        OutAppPushWsReconnectConfigModel outAppPushWsReconnectConfigModelLIZ = C805820VjI.LIZ();
        InterfaceC805830VjJ.LIZ.getClass();
        InterfaceC805830VjJ interfaceC805830VjJ = new InterfaceC805830VjJ() { // from class: X.0VjL
            @Override // X.InterfaceC805830VjJ
            public final boolean LIZ() {
                try {
                    C2203431BLp.LIZIZ.LJFF("dm_out_push");
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }

            @Override // X.InterfaceC805830VjJ
            public final C0XE1 LIZIZ() {
                return C2203431BLp.LIZIZ.getState();
            }
        };
        this.LL = outAppPushWsReconnectConfigModelLIZ;
        this.LLILLJJLI = interfaceC805830VjJ;
    }

    public final void LJFF(OutAppPushDmCompensationHandler outAppPushDmCompensationHandler) {
        EnumC805800VjG enumC805800VjG = EnumC805800VjG.RECONNECT_WS;
        if (outAppPushDmCompensationHandler.hasMessages(enumC805800VjG.getWhat())) {
            return;
        }
        Message messageObtainMessage = outAppPushDmCompensationHandler.obtainMessage(enumC805800VjG.getWhat());
        messageObtainMessage.obj = 1;
        C786410Ut5.LJLJLJ(outAppPushDmCompensationHandler, messageObtainMessage, this.LL.ws_reconnect_delay);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IOutAppPushDmCompensationManager
    public final void LJIIJJI(List<? extends C869590Y9l> list) {
        OutAppPushDmCompensationHandler outAppPushDmCompensationHandler;
        Message messageObtainMessage;
        if (LJ() && C19328310jZ.LIZIZ.LIZJ() && this.LL.upload_event && (outAppPushDmCompensationHandler = this.LLILZIL) != null && (messageObtainMessage = outAppPushDmCompensationHandler.obtainMessage(EnumC805800VjG.IMSDK_RECEIVE.getWhat())) != null) {
            messageObtainMessage.obj = list;
            OutAppPushDmCompensationHandler outAppPushDmCompensationHandler2 = this.LLILZIL;
            if (outAppPushDmCompensationHandler2 != null) {
                C786410Ut5.LJLJJL(outAppPushDmCompensationHandler2, messageObtainMessage);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IOutAppPushDmCompensationManager
    public final void LJIIL(String str) {
        OutAppPushDmCompensationHandler outAppPushDmCompensationHandler;
        Message messageObtainMessage;
        OutAppPushDmCompensationHandler outAppPushDmCompensationHandler2;
        OutAppPushDmCompensationHandler outAppPushDmCompensationHandler3;
        OutAppPushDmCompensationHandler outAppPushDmCompensationHandler4;
        OutAppPushDmCompensationHandler outAppPushDmCompensationHandler5;
        OutAppPushDmCompensationHandler outAppPushDmCompensationHandler6;
        OutAppPushDmCompensationHandler outAppPushDmCompensationHandler7;
        if (LJ() && C19328310jZ.LIZIZ.LIZJ() && this.LL.upload_event && (outAppPushDmCompensationHandler = this.LLILZIL) != null && (messageObtainMessage = outAppPushDmCompensationHandler.obtainMessage(EnumC805800VjG.PUSH_RECEIVE.getWhat())) != null) {
            messageObtainMessage.obj = str;
            OutAppPushDmCompensationHandler outAppPushDmCompensationHandler8 = this.LLILZIL;
            if (outAppPushDmCompensationHandler8 != null) {
                C786410Ut5.LJLJJL(outAppPushDmCompensationHandler8, messageObtainMessage);
            }
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "dm_reconnect_strategy", true);
            if (iLJIJ != 1) {
                if (iLJIJ != 2) {
                    if (iLJIJ != 3) {
                        if (iLJIJ != 4) {
                            if (iLJIJ == 5) {
                                if (!C2214201BlK.LJIIJJI) {
                                    if ((LIZJ() || System.currentTimeMillis() - this.LLILZLL >= this.LL.ws_foreground_expire_time) && (outAppPushDmCompensationHandler7 = this.LLILZIL) != null) {
                                        LJFF(outAppPushDmCompensationHandler7);
                                        return;
                                    }
                                    return;
                                }
                                if ((!LIZJ() && System.currentTimeMillis() - this.LLILZLL < this.LL.ws_background_expire_time) || (outAppPushDmCompensationHandler6 = this.LLILZIL) == null) {
                                    return;
                                }
                                LJFF(outAppPushDmCompensationHandler6);
                                return;
                            }
                            return;
                        }
                        if (!C2214201BlK.LJIIJJI) {
                            return;
                        }
                        if ((!LIZJ() && System.currentTimeMillis() - this.LLILZLL < this.LL.ws_background_expire_time) || (outAppPushDmCompensationHandler5 = this.LLILZIL) == null) {
                            return;
                        }
                        LJFF(outAppPushDmCompensationHandler5);
                        return;
                    }
                    if (C2214201BlK.LJIIJJI) {
                        return;
                    }
                    if ((!LIZJ() && System.currentTimeMillis() - this.LLILZLL < this.LL.ws_foreground_expire_time) || (outAppPushDmCompensationHandler4 = this.LLILZIL) == null) {
                        return;
                    }
                    LJFF(outAppPushDmCompensationHandler4);
                    return;
                }
                if (C2214201BlK.LJIIJJI || !LIZJ() || (outAppPushDmCompensationHandler3 = this.LLILZIL) == null) {
                    return;
                }
                LJFF(outAppPushDmCompensationHandler3);
                return;
            }
            if (C2214201BlK.LJIIJJI || !LIZJ() || (outAppPushDmCompensationHandler2 = this.LLILZIL) == null) {
                return;
            }
            LJFF(outAppPushDmCompensationHandler2);
        }
    }

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        if (LJ() && this.LL.upload_event) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ws status change : ");
            sbLIZ.append(c821280WJq.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (c821280WJq.LIZIZ == C0XE1.CONNECTED) {
                this.LLILZLL = System.currentTimeMillis();
            }
        }
    }
}
