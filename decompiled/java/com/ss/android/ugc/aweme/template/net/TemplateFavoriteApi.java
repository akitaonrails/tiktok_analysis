package com.ss.android.ugc.aweme.template.net;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes10.dex */
public interface TemplateFavoriteApi {
    @InterfaceC1501170pAR("/asset/relation/template/collect/add")
    Object templateAddToFavorite(@InterfaceC1485405rg TemplateFavoriteRequestBody templateFavoriteRequestBody, InterfaceC1364105Vn<? super TemplateFavoriteResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/asset/api/editing/relation/template/collect/add")
    Object templateAddToFavoriteV2(@InterfaceC1485405rg TemplateFavoriteRequestBody templateFavoriteRequestBody, InterfaceC1364105Vn<? super TemplateFavoriteResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/asset/relation/template/collect/remove")
    Object templateRemoveFromFavorite(@InterfaceC1485405rg TemplateFavoriteRequestBody templateFavoriteRequestBody, InterfaceC1364105Vn<? super TemplateFavoriteResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/asset/api/editing/relation/template/collect/remove")
    Object templateRemoveFromFavoriteV2(@InterfaceC1485405rg TemplateFavoriteRequestBody templateFavoriteRequestBody, InterfaceC1364105Vn<? super TemplateFavoriteResponse> interfaceC1364105Vn);
}
