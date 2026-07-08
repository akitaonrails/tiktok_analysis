package com.bytedance.android.livesdk.impl.revenue;

import X.C255200yk;
import X.InterfaceC1078630eAv;
import com.bytedance.android.livesdk.api.revenue.IRevenueService;
import com.bytedance.android.livesdk.impl.revenue.nameframe.LiveNameFrameWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* JADX INFO: loaded from: classes.dex */
public class RevenueService implements IRevenueService {
    @Override // com.bytedance.android.livesdk.api.revenue.IRevenueService
    public final LiveWidget getLiveNameFrameWidget() {
        return new LiveNameFrameWidget();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.IRevenueService
    public final InterfaceC1078630eAv initHighTrafficPresenter() {
        return new C255200yk();
    }

    @Override // com.bytedance.android.livesdk.api.revenue.IRevenueService
    public final /* bridge */ /* synthetic */ void onInit() {
    }
}
