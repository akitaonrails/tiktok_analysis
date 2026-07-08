package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.ui;

import X.C01GW;
import X.C1834130xpT;
import X.C1835420xrY;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;
import wh6.AbS512S0200000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class FragmentCoverCell extends PowerCell<C1834130xpT> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 454));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dgs;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        C1834130xpT c1834130xpT = (C1834130xpT) interfaceC1891350zJl;
        super.onBindItemView(c1834130xpT);
        C1835420xrY c1835420xrY = (C1835420xrY) this.LL.getValue();
        String str = c1834130xpT.LL;
        boolean z2 = c1834130xpT.LLILLJJLI;
        String str2 = c1834130xpT.LLILLL;
        String str3 = c1834130xpT.LLILZ;
        if (c1834130xpT.LLILZIL != 2) {
            z = true;
        } else {
            z = false;
        }
        c1835420xrY.h0(str, str2, str3, z2, z, false);
        C786410Ut5.I7(new AbS512S0200000_27(this, c1834130xpT, 2), this.itemView);
    }
}
