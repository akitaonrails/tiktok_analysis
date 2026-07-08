package com.ss.android.ugc.aweme.ecommerce;

import X.AbstractC1387105bp;
import X.C1387205bq;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC842703Qz;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class EcGoLiveRoomButtonClickEvent implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public static final int $stable = 0;

    @Override // X.InterfaceC1631620sYq
    public Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Fragment fragment;
        IEcommerceLiveService iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null);
        if (iEcommerceLiveService != null) {
            if (videoItemParams != null) {
                fragment = videoItemParams.fragment;
            } else {
                fragment = null;
            }
            iEcommerceLiveService.LJJIJL(fragment, map);
        }
        return new C1387205bq(null);
    }
}
