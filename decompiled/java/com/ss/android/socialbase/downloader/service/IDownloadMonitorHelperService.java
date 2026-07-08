package com.ss.android.socialbase.downloader.service;

import X.InterfaceC2199431B6f;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;

/* JADX INFO: loaded from: classes35.dex */
public interface IDownloadMonitorHelperService {

    public static class DefaultDownloadMonitorHelperService implements IDownloadMonitorHelperService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService
        public void monitorSend(DownloadTask downloadTask, BaseException baseException, int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService
        public void monitorSendWithTaskMonitor(InterfaceC2199431B6f interfaceC2199431B6f, DownloadInfo downloadInfo, BaseException baseException, int i) {
        }
    }

    void monitorSend(DownloadTask downloadTask, BaseException baseException, int i);

    void monitorSendWithTaskMonitor(InterfaceC2199431B6f interfaceC2199431B6f, DownloadInfo downloadInfo, BaseException baseException, int i);
}
