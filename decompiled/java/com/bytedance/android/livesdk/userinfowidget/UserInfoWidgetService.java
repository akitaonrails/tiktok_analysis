package com.bytedance.android.livesdk.userinfowidget;

import X.C1161920gLG;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.userinfowidget.IUserInfoWidgetService;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* JADX INFO: loaded from: classes18.dex */
public class UserInfoWidgetService implements IUserInfoWidgetService {
    @Override // com.bytedance.android.live.userinfowidget.IUserInfoWidgetService
    public final LiveToggleWatermarkWidget Yl0() {
        return new LiveToggleWatermarkWidget();
    }

    @Override // com.bytedance.android.live.userinfowidget.IUserInfoWidgetService
    public final TryModeUserInfoWidget sK() {
        return new TryModeUserInfoWidget();
    }

    @Override // com.bytedance.android.live.userinfowidget.IUserInfoWidgetService
    public final Class<? extends LiveRecyclableWidget> S92() {
        return LiveRoomUserInfoWidget.class;
    }

    @Override // com.bytedance.android.live.userinfowidget.IUserInfoWidgetService
    public final Class<? extends LiveRecyclableWidget> Sp2() {
        return ClearScreenUserInfoWidget.class;
    }

    @Override // com.bytedance.android.live.userinfowidget.IUserInfoWidgetService
    public final boolean YI0(Room room) {
        OfficialChannelInfo officialChannelInfo;
        IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        if (iMicRoomService != null && iMicRoomService.On1() && room != null && (officialChannelInfo = room.officialChannelInfo) != null && officialChannelInfo.channelUser != null) {
            return true;
        }
        return false;
    }
}
