package com.ss.android.ugc.aweme.feed.title.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.InterfaceC1146704e9;
import X.InterfaceC1349690lE7;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope;
import com.ss.android.ugc.aweme.feed.title.vm.TitlePanelRootVM;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class TitlePanelVideoShrinkAssem extends AbstractC738140SxQ implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public WeakReference<VideoShrinkAbility> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 566));
    public final AssemVMLazy LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public volatile InterfaceC1349690lE7 LLIZ;
    public InterfaceC665370Q7z LLIZLLLIL;
    public C0QSJ LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TitlePanelVideoShrinkAssem.class, "sheetAbility", "getSheetAbility()Lcom/ss/android/ugc/aweme/feed/title/TitlePanelSheetAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TitlePanelVideoShrinkAssem.class, "rootVM", "getRootVM()Lcom/ss/android/ugc/aweme/feed/title/vm/TitlePanelRootVM;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TitlePanelVideoShrinkAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TitlePanelRootVM.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 198), AFwS259S0000000_21.get$arr$(159), null, true);
        this.LLILZ = 1;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TitlePanelRootScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TitlePanelRootScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onParentViewCreated() {
        /*
            r4 = this;
            super.onParentViewCreated()
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r4.LLILLL
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.feed.title.assem.TitlePanelVideoShrinkAssem.LLJI
            r2 = 1
            com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r1.getValue()
            com.ss.android.ugc.aweme.feed.title.vm.TitlePanelRootVM r0 = (com.ss.android.ugc.aweme.feed.title.vm.TitlePanelRootVM) r0
            X.0lLI r0 = r0.LL
            if (r0 == 0) goto L64
            java.lang.ref.WeakReference<com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility> r0 = r0.LLILZIL
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L64
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r4.LL = r0
            X.0lE7 r1 = r4.LLIZ
            if (r1 != 0) goto L5c
            monitor-enter(r4)
            X.0lE7 r1 = r4.LLIZ     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L55
            X.0QSJ r1 = r4.LLJ     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L49
            X.0Q7z r3 = r4.LLIZLLLIL     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L38
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L57
            r4.LLIZLLLIL = r3     // Catch: java.lang.Throwable -> L57
        L38:
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L57
            java.lang.Class<com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope> r1 = com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L57
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L57
            r4.LLJ = r1     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L49
            r1 = 0
            goto L51
        L49:
            java.lang.Class<X.0lE7> r0 = X.InterfaceC1349690lE7.class
            java.lang.Object r1 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L57
            X.0lE7 r1 = (X.InterfaceC1349690lE7) r1     // Catch: java.lang.Throwable -> L57
        L51:
            r4.LLIZ = r1     // Catch: java.lang.Throwable -> L57
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L57
            goto L5a
        L55:
            monitor-exit(r4)
            goto L5c
        L57:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L5a:
            if (r1 == 0) goto L64
        L5c:
            X.0lLJ r0 = new X.0lLJ
            r0.<init>()
            r1.Ej(r0)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.title.assem.TitlePanelVideoShrinkAssem.onParentViewCreated():void");
    }
}
