package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkMicLoggerReportConf {
    public static final TypeAdapter ADAPTER = new LinkMicLoggerReportConf_OptTypeAdapter(NormalGson.singleton());

    @C09CT("sladar_report_enabled")
    public boolean sladarReportEnabled;

    @C09CT("sladar_report_level")
    public String sladarReportLevel;

    public LinkMicLoggerReportConf() {
        this(true, "info");
    }

    public LinkMicLoggerReportConf(boolean z, String str) {
        this.sladarReportEnabled = z;
        this.sladarReportLevel = str;
    }
}
