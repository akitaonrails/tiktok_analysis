package com.ss.android.socialbase.downloader.service;

import X.InterfaceC2200101B8u;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public interface IDownloadPreconnecterService {

    public static class DefaultDownloadPreconnecterService implements IDownloadPreconnecterService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService
        public void asyncFetchHttpHeadInfo(String str, InterfaceC2200101B8u interfaceC2200101B8u) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService
        public void preconnect(int i, String str, String str2, List<HttpHeader> list, boolean z, boolean z2) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService
        public void preconnect(String str, String str2, boolean z) {
        }
    }

    void asyncFetchHttpHeadInfo(String str, InterfaceC2200101B8u interfaceC2200101B8u);

    void preconnect(int i, String str, String str2, List<HttpHeader> list, boolean z, boolean z2);

    void preconnect(String str, String str2, boolean z);
}
