package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell;

import X.C03EY;
import X.C1184740gw4;
import X.C2211631BhB;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.poi.detail.container.model.ChartInfo;
import irm.AkS28S0300000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiChartCell extends PowerCell<C1184740gw4> {
    public C1184740gw4 LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 312));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C03EY c03ey;
        int iIntValue;
        C1184740gw4 c1184740gw4 = (C1184740gw4) interfaceC1891350zJl;
        super.onBindItemView(c1184740gw4);
        this.LL = c1184740gw4;
        View view = this.itemView;
        String str = null;
        if ((view instanceof C03EY) && (c03ey = (C03EY) view) != null) {
            ChartInfo chartInfo = c1184740gw4.LLILLJJLI;
            if (chartInfo != null) {
                str = chartInfo.chartTopicName;
            }
            Integer num = c1184740gw4.LLILLL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 72;
            }
            C03EY.LIZ(c03ey, str, iIntValue, null, true, c1184740gw4.LLILZ, c1184740gw4.LLILZIL, c1184740gw4.LLILZLL, null, null, null, null, 7705);
            C786410Ut5.I7(new AkS28S0300000_18(c1184740gw4, this, c03ey, 17), c03ey);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03EY c03ey = new C03EY(viewGroup.getContext(), null, 6);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c03ey);
        c03ey.setLayoutParams(marginLayoutParams);
        return c03ey;
    }
}
