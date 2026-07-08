package com.bytedance.ies.cutsame.downloaderv2;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface IWuZhuiDownloader {
    boolean cancelFetch(String str);

    void clearEpCache();

    String fetch(NLEModel nLEModel, int i, boolean z, boolean z2, int i2, IWuZhuiDownloaderListener iWuZhuiDownloaderListener);

    String fetch(List<String> list, int i, IWuZhuiDownloaderListener iWuZhuiDownloaderListener);

    void fetch(String str, IWuZhuiDownloaderListener iWuZhuiDownloaderListener);

    String fetchEffectList(List<String> list, int i, IWuZhuiDownloaderListener iWuZhuiDownloaderListener);

    String fetchResourceList(List<String> list, int i, IWuZhuiDownloaderListener iWuZhuiDownloaderListener);

    boolean hasCache(String str);

    boolean hasDavinciResourceCache(String str);

    boolean isNeedFetch(String str);

    void removeCachedFailedUrs(List<String> list);
}
