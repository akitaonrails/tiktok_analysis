package com.bytedance.android.livesdkapi.host;

import X.C006A;
import com.bytedance.android.livesdk.offline.LiveSettingRegion;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface IHostOffline extends C006A {
    List<LiveSettingRegion> getInternalAreaRegionModel();

    void handleSurveyPreview(String str, String str2);

    /* bridge */ /* synthetic */ void onInit();
}
