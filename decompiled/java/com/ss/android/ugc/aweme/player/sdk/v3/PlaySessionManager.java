package com.ss.android.ugc.aweme.player.sdk.v3;

import X.C1474810oTv;
import X.C1479510obV;
import X.C1480450od1;
import X.C1480530od9;
import X.C1480560odC;
import X.C1480730odT;
import X.C1480750odV;
import X.C1480770odX;
import X.C1480830odd;
import X.C1481110oe5;
import X.C1484670ojp;
import X.C1486540omq;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1479760obu;
import X.EnumC1482310og1;
import X.InterfaceC1472880oQo;
import X.InterfaceC1480060ocO;
import X.InterfaceC1480330ocp;
import X.InterfaceC1480550odB;
import X.InterfaceC1480710odR;
import X.InterfaceC1480720odS;
import Y.ARunnableS123S0100000_23;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.psmv3.DynamicConfig;
import com.ss.android.ugc.aweme.player.sdk.util.PlayerMainHandler;
import com.ss.android.ugc.aweme.player.sdk.v3.PlaySessionManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes24.dex */
public final class PlaySessionManager implements InterfaceC1480550odB, InterfaceC1480720odS {
    public static volatile int LJIJI;
    public static int LJIJJ;
    public final int LIZ;
    public final EnumC1479760obu LIZIZ;
    public final List<InterfaceC1480710odR> LIZJ;
    public List<C1480450od1> LIZLLL;
    public C1480450od1 LJ;
    public C1480450od1 LJFF;
    public C1480450od1 LJI;
    public boolean LJII;
    public final boolean LJIIIIZZ;
    public InterfaceC1480330ocp LJIIIZ;
    public final C1480730odT LJIIJ;
    public volatile boolean LJIIJJI;
    public volatile boolean LJIIL;
    public final C1480750odV LJIILIIL;
    public HandlerThread LJIILJJIL;
    public AcceleratePlayHandler LJIILL;
    public InterfaceC1472880oQo LJIILLIIL;
    public final Object LJIIZILJ;
    public C1480770odX LJIJ;

    public class AcceleratePlayHandler extends BPEAHandler {
        public volatile boolean LL;
        public volatile C1480560odC LLILLJJLI;
        public volatile boolean LLILLL;
        public Surface LLILZ;

