package com.bytedance.android.livesdk.impl.revenue.strategy;

import X.C0IL3;
import X.C1133940fc8;
import X.C1134320fck;
import X.C1134510fd3;
import X.C1134550fd7;
import X.C1134560fd8;
import X.C1134860fdc;
import X.C1143980fsK;
import X.InterfaceC1294060jmO;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.impl.revenue.strategy.bubble.TouchPointBubbleWidget;
import com.bytedance.android.livesdk.impl.revenue.strategy.firstrecharge.LiveFastFirstRechargeHolder;
import com.bytedance.android.livesdk.impl.revenue.strategy.guide.GuideTriggerWidget;
import com.bytedance.android.livesdk.impl.revenue.strategy.widgets.RevenueStrategyWidget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
public class RevenueStrategy implements IRevenueStrategyService {
    public final C1134320fck LL = C1134320fck.LIZ;

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final LiveFastFirstRechargeHolder ED() {
        return LiveFastFirstRechargeHolder.LL;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final void GN() {
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final TaskManagerV2 KE0() {
        return TaskManagerV2.LIZ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    @InterfaceC1294060jmO
    public final C1133940fc8 M92() {
        return C1133940fc8.LIZIZ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final C1134550fd7 Nm2() {
        return C1134550fd7.LIZ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final void Rs2() {
        C1134560fd8 c1134560fd8 = C1134560fd8.LIZ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final C1143980fsK Wy0() {
        return C1143980fsK.LIZ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final void Xj2() {
        C0IL3 c0il3 = C0IL3.LIZ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final /* bridge */ /* synthetic */ C1134320fck getMonitor() {
        return this.LL;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final Class<? extends LiveRecyclableWidget> or1() {
        return GuideTriggerWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final void py() {
        C1134860fdc c1134860fdc = C1134860fdc.LIZ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final void qV1() {
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final Class<? extends LiveRecyclableWidget> tB1() {
        return TouchPointBubbleWidget.class;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final C1134510fd3 u21() {
        return C1134510fd3.LIZIZ;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService
    public final RevenueStrategyWidget lL2(RecyclableWidgetManager recyclableWidgetManager) {
        if (recyclableWidgetManager == null) {
            return null;
        }
        return (RevenueStrategyWidget) recyclableWidgetManager.getRecyclableWidgetFromCacheOrNew(RevenueStrategyWidget.class, null, AFwS205S0000000_17.get$arr$(167));
    }
}
