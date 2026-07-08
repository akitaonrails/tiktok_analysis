package com.bytedance.android.livesdk.api.revenue.strategy;

import X.C006A;
import X.C1133940fc8;
import X.C1134320fck;
import X.C1134510fd3;
import X.C1134550fd7;
import X.C1143980fsK;
import X.InterfaceC1294060jmO;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.impl.revenue.strategy.firstrecharge.LiveFastFirstRechargeHolder;
import com.bytedance.android.livesdk.impl.revenue.strategy.widgets.RevenueStrategyWidget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;

/* JADX INFO: loaded from: classes18.dex */
public interface IRevenueStrategyService extends C006A {
    LiveFastFirstRechargeHolder ED();

    void GN();

    TaskManagerV2 KE0();

    @InterfaceC1294060jmO
    C1133940fc8 M92();

    C1134550fd7 Nm2();

    void Rs2();

    C1143980fsK Wy0();

    void Xj2();

    C1134320fck getMonitor();

    RevenueStrategyWidget lL2(RecyclableWidgetManager recyclableWidgetManager);

    Class<? extends LiveRecyclableWidget> or1();

    void py();

    void qV1();

    Class<? extends LiveRecyclableWidget> tB1();

    C1134510fd3 u21();
}
