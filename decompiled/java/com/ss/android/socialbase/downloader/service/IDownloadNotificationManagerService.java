package com.ss.android.socialbase.downloader.service;

import X.C1B7P;
import android.app.Notification;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes35.dex */
public interface IDownloadNotificationManagerService {

    public static class DefaultDownloadNotificationManagerService implements IDownloadNotificationManagerService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void addNotification(C1B7P c1b7p) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void cancel(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void cancelNotification(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void clearNotification() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public SparseArray<C1B7P> getAllNotificationItems() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public C1B7P getNotificationItem(int i) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void hideNotification(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public void notifyByService(int i, int i2, Notification notification) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNotificationManagerService
        public C1B7P removeNotification(int i) {
            return null;
        }
    }

    void addNotification(C1B7P c1b7p);

    void cancel(int i);

    void cancelNotification(int i);

    void clearNotification();

    SparseArray<C1B7P> getAllNotificationItems();

    C1B7P getNotificationItem(int i);

    void hideNotification(int i);

    void notifyByService(int i, int i2, Notification notification);

    C1B7P removeNotification(int i);
}
