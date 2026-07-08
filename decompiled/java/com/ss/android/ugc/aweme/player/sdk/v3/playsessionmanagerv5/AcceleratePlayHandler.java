package com.ss.android.ugc.aweme.player.sdk.v3.playsessionmanagerv5;

import X.C1474810oTv;
import X.C1479510obV;
import X.C1480590odF;
import X.C1480690odP;
import X.C1480730odT;
import X.C1481110oe5;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1479760obu;
import X.InterfaceC1472880oQo;
import X.InterfaceC1480060ocO;
import X.InterfaceC1480570odD;
import Y.ARunnableS123S0100000_23;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.player.sdk.util.PlayerMainHandler;

/* JADX INFO: loaded from: classes24.dex */
public class AcceleratePlayHandler extends BPEAHandler {
    public volatile boolean LL;
    public volatile C1480590odF LLILLJJLI;
    public volatile boolean LLILLL;
    public Surface LLILZ;
    public final C1480690odP LLILZIL;

    public final C1480590odF LJ() {
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay getAccelerateSession ");
        }
        if (!this.LL) {
            return this.LLILLJJLI;
        }
        if (!C1481110oe5.LIZ) {
            return null;
        }
        C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay getAccelerateSession hasTryPlay true return null");
        return null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("AcceleratePlayHandler@9216.handleMessage");
        int i = message.what;
        InterfaceC1472880oQo interfaceC1472880oQo = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (this.LLILLL) {
                            if (C1481110oe5.LIZ) {
                                C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay PRE_SET_SURFACE handleMessage return");
                            }
                            C1C7U.LIZIZ("AcceleratePlayHandler@9216.handleMessage");
                            return;
                        }
                        synchronized (this.LLILZIL.LJIJJ) {
                            try {
                                if (!this.LL && !this.LLILZIL.LJIIJJI) {
                                    Surface surface = (Surface) HandlerHook.getMessageObj(message.obj);
                                    if (this.LLILLJJLI != null && this.LLILLJJLI.LJJIFFI) {
                                        if (C1481110oe5.LIZ) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("AcceleratePlay PRE_SET_SURFACE preRendered setSurfaceDirectly ");
                                            sbLIZ.append(surface);
                                            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                        this.LLILLJJLI.LJJIL(surface);
                                    } else {
                                        if (C1481110oe5.LIZ) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("AcceleratePlay PRE_SET_SURFACE preSetSurface ");
                                            sbLIZ2.append(surface);
                                            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ2));
                                        }
                                        this.LLILZ = surface;
                                    }
                                } else {
                                    if (C1481110oe5.LIZ) {
                                        C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay PRE_SET_SURFACE return");
                                    }
                                    C1C7U.LIZIZ("AcceleratePlayHandler@9216.handleMessage");
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                } else {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("AcceleratePlay PRE_RELEASE， accelerateSession release,");
                        sbLIZ3.append(this.LLILLJJLI);
                        sbLIZ3.append("acceleratePlayHandlerThread");
                        sbLIZ3.append(this.LLILZIL.LJIIZILJ);
                        C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    if (this.LLILLJJLI != null) {
                        this.LLILLJJLI.reset();
                        this.LLILLJJLI.release();
                        this.LLILLJJLI = null;
                    } else {
                        new PlayerMainHandler(Looper.getMainLooper()).post(new ARunnableS123S0100000_23(this, 39));
                    }
                    this.LLILLL = true;
                }
            } else {
                if (this.LLILLL) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay PRE_RENDER handleMessage return");
                    }
                    C1C7U.LIZIZ("AcceleratePlayHandler@9216.handleMessage");
                    return;
                }
                synchronized (this.LLILZIL.LJIJJ) {
                    try {
                        if (this.LL || this.LLILZIL.LJIIJJI || (this.LLILLJJLI != null && this.LLILLJJLI.LJJIFFI)) {
                            if (C1481110oe5.LIZ) {
                                C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay PRE_RENDER return");
                            }
                            C1C7U.LIZIZ("AcceleratePlayHandler@9216.handleMessage");
                            return;
                        }
                        if (this.LLILLJJLI == null) {
                            if (C1481110oe5.LIZ) {
                                C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay PRE_RENDER preCreateSession4AcceleratePlay");
                            }
                            LJFF(this.LLILZIL.LJIJI, 2);
                        }
                        if (HandlerHook.getMessageObj(message.obj) instanceof C1479510obV) {
                            C1479510obV c1479510obV = (C1479510obV) HandlerHook.getMessageObj(message.obj);
                            if (C1481110oe5.LIZ) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("AcceleratePlay PRE_RENDER preRender4AcceleratePlay prepareData id ");
                                sbLIZ4.append(c1479510obV.LJIIIZ);
                                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ4));
                            }
                            LJII(c1479510obV, c1479510obV.LIZ);
                        }
                    } finally {
                    }
                }
            }
        } else {
            if (this.LLILLL) {
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay PRE_CREATE handleMessage return");
                }
                C1C7U.LIZIZ("AcceleratePlayHandler@9216.handleMessage");
                return;
            }
            synchronized (this.LLILZIL.LJIJJ) {
                try {
                    if (!this.LL && !this.LLILZIL.LJIIJJI && this.LLILLJJLI == null) {
                        if (C1481110oe5.LIZ) {
                            C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay PRE_CREATE preCreateSession4AcceleratePlay");
                        }
                        if (HandlerHook.getMessageObj(message.obj) instanceof InterfaceC1472880oQo) {
                            interfaceC1472880oQo = (InterfaceC1472880oQo) HandlerHook.getMessageObj(message.obj);
                        }
                        LJFF(interfaceC1472880oQo, 1);
                    } else {
                        if (C1481110oe5.LIZ) {
                            C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay PRE_CREATE return");
                        }
                        C1C7U.LIZIZ("AcceleratePlayHandler@9216.handleMessage");
                        return;
                    }
                } finally {
                }
            }
        }
        C1C7U.LIZIZ("AcceleratePlayHandler@9216.handleMessage");
    }

    public AcceleratePlayHandler(HandlerThread handlerThread, C1480690odP c1480690odP) {
        super(C786410Ut5.W2(handlerThread));
        this.LLILZIL = c1480690odP;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0odO] */
    public final void LJFF(InterfaceC1472880oQo interfaceC1472880oQo, int i) {
        boolean z;
        EnumC1479760obu enumC1479760obu;
        if (interfaceC1472880oQo != null) {
            interfaceC1472880oQo.LJLJLJ();
        }
        C1480730odT c1480730odT = this.LLILZIL.LJIIJ;
        if (c1480730odT != null && c1480730odT.LJIILJJIL) {
            z = true;
        } else {
            z = false;
        }
        if (((Boolean) C1474810oTv.s.getValue()).booleanValue()) {
            enumC1479760obu = EnumC1479760obu.TT_CONFIG_OPT;
        } else {
            enumC1479760obu = this.LLILZIL.LIZIZ;
        }
        C1480690odP c1480690odP = this.LLILZIL;
        this.LLILLJJLI = new C1480590odF(enumC1479760obu, c1480690odP.LJIIZILJ, new InterfaceC1480570odD() { // from class: X.0odO
            @Override // X.InterfaceC1480570odD
            public final void LIZJ(C1480440od0 c1480440od0, HandlerThread handlerThread) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AcceleratePlay onSessionRelease");
                    sbLIZ.append(c1480440od0);
                    sbLIZ.append("playThread");
                    sbLIZ.append(handlerThread);
                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (handlerThread == null || C786410Ut5.W2(handlerThread) == Looper.getMainLooper()) {
                    return;
                }
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay onSessionRelease");
                }
                if (C1474810oTv.LLIILII()) {
                    C1484670ojp.LIZ.LIZIZ(this.LIZ.LLILZIL.LJIJJLI);
                    this.LIZ.LLILZIL.LJIJJLI = null;
                } else {
                    handlerThread.quitSafely();
                }
            }
        }, c1480690odP.LJIIIZ, z);
        if (this.LLILZIL.LJIJJLI != null) {
            this.LLILLJJLI.LJJI = this.LLILZIL.LJIJJLI.LIZJ;
        }
        this.LLILLJJLI.LJLIIIL(interfaceC1472880oQo);
        this.LLILLJJLI.LJIJJLI();
        if (((Boolean) C1474810oTv.LLJL.getValue()).booleanValue()) {
            this.LLILLJJLI.LJJI();
        }
        if (interfaceC1472880oQo != null) {
            interfaceC1472880oQo.LJLJLLL();
        }
    }

    public final void LJII(C1479510obV c1479510obV, InterfaceC1480060ocO interfaceC1480060ocO) {
        InterfaceC1472880oQo interfaceC1472880oQo = this.LLILZIL.LJIJI;
        if (interfaceC1472880oQo != null) {
            interfaceC1472880oQo.LJLILLLLZI();
        }
        if (this.LLILLJJLI != null && !this.LLILLJJLI.LJIIIZ && !this.LLILLJJLI.LJIIJ) {
            if (!this.LLILLJJLI.LJJIFFI && !TextUtils.equals(c1479510obV.LJIIIZ, this.LLILLJJLI.LIZ)) {
                if (this.LLILZ != null) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay setPreCreateSurface");
                    }
                    this.LLILLJJLI.setSurface(this.LLILZ);
                    this.LLILZ = null;
                }
                if (c1479510obV.LJJIFFI != null) {
                    this.LLILLJJLI.setSurface(c1479510obV.LJJIFFI);
                }
                c1479510obV.LJJI = true;
                this.LLILLJJLI.LJJLL(interfaceC1480060ocO);
                this.LLILLJJLI.LJLIL(c1479510obV);
                this.LLILLJJLI.LJJIFFI = true;
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AcceleratePlay prepareSession AccelerateSession:");
                    sbLIZ.append(this.LLILLJJLI);
                    sbLIZ.append(",id ");
                    sbLIZ.append(this.LLILLJJLI.LIZ);
                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            if (!C1481110oe5.LIZ) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("AcceleratePlay current or preparing, ignore id:");
            sbLIZ2.append(c1479510obV.LJIIIZ);
            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
