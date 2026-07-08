package com.ss.android.ugc.aweme.notification.v2.cell;

import X.C01GW;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1900980zZI;
import X.C1913380ztI;
import X.C452501pT;
import X.EnumC1906270zhp;
import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationErrorStatusCell extends PowerCell<C1900980zZI> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 438));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 437));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cwb;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C1900980zZI c1900980zZI = (C1900980zZI) interfaceC1891350zJl;
        super.onBindItemView(c1900980zZI);
        C1913380ztI c1913380ztI = C1913380ztI.LLILLJJLI;
        if (c1913380ztI.isStandardUIEnable()) {
            if (c1900980zZI.LLILLJJLI == EnumC1906270zhp.NEW_FOLLOWER) {
                str = "inbox_follower_list";
            } else {
                str = "inbox_activity";
            }
            c1913380ztI.setStatusView((C1749280vcc) this.LL.getValue(), str, new AwS572S0100000_28(this, 831), (Exception) null);
            return;
        }
        C1722300uv6 c1722300uv6 = (C1722300uv6) this.LLILLJJLI.getValue();
        if (c1722300uv6 == null) {
            return;
        }
        ((C1749280vcc) this.LL.getValue()).setStatus(c1722300uv6);
    }
}
