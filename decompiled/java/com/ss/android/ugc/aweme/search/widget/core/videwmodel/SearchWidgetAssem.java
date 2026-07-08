package com.ss.android.ugc.aweme.search.widget.core.videwmodel;

import X.C0QSJ;
import X.C0RUJ;
import X.C13LE;
import X.C2217381BqS;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class SearchWidgetAssem extends BaseMainPageFragmentAssem implements C0RUJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public volatile MainPageBusinessAbility LLILLJJLI;
    public InterfaceC665370Q7z LLILLL;
    public C0QSJ LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchWidgetAssem.class, "mainPageBusinessAbility", "getMainPageBusinessAbility()Lcom/ss/android/ugc/aweme/base/mainpagefragment/MainPageBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "search_widget";
    }

    @Override // X.C0RUJ
    public final void a6() {
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

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[Catch: all -> 0x0069, PHI: r1
      0x005c: PHI (r1v3 X.0QSJ) = (r1v2 X.0QSJ), (r1v5 X.0QSJ) binds: [B:24:0x0041, B:29:0x005a] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:21:0x003b, B:23:0x003f, B:25:0x0043, B:27:0x0047, B:28:0x004d, B:31:0x0064, B:32:0x0066, B:30:0x005c), top: B:45:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bo() {
        /*
            r5 = this;
            X.19EG r0 = X.C724240Sb0.LIZ(r5)
            if (r0 == 0) goto L7f
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L7f
            java.lang.String r0 = "search_widget_to_inbox"
            r4 = 0
            boolean r3 = r1.getBooleanExtra(r0, r4)
            r2 = 0
            android.content.Context r0 = r5.getContext()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L25
            java.lang.CharSequence r1 = X.C1308910kAL.LJIIIIZZ(r0)     // Catch: java.lang.Throwable -> L27
        L1e:
            java.lang.String r0 = "TikTok Theme Light"
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.Throwable -> L27
            goto L2c
        L25:
            r1 = r2
            goto L1e
        L27:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
        L2c:
            if (r3 == 0) goto L7f
            if (r0 == 0) goto L7f
            boolean r0 = X.C296200BjG.LIZ()
            if (r0 == 0) goto L6c
            com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility r0 = r5.LLILLJJLI
            if (r0 != 0) goto L7c
            monitor-enter(r5)
            com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility r0 = r5.LLILLJJLI     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L7b
            X.0QSJ r1 = r5.LLILZ     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L5c
            X.0Q7z r3 = r5.LLILLL     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L4d
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r5)     // Catch: java.lang.Throwable -> L69
            r5.LLILLL = r3     // Catch: java.lang.Throwable -> L69
        L4d:
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L69
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r0 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r1[r4] = r0     // Catch: java.lang.Throwable -> L69
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r1)     // Catch: java.lang.Throwable -> L69
            r5.LLILZ = r1     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L64
        L5c:
            java.lang.Class<com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility> r0 = com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility.class
            java.lang.Object r2 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L69
            com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility r2 = (com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility) r2     // Catch: java.lang.Throwable -> L69
        L64:
            r5.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L69
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            r0 = r2
            goto L78
        L69:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L6c:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r5)
            java.lang.Class<com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility> r0 = com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility r0 = (com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility) r0
        L78:
            if (r0 == 0) goto L7f
            goto L7c
        L7b:
            monitor-exit(r5)
        L7c:
            r0.qg()
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.widget.core.videwmodel.SearchWidgetAssem.bo():void");
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        bo();
    }

    @Override // X.C0RUJ
    public final void lj() {
        bo();
    }
}
