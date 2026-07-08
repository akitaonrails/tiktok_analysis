package com.ss.android.ugc.aweme.ad.panel;

import X.C0QSJ;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C2217381BqS;
import X.C687700QyG;
import X.C786410Ut5;
import X.EnumC1349720lEA;
import X.InterfaceC1008930cMV;
import X.InterfaceC1014340cVE;
import X.InterfaceC1146704e9;
import X.InterfaceC1349690lE7;
import X.InterfaceC1354310lLZ;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class TitlePanelCommerceBaseComponent extends UISlotAssem implements InterfaceC1354310lLZ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public IAnoleManager LLJJI;
    public volatile InterfaceC1349690lE7 LLJJIII;
    public InterfaceC665370Q7z LLJJIJI;
    public C0QSJ LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TitlePanelCommerceBaseComponent.class, "sheetAbility", "getSheetAbility()Lcom/ss/android/ugc/aweme/feed/title/TitlePanelSheetAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TitlePanelRootScope.class});
    }

    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TitlePanelRootScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public abstract int hp();

    public abstract String ip();

    public abstract void kp();

    public abstract void lp();

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return hp();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onParentSet() {
        /*
            r4 = this;
            super.onParentSet()
            X.0lE7 r0 = r4.LLJJIII
            if (r0 != 0) goto L3f
            monitor-enter(r4)
            X.0lE7 r0 = r4.LLJJIII     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJIJIIJIL     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L2c
            X.0Q7z r3 = r4.LLJJIJI     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L1a
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L3a
            r4.LLJJIJI = r3     // Catch: java.lang.Throwable -> L3a
        L1a:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope> r1 = com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3a
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3a
            r4.LLJJIJIIJIL = r1     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L2c
            r0 = 0
            goto L34
        L2c:
            java.lang.Class<X.0lE7> r0 = X.InterfaceC1349690lE7.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3a
            X.0lE7 r0 = (X.InterfaceC1349690lE7) r0     // Catch: java.lang.Throwable -> L3a
        L34:
            r4.LLJJIII = r0     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            goto L3d
        L38:
            monitor-exit(r4)
            goto L3f
        L3a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L3d:
            if (r0 == 0) goto L42
        L3f:
            r0.d9(r4)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.panel.TitlePanelCommerceBaseComponent.onParentSet():void");
    }

    @Override // X.InterfaceC1354310lLZ
    public final void onShow() {
        ViewGroup viewGroup;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        CommentContextSource commentContextSource;
        String strEventType;
        Aweme aweme;
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ;
        View contentView = getContentView();
        IAnoleManager iAnoleManagerRi = null;
        if (!(contentView instanceof ViewGroup) || (viewGroup = (ViewGroup) contentView) == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", CommentContextSource.class, null)) == null || (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) == null || (strEventType = CommentContextSourceKt.eventType(commentContextSource)) == null || (aweme = CommentContextSourceKt.aweme(commentContextSource)) == null) {
            return;
        }
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null && (interfaceC1008930cMVLIZJ = iFeedServiceLIZIZ.LIZJ(getContext(), aweme, strEventType, true)) != null) {
            iAnoleManagerRi = interfaceC1008930cMVLIZJ.Ri();
        }
        this.LLJJI = iAnoleManagerRi;
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        kp();
        IAnoleManager iAnoleManager = this.LLJJI;
        if (iAnoleManager != null) {
            iAnoleManager.mount(viewGroup, ip(), new InterfaceC1014340cVE() { // from class: X.0lJU
                @Override // X.InterfaceC1014340cVE
                public final void LIZLLL(boolean z) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJ(String str, View view, AnoleComponentLayoutModel anoleComponentLayoutModel) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJFF(boolean z) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJI(String str, Integer num, Integer num2, Integer num3, Integer num4) {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJII() {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LJJJIL() {
                }

                @Override // X.InterfaceC1014340cVE
                public final void LIZIZ() {
                    this.LIZ.lp();
                }

                @Override // X.InterfaceC1014340cVE
                public final void LIZJ() {
                    this.LIZ.lp();
                }
            });
        }
        IAnoleManager iAnoleManager2 = this.LLJJI;
        if (iAnoleManager2 != null) {
            iAnoleManager2.LJIJI(ip());
        }
    }

    @Override // X.InterfaceC1354310lLZ
    public final void lM(EnumC1349720lEA enumC1349720lEA) {
        lp();
        IAnoleManager iAnoleManager = this.LLJJI;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIJJI(ip());
        }
        this.LLJJI = null;
    }
}
