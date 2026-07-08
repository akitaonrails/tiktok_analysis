package com.ss.android.ugc.aweme.download.component_api.service;

import X.C0VX7;
import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.download.depend.DownloadConfigDepend;
import com.ss.android.ugc.aweme.commercialize.download.depend.DownloadMonitorLogSender;

/* JADX INFO: loaded from: classes35.dex */
public interface IDownloadService extends IBaseDownloadService {
    void LIZ(Context context, DownloadMonitorLogSender downloadMonitorLogSender, DownloadConfigDepend downloadConfigDepend);

    void LIZIZ(C0VX7 c0vx7);

    boolean isDownloading(int i);
}
