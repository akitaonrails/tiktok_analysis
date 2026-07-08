package com.ss.android.ugc.aweme.im.streak.impl.pet;

import X.AbstractC1549150qPp;
import X.C01GW;
import X.C066K;
import X.C066Y;
import X.C06BV;
import X.C06C6;
import X.C06C8;
import X.C06CF;
import X.C06CL;
import X.C06D7;
import X.C06DQ;
import X.C06DV;
import X.C06G9;
import X.C06H2;
import X.C06I0;
import X.C06I4;
import X.C06I9;
import X.C06LY;
import X.C08CX;
import X.C098200Yq;
import X.C0I0B;
import X.C0IBF;
import X.C0Y3A;
import X.C0Y7K;
import X.C0Y8T;
import X.C0YSQ;
import X.C101000Zs;
import X.C1078204Jo;
import X.C123100dR;
import X.C1336205Ku;
import X.C13LE;
import X.C1400340mXo;
import X.C1458605nM;
import X.C1500605u8;
import X.C1500705u9;
import X.C1514305wL;
import X.C1514405wM;
import X.C1514505wN;
import X.C1515205wU;
import X.C15488064o;
import X.C15491064r;
import X.C15493064t;
import X.C15496064w;
import X.C15528066c;
import X.C1567806Bw;
import X.C1568306Cb;
import X.C1569106Cj;
import X.C1569406Cm;
import X.C1569506Cn;
import X.C1569606Co;
import X.C1569706Cp;
import X.C1569906Cr;
import X.C1570006Cs;
import X.C1570106Ct;
import X.C1571306Df;
import X.C1572806Du;
import X.C1575806Ey;
import X.C1576506Ff;
import X.C1576706Fh;
import X.C1582706Hp;
import X.C1586906Jf;
import X.C1590806Ks;
import X.C1590906Kt;
import X.C1598406Nq;
import X.C1598806Nu;
import X.C1697810uHb;
import X.C1807670x8n;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C1CA0;
import X.C1CA3;
import X.C1CA6;
import X.C1CAB;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2272701DxU;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import X.C894660Z7w;
import X.EnumC1514605wO;
import X.EnumC868890Y6t;
import X.InterfaceC1493505sz;
import X.InterfaceC1583506Hx;
import X.InterfaceC876950Yaj;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMServiceBridgeApi;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetEventService;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetAssem;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetWidgetAssem;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakWheeDriveTrafficAssem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetService implements IStreakPetService {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1078204Jo());
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZJ = C1697810uHb.LJIIJJI(C06CL.class, C1568306Cb.class, C06D7.class, C06DQ.class, C06DV.class);
    public final C19719912Dl LIZLLL = C13LE.LIZ(StreakPetAssem.class);
    public final C19719912Dl LJ = C13LE.LIZ(StreakPetWidgetAssem.class);
    public final C19719912Dl LJFF = C13LE.LIZ(StreakWheeDriveTrafficAssem.class);

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final IStreakPetEventService LJJII() {
        return (IStreakPetEventService) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJJIJIIJI() {
        C06I0.LIZIZ.getClass();
        if (C06I0.LJFF.getAndSet(true)) {
            return;
        }
        C23250099c.LIZLLL(C06I0.LJ, null, null, new C06I4(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final C19719912Dl LJ() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final C19719912Dl LJFF() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final C19719912Dl LJIIIIZZ() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJJIJIL() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final boolean LIZIZ(String str) {
        IStreakService.LJJIIZ.getClass();
        if (C06LY.LIZ().G(str)) {
            return false;
        }
        IStreakPetService.LIZ.getClass();
        return C1586906Jf.LIZ().LJJIIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final StreakPetData LIZJ(String str) {
        C06C6.LIZIZ.getClass();
        return C06C6.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final boolean LJII(String str) {
        C1570106Ct.LJ.getClass();
        return C1570106Ct.LJI.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJIIIZ(String str) {
        C066Y c066y = C066Y.LIZIZ;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c066y.getClass();
        C23250099c.LIZLLL(C066Y.LJ, null, null, new C1500605u8(interfaceC1493505szLIZIZ, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJIIL(C1598806Nu c1598806Nu) {
        C1582706Hp.LJII.getClass();
        C1582706Hp c1582706Hp = C1582706Hp.LJIIIZ;
        synchronized (c1582706Hp.LJ) {
            try {
                List<InterfaceC1583506Hx> list = c1582706Hp.LJ;
                if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
                    ((ArrayList) c1582706Hp.LJ).add(c1598806Nu);
                } else {
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (it2.hasNext()) {
                        if (((InterfaceC1583506Hx) it2.next()) == c1598806Nu) {
                            break;
                        }
                    }
                    ((ArrayList) c1582706Hp.LJ).add(c1598806Nu);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final boolean LJIILIIL(String str) {
        IStreakPetService.LIZ.getClass();
        return C1586906Jf.LIZ().LJIILLIIL(str);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJIILL(BusinessCommandMessage businessCommandMessage) {
        Object c098200Yq;
        C1CAB c1cabDecode;
        C1569106Cj.LJ.getClass();
        C1569106Cj c1569106Cj = C1569106Cj.LJI;
        c1569106Cj.getClass();
        if (businessCommandMessage.getContentPb() == null) {
            C1590806Ks.LIZIZ("onReceivePetStatusAction contentPb is null");
            Function1<C0Y7K, Unit> onResult = businessCommandMessage.getOnResult();
            if (onResult != null) {
                onResult.invoke(new C0Y3A(EnumC868890Y6t.INVALID_PARAMETER, "onReceivePetStatusAction contentPb is null", (Integer) null, 12));
                return;
            }
            return;
        }
        try {
            StatusMessage statusMessage = businessCommandMessage.getStatusMessage();
            if (statusMessage != null && (c1cabDecode = C1CAB.ADAPTER.decode(statusMessage.value)) != null) {
                c098200Yq = c1cabDecode.streak_pet_cmd;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1CA6 c1ca6 = (C1CA6) c098200Yq;
        if (c1ca6 == null) {
            C1590806Ks.LIZIZ("onReceivePetStatusAction MessageContent decode error");
            Function1<C0Y7K, Unit> onResult2 = businessCommandMessage.getOnResult();
            if (onResult2 == null) {
                return;
            }
            onResult2.invoke(new C0Y3A(EnumC868890Y6t.PARSE_FAILURE, "onReceivePetStatusAction MessageContent decode error", (Integer) null, 12));
            return;
        }
        boolean z = C1590806Ks.LIZ;
        C1590806Ks.LIZ("onReceivePetStatusAction " + c1ca6 + " logid=" + businessCommandMessage.getLogId());
        c1569106Cj.LJI(businessCommandMessage, null, c1ca6, C06CF.LJIIJJI);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final boolean LJIILLIIL(String str) {
        C1575806Ey.LIZJ.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str);
        C06C6.LIZIZ.getClass();
        return C06BV.LIZIZ(streakDataLJIIIIZZ, C06C6.LIZIZ(str), str);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final boolean LJIIZILJ(String str) {
        C06C6.LIZIZ.getClass();
        StreakPetData streakPetDataLIZIZ = C06C6.LIZIZ(str);
        if (streakPetDataLIZIZ != null) {
            return C1571306Df.LIZLLL(streakPetDataLIZIZ);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final boolean LJIJ(String str) {
        C1582706Hp.LJII.getClass();
        return C1582706Hp.LJIIIZ.LIZIZ(str, "key_streak_pet_exp_value");
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final String LJIJI(String str) {
        Boolean boolValueOf;
        C1575806Ey.LIZJ.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str);
        if (streakDataLJIIIIZZ != null) {
            boolValueOf = Boolean.valueOf(C1567806Bw.LJFF(streakDataLJIIIIZZ));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return "streak_pet";
        }
        return "streak_egg";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(com.bytedance.im.core.common.statusmsg.BusinessCommandMessage r8) {
        /*
            r7 = this;
            X.06Ck r0 = X.C1569106Cj.LJ
            r0.getClass()
            X.06Cj r4 = X.C1569106Cj.LJI
            r4.getClass()
            okio.ByteString r0 = r8.getContentPb()
            r6 = 12
            r5 = 0
            if (r0 != 0) goto L29
            java.lang.String r3 = "onReceiveCmdMessage contentPb is null"
            X.C1590806Ks.LIZIZ(r3)
            kotlin.jvm.functions.Function1 r2 = r8.getOnResult()
            if (r2 == 0) goto L28
            X.0Y3A r1 = new X.0Y3A
            X.0Y6t r0 = X.EnumC868890Y6t.INVALID_PARAMETER
            r1.<init>(r0, r3, r5, r6)
            r2.invoke(r1)
        L28:
            return
        L29:
            com.bytedance.im.core.proto.status_message.StatusMessage r0 = r8.getStatusMessage()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L3c
            com.squareup.wire.ProtoAdapter<X.1CPY> r1 = X.C1CPY.ADAPTER     // Catch: java.lang.Throwable -> L66
            okio.ByteString r0 = r0.value     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r1.decode(r0)     // Catch: java.lang.Throwable -> L66
            X.1CPY r0 = (X.C1CPY) r0     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = r0.scene     // Catch: java.lang.Throwable -> L66
            goto L3e
        L3c:
            r3 = r5
            goto L4e
        L3e:
            com.squareup.wire.ProtoAdapter<X.1CA9> r1 = X.C1CA9.ADAPTER     // Catch: java.lang.Throwable -> L64
            okio.ByteString r0 = r0.streak_pet_message_content     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = r1.decode(r0)     // Catch: java.lang.Throwable -> L64
            X.1CA9 r0 = (X.C1CA9) r0     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L4e
            X.1CA6 r2 = r0.streak_pet_cmd     // Catch: java.lang.Throwable -> L64
            if (r2 != 0) goto L5e
        L4e:
            com.squareup.wire.ProtoAdapter<X.1Coy> r1 = X.C2241941Coy.ADAPTER     // Catch: java.lang.Throwable -> L64
            okio.ByteString r0 = r8.getContentPb()     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = r1.decode(r0)     // Catch: java.lang.Throwable -> L64
            X.1Coy r0 = (X.C2241941Coy) r0     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L62
            X.1CA6 r2 = r0.streak_pet_cmd     // Catch: java.lang.Throwable -> L64
        L5e:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L64
            goto L73
        L62:
            r2 = r5
            goto L5e
        L64:
            r0 = move-exception
            goto L68
        L66:
            r0 = move-exception
            r3 = r5
        L68:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L73:
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L7a
            r2 = r5
        L7a:
            X.1CA6 r2 = (X.C1CA6) r2
            if (r2 != 0) goto L94
            java.lang.String r3 = "onReceiveCmdMessage MessageContent decode error"
            X.C1590806Ks.LIZIZ(r3)
            kotlin.jvm.functions.Function1 r2 = r8.getOnResult()
            if (r2 == 0) goto L28
            X.0Y3A r1 = new X.0Y3A
            X.0Y6t r0 = X.EnumC868890Y6t.PARSE_FAILURE
            r1.<init>(r0, r3, r5, r6)
            r2.invoke(r1)
            return
        L94:
            boolean r0 = X.C1590806Ks.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onReceiveCmdMessage "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " logid="
            r1.append(r0)
            java.lang.String r0 = r8.getLogId()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1590806Ks.LIZ(r0)
            X.06CF r0 = X.C06CF.LJIIJ
            r4.LJI(r8, r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.pet.StreakPetService.LJIJJ(com.bytedance.im.core.common.statusmsg.BusinessCommandMessage):void");
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJIJJLI(C1598806Nu c1598806Nu) {
        C1582706Hp.LJII.getClass();
        C1582706Hp c1582706Hp = C1582706Hp.LJIIIZ;
        synchronized (c1582706Hp.LJ) {
            try {
                ((ArrayList) c1582706Hp.LJ).remove(c1598806Nu);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJIL(EnumC1514605wO enumC1514605wO) {
        C066Y.LIZIZ.getClass();
        Map<String, Set<String>> map = C066Y.LIZLLL;
        synchronized (map) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(enumC1514605wO.getValue());
                sbLIZ.append("_1");
                map.remove(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final boolean LJJ(String str) {
        IStreakService.LJJIIZ.getClass();
        if (!C06LY.LIZ().P(str, false)) {
            if (!C06LY.LIZ().G(str)) {
                return false;
            }
            IStreakPetService.LIZ.getClass();
            if (!C1586906Jf.LIZ().LJIIZILJ(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final boolean LJJI(String str) {
        ByteString bizExt;
        Object c098200Yq;
        Object c098200Yq2;
        C06C6.LIZIZ.getClass();
        StreakPetData streakPetDataLIZIZ = C06C6.LIZIZ(str);
        if ((streakPetDataLIZIZ != null && C1571306Df.LJII(streakPetDataLIZIZ)) || C1571306Df.LJ(streakPetDataLIZIZ)) {
            return true;
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ == null || (bizExt = c0y8tLIZ.getBizExt()) == null) {
            return false;
        }
        Object obj = null;
        try {
            C2272701DxU c2272701DxUDecode = C2272701DxU.ADAPTER.decode(bizExt);
            if (c2272701DxUDecode != null) {
                c098200Yq = c2272701DxUDecode.group_streak_pet_status;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        try {
            C2272701DxU c2272701DxUDecode2 = C2272701DxU.ADAPTER.decode(bizExt);
            if (c2272701DxUDecode2 != null) {
                c098200Yq2 = c2272701DxUDecode2.group_streak_egg_entrance_status;
            } else {
                c098200Yq2 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        C0IBF c0ibf = C0IBF.FEATURE_STATUS_SHOW;
        if (c098200Yq != c0ibf && obj != c0ibf) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJJIII(String str) {
        C1570106Ct.LJ.getClass();
        C1570106Ct c1570106Ct = C1570106Ct.LJI;
        C23250099c.LIZLLL(c1570106Ct.LIZIZ, null, null, new C1569906Cr(c1570106Ct, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJJIIJ(BusinessCommandMessage businessCommandMessage) {
        C1CA3 c098200Yq;
        C1569106Cj.LJ.getClass();
        C1569106Cj.LJI.getClass();
        if (((Boolean) C101000Zs.LIZ.getValue()).booleanValue()) {
            if (businessCommandMessage.getContentPb() == null) {
                C1590806Ks.LIZIZ("onReceivePetAction contentPb is null");
                Function1<C0Y7K, Unit> onResult = businessCommandMessage.getOnResult();
                if (onResult != null) {
                    onResult.invoke(new C0Y3A(EnumC868890Y6t.INVALID_PARAMETER, "onReceivePetAction contentPb is null", (Integer) null, 12));
                    return;
                }
                return;
            }
            try {
                StatusMessage statusMessage = businessCommandMessage.getStatusMessage();
                if (statusMessage != null) {
                    c098200Yq = C1CA3.ADAPTER.decode(statusMessage.value);
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C1CA3 c1ca3 = (C1CA3) c098200Yq;
            if (c1ca3 != null) {
                List<C1CA0> list = c1ca3.action_infos;
                String str = c1ca3.data_version;
                if (list != null) {
                    boolean z = C1590806Ks.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onReceivePetAction ");
                    sbLIZ.append(list);
                    sbLIZ.append(" logid=");
                    sbLIZ.append(businessCommandMessage.getLogId());
                    C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    C1572806Du.LL.y2(businessCommandMessage.getConversationId(), str, list);
                    return;
                }
            }
            C1590806Ks.LIZIZ("onReceivePetAction MessageContent decode error or null");
            Function1<C0Y7K, Unit> onResult2 = businessCommandMessage.getOnResult();
            if (onResult2 == null) {
                return;
            }
            onResult2.invoke(new C0Y3A(EnumC868890Y6t.MISSING_ENTITY_OR_VALUE, "onReceivePetAction MessageContent decode error or null", (Integer) null, 12));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJJIIJZLJL(C06C8 c06c8) {
        C06C6.LIZIZ.getClass();
        C06C6.LIZLLL(c06c8);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final boolean LJJIIZ(String str) {
        C1582706Hp.LJII.getClass();
        return C1582706Hp.LJIIIZ.LIZIZ(str, "key_streak_pet_hatching_exp_value");
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJJIIZI(String str) {
        C1570106Ct.LJ.getClass();
        C1570106Ct c1570106Ct = C1570106Ct.LJI;
        C23250099c.LIZLLL(c1570106Ct.LIZIZ, null, null, new C1570006Cs(c1570106Ct, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJJIJIIJIL(C06C8 c06c8) {
        C06C6.LIZIZ.getClass();
        C06C6.LJ(c06c8);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJI(int i, String str) {
        C066Y c066y = C066Y.LIZIZ;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c066y.getClass();
        C23250099c.LIZLLL(C066Y.LJ, null, null, new C1514405wM(interfaceC1493505szLIZIZ, "action_bar", i, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJIIJ(C19EG c19eg, Bundle bundle) {
        C15493064t.LIZIZ.getClass();
        String string = bundle.getString("streak_flow_dialog");
        if (string != null) {
            int iHashCode = string.hashCode();
            String str = "";
            if (iHashCode != -1774218603) {
                if (iHashCode != -1325103633) {
                    if (iHashCode == 2036294275 && string.equals("streak_expired_dialog")) {
                        C1500705u9.LIZIZ(C1500705u9.LIZIZ, "inbox_expired");
                        C1569406Cm c1569406Cm = C1569406Cm.LIZIZ;
                        c1569406Cm.getClass();
                        C1569606Co c1569606Co = C1569406Cm.LIZLLL;
                        C1598406Nq c1598406Nq = c1569406Cm.LIZ;
                        if (c1598406Nq == null) {
                            synchronized (c1569406Cm) {
                                c1598406Nq = c1569406Cm.LIZ;
                                if (c1598406Nq == null) {
                                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                                    c1569406Cm.LIZ = c1598406Nq;
                                }
                            }
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(c1598406Nq.LIZIZ), null, null, new C06I9(c19eg, c1569606Co, null), 3);
                        return;
                    }
                    return;
                }
                if (string.equals("streak_error_toast")) {
                    String string2 = bundle.getString("streak_accept_fail_error_msg");
                    if (string2 != null) {
                        str = string2;
                    }
                    C15491064r.LIZIZ.getClass();
                    C23250099c.LIZLLL(C15491064r.LIZLLL, null, null, new C1515205wU(str, null), 3);
                    return;
                }
                return;
            }
            if (string.equals("streak_follow_dialog")) {
                String string3 = bundle.getString("streak_invite_id");
                if (string3 == null) {
                    string3 = "";
                }
                String string4 = bundle.getString("streak_uniq_id");
                if (string4 == null) {
                    string4 = "";
                }
                String string5 = bundle.getString("streak_user_name");
                if (string5 == null) {
                    string5 = "";
                }
                String string6 = bundle.getString("streak_target_uid");
                if (string6 == null) {
                    string6 = "";
                }
                String string7 = bundle.getString("streak_target_sec_uid");
                if (string7 == null) {
                    string7 = "";
                }
                String string8 = bundle.getString("streak_avatar_url");
                if (string8 == null) {
                    string8 = "";
                }
                String string9 = bundle.getString("streak_egg_url");
                if (string9 == null) {
                    string9 = "";
                }
                C1500705u9.LIZIZ(C1500705u9.LIZIZ, "inbox_follow");
                if (C123100dR.LIZ(string6) && C123100dR.LIZ(string8) && C123100dR.LIZ(string5) && C123100dR.LIZ(string9) && C123100dR.LIZ(string7)) {
                    C15496064w c15496064w = new C15496064w(string3, string4, string6, string7, string8, string5, string9);
                    String strLIZLLL = C1336205Ku.LIZ(false).getImUserService().LIZLLL(string6);
                    if (strLIZLLL != null) {
                        str = strLIZLLL;
                    }
                    C0I0B.LJFF.LIZJ();
                    C1569406Cm.LIZIZ.LIZ(c19eg, new C1569506Cn(str, C894660Z7w.LIZ().getResources().getString(2131831742, string5), string5, string6, string7, string8, string9, new C1569706Cp(str, c19eg, c15496064w)));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJIIJJI(int i, String str) {
        C066Y c066y = C066Y.LIZIZ;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c066y.getClass();
        C23250099c.LIZLLL(C066Y.LJ, null, null, new C1514305wL(interfaceC1493505szLIZIZ, "action_bar", i, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJIILJJIL(String str, String str2) {
        C066K c066k = C066K.LIZIZ;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c066k.getClass();
        C23250099c.LIZLLL(C066K.LIZLLL, null, null, new C15528066c(interfaceC1493505szLIZIZ, str, C1567806Bw.LIZIZ(str), str2, null), 3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1520305xJ b(X.C0Y8T r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.pet.StreakPetService.b(X.0Y8T, java.lang.String):X.05xJ");
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJJIFFI(C19EG c19eg, String str, String str2, String str3) {
        C15493064t.LIZIZ.getClass();
        C1500705u9.LIZIZ(C1500705u9.LIZIZ, "app");
        if (((C1400340mXo) C0I0B.LJFF.LIZ()).isLogin()) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str3);
            if (lLJIILIIL != null && lLJIILIIL.longValue() >= C1567806Bw.LJI()) {
                C23250099c.LIZLLL(C15493064t.LIZLLL, null, null, new C1458605nM(c19eg, str, str2, null), 3);
                return;
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("streak_flow_dialog", "streak_expired_dialog", bundle);
            C1590906Kt.LIZ("enterInboxWthStreakExpiredDialog");
            IMServiceBridgeApi.LIZ.getClass();
            IMServiceBridgeApi iMServiceBridgeApiLIZ = C15488064o.LIZ();
            if (iMServiceBridgeApiLIZ == null) {
                return;
            }
            iMServiceBridgeApiLIZ.LIZJ(c19eg, bundle);
            return;
        }
        C15493064t.LIZ(c19eg, null);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LJJIJ(String str, String str2, EnumC1514605wO enumC1514605wO, String str3) {
        C066Y.LIZIZ.getClass();
        C23250099c.LIZLLL(C066Y.LJ, null, null, new C1514505wN(enumC1514605wO, str2, str3, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LIZ(Map map, String str, C08CX c08cx, StreakData streakData, StreakPetData streakPetData) {
        C066Y.LIZIZ.getClass();
        C066Y.LIZIZ(map, str, c08cx, streakData, streakPetData);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService
    public final void LIZLLL(Activity activity, C06G9 c06g9, String str, String str2, String str3, C06H2 c06h2, String str4, String str5) {
        C1576506Ff c1576506Ff = C1576506Ff.LIZIZ;
        if (activity == null) {
            return;
        }
        C1576706Fh c1576706Fh = new C1576706Fh(null, str3, c06h2, str2, str4, null, null, str5, 481);
        c1576506Ff.getClass();
        C1576506Ff.LIZ(activity, c06g9, str, null, c1576706Fh);
    }
}
