package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import X.C123100dR;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_trim_stream_data_exp")
public final class LiveTrimStreamDataExp {
    public static final boolean DEFAULT = false;
    public static final LiveTrimStreamDataExp INSTANCE = new LiveTrimStreamDataExp();

    public final boolean disable() {
        return !SettingsManager.INSTANCE.getBooleanValue("live_trim_stream_data_exp", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public static final boolean isEnableTrim(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig.RoomsData roomsData;
        String str;
        if (INSTANCE.disable() || enterRoomConfig == null || ((roomsData = enterRoomConfig.mRoomsData) != null && (roomsData.curIsMicRoom || roomsData.isSubOnlyLive == 1))) {
            return false;
        }
        EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
        if (streamData != null && streamData.disablePrePullStream) {
            return false;
        }
        String str2 = null;
        if (streamData != null) {
            str = streamData.pullStreamData;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            return true;
        }
        EnterRoomConfig.StreamData streamData2 = enterRoomConfig.mSubStreamData;
        if (streamData2 != null) {
            str2 = streamData2.pullStreamData;
        }
        if (!C123100dR.LIZ(str2)) {
            return false;
        }
        return true;
    }

    public static final void assignTrimStreamData(EnterRoomConfig enterRoomConfig, Room room, Room room2) {
        EnterRoomConfig.StreamData streamData;
        StreamUrl streamUrl;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        LiveCoreSDKData liveCoreSDKData2;
        LiveCoreSDKData.PullData pullData2;
        String streamData2;
        StreamUrl streamUrl2;
        LiveCoreSDKData liveCoreSDKData3;
        LiveCoreSDKData.PullData pullData3;
        String streamData3;
        StreamUrl streamUrl3;
        StreamUrl streamUrl4;
        LiveCoreSDKData liveCoreSDKData4;
        LiveCoreSDKData.PullData pullData4;
        LiveCoreSDKData liveCoreSDKData5;
        LiveCoreSDKData.PullData pullData5;
        String streamData4;
        if (INSTANCE.disable()) {
            return;
        }
        if (room != null && (streamUrl2 = room.getStreamUrl()) != null && (liveCoreSDKData3 = streamUrl2.liveCoreSDKData) != null && (pullData3 = liveCoreSDKData3.getPullData()) != null && (streamData3 = pullData3.getStreamData()) != null && room2 != null && (((streamUrl3 = room2.getStreamUrl()) == null || (liveCoreSDKData5 = streamUrl3.liveCoreSDKData) == null || (pullData5 = liveCoreSDKData5.getPullData()) == null || (((streamData4 = pullData5.getStreamData()) == null || streamData4.length() == 0) && room2 != null)) && (streamUrl4 = room2.getStreamUrl()) != null && (liveCoreSDKData4 = streamUrl4.liveCoreSDKData) != null && (pullData4 = liveCoreSDKData4.getPullData()) != null)) {
            pullData4.setStreamData(streamData3);
        }
        if (enterRoomConfig != null && (streamData = enterRoomConfig.mStreamData) != null && room2 != null) {
            StreamUrl streamUrl5 = room2.getStreamUrl();
            if ((streamUrl5 == null || (liveCoreSDKData2 = streamUrl5.liveCoreSDKData) == null || (pullData2 = liveCoreSDKData2.getPullData()) == null || (((streamData2 = pullData2.getStreamData()) == null || streamData2.length() == 0) && room2 != null)) && (streamUrl = room2.getStreamUrl()) != null && (liveCoreSDKData = streamUrl.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null) {
                pullData.setStreamData(streamData.pullStreamData);
            }
        }
    }
}
