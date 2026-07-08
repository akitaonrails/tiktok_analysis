package com.ss.android.ugc.profile.business.ci;

import X.C01GW;
import X.C0QSJ;
import X.C10EA;
import X.C1150504el;
import X.C1356810lPb;
import X.C13LE;
import X.C1440005kM;
import X.C1514430pVp;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1594160raQ;
import X.C1594240raY;
import X.C1606360ru6;
import X.C1865340ydo;
import X.C1913950zuD;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C296200BjG;
import X.C452501pT;
import X.C487580JAe;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C810560Vqw;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ARunnableS93S0200000_24;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialActivityAssem extends BaseMainContainerAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1594240raY(this));
    public volatile IPerformanceAbility LLILLL;
    public InterfaceC665370Q7z LLILZ;
    public C0QSJ LLILZIL;

    /* JADX INFO: loaded from: classes29.dex */
    public interface AppDiffProtocol {
        public static final C1865340ydo LIZ = C1865340ydo.LIZ;

        public static final class DowngradeInstance implements AppDiffProtocol {
            @Override // com.ss.android.ugc.profile.business.ci.SocialActivityAssem.AppDiffProtocol
            public final void LIZ() {
            }
        }

        void LIZ();
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialActivityAssem.class, "performanceAbility", "getPerformanceAbility()Lcom/ss/android/ugc/aweme/main/IPerformanceAbility;", 0);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.main.IPerformanceAbility m351do() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.main.IPerformanceAbility r0 = r4.LLILLL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.main.IPerformanceAbility r0 = r4.LLILLL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLILZIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLILZ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLILZ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLILZIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.main.IPerformanceAbility> r0 = com.ss.android.ugc.aweme.main.IPerformanceAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.main.IPerformanceAbility r0 = (com.ss.android.ugc.aweme.main.IPerformanceAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLILLL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ci.SocialActivityAssem.m351do():com.ss.android.ugc.aweme.main.IPerformanceAbility");
    }

    public final void bo(final Activity activity) {
        int i = C2187451AjH.LIZ;
        C810560Vqw.LJ(new ARunnableS93S0200000_24(activity, new C10EA() { // from class: X.0raZ
            @Override // X.C10EA
            public final void onCancel() {
                int i2 = C2187451AjH.LIZ;
                this.LIZ.fo(activity);
            }
        }, 33));
    }

    public final void fo(Activity activity) {
        Fragment fragment;
        int i = C2187451AjH.LIZ;
        C1606360ru6 c1606360ru6 = C1594160raQ.LIZ;
        c1606360ru6.LJFF = true;
        c1606360ru6.LIZIZ(activity);
        if (!C1514430pVp.LIZLLL().booleanValue() && !this.LL) {
            Object objLIZJ = C487580JAe.LIZJ(C724240Sb0.LJI(this));
            if (objLIZJ instanceof Fragment) {
                fragment = (Fragment) objLIZJ;
            } else {
                fragment = null;
            }
            ((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).LJFF(activity, fragment);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onCreate(Bundle bundle) {
        IPerformanceAbility iPerformanceAbilityM351do;
        C19EG c19eg;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"SocialActivityAssem", "onCreate_with_bundle"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate(bundle);
        Activity activity = (Activity) this.LLILLJJLI.getValue();
        if (activity != null) {
            this.LL = activity.getIntent().getBooleanExtra("restart_from_logout", false);
            if (C296200BjG.LIZ()) {
                if (m351do() == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SocialActivityAssem: activity ");
                    sbLIZ.append(activity);
                    sbLIZ.append(", scope: ");
                    InterfaceC665370Q7z interfaceC665370Q7zLJI = null;
                    if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
                        interfaceC665370Q7zLJI = C1558360qeg.LJI(c19eg, null);
                    }
                    sbLIZ.append(interfaceC665370Q7zLJI);
                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
                }
                iPerformanceAbilityM351do = m351do();
                if (iPerformanceAbilityM351do == null) {
                    iPerformanceAbilityM351do = IPerformanceAbility.Default.LL;
                }
            } else {
                iPerformanceAbilityM351do = (IPerformanceAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), IPerformanceAbility.class);
            }
            iPerformanceAbilityM351do.dt2(new C1913950zuD(this));
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C1440005kM.LIZ(new C1356810lPb(intent));
    }
}
