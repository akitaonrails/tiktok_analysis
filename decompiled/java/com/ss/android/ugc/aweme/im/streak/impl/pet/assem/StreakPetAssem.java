package com.ss.android.ugc.aweme.im.streak.impl.pet.assem;

import X.AbstractC738140SxQ;
import X.AnonymousClass0672;
import X.AnonymousClass0674;
import X.C01GW;
import X.C06BE;
import X.C06BH;
import X.C06C6;
import X.C06C8;
import X.C06C9;
import X.C06CA;
import X.C06CF;
import X.C06HT;
import X.C06I0;
import X.C06I5;
import X.C13LE;
import X.C15549066x;
import X.C1559260qg8;
import X.C1569106Cj;
import X.C1572106Dn;
import X.C1572306Dp;
import X.C1572506Dr;
import X.C1572606Ds;
import X.C1572806Du;
import X.C1574906Ep;
import X.C1576206Fc;
import X.C1598406Nq;
import X.C1CA0;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C723580SZw;
import X.EnumC15548066w;
import X.InterfaceC1573006Dw;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetAssem extends AbstractC738140SxQ implements C06C8, C06BH, InterfaceC1573006Dw {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 587));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 590));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 589));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 588));
    public volatile C1598406Nq LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StreakPetAssem.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1573006Dw
    public final void Hf(StreakPetData streakPetData, StreakPetData streakPetData2, long j, boolean z, C06CF c06cf, String str) {
    }

    @Override // X.InterfaceC1573006Dw
    public final void LLLIILIL(C1574906Ep c1574906Ep) {
    }

    @Override // X.InterfaceC1573006Dw
    public final void LLLJIL(String str) {
    }

    @Override // X.InterfaceC1573006Dw
    public final void Oh(StreakPetData streakPetData) {
    }

    @Override // X.C06C8
    public final void Ro1(String str) {
    }

    @Override // X.InterfaceC1573006Dw
    public final void Z7(StreakPetData streakPetData) {
    }

    @Override // X.InterfaceC1573006Dw
    public final void de(StreakPetData streakPetData) {
    }

    @Override // X.C06BH
    public final void ec(StreakData streakData, String str) {
    }

    @Override // X.InterfaceC1573006Dw
    public final void g(String str) {
    }

    @Override // X.InterfaceC1573006Dw
    public final void init() {
    }

    @Override // X.InterfaceC1573006Dw
    public final void k9(StreakPetData streakPetData) {
    }

    @Override // X.InterfaceC1573006Dw
    public final void ne(StreakPetData streakPetData) {
    }

    @Override // X.InterfaceC1573006Dw
    public final void nm(String str, String str2, String str3, boolean z, long j, long j2) {
    }

    @Override // X.InterfaceC1573006Dw
    public final void uk(StreakPetData streakPetData) {
    }

    @Override // X.C06C8
    public final void wK0(String str, StreakExtension streakExtension, StreakPetData streakPetData) {
    }

    @Override // X.InterfaceC1573006Dw
    public final void y2(String str, String str2, List list) {
    }

    public final String bo() {
        SessionInfo sessionInfo;
        String conversationId;
        C457780HxI c457780HxI = (C457780HxI) this.LL.getValue();
        return (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null || (conversationId = sessionInfo.getConversationId()) == null) ? "" : conversationId;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        boolean zLJI = MethodIDManager.LJI(72022);
        super.onCreate();
        C1572806Du.LLILLJJLI.add(this);
        AnonymousClass0674 anonymousClass0674 = (AnonymousClass0674) this.LLILLL.getValue();
        C23250099c.LIZLLL(anonymousClass0674.LIZLLL, null, null, new AnonymousClass0672(anonymousClass0674, null), 3);
        C06I0.LIZIZ.getClass();
        if (!C06I0.LJII.getAndSet(true)) {
            C23250099c.LIZLLL(C06I0.LJ, null, null, new C06I5(null), 3);
        }
        C06C6.LIZIZ.getClass();
        C06C6.LIZLLL(this);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1572106Dn(this, null), 3);
        C06BE.LLILLJJLI.add(this);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1572806Du c1572806Du = C1572806Du.LL;
        C1572806Du.LLILLJJLI.remove(this);
        c1572806Du.ne(null);
        C06C6.LIZIZ.getClass();
        C06C6.LJ(this);
        C06BE.LLILLJJLI.remove(this);
        ((ConcurrentHashMap) C06HT.LL).remove(bo());
    }

    @Override // X.InterfaceC1573006Dw
    public final void Q1(StreakPetData streakPetData, String str, List<C1CA0> list) {
        if (list != null) {
            Iterator<C1CA0> it2 = list.iterator();
            while (it2.hasNext()) {
                EnumC15548066w enumC15548066w = it2.next().action_type;
                if (enumC15548066w != null && C15549066x.LIZ[enumC15548066w.ordinal()] == 1) {
                    AnonymousClass0674 anonymousClass0674 = (AnonymousClass0674) this.LLILLL.getValue();
                    C06CA c06ca = new C06CA() { // from class: X.06Dq
                        @Override // X.C06CA
                        public final void LIZ(StreakPetData streakPetData2, boolean z) {
                        }

                        @Override // X.C06CA
                        public final void onFailure() {
                        }
                    };
                    anonymousClass0674.getClass();
                    C1569106Cj.LJ.getClass();
                    C1569106Cj c1569106Cj = C1569106Cj.LJI;
                    C23250099c.LIZLLL(c1569106Cj.LIZ, null, null, new C06C9("pet_status_msg", anonymousClass0674.LIZ, c1569106Cj, "", c06ca, null), 3);
                }
            }
        }
    }

    @Override // X.C06C8
    public final void SI2(String str, StreakPetData streakPetData, StreakPetData streakPetData2) {
        C1572606Ds next;
        if (!Intrinsics.LJFF(str, bo())) {
            return;
        }
        C06I0.LIZIZ.getClass();
        C06I0.LIZIZ(streakPetData2);
        C1576206Fc c1576206FcLIZ = C1572506Dr.LIZ();
        String strBo = bo();
        synchronized (c1576206FcLIZ.LIZJ) {
            try {
                Iterator<C1572606Ds> it2 = c1576206FcLIZ.LJ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        C1572606Ds c1572606Ds = next;
                        if (Intrinsics.LJFF(c1572606Ds.LIZ, strBo) && C1572306Dp.LIZ(c1572606Ds.LIZJ)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C1572606Ds c1572606Ds2 = next;
                if (c1572606Ds2 != null) {
                    c1572606Ds2.LIZIZ = StreakPetData.LIZ(streakPetData2, false, null, false, null, null, 524287);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
