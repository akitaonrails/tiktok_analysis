package com.ss.android.socialbase.downloader.service;

import X.C1B97;
import X.InterfaceC2200011B8l;

/* JADX INFO: loaded from: classes35.dex */
public interface IDownloadNetTrafficManagerService {
    void addBandwidth(long j, long j2);

    C1B97 getCurrentNetworkQuality();

    double getDownloadKBitsPerSecond();

    C1B97 register(InterfaceC2200011B8l interfaceC2200011B8l);

    void remove(InterfaceC2200011B8l interfaceC2200011B8l);

    void reset();

    public static class DefaultDownloadNetTrafficManagerService implements IDownloadNetTrafficManagerService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public void addBandwidth(long j, long j2) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public double getDownloadKBitsPerSecond() {
            return 0.0d;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public void remove(InterfaceC2200011B8l interfaceC2200011B8l) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public void reset() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public C1B97 getCurrentNetworkQuality() {
            return C1B97.UNKNOWN;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public C1B97 register(InterfaceC2200011B8l interfaceC2200011B8l) {
            return C1B97.UNKNOWN;
        }
    }
}
