package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api;

import X.C040F;
import X.C040I;
import X.C1750630ven;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteProductRequest;
import java.util.HashMap;

/* JADX INFO: loaded from: classes27.dex */
public interface FavoriteApi {
    public static final C1750630ven LIZ = C1750630ven.LIZ;

    @InterfaceC1501240pAY("/api/v1/favorite/api/cancel")
    Object LIZ(@C040I FavoriteProductRequest favoriteProductRequest, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/favorite/api/add")
    Object favoriteProduct(@C040I FavoriteProductRequest favoriteProductRequest, @C040F HashMap<String, String> map, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);
}
