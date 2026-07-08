package com.bytedance.android.livesdk.game.api;

import X.AbstractC19484711Kz;
import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import webcast.api.game.AbandonGuessByRoomRequest;
import webcast.api.game.AbandonGuessByRoomResponse;
import webcast.api.game.GetGuessByRoomIDResponse;
import webcast.api.game.GuessReportLimitReq;
import webcast.api.game.GuessReportLimitResp;
import webcast.api.game.GuessReqSendCapsuleReq;
import webcast.api.game.GuessReqSendCapsuleResp;
import webcast.api.game.InputAnswerRequest;
import webcast.api.game.InputAnswerResponse;
import webcast.api.game.RevenueGuessGetSettleDataRequest;
import webcast.api.game.RevenueGuessGetSettleDataResponse;
import webcast.api.game_revenue.RefreshTaskRequest;
import webcast.api.game_revenue.RefreshTaskResponse;

/* JADX INFO: loaded from: classes.dex */
public interface GameRevenueRetrofitApi {
    @InterfaceC1501170pAR("/webcast/game_revenue/guess/abandon_guess_by_room/")
    AbstractC19484711Kz<AbandonGuessByRoomResponse> abandonGuessesByRoomID(@InterfaceC1485405rg AbandonGuessByRoomRequest abandonGuessByRoomRequest);

    @InterfaceC1501170pAR("/webcast/game_revenue/guess/get_settle_data/")
    AbstractC19484711Kz<RevenueGuessGetSettleDataResponse> getSettleData(@InterfaceC1485405rg RevenueGuessGetSettleDataRequest revenueGuessGetSettleDataRequest);

    @InterfaceC1501170pAR("/webcast/game_revenue/guess/input_answer/")
    AbstractC19484711Kz<C470590Icr<InputAnswerResponse>> inputGuessAnswer(@InterfaceC1485405rg InputAnswerRequest inputAnswerRequest);

    @InterfaceC1501160pAQ("/webcast/game_revenue/guess/get_guess_by_room_id/")
    AbstractC19484711Kz<GetGuessByRoomIDResponse> queryRoomGuessWidgets(@InterfaceC1501070pAH("room_id_str") String str, @InterfaceC1501070pAH("is_admin") boolean z);

    @InterfaceC1501170pAR("/webcast/game_revenue/guess/report_limit/")
    C11NZ<C470590Icr<GuessReportLimitResp>> reportUserWantGuessLimited(@InterfaceC1485405rg GuessReportLimitReq guessReportLimitReq);

    @InterfaceC1501170pAR("/webcast/game_revenue/guess/refresh_task/")
    C11NZ<C470590Icr<RefreshTaskResponse.ResponseData>> requestRefreshGuessTask(@InterfaceC1485405rg RefreshTaskRequest refreshTaskRequest);

    @InterfaceC1501170pAR("/webcast/game_revenue/guess/req_send_capsule/")
    C11NZ<C470590Icr<GuessReqSendCapsuleResp>> requestUserWantGuessSendCapsule(@InterfaceC1485405rg GuessReqSendCapsuleReq guessReqSendCapsuleReq);
}
