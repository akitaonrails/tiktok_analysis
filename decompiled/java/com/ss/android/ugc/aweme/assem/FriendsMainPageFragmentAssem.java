package com.ss.android.ugc.aweme.assem;

import X.C09R3;
import X.C0QSJ;
import X.C13LE;
import X.C1558520qew;
import X.C2217381BqS;
import X.C297720Bli;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageSocialAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.scope.MainPageFragmentScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsMainPageFragmentAssem extends BaseMainPageFragmentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public volatile MainPageBusinessAbility LLILLJJLI;
    public volatile MainPageSocialAbility LLILLL;
    public volatile MainBusinessAbility LLILZ;
    public InterfaceC665370Q7z LLILZIL;
    public C0QSJ LLILZLL;
    public C0QSJ LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsMainPageFragmentAssem.class, "mainPageBusinessAbility", "getMainPageBusinessAbility()Lcom/ss/android/ugc/aweme/base/mainpagefragment/MainPageBusinessAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsMainPageFragmentAssem.class, "mainPageSocialAbility", "getMainPageSocialAbility()Lcom/ss/android/ugc/aweme/base/mainpagefragment/MainPageSocialAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(FriendsMainPageFragmentAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class, MainPageFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        arrayList.add(MainPageFragmentScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility bo() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility r0 = r4.LLILLJJLI
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility r0 = r4.LLILLJJLI     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLILZLL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLILZIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLILZIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLILZLL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility> r0 = com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility r0 = (com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.assem.FriendsMainPageFragmentAssem.bo():com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility");
    }

    public final String oR0() {
        if (!C297720Bli.LIZ()) {
            MainPageSocialAbility mainPageSocialAbility = (MainPageSocialAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MainPageSocialAbility.class, null);
            if (mainPageSocialAbility != null) {
                return mainPageSocialAbility.oR0();
            }
            return null;
        }
        MainPageSocialAbility mainPageSocialAbility2 = this.LLILLL;
        if (mainPageSocialAbility2 == null) {
            synchronized (this) {
                mainPageSocialAbility2 = this.LLILLL;
                if (mainPageSocialAbility2 == null) {
                    C0QSJ c0qsjLIZLLL = this.LLIZ;
                    if (c0qsjLIZLLL == null) {
                        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLILZIL;
                        if (interfaceC665370Q7zLJIIIZ == null) {
                            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                            this.LLILZIL = interfaceC665370Q7zLJIIIZ;
                        }
                        c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainPageFragmentScope.class});
                        this.LLIZ = c0qsjLIZLLL;
                    }
                    mainPageSocialAbility2 = c0qsjLIZLLL != null ? (MainPageSocialAbility) c0qsjLIZLLL.getAbility(MainPageSocialAbility.class) : null;
                    this.LLILLL = mainPageSocialAbility2;
                }
            }
        }
        if (mainPageSocialAbility2 != null) {
            return mainPageSocialAbility2.oR0();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae A[Catch: all -> 0x00bc, PHI: r1
      0x00ae: PHI (r1v3 X.0QSJ) = (r1v2 X.0QSJ), (r1v5 X.0QSJ) binds: [B:39:0x0092, B:44:0x00aa] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:36:0x008c, B:38:0x0090, B:40:0x0094, B:42:0x0098, B:43:0x009e, B:47:0x00b6, B:48:0x00b8, B:46:0x00ae), top: B:66:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem, X.InterfaceC1570850qyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZLZ(java.lang.String r8, java.lang.String r9, boolean r10, boolean r11, android.os.Bundle r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.assem.FriendsMainPageFragmentAssem.LLLZLZ(java.lang.String, java.lang.String, boolean, boolean, android.os.Bundle, java.lang.String):void");
    }
}
