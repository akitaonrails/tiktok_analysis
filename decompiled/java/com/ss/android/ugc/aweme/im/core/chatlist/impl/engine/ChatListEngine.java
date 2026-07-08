package com.ss.android.ugc.aweme.im.core.chatlist.impl.engine;

import X.AnonymousClass0617;
import X.C01GW;
import X.C09R7;
import X.C0NJD;
import X.C1153204fC;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1517705wt;
import X.C1517805wu;
import X.C15438062q;
import X.C1729806q0;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C309160C9y;
import X.C452501pT;
import X.C823170WQx;
import X.C878550YdJ;
import X.C878950Ydx;
import X.C879040Ye6;
import X.C879540Yeu;
import X.C880700Ygm;
import X.C884270YmX;
import X.C884570Yn1;
import X.C884580Yn2;
import X.C884590Yn3;
import X.C884670YnB;
import X.C884690YnD;
import X.C884730YnH;
import X.C884810YnP;
import X.C884820YnQ;
import X.C884830YnR;
import X.C884840YnS;
import X.C884850YnT;
import X.C884860YnU;
import X.C884880YnW;
import X.C884960Yne;
import X.C884970Ynf;
import X.C884980Yng;
import X.InterfaceC1294060jmO;
import X.InterfaceC1482905rH;
import X.InterfaceC1491305sd;
import X.InterfaceC1517005wm;
import X.InterfaceC1517505wr;
import X.InterfaceC879010Ye3;
import X.InterfaceC879770YfH;
import X.InterfaceC879790YfJ;
import X.InterfaceC882100Yj2;
import X.InterfaceC882190YjB;
import X.InterfaceC884250YmV;
import X.InterfaceC884440Ymo;
import X.InterfaceC884640Yn8;
import X.InterfaceC884800YnO;
import X.InterfaceC884870YnV;
import X.InterfaceC884940Ync;
import X.InterfaceC884950Ynd;
import X.InterfaceC884990Ynh;
import X.InterfaceC885810Yp1;
import X.InterfaceC886490Yq7;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import com.ss.android.ugc.aweme.im.core.chatlist.impl.actor.ChatListMultiThreadActor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatListEngine implements IChatListEngine {
    public static final /* synthetic */ int LJIJJ = 0;
    public final String LIZIZ = "ChatListEngine";
    public final C01GW LIZJ = C452501pT.LIZIZ(new C884880YnW());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C884820YnQ());
    public final C01GW LJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(127));
    public final Object LJFF = new Object();
    public final C01GW LJI = C452501pT.LIZIZ(new C884850YnT());
    public final C01GW LJII = C452501pT.LIZIZ(new C884840YnS());
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C884830YnR());
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new C884810YnP());
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C1153204fC());
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new C884860YnU());
    public final C0NJD<C884980Yng> LJIIL = new C0NJD<>(new C884980Yng(0));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new C884960Yne(this));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new C884970Ynf(this));
    public final C01GW LJIILL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(374));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(126));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(128));
    public final C01GW LJIJ = C452501pT.LIZIZ(new C1517805wu());
    public final C01GW LJIJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(375));

    @Override // X.InterfaceC884000Ym6
    public final synchronized void clear() {
        Iterator<T> it2 = LJIIZILJ().values().iterator();
        while (it2.hasNext()) {
            ((C884270YmX) it2.next()).LJIILL();
        }
        for (InterfaceC884250YmV interfaceC884250YmV : ((ConcurrentHashMap) this.LIZLLL.getValue()).values()) {
            interfaceC884250YmV.LIZJ();
            interfaceC884250YmV.LJIILIIL();
        }
        ((ConcurrentHashMap) this.LIZLLL.getValue()).clear();
        ((ConcurrentHashMap) this.LJ.getValue()).clear();
        Iterator it3 = ((ConcurrentHashMap) this.LJIIJ.getValue()).values().iterator();
        while (it3.hasNext()) {
            ((InterfaceC884940Ync) it3.next()).LIZJ();
        }
        ((ConcurrentHashMap) this.LJIIJ.getValue()).clear();
        ArrayList arrayList = new ArrayList();
        synchronized (this.LJFF) {
            try {
                for (InterfaceC882100Yj2 interfaceC882100Yj2 : ((ConcurrentHashMap) this.LJI.getValue()).values()) {
                    interfaceC882100Yj2.LJIILJJIL();
                    interfaceC882100Yj2.LIZJ();
                }
                ((ConcurrentHashMap) this.LJI.getValue()).clear();
                ((ConcurrentHashMap) this.LJII.getValue()).clear();
                ((ConcurrentHashMap) this.LJIIIIZZ.getValue()).clear();
                ((ConcurrentHashMap) this.LJIIIZ.getValue()).clear();
                Iterator<C879040Ye6> it4 = LJIILLIIL().iterator();
                while (it4.hasNext()) {
                    InterfaceC884990Ynh interfaceC884990Ynh = it4.next().LIZIZ;
                    if (interfaceC884990Ynh != null) {
                        arrayList.add(interfaceC884990Ynh);
                    }
                }
                LJIILLIIL().clear();
                ((C823170WQx) this.LJIIZILJ.getValue()).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it5 = ((ConcurrentHashMap) this.LJIIJJI.getValue()).values().iterator();
        while (it5.hasNext()) {
            ((InterfaceC884950Ynd) it5.next()).LIZJ();
        }
        ((ConcurrentHashMap) this.LJIIJJI.getValue()).clear();
        LJIIZILJ().clear();
        this.LJIIL.LIZIZ(new C884980Yng(0));
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((InterfaceC884990Ynh) it6.next()).LIZJ();
        }
        ((ConcurrentHashMap) this.LJIJ.getValue()).clear();
        ((ConcurrentHashMap) this.LJIJI.getValue()).clear();
        for (InterfaceC879010Ye3 interfaceC879010Ye3 : Collections.list(ChatListMultiThreadActor.LIZLLL.keys())) {
            ChatListMultiThreadActor chatListMultiThreadActor = ChatListMultiThreadActor.LIZ;
            ChatListMultiThreadActor.LIZLLL(interfaceC879010Ye3);
        }
        ChatListMultiThreadActor.LIZLLL.clear();
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine
    public final C823170WQx<InterfaceC1517505wr> LJIIIZ() {
        return (C823170WQx) this.LJIILL.getValue();
    }

    public final C823170WQx<C879040Ye6> LJIILLIIL() {
        return (C823170WQx) this.LJIILLIIL.getValue();
    }

    public final ConcurrentHashMap<InterfaceC879010Ye3, C884270YmX> LJIIZILJ() {
        return (ConcurrentHashMap) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine
    public final InterfaceC884440Ymo LIZJ(AnonymousClass0617 anonymousClass0617) {
        Iterator<T> it2 = LJIIZILJ().values().iterator();
        while (it2.hasNext()) {
            InterfaceC884440Ymo interfaceC884440Ymo = ((C884270YmX) it2.next()).LJIIL().get(anonymousClass0617);
            if (interfaceC884440Ymo != null) {
                return interfaceC884440Ymo;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine
    @InterfaceC1294060jmO
    public final C879540Yeu LIZLLL(AnonymousClass0617 anonymousClass0617) {
        Iterator<T> it2 = LJIIZILJ().values().iterator();
        while (it2.hasNext()) {
            C879540Yeu<?> c879540Yeu = ((C884270YmX) it2.next()).LJIILIIL().get(anonymousClass0617);
            if (c879540Yeu != null) {
                return c879540Yeu;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine
    public final InterfaceC884990Ynh LJFF(C19719912Dl c19719912Dl) {
        List listLLIIII;
        InterfaceC884990Ynh interfaceC884990Ynh;
        synchronized (this.LJFF) {
            try {
                listLLIIII = C13LP.LLIIII(LJIILLIIL());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = listLLIIII.iterator();
        while (true) {
            interfaceC884990Ynh = null;
            if (!it2.hasNext() || ((interfaceC884990Ynh = ((C879040Ye6) it2.next()).LIZIZ) != null && Intrinsics.LJFF(C13LE.LIZ(interfaceC884990Ynh.getClass()), c19719912Dl))) {
                break;
            }
        }
        return interfaceC884990Ynh;
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine
    public final void LJIIIIZZ(InterfaceC884640Yn8 interfaceC884640Yn8) {
        C1729806q0.LIZIZ(new AwS415S0200000_14(this, interfaceC884640Yn8, 32), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105 A[Catch: all -> 0x0258, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0015, B:9:0x0034, B:11:0x003d, B:12:0x004b, B:13:0x0076, B:15:0x007d, B:17:0x0091, B:19:0x0097, B:22:0x00b1, B:21:0x009f, B:25:0x00b8, B:27:0x00c0, B:28:0x00d1, B:30:0x00d7, B:32:0x00f7, B:34:0x00fd, B:37:0x0117, B:36:0x0105, B:40:0x0121, B:41:0x0142, B:43:0x014f, B:45:0x0163, B:48:0x0172, B:49:0x017e, B:51:0x0186, B:53:0x019a, B:56:0x01a6, B:57:0x01b2, B:58:0x01c3, B:60:0x01c9, B:62:0x01dd, B:64:0x01e3, B:67:0x01fd, B:66:0x01eb, B:70:0x0207, B:71:0x020d, B:73:0x021b, B:74:0x0225, B:75:0x023b, B:77:0x0241, B:79:0x0251), top: B:85:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01eb A[Catch: all -> 0x0258, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0015, B:9:0x0034, B:11:0x003d, B:12:0x004b, B:13:0x0076, B:15:0x007d, B:17:0x0091, B:19:0x0097, B:22:0x00b1, B:21:0x009f, B:25:0x00b8, B:27:0x00c0, B:28:0x00d1, B:30:0x00d7, B:32:0x00f7, B:34:0x00fd, B:37:0x0117, B:36:0x0105, B:40:0x0121, B:41:0x0142, B:43:0x014f, B:45:0x0163, B:48:0x0172, B:49:0x017e, B:51:0x0186, B:53:0x019a, B:56:0x01a6, B:57:0x01b2, B:58:0x01c3, B:60:0x01c9, B:62:0x01dd, B:64:0x01e3, B:67:0x01fd, B:66:0x01eb, B:70:0x0207, B:71:0x020d, B:73:0x021b, B:74:0x0225, B:75:0x023b, B:77:0x0241, B:79:0x0251), top: B:85:0x0003 }] */
    /* JADX WARN: Type inference failed for: r2v13, types: [X.0Ynd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v34, types: [X.0YmV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.C884270YmX LJIIJ(X.InterfaceC884640Yn8 r19) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine.LJIIJ(X.0Yn8):X.0YmX");
    }

    @Override // X.InterfaceC884000Ym6
    public final void LJIILJJIL(C884980Yng c884980Yng) {
        this.LJIIL.LIZIZ(c884980Yng);
    }

    public final void LJIJI(C884270YmX c884270YmX) {
        C884730YnH c884730YnH;
        InterfaceC882100Yj2 interfaceC882100Yj2Invoke;
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            c884690YnD.LIZJ("lazy_init_handle");
        }
        String str = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lazyInitHandle page=");
        sbLIZ.append(c884270YmX.LIZ.getKey());
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Pair<C13IQ<? extends InterfaceC879790YfJ>, InterfaceC879770YfH> pairLIZLLL = c884270YmX.LIZ.LIZLLL();
        C13IQ<? extends InterfaceC879790YfJ> first = pairLIZLLL.getFirst();
        InterfaceC879770YfH second = pairLIZLLL.getSecond();
        synchronized (this.LJFF) {
            try {
                List<C13IQ<? extends InterfaceC882100Yj2>> listLIZIZ = c884270YmX.LIZ.LIZIZ();
                ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
                for (C13IQ<? extends InterfaceC882100Yj2> c13iq : listLIZIZ) {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LJI.getValue();
                    Object objPutIfAbsent = concurrentHashMap.get(c13iq);
                    if (objPutIfAbsent == null) {
                        Function1<C13IQ<? extends InterfaceC882100Yj2>, InterfaceC882100Yj2> function1LJIIIZ = c884270YmX.LIZ.LJIIIZ();
                        if (function1LJIIIZ == null || (interfaceC882100Yj2Invoke = function1LJIIIZ.invoke(c13iq)) == null) {
                            interfaceC882100Yj2Invoke = (InterfaceC882100Yj2) C09R7.LIZ(c13iq).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        }
                        interfaceC882100Yj2Invoke.init();
                        interfaceC882100Yj2Invoke.LJIIJ(Collections.singletonList((InterfaceC1482905rH) this.LJIILJJIL.getValue()));
                        objPutIfAbsent = concurrentHashMap.putIfAbsent(c13iq, interfaceC882100Yj2Invoke);
                        if (objPutIfAbsent == null) {
                            objPutIfAbsent = interfaceC882100Yj2Invoke;
                        }
                    }
                    InterfaceC882100Yj2 interfaceC882100Yj2 = (InterfaceC882100Yj2) objPutIfAbsent;
                    interfaceC882100Yj2.LJ(c884270YmX.LIZ.getKey());
                    if (interfaceC882100Yj2.LIZIZ().LIZJ) {
                        arrayList.add(interfaceC882100Yj2);
                    }
                    if (interfaceC882100Yj2.LIZIZ().LIZLLL) {
                        arrayList2.add(interfaceC882100Yj2);
                    }
                    if (interfaceC882100Yj2.LIZIZ().LJ) {
                        arrayList3.add(interfaceC882100Yj2);
                    }
                    if (interfaceC882100Yj2.LIZIZ().LJFF) {
                        arrayList4.add(interfaceC882100Yj2);
                    }
                    if (interfaceC882100Yj2.LIZIZ().LJI) {
                        arrayList5.add(interfaceC882100Yj2);
                    }
                    if (interfaceC882100Yj2.LIZIZ().LIZIZ) {
                        arrayList6.add(interfaceC882100Yj2);
                    }
                    arrayList7.add((InterfaceC882100Yj2) objPutIfAbsent);
                }
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.LJII.getValue();
                InterfaceC879790YfJ interfaceC879790YfJInvoke = concurrentHashMap2.get(first);
                if (interfaceC879790YfJInvoke == null) {
                    Function1<C13IQ<? extends InterfaceC879790YfJ>, InterfaceC879790YfJ> function1LJIILIIL = c884270YmX.LIZ.LJIILIIL();
                    if (function1LJIILIIL == null || (interfaceC879790YfJInvoke = function1LJIILIIL.invoke(first)) == null) {
                        interfaceC879790YfJInvoke = (InterfaceC879790YfJ) C09R7.LIZ(first).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(first, interfaceC879790YfJInvoke);
                    if (objPutIfAbsent2 != null) {
                        interfaceC879790YfJInvoke = objPutIfAbsent2;
                    }
                }
                Pair pair = new Pair(interfaceC879790YfJInvoke, second);
                List<C13IQ<? extends InterfaceC882190YjB>> listLJIIIIZZ = c884270YmX.LIZ.LJIIIIZZ();
                ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(listLJIIIIZZ, 10));
                for (C13IQ<? extends InterfaceC882190YjB> c13iq2 : listLJIIIIZZ) {
                    ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) this.LJIIIIZZ.getValue();
                    InterfaceC882190YjB interfaceC882190YjBInvoke = concurrentHashMap3.get(c13iq2);
                    if (interfaceC882190YjBInvoke == null) {
                        Function1<C13IQ<? extends InterfaceC882190YjB>, InterfaceC882190YjB> function1LJII = c884270YmX.LIZ.LJII();
                        if (function1LJII == null || (interfaceC882190YjBInvoke = function1LJII.invoke(c13iq2)) == null) {
                            interfaceC882190YjBInvoke = (InterfaceC882190YjB) C09R7.LIZ(c13iq2).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        }
                        Object objPutIfAbsent3 = concurrentHashMap3.putIfAbsent(c13iq2, interfaceC882190YjBInvoke);
                        if (objPutIfAbsent3 != null) {
                            interfaceC882190YjBInvoke = objPutIfAbsent3;
                        }
                    }
                    arrayList8.add((InterfaceC882190YjB) interfaceC882190YjBInvoke);
                }
                List<C13IQ<? extends InterfaceC886490Yq7<?, ?>>> listLJIILJJIL = c884270YmX.LIZ.LJIILJJIL();
                ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(listLJIILJJIL, 10));
                for (C13IQ<? extends InterfaceC886490Yq7<?, ?>> c13iq3 : listLJIILJJIL) {
                    ConcurrentHashMap concurrentHashMap4 = (ConcurrentHashMap) this.LJIIIZ.getValue();
                    Object obj = concurrentHashMap4.get(c13iq3);
                    if (obj == null) {
                        Function1<C13IQ<? extends InterfaceC886490Yq7<?, ?>>, InterfaceC886490Yq7<?, ?>> function1LJ = c884270YmX.LIZ.LJ();
                        if (function1LJ == null || (obj = (InterfaceC886490Yq7) function1LJ.invoke(c13iq3)) == null) {
                            obj = (InterfaceC886490Yq7) C09R7.LIZ(c13iq3).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        }
                        Object objPutIfAbsent4 = concurrentHashMap4.putIfAbsent(c13iq3, obj);
                        if (objPutIfAbsent4 != null) {
                            obj = objPutIfAbsent4;
                        }
                    }
                    arrayList9.add((InterfaceC886490Yq7) obj);
                }
                c884730YnH = new C884730YnH(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, pair, arrayList8, arrayList9);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c884270YmX.LJIIL = c884730YnH;
        C884690YnD c884690YnD2 = c884270YmX.LJ;
        if (c884690YnD2 != null) {
            c884690YnD2.LIZ("lazy_init_handle");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r4, "page_cache") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIJ(X.C884270YmX r3, java.lang.String r4) {
        /*
            java.util.List<kotlin.Pair<X.0YmV, X.0YdK>> r0 = r3.LIZIZ
            java.util.Iterator r3 = r0.iterator()
        L6:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L26
            java.lang.Object r1 = r3.next()
            r0 = r1
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.getFirst()
            X.0YmV r0 = (X.InterfaceC884250YmV) r0
            java.lang.String r0 = r0.getTag()
            boolean r0 = kotlin.text.a0.LJJIIZI(r4, r0, r2)
            if (r0 == 0) goto L6
            if (r1 != 0) goto L2e
        L26:
            java.lang.String r0 = "page_cache"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L2f
        L2e:
            r2 = 1
        L2f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine.LJIJ(X.0YmX, java.lang.String):boolean");
    }

    @Override // X.InterfaceC884000Ym6
    public final void LIZ(C878950Ydx c878950Ydx, InterfaceC1517505wr interfaceC1517505wr) {
        C1729806q0.LIZJ(c878950Ydx, new AwS415S0200000_14(this, interfaceC1517505wr, 91));
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine
    public final void LIZIZ(C878950Ydx c878950Ydx, List list) {
        C1729806q0.LIZJ(c878950Ydx, new AwS415S0200000_14(this, (ChatListEngine) list, (List<C879040Ye6>) 92));
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine
    public final void LJ(C878950Ydx c878950Ydx, List list) {
        C1729806q0.LIZJ(c878950Ydx, new C884670YnB(this, list));
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine
    public final boolean LJI(InterfaceC1517505wr interfaceC1517505wr, AnonymousClass0617 anonymousClass0617) {
        Set setLLIIJI;
        C823170WQx c823170WQx = (C823170WQx) ((ConcurrentHashMap) this.LJIJI.getValue()).get(interfaceC1517505wr);
        if (c823170WQx != null && (setLLIIJI = C13LP.LLIIJI(c823170WQx)) != null && setLLIIJI.contains(anonymousClass0617)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine
    public final C879540Yeu<?> LJII(InterfaceC1491305sd interfaceC1491305sd, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C884270YmX c884270YmX;
        Map<InterfaceC1491305sd, C879540Yeu<?>> mapLJIILIIL;
        if (interfaceC879010Ye3 == null || (c884270YmX = LJIIZILJ().get(interfaceC879010Ye3)) == null || (mapLJIILIIL = c884270YmX.LJIILIIL()) == null) {
            return null;
        }
        return mapLJIILIIL.get(interfaceC1491305sd);
    }

    @Override // X.InterfaceC884000Ym6
    public final void LJIIL(C878950Ydx c878950Ydx, InterfaceC1517505wr interfaceC1517505wr) {
        C1729806q0.LIZJ(c878950Ydx, new AwS415S0200000_14(this, interfaceC1517505wr, 90));
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine
    public final void LJIILIIL(InterfaceC1517505wr interfaceC1517505wr, InterfaceC1491305sd interfaceC1491305sd) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LJIJI.getValue();
        Object c823170WQx = concurrentHashMap.get(interfaceC1517505wr);
        if (c823170WQx == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC1517505wr, (c823170WQx = new C823170WQx()))) != null) {
            c823170WQx = objPutIfAbsent;
        }
        ((C823170WQx) c823170WQx).add(interfaceC1491305sd);
    }

    @Override // com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine
    public final void LJIIJJI(InterfaceC885810Yp1 interfaceC885810Yp1, InterfaceC879010Ye3 interfaceC879010Ye3, boolean z) {
        C884270YmX c884270YmX;
        List<InterfaceC884950Ynd> list;
        if (interfaceC879010Ye3 != null && (c884270YmX = LJIIZILJ().get(interfaceC879010Ye3)) != null && (list = c884270YmX.LIZLLL) != null) {
            Iterator<InterfaceC884950Ynd> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(interfaceC885810Yp1, interfaceC879010Ye3, z);
            }
        }
    }

    public final void LJIJJ(C884270YmX c884270YmX, Collection<? extends C879540Yeu<?>> collection, String str) {
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            c884690YnD.LIZLLL("notify_after_filter_updater_data_update", C2097608Jq.LJIIIIZZ(new Pair("source", str), new Pair("size", Integer.valueOf(collection.size()))));
        }
        String str2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyAfterFilterUpdaterDataChange page=");
        sbLIZ.append(c884270YmX.LIZ.getKey());
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str2);
        C1729806q0.LIZ(c884270YmX.LIZ.getKey(), new C884580Yn2(c884270YmX, this, collection, str, null));
        C884690YnD c884690YnD2 = c884270YmX.LJ;
        if (c884690YnD2 != null) {
            c884690YnD2.LIZIZ("notify_after_filter_updater_data_update", null);
        }
    }

    public final void LJIJJLI(C884270YmX c884270YmX, Collection<? extends C879540Yeu<?>> collection, String str) {
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            c884690YnD.LIZLLL("notify_before_filter_updater_data_update", C2097608Jq.LJIIIIZZ(new Pair("source", str), new Pair("size", Integer.valueOf(collection.size()))));
        }
        String str2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyBeforeFilterUpdaterDataChange page=");
        sbLIZ.append(c884270YmX.LIZ.getKey());
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str2);
        C1729806q0.LIZ(c884270YmX.LIZ.getKey(), new C884570Yn1(c884270YmX, this, collection, str, null));
        C884690YnD c884690YnD2 = c884270YmX.LJ;
        if (c884690YnD2 != null) {
            c884690YnD2.LIZIZ("notify_before_filter_updater_data_update", null);
        }
    }

    public final void LJJII(C884270YmX c884270YmX, Collection<? extends InterfaceC1491305sd> collection, String str) {
        List<InterfaceC882100Yj2> list;
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            c884690YnD.LIZLLL("after_filter_update_chain_remove", C2097608Jq.LJIIIIZZ(new Pair("source", str), new Pair("size", Integer.valueOf(collection.size()))));
        }
        String str2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerAfterFilterUpdateChainRemove size=");
        sbLIZ.append(collection.size());
        sbLIZ.append(", page=");
        sbLIZ.append(c884270YmX.LIZ.getKey());
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str2);
        for (InterfaceC1491305sd interfaceC1491305sd : collection) {
            C884730YnH c884730YnH = c884270YmX.LJIIL;
            if (c884730YnH != null && (list = c884730YnH.LIZIZ) != null) {
                for (InterfaceC882100Yj2 interfaceC882100Yj2 : list) {
                    InterfaceC1517005wm interfaceC1517005wmLIZLLL = interfaceC882100Yj2.LIZLLL();
                    if (!(interfaceC1517005wmLIZLLL instanceof C1517705wt) || !C13LP.LJJL(LJIIIZ(), ((C1517705wt) interfaceC1517005wmLIZLLL).LIZ).isEmpty()) {
                        interfaceC882100Yj2.LJII(c884270YmX.LIZ.getKey(), interfaceC1491305sd, str);
                    }
                }
            }
            c884270YmX.LJIIIIZZ().remove(interfaceC1491305sd);
            c884270YmX.LJIIL().remove(interfaceC1491305sd);
        }
        C884690YnD c884690YnD2 = c884270YmX.LJ;
        if (c884690YnD2 != null) {
            c884690YnD2.LIZIZ("after_filter_update_chain_remove", null);
        }
    }

    public final Collection<C879540Yeu<?>> LJJIIZI(C884270YmX c884270YmX, Collection<? extends C879540Yeu<?>> collection, String str) {
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            c884690YnD.LIZLLL("filter", C2097608Jq.LJIIIIZZ(new Pair("source", str), new Pair("size", Integer.valueOf(collection.size()))));
        }
        String str2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerFilter size=");
        sbLIZ.append(collection.size());
        sbLIZ.append(", page=");
        sbLIZ.append(c884270YmX.LIZ.getKey());
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str2);
        C884730YnH c884730YnH = c884270YmX.LJIIL;
        if (c884730YnH == null) {
            return C13BV.INSTANCE;
        }
        Pair<InterfaceC879790YfJ, InterfaceC879770YfH> pair = c884730YnH.LJII;
        C880700Ygm c880700YgmLIZ = pair.getFirst().LIZ(collection, pair.getSecond(), str);
        for (C879540Yeu<?> c879540Yeu : c880700YgmLIZ.LIZ) {
            c884270YmX.LJIIIIZZ().put(c879540Yeu.LIZIZ, c879540Yeu);
        }
        Iterator<T> it2 = c880700YgmLIZ.LIZIZ.iterator();
        while (it2.hasNext()) {
            C879540Yeu c879540Yeu2 = (C879540Yeu) it2.next();
            c884270YmX.LJIIIIZZ().remove(c879540Yeu2.LIZIZ);
            c884270YmX.LJIIL().remove(c879540Yeu2.LIZIZ);
        }
        C884690YnD c884690YnD2 = c884270YmX.LJ;
        if (c884690YnD2 != null) {
            c884690YnD2.LIZIZ("filter", null);
        }
        return c880700YgmLIZ.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.C884270YmX r9, java.util.List<? extends X.InterfaceC884440Ymo> r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine.LJIL(X.0YmX, java.util.List, java.lang.String, boolean):void");
    }

    public final void LJJ(C884270YmX c884270YmX, Collection<? extends C879540Yeu<?>> collection, Collection<? extends InterfaceC1491305sd> collection2, String str) {
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            c884690YnD.LIZLLL("notify_updater_raw_data_update", C2097608Jq.LJIIIIZZ(new Pair("source", str), new Pair("size", Integer.valueOf(collection.size()))));
        }
        String str2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyUpdaterRawDataChange page=");
        sbLIZ.append(c884270YmX.LIZ.getKey());
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str2);
        C1729806q0.LIZ(c884270YmX.LIZ.getKey(), new C884590Yn3(c884270YmX, this, collection, collection2, str, null));
    }

    public final void LJIILL(C884270YmX c884270YmX, List<? extends C879540Yeu<?>> list, List<? extends C879540Yeu<?>> list2, boolean z, String str) {
        boolean z2;
        InterfaceC884800YnO interfaceC884800YnO;
        InterfaceC884800YnO interfaceC884800YnO2;
        InterfaceC884800YnO interfaceC884800YnO3;
        InterfaceC884800YnO interfaceC884800YnO4;
        InterfaceC884800YnO interfaceC884800YnO5;
        InterfaceC884800YnO interfaceC884800YnO6;
        InterfaceC884870YnV interfaceC884870YnV;
        InterfaceC884870YnV interfaceC884870YnV2;
        InterfaceC884800YnO interfaceC884800YnO7;
        InterfaceC884800YnO interfaceC884800YnO8;
        InterfaceC884800YnO interfaceC884800YnO9 = c884270YmX.LJFF;
        if (interfaceC884800YnO9 != null && interfaceC884800YnO9.LIZLLL(c884270YmX.LIZ.getKey(), z)) {
            z2 = true;
            InterfaceC884800YnO interfaceC884800YnO10 = c884270YmX.LJFF;
            if (interfaceC884800YnO10 != null) {
                interfaceC884800YnO10.LJIIJJI(System.currentTimeMillis());
            }
        } else {
            z2 = false;
        }
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            c884690YnD.LIZLLL("execute_data_source_batch_update", C2097608Jq.LJIIIIZZ(new Pair("source", str), new Pair("size", Integer.valueOf(list.size()))));
        }
        String str2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executeDataSourceBatchUpdate size=");
        sbLIZ.append(list.size());
        sbLIZ.append(", page=");
        sbLIZ.append(c884270YmX.LIZ.getKey());
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str2);
        if (c884270YmX.LJIIL != null) {
            if (z2 && (interfaceC884800YnO8 = c884270YmX.LJFF) != null) {
                interfaceC884800YnO8.LJIIIZ(System.currentTimeMillis());
            }
        } else {
            LJIJI(c884270YmX);
            if (z2 && (interfaceC884800YnO = c884270YmX.LJFF) != null) {
                interfaceC884800YnO.LJIIIZ(System.currentTimeMillis());
            }
        }
        LJJIII(c884270YmX, null, false, list, str, z2, z);
        if (z2 && (interfaceC884800YnO7 = c884270YmX.LJFF) != null) {
            interfaceC884800YnO7.LJFF(System.currentTimeMillis());
        }
        if (z && (interfaceC884870YnV2 = c884270YmX.LJI) != null) {
            interfaceC884870YnV2.LJI(list.size());
        }
        Collection<C879540Yeu<?>> collectionLJJIIZI = LJJIIZI(c884270YmX, list, str);
        if (z && (interfaceC884870YnV = c884270YmX.LJI) != null) {
            interfaceC884870YnV.LJIIIIZZ(collectionLJJIIZI.size());
        }
        if (z2 && (interfaceC884800YnO6 = c884270YmX.LJFF) != null) {
            interfaceC884800YnO6.LJ(System.currentTimeMillis());
        }
        LJJI(c884270YmX, null, false, collectionLJJIIZI, str, z2, z);
        if (z2 && (interfaceC884800YnO5 = c884270YmX.LJFF) != null) {
            interfaceC884800YnO5.LIZ(System.currentTimeMillis());
        }
        LJJIIJZLJL(c884270YmX, null, false, collectionLJJIIZI, str, z2, z);
        if (z2 && (interfaceC884800YnO4 = c884270YmX.LJFF) != null) {
            interfaceC884800YnO4.LIZIZ(System.currentTimeMillis());
        }
        boolean z3 = z2;
        LJJIJ(c884270YmX, collectionLJJIIZI, str, z3, z);
        if (z3) {
            InterfaceC884800YnO interfaceC884800YnO11 = c884270YmX.LJFF;
            if (interfaceC884800YnO11 != null) {
                interfaceC884800YnO11.LJIIJ(System.currentTimeMillis());
            }
            InterfaceC884800YnO interfaceC884800YnO12 = c884270YmX.LJFF;
            if (interfaceC884800YnO12 != null) {
                interfaceC884800YnO12.LJII(c884270YmX.LJIIL().size());
            }
        }
        List<? extends InterfaceC884440Ymo> listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0YnK
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Long.valueOf(((InterfaceC884440Ymo) t2).getSortOrder()), Long.valueOf(((InterfaceC884440Ymo) t).getSortOrder()));
            }
        }, c884270YmX.LJIIL().values());
        if (z3 && (interfaceC884800YnO3 = c884270YmX.LJFF) != null) {
            interfaceC884800YnO3.LJI(System.currentTimeMillis());
        }
        LJIL(c884270YmX, listLJLLLL, str, z);
        if (z3 && (interfaceC884800YnO2 = c884270YmX.LJFF) != null) {
            interfaceC884800YnO2.LJIIIIZZ(System.currentTimeMillis());
        }
        LJIJJLI(c884270YmX, c884270YmX.LJIILIIL().values(), str);
        LJIJJ(c884270YmX, c884270YmX.LJIIIIZZ().values(), str);
        LJJ(c884270YmX, list2, C13BV.INSTANCE, str);
        C884690YnD c884690YnD2 = c884270YmX.LJ;
        if (c884690YnD2 != null) {
            c884690YnD2.LIZIZ("execute_data_source_batch_update", C2097908Jt.LIZJ(new Pair("output_size", Integer.valueOf(c884270YmX.LJIIL().size()))));
        }
    }

    public final void LJJIJ(C884270YmX c884270YmX, Collection<? extends C879540Yeu<?>> collection, String str, boolean z, boolean z2) {
        List<InterfaceC886490Yq7<?, ?>> list;
        InterfaceC884870YnV interfaceC884870YnV;
        InterfaceC884800YnO interfaceC884800YnO;
        InterfaceC884440Ymo interfaceC884440YmoLIZJ;
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            c884690YnD.LIZLLL("vo_convert", C2097608Jq.LJIIIIZZ(new Pair("source", str), new Pair("size", Integer.valueOf(collection.size()))));
        }
        String str2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerConvert size=");
        sbLIZ.append(collection.size());
        sbLIZ.append(", page=");
        sbLIZ.append(c884270YmX.LIZ.getKey());
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str2);
        C884730YnH c884730YnH = c884270YmX.LJIIL;
        if (c884730YnH != null && (list = c884730YnH.LJIIIZ) != null) {
            for (InterfaceC886490Yq7<?, ?> interfaceC886490Yq7 : list) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (C879540Yeu<?> c879540Yeu : collection) {
                        if (interfaceC886490Yq7.LIZLLL(c879540Yeu) && (interfaceC884440YmoLIZJ = interfaceC886490Yq7.LIZJ(c879540Yeu, c884270YmX.LIZ.getKey())) != null) {
                            c884270YmX.LJIIL().put(interfaceC884440YmoLIZJ.getKey(), interfaceC884440YmoLIZJ);
                        }
                    }
                    if (z && (interfaceC884800YnO = c884270YmX.LJFF) != null) {
                        interfaceC884800YnO.LIZJ(System.currentTimeMillis() - jCurrentTimeMillis, interfaceC886490Yq7.LIZ());
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (z2 && (interfaceC884870YnV = c884270YmX.LJI) != null) {
                        interfaceC884870YnV.LJIILLIIL(interfaceC886490Yq7.LIZ());
                    }
                    C309160C9y.LIZJ(this.LIZIZ, e);
                }
            }
        }
        C884690YnD c884690YnD2 = c884270YmX.LJ;
        if (c884690YnD2 != null) {
            c884690YnD2.LIZIZ("vo_convert", null);
        }
    }

    public final void LJJI(C884270YmX c884270YmX, Set<? extends C13IQ<? extends InterfaceC882100Yj2>> set, boolean z, Collection<? extends C879540Yeu<?>> collection, String str, boolean z2, boolean z3) {
        List<InterfaceC882100Yj2> list;
        InterfaceC884870YnV interfaceC884870YnV;
        InterfaceC1517005wm interfaceC1517005wmLIZLLL;
        InterfaceC884800YnO interfaceC884800YnO;
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            c884690YnD.LIZLLL("after_filter_update_chain", C2097608Jq.LJIIIIZZ(new Pair("source", str), new Pair("size", Integer.valueOf(collection.size()))));
        }
        String str2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerAfterFilterUpdateChain size=");
        sbLIZ.append(collection.size());
        sbLIZ.append(", page=");
        sbLIZ.append(c884270YmX.LIZ.getKey());
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str2);
        C884730YnH c884730YnH = c884270YmX.LJIIL;
        if (c884730YnH != null && (list = c884730YnH.LIZIZ) != null) {
            for (InterfaceC882100Yj2 interfaceC882100Yj2 : list) {
                try {
                    interfaceC1517005wmLIZLLL = interfaceC882100Yj2.LIZLLL();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (z3 && (interfaceC884870YnV = c884270YmX.LJI) != null) {
                        interfaceC882100Yj2.LIZ();
                        interfaceC884870YnV.LJIILJJIL();
                    }
                    C309160C9y.LIZJ(this.LIZIZ, e);
                }
                if (!(interfaceC1517005wmLIZLLL instanceof C1517705wt) || !C13LP.LJJL(LJIIIZ(), ((C1517705wt) interfaceC1517005wmLIZLLL).LIZ).isEmpty()) {
                    if (!z || (set != null && set.contains(C13LE.LIZ(interfaceC882100Yj2.getClass())))) {
                        String str3 = this.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("afterFilterUpdateChain ");
                        sbLIZ2.append(interfaceC882100Yj2.getTag());
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C309160C9y.LIZLLL(str3);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Iterator<T> it2 = collection.iterator();
                        while (it2.hasNext()) {
                            interfaceC882100Yj2.LJIIIZ((C879540Yeu) it2.next(), c884270YmX.LIZ.getKey());
                        }
                        interfaceC882100Yj2.LJIJ();
                        if (z2 && (interfaceC884800YnO = c884270YmX.LJFF) != null) {
                            interfaceC884800YnO.LIZJ(System.currentTimeMillis() - jCurrentTimeMillis, interfaceC882100Yj2.LIZ());
                        }
                    }
                }
            }
        }
        for (C879540Yeu<?> c879540Yeu : collection) {
            c884270YmX.LJIILIIL().put(c879540Yeu.LIZIZ, c879540Yeu);
            c884270YmX.LJIIIIZZ().put(c879540Yeu.LIZIZ, c879540Yeu);
        }
        C884690YnD c884690YnD2 = c884270YmX.LJ;
        if (c884690YnD2 != null) {
            c884690YnD2.LIZIZ("after_filter_update_chain", null);
        }
    }

    public final void LJJIII(C884270YmX c884270YmX, Set<? extends C13IQ<? extends InterfaceC882100Yj2>> set, boolean z, Collection<? extends C879540Yeu<?>> collection, String str, boolean z2, boolean z3) {
        List<InterfaceC882100Yj2> list;
        InterfaceC884800YnO interfaceC884800YnO;
        InterfaceC884870YnV interfaceC884870YnV;
        List<InterfaceC882100Yj2> list2;
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            c884690YnD.LIZLLL("before_filter_update_chain", C2097608Jq.LJIIIIZZ(new Pair("source", str), new Pair("before_filter_size", Integer.valueOf(collection.size()))));
        }
        String str2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerBeforeFilterUpdateChain size=");
        sbLIZ.append(collection.size());
        sbLIZ.append(", page=");
        sbLIZ.append(c884270YmX.LIZ.getKey());
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str2);
        InterfaceC879770YfH second = c884270YmX.LIZ.LIZLLL().getSecond();
        C884730YnH c884730YnH = c884270YmX.LJIIL;
        if (c884730YnH != null && (list2 = c884730YnH.LJFF) != null) {
            for (InterfaceC882100Yj2 interfaceC882100Yj2 : list2) {
                try {
                    interfaceC882100Yj2.LJIIZILJ(c884270YmX.LIZ.getKey(), collection, str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC884870YnV interfaceC884870YnV2 = c884270YmX.LJI;
                    if (interfaceC884870YnV2 != null) {
                        interfaceC884870YnV2.LJIIJ(interfaceC882100Yj2.LIZ());
                    }
                    C309160C9y.LIZJ(this.LIZIZ, e);
                }
            }
        }
        C884730YnH c884730YnH2 = c884270YmX.LJIIL;
        if (c884730YnH2 != null && (list = c884730YnH2.LIZ) != null) {
            for (InterfaceC882100Yj2 interfaceC882100Yj22 : list) {
                InterfaceC1517005wm interfaceC1517005wmLIZLLL = interfaceC882100Yj22.LIZLLL();
                if (!(interfaceC1517005wmLIZLLL instanceof C1517705wt) || !C13LP.LJJL(LJIIIZ(), ((C1517705wt) interfaceC1517005wmLIZLLL).LIZ).isEmpty()) {
                    if (!z || (set != null && set.contains(C13LE.LIZ(interfaceC882100Yj22.getClass())))) {
                        String str3 = this.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("beforeFilterUpdateChain ");
                        sbLIZ2.append(interfaceC882100Yj22.getTag());
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C309160C9y.LIZLLL(str3);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Iterator<T> it2 = collection.iterator();
                        while (it2.hasNext()) {
                            try {
                                interfaceC882100Yj22.LJIIJJI(c884270YmX.LIZ.getKey(), (C879540Yeu) it2.next(), second);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                if (z3 && (interfaceC884870YnV = c884270YmX.LJI) != null) {
                                    interfaceC884870YnV.LJIIJ(interfaceC882100Yj22.LIZ());
                                }
                                C309160C9y.LIZJ(this.LIZIZ, e2);
                            }
                        }
                        if (z2 && (interfaceC884800YnO = c884270YmX.LJFF) != null) {
                            interfaceC884800YnO.LIZJ(System.currentTimeMillis() - jCurrentTimeMillis, interfaceC882100Yj22.LIZ());
                        }
                    }
                }
            }
        }
        for (C879540Yeu<?> c879540Yeu : collection) {
            c884270YmX.LJIILIIL().put(c879540Yeu.LIZIZ, c879540Yeu);
        }
        C884690YnD c884690YnD2 = c884270YmX.LJ;
        if (c884690YnD2 != null) {
            c884690YnD2.LIZIZ("before_filter_update_chain", null);
        }
    }

    public final void LJJIIJ(InterfaceC879010Ye3 interfaceC879010Ye3, List<? extends C879540Yeu<?>> list, List<? extends C879540Yeu<?>> list2, C878550YdJ c878550YdJ, boolean z, boolean z2, String str) {
        C884270YmX c884270YmX = LJIIZILJ().get(interfaceC879010Ye3);
        if (c884270YmX == null) {
            return;
        }
        if (c878550YdJ != null) {
            c884270YmX.LJJIIZ = c878550YdJ;
            c884270YmX.LJJIIZI += c878550YdJ.LIZJ ? 1 : 0;
        }
        if (!c884270YmX.LJII) {
            c884270YmX.LJII = z2;
        }
        if (!c884270YmX.LJII) {
            ((List) c884270YmX.LJIIIIZZ.getValue()).addAll(list);
            ((List) c884270YmX.LJIIIZ.getValue()).addAll(list2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("haven't started data flow page=");
            sbLIZ.append(interfaceC879010Ye3);
            sbLIZ.append(", source=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C309160C9y.LIZ();
            return;
        }
        List listLJLIL = C13LP.LJLIL((Iterable) c884270YmX.LJIIIIZZ.getValue(), list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLIL, 10));
        for (C879540Yeu c879540YeuLIZ : (ArrayList) listLJLIL) {
            C879540Yeu<?> c879540Yeu = c884270YmX.LJIILIIL().get(c879540YeuLIZ.LIZIZ);
            if (c879540Yeu != null) {
                c879540YeuLIZ = C879540Yeu.LIZ(c879540YeuLIZ, c879540Yeu.LIZLLL, c879540Yeu.LJ);
            }
            arrayList.add(c879540YeuLIZ);
        }
        LJIILL(c884270YmX, arrayList, C13LP.LJLIL((Iterable) c884270YmX.LJIIIZ.getValue(), list2), z, str);
    }

    public final void LJJIIJZLJL(C884270YmX c884270YmX, Set<? extends C13IQ<? extends InterfaceC882190YjB>> set, boolean z, Collection<? extends C879540Yeu<?>> collection, String str, boolean z2, boolean z3) {
        List<InterfaceC882190YjB> list;
        InterfaceC884870YnV interfaceC884870YnV;
        InterfaceC1517005wm interfaceC1517005wmLIZLLL;
        InterfaceC884800YnO interfaceC884800YnO;
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            c884690YnD.LIZLLL("decorate_chain", C2097608Jq.LJIIIIZZ(new Pair("source", str), new Pair("size", Integer.valueOf(collection.size()))));
        }
        String str2 = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerDecorateChain size=");
        sbLIZ.append(collection.size());
        sbLIZ.append(", page=");
        sbLIZ.append(c884270YmX.LIZ.getKey());
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str2);
        C884730YnH c884730YnH = c884270YmX.LJIIL;
        if (c884730YnH != null && (list = c884730YnH.LJIIIIZZ) != null) {
            for (InterfaceC882190YjB interfaceC882190YjB : list) {
                try {
                    interfaceC1517005wmLIZLLL = interfaceC882190YjB.LIZLLL();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (z3 && (interfaceC884870YnV = c884270YmX.LJI) != null) {
                        interfaceC884870YnV.LJIILIIL(interfaceC882190YjB.LIZ());
                    }
                    C309160C9y.LIZJ(this.LIZIZ, e);
                }
                if (!(interfaceC1517005wmLIZLLL instanceof C1517705wt) || !C13LP.LJJL(LJIIIZ(), ((C1517705wt) interfaceC1517005wmLIZLLL).LIZ).isEmpty()) {
                    if (!z || (set != null && set.contains(C13LE.LIZ(interfaceC882190YjB.getClass())))) {
                        String str3 = this.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("decorateChain ");
                        sbLIZ2.append(interfaceC882190YjB.getTag());
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C309160C9y.LIZLLL(str3);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Iterator<T> it2 = collection.iterator();
                        while (it2.hasNext()) {
                            interfaceC882190YjB.LIZIZ((C879540Yeu) it2.next(), c884270YmX.LIZ.getKey());
                        }
                        if (z2 && (interfaceC884800YnO = c884270YmX.LJFF) != null) {
                            interfaceC884800YnO.LIZJ(System.currentTimeMillis() - jCurrentTimeMillis, interfaceC882190YjB.LIZ());
                        }
                    }
                }
            }
        }
        for (C879540Yeu<?> c879540Yeu : collection) {
            c884270YmX.LJIILIIL().put(c879540Yeu.LIZIZ, c879540Yeu);
            c884270YmX.LJIIIIZZ().put(c879540Yeu.LIZIZ, c879540Yeu);
        }
        C884690YnD c884690YnD2 = c884270YmX.LJ;
        if (c884690YnD2 != null) {
            c884690YnD2.LIZIZ("decorate_chain", null);
        }
    }
}
