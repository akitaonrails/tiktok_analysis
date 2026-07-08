package com.ss.android.ugc.aweme.im.strategy;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0CCZ;
import X.C0I0B;
import X.C0PEM;
import X.C0VZ0;
import X.C1400340mXo;
import X.C2296808zG;
import X.C23250099c;
import X.C260700AJo;
import X.C260720AJq;
import X.C452501pT;
import X.C894660Z7w;
import X.C909350Zlt;
import X.C909400Zly;
import X.C909410Zlz;
import X.C909420Zm0;
import X.C909570ZmF;
import X.C909610ZmJ;
import X.C909960Zms;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC908170Zjz;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class StrategyInitializer implements InterfaceC908170Zjz, C0CCZ {
    public static final StrategyInitializer LL;
    public static volatile AnonymousClass0956 LLILLJJLI;
    public static volatile String LLILLL;
    public static final AtomicBoolean LLILZ;
    public static final C01GW LLILZIL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "StrategyInitializer";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    static {
        StrategyInitializer strategyInitializer = new StrategyInitializer();
        LL = strategyInitializer;
        LLILZ = new AtomicBoolean(false);
        LLILZIL = C452501pT.LIZIZ(new C909570ZmF());
        C0I0B c0i0b = C0I0B.LJFF;
        ((C1400340mXo) c0i0b.LIZ()).LIZLLL(strategyInitializer);
        c0i0b.LIZJ();
        if (C894660Z7w.LIZLLL()) {
            C909610ZmJ.LIZ().LIZJ(C909960Zms.LIZIZ.getValue());
        }
    }

    public final void LIZ() {
        User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
        if (currentUser == null || currentUser.getUid() == null) {
            return;
        }
        LJ(currentUser.getUid());
        if (((Number) C260700AJo.LIZ.getValue()).intValue() == 1) {
            for (Object obj : ((ConcurrentHashMap) LLILZIL.getValue()).keySet()) {
                try {
                    LL.getClass();
                    Function0 function0 = (Function0) ((ConcurrentHashMap) LLILZIL.getValue()).get(obj);
                    if (function0 != null) {
                        function0.invoke();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public final void LJIIJ() {
        User currentUser;
        if (((Number) C260720AJq.LIZ.getValue()).intValue() != 1 || (currentUser = C0I0B.LJFF.LIZ().getCurrentUser()) == null || currentUser.getUid() == null || !LLILZ.compareAndSet(false, true)) {
            return;
        }
        C909400Zly.LIZIZ.LJIILL(currentUser.getUid());
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    public static void LJ(String str) {
        C909400Zly.LIZIZ.getClass();
        C909410Zlz c909410ZlzLJIILJJIL = C909400Zly.LJIILJJIL();
        c909410ZlzLJIILJJIL.LIZLLL = null;
        ((Keva) c909410ZlzLJIILJJIL.LIZ.getValue()).erase(c909410ZlzLJIILJJIL.LIZIZ);
        c909410ZlzLJIILJJIL.LIZIZ = null;
        c909410ZlzLJIILJJIL.LJ = false;
        LLILZ.set(false);
        if (!Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT) && str.length() != 0) {
            if (LLILLJJLI != null) {
                if (Intrinsics.LJFF(LLILLL, str)) {
                    return;
                }
                AnonymousClass0956 anonymousClass0956 = LLILLJJLI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                AnonymousClass0956 anonymousClass0956LJFF = LJFF(str);
                anonymousClass0956LJFF.LJII(AFwS248S0000000_14.get$arr$(289));
                LLILLJJLI = anonymousClass0956LJFF;
                LLILLL = str;
                return;
            }
            AnonymousClass0956 anonymousClass0956LJFF2 = LJFF(str);
            anonymousClass0956LJFF2.LJII(AFwS248S0000000_14.get$arr$(290));
            LLILLJJLI = anonymousClass0956LJFF2;
            LLILLL = str;
        }
    }

    public static AnonymousClass0956 LJFF(String str) {
        return C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C909350Zlt(str, null), 3);
    }

    public final void LJIIL(AFwS201S0000000_14 aFwS201S0000000_14) {
        if (((Number) C260700AJo.LIZ.getValue()).intValue() == 1) {
            ((ConcurrentHashMap) LLILZIL.getValue()).put("ACTION_BAR_RETRY", aFwS201S0000000_14);
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C909420Zm0(null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r5.LIZ(r0, r4, r3) == true) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIZ(X.EnumC909380Zlw r14, boolean r15) {
        /*
            X.01GW r0 = X.C278870AwP.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 1
            r6 = 0
            if (r0 == 0) goto Laa
            r0 = 1
        L11:
            java.lang.String r13 = ""
            r8 = 0
            if (r0 == 0) goto L4a
            X.0Z5R r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager r5 = X.C0Z5R.LIZ()
            if (r5 == 0) goto Lae
            java.lang.String r4 = r14.getKey()
            X.05h5 r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi r0 = X.C1419705h5.LIZ()
            if (r0 == 0) goto La7
            long r0 = r0.LIZIZ()
        L35:
            X.0I0B r3 = X.C0I0B.LJFF
            X.0I8r r3 = r3.LIZ()
            X.0mXo r3 = (X.C1400340mXo) r3
            java.lang.String r3 = r3.getCurUserId()
            if (r3 != 0) goto L44
            r3 = r13
        L44:
            boolean r0 = r5.LIZ(r0, r4, r3)
            if (r0 != r2) goto Lae
        L4a:
            X.0Z5R r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager r7 = X.C0Z5R.LIZ()
            if (r7 == 0) goto La5
            java.lang.String r12 = r14.getKey()
            X.05h5 r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi r0 = X.C1419705h5.LIZ()
            if (r0 == 0) goto L68
            long r8 = r0.LIZIZ()
        L68:
            if (r15 == 0) goto L9c
            java.lang.String r0 = r14.getKey()
            long r10 = X.C07K2.LIZIZ(r0)
        L72:
            X.0I0B r0 = X.C0I0B.LJFF
            X.0I8r r0 = r0.LIZ()
            X.0mXo r0 = (X.C1400340mXo) r0
            java.lang.String r0 = r0.getCurUserId()
            if (r0 == 0) goto L81
            r13 = r0
        L81:
            boolean r0 = r7.LIZLLL(r8, r10, r12, r13)
            if (r0 != r2) goto La5
        L87:
            X.0I0B r1 = X.C0I0B.LJFF
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LIZLLL()
            if (r0 != 0) goto Lad
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LJ()
            if (r0 != 0) goto Lad
            return r2
        L9c:
            java.lang.String r0 = r14.getKey()
            long r10 = X.C07K2.LIZ(r0)
            goto L72
        La5:
            r2 = 0
            goto L87
        La7:
            r0 = 0
            goto L35
        Laa:
            r0 = 0
            goto L11
        Lad:
            return r6
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.strategy.StrategyInitializer.LJIIIZ(X.0Zlw, boolean):boolean");
    }

    @Override // X.InterfaceC908170Zjz
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        C909400Zly.LIZIZ.getClass();
        C909410Zlz c909410ZlzLJIILJJIL = C909400Zly.LJIILJJIL();
        c909410ZlzLJIILJJIL.LIZLLL = null;
        ((Keva) c909410ZlzLJIILJJIL.LIZ.getValue()).erase(c909410ZlzLJIILJJIL.LIZIZ);
        c909410ZlzLJIILJJIL.LIZIZ = null;
        c909410ZlzLJIILJJIL.LJ = false;
        if (user != null && user.getUid() != null) {
            LJ(user.getUid());
        }
    }
}
