package com.ss.android.ugc.aweme.commercialize.download.depend;

import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class DownloadMonitorLogSender implements IMonitorLogSendDepend {
    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend
    public void sendMonitorLog(String str, JSONObject jSONObject) {
        AppLogNewUtils.onEventV3(str, jSONObject);
    }
}
