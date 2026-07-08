package com.bytedance.android.livesdkapi.host.dummy;

import X.C13BV;
import com.bytedance.android.livesdk.offline.LiveSettingRegion;
import com.bytedance.android.livesdkapi.host.IHostOffline;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostOfflineDummy implements IHostOffline {
    @Override // com.bytedance.android.livesdkapi.host.IHostOffline
    public final void handleSurveyPreview(String str, String str2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostOffline
    public final List<LiveSettingRegion> getInternalAreaRegionModel() {
        return C13BV.INSTANCE;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostOffline
    public final /* bridge */ /* synthetic */ void onInit() {
    }
}
