package com.bytedance.tts.pigeon;

import X.C01GW;
import X.C0YF7;
import X.C0YH4;
import X.C0YI2;
import X.C0YJ0;
import X.C0YJ1;
import X.C0YJ2;
import X.C0YJ3;
import X.C0YJ4;
import X.C0YJ5;
import X.C0YLU;
import X.C0YWJ;
import X.C0YWO;
import X.C0YWT;
import X.C0YWU;
import X.C1740506rj;
import X.C1741506rt;
import X.C452501pT;
import X.C870830YEf;
import X.C871040YFa;
import X.C872030YIv;
import X.C872040YIw;
import X.C872050YIx;
import X.C872060YIy;
import X.InterfaceC1741206rq;
import X.InterfaceC866920Xze;
import X.InterfaceC867280Y0o;
import X.InterfaceC870420YCq;
import X.InterfaceC871310YGb;
import X.InterfaceC875580YWm;
import X.InterfaceC875610YWp;
import X.InterfaceC875620YWq;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tts.pigeon.GECPigeon;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS101S0110000_14;
import kotlin.jvm.internal.AwS122S0101000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS99S0201000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class GECPigeon {
    public static final C872060YIy Companion = new C872060YIy();
    public static C0YWU sharedPigeonDepend;
    public final C0YWJ clientBridge;
    public final C01GW conversationListManager$delegate;
    public final C01GW imDaoManager$delegate;
    public final C870830YEf imOption;
    public final C872040YIw inboxEventSubscriber;
    public final C0YWO pigeonDepend;
    public final C0YH4 pigeonIMClient;
    public C872030YIv pigeonObserverReceiver;
    public final C0YLU containerStore = new C0YLU();
    public final CopyOnWriteArraySet<C0YJ0> initEndListeners = new CopyOnWriteArraySet<>();
    public volatile boolean needWebSocket = true;

    private final C0YI2 getConversationListManager() {
        return (C0YI2) this.conversationListManager$delegate.getValue();
    }

    private final C0YJ2 getImDaoManager() {
        return (C0YJ2) this.imDaoManager$delegate.getValue();
    }

    public final void notifyInitEnd$pigeon_release() {
        Iterator<C0YJ0> it2 = this.initEndListeners.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    public final C0YWJ getClientBridge$pigeon_release() {
        return this.clientBridge;
    }

    public final C0YLU getContainerStore() {
        return this.containerStore;
    }

    public final boolean getNeedWebSocket() {
        return this.needWebSocket;
    }

    public final C0YWO getPigeonDepend() {
        return this.pigeonDepend;
    }

    public final C0YH4 getPigeonIMClient() {
        return this.pigeonIMClient;
    }

    public final C872030YIv getPigeonObserverReceiver$pigeon_release() {
        return this.pigeonObserverReceiver;
    }

    /* JADX INFO: renamed from: getConversationListManager, reason: collision with other method in class */
    public final InterfaceC875620YWq m144getConversationListManager() {
        return getConversationListManager();
    }

    /* JADX INFO: renamed from: getImDaoManager, reason: collision with other method in class */
    public final C0YJ4 m145getImDaoManager() {
        return getImDaoManager();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0YLS] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0YI1] */
    public GECPigeon(C0YWO c0ywo) {
        C0YH4 c0yh4LIZJ;
        this.pigeonDepend = c0ywo;
        this.clientBridge = new C0YWJ(this, c0ywo);
        C0YWJ c0ywj = this.clientBridge;
        synchronized (C0YH4.class) {
            WeakReference<C0YH4> weakReference = C0YH4.LIZLLL.get(2);
            if (weakReference == null || (c0yh4LIZJ = weakReference.get()) == null) {
                c0yh4LIZJ = C0YH4.LIZJ(2, c0ywj, new C871040YFa());
            }
        }
        this.pigeonIMClient = c0yh4LIZJ;
        final C872040YIw c872040YIw = new C872040YIw(this);
        InterfaceC866920Xze interfaceC866920Xze = c872040YIw.LIZIZ;
        if (interfaceC866920Xze != null) {
            interfaceC866920Xze.unsubscribe();
        }
        c872040YIw.LIZIZ = null;
        InterfaceC866920Xze interfaceC866920Xze2 = c872040YIw.LIZJ;
        if (interfaceC866920Xze2 != null) {
            interfaceC866920Xze2.unsubscribe();
        }
        c872040YIw.LIZJ = null;
        C0YF7 events = c0yh4LIZJ.LIZ().getEvents();
        c872040YIw.LIZIZ = events.LIZIZ(new C1740506rj[]{InterfaceC871310YGb.LJFF, InterfaceC871310YGb.LJ}, new InterfaceC1741206rq() { // from class: X.0YLS
            @Override // X.InterfaceC1741206rq
            public final void onEvent(InterfaceC871310YGb interfaceC871310YGb) {
                if (interfaceC871310YGb instanceof C1890907at) {
                    C0YXD.LIZJ(c872040YIw.LIZ, new AwS593S0100000_14(interfaceC871310YGb, 270));
                } else {
                    if (!(interfaceC871310YGb instanceof C0YLT)) {
                        return;
                    }
                    C0YXD.LIZJ(c872040YIw.LIZ, new AwS593S0100000_14(interfaceC871310YGb, 271));
                }
            }
        });
        c872040YIw.LIZJ = events.LIZ(InterfaceC871310YGb.LIZIZ, new InterfaceC1741206rq() { // from class: X.0YI1
            @Override // X.InterfaceC1741206rq
            public final void onEvent(C868150Y3x c868150Y3x) {
                if (c868150Y3x.LJIIIZ == C0YMI.COMPLETED) {
                    c872040YIw.LIZ.notifyInitEnd$pigeon_release();
                }
            }
        });
        this.inboxEventSubscriber = c872040YIw;
        this.pigeonObserverReceiver = new C872030YIv(this);
        final C0YJ1 c0yj1 = new C0YJ1(this);
        ((C0YJ5) getPigeonObserverReceiver$pigeon_release().LIZIZ.getValue()).LJIIJ(new C1741506rt() { // from class: X.0YWX
            @Override // X.InterfaceC868420Y4y
            public final void Jk(C869590Y9l c869590Y9l, int i) {
            }

            @Override // X.InterfaceC868420Y4y
            public final void LLILZ(C869590Y9l c869590Y9l) {
            }

            @Override // X.C1741506rt, X.InterfaceC868420Y4y
            public final void Re(C869590Y9l c869590Y9l) {
            }

            @Override // X.InterfaceC868420Y4y
            public final void gb(C0Y3I c0y3i, List<C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
            }

            @Override // X.InterfaceC868420Y4y
            public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
            }

            @Override // X.InterfaceC868420Y4y
            public final void mf(C869590Y9l c869590Y9l) {
            }

            @Override // X.InterfaceC868420Y4y
            public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
            }

            @Override // X.InterfaceC868420Y4y
            public final void ns(String str) {
            }

            @Override // X.C1741506rt, X.InterfaceC868420Y4y
            public final void su(C869590Y9l c869590Y9l, boolean z) {
            }

            @Override // X.C1741506rt, X.InterfaceC868420Y4y
            public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
                c0yj1.LIZ.getContainerStore().LIZ(new AwS380S0200000_14((List) list, (List<C869590Y9l>) enumC872590YKz, (EnumC872590YKz) 86));
            }

            @Override // X.C1741506rt, X.InterfaceC868420Y4y
            public final void u6(List<C869590Y9l> list, boolean z) {
                c0yj1.LIZ.getContainerStore().LIZ(new AwS101S0110000_14((List) list, (List<C0Y8T>) z, true));
            }

            @Override // X.InterfaceC868420Y4y
            public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
                c0yj1.LIZ.getContainerStore().LIZ(new AwS99S0201000_14(i, c0yc9, c869590Y9l, 5));
            }

            @Override // X.InterfaceC868420Y4y
            public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
                String str;
                long jCurrentTimeMillis;
                c0yj1.LIZ.getContainerStore().LIZ(new AwS99S0201000_14((List) list, (List<C869590Y9l>) i, (int) c0y7p, (C0Y7P) 4));
                if (list != null) {
                    for (C869590Y9l c869590Y9l : list) {
                        if (C875480YWc.LIZIZ(c869590Y9l)) {
                            GECPigeon.Companion.getClass();
                            C872060YIy.LIZ().LIZ().LIZ("rd_im_message_receive", new AwS593S0100000_14(c869590Y9l, 339));
                        }
                        if (C875480YWc.LIZIZ(c869590Y9l) && (str = c869590Y9l.getExt().get("monitor_send_message_start_time")) != null) {
                            try {
                                long j = CastLongProtector.parseLong(str);
                                long j2 = C875470YWb.LIZ;
                                if (j2 > 0 && C875470YWb.LIZIZ > 0) {
                                    jCurrentTimeMillis = j2 + (SystemClock.elapsedRealtime() - C875470YWb.LIZIZ);
                                } else {
                                    jCurrentTimeMillis = System.currentTimeMillis();
                                }
                                if (j > 0 && jCurrentTimeMillis > 0 && i == 0) {
                                    GECPigeon.Companion.getClass();
                                    C872060YIy.LIZ().LIZ().LIZ("rd_im_msg_receive", new C0YWY(jCurrentTimeMillis, j, c869590Y9l));
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                }
            }

            @Override // X.C1741506rt, X.InterfaceC868420Y4y
            public final void a(int i, String str, List list, Long l) {
                c0yj1.LIZ.getContainerStore().LIZ(new C875460YWa(str, list, l));
            }
        });
        getPigeonIMClient().LIZIZ.LJ().LJJLIIIJILLIZJL(new InterfaceC867280Y0o() { // from class: X.0YXI
            @Override // X.InterfaceC868050Y3n
            public final void LJJLJLI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC868050Y3n
            public final void LJJLL(List<C0YAE> list) {
            }

            @Override // X.InterfaceC868050Y3n
            public final void LJJZZI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC868050Y3n
            public final void LJLI(String str, List<C0YAE> list) {
            }

            @Override // X.InterfaceC868050Y3n
            public final void LJLL(C1711306n1 c1711306n1) {
            }

            @Override // X.InterfaceC868050Y3n
            public final void LLIIII(int i, String str) {
            }

            @Override // X.InterfaceC868050Y3n
            public final void LLIILZL(int i, String str, List list) {
            }

            @Override // X.InterfaceC868050Y3n
            public final int LLLIIII() {
                return 10;
            }

            @Override // X.InterfaceC868050Y3n
            public final void LJJJJJL(C0Y8T c0y8t) {
                c0yj1.LIZ.getContainerStore().LIZ(new AwS593S0100000_14(c0y8t, 226));
            }

            @Override // X.InterfaceC868050Y3n
            public final void LJJLIIIJ(C0Y8T c0y8t) {
                c0yj1.LIZ.getContainerStore().LIZ(new AwS593S0100000_14(c0y8t, 225));
            }

            @Override // X.InterfaceC868050Y3n
            public final void LJLILLLLZI(C0Y8T c0y8t) {
                c0yj1.LIZ.getContainerStore().LIZ(new AwS593S0100000_14(c0y8t, 224));
            }

            @Override // X.InterfaceC868050Y3n
            public final void LJZI(C0Y8T c0y8t) {
                c0yj1.LIZ.getContainerStore().LIZ(new AwS593S0100000_14(c0y8t, 227));
            }

            @Override // X.InterfaceC867280Y0o
            public final void LLLIZZ(Map<String, C0Y8T> map) {
                c0yj1.LIZ.getContainerStore().LIZ(new AwS593S0100000_14(map, (Map<String, String>) 228));
            }

            @Override // X.InterfaceC868050Y3n
            public final void LJLJI(int i, C0Y8T c0y8t) {
                c0yj1.LIZ.getContainerStore().LIZ(new AwS122S0101000_14(i, c0y8t, 2));
            }
        });
        ((C0YJ5) getPigeonObserverReceiver$pigeon_release().LIZIZ.getValue()).LIZLLL(new InterfaceC870420YCq() { // from class: X.0YIz
            @Override // X.InterfaceC870420YCq
            public final void LJIILIIL() {
            }

            @Override // X.InterfaceC870420YCq
            public final void LJIJ(List<String> list) {
            }
        });
        C870830YEf c870830YEf = new C870830YEf();
        c870830YEf.LJIIIZ = 0;
        c870830YEf.LIZJ = true;
        c870830YEf.LJJI = 2;
        c870830YEf.LJIILIIL = 0;
        c870830YEf.LJJIZ = true;
        c870830YEf.LJJIJLIJ = true;
        c870830YEf.LJIILJJIL = 1;
        c870830YEf.LJJIJIIJIL = 1000L;
        c870830YEf.LJIJI = true;
        this.imOption = c870830YEf;
        this.conversationListManager$delegate = C452501pT.LIZIZ(new AwS558S0100000_14(this, 32));
        this.imDaoManager$delegate = C452501pT.LIZIZ(new C872050YIx(this));
    }

    public final void addOnInitEndListener(C0YJ0 c0yj0) {
        this.initEndListeners.add(c0yj0);
    }

    public final C0YJ3 createConversationManager(final String str) {
        return new C0YJ3(this, str) { // from class: X.0YIu
            public final InterfaceC866540Xz2 LIZ;

            {
                this.LIZ = this.getPigeonIMClient().LIZIZ.LJFF(str);
            }
        };
    }

    public final InterfaceC875610YWp createMessageListManager(final String str) {
        return new InterfaceC875610YWp(this, str) { // from class: X.0YHz
            public final InterfaceC871600YHe LIZ;

            @Override // X.InterfaceC875610YWp
            public final void LIZLLL() {
                this.LIZ.LJJIII();
            }

            @Override // X.InterfaceC875610YWp
            public final void LJII() {
                this.LIZ.LJII();
            }

            @Override // X.InterfaceC875610YWp
            public final List<C869590Y9l> LJIIIIZZ() {
                return this.LIZ.LJIIIIZZ();
            }

            @Override // X.InterfaceC875610YWp
            public final void resume() {
                this.LIZ.resume();
            }

            @Override // X.InterfaceC875610YWp
            public final void stop() {
                this.LIZ.stop();
            }

            @Override // X.InterfaceC875610YWp
            public final void LJ(C0YVN c0yvn) {
                this.LIZ.LLJI(c0yvn);
            }

            @Override // X.InterfaceC875610YWp
            public final void LJFF(C0YVN c0yvn) {
                this.LIZ.LJJJIL(c0yvn);
            }

            {
                this.LIZ = this.getPigeonIMClient().LIZIZ.LJIIJ(str, true, false, false);
            }
        };
    }

    public final InterfaceC875580YWm createMessageSendManager(final String str) {
        return new InterfaceC875580YWm(this, str) { // from class: X.0YI0
            public final InterfaceC871600YHe LIZ;
            public final C0YE6 LIZIZ;

            {
                this.LIZ = this.getPigeonIMClient().LIZIZ.LJIIJ(str, true, false, false);
                this.LIZIZ = this.getPigeonIMClient().LIZIZ.LJIIJJI();
            }

            @Override // X.InterfaceC875580YWm
            public final void LIZIZ(C869590Y9l c869590Y9l, C875570YWl c875570YWl) {
                this.LIZIZ.LLJJJJLIIL(c869590Y9l, c875570YWl);
            }

            @Override // X.InterfaceC875580YWm
            public final void LIZJ(C869590Y9l c869590Y9l, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
                if (interfaceC863600XuI == null) {
                    this.LIZ.LLIIL(new C0Y3I("biz side called: addOrUpdateMessage"), c869590Y9l);
                } else {
                    this.LIZ.LJJJLZIJ(new C0Y3I("biz side called: addOrUpdateMessage, with listener"), c869590Y9l, interfaceC863600XuI);
                }
            }

            @Override // X.InterfaceC875580YWm
            public final void LIZ(C869590Y9l c869590Y9l, boolean z, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
                C0YE6 c0ye6 = this.LIZIZ;
                if (interfaceC863600XuI == null) {
                    interfaceC863600XuI = new C914090ZtX(1);
                }
                c0ye6.LIZ(c869590Y9l, z, interfaceC863600XuI);
            }
        };
    }

    public final void login(C0YWT c0ywt) {
        if (!this.pigeonIMClient.isLogin()) {
            C870830YEf c870830YEf = this.imOption;
            c870830YEf.LJI = c0ywt.LJI;
            this.pigeonIMClient.LJI(c870830YEf);
        }
    }

    public final void removeOnInitEndListener(C0YJ0 c0yj0) {
        this.initEndListeners.remove(c0yj0);
    }

    public final void setNeedWebSocket(boolean z) {
        this.needWebSocket = z;
    }

    public final void setPigeonObserverReceiver$pigeon_release(C872030YIv c872030YIv) {
        this.pigeonObserverReceiver = c872030YIv;
    }
}
