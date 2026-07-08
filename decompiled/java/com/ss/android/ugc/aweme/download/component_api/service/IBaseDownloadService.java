package com.ss.android.ugc.aweme.download.component_api.service;

import X.AbstractC2199801B7q;
import X.AbstractC2200031B8n;
import X.AbstractC2200041B8o;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: loaded from: classes22.dex */
public interface IBaseDownloadService {
    void cancel(int i);

    int getDownloadId(String str, String str2);

    DownloadInfo getDownloadInfo(int i);

    DownloadInfo getDownloadInfo(String str, String str2);

    AbstractC2199801B7q getDownloadTask(int i);

    AbstractC2200031B8n getPageLifeMonitor(int i);

    AbstractC2200041B8o getViewLifeMonitor(int i);

    void restart(int i);

    AbstractC2199801B7q with(String str);
}
