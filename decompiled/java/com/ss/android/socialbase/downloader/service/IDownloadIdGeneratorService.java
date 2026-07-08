package com.ss.android.socialbase.downloader.service;

import X.InterfaceC20149713sl;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: loaded from: classes35.dex */
public interface IDownloadIdGeneratorService extends InterfaceC20149713sl {

    public static class DefaultDownloadIdGeneratorService implements IDownloadIdGeneratorService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
        public int generate(DownloadInfo downloadInfo) {
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService, X.InterfaceC20149713sl
        public int generate(String str, String str2) {
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
        public boolean isDefaultIdGenerator() {
            return true;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService
        public void setDownloadIdGenerator(InterfaceC20149713sl interfaceC20149713sl) {
        }
    }

    int generate(DownloadInfo downloadInfo);

    @Override // X.InterfaceC20149713sl
    /* synthetic */ int generate(String str, String str2);

    boolean isDefaultIdGenerator();

    void setDownloadIdGenerator(InterfaceC20149713sl interfaceC20149713sl);
}
