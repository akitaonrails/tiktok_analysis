package com.ss.android.ugc.aweme.feed.title;

import X.C01GW;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC1349720lEA;
import X.InterfaceC1349690lE7;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class TitlePanelComponent extends BasePanelComponent implements TitlePanelComponentAbility, InterfaceC1554640qYg {
    public WeakReference<TitlePanelRootFragment> LL;
    public final C630740Ooa LLILLJJLI = C628500Oky.LIZ(new AwS565S0100000_21(this, 560));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 557));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 558));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 559));

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1079033627) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.title.TitlePanelComponentAbility
    public final boolean isShowing() {
        TitlePanelRootFragment titlePanelRootFragment;
        InterfaceC1349690lE7 interfaceC1349690lE7NR;
        WeakReference<TitlePanelRootFragment> weakReference = this.LL;
        return (weakReference == null || (titlePanelRootFragment = weakReference.get()) == null || (interfaceC1349690lE7NR = titlePanelRootFragment.NR()) == null || !interfaceC1349690lE7NR.isShowing()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.feed.title.TitlePanelComponentAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dg2(X.C1354140lLI r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.title.TitlePanelComponent.Dg2(X.0lLI):void");
    }

    public final void bo(EnumC1349720lEA enumC1349720lEA) {
        TitlePanelRootFragment titlePanelRootFragment;
        InterfaceC1349690lE7 interfaceC1349690lE7NR;
        if (isShowing()) {
            WeakReference<TitlePanelRootFragment> weakReference = this.LL;
            if (weakReference != null && (titlePanelRootFragment = weakReference.get()) != null && titlePanelRootFragment.isAdded() && (interfaceC1349690lE7NR = titlePanelRootFragment.NR()) != null) {
                interfaceC1349690lE7NR.H5(enumC1349720lEA);
            }
            this.LL = null;
        }
    }
}
