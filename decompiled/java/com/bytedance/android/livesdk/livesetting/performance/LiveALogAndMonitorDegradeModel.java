package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveALogAndMonitorDegradeModel {
    public static final TypeAdapter ADAPTER = new LiveALogAndMonitorDegradeModel_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_alog_degrade_allowlist")
    public List<String> aLogList;

    @C09CT("live_monitor_degrade_allowlist")
    public List<String> monitorList;

    public LiveALogAndMonitorDegradeModel() {
        this(new ArrayList(), new ArrayList());
    }

    public LiveALogAndMonitorDegradeModel(List<String> list, List<String> list2) {
        this.aLogList = list;
        this.monitorList = list2;
    }
}
