package com.bytedance.android.livesdk.gift.viewerwishes.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.viewer_picks.model.DeleteOrderParams;
import com.bytedance.android.livesdk.viewer_picks.model.DeleteOrderResponse;
import com.bytedance.android.livesdk.viewer_picks.model.FinishParams;
import com.bytedance.android.livesdk.viewer_picks.model.FinishResponse;
import com.bytedance.android.livesdk.viewer_picks.model.GetSettingsResponse;
import com.bytedance.android.livesdk.viewer_picks.model.ListOrdersParams;
import com.bytedance.android.livesdk.viewer_picks.model.ListOrdersResponse;
import com.bytedance.android.livesdk.viewer_picks.model.MUpsertGiftPickParams;
import com.bytedance.android.livesdk.viewer_picks.model.MUpsertGiftPickResponse;
import com.bytedance.android.livesdk.viewer_picks.model.PanelGiftIDsResponse;
import com.bytedance.android.livesdk.viewer_picks.model.RestartParams;
import com.bytedance.android.livesdk.viewer_picks.model.RestartResponse;
import com.bytedance.android.livesdk.viewer_picks.model.StartParams;
import com.bytedance.android.livesdk.viewer_picks.model.StartResponse;
import com.bytedance.android.livesdk.viewer_picks.model.UpdateSettingsParams;

/* JADX INFO: loaded from: classes34.dex */
public interface ViewerWishesApi {
    @InterfaceC1501170pAR("/webcast/viewer_picks/orders/delete")
    C11NZ<C470590Icr<DeleteOrderResponse.Data>> deleteViewerWishesListOrder(@InterfaceC1485405rg DeleteOrderParams deleteOrderParams);

    @InterfaceC1501170pAR("/webcast/viewer_picks/finish/")
    C11NZ<C470590Icr<FinishResponse.Data>> finishViewerWishes(@InterfaceC1485405rg FinishParams finishParams);

    @InterfaceC1501170pAR("/webcast/viewer_picks/orders/list")
    C11NZ<C470590Icr<ListOrdersResponse.Data>> getViewerWishesListOrders(@InterfaceC1485405rg ListOrdersParams listOrdersParams);

    @InterfaceC1501160pAQ("/webcast/viewer_picks/panel_gift_ids/")
    C11NZ<C470590Icr<PanelGiftIDsResponse.Data>> getViewerWishesPanelGiftIds();

    @InterfaceC1501160pAQ("/webcast/viewer_picks/settings/")
    C11NZ<C470590Icr<GetSettingsResponse.Data>> getViewerWishesSettings(@InterfaceC1501070pAH("enter_from") String str);

    @InterfaceC1501170pAR("/webcast/viewer_picks/restart/")
    C11NZ<C470590Icr<RestartResponse.Data>> restartViewerWishes(@InterfaceC1485405rg RestartParams restartParams);

    @InterfaceC1501170pAR("/webcast/viewer_picks/start/")
    C11NZ<C470590Icr<StartResponse.Data>> startViewerWishes(@InterfaceC1485405rg StartParams startParams);

    @InterfaceC1501170pAR("/webcast/viewer_picks/mupsert_gift_pick/")
    C11NZ<C470590Icr<MUpsertGiftPickResponse.Data>> updateViewerWishesGiftPick(@InterfaceC1485405rg MUpsertGiftPickParams mUpsertGiftPickParams);

    @InterfaceC1501170pAR("/webcast/viewer_picks/update_settings/")
    C11NZ<C470590Icr<GetSettingsResponse.Data>> updateViewerWishesPicksSettings(@InterfaceC1485405rg UpdateSettingsParams updateSettingsParams);
}
