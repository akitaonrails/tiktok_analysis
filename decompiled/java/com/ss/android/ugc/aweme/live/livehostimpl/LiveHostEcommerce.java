package com.ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.host.IHostEcommerce;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService;
import webcast.data.BottomContainerComponent;
import webcast.data.SecondaryBannerComponent;
import webcast.data.TopRightBannerContainerComponent;

/* JADX INFO: loaded from: classes33.dex */
public final class LiveHostEcommerce implements IHostEcommerce {
    public static final LiveHostEcommerce LL = new LiveHostEcommerce();

    @Override // com.bytedance.android.livesdkapi.host.IHostEcommerce
    public final boolean lf() {
        IEcommerceLiveService iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null);
        if (iEcommerceLiveService != null) {
            return iEcommerceLiveService.lf();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostEcommerce
    public final boolean vo(SecondaryBannerComponent secondaryBannerComponent) {
        IEcommerceInfluencerService iEcommerceInfluencerService = (IEcommerceInfluencerService) PluggableExtentionKt.pluggableSpi$default(IEcommerceInfluencerService.class, false, false, false, 14, null);
        if (iEcommerceInfluencerService != null) {
            return iEcommerceInfluencerService.vo(secondaryBannerComponent);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostEcommerce
    public final void I7(TopRightBannerContainerComponent topRightBannerContainerComponent, boolean z) {
        IEcommerceInfluencerService iEcommerceInfluencerService = (IEcommerceInfluencerService) PluggableExtentionKt.pluggableSpi$default(IEcommerceInfluencerService.class, false, false, false, 14, null);
        if (iEcommerceInfluencerService != null) {
            iEcommerceInfluencerService.I7(topRightBannerContainerComponent, z);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostEcommerce
    public final void in(BottomContainerComponent bottomContainerComponent, boolean z) {
        IEcommerceInfluencerService iEcommerceInfluencerService = (IEcommerceInfluencerService) PluggableExtentionKt.pluggableSpi$default(IEcommerceInfluencerService.class, false, false, false, 14, null);
        if (iEcommerceInfluencerService != null) {
            iEcommerceInfluencerService.in(bottomContainerComponent, z);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostEcommerce
    public final View oa(Context context, TopRightBannerContainerComponent topRightBannerContainerComponent) {
        IEcommerceInfluencerService iEcommerceInfluencerService = (IEcommerceInfluencerService) PluggableExtentionKt.pluggableSpi$default(IEcommerceInfluencerService.class, false, false, false, 14, null);
        if (iEcommerceInfluencerService != null) {
            return iEcommerceInfluencerService.oa(context, topRightBannerContainerComponent);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostEcommerce
    public final View Yk(Context context, SecondaryBannerComponent secondaryBannerComponent, LifecycleOwner lifecycleOwner) {
        IEcommerceInfluencerService iEcommerceInfluencerService = (IEcommerceInfluencerService) PluggableExtentionKt.pluggableSpi$default(IEcommerceInfluencerService.class, false, false, false, 14, null);
        if (iEcommerceInfluencerService != null) {
            return iEcommerceInfluencerService.Yk(context, secondaryBannerComponent, lifecycleOwner);
        }
        return null;
    }
}
