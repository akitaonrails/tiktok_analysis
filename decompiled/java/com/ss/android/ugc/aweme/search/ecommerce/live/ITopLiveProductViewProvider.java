package com.ss.android.ugc.aweme.search.ecommerce.live;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface ITopLiveProductViewProvider {
    void addBagIconIfNeed(LinearLayout linearLayout, Boolean bool, boolean z);

    String getAnchorInfo();

    String getCouponType(Aweme aweme);

    String getCouponTypeKey();

    Map<String, Object> getEcomParams(String str, Boolean bool, Map<String, Object> map);

    ITopLiveProductView getTopLiveProductView(ViewGroup viewGroup);

    EnterRoomConfig prepareEcLiveExtraArgs(EnterRoomConfig enterRoomConfig, String str, String str2);

    boolean shouldShow();
}
