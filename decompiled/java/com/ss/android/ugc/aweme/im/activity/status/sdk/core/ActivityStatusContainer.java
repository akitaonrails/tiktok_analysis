package com.ss.android.ugc.aweme.im.activity.status.sdk.core;

import X.AbstractC595720NYc;
import X.AnonymousClass0956;
import X.C01GW;
import X.C04TB;
import X.C0NX1;
import X.C0NX5;
import X.C0NX7;
import X.C0NX8;
import X.C0NX9;
import X.C0NXA;
import X.C0NXE;
import X.C0NXF;
import X.C0NXH;
import X.C0NXK;
import X.C0NXN;
import X.C0NXP;
import X.C0NXR;
import X.C0NXT;
import X.C0NXU;
import X.C0NXV;
import X.C0NXW;
import X.C0NXX;
import X.C0NY0;
import X.C0NY2;
import X.C0NY4;
import X.C0NY6;
import X.C0NY7;
import X.C0NY8;
import X.C0NY9;
import X.C0NYA;
import X.C0NYE;
import X.C0NYH;
import X.C0NYK;
import X.C0NZ0;
import X.C0NZ1;
import X.C0PEM;
import X.C13BV;
import X.C13LP;
import X.C1864307Rx;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C592050NJz;
import X.C595220NWe;
import X.C595320NWo;
import X.C595330NWp;
import X.C595340NWq;
import X.C595420NWy;
import X.C595450NXb;
import X.C595510NXh;
import X.C595660NXw;
import X.C595680NXy;
import X.C595700NYa;
import X.C595710NYb;
import X.C595740NYe;
import X.EnumC595840NYo;
import X.InterfaceC497601wk;
import X.InterfaceC595670NXx;
import X.InterfaceC595940NYy;
import X.InterfaceC897330ZId;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusDebugToolService;
import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusExternalToolService;
import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS18S0001000_3;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS87S1000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ActivityStatusContainer implements ActivityStatusService, C0NZ1 {
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public String LIZLLL = "";
    public C595510NXh LJ;
    public InterfaceC595670NXx LJFF;

    public final C0NXU LJIIJJI() {
        return C0NY0.LIZ.get(this.LIZLLL);
    }

    public final boolean LJIIL() {
        C595680NXy c595680NXy;
        C0NXX c0nxx;
        C595510NXh c595510NXh = this.LJ;
        return (c595510NXh == null || (c595680NXy = c595510NXh.LIZ) == null || (c0nxx = c595680NXy.LIZ) == null || c0nxx.LJ == null) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService
    public final C595660NXw LIZIZ(AbstractC595720NYc abstractC595720NYc) {
        C0NXU c0nxuLJIIJJI = LJIIJJI();
        if (c0nxuLJIIJJI != null) {
            C0NX1 c0nx1LIZIZ = c0nxuLJIIJJI.LIZIZ();
            c0nx1LIZIZ.getClass();
            if (abstractC595720NYc instanceof C595710NYb) {
                String str = ((C595710NYb) abstractC595720NYc).LIZIZ;
                C0NXK c0nxkLIZLLL = c0nx1LIZIZ.LIZIZ.LIZLLL(str);
                if (c0nxkLIZLLL != null) {
                    return new C595660NXw(str, c0nxkLIZLLL, null, 4);
                }
            } else if (abstractC595720NYc instanceof C595700NYa) {
                C595700NYa c595700NYa = (C595700NYa) abstractC595720NYc;
                return new C595660NXw(c595700NYa.LIZIZ, null, c0nx1LIZIZ.LIZIZ.LJ(c595700NYa.LIZJ), 2);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService
    public final void LJI(AbstractC595720NYc abstractC595720NYc) {
        List<String> listSingletonList;
        C0NXU c0nxuLJIIJJI = LJIIJJI();
        if (c0nxuLJIIJJI != null) {
            if (abstractC595720NYc instanceof C595710NYb) {
                listSingletonList = Collections.singletonList(((C595710NYb) abstractC595720NYc).LIZIZ);
            } else if (abstractC595720NYc instanceof C595700NYa) {
                listSingletonList = ((C595700NYa) abstractC595720NYc).LIZJ;
            } else {
                listSingletonList = C13BV.INSTANCE;
            }
            c0nxuLJIIJJI.LIZIZ().LJ(listSingletonList);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService
    public final void LJII(String str) {
        C0NXU c0nxuLJIIJJI = LJIIJJI();
        if (c0nxuLJIIJJI != null) {
            C0NXR.LIZIZ(c0nxuLJIIJJI, c0nxuLJIIJJI.LIZLLL(), C595320NWo.LIZ((C595330NWp) c0nxuLJIIJJI.LIZJ.getValue()).LJIILL, new AwS87S1000000_2(str, 37));
            C0NX1 c0nx1LIZIZ = c0nxuLJIIJJI.LIZIZ();
            C23250099c.LIZLLL(c0nx1LIZIZ.LJIIL, null, null, new C595420NWy(c0nx1LIZIZ, str, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService
    public final void LJIIIIZZ(String str) {
        C0NXU c0nxuLJIIJJI = LJIIJJI();
        if (c0nxuLJIIJJI != null) {
            C0NXT c0nxtLIZLLL = c0nxuLJIIJJI.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportAdditional ");
            sbLIZ.append(str);
            C0NXR.LIZLLL(c0nxuLJIIJJI, c0nxtLIZLLL, C2188811AlT.LIZIZ(sbLIZ));
            C0NYA c0nya = (C0NYA) c0nxuLJIIJJI.LJ.getValue();
            C0NXT c0nxt = c0nya.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reportAdditional ");
            sbLIZ2.append(str);
            C0NXR.LIZLLL(c0nya, c0nxt, C2188811AlT.LIZIZ(sbLIZ2));
            C23250099c.LIZLLL(c0nya.LJI, null, null, new C0NYE(c0nya, str, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.05Vn, X.099V, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService
    public final void LJIIIZ(C595740NYe c595740NYe) {
        C0NYH c0nyh;
        C0NX9 c0nx9;
        InterfaceC595940NYy interfaceC595940NYy;
        C0NXF c0nxf;
        InterfaceC595670NXx interfaceC595670NXx;
        C0NXE c0nxe;
        C0NXP c0nxp;
        C01GW c01gwLIZ;
        ?? r3;
        ActivityStatusExternalToolServiceImpl activityStatusExternalToolServiceImpl;
        boolean zLJI = MethodIDManager.LJI(196711);
        LJIIZILJ("start init service, register account change listener");
        if (this.LIZIZ.getAndSet(true)) {
            LJIILLIIL("activity status service is initialized already, return");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C0NXW c0nxw = new C0NXW();
        c595740NYe.invoke(c0nxw);
        InterfaceC497601wk interfaceC497601wk = c0nxw.LIZ;
        if (interfaceC497601wk != null && (c0nyh = c0nxw.LIZIZ) != null && (c0nx9 = c0nxw.LIZJ) != null && (interfaceC595940NYy = c0nxw.LIZLLL) != null) {
            C0NY8 c0ny8 = c0nxw.LJ;
            C0NXT c0nxt = c0nxw.LJFF;
            if (c0nxt != null && (c0nxf = c0nxw.LJI) != null && (interfaceC595670NXx = c0nxw.LJII) != null && (c0nxe = c0nxw.LJIIIIZZ) != null && (c0nxp = c0nxw.LJIIIZ) != null) {
                C0NY6 c0ny6 = c0nxw.LJIIJ;
                if (c0ny6 == null || (c01gwLIZ = c0ny6.LIZ()) == null) {
                    c01gwLIZ = new C01GW<C0NXH>() { // from class: X.0NXJ
                        public final C0NXH LL = new C0NXH(0);

                        @Override // X.C01GW
                        public final boolean isInitialized() {
                            return true;
                        }

                        @Override // X.C01GW
                        public final /* bridge */ /* synthetic */ C0NXH getValue() {
                            return this.LL;
                        }
                    };
                }
                C595680NXy c595680NXy = new C595680NXy(new C0NXX(interfaceC497601wk, c0nyh, c0nx9, interfaceC595940NYy, c0ny8, c0nxt, c0nxf, interfaceC595670NXx, c0nxe, c0nxp, c0nxw.LJIIJJI), new C595330NWp(c01gwLIZ));
                LJIIZILJ("init service, register account change listener");
                C595510NXh c595510NXh = new C595510NXh(c595680NXy);
                this.LJ = c595510NXh;
                ActivityStatusExternalToolService.LIZ.getClass();
                ActivityStatusExternalToolService activityStatusExternalToolServiceLIZ = C04TB.LIZ();
                if ((activityStatusExternalToolServiceLIZ instanceof ActivityStatusExternalToolServiceImpl) && (activityStatusExternalToolServiceImpl = (ActivityStatusExternalToolServiceImpl) activityStatusExternalToolServiceLIZ) != null) {
                    activityStatusExternalToolServiceImpl.LIZIZ = c595510NXh;
                }
                ActivityStatusDebugToolService.LIZ.getClass();
                ActivityStatusDebugToolService value = C0NY4.LIZIZ.getValue();
                if ((value instanceof ActivityStatusDebugToolServiceImpl) && value != null) {
                    value.getClass();
                }
                InterfaceC595670NXx interfaceC595670NXx2 = c595680NXy.LIZ.LJII;
                this.LJFF = interfaceC595670NXx2;
                if (interfaceC595670NXx2.isLogin()) {
                    String strLIZ = interfaceC595670NXx2.LIZ();
                    this.LIZLLL = strLIZ;
                    r3 = 0;
                    LJIILJJIL(strLIZ, null, this.LJ);
                } else {
                    r3 = 0;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), r3, r3, new C0NXV(interfaceC595670NXx2, this, r3), 3);
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        LJIILLIIL("activityStatusConfig is null, return");
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService
    public final void LJIIJ(List<? extends C0NY2> list) {
        if (!this.LIZIZ.get()) {
            return;
        }
        C595510NXh c595510NXh = this.LJ;
        if (c595510NXh != null) {
            c595510NXh.LIZLLL = list;
        }
        C0NXU c0nxuLJIIJJI = LJIIJJI();
        if (c0nxuLJIIJJI != null) {
            c0nxuLJIIJJI.LJ();
        }
    }

    public final void LJIILIIL(String str) {
        if (Intrinsics.LJFF(this.LIZLLL, str)) {
            return;
        }
        String str2 = this.LIZLLL;
        this.LIZLLL = str;
        LJIILJJIL(str, str2, this.LJ);
        if (this.LIZJ.get()) {
            LJ("account_login", EnumC595840NYo.ALL);
        }
    }

    public final void LJIILLIIL(String str) {
        if (LJIIL()) {
            LJIILL(6, "[AS][SERVICE]", str);
        }
    }

    public final void LJIIZILJ(String str) {
        if (LJIIL()) {
            LJIILL(4, "[AS][SERVICE]", str);
        }
    }

    @Override // X.C0NZ1
    public final void LIZJ(C0NZ0 c0nz0, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("account change(");
        sbLIZ.append(c0nz0);
        sbLIZ.append(") uid(");
        sbLIZ.append(str);
        sbLIZ.append(')');
        LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0nz0 == C0NZ0.LOGIN) {
            LJIILIIL(str);
            return;
        }
        C0NXU c0nxuRemove = C0NY0.LIZ.remove(str);
        if (c0nxuRemove != null) {
            c0nxuRemove.LJI();
        }
        InterfaceC595670NXx interfaceC595670NXx = this.LJFF;
        if (interfaceC595670NXx == null || interfaceC595670NXx.isLogin()) {
            return;
        }
        LJIIZILJ("logout reset curUid to null");
        this.LIZLLL = "";
    }

    @Override // com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService
    public final void LIZLLL(String str, EnumC595840NYo enumC595840NYo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inactivate service(");
        sbLIZ.append(str);
        sbLIZ.append(')');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (LJIIL()) {
            LJIILL(3, "[AS][SERVICE]", strLIZIZ);
        }
        this.LIZJ.set(false);
        C0NXU c0nxuLJIIJJI = LJIIJJI();
        if (c0nxuLJIIJJI != null) {
            C0NXT c0nxtLIZLLL = c0nxuLJIIJJI.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onInactivated, ability is ");
            sbLIZ2.append(enumC595840NYo);
            C0NXR.LIZLLL(c0nxuLJIIJJI, c0nxtLIZLLL, C2188811AlT.LIZIZ(sbLIZ2));
            if (enumC595840NYo == EnumC595840NYo.FETCH || enumC595840NYo == EnumC595840NYo.ALL) {
                C0NX1 c0nx1LIZIZ = c0nxuLJIIJJI.LIZIZ();
                c0nx1LIZIZ.getClass();
                boolean zLJFF = Intrinsics.LJFF(str, "enter_background");
                if (!C595320NWo.LIZ(c0nx1LIZIZ.LIZJ).LJIJ || !zLJFF) {
                    C592050NJz c592050NJzLJFF = c0nx1LIZIZ.LJFF();
                    c592050NJzLJFF.LJIIJ.set(false);
                    AnonymousClass0956 anonymousClass0956 = c592050NJzLJFF.LJIIJJI;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    AnonymousClass0956 anonymousClass09562 = c592050NJzLJFF.LJIIL;
                    if (anonymousClass09562 != null) {
                        anonymousClass09562.LIZIZ(null);
                    }
                    C0NXR.LIZLLL(c0nx1LIZIZ, c0nx1LIZIZ.LIZ, "cancel polling");
                    AnonymousClass0956 anonymousClass09563 = c0nx1LIZIZ.LJIIJ;
                    if (anonymousClass09563 != null) {
                        anonymousClass09563.LIZIZ(null);
                    }
                    c0nx1LIZIZ.LJIIJ = null;
                }
                C0NXA c0nxa = c0nx1LIZIZ.LIZIZ;
                c0nxa.LJFF.LIZ("activity_status_cache_info", new C1864307Rx(c0nxa.LIZIZ().size(), c0nxa.LJI().size(), c0nxa.LJFF().size()));
                if (Intrinsics.LJFF(str, "turn_setting_off")) {
                    C0NXA c0nxa2 = c0nx1LIZIZ.LIZIZ;
                    synchronized (c0nxa2.LJI) {
                        try {
                            for (String str2 : C13LP.LLIIII(c0nxa2.LIZIZ().keySet())) {
                                C0NX7 c0nx7 = c0nxa2.LIZIZ().get(str2);
                                if (c0nx7 != null) {
                                    c0nxa2.LIZIZ().put(str2, C0NX7.LIZ(c0nx7, 0, 0L, null, C0NX5.STATE_DEFAULT, C0NX8.LIZ(str2), null, 1));
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    c0nxa2.LJI().evictAll();
                    c0nxa2.LJFF().evictAll();
                    Collection<C0NX7> collectionValues = c0nxa2.LIZIZ().values();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        C0NXK c0nxk = ((C0NX7) it2.next()).LJ;
                        if (c0nxk != null) {
                            arrayList.add(c0nxk);
                        }
                    }
                    c0nx1LIZIZ.LJII(arrayList);
                }
                C0NXT c0nxt = c0nx1LIZIZ.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onInactivated(");
                sbLIZ3.append(str);
                sbLIZ3.append(')');
                C0NXR.LIZLLL(c0nx1LIZIZ, c0nxt, C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (enumC595840NYo == EnumC595840NYo.REPORT || enumC595840NYo == EnumC595840NYo.ALL) {
                C0NYA c0nya = (C0NYA) c0nxuLJIIJJI.LJ.getValue();
                C0NXT c0nxt2 = c0nya.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("onInactivated(");
                sbLIZ4.append(str);
                sbLIZ4.append(')');
                C0NXR.LIZLLL(c0nya, c0nxt2, C2188811AlT.LIZIZ(sbLIZ4));
                c0nya.LJ.LIZIZ.set(false);
                c0nya.LIZ(str);
                if (!c0nxuLJIIJJI.LIZIZ.isEmpty()) {
                    ((C0NXN) c0nxuLJIIJJI.LJIIIIZZ.getValue()).LIZ("activity_status_client_info", new AwS588S0100000_9(c0nxuLJIIJJI, 617));
                }
                int size = ((C0NXA) c0nxuLJIIJJI.LJII.getValue()).LIZIZ().size();
                if (c0nxuLJIIJJI.LIZIZ.isEmpty() && size > 0) {
                    ((C0NXN) c0nxuLJIIJJI.LJIIIIZZ.getValue()).LIZ("activity_status_client_leak", new AwS18S0001000_3(size, 3));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService
    public final void LJ(String str, EnumC595840NYo enumC595840NYo) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("activate service(");
        sbLIZ.append(str);
        sbLIZ.append("), ability is ");
        sbLIZ.append(enumC595840NYo);
        LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
        EnumC595840NYo enumC595840NYo2 = EnumC595840NYo.FETCH;
        if (enumC595840NYo != enumC595840NYo2) {
            this.LIZJ.set(true);
        }
        C0NXU c0nxuLJIIJJI = LJIIJJI();
        if (c0nxuLJIIJJI != null) {
            c0nxuLJIIJJI.LJFF(enumC595840NYo);
            C0NXT c0nxtLIZLLL = c0nxuLJIIJJI.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onActivated, ability is ");
            sbLIZ2.append(enumC595840NYo);
            C0NXR.LIZLLL(c0nxuLJIIJJI, c0nxtLIZLLL, C2188811AlT.LIZIZ(sbLIZ2));
            if (enumC595840NYo != enumC595840NYo2 && enumC595840NYo != EnumC595840NYo.ALL) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C0NX1 c0nx1LIZIZ = c0nxuLJIIJJI.LIZIZ();
                c0nx1LIZIZ.getClass();
                boolean zLJFF = Intrinsics.LJFF(str, "enter_foreground");
                if (!C595320NWo.LIZ(c0nx1LIZIZ.LIZJ).LJIJ || !zLJFF) {
                    c0nx1LIZIZ.LJFF().LIZ();
                    c0nx1LIZIZ.LJIIIIZZ();
                }
                C0NXT c0nxt = c0nx1LIZIZ.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onActivated(");
                sbLIZ3.append(str);
                sbLIZ3.append(')');
                C0NXR.LIZLLL(c0nx1LIZIZ, c0nxt, C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (enumC595840NYo == EnumC595840NYo.REPORT || enumC595840NYo == EnumC595840NYo.ALL) {
                C0NYA c0nya = (C0NYA) c0nxuLJIIJJI.LJ.getValue();
                C0NXT c0nxt2 = c0nya.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("onActivated(");
                sbLIZ4.append(str);
                sbLIZ4.append(')');
                C0NXR.LIZLLL(c0nya, c0nxt2, C2188811AlT.LIZIZ(sbLIZ4));
                c0nya.LJ.LIZIZ.set(true);
                AnonymousClass0956 anonymousClass0956 = c0nya.LJFF;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C0NXT c0nxt3 = c0nya.LIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("start polling (");
                sbLIZ5.append(str);
                sbLIZ5.append(')');
                C0NXR.LIZLLL(c0nya, c0nxt3, C2188811AlT.LIZIZ(sbLIZ5));
                c0nya.LJFF = C23250099c.LIZLLL(c0nya.LJI, null, null, new C0NY9(c0nya, str, null), 3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService
    public final void LIZ(Map<String, C0NXK> map, C595220NWe c595220NWe, String str) {
        C0NXU c0nxuLJIIJJI = LJIIJJI();
        if (c0nxuLJIIJJI != null) {
            C0NXT c0nxtLIZLLL = c0nxuLJIIJJI.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateExternalCache map(");
            sbLIZ.append(map.size());
            sbLIZ.append(") source(");
            sbLIZ.append(str);
            sbLIZ.append(')');
            C0NXR.LIZLLL(c0nxuLJIIJJI, c0nxtLIZLLL, C2188811AlT.LIZIZ(sbLIZ));
            ((C0NXA) c0nxuLJIIJJI.LJII.getValue()).LJII(C13LP.LLIIII(((LinkedHashMap) map).values()), false, c595220NWe, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService
    public final InterfaceC897330ZId LJFF(String str, String str2, boolean z) {
        if (!Intrinsics.LJFF(str2, this.LIZLLL)) {
            LJIILIIL(str2);
        }
        C0NXU c0nxuLJIIJJI = LJIIJJI();
        if (c0nxuLJIIJJI != null) {
            if (str.length() == 0) {
                c0nxuLJIIJJI.LIZ(c0nxuLJIIJJI.LIZLLL(), "createActivityStatusClient, scene is empty, can't create", null);
            } else {
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append('_');
                    sbLIZ.append(c0nxuLJIIJJI.LJIIJ.incrementAndGet());
                    str = C2188811AlT.LIZIZ(sbLIZ);
                }
                C0NXT c0nxtLIZLLL = c0nxuLJIIJJI.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("createActivityStatusClient(");
                sbLIZ2.append(str);
                sbLIZ2.append(") existing(");
                sbLIZ2.append(c0nxuLJIIJJI.LIZIZ.size());
                sbLIZ2.append(')');
                C0NXR.LIZLLL(c0nxuLJIIJJI, c0nxtLIZLLL, C2188811AlT.LIZIZ(sbLIZ2));
                ConcurrentHashMap<String, C0NYK> concurrentHashMap = c0nxuLJIIJJI.LIZIZ;
                C0NYK c0nyk = concurrentHashMap.get(str);
                if (c0nyk == null) {
                    C595450NXb c595450NXb = c0nxuLJIIJJI.LIZ;
                    c0nyk = new C0NYK(str, c595450NXb, c595450NXb.LIZ.LIZ.LIZ.LIZ, new C595340NWq(c0nxuLJIIJJI, str));
                    C0NYK c0nykPutIfAbsent = concurrentHashMap.putIfAbsent(str, c0nyk);
                    if (c0nykPutIfAbsent != null) {
                        c0nyk = c0nykPutIfAbsent;
                    }
                }
                return c0nyk;
            }
        }
        return null;
    }

    public final synchronized void LJIILJJIL(String str, String str2, C595510NXh c595510NXh) {
        C0NXU c0nxuRemove;
        if (str != null) {
            if (str.length() != 0) {
                ConcurrentHashMap<String, C0NXU> concurrentHashMap = C0NY0.LIZ;
                if (concurrentHashMap.get(str) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("create instance(");
                    sbLIZ.append(str);
                    sbLIZ.append("), it's created already, return");
                    LJIILLIIL(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                if (c595510NXh == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("create instance(");
                    sbLIZ2.append(str);
                    sbLIZ2.append("), service hasn't been initialized yet, return");
                    LJIILLIIL(C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("create instance(");
                sbLIZ3.append(str);
                sbLIZ3.append(')');
                LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ3));
                if (str2 != null && (c0nxuRemove = concurrentHashMap.remove(str2)) != null) {
                    c0nxuRemove.LJI();
                }
                C595450NXb c595450NXb = new C595450NXb(c595510NXh, new C0NY7(str));
                C0NXU c0nxu = new C0NXU(c595450NXb);
                concurrentHashMap.put(str, c0nxu);
                if (concurrentHashMap.size() > 2) {
                    ((C0NXN) c595450NXb.LJIIIIZZ.getValue()).LIZ("activity_status_instance_info", AFwS240S0000000_9.get$arr$(109));
                }
                if (this.LIZJ.get()) {
                    c0nxu.LJFF(EnumC595840NYo.ALL);
                    c0nxu.LJ();
                }
                return;
            }
        }
        LJIILLIIL("create instance, null or empty uid, return");
    }

    public final void LJIILL(int i, String str, String str2) {
        C595680NXy c595680NXy;
        C0NXX c0nxx;
        C0NY8 c0ny8;
        C595510NXh c595510NXh = this.LJ;
        if (c595510NXh != null && (c595680NXy = c595510NXh.LIZ) != null && (c0nxx = c595680NXy.LIZ) != null && (c0ny8 = c0nxx.LJ) != null) {
            c0ny8.LIZ(i, str, str2);
        }
    }
}
