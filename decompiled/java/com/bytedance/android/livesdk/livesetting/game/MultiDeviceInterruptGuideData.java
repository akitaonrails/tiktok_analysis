package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class MultiDeviceInterruptGuideData {
    public static final TypeAdapter ADAPTER = new MultiDeviceInterruptGuideData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public Integer enable;

    @C09CT("guide_url")
    public String guideUrl;

    @C09CT("process_exit_guide")
    public List<ProcessExitGuideData> processExitGuideList;

    public MultiDeviceInterruptGuideData() {
        this(0, null, null);
    }

    public MultiDeviceInterruptGuideData(Integer num, String str, List<ProcessExitGuideData> list) {
        this.enable = num;
        this.guideUrl = str;
        this.processExitGuideList = list;
    }
}
