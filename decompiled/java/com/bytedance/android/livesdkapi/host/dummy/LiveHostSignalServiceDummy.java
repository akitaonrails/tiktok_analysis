package com.bytedance.android.livesdkapi.host.dummy;

import X.C00EE;
import X.C0CW2;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkEPIData;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusData;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkRoomCacheUpdateData;
import com.bytedance.android.livesdk.signaling.model.downlink.StarshipDownlinkData;
import com.bytedance.android.livesdk.signaling.model.uplink.UplinkEPIData;
import com.bytedance.android.livesdkapi.host.IHostSignalService;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostSignalServiceDummy implements IHostSignalService {
    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void enterRoom(String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void fillUploadFeatures(Map<String, String> map, String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void leaveLive() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void registerEPISignal(String str, C0CW2<DownlinkEPIData> c0cw2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void registerLiveStatusSignal(String str, C0CW2<DownlinkLiveStatusData> c0cw2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void registerRoomUpdateSignal(C0CW2<DownlinkRoomCacheUpdateData> c0cw2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void registerStarshipSignal(String str, C0CW2<StarshipDownlinkData> c0cw2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void uplinkEPIData(String str, UplinkEPIData uplinkEPIData) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void uplinkLiveStatusData(String str, Set<String> set) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void uplinkRoomCacheUpdateData(C00EE c00ee) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final /* bridge */ /* synthetic */ void onInit() {
    }
}
