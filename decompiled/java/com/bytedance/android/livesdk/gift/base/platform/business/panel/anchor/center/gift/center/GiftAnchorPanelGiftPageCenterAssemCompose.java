package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center;

import X.C019F;
import X.C09IR;
import X.C1146120fvm;
import X.C1146530fwR;
import X.C1149360g10;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2252331DDr;
import X.C262100zr;
import X.C459880I1q;
import X.C500260Jjc;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC1141530foN;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.GiftAnchorPanelGiftPageScope;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.GiftAnchorPanelCenterViewModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: loaded from: classes26.dex */
public final class GiftAnchorPanelGiftPageCenterAssemCompose extends UiComposableAssem<C1146530fwR> implements InterfaceC1141530foN, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C1559260qg8 LLJI = new C1559260qg8(new C723590SZx(this, C1146120fvm.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJIJIL;
    public final C2252331DDr LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GiftAnchorPanelGiftPageCenterAssemCompose.class, "panelCenterVM", "getPanelCenterVM()Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/GiftAnchorPanelCenterViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GiftAnchorPanelGiftPageCenterAssemCompose() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GiftAnchorPanelCenterViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 47), AFwS257S0000000_19.get$arr$(14), null, true);
        this.LLJILJIL = C09IR.LIZIZ(0, 0, null, 7);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{GiftAnchorPanelGiftPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(GiftAnchorPanelGiftPageScope.class);
        return arrayList;
    }

    public final C1146120fvm Lo() {
        return (C1146120fvm) this.LLJI.getValue();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (this.LLILZ && C459880I1q.LIZ(this)) {
            C500260Jjc.LJJJJJ(this, null, new C1149360g10(this, c262100zr, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    @Override // tiktok.compose.assem.UiComposableAssem
    /* JADX INFO: renamed from: Jo, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Co(X.C1146530fwR r15, X.InterfaceC1680500tpg r16, int r17) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemCompose.Co(X.0fwR, X.0tpg, int):void");
    }
}
