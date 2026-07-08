package com.ss.android.ugc.aweme.detail.component.biz;

import X.C01GW;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C339190DRl;
import X.C452501pT;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class StoryBottomPlaceHolderComponent extends BasePanelComponent implements IDetailBottomProtocol {
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 413));

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void bi2() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IDetailBottomProtocol.class, C1697810uHb.LJIILJJIL(this));
        C339190DRl.LIZIZ((View) this.LL.getValue());
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View pE2(ViewGroup viewGroup) {
        return (View) this.LL.getValue();
    }
}
