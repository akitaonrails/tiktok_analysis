package com.bytedance.tiktok.homepage.mainactivity;

import X.C01GW;
import X.C0QSJ;
import X.C1150504el;
import X.C13LE;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.os.Handler;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.services.IJacocoUtils;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class LocalTestActivityAssem extends BaseMainContainerAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 34));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(35));
    public volatile IPerformanceAbility LLILLL;
    public InterfaceC665370Q7z LLILZ;
    public C0QSJ LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocalTestActivityAssem.class, "performanceAbility", "getPerformanceAbility()Lcom/ss/android/ugc/aweme/main/IPerformanceAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"LocalTestActivityAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        C1150504el.LIZ().LJI(strJ4, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[Catch: all -> 0x006c, PHI: r1
      0x0052: PHI (r1v4 X.0QSJ) = (r1v3 X.0QSJ), (r1v7 X.0QSJ) binds: [B:12:0x0036, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:9:0x0030, B:11:0x0034, B:13:0x0038, B:15:0x003c, B:16:0x0042, B:20:0x005a, B:21:0x005c, B:19:0x0052), top: B:34:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            r6 = this;
            java.lang.String r2 = "main_act_assem_lifecycle_%s_%s"
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "LocalTestActivityAssem"
            r4 = 0
            r1[r4] = r0
            java.lang.String r0 = "onCreate"
            r5 = 1
            r1[r5] = r0
            java.lang.String r3 = X.C786410Ut5.j4(r2, r1)
            X.145x r0 = X.C1150504el.LIZ()
            r0.LIZLLL(r3, r4)
            super.onCreate()
            X.01GW r0 = r6.LL
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L85
            boolean r0 = X.C296200BjG.LIZ()
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.main.IPerformanceAbility r2 = r6.LLILLL
            if (r2 != 0) goto L7b
            monitor-enter(r6)
            com.ss.android.ugc.aweme.main.IPerformanceAbility r2 = r6.LLILLL     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L6a
            X.0QSJ r1 = r6.LLILZIL     // Catch: java.lang.Throwable -> L6c
            if (r1 != 0) goto L52
            X.0Q7z r2 = r6.LLILZ     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L42
            X.0Q7z r2 = X.C687700QyG.LJIIIZ(r6)     // Catch: java.lang.Throwable -> L6c
            r6.LLILZ = r2     // Catch: java.lang.Throwable -> L6c
        L42:
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L6c
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r0 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r1[r4] = r0     // Catch: java.lang.Throwable -> L6c
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r2, r1)     // Catch: java.lang.Throwable -> L6c
            r6.LLILZIL = r1     // Catch: java.lang.Throwable -> L6c
            if (r1 != 0) goto L52
            r2 = 0
            goto L5a
        L52:
            java.lang.Class<com.ss.android.ugc.aweme.main.IPerformanceAbility> r0 = com.ss.android.ugc.aweme.main.IPerformanceAbility.class
            java.lang.Object r2 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L6c
            com.ss.android.ugc.aweme.main.IPerformanceAbility r2 = (com.ss.android.ugc.aweme.main.IPerformanceAbility) r2     // Catch: java.lang.Throwable -> L6c
        L5a:
            r6.LLILLL = r2     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L7b
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L6a:
            monitor-exit(r6)
            goto L7b
        L6c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L6f:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r6)
            java.lang.Class<com.ss.android.ugc.aweme.main.IPerformanceAbility> r0 = com.ss.android.ugc.aweme.main.IPerformanceAbility.class
            X.01wD r2 = X.C1558520qew.LIZJ(r1, r0)
            com.ss.android.ugc.aweme.main.IPerformanceAbility r2 = (com.ss.android.ugc.aweme.main.IPerformanceAbility) r2
        L7b:
            kotlin.jvm.internal.AwS568S0100000_24 r1 = new kotlin.jvm.internal.AwS568S0100000_24
            r0 = 35
            r1.<init>(r6, r0)
            r2.dt2(r1)
        L85:
            X.145x r0 = X.C1150504el.LIZ()
            r0.LJI(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainactivity.LocalTestActivityAssem.onCreate():void");
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        IJacocoUtils iJacocoUtils = (IJacocoUtils) ServiceManager.get().getService(IJacocoUtils.class);
        if (iJacocoUtils != null) {
            iJacocoUtils.LIZ();
        }
        ((Handler) this.LLILLJJLI.getValue()).removeCallbacksAndMessages(null);
    }
}
