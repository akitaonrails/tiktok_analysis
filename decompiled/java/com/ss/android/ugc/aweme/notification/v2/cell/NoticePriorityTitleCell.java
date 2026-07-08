package com.ss.android.ugc.aweme.notification.v2.cell;

import X.C01GW;
import X.C1273804ye;
import X.C1954807lC;
import X.C452501pT;
import X.InterfaceC1891350zJl;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticePriorityTitleCell extends PowerCell<C1273804ye> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 436));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.aar;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1273804ye c1273804ye = (C1273804ye) interfaceC1891350zJl;
        super.onBindItemView(c1273804ye);
        boolean z = c1273804ye.LL;
        if (z) {
            ((TextView) this.LL.getValue()).setText(2131824673);
        } else {
            if (!z) {
                ((TextView) this.LL.getValue()).setText(2131824674);
                return;
            }
            throw new C1954807lC();
        }
    }
}
