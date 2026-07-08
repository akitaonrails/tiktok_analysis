package com.ss.mediakit.fetcher;

/* JADX INFO: loaded from: classes24.dex */
public interface AVMDLURLFetcherInterface {
    void close();

    String[] getURLs();

    int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener);
}
