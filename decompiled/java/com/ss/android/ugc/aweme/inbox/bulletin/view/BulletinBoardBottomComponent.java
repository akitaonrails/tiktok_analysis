package com.ss.android.ugc.aweme.inbox.bulletin.view;

import X.C01GW;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C452501pT;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardBottomComponent extends BasePanelUIComponent implements IDetailBottomProtocol {
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 521));

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void bi2() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IDetailBottomProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View pE2(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a6z, viewGroup, false);
        ((TextView) viewTd.findViewById(R.id.d1d)).setText((String) this.LLJIJIL.getValue());
        return viewTd;
    }
}
