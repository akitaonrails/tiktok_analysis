package com.ss.android.ugc.aweme.commercialize.ecommerce.service;

import X.C1030490cvH;
import X.C1051660dTQ;
import android.content.Context;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface IShoppingAdsService {
    Map<String, Class<?>> LIZ();

    boolean LIZIZ();

    BaseBridgeMethod LIZJ(C1051660dTQ c1051660dTQ, String str);

    void LIZLLL(Aweme aweme);

    ShoppingAdsServiceImpl.WishListFragmentData LJ(String str);

    boolean LJFF(Context context);

    C1030490cvH LJI();

    void reportProfilePlpClickEvent(Map<String, ? extends Object> map, AwemeRawAd awemeRawAd);
}
