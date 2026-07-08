package com.ss.android.ugc.aweme.notification.v2.cell;

import X.C01GW;
import X.C1273904yf;
import X.C12ES;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C339190DRl;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS162S0100000_28;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationLoadMoreCell extends PowerCell<C1273904yf> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 439));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a_t;
    }

    public final C1749280vcc getStatusView() {
        View view = this.itemView;
        if (view instanceof C1749280vcc) {
            return (C1749280vcc) view;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C1273904yf item = getItem();
        if (item != null) {
            item.LL = false;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Function0<Unit> function0;
        super.onBindItemView(interfaceC1891350zJl);
        C1749280vcc statusView = getStatusView();
        if (statusView != null) {
            C12ES.LJIILL(0, statusView);
        }
        C1273904yf item = getItem();
        if (item != null && item.LL) {
            C1749280vcc statusView2 = getStatusView();
            if (statusView2 != null) {
                statusView2.setStatus((C1722300uv6) this.LL.getValue());
            }
            C1749280vcc statusView3 = getStatusView();
            if (statusView3 != null) {
                statusView3.setTopMargin(C339190DRl.LIZ(10));
            }
            C1749280vcc statusView4 = getStatusView();
            if (statusView4 != null) {
                C786410Ut5.l9(statusView4, new ACListenerS162S0100000_28(this, 115));
                return;
            }
            return;
        }
        C1749280vcc statusView5 = getStatusView();
        if (statusView5 != null) {
            statusView5.LJ();
        }
        C1273904yf item2 = getItem();
        if (item2 == null || (function0 = item2.LLILLJJLI) == null) {
            return;
        }
        function0.invoke();
    }
}
