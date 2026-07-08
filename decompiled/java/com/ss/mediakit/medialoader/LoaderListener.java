package com.ss.mediakit.medialoader;

/* JADX INFO: loaded from: classes24.dex */
public interface LoaderListener {
    void onLoaderTaskCancel(LoaderEventInfo loaderEventInfo);

    void onLoaderTaskCompleted(LoaderEventInfo loaderEventInfo);

    void onLoaderTaskStart(LoaderEventInfo loaderEventInfo);
}
