package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell;

import X.C01GW;
import X.C1390410mHn;
import X.C337180DJs;
import X.C452501pT;
import X.C888140Ysm;
import X.InterfaceC1891350zJl;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestLoadingCell extends PowerCell<C888140Ysm> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 398));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cl3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C337180DJs.LIZJ((View) this.LL.getValue());
        ((C1390410mHn) this.LL.getValue()).LIZJ();
    }
}
