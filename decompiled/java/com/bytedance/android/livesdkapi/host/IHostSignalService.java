package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.C00EE;
import X.C0CW2;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkEPIData;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusData;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkRoomCacheUpdateData;
import com.bytedance.android.livesdk.signaling.model.downlink.StarshipDownlinkData;
import com.bytedance.android.livesdk.signaling.model.uplink.UplinkEPIData;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public interface IHostSignalService extends C006A {
    void enterRoom(String str);

    void fillUploadFeatures(Map<String, String> map, String str);

    void leaveLive();

    /* bridge */ /* synthetic */ void onInit();

    void registerEPISignal(String str, C0CW2<DownlinkEPIData> c0cw2);

    void registerLiveStatusSignal(String str, C0CW2<DownlinkLiveStatusData> c0cw2);

    void registerRoomUpdateSignal(C0CW2<DownlinkRoomCacheUpdateData> c0cw2);

    void registerStarshipSignal(String str, C0CW2<StarshipDownlinkData> c0cw2);

    void uplinkEPIData(String str, UplinkEPIData uplinkEPIData);

    void uplinkLiveStatusData(String str, Set<String> set);

    void uplinkRoomCacheUpdateData(C00EE c00ee);
}
