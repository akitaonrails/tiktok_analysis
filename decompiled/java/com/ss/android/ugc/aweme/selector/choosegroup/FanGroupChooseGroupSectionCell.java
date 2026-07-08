package com.ss.android.ugc.aweme.selector.choosegroup;

import X.C01GW;
import X.C1223790hx3;
import X.C452501pT;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupChooseGroupSectionCell extends PowerCell<C1223790hx3> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1806));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1223790hx3 c1223790hx3 = (C1223790hx3) interfaceC1891350zJl;
        super.onBindItemView(c1223790hx3);
        ((TextView) this.LL.getValue()).setText(c1223790hx3.LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.dcs, false, 4, null);
    }
}
