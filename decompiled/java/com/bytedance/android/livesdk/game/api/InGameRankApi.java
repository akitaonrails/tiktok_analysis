package com.bytedance.android.livesdk.game.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import webcast.api.game.InGameRankSettingResponse;
import webcast.api.game.UpdateInGameRankSettingResponse;

/* JADX INFO: loaded from: classes.dex */
public interface InGameRankApi {
    @InterfaceC1501160pAQ("/webcast/game/setting/in_game_rank/")
    C11NZ<C470590Icr<InGameRankSettingResponse.ResponseData>> fetchInGameRankSetting();

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/game/setting/update_in_game_rank/")
    C11NZ<C470590Icr<UpdateInGameRankSettingResponse.ResponseData>> updateInGameRankSetting(@InterfaceC1501050pAF("in_game_rank_setting_status") long j);
}
