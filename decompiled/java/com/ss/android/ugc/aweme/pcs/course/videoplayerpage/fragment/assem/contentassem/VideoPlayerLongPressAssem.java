package com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem;

import X.C0JMJ;
import X.C0JMR;
import X.C0JMW;
import X.C0JMX;
import X.C0JNP;
import X.C0QSJ;
import X.C1388190mED;
import X.C13LE;
import X.C1481290oeN;
import X.C1554960qZC;
import X.C1558520qew;
import X.C2217381BqS;
import X.C490760JMk;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC490700JMe;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class VideoPlayerLongPressAssem extends UIContentAssem implements C0JNP, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public C0JMJ LLIZLLLIL;
    public final C0JMW LLJ = new InterfaceC490700JMe() { // from class: X.0JMW
        @Override // X.InterfaceC490700JMe
        public final void LIZJ(C490760JMk c490760JMk) {
        }

        @Override // X.InterfaceC490700JMe
        public final void LIZ(C490760JMk c490760JMk) {
            C0JO7 c0jo7 = c490760JMk.LL;
            ((ArrayList) c0jo7.LLIZLLLIL).add(this.LIZ);
        }

        @Override // X.InterfaceC490700JMe
        public final void LIZIZ(C490760JMk c490760JMk) {
            C0JO7 c0jo7 = c490760JMk.LL;
            ((ArrayList) c0jo7.LLIZLLLIL).add(this.LIZ);
        }
    };
    public volatile VideoPlayerPagerAbility LLJI;
    public InterfaceC665370Q7z LLJIJIL;
    public C0QSJ LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoPlayerLongPressAssem.class, "pagerAbility", "getPagerAbility()Lcom/ss/android/ugc/aweme/pcs/course/videoplayerpage/fragment/assem/ability/VideoPlayerPagerAbility;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0JNP
    public final void Cq() {
    }

    @Override // X.C0JNP
    public final void IO(C1481290oeN c1481290oeN, float f) {
    }

    @Override // X.C0JNP
    public final void K3() {
    }

    @Override // X.C0JNP
    public final void LLLLILI() {
    }

    @Override // X.C0JNP
    public final void Pa() {
    }

    @Override // X.C0JNP
    public final void XI() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoPlayerFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoPlayerFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0JNP
    public final void jJ() {
    }

    @Override // X.C0JNP
    public final void re(boolean z) {
    }

    @Override // X.C0JNP
    public final void v8() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility Go() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility r0 = r4.LLJI
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility r0 = r4.LLJI     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJILJIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJIJIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJIJIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope> r1 = com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJILJIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility> r0 = com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility r0 = (com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJI = r0     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerLongPressAssem.Go():com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility");
    }

    public final C0JMJ Ho() {
        if (this.LLIZLLLIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0JMJ.class, null);
            this.LLIZLLLIL = interfaceC1555100qZQLIZIZ != null ? (C0JMJ) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLIZLLLIL;
    }

    @Override // X.C0JNP
    public final void JG() {
        C490760JMk c490760JMkLLJLLL;
        C0JMR c0jmr;
        C0JMJ c0jmjHo;
        String str;
        VideoPlayerPagerAbility videoPlayerPagerAbilityGo = Go();
        if (videoPlayerPagerAbilityGo == null || (c490760JMkLLJLLL = videoPlayerPagerAbilityGo.LLJLLL()) == null || (c0jmr = c490760JMkLLJLLL.LLILLJJLI) == null || (c0jmjHo = Ho()) == null) {
            return;
        }
        long j = c0jmjHo.LLILLJJLI;
        C0JMX c0jmx = C0JMX.LIZ;
        Context context = getContext();
        Activity activityLIZ = context != null ? C1388190mED.LIZ(context) : null;
        C0JMJ c0jmjHo2 = Ho();
        if (c0jmjHo2 == null || (str = c0jmjHo2.LL) == null) {
            str = "";
        }
        c0jmx.getClass();
        C0JMX.LIZ(j, activityLIZ, c0jmr, str);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        VideoPlayerPagerAbility videoPlayerPagerAbilityGo = Go();
        if (videoPlayerPagerAbilityGo != null) {
            videoPlayerPagerAbilityGo.P30(this.LLJ);
        }
        super.onDestroy();
    }

    @Override // X.C0JNP
    public final void onPlayerPause() {
        super.onPause();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        VideoPlayerPagerAbility videoPlayerPagerAbilityGo = Go();
        if (videoPlayerPagerAbilityGo != null) {
            videoPlayerPagerAbilityGo.NQ1(this.LLJ);
        }
    }
}
