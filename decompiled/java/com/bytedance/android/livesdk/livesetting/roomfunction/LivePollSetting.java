package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C13BV;
import X.C1697810uHb;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_room_poll_type")
public final class LivePollSetting {
    public static final LivePollSetting INSTANCE = new LivePollSetting();
    public static final List<String> DEFAULT = C13BV.INSTANCE;

    public final List<String> getOptionList() {
        List<String> list = (List) SettingsManager.INSTANCE.getValueSafely("live_room_poll_type", DEFAULT);
        return (list == null || list.size() <= 1) ? C1697810uHb.LJIIJJI("😁", "😭") : list;
    }

    public final String getFirstOption() {
        return (String) ListProtector.get(getOptionList(), 0);
    }

    public final String getOptionListString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[\"");
        sbLIZ.append(getFirstOption());
        sbLIZ.append("\", \"");
        sbLIZ.append(getSecondOption());
        sbLIZ.append("\"]");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getSecondOption() {
        return (String) ListProtector.get(getOptionList(), 1);
    }

    public final boolean enable(DataChannel dataChannel) {
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || roomAuthStatus.enablePoll != 1) {
            return false;
        }
        return true;
    }
}
