package com.bytedance.android.livesdk.game.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import webcast.api.game.ReportHighlightRequest;
import webcast.api.game.ReportHighlightResponse;
import webcast.api.game.ReportMLBBHeroRequest;
import webcast.api.game.ReportMLBBHeroResponse;
import webcast.api.game_revenue.ReportModelDataRequest;
import webcast.api.game_revenue.ReportModelDataResponse;

/* JADX INFO: loaded from: classes32.dex */
public interface GameLiveHighlightApi {
    @InterfaceC1501170pAR("/webcast/game/moment/report_highlight/")
    C11NZ<C470590Icr<ReportHighlightResponse>> reportHighlightWithClientAI(@InterfaceC1485405rg ReportHighlightRequest reportHighlightRequest);

    @InterfaceC1501170pAR("/webcast/game_revenue/edge_model/report_model_data/")
    C11NZ<C470590Icr<ReportModelDataResponse>> reportHighlightWithClientAITransfer(@InterfaceC1485405rg ReportModelDataRequest reportModelDataRequest);

    @InterfaceC1501170pAR("/webcast/game/studio/report_mlbb_hero/")
    C11NZ<C470590Icr<ReportMLBBHeroResponse>> reportMLBBHeroInfoClientAI(@InterfaceC1485405rg ReportMLBBHeroRequest reportMLBBHeroRequest);
}
