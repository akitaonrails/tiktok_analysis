package com.ss.android.ugc.aweme.tako.botpage.components.share;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1A3K;
import X.C2217381BqS;
import X.C687700QyG;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS568S0100000_24;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: loaded from: classes34.dex */
public final class TakoSharePreviewAssem extends UiComposableAssem<C1A3K> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSharePreviewAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/components/share/TakoSharePreviewViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoSharePreviewAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoSharePreviewViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1273), AFwS279S0000000_33.get$arr$(238), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoFragmentScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // tiktok.compose.assem.UiComposableAssem
    /* JADX INFO: renamed from: Jo, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Co(X.C1A3K r13, X.InterfaceC1680500tpg r14, int r15) {
        /*
            r12 = this;
            r0 = -1204855813(0xffffffffb82f5bfb, float:-4.1808915E-5)
            X.13ZC r10 = r14.LJIIJ(r0)
            r0 = r15 & 6
            if (r0 != 0) goto Lb5
            boolean r0 = r10.LJJIIJ(r13)
            if (r0 == 0) goto Lb2
            r1 = 4
        L12:
            r1 = r1 | r15
        L13:
            r0 = r15 & 48
            if (r0 != 0) goto L20
            boolean r0 = r10.LJII(r12)
            if (r0 == 0) goto Lae
            r0 = 32
        L1f:
            r1 = r1 | r0
        L20:
            r1 = r1 & 19
            r0 = 18
            if (r1 != r0) goto L3e
            boolean r0 = r10.LIZ()
            if (r0 == 0) goto L3e
            r10.LIZJ()
        L2f:
            X.13Ys r2 = r10.LJJJJZI()
            if (r2 == 0) goto L3d
            kotlin.jvm.internal.AwS127S0201000_33 r1 = new kotlin.jvm.internal.AwS127S0201000_33
            r0 = 0
            r1.<init>(r12, r13, r15, r0)
            r2.LIZLLL = r1
        L3d:
            return
        L3e:
            X.1A3J r0 = r13.LL
            if (r0 != 0) goto L51
            X.13Ys r2 = r10.LJJJJZI()
            if (r2 == 0) goto L50
            kotlin.jvm.internal.AwS127S0201000_33 r1 = new kotlin.jvm.internal.AwS127S0201000_33
            r0 = 1
            r1.<init>(r12, r13, r15, r0)
            r2.LIZLLL = r1
        L50:
            return
        L51:
            com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem$Image r3 = r0.LIZ
            X.05Ul r4 = r0.LIZIZ
            int r5 = r13.LLILLL
            float r6 = r13.LLILLJJLI
            boolean r7 = r0.LIZLLL
            r2 = 5004770(0x4c5de2, float:7.013177E-39)
            r10.LJJIIJZLJL(r2)
            boolean r0 = r10.LJII(r12)
            java.lang.Object r8 = r10.LJJ()
            if (r0 != 0) goto L74
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r8 != r0) goto L7e
        L74:
            kotlin.jvm.internal.AwS577S0100000_33 r8 = new kotlin.jvm.internal.AwS577S0100000_33
            r0 = 3301(0xce5, float:4.626E-42)
            r8.<init>(r12, r0)
            r10.LJJIJIIJI(r8)
        L7e:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r1 = 0
            r10.LJJJJL(r1)
            r10.LJJIIJZLJL(r2)
            boolean r0 = r10.LJII(r12)
            java.lang.Object r9 = r10.LJJ()
            if (r0 != 0) goto L9a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r9 != r0) goto La4
        L9a:
            kotlin.jvm.internal.AwS577S0100000_33 r9 = new kotlin.jvm.internal.AwS577S0100000_33
            r0 = 3302(0xce6, float:4.627E-42)
            r9.<init>(r12, r0)
            r10.LJJIJIIJI(r9)
        La4:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r10.LJJJJL(r1)
            r11 = 0
            X.C1667680tV0.LIZIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L2f
        Lae:
            r0 = 16
            goto L1f
        Lb2:
            r1 = 2
            goto L12
        Lb5:
            r1 = r15
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.share.TakoSharePreviewAssem.Co(X.1A3K, X.0tpg, int):void");
    }
}
