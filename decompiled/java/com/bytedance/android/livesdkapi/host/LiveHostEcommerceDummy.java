package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import webcast.data.BottomContainerComponent;
import webcast.data.SecondaryBannerComponent;
import webcast.data.TopRightBannerContainerComponent;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveHostEcommerceDummy implements IHostEcommerce {
    public static final LiveHostEcommerceDummy LL = new LiveHostEcommerceDummy();

    @Override // com.bytedance.android.livesdkapi.host.IHostEcommerce
    public final void I7(TopRightBannerContainerComponent topRightBannerContainerComponent, boolean z) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostEcommerce
    public final View Yk(Context context, SecondaryBannerComponent secondaryBannerComponent, LifecycleOwner lifecycleOwner) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostEcommerce
    public final void in(BottomContainerComponent bottomContainerComponent, boolean z) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostEcommerce
    public final boolean lf() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostEcommerce
    public final View oa(Context context, TopRightBannerContainerComponent topRightBannerContainerComponent) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostEcommerce
    public final boolean vo(SecondaryBannerComponent secondaryBannerComponent) {
        return false;
    }
}
