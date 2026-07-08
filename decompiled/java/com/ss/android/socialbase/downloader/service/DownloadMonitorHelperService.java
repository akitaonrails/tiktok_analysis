package com.ss.android.socialbase.downloader.service;

import X.C2199691B7f;
import X.InterfaceC2199431B6f;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* JADX INFO: loaded from: classes35.dex */
public class DownloadMonitorHelperService implements IDownloadMonitorHelperService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService
    public void monitorSend(DownloadTask downloadTask, BaseException baseException, int i) {
        C2199691B7f.LJI(downloadTask, baseException, i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService
    public void monitorSendWithTaskMonitor(InterfaceC2199431B6f interfaceC2199431B6f, DownloadInfo downloadInfo, BaseException baseException, int i) {
        C2199691B7f.LJIIIIZZ(interfaceC2199431B6f, downloadInfo, baseException, i);
    }
}