        public final C1480560odC LJ() {
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
            C1C7U.LIZ("PlaySessionManager$AcceleratePlayHandler@e67.handleMessage");
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
                                C1C7U.LIZIZ("PlaySessionManager$AcceleratePlayHandler@e67.handleMessage");
                                return;
                            }
                            synchronized (PlaySessionManager.this.LJIIZILJ) {
                                try {
                                    if (!this.LL && !PlaySessionManager.this.LJIIJJI) {
                                        Surface surface = (Surface) HandlerHook.getMessageObj(message.obj);
                                        if (this.LLILLJJLI != null && this.LLILLJJLI.LJIJJLI) {
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
                                        C1C7U.LIZIZ("PlaySessionManager$AcceleratePlayHandler@e67.handleMessage");
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
                            sbLIZ3.append(PlaySessionManager.this.LJIILJJIL);
                            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        if (this.LLILLJJLI != null) {
                            this.LLILLJJLI.reset();
                            this.LLILLJJLI.release();
                            this.LLILLJJLI = null;
                        } else {
                            new PlayerMainHandler(Looper.getMainLooper()).post(new ARunnableS123S0100000_23(this, 35));
                        }
                        this.LLILLL = true;
                    }
                } else {
                    if (this.LLILLL) {
                        if (C1481110oe5.LIZ) {
                            C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay PRE_RENDER handleMessage return");
                        }
                        C1C7U.LIZIZ("PlaySessionManager$AcceleratePlayHandler@e67.handleMessage");
                        return;
                    }
                    synchronized (PlaySessionManager.this.LJIIZILJ) {
                        try {
                            if (this.LL || PlaySessionManager.this.LJIIJJI || (this.LLILLJJLI != null && this.LLILLJJLI.LJIJJLI)) {
                                if (C1481110oe5.LIZ) {
                                    C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay PRE_RENDER return");
                                }
                                C1C7U.LIZIZ("PlaySessionManager$AcceleratePlayHandler@e67.handleMessage");
                                return;
                            }
                            if (this.LLILLJJLI == null) {
                                if (C1481110oe5.LIZ) {
                                    C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay PRE_RENDER preCreateSession4AcceleratePlay");
                                }
                                LJFF(PlaySessionManager.this.LJIILLIIL, 2);
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
                    C1C7U.LIZIZ("PlaySessionManager$AcceleratePlayHandler@e67.handleMessage");
                    return;
                }
                synchronized (PlaySessionManager.this.LJIIZILJ) {
                    try {
                        if (!this.LL && !PlaySessionManager.this.LJIIJJI && this.LLILLJJLI == null) {
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
                            C1C7U.LIZIZ("PlaySessionManager$AcceleratePlayHandler@e67.handleMessage");
                            return;
                        }
                    } finally {
                    }
                }
            }
            C1C7U.LIZIZ("PlaySessionManager$AcceleratePlayHandler@e67.handleMessage");
        }

        public AcceleratePlayHandler(HandlerThread handlerThread) {
            super(C786410Ut5.W2(handlerThread));
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [X.0odN] */
        public final void LJFF(InterfaceC1472880oQo interfaceC1472880oQo, int i) {
            boolean z;
            EnumC1479760obu enumC1479760obu;
            if (interfaceC1472880oQo != null) {
                interfaceC1472880oQo.LJLJLJ();
            }
            C1480730odT c1480730odT = PlaySessionManager.this.LJIIJ;
            if (c1480730odT != null && c1480730odT.LJIILJJIL) {
                z = true;
            } else {
                z = false;
            }
            if (((Boolean) C1474810oTv.s.getValue()).booleanValue()) {
                enumC1479760obu = EnumC1479760obu.TT_CONFIG_OPT;
            } else {
                enumC1479760obu = PlaySessionManager.this.LIZIZ;
            }
            PlaySessionManager playSessionManager = PlaySessionManager.this;
            this.LLILLJJLI = new C1480560odC(enumC1479760obu, playSessionManager.LJIILJJIL, new InterfaceC1480550odB() { // from class: X.0odN
                @Override // X.InterfaceC1480550odB
                public final void LIZJ(C1480450od1 c1480450od1, HandlerThread handlerThread) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("AcceleratePlay onSessionRelease");
                        sbLIZ.append(c1480450od1);
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
                        C1484670ojp.LIZ.LIZIZ(PlaySessionManager.this.LJIJ);
                        PlaySessionManager.this.LJIJ = null;
                    } else {
                        handlerThread.quitSafely();
                    }
                }
            }, playSessionManager.LJIIIZ, z);
            if (PlaySessionManager.this.LJIJ != null) {
                this.LLILLJJLI.LJII = PlaySessionManager.this.LJIJ.LIZJ;
            }
            this.LLILLJJLI.LJLIIIL(interfaceC1472880oQo);
            this.LLILLJJLI.LJIJJLI();
            if (((Boolean) C1474810oTv.LLJL.getValue()).booleanValue()) {
                this.LLILLJJLI.LJJII();
            }
            if (interfaceC1472880oQo != null) {
                interfaceC1472880oQo.LJLJLLL();
            }
        }

        public final void LJII(C1479510obV c1479510obV, InterfaceC1480060ocO interfaceC1480060ocO) {
            InterfaceC1472880oQo interfaceC1472880oQo = PlaySessionManager.this.LJIILLIIL;
            if (interfaceC1472880oQo != null) {
                interfaceC1472880oQo.LJLILLLLZI();
            }
            if (this.LLILLJJLI != null && !this.LLILLJJLI.LJIIIZ && !this.LLILLJJLI.LJIIJ) {
                if (!this.LLILLJJLI.LJIJJLI && !TextUtils.equals(c1479510obV.LJIIIZ, this.LLILLJJLI.LIZ)) {
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
                    this.LLILLJJLI.LJIJJLI = true;
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

    @Override // X.InterfaceC1480720odS
    public final InterfaceC1480710odR LIZLLL() {
        C1480450od1 c1480450od1LJIJI = LJIJI(null);
        this.LJFF = c1480450od1LJIJI;
        return c1480450od1LJIJI;
    }

    @Override // X.InterfaceC1480720odS
    public final InterfaceC1480710odR LJI() {
        C1480450od1 c1480450od1LJIJI = LJIJI(null);
        this.LJ = c1480450od1LJIJI;
        return c1480450od1LJIJI;
    }

    @Override // X.InterfaceC1480720odS
    public final void LJIIIIZZ() {
        this.LJIILIIL.LIZJ(this);
        this.LJIILIIL.LIZLLL();
    }

    @Override // X.InterfaceC1480720odS
    public final List<InterfaceC1480710odR> LJIIIZ() {
        ArrayList arrayList = new ArrayList(this.LIZJ);
        List<C1480450od1> list = this.LIZLLL;
        if (list != null && !list.isEmpty()) {
            for (C1480450od1 c1480450od1 : this.LIZLLL) {
                if (!c1480450od1.LJJIJIIJIL()) {
                    arrayList.add(c1480450od1);
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1480720odS
    public final void LJIIL() {
        C1480450od1 c1480450od1 = this.LJFF;
        if (c1480450od1 != null) {
            c1480450od1.release();
        }
        this.LJFF = null;
        C1480450od1 c1480450od12 = this.LJI;
        if (c1480450od12 != null) {
            c1480450od12.release();
        }
        this.LJI = null;
        AcceleratePlayHandler acceleratePlayHandler = this.LJIILL;
        if (acceleratePlayHandler == null || acceleratePlayHandler.LLILLL) {
            return;
        }
        acceleratePlayHandler.sendEmptyMessage(3);
    }

    public final void LJIILL() {
        if (this.LJIILJJIL == null || this.LJIILL == null) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay acceleratePlayInit");
            }
            if (C1474810oTv.LLIILII()) {
                C1480770odX c1480770odXLIZ = C1484670ojp.LIZ.LIZ(EnumC1482310og1.VOD);
                this.LJIJ = c1480770odXLIZ;
                if (c1480770odXLIZ != null) {
                    this.LJIILJJIL = c1480770odXLIZ.LIZ;
                }
                if (this.LJIILJJIL == null) {
                    HandlerThread handlerThread = new HandlerThread("acceleratePlayHandlerThread", ((MultimediaThreadPoolConfigV2) C1474810oTv.N4.getValue()).vodThreadPriority);
                    this.LJIILJJIL = handlerThread;
                    handlerThread.start();
                    if (this.LJIJ == null) {
                        this.LJIJ = new C1480770odX(this.LJIILJJIL, "");
                    }
                    this.LJIJ.LIZ = this.LJIILJJIL;
                }
            } else {
                HandlerThread handlerThread2 = new HandlerThread("acceleratePlayHandlerThread");
                this.LJIILJJIL = handlerThread2;
                handlerThread2.start();
            }
            this.LJIILL = new AcceleratePlayHandler(this.LJIILJJIL);
        }
    }

    public final void LJIILLIIL() {
        synchronized (this.LJIIZILJ) {
            try {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AcceleratePlay accelerateReset, acceleratePlayHandler");
                    sbLIZ.append(this.LJIILL);
                    sbLIZ.append("acceleratePlayHandlerThread");
                    sbLIZ.append(this.LJIILJJIL);
                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LJIILL = null;
                this.LJIILJJIL = null;
                this.LJIIJJI = false;
                this.LJIIL = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1480720odS
    public final void clean() {
        C1480450od1 c1480450od1;
        C1480450od1 c1480450od12;
        if (((Boolean) C1474810oTv.LL.getValue()).booleanValue() && (c1480450od12 = this.LJ) != null) {
            c1480450od12.LJIL();
            this.LJ.release();
            this.LJ = null;
        }
        if (!((Boolean) C1474810oTv.LLD.getValue()).booleanValue() || (c1480450od1 = this.LJFF) == null) {
            return;
        }
        c1480450od1.LJIL();
        this.LJFF.release();
        this.LJFF = null;
    }

    @Override // X.InterfaceC1480720odS
    public final void release() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release mCurrentSession:");
            sbLIZ.append(this.LJ);
            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1480450od1 c1480450od1 = this.LJ;
        if (c1480450od1 != null) {
            c1480450od1.release();
        }
        this.LJ = null;
        C1480450od1 c1480450od12 = this.LJFF;
        if (c1480450od12 != null) {
            c1480450od12.release();
        }
        this.LJFF = null;
        C1480450od1 c1480450od13 = this.LJI;
        if (c1480450od13 != null) {
            c1480450od13.release();
        }
        this.LJI = null;
        AcceleratePlayHandler acceleratePlayHandler = this.LJIILL;
        if (acceleratePlayHandler != null) {
            if (!acceleratePlayHandler.LLILLL) {
                acceleratePlayHandler.sendEmptyMessage(3);
            }
            if (C1474810oTv.LJ()) {
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay release");
                }
                LJIILLIIL();
            }
        }
        if (this.LIZLLL != null) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("release session pool:");
                sbLIZ2.append(((CopyOnWriteArrayList) this.LIZLLL).size());
                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (((CopyOnWriteArrayList) this.LIZLLL).size() > 0) {
                Iterator it2 = ((CopyOnWriteArrayList) this.LIZLLL).iterator();
                while (it2.hasNext()) {
                    ((C1480450od1) it2.next()).release();
                }
            }
            ((CopyOnWriteArrayList) this.LIZLLL).clear();
        }
        ((CopyOnWriteArrayList) this.LIZJ).clear();
        this.LJII = true;
        this.LJIILIIL.LIZ();
        C1480750odV c1480750odV = this.LJIILIIL;
        c1480750odV.LJIIJJI = null;
        c1480750odV.LIZIZ(false);
        LJIJI--;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("sessionManager release, mLocalManagerSessionId=");
            sbLIZ3.append(this.LIZ);
            sbLIZ3.append(", PlaySessionManagerCnt=");
            sbLIZ3.append(LJIJI);
            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public final void LJIJJLI() {
        if (C1474810oTv.LJ()) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AcceleratePlay resetAccelerateStatusInternal, acceleratePlayHandler");
                sbLIZ.append(this.LJIILL);
                sbLIZ.append("acceleratePlayHandlerThread");
                sbLIZ.append(this.LJIILJJIL);
                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LJIILL = null;
            if (this.LJIILJJIL != null) {
                if (C1474810oTv.LLIILII()) {
                    C1484670ojp.LIZ.LIZIZ(this.LJIJ);
                    this.LJIJ = null;
                } else {
                    this.LJIILJJIL.quitSafely();
                }
            }
            this.LJIILJJIL = null;
            this.LJIIJJI = false;
            this.LJIIL = false;
        }
    }

    @Override // X.InterfaceC1480720odS
    public final void LJJLIIIJLJLI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release prerender session:");
        sbLIZ.append(this.LJFF);
        C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
        C1480450od1 c1480450od1 = this.LJFF;
        if (c1480450od1 != null) {
            c1480450od1.release();
        }
        this.LJFF = null;
        C1480450od1 c1480450od12 = this.LJI;
        if (c1480450od12 != null) {
            c1480450od12.release();
        }
        this.LJI = null;
    }

    @Override // X.InterfaceC1480720odS
    public final /* bridge */ /* synthetic */ InterfaceC1480710odR LJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1480720odS
    public final List<InterfaceC1480710odR> LJIIJJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1480720odS
    public final void LIZIZ(InterfaceC1472880oQo interfaceC1472880oQo) {
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preCreateAccelerateSession ");
        }
        synchronized (this.LJIIZILJ) {
            try {
                if (this.LJIIJJI) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preCreateAccelerateSession return");
                    }
                    return;
                }
                LJIILL();
                if (!this.LJIILL.LLILLL) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preCreateAccelerateSession go");
                    }
                    this.LJIILLIIL = interfaceC1472880oQo;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    messageObtain.obj = interfaceC1472880oQo;
                    this.LJIILL.sendMessage(messageObtain);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1480720odS
    public final void LJFF(Surface surface) {
        if (surface != null && surface.isValid()) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preCreateSurfaceSet ");
            }
            synchronized (this.LJIIZILJ) {
                try {
                    if (this.LJIIJJI) {
                        if (C1481110oe5.LIZ) {
                            C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preCreateSurfaceSet return");
                        }
                        return;
                    }
                    LJIILL();
                    if (!this.LJIILL.LLILLL) {
                        if (C1481110oe5.LIZ) {
                            C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preCreateSurfaceSet go");
                        }
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 4;
                        messageObtain.obj = surface;
                        this.LJIILL.sendMessage(messageObtain);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC1480720odS
    public final void LJIIJ(InterfaceC1480330ocp interfaceC1480330ocp) {
        this.LJIIIZ = interfaceC1480330ocp;
    }

    @Override // X.InterfaceC1480720odS
    public final void LJIILJJIL(boolean z) {
        C1480450od1 c1480450od1;
        this.LJIILIIL.LIZJ = z;
        if (!z && (c1480450od1 = this.LJ) != null) {
            if (c1480450od1.isPlaying() || this.LJ.isLoading()) {
                LJIIIIZZ();
            }
        }
    }

    public final void LJIIZILJ(C1480450od1 c1480450od1) {
        List<C1480450od1> list;
        if (c1480450od1 != null && (list = this.LIZLLL) != null && !list.contains(c1480450od1)) {
            if (this.LIZLLL.size() < this.LJIIJ.LJFF) {
                this.LIZLLL.add(c1480450od1);
                return;
            }
            ArrayList arrayList = new ArrayList(3);
            for (C1480450od1 c1480450od12 : this.LIZLLL) {
                if (c1480450od12.LJIIL == c1480450od1.LJIIL) {
                    c1480450od1.release();
                    return;
                } else {
                    if (arrayList.contains(Integer.valueOf(c1480450od12.LJIIL))) {
                        this.LIZLLL.remove(c1480450od12);
                        c1480450od12.release();
                        this.LIZLLL.add(c1480450od1);
                        return;
                    }
                    arrayList.add(Integer.valueOf(c1480450od12.LJIIL));
                }
            }
            if (1 == this.LIZLLL.size()) {
                C1480450od1 c1480450od13 = (C1480450od1) ListProtector.get(this.LIZLLL, 0);
                if (c1480450od13 != null) {
                    c1480450od13.release();
                }
                ListProtector.remove(this.LIZLLL, 0);
                this.LIZLLL.add(c1480450od1);
                return;
            }
            c1480450od1.release();
        }
    }

    public final boolean LJIJ(C1480450od1 c1480450od1) {
        if (c1480450od1 == null) {
            return false;
        }
        if (C1474810oTv.LJJIJIL() && !c1480450od1.LJIILIIL) {
            c1480450od1.reset();
            c1480450od1.release();
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySessionManager", "cacheSessionToPoolForNormalPlay: should not cache session for software decode");
            }
            return false;
        }
        if (((DynamicConfig) C1474810oTv.LJZI.getValue()).getDisableSRRecycle()) {
            c1480450od1.LJ();
        }
        if (C1474810oTv.LJJJJL() && c1480450od1.LJIIZILJ) {
            c1480450od1.reset();
            c1480450od1.release();
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySessionManager", "session force not reuse");
            }
            return false;
        }
        if (this.LJIIJ.LJIIJJI && c1480450od1.LJIIL == 0) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cacheSessionToPoolForNormalPlay: should not cache session for 264, sessionId:");
                sbLIZ.append(c1480450od1.getSessionId());
                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
            }
            c1480450od1.reset();
            c1480450od1.release();
            return false;
        }
        ((CopyOnWriteArrayList) this.LIZLLL).add(c1480450od1);
        return true;
    }

    public final C1480450od1 LJIJI(C1479510obV c1479510obV) {
        HandlerThread handlerThread;
        boolean z;
        HandlerThread handlerThread2;
        C1480830odd c1480830odd = new C1480830odd();
        c1480830odd.LIZ = 0;
        if (this.LJII) {
            this.LJII = false;
            c1480830odd.LIZ = 1;
        }
        C1480770odX c1480770odXLIZ = C1484670ojp.LIZ.LIZ(EnumC1482310og1.VOD);
        if (c1480770odXLIZ != null && (handlerThread2 = c1480770odXLIZ.LIZ) != null && C786410Ut5.W2(handlerThread2) != null) {
            handlerThread = c1480770odXLIZ.LIZ;
        } else {
            handlerThread = null;
        }
        C1480730odT c1480730odT = this.LJIIJ;
        if (c1480730odT != null && c1480730odT.LJIILJJIL) {
            z = true;
        } else {
            z = false;
        }
        C1480450od1 c1480450od1 = new C1480450od1(this.LIZIZ, handlerThread, c1479510obV, this, this.LJIIIZ, c1480830odd, z, this.LIZ);
        this.LJIIJ.getClass();
        if (c1480770odXLIZ != null) {
            c1480450od1.LJII = c1480770odXLIZ.LIZJ;
            HandlerThread handlerThread3 = c1480770odXLIZ.LIZ;
            if (handlerThread3 != null && C786410Ut5.W2(handlerThread3) != null) {
                c1480450od1.LJIJJ = c1480770odXLIZ.LIZIZ;
            }
        }
        return c1480450od1;
    }

    public final boolean LJIL(C1480450od1 c1480450od1) {
        boolean z;
        if (c1480450od1 == null || c1480450od1.LJIIIZ || c1480450od1.LJIIJ || !this.LJIIIIZZ) {
            return false;
        }
        this.LJIIJ.getClass();
        C1480730odT c1480730odT = this.LJIIJ;
        if (c1480730odT.LJIIIIZZ ? this.LIZLLL == null : this.LJI != null) {
            z = false;
        } else {
            z = true;
        }
        if (c1480730odT.LJII && this.LIZLLL != null && c1480450od1.LJIIL == 0 && !((CopyOnWriteArrayList) this.LIZLLL).isEmpty()) {
            z = false;
        }
        if (this.LJIIJ.LJIIJJI && c1480450od1.LJIIL == 0) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("should not cache session for 264 codec, sessionId:");
                sbLIZ.append(c1480450od1.getSessionId());
                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
            }
            z = false;
        }
        if (C1474810oTv.LJJIJIL() && !c1480450od1.LJIILIIL) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySessionManager", "should not cache session for software decode");
            }
            z = false;
        }
        if (((DynamicConfig) C1474810oTv.LJZI.getValue()).getDisableSRRecycle()) {
            c1480450od1.LJ();
        }
        if (C1474810oTv.LJJJJL() && c1480450od1.LJIIZILJ) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySessionManager", "session force not reusable");
                return false;
            }
            return false;
        }
        return z;
    }

    public PlaySessionManager(EnumC1479760obu enumC1479760obu, C1480730odT c1480730odT) {
        this.LIZ = -1;
        ((Number) C1474810oTv.K3.getValue()).intValue();
        this.LJIIL = false;
        this.LJIIZILJ = new Object();
        this.LIZIZ = enumC1479760obu;
        this.LIZJ = new CopyOnWriteArrayList();
        this.LJIIJ = c1480730odT;
        if (c1480730odT == null) {
            this.LJIIJ = new C1480730odT();
        }
        C1480730odT c1480730odT2 = this.LJIIJ;
        if (c1480730odT2.LIZIZ && c1480730odT2.LJFF > 0) {
            this.LIZLLL = new CopyOnWriteArrayList();
        }
        C1480730odT c1480730odT3 = this.LJIIJ;
        if (c1480730odT3.LIZ) {
            c1480730odT3.LIZLLL = 1;
            c1480730odT3.LJ = 1;
        }
        if (c1480730odT3.LIZLLL == 1 && c1480730odT3.LJ == 1 && c1480730odT3.LIZIZ) {
            c1480730odT3.LJFF = 0;
        }
        if (c1480730odT.LIZLLL < 1) {
            c1480730odT.LIZLLL = 5;
        }
        int i = c1480730odT.LJ;
        int i2 = c1480730odT.LIZLLL;
        if (i > i2 || i < 1) {
            c1480730odT.LJ = i2;
        }
        if (c1480730odT3.LIZIZ) {
            int i3 = c1480730odT3.LJFF;
            int i4 = c1480730odT3.LJ;
            if (i3 > i4) {
                c1480730odT3.LJFF = i4;
            }
        }
        this.LJIIIIZZ = c1480730odT3.LJI;
        C1486540omq.LIZ();
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlaySessionMgr, config: ");
            sbLIZ.append(this.LJIIJ.toString());
            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        LJIJI++;
        int i5 = LJIJJ + 1;
        LJIJJ = i5;
        this.LIZ = i5;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sessionManager create, mLocalManagerSessionId=");
            sbLIZ2.append(i5);
            sbLIZ2.append(", PlaySessionManagerCnt=");
            sbLIZ2.append(LJIJI);
            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LJIILIIL = new C1480750odV();
    }

    @Override // X.InterfaceC1480720odS
    public final void LIZ(C1479510obV c1479510obV, InterfaceC1480060ocO interfaceC1480060ocO) {
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preRenderAccelerateSession");
        }
        synchronized (this.LJIIZILJ) {
            try {
                if (this.LJIIJJI) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preRenderAccelerateSession return");
                    }
                    return;
                }
                LJIILL();
                if (!this.LJIILL.LLILLL) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("AcceleratePlay preRenderAccelerateSession prepareData id ");
                        sbLIZ.append(c1479510obV.LJIIIZ);
                        C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 2;
                    c1479510obV.LIZ = interfaceC1480060ocO;
                    messageObtain.obj = c1479510obV;
                    this.LJIILL.sendMessage(messageObtain);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1480550odB
    public final void LIZJ(C1480450od1 c1480450od1, HandlerThread handlerThread) {
        Object objValueOf;
        ((CopyOnWriteArrayList) this.LIZJ).remove(c1480450od1);
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSessionRelease session:");
            sbLIZ.append(c1480450od1);
            sbLIZ.append(", session list size:");
            sbLIZ.append(((CopyOnWriteArrayList) this.LIZJ).size());
            sbLIZ.append(", session pool size:");
            List<C1480450od1> list = this.LIZLLL;
            if (list == null) {
                objValueOf = "null";
            } else {
                objValueOf = Integer.valueOf(list.size());
            }
            sbLIZ.append(objValueOf);
            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1484670ojp.LIZ.LIZIZ(new C1480770odX(handlerThread, c1480450od1.LJIJJ));
    }

    @Override // X.InterfaceC1480720odS
    public final void LJII(C1479510obV c1479510obV, InterfaceC1480060ocO interfaceC1480060ocO) {
        C1480450od1 c1480450od1;
        C1480450od1 c1480450od12;
        AcceleratePlayHandler acceleratePlayHandler;
        C1480560odC c1480560odCLJ;
        if (this.LJII) {
            return;
        }
        if (((Boolean) C1474810oTv.H2.getValue()).booleanValue() && (acceleratePlayHandler = this.LJIILL) != null && this.LJIILJJIL != null && !acceleratePlayHandler.LLILLL && !this.LJIILL.LL && (c1480560odCLJ = this.LJIILL.LJ()) != null) {
            if (TextUtils.equals(c1479510obV.LJIIIZ, c1480560odCLJ.LIZ)) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aps current or preparing, ignore id:");
                    sbLIZ.append(c1479510obV.LJIIIZ);
                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            if (c1480560odCLJ.LJIJ()) {
                LJIJJ(c1480560odCLJ, c1479510obV, interfaceC1480060ocO, false);
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("aps current precreate , prerender id:");
                    sbLIZ2.append(c1479510obV.LJIIIZ);
                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                return;
            }
        }
        C1480450od1 c1480450od13 = this.LJFF;
        C1480450od1 c1480450od14 = null;
        if (c1480450od13 != null && !c1480450od13.LJIIIZ && !c1480450od13.LJIIJ) {
            if (TextUtils.equals(c1479510obV.LJIIIZ, c1480450od13.LIZ) || ((c1480450od1 = this.LJ) != null && TextUtils.equals(c1479510obV.LJIIIZ, c1480450od1.LIZ))) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("current or preparing, ignore id:");
                    sbLIZ3.append(c1479510obV.LJIIIZ);
                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                return;
            }
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("prepareSession drop missed mNextSession:");
                sbLIZ4.append(this.LJFF);
                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ4));
            }
            if (LJIL(this.LJFF) && ((c1480450od12 = this.LJFF) == null || !c1480450od12.LJIJ())) {
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySessionManager", "prerender enable reuse ses: prepare session miss, will cache session");
                }
                this.LJFF.LJIL();
                if (!this.LJIIJ.LJIIIIZZ) {
                    this.LJI = this.LJFF;
                } else {
                    LJIIZILJ(this.LJFF);
                }
                ((CopyOnWriteArrayList) this.LIZJ).remove(this.LJFF);
                this.LJFF = null;
            } else if (!this.LJFF.LJIJ()) {
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySessionManager", "prerender disable reuse ses: prepare session miss, will release session");
                }
                this.LJFF.reset();
                this.LJFF.release();
                this.LJFF = null;
            }
        }
        C1480450od1 c1480450od15 = this.LJFF;
        if (c1480450od15 == null || !c1480450od15.LJIJ()) {
            if (this.LJIIIIZZ) {
                this.LJIIJ.getClass();
                if (!this.LJIIJ.LJIIIIZZ) {
                    C1480450od1 c1480450od16 = this.LJI;
                    this.LJI = null;
                    c1480450od14 = c1480450od16;
                } else {
                    List<C1480450od1> list = this.LIZLLL;
                    if (list != null && !((CopyOnWriteArrayList) list).isEmpty() && c1479510obV != null) {
                        this.LJIIJ.getClass();
                        if (!this.LJIIJ.LIZJ) {
                            c1480450od14 = (C1480450od1) ListProtector.get(this.LIZLLL, 0);
                            ((CopyOnWriteArrayList) this.LIZLLL).remove(c1480450od14);
                        } else {
                            String str = c1479510obV.LJIIIZ;
                            Iterator it2 = ((CopyOnWriteArrayList) this.LIZLLL).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    C1480450od1 c1480450od17 = (C1480450od1) it2.next();
                                    if (!TextUtils.isEmpty(str) && TextUtils.equals(c1480450od17.LIZ, str)) {
                                        c1480450od14 = c1480450od17;
                                        break;
                                    }
                                    if (C1480530od9.LIZ(c1479510obV, c1480450od17)) {
                                        c1480450od14 = c1480450od17;
                                    } else {
                                        c1480450od17.LJIILIIL();
                                        if (C1481110oe5.LIZ) {
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("getSessionFromPollForPrerender shouldPreciseReuse is false, id:");
                                            sbLIZ5.append(c1479510obV.LJIIIZ);
                                            sbLIZ5.append(", sessionId:");
                                            sbLIZ5.append(c1480450od17.getSessionId());
                                            sbLIZ5.append(", missMatchCnt:");
                                            sbLIZ5.append(c1480450od17.LJIJI());
                                            sbLIZ5.append(", codecType:");
                                            sbLIZ5.append(c1480450od17.LJIIL);
                                            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ5));
                                        }
                                        if (this.LJIIJ.LJIIL > 0 && c1480450od17.LJIJI() > this.LJIIJ.LJIIL) {
                                            ((CopyOnWriteArrayList) this.LIZLLL).remove(c1480450od17);
                                            c1480450od17.release();
                                            if (C1481110oe5.LIZ) {
                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                sbLIZ6.append("getSessionFromPollForPrerender release session because of missMatchCnt., sessionId:");
                                                sbLIZ6.append(c1480450od17.getSessionId());
                                                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ6));
                                            }
                                        }
                                    }
                                } else if (c1480450od14 != null) {
                                    break;
                                }
                            }
                            ((CopyOnWriteArrayList) this.LIZLLL).remove(c1480450od14);
                            c1480450od14.LJIIJJI();
                        }
                    }
                }
            }
            this.LJFF = c1480450od14;
        }
        C1480450od1 c1480450od18 = this.LJFF;
        if (c1480450od18 != null && c1480450od18.LJIJ() && !c1480450od18.LJII() && !c1480450od18.LJIJJ()) {
            c1479510obV.LLIIII = 102;
            C1481110oe5.LIZIZ("AccelerateSessionMonitor", "updateStatus：render with rendered session");
        }
        if (this.LJFF == null) {
            this.LJFF = LJIJI(c1479510obV);
        }
        if (c1479510obV != null) {
            c1479510obV.LJIJJ = 1;
        }
        LJIJJ(this.LJFF, c1479510obV, interfaceC1480060ocO, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x02d2  */
    @Override // X.InterfaceC1480720odS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.C1479510obV r13, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener r14, X.InterfaceC1480060ocO r15) {
        /*
            Method dump skipped, instruction units count: 2170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.v3.PlaySessionManager.LJIILIIL(X.0obV, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, X.0ocO):void");
    }

    public final void LJIJJ(C1480450od1 c1480450od1, C1479510obV c1479510obV, InterfaceC1480060ocO interfaceC1480060ocO, boolean z) {
        if (c1480450od1 != null && c1479510obV != null) {
            Surface surface = c1479510obV.LJJIFFI;
            if (surface != null) {
                c1479510obV.LJIJJ = 2;
                c1480450od1.setSurface(surface);
            }
            c1480450od1.LJJLL(interfaceC1480060ocO);
            c1480450od1.LJLIL(c1479510obV);
            if (z && !((CopyOnWriteArrayList) this.LIZJ).contains(c1480450od1)) {
                ((CopyOnWriteArrayList) this.LIZJ).add(c1480450od1);
            }
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prepareSession mNextSession:");
                sbLIZ.append(c1480450od1);
                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (!c1479510obV.LJJI) {
                LJIIIIZZ();
            }
        }
    }
}
