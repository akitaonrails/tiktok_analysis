package com.ss.android.ugc.aweme.ecommerce.anchor.showcase.api;

import X.C0X52;
import X.C1321005Ey;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.CreatorAddCheckRequest;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.CreatorAddCheckResponse;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.GetItemShopShowcaseInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models.GetShopShowcaseInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;

/* JADX INFO: loaded from: classes3.dex */
public interface ShowcaseAnchorApi {
    public static final C1321005Ey LIZ = C1321005Ey.LIZ;

    @InterfaceC1501170pAR("/api/v1/shopshowcase_info/get")
    Object fetchAnchorSubtitleInfo(@InterfaceC1485405rg GetShopShowcaseInfoRequest getShopShowcaseInfoRequest, InterfaceC1364105Vn<? super C0X52<Response<GetItemShopShowcaseInfoResponse>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/aweme/v1/oec/content/creator/add/check")
    Object fetchAutoAddAnchor(@InterfaceC1485405rg CreatorAddCheckRequest creatorAddCheckRequest, InterfaceC1364105Vn<? super C0X52<CreatorAddCheckResponse>> interfaceC1364105Vn);
}
