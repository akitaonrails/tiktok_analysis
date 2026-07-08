package com.bytedance.android.livesdk.sticker.game;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.gift.model.MinuteGameFinishParams;
import com.bytedance.android.livesdk.gift.model.MinuteGameFinishResponse;
import com.bytedance.android.livesdk.gift.model.MinuteGameGetRoomActiveGameplayResponse;
import com.bytedance.android.livesdk.gift.model.MinuteGameRespondInviteParams;
import com.bytedance.android.livesdk.gift.model.MinuteGameRespondInviteResponse;
import com.bytedance.android.livesdk.gift.model.MinuteGameSettleParams;
import com.bytedance.android.livesdk.gift.model.MinuteGameSettleResponse;

/* JADX INFO: loaded from: classes.dex */
public interface IMinuteGameApi {
    @InterfaceC1501170pAR("/webcast/gift/minute_game/finish/")
    C11NZ<MinuteGameFinishResponse> finish(@InterfaceC1485405rg MinuteGameFinishParams minuteGameFinishParams);

    @InterfaceC1501160pAQ("/webcast/gift/minute_game/room_active_gameplay/")
    C11NZ<MinuteGameGetRoomActiveGameplayResponse> getRoomActiveGameplay(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501170pAR("/webcast/gift/minute_game/respond_invite/")
    C11NZ<MinuteGameRespondInviteResponse> respondInvite(@InterfaceC1485405rg MinuteGameRespondInviteParams minuteGameRespondInviteParams);

    @InterfaceC1501170pAR("/webcast/gift/minute_game/settle/")
    C11NZ<MinuteGameSettleResponse> settle(@InterfaceC1485405rg MinuteGameSettleParams minuteGameSettleParams);
}
