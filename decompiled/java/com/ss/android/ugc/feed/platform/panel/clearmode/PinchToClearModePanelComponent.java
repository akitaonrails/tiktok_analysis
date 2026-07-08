package com.ss.android.ugc.feed.platform.panel.clearmode;

import X.C01GW;
import X.C0RGG;
import X.C0SAP;
import X.C0T1R;
import X.C2189821An6;
import X.C586380MzE;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;

/* JADX INFO: loaded from: classes12.dex */
public final class PinchToClearModePanelComponent extends BasePanelComponent implements IPinchToClearModePanelComponent, InterfaceC1554640qYg {
    public static final /* synthetic */ int LL = 0;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -950925715) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clearmode.IPinchToClearModePanelComponent
    public final boolean Rf0() {
        String strLIZ = C0T1R.LIZ(getPanelContext());
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        return C586380MzE.LIZ().LIZJ(strLIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clearmode.IPinchToClearModePanelComponent
    public final void Vn1(float f, Aweme aweme) {
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null && c2189821An6.isPlaylistCleanMode()) {
            return;
        }
        C0SAP.LIZIZ(f, aweme, C0T1R.LIZ(getPanelContext()), null);
    }
}
