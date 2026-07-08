package com.ss.android.ugc.aweme.feed.landscape.networkapi;

import X.C1243020iS4;
import X.C1620520sGw;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501330pAh;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* JADX INFO: loaded from: classes20.dex */
public interface LandscapeInnerApi {
    public static final C1243020iS4 LIZ = C1243020iS4.LIZ;

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501170pAR("/tiktok/feed/horizontal/v2")
    Object getLandscapeInnerList(@InterfaceC1485405rg n nVar, InterfaceC1364105Vn<? super ComposePbAndJson<C1620520sGw, FeedItemList>> interfaceC1364105Vn);
}
