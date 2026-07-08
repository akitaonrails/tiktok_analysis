package com.ss.android.socialbase.downloader.service;

import X.InterfaceC2199991B8j;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: loaded from: classes35.dex */
public interface IDownloadRetrySchedulerService {

    public static class DefaultDownloadRetrySchedulerService implements IDownloadRetrySchedulerService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
        public void doSchedulerRetry(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
        public void scheduleRetryWhenHasTaskConnected() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
        public void scheduleRetryWhenHasTaskSucceed() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
        public void setRetryScheduleHandler(InterfaceC2199991B8j interfaceC2199991B8j) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
        public void tryCancelScheduleRetry(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadRetrySchedulerService
        public void tryStartScheduleRetry(DownloadInfo downloadInfo) {
        }
    }

    void doSchedulerRetry(int i);

    void scheduleRetryWhenHasTaskConnected();

    void scheduleRetryWhenHasTaskSucceed();

    void setRetryScheduleHandler(InterfaceC2199991B8j interfaceC2199991B8j);

    void tryCancelScheduleRetry(int i);

    void tryStartScheduleRetry(DownloadInfo downloadInfo);
}
