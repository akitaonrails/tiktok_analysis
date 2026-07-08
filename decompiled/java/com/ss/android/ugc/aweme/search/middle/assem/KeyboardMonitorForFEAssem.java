package com.ss.android.ugc.aweme.search.middle.assem;

import X.C0QOB;
import X.C0QSJ;
import X.C13LE;
import X.C2217381BqS;
import X.C23250099c;
import X.C669920QPm;
import X.C669930QPn;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC670010QPv;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope;
import com.ss.android.ugc.aweme.search.middle.assem.BaseKeyboardMonitorAssem;
import com.ss.android.ugc.aweme.search.middle.assem.KeyboardMonitorForFEAssem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class KeyboardMonitorForFEAssem extends BaseKeyboardMonitorAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public Boolean LLILZLL;
    public final C669920QPm LLIZ = new InterfaceC670010QPv() { // from class: X.0QPm
        @Override // X.InterfaceC670010QPv
        public final void LIZIZ(C669990QPt c669990QPt) {
        }

        @Override // X.InterfaceC670010QPv
        public final void onProgress(float f) {
        }

        @Override // X.InterfaceC670010QPv
        public final void LIZ(C669990QPt c669990QPt) {
            KeyboardMonitorForFEAssem keyboardMonitorForFEAssem = this.LIZ;
            if (keyboardMonitorForFEAssem.LLILZLL == null) {
                keyboardMonitorForFEAssem.LLILZLL = Boolean.TRUE;
                if (C18008073m.LIZ() == 3) {
                    BaseKeyboardMonitorAssem.m309do(EnumC669960QPq.INIT_SENT);
                }
            }
            if (C18008073m.LIZ() == 3) {
                if (c669990QPt.LIZ) {
                    KeyboardMonitorForFEAssem keyboardMonitorForFEAssem2 = this.LIZ;
                    Integer numValueOf = Integer.valueOf(c669990QPt.LIZIZ);
                    keyboardMonitorForFEAssem2.getClass();
                    C948503nH.LJ(keyboardMonitorForFEAssem2, C0PEM.LIZ, new C669940QPo(keyboardMonitorForFEAssem2, true, numValueOf, null));
                    return;
                }
                KeyboardMonitorForFEAssem keyboardMonitorForFEAssem3 = this.LIZ;
                keyboardMonitorForFEAssem3.getClass();
                C948503nH.LJ(keyboardMonitorForFEAssem3, C0PEM.LIZ, new C669940QPo(keyboardMonitorForFEAssem3, false, null, null));
            }
        }

        @Override // X.InterfaceC670010QPv
        public final void LIZJ(C669990QPt c669990QPt) {
            KeyboardMonitorForFEAssem keyboardMonitorForFEAssem = this.LIZ;
            if (keyboardMonitorForFEAssem.LLILZLL == null) {
                keyboardMonitorForFEAssem.LLILZLL = Boolean.TRUE;
                if (C18008073m.LIZ() == 3) {
                    BaseKeyboardMonitorAssem.m309do(EnumC669960QPq.INIT_SENT);
                }
            }
        }
    };
    public volatile C0QOB LLIZLLLIL;
    public InterfaceC665370Q7z LLJ;
    public C0QSJ LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(KeyboardMonitorForFEAssem.class, "searchKeyboardMonitorAbility", "getSearchKeyboardMonitorAbility()Lcom/ss/android/ugc/aweme/search/common/keyboard/listener/ability/SearchKeyboardMonitorAbility;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchResultFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchResultFragmentScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0QOB ho() {
        /*
            r4 = this;
            X.0QOB r0 = r4.LLIZLLLIL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0QOB r0 = r4.LLIZLLLIL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJI     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope> r1 = com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJI = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0QOB> r0 = X.C0QOB.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0QOB r0 = (X.C0QOB) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLIZLLLIL = r0     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.middle.assem.KeyboardMonitorForFEAssem.ho():X.0QOB");
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C0QOB c0qobHo = ho();
        if (c0qobHo != null) {
            c0qobHo.cb(this.LLIZ);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        C0QOB c0qobHo = ho();
        if (c0qobHo != null) {
            c0qobHo.S0(this.LLIZ);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C669930QPn(this, null), 3);
    }
}
