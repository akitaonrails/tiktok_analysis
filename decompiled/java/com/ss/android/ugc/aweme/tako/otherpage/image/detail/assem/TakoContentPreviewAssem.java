package com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem;

import X.C019F;
import X.C01GW;
import X.C05P0;
import X.C09R3;
import X.C0QSJ;
import X.C13FE;
import X.C13LE;
import X.C1637806bA;
import X.C1679860toe;
import X.C19719912Dl;
import X.C20028913Yh;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC1360805Ug;
import X.InterfaceC1361305Ul;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoMultiImagePreviewScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS568S0100000_24;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: loaded from: classes26.dex */
public final class TakoContentPreviewAssem extends UiComposableAssem<C1679860toe> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1351));
    public final C05P0<Boolean> LLJIJIL = C20028913Yh.LJI(Boolean.FALSE);
    public final AssemVMLazy LLJILJIL;
    public volatile InterfaceC1360805Ug LLJILJILJ;
    public volatile InterfaceC1361305Ul LLJILLL;
    public InterfaceC665370Q7z LLJJ;
    public C0QSJ LLJJI;
    public C0QSJ LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoContentPreviewAssem.class, "ability", "getAbility()Lcom/ss/android/ugc/aweme/tako/otherpage/image/detail/TakoMultiImagePreviewAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoContentPreviewAssem.class, "contentPreviewCellAbility", "getContentPreviewCellAbility()Lcom/ss/android/ugc/aweme/tako/otherpage/image/detail/assem/TakoContentPreviewCellAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TakoContentPreviewAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/tako/otherpage/image/detail/assem/TakoContentPreviewViewModel;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public TakoContentPreviewAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoContentPreviewViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1350), AFwS266S0000000_25.get$arr$(260), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoMultiImagePreviewScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoMultiImagePreviewScope.class);
        arrayList.add(TakoFragmentScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x003a, PHI: r1
      0x0029: PHI (r1v4 X.0QSJ) = (r1v3 X.0QSJ), (r1v9 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0036, B:17:0x0038, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1360805Ug Lo() {
        /*
            r4 = this;
            X.05Ug r1 = r4.LLJILJILJ
            if (r1 != 0) goto L3e
            monitor-enter(r4)
            X.05Ug r1 = r4.LLJILJILJ     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L3d
            X.0QSJ r1 = r4.LLJJI     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJ     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L3a
            r4.LLJJ = r3     // Catch: java.lang.Throwable -> L3a
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoMultiImagePreviewScope> r1 = com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoMultiImagePreviewScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3a
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3a
            r4.LLJJI = r1     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            r1 = 0
            goto L36
        L29:
            java.lang.Class<X.05Ug> r0 = X.InterfaceC1360805Ug.class
            java.lang.Object r1 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3a
            X.05Ug r1 = (X.InterfaceC1360805Ug) r1     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<X.05Ug> r0 = X.InterfaceC1360805Ug.class
            X.C687700QyG.LJ(r1, r0)     // Catch: java.lang.Throwable -> L3a
        L36:
            r4.LLJILJILJ = r1     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            return r1
        L3a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L3d:
            monitor-exit(r4)
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem.Lo():X.05Ug");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1361305Ul No() {
        /*
            r4 = this;
            X.05Ul r0 = r4.LLJILLL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.05Ul r0 = r4.LLJILLL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJIII     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope> r1 = com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIII = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.05Ul> r0 = X.InterfaceC1361305Ul.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.05Ul r0 = (X.InterfaceC1361305Ul) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJILLL = r0     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem.No():X.05Ul");
    }

    public final TakoContentPreviewViewModel Oo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (TakoContentPreviewViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void handleOnResume() {
        super.handleOnResume();
        ((C13FE) this.LLJIJIL).setValue(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    @Override // tiktok.compose.assem.UiComposableAssem
    /* JADX INFO: renamed from: Jo, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Co(X.C1679860toe r13, X.InterfaceC1680500tpg r14, int r15) {
        /*
            r12 = this;
            r0 = 1181077334(0x4665cf56, float:14707.834)
            X.13ZC r9 = r14.LJIIJ(r0)
            r0 = r15 & 6
            if (r0 != 0) goto Lac
            boolean r0 = r9.LJJIIJ(r13)
            if (r0 == 0) goto La9
            r1 = 4
        L12:
            r1 = r1 | r15
        L13:
            r0 = r15 & 48
            if (r0 != 0) goto L20
            boolean r0 = r9.LJII(r12)
            if (r0 == 0) goto La5
            r0 = 32
        L1f:
            r1 = r1 | r0
        L20:
            r1 = r1 & 19
            r0 = 18
            if (r1 != r0) goto L3f
            boolean r0 = r9.LIZ()
            if (r0 == 0) goto L3f
            r9.LIZJ()
        L2f:
            X.13Ys r2 = r9.LJJJJZI()
            if (r2 == 0) goto L3e
            kotlin.jvm.internal.AwS124S0201000_25 r1 = new kotlin.jvm.internal.AwS124S0201000_25
            r0 = 51
            r1.<init>(r12, r13, r15, r0)
            r2.LIZLLL = r1
        L3e:
            return
        L3f:
            java.util.List<com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem> r0 = r13.LL
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L59
            X.13Ys r2 = r9.LJJJJZI()
            if (r2 == 0) goto L58
            kotlin.jvm.internal.AwS124S0201000_25 r1 = new kotlin.jvm.internal.AwS124S0201000_25
            r0 = 50
            r1.<init>(r12, r13, r15, r0)
            r2.LIZLLL = r1
        L58:
            return
        L59:
            kotlin.Unit r2 = kotlin.Unit.LIZ
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r9.LJJIIJZLJL(r0)
            boolean r0 = r9.LJII(r12)
            java.lang.Object r1 = r9.LJJ()
            if (r0 != 0) goto L74
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L7d
        L74:
            X.05Rg r1 = new X.05Rg
            r0 = 0
            r1.<init>(r12, r0)
            r9.LJJIJIIJI(r1)
        L7d:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0 = 0
            r9.LJJJJL(r0)
            X.C1680540tpk.LJFF(r2, r1, r9)
            X.1ETK r2 = X.C1669670tYD.LIZJ(r9)
            r3 = 0
            kotlin.jvm.internal.AwS460S0200000_25 r1 = new kotlin.jvm.internal.AwS460S0200000_25
            r0 = 19
            r1.<init>(r12, r13, r0)
            r0 = 789426545(0x2f0db171, float:1.2886915E-10)
            X.12De r8 = X.C13Z4.LIZJ(r0, r1, r9)
            r10 = 1572864(0x180000, float:2.204052E-39)
            r11 = 62
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            X.C1670410tZP.LIZ(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L2f
        La5:
            r0 = 16
            goto L1f
        La9:
            r1 = 2
            goto L12
        Lac:
            r1 = r15
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem.Co(X.0toe, X.0tpg, int):void");
    }
}
